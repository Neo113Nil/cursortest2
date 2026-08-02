package ru.ozon.composer.ui.widget;

import B0.A0;
import H00.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f94861a;

    /* renamed from: ru.ozon.composer.ui.widget.a$a, reason: collision with other inner class name */
    public static final class ViewOnAttachStateChangeListenerC1975a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f94862a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f94863b;

        public ViewOnAttachStateChangeListenerC1975a(View view, g gVar) {
            this.f94862a = view;
            this.f94863b = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
        @Override // android.view.View.OnAttachStateChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewAttachedToWindow(@NotNull View view) {
            IllegalStateException illegalStateException;
            this.f94862a.removeOnAttachStateChangeListener(this);
            if (H00.b.a() == b.a.C0214a.a()) {
                return;
            }
            if (view.getLayoutParams().height == -1) {
                g gVar = this.f94863b;
                if (!gVar.isFullScreenViewMapper$composer_recycler_ui_release()) {
                    illegalStateException = new IllegalStateException(A0.b("FullScreen widget created by ", gVar.getClass().getName(), ". Use wrap_content height, fixed height or mark with IgnoreMatchParentLogging annotation."));
                    if (illegalStateException == null) {
                        H00.b.a().logError(illegalStateException);
                        return;
                    }
                    return;
                }
            }
            illegalStateException = null;
            if (illegalStateException == null) {
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NotNull View view) {
        }
    }

    public a(@NotNull n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> widgetStore) {
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        this.f94861a = widgetStore;
    }

    private static void a(View view, g gVar) {
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1975a(view, gVar));
        } else if (H00.b.a() != b.a.C0214a.a()) {
            IllegalStateException illegalStateException = (view.getLayoutParams().height != -1 || gVar.isFullScreenViewMapper$composer_recycler_ui_release()) ? null : new IllegalStateException(A0.b("FullScreen widget created by ", gVar.getClass().getName(), ". Use wrap_content height, fixed height or mark with IgnoreMatchParentLogging annotation."));
            if (illegalStateException != null) {
                H00.b.a().logError(illegalStateException);
            }
        }
    }

    private final k<l20.c> d(l10.i iVar, ViewGroup viewGroup, int i11) {
        View createView;
        InterfaceC8046a<?, ? extends l20.c> viewMapper = this.f94861a.getViewMapper(i11);
        View view = null;
        if (!(viewMapper instanceof g)) {
            viewMapper = null;
        }
        g gVar = (g) viewMapper;
        if (gVar == null) {
            return null;
        }
        U4.a.b();
        Object context = viewGroup.getContext();
        fk0.d dVar = context instanceof fk0.d ? (fk0.d) context : null;
        fk0.c prefetchViewPool = dVar != null ? dVar.getPrefetchViewPool() : null;
        if (prefetchViewPool != null) {
            synchronized (prefetchViewPool) {
                view = (View) prefetchViewPool.b(Integer.valueOf(i11));
            }
        }
        if (view != null) {
            a(view, gVar);
            return gVar.createHolder(iVar, view);
        }
        U4.a.b();
        Integer layout = gVar.getLayout();
        if (layout != null) {
            createView = LayoutInflater.from(viewGroup.getContext()).inflate(layout.intValue(), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(createView, "inflate(...)");
        } else {
            createView = gVar.createView(viewGroup);
            if (createView == null) {
                throw new IllegalStateException("View is not defined for Widget ".concat(gVar.getClass().getSimpleName()));
            }
        }
        a(createView, gVar);
        return gVar.createHolder(iVar, createView);
    }

    public final void b(@NotNull l10.i container, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        InterfaceC8046a<?, ? extends l20.c> viewMapper = this.f94861a.getViewMapper(viewItem.j());
        if (!(viewMapper instanceof g)) {
            viewMapper = null;
        }
        g gVar = (g) viewMapper;
        if (gVar != null) {
            gVar.constructLayout(container, viewItem);
        }
    }

    public final void c(@NotNull i container, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        InterfaceC8046a<?, ? extends l20.c> viewMapper = this.f94861a.getViewMapper(viewItem.j());
        if (!(viewMapper instanceof g)) {
            viewMapper = null;
        }
        g gVar = (g) viewMapper;
        if (gVar != null) {
            gVar.constructLayout(container.a(), viewItem);
        }
    }

    public final k e(int i11, @NotNull l10.i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return d(container, container.e0(), i11);
    }

    public final k<l20.c> f(@NotNull i container, int i11) {
        Intrinsics.checkNotNullParameter(container, "container");
        return d(container.a(), container.b(), i11);
    }

    public final Object g(@NotNull l oldItem, @NotNull l newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        try {
            InterfaceC8046a<?, ? extends l20.c> viewMapper = this.f94861a.getViewMapper(oldItem.j());
            if (!(viewMapper instanceof g)) {
                viewMapper = null;
            }
            g gVar = (g) viewMapper;
            if (gVar != null) {
                return gVar.getPayload(oldItem.d(), newItem.d());
            }
        } catch (ClassCastException unused) {
        }
        return null;
    }
}
