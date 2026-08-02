package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.gson.internal.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarKeyboardManager;", "", "<init>", "()V", "Landroidx/fragment/app/m;", "fragment", "", "addInsetsListener", "(Landroidx/fragment/app/m;)V", "removeInsetsListener", "", "isKeyboardVisible", "(Landroidx/fragment/app/m;)Z", "Ll10/i;", "container", "setup", "(Ll10/i;)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarKeyboardManager {

    @NotNull
    public static final ShellNavBarKeyboardManager INSTANCE = new ShellNavBarKeyboardManager();

    private ShellNavBarKeyboardManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addInsetsListener(ComponentCallbacksC5392m fragment) {
        View view = fragment.getView();
        if (view == null) {
            return;
        }
        Y.J(view, new e(fragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 addInsetsListener$lambda$0(ComponentCallbacksC5392m componentCallbacksC5392m, View view, C5353y0 windowInsets) {
        Toolbar composerToolbar;
        Window window;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        r activity = componentCallbacksC5392m.getActivity();
        Integer valueOf = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        View view2 = componentCallbacksC5392m.getView();
        int childCount = (view2 == null || (composerToolbar = ComposerViewExtensionKt.composerToolbar(view2)) == null) ? 0 : composerToolbar.getChildCount();
        d f7 = windowInsets.f(7);
        Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
        d f11 = windowInsets.f(15);
        Intrinsics.checkNotNullExpressionValue(f11, "getInsets(...)");
        int i11 = (valueOf != null && valueOf.intValue() == 16) ? f11.f42129d : f7.f42129d;
        int i12 = childCount <= 0 ? f7.f42127b : 0;
        if (view.getPaddingTop() != i12 || view.getPaddingBottom() != i11) {
            view.setPadding(f7.f42126a, i12, f7.f42128c, i11);
        }
        return C5353y0.f42353b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isKeyboardVisible(ComponentCallbacksC5392m fragment) {
        View view = fragment.getView();
        if (view == null) {
            return false;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = view.getRootView().getHeight();
        return ((double) ((height - rect.height()) - iArr[1])) > ((double) height) * 0.15d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeInsetsListener(ComponentCallbacksC5392m fragment) {
        View view = fragment.getView();
        if (view != null) {
            Y.J(view, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarKeyboardManager$setup$layoutListener$1] */
    public final void setup(@NotNull final i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        final ComponentCallbacksC5392m b11 = container.K().b();
        if (b11 == null) {
            return;
        }
        final ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarKeyboardManager$setup$layoutListener$1
            private boolean prevStateIsOpen;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                boolean isKeyboardVisible;
                View view;
                ShellNavBarKeyboardManager shellNavBarKeyboardManager = ShellNavBarKeyboardManager.INSTANCE;
                ComponentCallbacksC5392m b12 = i.this.K().b();
                if (b12 == null) {
                    return;
                }
                isKeyboardVisible = shellNavBarKeyboardManager.isKeyboardVisible(b12);
                if (isKeyboardVisible != this.prevStateIsOpen && (view = b11.getView()) != null) {
                    view.requestApplyInsets();
                }
                this.prevStateIsOpen = isKeyboardVisible;
            }
        };
        b11.getViewLifecycleOwner().getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarKeyboardManager$setup$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                ViewTreeObserver viewTreeObserver;
                Intrinsics.checkNotNullParameter(owner, "owner");
                ShellNavBarKeyboardManager.INSTANCE.addInsetsListener(ComponentCallbacksC5392m.this);
                View view = ComponentCallbacksC5392m.this.getView();
                if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.addOnGlobalLayoutListener(r12);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                ViewTreeObserver viewTreeObserver;
                Intrinsics.checkNotNullParameter(owner, "owner");
                ShellNavBarKeyboardManager.INSTANCE.removeInsetsListener(ComponentCallbacksC5392m.this);
                View view = ComponentCallbacksC5392m.this.getView();
                if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(r12);
            }
        });
    }
}
