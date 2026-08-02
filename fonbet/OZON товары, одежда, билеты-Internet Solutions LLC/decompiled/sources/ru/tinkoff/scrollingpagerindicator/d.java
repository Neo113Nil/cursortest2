package ru.tinkoff.scrollingpagerindicator;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes4.dex */
public final class d implements ScrollingPagerIndicator.b<RecyclerView> {

    /* renamed from: a, reason: collision with root package name */
    private ScrollingPagerIndicator f98003a;

    /* renamed from: b, reason: collision with root package name */
    private RecyclerView f98004b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayoutManager f98005c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView.g<?> f98006d;

    /* renamed from: e, reason: collision with root package name */
    private RecyclerView.t f98007e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.i f98008f;

    /* renamed from: g, reason: collision with root package name */
    private int f98009g;

    /* renamed from: h, reason: collision with root package name */
    private int f98010h;

    static boolean c(d dVar) {
        return dVar.e() != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e() {
        RecyclerView.C findContainingViewHolder;
        for (int i11 = 0; i11 < this.f98004b.getChildCount(); i11++) {
            View childAt = this.f98004b.getChildAt(i11);
            float x11 = childAt.getX();
            int measuredWidth = childAt.getMeasuredWidth();
            float measuredWidth2 = (this.f98004b.getMeasuredWidth() - g()) / 2.0f;
            float measuredWidth3 = ((this.f98004b.getMeasuredWidth() - g()) / 2.0f) + g();
            if (this.f98005c.getOrientation() == 1) {
                x11 = childAt.getY();
                measuredWidth = childAt.getMeasuredHeight();
                measuredWidth2 = (this.f98004b.getMeasuredHeight() - f()) / 2.0f;
                measuredWidth3 = h();
            }
            if (x11 >= measuredWidth2 && x11 + measuredWidth <= measuredWidth3 && (findContainingViewHolder = this.f98004b.findContainingViewHolder(childAt)) != null && findContainingViewHolder.getAdapterPosition() != -1) {
                return findContainingViewHolder.getAdapterPosition();
            }
        }
        return -1;
    }

    private float f() {
        int i11;
        if (this.f98010h == 0) {
            for (int i12 = 0; i12 < this.f98004b.getChildCount(); i12++) {
                View childAt = this.f98004b.getChildAt(i12);
                if (childAt.getMeasuredHeight() != 0) {
                    i11 = childAt.getMeasuredHeight();
                    this.f98010h = i11;
                    break;
                }
            }
        }
        i11 = this.f98010h;
        return i11;
    }

    private float g() {
        int i11;
        if (this.f98009g == 0) {
            for (int i12 = 0; i12 < this.f98004b.getChildCount(); i12++) {
                View childAt = this.f98004b.getChildAt(i12);
                if (childAt.getMeasuredWidth() != 0) {
                    i11 = childAt.getMeasuredWidth();
                    this.f98009g = i11;
                    break;
                }
            }
        }
        i11 = this.f98009g;
        return i11;
    }

    private float h() {
        return ((this.f98004b.getMeasuredHeight() - f()) / 2.0f) + f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int childAdapterPosition;
        int y11;
        int childCount = this.f98005c.getChildCount();
        View view = null;
        if (childCount != 0) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f98005c.getChildAt(i12);
                if (this.f98005c.getOrientation() == 0) {
                    y11 = (int) childAt.getX();
                    if (childAt.getMeasuredWidth() + y11 < i11) {
                        if (childAt.getMeasuredWidth() + y11 < (this.f98004b.getMeasuredWidth() - g()) / 2.0f) {
                        }
                        view = childAt;
                        i11 = y11;
                    }
                } else {
                    y11 = (int) childAt.getY();
                    if (childAt.getMeasuredHeight() + y11 < i11) {
                        if (childAt.getMeasuredHeight() + y11 < h()) {
                        }
                        view = childAt;
                        i11 = y11;
                    }
                }
            }
        }
        if (view == null || (childAdapterPosition = this.f98004b.getChildAdapterPosition(view)) == -1) {
            return;
        }
        int itemCount = this.f98006d.getItemCount();
        if (childAdapterPosition >= itemCount && itemCount != 0) {
            childAdapterPosition %= itemCount;
        }
        float measuredWidth = this.f98005c.getOrientation() == 0 ? (((this.f98004b.getMeasuredWidth() - g()) / 2.0f) - view.getX()) / view.getMeasuredWidth() : (h() - view.getY()) / view.getMeasuredHeight();
        if (measuredWidth < 0.0f || measuredWidth > 1.0f || childAdapterPosition >= itemCount) {
            return;
        }
        this.f98003a.h(childAdapterPosition, measuredWidth);
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.b
    public final void attachToPager(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (!(recyclerView2.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        }
        if (recyclerView2.getAdapter() == null) {
            throw new IllegalStateException("RecyclerView has not Adapter attached");
        }
        this.f98005c = (LinearLayoutManager) recyclerView2.getLayoutManager();
        this.f98004b = recyclerView2;
        this.f98006d = recyclerView2.getAdapter();
        this.f98003a = scrollingPagerIndicator;
        b bVar = new b(this, scrollingPagerIndicator);
        this.f98008f = bVar;
        this.f98006d.registerAdapterDataObserver(bVar);
        scrollingPagerIndicator.m(this.f98006d.getItemCount());
        i();
        c cVar = new c(this, scrollingPagerIndicator);
        this.f98007e = cVar;
        this.f98004b.addOnScrollListener(cVar);
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.b
    public final void detachFromPager() {
        this.f98006d.unregisterAdapterDataObserver(this.f98008f);
        this.f98004b.removeOnScrollListener(this.f98007e);
        this.f98009g = 0;
    }
}
