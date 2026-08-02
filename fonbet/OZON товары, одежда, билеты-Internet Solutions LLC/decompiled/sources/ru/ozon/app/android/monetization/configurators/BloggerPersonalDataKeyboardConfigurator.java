package ru.ozon.app.android.monetization.configurators;

import Ql.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.monetization.configurators.BloggerPersonalDataKeyboardConfigurator;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/monetization/configurators/BloggerPersonalDataKeyboardConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "Landroid/view/View;", "getFragmentView", "()Landroid/view/View;", "fragmentView", "InsetsListener", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BloggerPersonalDataKeyboardConfigurator extends ComposerScreenConfig.PageConfigurator {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/monetization/configurators/BloggerPersonalDataKeyboardConfigurator$InsetsListener;", "Landroidx/core/view/D;", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "view", "Landroidx/core/view/y0;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/y0;)Landroidx/core/view/y0;", "Landroid/view/ViewGroup;", "composerContainer", "Landroid/view/ViewGroup;", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/LinearLayout;", "composerBottomContainer", "Landroid/widget/LinearLayout;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    static final class InsetsListener implements D {

        @NotNull
        private final LinearLayout composerBottomContainer;

        @NotNull
        private final ViewGroup composerContainer;

        @NotNull
        private final RecyclerView composerRecyclerView;

        public InsetsListener(@NotNull View rootView) {
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.composerContainer = ComposerViewExtensionKt.composerContainer(rootView);
            this.composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(rootView);
            this.composerBottomContainer = ComposerViewExtensionKt.composerBottomContainer(rootView);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (r7 != (r5 != null ? r5.bottomMargin : 0)) goto L33;
         */
        @Override // androidx.core.view.D
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C5353y0 onApplyWindowInsets(@NotNull View view, @NotNull C5353y0 insets) {
            d a11 = c.a(view, "view", insets, "insets", 8);
            Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
            d f7 = insets.f(2);
            Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
            ViewGroup viewGroup = this.composerContainer;
            viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.monetization.configurators.BloggerPersonalDataKeyboardConfigurator$InsetsListener$onApplyWindowInsets$lambda$2$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    RecyclerView recyclerView;
                    LinearLayout linearLayout;
                    view2.removeOnLayoutChangeListener(this);
                    recyclerView = BloggerPersonalDataKeyboardConfigurator.InsetsListener.this.composerRecyclerView;
                    linearLayout = BloggerPersonalDataKeyboardConfigurator.InsetsListener.this.composerBottomContainer;
                    recyclerView.scrollBy(0, linearLayout.getHeight());
                }
            });
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i11 = marginLayoutParams.topMargin;
                int i12 = marginLayoutParams.rightMargin;
                int i13 = marginLayoutParams.bottomMargin;
                int i14 = a11.f42129d - f7.f42129d;
                if (i14 < 0) {
                    i14 = 0;
                }
                marginLayoutParams.bottomMargin = i14;
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i11 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i12 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
                viewGroup.setLayoutParams(marginLayoutParams);
            }
            C5353y0 u11 = Y.u(view, insets);
            Intrinsics.checkNotNullExpressionValue(u11, "onApplyWindowInsets(...)");
            return u11;
        }
    }

    private final View getFragmentView() {
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 != null) {
            return c11.getView();
        }
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        View fragmentView = getFragmentView();
        if (fragmentView != null) {
            Y.J(fragmentView.getRootView(), new InsetsListener(fragmentView));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        View fragmentView = getFragmentView();
        if (fragmentView != null) {
            Y.J(fragmentView.getRootView(), null);
            ViewExtKt.hideKeyboard(fragmentView);
        }
    }
}
