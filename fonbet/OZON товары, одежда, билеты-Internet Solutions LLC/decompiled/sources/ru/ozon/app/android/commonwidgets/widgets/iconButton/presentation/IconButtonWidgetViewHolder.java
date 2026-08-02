package ru.ozon.app.android.commonwidgets.widgets.iconButton.presentation;

import Vg.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.core.DynamicOnScrollColors;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00120\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/navBar/v2/NavBarRepaintable;", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetView;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "alpha", "", "updateColorsByScroll", "(F)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetVO;Ll20/d;)V", "", "hasAlphaChangingFloor", "onNavbarConfigured", "(ZF)V", "onFloorAlphaChanged", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetView;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IconButtonWidgetViewHolder extends k<IconButtonWidgetVO> implements NavBarRepaintable {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final IconButtonWidgetView containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonWidgetViewHolder(@NotNull IconButtonWidgetView containerView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor inhibitor) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.containerView = containerView;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).customActionHandlers(new IconButtonWidgetViewHolder$actionHandler$1(this)).buildHandler();
    }

    private final void updateColorsByScroll(float alpha) {
        IconButtonWidgetVO boundData = getBoundData();
        if (boundData != null ? boundData.getHasDynamicColors() : false) {
            IconButtonWidgetVO boundData2 = getBoundData();
            DynamicOnScrollColors dynamicOnScrollColors = boundData2 != null ? boundData2.getDynamicOnScrollColors() : null;
            this.containerView.updateColorsByScroll(alpha, dynamicOnScrollColors != null ? dynamicOnScrollColors.getIconTintColorExpanded() : null, dynamicOnScrollColors != null ? dynamicOnScrollColors.getIconTintColorCollapsed() : null, dynamicOnScrollColors != null ? dynamicOnScrollColors.getBackgroundColorExpanded() : null, dynamicOnScrollColors != null ? dynamicOnScrollColors.getBackgroundColorCollapsed() : null);
        }
    }

    @Override // ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable
    public void onFloorAlphaChanged(float alpha) {
        updateColorsByScroll(alpha);
    }

    @Override // ru.ozon.app.android.storefront.navBar.v2.NavBarRepaintable
    public void onNavbarConfigured(boolean hasAlphaChangingFloor, float alpha) {
        if (hasAlphaChangingFloor) {
            updateColorsByScroll(alpha);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull IconButtonWidgetVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, this.actionHandler);
    }
}
