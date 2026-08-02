package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2481j1 implements InterfaceC2621qf<JSONArray> {
    private final List<C2464i1> a = new ArrayList();

    /* renamed from: com.ironsource.j1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2603pf.values().length];
            try {
                iArr[EnumC2603pf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2603pf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC2380d7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(EnumC2603pf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = a.a[mode.ordinal()];
        if (i == 1) {
            List<C2464i1> b = b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2464i1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<C2464i1> a2 = a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        Iterator<T> it2 = a2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C2464i1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(C2464i1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.add(event);
    }

    private final List<C2464i1> a() {
        List<C2464i1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C2464i1 c2464i1 = (C2464i1) obj;
            if (c2464i1.e() != EnumC2567nf.LoadSuccess && c2464i1.e() != EnumC2567nf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C2464i1) it.next()).a());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<C2464i1> list2 = this.a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C2464i1 c2464i12 = (C2464i1) obj2;
            if (c2464i12.e() == EnumC2567nf.LoadSuccess && !set.contains(c2464i12.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C2464i1> b() {
        List<C2464i1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C2464i1) obj).e() != EnumC2567nf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
