package com.google.android.gms.internal.measurement;

import defpackage.jca;
import defpackage.o4p;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzst implements zzrt {
    private zzst() {
    }

    public static final InputStream b(zzrs zzrsVar) {
        InputStream a = zzrsVar.a.a(zzrsVar.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        ArrayList arrayList2 = zzrsVar.c;
        if (!arrayList2.isEmpty()) {
            int i = o4p.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                zzsz zza = ((zztb) it.next()).zza();
                if (zza != null) {
                    arrayList3.add(zza);
                }
            }
            o4p o4pVar = !arrayList3.isEmpty() ? new o4p(a, arrayList3) : null;
            if (o4pVar != null) {
                arrayList.add(o4pVar);
            }
        }
        Iterator it2 = zzrsVar.b.iterator();
        if (it2.hasNext()) {
            ((zztc) it2.next()).a((InputStream) jca.H(arrayList));
            throw null;
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object a(zzrs zzrsVar) {
        return b(zzrsVar);
    }
}
