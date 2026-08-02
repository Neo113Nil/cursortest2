package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzan extends zzai implements zzak {
    public final ArrayList c;
    public final ArrayList d;
    public final zzg e;

    public zzan(String str, ArrayList arrayList, List list, zzg zzgVar) {
        super(str);
        this.c = new ArrayList();
        this.e = zzgVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.add(((zzao) it.next()).zzc());
            }
        }
        this.d = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao d(zzg zzgVar, List list) {
        zzat zzatVar;
        zzg c = this.e.c();
        zzaw zzawVar = c.b;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            zzatVar = zzao.I7;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                c.f((String) arrayList.get(i), zzgVar.b.b(zzgVar, (zzao) list.get(i)));
            } else {
                c.f((String) arrayList.get(i), zzatVar);
            }
            i++;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            zzao zzaoVar = (zzao) it.next();
            zzao b = zzawVar.b(c, zzaoVar);
            if (b instanceof zzap) {
                b = zzawVar.b(c, zzaoVar);
            }
            if (b instanceof zzag) {
                return ((zzag) b).a;
            }
        }
        return zzatVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzan(this);
    }

    public zzan(zzan zzanVar) {
        super(zzanVar.a);
        ArrayList arrayList = new ArrayList(zzanVar.c.size());
        this.c = arrayList;
        arrayList.addAll(zzanVar.c);
        ArrayList arrayList2 = new ArrayList(zzanVar.d.size());
        this.d = arrayList2;
        arrayList2.addAll(zzanVar.d);
        this.e = zzanVar.e;
    }
}
