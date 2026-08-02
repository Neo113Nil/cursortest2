package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.fcy;
import xsna.gzs;
import xsna.pn00;

/* loaded from: classes13.dex */
public final class R7 implements InterfaceC4357hg {
    private static boolean c = false;
    public static final String d = "deviceStatus";
    public static final String e = "iabTokenAPI";
    public static final String f = "dsSharedSignalsAPI";
    public static final String g = "deleteFolder";
    public static final String h = "deleteFile";
    public static final String i = "getCachedFilesMap";
    public static final String j = "permissionsAPI";
    public static final String k = "deviceDataAPI";
    public static final String l = "adViewAPI";
    private static final S9 o;
    private static final S9 p;
    private static final S9 q;
    public static final R7 a = new R7();
    private static final Handler b = new Handler(Looper.getMainLooper());
    private static final Lazy m = new bpn0(a.a);
    private static final Lazy n = new bpn0(b.a);

    public static final class a extends Lambda implements gzs<C4426le> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4426le invoke() {
            return new C4426le(0, null, 3, null);
        }
    }

    public static final class b extends Lambda implements gzs<Map<String, ? extends fcy<? extends Boolean>>> {
        public static final b a = new b();

        public /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
            public a(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeviceStatus", "shouldRunOnBackgroundThreadDeviceStatus()Z", 0);
            }

            @Override // xsna.gzs
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).o());
            }
        }

        /* renamed from: com.ironsource.R7$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0209b extends FunctionReferenceImpl implements gzs<Boolean> {
            public C0209b(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadIabToken", "shouldRunOnBackgroundThreadIabToken()Z", 0);
            }

            @Override // xsna.gzs
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).r());
            }
        }

        public /* synthetic */ class c extends FunctionReferenceImpl implements gzs<Boolean> {
            public c(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadSharedSignals", "shouldRunOnBackgroundThreadSharedSignals()Z", 0);
            }

            @Override // xsna.gzs
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).q());
            }
        }

        public /* synthetic */ class d extends FunctionReferenceImpl implements gzs<Boolean> {
            public d(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeleteFolder", "shouldRunOnBackgroundThreadDeleteFolder()Z", 0);
            }

            @Override // xsna.gzs
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).k());
            }
        }

        public /* synthetic */ class e extends FunctionReferenceImpl implements gzs<Boolean> {
            public e(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeleteFile", "shouldRunOnBackgroundThreadDeleteFile()Z", 0);
            }

            @Override // xsna.gzs
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).p());
            }
        }

        public /* synthetic */ class f extends FunctionReferenceImpl implements gzs<Boolean> {
            public f(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadCachedFiles", "shouldRunOnBackgroundThreadCachedFiles()Z", 0);
            }

            @Override // xsna.gzs
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).b());
            }
        }

        public /* synthetic */ class g extends FunctionReferenceImpl implements gzs<Boolean> {
            public g(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadPermissions", "shouldRunOnBackgroundThreadPermissions()Z", 0);
            }

            @Override // xsna.gzs
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).H());
            }
        }

        public /* synthetic */ class h extends FunctionReferenceImpl implements gzs<Boolean> {
            public h(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeviceData", "shouldRunOnBackgroundThreadDeviceData()Z", 0);
            }

            @Override // xsna.gzs
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).G());
            }
        }

        public /* synthetic */ class i extends FunctionReferenceImpl implements gzs<Boolean> {
            public i(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadAdView", "shouldRunOnBackgroundThreadAdView()Z", 0);
            }

            @Override // xsna.gzs
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((A7) this.receiver).J());
            }
        }

        public b() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, fcy<Boolean>> invoke() {
            A7 h2 = Kb.u.d().h();
            return pn00.k(new Pair(R7.d, new a(h2)), new Pair(R7.e, new C0209b(h2)), new Pair(R7.f, new c(h2)), new Pair("deleteFolder", new d(h2)), new Pair("deleteFile", new e(h2)), new Pair(R7.i, new f(h2)), new Pair(R7.j, new g(h2)), new Pair(R7.k, new h(h2)), new Pair(R7.l, new i(h2)));
        }
    }

    static {
        S9 s9 = new S9("isadplayer-background");
        s9.start();
        s9.a();
        o = s9;
        S9 s92 = new S9("isadplayer-publisher-callbacks");
        s92.start();
        s92.a();
        p = s92;
        S9 s93 = new S9("isadplayer-release");
        s93.start();
        s93.a();
        q = s93;
    }

    private R7() {
    }

    private final boolean f(Runnable runnable) {
        return c && b().getQueue().contains(runnable);
    }

    public final void a(boolean z) {
        c = z;
    }

    public final void b(Runnable runnable) {
        a(this, runnable, 0L, 2, (Object) null);
    }

    public final void c(Runnable runnable) {
        b(this, runnable, 0L, 2, null);
    }

    public final void d(Runnable runnable) {
        c(this, runnable, 0L, 2, null);
    }

    public final boolean e() {
        return c;
    }

    private final C4426le b() {
        return (C4426le) m.getValue();
    }

    private final Map<String, gzs<Boolean>> c() {
        return (Map) n.getValue();
    }

    @Override // com.ironsource.InterfaceC4357hg
    public void a(Runnable runnable) {
        c(this, runnable, 0L, 2, null);
    }

    public final void d(Runnable runnable, long j2) {
        b.postDelayed(runnable, j2);
    }

    public final void e(Runnable runnable) {
        if (f(runnable)) {
            b().remove(runnable);
        } else {
            q.b(runnable);
        }
    }

    public static /* synthetic */ void a(R7 r7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        r7.b(runnable, j2);
    }

    public static /* synthetic */ void c(R7 r7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        r7.d(runnable, j2);
    }

    public final void b(Runnable runnable, long j2) {
        o.a(runnable, j2);
    }

    public final ThreadPoolExecutor d() {
        return b();
    }

    public static /* synthetic */ void b(R7 r7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        r7.c(runnable, j2);
    }

    @Override // com.ironsource.InterfaceC4357hg
    public void a(Runnable runnable, long j2) {
        if (c) {
            b().schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } else {
            q.a(runnable, j2);
        }
    }

    public final void c(Runnable runnable, long j2) {
        p.a(runnable, j2);
    }

    public final Looper a() {
        return o.getLooper();
    }

    public final void a(Runnable runnable, String str) {
        gzs<Boolean> gzsVar = c().get(str);
        if (gzsVar != null ? gzsVar.invoke().booleanValue() : false) {
            a(this, runnable, 0L, 2, (Object) null);
        } else {
            runnable.run();
        }
    }
}
