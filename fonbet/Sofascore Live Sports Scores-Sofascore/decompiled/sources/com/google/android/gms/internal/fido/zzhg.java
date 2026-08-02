package com.google.android.gms.internal.fido;

import defpackage.a70;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhg extends zzhp {
    public final zzcc a;
    public final int b;

    public zzhg(a aVar) {
        aVar.getClass();
        this.a = aVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            zzcc zzccVar = this.a;
            if (i >= zzccVar.size()) {
                break;
            }
            int a = ((zzhp) zzccVar.get(i)).a();
            if (i2 < a) {
                i2 = a;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int zza = zzhpVar.zza();
        int c = zzhp.c(Byte.MIN_VALUE);
        if (c != zza) {
            return c - zzhpVar.zza();
        }
        zzcc zzccVar = ((zzhg) zzhpVar).a;
        zzcc zzccVar2 = this.a;
        if (zzccVar2.size() != zzccVar.size()) {
            return zzccVar2.size() - zzccVar.size();
        }
        for (int i = 0; i < zzccVar2.size(); i++) {
            int compareTo = ((zzhp) zzccVar2.get(i)).compareTo((zzhp) zzccVar.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhg.class == obj.getClass()) {
            return this.a.equals(((zzhg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c(Byte.MIN_VALUE)), this.a});
    }

    public final String toString() {
        zzcc zzccVar = this.a;
        if (zzccVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = zzccVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((zzhp) zzccVar.get(i)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzbd.a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(zzbd.a(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            a70.j(e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c(Byte.MIN_VALUE);
    }
}
