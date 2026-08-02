package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void d(View view, int i10, int i11, b bVar);

    int e(int i10, int i11, int i12);

    View g(int i10);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int i(int i10, int i11, int i12);

    int l(View view);

    void m(b bVar);

    View n(int i10);

    void o(int i10, View view);

    int p(View view, int i10, int i11);

    boolean q();

    void setFlexLines(List list);
}
