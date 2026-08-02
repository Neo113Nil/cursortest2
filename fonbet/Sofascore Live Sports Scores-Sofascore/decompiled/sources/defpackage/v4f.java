package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v4f extends erf {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ PreferenceFragmentCompat d;

    public v4f(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.d = preferenceFragmentCompat;
    }

    public final boolean f(RecyclerView recyclerView, View view) {
        u childViewHolder = recyclerView.getChildViewHolder(view);
        if (!(childViewHolder instanceof c5f) || !((c5f) childViewHolder).f) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        u childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
        return (childViewHolder2 instanceof c5f) && ((c5f) childViewHolder2).e;
    }

    @Override // defpackage.erf
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, qrf qrfVar) {
        if (f(recyclerView, view)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.erf
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, qrf qrfVar) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (f(recyclerView, childAt)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.a.setBounds(0, height, width, this.b + height);
                this.a.draw(canvas);
            }
        }
    }
}
