package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Ec0.b;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityHelper;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"ru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarViewDelegate$observeLifecycleContainer$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "owner", "", "onResume", "(Landroidx/lifecycle/J;)V", "onStart", "onPause", "onDestroy", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchBarViewDelegate$observeLifecycleContainer$1 implements DefaultLifecycleObserver {
    final /* synthetic */ AbstractC5434v $containerLifecycle;
    final /* synthetic */ SearchBarViewDelegate this$0;

    SearchBarViewDelegate$observeLifecycleContainer$1(SearchBarViewDelegate searchBarViewDelegate, AbstractC5434v abstractC5434v) {
        this.this$0 = searchBarViewDelegate;
        this.$containerLifecycle = abstractC5434v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(SearchBarViewDelegate searchBarViewDelegate) {
        StaticSearchBarView staticSearchBarView;
        staticSearchBarView = searchBarViewDelegate.searchBarView;
        staticSearchBarView.getSearchEditText().clearFocus();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(J owner) {
        StaticSearchBarView staticSearchBarView;
        SearchBarViewDelegate$editTextTextWatcher$1 searchBarViewDelegate$editTextTextWatcher$1;
        Handler handler;
        ComposerFragmentController composerFragmentController;
        View view;
        RecyclerView composerRecyclerView;
        SearchBarViewDelegate$scrollListener$1 searchBarViewDelegate$scrollListener$1;
        Intrinsics.checkNotNullParameter(owner, "owner");
        staticSearchBarView = this.this$0.searchBarView;
        AppCompatEditText searchEditText = staticSearchBarView.getSearchEditText();
        searchBarViewDelegate$editTextTextWatcher$1 = this.this$0.editTextTextWatcher;
        searchEditText.removeTextChangedListener(searchBarViewDelegate$editTextTextWatcher$1);
        handler = this.this$0.handler;
        handler.removeCallbacksAndMessages(null);
        this.$containerLifecycle.e(this);
        composerFragmentController = this.this$0.composer;
        ComponentCallbacksC5392m c11 = composerFragmentController.getReferences().getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        searchBarViewDelegate$scrollListener$1 = this.this$0.scrollListener;
        composerRecyclerView.removeOnScrollListener(searchBarViewDelegate$scrollListener$1);
        composerRecyclerView.setOnTouchListener(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(J owner) {
        boolean isDialogSearchFeature;
        StaticSearchBarView staticSearchBarView;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        if (Build.VERSION.SDK_INT >= 30) {
            isDialogSearchFeature = this.this$0.isDialogSearchFeature();
            if (isDialogSearchFeature) {
                staticSearchBarView = this.this$0.searchBarView;
                staticSearchBarView.getSearchEditText().setWindowInsetsAnimationCallback(null);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(J owner) {
        boolean isDialogSearchFeature;
        KeyboardVisibilityHelper keyboardVisibilityHelper;
        ComposerFragmentController composerFragmentController;
        Handler handler;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        this.this$0.setUpKeyboardAnimationCallback();
        if (Build.VERSION.SDK_INT >= 30) {
            isDialogSearchFeature = this.this$0.isDialogSearchFeature();
            if (isDialogSearchFeature) {
                keyboardVisibilityHelper = this.this$0.keyboardVisibilityHelper;
                composerFragmentController = this.this$0.composer;
                if (keyboardVisibilityHelper.isKeyboardVisible(composerFragmentController.getReferences().getContainer().a())) {
                    return;
                }
                handler = this.this$0.handler;
                handler.post(new b(this.this$0, 6));
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(J owner) {
        ComposerFragmentController composerFragmentController;
        View view;
        RecyclerView composerRecyclerView;
        SearchBarViewDelegate$scrollListener$1 searchBarViewDelegate$scrollListener$1;
        View.OnTouchListener onTouchListener;
        Intrinsics.checkNotNullParameter(owner, "owner");
        composerFragmentController = this.this$0.composer;
        ComponentCallbacksC5392m c11 = composerFragmentController.getReferences().getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        SearchBarViewDelegate searchBarViewDelegate = this.this$0;
        searchBarViewDelegate$scrollListener$1 = searchBarViewDelegate.scrollListener;
        composerRecyclerView.addOnScrollListener(searchBarViewDelegate$scrollListener$1);
        onTouchListener = searchBarViewDelegate.touchListener;
        composerRecyclerView.setOnTouchListener(onTouchListener);
    }
}
