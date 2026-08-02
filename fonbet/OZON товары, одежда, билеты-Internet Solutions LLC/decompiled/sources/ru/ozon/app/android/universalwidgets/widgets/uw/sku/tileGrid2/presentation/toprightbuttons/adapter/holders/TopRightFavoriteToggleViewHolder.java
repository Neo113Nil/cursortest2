package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate.FavoriteToggleProductButtonDelegate;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.decoration.OffsetsItemDecoration;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.utils.TouchDelegateComposite;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.ViewExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B+\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0014\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0014\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u0013¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\"\u0010!\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightFavoriteToggleViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/decoration/OffsetsItemDecoration$OffsetsAwareItem;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButton", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegate;", "favoriteToggleDelegate", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "touchDelegateComposite", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegate;Landroid/view/ViewGroup;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;)V", "", "sizePx", "", "updateDecorationOffset", "(Ljava/lang/Integer;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "buildAnalyticData", "(Lru/ozon/composer/ui/widget/k;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonMolecule;", "item", "bind", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonMolecule;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegate;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "Landroid/graphics/Rect;", "outRect", "Landroid/graphics/Rect;", "getOutRect", "()Landroid/graphics/Rect;", "setOutRect", "(Landroid/graphics/Rect;)V", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopRightFavoriteToggleViewHolder extends j implements OffsetsItemDecoration.OffsetsAwareItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final FavoriteToggleProductButtonDelegate favoriteToggleDelegate;

    @NotNull
    private final IconButtonV3View iconButton;

    @NotNull
    private Rect outRect;

    @NotNull
    private final ViewGroup parent;
    private final TouchDelegateComposite touchDelegateComposite;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightFavoriteToggleViewHolder$Companion;", "", "<init>", "()V", "LAYOUT_ID", "", "create", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightFavoriteToggleViewHolder;", "parent", "Landroid/view/ViewGroup;", "favoriteToggleDelegate", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegate;", "touchDelegateComposite", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TopRightFavoriteToggleViewHolder create(@NotNull ViewGroup parent, @NotNull FavoriteToggleProductButtonDelegate favoriteToggleDelegate, TouchDelegateComposite touchDelegateComposite) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(favoriteToggleDelegate, "favoriteToggleDelegate");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new TopRightFavoriteToggleViewHolder(new IconButtonV3View(context, null, 0, 0, 14, null), favoriteToggleDelegate, parent, touchDelegateComposite, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TopRightFavoriteToggleViewHolder(IconButtonV3View iconButtonV3View, FavoriteToggleProductButtonDelegate favoriteToggleProductButtonDelegate, ViewGroup viewGroup, TouchDelegateComposite touchDelegateComposite, DefaultConstructorMarker defaultConstructorMarker) {
        this(iconButtonV3View, favoriteToggleProductButtonDelegate, viewGroup, touchDelegateComposite);
    }

    private final AnalyticData buildAnalyticData(k<?> widgetViewHolder) {
        return new AnalyticData(widgetViewHolder.getTrackingData(), widgetViewHolder.getViewItem());
    }

    private final void updateDecorationOffset(Integer sizePx) {
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        int topRightBtnsWidth = (tileGrid2Constants.getTopRightBtnsWidth() - (sizePx != null ? sizePx.intValue() : 0)) / 2;
        int i11 = topRightBtnsWidth >= 0 ? topRightBtnsWidth : 0;
        getOutRect().set(i11, tileGrid2Constants.getTopRightBtnsToggleVerticalMargin(), i11, tileGrid2Constants.getTopRightBtnsToggleVerticalMargin());
    }

    public final void bind(@NotNull FavoriteToggleProductButtonMolecule item, @NotNull k<?> widgetViewHolder) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        IconButtonV3DTO.Sizes size = item.getActionButton().getSize();
        updateDecorationOffset(size != null ? Integer.valueOf(ResourceExtKt.toPx(size.getSize())) : null);
        this.favoriteToggleDelegate.bindFavoriteToggleProductButtonOrGone(this.iconButton, item, buildAnalyticData(widgetViewHolder));
        ViewGroup viewGroup = this.parent;
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders.TopRightFavoriteToggleViewHolder$bind$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TouchDelegateComposite touchDelegateComposite = TopRightFavoriteToggleViewHolder.this.touchDelegateComposite;
                    if (touchDelegateComposite != null) {
                        touchDelegateComposite.addDelegate(TopRightFavoriteToggleViewHolder.this.hashCode(), ViewExtensionsKt.getIncreasedTouchDelegate(TopRightFavoriteToggleViewHolder.this.iconButton, TileGrid2Constants.INSTANCE.getDP_4()));
                    }
                }
            });
            return;
        }
        TouchDelegateComposite touchDelegateComposite = this.touchDelegateComposite;
        if (touchDelegateComposite != null) {
            touchDelegateComposite.addDelegate(hashCode(), ViewExtensionsKt.getIncreasedTouchDelegate(this.iconButton, TileGrid2Constants.INSTANCE.getDP_4()));
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.decoration.OffsetsItemDecoration.OffsetsAwareItem
    @NotNull
    public Rect getOutRect() {
        return this.outRect;
    }

    private TopRightFavoriteToggleViewHolder(IconButtonV3View iconButtonV3View, FavoriteToggleProductButtonDelegate favoriteToggleProductButtonDelegate, ViewGroup viewGroup, TouchDelegateComposite touchDelegateComposite) {
        super(iconButtonV3View);
        this.iconButton = iconButtonV3View;
        this.favoriteToggleDelegate = favoriteToggleProductButtonDelegate;
        this.parent = viewGroup;
        this.touchDelegateComposite = touchDelegateComposite;
        this.outRect = new Rect();
    }
}
