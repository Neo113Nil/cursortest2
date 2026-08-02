package ru.ozon.app.android.travel.molecules.extensions;

import Sc.r;
import Wc.a;
import Wc.b;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import xe.C10737n;
import xe.InterfaceC10733l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\t\u001a\u0014\u0010\f\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroidx/lifecycle/J;", "lifecycleOwner", "", "centerInToolbar", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;)V", "awaitNextLayout", "(Landroid/view/View;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "getHeightAfterLayout", "getWidthAfterLayout", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View$OnLayoutChangeListener, ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt$awaitNextLayout$2$listener$1] */
    public static final Object awaitNextLayout(@NotNull final View view, @NotNull d<? super Unit> frame) {
        final C10737n c10737n = new C10737n(1, b.b(frame));
        c10737n.o();
        int i11 = Y.f42258g;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            ?? r12 = new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt$awaitNextLayout$2$listener$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    InterfaceC10733l<Unit> interfaceC10733l = c10737n;
                    r.Companion companion = r.INSTANCE;
                    interfaceC10733l.resumeWith(Unit.f71690a);
                }
            };
            c10737n.q(new ViewExtensionsKt$awaitNextLayout$2$1(view, r12));
            view.addOnLayoutChangeListener(r12);
        } else {
            r.Companion companion = r.INSTANCE;
            c10737n.resumeWith(Unit.f71690a);
        }
        Object n11 = c10737n.n();
        a aVar = a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    public static final void centerInToolbar(@NotNull final View view, @NotNull final ComposerReferences references, @NotNull final J lifecycleOwner) {
        ViewGroup rootView;
        Toolbar composerToolbar;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        int i11 = Y.f42258g;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt$centerInToolbar$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    ViewGroup rootView2;
                    Toolbar composerToolbar2;
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    if (view.getId() == -1) {
                        view.setId(View.generateViewId());
                    }
                    ComponentCallbacksC5392m c11 = references.getContainer().c();
                    if (c11 == null || (rootView2 = ContextExtKt.getRootView(c11)) == null || (composerToolbar2 = ComposerViewExtensionKt.composerToolbar(rootView2)) == null) {
                        return;
                    }
                    View view3 = view;
                    if (view3.equals(composerToolbar2.findViewById(view3.getId()))) {
                        ViewExtensionsKt$centerInToolbar$1$listener$1 viewExtensionsKt$centerInToolbar$1$listener$1 = new ViewExtensionsKt$centerInToolbar$1$listener$1(view);
                        composerToolbar2.addOnLayoutChangeListener(viewExtensionsKt$centerInToolbar$1$listener$1);
                        AbstractC5434v lifecycle = lifecycleOwner.getLifecycle();
                        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
                            composerToolbar2.removeOnLayoutChangeListener(viewExtensionsKt$centerInToolbar$1$listener$1);
                        } else {
                            lifecycle.a(new ViewExtensionsKt$centerInToolbar$lambda$1$$inlined$whenDestroyed$1(lifecycle, composerToolbar2, viewExtensionsKt$centerInToolbar$1$listener$1));
                        }
                    }
                }
            });
            return;
        }
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (composerToolbar = ComposerViewExtensionKt.composerToolbar(rootView)) == null || !view.equals(composerToolbar.findViewById(view.getId()))) {
            return;
        }
        ViewExtensionsKt$centerInToolbar$1$listener$1 viewExtensionsKt$centerInToolbar$1$listener$1 = new ViewExtensionsKt$centerInToolbar$1$listener$1(view);
        composerToolbar.addOnLayoutChangeListener(viewExtensionsKt$centerInToolbar$1$listener$1);
        AbstractC5434v lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            composerToolbar.removeOnLayoutChangeListener(viewExtensionsKt$centerInToolbar$1$listener$1);
        } else {
            lifecycle.a(new ViewExtensionsKt$centerInToolbar$lambda$1$$inlined$whenDestroyed$1(lifecycle, composerToolbar, viewExtensionsKt$centerInToolbar$1$listener$1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnLayoutChangeListener, ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt$getHeightAfterLayout$2$listener$1] */
    public static final Object getHeightAfterLayout(@NotNull final View view, @NotNull d<? super Integer> frame) {
        final C10737n c10737n = new C10737n(1, b.b(frame));
        c10737n.o();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            ?? r12 = new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt$getHeightAfterLayout$2$listener$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldL, int oldT, int oldR, int oldB) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view.removeOnLayoutChangeListener(this);
                    InterfaceC10733l<Integer> interfaceC10733l = c10737n;
                    r.Companion companion = r.INSTANCE;
                    interfaceC10733l.resumeWith(Integer.valueOf(view.getHeight()));
                }
            };
            c10737n.q(new ViewExtensionsKt$getHeightAfterLayout$2$1(view, r12));
            view.addOnLayoutChangeListener(r12);
        } else {
            r.Companion companion = r.INSTANCE;
            c10737n.resumeWith(new Integer(view.getHeight()));
        }
        Object n11 = c10737n.n();
        if (n11 == a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnLayoutChangeListener, ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt$getWidthAfterLayout$2$listener$1] */
    public static final Object getWidthAfterLayout(@NotNull final View view, @NotNull d<? super Integer> frame) {
        final C10737n c10737n = new C10737n(1, b.b(frame));
        c10737n.o();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            ?? r12 = new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt$getWidthAfterLayout$2$listener$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldL, int oldT, int oldR, int oldB) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view.removeOnLayoutChangeListener(this);
                    InterfaceC10733l<Integer> interfaceC10733l = c10737n;
                    r.Companion companion = r.INSTANCE;
                    interfaceC10733l.resumeWith(Integer.valueOf(view.getWidth()));
                }
            };
            c10737n.q(new ViewExtensionsKt$getWidthAfterLayout$2$1(view, r12));
            view.addOnLayoutChangeListener(r12);
        } else {
            r.Companion companion = r.INSTANCE;
            c10737n.resumeWith(new Integer(view.getWidth()));
        }
        Object n11 = c10737n.n();
        if (n11 == a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
