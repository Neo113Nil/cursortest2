package ru.ozon.app.android.messenger.utils;

import B90.C2604f;
import Ql.c;
import android.view.View;
import android.view.Window;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/messenger/utils/KeyboardVisibilityObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/fragment/app/m;", "fragment", "Lkotlin/Function1;", "", "", "onKeyboardVisibilityChanged", "<init>", "(Landroidx/fragment/app/m;Lkotlin/jvm/functions/Function1;)V", "registerListener", "()V", "unregisterListener", "Landroidx/lifecycle/J;", "owner", "onResume", "(Landroidx/lifecycle/J;)V", "onPause", "onDestroy", "Landroidx/fragment/app/m;", "Lkotlin/jvm/functions/Function1;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class KeyboardVisibilityObserver implements DefaultLifecycleObserver {

    @NotNull
    private final ComponentCallbacksC5392m fragment;

    @NotNull
    private final Function1<Boolean, Unit> onKeyboardVisibilityChanged;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/J;", "kotlin.jvm.PlatformType", "lifecycleOwner", "", "invoke", "(Landroidx/lifecycle/J;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.messenger.utils.KeyboardVisibilityObserver$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<J, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(J j11) {
            invoke2(j11);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(J j11) {
            AbstractC5434v lifecycle;
            if (j11 == null || (lifecycle = j11.getLifecycle()) == null) {
                return;
            }
            lifecycle.a(KeyboardVisibilityObserver.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardVisibilityObserver(@NotNull ComponentCallbacksC5392m fragment, @NotNull Function1<? super Boolean, Unit> onKeyboardVisibilityChanged) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(onKeyboardVisibilityChanged, "onKeyboardVisibilityChanged");
        this.fragment = fragment;
        this.onKeyboardVisibilityChanged = onKeyboardVisibilityChanged;
        fragment.getViewLifecycleOwnerLiveData().observe(fragment, new KeyboardVisibilityObserver$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    private final void registerListener() {
        Window window;
        View decorView;
        r activity = this.fragment.getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        C5353y0 n11 = Y.n(decorView);
        if (n11 != null) {
            this.onKeyboardVisibilityChanged.invoke(Boolean.valueOf(n11.f(8).f42129d > 0));
        }
        Y.J(decorView, new C2604f(this));
        decorView.requestApplyInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 registerListener$lambda$0(KeyboardVisibilityObserver keyboardVisibilityObserver, View view, C5353y0 c5353y0) {
        keyboardVisibilityObserver.onKeyboardVisibilityChanged.invoke(Boolean.valueOf(c.a(view, "view", c5353y0, "insets", 8).f42129d > 0));
        return Y.u(view, c5353y0);
    }

    private final void unregisterListener() {
        Window window;
        View decorView;
        r activity = this.fragment.getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        Y.J(decorView, null);
        this.onKeyboardVisibilityChanged.invoke(Boolean.FALSE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        owner.getLifecycle().e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        unregisterListener();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        registerListener();
    }
}
