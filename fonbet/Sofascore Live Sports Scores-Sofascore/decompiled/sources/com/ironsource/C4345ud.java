package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ud, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4345ud implements InterfaceC4363vd {

    @NotNull
    private final LevelPlay.AdFormat a;

    @NotNull
    private final InterfaceC4327td b;

    @NotNull
    private final InterfaceC4375w7 c;

    @NotNull
    private a d;

    @NotNull
    private List<InterfaceC4291rd> e;
    private final int f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ud$a */
    public enum a {
        None,
        Idle,
        Loading
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ud$b */
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ud$c */
    public static final class c extends xka implements Function1<Boolean, Unit> {
        final /* synthetic */ InterfaceC4291rd a;
        final /* synthetic */ C4345ud b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4291rd interfaceC4291rd, C4345ud c4345ud) {
            super(1);
            this.a = interfaceC4291rd;
            this.b = c4345ud;
        }

        public final void a(boolean z) {
            if (!z) {
                IronLog.INTERNAL.verbose("adunit \"" + this.a.b() + "\" failed to load, removing");
                this.b.e.remove(this.a);
            }
            this.b.d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.a;
        }
    }

    public C4345ud(@NotNull LevelPlay.AdFormat adFormat, @NotNull InterfaceC4327td interfaceC4327td, @NotNull InterfaceC4375w7 interfaceC4375w7) {
        adFormat.getClass();
        interfaceC4327td.getClass();
        interfaceC4375w7.getClass();
        this.a = adFormat;
        this.b = interfaceC4327td;
        this.c = interfaceC4375w7;
        this.d = a.None;
        this.e = new ArrayList();
        this.f = b();
    }

    private final InterfaceC4291rd b(String str) {
        Object obj;
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((InterfaceC4291rd) obj).b(), str)) {
                break;
            }
        }
        return (InterfaceC4291rd) obj;
    }

    private final int c() {
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return this.c.J();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        InterfaceC4291rd e = e();
        if (e == null) {
            this.d = a.Idle;
        } else {
            this.d = a.Loading;
            e.a(new c(e, this));
        }
    }

    private final InterfaceC4291rd e() {
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
            if (((InterfaceC4291rd) obj).a()) {
                break;
            }
        }
        InterfaceC4291rd interfaceC4291rd = (InterfaceC4291rd) obj;
        if (interfaceC4291rd != null) {
            return interfaceC4291rd;
        }
        IronLog.INTERNAL.verbose(this.a + " - preload done");
        return null;
    }

    @Override // com.ironsource.InterfaceC4363vd
    public void a(@NotNull Sa sa) {
        sa.getClass();
        if (!this.c.x()) {
            IronLog.INTERNAL.warning(this.a + " - preload is disabled");
            return;
        }
        if (this.d != a.None) {
            IronLog.INTERNAL.warning(this.a + " - initializing service again");
            return;
        }
        int c2 = c();
        if (c2 >= 1) {
            IronLog.INTERNAL.verbose(String.valueOf(this.a));
            this.d = a.Idle;
            this.e = CollectionsKt.U0(this.b.a(sa.c(this.a), c2, sa));
            d();
            return;
        }
        IronLog.INTERNAL.warning(this.a + " - invalid maxParallelLoad: " + c2);
    }

    private final int b() {
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return this.c.j();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.y();
    }

    public /* synthetic */ C4345ud(LevelPlay.AdFormat adFormat, InterfaceC4327td interfaceC4327td, InterfaceC4375w7 interfaceC4375w7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, (i & 2) != 0 ? new C4309sd(adFormat) : interfaceC4327td, (i & 4) != 0 ? Ib.v.d().h() : interfaceC4375w7);
    }

    private final boolean a() {
        int i;
        List<InterfaceC4291rd> list = this.e;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((InterfaceC4291rd) it.next()).a() && (i = i + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        return i < this.f;
    }

    @Override // com.ironsource.InterfaceC4363vd
    @Nullable
    public C4088g6 a(@NotNull String str) {
        str.getClass();
        IronLog.INTERNAL.verbose(this.a + " - adunit: \"" + str + "\"");
        InterfaceC4291rd b2 = b(str);
        if (b2 != null) {
            return b2.c();
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4363vd
    public void a(@NotNull String str, boolean z) {
        str.getClass();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(this.a + " - adunit: \"" + str + "\", didUseInstance: " + z);
        InterfaceC4291rd b2 = b(str);
        if (b2 == null) {
            ironLog.warning("adunit is null at \"" + str + "\"");
            return;
        }
        b2.a(z);
        if (z && this.d == a.Idle) {
            d();
        }
    }
}
