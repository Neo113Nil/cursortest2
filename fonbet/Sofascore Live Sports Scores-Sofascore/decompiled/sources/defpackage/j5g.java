package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j5g extends ViewGroup {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final gp5 d;
    public int e;

    public j5g(Context context) {
        super(context);
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new gp5(1);
        setClipChildren(false);
        l5g l5gVar = new l5g(context);
        addView(l5gVar);
        arrayList.add(l5gVar);
        arrayList2.add(l5gVar);
        this.e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final l5g a(k5g k5gVar) {
        gp5 gp5Var = this.d;
        LinkedHashMap linkedHashMap = gp5Var.a;
        LinkedHashMap linkedHashMap2 = gp5Var.a;
        LinkedHashMap linkedHashMap3 = gp5Var.b;
        l5g l5gVar = (l5g) linkedHashMap.get(k5gVar);
        if (l5gVar != null) {
            return l5gVar;
        }
        l5g l5gVar2 = (l5g) o13.C(this.c);
        if (l5gVar2 == null) {
            int i = this.e;
            ArrayList arrayList = this.b;
            if (i > b.i(arrayList)) {
                l5gVar2 = new l5g(getContext());
                addView(l5gVar2);
                arrayList.add(l5gVar2);
            } else {
                l5gVar2 = (l5g) arrayList.get(this.e);
                k5g k5gVar2 = (k5g) linkedHashMap3.get(l5gVar2);
                if (k5gVar2 != null) {
                    k5gVar2.z0();
                    l5g l5gVar3 = (l5g) linkedHashMap2.get(k5gVar2);
                    if (l5gVar3 != null) {
                    }
                    linkedHashMap2.remove(k5gVar2);
                    l5gVar2.c();
                }
            }
            int i2 = this.e;
            if (i2 < this.a - 1) {
                this.e = i2 + 1;
            } else {
                this.e = 0;
            }
        }
        linkedHashMap2.put(k5gVar, l5gVar2);
        linkedHashMap3.put(l5gVar2, k5gVar);
        return l5gVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
