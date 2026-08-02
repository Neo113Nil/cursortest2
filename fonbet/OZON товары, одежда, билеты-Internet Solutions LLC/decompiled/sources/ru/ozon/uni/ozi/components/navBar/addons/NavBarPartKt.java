package ru.ozon.uni.ozi.components.navBar.addons;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Fr.g;
import J0.C3349u1;
import P9.a;
import S0.A0;
import S0.C3969l;
import S0.C3996z;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import T7.E;
import Z1.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.navBar.addons.OziNavBarScope;
import ru.ozon.uni.ozi.components.navBar.presets.OziNavBarAlignment;
import ru.ozon.uni.ozi.config.OziConfigKt;
import ru.ozon.uni.ozi.theme.OziTheme;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a[\u0010\r\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u001a\u001a\u00020\u0017*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001c\u001a\u00020\u0017*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0019\u001a%\u0010\u001d\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u001a\u0010\"\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lkotlin/Function0;", "", "startContent", "centerContent", "endContent", "", "blueprintId", "Lru/ozon/uni/ozi/components/navBar/presets/OziNavBarAlignment;", "alignment", "Lru/ozon/uni/ozi/components/navBar/addons/NavBarFloor;", "floor", "Landroidx/compose/ui/e;", "modifier", "NavBarPart", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lru/ozon/uni/ozi/components/navBar/presets/OziNavBarAlignment;Lru/ozon/uni/ozi/components/navBar/addons/NavBarFloor;Landroidx/compose/ui/e;LS0/k;II)V", "LB1/Y;", "", "LB1/U;", "measurables", "LZ1/b;", "constraints", "", "gap", "LB1/W;", "defaultMeasureResult-L1NQ6kE", "(LB1/Y;Ljava/util/List;JILru/ozon/uni/ozi/components/navBar/addons/NavBarFloor;)LB1/W;", "defaultMeasureResult", "leadingMeasureResult-L1NQ6kE", "leadingMeasureResult", "checkForScopeCompliance", "(Ljava/util/List;Lru/ozon/uni/ozi/components/navBar/addons/NavBarFloor;)V", "LZ1/h;", "NavBarMinimumHeight", "F", "NavBarEmptySideSlotsWidth", "getNavBarEmptySideSlotsWidth", "()F", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavBarPartKt {
    private static final float NavBarMinimumHeight = 44;
    private static final float NavBarEmptySideSlotsWidth = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OziNavBarAlignment.values().length];
            try {
                iArr[OziNavBarAlignment.Leading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziNavBarAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavBarPart(@NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> startContent, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> centerContent, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> endContent, @NotNull String blueprintId, @NotNull final OziNavBarAlignment alignment, @NotNull final NavBarFloor floor, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        d h11;
        boolean z11;
        Object C11;
        int I11;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(startContent, "startContent");
        Intrinsics.checkNotNullParameter(centerContent, "centerContent");
        Intrinsics.checkNotNullParameter(endContent, "endContent");
        Intrinsics.checkNotNullParameter(blueprintId, "blueprintId");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(floor, "floor");
        C3969l u11 = interfaceC3967k.u(-1933604910);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(startContent) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(centerContent) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(endContent) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.n(blueprintId) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.n(alignment) ? 16384 : 8192;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i13 |= u11.n(floor) ? 131072 : 65536;
        }
        int i15 = i12 & 64;
        if (i15 != 0) {
            i13 |= 1572864;
        } else if ((1572864 & i11) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 1048576 : 524288;
            if ((599187 & i13) == 599186 || !u11.b()) {
                e eVar4 = i15 == 0 ? e.f40358c0 : eVar2;
                i14 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
                if (i14 != 1) {
                    h11 = InterfaceC6250b.a.h();
                } else {
                    if (i14 != 2) {
                        throw new o();
                    }
                    h11 = InterfaceC6250b.a.e();
                }
                a.b(eVar4, blueprintId);
                u11.o(1550975650);
                z11 = ((458752 & i13) != 131072) | ((57344 & i13) == 16384);
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new V() { // from class: ru.ozon.uni.ozi.components.navBar.addons.NavBarPartKt$NavBarPart$1$1

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[OziNavBarAlignment.values().length];
                                try {
                                    iArr[OziNavBarAlignment.Leading.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[OziNavBarAlignment.Center.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // B1.V
                        /* renamed from: measure-3p2s80s */
                        public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                            W m3116leadingMeasureResultL1NQ6kE;
                            W m3115defaultMeasureResultL1NQ6kE;
                            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            if (OziConfigKt.getGlobalOziConfig().getEnableStrictMode()) {
                                NavBarPartKt.checkForScopeCompliance(measurables, NavBarFloor.this);
                            }
                            int i16 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
                            if (i16 == 1) {
                                m3116leadingMeasureResultL1NQ6kE = NavBarPartKt.m3116leadingMeasureResultL1NQ6kE(Layout, measurables, j11, Layout.Y0(OziTheme.INSTANCE.getPaddings().getPadding300()), NavBarFloor.this);
                                return m3116leadingMeasureResultL1NQ6kE;
                            }
                            if (i16 != 2) {
                                throw new o();
                            }
                            m3115defaultMeasureResultL1NQ6kE = NavBarPartKt.m3115defaultMeasureResultL1NQ6kE(Layout, measurables, j11, Layout.Y0(OziTheme.INSTANCE.getPaddings().getPadding300()), NavBarFloor.this);
                            return m3115defaultMeasureResultL1NQ6kE;
                        }
                    };
                    u11.x(C11);
                }
                V v11 = (V) C11;
                u11.k();
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, eVar4);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f11 = E.f(u11, v11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, f11);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                startContent.invoke(u11, Integer.valueOf(i13 & 14));
                C3996z.a(OziNavBarScopeKt.getLocalNavBarCenterScopeAlignment().c(h11), a1.c.c(-773049733, new NavBarPartKt$NavBarPart$2$1(centerContent), u11), u11, 56);
                C3349u1.e((i13 >> 6) & 14, endContent, u11);
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new NavBarPartKt$NavBarPart$3(startContent, centerContent, endContent, blueprintId, alignment, floor, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((599187 & i13) == 599186) {
        }
        if (i15 == 0) {
        }
        i14 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i14 != 1) {
        }
        a.b(eVar4, blueprintId);
        u11.o(1550975650);
        z11 = ((458752 & i13) != 131072) | ((57344 & i13) == 16384);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new V() { // from class: ru.ozon.uni.ozi.components.navBar.addons.NavBarPartKt$NavBarPart$1$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OziNavBarAlignment.values().length];
                    try {
                        iArr[OziNavBarAlignment.Leading.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OziNavBarAlignment.Center.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // B1.V
            /* renamed from: measure-3p2s80s */
            public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                W m3116leadingMeasureResultL1NQ6kE;
                W m3115defaultMeasureResultL1NQ6kE;
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (OziConfigKt.getGlobalOziConfig().getEnableStrictMode()) {
                    NavBarPartKt.checkForScopeCompliance(measurables, NavBarFloor.this);
                }
                int i16 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
                if (i16 == 1) {
                    m3116leadingMeasureResultL1NQ6kE = NavBarPartKt.m3116leadingMeasureResultL1NQ6kE(Layout, measurables, j11, Layout.Y0(OziTheme.INSTANCE.getPaddings().getPadding300()), NavBarFloor.this);
                    return m3116leadingMeasureResultL1NQ6kE;
                }
                if (i16 != 2) {
                    throw new o();
                }
                m3115defaultMeasureResultL1NQ6kE = NavBarPartKt.m3115defaultMeasureResultL1NQ6kE(Layout, measurables, j11, Layout.Y0(OziTheme.INSTANCE.getPaddings().getPadding300()), NavBarFloor.this);
                return m3115defaultMeasureResultL1NQ6kE;
            }
        };
        u11.x(C11);
        V v112 = (V) C11;
        u11.k();
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, eVar4);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f112 = E.f(u11, v112, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f112);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        startContent.invoke(u11, Integer.valueOf(i13 & 14));
        C3996z.a(OziNavBarScopeKt.getLocalNavBarCenterScopeAlignment().c(h11), a1.c.c(-773049733, new NavBarPartKt$NavBarPart$2$1(centerContent), u11), u11, 56);
        C3349u1.e((i13 >> 6) & 14, endContent, u11);
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkForScopeCompliance(List<? extends U> list, NavBarFloor navBarFloor) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            U u11 = list.get(i11);
            OziNavBarScope.AddonMarker addonMarker = navBarFloor.getScopes().get(i11).getAddonMarker();
            Object a11 = androidx.compose.ui.layout.a.a(u11);
            if ((a11 instanceof OziNavBarScope.AddonMarker ? (OziNavBarScope.AddonMarker) a11 : null) != addonMarker) {
                throw new IllegalArgumentException(h.F0("Переданный аддон не является функцией из соответствующего scope. Вызывайте только их.\n                |Expected layoutId: " + a11 + ", Actual layoutId " + addonMarker + "\n            ").toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: defaultMeasureResult-L1NQ6kE, reason: not valid java name */
    public static final W m3115defaultMeasureResultL1NQ6kE(Y y11, List<? extends U> list, long j11, int i11, NavBarFloor navBarFloor) {
        U u11;
        U u12;
        U u13;
        long c11;
        W z02;
        int size = list.size();
        int i12 = 0;
        while (true) {
            u11 = null;
            if (i12 >= size) {
                u12 = null;
                break;
            }
            u12 = list.get(i12);
            if (androidx.compose.ui.layout.a.a(u12) == navBarFloor.getScopes().get(0).getAddonMarker()) {
                break;
            }
            i12++;
        }
        if (u12 == null) {
            throw new IllegalArgumentException("Передан неверный layoutId для START slot'а — компонент сломался :(");
        }
        U u14 = u12;
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                u13 = null;
                break;
            }
            u13 = list.get(i13);
            if (androidx.compose.ui.layout.a.a(u13) == navBarFloor.getScopes().get(1).getAddonMarker()) {
                break;
            }
            i13++;
        }
        Intrinsics.f(u13);
        U u15 = u13;
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                break;
            }
            U u16 = list.get(i14);
            if (androidx.compose.ui.layout.a.a(u16) == navBarFloor.getScopes().get(2).getAddonMarker()) {
                u11 = u16;
                break;
            }
            i14++;
        }
        Intrinsics.f(u11);
        m0 a02 = u14.a0(b.c(0, 0, 0, 0, 10, j11));
        m0 a03 = u11.a0(b.c(0, 0, 0, 0, 10, j11));
        int max = Math.max(a02.u0(), a03.u0());
        if (b.g(j11)) {
            int k11 = b.k(j11) - ((max + i11) * 2);
            int i15 = k11 < 0 ? 0 : k11;
            c11 = b.c(i15, i15, 0, 0, 8, j11);
        } else {
            c11 = b.c(0, 0, 0, 0, 10, j11);
        }
        m0 a04 = u15.a0(c11);
        int c12 = Vc.a.c(new int[]{a03.l0(), a04.l0(), y11.Y0(NavBarMinimumHeight)}, a02.l0());
        int k12 = b.k(j11);
        z02 = y11.z0(k12, c12, kotlin.collections.U.c(), new NavBarPartKt$defaultMeasureResult$1(a02, c12, a04, max + i11, a03, k12, max));
        return z02;
    }

    public static final float getNavBarEmptySideSlotsWidth() {
        return NavBarEmptySideSlotsWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: leadingMeasureResult-L1NQ6kE, reason: not valid java name */
    public static final W m3116leadingMeasureResultL1NQ6kE(Y y11, List<? extends U> list, long j11, int i11, NavBarFloor navBarFloor) {
        U u11;
        U u12;
        U u13;
        long c11;
        W z02;
        int size = list.size();
        int i12 = 0;
        while (true) {
            u11 = null;
            if (i12 >= size) {
                u12 = null;
                break;
            }
            u12 = list.get(i12);
            if (androidx.compose.ui.layout.a.a(u12) == navBarFloor.getScopes().get(0).getAddonMarker()) {
                break;
            }
            i12++;
        }
        if (u12 == null) {
            throw new IllegalArgumentException("Передан неверный layoutId для START slot'а — компонент сломался :(");
        }
        U u14 = u12;
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                u13 = null;
                break;
            }
            u13 = list.get(i13);
            if (androidx.compose.ui.layout.a.a(u13) == navBarFloor.getScopes().get(1).getAddonMarker()) {
                break;
            }
            i13++;
        }
        Intrinsics.f(u13);
        U u15 = u13;
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                break;
            }
            U u16 = list.get(i14);
            if (androidx.compose.ui.layout.a.a(u16) == navBarFloor.getScopes().get(2).getAddonMarker()) {
                u11 = u16;
                break;
            }
            i14++;
        }
        Intrinsics.f(u11);
        m0 a02 = u14.a0(b.c(0, 0, 0, 0, 10, j11));
        m0 a03 = u11.a0(b.c(0, 0, 0, 0, 10, j11));
        int u02 = a03.u0() + a02.u0();
        if (b.g(j11)) {
            int k11 = (b.k(j11) - u02) - (i11 * 2);
            int i15 = k11 < 0 ? 0 : k11;
            c11 = b.c(i15, i15, 0, 0, 8, j11);
        } else {
            c11 = b.c(0, 0, 0, 0, 10, j11);
        }
        m0 a04 = u15.a0(c11);
        int c12 = Vc.a.c(new int[]{a03.l0(), a04.l0(), y11.Y0(NavBarMinimumHeight)}, a02.l0());
        int k12 = b.k(j11);
        z02 = y11.z0(k12, c12, kotlin.collections.U.c(), new NavBarPartKt$leadingMeasureResult$1(a02, c12, a04, i11, a03, k12));
        return z02;
    }
}
