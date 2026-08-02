package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.audio.d;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.Objects;
import xsna.bbl;
import xsna.cbl;
import xsna.dvf;
import xsna.e9x;
import xsna.ed;
import xsna.f370;
import xsna.fxc0;
import xsna.hq4;
import xsna.ihz;
import xsna.io20;
import xsna.ipx;
import xsna.nc4;
import xsna.vl4;
import xsna.wl4;
import xsna.x19;
import xsna.y2r0;

/* compiled from: AudioTrackAudioOutputProvider.java */
/* loaded from: classes12.dex */
public final class c implements AudioOutputProvider {

    @Nullable
    public final Context a;
    public final d.b b;
    public final bbl c;

    @Nullable
    public final b d;
    public ihz<AudioOutputProvider.c> e;
    public dvf f;
    public vl4 g;
    public wl4 h;

    @Nullable
    public Looper i;

    @Nullable
    public Context j;

    /* compiled from: AudioTrackAudioOutputProvider.java */
    public static final class a {

        @Nullable
        public final Context a;
        public bbl b;
        public d.b c;

        @Nullable
        public vl4 d;

        public a(@Nullable Context context) {
            this.a = context != null ? context.getApplicationContext() : null;
            this.c = d.b.a;
            if (context == null) {
                this.d = vl4.c;
            }
        }
    }

    /* compiled from: AudioTrackAudioOutputProvider.java */
    public final class b implements AudioTrackAudioOutput.a {
        public b() {
        }
    }

    public c(a aVar) {
        Context context = aVar.a;
        this.a = context;
        bbl bblVar = aVar.b;
        bblVar.getClass();
        this.c = bblVar;
        this.b = aVar.c;
        this.g = aVar.d;
        this.d = context == null ? null : new b();
        this.f = dvf.a;
    }

    public final void a(AudioOutputProvider.a aVar) {
        Context context;
        vl4 b2;
        AudioDeviceInfo audioDeviceInfo = aVar.c;
        nc4 nc4Var = aVar.b;
        b();
        wl4 wl4Var = this.h;
        if (wl4Var == null && (context = this.a) != null) {
            wl4 wl4Var2 = new wl4(context, new ed(this, 1), nc4Var, audioDeviceInfo);
            this.h = wl4Var2;
            if (wl4Var2.j) {
                b2 = wl4Var2.g;
                b2.getClass();
            } else {
                wl4Var2.j = true;
                wl4.b bVar = wl4Var2.f;
                if (bVar != null) {
                    bVar.a.registerContentObserver(bVar.b, false, bVar);
                }
                Context context2 = wl4Var2.a;
                AudioManager a2 = hq4.a(context2);
                wl4.a aVar2 = wl4Var2.d;
                Handler handler = wl4Var2.c;
                a2.registerAudioDeviceCallback(aVar2, handler);
                b2 = vl4.b(context2, context2.registerReceiver(wl4Var2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), wl4Var2.i, wl4Var2.h);
                wl4Var2.g = b2;
            }
            this.g = b2;
        } else if (wl4Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(wl4Var.h)) {
                wl4Var.h = audioDeviceInfo;
                wl4Var.a(vl4.c(wl4Var.a, wl4Var.i, audioDeviceInfo));
            }
            wl4 wl4Var3 = this.h;
            if (!Objects.equals(nc4Var, wl4Var3.i)) {
                wl4Var3.i = nc4Var;
                wl4Var3.a(vl4.c(wl4Var3.a, nc4Var, wl4Var3.h));
            }
        }
        this.g.getClass();
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.i;
        boolean z = looper == null || looper == myLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (!z) {
            throw new IllegalStateException(f370.E("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.i = myLooper;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public final void c(dvf dvfVar) {
        this.f = dvfVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public final AudioOutputProvider.b d(AudioOutputProvider.a aVar) {
        a(aVar);
        androidx.media3.common.a aVar2 = aVar.a;
        nc4 nc4Var = aVar.b;
        androidx.media3.exoplayer.audio.a a2 = this.c.a(aVar2, nc4Var);
        AudioOutputProvider.b.a aVar3 = new AudioOutputProvider.b.a();
        String str = aVar2.n;
        int i = aVar2.H;
        int i2 = 0;
        if (!Objects.equals(str, MimeTypes.AUDIO_RAW) ? this.g.d(aVar2, nc4Var) != null : i == 2) {
            i2 = 2;
        }
        aVar3.d = i2;
        aVar3.a = a2.a;
        aVar3.b = a2.b;
        aVar3.c = a2.c;
        return aVar3.a();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public final AudioTrackAudioOutput e(AudioOutputProvider.d dVar) throws AudioOutputProvider.InitializationException {
        Context context;
        Context context2;
        Context createDeviceContext;
        int deviceId;
        try {
            int i = dVar.h;
            int i2 = dVar.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.j;
                if (context3 != null) {
                    deviceId = context3.getDeviceId();
                    if (deviceId != i2) {
                    }
                    context = this.j;
                    i = 0;
                }
                createDeviceContext = context2.createDeviceContext(i2);
                this.j = createDeviceContext;
                context = this.j;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(dVar.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : dVar.g.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(dVar.b).setChannelMask(dVar.c).setEncoding(dVar.a).build()).setTransferMode(1).setBufferSizeInBytes(dVar.f).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(dVar.e);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new AudioTrackAudioOutput(build, dVar, this.d, this.f);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new AudioOutputProvider.InitializationException();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new AudioOutputProvider.InitializationException(e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new AudioOutputProvider.InitializationException(e);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public final void f(cbl cblVar) {
        b();
        if (this.e == null) {
            ihz<AudioOutputProvider.c> ihzVar = new ihz<>(Thread.currentThread());
            this.e = ihzVar;
            ihzVar.j = false;
        }
        this.e.a(cblVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AudioOutputProvider.d g(AudioOutputProvider.a aVar) throws AudioOutputProvider.ConfigurationException {
        int intValue;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        int i4;
        int j;
        int D;
        androidx.media3.common.a aVar2 = aVar.a;
        boolean z7 = aVar.d;
        nc4 nc4Var = aVar.b;
        a(aVar);
        String str = aVar2.n;
        int i5 = aVar2.G;
        int i6 = aVar2.H;
        int i7 = aVar2.F;
        if (Objects.equals(str, MimeTypes.AUDIO_RAW)) {
            fxc0.p(y2r0.M(i6));
            intValue = y2r0.t(i7);
            i = y2r0.u(i6) * i7;
            z2 = false;
            z = false;
        } else {
            androidx.media3.exoplayer.audio.a a2 = z7 ? this.c.a(aVar2, nc4Var) : androidx.media3.exoplayer.audio.a.d;
            if (z7 && a2.a) {
                str.getClass();
                int d = io20.d(str, aVar2.k);
                int t = y2r0.t(i7);
                boolean z8 = a2.b;
                i6 = d;
                intValue = t;
                z2 = z8;
                i = -1;
                z3 = 1;
                z4 = true;
                i2 = aVar2.j;
                if (Objects.equals(str, MimeTypes.AUDIO_DTS_EXPRESS) && i2 == -1) {
                    i2 = 768000;
                }
                i3 = aVar.h;
                if (i3 == -1) {
                    z5 = true;
                    z6 = z3;
                } else {
                    int minBufferSize = AudioTrack.getMinBufferSize(i5, intValue, i6);
                    fxc0.z(minBufferSize != -2);
                    if (i == -1) {
                        i = 1;
                    }
                    double d2 = z4 ? 8.0d : 1.0d;
                    ((e) this.b).getClass();
                    if (z3 != 0) {
                        if (z3 == 1) {
                            z5 = true;
                            int D2 = x19.D(i6);
                            fxc0.z(D2 != -2147483647);
                            j = ipx.s((50000000 * D2) / 1000000);
                        } else {
                            if (z3 != 2) {
                                throw new IllegalArgumentException();
                            }
                            z5 = true;
                            int i8 = i6 == 5 ? 500000 : i6 == 8 ? 1000000 : 250000;
                            if (i2 != -1) {
                                RoundingMode roundingMode = RoundingMode.CEILING;
                                D = e9x.b(i2, 8);
                            } else {
                                D = x19.D(i6);
                                fxc0.z(D != -2147483647);
                            }
                            j = ipx.s((i8 * D) / 1000000);
                        }
                        i4 = i;
                        z6 = z3;
                    } else {
                        z5 = true;
                        z6 = z3;
                        long j2 = i5;
                        long j3 = i;
                        i4 = i;
                        j = y2r0.j(minBufferSize * 4, ipx.s(((250000 * j2) * j3) / 1000000), ipx.s(((750000 * j2) * j3) / 1000000));
                    }
                    i3 = (((Math.max(minBufferSize, (int) (j * d2)) + i4) - 1) / i4) * i4;
                }
                AudioOutputProvider.d.a aVar3 = new AudioOutputProvider.d.a();
                nc4 nc4Var2 = nc4.c;
                aVar3.i = -1;
                aVar3.b = i5;
                aVar3.c = intValue;
                aVar3.a = i6;
                aVar3.f = i3;
                aVar3.h = aVar.e;
                aVar3.g = nc4Var;
                boolean z9 = z5;
                aVar3.e = z6 != z9 ? z9 : false;
                aVar3.d = aVar.g;
                aVar3.j = z4;
                aVar3.k = z2;
                aVar3.i = aVar.f;
                return new AudioOutputProvider.d(aVar3);
            }
            Pair<Integer, Integer> d3 = this.g.d(aVar2, nc4Var);
            if (d3 == null) {
                String str2 = "Unable to configure passthrough for: " + aVar2;
                str2.getClass();
                throw new AudioOutputProvider.ConfigurationException(str2);
            }
            i6 = ((Integer) d3.first).intValue();
            intValue = ((Integer) d3.second).intValue();
            z = 2;
            i = -1;
            z2 = false;
        }
        z4 = false;
        z3 = z;
        i2 = aVar2.j;
        if (Objects.equals(str, MimeTypes.AUDIO_DTS_EXPRESS)) {
            i2 = 768000;
        }
        i3 = aVar.h;
        if (i3 == -1) {
        }
        AudioOutputProvider.d.a aVar32 = new AudioOutputProvider.d.a();
        nc4 nc4Var22 = nc4.c;
        aVar32.i = -1;
        aVar32.b = i5;
        aVar32.c = intValue;
        aVar32.a = i6;
        aVar32.f = i3;
        aVar32.h = aVar.e;
        aVar32.g = nc4Var;
        boolean z92 = z5;
        aVar32.e = z6 != z92 ? z92 : false;
        aVar32.d = aVar.g;
        aVar32.j = z4;
        aVar32.k = z2;
        aVar32.i = aVar.f;
        return new AudioOutputProvider.d(aVar32);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public final void release() {
        ihz<AudioOutputProvider.c> ihzVar = this.e;
        if (ihzVar != null) {
            ihzVar.d();
        }
        wl4 wl4Var = this.h;
        if (wl4Var != null) {
            Context context = wl4Var.a;
            if (wl4Var.j) {
                wl4Var.g = null;
                hq4.a(context).unregisterAudioDeviceCallback(wl4Var.d);
                context.unregisterReceiver(wl4Var.e);
                wl4.b bVar = wl4Var.f;
                if (bVar != null) {
                    bVar.a.unregisterContentObserver(bVar);
                }
                wl4Var.j = false;
            }
        }
    }
}
