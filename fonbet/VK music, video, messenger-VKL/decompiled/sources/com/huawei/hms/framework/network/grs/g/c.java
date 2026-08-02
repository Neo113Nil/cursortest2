package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.h.d;
import com.mbridge.msdk.foundation.download.Command;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import ru.ok.proto.PublisherConfiguration;
import xsna.ho8;

/* loaded from: classes13.dex */
public class c {
    private static final String l = "c";
    private final GrsBaseInfo a;
    private final Context b;
    private final com.huawei.hms.framework.network.grs.e.a c;
    private d d;
    private final com.huawei.hms.framework.network.grs.g.j.c i;
    private final Map<String, Future<d>> e = new ConcurrentHashMap(16);
    private final List<d> f = new CopyOnWriteArrayList();
    private final JSONArray g = new JSONArray();
    private final List<String> h = new CopyOnWriteArrayList();
    private String j = "";
    private long k = 1;

    public c(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.e.a aVar) {
        this.i = cVar;
        this.a = cVar.b();
        this.b = cVar.a();
        this.c = aVar;
        b();
        c();
    }

    private d b(d dVar) {
        String str;
        String str2;
        for (Map.Entry<String, Future<d>> entry : this.e.entrySet()) {
            if (dVar != null && (dVar.o() || dVar.m())) {
                break;
            }
            try {
                dVar = entry.getValue().get(PublisherConfiguration.DEFAULT_RESUME_TIMEOUT, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e = e;
                str = l;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(l, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e2) {
                e = e2;
                str = l;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(l, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return dVar;
    }

    private void c() {
        String grsParasKey = this.a.getGrsParasKey(true, true, this.b);
        this.j = this.c.a().a(grsParasKey + Command.HTTP_HEADER_ETAG, "");
    }

    private String d() {
        com.huawei.hms.framework.network.grs.f.b a = com.huawei.hms.framework.network.grs.f.b.a(this.b.getPackageName());
        com.huawei.hms.framework.network.grs.local.model.a a2 = a != null ? a.a() : null;
        if (a2 == null) {
            return "";
        }
        String a3 = a2.a();
        Logger.v(l, "get appName from local assets is{%s}", a3);
        return a3;
    }

    public d a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        if (this.h.isEmpty()) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d a = a(executorService, this.h, str, cVar);
        Logger.i(l, "use 2.0 interface return http's code is：{%d}", Integer.valueOf(a == null ? 0 : a.b()));
        e.a(new ArrayList(this.f), SystemClock.elapsedRealtime() - elapsedRealtime, this.g, this.b);
        this.f.clear();
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094 A[LOOP:0: B:2:0x0004->B:13:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private d a(ExecutorService executorService, List<String> list, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        String str2;
        com.huawei.hms.framework.network.grs.e.c cVar2;
        boolean z;
        ExecutionException executionException;
        d dVar;
        d dVar2 = null;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            String str3 = list.get(i);
            if (TextUtils.isEmpty(str3)) {
                str2 = str;
                cVar2 = cVar;
            } else {
                str2 = str;
                cVar2 = cVar;
                Future<d> submit = executorService.submit(new a(str3, i, this, this.b, str2, this.a, cVar2).g());
                this.e.put(str3, submit);
                z = true;
                try {
                    dVar = submit.get(this.k, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e = e;
                } catch (CancellationException unused) {
                } catch (ExecutionException e2) {
                    executionException = e2;
                } catch (TimeoutException unused2) {
                }
                if (dVar != null) {
                    try {
                        if (!dVar.o()) {
                            if (dVar.m()) {
                            }
                        }
                        Logger.i(l, "grs request return body is not null and is OK.");
                        dVar2 = dVar;
                    } catch (InterruptedException e3) {
                        e = e3;
                        dVar2 = dVar;
                        Logger.w(l, "the current thread was interrupted while waiting", e);
                        if (!z) {
                        }
                    } catch (CancellationException unused3) {
                        dVar2 = dVar;
                        Logger.i(l, "{requestServer} the computation was cancelled");
                        if (!z) {
                        }
                    } catch (ExecutionException e4) {
                        executionException = e4;
                        dVar2 = dVar;
                        Logger.w(l, "the computation threw an ExecutionException", executionException);
                        z = false;
                        if (!z) {
                        }
                    } catch (TimeoutException unused4) {
                        dVar2 = dVar;
                        Logger.w(l, "the wait timed out");
                        z = false;
                        if (!z) {
                        }
                    }
                    if (!z) {
                        Logger.v(l, "needBreak is true so need break current circulation");
                        break;
                    }
                    i++;
                    str = str2;
                    cVar = cVar2;
                }
                dVar2 = dVar;
            }
            z = false;
            if (!z) {
            }
        }
        return b(dVar2);
    }

    private void b() {
        com.huawei.hms.framework.network.grs.g.j.d a = com.huawei.hms.framework.network.grs.g.i.a.a(this.b);
        if (a == null) {
            Logger.w(l, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        a(a);
        List<String> a2 = a.a();
        if (a2 == null || a2.size() <= 0) {
            Logger.v(l, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (a2.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        String b = a.b();
        if (a2.size() > 0) {
            for (String str : a2) {
                if (str.startsWith("https://")) {
                    a(b, str);
                } else {
                    Logger.w(l, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.v(l, "request to GRS server url is {%s}", this.h);
    }

    public String a() {
        return this.j;
    }

    public synchronized void a(d dVar) {
        try {
            this.f.add(dVar);
            d dVar2 = this.d;
            if (dVar2 == null || (!dVar2.o() && !this.d.m())) {
                if (dVar.n()) {
                    Logger.i(l, "GRS server open 503 limiting strategy.");
                    com.huawei.hms.framework.network.grs.h.d.a(this.a.getGrsParasKey(true, true, this.b), new d.a(dVar.k(), SystemClock.elapsedRealtime()));
                    return;
                }
                if (dVar.m()) {
                    Logger.i(l, "GRS server open 304 Not Modified.");
                }
                if (!dVar.o() && !dVar.m()) {
                    Logger.v(l, "grsResponseResult has exception so need return");
                    return;
                }
                this.d = dVar;
                this.c.a(this.a, dVar, this.b, this.i);
                for (Map.Entry<String, Future<d>> entry : this.e.entrySet()) {
                    if (!entry.getKey().equals(dVar.l()) && !entry.getValue().isCancelled()) {
                        Logger.i(l, "future cancel");
                        entry.getValue().cancel(true);
                    }
                }
                return;
            }
            Logger.v(l, "grsResponseResult is ok");
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.d dVar) {
    }

    private void a(String str, String str2) {
        StringBuilder b = ho8.b(str2, str);
        String grsReqParamJoint = this.a.getGrsReqParamJoint(false, false, d(), this.b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            b.append("?");
            b.append(grsReqParamJoint);
        }
        this.h.add(b.toString());
    }
}
