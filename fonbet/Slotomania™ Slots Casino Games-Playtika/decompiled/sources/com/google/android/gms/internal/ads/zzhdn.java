package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhdn implements zzhdo {
    private final List zza;
    private final Map zzb;

    @Nullable
    private final zzhdn zzc;

    private zzhdn(List list, Map map) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = map;
        if (zzhkf.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                zzhdl zzhdlVar = (zzhdl) it.next();
                if (hashSet.contains(Integer.valueOf(zzhdlVar.zzc()))) {
                    int zzc = zzhdlVar.zzc();
                    StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
                    sb.append("KeyID ");
                    sb.append(zzc);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb.toString());
                }
                hashSet.add(Integer.valueOf(zzhdlVar.zzc()));
                z |= zzhdlVar.zzd();
            }
            if (!z) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    private zzhdn(List list, Map map, zzhdn zzhdnVar) {
        this.zza = list;
        this.zzb = map;
        this.zzc = zzhdnVar;
    }

    /* synthetic */ zzhdn(List list, Map map, byte[] bArr) {
        this(list, map);
    }

    static final zzhdn zza(zzhso zzhsoVar) throws GeneralSecurityException {
        if (zzhsoVar == null || zzhsoVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhdn(zzj(zzhsoVar), new HashMap());
    }

    public static final zzhdn zzg(zzhdt zzhdtVar) throws GeneralSecurityException {
        zzhdi zzhdiVar = new zzhdi();
        zzhdg zzhdgVar = new zzhdg(zzhdtVar, null);
        zzhdgVar.zzb();
        zzhdgVar.zza();
        zzhdiVar.zza(zzhdgVar);
        return zzhdiVar.zzb();
    }

    static /* synthetic */ zzhdn zzi(final zzhdn zzhdnVar) {
        final zzhlu zzhluVar = (zzhlu) zzhdnVar.zzf(zzhlu.class);
        if (zzhluVar == null) {
            return zzhdnVar;
        }
        zzhdj zzhdjVar = new zzhdj() { // from class: com.google.android.gms.internal.ads.zzhdm
            @Override // com.google.android.gms.internal.ads.zzhdj
            public final /* synthetic */ void zza(zzhdl zzhdlVar) {
                zzhme.zza().zzb().zza(zzhdn.this, zzhluVar, "keyset_handle", "get_key");
            }
        };
        List<zzhdl> list = zzhdnVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhdl zzhdlVar : list) {
            arrayList.add(new zzhdl(zzhdlVar.zzf(), zzhdlVar.zzj(), zzhdlVar.zzg(), zzhdlVar.zzh(), zzhdlVar.zzi(), zzhdjVar, null));
        }
        return new zzhdn(arrayList, zzhdnVar.zzb, zzhdnVar);
    }

    private static List zzj(zzhso zzhsoVar) throws GeneralSecurityException {
        zzhdc zzhlrVar;
        boolean z;
        zzhdj zzhdjVar;
        ArrayList arrayList = new ArrayList(zzhsoVar.zzc());
        for (zzhsn zzhsnVar : zzhsoVar.zzb()) {
            int zzc = zzhsnVar.zzc();
            try {
                zzhne zzl = zzl(zzhsnVar);
                zzhmj zza = zzhmj.zza();
                zzhdx zza2 = zzhdx.zza();
                zzhlrVar = !zza.zzf(zzl) ? new zzhlr(zzl, zza2) : zza.zzg(zzl, zza2);
                z = false;
            } catch (GeneralSecurityException e) {
                if (zzhkf.zza.zza()) {
                    throw e;
                }
                zzhlrVar = new zzhlr(zzl(zzhsnVar), zzhdx.zza());
                z = true;
            }
            if (zzhkf.zza.zza() && !zzm(zzhsnVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z2 = false;
            int zzk = zzhsnVar.zzk();
            if (zzc == zzhsoVar.zza()) {
                z2 = true;
            }
            zzhdjVar = zzhdl.zza;
            arrayList.add(new zzhdl(zzhlrVar, zzk, zzc, z2, z, zzhdjVar, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzhdn zzk() {
        zzhdn zzhdnVar = this.zzc;
        return zzhdnVar == null ? this : zzhdnVar;
    }

    private static zzhne zzl(zzhsn zzhsnVar) throws GeneralSecurityException {
        return zzhne.zza(zzhsnVar.zzb().zza(), zzhsnVar.zzb().zzb(), zzhsnVar.zzb().zzc(), zzhsnVar.zzd(), zzhsnVar.zzd() == zzhtb.RAW ? null : Integer.valueOf(zzhsnVar.zzc()));
    }

    private static boolean zzm(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final String toString() {
        zzhso zzb = zzb();
        int i = zzhea.zza;
        zzhsp zza = zzhss.zza();
        zza.zza(zzb.zza());
        for (zzhsn zzhsnVar : zzb.zzb()) {
            zzhsq zza2 = zzhsr.zza();
            zza2.zza(zzhsnVar.zzb().zza());
            zza2.zzd(zzhsnVar.zzk());
            zza2.zzc(zzhsnVar.zzd());
            zza2.zzb(zzhsnVar.zzc());
            zza.zzb((zzhsr) zza2.zzbu());
        }
        return ((zzhss) zza.zzbu()).toString();
    }

    final zzhso zzb() {
        try {
            zzhsl zzh = zzhso.zzh();
            for (zzhdl zzhdlVar : this.zza) {
                zzhdc zza = zzhdlVar.zza();
                int zzj = zzhdlVar.zzj();
                int zzc = zzhdlVar.zzc();
                zzhne zzhneVar = (zzhne) zzhmj.zza().zzh(zza, zzhne.class, zzhdx.zza());
                Integer zzb = zza.zzb();
                if (zzb != null && zzb.intValue() != zzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhsm zze = zzhsn.zze();
                zzhsd zzd = zzhsf.zzd();
                zzd.zza(zzhneVar.zzg());
                zzd.zzb(zzhneVar.zzb());
                zzd.zzc(zzhneVar.zzc());
                zze.zzb(zzd);
                zze.zze(zzj);
                zze.zzc(zzc);
                zze.zzd(zzhneVar.zzd());
                zzh.zzb((zzhsn) zze.zzbu());
                if (zzhdlVar.zzd()) {
                    zzh.zza(zzhdlVar.zzc());
                }
            }
            return (zzhso) zzh.zzbu();
        } catch (GeneralSecurityException e) {
            throw new zzhnp(e);
        }
    }

    public final zzhdl zzc() {
        for (zzhdl zzhdlVar : this.zza) {
            if (zzhdlVar != null && zzhdlVar.zzd()) {
                if (zzhdlVar.zzb() == zzhde.zza) {
                    return zzhdlVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhdo
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhdl zze(int i) {
        if (i < 0 || i >= zzd()) {
            int zzd = zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(zzd).length());
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(" for keyset of size ");
            sb.append(zzd);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        List list = this.zza;
        zzhdl zzhdlVar = (zzhdl) list.get(i);
        if (!zzm(zzhdlVar.zzj())) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i);
            sb2.append(" has wrong status");
            throw new IllegalStateException(sb2.toString());
        }
        if (!zzhdlVar.zzi()) {
            return (zzhdl) list.get(i);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i);
        sb3.append(" didn't parse correctly");
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhdo
    @Nullable
    public final zzhcv zzf(Class cls) {
        return (zzhcv) this.zzb.get(cls);
    }

    public final Object zzh(zzhcz zzhczVar, Class cls) throws GeneralSecurityException {
        if (!(zzhczVar instanceof zzhlb)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzhlb zzhlbVar = (zzhlb) zzhczVar;
        zzhso zzb = zzk().zzb();
        int i = zzhea.zza;
        int zza = zzb.zza();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (zzhsn zzhsnVar : zzb.zzb()) {
            if (zzhsnVar.zzk() == 3) {
                if (!zzhsnVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhsnVar.zzc())));
                }
                if (zzhsnVar.zzd() == zzhtb.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhsnVar.zzc())));
                }
                if (zzhsnVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhsnVar.zzc())));
                }
                if (zzhsnVar.zzc() == zza) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z &= zzhsnVar.zzb().zzc() == zzhse.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < zzd(); i3++) {
            List list = this.zza;
            if (((zzhdl) list.get(i3)).zzi() || !zzm(((zzhdl) list.get(i3)).zzj())) {
                String zza2 = zzb.zzd(i3).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 44 + String.valueOf(zza2).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(zza2);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhlbVar.zza(zzk(), cls);
    }
}
