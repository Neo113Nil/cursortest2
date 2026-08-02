package ru.ozon.uni.android.ds.compose.component.icon;

import A0.h;
import B1.InterfaceC2547p;
import K1.T;
import S0.InterfaceC3967k;
import V1.r;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.J0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.components.icon.FoundationIconKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001ae\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/icon/DsIconStyle;", "style", "Landroidx/compose/ui/e;", "modifier", "", "text", "Lq1/b;", "icon", "backgroundImage", "", "paranja", "hasBorder", "Ll1/J0;", "shape", "", "DsIcon", "(Lru/ozon/uni/android/ds/compose/component/icon/DsIconStyle;Landroidx/compose/ui/e;Ljava/lang/String;Lq1/b;Lq1/b;ZZLl1/J0;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsIconKt {
    public static final void DsIcon(@NotNull DsIconStyle style, e eVar, String str, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, boolean z11, boolean z12, J0 j02, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(style, "style");
        interfaceC3967k.o(99577085);
        e eVar2 = (i12 & 2) != 0 ? e.f40358c0 : eVar;
        String str2 = (i12 & 4) != 0 ? null : str;
        AbstractC8972b abstractC8972b3 = (i12 & 8) != 0 ? null : abstractC8972b;
        AbstractC8972b abstractC8972b4 = (i12 & 16) != 0 ? null : abstractC8972b2;
        boolean z13 = false;
        boolean z14 = (i12 & 32) != 0 ? false : z11;
        boolean z15 = (i12 & 64) != 0 ? false : z12;
        J0 e11 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? h.e() : j02;
        float shapeSize = e11 != null ? style.getShapeSize() : style.getContentSize();
        if (str2 != null && abstractC8972b3 == null) {
            z13 = true;
        }
        e j11 = a0.j(eVar2, shapeSize);
        T textStyle = style.getTextStyle();
        if (textStyle == null) {
            textStyle = T.f15012d;
        }
        long backgroundColor = style.getBackgroundColor();
        AbstractC7799Q backgroundBrush = style.getBackgroundBrush();
        C7807Z textColor = z13 ? style.getTextColor() : style.getIconColor();
        long w11 = textColor != null ? textColor.w() : C7807Z.f72259m;
        String str3 = str2;
        AbstractC7799Q iconGradientBrush = style.getIconGradientBrush();
        long layerOverlayParanja = UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getLayerOverlayParanja();
        AbstractC7799Q borderBrush = style.getBorderBrush();
        float shapeSize2 = style.getShapeSize();
        float contentSize = style.getContentSize();
        float borderWidth = style.getBorderWidth();
        float textPadding = style.getTextPadding();
        long j12 = w11;
        e.a aVar = e.f40358c0;
        InterfaceC2547p backgroundImageFitType = style.getBackgroundImageFitType();
        if (backgroundImageFitType == null) {
            backgroundImageFitType = InterfaceC2547p.a.a();
        }
        int i13 = i11 >> 3;
        FoundationIconKt.m2991FoundationIconom_xur8(j11, z13, abstractC8972b3, C7807Z.m(j12), iconGradientBrush, str3, textStyle, new r(), aVar, aVar, aVar, aVar, abstractC8972b4, e11, z14, layerOverlayParanja, z15, backgroundColor, backgroundBrush, borderBrush, shapeSize2, contentSize, textPadding, borderWidth, backgroundImageFitType, interfaceC3967k, (i13 & 896) | 918552576 | ((i11 << 9) & 458752), (i13 & 57344) | ((i11 >> 6) & 896) | 54 | ((i11 >> 12) & 7168) | (i11 & 3670016), 0, 0);
        interfaceC3967k.k();
    }
}
