package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.SieveCacheKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzpi;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzkr extends zznb {
    private static String zza(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.zznb
    protected final boolean zzc() {
        return false;
    }

    public zzkr(zznc zzncVar) {
        super(zzncVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x036b A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, SecurityException -> 0x01b7, SecurityException -> 0x051b, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x0347, B:99:0x035f, B:101:0x036b, B:102:0x03a8, B:103:0x03de, B:105:0x03e4, B:108:0x03fa, B:113:0x0405, B:115:0x0451, B:116:0x0460, B:118:0x0468, B:119:0x046b, B:121:0x0473, B:122:0x047c, B:124:0x0486, B:127:0x0494, B:128:0x0497, B:138:0x0479, B:139:0x0395, B:140:0x0272, B:146:0x051d, B:149:0x0123, B:151:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e4 A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, SecurityException -> 0x01b7, SecurityException -> 0x051b, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x0347, B:99:0x035f, B:101:0x036b, B:102:0x03a8, B:103:0x03de, B:105:0x03e4, B:108:0x03fa, B:113:0x0405, B:115:0x0451, B:116:0x0460, B:118:0x0468, B:119:0x046b, B:121:0x0473, B:122:0x047c, B:124:0x0486, B:127:0x0494, B:128:0x0497, B:138:0x0479, B:139:0x0395, B:140:0x0272, B:146:0x051d, B:149:0x0123, B:151:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0451 A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, SecurityException -> 0x01b7, SecurityException -> 0x051b, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x0347, B:99:0x035f, B:101:0x036b, B:102:0x03a8, B:103:0x03de, B:105:0x03e4, B:108:0x03fa, B:113:0x0405, B:115:0x0451, B:116:0x0460, B:118:0x0468, B:119:0x046b, B:121:0x0473, B:122:0x047c, B:124:0x0486, B:127:0x0494, B:128:0x0497, B:138:0x0479, B:139:0x0395, B:140:0x0272, B:146:0x051d, B:149:0x0123, B:151:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0468 A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, SecurityException -> 0x01b7, SecurityException -> 0x051b, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x0347, B:99:0x035f, B:101:0x036b, B:102:0x03a8, B:103:0x03de, B:105:0x03e4, B:108:0x03fa, B:113:0x0405, B:115:0x0451, B:116:0x0460, B:118:0x0468, B:119:0x046b, B:121:0x0473, B:122:0x047c, B:124:0x0486, B:127:0x0494, B:128:0x0497, B:138:0x0479, B:139:0x0395, B:140:0x0272, B:146:0x051d, B:149:0x0123, B:151:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0473 A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, SecurityException -> 0x01b7, SecurityException -> 0x051b, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x0347, B:99:0x035f, B:101:0x036b, B:102:0x03a8, B:103:0x03de, B:105:0x03e4, B:108:0x03fa, B:113:0x0405, B:115:0x0451, B:116:0x0460, B:118:0x0468, B:119:0x046b, B:121:0x0473, B:122:0x047c, B:124:0x0486, B:127:0x0494, B:128:0x0497, B:138:0x0479, B:139:0x0395, B:140:0x0272, B:146:0x051d, B:149:0x0123, B:151:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0395 A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, SecurityException -> 0x01b7, SecurityException -> 0x051b, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x0347, B:99:0x035f, B:101:0x036b, B:102:0x03a8, B:103:0x03de, B:105:0x03e4, B:108:0x03fa, B:113:0x0405, B:115:0x0451, B:116:0x0460, B:118:0x0468, B:119:0x046b, B:121:0x0473, B:122:0x047c, B:124:0x0486, B:127:0x0494, B:128:0x0497, B:138:0x0479, B:139:0x0395, B:140:0x0272, B:146:0x051d, B:149:0x0123, B:151:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a6 A[Catch: all -> 0x0538, LOOP:1: B:92:0x02a0->B:94:0x02a6, LOOP_END, TryCatch #2 {all -> 0x0538, SecurityException -> 0x01b7, SecurityException -> 0x051b, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x0347, B:99:0x035f, B:101:0x036b, B:102:0x03a8, B:103:0x03de, B:105:0x03e4, B:108:0x03fa, B:113:0x0405, B:115:0x0451, B:116:0x0460, B:118:0x0468, B:119:0x046b, B:121:0x0473, B:122:0x047c, B:124:0x0486, B:127:0x0494, B:128:0x0497, B:138:0x0479, B:139:0x0395, B:140:0x0272, B:146:0x051d, B:149:0x0123, B:151:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0347 A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, SecurityException -> 0x01b7, SecurityException -> 0x051b, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x0347, B:99:0x035f, B:101:0x036b, B:102:0x03a8, B:103:0x03de, B:105:0x03e4, B:108:0x03fa, B:113:0x0405, B:115:0x0451, B:116:0x0460, B:118:0x0468, B:119:0x046b, B:121:0x0473, B:122:0x047c, B:124:0x0486, B:127:0x0494, B:128:0x0497, B:138:0x0479, B:139:0x0395, B:140:0x0272, B:146:0x051d, B:149:0x0123, B:151:0x0129), top: B:13:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(zzbf zzbfVar, String str) {
        zznq zznqVar;
        List<zznq> list;
        int i;
        zzbb zzd;
        zzfn.zzi.zza zzaVar;
        Bundle bundle;
        byte[] bArr;
        zzf zzfVar;
        zzfn.zzj.zza zzaVar2;
        zzbb zza;
        long j;
        zzfn.zze.zza zza2;
        Iterator<String> it;
        zzfn.zzj.zza zzaVar3;
        long zzs;
        long zzu;
        String zzal;
        zzt();
        this.zzu.zzy();
        Preconditions.checkNotNull(zzbfVar);
        Preconditions.checkNotEmpty(str);
        if (!zze().zze(str, zzbh.zzbf)) {
            zzj().zzc().zza("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzbfVar.zza) && !"_iapx".equals(zzbfVar.zza)) {
            zzj().zzc().zza("Generating a payload for this event is not available. package_name, event_name", str, zzbfVar.zza);
            return null;
        }
        zzfn.zzi.zza zzb = zzfn.zzi.zzb();
        zzh().zzp();
        try {
            zzf zze = zzh().zze(str);
            if (zze == null) {
                zzj().zzc().zza("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!zze.zzar()) {
                zzj().zzc().zza("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            zzfn.zzj.zza zzp = zzfn.zzj.zzv().zzh(1).zzp("android");
            if (!TextUtils.isEmpty(zze.zzac())) {
                zzp.zzb(zze.zzac());
            }
            if (!TextUtils.isEmpty(zze.zzae())) {
                zzp.zzd((String) Preconditions.checkNotNull(zze.zzae()));
            }
            if (!TextUtils.isEmpty(zze.zzaf())) {
                zzp.zze((String) Preconditions.checkNotNull(zze.zzaf()));
            }
            if (zze.zze() != SieveCacheKt.NodeMetaAndPreviousMask) {
                zzp.zze((int) zze.zze());
            }
            zzp.zzf(zze.zzq()).zzd(zze.zzo());
            String zzah = zze.zzah();
            String zzaa = zze.zzaa();
            if (!TextUtils.isEmpty(zzah)) {
                zzp.zzm(zzah);
            } else if (!TextUtils.isEmpty(zzaa)) {
                zzp.zza(zzaa);
            }
            zzp.zzj(zze.zzw());
            zzin zzb2 = this.zzf.zzb(str);
            zzp.zzc(zze.zzn());
            if (this.zzu.zzac() && zze().zzk(zzp.zzs()) && zzb2.zzi() && !TextUtils.isEmpty(null)) {
                zzp.zzj((String) null);
            }
            zzp.zzg(zzb2.zzg());
            if (zzb2.zzi() && zze.zzaq()) {
                Pair<String, Boolean> zza3 = zzn().zza(zze.zzac(), zzb2);
                if (zze.zzaq() && zza3 != null && !TextUtils.isEmpty((CharSequence) zza3.first)) {
                    zzp.zzq(zza((String) zza3.first, Long.toString(zzbfVar.zzd)));
                    if (zza3.second != null) {
                        zzp.zzc(((Boolean) zza3.second).booleanValue());
                    }
                }
            }
            zzf().zzac();
            zzfn.zzj.zza zzi = zzp.zzi(Build.MODEL);
            zzf().zzac();
            zzi.zzo(Build.VERSION.RELEASE).zzj((int) zzf().zzg()).zzs(zzf().zzh());
            if (zzb2.zzj() && zze.zzad() != null) {
                zzp.zzc(zza((String) Preconditions.checkNotNull(zze.zzad()), Long.toString(zzbfVar.zzd)));
            }
            if (!TextUtils.isEmpty(zze.zzag())) {
                zzp.zzl((String) Preconditions.checkNotNull(zze.zzag()));
            }
            String zzac = zze.zzac();
            List<zznq> zzk = zzh().zzk(zzac);
            Iterator<zznq> it2 = zzk.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    zznqVar = null;
                    break;
                }
                zznqVar = it2.next();
                if ("_lte".equals(zznqVar.zzc)) {
                    break;
                }
            }
            try {
                if (zznqVar != null && zznqVar.zze != null) {
                    list = zzk;
                    zzfn.zzn[] zznVarArr = new zzfn.zzn[list.size()];
                    for (i = 0; i < list.size(); i++) {
                        zzfn.zzn.zza zzb3 = zzfn.zzn.zze().zza(list.get(i).zzc).zzb(list.get(i).zzd);
                        g_().zza(zzb3, list.get(i).zze);
                        zznVarArr[i] = (zzfn.zzn) ((com.google.android.gms.internal.measurement.zzjk) zzb3.zzag());
                    }
                    zzp.zze(Arrays.asList(zznVarArr));
                    g_().zza(zzp);
                    this.zzf.zza(zze, zzp);
                    zzga zza4 = zzga.zza(zzbfVar);
                    zzq().zza(zza4.zzb, zzh().zzd(str));
                    zzq().zza(zza4, zze().zzb(str));
                    Bundle bundle2 = zza4.zzb;
                    bundle2.putLong("_c", 1L);
                    zzj().zzc().zza("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", zzbfVar.zzc);
                    if (zzq().zzd(zzp.zzs(), zze.zzam())) {
                        zzq().zza(bundle2, "_dbg", (Object) 1L);
                        zzq().zza(bundle2, "_r", (Object) 1L);
                    }
                    zzd = zzh().zzd(str, zzbfVar.zza);
                    if (zzd != null) {
                        bundle = bundle2;
                        bArr = null;
                        zzfVar = zze;
                        zzaVar2 = zzp;
                        zzaVar = zzb;
                        zza = new zzbb(str, zzbfVar.zza, 0L, 0L, zzbfVar.zzd, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        zzaVar = zzb;
                        bundle = bundle2;
                        bArr = null;
                        zzfVar = zze;
                        zzaVar2 = zzp;
                        long j2 = zzd.zzf;
                        zza = zzd.zza(zzbfVar.zzd);
                        j = j2;
                    }
                    zzbb zzbbVar = zza;
                    zzh().zza(zzbbVar);
                    zzay zzayVar = new zzay(this.zzu, zzbfVar.zzc, str, zzbfVar.zza, zzbfVar.zzd, j, bundle);
                    zza2 = zzfn.zze.zze().zzb(zzayVar.zzc).zza(zzayVar.zzb).zza(zzayVar.zzd);
                    it = zzayVar.zze.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        zzfn.zzg.zza zza5 = zzfn.zzg.zze().zza(next);
                        Object zzc = zzayVar.zze.zzc(next);
                        if (zzc != null) {
                            g_().zza(zza5, zzc);
                            zza2.zza(zza5);
                        }
                    }
                    zzaVar3 = zzaVar2;
                    zzaVar3.zza(zza2).zza(zzfn.zzk.zza().zza(zzfn.zzf.zza().zza(zzbbVar.zzc).zza(zzbfVar.zza)));
                    zzaVar3.zza(zzg().zza(zzfVar.zzac(), Collections.EMPTY_LIST, zzaVar3.zzaa(), Long.valueOf(zza2.zzc()), Long.valueOf(zza2.zzc())));
                    if (zza2.zzg()) {
                        zzaVar3.zzi(zza2.zzc()).zze(zza2.zzc());
                    }
                    zzs = zzfVar.zzs();
                    if (zzs != 0) {
                        zzaVar3.zzg(zzs);
                    }
                    zzu = zzfVar.zzu();
                    if (zzu == 0) {
                        zzaVar3.zzh(zzu);
                    } else if (zzs != 0) {
                        zzaVar3.zzh(zzs);
                    }
                    zzal = zzfVar.zzal();
                    if (zzpi.zza() && zze().zze(str, zzbh.zzbt) && zzal != null) {
                        zzaVar3.zzr(zzal);
                    }
                    zzfVar.zzap();
                    zzaVar3.zzf((int) zzfVar.zzt()).zzl(95001L).zzk(zzb().currentTimeMillis()).zzd(Boolean.TRUE.booleanValue());
                    this.zzf.zza(zzaVar3.zzs(), zzaVar3);
                    zzfn.zzi.zza zzaVar4 = zzaVar;
                    zzaVar4.zza(zzaVar3);
                    zzf zzfVar2 = zzfVar;
                    zzfVar2.zzr(zzaVar3.zzf());
                    zzfVar2.zzp(zzaVar3.zze());
                    zzh().zza(zzfVar2, false, false);
                    zzh().zzw();
                    return g_().zzb(((zzfn.zzi) ((com.google.android.gms.internal.measurement.zzjk) zzaVar4.zzag())).zzbx());
                }
                return g_().zzb(((zzfn.zzi) ((com.google.android.gms.internal.measurement.zzjk) zzaVar4.zzag())).zzbx());
            } catch (IOException e) {
                zzj().zzg().zza("Data loss. Failed to bundle and serialize. appId", zzfw.zza(str), e);
                return bArr;
            }
            list = zzk;
            zznq zznqVar2 = new zznq(zzac, "auto", "_lte", zzb().currentTimeMillis(), 0L);
            list.add(zznqVar2);
            zzh().zza(zznqVar2);
            zzfn.zzn[] zznVarArr2 = new zzfn.zzn[list.size()];
            while (i < list.size()) {
            }
            zzp.zze(Arrays.asList(zznVarArr2));
            g_().zza(zzp);
            this.zzf.zza(zze, zzp);
            zzga zza42 = zzga.zza(zzbfVar);
            zzq().zza(zza42.zzb, zzh().zzd(str));
            zzq().zza(zza42, zze().zzb(str));
            Bundle bundle22 = zza42.zzb;
            bundle22.putLong("_c", 1L);
            zzj().zzc().zza("Marking in-app purchase as real-time");
            bundle22.putLong("_r", 1L);
            bundle22.putString("_o", zzbfVar.zzc);
            if (zzq().zzd(zzp.zzs(), zze.zzam())) {
            }
            zzd = zzh().zzd(str, zzbfVar.zza);
            if (zzd != null) {
            }
            zzbb zzbbVar2 = zza;
            zzh().zza(zzbbVar2);
            zzay zzayVar2 = new zzay(this.zzu, zzbfVar.zzc, str, zzbfVar.zza, zzbfVar.zzd, j, bundle);
            zza2 = zzfn.zze.zze().zzb(zzayVar2.zzc).zza(zzayVar2.zzb).zza(zzayVar2.zzd);
            it = zzayVar2.zze.iterator();
            while (it.hasNext()) {
            }
            zzaVar3 = zzaVar2;
            zzaVar3.zza(zza2).zza(zzfn.zzk.zza().zza(zzfn.zzf.zza().zza(zzbbVar2.zzc).zza(zzbfVar.zza)));
            zzaVar3.zza(zzg().zza(zzfVar.zzac(), Collections.EMPTY_LIST, zzaVar3.zzaa(), Long.valueOf(zza2.zzc()), Long.valueOf(zza2.zzc())));
            if (zza2.zzg()) {
            }
            zzs = zzfVar.zzs();
            if (zzs != 0) {
            }
            zzu = zzfVar.zzu();
            if (zzu == 0) {
            }
            zzal = zzfVar.zzal();
            if (zzpi.zza()) {
                zzaVar3.zzr(zzal);
            }
            zzfVar.zzap();
            zzaVar3.zzf((int) zzfVar.zzt()).zzl(95001L).zzk(zzb().currentTimeMillis()).zzd(Boolean.TRUE.booleanValue());
            this.zzf.zza(zzaVar3.zzs(), zzaVar3);
            zzfn.zzi.zza zzaVar42 = zzaVar;
            zzaVar42.zza(zzaVar3);
            zzf zzfVar22 = zzfVar;
            zzfVar22.zzr(zzaVar3.zzf());
            zzfVar22.zzp(zzaVar3.zze());
            zzh().zza(zzfVar22, false, false);
            zzh().zzw();
        } catch (SecurityException e2) {
            zzj().zzc().zza("Resettable device id encryption failed", e2.getMessage());
            return new byte[0];
        } catch (SecurityException e3) {
            zzj().zzc().zza("app instance id encryption failed", e3.getMessage());
            return new byte[0];
        } finally {
            zzh().zzu();
        }
    }
}
