package com.vk.photo.editor.ivm.filter;

import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import com.vk.photo.editor.ivm.filter.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.j5g;
import xsna.mwx;
import xsna.sh3;
import xsna.utk0;
import xsna.z9;

/* compiled from: FilterReducer.kt */
/* loaded from: classes4.dex */
public final class b extends z9 {
    public static c h(c cVar, ArrayList arrayList, FilterMessage.Source source, boolean z) {
        ArrayList arrayList2;
        if (z) {
            arrayList2 = arrayList;
        } else {
            List<FilterUiModel> list = cVar.b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (((FilterUiModel) obj).d) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(((FilterUiModel) it.next()).a);
            }
            HashSet M0 = j5g.M0(arrayList4);
            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                FilterUiModel filterUiModel = (FilterUiModel) it2.next();
                if (M0.contains(filterUiModel.a)) {
                    filterUiModel = FilterUiModel.a(filterUiModel, null, true, 503);
                }
                arrayList5.add(filterUiModel);
            }
            arrayList2 = arrayList5;
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((FilterUiModel) obj2).d) {
                arrayList6.add(obj2);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!((FilterUiModel) next).h) {
                arrayList7.add(next);
            }
        }
        return c.a(cVar, null, arrayList2, !arrayList7.isEmpty(), 0, false, source, 89);
    }

    @Override // xsna.z9
    public final void d(mwx mwxVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        a.c cVar;
        Object value5;
        a.d dVar;
        a aVar = (a) mwxVar;
        utk0 utk0Var = (utk0) this.a;
        if (aVar instanceof a.d) {
            do {
                value5 = utk0Var.getValue();
                dVar = (a.d) aVar;
            } while (!utk0Var.compareAndSet(value5, h((c) value5, dVar.a, dVar.b, dVar.c)));
            return;
        }
        if (aVar instanceof a.c) {
            do {
                value4 = utk0Var.getValue();
                cVar = (a.c) aVar;
            } while (!utk0Var.compareAndSet(value4, c.a((c) value4, null, null, false, cVar.a, false, cVar.b, 87)));
            return;
        }
        if (aVar instanceof a.f) {
            do {
                value3 = utk0Var.getValue();
            } while (!utk0Var.compareAndSet(value3, c.a((c) value3, ((a.f) aVar).a, null, false, 0, false, FilterMessage.Source.Synthetic, 94)));
            return;
        }
        if (aVar instanceof a.b) {
            g(new sh3(16, this, (a.b) aVar));
        } else if (aVar instanceof a.C1468a) {
            do {
                value2 = utk0Var.getValue();
            } while (!utk0Var.compareAndSet(value2, c.a((c) value2, null, null, false, 0, false, null, 63)));
        } else {
            if (!(aVar instanceof a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value = utk0Var.getValue();
            } while (!utk0Var.compareAndSet(value, c.a((c) value, null, null, false, 0, ((a.e) aVar).a, null, 111)));
        }
    }
}
