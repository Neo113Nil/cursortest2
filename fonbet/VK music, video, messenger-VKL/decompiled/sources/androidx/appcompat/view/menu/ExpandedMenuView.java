package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.f;
import xsna.yyo0;

/* loaded from: classes11.dex */
public final class ExpandedMenuView extends ListView implements f.b, k, AdapterView.OnItemClickListener {
    public static final int[] c = {R.attr.background, R.attr.divider};
    public f b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        yyo0 e = yyo0.e(context, attributeSet, c, R.attr.listViewStyle, 0);
        TypedArray typedArray = e.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(e.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(e.b(1));
        }
        e.f();
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar) {
        this.b = fVar;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean d(h hVar) {
        return this.b.q(hVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        d((h) getAdapter().getItem(i));
    }
}
