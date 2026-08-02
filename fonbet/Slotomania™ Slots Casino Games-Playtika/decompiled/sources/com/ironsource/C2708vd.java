package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2708vd implements InterfaceC2726wd {
    private final LevelPlay.AdFormat a;
    private final InterfaceC2690ud b;
    private final InterfaceC2774z7 c;
    private a d;
    private List<InterfaceC2654sd> e;
    private final int f;

    /* renamed from: com.ironsource.vd$a */
    private enum a {
        None,
        Idle,
        Loading
    }

    /* renamed from: com.ironsource.vd$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* renamed from: com.ironsource.vd$c */
    static final class c extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ InterfaceC2654sd a;
        final /* synthetic */ C2708vd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC2654sd interfaceC2654sd, C2708vd c2708vd) {
            super(1);
            this.a = interfaceC2654sd;
            this.b = c2708vd;
        }

        public final void a(boolean z) {
            if (!z) {
                IronLog.INTERNAL.verbose("adunit \"" + this.a.b() + "\" failed to load, removing");
                this.b.e.remove(this.a);
            }
            this.b.d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public C2708vd(LevelPlay.AdFormat adFormat, InterfaceC2690ud adUnitsFactory, InterfaceC2774z7 epService) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitsFactory, "adUnitsFactory");
        Intrinsics.checkNotNullParameter(epService, "epService");
        this.a = adFormat;
        this.b = adUnitsFactory;
        this.c = epService;
        this.d = a.None;
        this.e = new ArrayList();
        this.f = b();
    }

    private final int c() {
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return this.c.I();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        InterfaceC2654sd e = e();
        if (e == null) {
            this.d = a.Idle;
        } else {
            this.d = a.Loading;
            e.a(new c(e, this));
        }
    }

    private final InterfaceC2654sd e() {
        Object obj;
        if (!a()) {
            IronLog.INTERNAL.verbose(this.a + " - reached capacity");
            return null;
        }
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC2654sd) obj).a()) {
                break;
            }
        }
        InterfaceC2654sd interfaceC2654sd = (InterfaceC2654sd) obj;
        if (interfaceC2654sd != null) {
            return interfaceC2654sd;
        }
        IronLog.INTERNAL.verbose(this.a + " - preload done");
        return null;
    }

    private final int b() {
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return this.c.i();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.x();
    }

    @Override // com.ironsource.InterfaceC2726wd
    public void a(Ua config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (!this.c.w()) {
            IronLog.INTERNAL.warning(this.a + " - preload is disabled");
            return;
        }
        if (this.d != a.None) {
            IronLog.INTERNAL.warning(this.a + " - initializing service again");
            return;
        }
        int c2 = c();
        if (c2 < 1) {
            IronLog.INTERNAL.warning(this.a + " - invalid maxParallelLoad: " + c2);
        } else {
            IronLog.INTERNAL.verbose(String.valueOf(this.a));
            this.d = a.Idle;
            this.e = CollectionsKt.toMutableList((Collection) this.b.a(config.c(this.a), c2, config));
            d();
        }
    }

    private final InterfaceC2654sd b(String str) {
        Object obj;
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((InterfaceC2654sd) obj).b(), str)) {
                break;
            }
        }
        return (InterfaceC2654sd) obj;
    }

    public /* synthetic */ C2708vd(LevelPlay.AdFormat adFormat, InterfaceC2690ud interfaceC2690ud, InterfaceC2774z7 interfaceC2774z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, (i & 2) != 0 ? new C2672td(adFormat) : interfaceC2690ud, (i & 4) != 0 ? Jb.u.d().h() : interfaceC2774z7);
    }

    private final boolean a() {
        int i;
        List<InterfaceC2654sd> list = this.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((InterfaceC2654sd) it.next()).a() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i < this.f;
    }

    @Override // com.ironsource.InterfaceC2726wd
    public C2451h6 a(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        IronLog.INTERNAL.verbose(this.a + " - adunit: \"" + adUnitId + "\"");
        InterfaceC2654sd b2 = b(adUnitId);
        if (b2 != null) {
            return b2.c();
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC2726wd
    public void a(String adUnitId, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(this.a + " - adunit: \"" + adUnitId + "\", didUseInstance: " + z);
        InterfaceC2654sd b2 = b(adUnitId);
        if (b2 == null) {
            ironLog.warning("adunit is null at \"" + adUnitId + "\"");
            return;
        }
        b2.a(z);
        if (z && this.d == a.Idle) {
            d();
        }
    }
}
