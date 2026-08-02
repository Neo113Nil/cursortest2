package com.moloco.sdk.internal;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class B implements A, LifecycleOwner, SavedStateRegistryOwner {
    public static final a c = new a(null);
    public static final int d = 8;
    public static final String e = "ViewLifecycleOwner";
    public final LifecycleRegistry a = new LifecycleRegistry(this);
    public final SavedStateRegistryController b = SavedStateRegistryController.INSTANCE.create(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ B b;
        public final /* synthetic */ View c;

        public b(View view, B b, View view2) {
            this.a = view;
            this.b = b;
            this.c = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            this.b.f(this.c);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    @Override // com.moloco.sdk.internal.A
    public void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, e, "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (Intrinsics.areEqual(ViewTreeSavedStateRegistryOwner.get(rootView), this)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "Removing ViewTreeSavedStateRegistryOwner", null, false, 12, null);
            ViewTreeSavedStateRegistryOwner.set(rootView, null);
        }
        if (e(rootView)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "Removing ViewTreeLifecycleOwner", null, false, 12, null);
            ViewTreeLifecycleOwner.set(rootView, null);
        }
    }

    @Override // com.moloco.sdk.internal.A
    public void c(View view) {
        Object m11180constructorimpl;
        Intrinsics.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView);
        if (e(rootView)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.a.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "lifecycle pause success " + Result.m11187isSuccessimpl(m11180constructorimpl), Result.m11183exceptionOrNullimpl(m11180constructorimpl), false, 8, null);
        }
    }

    @Override // com.moloco.sdk.internal.A
    public void d(View view) {
        Object m11180constructorimpl;
        Intrinsics.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView);
        if (e(rootView)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.a.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m11187isSuccessimpl(m11180constructorimpl)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "lifecycle resume success", null, false, 12, null);
            }
            Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
            if (m11183exceptionOrNullimpl != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, e, "lifecycle resume failure", m11183exceptionOrNullimpl, false, 8, null);
            }
        }
    }

    public final boolean e(View view) {
        return Intrinsics.areEqual(ViewTreeLifecycleOwner.get(view), this);
    }

    public final void f(View view) {
        View rootView = view.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, e, "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (ViewTreeSavedStateRegistryOwner.get(rootView) == null) {
            ViewTreeSavedStateRegistryOwner.set(rootView, this);
            try {
                Result.Companion companion = Result.INSTANCE;
                this.b.performRestore(null);
                Result.m11180constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "ViewTreeSavedStateRegistryOwner is absent, setting custom one", null, false, 12, null);
        }
        if (ViewTreeLifecycleOwner.get(rootView) == null) {
            ViewTreeLifecycleOwner.set(rootView, this);
            this.a.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            this.a.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.a.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "ViewTreeLifecycleOwner is absent, setting custom one", null, false, 12, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.a;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.b.getSavedStateRegistry();
    }

    @Override // com.moloco.sdk.internal.A
    public void a(final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.moloco.sdk.internal.scheduling.d.a(new Function0() { // from class: com.moloco.sdk.internal.B$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return B.a(view, this);
            }
        });
    }

    public static final Unit a(View view, B b2) {
        if (ViewCompat.isAttachedToWindow(view)) {
            b2.f(view);
        } else {
            view.addOnAttachStateChangeListener(new b(view, b2, view));
        }
        return Unit.INSTANCE;
    }
}
