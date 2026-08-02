package com.google.android.gms.measurement.internal;

import Ij.C3261b;
import N3.C3661l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes9.dex */
public final class zzln extends zzkz {
    zzln(zzll zzllVar) {
        super(zzllVar);
    }

    static final boolean zzA(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotNull(zzqVar);
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    static final com.google.android.gms.internal.measurement.zzfw zzB(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzfsVar.zzi()) {
            if (zzfwVar.zzg().equals(str)) {
                return zzfwVar;
            }
        }
        return null;
    }

    static final Object zzC(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        com.google.android.gms.internal.measurement.zzfw zzB = zzB(zzfsVar, str);
        if (zzB == null) {
            return null;
        }
        if (zzB.zzy()) {
            return zzB.zzh();
        }
        if (zzB.zzw()) {
            return Long.valueOf(zzB.zzd());
        }
        if (zzB.zzu()) {
            return Double.valueOf(zzB.zza());
        }
        if (zzB.zzc() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.zzfw> zzi = zzB.zzi();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzi) {
            if (zzfwVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzfw zzfwVar2 : zzfwVar.zzi()) {
                    if (zzfwVar2.zzy()) {
                        bundle.putString(zzfwVar2.zzg(), zzfwVar2.zzh());
                    } else if (zzfwVar2.zzw()) {
                        bundle.putLong(zzfwVar2.zzg(), zzfwVar2.zzd());
                    } else if (zzfwVar2.zzu()) {
                        bundle.putDouble(zzfwVar2.zzg(), zzfwVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void zzD(StringBuilder sb2, int i11, List list) {
        if (list == null) {
            return;
        }
        int i12 = i11 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it.next();
            if (zzfwVar != null) {
                zzF(sb2, i12);
                sb2.append("param {\n");
                zzI(sb2, i12, AppMeasurementSdk.ConditionalUserProperty.NAME, zzfwVar.zzx() ? this.zzs.zzj().zze(zzfwVar.zzg()) : null);
                zzI(sb2, i12, "string_value", zzfwVar.zzy() ? zzfwVar.zzh() : null);
                zzI(sb2, i12, "int_value", zzfwVar.zzw() ? Long.valueOf(zzfwVar.zzd()) : null);
                zzI(sb2, i12, "double_value", zzfwVar.zzu() ? Double.valueOf(zzfwVar.zza()) : null);
                if (zzfwVar.zzc() > 0) {
                    zzD(sb2, i12, zzfwVar.zzi());
                }
                zzF(sb2, i12);
                sb2.append("}\n");
            }
        }
    }

    private final void zzE(StringBuilder sb2, int i11, com.google.android.gms.internal.measurement.zzel zzelVar) {
        String str;
        if (zzelVar == null) {
            return;
        }
        zzF(sb2, i11);
        sb2.append("filter {\n");
        if (zzelVar.zzh()) {
            zzI(sb2, i11, "complement", Boolean.valueOf(zzelVar.zzg()));
        }
        if (zzelVar.zzj()) {
            zzI(sb2, i11, "param_name", this.zzs.zzj().zze(zzelVar.zze()));
        }
        if (zzelVar.zzk()) {
            int i12 = i11 + 1;
            com.google.android.gms.internal.measurement.zzex zzd = zzelVar.zzd();
            if (zzd != null) {
                zzF(sb2, i12);
                sb2.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzI(sb2, i12, "match_type", str);
                }
                if (zzd.zzh()) {
                    zzI(sb2, i12, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    zzI(sb2, i12, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    zzF(sb2, i11 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        zzF(sb2, i11 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                zzF(sb2, i12);
                sb2.append("}\n");
            }
        }
        if (zzelVar.zzi()) {
            zzJ(sb2, i11 + 1, "number_filter", zzelVar.zzc());
        }
        zzF(sb2, i11);
        sb2.append("}\n");
    }

    private static final void zzF(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
    }

    private static final String zzG(boolean z11, boolean z12, boolean z13) {
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            sb2.append("Dynamic ");
        }
        if (z12) {
            sb2.append("Sequence ");
        }
        if (z13) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void zzH(StringBuilder sb2, int i11, String str, com.google.android.gms.internal.measurement.zzgh zzghVar) {
        if (zzghVar == null) {
            return;
        }
        zzF(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzghVar.zzb() != 0) {
            zzF(sb2, 4);
            sb2.append("results: ");
            int i12 = 0;
            for (Long l11 : zzghVar.zzk()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (zzghVar.zzd() != 0) {
            zzF(sb2, 4);
            sb2.append("status: ");
            int i14 = 0;
            for (Long l12 : zzghVar.zzn()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l12);
                i14 = i15;
            }
            sb2.append('\n');
        }
        if (zzghVar.zza() != 0) {
            zzF(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i16 = 0;
            for (com.google.android.gms.internal.measurement.zzfq zzfqVar : zzghVar.zzj()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzfqVar.zzh() ? Integer.valueOf(zzfqVar.zza()) : null);
                sb2.append(ProductContainerDTO.RATIO_DELIMITER);
                sb2.append(zzfqVar.zzg() ? Long.valueOf(zzfqVar.zzb()) : null);
                i16 = i17;
            }
            sb2.append("}\n");
        }
        if (zzghVar.zzc() != 0) {
            zzF(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i18 = 0;
            for (com.google.android.gms.internal.measurement.zzgj zzgjVar : zzghVar.zzm()) {
                int i19 = i18 + 1;
                if (i18 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzgjVar.zzi() ? Integer.valueOf(zzgjVar.zzb()) : null);
                sb2.append(": [");
                Iterator it = zzgjVar.zzf().iterator();
                int i21 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i22 = i21 + 1;
                    if (i21 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i21 = i22;
                }
                sb2.append("]");
                i18 = i19;
            }
            sb2.append("}\n");
        }
        zzF(sb2, 3);
        sb2.append("}\n");
    }

    private static final void zzI(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzF(sb2, i11 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void zzJ(StringBuilder sb2, int i11, String str, com.google.android.gms.internal.measurement.zzeq zzeqVar) {
        if (zzeqVar == null) {
            return;
        }
        zzF(sb2, i11);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzeqVar.zzg()) {
            int zzm = zzeqVar.zzm();
            zzI(sb2, i11, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzeqVar.zzi()) {
            zzI(sb2, i11, "match_as_float", Boolean.valueOf(zzeqVar.zzf()));
        }
        if (zzeqVar.zzh()) {
            zzI(sb2, i11, "comparison_value", zzeqVar.zzc());
        }
        if (zzeqVar.zzk()) {
            zzI(sb2, i11, "min_comparison_value", zzeqVar.zze());
        }
        if (zzeqVar.zzj()) {
            zzI(sb2, i11, "max_comparison_value", zzeqVar.zzd());
        }
        zzF(sb2, i11);
        sb2.append("}\n");
    }

    static int zza(com.google.android.gms.internal.measurement.zzgb zzgbVar, String str) {
        if (zzgbVar != null) {
            for (int i11 = 0; i11 < zzgbVar.zzb(); i11++) {
                if (str.equals(zzgbVar.zzap(i11).zzf())) {
                    return i11;
                }
            }
        }
        return -1;
    }

    static com.google.android.gms.internal.measurement.zzli zzl(com.google.android.gms.internal.measurement.zzli zzliVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzkm {
        com.google.android.gms.internal.measurement.zzjo zzb = com.google.android.gms.internal.measurement.zzjo.zzb();
        return zzb != null ? zzliVar.zzaA(bArr, zzb) : zzliVar.zzaz(bArr);
    }

    static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            long j11 = 0;
            for (int i12 = 0; i12 < 64; i12++) {
                int i13 = (i11 * 64) + i12;
                if (i13 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i13)) {
                    j11 |= 1 << i12;
                }
            }
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    static boolean zzv(List list, int i11) {
        if (i11 < list.size() * 64) {
            return ((1 << (i11 % 64)) & ((Long) list.get(i11 / 64)).longValue()) != 0;
        }
        return false;
    }

    static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static final void zzz(com.google.android.gms.internal.measurement.zzfr zzfrVar, String str, Object obj) {
        List zzp = zzfrVar.zzp();
        int i11 = 0;
        while (true) {
            if (i11 >= zzp.size()) {
                i11 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfw) zzp.get(i11)).zzg())) {
                break;
            } else {
                i11++;
            }
        }
        com.google.android.gms.internal.measurement.zzfv zze = com.google.android.gms.internal.measurement.zzfw.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i11 >= 0) {
            zzfrVar.zzj(i11, zze);
        } else {
            zzfrVar.zze(zze);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkz
    protected final boolean zzb() {
        return false;
    }

    final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest zzF = zzlt.zzF();
        if (zzF != null) {
            return zzlt.zzp(zzF.digest(bArr));
        }
        C3661l.b(this.zzs, "Failed to get MD5");
        return 0L;
    }

    final Bundle zzf(Map map, boolean z11) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z11) {
                zzpd.zzc();
                if (this.zzs.zzf().zzs(null, zzen.zzam)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        arrayList2.add(zzf((Map) arrayList.get(i11), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        arrayList4.add(zzf((Map) arrayList3.get(i12), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    final Parcelable zzh(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzs.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    final zzaw zzi(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle zzf = zzf(zzaaVar.zze(), true);
        String obj2 = (!zzf.containsKey("_o") || (obj = zzf.get("_o")) == null) ? "app" : obj.toString();
        String zzb = zzhh.zzb(zzaaVar.zzd());
        if (zzb == null) {
            zzb = zzaaVar.zzd();
        }
        return new zzaw(zzb, new zzau(zzf), obj2, zzaaVar.zza());
    }

    final com.google.android.gms.internal.measurement.zzfs zzj(zzar zzarVar) {
        com.google.android.gms.internal.measurement.zzfr zze = com.google.android.gms.internal.measurement.zzfs.zze();
        zze.zzl(zzarVar.zze);
        zzat zzatVar = new zzat(zzarVar.zzf);
        while (zzatVar.hasNext()) {
            String next = zzatVar.next();
            com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
            zze2.zzj(next);
            Object zzf = zzarVar.zzf.zzf(next);
            Preconditions.checkNotNull(zzf);
            zzt(zze2, zzf);
            zze.zze(zze2);
        }
        return (com.google.android.gms.internal.measurement.zzfs) zze.zzaE();
    }

    final String zzm(com.google.android.gms.internal.measurement.zzga zzgaVar) {
        if (zzgaVar == null) {
            return "";
        }
        StringBuilder e11 = C3261b.e("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzgc zzgcVar : zzgaVar.zzd()) {
            if (zzgcVar != null) {
                zzF(e11, 1);
                e11.append("bundle {\n");
                if (zzgcVar.zzbm()) {
                    zzI(e11, 1, "protocol_version", Integer.valueOf(zzgcVar.zzd()));
                }
                zzps.zzc();
                if (this.zzs.zzf().zzs(null, zzen.zzaH) && zzgcVar.zzbp()) {
                    zzI(e11, 1, "session_stitching_token", zzgcVar.zzL());
                }
                zzI(e11, 1, "platform", zzgcVar.zzJ());
                if (zzgcVar.zzbi()) {
                    zzI(e11, 1, "gmp_version", Long.valueOf(zzgcVar.zzn()));
                }
                if (zzgcVar.zzbt()) {
                    zzI(e11, 1, "uploading_gmp_version", Long.valueOf(zzgcVar.zzs()));
                }
                if (zzgcVar.zzbg()) {
                    zzI(e11, 1, "dynamite_version", Long.valueOf(zzgcVar.zzk()));
                }
                if (zzgcVar.zzbd()) {
                    zzI(e11, 1, "config_version", Long.valueOf(zzgcVar.zzi()));
                }
                zzI(e11, 1, "gmp_app_id", zzgcVar.zzG());
                zzI(e11, 1, "admob_app_id", zzgcVar.zzx());
                zzI(e11, 1, "app_id", zzgcVar.zzy());
                zzI(e11, 1, "app_version", zzgcVar.zzB());
                if (zzgcVar.zzbb()) {
                    zzI(e11, 1, "app_version_major", Integer.valueOf(zzgcVar.zza()));
                }
                zzI(e11, 1, "firebase_instance_id", zzgcVar.zzF());
                if (zzgcVar.zzbf()) {
                    zzI(e11, 1, "dev_cert_hash", Long.valueOf(zzgcVar.zzj()));
                }
                zzI(e11, 1, "app_store", zzgcVar.zzA());
                if (zzgcVar.zzbs()) {
                    zzI(e11, 1, "upload_timestamp_millis", Long.valueOf(zzgcVar.zzr()));
                }
                if (zzgcVar.zzbq()) {
                    zzI(e11, 1, "start_timestamp_millis", Long.valueOf(zzgcVar.zzq()));
                }
                if (zzgcVar.zzbh()) {
                    zzI(e11, 1, "end_timestamp_millis", Long.valueOf(zzgcVar.zzm()));
                }
                if (zzgcVar.zzbl()) {
                    zzI(e11, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgcVar.zzp()));
                }
                if (zzgcVar.zzbk()) {
                    zzI(e11, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgcVar.zzo()));
                }
                zzI(e11, 1, "app_instance_id", zzgcVar.zzz());
                zzI(e11, 1, "resettable_device_id", zzgcVar.zzK());
                zzI(e11, 1, "ds_id", zzgcVar.zzE());
                if (zzgcVar.zzbj()) {
                    zzI(e11, 1, "limited_ad_tracking", Boolean.valueOf(zzgcVar.zzaY()));
                }
                zzI(e11, 1, "os_version", zzgcVar.zzI());
                zzI(e11, 1, "device_model", zzgcVar.zzD());
                zzI(e11, 1, "user_default_language", zzgcVar.zzM());
                if (zzgcVar.zzbr()) {
                    zzI(e11, 1, "time_zone_offset_minutes", Integer.valueOf(zzgcVar.zzf()));
                }
                if (zzgcVar.zzbc()) {
                    zzI(e11, 1, "bundle_sequential_index", Integer.valueOf(zzgcVar.zzb()));
                }
                if (zzgcVar.zzbo()) {
                    zzI(e11, 1, "service_upload", Boolean.valueOf(zzgcVar.zzaZ()));
                }
                zzI(e11, 1, "health_monitor", zzgcVar.zzH());
                if (!this.zzs.zzf().zzs(null, zzen.zzah) && zzgcVar.zzba() && zzgcVar.zzh() != 0) {
                    zzI(e11, 1, "android_id", Long.valueOf(zzgcVar.zzh()));
                }
                if (zzgcVar.zzbn()) {
                    zzI(e11, 1, "retry_counter", Integer.valueOf(zzgcVar.zze()));
                }
                if (zzgcVar.zzbe()) {
                    zzI(e11, 1, "consent_signals", zzgcVar.zzC());
                }
                List<com.google.android.gms.internal.measurement.zzgl> zzP = zzgcVar.zzP();
                if (zzP != null) {
                    for (com.google.android.gms.internal.measurement.zzgl zzglVar : zzP) {
                        if (zzglVar != null) {
                            zzF(e11, 2);
                            e11.append("user_property {\n");
                            zzI(e11, 2, "set_timestamp_millis", zzglVar.zzs() ? Long.valueOf(zzglVar.zzc()) : null);
                            zzI(e11, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzs.zzj().zzf(zzglVar.zzf()));
                            zzI(e11, 2, "string_value", zzglVar.zzg());
                            zzI(e11, 2, "int_value", zzglVar.zzr() ? Long.valueOf(zzglVar.zzb()) : null);
                            zzI(e11, 2, "double_value", zzglVar.zzq() ? Double.valueOf(zzglVar.zza()) : null);
                            zzF(e11, 2);
                            e11.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfo> zzN = zzgcVar.zzN();
                if (zzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfo zzfoVar : zzN) {
                        if (zzfoVar != null) {
                            zzF(e11, 2);
                            e11.append("audience_membership {\n");
                            if (zzfoVar.zzk()) {
                                zzI(e11, 2, "audience_id", Integer.valueOf(zzfoVar.zza()));
                            }
                            if (zzfoVar.zzm()) {
                                zzI(e11, 2, "new_audience", Boolean.valueOf(zzfoVar.zzj()));
                            }
                            zzH(e11, 2, "current_data", zzfoVar.zzd());
                            if (zzfoVar.zzn()) {
                                zzH(e11, 2, "previous_data", zzfoVar.zze());
                            }
                            zzF(e11, 2);
                            e11.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfs> zzO = zzgcVar.zzO();
                if (zzO != null) {
                    for (com.google.android.gms.internal.measurement.zzfs zzfsVar : zzO) {
                        if (zzfsVar != null) {
                            zzF(e11, 2);
                            e11.append("event {\n");
                            zzI(e11, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzs.zzj().zzd(zzfsVar.zzh()));
                            if (zzfsVar.zzu()) {
                                zzI(e11, 2, "timestamp_millis", Long.valueOf(zzfsVar.zzd()));
                            }
                            if (zzfsVar.zzt()) {
                                zzI(e11, 2, "previous_timestamp_millis", Long.valueOf(zzfsVar.zzc()));
                            }
                            if (zzfsVar.zzs()) {
                                zzI(e11, 2, "count", Integer.valueOf(zzfsVar.zza()));
                            }
                            if (zzfsVar.zzb() != 0) {
                                zzD(e11, 2, zzfsVar.zzi());
                            }
                            zzF(e11, 2);
                            e11.append("}\n");
                        }
                    }
                }
                zzF(e11, 1);
                e11.append("}\n");
            }
        }
        e11.append("}\n");
        return e11.toString();
    }

    final String zzo(com.google.android.gms.internal.measurement.zzej zzejVar) {
        if (zzejVar == null) {
            return "null";
        }
        StringBuilder e11 = C3261b.e("\nevent_filter {\n");
        if (zzejVar.zzp()) {
            zzI(e11, 0, "filter_id", Integer.valueOf(zzejVar.zzb()));
        }
        zzI(e11, 0, "event_name", this.zzs.zzj().zzd(zzejVar.zzg()));
        String zzG = zzG(zzejVar.zzk(), zzejVar.zzm(), zzejVar.zzn());
        if (!zzG.isEmpty()) {
            zzI(e11, 0, "filter_type", zzG);
        }
        if (zzejVar.zzo()) {
            zzJ(e11, 1, "event_count_filter", zzejVar.zzf());
        }
        if (zzejVar.zza() > 0) {
            e11.append("  filters {\n");
            Iterator it = zzejVar.zzh().iterator();
            while (it.hasNext()) {
                zzE(e11, 2, (com.google.android.gms.internal.measurement.zzel) it.next());
            }
        }
        zzF(e11, 1);
        e11.append("}\n}\n");
        return e11.toString();
    }

    final String zzp(com.google.android.gms.internal.measurement.zzes zzesVar) {
        if (zzesVar == null) {
            return "null";
        }
        StringBuilder e11 = C3261b.e("\nproperty_filter {\n");
        if (zzesVar.zzj()) {
            zzI(e11, 0, "filter_id", Integer.valueOf(zzesVar.zza()));
        }
        zzI(e11, 0, "property_name", this.zzs.zzj().zzf(zzesVar.zze()));
        String zzG = zzG(zzesVar.zzg(), zzesVar.zzh(), zzesVar.zzi());
        if (!zzG.isEmpty()) {
            zzI(e11, 0, "filter_type", zzG);
        }
        zzE(e11, 1, zzesVar.zzb());
        e11.append("}\n");
        return e11.toString();
    }

    final List zzq(List list, List list2) {
        int i11;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzs.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i12 = size2;
            i11 = size;
            size = i12;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r7 >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r4.add(zzs((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        r0.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r7 >= r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        r4.add(zzs((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        r4.add(zzs((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Map zzs(Bundle bundle, boolean z11) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            zzpd.zzc();
            if (this.zzs.zzf().zzs(null, zzen.zzam)) {
                if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                    if (obj == null) {
                        hashMap.put(next, obj);
                    }
                }
            } else if (!(obj instanceof Bundle[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj == null) {
                }
            }
        }
        return hashMap;
    }

    final void zzt(com.google.android.gms.internal.measurement.zzfv zzfvVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfvVar.zzg();
        zzfvVar.zze();
        zzfvVar.zzd();
        zzfvVar.zzf();
        if (obj instanceof String) {
            zzfvVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfvVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfvVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzfv zze = com.google.android.gms.internal.measurement.zzfw.zze();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                    zze2.zzj(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zze2.zzi(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zze2.zzk((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zze2.zzh(((Double) obj2).doubleValue());
                    }
                    zze.zzc(zze2);
                }
                if (zze.zza() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzfw) zze.zzaE());
                }
            }
        }
        zzfvVar.zzb(arrayList);
    }

    final void zzu(com.google.android.gms.internal.measurement.zzgk zzgkVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzgkVar.zzc();
        zzgkVar.zzb();
        zzgkVar.zza();
        if (obj instanceof String) {
            zzgkVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzgkVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgkVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final boolean zzw(long j11, long j12) {
        return j11 == 0 || j12 <= 0 || Math.abs(this.zzs.zzav().currentTimeMillis() - j11) > j12;
    }

    final byte[] zzy(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            this.zzs.zzay().zzd().zzb("Failed to gzip content", e11);
            throw e11;
        }
    }
}
