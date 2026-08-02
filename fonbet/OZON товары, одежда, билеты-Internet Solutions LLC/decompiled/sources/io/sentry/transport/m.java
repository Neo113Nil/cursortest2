package io.sentry.transport;

import io.sentry.C7222x2;
import io.sentry.E;
import io.sentry.EnumC7161k;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.V1;
import io.sentry.W2;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.util.w;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes.dex */
public final class m implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f68540a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2 f68541b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap f68542c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList f68543d;

    /* renamed from: e, reason: collision with root package name */
    private Timer f68544e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f68545f;

    /* loaded from: classes10.dex */
    final class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            m.c(m.this);
        }
    }

    public interface b {
        void m(@NotNull m mVar);
    }

    public m(@NotNull W2 w22) {
        c a11 = c.a();
        this.f68542c = new ConcurrentHashMap();
        this.f68543d = new CopyOnWriteArrayList();
        this.f68544e = null;
        this.f68545f = new io.sentry.util.a();
        this.f68540a = a11;
        this.f68541b = w22;
    }

    static void c(m mVar) {
        Iterator it = mVar.f68543d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(mVar);
        }
    }

    private void j(@NotNull EnumC7161k enumC7161k, @NotNull Date date) {
        ConcurrentHashMap concurrentHashMap = this.f68542c;
        Date date2 = (Date) concurrentHashMap.get(enumC7161k);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(enumC7161k, date);
            Iterator it = this.f68543d.iterator();
            while (it.hasNext()) {
                ((b) it.next()).m(this);
            }
            InterfaceC7097a0 a11 = this.f68545f.a();
            try {
                if (this.f68544e == null) {
                    this.f68544e = new Timer(true);
                }
                this.f68544e.schedule(new a(), date);
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InterfaceC7097a0 a11 = this.f68545f.a();
        try {
            Timer timer = this.f68544e;
            if (timer != null) {
                timer.cancel();
                this.f68544e = null;
            }
            a11.close();
            this.f68543d.clear();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void d(@NotNull b bVar) {
        this.f68543d.add(bVar);
    }

    public final V1 k(@NotNull V1 v12, @NotNull E e11) {
        List singletonList;
        Iterator<C7222x2> it = v12.b().iterator();
        ArrayList arrayList = null;
        while (true) {
            boolean hasNext = it.hasNext();
            W2 w22 = this.f68541b;
            if (!hasNext) {
                if (arrayList == null) {
                    return v12;
                }
                w22.getLogger().c(I2.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
                ArrayList arrayList2 = new ArrayList();
                for (C7222x2 c7222x2 : v12.b()) {
                    if (!arrayList.contains(c7222x2)) {
                        arrayList2.add(c7222x2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    return new V1(v12.a(), arrayList2);
                }
                w22.getLogger().c(I2.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                Object d11 = e11.d("sentry:typeCheckHint");
                if (io.sentry.hints.o.class.isInstance(e11.d("sentry:typeCheckHint")) && d11 != null) {
                    ((io.sentry.hints.o) d11).d(false);
                }
                Object d12 = e11.d("sentry:typeCheckHint");
                if (io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint")) && d12 != null) {
                    ((io.sentry.hints.l) d12).e(false);
                }
                Object d13 = e11.d("sentry:typeCheckHint");
                if (io.sentry.hints.f.class.isInstance(e11.d("sentry:typeCheckHint")) && d13 != null) {
                    ((io.sentry.hints.f) d13).b();
                    w22.getLogger().c(I2.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                return null;
            }
            C7222x2 next = it.next();
            String itemType = next.p().e().getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    singletonList = Collections.singletonList(EnumC7161k.Attachment);
                    break;
                case "replay_video":
                    singletonList = Collections.singletonList(EnumC7161k.Replay);
                    break;
                case "profile_chunk":
                    singletonList = Arrays.asList(EnumC7161k.ProfileChunkUi, EnumC7161k.ProfileChunk);
                    break;
                case "profile":
                    singletonList = Collections.singletonList(EnumC7161k.Profile);
                    break;
                case "feedback":
                    singletonList = Collections.singletonList(EnumC7161k.Feedback);
                    break;
                case "log":
                    singletonList = Collections.singletonList(EnumC7161k.LogItem);
                    break;
                case "span":
                    singletonList = Collections.singletonList(EnumC7161k.Span);
                    break;
                case "event":
                    singletonList = Collections.singletonList(EnumC7161k.Error);
                    break;
                case "trace_metric":
                    singletonList = Collections.singletonList(EnumC7161k.TraceMetric);
                    break;
                case "check_in":
                    singletonList = Collections.singletonList(EnumC7161k.Monitor);
                    break;
                case "session":
                    singletonList = Collections.singletonList(EnumC7161k.Session);
                    break;
                case "transaction":
                    singletonList = Collections.singletonList(EnumC7161k.Transaction);
                    break;
                default:
                    singletonList = Collections.singletonList(EnumC7161k.Unknown);
                    break;
            }
            Iterator it2 = singletonList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (m((EnumC7161k) it2.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    w22.getClientReportRecorder().c(io.sentry.clientreport.f.RATELIMIT_BACKOFF, next);
                }
            }
        }
    }

    public final boolean m(@NotNull EnumC7161k enumC7161k) {
        Date date;
        this.f68540a.getClass();
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = this.f68542c;
        Date date3 = (Date) concurrentHashMap.get(EnumC7161k.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC7161k.Unknown.equals(enumC7161k) || (date = (Date) concurrentHashMap.get(enumC7161k)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public final boolean o() {
        this.f68540a.getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = this.f68542c;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = (Date) concurrentHashMap.get((EnumC7161k) it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    public final void p(@NotNull ReplayIntegration replayIntegration) {
        this.f68543d.remove(replayIntegration);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i11, String str, String str2) {
        long parseDouble;
        double d11;
        long parseDouble2;
        double d12;
        EnumC7161k enumC7161k;
        W2 w22 = this.f68541b;
        double d13 = 1000.0d;
        c cVar = this.f68540a;
        if (str == null) {
            if (i11 == 429) {
                if (str2 != null) {
                    try {
                        parseDouble = (long) (Double.parseDouble(str2) * 1000.0d);
                    } catch (NumberFormatException unused) {
                    }
                    cVar.getClass();
                    j(EnumC7161k.All, new Date(System.currentTimeMillis() + parseDouble));
                    return;
                }
                parseDouble = 60000;
                cVar.getClass();
                j(EnumC7161k.All, new Date(System.currentTimeMillis() + parseDouble));
                return;
            }
            return;
        }
        int i12 = -1;
        String[] split = str.split(",", -1);
        int length = split.length;
        int i13 = 0;
        while (i13 < length) {
            String[] split2 = split[i13].replace(" ", "").split(ProductContainerDTO.RATIO_DELIMITER, i12);
            if (split2.length > 0) {
                String str3 = split2[0];
                if (str3 != null) {
                    try {
                        parseDouble2 = (long) (Double.parseDouble(str3) * d13);
                    } catch (NumberFormatException unused2) {
                    }
                    if (split2.length > 1) {
                        String str4 = split2[1];
                        cVar.getClass();
                        Date date = new Date(System.currentTimeMillis() + parseDouble2);
                        if (str4 == null || str4.isEmpty()) {
                            d11 = d13;
                            j(EnumC7161k.All, date);
                            i13++;
                            d13 = d11;
                            i12 = -1;
                        } else {
                            String[] split3 = str4.split(";", i12);
                            int length2 = split3.length;
                            int i14 = 0;
                            while (i14 < length2) {
                                String str5 = split3[i14];
                                EnumC7161k enumC7161k2 = EnumC7161k.Unknown;
                                try {
                                    String b11 = w.b(str5);
                                    if (b11 != null) {
                                        enumC7161k2 = EnumC7161k.valueOf(b11);
                                        d12 = d13;
                                    } else {
                                        d12 = d13;
                                        try {
                                            w22.getLogger().c(I2.ERROR, "Couldn't capitalize: %s", str5);
                                        } catch (IllegalArgumentException e11) {
                                            e = e11;
                                            w22.getLogger().b(I2.INFO, e, "Unknown category: %s", str5);
                                            enumC7161k = enumC7161k2;
                                            if (EnumC7161k.Unknown.equals(enumC7161k)) {
                                            }
                                            i14++;
                                            d13 = d12;
                                        }
                                    }
                                } catch (IllegalArgumentException e12) {
                                    e = e12;
                                    d12 = d13;
                                }
                                enumC7161k = enumC7161k2;
                                if (EnumC7161k.Unknown.equals(enumC7161k)) {
                                    j(enumC7161k, date);
                                }
                                i14++;
                                d13 = d12;
                            }
                        }
                    }
                }
                parseDouble2 = 60000;
                if (split2.length > 1) {
                }
            }
            d11 = d13;
            i13++;
            d13 = d11;
            i12 = -1;
        }
    }
}
