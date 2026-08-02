package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.b;
import com.facebook.internal.d;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mp0 implements eo0 {
    public final Context a;
    public final wib b;
    public final hn4 c;
    public final hpo d;
    public vdb e;
    public tqi f;
    public jn0 g;
    public i1k h;
    public Looper i;
    public Context j;

    public mp0(ujg ujgVar) {
        Context context = (Context) ujgVar.b;
        this.a = context;
        hn4 hn4Var = (hn4) ujgVar.c;
        hn4Var.getClass();
        this.c = hn4Var;
        this.b = (wib) ujgVar.d;
        this.g = (jn0) ujgVar.e;
        this.d = context == null ? null : new hpo(this);
        this.f = tqi.a;
    }

    public final lp0 a(do0 do0Var) {
        Context context;
        Context context2;
        try {
            int i = do0Var.h;
            int i2 = do0Var.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.j;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.j = context2.createDeviceContext(i2);
                }
                context = this.j;
                i = 0;
            }
            try {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(do0Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : do0Var.g.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(do0Var.b).setChannelMask(do0Var.c).setEncoding(do0Var.a).build()).setTransferMode(1).setBufferSizeInBytes(do0Var.f).setSessionId(i);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    sessionId.setOffloadedPlayback(do0Var.e);
                }
                if (i3 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack build = sessionId.build();
                if (build.getState() == 1) {
                    return new lp0(build, do0Var, this.d, this.f);
                }
                try {
                    build.release();
                } catch (Exception unused) {
                }
                throw new bo0();
            } catch (IllegalArgumentException e) {
                e = e;
                throw new bo0(e);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            e = e2;
        }
    }

    public final ao0 b(zn0 zn0Var) {
        e(zn0Var);
        b bVar = zn0Var.a;
        an0 an0Var = zn0Var.b;
        wn0 a = ((w70) this.c).a(an0Var, bVar);
        ao0 ao0Var = new ao0();
        int i = 0;
        ao0Var.d = 0;
        String str = bVar.o;
        int i2 = bVar.I;
        if (!Objects.equals(str, MimeTypes.AUDIO_RAW) ? this.g.c(an0Var, bVar) != null : i2 == 2) {
            i = 2;
        }
        ao0Var.d = i;
        boolean z = a.a;
        ao0Var.a = z;
        boolean z2 = a.b;
        ao0Var.b = z2;
        boolean z3 = a.c;
        ao0Var.c = z3;
        if (!z && (z2 || z3)) {
            a70.r("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        ao0 ao0Var2 = new ao0();
        ao0Var2.a = ao0Var.a;
        ao0Var2.b = ao0Var.b;
        ao0Var2.c = ao0Var.c;
        ao0Var2.d = ao0Var.d;
        return ao0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final do0 c(zn0 zn0Var) {
        int intValue;
        char c;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        int j;
        int i3;
        b bVar = zn0Var.a;
        boolean z4 = zn0Var.d;
        an0 an0Var = zn0Var.b;
        e(zn0Var);
        String str = bVar.o;
        int i4 = bVar.H;
        int i5 = bVar.I;
        int i6 = bVar.G;
        if (Objects.equals(str, MimeTypes.AUDIO_RAW)) {
            z1a.s(nik.P(i5));
            intValue = nik.t(i6);
            i = nik.v(i5) * i6;
            z = false;
            c = 0;
        } else {
            wn0 a = z4 ? ((w70) this.c).a(an0Var, bVar) : wn0.d;
            if (z4 && a.a) {
                str.getClass();
                int d = sjc.d(str, bVar.k);
                int t = nik.t(i6);
                boolean z5 = a.b;
                i5 = d;
                intValue = t;
                z = z5;
                i = -1;
                c = 1;
                z2 = true;
                i2 = bVar.j;
                if (Objects.equals(str, MimeTypes.AUDIO_DTS_EXPRESS) && i2 == -1) {
                    i2 = 768000;
                }
                int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue, i5);
                z1a.E(minBufferSize == -2);
                if (i == -1) {
                    i = 1;
                }
                double d2 = !z2 ? 8.0d : 1.0d;
                this.b.getClass();
                if (c != 0) {
                    z3 = true;
                    long j2 = i4;
                    long j3 = 250000 * j2;
                    long j4 = i;
                    j = nik.j(minBufferSize * 4, jaa.s((j3 * j4) / 1000000), jaa.s(((750000 * j2) * j4) / 1000000));
                } else if (c == 1) {
                    z3 = true;
                    int C = o1j.C(i5);
                    z1a.E(C != -2147483647);
                    j = jaa.s((50000000 * C) / 1000000);
                } else {
                    if (c != 2) {
                        ilg.c();
                        return null;
                    }
                    int i7 = i5 == 5 ? 500000 : i5 == 8 ? 1000000 : 250000;
                    if (i2 != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        i3 = o6a.t(i2, 8);
                    } else {
                        int C2 = o1j.C(i5);
                        z1a.E(C2 != -2147483647);
                        i3 = C2;
                    }
                    z3 = true;
                    j = jaa.s((i7 * i3) / 1000000);
                }
                int max = (((Math.max(minBufferSize, (int) (j * d2)) + i) - 1) / i) * i;
                co0 co0Var = new co0();
                an0 an0Var2 = an0.b;
                co0Var.i = -1;
                co0Var.b = i4;
                co0Var.c = intValue;
                co0Var.a = i5;
                co0Var.f = max;
                co0Var.h = zn0Var.e;
                co0Var.g = an0Var;
                boolean z6 = z3;
                co0Var.e = c != z6 ? z6 : false;
                co0Var.d = zn0Var.g;
                co0Var.j = z2;
                co0Var.k = z;
                co0Var.i = zn0Var.f;
                return new do0(co0Var);
            }
            Pair c2 = this.g.c(an0Var, bVar);
            if (c2 == null) {
                throw new yn0("Unable to configure passthrough for: " + bVar);
            }
            i5 = ((Integer) c2.first).intValue();
            intValue = ((Integer) c2.second).intValue();
            c = 2;
            i = -1;
            z = false;
        }
        z2 = false;
        i2 = bVar.j;
        if (Objects.equals(str, MimeTypes.AUDIO_DTS_EXPRESS)) {
            i2 = 768000;
        }
        int minBufferSize2 = AudioTrack.getMinBufferSize(i4, intValue, i5);
        z1a.E(minBufferSize2 == -2);
        if (i == -1) {
        }
        if (!z2) {
        }
        this.b.getClass();
        if (c != 0) {
        }
        int max2 = (((Math.max(minBufferSize2, (int) (j * d2)) + i) - 1) / i) * i;
        co0 co0Var2 = new co0();
        an0 an0Var22 = an0.b;
        co0Var2.i = -1;
        co0Var2.b = i4;
        co0Var2.c = intValue;
        co0Var2.a = i5;
        co0Var2.f = max2;
        co0Var2.h = zn0Var.e;
        co0Var2.g = an0Var;
        boolean z62 = z3;
        co0Var2.e = c != z62 ? z62 : false;
        co0Var2.d = zn0Var.g;
        co0Var2.j = z2;
        co0Var2.k = z;
        co0Var2.i = zn0Var.f;
        return new do0(co0Var2);
    }

    public final void d() {
        gxh gxhVar;
        vdb vdbVar = this.e;
        if (vdbVar != null) {
            vdbVar.d();
        }
        i1k i1kVar = this.h;
        if (i1kVar != null) {
            Context context = (Context) i1kVar.b;
            if (i1kVar.a) {
                i1kVar.i = null;
                un0.y(context).unregisterAudioDeviceCallback((kn0) i1kVar.e);
                if (Build.VERSION.SDK_INT >= 32 && (gxhVar = (gxh) i1kVar.h) != null) {
                    gxhVar.e();
                    i1kVar.h = null;
                }
                context.unregisterReceiver((d) i1kVar.f);
                ln0 ln0Var = (ln0) i1kVar.g;
                if (ln0Var != null) {
                    ln0Var.b.unregisterContentObserver(ln0Var);
                }
                i1kVar.a = false;
            }
        }
    }

    public final void e(zn0 zn0Var) {
        Context context;
        jn0 b;
        AudioDeviceInfo audioDeviceInfo = zn0Var.c;
        an0 an0Var = zn0Var.b;
        f();
        i1k i1kVar = this.h;
        if (i1kVar == null && (context = this.a) != null) {
            i1k i1kVar2 = new i1k(context, new l1(this, 7), an0Var, audioDeviceInfo);
            this.h = i1kVar2;
            Handler handler = (Handler) i1kVar2.d;
            Context context2 = (Context) i1kVar2.b;
            if (i1kVar2.a) {
                b = (jn0) i1kVar2.i;
                b.getClass();
            } else {
                i1kVar2.a = true;
                ln0 ln0Var = (ln0) i1kVar2.g;
                if (ln0Var != null) {
                    ln0Var.b.registerContentObserver(ln0Var.c, false, ln0Var);
                }
                un0.y(context2).registerAudioDeviceCallback((kn0) i1kVar2.e, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((gxh) i1kVar2.h) == null) {
                    i1kVar2.h = new gxh(context2, new y2(i1kVar2, 17), Boolean.valueOf(nik.S(context2)));
                }
                b = jn0.b(context2, context2.registerReceiver((d) i1kVar2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (an0) i1kVar2.k, (AudioDeviceInfo) i1kVar2.j, i1kVar2.b());
                i1kVar2.i = b;
            }
            this.g = b;
        } else if (i1kVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) i1kVar.j)) {
                i1kVar.j = audioDeviceInfo;
                Context context3 = (Context) i1kVar.b;
                an0 an0Var2 = (an0) i1kVar.k;
                List b2 = i1kVar.b();
                vvf vvfVar = jn0.e;
                i1kVar.d(jn0.b(context3, fn0.f("android.media.action.HDMI_AUDIO_PLUG", context3, null), an0Var2, audioDeviceInfo, b2));
            }
            i1k i1kVar3 = this.h;
            if (!Objects.equals(an0Var, (an0) i1kVar3.k)) {
                i1kVar3.k = an0Var;
                Context context4 = (Context) i1kVar3.b;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) i1kVar3.j;
                List b3 = i1kVar3.b();
                vvf vvfVar2 = jn0.e;
                i1kVar3.d(jn0.b(context4, fn0.f("android.media.action.HDMI_AUDIO_PLUG", context4, null), an0Var, audioDeviceInfo2, b3));
            }
        }
        this.g.getClass();
    }

    public final void f() {
        if (this.a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.i;
        boolean z = looper == null || looper == myLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (z) {
            this.i = myLooper;
        } else {
            a70.r(ufa.C("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
