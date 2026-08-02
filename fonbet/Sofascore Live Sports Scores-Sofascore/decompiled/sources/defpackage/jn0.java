package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.b;
import com.ironsource.U3;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jn0 {
    public static final vvf e;
    public static final jn0 f;
    public static final vvf g;
    public static final awf h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final hv9 c;
    public final hv9 d;

    static {
        vvf z = hv9.z(12);
        e = z;
        f = new jn0(hv9.z(hn0.d), z, vvf.e);
        Object[] objArr = {2, 5, 6};
        qha.p(3, objArr);
        g = hv9.r(3, objArr);
        b10 b10Var = new b10(4);
        b10Var.A(5, 6);
        b10Var.A(17, 6);
        b10Var.A(7, 6);
        b10Var.A(30, 10);
        b10Var.A(18, 6);
        b10Var.A(6, 8);
        b10Var.A(8, 8);
        b10Var.A(14, 8);
        h = b10Var.c(true);
    }

    public jn0(vvf vvfVar, List list, List list2) {
        for (int i = 0; i < vvfVar.d; i++) {
            hn0 hn0Var = (hn0) vvfVar.get(i);
            this.a.put(hn0Var.a, hn0Var);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((hn0) this.a.valueAt(i3)).b);
        }
        this.b = i2;
        this.c = hv9.v(list);
        this.d = hv9.v(list2);
    }

    public static vvf a(int i, int[] iArr) {
        zu9 s = hv9.s();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            s.c(new hn0(i2, i));
        }
        return s.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jn0 b(Context context, Intent intent, an0 an0Var, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager y = un0.y(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? z9.g(y, an0Var) : null;
        }
        hv9 b = audioDeviceInfo != null ? hxh.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (nik.S(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return z9.f(y, an0Var, b, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? y.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (lz.I(audioDeviceInfo2.getType())) {
                return new jn0(hv9.z(hn0.d), b, list);
            }
        }
        tv9 tv9Var = new tv9(4);
        tv9Var.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (nik.S(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            vvf s = eq3.s(an0Var);
            s.getClass();
            tv9Var.e(s);
            return new jn0(a(10, jaa.O(tv9Var.h())), b, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            vvf vvfVar = g;
            vvfVar.getClass();
            tv9Var.e(vvfVar);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new jn0(a(10, jaa.O(tv9Var.h())), b, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List r = jaa.r(intArrayExtra);
            r.getClass();
            tv9Var.e(r);
        }
        return new jn0(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), jaa.O(tv9Var.h())), b, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r8 != 5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(an0 an0Var, b bVar) {
        int t;
        String str = bVar.o;
        str.getClass();
        int d = sjc.d(str, bVar.k);
        Integer valueOf = Integer.valueOf(d);
        awf awfVar = h;
        if (!awfVar.containsKey(valueOf)) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.a;
        if (d == 18 && !nik.l(sparseArray, 18)) {
            d = 6;
        } else if ((d == 8 && !nik.l(sparseArray, 8)) || (d == 30 && !nik.l(sparseArray, 30))) {
            d = 7;
        }
        if (!nik.l(sparseArray, d)) {
            return null;
        }
        hn0 hn0Var = (hn0) sparseArray.get(d);
        hn0Var.getClass();
        int i2 = hn0Var.b;
        vv9 vv9Var = hn0Var.c;
        int i3 = bVar.G;
        boolean z = false;
        if (i3 == -1 || d == 18) {
            int i4 = bVar.H;
            if (i4 == -1) {
                i4 = 48000;
            }
            int i5 = hn0Var.a;
            if (vv9Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i2 = eq3.w(i5, i4, an0Var);
                } else {
                    Object obj = awfVar.get(Integer.valueOf(i5));
                    i2 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i3 = i2;
        } else if (!bVar.o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (vv9Var != null) {
                int t2 = nik.t(i3);
                if (t2 != 0) {
                    z = vv9Var.contains(Integer.valueOf(t2));
                }
            } else if (i3 <= i2) {
                z = true;
            }
            if (!z) {
                return null;
            }
        } else if (i3 > 10) {
            return null;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 <= 28) {
            if (i3 == 7) {
                i = 8;
            } else if (i3 != 3) {
                if (i3 != 4) {
                }
            }
            if (i6 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
                i = 2;
            }
            t = nik.t(i);
            if (t != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(d), Integer.valueOf(t));
        }
        i = i3;
        if (i6 <= 26) {
            i = 2;
        }
        t = nik.t(i);
        if (t != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn0)) {
            return false;
        }
        jn0 jn0Var = (jn0) obj;
        return nik.n(this.a, jn0Var.a) && this.b == jn0Var.b && Objects.equals(this.c, jn0Var.c) && Objects.equals(this.d, jn0Var.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((nik.o(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + U3.j.e;
    }
}
