package v3;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.A;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.AbstractC5881z;
import com.google.common.collect.f0;
import j3.C7263e;
import j3.C7272n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10205a {

    /* renamed from: c, reason: collision with root package name */
    public static final C10205a f101875c = new C10205a(AbstractC5880y.B(c.f101880d));

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    private static final AbstractC5880y<Integer> f101876d = AbstractC5880y.E();

    /* renamed from: e, reason: collision with root package name */
    static final AbstractC5881z<Integer, Integer> f101877e;

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<c> f101878a;

    /* renamed from: b, reason: collision with root package name */
    private final int f101879b;

    /* renamed from: v3.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    private static final class C2218a {
        public static AbstractC5880y<Integer> a(C7263e c7263e) {
            boolean isDirectPlaybackSupported;
            int i11 = AbstractC5880y.f59142c;
            AbstractC5880y.a aVar = new AbstractC5880y.a();
            f0<Integer> it = C10205a.f101877e.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int intValue = next.intValue();
                if (Build.VERSION.SDK_INT >= m3.N.s(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), c7263e.a().f69059a);
                    if (isDirectPlaybackSupported) {
                        aVar.e(next);
                    }
                }
            }
            aVar.e(2);
            return aVar.j();
        }

        public static int b(int i11, int i12, C7263e c7263e) {
            boolean isDirectPlaybackSupported;
            for (int i13 = 10; i13 > 0; i13--) {
                int t2 = m3.N.t(i13);
                if (t2 != 0) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i12).setChannelMask(t2).build(), c7263e.a().f69059a);
                    if (isDirectPlaybackSupported) {
                        return i13;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: v3.a$b */
    /* loaded from: classes8.dex */
    private static final class b {
        public static C10205a a(AudioManager audioManager, C7263e c7263e) {
            List directProfilesForAttributes;
            int encapsulationType;
            int format;
            int[] channelMasks;
            int[] channelMasks2;
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c7263e.a().f69059a);
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(com.google.common.primitives.b.b(12)));
            int i11 = 0;
            for (int i12 = 0; i12 < directProfilesForAttributes.size(); i12++) {
                AudioProfile a11 = PJ.c.a(directProfilesForAttributes.get(i12));
                encapsulationType = a11.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = a11.getFormat();
                    if (m3.N.M(format) || C10205a.f101877e.containsKey(Integer.valueOf(format))) {
                        if (hashMap.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) hashMap.get(Integer.valueOf(format));
                            set.getClass();
                            channelMasks2 = a11.getChannelMasks();
                            set.addAll(com.google.common.primitives.b.b(channelMasks2));
                        } else {
                            Integer valueOf = Integer.valueOf(format);
                            channelMasks = a11.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(com.google.common.primitives.b.b(channelMasks)));
                        }
                    }
                }
            }
            int i13 = AbstractC5880y.f59142c;
            AbstractC5880y.a aVar = new AbstractC5880y.a();
            for (Map.Entry entry : hashMap.entrySet()) {
                aVar.e(new c((Set) entry.getValue(), ((Integer) entry.getKey()).intValue()));
            }
            return new C10205a(aVar.j(), i11);
        }

        public static C10208d b(AudioManager audioManager, C7263e c7263e) {
            List audioDevicesForAttributes;
            audioManager.getClass();
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(c7263e.a().f69059a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C10208d((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        }
    }

    static {
        AbstractC5881z.a aVar = new AbstractC5881z.a();
        aVar.b(5, 6);
        aVar.b(17, 6);
        aVar.b(7, 6);
        aVar.b(30, 10);
        aVar.b(18, 6);
        aVar.b(6, 8);
        aVar.b(8, 8);
        aVar.b(14, 8);
        f101877e = aVar.a();
    }

    /* synthetic */ C10205a(List list, int i11) {
        this(list);
    }

    private static AbstractC5880y<c> a(int[] iArr, int i11) {
        int i12 = AbstractC5880y.f59142c;
        AbstractC5880y.a aVar = new AbstractC5880y.a();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i13 : iArr) {
            aVar.e(new c(i13, i11));
        }
        return aVar.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L53;
     */
    @SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C10205a b(Context context, Intent intent, C7263e c7263e, C10208d c10208d) {
        AudioManager c11 = k3.c.c(context);
        if (c10208d == null) {
            c10208d = Build.VERSION.SDK_INT >= 33 ? b.b(c11, c7263e) : null;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && (m3.N.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return b.a(c11, c7263e);
        }
        AudioDeviceInfo[] devices = c10208d == null ? c11.getDevices(2) : new AudioDeviceInfo[]{c10208d.f101899a};
        A.a aVar = new A.a();
        aVar.k(8, 7);
        if (i11 >= 31) {
            aVar.k(26, 27);
        }
        if (i11 >= 33) {
            aVar.j(30);
        }
        com.google.common.collect.A m11 = aVar.m();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (m11.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return f101875c;
            }
        }
        A.a aVar2 = new A.a();
        aVar2.j(2);
        if (Build.VERSION.SDK_INT >= 29 && (m3.N.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            aVar2.l(C2218a.a(c7263e));
            return new C10205a(a(com.google.common.primitives.b.f(aVar2.m()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z11 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z11) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar2.l(f101876d);
        }
        if (intent == null || z11 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C10205a(a(com.google.common.primitives.b.f(aVar2.m()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar2.l(com.google.common.primitives.b.b(intArrayExtra));
        }
        return new C10205a(a(com.google.common.primitives.b.f(aVar2.m()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    @SuppressLint({"UnprotectedReceiver"})
    static C10205a c(Context context, C7263e c7263e, C10208d c10208d) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c7263e, c10208d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
    
        if (r7 != 5) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair d(C7263e c7263e, C7272n c7272n) {
        int t2;
        String str = c7272n.f69127o;
        str.getClass();
        int c11 = j3.u.c(str, c7272n.f69123k);
        if (!f101877e.containsKey(Integer.valueOf(c11))) {
            return null;
        }
        SparseArray<c> sparseArray = this.f101878a;
        int i11 = 6;
        if (c11 == 18 && !m3.N.k(sparseArray, 18)) {
            c11 = 6;
        } else if ((c11 == 8 && !m3.N.k(sparseArray, 8)) || (c11 == 30 && !m3.N.k(sparseArray, 30))) {
            c11 = 7;
        }
        if (!m3.N.k(sparseArray, c11)) {
            return null;
        }
        c cVar = sparseArray.get(c11);
        cVar.getClass();
        int i12 = c7272n.f69102G;
        if (i12 == -1 || c11 == 18) {
            int i13 = c7272n.f69103H;
            if (i13 == -1) {
                i13 = 48000;
            }
            i12 = cVar.a(i13, c7263e);
        } else if (!c7272n.f69127o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!cVar.b(i12)) {
                return null;
            }
        } else if (i12 > 10) {
            return null;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 <= 28) {
            if (i12 == 7) {
                i11 = 8;
            } else if (i12 != 3) {
                if (i12 != 4) {
                }
            }
            if (i14 <= 26 && "fugu".equals(Build.DEVICE) && i11 == 1) {
                i11 = 2;
            }
            t2 = m3.N.t(i11);
            if (t2 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c11), Integer.valueOf(t2));
        }
        i11 = i12;
        if (i14 <= 26) {
            i11 = 2;
        }
        t2 = m3.N.t(i11);
        if (t2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean contentEquals;
        if (this != obj) {
            if (obj instanceof C10205a) {
                C10205a c10205a = (C10205a) obj;
                SparseArray<c> sparseArray = this.f101878a;
                SparseArray<c> sparseArray2 = c10205a.f101878a;
                int i11 = m3.N.f74289a;
                if (sparseArray != null) {
                    if (sparseArray2 != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            contentEquals = sparseArray.contentEquals(sparseArray2);
                        } else {
                            int size = sparseArray.size();
                            if (size == sparseArray2.size()) {
                                for (int i12 = 0; i12 < size; i12++) {
                                    if (Objects.equals(sparseArray.valueAt(i12), sparseArray2.get(sparseArray.keyAt(i12)))) {
                                    }
                                }
                                contentEquals = true;
                            }
                        }
                    }
                    contentEquals = false;
                    break;
                }
                if (!contentEquals || this.f101879b != c10205a.f101879b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i11;
        SparseArray<c> sparseArray = this.f101878a;
        int i12 = m3.N.f74289a;
        if (Build.VERSION.SDK_INT >= 31) {
            i11 = sparseArray.contentHashCode();
        } else {
            int i13 = 17;
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                i13 = Objects.hashCode(sparseArray.valueAt(i14)) + ((sparseArray.keyAt(i14) + (i13 * 31)) * 31);
            }
            i11 = i13;
        }
        return (i11 * 31) + this.f101879b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f101879b + ", audioProfiles=" + this.f101878a + "]";
    }

    private C10205a(List<c> list) {
        this.f101878a = new SparseArray<>();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            this.f101878a.put(cVar.f101881a, cVar);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f101878a.size(); i13++) {
            i12 = Math.max(i12, this.f101878a.valueAt(i13).f101882b);
        }
        this.f101879b = i12;
    }

    /* renamed from: v3.a$c */
    private static final class c {

        /* renamed from: d, reason: collision with root package name */
        public static final c f101880d;

        /* renamed from: a, reason: collision with root package name */
        public final int f101881a;

        /* renamed from: b, reason: collision with root package name */
        public final int f101882b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.common.collect.A<Integer> f101883c;

        static {
            c cVar;
            if (Build.VERSION.SDK_INT >= 33) {
                A.a aVar = new A.a();
                for (int i11 = 1; i11 <= 10; i11++) {
                    aVar.j(Integer.valueOf(m3.N.t(i11)));
                }
                cVar = new c(aVar.m(), 2);
            } else {
                cVar = new c(2, 10);
            }
            f101880d = cVar;
        }

        public c(Set set, int i11) {
            this.f101881a = i11;
            com.google.common.collect.A<Integer> u11 = com.google.common.collect.A.u(set);
            this.f101883c = u11;
            f0<Integer> it = u11.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                i12 = Math.max(i12, Integer.bitCount(it.next().intValue()));
            }
            this.f101882b = i12;
        }

        public final int a(int i11, C7263e c7263e) {
            if (this.f101883c != null) {
                return this.f101882b;
            }
            int i12 = Build.VERSION.SDK_INT;
            int i13 = this.f101881a;
            if (i12 >= 29) {
                return C2218a.b(i13, i11, c7263e);
            }
            Integer num = C10205a.f101877e.get(Integer.valueOf(i13));
            return (num != null ? num : 0).intValue();
        }

        public final boolean b(int i11) {
            com.google.common.collect.A<Integer> a11 = this.f101883c;
            if (a11 == null) {
                return i11 <= this.f101882b;
            }
            int t2 = m3.N.t(i11);
            if (t2 == 0) {
                return false;
            }
            return a11.contains(Integer.valueOf(t2));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f101881a == cVar.f101881a && this.f101882b == cVar.f101882b && Objects.equals(this.f101883c, cVar.f101883c);
        }

        public final int hashCode() {
            int i11 = ((this.f101881a * 31) + this.f101882b) * 31;
            com.google.common.collect.A<Integer> a11 = this.f101883c;
            return i11 + (a11 == null ? 0 : a11.hashCode());
        }

        public final String toString() {
            return "AudioProfile[format=" + this.f101881a + ", maxChannelCount=" + this.f101882b + ", channelMasks=" + this.f101883c + "]";
        }

        public c(int i11, int i12) {
            this.f101881a = i11;
            this.f101882b = i12;
            this.f101883c = null;
        }
    }
}
