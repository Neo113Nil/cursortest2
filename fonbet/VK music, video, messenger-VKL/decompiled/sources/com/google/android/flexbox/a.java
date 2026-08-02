package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FlexLine.java */
/* loaded from: classes12.dex */
public final class a {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public final ArrayList n = new ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - flexItem.u5()) - i);
        this.b = Math.min(this.b, (view.getTop() - flexItem.g0()) - i2);
        this.c = Math.max(this.c, view.getRight() + flexItem.T5() + i3);
        this.d = Math.max(this.d, view.getBottom() + flexItem.L() + i4);
    }
}
