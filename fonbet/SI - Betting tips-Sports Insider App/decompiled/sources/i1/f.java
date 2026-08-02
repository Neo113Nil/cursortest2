package i1;

import android.view.View;
import androidx.customview.widget.h;
import androidx.customview.widget.i;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    public final int f10860a;

    /* renamed from: b, reason: collision with root package name */
    public i f10861b;

    /* renamed from: c, reason: collision with root package name */
    public final aa.c f10862c = new aa.c(20, this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f10863d;

    public f(DrawerLayout drawerLayout, int i5) {
        this.f10863d = drawerLayout;
        this.f10860a = i5;
    }

    @Override // androidx.customview.widget.h
    public final int clampViewPositionHorizontal(View view, int i5, int i10) {
        DrawerLayout drawerLayout = this.f10863d;
        if (drawerLayout.a(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i5, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i5, width));
    }

    @Override // androidx.customview.widget.h
    public final int clampViewPositionVertical(View view, int i5, int i10) {
        return view.getTop();
    }

    @Override // androidx.customview.widget.h
    public final int getViewHorizontalDragRange(View view) {
        if (DrawerLayout.l(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // androidx.customview.widget.h
    public final void onEdgeDragStarted(int i5, int i10) {
        int i11 = i5 & 1;
        DrawerLayout drawerLayout = this.f10863d;
        View d10 = i11 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
        if (d10 == null || drawerLayout.f(d10) != 0) {
            return;
        }
        this.f10861b.b(i10, d10);
    }

    @Override // androidx.customview.widget.h
    public final boolean onEdgeLock(int i5) {
        return false;
    }

    @Override // androidx.customview.widget.h
    public final void onEdgeTouched(int i5, int i10) {
        this.f10863d.postDelayed(this.f10862c, 160L);
    }

    @Override // androidx.customview.widget.h
    public final void onViewCaptured(View view, int i5) {
        ((d) view.getLayoutParams()).f10858c = false;
        int i10 = this.f10860a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f10863d;
        View d10 = drawerLayout.d(i10);
        if (d10 != null) {
            drawerLayout.b(d10, true);
        }
    }

    @Override // androidx.customview.widget.h
    public final void onViewDragStateChanged(int i5) {
        this.f10863d.t(i5, this.f10861b.f1568t);
    }

    @Override // androidx.customview.widget.h
    public final void onViewPositionChanged(View view, int i5, int i10, int i11, int i12) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f10863d;
        float width2 = (drawerLayout.a(3, view) ? i5 + width : drawerLayout.getWidth() - i5) / width;
        drawerLayout.p(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // androidx.customview.widget.h
    public final void onViewReleased(View view, float f6, float f10) {
        int i5;
        int[] iArr = DrawerLayout.F;
        float f11 = ((d) view.getLayoutParams()).f10857b;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f10863d;
        if (drawerLayout.a(3, view)) {
            i5 = (f6 > 0.0f || (f6 == 0.0f && f11 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f6 < 0.0f || (f6 == 0.0f && f11 > 0.5f)) {
                width2 -= width;
            }
            i5 = width2;
        }
        this.f10861b.q(i5, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // androidx.customview.widget.h
    public final boolean tryCaptureView(View view, int i5) {
        if (!DrawerLayout.l(view)) {
            return false;
        }
        int i10 = this.f10860a;
        DrawerLayout drawerLayout = this.f10863d;
        return drawerLayout.a(i10, view) && drawerLayout.f(view) == 0;
    }
}
