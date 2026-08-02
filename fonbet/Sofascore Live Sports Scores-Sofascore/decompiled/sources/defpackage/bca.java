package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.u;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bca {
    public static final aca b = new aca(0);
    public static final aca c = new aca(1);
    public int a = -1;

    public static int e(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static int n(int i, int i2) {
        int i3 = i2 | i;
        return (i << 16) | (i2 << 8) | i3;
    }

    public boolean a(RecyclerView recyclerView, u uVar, u uVar2) {
        return true;
    }

    public u b(u uVar, List list, int i, int i2) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int width = uVar.itemView.getWidth() + i;
        int height = uVar.itemView.getHeight() + i2;
        int left2 = i - uVar.itemView.getLeft();
        int top2 = i2 - uVar.itemView.getTop();
        int size = list.size();
        u uVar2 = null;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            u uVar3 = (u) list.get(i4);
            if (left2 > 0 && (right = uVar3.itemView.getRight() - width) < 0 && uVar3.itemView.getRight() > uVar.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                uVar2 = uVar3;
                i3 = abs4;
            }
            if (left2 < 0 && (left = uVar3.itemView.getLeft() - i) > 0 && uVar3.itemView.getLeft() < uVar.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                uVar2 = uVar3;
                i3 = abs3;
            }
            if (top2 < 0 && (top = uVar3.itemView.getTop() - i2) > 0 && uVar3.itemView.getTop() < uVar.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                uVar2 = uVar3;
                i3 = abs2;
            }
            if (top2 > 0 && (bottom = uVar3.itemView.getBottom() - height) < 0 && uVar3.itemView.getBottom() > uVar.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                uVar2 = uVar3;
                i3 = abs;
            }
        }
        return uVar2;
    }

    public void c(RecyclerView recyclerView, u uVar) {
        View view = uVar.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = bsk.a;
            view.setElevation(floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public int d(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (3158064 & i6) >> 2;
        }
        return i3 | i5;
    }

    public long f(RecyclerView recyclerView, int i, float f, float f2) {
        m itemAnimator = recyclerView.getItemAnimator();
        return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.e : itemAnimator.d;
    }

    public int g() {
        return 0;
    }

    public float h(u uVar) {
        return 0.5f;
    }

    public abstract int i(RecyclerView recyclerView, u uVar);

    public float j(u uVar) {
        return 0.5f;
    }

    public int k(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        int i4 = this.a;
        if (i4 == -1) {
            i4 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.a = i4;
        }
        int interpolation = (int) (b.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * i4)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public boolean l() {
        return true;
    }

    public boolean m() {
        return !(this instanceof ea3);
    }

    public void o(Canvas canvas, RecyclerView recyclerView, u uVar, float f, float f2, int i, boolean z) {
        View view = uVar.itemView;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = bsk.a;
            Float valueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = bsk.a;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public void p(Canvas canvas, RecyclerView recyclerView, u uVar, float f, float f2, int i, boolean z) {
        View view = uVar.itemView;
    }

    public abstract boolean q(RecyclerView recyclerView, u uVar, u uVar2);

    /* JADX WARN: Multi-variable type inference failed */
    public void r(RecyclerView recyclerView, u uVar, int i, u uVar2, int i2, int i3, int i4) {
        n layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof dca) {
            ((dca) layoutManager).prepareForDrop(uVar.itemView, uVar2.itemView, i3, i4);
            return;
        }
        if (layoutManager.canScrollHorizontally()) {
            if (layoutManager.getDecoratedLeft(uVar2.itemView) <= recyclerView.getPaddingLeft()) {
                recyclerView.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedRight(uVar2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.scrollToPosition(i2);
            }
        }
        if (layoutManager.canScrollVertically()) {
            if (layoutManager.getDecoratedTop(uVar2.itemView) <= recyclerView.getPaddingTop()) {
                recyclerView.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedBottom(uVar2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.scrollToPosition(i2);
            }
        }
    }

    public abstract void t(u uVar, int i);

    public void s(u uVar, int i) {
    }
}
