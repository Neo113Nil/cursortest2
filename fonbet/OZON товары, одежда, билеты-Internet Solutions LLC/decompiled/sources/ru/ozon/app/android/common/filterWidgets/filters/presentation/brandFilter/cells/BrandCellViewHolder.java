package ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.cells;

import B3.D;
import W10.c;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.CustomRefreshHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.cells.BrandCellVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.filterWidgets.databinding.BrandFilterCellItemBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u000eJ3\u0010(\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010$\u001a\u00060\"j\u0002`#2\u000e\u0010'\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\f0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/BrandFilterCellItemBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "customRefreshHandler", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/BrandFilterCellItemBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;)V", "", "setWidgetBackgroundColor", "()V", "setCellsBackgroundColor", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO$LayoutModel;", "layoutModel", "Landroid/view/View;", "child", "updateChildParameters", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO$LayoutModel;Landroid/view/View;)V", "setSellBgRadius", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO$LayoutModel;)V", "Landroid/graphics/drawable/GradientDrawable;", "initCellBg", "()Landroid/graphics/drawable/GradientDrawable;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO;Ll20/d;)V", "onRecycle", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/BrandFilterCellItemBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "dp16", "I", "cellBg", "Landroid/graphics/drawable/GradientDrawable;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandCellViewHolder extends k<BrandCellVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BrandFilterCellItemBinding binding;

    @NotNull
    private final GradientDrawable cellBg;

    @NotNull
    private final CustomRefreshHandler customRefreshHandler;
    private final int dp16;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BrandCellViewHolder(@NotNull BrandFilterCellItemBinding binding, @NotNull ComposerReferences refs, @NotNull CustomRefreshHandler customRefreshHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        SingleAtom constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.customRefreshHandler = customRefreshHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.dp16 = ResourceExtKt.toPx(16);
        this.cellBg = initCellBg();
    }

    private final GradientDrawable initCellBg() {
        return D.b(0);
    }

    private final void setCellsBackgroundColor() {
        GradientDrawable gradientDrawable = this.cellBg;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.bgSecondary));
    }

    private final void setSellBgRadius(BrandCellVO.LayoutModel layoutModel) {
        this.cellBg.setCornerRadii(new float[]{layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius()});
    }

    private final void setWidgetBackgroundColor() {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, UniColors.LAYER_FLOOR_1.getToken());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            SingleAtom brandCell = this.binding.brandCell;
            Intrinsics.checkNotNullExpressionValue(brandCell, "brandCell");
            ViewExtKt.setBackgroundTint(brandCell, intValue);
        }
    }

    private final void updateChildParameters(BrandCellVO.LayoutModel layoutModel, View child) {
        child.setPadding(0, layoutModel.getPaddingTop(), 0, layoutModel.getPaddingBottom());
        child.setBackground(this.cellBg);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = this.dp16;
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        child.setLayoutParams(marginLayoutParams);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.binding.brandCell.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BrandCellVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SingleAtom singleAtom = this.binding.brandCell;
        CustomRefreshHandler.bind$default(this.customRefreshHandler, item.getOriginalUrl(), Long.valueOf(item.getId()), this.actionHandler, null, null, 24, null);
        SingleAtom.bind$default(singleAtom, item.getBrand(), false, 2, null);
        singleAtom.setOnAction(this.customRefreshHandler);
        setWidgetBackgroundColor();
        setCellsBackgroundColor();
        View view = (View) C7714v.L(ViewGroupExtKt.children(singleAtom));
        if (view == null) {
            ViewExtKt.gone(singleAtom);
        } else {
            updateChildParameters(item.getLayoutModel(), view);
            setSellBgRadius(item.getLayoutModel());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BrandCellVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((BrandCellViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
