package ru.ozon.app.android.product.labelList.presentation.vo;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.labelList.presentation.vo.LabelListVO;
import ru.ozon.app.android.storefront.data.tiles.labellist.LabelListDTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO;", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "toVO", "(Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO;)Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem;", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO;", "toLabelItemVO", "(Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO$LabelItem;)Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO;", "Lru/ozon/uni/core/UniColors;", "LABEL_TEXT_COLOR_DEFAULT", "Lru/ozon/uni/core/UniColors;", "getLABEL_TEXT_COLOR_DEFAULT", "()Lru/ozon/uni/core/UniColors;", "Lru/ozon/uni/core/UniTextStyles;", "LABEL_TEXT_TYPOGRAPHY_DEFAULT", "Lru/ozon/uni/core/UniTextStyles;", "getLABEL_TEXT_TYPOGRAPHY_DEFAULT", "()Lru/ozon/uni/core/UniTextStyles;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LabelListMapperKt {

    @NotNull
    private static final UniColors LABEL_TEXT_COLOR_DEFAULT = UniColors.TEXT_PRIMARY;

    @NotNull
    private static final UniTextStyles LABEL_TEXT_TYPOGRAPHY_DEFAULT = UniTextStyles.BODY_CONTROL_300_X_SMALL;

    @NotNull
    public static final UniTextStyles getLABEL_TEXT_TYPOGRAPHY_DEFAULT() {
        return LABEL_TEXT_TYPOGRAPHY_DEFAULT;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LabelListVO.LabelItemVO toLabelItemVO(LabelListDTO.LabelItem labelItem) {
        int valueFromIconName;
        if (!(labelItem instanceof LabelListDTO.LabelItem.Icon)) {
            if (!(labelItem instanceof LabelListDTO.LabelItem.Text)) {
                throw new o();
            }
            LabelListDTO.LabelItem.Text text = (LabelListDTO.LabelItem.Text) labelItem;
            OzonSpannableString ozonSpannableString = new OzonSpannableString(text.getText());
            String textColor = text.getTextColor();
            if (textColor == null) {
                textColor = LABEL_TEXT_COLOR_DEFAULT.getToken();
            }
            String typographyToken = text.getTypographyToken();
            if (typographyToken == null) {
                typographyToken = LABEL_TEXT_TYPOGRAPHY_DEFAULT.getToken();
            }
            Integer leftPadding = text.getLeftPadding();
            return new LabelListVO.LabelItemVO.Text(ozonSpannableString, textColor, typographyToken, leftPadding != null ? UiExtKt.toPx(leftPadding.intValue()) : 0);
        }
        LabelListDTO.LabelItem.Icon icon = (LabelListDTO.LabelItem.Icon) labelItem;
        CommonAtomIconDTO icon2 = icon.getIcon();
        LabelListDTO.LabelItem.Icon.IconSize iconSize = icon.getIconSize();
        if (iconSize != null) {
            if (iconSize == LabelListDTO.LabelItem.Icon.IconSize.SIZE_DEFAULT) {
                iconSize = null;
            }
            if (iconSize != null) {
                valueFromIconName = UiExtKt.toPx(iconSize.getValue());
                Integer leftPadding2 = icon.getLeftPadding();
                return new LabelListVO.LabelItemVO.Icon(icon2, valueFromIconName, leftPadding2 != null ? UiExtKt.toPx(leftPadding2.intValue()) : 0);
            }
        }
        valueFromIconName = IconDefaultSize.INSTANCE.getValueFromIconName(icon.getIcon().getIcon());
        Integer leftPadding22 = icon.getLeftPadding();
        return new LabelListVO.LabelItemVO.Icon(icon2, valueFromIconName, leftPadding22 != null ? UiExtKt.toPx(leftPadding22.intValue()) : 0);
    }

    @NotNull
    public static final LabelListVO toVO(@NotNull LabelListDTO labelListDTO) {
        Integer bottom;
        Integer top;
        Intrinsics.checkNotNullParameter(labelListDTO, "<this>");
        List<LabelListDTO.LabelItem> items = labelListDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toLabelItemVO((LabelListDTO.LabelItem) it.next()));
        }
        LabelListDTO.VerticalIndents verticalIndents = labelListDTO.getVerticalIndents();
        int i11 = 0;
        int px = (verticalIndents == null || (top = verticalIndents.getTop()) == null) ? 0 : UiExtKt.toPx(top.intValue());
        LabelListDTO.VerticalIndents verticalIndents2 = labelListDTO.getVerticalIndents();
        if (verticalIndents2 != null && (bottom = verticalIndents2.getBottom()) != null) {
            i11 = UiExtKt.toPx(bottom.intValue());
        }
        return new LabelListVO(arrayList, px, i11, labelListDTO.getTestInfo());
    }
}
