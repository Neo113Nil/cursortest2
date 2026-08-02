package ru.ozon.uni.ozi.components.button;

import A0.h;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.T;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.foundation.components.button.FoundationButtonKt;
import ru.ozon.uni.ozi.components.button.presets.size.OziButtonSize;
import ru.ozon.uni.ozi.components.button.presets.style.OziButtonStyle;
import ru.ozon.uni.ozi.components.button.utils.ButtonAnimationUtilsKt;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import ru.ozon.uni.ozi.utils.PainterUtilsKt;
import ru.ozon.uni.ozi.utils.internal.TransitionsKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ay\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aq\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "subtitle", "Lq1/b;", "icon", "", "enabled", "Lru/ozon/uni/ozi/components/button/OziButtonResizing;", "resizing", "Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle;", "style", "Lru/ozon/uni/ozi/components/button/presets/size/OziButtonSize;", "size", "Lt0/q;", "interactionSource", "OziButton", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;Ljava/lang/String;Lq1/b;ZLru/ozon/uni/ozi/components/button/OziButtonResizing;Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle;Lru/ozon/uni/ozi/components/button/presets/size/OziButtonSize;Lt0/q;LS0/k;II)V", "isLoading", "OziButtonImpl", "(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Lq1/b;ZLru/ozon/uni/ozi/components/button/OziButtonResizing;ZLru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle;Lru/ozon/uni/ozi/components/button/presets/size/OziButtonSize;Lt0/q;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziButtonKt {
    public static final void OziButton(@NotNull String title, @NotNull Function0<Unit> onClick, e eVar, String str, AbstractC8972b abstractC8972b, boolean z11, OziButtonResizing oziButtonResizing, OziButtonStyle oziButtonStyle, OziButtonSize oziButtonSize, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        q qVar2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        interfaceC3967k.o(1227660571);
        e eVar2 = (i12 & 4) != 0 ? e.f40358c0 : eVar;
        String str2 = (i12 & 8) != 0 ? null : str;
        AbstractC8972b abstractC8972b2 = (i12 & 16) == 0 ? abstractC8972b : null;
        boolean z12 = (i12 & 32) != 0 ? true : z11;
        OziButtonResizing oziButtonResizing2 = (i12 & 64) != 0 ? OziButtonResizing.HugContents : oziButtonResizing;
        OziButtonStyle oziButtonStyle2 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? OziButtonStyle.ActionPrimary.INSTANCE : oziButtonStyle;
        OziButtonSize oziButtonSize2 = (i12 & 256) != 0 ? OziButtonSize.Size500 : oziButtonSize;
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            interfaceC3967k.o(144297036);
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
        int i13 = i11 >> 3;
        OziButtonImpl(eVar2, title, str2, abstractC8972b2, z12, oziButtonResizing2, false, oziButtonStyle2, oziButtonSize2, qVar2, onClick, interfaceC3967k, ((i11 >> 6) & 14) | 1572864 | ((i11 << 3) & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), i13 & 14);
        interfaceC3967k.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OziButtonImpl(@NotNull e modifier, @NotNull String title, String str, AbstractC8972b abstractC8972b, boolean z11, @NotNull OziButtonResizing resizing, boolean z12, @NotNull OziButtonStyle style, @NotNull OziButtonSize size, @NotNull q interactionSource, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        C3969l c3969l;
        J0 m02;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(resizing, "resizing");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-787479629);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(title) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.n(str) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i13 |= u11.n(abstractC8972b) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.p(z11) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= u11.n(resizing) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= u11.p(z12) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.n(style) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.n(size) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.n(interactionSource) ? 536870912 : 268435456;
        }
        int i16 = i13;
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.F(onClick) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i16 & 306783379) == 306783378) {
            i15 = 2;
            if ((i14 & 3) == 2 && u11.b()) {
                u11.j();
                c3969l = u11;
                m02 = c3969l.m0();
                if (m02 == null) {
                    m02.G(new OziButtonKt$OziButtonImpl$3(modifier, title, str, abstractC8972b, z11, resizing, z12, style, size, interactionSource, onClick, i11, i12));
                    return;
                }
                return;
            }
        } else {
            i15 = 2;
        }
        D0<Boolean> m3245rememberIndicationTransitionFbhrOv8 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(interactionSource, 0L, 0L, u11, (i16 >> 27) & 14, 3);
        int i17 = ((i16 >> 12) & 14) | ((i16 >> 18) & 112);
        AbstractC7799Q backgroundColor$uni_release = style.getBackgroundColor$uni_release(z11, u11, i17);
        long m3065getTitleColorXeAY9LY$uni_release = style.m3065getTitleColorXeAY9LY$uni_release(z11, u11, i17);
        long m3064getSubtitleColorXeAY9LY$uni_release = style.m3064getSubtitleColorXeAY9LY$uni_release(z11, u11, i17);
        long m3063getIconColorXeAY9LY$uni_release = style.m3063getIconColorXeAY9LY$uni_release(z11, u11, i17);
        int i18 = ((i16 >> 9) & 112) | 27648;
        int i19 = i15;
        A1<Float> animateButtonTitleAlpha = ButtonAnimationUtilsKt.animateButtonTitleAlpha(m3245rememberIndicationTransitionFbhrOv8, z11, C7807Z.q(m3065getTitleColorXeAY9LY$uni_release), 0.4f, 0.4f, u11, i18);
        A1<Float> animateButtonSubtitleColor = ButtonAnimationUtilsKt.animateButtonSubtitleColor(m3245rememberIndicationTransitionFbhrOv8, z11, C7807Z.q(m3064getSubtitleColorXeAY9LY$uni_release), 0.4f, 0.4f, u11, i18);
        A1<Float> animateButtonIconColor = ButtonAnimationUtilsKt.animateButtonIconColor(m3245rememberIndicationTransitionFbhrOv8, z11, C7807Z.q(m3063getIconColorXeAY9LY$uni_release), 0.4f, 0.4f, u11, i18);
        e.a aVar = e.f40358c0;
        e oziTestTag = OziTestTagsKt.oziTestTag(aVar, OziButtonTestTags.Icon, PainterUtilsKt.getIconNameTestTagParameter(abstractC8972b, OziButtonTestTags.INSTANCE.getIconName()), u11, 54, 0);
        e oziTestTag2 = OziTestTagsKt.oziTestTag(aVar, OziButtonTestTags.Title, null, u11, 54, 2);
        e oziTestTag3 = OziTestTagsKt.oziTestTag(aVar, OziButtonTestTags.Subtitle, null, u11, 54, 2);
        int i21 = (i16 >> 24) & 14;
        FoundationButtonKt.m2979FoundationButton9jbtD_0(T.h(i.b(androidx.compose.foundation.e.a(C6988h.a(a0.f(OziTestTagsKt.oziTestTag(resizing == OziButtonResizing.FillContainer ? modifier.l0(a0.e(aVar, 1.0f)) : modifier, OziButtonTestTags.Container, null, u11, 48, 2), size.getHeight()), h.b(size.getCornerRadius())), backgroundColor$uni_release, null, 6), interactionSource, null, z11, null, I1.i.a(0), onClick, 8), size.getContentHorizontalPadding(), 0.0f, i19), oziTestTag, oziTestTag2, oziTestTag3, title, str, abstractC8972b, size == OziButtonSize.Size600, z12, animateButtonTitleAlpha, animateButtonSubtitleColor, animateButtonIconColor, size.getTitleTextStyle(u11, i21), size.getSubtitleTextStyle(u11, i21), m3065getTitleColorXeAY9LY$uni_release, m3064getSubtitleColorXeAY9LY$uni_release, m3063getIconColorXeAY9LY$uni_release, size.getIconSize(), size.getLabelHorizontalPadding(), size.getLabelIconGap(), c.c(-424706821, new OziButtonKt$OziButtonImpl$2(m3065getTitleColorXeAY9LY$uni_release, size), u11), u11, ((i16 << 6) & 234881024) | ((i16 << 9) & 4186112), 0, 6);
        c3969l = u11;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
