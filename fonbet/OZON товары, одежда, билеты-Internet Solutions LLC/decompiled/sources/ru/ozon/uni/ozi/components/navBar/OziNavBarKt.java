package ru.ozon.uni.ozi.components.navBar;

import A0.h;
import D1.InterfaceC2801g;
import Fr.g;
import K00.b;
import P9.a;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.J0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import ru.ozon.uni.ozi.utils.internal.SpacersKt;
import u0.C9896e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\f\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/Function0;", "", "topLevel", "bottomLevel", "Landroidx/compose/ui/e;", "modifier", "", "hasRounding", "LZ1/h;", "topPadding", "OziNavBar-FJfuzF0", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;ZFLS0/k;II)V", "OziNavBar", "Ll1/J0;", "RoundedShape", "Ll1/J0;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNavBarKt {

    @NotNull
    private static final J0 RoundedShape;

    static {
        float f7 = 24;
        RoundedShape = h.d(0.0f, 0.0f, f7, f7, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0084  */
    /* renamed from: OziNavBar-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3111OziNavBarFJfuzF0(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, e eVar, boolean z11, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        boolean z12;
        float f11;
        boolean z13;
        float f12;
        e eVar2;
        int I11;
        boolean z14;
        float f13;
        e eVar3;
        S0.J0 m02;
        int i14;
        C3969l u11 = interfaceC3967k.u(-618904914);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(function2) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function22) ? 32 : 16;
        }
        int i16 = i12 & 4;
        if (i16 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i12 & 8;
        if (i17 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            z12 = z11;
            i13 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i11 & 24576) != 0) {
                if ((i12 & 16) == 0) {
                    f11 = f7;
                    if (u11.q(f11)) {
                        i14 = 16384;
                        i13 |= i14;
                    }
                } else {
                    f11 = f7;
                }
                i14 = 8192;
                i13 |= i14;
            } else {
                f11 = f7;
            }
            if ((i13 & 9363) == 9362 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    if (i15 != 0) {
                        function22 = null;
                    }
                    e eVar4 = i16 == 0 ? e.f40358c0 : eVar;
                    z13 = i17 == 0 ? true : z12;
                    if ((i12 & 16) == 0) {
                        f12 = OziTheme.INSTANCE.getPaddings().getPadding300();
                        i13 &= -57345;
                    } else {
                        f12 = f11;
                    }
                    eVar2 = eVar4;
                } else {
                    u11.j();
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                    }
                    z13 = z12;
                    f12 = f11;
                    eVar2 = eVar;
                }
                u11.j0();
                e b11 = androidx.compose.foundation.e.b(a0.e(OziTestTagsKt.oziTestTag(eVar2, OziNavBarTestTags.Container, null, u11, ((i13 >> 6) & 14) | 48, 2), 1.0f), OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getLayerFloor1(), !z13 ? RoundedShape : y0.a());
                a.b(b11, "PARENT");
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f14 = c.f(u11, b11);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g10 = b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                SpacersKt.m3244SpacerHeightziNgDLE(C9896e.f99653a, f12, u11, ((i13 >> 9) & 112) | 6);
                u11.o(908642784);
                if (function2 != null) {
                    function2.invoke(u11, Integer.valueOf(i13 & 14));
                }
                u11.k();
                u11.o(908644102);
                if (function22 != null) {
                    function22.invoke(u11, Integer.valueOf((i13 >> 3) & 14));
                }
                u11.k();
                u11.f();
                z14 = z13;
                f13 = f12;
                eVar3 = eVar2;
            } else {
                u11.j();
                eVar3 = eVar;
                z14 = z12;
                f13 = f11;
            }
            Function2<? super InterfaceC3967k, ? super Integer, Unit> function23 = function22;
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new OziNavBarKt$OziNavBar$2(function2, function23, eVar3, z14, f13, i11, i12));
                return;
            }
            return;
        }
        z12 = z11;
        if ((i11 & 24576) != 0) {
        }
        if ((i13 & 9363) == 9362) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if ((i12 & 16) == 0) {
        }
        eVar2 = eVar4;
        u11.j0();
        e b112 = androidx.compose.foundation.e.b(a0.e(OziTestTagsKt.oziTestTag(eVar2, OziNavBarTestTags.Container, null, u11, ((i13 >> 6) & 14) | 48, 2), 1.0f), OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getLayerFloor1(), !z13 ? RoundedShape : y0.a());
        a.b(b112, "PARENT");
        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f142 = c.f(u11, b112);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, g102);
        F1.b(u11, f142, InterfaceC2801g.a.f());
        SpacersKt.m3244SpacerHeightziNgDLE(C9896e.f99653a, f12, u11, ((i13 >> 9) & 112) | 6);
        u11.o(908642784);
        if (function2 != null) {
        }
        u11.k();
        u11.o(908644102);
        if (function22 != null) {
        }
        u11.k();
        u11.f();
        z14 = z13;
        f13 = f12;
        eVar3 = eVar2;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function232 = function22;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
