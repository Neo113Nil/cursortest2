package com.vk.stories.design.view.text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.c5g;
import xsna.e43;
import xsna.f6;
import xsna.izs;
import xsna.n8g;
import xsna.nco0;
import xsna.olo;
import xsna.omo0;
import xsna.pmo0;
import xsna.s3q0;
import xsna.t2l0;

/* compiled from: TextStyleColorPicker.kt */
/* loaded from: classes6.dex */
public final class TextStyleColorPicker extends FrameLayout {
    public final ArrayList b;
    public izs<? super omo0, s3q0> c;
    public int d;
    public final RecyclerView e;

    public TextStyleColorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        List<nco0> list = olo.a;
        this.d = list.get(0).a;
        LayoutInflater.from(context).inflate(R.layout.view_text_color_picker, this);
        arrayList.add(new omo0(new nco0(0, false, null), false, true));
        List<nco0> list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            arrayList2.add(new omo0((nco0) obj, i == 0, false));
            i = i2;
        }
        arrayList.addAll(arrayList2);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.color_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new pmo0(this.b, new f6(8, this, recyclerView)));
        this.e = recyclerView;
    }

    public final void a(int i, t2l0 t2l0Var) {
        Pair pair;
        this.d = i;
        double d = 0.5d;
        ArrayList arrayList = this.b;
        if (t2l0Var == null || !t2l0Var.a) {
            Integer valueOf = t2l0Var != null ? Integer.valueOf(t2l0Var.b) : null;
            Iterator it = arrayList.iterator();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                omo0 omo0Var = (omo0) next;
                if (omo0Var.c && valueOf != null) {
                    omo0Var.a = new nco0(valueOf.intValue(), n8g.f(valueOf.intValue()) >= d, null);
                    RecyclerView.Adapter adapter = this.e.getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemChanged(i4);
                    }
                }
                if (omo0Var.b) {
                    i2 = i4;
                }
                omo0Var.b = false;
                if (omo0Var.a.a == i && !omo0Var.c) {
                    omo0Var.b = true;
                    i3 = i4;
                }
                i4 = i5;
                d = 0.5d;
            }
            pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            Iterator it2 = arrayList.iterator();
            int i6 = 0;
            int i7 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    e43.t();
                    throw null;
                }
                omo0 omo0Var2 = (omo0) next2;
                if (omo0Var2.b) {
                    i6 = i7;
                }
                omo0Var2.b = false;
                if (omo0Var2.c) {
                    omo0Var2.a = new nco0(i, n8g.f(i) >= 0.5d, null);
                    omo0Var2.b = true;
                }
                i7 = i8;
            }
            pair = new Pair(Integer.valueOf(i6), 0);
        }
        b(((Number) pair.d()).intValue(), ((Number) pair.g()).intValue(), false);
    }

    public final void b(int i, int i2, boolean z) {
        izs<? super omo0, s3q0> izsVar;
        RecyclerView recyclerView = this.e;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i);
        }
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyItemChanged(i2);
        }
        ArrayList arrayList = this.b;
        this.d = ((omo0) arrayList.get(i2)).a.a;
        if (!z || (izsVar = this.c) == null) {
            return;
        }
        izsVar.invoke(arrayList.get(i2));
    }

    public final int getCurrentColor() {
        return this.d;
    }

    public final izs<omo0, s3q0> getOnSelectedColor() {
        return this.c;
    }

    public final void setCurrentColor(int i) {
        this.d = i;
    }

    public final void setOnSelectedColor(izs<? super omo0, s3q0> izsVar) {
        this.c = izsVar;
    }
}
