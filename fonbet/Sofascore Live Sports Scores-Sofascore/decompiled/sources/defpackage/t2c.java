package defpackage;

import android.content.Context;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t2c extends g3c implements l2c {
    public final Context E0;
    public final qo0 F0;
    public final on4 G0;
    public int H0;
    public boolean I0;
    public sm8 J0;
    public long K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public yg6 O0;

    public t2c(Context context, o2c o2cVar, Handler handler, lg6 lg6Var, on4 on4Var) {
        super(1, o2cVar, 44100.0f);
        this.E0 = context.getApplicationContext();
        this.G0 = on4Var;
        this.F0 = new qo0(handler, lg6Var);
        on4Var.r = new bka(this, 4);
    }

    public static hv9 m0(hc5 hc5Var, sm8 sm8Var, boolean z, on4 on4Var) {
        String str = sm8Var.l;
        if (str == null) {
            av9 av9Var = hv9.b;
            return vvf.e;
        }
        if (on4Var.f(sm8Var) != 0) {
            List e = r3c.e(MimeTypes.AUDIO_RAW, false, false);
            z2c z2cVar = e.isEmpty() ? null : (z2c) e.get(0);
            if (z2cVar != null) {
                return hv9.z(z2cVar);
            }
        }
        hc5Var.getClass();
        List e2 = r3c.e(str, z, false);
        String b = r3c.b(sm8Var);
        if (b == null) {
            return hv9.v(e2);
        }
        List e3 = r3c.e(b, z, false);
        zu9 s = hv9.s();
        s.e(e2);
        s.e(e3);
        return s.g();
    }

    @Override // defpackage.g3c
    public final float G(float f, sm8[] sm8VarArr) {
        int i = -1;
        for (sm8 sm8Var : sm8VarArr) {
            int i2 = sm8Var.z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.g3c
    public final ArrayList H(hc5 hc5Var, sm8 sm8Var, boolean z) {
        hv9 m0 = m0(hc5Var, sm8Var, z, this.G0);
        Pattern pattern = r3c.a;
        ArrayList arrayList = new ArrayList(m0);
        Collections.sort(arrayList, new rs2(new kr9(sm8Var, 8), 7));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if ("AXON 7 mini".equals(r4) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    @Override // defpackage.g3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n2c I(z2c z2cVar, sm8 sm8Var, MediaCrypto mediaCrypto, float f) {
        boolean z;
        MediaFormat mediaFormat;
        sm8[] sm8VarArr = this.h;
        sm8VarArr.getClass();
        int l0 = l0(z2cVar, sm8Var);
        if (sm8VarArr.length != 1) {
            for (sm8 sm8Var2 : sm8VarArr) {
                if (z2cVar.b(sm8Var, sm8Var2).d != 0) {
                    l0 = Math.max(l0, l0(z2cVar, sm8Var2));
                }
            }
        }
        this.H0 = l0;
        String str = z2cVar.a;
        int i = lik.a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && Payload.SOURCE_SAMSUNG.equals(lik.c)) {
            String str2 = lik.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.I0 = z;
                String str3 = z2cVar.c;
                int i2 = this.H0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                int i3 = sm8Var.y;
                String str4 = sm8Var.l;
                mediaFormat.setInteger("channel-count", i3);
                int i4 = sm8Var.z;
                mediaFormat.setInteger("sample-rate", i4);
                waa.L(mediaFormat, sm8Var.n);
                waa.H(mediaFormat, "max-input-size", i2);
                if (i >= 23) {
                    mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                    if (f != -1.0f) {
                        if (i == 23) {
                            String str5 = lik.d;
                            if (!"ZTE B2017G".equals(str5)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
                if (i <= 28 && "audio/ac4".equals(str4)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i >= 24) {
                    int i5 = sm8Var.y;
                    pm8 pm8Var = new pm8();
                    pm8Var.k = MimeTypes.AUDIO_RAW;
                    pm8Var.x = i5;
                    pm8Var.y = i4;
                    pm8Var.z = 4;
                    if (this.G0.f(new sm8(pm8Var)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                this.J0 = (MimeTypes.AUDIO_RAW.equals(z2cVar.b) || MimeTypes.AUDIO_RAW.equals(str4)) ? null : sm8Var;
                return new n2c(z2cVar, mediaFormat, sm8Var, null, mediaCrypto);
            }
        }
        z = false;
        this.I0 = z;
        String str32 = z2cVar.c;
        int i22 = this.H0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        int i32 = sm8Var.y;
        String str42 = sm8Var.l;
        mediaFormat.setInteger("channel-count", i32);
        int i42 = sm8Var.z;
        mediaFormat.setInteger("sample-rate", i42);
        waa.L(mediaFormat, sm8Var.n);
        waa.H(mediaFormat, "max-input-size", i22);
        if (i >= 23) {
        }
        if (i <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
        }
        if (i >= 32) {
        }
        this.J0 = (MimeTypes.AUDIO_RAW.equals(z2cVar.b) || MimeTypes.AUDIO_RAW.equals(str42)) ? null : sm8Var;
        return new n2c(z2cVar, mediaFormat, sm8Var, null, mediaCrypto);
    }

    @Override // defpackage.g3c
    public final void N(Exception exc) {
        m6k.C("Audio codec error", exc);
        qo0 qo0Var = this.F0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new no0(qo0Var, exc, 3));
        }
    }

    @Override // defpackage.g3c
    public final void O(String str, long j, long j2) {
        qo0 qo0Var = this.F0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new no0(qo0Var, str, j, j2));
        }
    }

    @Override // defpackage.g3c
    public final void P(String str) {
        qo0 qo0Var = this.F0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new no0(qo0Var, str, 0));
        }
    }

    @Override // defpackage.g3c
    public final km4 Q(fp4 fp4Var) {
        km4 Q = super.Q(fp4Var);
        sm8 sm8Var = (sm8) fp4Var.c;
        qo0 qo0Var = this.F0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new no0(qo0Var, sm8Var, Q));
        }
        return Q;
    }

    @Override // defpackage.g3c
    public final void R(sm8 sm8Var, MediaFormat mediaFormat) {
        sm8 sm8Var2 = this.J0;
        int[] iArr = null;
        if (sm8Var2 != null) {
            sm8Var = sm8Var2;
        } else if (this.I != null) {
            String str = sm8Var.l;
            int i = sm8Var.y;
            int o = MimeTypes.AUDIO_RAW.equals(str) ? sm8Var.A : (lik.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? lik.o(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            pm8 pm8Var = new pm8();
            pm8Var.k = MimeTypes.AUDIO_RAW;
            pm8Var.z = o;
            pm8Var.A = sm8Var.B;
            pm8Var.B = sm8Var.C;
            pm8Var.x = mediaFormat.getInteger("channel-count");
            pm8Var.y = mediaFormat.getInteger("sample-rate");
            sm8Var = new sm8(pm8Var);
            if (this.I0 && sm8Var.y == 6 && i < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = i2;
                }
            }
        }
        try {
            this.G0.b(sm8Var, iArr);
        } catch (so0 e) {
            throw c(e, e.a, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // defpackage.g3c
    public final void S() {
        this.G0.getClass();
    }

    @Override // defpackage.g3c
    public final void U() {
        this.G0.G = true;
    }

    @Override // defpackage.g3c
    public final void V(hm4 hm4Var) {
        if (!this.L0 || hm4Var.i(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(hm4Var.j - this.K0) > 500000) {
            this.K0 = hm4Var.j;
        }
        this.L0 = false;
    }

    @Override // defpackage.g3c
    public final boolean X(long j, long j2, q2c q2cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, sm8 sm8Var) {
        byteBuffer.getClass();
        if (this.J0 != null && (i2 & 2) != 0) {
            q2cVar.getClass();
            q2cVar.C(i, false);
            return true;
        }
        on4 on4Var = this.G0;
        if (z) {
            if (q2cVar != null) {
                q2cVar.C(i, false);
            }
            this.z0.g += i3;
            on4Var.G = true;
            return true;
        }
        try {
            if (!on4Var.j(j3, i3, byteBuffer)) {
                return false;
            }
            if (q2cVar != null) {
                q2cVar.C(i, false);
            }
            this.z0.f += i3;
            return true;
        } catch (uo0 e) {
            throw c(e, e.c, e.b, IronSourceConstants.errorCode_biddingDataException);
        } catch (xo0 e2) {
            throw c(e2, sm8Var, e2.b, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // defpackage.l2c
    public final void a(gke gkeVar) {
        on4 on4Var = this.G0;
        on4Var.getClass();
        gke gkeVar2 = new gke(lik.g(gkeVar.a, 0.1f, 8.0f), lik.g(gkeVar.b, 0.1f, 8.0f));
        if (!on4Var.k || lik.a < 23) {
            on4Var.r(gkeVar2, on4Var.g().b);
        } else {
            on4Var.s(gkeVar2);
        }
    }

    @Override // defpackage.g3c
    public final void a0() {
        try {
            on4 on4Var = this.G0;
            if (!on4Var.S && on4Var.m() && on4Var.c()) {
                on4Var.o();
                on4Var.S = true;
            }
        } catch (xo0 e) {
            throw c(e, e.c, e.b, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // defpackage.m51
    public final String e() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.g3c, defpackage.m51
    public final boolean g() {
        if (!this.v0) {
            return false;
        }
        on4 on4Var = this.G0;
        if (on4Var.m()) {
            return on4Var.S && !on4Var.k();
        }
        return true;
    }

    @Override // defpackage.g3c
    public final boolean g0(sm8 sm8Var) {
        return this.G0.f(sm8Var) != 0;
    }

    @Override // defpackage.l2c
    public final gke getPlaybackParameters() {
        on4 on4Var = this.G0;
        return on4Var.k ? on4Var.y : on4Var.g().a;
    }

    @Override // defpackage.l2c, defpackage.m2c
    public final long getPositionUs() {
        if (this.f == 2) {
            n0();
        }
        return this.K0;
    }

    @Override // defpackage.g3c, defpackage.m51
    public final boolean h() {
        return this.G0.k() || super.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if ((r5.isEmpty() ? null : (defpackage.z2c) r5.get(0)) != null) goto L30;
     */
    @Override // defpackage.g3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h0(hc5 hc5Var, sm8 sm8Var) {
        boolean z;
        boolean z2 = true;
        int b = m51.b(1, 0, 0);
        if (!rjc.g(sm8Var.l)) {
            return m51.b(0, 0, 0);
        }
        int i = lik.a >= 21 ? 32 : 0;
        int i2 = sm8Var.E;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        on4 on4Var = this.G0;
        if (z4 && on4Var.f(sm8Var) != 0) {
            if (z3) {
                List e = r3c.e(MimeTypes.AUDIO_RAW, false, false);
            }
            return m51.b(4, 8, i);
        }
        if (!MimeTypes.AUDIO_RAW.equals(sm8Var.l) || on4Var.f(sm8Var) != 0) {
            int i4 = sm8Var.y;
            int i5 = sm8Var.z;
            pm8 pm8Var = new pm8();
            pm8Var.k = MimeTypes.AUDIO_RAW;
            pm8Var.x = i4;
            pm8Var.y = i5;
            pm8Var.z = 2;
            if (on4Var.f(new sm8(pm8Var)) != 0) {
                hv9 m0 = m0(hc5Var, sm8Var, false, on4Var);
                if (!m0.isEmpty()) {
                    if (!z4) {
                        return m51.b(2, 0, 0);
                    }
                    z2c z2cVar = (z2c) m0.get(0);
                    boolean c = z2cVar.c(sm8Var);
                    if (!c) {
                        for (int i6 = 1; i6 < m0.size(); i6++) {
                            z2c z2cVar2 = (z2c) m0.get(i6);
                            if (z2cVar2.c(sm8Var)) {
                                z = false;
                                z2cVar = z2cVar2;
                                break;
                            }
                        }
                    }
                    z = true;
                    z2 = c;
                    int i7 = z2 ? 4 : 3;
                    if (z2 && z2cVar.d(sm8Var)) {
                        i3 = 16;
                    }
                    return i7 | i3 | i | (z2cVar.g ? 64 : 0) | (z ? 128 : 0);
                }
            }
        }
        return b;
    }

    @Override // defpackage.m51, defpackage.ite
    public final void handleMessage(int i, Object obj) {
        on4 on4Var = this.G0;
        if (i == 2) {
            float floatValue = ((Float) obj).floatValue();
            if (on4Var.J != floatValue) {
                on4Var.J = floatValue;
                if (on4Var.m()) {
                    int i2 = lik.a;
                    AudioTrack audioTrack = on4Var.u;
                    float f = on4Var.J;
                    if (i2 >= 21) {
                        audioTrack.setVolume(f);
                        return;
                    } else {
                        audioTrack.setStereoVolume(f, f);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == 3) {
            zm0 zm0Var = (zm0) obj;
            if (on4Var.v.equals(zm0Var)) {
                return;
            }
            on4Var.v = zm0Var;
            if (on4Var.Z) {
                return;
            }
            on4Var.d();
            return;
        }
        if (i == 6) {
            rv0 rv0Var = (rv0) obj;
            if (on4Var.X.equals(rv0Var)) {
                return;
            }
            rv0Var.getClass();
            if (on4Var.u != null) {
                on4Var.X.getClass();
            }
            on4Var.X = rv0Var;
            return;
        }
        switch (i) {
            case 9:
                on4Var.r(on4Var.g().a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int intValue = ((Integer) obj).intValue();
                if (on4Var.W != intValue) {
                    on4Var.W = intValue;
                    on4Var.V = intValue != 0;
                    on4Var.d();
                    break;
                }
                break;
            case 11:
                this.O0 = (yg6) obj;
                break;
            case 12:
                if (lik.a >= 23) {
                    s2c.a(on4Var, obj);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.g3c, defpackage.m51
    public final void i() {
        qo0 qo0Var = this.F0;
        this.N0 = true;
        try {
            this.G0.d();
            try {
                super.i();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.i();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.m51
    public final void j(boolean z, boolean z2) {
        dm4 dm4Var = new dm4(0);
        this.z0 = dm4Var;
        qo0 qo0Var = this.F0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new no0(qo0Var, dm4Var, 5));
        }
        ryf ryfVar = this.c;
        ryfVar.getClass();
        boolean z3 = ryfVar.a;
        on4 on4Var = this.G0;
        if (z3) {
            on4Var.getClass();
            qx9.t(lik.a >= 21);
            qx9.t(on4Var.V);
            if (!on4Var.Z) {
                on4Var.Z = true;
                on4Var.d();
            }
        } else if (on4Var.Z) {
            on4Var.Z = false;
            on4Var.d();
        }
        bse bseVar = this.e;
        bseVar.getClass();
        on4Var.q = bseVar;
    }

    @Override // defpackage.g3c, defpackage.m51
    public final void k(long j, boolean z) {
        super.k(j, z);
        this.G0.d();
        this.K0 = j;
        this.L0 = true;
        this.M0 = true;
    }

    @Override // defpackage.m51
    public final void l() {
        on4 on4Var = this.G0;
        try {
            try {
                z();
                Z();
                hpo hpoVar = this.C;
                if (hpoVar != null) {
                    hpoVar.D(null);
                }
                this.C = null;
            } catch (Throwable th) {
                hpo hpoVar2 = this.C;
                if (hpoVar2 != null) {
                    hpoVar2.D(null);
                }
                this.C = null;
                throw th;
            }
        } finally {
            if (this.N0) {
                this.N0 = false;
                on4Var.q();
            }
        }
    }

    public final int l0(z2c z2cVar, sm8 sm8Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(z2cVar.a) || (i = lik.a) >= 24 || (i == 23 && lik.x(this.E0))) {
            return sm8Var.m;
        }
        return -1;
    }

    @Override // defpackage.m51
    public final void m() {
        on4 on4Var = this.G0;
        on4Var.U = true;
        if (on4Var.m()) {
            ep0 ep0Var = on4Var.i.f;
            ep0Var.getClass();
            ep0Var.a();
            on4Var.u.play();
        }
    }

    @Override // defpackage.m51
    public final void n() {
        n0();
        on4 on4Var = this.G0;
        on4Var.U = false;
        if (on4Var.m()) {
            np0 np0Var = on4Var.i;
            np0Var.l = 0L;
            np0Var.w = 0;
            np0Var.v = 0;
            np0Var.m = 0L;
            np0Var.C = 0L;
            np0Var.F = 0L;
            np0Var.k = false;
            if (np0Var.x == C.TIME_UNSET) {
                ep0 ep0Var = np0Var.f;
                ep0Var.getClass();
                ep0Var.a();
                on4Var.u.pause();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c1 A[Catch: Exception -> 0x01c7, TRY_LEAVE, TryCatch #0 {Exception -> 0x01c7, blocks: (B:134:0x019c, B:136:0x01c1), top: B:133:0x019c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0() {
        long j;
        long j2;
        on4 on4Var;
        long j3;
        long a;
        long n;
        long j4;
        qo0 qo0Var;
        Handler handler;
        long j5;
        boolean z;
        long j6;
        Method method;
        long max;
        boolean g = g();
        on4 on4Var2 = this.G0;
        ejg ejgVar = on4Var2.b;
        if (!on4Var2.m() || on4Var2.H) {
            j = Long.MIN_VALUE;
            j2 = Long.MIN_VALUE;
        } else {
            np0 np0Var = on4Var2.i;
            on4 on4Var3 = (on4) np0Var.a.a;
            AudioTrack audioTrack = np0Var.c;
            audioTrack.getClass();
            j = Long.MIN_VALUE;
            if (audioTrack.getPlayState() == 3) {
                long[] jArr = np0Var.b;
                j3 = 1000;
                long a2 = (np0Var.a() * 1000000) / np0Var.g;
                if (a2 == 0) {
                    on4Var = on4Var3;
                } else {
                    long nanoTime = System.nanoTime() / 1000;
                    on4Var = on4Var3;
                    if (nanoTime - np0Var.m >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                        int i = np0Var.v;
                        jArr[i] = a2 - nanoTime;
                        np0Var.v = (i + 1) % 10;
                        int i2 = np0Var.w;
                        if (i2 < 10) {
                            np0Var.w = i2 + 1;
                        }
                        np0Var.m = nanoTime;
                        np0Var.l = 0L;
                        int i3 = 0;
                        while (true) {
                            int i4 = np0Var.w;
                            if (i3 >= i4) {
                                break;
                            }
                            np0Var.l = (jArr[i3] / i4) + np0Var.l;
                            i3++;
                        }
                    }
                    if (!np0Var.h) {
                        ep0 ep0Var = np0Var.f;
                        ep0Var.getClass();
                        cp0 cp0Var = ep0Var.a;
                        if (cp0Var != null) {
                            AudioTimestamp audioTimestamp = cp0Var.b;
                            j5 = 500000;
                            if (nanoTime - ep0Var.e >= ep0Var.d) {
                                ep0Var.e = nanoTime;
                                z = cp0Var.a.getTimestamp(audioTimestamp);
                                if (z) {
                                    long j7 = audioTimestamp.framePosition;
                                    if (cp0Var.d > j7) {
                                        cp0Var.c++;
                                    }
                                    cp0Var.d = j7;
                                    cp0Var.e = j7 + (cp0Var.c << 32);
                                }
                                int i5 = ep0Var.b;
                                if (i5 != 0) {
                                    if (i5 != 1) {
                                        if (i5 != 2) {
                                            if (i5 != 3) {
                                                if (i5 != 4) {
                                                    zzl.s();
                                                    return;
                                                }
                                            } else if (z) {
                                                ep0Var.a();
                                            }
                                        } else if (!z) {
                                            ep0Var.a();
                                        }
                                    } else if (!z) {
                                        ep0Var.a();
                                    } else if (cp0Var.e > ep0Var.f) {
                                        ep0Var.b(2);
                                    }
                                } else if (z) {
                                    if (audioTimestamp.nanoTime / 1000 >= ep0Var.c) {
                                        ep0Var.f = cp0Var.e;
                                        ep0Var.b(1);
                                    }
                                } else if (nanoTime - ep0Var.c > 500000) {
                                    ep0Var.b(3);
                                }
                                if (z) {
                                    long j8 = cp0Var != null ? cp0Var.b.nanoTime / 1000 : C.TIME_UNSET;
                                    long j9 = cp0Var != null ? cp0Var.e : -1L;
                                    if (Math.abs(j8 - nanoTime) > 5000000) {
                                        on4Var.h();
                                        on4Var.i();
                                        m6k.f0();
                                        ep0Var.b(4);
                                    } else {
                                        j6 = 5000000;
                                        if (Math.abs(((j9 * 1000000) / np0Var.g) - a2) > 5000000) {
                                            on4Var.h();
                                            on4Var.i();
                                            m6k.f0();
                                            ep0Var.b(4);
                                        } else if (ep0Var.b == 4) {
                                            ep0Var.a();
                                        }
                                        if (np0Var.q && (method = np0Var.n) != null && nanoTime - np0Var.r >= j5) {
                                            try {
                                                AudioTrack audioTrack2 = np0Var.c;
                                                audioTrack2.getClass();
                                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                                int i6 = lik.a;
                                                long intValue = (num.intValue() * 1000) - np0Var.i;
                                                np0Var.o = intValue;
                                                max = Math.max(intValue, 0L);
                                                np0Var.o = max;
                                                if (max > j6) {
                                                    m6k.f0();
                                                    np0Var.o = 0L;
                                                }
                                            } catch (Exception unused) {
                                                np0Var.n = null;
                                            }
                                            np0Var.r = nanoTime;
                                        }
                                    }
                                }
                                j6 = 5000000;
                                if (np0Var.q) {
                                    AudioTrack audioTrack22 = np0Var.c;
                                    audioTrack22.getClass();
                                    Integer num2 = (Integer) method.invoke(audioTrack22, null);
                                    int i62 = lik.a;
                                    long intValue2 = (num2.intValue() * 1000) - np0Var.i;
                                    np0Var.o = intValue2;
                                    max = Math.max(intValue2, 0L);
                                    np0Var.o = max;
                                    if (max > j6) {
                                    }
                                    np0Var.r = nanoTime;
                                }
                            }
                        } else {
                            j5 = 500000;
                        }
                        z = false;
                        if (z) {
                        }
                        j6 = 5000000;
                        if (np0Var.q) {
                        }
                    }
                }
            } else {
                on4Var = on4Var3;
                j3 = 1000;
            }
            long nanoTime2 = System.nanoTime() / j3;
            ep0 ep0Var2 = np0Var.f;
            ep0Var2.getClass();
            boolean z2 = ep0Var2.b == 2;
            if (z2) {
                cp0 cp0Var2 = ep0Var2.a;
                a = lik.n(nanoTime2 - (cp0Var2 != null ? cp0Var2.b.nanoTime / j3 : C.TIME_UNSET), np0Var.j) + (((cp0Var2 != null ? cp0Var2.e : -1L) * 1000000) / np0Var.g);
            } else {
                a = np0Var.w == 0 ? (np0Var.a() * 1000000) / np0Var.g : np0Var.l + nanoTime2;
                if (!g) {
                    a = Math.max(0L, a - np0Var.o);
                }
            }
            if (np0Var.D != z2) {
                np0Var.F = np0Var.C;
                np0Var.E = np0Var.B;
            }
            long j10 = nanoTime2 - np0Var.F;
            if (j10 < 1000000) {
                long n2 = lik.n(j10, np0Var.j) + np0Var.E;
                long j11 = (j10 * j3) / 1000000;
                a = (((j3 - j11) * n2) + (a * j11)) / j3;
            }
            if (!np0Var.k) {
                long j12 = np0Var.B;
                if (a > j12) {
                    np0Var.k = true;
                    long F = lik.F(a - j12);
                    float f = np0Var.j;
                    if (f != 1.0f) {
                        F = Math.round(F / f);
                    }
                    long currentTimeMillis = System.currentTimeMillis() - lik.F(F);
                    bka bkaVar = on4Var.r;
                    if (bkaVar != null && (handler = (qo0Var = ((t2c) bkaVar.b).F0).a) != null) {
                        handler.post(new no0(qo0Var, currentTimeMillis));
                    }
                }
            }
            np0Var.C = nanoTime2;
            np0Var.B = a;
            np0Var.D = z2;
            long min = Math.min(a, (on4Var2.i() * 1000000) / on4Var2.t.e);
            ArrayDeque arrayDeque = on4Var2.j;
            while (!arrayDeque.isEmpty() && min >= ((ln4) arrayDeque.getFirst()).d) {
                on4Var2.x = (ln4) arrayDeque.remove();
            }
            ln4 ln4Var = on4Var2.x;
            long j13 = min - ln4Var.d;
            if (ln4Var.a.equals(gke.d)) {
                n = on4Var2.x.c + j13;
            } else if (arrayDeque.isEmpty()) {
                wvh wvhVar = (wvh) ejgVar.d;
                if (wvhVar.o >= 1024) {
                    long j14 = wvhVar.n;
                    wvhVar.j.getClass();
                    long j15 = j14 - ((r6.k * r6.b) * 2);
                    int i7 = wvhVar.h.a;
                    int i8 = wvhVar.g.a;
                    long j16 = wvhVar.o;
                    j4 = i7 == i8 ? lik.D(j13, j15, j16) : lik.D(j13, j15 * i7, j16 * i8);
                } else {
                    j4 = (long) (wvhVar.c * j13);
                }
                n = j4 + on4Var2.x.c;
            } else {
                ln4 ln4Var2 = (ln4) arrayDeque.getFirst();
                n = ln4Var2.c - lik.n(ln4Var2.d - min, on4Var2.x.a.a);
            }
            j2 = ((((dhh) ejgVar.b).q * 1000000) / on4Var2.t.e) + n;
        }
        if (j2 != j) {
            if (!this.M0) {
                j2 = Math.max(this.K0, j2);
            }
            this.K0 = j2;
            this.M0 = false;
        }
    }

    @Override // defpackage.g3c
    public final km4 x(z2c z2cVar, sm8 sm8Var, sm8 sm8Var2) {
        km4 b = z2cVar.b(sm8Var, sm8Var2);
        int i = b.e;
        if (l0(z2cVar, sm8Var2) > this.H0) {
            i |= 64;
        }
        int i2 = i;
        return new km4(z2cVar.a, sm8Var, sm8Var2, i2 != 0 ? 0 : b.d, i2);
    }

    @Override // defpackage.m51
    public final l2c d() {
        return this;
    }
}
