package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.cgc;
import defpackage.efc;
import defpackage.l2a;
import defpackage.uec;
import defpackage.vec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements uec, cgc, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public vec a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        l2a y = l2a.y(R.attr.listViewStyle, 0, context, attributeSet, b);
        TypedArray typedArray = (TypedArray) y.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(y.q(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(y.q(1));
        }
        y.F();
    }

    @Override // defpackage.cgc
    public final void a(vec vecVar) {
        this.a = vecVar;
    }

    @Override // defpackage.uec
    public final boolean c(efc efcVar) {
        return this.a.q(efcVar, null, 0);
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
        c((efc) getAdapter().getItem(i));
    }
}
