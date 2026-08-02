package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhdi {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhdg) it.next()).zzd(false);
        }
    }

    public final zzhdi zza(zzhdg zzhdgVar) {
        if (zzhdgVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhdgVar.zzc()) {
            zzc();
        }
        zzhdgVar.zzi(this);
        this.zza.add(zzhdgVar);
        return this;
    }

    public final zzhdn zzb() throws GeneralSecurityException {
        zzhdh zzhdhVar;
        int i;
        zzhdj zzhdjVar;
        zzhdh zzhdhVar2;
        zzhdh zzhdhVar3;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzhdg> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            zzhdh zzg = ((zzhdg) list.get(i2)).zzg();
            zzhdhVar2 = zzhdh.zza;
            if (zzg == zzhdhVar2) {
                zzhdh zzg2 = ((zzhdg) list.get(i3)).zzg();
                zzhdhVar3 = zzhdh.zza;
                if (zzg2 != zzhdhVar3) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhdg zzhdgVar : list) {
            zzhdgVar.zze();
            if (zzhdgVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzhdh zzg3 = zzhdgVar.zzg();
            zzhdhVar = zzhdh.zza;
            int i4 = 3;
            if (zzg3 == zzhdhVar) {
                int i5 = 0;
                while (true) {
                    if (i5 != 0 && !hashSet.contains(Integer.valueOf(i5))) {
                        break;
                    }
                    int i6 = zzhnq.zza;
                    i5 = 0;
                    while (i5 == 0) {
                        byte[] zza = zzhnh.zza(4);
                        i5 = (zza[3] & 255) | ((zza[0] & 255) << 24) | ((zza[1] & 255) << 16) | ((zza[2] & 255) << 8);
                    }
                }
                i = i5;
            } else {
                zzhdgVar.zzg();
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                int i7 = i;
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 31);
                sb.append("Id ");
                sb.append(i7);
                sb.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb.toString());
            }
            hashSet.add(valueOf);
            zzhdc zzc = zzhma.zza().zzc(zzhdgVar.zzf(), true != zzhdgVar.zzf().zza() ? null : valueOf);
            zzhde zze = zzhdgVar.zze();
            zzhde zzhdeVar = zzhde.zza;
            if (!zzhdeVar.equals(zze)) {
                if (zzhde.zzb.equals(zze)) {
                    i4 = 4;
                } else {
                    if (!zzhde.zzc.equals(zze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i4 = 5;
                }
            }
            boolean zzc2 = zzhdgVar.zzc();
            zzhdjVar = zzhdl.zza;
            zzhdl zzhdlVar = new zzhdl(zzc, i4, i, zzc2, false, zzhdjVar, null);
            if (zzhdgVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhdgVar.zze() != zzhdeVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(zzhdlVar);
        }
        if (num != null) {
            return zzhdn.zzi(new zzhdn(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
