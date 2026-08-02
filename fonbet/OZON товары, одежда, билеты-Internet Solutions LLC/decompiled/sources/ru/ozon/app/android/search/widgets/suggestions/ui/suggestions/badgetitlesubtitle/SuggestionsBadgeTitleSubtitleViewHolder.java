package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle;

import WZ.e;
import WZ.l;
import WZ.t;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.databinding.ItemSuggestionsBadgeTitleSubtitleCellBinding;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsActionHandlerFactory;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsCommonVO;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsTextVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 32\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00013B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000f0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/search/databinding/ItemSuggestionsBadgeTitleSubtitleCellBinding;", "binding", "LWZ/l;", "tokenizedAnalytics", "LWZ/e;", "pageIdModifier", "Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsActionHandlerFactory;", "suggestionsActionHandlerFactory", "<init>", "(Lru/ozon/app/android/search/databinding/ItemSuggestionsBadgeTitleSubtitleCellBinding;LWZ/l;LWZ/e;Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsActionHandlerFactory;)V", "item", "", "setBackgroundForSelect", "(Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO;)V", "", "topCornerRadius", "bottomCornerRadius", "setCornerRadius", "(FF)V", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "action", "LWZ/t;", "getTokenizedEvent", "(Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;)LWZ/t;", "onViewInVisibleBounds", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleVO;Ll20/d;)V", "Lru/ozon/app/android/search/databinding/ItemSuggestionsBadgeTitleSubtitleCellBinding;", "LWZ/l;", "LWZ/e;", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/ShapeDrawable;", "shapeBackgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsBadgeTitleSubtitleViewHolder extends k<SuggestionsBadgeTitleSubtitleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemSuggestionsBadgeTitleSubtitleCellBinding binding;

    @NotNull
    private final GradientDrawable gradientDrawable;

    @NotNull
    private final LayerDrawable layerDrawable;

    @NotNull
    private final e pageIdModifier;

    @NotNull
    private final ShapeDrawable shapeBackgroundDrawable;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;
    private static final int dp16 = ResourceExtKt.toPx(16);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuggestionsBadgeTitleSubtitleViewHolder(@NotNull ItemSuggestionsBadgeTitleSubtitleCellBinding binding, @NotNull l tokenizedAnalytics, @NotNull e pageIdModifier, @NotNull SuggestionsActionHandlerFactory suggestionsActionHandlerFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(pageIdModifier, "pageIdModifier");
        Intrinsics.checkNotNullParameter(suggestionsActionHandlerFactory, "suggestionsActionHandlerFactory");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.pageIdModifier = pageIdModifier;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.gradientDrawable = gradientDrawable;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.shapeBackgroundDrawable = shapeDrawable;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, shapeDrawable});
        int i11 = dp16;
        layerDrawable.setLayerInset(1, i11, 0, i11, 0);
        this.layerDrawable = layerDrawable;
        this.actionHandler = suggestionsActionHandlerFactory.createActionHandler(this, pageIdModifier, new SuggestionsBadgeTitleSubtitleViewHolder$actionHandler$1(this));
        this.itemView.setOnClickListener(new Go.e(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(SuggestionsBadgeTitleSubtitleViewHolder suggestionsBadgeTitleSubtitleViewHolder, View view) {
        SuggestionsCommonVO common;
        AtomAction action;
        SuggestionsBadgeTitleSubtitleVO boundData = suggestionsBadgeTitleSubtitleViewHolder.getBoundData();
        if (boundData == null || (common = boundData.getCommon()) == null || (action = common.getAction()) == null) {
            return;
        }
        suggestionsBadgeTitleSubtitleViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t getTokenizedEvent(AtomAction.SendAnalytics action) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        SuggestionsBadgeTitleSubtitleVO boundData = getBoundData();
        if (boundData == null || (trackingInfo = action.getTrackingInfo()) == null) {
            return null;
        }
        return TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundData.getId()), null, 2, null);
    }

    private final void setBackgroundForSelect(SuggestionsBadgeTitleSubtitleVO item) {
        StyleParser styleParser = StyleParser.INSTANCE;
        int parseColor = styleParser.parseColor(getContext(), item.getIslandColor(), UniColors.LAYER_FLOOR_1.getResId());
        Integer parseColor2 = styleParser.parseColor(getContext(), item.getBackgroundColor());
        this.shapeBackgroundDrawable.getPaint().setColor(parseColor);
        this.gradientDrawable.setColor(parseColor2 != null ? parseColor2.intValue() : 0);
        setCornerRadius(item.getLayoutModel().getTopCornerRadius(), item.getLayoutModel().getBottomCornerRadius());
        this.itemView.setBackground(this.layerDrawable);
    }

    private final void setCornerRadius(float topCornerRadius, float bottomCornerRadius) {
        this.shapeBackgroundDrawable.setShape(new RoundRectShape(new float[]{topCornerRadius, topCornerRadius, topCornerRadius, topCornerRadius, bottomCornerRadius, bottomCornerRadius, bottomCornerRadius, bottomCornerRadius}, null, null));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        SuggestionsCommonVO common;
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        SuggestionsBadgeTitleSubtitleVO boundData = getBoundData();
        if (boundData == null || (common = boundData.getCommon()) == null || (tokenizedEvent = common.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent, this.pageIdModifier);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SuggestionsBadgeTitleSubtitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ItemSuggestionsBadgeTitleSubtitleCellBinding itemSuggestionsBadgeTitleSubtitleCellBinding = this.binding;
        IconView suggestionIcon = itemSuggestionsBadgeTitleSubtitleCellBinding.suggestionIcon;
        Intrinsics.checkNotNullExpressionValue(suggestionIcon, "suggestionIcon");
        IconHolderKt.bindOrGone$default(suggestionIcon, item.getIcon(), null, 2, null);
        BadgeView badgeView = itemSuggestionsBadgeTitleSubtitleCellBinding.badgeView;
        Intrinsics.checkNotNullExpressionValue(badgeView, "badgeView");
        BadgeHolderKt.bindOrGone$default(badgeView, item.getBadge(), (Function1) null, 2, (Object) null);
        itemSuggestionsBadgeTitleSubtitleCellBinding.suggestionBadgeTitle.setText(item.getTitle().getText());
        AppCompatTextView appCompatTextView = itemSuggestionsBadgeTitleSubtitleCellBinding.suggestionBadgeSubtitle;
        SuggestionsTextVO subtitle = item.getSubtitle();
        appCompatTextView.setText(subtitle != null ? subtitle.getText() : null);
        AppCompatTextView suggestionBadgeSubtitle = itemSuggestionsBadgeTitleSubtitleCellBinding.suggestionBadgeSubtitle;
        Intrinsics.checkNotNullExpressionValue(suggestionBadgeSubtitle, "suggestionBadgeSubtitle");
        SuggestionsTextVO subtitle2 = item.getSubtitle();
        OzonSpannableString text = subtitle2 != null ? subtitle2.getText() : null;
        suggestionBadgeSubtitle.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        View suggestionTitleSeparator = itemSuggestionsBadgeTitleSubtitleCellBinding.suggestionTitleSeparator;
        Intrinsics.checkNotNullExpressionValue(suggestionTitleSeparator, "suggestionTitleSeparator");
        ViewExtKt.showOrGone(suggestionTitleSeparator, Boolean.valueOf(item.getLayoutModel().getHasSeparator()));
        setBackgroundForSelect(item);
    }
}
