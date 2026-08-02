package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzqb {
    public static final zzqb zza;
    static final zzgwc zzb;
    private static final zzgvz zzc;
    private static final zzgvz zzd;
    private static final zzgvz zze;
    private final SparseArray zzf = new SparseArray();
    private final int zzg;
    private final zzgvz zzh;
    private final zzgvz zzi;

    static {
        zzgvz zzj = zzgvz.zzj(12);
        zzc = zzj;
        zzgvz zzi = zzgvz.zzi();
        zzd = zzi;
        zza = new zzqb(zzgvz.zzj(zzqa.zza), zzj, zzi);
        zze = zzgvz.zzl(2, 5, 6);
        zzgwb zzgwbVar = new zzgwb();
        zzgwbVar.zza(5, 6);
        zzgwbVar.zza(17, 6);
        zzgwbVar.zza(7, 6);
        zzgwbVar.zza(30, 10);
        zzgwbVar.zza(18, 6);
        zzgwbVar.zza(6, 8);
        zzgwbVar.zza(8, 8);
        zzgwbVar.zza(14, 8);
        zzb = zzgwbVar.zzc();
    }

    private zzqb(List list, List list2, List list3) {
        for (int i = 0; i < list.size(); i++) {
            zzqa zzqaVar = (zzqa) list.get(i);
            this.zzf.put(zzqaVar.zzb, zzqaVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzf.size(); i3++) {
            i2 = Math.max(i2, ((zzqa) this.zzf.valueAt(i3)).zzc);
        }
        this.zzg = i2;
        this.zzh = zzgvz.zzq(list2);
        this.zzi = zzgvz.zzq(list3);
    }

    static zzqb zza(Context context, zzd zzdVar, AudioDeviceInfo audioDeviceInfo, List list) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo, list);
    }

    static zzqb zzb(Context context, Intent intent, zzd zzdVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager zza2 = zzcj.zza(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List<AudioDeviceInfo> audioDevicesForAttributes = zza2.getAudioDevicesForAttributes(zzdVar.zza());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        zzgvz zza3 = audioDeviceInfo != null ? zztt.zza(audioDeviceInfo) : zzc;
        if (Build.VERSION.SDK_INT >= 33 && (zzfk.zzO(context) || zzfk.zzP(context))) {
            List<AudioProfile> directProfilesForAttributes = zza2.getDirectProfilesForAttributes(zzdVar.zza());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(zzgzt.zzg(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile audioProfile = directProfilesForAttributes.get(i);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (zzfk.zzC(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            set.addAll(zzgzt.zzg(audioProfile.getChannelMasks()));
                        } else {
                            hashMap.put(valueOf, new HashSet(zzgzt.zzg(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            int i2 = zzgvz.zzd;
            zzgvw zzgvwVar = new zzgvw();
            for (Map.Entry entry : hashMap.entrySet()) {
                zzgvwVar.zzf(new zzqa(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzqb(zzgvwVar.zzi(), zza3, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? zza2.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (zztm.zza(audioDeviceInfo2.getType())) {
                return new zzqb(zzgvz.zzj(zzqa.zza), zza3, list);
            }
        }
        zzgwi zzgwiVar = new zzgwi();
        zzgwiVar.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzfk.zzO(context) || zzfk.zzP(context))) {
            int i3 = zzgvz.zzd;
            zzgvw zzgvwVar2 = new zzgvw();
            zzgyn it = zzb.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (Build.VERSION.SDK_INT >= zzfk.zzE(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(OpusUtil.SAMPLE_RATE).build(), zzdVar.zza())) {
                    zzgvwVar2.zzf(Integer.valueOf(intValue));
                }
            }
            zzgvwVar2.zzf((Object) 2);
            zzgwiVar.zzg(zzgvwVar2.zzi());
            return new zzqb(zzh(zzgzt.zzf(zzgwiVar.zzh()), 10), zza3, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zzg()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzgwiVar.zzg(zze);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzqb(zzh(zzgzt.zzf(zzgwiVar.zzh()), 10), zza3, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzgwiVar.zzg(zzgzt.zzg(intArrayExtra));
        }
        return new zzqb(zzh(zzgzt.zzf(zzgwiVar.zzh()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), zza3, list);
    }

    static Uri zzc() {
        if (zzg()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zzg() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    private static zzgvz zzh(int[] iArr, int i) {
        int i2 = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            zzgvwVar.zzf(new zzqa(i3, i));
        }
        return zzgvwVar.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r1.contentEquals(r3) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqb)) {
            return false;
        }
        zzqb zzqbVar = (zzqb) obj;
        SparseArray sparseArray = this.zzf;
        SparseArray<?> sparseArray2 = zzqbVar.zzf;
        String str = zzfk.zza;
        if (Build.VERSION.SDK_INT < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                        break;
                    }
                }
                if (this.zzg != zzqbVar.zzg || !Objects.equals(this.zzh, zzqbVar.zzh) || !Objects.equals(this.zzi, zzqbVar.zzi)) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = zzfk.zza;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzf;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return (((((this.zzg * 31) + i) * 31) + Objects.hashCode(this.zzh)) * 31) + Objects.hashCode(this.zzi);
    }

    public final String toString() {
        zzgvz zzgvzVar = this.zzi;
        zzgvz zzgvzVar2 = this.zzh;
        String obj = this.zzf.toString();
        String valueOf = String.valueOf(zzgvzVar2);
        String valueOf2 = String.valueOf(zzgvzVar);
        int i = this.zzg;
        int length = String.valueOf(i).length();
        int length2 = obj.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 28 + String.valueOf(valueOf).length() + 26 + String.valueOf(valueOf2).length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(obj);
        sb.append(", speakerLayoutChannelMasks=");
        sb.append(valueOf);
        sb.append(", spatializerChannelMasks=");
        sb.append(valueOf2);
        sb.append(X3.j.e);
        return sb.toString();
    }

    public final zzgvz zzd() {
        return this.zzh;
    }

    public final zzgvz zze() {
        return this.zzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        if (r7 != 5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        if (com.google.android.gms.internal.ads.zzfk.zza(r9.zzf, 30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zzf(zzv zzvVar, zzd zzdVar) {
        SparseArray sparseArray;
        int zzD;
        String str = zzvVar.zzp;
        str.getClass();
        int zzg = zzas.zzg(str, zzvVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(zzg))) {
            return null;
        }
        int i = 6;
        if (zzg == 18) {
            if (zzfk.zza(this.zzf, 18)) {
                zzg = 18;
            } else {
                zzg = 6;
                sparseArray = this.zzf;
                if (!zzfk.zza(sparseArray, zzg)) {
                    return null;
                }
                zzqa zzqaVar = (zzqa) sparseArray.get(zzg);
                zzqaVar.getClass();
                int i2 = zzvVar.zzH;
                if (i2 == -1 || zzg == 18) {
                    int i3 = zzvVar.zzI;
                    if (i3 == -1) {
                        i3 = OpusUtil.SAMPLE_RATE;
                    }
                    i2 = zzqaVar.zzb(i3, zzdVar);
                } else if (!str.equals(MimeTypes.AUDIO_DTS_X) || Build.VERSION.SDK_INT >= 33) {
                    if (!zzqaVar.zza(i2)) {
                        return null;
                    }
                } else if (i2 > 10) {
                    return null;
                }
                if (Build.VERSION.SDK_INT <= 28) {
                    if (i2 == 7) {
                        i = 8;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                        }
                    }
                    if (Build.VERSION.SDK_INT <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
                        i = 2;
                    }
                    zzD = zzfk.zzD(i);
                    if (zzD == 0) {
                        return Pair.create(Integer.valueOf(zzg), Integer.valueOf(zzD));
                    }
                    return null;
                }
                i = i2;
                if (Build.VERSION.SDK_INT <= 26) {
                    i = 2;
                }
                zzD = zzfk.zzD(i);
                if (zzD == 0) {
                }
            }
        }
        if (zzg == 8) {
            if (zzfk.zza(this.zzf, 8)) {
                zzg = 8;
            }
            zzg = 7;
            sparseArray = this.zzf;
            if (!zzfk.zza(sparseArray, zzg)) {
            }
        }
        if (zzg == 30) {
        }
        sparseArray = this.zzf;
        if (!zzfk.zza(sparseArray, zzg)) {
        }
    }
}
