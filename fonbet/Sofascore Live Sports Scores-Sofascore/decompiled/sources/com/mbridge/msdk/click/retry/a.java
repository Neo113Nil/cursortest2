package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import defpackage.bf3;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    public static String e = "mtg_retry_report=1";
    public static int f = 10000;
    public static int g = 3;
    public static int h = 50;
    public static int i = 600000;
    private static int j = 0;
    private static int k = 0;
    public static int l = 0;
    public static int m = 1;
    public static int n = 2;
    public static int o = 3;
    public static int p = 4;
    public static int q = 5;
    private ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> a;
    private com.mbridge.msdk.click.retry.c b;
    private BroadcastReceiver c;
    private final Handler d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.click.retry.a$a, reason: collision with other inner class name */
    public class C1230a extends BroadcastReceiver {
        public C1230a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.d.sendEmptyMessage(2);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b {
        private static a a = new a(null);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.mbridge.msdk.click.retry.b.k);
                }
            }
        }
    }

    private a() {
        this.a = new ConcurrentHashMap<>();
        this.b = new com.mbridge.msdk.click.retry.c(h);
        this.d = new c(Looper.getMainLooper());
        g d = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        g = d.j0();
        f = d.l0() * 1000;
        i = d.m0() * 1000;
        j = d.i0();
        k = d.k0();
        a();
    }

    private boolean b(int i2) {
        return i2 == m || i2 == n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.mbridge.msdk.click.retry.c cVar = this.b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.mbridge.msdk.click.retry.b.l);
            }
        }
    }

    public void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z, boolean z2, int i2) {
        if (!c(i2) || TextUtils.isEmpty(str)) {
            return;
        }
        String replace = str.replace("?" + e, "").replace(U3.j.c + e, "");
        ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> concurrentHashMap = this.a;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this.a = concurrentHashMap;
        }
        com.mbridge.msdk.click.retry.b remove = concurrentHashMap.remove(replace);
        if (remove == null) {
            remove = new com.mbridge.msdk.click.retry.b(str, str2);
            remove.b(i2);
            remove.a(z);
            remove.b(z2);
            remove.a(campaignEx);
            remove.b(str3);
        } else if (remove.d() != com.mbridge.msdk.click.retry.b.l) {
            remove.a(str2);
        }
        if ((!a(i2) || j == 0) && ((!b(i2) || k == 0) && i2 != q)) {
            a(remove);
            return;
        }
        if (System.currentTimeMillis() >= remove.c() + i) {
            if (remove.d() == com.mbridge.msdk.click.retry.b.k) {
                a(remove);
                return;
            }
            return;
        }
        a(replace, remove);
        if (remove.d() == com.mbridge.msdk.click.retry.b.k) {
            if (remove.e() <= g) {
                a(replace);
            } else {
                a(remove);
            }
        }
    }

    public static a b() {
        return b.a;
    }

    private boolean c(int i2) {
        return a(i2) || b(i2) || i2 == q;
    }

    public /* synthetic */ a(C1230a c1230a) {
        this();
    }

    private void a(com.mbridge.msdk.click.retry.b bVar) {
        String str;
        String str2;
        try {
            CampaignEx a = bVar.a();
            if (a != null) {
                String requestId = a.getRequestId();
                str2 = a.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                str2 = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.n().d(), bVar.b().toString(), bVar.g(), str, str2, bVar.h());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i2) {
        f.a().a(context, str, str2, str3, str4, i2);
    }

    private void a(String str, com.mbridge.msdk.click.retry.b bVar) {
        com.mbridge.msdk.click.retry.c cVar = this.b;
        if (cVar == null) {
            cVar = new com.mbridge.msdk.click.retry.c(h);
            this.b = cVar;
        }
        cVar.a(str, bVar);
    }

    private void a(String str) {
        Message obtainMessage = this.d.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        this.d.sendMessageDelayed(obtainMessage, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2) {
        String sb;
        com.mbridge.msdk.click.retry.c cVar = this.b;
        if (cVar != null) {
            com.mbridge.msdk.click.retry.b a = cVar.a(str);
            this.b.b(str);
            if (a == null) {
                com.mbridge.msdk.click.retry.b bVar = this.a.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.c() + i || bVar.e() >= g || i2 == com.mbridge.msdk.click.retry.b.l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= a.c() + i) {
                a.a(i2);
                this.a.put(str, a);
                if (c1.c(str) == 0) {
                    StringBuilder p2 = bf3.p(str, "?");
                    p2.append(e);
                    sb = p2.toString();
                } else {
                    StringBuilder p3 = bf3.p(str, U3.j.c);
                    p3.append(e);
                    sb = p3.toString();
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), a.a(), a.f(), sb, a.i(), a.j(), a.h());
                return;
            }
            if (i2 != com.mbridge.msdk.click.retry.b.l) {
                a(a);
            }
        }
    }

    private void a() {
        try {
            if (this.c == null) {
                this.c = new C1230a();
                Context d = com.mbridge.msdk.foundation.controller.c.n().d();
                if (d != null) {
                    d.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean a(int i2) {
        return i2 == p || i2 == o;
    }
}
