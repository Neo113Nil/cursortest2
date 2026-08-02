package ru.ozon.android.messenger.framework.presentation.chatdetail.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c3.C5739a;
import c3.C5741c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$dimen;

/* loaded from: classes10.dex */
public final class d extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f89953a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f89954b;

    /* renamed from: c, reason: collision with root package name */
    private int f89955c;

    /* renamed from: d, reason: collision with root package name */
    private final int f89956d;

    /* renamed from: e, reason: collision with root package name */
    private ViewPropertyAnimator f89957e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C5741c f89958f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C5739a f89959g;

    public d(@NotNull View child, boolean z11) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f89953a = child;
        this.f89954b = z11;
        this.f89956d = child.getContext().getResources().getDimensionPixelSize(R$dimen.m_scroll_btn_translation_y);
        this.f89958f = new C5741c();
        this.f89959g = new C5739a();
    }

    private static boolean b(RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        RecyclerView.g adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : Integer.MAX_VALUE;
        return itemCount == 0 || findLastVisibleItemPosition == -1 || findLastVisibleItemPosition == itemCount - 1;
    }

    private final void d(View view, long j11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f89957e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f89955c = 1;
        this.f89957e = view.animate().translationY(this.f89956d).alpha(this.f89954b ? 0.0f : 1.0f).setInterpolator(this.f89959g).setDuration(j11).setListener(new c(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i11, int i12) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int i13 = this.f89955c;
        View view = this.f89953a;
        if (i13 == 1 || i12 <= 0) {
            C5741c c5741c = this.f89958f;
            if (i13 == 2 || i12 >= 0) {
                if (i11 == 0 && i12 == 0) {
                    if (b(recyclerView)) {
                        d(view, 0L);
                    } else {
                        ViewPropertyAnimator viewPropertyAnimator = this.f89957e;
                        if (viewPropertyAnimator != null) {
                            viewPropertyAnimator.cancel();
                            view.clearAnimation();
                        }
                        this.f89955c = 2;
                        this.f89957e = view.animate().translationY(0).alpha(1.0f).setInterpolator(c5741c).setDuration(225L).setListener(new c(this));
                    }
                }
            } else if (!b(recyclerView)) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f89957e;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f89955c = 2;
                this.f89957e = view.animate().translationY(0).alpha(1.0f).setInterpolator(c5741c).setDuration(225L).setListener(new c(this));
            }
        } else if (b(recyclerView)) {
            d(view, 175L);
        }
        if (this.f89954b) {
            return;
        }
        s.d(view);
    }
}
