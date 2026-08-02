package ru.ozon.app.android.commonwidgets.widgets.annotation.presentation;

import android.content.Context;
import androidx.core.content.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.commonwidgets.widgets.annotation.data.AnnotationDTO;
import ru.ozon.app.android.commonwidgets.widgets.annotation.presentation.AnnotationVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002¨\u0006\n"}, d2 = {"toVO", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/data/AnnotationDTO;", "stateId", "", "context", "Landroid/content/Context;", "toAtomButton", "Lru/ozon/uni/atoms/data/deprecated/Button;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/data/AnnotationDTO$Button;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnnotationVOKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationVO.Style.values().length];
            try {
                iArr[AnnotationVO.Style.STYLE_TYPE_NEGATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationVO.Style.STYLE_TYPE_POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Button toAtomButton(AnnotationDTO.Button button) {
        return new Button(button.getTitle(), null, Button.Style.BORDERLESS_SMALL, button.getAction(), null, null, null, 114, null);
    }

    @NotNull
    public static final AnnotationVO toVO(@NotNull AnnotationDTO annotationDTO, @NotNull String stateId, @NotNull Context context) {
        AnnotationVO.Style style;
        int i11;
        int i12;
        String str;
        List list;
        Intrinsics.checkNotNullParameter(annotationDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        Intrinsics.checkNotNullParameter(context, "context");
        AnnotationVO.Style[] values = AnnotationVO.Style.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                style = null;
                break;
            }
            style = values[i13];
            if (h.D(style.name(), annotationDTO.getStyle(), true)) {
                break;
            }
            i13++;
        }
        if (style == null) {
            style = AnnotationVO.Style.STYLE_TYPE_DEFAULT;
        }
        AnnotationVO.Style style2 = style;
        int i14 = WhenMappings.$EnumSwitchMapping$0[style2.ordinal()];
        if (i14 == 1) {
            i11 = R$drawable.ic_danger_black;
            i12 = R$color.text_negative;
        } else if (i14 != 2) {
            i11 = R$drawable.ic_bell;
            i12 = R$color.text_secondary;
        } else {
            i11 = R$drawable.ic_bell;
            i12 = R$color.text_action;
        }
        int i15 = i11;
        int i16 = i12;
        String bgColor = annotationDTO.getBgColor();
        if (bgColor != null) {
            str = bgColor.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        String token = Intrinsics.d(str, StyleParser.OzColor.OZ_COLOR_WHITE_2.getValue()) ? UniColors.BG_PRIMARY.getToken() : annotationDTO.getBgColor();
        long hashCode = stateId.hashCode();
        OzonSpannableString text = annotationDTO.getText();
        int color = a.getColor(context, R$color.text_action);
        String icon = annotationDTO.getIcon();
        List<AnnotationDTO.Button> actionButtons = annotationDTO.getActionButtons();
        if (actionButtons != null) {
            List<AnnotationDTO.Button> list2 = actionButtons;
            list = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                list.add(toAtomButton((AnnotationDTO.Button) it.next()));
            }
        } else {
            list = K.f71697a;
        }
        List list3 = list;
        boolean isFullWidth = annotationDTO.isFullWidth();
        Map<String, TokenizedTrackingInfo> trackingInfo = annotationDTO.getTrackingInfo();
        return new AnnotationVO(hashCode, text, color, style2, icon, i15, isFullWidth, token, i16, list3, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }
}
