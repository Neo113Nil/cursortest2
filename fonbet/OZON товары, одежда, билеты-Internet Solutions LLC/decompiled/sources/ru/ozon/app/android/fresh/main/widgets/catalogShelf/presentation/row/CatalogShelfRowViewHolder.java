package ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row;

import W10.c;
import WZ.t;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.content.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.databinding.LayoutCatalogShelfRowBinding;
import ru.ozon.app.android.fresh.main.utils.RoundedViewCorners;
import ru.ozon.app.android.fresh.navigation.CatalogTabsPartViewHolder;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ#\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowViewHolder;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsPartViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowVO;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "catalogTabsSharedViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;)V", "", "applyTopCorners", "()V", "applyBottomCorners", "applyFullCorners", "clearCorners", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "Lru/ozon/app/android/fresh/main/databinding/LayoutCatalogShelfRowBinding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/LayoutCatalogShelfRowBinding;", "", "topPadding", "I", "bottomPadding", "", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfItemView;", "views", "Ljava/util/List;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/graphics/drawable/GradientDrawable;", "topBackgroundLayer", "Landroid/graphics/drawable/GradientDrawable;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogShelfRowViewHolder extends CatalogTabsPartViewHolder<CatalogShelfRowVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final LayoutCatalogShelfRowBinding binding;
    private final int bottomPadding;

    @NotNull
    private final CatalogTabsSharedViewModel catalogTabsSharedViewModel;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final GradientDrawable topBackgroundLayer;
    private final int topPadding;

    @NotNull
    private final List<CatalogShelfItemView> views;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogShelfRowViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull CatalogTabsSharedViewModel catalogTabsSharedViewModel) {
        super(containerView, catalogTabsSharedViewModel);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(catalogTabsSharedViewModel, "catalogTabsSharedViewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.catalogTabsSharedViewModel = catalogTabsSharedViewModel;
        LayoutCatalogShelfRowBinding bind = LayoutCatalogShelfRowBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.topPadding = ResourceExtKt.toPx(12);
        this.bottomPadding = ResourceExtKt.toPx(12);
        this.views = C7714v.b0(bind.firstCategoryItem, bind.secondCategoryItem, bind.thirdCategoryItem);
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(a.getColor(getContext(), UniColors.LAYER_FLOOR_1.getResId()));
        this.topBackgroundLayer = gradientDrawable;
    }

    private final void applyBottomCorners() {
        ViewExtKt.updatePadding$default(this.containerView, 0, 0, 0, this.bottomPadding, 7, null);
        this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getBottomCorners());
    }

    private final void applyFullCorners() {
        ViewExtKt.updatePadding$default(this.containerView, 0, this.topPadding, 0, this.bottomPadding, 5, null);
        this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getFullCorners());
    }

    private final void applyTopCorners() {
        ViewExtKt.updatePadding$default(this.containerView, 0, this.topPadding, 0, 0, 13, null);
        this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getTopCorners());
    }

    private final void clearCorners() {
        this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getNoneCorners());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CatalogShelfRowVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        clearCorners();
        this.binding.getConstraintLayout().setTag(item.getCatalogueTabsConnectionTag());
        this.binding.shelfRowLl.setBackground(new LayerDrawable(new GradientDrawable[]{this.topBackgroundLayer}));
        if (item.getTopCorners()) {
            applyTopCorners();
        }
        if (item.getBottomCorners()) {
            applyBottomCorners();
        }
        if (item.getBottomCorners() && item.getTopCorners()) {
            applyFullCorners();
        }
        Iterator<T> it = this.views.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            ((CatalogShelfItemView) it.next()).bindOrGone((CatalogShelfItemVO) C7714v.Q(i11, item.getList()), this.actionHandler);
            i11++;
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CatalogShelfRowVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CatalogShelfRowViewHolder) item, trackingData, viewedPond);
        Iterator<CatalogShelfItemVO> it = item.getList().iterator();
        while (it.hasNext()) {
            t tokenizedEvent = it.next().getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }
}
