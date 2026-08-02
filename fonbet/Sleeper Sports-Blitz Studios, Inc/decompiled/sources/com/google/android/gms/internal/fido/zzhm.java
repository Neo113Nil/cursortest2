package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes7.dex */
public final class zzhm extends zzhp {
    private final int zza;
    private final zzcj zzb;

    zzhm(zzcj zzcjVar) throws zzhf {
        zzcjVar.getClass();
        this.zzb = zzcjVar;
        zzdc it = zzcjVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int zzb = ((zzhp) entry.getKey()).zzb();
            i = i < zzb ? zzb : i;
            int zzb2 = ((zzhp) entry.getValue()).zzb();
            if (i < zzb2) {
                i = zzb2;
            }
        }
        int i2 = i + 1;
        this.zza = i2;
        if (i2 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        int size;
        int size2;
        zzhp zzhpVar = (zzhp) obj;
        if (zzd(MessagePack.Code.FIXSTR_PREFIX) != zzhpVar.zza()) {
            size2 = zzhpVar.zza();
            size = zzd(MessagePack.Code.FIXSTR_PREFIX);
        } else {
            zzhm zzhmVar = (zzhm) zzhpVar;
            if (this.zzb.size() == zzhmVar.zzb.size()) {
                zzdc it = this.zzb.entrySet().iterator();
                zzdc it2 = zzhmVar.zzb.entrySet().iterator();
                do {
                    if (!it.hasNext() && !it2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    int compareTo2 = ((zzhp) entry.getKey()).compareTo((zzhp) entry2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((zzhp) entry.getValue()).compareTo((zzhp) entry2.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
            size = this.zzb.size();
            size2 = zzhmVar.zzb.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.zzb.equals(((zzhm) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzd(MessagePack.Code.FIXSTR_PREFIX)), this.zzb});
    }

    public final String toString() {
        if (this.zzb.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzdc it = this.zzb.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((zzhp) entry.getKey()).toString().replace("\n", "\n  "), ((zzhp) entry.getValue()).toString().replace("\n", "\n  "));
        }
        zzbd zza = zzbd.zza(",\n  ");
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            zzbc.zza(sb, linkedHashMap.entrySet().iterator(), zza, " : ");
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzd(MessagePack.Code.FIXSTR_PREFIX);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zzb() {
        return this.zza;
    }

    public final zzcj zzc() {
        return this.zzb;
    }
}
