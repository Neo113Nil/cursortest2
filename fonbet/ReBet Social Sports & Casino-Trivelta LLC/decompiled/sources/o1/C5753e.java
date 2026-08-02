package o1;

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
import b1.AbstractC2335D;
import b1.C2350d;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.B;
import com.google.common.collect.E;
import com.google.common.collect.m0;
import e1.AbstractC4134a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: o1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5753e {

    /* renamed from: c, reason: collision with root package name */
    public static final C5753e f58813c = new C5753e(AbstractC3445z.u(C0861e.f58818d));

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC3445z f58814d = AbstractC3445z.w(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.common.collect.B f58815e = new B.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f58816a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58817b;

    /* renamed from: o1.e$b */
    public static final class b {
        public static com.google.common.collect.E a() {
            E.a j10 = new E.a().j(8, 7);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                j10.j(26, 27);
            }
            if (i10 >= 33) {
                j10.a(30);
            }
            return j10.m();
        }

        public static boolean b(AudioManager audioManager, C5758j c5758j) {
            AudioDeviceInfo[] devices = c5758j == null ? ((AudioManager) AbstractC4134a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{c5758j.f58844a};
            com.google.common.collect.E a10 = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (a10.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: o1.e$c */
    public static final class c {
        public static AbstractC3445z a(C2350d c2350d) {
            boolean isDirectPlaybackSupported;
            AbstractC3445z.a k10 = AbstractC3445z.k();
            m0 it = C5753e.f58815e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT >= e1.Z.K(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(com.twilio.voice.AudioFormat.AUDIO_SAMPLE_RATE_48000).build(), c2350d.a().f24581a);
                    if (isDirectPlaybackSupported) {
                        k10.a(num);
                    }
                }
            }
            k10.a(2);
            return k10.m();
        }

        public static int b(int i10, int i11, C2350d c2350d) {
            boolean isDirectPlaybackSupported;
            for (int i12 = 10; i12 > 0; i12--) {
                int N10 = e1.Z.N(i12);
                if (N10 != 0) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(N10).build(), c2350d.a().f24581a);
                    if (isDirectPlaybackSupported) {
                        return i12;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: o1.e$d */
    public static final class d {
        public static C5753e a(AudioManager audioManager, C2350d c2350d) {
            List directProfilesForAttributes;
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c2350d.a().f24581a);
            return new C5753e(C5753e.c(directProfilesForAttributes));
        }

        public static C5758j b(AudioManager audioManager, C2350d c2350d) {
            List audioDevicesForAttributes;
            audioDevicesForAttributes = ((AudioManager) AbstractC4134a.e(audioManager)).getAudioDevicesForAttributes(c2350d.a().f24581a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C5758j((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        }
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    public static AbstractC3445z c(List list) {
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(com.google.common.primitives.f.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile a10 = AbstractC5749a.a(list.get(i10));
            encapsulationType = a10.getEncapsulationType();
            if (encapsulationType != 1) {
                format = a10.getFormat();
                if (e1.Z.O0(format) || f58815e.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) AbstractC4134a.e((Set) hashMap.get(Integer.valueOf(format)));
                        channelMasks2 = a10.getChannelMasks();
                        set.addAll(com.google.common.primitives.f.c(channelMasks2));
                    } else {
                        Integer valueOf = Integer.valueOf(format);
                        channelMasks = a10.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(com.google.common.primitives.f.c(channelMasks)));
                    }
                }
            }
        }
        AbstractC3445z.a k10 = AbstractC3445z.k();
        for (Map.Entry entry : hashMap.entrySet()) {
            k10.a(new C0861e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return k10.m();
    }

    public static AbstractC3445z d(int[] iArr, int i10) {
        AbstractC3445z.a k10 = AbstractC3445z.k();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            k10.a(new C0861e(i11, i10));
        }
        return k10.m();
    }

    public static C5753e e(Context context, Intent intent, C2350d c2350d, C5758j c5758j) {
        AudioManager c10 = c1.m.c(context);
        if (c5758j == null) {
            c5758j = Build.VERSION.SDK_INT >= 33 ? d.b(c10, c2350d) : null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && (e1.Z.T0(context) || e1.Z.L0(context))) {
            return d.a(c10, c2350d);
        }
        if (b.b(c10, c5758j)) {
            return f58813c;
        }
        E.a aVar = new E.a();
        aVar.a(2);
        if (i10 >= 29 && (e1.Z.T0(context) || e1.Z.L0(context))) {
            aVar.k(c.a(c2350d));
            return new C5753e(d(com.google.common.primitives.f.o(aVar.m()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.k(f58814d);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C5753e(d(com.google.common.primitives.f.o(aVar.m()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.k(com.google.common.primitives.f.c(intArrayExtra));
        }
        return new C5753e(d(com.google.common.primitives.f.o(aVar.m()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static C5753e f(Context context, C2350d c2350d, C5758j c5758j) {
        return e(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c2350d, c5758j);
    }

    public static int g(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(Build.DEVICE) && i10 == 1) {
            i10 = 2;
        }
        return e1.Z.N(i10);
    }

    public static Uri i() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5753e)) {
            return false;
        }
        C5753e c5753e = (C5753e) obj;
        return e1.Z.s(this.f58816a, c5753e.f58816a) && this.f58817b == c5753e.f58817b;
    }

    public Pair h(androidx.media3.common.a aVar, C2350d c2350d) {
        int f10 = AbstractC2335D.f((String) AbstractC4134a.e(aVar.f20543o), aVar.f20539k);
        if (!f58815e.containsKey(Integer.valueOf(f10))) {
            return null;
        }
        if (f10 == 18 && !k(18)) {
            f10 = 6;
        } else if ((f10 == 8 && !k(8)) || (f10 == 30 && !k(30))) {
            f10 = 7;
        }
        if (!k(f10)) {
            return null;
        }
        C0861e c0861e = (C0861e) AbstractC4134a.e((C0861e) this.f58816a.get(f10));
        int i10 = aVar.f20518F;
        if (i10 == -1 || f10 == 18) {
            int i11 = aVar.f20519G;
            if (i11 == -1) {
                i11 = com.twilio.voice.AudioFormat.AUDIO_SAMPLE_RATE_48000;
            }
            i10 = c0861e.b(i11, c2350d);
        } else if (!aVar.f20543o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!c0861e.c(i10)) {
                return null;
            }
        } else if (i10 > 10) {
            return null;
        }
        int g10 = g(i10);
        if (g10 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f10), Integer.valueOf(g10));
    }

    public int hashCode() {
        return this.f58817b + (e1.Z.t(this.f58816a) * 31);
    }

    public boolean j(androidx.media3.common.a aVar, C2350d c2350d) {
        return h(aVar, c2350d) != null;
    }

    public boolean k(int i10) {
        return e1.Z.q(this.f58816a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f58817b + ", audioProfiles=" + this.f58816a + "]";
    }

    public C5753e(List list) {
        this.f58816a = new SparseArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0861e c0861e = (C0861e) list.get(i10);
            this.f58816a.put(c0861e.f58819a, c0861e);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f58816a.size(); i12++) {
            i11 = Math.max(i11, ((C0861e) this.f58816a.valueAt(i12)).f58820b);
        }
        this.f58817b = i11;
    }

    /* renamed from: o1.e$e, reason: collision with other inner class name */
    public static final class C0861e {

        /* renamed from: d, reason: collision with root package name */
        public static final C0861e f58818d;

        /* renamed from: a, reason: collision with root package name */
        public final int f58819a;

        /* renamed from: b, reason: collision with root package name */
        public final int f58820b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.common.collect.E f58821c;

        static {
            f58818d = Build.VERSION.SDK_INT >= 33 ? new C0861e(2, a(10)) : new C0861e(2, 10);
        }

        public C0861e(int i10, Set set) {
            this.f58819a = i10;
            com.google.common.collect.E m10 = com.google.common.collect.E.m(set);
            this.f58821c = m10;
            m0 it = m10.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                i11 = Math.max(i11, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f58820b = i11;
        }

        public static com.google.common.collect.E a(int i10) {
            E.a aVar = new E.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(e1.Z.N(i11)));
            }
            return aVar.m();
        }

        public int b(int i10, C2350d c2350d) {
            return this.f58821c != null ? this.f58820b : Build.VERSION.SDK_INT >= 29 ? c.b(this.f58819a, i10, c2350d) : ((Integer) AbstractC4134a.e((Integer) C5753e.f58815e.getOrDefault(Integer.valueOf(this.f58819a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f58821c == null) {
                return i10 <= this.f58820b;
            }
            int N10 = e1.Z.N(i10);
            if (N10 == 0) {
                return false;
            }
            return this.f58821c.contains(Integer.valueOf(N10));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0861e)) {
                return false;
            }
            C0861e c0861e = (C0861e) obj;
            return this.f58819a == c0861e.f58819a && this.f58820b == c0861e.f58820b && Objects.equals(this.f58821c, c0861e.f58821c);
        }

        public int hashCode() {
            int i10 = ((this.f58819a * 31) + this.f58820b) * 31;
            com.google.common.collect.E e10 = this.f58821c;
            return i10 + (e10 == null ? 0 : e10.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f58819a + ", maxChannelCount=" + this.f58820b + ", channelMasks=" + this.f58821c + "]";
        }

        public C0861e(int i10, int i11) {
            this.f58819a = i10;
            this.f58820b = i11;
            this.f58821c = null;
        }
    }
}
