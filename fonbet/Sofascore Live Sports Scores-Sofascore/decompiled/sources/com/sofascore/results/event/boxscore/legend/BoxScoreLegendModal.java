package com.sofascore.results.event.boxscore.legend;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.event.boxscore.legend.BoxScoreLegendModal;
import defpackage.e22;
import defpackage.joa;
import defpackage.w74;
import defpackage.ypa;
import defpackage.ysa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/event/boxscore/legend/BoxScoreLegendModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "un0", "h22", "g22", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BoxScoreLegendModal extends BaseModalBottomSheetDialog {
    public final joa w;
    public final joa x;
    public final joa y;
    public RecyclerView z;

    public BoxScoreLegendModal() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: f22
            public final /* synthetic */ BoxScoreLegendModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x020d, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.BASKETBALL) == false) goto L113;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0214, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.RUGBY) == false) goto L113;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x021b, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.AMERICAN_FOOTBALL) != false) goto L120;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0222, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.VOLLEYBALL) == false) goto L113;
             */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x01cb  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x01e5  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0283 A[LOOP:2: B:31:0x027d->B:33:0x0283, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x02aa  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x02ae  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
            /* JADX WARN: Type inference failed for: r5v18 */
            /* JADX WARN: Type inference failed for: r5v19, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ArrayList arrayList;
                Object obj;
                Iterable<b0i> iterable;
                Throwable th;
                List<h22> list;
                ?? arrayList2;
                Object obj2;
                Object obj3;
                Object obj4;
                xbb a;
                Iterator it;
                int i2 = i;
                BoxScoreLegendModal boxScoreLegendModal = this.b;
                switch (i2) {
                    case 0:
                        Context requireContext = boxScoreLegendModal.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(8, requireContext));
                    case 1:
                        Bundle requireArguments = boxScoreLegendModal.requireArguments();
                        requireArguments.getClass();
                        ArrayList arrayList3 = (ArrayList) gz8.M(requireArguments, "sections", ArrayList.class);
                        if (arrayList3 != null) {
                            arrayList = new ArrayList();
                            for (Object obj5 : arrayList3) {
                                if (obj5 instanceof h22) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        return arrayList == null ? km5.a : arrayList;
                    default:
                        Context requireContext2 = boxScoreLegendModal.requireContext();
                        requireContext2.getClass();
                        e22 e22Var = new e22(requireContext2);
                        String string = boxScoreLegendModal.requireArguments().getString("section");
                        Iterator it2 = ((List) boxScoreLegendModal.x.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (Intrinsics.c(boxScoreLegendModal.requireContext().getString(((h22) obj).a), string)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        h22 h22Var = (h22) obj;
                        int i3 = 10;
                        if (h22Var == null || (arrayList2 = a.c(h22Var)) == 0) {
                            String string2 = boxScoreLegendModal.requireArguments().getString(SearchResponseKt.SPORT_ENTITY);
                            if (string2 != null) {
                                switch (string2.hashCode()) {
                                    case -2002238939:
                                        if (string2.equals(Sports.ICE_HOCKEY)) {
                                            iterable = gn9.e;
                                            break;
                                        }
                                        break;
                                    case -1721090992:
                                        if (string2.equals(Sports.BASEBALL)) {
                                            Iterator<E> it3 = u71.h.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    obj2 = it3.next();
                                                    if (Intrinsics.c(string, boxScoreLegendModal.requireContext().getString(((u71) obj2).a))) {
                                                    }
                                                } else {
                                                    obj2 = null;
                                                }
                                            }
                                            u71 u71Var = (u71) obj2;
                                            if (u71Var == null) {
                                                u71Var = u71.e;
                                            }
                                            iterable = a.c(u71Var);
                                            break;
                                        }
                                        break;
                                    case -1160328212:
                                        if (string2.equals(Sports.VOLLEYBALL)) {
                                            Iterator<E> it4 = qwk.g.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj3 = it4.next();
                                                    if (Intrinsics.c(string, boxScoreLegendModal.requireContext().getString(((qwk) obj3).a))) {
                                                    }
                                                } else {
                                                    obj3 = null;
                                                }
                                            }
                                            qwk qwkVar = (qwk) obj3;
                                            if (qwkVar == null) {
                                                qwkVar = qwk.e;
                                            }
                                            iterable = a.c(qwkVar);
                                            break;
                                        }
                                        break;
                                    case -83759494:
                                        if (string2.equals(Sports.AMERICAN_FOOTBALL)) {
                                            Iterator<E> it5 = lp.e.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    obj4 = it5.next();
                                                    if (Intrinsics.c(boxScoreLegendModal.requireContext().getString(((lp) obj4).a), string)) {
                                                    }
                                                } else {
                                                    obj4 = null;
                                                }
                                            }
                                            lp lpVar = (lp) obj4;
                                            if (lpVar != null) {
                                                iterable = a.c(lpVar);
                                                break;
                                            }
                                        }
                                        break;
                                    case 1767150:
                                        if (string2.equals(Sports.HANDBALL)) {
                                            iterable = e69.e;
                                            break;
                                        }
                                        break;
                                    case 108869083:
                                        if (string2.equals(Sports.RUGBY)) {
                                            iterable = l9g.d;
                                            break;
                                        }
                                        break;
                                    case 727149765:
                                        if (string2.equals(Sports.BASKETBALL)) {
                                            iterable = up1.d;
                                            break;
                                        }
                                        break;
                                }
                                if (iterable != null) {
                                    th = null;
                                    list = null;
                                    xbb b = a.b();
                                    int i4 = 0;
                                    if (boxScoreLegendModal.requireArguments().getBoolean("hasRating", false)) {
                                        b.add(new b22(new q9k(R.string.sofascore_rating_stat_short), new q9k(R.string.sofascore_rating)));
                                    }
                                    if (list != null) {
                                        for (h22 h22Var2 : list) {
                                            String string3 = boxScoreLegendModal.requireArguments().getString(SearchResponseKt.SPORT_ENTITY);
                                            if (string3 != null) {
                                                switch (string3.hashCode()) {
                                                    case -1160328212:
                                                        break;
                                                    case -83759494:
                                                        break;
                                                    case 108869083:
                                                        break;
                                                    case 727149765:
                                                        break;
                                                }
                                            }
                                            if (list.size() > 1) {
                                                b.add(new c22(h22Var2.a));
                                                RecyclerView recyclerView = boxScoreLegendModal.z;
                                                if (recyclerView == null) {
                                                    Intrinsics.i("recyclerView");
                                                    throw th;
                                                }
                                                recyclerView.setPadding(recyclerView.getPaddingLeft(), i4, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
                                                ArrayList arrayList4 = h22Var2.b;
                                                ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                                                it = arrayList4.iterator();
                                                while (it.hasNext()) {
                                                    g22 g22Var = (g22) it.next();
                                                    arrayList5.add(new b22(g22Var.a, g22Var.b));
                                                }
                                                b.addAll(arrayList5);
                                                i4 = 0;
                                            }
                                            RecyclerView recyclerView2 = boxScoreLegendModal.z;
                                            if (recyclerView2 == null) {
                                                Intrinsics.i("recyclerView");
                                                throw th;
                                            }
                                            recyclerView2.setPadding(recyclerView2.getPaddingLeft(), ((Number) boxScoreLegendModal.w.getValue()).intValue(), recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
                                            ArrayList arrayList42 = h22Var2.b;
                                            ArrayList arrayList52 = new ArrayList(k13.r(arrayList42, 10));
                                            it = arrayList42.iterator();
                                            while (it.hasNext()) {
                                            }
                                            b.addAll(arrayList52);
                                            i4 = 0;
                                        }
                                    }
                                    a = a.a(b);
                                    if (a.isEmpty()) {
                                        e22Var.F(a);
                                    } else {
                                        boxScoreLegendModal.q();
                                    }
                                    return e22Var;
                                }
                                arrayList2 = new ArrayList(k13.r(iterable, 10));
                                for (b0i b0iVar : iterable) {
                                    int g = b0iVar.g();
                                    List<e1> i5 = b0iVar.i();
                                    ArrayList arrayList6 = new ArrayList(k13.r(i5, i3));
                                    for (e1 e1Var : i5) {
                                        arrayList6.add(new g22(new q9k(e1Var.g()), new q9k(e1Var.l())));
                                    }
                                    arrayList2.add(new h22(arrayList6, g));
                                    i3 = 10;
                                }
                            }
                            iterable = null;
                            if (iterable != null) {
                            }
                        }
                        th = null;
                        list = arrayList2;
                        xbb b2 = a.b();
                        int i42 = 0;
                        if (boxScoreLegendModal.requireArguments().getBoolean("hasRating", false)) {
                        }
                        if (list != null) {
                        }
                        a = a.a(b2);
                        if (a.isEmpty()) {
                        }
                        return e22Var;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.w = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: f22
            public final /* synthetic */ BoxScoreLegendModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x020d, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.BASKETBALL) == false) goto L113;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0214, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.RUGBY) == false) goto L113;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x021b, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.AMERICAN_FOOTBALL) != false) goto L120;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0222, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.VOLLEYBALL) == false) goto L113;
             */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x01cb  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x01e5  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0283 A[LOOP:2: B:31:0x027d->B:33:0x0283, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x02aa  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x02ae  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
            /* JADX WARN: Type inference failed for: r5v18 */
            /* JADX WARN: Type inference failed for: r5v19, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ArrayList arrayList;
                Object obj;
                Iterable<b0i> iterable;
                Throwable th;
                List<h22> list;
                ?? arrayList2;
                Object obj2;
                Object obj3;
                Object obj4;
                xbb a;
                Iterator it;
                int i22 = i2;
                BoxScoreLegendModal boxScoreLegendModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = boxScoreLegendModal.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(8, requireContext));
                    case 1:
                        Bundle requireArguments = boxScoreLegendModal.requireArguments();
                        requireArguments.getClass();
                        ArrayList arrayList3 = (ArrayList) gz8.M(requireArguments, "sections", ArrayList.class);
                        if (arrayList3 != null) {
                            arrayList = new ArrayList();
                            for (Object obj5 : arrayList3) {
                                if (obj5 instanceof h22) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        return arrayList == null ? km5.a : arrayList;
                    default:
                        Context requireContext2 = boxScoreLegendModal.requireContext();
                        requireContext2.getClass();
                        e22 e22Var = new e22(requireContext2);
                        String string = boxScoreLegendModal.requireArguments().getString("section");
                        Iterator it2 = ((List) boxScoreLegendModal.x.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (Intrinsics.c(boxScoreLegendModal.requireContext().getString(((h22) obj).a), string)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        h22 h22Var = (h22) obj;
                        int i3 = 10;
                        if (h22Var == null || (arrayList2 = a.c(h22Var)) == 0) {
                            String string2 = boxScoreLegendModal.requireArguments().getString(SearchResponseKt.SPORT_ENTITY);
                            if (string2 != null) {
                                switch (string2.hashCode()) {
                                    case -2002238939:
                                        if (string2.equals(Sports.ICE_HOCKEY)) {
                                            iterable = gn9.e;
                                            break;
                                        }
                                        break;
                                    case -1721090992:
                                        if (string2.equals(Sports.BASEBALL)) {
                                            Iterator<E> it3 = u71.h.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    obj2 = it3.next();
                                                    if (Intrinsics.c(string, boxScoreLegendModal.requireContext().getString(((u71) obj2).a))) {
                                                    }
                                                } else {
                                                    obj2 = null;
                                                }
                                            }
                                            u71 u71Var = (u71) obj2;
                                            if (u71Var == null) {
                                                u71Var = u71.e;
                                            }
                                            iterable = a.c(u71Var);
                                            break;
                                        }
                                        break;
                                    case -1160328212:
                                        if (string2.equals(Sports.VOLLEYBALL)) {
                                            Iterator<E> it4 = qwk.g.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj3 = it4.next();
                                                    if (Intrinsics.c(string, boxScoreLegendModal.requireContext().getString(((qwk) obj3).a))) {
                                                    }
                                                } else {
                                                    obj3 = null;
                                                }
                                            }
                                            qwk qwkVar = (qwk) obj3;
                                            if (qwkVar == null) {
                                                qwkVar = qwk.e;
                                            }
                                            iterable = a.c(qwkVar);
                                            break;
                                        }
                                        break;
                                    case -83759494:
                                        if (string2.equals(Sports.AMERICAN_FOOTBALL)) {
                                            Iterator<E> it5 = lp.e.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    obj4 = it5.next();
                                                    if (Intrinsics.c(boxScoreLegendModal.requireContext().getString(((lp) obj4).a), string)) {
                                                    }
                                                } else {
                                                    obj4 = null;
                                                }
                                            }
                                            lp lpVar = (lp) obj4;
                                            if (lpVar != null) {
                                                iterable = a.c(lpVar);
                                                break;
                                            }
                                        }
                                        break;
                                    case 1767150:
                                        if (string2.equals(Sports.HANDBALL)) {
                                            iterable = e69.e;
                                            break;
                                        }
                                        break;
                                    case 108869083:
                                        if (string2.equals(Sports.RUGBY)) {
                                            iterable = l9g.d;
                                            break;
                                        }
                                        break;
                                    case 727149765:
                                        if (string2.equals(Sports.BASKETBALL)) {
                                            iterable = up1.d;
                                            break;
                                        }
                                        break;
                                }
                                if (iterable != null) {
                                    th = null;
                                    list = null;
                                    xbb b2 = a.b();
                                    int i42 = 0;
                                    if (boxScoreLegendModal.requireArguments().getBoolean("hasRating", false)) {
                                        b2.add(new b22(new q9k(R.string.sofascore_rating_stat_short), new q9k(R.string.sofascore_rating)));
                                    }
                                    if (list != null) {
                                        for (h22 h22Var2 : list) {
                                            String string3 = boxScoreLegendModal.requireArguments().getString(SearchResponseKt.SPORT_ENTITY);
                                            if (string3 != null) {
                                                switch (string3.hashCode()) {
                                                    case -1160328212:
                                                        break;
                                                    case -83759494:
                                                        break;
                                                    case 108869083:
                                                        break;
                                                    case 727149765:
                                                        break;
                                                }
                                            }
                                            if (list.size() > 1) {
                                                b2.add(new c22(h22Var2.a));
                                                RecyclerView recyclerView = boxScoreLegendModal.z;
                                                if (recyclerView == null) {
                                                    Intrinsics.i("recyclerView");
                                                    throw th;
                                                }
                                                recyclerView.setPadding(recyclerView.getPaddingLeft(), i42, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
                                                ArrayList arrayList42 = h22Var2.b;
                                                ArrayList arrayList52 = new ArrayList(k13.r(arrayList42, 10));
                                                it = arrayList42.iterator();
                                                while (it.hasNext()) {
                                                    g22 g22Var = (g22) it.next();
                                                    arrayList52.add(new b22(g22Var.a, g22Var.b));
                                                }
                                                b2.addAll(arrayList52);
                                                i42 = 0;
                                            }
                                            RecyclerView recyclerView2 = boxScoreLegendModal.z;
                                            if (recyclerView2 == null) {
                                                Intrinsics.i("recyclerView");
                                                throw th;
                                            }
                                            recyclerView2.setPadding(recyclerView2.getPaddingLeft(), ((Number) boxScoreLegendModal.w.getValue()).intValue(), recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
                                            ArrayList arrayList422 = h22Var2.b;
                                            ArrayList arrayList522 = new ArrayList(k13.r(arrayList422, 10));
                                            it = arrayList422.iterator();
                                            while (it.hasNext()) {
                                            }
                                            b2.addAll(arrayList522);
                                            i42 = 0;
                                        }
                                    }
                                    a = a.a(b2);
                                    if (a.isEmpty()) {
                                        e22Var.F(a);
                                    } else {
                                        boxScoreLegendModal.q();
                                    }
                                    return e22Var;
                                }
                                arrayList2 = new ArrayList(k13.r(iterable, 10));
                                for (b0i b0iVar : iterable) {
                                    int g = b0iVar.g();
                                    List<e1> i5 = b0iVar.i();
                                    ArrayList arrayList6 = new ArrayList(k13.r(i5, i3));
                                    for (e1 e1Var : i5) {
                                        arrayList6.add(new g22(new q9k(e1Var.g()), new q9k(e1Var.l())));
                                    }
                                    arrayList2.add(new h22(arrayList6, g));
                                    i3 = 10;
                                }
                            }
                            iterable = null;
                            if (iterable != null) {
                            }
                        }
                        th = null;
                        list = arrayList2;
                        xbb b22 = a.b();
                        int i422 = 0;
                        if (boxScoreLegendModal.requireArguments().getBoolean("hasRating", false)) {
                        }
                        if (list != null) {
                        }
                        a = a.a(b22);
                        if (a.isEmpty()) {
                        }
                        return e22Var;
                }
            }
        });
        final int i3 = 2;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: f22
            public final /* synthetic */ BoxScoreLegendModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x020d, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.BASKETBALL) == false) goto L113;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0214, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.RUGBY) == false) goto L113;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x021b, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.AMERICAN_FOOTBALL) != false) goto L120;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0222, code lost:
            
                if (r12.equals(com.sofascore.model.Sports.VOLLEYBALL) == false) goto L113;
             */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x01cb  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x01e5  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0283 A[LOOP:2: B:31:0x027d->B:33:0x0283, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x02aa  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x02ae  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
            /* JADX WARN: Type inference failed for: r5v18 */
            /* JADX WARN: Type inference failed for: r5v19, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ArrayList arrayList;
                Object obj;
                Iterable<b0i> iterable;
                Throwable th;
                List<h22> list;
                ?? arrayList2;
                Object obj2;
                Object obj3;
                Object obj4;
                xbb a;
                Iterator it;
                int i22 = i3;
                BoxScoreLegendModal boxScoreLegendModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = boxScoreLegendModal.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(8, requireContext));
                    case 1:
                        Bundle requireArguments = boxScoreLegendModal.requireArguments();
                        requireArguments.getClass();
                        ArrayList arrayList3 = (ArrayList) gz8.M(requireArguments, "sections", ArrayList.class);
                        if (arrayList3 != null) {
                            arrayList = new ArrayList();
                            for (Object obj5 : arrayList3) {
                                if (obj5 instanceof h22) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        return arrayList == null ? km5.a : arrayList;
                    default:
                        Context requireContext2 = boxScoreLegendModal.requireContext();
                        requireContext2.getClass();
                        e22 e22Var = new e22(requireContext2);
                        String string = boxScoreLegendModal.requireArguments().getString("section");
                        Iterator it2 = ((List) boxScoreLegendModal.x.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (Intrinsics.c(boxScoreLegendModal.requireContext().getString(((h22) obj).a), string)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        h22 h22Var = (h22) obj;
                        int i32 = 10;
                        if (h22Var == null || (arrayList2 = a.c(h22Var)) == 0) {
                            String string2 = boxScoreLegendModal.requireArguments().getString(SearchResponseKt.SPORT_ENTITY);
                            if (string2 != null) {
                                switch (string2.hashCode()) {
                                    case -2002238939:
                                        if (string2.equals(Sports.ICE_HOCKEY)) {
                                            iterable = gn9.e;
                                            break;
                                        }
                                        break;
                                    case -1721090992:
                                        if (string2.equals(Sports.BASEBALL)) {
                                            Iterator<E> it3 = u71.h.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    obj2 = it3.next();
                                                    if (Intrinsics.c(string, boxScoreLegendModal.requireContext().getString(((u71) obj2).a))) {
                                                    }
                                                } else {
                                                    obj2 = null;
                                                }
                                            }
                                            u71 u71Var = (u71) obj2;
                                            if (u71Var == null) {
                                                u71Var = u71.e;
                                            }
                                            iterable = a.c(u71Var);
                                            break;
                                        }
                                        break;
                                    case -1160328212:
                                        if (string2.equals(Sports.VOLLEYBALL)) {
                                            Iterator<E> it4 = qwk.g.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj3 = it4.next();
                                                    if (Intrinsics.c(string, boxScoreLegendModal.requireContext().getString(((qwk) obj3).a))) {
                                                    }
                                                } else {
                                                    obj3 = null;
                                                }
                                            }
                                            qwk qwkVar = (qwk) obj3;
                                            if (qwkVar == null) {
                                                qwkVar = qwk.e;
                                            }
                                            iterable = a.c(qwkVar);
                                            break;
                                        }
                                        break;
                                    case -83759494:
                                        if (string2.equals(Sports.AMERICAN_FOOTBALL)) {
                                            Iterator<E> it5 = lp.e.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    obj4 = it5.next();
                                                    if (Intrinsics.c(boxScoreLegendModal.requireContext().getString(((lp) obj4).a), string)) {
                                                    }
                                                } else {
                                                    obj4 = null;
                                                }
                                            }
                                            lp lpVar = (lp) obj4;
                                            if (lpVar != null) {
                                                iterable = a.c(lpVar);
                                                break;
                                            }
                                        }
                                        break;
                                    case 1767150:
                                        if (string2.equals(Sports.HANDBALL)) {
                                            iterable = e69.e;
                                            break;
                                        }
                                        break;
                                    case 108869083:
                                        if (string2.equals(Sports.RUGBY)) {
                                            iterable = l9g.d;
                                            break;
                                        }
                                        break;
                                    case 727149765:
                                        if (string2.equals(Sports.BASKETBALL)) {
                                            iterable = up1.d;
                                            break;
                                        }
                                        break;
                                }
                                if (iterable != null) {
                                    th = null;
                                    list = null;
                                    xbb b22 = a.b();
                                    int i422 = 0;
                                    if (boxScoreLegendModal.requireArguments().getBoolean("hasRating", false)) {
                                        b22.add(new b22(new q9k(R.string.sofascore_rating_stat_short), new q9k(R.string.sofascore_rating)));
                                    }
                                    if (list != null) {
                                        for (h22 h22Var2 : list) {
                                            String string3 = boxScoreLegendModal.requireArguments().getString(SearchResponseKt.SPORT_ENTITY);
                                            if (string3 != null) {
                                                switch (string3.hashCode()) {
                                                    case -1160328212:
                                                        break;
                                                    case -83759494:
                                                        break;
                                                    case 108869083:
                                                        break;
                                                    case 727149765:
                                                        break;
                                                }
                                            }
                                            if (list.size() > 1) {
                                                b22.add(new c22(h22Var2.a));
                                                RecyclerView recyclerView = boxScoreLegendModal.z;
                                                if (recyclerView == null) {
                                                    Intrinsics.i("recyclerView");
                                                    throw th;
                                                }
                                                recyclerView.setPadding(recyclerView.getPaddingLeft(), i422, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
                                                ArrayList arrayList422 = h22Var2.b;
                                                ArrayList arrayList522 = new ArrayList(k13.r(arrayList422, 10));
                                                it = arrayList422.iterator();
                                                while (it.hasNext()) {
                                                    g22 g22Var = (g22) it.next();
                                                    arrayList522.add(new b22(g22Var.a, g22Var.b));
                                                }
                                                b22.addAll(arrayList522);
                                                i422 = 0;
                                            }
                                            RecyclerView recyclerView2 = boxScoreLegendModal.z;
                                            if (recyclerView2 == null) {
                                                Intrinsics.i("recyclerView");
                                                throw th;
                                            }
                                            recyclerView2.setPadding(recyclerView2.getPaddingLeft(), ((Number) boxScoreLegendModal.w.getValue()).intValue(), recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
                                            ArrayList arrayList4222 = h22Var2.b;
                                            ArrayList arrayList5222 = new ArrayList(k13.r(arrayList4222, 10));
                                            it = arrayList4222.iterator();
                                            while (it.hasNext()) {
                                            }
                                            b22.addAll(arrayList5222);
                                            i422 = 0;
                                        }
                                    }
                                    a = a.a(b22);
                                    if (a.isEmpty()) {
                                        e22Var.F(a);
                                    } else {
                                        boxScoreLegendModal.q();
                                    }
                                    return e22Var;
                                }
                                arrayList2 = new ArrayList(k13.r(iterable, 10));
                                for (b0i b0iVar : iterable) {
                                    int g = b0iVar.g();
                                    List<e1> i5 = b0iVar.i();
                                    ArrayList arrayList6 = new ArrayList(k13.r(i5, i32));
                                    for (e1 e1Var : i5) {
                                        arrayList6.add(new g22(new q9k(e1Var.g()), new q9k(e1Var.l())));
                                    }
                                    arrayList2.add(new h22(arrayList6, g));
                                    i32 = 10;
                                }
                            }
                            iterable = null;
                            if (iterable != null) {
                            }
                        }
                        th = null;
                        list = arrayList2;
                        xbb b222 = a.b();
                        int i4222 = 0;
                        if (boxScoreLegendModal.requireArguments().getBoolean("hasRating", false)) {
                        }
                        if (list != null) {
                        }
                        a = a.a(b222);
                        if (a.isEmpty()) {
                        }
                        return e22Var;
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        RecyclerView recyclerView = w74.b(layoutInflater, null).c;
        this.z = recyclerView;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        s(recyclerView);
        recyclerView.setAdapter((e22) this.y.getValue());
        return recyclerView;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (((e22) this.y.getValue()).getItemCount() > 12) {
            Object parent = view.getParent();
            parent.getClass();
            BottomSheetBehavior.C((View) parent).M(3);
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        String string = requireArguments().getString("analyticsName", "BoxScoreInfoModal");
        string.getClass();
        return string;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(requireArguments().getInt("title", R.string.bottom_sheet_stats_expl_title));
        string.getClass();
        return string;
    }
}
