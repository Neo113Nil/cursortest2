package com.tonicartos.superslim;

import android.view.View;
import com.tonicartos.superslim.LayoutManager;

/* compiled from: SectionData.java */
/* loaded from: classes14.dex */
public final class d {
    public final int a;
    public final boolean b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final LayoutManager.b l;

    public d(LayoutManager layoutManager, View view) {
        int paddingStart = layoutManager.getPaddingStart();
        int paddingEnd = layoutManager.getPaddingEnd();
        LayoutManager.b bVar = (LayoutManager.b) view.getLayoutParams();
        this.l = bVar;
        if (bVar.f) {
            int decoratedMeasuredWidth = layoutManager.getDecoratedMeasuredWidth(view);
            this.f = decoratedMeasuredWidth;
            int decoratedMeasuredHeight = layoutManager.getDecoratedMeasuredHeight(view);
            this.g = decoratedMeasuredHeight;
            if (!bVar.k() || bVar.l()) {
                this.c = decoratedMeasuredHeight;
            } else {
                this.c = 0;
            }
            if (!bVar.j) {
                this.j = bVar.i;
            } else if ((bVar.g & 2) == 0 || bVar.l()) {
                this.j = 0;
            } else {
                this.j = decoratedMeasuredWidth;
            }
            if (!bVar.k) {
                this.k = bVar.h;
            } else if ((bVar.g & 4) == 0 || bVar.l()) {
                this.k = 0;
            } else {
                this.k = decoratedMeasuredWidth;
            }
        } else {
            this.c = 0;
            this.g = 0;
            this.f = 0;
            this.j = bVar.i;
            this.k = bVar.h;
        }
        this.h = this.k + paddingEnd;
        this.i = this.j + paddingStart;
        this.b = bVar.f;
        this.a = bVar.i();
        this.d = bVar.l;
        this.e = bVar.m;
    }
}
