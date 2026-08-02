package ru.ozon.uni.ozi.components.button;

import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import m0.D0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.foundation.components.button.FoundationIconButtonKt;
import ru.ozon.uni.ozi.components.button.presets.OziIconButtonShape;
import ru.ozon.uni.ozi.components.button.presets.size.OziIconButtonSize;
import ru.ozon.uni.ozi.components.button.presets.style.OziIconButtonStyle;
import ru.ozon.uni.ozi.components.button.utils.ButtonAnimationUtilsKt;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import ru.ozon.uni.ozi.utils.PainterUtilsKt;
import ru.ozon.uni.ozi.utils.internal.TransitionsKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aa\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a]\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lq1/b;", "icon", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "", "enabled", "Lru/ozon/uni/ozi/components/button/presets/OziIconButtonShape;", "shape", "Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonStyle;", "style", "Lru/ozon/uni/ozi/components/button/presets/size/OziIconButtonSize;", "size", "Lt0/q;", "interactionSource", "OziIconButton", "(Lq1/b;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;ZLru/ozon/uni/ozi/components/button/presets/OziIconButtonShape;Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonStyle;Lru/ozon/uni/ozi/components/button/presets/size/OziIconButtonSize;Lt0/q;LS0/k;II)V", "isLoading", "OziIconButtonImpl", "(Landroidx/compose/ui/e;Lq1/b;ZZLru/ozon/uni/ozi/components/button/presets/OziIconButtonShape;Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonStyle;Lru/ozon/uni/ozi/components/button/presets/size/OziIconButtonSize;Lt0/q;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIconButtonKt {
    public static final void OziIconButton(@NotNull AbstractC8972b icon, @NotNull Function0<Unit> onClick, e eVar, boolean z11, OziIconButtonShape oziIconButtonShape, OziIconButtonStyle oziIconButtonStyle, OziIconButtonSize oziIconButtonSize, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        q qVar2;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        interfaceC3967k.o(-1606502688);
        if ((i12 & 4) != 0) {
            eVar = e.f40358c0;
        }
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        OziIconButtonShape oziIconButtonShape2 = (i12 & 16) != 0 ? OziIconButtonShape.Square : oziIconButtonShape;
        OziIconButtonStyle oziIconButtonStyle2 = (i12 & 32) != 0 ? OziIconButtonStyle.ActionPrimary.INSTANCE : oziIconButtonStyle;
        OziIconButtonSize oziIconButtonSize2 = (i12 & 64) != 0 ? OziIconButtonSize.Size500 : oziIconButtonSize;
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            interfaceC3967k.o(-727558907);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            qVar2 = (q) C11;
        } else {
            qVar2 = qVar;
        }
        OziIconButtonImpl(eVar, icon, false, z12, oziIconButtonShape2, oziIconButtonStyle2, oziIconButtonSize2, qVar2, onClick, interfaceC3967k, ((i11 >> 6) & 14) | 384 | ((i11 << 3) & 112) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | ((i11 << 21) & 234881024));
        interfaceC3967k.k();
    }

    public static final void OziIconButtonImpl(@NotNull e modifier, @NotNull AbstractC8972b icon, boolean z11, boolean z12, @NotNull OziIconButtonShape shape, @NotNull OziIconButtonStyle style, @NotNull OziIconButtonSize size, @NotNull q interactionSource, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-1095964006);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(icon) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(shape) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(style) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.n(size) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= u11.n(interactionSource) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.F(onClick) ? 67108864 : 33554432;
        }
        int i13 = i12;
        if ((i13 & 38347923) == 38347922 && u11.b()) {
            u11.j();
        } else {
            D0<Boolean> m3245rememberIndicationTransitionFbhrOv8 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(interactionSource, 0L, 0L, u11, (i13 >> 21) & 14, 3);
            int i14 = ((i13 >> 9) & 14) | ((i13 >> 12) & 112);
            AbstractC7799Q backgroundBrushInternal$uni_release = style.getBackgroundBrushInternal$uni_release(z12, u11, i14);
            long m3068getIconColorInternalXeAY9LY$uni_release = style.m3068getIconColorInternalXeAY9LY$uni_release(z12, u11, i14);
            A1<Float> animateButtonIconColor = ButtonAnimationUtilsKt.animateButtonIconColor(m3245rememberIndicationTransitionFbhrOv8, z12, C7807Z.q(m3068getIconColorInternalXeAY9LY$uni_release), 0.4f, 0.4f, u11, ((i13 >> 6) & 112) | 27648);
            e oziTestTag = OziTestTagsKt.oziTestTag(e.f40358c0, OziIconButtonTestTags.Icon, PainterUtilsKt.getIconNameTestTagParameter(icon, OziIconButtonTestTags.INSTANCE.getIconName()), u11, 54, 0);
            int i15 = i13 << 3;
            u11 = u11;
            FoundationIconButtonKt.m2983FoundationIconButton5IdfQCw(i.b(androidx.compose.foundation.e.a(C6988h.a(a0.n(OziTestTagsKt.oziTestTag(modifier, OziIconButtonTestTags.Container, null, u11, (i13 & 14) | 48, 2), size.getSize()), shape.getShape$uni_release(size)), backgroundBrushInternal$uni_release, null, 6), interactionSource, null, z12, null, I1.i.a(0), onClick, 8), oziTestTag, icon, z11, animateButtonIconColor, m3068getIconColorInternalXeAY9LY$uni_release, size.getIconSize(), c.c(-1986024344, new OziIconButtonKt$OziIconButtonImpl$1(m3068getIconColorInternalXeAY9LY$uni_release, size), u11), u11, (i15 & 896) | 12582912 | (i15 & 7168));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OziIconButtonKt$OziIconButtonImpl$2(modifier, icon, z11, z12, shape, style, size, interactionSource, onClick, i11));
        }
    }
}
