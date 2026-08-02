package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.b;
import com.ironsource.Ua;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u2c extends h3c implements m2c {
    public final Context G0;
    public final ro0 H0;
    public final pn4 I0;
    public final umb J0;
    public int K0;
    public boolean L0;
    public b M0;
    public b N0;
    public long O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public boolean U0;
    public long V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2c(Context context, p2c p2cVar, boolean z, Handler handler, mg6 mg6Var, pn4 pn4Var) {
        super(context.getApplicationContext(), 1, p2cVar, z, 44100.0f);
        umb umbVar = Build.VERSION.SDK_INT >= 35 ? new umb() : null;
        this.G0 = context.getApplicationContext();
        this.I0 = pn4Var;
        this.J0 = umbVar;
        this.T0 = -1000;
        this.H0 = new ro0(handler, mg6Var, 0);
        this.V0 = C.TIME_UNSET;
    }

    public static vvf C0(b bVar, boolean z, pn4 pn4Var) {
        if (bVar.o == null) {
            av9 av9Var = hv9.b;
            return vvf.e;
        }
        if (pn4Var.h(bVar) != 0) {
            List e = s3c.e(MimeTypes.AUDIO_RAW, false, false);
            a3c a3cVar = e.isEmpty() ? null : (a3c) e.get(0);
            if (a3cVar != null) {
                return hv9.z(a3cVar);
            }
        }
        return s3c.g(bVar, z, false);
    }

    public final int B0(b bVar) {
        wn0 a;
        pn4 pn4Var = this.I0;
        if (pn4Var.X) {
            a = wn0.d;
        } else {
            ao0 b = ((mp0) pn4Var.r).b(pn4Var.g(bVar));
            vn0 vn0Var = new vn0();
            vn0Var.a = b.a;
            vn0Var.b = b.b;
            vn0Var.c = b.c;
            a = vn0Var.a();
        }
        if (!a.a) {
            return 0;
        }
        int i = a.b ? 1536 : 512;
        return a.c ? i | a.o : i;
    }

    public final void D0() {
        long j;
        long j2;
        long j3;
        j();
        pn4 pn4Var = this.I0;
        x6k x6kVar = pn4Var.b;
        if (!pn4Var.n() || pn4Var.F) {
            j = Long.MIN_VALUE;
            j2 = Long.MIN_VALUE;
        } else {
            long min = Math.min(pn4Var.t.a(), nik.Z(((do0) pn4Var.p.e).b, pn4Var.j()));
            ArrayDeque arrayDeque = pn4Var.h;
            while (!arrayDeque.isEmpty() && min >= ((mn4) arrayDeque.getFirst()).c) {
                pn4Var.w = (mn4) arrayDeque.remove();
            }
            mn4 mn4Var = pn4Var.w;
            long j4 = min - mn4Var.c;
            long C = nik.C(j4, mn4Var.a.a);
            if (arrayDeque.isEmpty()) {
                xvh xvhVar = (xvh) x6kVar.d;
                if (!xvhVar.isActive()) {
                    j = Long.MIN_VALUE;
                } else if (xvhVar.m >= 1024) {
                    long j5 = xvhVar.l;
                    xvhVar.i.getClass();
                    long y = j5 - (((tvh) r10.q).y() * (r10.i * r10.b));
                    int i = xvhVar.g.a;
                    int i2 = xvhVar.f.a;
                    j = Long.MIN_VALUE;
                    long j6 = xvhVar.m;
                    j4 = i == i2 ? nik.b0(j4, y, j6, RoundingMode.DOWN) : nik.b0(j4, y * i, j6 * i2, RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    j4 = (long) (xvhVar.b * j4);
                }
                mn4 mn4Var2 = pn4Var.w;
                j3 = mn4Var2.b + j4;
                mn4Var2.d = j4 - C;
            } else {
                j = Long.MIN_VALUE;
                mn4 mn4Var3 = pn4Var.w;
                j3 = mn4Var3.b + C + mn4Var3.d;
            }
            long j7 = ((ehh) x6kVar.c).l;
            j2 = nik.Z(((do0) pn4Var.p.e).b, j7) + j3;
            long j8 = pn4Var.Z;
            if (j7 > j8) {
                long Z = nik.Z(((do0) pn4Var.p.e).b, j7 - j8);
                pn4Var.Z = j7;
                pn4Var.a0 += Z;
                Handler handler = pn4Var.b0;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    pn4Var.b0 = handler;
                }
                handler.removeCallbacksAndMessages(null);
                pn4Var.b0.postDelayed(new wb3(pn4Var, 7), 100L);
            }
        }
        if (j2 != j) {
            if (!this.P0) {
                j2 = Math.max(this.O0, j2);
            }
            this.O0 = j2;
            this.P0 = false;
        }
    }

    @Override // defpackage.h3c
    public final lm4 F(a3c a3cVar, b bVar, b bVar2, boolean z) {
        lm4 b = a3cVar.b(bVar, bVar2);
        int i = b.e;
        if (this.H == null && w0(bVar2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(a3cVar.a);
        if (bVar2.p > this.K0) {
            i |= 64;
        }
        int i2 = i;
        return new lm4(a3cVar.a, bVar, bVar2, i2 != 0 ? 0 : b.d, i2);
    }

    @Override // defpackage.h3c
    public final float N(float f, b bVar, b[] bVarArr) {
        int i = -1;
        for (b bVar2 : bVarArr) {
            int i2 = bVar2.H;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.h3c
    public final ArrayList O(b bVar, boolean z) {
        vvf C0 = C0(bVar, z, this.I0);
        HashMap hashMap = s3c.a;
        ArrayList arrayList = new ArrayList(C0);
        Collections.sort(arrayList, new rs2(new ow9(2, this.G0, bVar), 6));
        return arrayList;
    }

    @Override // defpackage.h3c
    public final long P(boolean z, long j, long j2) {
        long b0;
        pn4 pn4Var = this.I0;
        boolean z2 = pn4Var.l() && this.V0 != C.TIME_UNSET;
        if (this.U0) {
            if (!pn4Var.n()) {
                b0 = -9223372036854775807L;
            } else if (pn4Var.p.i()) {
                b0 = nik.Z(((do0) pn4Var.p.e).b, pn4Var.t.a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = pn4Var.t.a.getBufferSizeInFrames();
                int C = o1j.C(((do0) pn4Var.p.e).a);
                z1a.E(C != -2147483647);
                b0 = nik.b0(bufferSizeInFrames, 1000000L, C, RoundingMode.DOWN);
            }
            if (this.S0 && z2 && b0 != C.TIME_UNSET) {
                float min = Math.min(b0, this.V0 - j);
                hke hkeVar = pn4Var.x;
                return Math.max(Ua.s, (long) ((min / (hkeVar != null ? hkeVar.a : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.r0) {
            return 1000000L;
        }
        return Ua.s;
    }

    @Override // defpackage.h3c
    public final vng R(a3c a3cVar, b bVar, MediaCrypto mediaCrypto, float f) {
        int i;
        b[] bVarArr = this.j;
        bVarArr.getClass();
        String str = a3cVar.a;
        "OMX.google.raw.decoder".equals(str);
        int i2 = bVar.p;
        String str2 = bVar.o;
        int i3 = bVar.G;
        int i4 = 0;
        if (bVarArr.length != 1) {
            for (b bVar2 : bVarArr) {
                if (a3cVar.b(bVar, bVar2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i2 = Math.max(i2, bVar2.p);
                }
            }
        }
        this.K0 = i2;
        this.L0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = a3cVar.c;
        int i5 = this.K0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i3);
        int i6 = bVar.H;
        mediaFormat.setInteger("sample-rate", i6);
        yaa.R(mediaFormat, bVar.r);
        yaa.H(mediaFormat, "max-input-size", i5);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair b = wz2.b(bVar);
            if (b != null) {
                yaa.H(mediaFormat, "profile", ((Integer) b.first).intValue());
                yaa.H(mediaFormat, "level", ((Integer) b.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        qm8 qm8Var = new qm8();
        qm8Var.n = sjc.p(MimeTypes.AUDIO_RAW);
        qm8Var.F = i3;
        qm8Var.G = i6;
        qm8Var.H = 4;
        b bVar3 = new b(qm8Var);
        pn4 pn4Var = this.I0;
        if (pn4Var.h(bVar3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i7 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.T0));
        }
        b bVar4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            eo0 eo0Var = pn4Var.r;
            jn0 jn0Var = eo0Var instanceof mp0 ? ((mp0) eo0Var).g : null;
            int i8 = 12;
            if (jn0Var == null) {
                tgj.d0("AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                vv9 vv9Var = en9.a;
                Iterator it = jn0Var.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = 0;
                        break;
                    }
                    Integer num = (Integer) it.next();
                    i = num.intValue();
                    if (en9.a.contains(num)) {
                        break;
                    }
                }
                if (i != 0) {
                    i8 = i;
                } else {
                    Iterator it2 = jn0Var.c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Integer num2 = (Integer) it2.next();
                        int intValue = num2.intValue();
                        if (en9.a.contains(num2)) {
                            i4 = intValue;
                            break;
                        }
                    }
                    if (i4 != 0) {
                        i8 = i4;
                    }
                }
                int bitCount = Integer.bitCount(i8);
                mediaFormat.setInteger("channel-mask", i8);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        D(mediaFormat);
        if (MimeTypes.AUDIO_RAW.equals(a3cVar.b) && !MimeTypes.AUDIO_RAW.equals(str2)) {
            bVar4 = bVar;
        }
        this.N0 = bVar4;
        return new vng(a3cVar, mediaFormat, bVar, null, mediaCrypto, this.J0);
    }

    @Override // defpackage.h3c
    public final void S(im4 im4Var) {
        b bVar;
        kn4 kn4Var;
        if (Build.VERSION.SDK_INT < 29 || (bVar = im4Var.g) == null || !Objects.equals(bVar.o, MimeTypes.AUDIO_OPUS) || !this.f0) {
            return;
        }
        ByteBuffer byteBuffer = im4Var.l;
        byteBuffer.getClass();
        b bVar2 = im4Var.g;
        bVar2.getClass();
        int i = bVar2.J;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            pn4 pn4Var = this.I0;
            lp0 lp0Var = pn4Var.t;
            if (lp0Var == null || !lp0Var.c() || (kn4Var = pn4Var.p) == null || !((do0) kn4Var.e).k) {
                return;
            }
            pn4Var.t.d(i, i2);
        }
    }

    @Override // defpackage.h3c
    public final void Y(Exception exc) {
        tgj.A("Audio codec error", exc);
        ro0 ro0Var = this.H0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new oo0(ro0Var, exc, 0));
        }
    }

    @Override // defpackage.h3c
    public final void Z(String str, long j, long j2) {
        ro0 ro0Var = this.H0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new oo0(ro0Var, str, j, j2));
        }
    }

    @Override // defpackage.h3c
    public final void a0(vz2 vz2Var) {
        ro0 ro0Var = this.H0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new r0(16, ro0Var, vz2Var));
        }
    }

    @Override // defpackage.m2c
    public final void b(hke hkeVar) {
        pn4 pn4Var = this.I0;
        if (pn4Var.v()) {
            pn4Var.x = hkeVar;
            pn4Var.t();
            return;
        }
        hke hkeVar2 = new hke(nik.i(hkeVar.a, 0.1f, 8.0f), nik.i(hkeVar.b, 0.1f, 8.0f));
        pn4Var.x = hkeVar2;
        mn4 mn4Var = new mn4(hkeVar2, C.TIME_UNSET, C.TIME_UNSET);
        if (pn4Var.n()) {
            pn4Var.v = mn4Var;
        } else {
            pn4Var.w = mn4Var;
        }
    }

    @Override // defpackage.h3c
    public final void b0(String str) {
        ro0 ro0Var = this.H0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new oo0(ro0Var, str, 5));
        }
    }

    @Override // defpackage.m2c
    public final boolean c() {
        boolean z = this.R0;
        this.R0 = false;
        return z;
    }

    @Override // defpackage.h3c
    public final lm4 c0(fp4 fp4Var) {
        b bVar = (b) fp4Var.c;
        bVar.getClass();
        this.M0 = bVar;
        lm4 c0 = super.c0(fp4Var);
        ro0 ro0Var = this.H0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new oo0(ro0Var, bVar, c0));
        }
        return c0;
    }

    @Override // defpackage.h3c
    public final void d0(b bVar, MediaFormat mediaFormat) {
        b bVar2 = this.N0;
        boolean z = true;
        int[] iArr = null;
        if (bVar2 != null) {
            bVar = bVar2;
        } else if (this.M != null) {
            mediaFormat.getClass();
            int integer = MimeTypes.AUDIO_RAW.equals(bVar.o) ? bVar.I : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? nik.E(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            qm8 qm8Var = new qm8();
            qm8Var.n = sjc.p(MimeTypes.AUDIO_RAW);
            qm8Var.H = integer;
            qm8Var.I = bVar.J;
            qm8Var.J = bVar.K;
            qm8Var.k = bVar.l;
            qm8Var.a = bVar.a;
            qm8Var.b = bVar.b;
            qm8Var.c = hv9.v(bVar.c);
            qm8Var.d = bVar.d;
            qm8Var.e = bVar.e;
            qm8Var.f = bVar.f;
            qm8Var.F = mediaFormat.getInteger("channel-count");
            qm8Var.G = mediaFormat.getInteger("sample-rate");
            bVar = new b(qm8Var);
            if (this.L0) {
                int i = bVar.G;
                if (i == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            pn4 pn4Var = this.I0;
            if (i2 >= 29) {
                if (this.f0) {
                    syf syfVar = this.d;
                    syfVar.getClass();
                    if (syfVar.a != 0) {
                        syf syfVar2 = this.d;
                        syfVar2.getClass();
                        int i3 = syfVar2.a;
                        if (i2 < 29) {
                            z = false;
                        }
                        z1a.E(z);
                        pn4Var.i = i3;
                    }
                }
                if (i2 < 29) {
                    z = false;
                }
                z1a.E(z);
                pn4Var.i = 0;
            }
            pn4Var.c(bVar, iArr);
        } catch (to0 e) {
            throw d(e, e.a, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // defpackage.h3c
    public final void g0() {
        this.I0.E = true;
    }

    @Override // defpackage.m2c
    /* renamed from: getPlaybackParameters */
    public final hke mo9getPlaybackParameters() {
        return this.I0.x;
    }

    @Override // defpackage.m2c
    public final long getPositionUs() {
        if (this.h == 2) {
            D0();
        }
        return this.O0;
    }

    @Override // defpackage.n51
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.h3c, defpackage.n51, defpackage.jte
    public final void handleMessage(int i, Object obj) {
        umb umbVar;
        pn4 pn4Var = this.I0;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (pn4Var.H != floatValue) {
                pn4Var.H = floatValue;
                if (pn4Var.n()) {
                    pn4Var.t.a.setVolume(pn4Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            an0 an0Var = (an0) obj;
            an0Var.getClass();
            if (pn4Var.u.equals(an0Var)) {
                return;
            }
            pn4Var.u = an0Var;
            if (pn4Var.V) {
                return;
            }
            pn4Var.r();
            return;
        }
        if (i == 6) {
            sv0 sv0Var = (sv0) obj;
            sv0Var.getClass();
            if (pn4Var.S.equals(sv0Var)) {
                return;
            }
            if (pn4Var.t != null) {
                pn4Var.S.getClass();
            }
            pn4Var.S = sv0Var;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            pn4Var.T = audioDeviceInfo;
            lp0 lp0Var = pn4Var.t;
            if (lp0Var != null) {
                lp0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.T0 = ((Integer) obj).intValue();
            r2c r2cVar = this.M;
            if (r2cVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.T0));
                r2cVar.c(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            pn4Var.y = ((Boolean) obj).booleanValue();
            mn4 mn4Var = new mn4(pn4Var.v() ? hke.d : pn4Var.x, C.TIME_UNSET, C.TIME_UNSET);
            if (pn4Var.n()) {
                pn4Var.v = mn4Var;
                return;
            } else {
                pn4Var.w = mn4Var;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (pn4Var.R) {
                if (pn4Var.Q == intValue) {
                    pn4Var.R = false;
                }
                if (Build.VERSION.SDK_INT >= 35 || (umbVar = this.J0) == null) {
                    return;
                }
                umbVar.g(intValue);
                return;
            }
            if (pn4Var.Q != intValue) {
                pn4Var.Q = intValue;
                pn4Var.P = intValue != 0;
                pn4Var.r();
            }
            if (Build.VERSION.SDK_INT >= 35) {
                return;
            } else {
                return;
            }
        }
        if (i == 19) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = pn4.c0;
            if (intValue2 == 0 || intValue2 == -1) {
                intValue2 = -1;
            }
            if (pn4Var.U == intValue2) {
                return;
            }
            pn4Var.U = intValue2;
            pn4Var.r();
            return;
        }
        if (i != 20) {
            super.handleMessage(i, obj);
            return;
        }
        obj.getClass();
        eo0 eo0Var = (eo0) obj;
        if (eo0Var.equals(pn4Var.r)) {
            return;
        }
        ((mp0) pn4Var.r).d();
        pn4Var.r = eo0Var;
        dn4 dn4Var = pn4Var.s;
        if (dn4Var != null) {
            mp0 mp0Var = (mp0) eo0Var;
            mp0Var.f();
            vdb vdbVar = mp0Var.e;
            if (vdbVar == null) {
                vdbVar = new vdb(Thread.currentThread());
                mp0Var.e = vdbVar;
            }
            vdbVar.a(dn4Var);
        }
        pn4Var.r();
    }

    @Override // defpackage.n51
    public final boolean j() {
        if (!this.r0) {
            return false;
        }
        pn4 pn4Var = this.I0;
        if (pn4Var.n()) {
            return pn4Var.L && !pn4Var.l();
        }
        return true;
    }

    @Override // defpackage.h3c
    public final boolean j0(long j, long j2, r2c r2cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, b bVar) {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.V0 = C.TIME_UNSET;
        if (this.N0 != null && (i2 & 2) != 0) {
            r2cVar.getClass();
            r2cVar.x(i);
            return true;
        }
        pn4 pn4Var = this.I0;
        if (z) {
            if (r2cVar != null) {
                r2cVar.x(i);
            }
            this.v0.g += i3;
            pn4Var.E = true;
            return true;
        }
        try {
            if (!pn4Var.k(j3, i3, byteBuffer)) {
                this.V0 = j3;
                return false;
            }
            if (r2cVar != null) {
                r2cVar.x(i);
            }
            this.v0.f += i3;
            return true;
        } catch (vo0 e) {
            b bVar2 = this.M0;
            if (this.f0) {
                syf syfVar = this.d;
                syfVar.getClass();
                if (syfVar.a != 0) {
                    i5 = IronSourceConstants.errorCode_showInProgress;
                    throw d(e, bVar2, e.a, i5);
                }
            }
            i5 = IronSourceConstants.errorCode_biddingDataException;
            throw d(e, bVar2, e.a, i5);
        } catch (yo0 e2) {
            if (this.f0) {
                syf syfVar2 = this.d;
                syfVar2.getClass();
                if (syfVar2.a != 0) {
                    i4 = IronSourceConstants.errorCode_loadInProgress;
                    throw d(e2, bVar, e2.b, i4);
                }
            }
            i4 = IronSourceConstants.errorCode_isReadyException;
            throw d(e2, bVar, e2.b, i4);
        }
    }

    @Override // defpackage.n51
    public final boolean l() {
        return this.I0.l();
    }

    @Override // defpackage.h3c, defpackage.n51
    public final void m() {
        ro0 ro0Var = this.H0;
        this.Q0 = true;
        this.M0 = null;
        this.V0 = C.TIME_UNSET;
        this.S0 = false;
        try {
            this.I0.f();
            try {
                super.m();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.m();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.h3c
    public final void m0() {
        try {
            pn4 pn4Var = this.I0;
            if (!pn4Var.L && pn4Var.n() && pn4Var.e()) {
                pn4Var.p();
                pn4Var.L = true;
            }
            long j = this.w0.f;
            if (j != C.TIME_UNSET) {
                this.V0 = j;
            }
        } catch (yo0 e) {
            throw d(e, e.c, e.b, this.f0 ? IronSourceConstants.errorCode_loadInProgress : IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // defpackage.n51
    public final void n(boolean z, boolean z2) {
        dm4 dm4Var = new dm4(1);
        this.v0 = dm4Var;
        ro0 ro0Var = this.H0;
        Handler handler = ro0Var.a;
        int i = 6;
        if (handler != null) {
            handler.post(new oo0(ro0Var, dm4Var, i));
        }
        syf syfVar = this.d;
        syfVar.getClass();
        boolean z3 = syfVar.b;
        pn4 pn4Var = this.I0;
        if (z3) {
            z1a.E(pn4Var.P);
            if (!pn4Var.V) {
                pn4Var.V = true;
                pn4Var.r();
            }
        } else if (pn4Var.V) {
            pn4Var.V = false;
            pn4Var.r();
        }
        cse cseVar = this.f;
        cseVar.getClass();
        pn4Var.m = cseVar;
        tqi tqiVar = this.g;
        tqiVar.getClass();
        ((mp0) pn4Var.r).f = tqiVar;
        pn4Var.n = new d4a(this, i);
    }

    @Override // defpackage.h3c, defpackage.n51
    public final void o(long j, boolean z, boolean z2) {
        super.o(j, z, z2);
        this.I0.f();
        this.O0 = j;
        this.V0 = C.TIME_UNSET;
        this.R0 = false;
        this.S0 = false;
        this.P0 = true;
    }

    @Override // defpackage.n51
    public final void p() {
        umb umbVar;
        ((mp0) this.I0.r).d();
        if (Build.VERSION.SDK_INT < 35 || (umbVar = this.J0) == null) {
            return;
        }
        umbVar.release();
    }

    @Override // defpackage.n51
    public final void q() {
        pn4 pn4Var = this.I0;
        this.R0 = false;
        this.S0 = false;
        this.V0 = C.TIME_UNSET;
        try {
            try {
                this.f0 = false;
                n0();
                l0();
                xb5 xb5Var = this.H;
                if (xb5Var != null) {
                    xb5Var.d(null);
                }
                this.H = null;
            } catch (Throwable th) {
                xb5 xb5Var2 = this.H;
                if (xb5Var2 != null) {
                    xb5Var2.d(null);
                }
                this.H = null;
                throw th;
            }
        } finally {
            if (this.Q0) {
                this.Q0 = false;
                pn4Var.s();
            }
        }
    }

    @Override // defpackage.n51
    public final void r() {
        this.I0.o();
        this.U0 = true;
    }

    @Override // defpackage.n51
    public final void s() {
        D0();
        this.U0 = false;
        pn4 pn4Var = this.I0;
        pn4Var.O = false;
        if (pn4Var.n()) {
            lp0 lp0Var = pn4Var.t;
            op0 op0Var = lp0Var.e;
            op0Var.k = 0L;
            op0Var.t = 0;
            op0Var.s = 0;
            op0Var.l = 0L;
            op0Var.y = C.TIME_UNSET;
            op0Var.z = C.TIME_UNSET;
            if (op0Var.u == C.TIME_UNSET) {
                op0Var.h.a(0);
            }
            op0Var.w = op0Var.a();
            if (!lp0Var.j || lp0Var.c()) {
                lp0Var.a.pause();
            }
        }
        this.S0 = false;
    }

    @Override // defpackage.h3c
    public final boolean w0(b bVar) {
        syf syfVar = this.d;
        syfVar.getClass();
        if (syfVar.a != 0) {
            int B0 = B0(bVar);
            if ((B0 & 512) != 0) {
                syf syfVar2 = this.d;
                syfVar2.getClass();
                if (syfVar2.a == 2 || (B0 & 1024) != 0 || (bVar.J == 0 && bVar.K == 0)) {
                    return true;
                }
            }
        }
        return this.I0.h(bVar) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if ((r4.isEmpty() ? null : (defpackage.a3c) r4.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    @Override // defpackage.h3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x0(b bVar) {
        int i;
        qm8 qm8Var;
        boolean z;
        boolean z2 = true;
        int a = n51.a(1, 0, 0, 0);
        if (!sjc.k(bVar.o)) {
            return n51.a(0, 0, 0, 0);
        }
        int i2 = bVar.P;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        pn4 pn4Var = this.I0;
        if (z4) {
            if (z3) {
                List e = s3c.e(MimeTypes.AUDIO_RAW, false, false);
            }
            i = B0(bVar);
            if (pn4Var.h(bVar) != 0) {
                return n51.a(4, 8, 32, i);
            }
            if (MimeTypes.AUDIO_RAW.equals(bVar.o) || pn4Var.h(bVar) != 0) {
                int i4 = bVar.G;
                int i5 = bVar.H;
                qm8Var = new qm8();
                qm8Var.n = sjc.p(MimeTypes.AUDIO_RAW);
                qm8Var.F = i4;
                qm8Var.G = i5;
                qm8Var.H = 2;
                if (pn4Var.h(new b(qm8Var)) != 0) {
                    vvf C0 = C0(bVar, false, pn4Var);
                    if (!C0.isEmpty()) {
                        if (!z4) {
                            return n51.a(2, 0, 0, 0);
                        }
                        a3c a3cVar = (a3c) C0.get(0);
                        Context context = this.G0;
                        boolean e2 = a3cVar.e(context, bVar);
                        if (!e2) {
                            for (int i6 = 1; i6 < C0.d; i6++) {
                                a3c a3cVar2 = (a3c) C0.get(i6);
                                if (a3cVar2.e(context, bVar)) {
                                    z = false;
                                    a3cVar = a3cVar2;
                                    break;
                                }
                            }
                        }
                        z = true;
                        z2 = e2;
                        int i7 = z2 ? 4 : 3;
                        if (z2 && a3cVar.f(bVar)) {
                            i3 = 16;
                        }
                        return i7 | i3 | 32 | (a3cVar.g ? 64 : 0) | (z ? 128 : 0) | i;
                    }
                }
            }
            return a;
        }
        i = 0;
        if (MimeTypes.AUDIO_RAW.equals(bVar.o)) {
        }
        int i42 = bVar.G;
        int i52 = bVar.H;
        qm8Var = new qm8();
        qm8Var.n = sjc.p(MimeTypes.AUDIO_RAW);
        qm8Var.F = i42;
        qm8Var.G = i52;
        qm8Var.H = 2;
        if (pn4Var.h(new b(qm8Var)) != 0) {
        }
        return a;
    }

    @Override // defpackage.h3c
    public final void e0() {
    }

    @Override // defpackage.n51
    public final m2c g() {
        return this;
    }
}
