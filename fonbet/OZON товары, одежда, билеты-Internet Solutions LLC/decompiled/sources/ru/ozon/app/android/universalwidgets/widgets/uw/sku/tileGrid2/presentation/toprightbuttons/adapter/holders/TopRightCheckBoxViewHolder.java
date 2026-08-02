package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders;

import Al.ViewOnClickListenerC2437a;
import BC.a;
import Sc.InterfaceC3999a;
import android.view.View;
import android.widget.ImageView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.common.SelectedProcessor;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.toprightbuttons.mapper.TopRightButtonsCheckBoxMapperKt;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.toprightbuttons.TopRightButtonCheckBox;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000  2\u00060\u0001j\u0002`\u0002:\u0001 J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J)\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u00030\nj\u0006\u0012\u0002\b\u0003`\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightCheckBoxViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "", "onAttach", "()V", "onDetach", "onRecycle", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/toprightbuttons/TopRightButtonCheckBox;", "model", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "bind", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/toprightbuttons/TopRightButtonCheckBox;Lru/ozon/composer/ui/widget/k;)V", "Landroid/widget/ImageView;", "view", "Landroid/widget/ImageView;", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "selectedProcessor", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroid/view/View;", "tileRootView", "Landroid/view/View;", "currentModel", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/toprightbuttons/TopRightButtonCheckBox;", "Lkotlin/Function1;", "clickListener", "Lkotlin/jvm/functions/Function1;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TopRightCheckBoxViewHolder extends j {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int LAYOUT_ID = R$layout.top_right_buttons_tile_grid_2_check_box;

    @NotNull
    private final Function1<View, Unit> clickListener;

    @NotNull
    private final ComposerReferences composerReferences;
    private TopRightButtonCheckBox currentModel;

    @NotNull
    private final SelectedProcessor selectedProcessor;
    private View tileRootView;

    @NotNull
    private final ImageView view;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightCheckBoxViewHolder$Companion;", "", "<init>", "()V", "", "LAYOUT_ID", "I", "getLAYOUT_ID", "()I", "", "CHECKBOX_LOCATOR", "Ljava/lang/String;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getLAYOUT_ID() {
            return TopRightCheckBoxViewHolder.LAYOUT_ID;
        }

        private Companion() {
        }
    }

    public final void bind(@NotNull TopRightButtonCheckBox model, @NotNull k<?> widgetViewHolder) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        this.currentModel = model;
        this.tileRootView = widgetViewHolder.itemView;
        if (TopRightButtonsCheckBoxMapperKt.extractSku(model) == null) {
            ViewExtKt.gone(this.view);
            return;
        }
        ViewExtKt.show(this.view);
        this.view.setSelected(model.isSelected());
        this.view.setOnClickListener(new a(this.clickListener, 8));
        View view = this.tileRootView;
        if (view != null) {
            view.setOnClickListener(new ViewOnClickListenerC2437a(this.clickListener, 4));
        }
        this.view.setContentDescription("checkbox " + model.isSelected());
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        this.selectedProcessor.startProcessing(new TopRightCheckBoxViewHolder$onAttach$1(this));
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        this.selectedProcessor.stopProcessing();
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.view.setOnClickListener(null);
        View view = this.tileRootView;
        if (view != null) {
            view.setOnClickListener(null);
        }
        this.tileRootView = null;
    }
}
