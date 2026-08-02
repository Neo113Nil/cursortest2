package ru.ozon.uni.ozi.components.island;

import A0.g;
import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.h0;
import l1.C7807Z;
import m0.C7990g;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.components.island.presets.OziIslandCorners;
import ru.ozon.uni.ozi.components.island.presets.OziIslandStyle;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import ru.ozon.uni.ozi.utils.internal.AnimationUtilsKt;
import ru.ozon.uni.ozi.utils.internal.TransitionsKt;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredColor;
import t0.p;
import t0.q;
import u0.C9915y;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a{\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001ak\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001e²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "selected", "Lkotlin/Function0;", "", "onClick", "Lru/ozon/uni/ozi/components/island/presets/OziIslandStyle;", "style", "LZ1/h;", "cornerRadius", "", "Lru/ozon/uni/ozi/components/island/presets/OziIslandCorners;", "roundedCorners", "Lu0/x;", "contentPadding", "Lt0/q;", "interactionSource", "content", "OziIsland-gNPyAyM", "(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function0;Lru/ozon/uni/ozi/components/island/presets/OziIslandStyle;FLjava/util/Set;Lu0/x;Lt0/q;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "OziIsland", "BasicIsland-GHTll3U", "(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function0;Lru/ozon/uni/ozi/components/island/presets/OziIslandStyle;FLjava/util/Set;Lu0/x;Lt0/q;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "BasicIsland", "", "alpha", "borderWidth", "Ll1/Z;", "borderColor", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIslandKt {
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* renamed from: BasicIsland-GHTll3U, reason: not valid java name */
    public static final void m3102BasicIslandGHTll3U(@NotNull e modifier, boolean z11, Function0<Unit> function0, @NotNull OziIslandStyle style, float f7, @NotNull Set<? extends OziIslandCorners> roundedCorners, @NotNull InterfaceC9914x contentPadding, @NotNull q interactionSource, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long value;
        InterfaceC9914x interfaceC9914x;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function2;
        A1<Float> a12;
        ?? r52;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(995278676);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(style) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.q(f7) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(roundedCorners) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.n(contentPadding) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.n(interactionSource) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.F(content) ? 67108864 : 33554432;
        }
        int i13 = i12;
        if ((i13 & 38347923) == 38347922 && u11.b()) {
            u11.j();
            function2 = content;
        } else {
            A1<Float> animateClickAlpha = AnimationUtilsKt.animateClickAlpha(TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(interactionSource, 0L, 0L, u11, (i13 >> 21) & 14, 3), 0.0f, 0.0f, u11, 0, 3);
            A1 a11 = C7990g.a(z11 ? 2 : style.getBorderWidth(), null, u11, 384, 10);
            if (z11) {
                u11.o(-2001421585);
                value = OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getGraphicActionPrimary();
            } else {
                u11.o(-2001420096);
                value = DeferredColor.getValue(style.getBorderDefColor(), u11, 0);
            }
            u11.k();
            A1 a13 = h0.a(value, null, "borderColor", u11, 384, 10);
            g c11 = h.c(roundedCorners.contains(OziIslandCorners.TopStart) ? f7 : 0, roundedCorners.contains(OziIslandCorners.TopEnd) ? f7 : 0, roundedCorners.contains(OziIslandCorners.BottomEnd) ? f7 : 0, roundedCorners.contains(OziIslandCorners.BottomStart) ? f7 : 0);
            u11 = u11;
            e oziTestTag = OziTestTagsKt.oziTestTag(modifier, OziIslandTestTags.Container, null, u11, (i13 & 14) | 48, 2);
            if (function0 != null) {
                e.a aVar = e.f40358c0;
                Intrinsics.f(function0);
                a12 = animateClickAlpha;
                r52 = 0;
                interfaceC9914x = contentPadding;
                function2 = content;
                oziTestTag = oziTestTag.l0(i.b(aVar, interactionSource, null, false, null, null, function0, 28));
            } else {
                interfaceC9914x = contentPadding;
                function2 = content;
                a12 = animateClickAlpha;
                r52 = 0;
            }
            e c12 = C8385f.c(BasicIsland_GHTll3U$lambda$2(a11), BasicIsland_GHTll3U$lambda$3(a13), androidx.compose.foundation.e.b(oziTestTag, DeferredColor.getValue(style.getBackgroundDefColor(), u11, r52), c11), c11);
            u11.o(-2001388751);
            boolean n11 = u11.n(a12) | u11.n(c11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new OziIslandKt$BasicIsland$2$1(c11, a12);
                u11.x(C11);
            }
            u11.k();
            e a14 = a.a(c12, (Function1) C11);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), r52);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, a14);
            Function0 a15 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a15);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            AbstractC8972b backgroundPainter = style.getBackgroundPainter();
            u11.o(-1599404638);
            if (backgroundPainter != null) {
                C5185h.a(androidx.compose.ui.draw.e.a(c5187j.b(e.f40358c0), backgroundPainter, null, InterfaceC2547p.a.a(), 0.0f, null, 52), u11, r52);
            }
            u11.k();
            e e11 = T.e(e.f40358c0, interfaceC9914x);
            V f14 = C5185h.f(InterfaceC6250b.a.o(), r52);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f15 = c.f(u11, e11);
            Function0 a16 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a16);
            } else {
                u11.e();
            }
            Function2 f16 = E.f(u11, f14, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f16);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            function2.invoke(u11, Integer.valueOf((i13 >> 24) & 14));
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OziIslandKt$BasicIsland$4(modifier, z11, function0, style, f7, roundedCorners, contentPadding, interactionSource, function2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BasicIsland_GHTll3U$lambda$1(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    private static final float BasicIsland_GHTll3U$lambda$2(A1<Z1.h> a12) {
        return a12.getValue().d();
    }

    private static final long BasicIsland_GHTll3U$lambda$3(A1<C7807Z> a12) {
        return a12.getValue().w();
    }

    /* renamed from: OziIsland-gNPyAyM, reason: not valid java name */
    public static final void m3103OziIslandgNPyAyM(e eVar, boolean z11, Function0<Unit> function0, OziIslandStyle oziIslandStyle, float f7, Set<? extends OziIslandCorners> set, InterfaceC9914x interfaceC9914x, q qVar, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(content, "content");
        interfaceC3967k.o(-1948524252);
        if ((i12 & 1) != 0) {
            eVar = e.f40358c0;
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            function0 = null;
        }
        if ((i12 & 8) != 0) {
            oziIslandStyle = OziIslandStyle.Primary.INSTANCE;
        }
        if ((i12 & 16) != 0) {
            f7 = OziTheme.INSTANCE.getCornerRadius().getRadius500();
        }
        if ((i12 & 32) != 0) {
            OziIslandCorners[] elements = {OziIslandCorners.TopStart, OziIslandCorners.TopEnd, OziIslandCorners.BottomEnd, OziIslandCorners.BottomStart};
            Intrinsics.checkNotNullParameter(elements, "elements");
            set = C7705l.j0(elements);
        }
        if ((i12 & 64) != 0) {
            float padding500 = OziTheme.INSTANCE.getPaddings().getPadding500();
            interfaceC9914x = new C9915y(padding500, padding500, padding500, padding500);
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            interfaceC3967k.o(991435698);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            qVar = (q) C11;
            interfaceC3967k.k();
        }
        q qVar2 = qVar;
        InterfaceC9914x interfaceC9914x2 = interfaceC9914x;
        Set<? extends OziIslandCorners> set2 = set;
        float f11 = f7;
        OziIslandStyle oziIslandStyle2 = oziIslandStyle;
        Function0<Unit> function02 = function0;
        boolean z12 = z11;
        m3102BasicIslandGHTll3U(eVar, z12, function02, oziIslandStyle2, f11, set2, interfaceC9914x2, qVar2, content, interfaceC3967k, 268435454 & i11);
        interfaceC3967k.k();
    }
}
