package com.vk.im.ui.views.dialog_actions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.c480;
import xsna.d2v0;
import xsna.f1j;
import xsna.f57;
import xsna.g5g;
import xsna.hfr;
import xsna.i5g;
import xsna.izs;
import xsna.j5g;
import xsna.jw5;
import xsna.pn00;
import xsna.rli0;
import xsna.u8m;
import xsna.ulp0;
import xsna.uy;
import xsna.y57;
import xsna.z90;
import xsna.zt;

/* compiled from: DialogActionsListView.kt */
/* loaded from: classes2.dex */
public final class DialogActionsListView extends d2v0 {
    public static final LinkedHashMap j;
    public static final Set<u8m> k;
    public c480 i;

    /* compiled from: DialogActionsListView.kt */
    public final class a implements uy<u8m> {
        public a() {
        }

        @Override // xsna.uy
        public final void a(zt<u8m> ztVar) {
            c480 onActionClickListener = DialogActionsListView.this.getOnActionClickListener();
            if (onActionClickListener != null) {
                onActionClickListener.a(ztVar.a);
            }
        }
    }

    /* compiled from: DialogActionsListView.kt */
    public static final class b {
        public int a = 1;
        public u8m b;
        public izs<? super Context, ? extends Drawable> c;
        public izs<? super Context, ? extends CharSequence> d;
    }

    /* compiled from: Comparisons.kt */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Set<u8m> set = DialogActionsListView.k;
            return jw5.b(Integer.valueOf(j5g.c0(set, ((zt) t).a)), Integer.valueOf(j5g.c0(set, ((zt) t2).a)));
        }
    }

    static {
        f57 f57Var = new f57(18);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f57Var.invoke(linkedHashMap);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).a = 1;
        }
        z90 z90Var = new z90(26);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        z90Var.invoke(linkedHashMap2);
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            ((b) ((Map.Entry) it2.next()).getValue()).a = 2;
        }
        LinkedHashMap n = pn00.n(linkedHashMap, linkedHashMap2);
        j = n;
        k = n.keySet();
    }

    public DialogActionsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setActionClickListener(new a());
    }

    public final c480 getOnActionClickListener() {
        return this.i;
    }

    public final void setDialogActions(List<? extends u8m> list) {
        List<? extends zt<?>> list2;
        hfr m = rli0.m(new ulp0(new i5g(list), new f1j(this, 4)));
        c cVar = new c();
        List B = rli0.B(m);
        g5g.L(B, cVar);
        Iterator it = ((ArrayList) B).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList b2 = y57.b(next);
                while (it.hasNext()) {
                    b2.add(it.next());
                }
                list2 = b2;
            } else {
                list2 = Collections.singletonList(next);
            }
        } else {
            list2 = EmptyList.b;
        }
        setActions(list2);
    }

    public final void setOnActionClickListener(c480 c480Var) {
        this.i = c480Var;
    }
}
