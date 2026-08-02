package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfvg extends zzgxe {
    public final LinkedList a = new LinkedList();

    @Override // com.google.android.gms.internal.ads.zzgxb, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        zzfuo zzfuoVar = (zzfuo) obj;
        int i = zzfuoVar.f;
        LinkedList linkedList = this.a;
        if (i != 3) {
            linkedList.add(zzfuoVar);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zzfuo zzfuoVar2 = (zzfuo) listIterator.next();
            if (zzfuoVar2.f == 3) {
                double d = zzfuoVar2.e;
                double d2 = zzfuoVar.e;
                if (d < d2 || (d == d2 && zzfuoVar2.a() > zzfuoVar.a())) {
                    listIterator.set(zzfuoVar);
                    zzfuoVar = zzfuoVar2;
                }
            }
        }
        linkedList.add(zzfuoVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxb, com.google.android.gms.internal.ads.zzgxd
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgxe, com.google.android.gms.internal.ads.zzgxb
    public final /* synthetic */ Collection d() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final LinkedList e() {
        return this.a;
    }
}
