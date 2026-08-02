package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.ironsource.U3;
import defpackage.aik;
import defpackage.bf3;
import defpackage.c3p;
import defpackage.c8p;
import defpackage.fn0;
import defpackage.ilg;
import defpackage.mio;
import defpackage.njo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzql {
    public static final s e;
    public static final zzql f;
    public static final s g;
    public static final njo h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final zzgxm c;
    public final zzgxm d;

    static {
        s t = zzgxm.t(12);
        e = t;
        f = new zzql(zzgxm.t(c3p.d), t, s.e);
        Object[] objArr = {2, 5, 6};
        zzgzf.a(3, objArr);
        g = zzgxm.z(3, objArr);
        zzgxo zzgxoVar = new zzgxo();
        zzgxoVar.a(5, 6);
        zzgxoVar.a(17, 6);
        zzgxoVar.a(7, 6);
        zzgxoVar.a(30, 10);
        zzgxoVar.a(18, 6);
        zzgxoVar.a(6, 8);
        zzgxoVar.a(8, 8);
        zzgxoVar.a(14, 8);
        h = zzgxoVar.d(true);
    }

    public zzql(s sVar, zzgxm zzgxmVar, List list) {
        for (int i = 0; i < sVar.d; i++) {
            c3p c3pVar = (c3p) sVar.get(i);
            this.a.put(c3pVar.a, c3pVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((c3p) this.a.valueAt(i3)).b);
        }
        this.b = i2;
        this.c = zzgxm.x(zzgxmVar);
        this.d = zzgxm.x(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f9, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzql a(Context context, Intent intent, zzd zzdVar, AudioDeviceInfo audioDeviceInfo, List list) {
        int i;
        AudioManager a = zzcj.a(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List<AudioDeviceInfo> audioDevicesForAttributes = a.getAudioDevicesForAttributes(zzdVar.a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        zzgxm a2 = audioDeviceInfo != null ? c8p.a(audioDeviceInfo) : e;
        int i2 = Build.VERSION.SDK_INT;
        njo njoVar = h;
        if (i2 >= 33 && (zzfm.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            List<AudioProfile> directProfilesForAttributes = a.getDirectProfilesForAttributes(zzdVar.a());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(zzhbj.e(12)));
            for (int i3 = 0; i3 < directProfilesForAttributes.size(); i3++) {
                AudioProfile b = ilg.b(directProfilesForAttributes.get(i3));
                if (b.getEncapsulationType() != 1) {
                    int format = b.getFormat();
                    if (zzfm.d(format) || njoVar.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            set.addAll(zzhbj.e(b.getChannelMasks()));
                        } else {
                            hashMap.put(valueOf, new HashSet(zzhbj.e(b.getChannelMasks())));
                        }
                    }
                }
            }
            mio mioVar = zzgxm.b;
            zzgxj zzgxjVar = new zzgxj();
            for (Map.Entry entry : hashMap.entrySet()) {
                zzgxjVar.c(new c3p(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzql(zzgxjVar.f(), a2, list);
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? a.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (aik.k0(audioDeviceInfo2.getType())) {
                return new zzql(zzgxm.t(c3p.d), a2, list);
            }
        }
        zzgxv zzgxvVar = new zzgxv();
        zzgxvVar.f(2);
        if (Build.VERSION.SDK_INT < 29 || !(zzfm.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            ContentResolver contentResolver = context.getContentResolver();
            boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
            if (!z) {
                String str = Build.MANUFACTURER;
                if (!str.equals("Amazon")) {
                }
            }
            if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                zzgxvVar.g(g);
            }
            if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
                return new zzql(c(10, zzhbj.d(zzgxvVar.h())), a2, list);
            }
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                zzgxvVar.g(zzhbj.e(intArrayExtra));
            }
            return new zzql(c(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), zzhbj.d(zzgxvVar.h())), a2, list);
        }
        mio mioVar2 = zzgxm.b;
        zzgxj zzgxjVar2 = new zzgxj();
        zzgxw zzgxwVar = njoVar.b;
        if (zzgxwVar == null) {
            zzgxwVar = njoVar.g();
            njoVar.b = zzgxwVar;
        }
        zzhaa it = zzgxwVar.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            switch (intValue) {
                case 2:
                case 3:
                    i = 3;
                    break;
                case 4:
                case 5:
                case 6:
                    i = 21;
                    break;
                case 7:
                case 8:
                    i = 23;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                    i = 28;
                    break;
                case 13:
                case 19:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                default:
                    i = Integer.MAX_VALUE;
                    break;
                case 14:
                    i = 25;
                    break;
                case 20:
                    i = 30;
                    break;
                case 21:
                case 22:
                    i = 31;
                    break;
                case 30:
                case 31:
                    i = 34;
                    break;
            }
            if (Build.VERSION.SDK_INT >= i && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzdVar.a())) {
                zzgxjVar2.c(num);
            }
        }
        zzgxjVar2.c(2);
        zzgxvVar.g(zzgxjVar2.f());
        return new zzql(c(10, zzhbj.d(zzgxvVar.h())), a2, list);
    }

    public static s c(int i, int[] iArr) {
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            zzgxjVar.c(new c3p(i2, i));
        }
        return zzgxjVar.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0045, code lost:
    
        if (r10.indexOfKey(30) < 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair b(zzd zzdVar, zzv zzvVar) {
        int a;
        boolean contains;
        String str = zzvVar.o;
        int i = zzvVar.I;
        int i2 = zzvVar.H;
        str.getClass();
        int g2 = zzas.g(str, zzvVar.k);
        if (!h.containsKey(Integer.valueOf(g2))) {
            return null;
        }
        int i3 = 8;
        SparseArray sparseArray = this.a;
        if (g2 == 18) {
            if (sparseArray.indexOfKey(18) >= 0) {
                g2 = 18;
            } else {
                g2 = 6;
                if (sparseArray.indexOfKey(g2) < 0) {
                    return null;
                }
                c3p c3pVar = (c3p) sparseArray.get(g2);
                c3pVar.getClass();
                if (i2 == -1 || g2 == 18) {
                    int i4 = zzvVar.J;
                    if (i4 == -1) {
                        i4 = 48000;
                    }
                    a = c3pVar.a(i4, zzdVar);
                } else {
                    if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                        zzgxw zzgxwVar = c3pVar.c;
                        if (zzgxwVar == null) {
                            if (i2 <= c3pVar.b) {
                                contains = true;
                                if (!contains) {
                                    return null;
                                }
                            }
                            contains = false;
                            if (!contains) {
                            }
                        } else {
                            int e2 = i != -1 ? i : zzfm.e(i2);
                            if (e2 != 0) {
                                contains = zzgxwVar.contains(Integer.valueOf(e2));
                                if (!contains) {
                                }
                            }
                            contains = false;
                            if (!contains) {
                            }
                        }
                    } else if (i2 > 10) {
                        return null;
                    }
                    a = i2;
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 <= 28) {
                    if (a != 7) {
                        if (a == 3 || a == 4 || a == 5) {
                            i3 = 6;
                        }
                    }
                    if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i3 == 1) {
                        i3 = 2;
                    }
                    if (i != -1 || i2 != i3) {
                        i = zzfm.e(i3);
                    }
                    if (i == 0) {
                        return Pair.create(Integer.valueOf(g2), Integer.valueOf(i));
                    }
                    return null;
                }
                i3 = a;
                if (i5 <= 26) {
                    i3 = 2;
                }
                if (i != -1) {
                }
                i = zzfm.e(i3);
                if (i == 0) {
                }
            }
        }
        if (g2 == 8) {
            if (sparseArray.indexOfKey(8) >= 0) {
                g2 = 8;
            }
            g2 = 7;
            if (sparseArray.indexOfKey(g2) < 0) {
            }
        }
        if (g2 == 30) {
        }
        if (sparseArray.indexOfKey(g2) < 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r5.contentEquals(r1) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzql)) {
            return false;
        }
        zzql zzqlVar = (zzql) obj;
        SparseArray<?> sparseArray = zzqlVar.a;
        String str = zzfm.a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray2 = this.a;
        if (i < 31) {
            int size = sparseArray2.size();
            if (size == sparseArray.size()) {
                for (int i2 = 0; i2 < size; i2++) {
                    if (!Objects.equals(sparseArray2.valueAt(i2), sparseArray.get(sparseArray2.keyAt(i2)))) {
                        break;
                    }
                }
                if (this.b != zzqlVar.b || !Objects.equals(this.c, zzqlVar.c) || !Objects.equals(this.d, zzqlVar.d)) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = zzfm.a;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.a;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = Objects.hashCode(sparseArray.valueAt(i4)) + ((sparseArray.keyAt(i4) + (i3 * 31)) * 31);
            }
            i = i3;
        }
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + (((this.b * 31) + i) * 31)) * 31);
    }

    public final String toString() {
        String obj = this.a.toString();
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int i = this.b;
        StringBuilder sb = new StringBuilder(fn0.b(String.valueOf(i).length(), 50, obj.length(), 28, valueOf.length(), 26, valueOf2.length()) + 1);
        fn0.s(i, "AudioCapabilities[maxChannelCount=", ", audioProfiles=", obj, sb);
        bf3.v(sb, ", speakerLayoutChannelMasks=", valueOf, ", spatializerChannelMasks=", valueOf2);
        sb.append(U3.j.e);
        return sb.toString();
    }
}
