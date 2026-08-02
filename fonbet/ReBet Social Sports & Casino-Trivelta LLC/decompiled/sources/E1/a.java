package E1;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.exoplayer.source.B;
import androidx.media3.exoplayer.source.C2223y;
import b1.AbstractC2339H;
import b1.AbstractC2346O;
import b1.C2334C;
import b1.C2340I;
import b1.C2350d;
import b1.InterfaceC2341J;
import b1.T;
import b1.Y;
import b1.z;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4156x;
import e1.Z;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import m1.C5507g;
import m1.C5509h;
import n1.InterfaceC5608b;
import o1.InterfaceC5773z;

/* loaded from: classes.dex */
public class a implements InterfaceC5608b {

    /* renamed from: e, reason: collision with root package name */
    public static final NumberFormat f2924e;

    /* renamed from: a, reason: collision with root package name */
    public final String f2925a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2346O.c f2926b = new AbstractC2346O.c();

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2346O.b f2927c = new AbstractC2346O.b();

    /* renamed from: d, reason: collision with root package name */
    public final long f2928d = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f2924e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public a(String str) {
        this.f2925a = str;
    }

    public static String A0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    public static String B0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 3 ? i10 != 4 ? "?" : "SCRUBBING" : "UNSUITABLE_AUDIO_OUTPUT" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    public static String C0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    public static String D0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    public static String E0(long j10) {
        return j10 == -9223372036854775807L ? "?" : f2924e.format(j10 / 1000.0f);
    }

    public static String F0(int i10) {
        return i10 != 0 ? i10 != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    public static String G0(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    public static String p(InterfaceC5773z.a aVar) {
        return aVar.f58885a + "," + aVar.f58887c + "," + aVar.f58886b + "," + aVar.f58888d + "," + aVar.f58889e + "," + aVar.f58890f;
    }

    public static String r(int i10) {
        switch (i10) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return "SKIP";
            case 4:
                return "REMOVE";
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return "?";
        }
    }

    public static String z0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    @Override // n1.InterfaceC5608b
    public void B(InterfaceC5608b.a aVar, Y y10) {
        StringBuilder sb2 = new StringBuilder("w=" + y10.f24529a + ", h=" + y10.f24530b);
        if (y10.f24532d != 1.0f) {
            sb2.append(", par=");
            sb2.append(y10.f24532d);
        }
        J0(aVar, "videoSize", sb2.toString());
    }

    @Override // n1.InterfaceC5608b
    public void C(InterfaceC5608b.a aVar, boolean z10, int i10) {
        J0(aVar, "playWhenReady", z10 + ", " + A0(i10));
    }

    @Override // n1.InterfaceC5608b
    public void D(InterfaceC5608b.a aVar, String str, long j10, long j11) {
        J0(aVar, "audioDecoderInitialized", str);
    }

    @Override // n1.InterfaceC5608b
    public void E(InterfaceC5608b.a aVar, int i10, long j10) {
        J0(aVar, "droppedFrames", Integer.toString(i10));
    }

    @Override // n1.InterfaceC5608b
    public void F(InterfaceC5608b.a aVar, C5507g c5507g) {
        I0(aVar, "audioDisabled");
    }

    @Override // n1.InterfaceC5608b
    public void G(InterfaceC5608b.a aVar) {
        I0(aVar, "drmSessionReleased");
    }

    public void H0(String str) {
        AbstractC4156x.b(this.f2925a, str);
    }

    public final void I0(InterfaceC5608b.a aVar, String str) {
        H0(u(aVar, str, null, null));
    }

    public final void J0(InterfaceC5608b.a aVar, String str, String str2) {
        H0(u(aVar, str, str2, null));
    }

    public void K0(String str) {
        AbstractC4156x.d(this.f2925a, str);
    }

    @Override // n1.InterfaceC5608b
    public void L(InterfaceC5608b.a aVar, InterfaceC5773z.a aVar2) {
        J0(aVar, "audioTrackInit", p(aVar2));
    }

    public final void L0(InterfaceC5608b.a aVar, String str, String str2, Throwable th2) {
        K0(u(aVar, str, str2, th2));
    }

    @Override // n1.InterfaceC5608b
    public void M(InterfaceC5608b.a aVar, int i10) {
        J0(aVar, "repeatMode", C0(i10));
    }

    public final void M0(InterfaceC5608b.a aVar, String str, Throwable th2) {
        K0(u(aVar, str, null, th2));
    }

    public final void N0(InterfaceC5608b.a aVar, String str, Exception exc) {
        L0(aVar, "internalError", str, exc);
    }

    public final void O0(C2334C c2334c, String str) {
        for (int i10 = 0; i10 < c2334c.e(); i10++) {
            H0(str + c2334c.d(i10));
        }
    }

    @Override // n1.InterfaceC5608b
    public void P(InterfaceC5608b.a aVar, int i10) {
        int i11 = aVar.f56809b.i();
        int p10 = aVar.f56809b.p();
        H0("timeline [" + R(aVar) + ", periodCount=" + i11 + ", windowCount=" + p10 + ", reason=" + F0(i10));
        for (int i12 = 0; i12 < Math.min(i11, 3); i12++) {
            aVar.f56809b.f(i12, this.f2927c);
            H0("  period [" + E0(this.f2927c.j()) + "]");
        }
        if (i11 > 3) {
            H0("  ...");
        }
        for (int i13 = 0; i13 < Math.min(p10, 3); i13++) {
            aVar.f56809b.n(i13, this.f2926b);
            H0("  window [" + E0(this.f2926b.d()) + ", seekable=" + this.f2926b.f24384h + ", dynamic=" + this.f2926b.f24385i + "]");
        }
        if (p10 > 3) {
            H0("  ...");
        }
        H0("]");
    }

    public final String R(InterfaceC5608b.a aVar) {
        String str = "window=" + aVar.f56810c;
        if (aVar.f56811d != null) {
            str = str + ", period=" + aVar.f56809b.b(aVar.f56811d.f21516a);
            if (aVar.f56811d.b()) {
                str = (str + ", adGroup=" + aVar.f56811d.f21517b) + ", ad=" + aVar.f56811d.f21518c;
            }
        }
        return "eventTime=" + E0(aVar.f56808a - this.f2928d) + ", mediaPos=" + E0(aVar.f56812e) + ", " + str;
    }

    @Override // n1.InterfaceC5608b
    public void S(InterfaceC5608b.a aVar, String str, long j10, long j11) {
        J0(aVar, "videoDecoderInitialized", str);
    }

    @Override // n1.InterfaceC5608b
    public void V(InterfaceC5608b.a aVar, androidx.media3.common.a aVar2, C5509h c5509h) {
        J0(aVar, "videoInputFormat", androidx.media3.common.a.h(aVar2));
    }

    @Override // n1.InterfaceC5608b
    public void W(InterfaceC5608b.a aVar, String str) {
        J0(aVar, "audioDecoderReleased", str);
    }

    @Override // n1.InterfaceC5608b
    public void Z(InterfaceC5608b.a aVar, int i10) {
        J0(aVar, "state", D0(i10));
    }

    @Override // n1.InterfaceC5608b
    public void a(InterfaceC5608b.a aVar, Object obj, long j10) {
        J0(aVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // n1.InterfaceC5608b
    public void a0(InterfaceC5608b.a aVar, InterfaceC2341J.e eVar, InterfaceC2341J.e eVar2, int i10) {
        J0(aVar, "positionDiscontinuity", "reason=" + r(i10) + ", PositionInfo:old [" + eVar + "], PositionInfo:new [" + eVar2 + "]");
    }

    @Override // n1.InterfaceC5608b
    public void b(InterfaceC5608b.a aVar, long j10) {
        J0(aVar, "audioPositionAdvancing", "since " + E0(((j10 - System.currentTimeMillis()) + SystemClock.elapsedRealtime()) - this.f2928d));
    }

    @Override // n1.InterfaceC5608b
    public void b0(InterfaceC5608b.a aVar, InterfaceC5773z.a aVar2) {
        J0(aVar, "audioTrackReleased", p(aVar2));
    }

    @Override // n1.InterfaceC5608b
    public void c0(InterfaceC5608b.a aVar, B b10) {
        J0(aVar, "downstreamFormat", androidx.media3.common.a.h(b10.f21510c));
    }

    @Override // n1.InterfaceC5608b
    public void d0(InterfaceC5608b.a aVar) {
        I0(aVar, "drmKeysLoaded");
    }

    @Override // n1.InterfaceC5608b
    public void e(InterfaceC5608b.a aVar, AbstractC2339H abstractC2339H) {
        M0(aVar, "playerFailed", abstractC2339H);
    }

    @Override // n1.InterfaceC5608b
    public void e0(InterfaceC5608b.a aVar, boolean z10) {
        J0(aVar, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // n1.InterfaceC5608b
    public void f(InterfaceC5608b.a aVar, C2334C c2334c) {
        H0("metadata [" + R(aVar));
        O0(c2334c, "  ");
        H0("]");
    }

    @Override // n1.InterfaceC5608b
    public void f0(InterfaceC5608b.a aVar, androidx.media3.common.a aVar2, C5509h c5509h) {
        J0(aVar, "audioInputFormat", androidx.media3.common.a.h(aVar2));
    }

    @Override // n1.InterfaceC5608b
    public void g(InterfaceC5608b.a aVar, boolean z10) {
        J0(aVar, "isPlaying", Boolean.toString(z10));
    }

    @Override // n1.InterfaceC5608b
    public void g0(InterfaceC5608b.a aVar, float f10) {
        J0(aVar, "volume", Float.toString(f10));
    }

    @Override // n1.InterfaceC5608b
    public void h(InterfaceC5608b.a aVar, C5507g c5507g) {
        I0(aVar, "videoEnabled");
    }

    @Override // n1.InterfaceC5608b
    public void i(InterfaceC5608b.a aVar, C2350d c2350d) {
        J0(aVar, "audioAttributes", c2350d.f24574a + "," + c2350d.f24575b + "," + c2350d.f24576c + "," + c2350d.f24577d);
    }

    @Override // n1.InterfaceC5608b
    public void j(InterfaceC5608b.a aVar, int i10) {
        J0(aVar, "drmSessionAcquired", "state=" + i10);
    }

    @Override // n1.InterfaceC5608b
    public void k(InterfaceC5608b.a aVar, Exception exc) {
        N0(aVar, "drmSessionManagerError", exc);
    }

    @Override // n1.InterfaceC5608b
    public void k0(InterfaceC5608b.a aVar, T t10) {
        C2334C c2334c;
        H0("tracks [" + R(aVar));
        AbstractC3445z a10 = t10.a();
        for (int i10 = 0; i10 < a10.size(); i10++) {
            T.a aVar2 = (T.a) a10.get(i10);
            H0("  group [ id=" + aVar2.a().f24396b);
            for (int i11 = 0; i11 < aVar2.f24518a; i11++) {
                H0("    " + G0(aVar2.h(i11)) + " Track:" + i11 + ", " + androidx.media3.common.a.h(aVar2.b(i11)) + ", supported=" + Z.h0(aVar2.c(i11)));
            }
            H0("  ]");
        }
        boolean z10 = false;
        for (int i12 = 0; !z10 && i12 < a10.size(); i12++) {
            T.a aVar3 = (T.a) a10.get(i12);
            for (int i13 = 0; !z10 && i13 < aVar3.f24518a; i13++) {
                if (aVar3.h(i13) && (c2334c = aVar3.b(i13).f20540l) != null && c2334c.e() > 0) {
                    H0("  Metadata [");
                    O0(c2334c, "    ");
                    H0("  ]");
                    z10 = true;
                }
            }
        }
        H0("]");
    }

    @Override // n1.InterfaceC5608b
    public void l(InterfaceC5608b.a aVar, C2340I c2340i) {
        J0(aVar, "playbackParameters", c2340i.toString());
    }

    @Override // n1.InterfaceC5608b
    public void l0(InterfaceC5608b.a aVar, C5507g c5507g) {
        I0(aVar, "audioEnabled");
    }

    @Override // n1.InterfaceC5608b
    public void m0(InterfaceC5608b.a aVar, int i10) {
        J0(aVar, "audioSessionId", Integer.toString(i10));
    }

    @Override // n1.InterfaceC5608b
    public void n0(InterfaceC5608b.a aVar) {
        I0(aVar, "drmKeysRemoved");
    }

    @Override // n1.InterfaceC5608b
    public void o0(InterfaceC5608b.a aVar, int i10, int i11) {
        J0(aVar, "surfaceSize", "w=" + i10 + ", h=" + i11);
    }

    @Override // n1.InterfaceC5608b
    public void p0(InterfaceC5608b.a aVar, z zVar, int i10) {
        H0("mediaItem [" + R(aVar) + ", reason=" + z0(i10) + "]");
    }

    @Override // n1.InterfaceC5608b
    public void q(InterfaceC5608b.a aVar, C2223y c2223y, B b10, IOException iOException, boolean z10) {
        N0(aVar, "loadError", iOException);
    }

    @Override // n1.InterfaceC5608b
    public void q0(InterfaceC5608b.a aVar, C5507g c5507g) {
        I0(aVar, "videoDisabled");
    }

    @Override // n1.InterfaceC5608b
    public void r0(InterfaceC5608b.a aVar, boolean z10) {
        J0(aVar, "skipSilenceEnabled", Boolean.toString(z10));
    }

    @Override // n1.InterfaceC5608b
    public void s(InterfaceC5608b.a aVar, int i10, long j10, long j11) {
        L0(aVar, "audioTrackUnderrun", i10 + ", " + j10 + ", " + j11, null);
    }

    @Override // n1.InterfaceC5608b
    public void t(InterfaceC5608b.a aVar, int i10) {
        J0(aVar, "playbackSuppressionReason", B0(i10));
    }

    public final String u(InterfaceC5608b.a aVar, String str, String str2, Throwable th2) {
        String str3 = str + " [" + R(aVar);
        if (th2 instanceof AbstractC2339H) {
            str3 = str3 + ", errorCode=" + ((AbstractC2339H) th2).a();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String f10 = AbstractC4156x.f(th2);
        if (!TextUtils.isEmpty(f10)) {
            str3 = str3 + "\n  " + f10.replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\n  ") + '\n';
        }
        return str3 + "]";
    }

    @Override // n1.InterfaceC5608b
    public void u0(InterfaceC5608b.a aVar, B b10) {
        J0(aVar, "upstreamDiscarded", androidx.media3.common.a.h(b10.f21510c));
    }

    @Override // n1.InterfaceC5608b
    public void v(InterfaceC5608b.a aVar, String str) {
        J0(aVar, "videoDecoderReleased", str);
    }

    @Override // n1.InterfaceC5608b
    public void w(InterfaceC5608b.a aVar, boolean z10) {
        J0(aVar, "loading", Boolean.toString(z10));
    }

    @Override // n1.InterfaceC5608b
    public void y0(InterfaceC5608b.a aVar, int i10, int i11, boolean z10) {
        J0(aVar, "rendererReady", "rendererIndex=" + i10 + ", " + Z.z0(i11) + ", " + z10);
    }

    @Override // n1.InterfaceC5608b
    public void z(InterfaceC5608b.a aVar) {
        I0(aVar, "drmKeysRestored");
    }
}
