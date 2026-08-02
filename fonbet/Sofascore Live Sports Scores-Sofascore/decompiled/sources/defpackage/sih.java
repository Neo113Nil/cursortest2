package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sih extends RecyclerView.OnScrollListener implements krf {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    @Override // defpackage.krf
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // defpackage.krf
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b = motionEvent.getPointerId(0);
            this.c = (int) (motionEvent.getX() + 0.5f);
            this.d = (int) (motionEvent.getY() + 0.5f);
            return false;
        }
        if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.b);
            if (findPointerIndex >= 0 && this.a != 1) {
                int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                this.e = x - this.c;
                this.f = y - this.d;
            }
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.b = motionEvent.getPointerId(actionIndex);
            this.c = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.d = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        n layoutManager;
        boolean canScrollHorizontally;
        boolean canScrollVertically;
        recyclerView.getClass();
        int i2 = this.a;
        this.a = i;
        if (i2 != 0 || i != 1 || (layoutManager = recyclerView.getLayoutManager()) == null || (canScrollHorizontally = layoutManager.canScrollHorizontally()) == (canScrollVertically = layoutManager.canScrollVertically())) {
            return;
        }
        if ((!canScrollHorizontally || Math.abs(this.f * 1.5d) <= Math.abs(this.e)) && (!canScrollVertically || Math.abs(this.e) <= Math.abs(this.f * 1.5d))) {
            return;
        }
        recyclerView.stopScroll();
    }

    @Override // defpackage.krf
    public final void e(boolean z) {
    }
}
