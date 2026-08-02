package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.cell;

import WZ.e;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.FrameLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.databinding.ItemSuggestionsCellBinding;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsActionHandlerFactory;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u000f*\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010#\u001a\u00060!j\u0002`\"H\u0014¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010'\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0014028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/cell/SuggestionsCellViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/cell/SuggestionsCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/search/databinding/ItemSuggestionsCellBinding;", "binding", "LWZ/e;", "pageIdModifier", "Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsActionHandlerFactory;", "suggestionsActionHandlerFactory", "<init>", "(Lru/ozon/app/android/search/databinding/ItemSuggestionsCellBinding;LWZ/e;Lru/ozon/app/android/search/widgets/suggestions/ui/common/SuggestionsActionHandlerFactory;)V", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "Landroid/content/Context;", "context", "", "default", "toMarginPx", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Landroid/content/Context;I)I", "item", "", "setBackground", "(Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/cell/SuggestionsCellVO;)V", "", "topCornerRadius", "bottomCornerRadius", "setCornerRadius", "(FF)V", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "action", "LWZ/t;", "getTokenizedEvent", "(Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;)LWZ/t;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/cell/SuggestionsCellVO;Ll20/d;)V", "Lru/ozon/app/android/search/databinding/ItemSuggestionsCellBinding;", "dp16", "I", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/ShapeDrawable;", "shapeBackgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsCellViewHolder extends k<SuggestionsCellVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemSuggestionsCellBinding binding;
    private final int dp16;

    @NotNull
    private final GradientDrawable gradientDrawable;

    @NotNull
    private final LayerDrawable layerDrawable;

    @NotNull
    private final ShapeDrawable shapeBackgroundDrawable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuggestionsCellViewHolder(@NotNull ItemSuggestionsCellBinding binding, @NotNull e pageIdModifier, @NotNull SuggestionsActionHandlerFactory suggestionsActionHandlerFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(pageIdModifier, "pageIdModifier");
        Intrinsics.checkNotNullParameter(suggestionsActionHandlerFactory, "suggestionsActionHandlerFactory");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.dp16 = ResourceExtKt.toPx(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.gradientDrawable = gradientDrawable;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.shapeBackgroundDrawable = shapeDrawable;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, shapeDrawable});
        layerDrawable.setLayerInset(1, 0, 0, 0, 0);
        this.layerDrawable = layerDrawable;
        this.actionHandler = suggestionsActionHandlerFactory.createActionHandler(this, pageIdModifier, new SuggestionsCellViewHolder$actionHandler$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t getTokenizedEvent(AtomAction.SendAnalytics action) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        SuggestionsCellVO boundData = getBoundData();
        if (boundData == null || (trackingInfo = action.getTrackingInfo()) == null) {
            return null;
        }
        return TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundData.getId()), null, 2, null);
    }

    private final void setBackground(SuggestionsCellVO item) {
        StyleParser styleParser = StyleParser.INSTANCE;
        int parseColor = styleParser.parseColor(getContext(), item.getIslandColor(), UniColors.LAYER_FLOOR_1.getResId());
        Integer parseColor2 = styleParser.parseColor(getContext(), item.getBackgroundColor());
        this.shapeBackgroundDrawable.getPaint().setColor(parseColor);
        this.gradientDrawable.setColor(parseColor2 != null ? parseColor2.intValue() : 0);
        CornerRadius cornerRadius = CornerRadius.RADIUS_500;
        setCornerRadius(ResourceExtKt.toPxF(cornerRadius.getPx()), ResourceExtKt.toPxF(cornerRadius.getPx()));
        this.binding.cellView.setBackground(this.layerDrawable);
        this.binding.getConstraintLayout().setBackgroundColor(parseColor2 != null ? parseColor2.intValue() : 0);
    }

    private final void setCornerRadius(float topCornerRadius, float bottomCornerRadius) {
        this.shapeBackgroundDrawable.setShape(new RoundRectShape(new float[]{topCornerRadius, topCornerRadius, topCornerRadius, topCornerRadius, bottomCornerRadius, bottomCornerRadius, bottomCornerRadius, bottomCornerRadius}, null, null));
    }

    private final int toMarginPx(CommonCellSettings.LayoutPadding layoutPadding, Context context, int i11) {
        return layoutPadding != null ? ResourceExtKt.dim(context, layoutPadding.getCellLayoutPadding()) : i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SuggestionsCellVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellDTO cell = item.getCell();
        cell.setTagSupported(true);
        CellView cellView = this.binding.cellView;
        Intrinsics.checkNotNullExpressionValue(cellView, "cellView");
        CellHolderKt.bind(cellView, cell, this.actionHandler);
        int marginPx = toMarginPx(item.getTopMargin(), getContext(), this.dp16);
        int marginPx2 = toMarginPx(item.getBottomMargin(), getContext(), 0);
        this.binding.getConstraintLayout().setPadding(toMarginPx(item.getLeftMargin(), getContext(), this.dp16), marginPx, toMarginPx(item.getRightMargin(), getContext(), this.dp16), marginPx2);
        setBackground(item);
    }
}
