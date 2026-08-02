package defpackage;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import com.google.android.gms.internal.ads.zzd;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzgxv;
import com.google.android.gms.internal.ads.zzgxw;
import com.google.android.gms.internal.ads.zzhaa;
import com.google.android.gms.internal.ads.zzql;
import com.ironsource.U3;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c3p {
    public static final c3p d;
    public final int a;
    public final int b;
    public final zzgxw c;

    static {
        c3p c3pVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgxv zzgxvVar = new zzgxv();
            for (int i = 1; i <= 10; i++) {
                zzgxvVar.f(Integer.valueOf(zzfm.e(i)));
            }
            c3pVar = new c3p(2, zzgxvVar.h());
        } else {
            c3pVar = new c3p(2, 10);
        }
        d = c3pVar;
    }

    public c3p(int i, Set set) {
        this.a = i;
        zzgxw u = zzgxw.u(set);
        this.c = u;
        zzhaa it = u.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = i2;
    }

    public final int a(int i, zzd zzdVar) {
        if (this.c != null) {
            return this.b;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.a;
        if (i2 < 29) {
            Object obj = zzql.h.get(Integer.valueOf(i3));
            return ((Integer) (obj != null ? obj : 0)).intValue();
        }
        for (int i4 = 10; i4 > 0; i4--) {
            int e = zzfm.e(i4);
            if (e != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i3).setSampleRate(i).setChannelMask(e).build(), zzdVar.a())) {
                return i4;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3p)) {
            return false;
        }
        c3p c3pVar = (c3p) obj;
        return this.a == c3pVar.a && this.b == c3pVar.b && Objects.equals(this.c, c3pVar.c);
    }

    public final int hashCode() {
        zzgxw zzgxwVar = this.c;
        return (((this.a * 31) + this.b) * 31) + (zzgxwVar == null ? 0 : zzgxwVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(wt3.h(length, 38, String.valueOf(i2).length(), 15, valueOf.length()) + 1);
        me4.r(sb, "AudioProfile[format=", i, ", maxChannelCount=", i2);
        return wt3.m(", channelMasks=", valueOf, sb, U3.j.e);
    }

    public c3p(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
