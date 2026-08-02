package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzioi implements zzinw {
    public static final /* synthetic */ int c = 0;
    public final List a;
    public final List b;

    static {
        zzinx.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ zzioi(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public static zzioh a(int i, int i2) {
        return new zzioh(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.a;
        int size = list.size();
        List list2 = this.b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zziof) list2.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb = ((zziof) list.get(i2)).zzb();
            zzb.getClass();
            hashSet.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
