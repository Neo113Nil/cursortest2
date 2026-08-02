package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class l4 extends erf {
    public final vqf a;
    public final int b;
    public final joa c;
    public boolean d;
    public boolean e;
    public boolean f;

    public l4(vqf vqfVar, int i, RecyclerView recyclerView) {
        vqfVar.getClass();
        this.a = vqfVar;
        this.b = i;
        this.c = ypa.a(ysa.c, new j4(0, this, recyclerView));
        j(recyclerView);
        recyclerView.addOnItemTouchListener(new k4(this));
    }

    public abstract void f(Object obj);

    public abstract krk g(Context context);

    public final krk h() {
        return (krk) this.c.getValue();
    }

    public int i() {
        return 0;
    }

    public final void j(RecyclerView recyclerView) {
        int i = i();
        Context context = h().getRoot().getContext();
        context.getClass();
        int s = ao2.s(i, context);
        h().getRoot().measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth() - (s * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        h().getRoot().layout(recyclerView.getLeft() + s, 0, recyclerView.getRight() - s, h().getRoot().getMeasuredHeight());
    }

    @Override // defpackage.erf
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        canvas.getClass();
        recyclerView.getClass();
        qrfVar.getClass();
        super.onDrawOver(canvas, recyclerView, qrfVar);
        if (this.e) {
            return;
        }
        View view = null;
        for (int i = 1; i < 4; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                u childViewHolder = recyclerView.getChildViewHolder(childAt);
                if (view == null && childViewHolder.getItemViewType() == this.b) {
                    view = childAt;
                }
            }
        }
        View childAt2 = recyclerView.getChildAt(0);
        if (childAt2 == null) {
            return;
        }
        Object f = this.a.f(recyclerView.getChildAdapterPosition(childAt2));
        this.f = f != null;
        if (f != null) {
            f(f);
            j(recyclerView);
            int i2 = i();
            Context context = h().getRoot().getContext();
            context.getClass();
            float s = ao2.s(i2, context);
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (view != null) {
                int bottom = h().getRoot().getBottom();
                f2 = (view.getTop() <= bottom ? Integer.valueOf(view.getTop() - bottom) : Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).floatValue();
            }
            int save = canvas.save();
            canvas.translate(s, f2);
            try {
                h().getRoot().draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }
}
