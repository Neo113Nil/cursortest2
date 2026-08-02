package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.hv9;
import defpackage.jca;
import defpackage.p03;
import defpackage.q4p;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrs {
    public final zzsx a;
    public final hv9 b;
    public final ArrayList c;
    public final Uri d;

    public zzrs(p03 p03Var) {
        this.a = (zzsx) p03Var.b;
        this.b = (hv9) p03Var.c;
        this.c = (ArrayList) p03Var.d;
        this.d = (Uri) p03Var.f;
    }

    public final ArrayList a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.c;
        if (!arrayList2.isEmpty()) {
            int i = q4p.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                zzta zzb = ((zztb) it.next()).zzb();
                if (zzb != null) {
                    arrayList3.add(zzb);
                }
            }
            q4p q4pVar = !arrayList3.isEmpty() ? new q4p(outputStream, arrayList3) : null;
            if (q4pVar != null) {
                arrayList.add(q4pVar);
            }
        }
        Iterator it2 = this.b.iterator();
        if (it2.hasNext()) {
            ((zztc) it2.next()).b((OutputStream) jca.H(arrayList));
            throw null;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
