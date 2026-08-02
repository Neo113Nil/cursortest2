package ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.button;

import Cy.b;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$string;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.CategoryMenuViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/button/CategoryMenuButtonOverlayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/button/CategoryMenuButtonVO;", "Ll10/i;", "screenContainer", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/CategoryMenuViewModel;", "viewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/CategoryMenuViewModel;)V", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "sendButtonClickEvent", "(LWZ/t;)V", "item", "bind", "(Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/button/CategoryMenuButtonVO;)V", "onWidgetCreated", "()V", "Ll10/i;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/CategoryMenuViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "destroyObserver", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "horizontalPadding", "I", "verticalPadding", "Lru/ozon/app/android/atoms/atom2/ButtonAtom;", "button", "Lru/ozon/app/android/atoms/atom2/ButtonAtom;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryMenuButtonOverlayViewHolder extends AbstractC6065b<CategoryMenuButtonVO> {

    @NotNull
    private final ButtonAtom button;

    @NotNull
    private DefaultLifecycleObserver destroyObserver;
    private final int horizontalPadding;
    private final View metricView;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final i screenContainer;
    private final int verticalPadding;

    @NotNull
    private final CategoryMenuViewModel viewModel;

    public CategoryMenuButtonOverlayViewHolder(@NotNull i screenContainer, @NotNull ComposerNavigator navigator, @NotNull CategoryMenuViewModel viewModel) {
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.screenContainer = screenContainer;
        this.navigator = navigator;
        this.viewModel = viewModel;
        this.destroyObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.button.CategoryMenuButtonOverlayViewHolder$destroyObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                DefaultLifecycleObserver defaultLifecycleObserver;
                t tokenizedEvent;
                i iVar;
                Intrinsics.checkNotNullParameter(owner, "owner");
                CategoryMenuButtonVO boundData = CategoryMenuButtonOverlayViewHolder.this.getBoundData();
                if (boundData != null && (tokenizedEvent = boundData.getTokenizedEvent()) != null) {
                    iVar = CategoryMenuButtonOverlayViewHolder.this.screenContainer;
                    TokenizedAnalyticsExtensionsKt.processViewEvents$default(iVar.X(), tokenizedEvent, null, 2, null);
                }
                AbstractC5434v lifecycle = CategoryMenuButtonOverlayViewHolder.this.getLifecycle();
                defaultLifecycleObserver = CategoryMenuButtonOverlayViewHolder.this.destroyObserver;
                lifecycle.e(defaultLifecycleObserver);
            }
        };
        Context L11 = screenContainer.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        int dim = ResourceExtKt.dim(L11, CommonCellSettings.LayoutPadding.PADDING_500.getCellLayoutPadding());
        this.horizontalPadding = dim;
        Context L12 = screenContainer.L();
        Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
        int dim2 = ResourceExtKt.dim(L12, CommonCellSettings.LayoutPadding.PADDING_300.getCellLayoutPadding());
        this.verticalPadding = dim2;
        Context L13 = screenContainer.L();
        Intrinsics.checkNotNullExpressionValue(L13, "<get-context>(...)");
        ButtonAtom buttonAtom = new ButtonAtom(L13, null, 0, 6, null);
        buttonAtom.setId(R$id.selectCategoryBtn);
        buttonAtom.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        buttonAtom.setPadding(dim, dim2, dim, dim2);
        this.button = buttonAtom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(CategoryMenuButtonOverlayViewHolder categoryMenuButtonOverlayViewHolder, CategoryMenuButtonVO categoryMenuButtonVO, View view) {
        categoryMenuButtonOverlayViewHolder.sendButtonClickEvent(categoryMenuButtonVO.getTokenizedEvent());
        categoryMenuButtonOverlayViewHolder.navigator.popBackStack();
        String deeplink = categoryMenuButtonOverlayViewHolder.viewModel.getDeeplink();
        if (deeplink != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(categoryMenuButtonOverlayViewHolder.navigator, deeplink, null, 2, null);
        }
    }

    private final void sendButtonClickEvent(t tokenizedEvent) {
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.screenContainer.X(), tokenizedEvent, null, 2, null);
        }
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        getLifecycle().a(this.destroyObserver);
        String str = null;
        Button.Style style = null;
        this.button.bind(new Button(StringProvider.getString(R$string.search_select_android), str, style, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, null, null, 14, null), null, null, null, 54, null));
        ComposerViewExtensionKt.composerBottomContainer(this.screenContainer.Y()).addView(this.button);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CategoryMenuButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.button.setOnClickListener(new b(3, this, item));
    }
}
