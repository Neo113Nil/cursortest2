package ru.ozon.app.android.storefront.widgets.feedback.common.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.databinding.NavbarWidgetNpsBinding;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarBinder;", "", "Landroidx/fragment/app/m;", "fragment", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "<init>", "(Landroidx/fragment/app/m;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/appcompat/widget/Toolbar;)V", "Landroid/view/View;", "getNavBar", "()Landroid/view/View;", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "navbarVO", "bindNavbar", "(Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;)V", "removeViews", "()V", "Lkotlin/jvm/functions/Function1;", "Landroidx/appcompat/widget/Toolbar;", "Lru/ozon/app/android/storefront/databinding/NavbarWidgetNpsBinding;", "binding$delegate", "LSc/j;", "getBinding", "()Lru/ozon/app/android/storefront/databinding/NavbarWidgetNpsBinding;", "binding", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FeedbackNavbarBinder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j binding;
    private final Toolbar toolbar;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackNavbarBinder(ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull Context context, @NotNull Function1<? super AtomAction, Unit> actionHandler, Toolbar toolbar) {
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.toolbar = toolbar;
        this.binding = LazyUtilsKt.unsafeLazy(new FeedbackNavbarBinder$binding$2(this));
        if (componentCallbacksC5392m == null || (lifecycle = componentCallbacksC5392m.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new DefaultLifecycleObserver(context, componentCallbacksC5392m) { // from class: ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarBinder.1
            final /* synthetic */ Context $context;
            final /* synthetic */ ComponentCallbacksC5392m $fragment;
            private final int color;

            {
                this.$context = context;
                this.$fragment = componentCallbacksC5392m;
                this.color = ThemeExtKt.themeColor(context, UniColors.LAYER_FLOOR_1.getResId());
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                StatusBarController statusBarController = StatusBarController.INSTANCE;
                ComponentCallbacksC5392m componentCallbacksC5392m2 = this.$fragment;
                StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
                statusBarController.setStatusBarBackgroundColor(componentCallbacksC5392m2, newState, this.color);
                statusBarController.setStatusBarContentColor(this.$fragment, newState, ThemeExtKt.isDarkThemeActive(this.$context), true);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                StatusBarController.setStatusBarColorByTheme$default(StatusBarController.INSTANCE, this.$fragment, StatusBarController.UpdateReason.Recovery.INSTANCE, 0, 4, null);
                this.$fragment.getLifecycle().e(this);
            }
        });
    }

    private final NavbarWidgetNpsBinding getBinding() {
        return (NavbarWidgetNpsBinding) this.binding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getNavBar() {
        Toolbar toolbar = this.toolbar;
        if (toolbar == null) {
            return null;
        }
        ViewExtKt.show(toolbar);
        View inflate = ViewGroupExtKt.inflate(toolbar, R$layout.navbar_widget_nps);
        toolbar.addView(inflate);
        return inflate;
    }

    public final void bindNavbar(@NotNull FeedbackNavbarVO navbarVO) {
        Intrinsics.checkNotNullParameter(navbarVO, "navbarVO");
        NavbarWidgetNpsBinding binding = getBinding();
        if (binding != null) {
            TextAtomView textAtomView = binding.navbarTitle;
            Intrinsics.f(textAtomView);
            TextAtomHolderKt.bind$default(textAtomView, navbarVO.getTitle(), null, 2, null);
            textAtomView.setLetterSpacing(0.0f);
            SmallIconButtonView navbarBack = binding.navbarBack;
            Intrinsics.checkNotNullExpressionValue(navbarBack, "navbarBack");
            WrappedIconButtonHolderKt.bindOrGone(navbarBack, navbarVO.getBackButton(), this.actionHandler);
            SmallIconButtonView navbarClose = binding.navbarClose;
            Intrinsics.checkNotNullExpressionValue(navbarClose, "navbarClose");
            WrappedIconButtonHolderKt.bindOrGone(navbarClose, navbarVO.getCloseButton(), this.actionHandler);
        }
    }

    public final void removeViews() {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.removeAllViews();
        }
    }
}
