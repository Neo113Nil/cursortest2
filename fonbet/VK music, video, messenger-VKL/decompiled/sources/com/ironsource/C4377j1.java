package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import xsna.c5g;
import xsna.j5g;

/* renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4377j1 implements InterfaceC4517qf<JSONArray> {
    private final List<C4360i1> a = new ArrayList();

    /* renamed from: com.ironsource.j1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4499pf.values().length];
            try {
                iArr[EnumC4499pf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4499pf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4294e7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(EnumC4499pf enumC4499pf) {
        int i = a.a[enumC4499pf.ordinal()];
        if (i == 1) {
            List<C4360i1> b = b();
            ArrayList arrayList = new ArrayList(c5g.u(b, 10));
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4360i1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<C4360i1> a2 = a();
        ArrayList arrayList2 = new ArrayList(c5g.u(a2, 10));
        Iterator<T> it2 = a2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C4360i1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(C4360i1 c4360i1) {
        this.a.add(c4360i1);
    }

    private final List<C4360i1> a() {
        List<C4360i1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C4360i1 c4360i1 = (C4360i1) obj;
            if (c4360i1.e() != EnumC4463nf.LoadSuccess && c4360i1.e() != EnumC4463nf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C4360i1) it.next()).a());
        }
        Set S0 = j5g.S0(arrayList2);
        List<C4360i1> list2 = this.a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C4360i1 c4360i12 = (C4360i1) obj2;
            if (c4360i12.e() == EnumC4463nf.LoadSuccess && !S0.contains(c4360i12.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C4360i1> b() {
        List<C4360i1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C4360i1) obj).e() != EnumC4463nf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
