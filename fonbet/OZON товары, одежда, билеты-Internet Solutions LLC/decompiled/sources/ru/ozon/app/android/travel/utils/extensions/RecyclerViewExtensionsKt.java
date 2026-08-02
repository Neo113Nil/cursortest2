package ru.ozon.app.android.travel.utils.extensions;

import Sc.r;
import Sc.s;
import Wc.a;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aA\u0010\r\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "", "interceptAlways", "", "addParentTouchesInterceptor", "(Landroidx/recyclerview/widget/RecyclerView;Z)V", "", "targetItemWidth", "Lxe/M;", "scope", "itemsPerYield", "Lkotlin/Function1;", "applyNewHeightCallback", "autoSetHeightFromMaxItem", "(Landroidx/recyclerview/widget/RecyclerView;ILxe/M;ILkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "", "resolveTargetItemWidth", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;Lxe/M;ILkotlin/jvm/functions/Function1;)V", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RecyclerViewExtensionsKt {
    public static final void addParentTouchesInterceptor(@NotNull RecyclerView recyclerView, final boolean z11) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.addOnItemTouchListener(new RecyclerView.y() { // from class: ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt$addParentTouchesInterceptor$1
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                RecyclerView.o layoutManager = rv.getLayoutManager();
                if (!z11 && (layoutManager instanceof LinearLayoutManager)) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                    int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                    if (findLastCompletelyVisibleItemPosition == rv.getChildCount() - 1 && findFirstCompletelyVisibleItemPosition == 0) {
                        return false;
                    }
                }
                int action = e11.getAction();
                if (action == 0 || action == 1 || action == 2) {
                    rv.getParent().requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        });
    }

    public static /* synthetic */ void addParentTouchesInterceptor$default(RecyclerView recyclerView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        addParentTouchesInterceptor(recyclerView, z11);
    }

    public static final void autoSetHeightFromMaxItem(@NotNull final RecyclerView recyclerView, final int i11, @NotNull final M scope, final int i12, @NotNull final Function1<? super Integer, Unit> applyNewHeightCallback) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(applyNewHeightCallback, "applyNewHeightCallback");
        final RecyclerView.g adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        final kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        final K k11 = new K();
        adapter.registerAdapterDataObserver(new RecyclerView.i() { // from class: ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$1
            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$launchUpdate(m11, scope, adapter, i11, recyclerView, i12, k11, applyNewHeightCallback);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeChanged(int positionStart, int itemCount) {
                RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$launchUpdate(m11, scope, adapter, i11, recyclerView, i12, k11, applyNewHeightCallback);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeInserted(int positionStart, int itemCount) {
                RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$launchUpdate(m11, scope, adapter, i11, recyclerView, i12, k11, applyNewHeightCallback);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
                RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$launchUpdate(m11, scope, adapter, i11, recyclerView, i12, k11, applyNewHeightCallback);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeRemoved(int positionStart, int itemCount) {
                RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$launchUpdate(m11, scope, adapter, i11, recyclerView, i12, k11, applyNewHeightCallback);
            }
        });
        autoSetHeightFromMaxItem$launchUpdate(m11, scope, adapter, i11, recyclerView, i12, k11, applyNewHeightCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoSetHeightFromMaxItem$clearStartupListeners(RecyclerView recyclerView, RecyclerView recyclerView2, kotlin.jvm.internal.M<View.OnAttachStateChangeListener> m11, kotlin.jvm.internal.M<View.OnLayoutChangeListener> m12) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        try {
            r.Companion companion = r.INSTANCE;
            onAttachStateChangeListener = m11.f71787a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
        }
        if (onAttachStateChangeListener == null) {
            Intrinsics.n("attachListener");
            throw null;
        }
        recyclerView2.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        Unit unit = Unit.f71690a;
        try {
            Object parent = recyclerView2.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                View.OnLayoutChangeListener onLayoutChangeListener = m12.f71787a;
                if (onLayoutChangeListener == null) {
                    Intrinsics.n("parentLayoutListener");
                    throw null;
                }
                view.removeOnLayoutChangeListener(onLayoutChangeListener);
                Unit unit2 = Unit.f71690a;
            }
        } catch (Throwable th3) {
            r.Companion companion3 = r.INSTANCE;
            s.a(th3);
        }
    }

    public static /* synthetic */ void autoSetHeightFromMaxItem$default(RecyclerView recyclerView, int i11, M m11, int i12, Function1 function1, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 2;
        }
        autoSetHeightFromMaxItem(recyclerView, i11, m11, i12, (Function1<? super Integer, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoSetHeightFromMaxItem$lambda$2(I i11, RecyclerView recyclerView, Function1 function1, M m11, int i12, Function1 function12, RecyclerView recyclerView2, kotlin.jvm.internal.M m12, kotlin.jvm.internal.M m13, View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        if (i15 != i19) {
            autoSetHeightFromMaxItem$tryStart(i11, recyclerView, function1, m11, i12, function12, recyclerView2, m12, m13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, xe.B0] */
    public static final void autoSetHeightFromMaxItem$launchUpdate(kotlin.jvm.internal.M<B0> m11, M m12, RecyclerView.g<?> gVar, int i11, RecyclerView recyclerView, int i12, K k11, Function1<? super Integer, Unit> function1) {
        B0 b02 = m11.f71787a;
        if (b02 != null) {
            b02.j(null);
        }
        m11.f71787a = C10727i.c(m12, null, null, new RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$launchUpdate$1(gVar, i11, recyclerView, i12, k11, function1, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoSetHeightFromMaxItem$tryStart(I i11, RecyclerView recyclerView, Function1<? super View, ? extends Number> function1, M m11, int i12, Function1<? super Integer, Unit> function12, RecyclerView recyclerView2, kotlin.jvm.internal.M<View.OnAttachStateChangeListener> m12, kotlin.jvm.internal.M<View.OnLayoutChangeListener> m13) {
        int intValue;
        if (i11.f71783a) {
            return;
        }
        Object parent = recyclerView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null && (intValue = function1.invoke(view).intValue()) > 0) {
            i11.f71783a = true;
            autoSetHeightFromMaxItem$clearStartupListeners(recyclerView2, recyclerView, m12, m13);
            autoSetHeightFromMaxItem(recyclerView, intValue, m11, i12, function12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object autoSetHeightFromMaxItem$updateHeightFromMaxItem(RecyclerView.g<?> gVar, int i11, RecyclerView recyclerView, int i12, K k11, Function1<? super Integer, Unit> function1, d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(De.s.f6650a, new RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$updateHeightFromMaxItem$2(gVar, i11, recyclerView, i12, k11, function1, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public static /* synthetic */ void autoSetHeightFromMaxItem$default(RecyclerView recyclerView, Function1 function1, M m11, int i11, Function1 function12, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 2;
        }
        autoSetHeightFromMaxItem(recyclerView, (Function1<? super View, ? extends Number>) function1, m11, i11, (Function1<? super Integer, Unit>) function12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [CU.b, T] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.view.View$OnAttachStateChangeListener, ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$3] */
    public static final void autoSetHeightFromMaxItem(@NotNull final RecyclerView recyclerView, @NotNull final Function1<? super View, ? extends Number> resolveTargetItemWidth, @NotNull final M scope, final int i11, @NotNull final Function1<? super Integer, Unit> applyNewHeightCallback) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(resolveTargetItemWidth, "resolveTargetItemWidth");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(applyNewHeightCallback, "applyNewHeightCallback");
        final I i12 = new I();
        final kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        final kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
        ?? r12 = new View.OnLayoutChangeListener() { // from class: CU.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
                kotlin.jvm.internal.M m13 = m11;
                kotlin.jvm.internal.M m14 = m12;
                RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$lambda$2(I.this, recyclerView, resolveTargetItemWidth, scope, i11, applyNewHeightCallback, recyclerView, m13, m14, view, i13, i14, i15, i16, i17, i18, i19, i21);
            }
        };
        final kotlin.jvm.internal.M m13 = m12;
        m13.f71787a = r12;
        ?? r13 = new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                Object parent = RecyclerView.this.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    View.OnLayoutChangeListener onLayoutChangeListener = m13.f71787a;
                    if (onLayoutChangeListener == null) {
                        Intrinsics.n("parentLayoutListener");
                        throw null;
                    }
                    view2.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$tryStart(i12, RecyclerView.this, resolveTargetItemWidth, scope, i11, applyNewHeightCallback, recyclerView, m11, m13);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                Object parent = RecyclerView.this.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    View.OnLayoutChangeListener onLayoutChangeListener = m13.f71787a;
                    if (onLayoutChangeListener != null) {
                        view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                    } else {
                        Intrinsics.n("parentLayoutListener");
                        throw null;
                    }
                }
            }
        };
        kotlin.jvm.internal.M m14 = m11;
        m14.f71787a = r13;
        recyclerView.addOnAttachStateChangeListener(r13);
        if (recyclerView.isAttachedToWindow()) {
            Object parent = recyclerView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                T t2 = m13.f71787a;
                if (t2 == 0) {
                    Intrinsics.n("parentLayoutListener");
                    throw null;
                }
                view.addOnLayoutChangeListener((View.OnLayoutChangeListener) t2);
            }
            autoSetHeightFromMaxItem$tryStart(i12, recyclerView, resolveTargetItemWidth, scope, i11, applyNewHeightCallback, recyclerView, m14, m13);
            m13 = m13;
            m14 = m14;
        }
        B0 b02 = (B0) scope.getCoroutineContext().get(B0.f105374o0);
        if (b02 != null) {
            b02.y(new RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$4(recyclerView, recyclerView, m14, m13));
        }
    }
}
