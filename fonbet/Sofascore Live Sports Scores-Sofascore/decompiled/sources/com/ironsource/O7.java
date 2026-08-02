package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import defpackage.joa;
import defpackage.ot8;
import defpackage.tub;
import defpackage.xka;
import defpackage.ypa;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class O7 implements InterfaceC4080fg {
    private static boolean c = false;

    @NotNull
    public static final String d = "deviceStatus";

    @NotNull
    public static final String e = "iabTokenAPI";

    @NotNull
    public static final String f = "dsSharedSignalsAPI";

    @NotNull
    public static final String g = "deleteFolder";

    @NotNull
    public static final String h = "deleteFile";

    @NotNull
    public static final String i = "getCachedFilesMap";

    @NotNull
    public static final String j = "permissionsAPI";

    @NotNull
    public static final String k = "deviceDataAPI";

    @NotNull
    public static final String l = "adViewAPI";

    @NotNull
    private static final R9 o;

    @NotNull
    private static final R9 p;

    @NotNull
    private static final R9 q;

    @NotNull
    public static final O7 a = new O7();

    @NotNull
    private static final Handler b = new Handler(Looper.getMainLooper());

    @NotNull
    private static final joa m = ypa.b(a.a);

    @NotNull
    private static final joa n = ypa.b(b.a);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function0<C4149je> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4149je invoke() {
            return new C4149je(0, null, 3, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends xka implements Function0<Map<String, ? extends KFunction<? extends Boolean>>> {
        public static final b a = new b();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public /* synthetic */ class a extends ot8 implements Function0<Boolean> {
            public a(Object obj) {
                super(0, 0, InterfaceC4375w7.class, obj, "shouldRunOnBackgroundThreadDeviceStatus", "shouldRunOnBackgroundThreadDeviceStatus()Z");
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC4375w7) this.receiver).p());
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.O7$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0191b extends ot8 implements Function0<Boolean> {
            public C0191b(Object obj) {
                super(0, 0, InterfaceC4375w7.class, obj, "shouldRunOnBackgroundThreadIabToken", "shouldRunOnBackgroundThreadIabToken()Z");
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC4375w7) this.receiver).s());
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public /* synthetic */ class c extends ot8 implements Function0<Boolean> {
            public c(Object obj) {
                super(0, 0, InterfaceC4375w7.class, obj, "shouldRunOnBackgroundThreadSharedSignals", "shouldRunOnBackgroundThreadSharedSignals()Z");
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC4375w7) this.receiver).r());
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public /* synthetic */ class d extends ot8 implements Function0<Boolean> {
            public d(Object obj) {
                super(0, 0, InterfaceC4375w7.class, obj, "shouldRunOnBackgroundThreadDeleteFolder", "shouldRunOnBackgroundThreadDeleteFolder()Z");
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC4375w7) this.receiver).l());
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public /* synthetic */ class e extends ot8 implements Function0<Boolean> {
            public e(Object obj) {
                super(0, 0, InterfaceC4375w7.class, obj, "shouldRunOnBackgroundThreadDeleteFile", "shouldRunOnBackgroundThreadDeleteFile()Z");
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC4375w7) this.receiver).q());
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public /* synthetic */ class f extends ot8 implements Function0<Boolean> {
            public f(Object obj) {
                super(0, 0, InterfaceC4375w7.class, obj, "shouldRunOnBackgroundThreadCachedFiles", "shouldRunOnBackgroundThreadCachedFiles()Z");
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC4375w7) this.receiver).b());
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public /* synthetic */ class g extends ot8 implements Function0<Boolean> {
            public g(Object obj) {
                super(0, 0, InterfaceC4375w7.class, obj, "shouldRunOnBackgroundThreadPermissions", "shouldRunOnBackgroundThreadPermissions()Z");
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC4375w7) this.receiver).G());
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public /* synthetic */ class h extends ot8 implements Function0<Boolean> {
            public h(Object obj) {
                super(0, 0, InterfaceC4375w7.class, obj, "shouldRunOnBackgroundThreadDeviceData", "shouldRunOnBackgroundThreadDeviceData()Z");
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC4375w7) this.receiver).F());
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public /* synthetic */ class i extends ot8 implements Function0<Boolean> {
            public i(Object obj) {
                super(0, 0, InterfaceC4375w7.class, obj, "shouldRunOnBackgroundThreadAdView", "shouldRunOnBackgroundThreadAdView()Z");
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC4375w7) this.receiver).I());
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, KFunction<Boolean>> invoke() {
            InterfaceC4375w7 h2 = Ib.v.d().h();
            return tub.h(new Pair(O7.d, new a(h2)), new Pair(O7.e, new C0191b(h2)), new Pair(O7.f, new c(h2)), new Pair("deleteFolder", new d(h2)), new Pair("deleteFile", new e(h2)), new Pair(O7.i, new f(h2)), new Pair(O7.j, new g(h2)), new Pair(O7.k, new h(h2)), new Pair(O7.l, new i(h2)));
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

    private O7() {
    }

    private final boolean f(Runnable runnable) {
        return c && b().getQueue().contains(runnable);
    }

    public final void a(@NotNull Runnable runnable, @NotNull String str) {
        runnable.getClass();
        str.getClass();
        Function0<Boolean> function0 = c().get(str);
        if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : false) {
            a(this, runnable, 0L, 2, (Object) null);
        } else {
            runnable.run();
        }
    }

    public final void b(@NotNull Runnable runnable) {
        runnable.getClass();
        a(this, runnable, 0L, 2, (Object) null);
    }

    public final void c(@NotNull Runnable runnable) {
        runnable.getClass();
        b(this, runnable, 0L, 2, null);
    }

    public final void d(@NotNull Runnable runnable) {
        runnable.getClass();
        c(this, runnable, 0L, 2, null);
    }

    public final void e(@NotNull Runnable runnable) {
        runnable.getClass();
        if (f(runnable)) {
            b().remove(runnable);
        } else {
            q.b(runnable);
        }
    }

    private final C4149je b() {
        return (C4149je) m.getValue();
    }

    private final Map<String, Function0<Boolean>> c() {
        return (Map) n.getValue();
    }

    public final void d(@NotNull Runnable runnable, long j2) {
        runnable.getClass();
        b.postDelayed(runnable, j2);
    }

    public static /* synthetic */ void c(O7 o7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        o7.d(runnable, j2);
    }

    public final void b(@NotNull Runnable runnable, long j2) {
        runnable.getClass();
        o.a(runnable, j2);
    }

    @NotNull
    public final ThreadPoolExecutor d() {
        return b();
    }

    public static /* synthetic */ void b(O7 o7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        o7.c(runnable, j2);
    }

    public final void c(@NotNull Runnable runnable, long j2) {
        runnable.getClass();
        p.a(runnable, j2);
    }

    public final boolean e() {
        return c;
    }

    @Override // com.ironsource.InterfaceC4080fg
    public void a(@NotNull Runnable runnable) {
        runnable.getClass();
        c(this, runnable, 0L, 2, null);
    }

    public static /* synthetic */ void a(O7 o7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        o7.b(runnable, j2);
    }

    @Override // com.ironsource.InterfaceC4080fg
    public void a(@NotNull Runnable runnable, long j2) {
        runnable.getClass();
        if (c) {
            b().schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } else {
            q.a(runnable, j2);
        }
    }

    @Nullable
    public final Looper a() {
        return o.getLooper();
    }

    public final void a(boolean z) {
        c = z;
    }
}
