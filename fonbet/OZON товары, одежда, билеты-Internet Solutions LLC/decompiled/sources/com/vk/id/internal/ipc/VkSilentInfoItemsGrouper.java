package com.vk.id.internal.ipc;

import Fb.b;
import Fb.c;
import Fb.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/vk/id/internal/ipc/VkSilentInfoItemsGrouper;", "", "<init>", "()V", "", "LFb/c;", "groupByUserHash", "(Ljava/util/List;)Ljava/util/List;", "groupByWeightAndUserHash", "SilentAuthInfoPriorityComparator", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VkSilentInfoItemsGrouper {

    @NotNull
    public static final VkSilentInfoItemsGrouper INSTANCE = new VkSilentInfoItemsGrouper();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/internal/ipc/VkSilentInfoItemsGrouper$SilentAuthInfoPriorityComparator;", "Ljava/util/Comparator;", "LFb/c;", "Lkotlin/Comparator;", "<init>", "()V", "first", "second", "", "compare", "(LFb/c;LFb/c;)I", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class SilentAuthInfoPriorityComparator implements Comparator<c> {
        @Override // java.util.Comparator
        public int compare(@NotNull c first, @NotNull c second) {
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            int i11 = Intrinsics.i(first.c(), second.c());
            if (i11 != 0) {
                return i11;
            }
            int i12 = Intrinsics.i(first.b().p(), second.b().p());
            return i12 != 0 ? i12 : Boolean.compare(!Intrinsics.d(first.b().l(), ""), !Intrinsics.d(second.b().l(), ""));
        }
    }

    private VkSilentInfoItemsGrouper() {
    }

    private final List<c> groupByUserHash(List<c> list) {
        Object next;
        Object next2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String l11 = ((c) obj).b().l();
            Object obj2 = linkedHashMap.get(l11);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(l11, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap u11 = U.u(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        List list2 = (List) u11.remove("");
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        Iterator it = u11.entrySet().iterator();
        while (it.hasNext()) {
            List list3 = (List) ((Map.Entry) it.next()).getValue();
            Iterator it2 = list3.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int c11 = ((c) next).c();
                    do {
                        Object next3 = it2.next();
                        int c12 = ((c) next3).c();
                        if (c11 < c12) {
                            next = next3;
                            c11 = c12;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            c cVar = (c) next;
            Integer valueOf = cVar != null ? Integer.valueOf(cVar.c()) : null;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                b silentAuthInfo = ((c) it3.next()).b();
                Intrinsics.checkNotNullParameter(silentAuthInfo, "silentAuthInfo");
                arrayList2.add(new d(silentAuthInfo.n(), silentAuthInfo.o(), silentAuthInfo.k(), silentAuthInfo.d(), silentAuthInfo.p(), silentAuthInfo.b()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list3) {
                int c13 = ((c) obj3).c();
                if (valueOf != null && c13 == valueOf.intValue()) {
                    arrayList3.add(obj3);
                }
            }
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                next2 = it4.next();
                if (it4.hasNext()) {
                    int p11 = ((c) next2).b().p();
                    do {
                        Object next4 = it4.next();
                        int p12 = ((c) next4).b().p();
                        if (p11 < p12) {
                            next2 = next4;
                            p11 = p12;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next2 = null;
            }
            c cVar2 = (c) next2;
            if (cVar2 != null) {
                arrayList.add(c.a(cVar2, b.a(cVar2.b(), null, arrayList2, 98303)));
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<c> groupByWeightAndUserHash(@NotNull List<c> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List z02 = C7714v.z0(C7714v.I0(new SilentAuthInfoPriorityComparator(), groupByUserHash(list)));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : z02) {
            if (hashSet.add(Long.valueOf(((c) obj).b().c()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
