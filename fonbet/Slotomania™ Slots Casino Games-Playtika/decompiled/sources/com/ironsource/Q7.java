package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KFunction;

/* loaded from: classes3.dex */
public final class Q7 implements InterfaceC2371cg {
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
    private static final R9 o;
    private static final R9 p;
    private static final R9 q;
    public static final Q7 a = new Q7();
    private static final Handler b = new Handler(Looper.getMainLooper());
    private static final Lazy m = LazyKt.lazy(a.a);
    private static final Lazy n = LazyKt.lazy(b.a);

    static final class a extends Lambda implements Function0<C2530le> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2530le invoke() {
            return new C2530le(0, null, null, 7, null);
        }
    }

    static final class b extends Lambda implements Function0<Map<String, ? extends KFunction<? extends Boolean>>> {
        public static final b a = new b();

        /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Boolean> {
            a(Object obj) {
                super(0, obj, InterfaceC2774z7.class, "shouldRunOnBackgroundThreadDeviceStatus", "shouldRunOnBackgroundThreadDeviceStatus()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC2774z7) this.receiver).o());
            }
        }

        /* renamed from: com.ironsource.Q7$b$b, reason: collision with other inner class name */
        /* synthetic */ class C0184b extends FunctionReferenceImpl implements Function0<Boolean> {
            C0184b(Object obj) {
                super(0, obj, InterfaceC2774z7.class, "shouldRunOnBackgroundThreadIabToken", "shouldRunOnBackgroundThreadIabToken()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC2774z7) this.receiver).r());
            }
        }

        /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Boolean> {
            c(Object obj) {
                super(0, obj, InterfaceC2774z7.class, "shouldRunOnBackgroundThreadSharedSignals", "shouldRunOnBackgroundThreadSharedSignals()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC2774z7) this.receiver).q());
            }
        }

        /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Boolean> {
            d(Object obj) {
                super(0, obj, InterfaceC2774z7.class, "shouldRunOnBackgroundThreadDeleteFolder", "shouldRunOnBackgroundThreadDeleteFolder()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC2774z7) this.receiver).k());
            }
        }

        /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Boolean> {
            e(Object obj) {
                super(0, obj, InterfaceC2774z7.class, "shouldRunOnBackgroundThreadDeleteFile", "shouldRunOnBackgroundThreadDeleteFile()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC2774z7) this.receiver).p());
            }
        }

        /* synthetic */ class f extends FunctionReferenceImpl implements Function0<Boolean> {
            f(Object obj) {
                super(0, obj, InterfaceC2774z7.class, "shouldRunOnBackgroundThreadCachedFiles", "shouldRunOnBackgroundThreadCachedFiles()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC2774z7) this.receiver).b());
            }
        }

        /* synthetic */ class g extends FunctionReferenceImpl implements Function0<Boolean> {
            g(Object obj) {
                super(0, obj, InterfaceC2774z7.class, "shouldRunOnBackgroundThreadPermissions", "shouldRunOnBackgroundThreadPermissions()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC2774z7) this.receiver).F());
            }
        }

        /* synthetic */ class h extends FunctionReferenceImpl implements Function0<Boolean> {
            h(Object obj) {
                super(0, obj, InterfaceC2774z7.class, "shouldRunOnBackgroundThreadDeviceData", "shouldRunOnBackgroundThreadDeviceData()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC2774z7) this.receiver).E());
            }
        }

        /* synthetic */ class i extends FunctionReferenceImpl implements Function0<Boolean> {
            i(Object obj) {
                super(0, obj, InterfaceC2774z7.class, "shouldRunOnBackgroundThreadAdView", "shouldRunOnBackgroundThreadAdView()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC2774z7) this.receiver).H());
            }
        }

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, KFunction<Boolean>> invoke() {
            InterfaceC2774z7 h2 = Jb.u.d().h();
            return MapsKt.mapOf(TuplesKt.to(Q7.d, new a(h2)), TuplesKt.to(Q7.e, new C0184b(h2)), TuplesKt.to(Q7.f, new c(h2)), TuplesKt.to("deleteFolder", new d(h2)), TuplesKt.to("deleteFile", new e(h2)), TuplesKt.to(Q7.i, new f(h2)), TuplesKt.to(Q7.j, new g(h2)), TuplesKt.to(Q7.k, new h(h2)), TuplesKt.to(Q7.l, new i(h2)));
        }
    }

    static {
        R9 r9 = new R9("isadplayer-background");
        r9.start();
        r9.a();
        o = r9;
        R9 r92 = new R9("isadplayer-publisher-callbacks");
        r92.start();
        r92.a();
        p = r92;
        R9 r93 = new R9("isadplayer-release");
        r93.start();
        r93.a();
        q = r93;
    }

    private Q7() {
    }

    private final boolean f(Runnable runnable) {
        return c && b().getQueue().contains(runnable);
    }

    public final void a(boolean z) {
        c = z;
    }

    public final void b(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, (Object) null);
    }

    public final void c(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void d(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final boolean e() {
        return c;
    }

    private final C2530le b() {
        return (C2530le) m.getValue();
    }

    private final Map<String, Function0<Boolean>> c() {
        return (Map) n.getValue();
    }

    @Override // com.ironsource.InterfaceC2371cg
    public void a(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void d(Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        b.postDelayed(action, j2);
    }

    public final void e(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            q.b(action);
        }
    }

    public static /* synthetic */ void a(Q7 q7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        q7.b(runnable, j2);
    }

    public static /* synthetic */ void c(Q7 q7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        q7.d(runnable, j2);
    }

    public final void b(Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        o.a(action, j2);
    }

    public final ThreadPoolExecutor d() {
        return b();
    }

    public static /* synthetic */ void b(Q7 q7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        q7.c(runnable, j2);
    }

    @Override // com.ironsource.InterfaceC2371cg
    public void a(Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (c) {
            b().schedule(action, j2, TimeUnit.MILLISECONDS);
        } else {
            q.a(action, j2);
        }
    }

    public final void c(Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        p.a(action, j2);
    }

    public final Looper a() {
        return o.getLooper();
    }

    public final void a(Runnable action, String name) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(name, "name");
        Function0<Boolean> function0 = c().get(name);
        if (function0 != null ? function0.invoke().booleanValue() : false) {
            a(this, action, 0L, 2, (Object) null);
        } else {
            action.run();
        }
    }
}
