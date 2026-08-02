package com.google.android.gms.measurement.internal;

import E9.a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhe;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzlr;
import com.google.android.gms.internal.measurement.zznl;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrb;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public final class X6 extends D6 {
    public X6(S6 s62) {
        super(s62);
    }

    public static final String A(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final Object B(zzhw zzhwVar) {
        if (zzhwVar.zzc()) {
            return zzhwVar.zzd();
        }
        if (zzhwVar.zze()) {
            return Long.valueOf(zzhwVar.zzf());
        }
        if (zzhwVar.zzi()) {
            return Double.valueOf(zzhwVar.zzj());
        }
        if (zzhwVar.zzm() > 0) {
            return Y(zzhwVar.zzk());
        }
        return null;
    }

    public static final void C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z(builder, str3, string, set);
            }
        }
    }

    public static final void D(StringBuilder sb2, int i10, String str, zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        y(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zziiVar.zzd() != 0) {
            y(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : zziiVar.zzc()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zziiVar.zzb() != 0) {
            y(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : zziiVar.zza()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (zziiVar.zzf() != 0) {
            y(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (zzhq zzhqVar : zziiVar.zze()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzhqVar.zza() ? Integer.valueOf(zzhqVar.zzb()) : null);
                sb2.append(":");
                sb2.append(zzhqVar.zzc() ? Long.valueOf(zzhqVar.zzd()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (zziiVar.zzh() != 0) {
            y(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (zzik zzikVar : zziiVar.zzg()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzikVar.zza() ? Integer.valueOf(zzikVar.zzb()) : null);
                sb2.append(": [");
                Iterator it = zzikVar.zzc().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        y(sb2, 3);
        sb2.append("}\n");
    }

    public static final void E(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void F(StringBuilder sb2, int i10, String str, zzfl zzflVar) {
        if (zzflVar == null) {
            return;
        }
        y(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzflVar.zza()) {
            int zzm = zzflVar.zzm();
            E(sb2, i10, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzflVar.zzb()) {
            E(sb2, i10, "match_as_float", Boolean.valueOf(zzflVar.zzc()));
        }
        if (zzflVar.zzd()) {
            E(sb2, i10, "comparison_value", zzflVar.zze());
        }
        if (zzflVar.zzf()) {
            E(sb2, i10, "min_comparison_value", zzflVar.zzg());
        }
        if (zzflVar.zzh()) {
            E(sb2, i10, "max_comparison_value", zzflVar.zzi());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }

    public static boolean O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean P(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static List Q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static zznl W(zznl zznlVar, byte[] bArr) {
        zzlr zza = zzlr.zza();
        return zza != null ? zznlVar.zzaV(bArr, zza) : zznlVar.zzaW(bArr);
    }

    public static int X(zzic zzicVar, String str) {
        for (int i10 = 0; i10 < zzicVar.zzl(); i10++) {
            if (str.equals(zzicVar.zzm(i10).zzc())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle[] Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            if (zzhwVar != null) {
                Bundle bundle = new Bundle();
                for (zzhw zzhwVar2 : zzhwVar.zzk()) {
                    if (zzhwVar2.zzc()) {
                        bundle.putString(zzhwVar2.zzb(), zzhwVar2.zzd());
                    } else if (zzhwVar2.zze()) {
                        bundle.putLong(zzhwVar2.zzb(), zzhwVar2.zzf());
                    } else if (zzhwVar2.zzi()) {
                        bundle.putDouble(zzhwVar2.zzb(), zzhwVar2.zzj());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void o(zzhr zzhrVar, String str, Object obj) {
        List zza = zzhrVar.zza();
        int i10 = 0;
        while (true) {
            if (i10 >= zza.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((zzhw) zza.get(i10)).zzb())) {
                break;
            } else {
                i10++;
            }
        }
        zzhv zzn = zzhw.zzn();
        zzn.zzb(str);
        zzn.zzf(((Long) obj).longValue());
        if (i10 >= 0) {
            zzhrVar.zze(i10, zzn);
        } else {
            zzhrVar.zzg(zzn);
        }
    }

    public static final boolean p(zzbg zzbgVar, zzr zzrVar) {
        AbstractC3191o.m(zzbgVar);
        AbstractC3191o.m(zzrVar);
        return !TextUtils.isEmpty(zzrVar.f34463b);
    }

    public static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            String zzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putDouble(zzb, zzhwVar.zzj());
            } else if (zzhwVar.zzg()) {
                bundle.putFloat(zzb, zzhwVar.zzh());
            } else if (zzhwVar.zzc()) {
                bundle.putString(zzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putLong(zzb, zzhwVar.zzf());
            }
        }
        return bundle;
    }

    public static final zzhw r(zzhs zzhsVar, String str) {
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    public static final Map s(zzhs zzhsVar, String... strArr) {
        Object B10;
        HashMap hashMap = new HashMap();
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (Arrays.asList(strArr).contains(zzhwVar.zzb()) && (B10 = B(zzhwVar)) != null) {
                hashMap.put(zzhwVar.zzb(), B10);
            }
        }
        return hashMap;
    }

    public static final Map t(zzhs zzhsVar, String str) {
        Object B10;
        HashMap hashMap = new HashMap();
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().startsWith("gad_") && (B10 = B(zzhwVar)) != null) {
                hashMap.put(zzhwVar.zzb(), B10);
            }
        }
        return hashMap;
    }

    public static final Object u(zzhs zzhsVar, String str) {
        zzhw r10 = r(zzhsVar, str);
        if (r10 == null) {
            return null;
        }
        return B(r10);
    }

    public static final Object v(zzhs zzhsVar, String str, Object obj) {
        Object u10 = u(zzhsVar, str);
        return u10 == null ? obj : u10;
    }

    public static final void y(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static final void z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final void G(zzit zzitVar, Object obj) {
        AbstractC3191o.m(obj);
        zzitVar.zzd();
        zzitVar.zzf();
        zzitVar.zzh();
        if (obj instanceof String) {
            zzitVar.zzc((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzitVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzitVar.zzg(((Double) obj).doubleValue());
        } else {
            this.f33578a.a().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void H(zzhv zzhvVar, Object obj) {
        AbstractC3191o.m(obj);
        zzhvVar.zze();
        zzhvVar.zzg();
        zzhvVar.zzi();
        zzhvVar.zzm();
        if (obj instanceof String) {
            zzhvVar.zzd((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhvVar.zzf(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzhvVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f33578a.a().o().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzhv zzn = zzhw.zzn();
                for (String str : bundle.keySet()) {
                    zzhv zzn2 = zzhw.zzn();
                    zzn2.zzb(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzn2.zzf(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzn2.zzd((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzn2.zzh(((Double) obj2).doubleValue());
                    }
                    zzn.zzk(zzn2);
                }
                if (zzn.zzj() > 0) {
                    arrayList.add((zzhw) zzn.zzbc());
                }
            }
        }
        zzhvVar.zzl(arrayList);
    }

    public final zzoh I(String str, zzic zzicVar, zzhr zzhrVar, String str2) {
        int indexOf;
        zzqp.zza();
        C3298l3 c3298l3 = this.f33578a;
        if (!c3298l3.w().H(str, AbstractC3209a2.f33833Q0)) {
            return null;
        }
        long a10 = c3298l3.e().a();
        Set a11 = W6.a(c3298l3.w().C(str, AbstractC3209a2.f33907v0).split(","));
        S6 s62 = this.f34418b;
        F6 C02 = s62.C0();
        String x10 = C02.f34418b.D0().x(str);
        Uri.Builder builder = new Uri.Builder();
        C3298l3 c3298l32 = C02.f33578a;
        builder.scheme(c3298l32.w().C(str, AbstractC3209a2.f33893o0));
        if (TextUtils.isEmpty(x10)) {
            builder.authority(c3298l32.w().C(str, AbstractC3209a2.f33895p0));
        } else {
            String C10 = c3298l32.w().C(str, AbstractC3209a2.f33895p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(x10).length() + 1 + String.valueOf(C10).length());
            sb2.append(x10);
            sb2.append(".");
            sb2.append(C10);
            builder.authority(sb2.toString());
        }
        builder.path(c3298l32.w().C(str, AbstractC3209a2.f33897q0));
        z(builder, "gmp_app_id", zzicVar.zzac(), a11);
        c3298l3.w().A();
        z(builder, "gmp_version", String.valueOf(133005L), a11);
        String zzV = zzicVar.zzV();
        C3286k w10 = c3298l3.w();
        Z1 z12 = AbstractC3209a2.f33839T0;
        if (w10.H(str, z12) && s62.D0().N(str)) {
            zzV = "";
        }
        z(builder, "app_instance_id", zzV, a11);
        z(builder, "rdid", zzicVar.zzP(), a11);
        z(builder, "bundle_id", zzicVar.zzK(), a11);
        String zzk = zzhrVar.zzk();
        String a12 = W3.a(zzk);
        if (true != TextUtils.isEmpty(a12)) {
            zzk = a12;
        }
        z(builder, "app_event_name", zzk, a11);
        z(builder, PublisherMetadata.APP_VERSION, String.valueOf(zzicVar.zzai()), a11);
        String zzD = zzicVar.zzD();
        if (c3298l3.w().H(str, z12) && s62.D0().K(str) && !TextUtils.isEmpty(zzD) && (indexOf = zzD.indexOf(".")) != -1) {
            zzD = zzD.substring(0, indexOf);
        }
        z(builder, PublisherMetadata.OS_VERSION, zzD, a11);
        z(builder, EventKeys.TIMESTAMP, String.valueOf(zzhrVar.zzn()), a11);
        if (zzicVar.zzS()) {
            z(builder, "lat", "1", a11);
        }
        z(builder, "privacy_sandbox_version", String.valueOf(zzicVar.zzaG()), a11);
        z(builder, "trigger_uri_source", "1", a11);
        z(builder, "trigger_uri_timestamp", String.valueOf(a10), a11);
        z(builder, "request_uuid", str2, a11);
        List<zzhw> zza = zzhrVar.zza();
        Bundle bundle = new Bundle();
        for (zzhw zzhwVar : zza) {
            String zzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzj()));
            } else if (zzhwVar.zzg()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzh()));
            } else if (zzhwVar.zzc()) {
                bundle.putString(zzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzf()));
            }
        }
        C(builder, c3298l3.w().C(str, AbstractC3209a2.f33905u0).split("\\|"), bundle, a11);
        List<zziu> zzk2 = zzicVar.zzk();
        Bundle bundle2 = new Bundle();
        for (zziu zziuVar : zzk2) {
            String zzc = zziuVar.zzc();
            if (zziuVar.zzj()) {
                bundle2.putString(zzc, String.valueOf(zziuVar.zzk()));
            } else if (zziuVar.zzh()) {
                bundle2.putString(zzc, String.valueOf(zziuVar.zzi()));
            } else if (zziuVar.zzd()) {
                bundle2.putString(zzc, zziuVar.zze());
            } else if (zziuVar.zzf()) {
                bundle2.putString(zzc, String.valueOf(zziuVar.zzg()));
            }
        }
        C(builder, c3298l3.w().C(str, AbstractC3209a2.f33903t0).split("\\|"), bundle2, a11);
        z(builder, "dma", true != zzicVar.zzaC() ? "0" : "1", a11);
        if (!zzicVar.zzaE().isEmpty()) {
            z(builder, "dma_cps", zzicVar.zzaE(), a11);
        }
        if (zzicVar.zzaK()) {
            zzha zzaL = zzicVar.zzaL();
            if (!zzaL.zzb().isEmpty()) {
                z(builder, "dl_gclid", zzaL.zzb(), a11);
            }
            if (!zzaL.zzd().isEmpty()) {
                z(builder, "dl_gbraid", zzaL.zzd(), a11);
            }
            if (!zzaL.zzf().isEmpty()) {
                z(builder, "dl_gs", zzaL.zzf(), a11);
            }
            if (zzaL.zzh() > 0) {
                z(builder, "dl_ss_ts", String.valueOf(zzaL.zzh()), a11);
            }
            if (!zzaL.zzj().isEmpty()) {
                z(builder, "mr_gclid", zzaL.zzj(), a11);
            }
            if (!zzaL.zzm().isEmpty()) {
                z(builder, "mr_gbraid", zzaL.zzm(), a11);
            }
            if (!zzaL.zzo().isEmpty()) {
                z(builder, "mr_gs", zzaL.zzo(), a11);
            }
            if (zzaL.zzq() > 0) {
                z(builder, "mr_click_ts", String.valueOf(zzaL.zzq()), a11);
            }
        }
        return new zzoh(builder.build().toString(), a10, 1);
    }

    public final zzhs J(A a10) {
        zzhr zzk = zzhs.zzk();
        zzk.zzq(a10.f33265e);
        zzbe zzbeVar = a10.f33266f;
        C c10 = new C(zzbeVar);
        while (c10.hasNext()) {
            String next = c10.next();
            zzhv zzn = zzhw.zzn();
            zzn.zzb(next);
            Object g10 = zzbeVar.g(next);
            AbstractC3191o.m(g10);
            H(zzn, g10);
            zzk.zzg(zzn);
        }
        String str = a10.f33263c;
        if (!TextUtils.isEmpty(str) && zzbeVar.g("_o") == null) {
            zzhv zzn2 = zzhw.zzn();
            zzn2.zzb("_o");
            zzn2.zzd(str);
            zzk.zzf((zzhw) zzn2.zzbc());
        }
        return (zzhs) zzk.zzbc();
    }

    public final String K(zzib zzibVar) {
        zzhe zzat;
        if (zzibVar == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (zzibVar.zzf()) {
            E(sb2, 0, "upload_subdomain", zzibVar.zzg());
        }
        if (zzibVar.zzd()) {
            E(sb2, 0, "sgtm_join_id", zzibVar.zze());
        }
        for (zzid zzidVar : zzibVar.zza()) {
            if (zzidVar != null) {
                y(sb2, 1);
                sb2.append("bundle {\n");
                if (zzidVar.zza()) {
                    E(sb2, 1, "protocol_version", Integer.valueOf(zzidVar.zzb()));
                }
                zzrb.zza();
                C3298l3 c3298l3 = this.f33578a;
                if (c3298l3.w().H(zzidVar.zzA(), AbstractC3209a2.f33827N0) && zzidVar.zzag()) {
                    E(sb2, 1, "session_stitching_token", zzidVar.zzah());
                }
                E(sb2, 1, EventKeys.PLATFORM, zzidVar.zzt());
                if (zzidVar.zzC()) {
                    E(sb2, 1, "gmp_version", Long.valueOf(zzidVar.zzD()));
                }
                if (zzidVar.zzE()) {
                    E(sb2, 1, "uploading_gmp_version", Long.valueOf(zzidVar.zzF()));
                }
                if (zzidVar.zzac()) {
                    E(sb2, 1, "dynamite_version", Long.valueOf(zzidVar.zzad()));
                }
                if (zzidVar.zzW()) {
                    E(sb2, 1, "config_version", Long.valueOf(zzidVar.zzX()));
                }
                E(sb2, 1, "gmp_app_id", zzidVar.zzP());
                E(sb2, 1, PublisherMetadata.APP_ID, zzidVar.zzA());
                E(sb2, 1, PublisherMetadata.APP_VERSION, zzidVar.zzB());
                if (zzidVar.zzU()) {
                    E(sb2, 1, "app_version_major", Integer.valueOf(zzidVar.zzV()));
                }
                E(sb2, 1, "firebase_instance_id", zzidVar.zzT());
                if (zzidVar.zzK()) {
                    E(sb2, 1, "dev_cert_hash", Long.valueOf(zzidVar.zzL()));
                }
                E(sb2, 1, "app_store", zzidVar.zzz());
                if (zzidVar.zzi()) {
                    E(sb2, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.zzj()));
                }
                if (zzidVar.zzk()) {
                    E(sb2, 1, "start_timestamp_millis", Long.valueOf(zzidVar.zzm()));
                }
                if (zzidVar.zzn()) {
                    E(sb2, 1, "end_timestamp_millis", Long.valueOf(zzidVar.zzo()));
                }
                if (zzidVar.zzp()) {
                    E(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.zzq()));
                }
                if (zzidVar.zzr()) {
                    E(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.zzs()));
                }
                E(sb2, 1, "app_instance_id", zzidVar.zzJ());
                E(sb2, 1, "resettable_device_id", zzidVar.zzG());
                E(sb2, 1, "ds_id", zzidVar.zzZ());
                if (zzidVar.zzH()) {
                    E(sb2, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.zzI()));
                }
                E(sb2, 1, PublisherMetadata.OS_VERSION, zzidVar.zzu());
                E(sb2, 1, PublisherMetadata.DEVICE_MODEL, zzidVar.zzv());
                E(sb2, 1, "user_default_language", zzidVar.zzw());
                if (zzidVar.zzx()) {
                    E(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.zzy()));
                }
                if (zzidVar.zzM()) {
                    E(sb2, 1, "bundle_sequential_index", Integer.valueOf(zzidVar.zzN()));
                }
                if (zzidVar.zzau()) {
                    E(sb2, 1, "delivery_index", Integer.valueOf(zzidVar.zzav()));
                }
                if (zzidVar.zzQ()) {
                    E(sb2, 1, "service_upload", Boolean.valueOf(zzidVar.zzR()));
                }
                E(sb2, 1, "health_monitor", zzidVar.zzO());
                if (zzidVar.zzaa()) {
                    E(sb2, 1, "retry_counter", Integer.valueOf(zzidVar.zzab()));
                }
                if (zzidVar.zzae()) {
                    E(sb2, 1, "consent_signals", zzidVar.zzaf());
                }
                if (zzidVar.zzan()) {
                    E(sb2, 1, "is_dma_region", Boolean.valueOf(zzidVar.zzao()));
                }
                if (zzidVar.zzap()) {
                    E(sb2, 1, "core_platform_services", zzidVar.zzaq());
                }
                if (zzidVar.zzal()) {
                    E(sb2, 1, "consent_diagnostics", zzidVar.zzam());
                }
                if (zzidVar.zzai()) {
                    E(sb2, 1, "target_os_version", Long.valueOf(zzidVar.zzaj()));
                }
                zzqp.zza();
                if (c3298l3.w().H(zzidVar.zzA(), AbstractC3209a2.f33833Q0)) {
                    E(sb2, 1, "ad_services_version", Integer.valueOf(zzidVar.zzar()));
                    if (zzidVar.zzas() && (zzat = zzidVar.zzat()) != null) {
                        y(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        E(sb2, 2, "eligible", Boolean.valueOf(zzat.zza()));
                        E(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzat.zzb()));
                        E(sb2, 2, "pre_r", Boolean.valueOf(zzat.zzc()));
                        E(sb2, 2, "r_extensions_too_old", Boolean.valueOf(zzat.zzd()));
                        E(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(zzat.zze()));
                        E(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(zzat.zzf()));
                        E(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(zzat.zzg()));
                        y(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (zzidVar.zzaw()) {
                    zzha zzax = zzidVar.zzax();
                    y(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (zzax.zza()) {
                        E(sb2, 2, "deep_link_gclid", zzax.zzb());
                    }
                    if (zzax.zzc()) {
                        E(sb2, 2, "deep_link_gbraid", zzax.zzd());
                    }
                    if (zzax.zze()) {
                        E(sb2, 2, "deep_link_gad_source", zzax.zzf());
                    }
                    if (zzax.zzg()) {
                        E(sb2, 2, "deep_link_session_millis", Long.valueOf(zzax.zzh()));
                    }
                    if (zzax.zzi()) {
                        E(sb2, 2, "market_referrer_gclid", zzax.zzj());
                    }
                    if (zzax.zzk()) {
                        E(sb2, 2, "market_referrer_gbraid", zzax.zzm());
                    }
                    if (zzax.zzn()) {
                        E(sb2, 2, "market_referrer_gad_source", zzax.zzo());
                    }
                    if (zzax.zzp()) {
                        E(sb2, 2, "market_referrer_click_millis", Long.valueOf(zzax.zzq()));
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (zzidVar.zzaA()) {
                    E(sb2, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.zzaB()));
                }
                if (zzidVar.zzay()) {
                    zzis zzaz = zzidVar.zzaz();
                    y(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int zzf = zzaz.zzf();
                    E(sb2, 2, "upload_type", zzf != 1 ? zzf != 2 ? zzf != 3 ? zzf != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    E(sb2, 2, "client_upload_eligibility", zzaz.zza().name());
                    int zzg = zzaz.zzg();
                    E(sb2, 2, "service_upload_eligibility", zzg != 1 ? zzg != 2 ? zzg != 3 ? zzg != 4 ? zzg != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (zzidVar.zzaC()) {
                    zzho zzaD = zzidVar.zzaD();
                    y(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (zzhl zzhlVar : zzaD.zza()) {
                        y(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int zzc = zzhlVar.zzc();
                        E(sb2, 3, "type", zzc != 1 ? zzc != 2 ? zzc != 3 ? zzc != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int zzd = zzhlVar.zzd();
                        E(sb2, 3, "mode", zzd != 1 ? zzd != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        y(sb2, 3);
                        sb2.append("}\n");
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                List<zziu> zzf2 = zzidVar.zzf();
                if (zzf2 != null) {
                    for (zziu zziuVar : zzf2) {
                        if (zziuVar != null) {
                            y(sb2, 2);
                            sb2.append("user_property {\n");
                            E(sb2, 2, "set_timestamp_millis", zziuVar.zza() ? Long.valueOf(zziuVar.zzb()) : null);
                            E(sb2, 2, "name", c3298l3.D().c(zziuVar.zzc()));
                            E(sb2, 2, "string_value", zziuVar.zze());
                            E(sb2, 2, "int_value", zziuVar.zzf() ? Long.valueOf(zziuVar.zzg()) : null);
                            E(sb2, 2, "double_value", zziuVar.zzj() ? Double.valueOf(zziuVar.zzk()) : null);
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzhg> zzS = zzidVar.zzS();
                if (zzS != null) {
                    for (zzhg zzhgVar : zzS) {
                        if (zzhgVar != null) {
                            y(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (zzhgVar.zza()) {
                                E(sb2, 2, "audience_id", Integer.valueOf(zzhgVar.zzb()));
                            }
                            if (zzhgVar.zzf()) {
                                E(sb2, 2, "new_audience", Boolean.valueOf(zzhgVar.zzg()));
                            }
                            D(sb2, 2, "current_data", zzhgVar.zzc());
                            if (zzhgVar.zzd()) {
                                D(sb2, 2, "previous_data", zzhgVar.zze());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzhs> zzc2 = zzidVar.zzc();
                if (zzc2 != null) {
                    for (zzhs zzhsVar : zzc2) {
                        if (zzhsVar != null) {
                            y(sb2, 2);
                            sb2.append("event {\n");
                            E(sb2, 2, "name", c3298l3.D().a(zzhsVar.zzd()));
                            if (zzhsVar.zze()) {
                                E(sb2, 2, "timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                            }
                            if (zzhsVar.zzg()) {
                                E(sb2, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.zzh()));
                            }
                            if (zzhsVar.zzi()) {
                                E(sb2, 2, "count", Integer.valueOf(zzhsVar.zzj()));
                            }
                            if (zzhsVar.zzb() != 0) {
                                w(sb2, 2, zzhsVar.zza());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                y(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    public final String L(zzff zzffVar) {
        if (zzffVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (zzffVar.zza()) {
            E(sb2, 0, "filter_id", Integer.valueOf(zzffVar.zzb()));
        }
        E(sb2, 0, "event_name", this.f33578a.D().a(zzffVar.zzc()));
        String A10 = A(zzffVar.zzi(), zzffVar.zzj(), zzffVar.zzm());
        if (!A10.isEmpty()) {
            E(sb2, 0, "filter_type", A10);
        }
        if (zzffVar.zzg()) {
            F(sb2, 1, "event_count_filter", zzffVar.zzh());
        }
        if (zzffVar.zze() > 0) {
            sb2.append("  filters {\n");
            Iterator it = zzffVar.zzd().iterator();
            while (it.hasNext()) {
                x(sb2, 2, (zzfh) it.next());
            }
        }
        y(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    public final String M(zzfn zzfnVar) {
        if (zzfnVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (zzfnVar.zza()) {
            E(sb2, 0, "filter_id", Integer.valueOf(zzfnVar.zzb()));
        }
        E(sb2, 0, "property_name", this.f33578a.D().c(zzfnVar.zzc()));
        String A10 = A(zzfnVar.zze(), zzfnVar.zzf(), zzfnVar.zzh());
        if (!A10.isEmpty()) {
            E(sb2, 0, "filter_type", A10);
        }
        x(sb2, 1, zzfnVar.zzd());
        sb2.append("}\n");
        return sb2.toString();
    }

    public final Parcelable N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (a.C0068a unused) {
                this.f33578a.a().o().a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public final List R(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f33578a.a().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f33578a.a().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final boolean S(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f33578a.e().a() - j10) > j11;
    }

    public final long T(byte[] bArr) {
        AbstractC3191o.m(bArr);
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.C().h();
        MessageDigest C10 = b7.C();
        if (C10 != null) {
            return b7.D(C10.digest(bArr));
        }
        c3298l3.a().o().a("Failed to get MD5");
        return 0L;
    }

    public final long U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return T(str.getBytes(Charset.forName("UTF-8")));
    }

    public final byte[] V(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f33578a.a().o().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(Z((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(Z((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(Z((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map Z(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z11 = obj instanceof Parcelable[];
            if (!z11 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.measurement.internal.D6
    public final boolean l() {
        return false;
    }

    public final zzbg m(zzaa zzaaVar) {
        Object obj;
        Bundle n10 = n(zzaaVar.zzf(), true);
        String obj2 = (!n10.containsKey("_o") || (obj = n10.get("_o")) == null) ? "app" : obj.toString();
        String b10 = W3.b(zzaaVar.zzb());
        if (b10 == null) {
            b10 = zzaaVar.zzb();
        }
        return new zzbg(b10, new zzbe(n10), obj2, zzaaVar.zza());
    }

    public final Bundle n(Map map, boolean z10) {
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
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(n((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final void w(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            if (zzhwVar != null) {
                y(sb2, i11);
                sb2.append("param {\n");
                E(sb2, i11, "name", zzhwVar.zza() ? this.f33578a.D().b(zzhwVar.zzb()) : null);
                E(sb2, i11, "string_value", zzhwVar.zzc() ? zzhwVar.zzd() : null);
                E(sb2, i11, "int_value", zzhwVar.zze() ? Long.valueOf(zzhwVar.zzf()) : null);
                E(sb2, i11, "double_value", zzhwVar.zzi() ? Double.valueOf(zzhwVar.zzj()) : null);
                if (zzhwVar.zzm() > 0) {
                    w(sb2, i11, zzhwVar.zzk());
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    public final void x(StringBuilder sb2, int i10, zzfh zzfhVar) {
        String str;
        if (zzfhVar == null) {
            return;
        }
        y(sb2, i10);
        sb2.append("filter {\n");
        if (zzfhVar.zze()) {
            E(sb2, i10, "complement", Boolean.valueOf(zzfhVar.zzf()));
        }
        if (zzfhVar.zzg()) {
            E(sb2, i10, "param_name", this.f33578a.D().b(zzfhVar.zzh()));
        }
        if (zzfhVar.zza()) {
            int i11 = i10 + 1;
            zzfr zzb = zzfhVar.zzb();
            if (zzb != null) {
                y(sb2, i11);
                sb2.append("string_filter {\n");
                if (zzb.zza()) {
                    switch (zzb.zzj()) {
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
                    E(sb2, i11, "match_type", str);
                }
                if (zzb.zzb()) {
                    E(sb2, i11, "expression", zzb.zzc());
                }
                if (zzb.zzd()) {
                    E(sb2, i11, "case_sensitive", Boolean.valueOf(zzb.zze()));
                }
                if (zzb.zzg() > 0) {
                    y(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzb.zzf()) {
                        y(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                    sb2.append("}\n");
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzfhVar.zzc()) {
            F(sb2, i10 + 1, "number_filter", zzfhVar.zzd());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }
}
