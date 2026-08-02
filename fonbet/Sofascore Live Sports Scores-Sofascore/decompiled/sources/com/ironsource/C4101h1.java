package com.ironsource;

import defpackage.k13;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4101h1 implements InterfaceC4240of<JSONArray> {

    @NotNull
    private final List<C4083g1> a = new ArrayList();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.h1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4222nf.values().length];
            try {
                iArr[EnumC4222nf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4222nf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    private final List<C4083g1> a() {
        List<C4083g1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C4083g1 c4083g1 = (C4083g1) obj;
            if (c4083g1.e() != EnumC4186lf.LoadSuccess && c4083g1.e() != EnumC4186lf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C4083g1) it.next()).a());
        }
        Set W0 = CollectionsKt.W0(arrayList2);
        List<C4083g1> list2 = this.a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C4083g1 c4083g12 = (C4083g1) obj2;
            if (c4083g12.e() == EnumC4186lf.LoadSuccess && !W0.contains(c4083g12.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    @Override // com.ironsource.InterfaceC3956a7
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(@NotNull EnumC4222nf enumC4222nf) {
        enumC4222nf.getClass();
        int i = a.a[enumC4222nf.ordinal()];
        if (i == 1) {
            List<C4083g1> b = b();
            ArrayList arrayList = new ArrayList(k13.r(b, 10));
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4083g1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i != 2) {
            zzl.b();
            return null;
        }
        List<C4083g1> a2 = a();
        ArrayList arrayList2 = new ArrayList(k13.r(a2, 10));
        Iterator<T> it2 = a2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C4083g1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    private final List<C4083g1> b() {
        List<C4083g1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C4083g1) obj).e() != EnumC4186lf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(@NotNull C4083g1 c4083g1) {
        c4083g1.getClass();
        this.a.add(c4083g1);
    }
}
