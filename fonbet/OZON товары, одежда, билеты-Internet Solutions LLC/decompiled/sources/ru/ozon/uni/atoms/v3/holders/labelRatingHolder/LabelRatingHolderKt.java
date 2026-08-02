package ru.ozon.uni.atoms.v3.holders.labelRatingHolder;

import android.content.Context;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.labelRating.LabelRatingApi;
import ru.ozon.uni.android.atom.labelRating.LabelRatingView;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.rating.DsRatingHolderKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/android/atom/labelRating/LabelRatingView;", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "rating", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "label", "", "bindCellData", "(Lru/ozon/uni/android/atom/labelRating/LabelRatingView;Lru/ozon/uni/atoms/data/rating/RatingDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;)V", "bindLabel", "(Lru/ozon/uni/android/atom/labelRating/LabelRatingView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;)V", "bindCommonLabel", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LabelRatingHolderKt {
    public static final void bindCellData(@NotNull LabelRatingView labelRatingView, @NotNull RatingDTO rating, CommonAtomLabelDTO commonAtomLabelDTO) {
        Intrinsics.checkNotNullParameter(labelRatingView, "<this>");
        Intrinsics.checkNotNullParameter(rating, "rating");
        DsRatingHolderKt.bind$default(labelRatingView.getMainView(), rating, null, 2, null);
        bindLabel(labelRatingView, commonAtomLabelDTO);
    }

    private static final void bindCommonLabel(LabelRatingView labelRatingView, CommonAtomLabelDTO commonAtomLabelDTO) {
        Integer num;
        labelRatingView.setVisibility(0);
        labelRatingView.setLabelTagSupported(commonAtomLabelDTO.getTagSupported());
        labelRatingView.setLabelText(commonAtomLabelDTO.getText());
        Integer numberOfLines = commonAtomLabelDTO.getNumberOfLines();
        labelRatingView.setLabelNumberOfLines(numberOfLines != null ? numberOfLines.intValue() : 1);
        labelRatingView.setLabelTruncatingMode(commonAtomLabelDTO.getTruncatingMode());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = labelRatingView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, commonAtomLabelDTO.getTextColor());
        if (mapColor != null) {
            LabelRatingApi.DefaultImpls.setLabelColor$default(labelRatingView, a.getColor(labelRatingView.getContext(), mapColor.intValue()), 0.0f, 2, null);
        }
        String icon = commonAtomLabelDTO.getIcon();
        if (icon != null) {
            Context context2 = labelRatingView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            num = TokensExtKt.getIconResByToken(context2, icon);
        } else {
            num = null;
        }
        CommonAtomLabelDTO.IconPosition iconPosition = commonAtomLabelDTO.getIconPosition();
        if (iconPosition == null) {
            iconPosition = CommonAtomLabelDTO.IconPosition.END;
        }
        AddonSide iconPosition2 = TitleSubtitleCellHolderKt.getIconPosition(iconPosition);
        Context context3 = labelRatingView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        labelRatingView.setLabelIcon(num, iconPosition2, styleParser.mapColor(context3, commonAtomLabelDTO.getIconTintColor()));
        SmartLabel addonView = labelRatingView.getAddonView();
        TestInfo testInfo = commonAtomLabelDTO.getTestInfo();
        addonView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    public static final void bindLabel(@NotNull LabelRatingView labelRatingView, CommonAtomLabelDTO commonAtomLabelDTO) {
        Intrinsics.checkNotNullParameter(labelRatingView, "<this>");
        if (commonAtomLabelDTO == null) {
            labelRatingView.setVisibility(8);
        } else {
            labelRatingView.setVisibility(0);
            bindCommonLabel(labelRatingView, commonAtomLabelDTO);
        }
    }
}
