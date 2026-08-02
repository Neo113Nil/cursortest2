package com.vk.overlaymenu.utils;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import xsna.izs;
import xsna.s3q0;
import xsna.y8m;

/* compiled from: ObservableArrayList.kt */
/* loaded from: classes4.dex */
public final class ObservableArrayList extends ArrayList<View> {
    private final izs<View, s3q0> onAdded;

    public ObservableArrayList(List list, y8m y8mVar) {
        super(list);
        this.onAdded = y8mVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        View view = (View) obj;
        super.add(i, view);
        s3q0 s3q0Var = s3q0.a;
        this.onAdded.invoke(view);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof View) {
            return super.contains((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof View) {
            return super.indexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof View) {
            return super.lastIndexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View view = (View) obj;
        boolean add = super.add(view);
        if (add) {
            this.onAdded.invoke(view);
        }
        return add;
    }
}
