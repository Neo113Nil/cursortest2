package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.c4;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements m, b0, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f414b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public n f415a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c4 f6 = c4.f(context, attributeSet, f414b, R.attr.listViewStyle, 0);
        TypedArray typedArray = f6.f722b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(f6.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(f6.b(1));
        }
        f6.g();
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean a(p pVar) {
        return this.f415a.performItemAction(pVar, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.b0
    public final void initialize(n nVar) {
        this.f415a = nVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j) {
        a((p) getAdapter().getItem(i5));
    }
}
