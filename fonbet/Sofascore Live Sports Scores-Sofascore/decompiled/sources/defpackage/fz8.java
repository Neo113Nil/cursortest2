package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class fz8 {
    public static final tc3 a = new tc3(506875310, new pr1(5), false);
    public static final tc3 b = new tc3(-1444859641, new qd3(26), false);
    public static final int[] c = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] d = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] e = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, a.o, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] f = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] g = {5, 8, 10, 12};
    public static final int[] h = {6, 9, 12, 15};
    public static final int[] i = {2, 4, 6, 8};
    public static final int[] j = {9, 11, 13, 16};
    public static final int[] k = {5, 8, 10, 12};
    public static final kc l = new kc("eventId");
    public static final kc m = new kc("playerId");
    public static final kc n = new kc("teamId");
    public static final kc o = new kc("appWidgetId");
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ int u = 0;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if ((r41 & 16) != 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void A(pl7 pl7Var, String str, boolean z, xtc xtcVar, long j2, of3 of3Var, int i2, int i3) {
        long j3;
        int i4;
        int i5;
        av8 av8Var;
        eqf u2;
        av8 av8Var2;
        utc utcVar;
        str.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(142725696);
        int i6 = i2 | (av8Var3.g(pl7Var) ? 4 : 2) | (av8Var3.g(str) ? 32 : 16) | (av8Var3.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var3.g(xtcVar) ? a.o : 1024);
        if ((i3 & 16) == 0) {
            j3 = j2;
            if (av8Var3.f(j3)) {
                i4 = 16384;
                i5 = i6 | i4;
                if (av8Var3.T(i5 & 1, (i5 & 9363) == 9362)) {
                    av8Var = av8Var3;
                    av8Var.W();
                } else {
                    av8Var3.Y();
                    if ((i2 & 1) == 0 || av8Var3.B()) {
                        if ((i3 & 16) != 0) {
                            j3 = lz.D(R.color.n_lv_1, av8Var3);
                            i5 &= -57345;
                        }
                        int i7 = i5;
                        long j4 = j3;
                        av8Var3.t();
                        kv1 kv1Var = uxf.p;
                        xtc d0 = l98.d0(xtcVar, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        u23 a2 = t23.a(ww9.d, kv1Var, av8Var3, 48);
                        int hashCode = Long.hashCode(av8Var3.T);
                        aee m2 = av8Var3.m();
                        xtc C = fqj.C(av8Var3, d0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var);
                        } else {
                            av8Var3.q0();
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var3, a2, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var3, m2, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var3, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var3, ryVar);
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var3, C, f50Var3);
                        l8g a3 = k8g.a(ww9.b, uxf.m, av8Var3, 48);
                        int hashCode2 = Long.hashCode(av8Var3.T);
                        aee m3 = av8Var3.m();
                        utc utcVar2 = utc.a;
                        xtc C2 = fqj.C(av8Var3, utcVar2);
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a3, f50Var);
                        waa.K(av8Var3, m3, ff3Var);
                        bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
                        waa.K(av8Var3, C2, f50Var3);
                        if (z) {
                            av8Var3.d0(-941112049);
                            String str2 = pl7Var.c;
                            yf8 yf8Var = xth.a;
                            dfj j5 = xth.j();
                            long D = lz.D(R.color.n_lv_1, av8Var3);
                            utcVar = utcVar2;
                            udj.c(str2, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j5, av8Var3, 0, 24960, 110586);
                            av8Var2 = av8Var3;
                            av8Var2.s(false);
                        } else {
                            av8Var2 = av8Var3;
                            utcVar = utcVar2;
                            av8Var2.d0(-940848084);
                            td4.u(pl7Var.a, 48, av8Var2, bkh.l(utcVar, 24.0f));
                            av8Var2.s(false);
                        }
                        nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
                        String valueOf2 = String.valueOf(pl7Var.b);
                        yf8 yf8Var2 = xth.a;
                        int i8 = (i7 >> 6) & 896;
                        av8 av8Var4 = av8Var2;
                        j3 = j4;
                        udj.c(valueOf2, null, j3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.d(), av8Var4, i8, 24960, 110586);
                        bf3.t(av8Var4, true, utcVar, 4.0f, av8Var4);
                        String upperCase = str.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        udj.c(upperCase, null, j3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var4, i8, 24960, 110586);
                        av8Var = av8Var4;
                        av8Var.s(true);
                    } else {
                        av8Var3.W();
                    }
                }
                u2 = av8Var.u();
                if (u2 == null) {
                    u2.d = new ql7(pl7Var, str, z, xtcVar, j3, i2, i3);
                    return;
                }
                return;
            }
        } else {
            j3 = j2;
        }
        i4 = 8192;
        i5 = i6 | i4;
        if (av8Var3.T(i5 & 1, (i5 & 9363) == 9362)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static final Executor B(au3 au3Var) {
        Executor g0;
        se6 se6Var = au3Var instanceof se6 ? (se6) au3Var : null;
        return (se6Var == null || (g0 = se6Var.g0()) == null) ? new x45(au3Var) : g0;
    }

    public static final Bundle C(x62... x62VarArr) {
        Bundle bundle = new Bundle(x62VarArr.length);
        for (x62 x62Var : x62VarArr) {
            x62Var.b.a(bundle, x62Var.a);
        }
        return bundle;
    }

    public static final x62 D(int i2, String str) {
        return new x62(str, new a72(i2));
    }

    public static final x62 E(long j2, String str) {
        return new x62(str, new b72(j2));
    }

    public static final x62 F(String str, Parcelable parcelable) {
        return new x62(str, new d72(parcelable));
    }

    public static final x62 G(String str, Serializable serializable) {
        return new x62(str, new e72(serializable));
    }

    public static final x62 H(String str, String str2) {
        return new x62(str, new f72(str2));
    }

    public static final x62 I(String str, List list) {
        return new x62(str, new c72(new ArrayList(list)));
    }

    public static final x62 J(String str, boolean z) {
        return new x62(str, new y62(z));
    }

    public static final void K(ln2 ln2Var, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = ml4.e("Channel was consumed, consumer had failed", th);
        }
        ln2Var.e(cancellationException);
    }

    public static final void L(ha5 ha5Var, int i2, String str, long j2, float f2, jej jejVar, long j3) {
        float H0 = ha5Var.H0(60.0f);
        float H02 = ha5Var.H0(72.0f);
        float H03 = ha5Var.H0(1.0f);
        float f3 = (H0 + H03) * (i2 % 3);
        float f4 = (H03 + H02) * (i2 / 3);
        float intBitsToFloat = (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - f3) - H0;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - f4) - H02;
        ((hpo) ha5Var.L0().a).y(f3, f4, intBitsToFloat, intBitsToFloat2);
        try {
            ha5.o0(ha5Var, j2, 0L, 0L, f2, null, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            yf8 yf8Var = xth.a;
            aej a2 = jej.a(jejVar, str, xth.l(), 1020);
            long j4 = a2.c;
            o6a.w(ha5Var, a2, j3, (Float.floatToRawIntBits((H0 - ((int) (j4 >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits((H02 - ((int) (j4 & 4294967295L))) / 2.0f) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 248);
        } finally {
            ((hpo) ha5Var.L0().a).y(-f3, -f4, -intBitsToFloat, -intBitsToFloat2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void M(ha5 ha5Var, b20 b20Var, o91 o91Var, String str, long j2, float f2, jej jejVar, long j3) {
        float f3;
        int ordinal;
        float f4;
        float H0;
        int ordinal2;
        int ordinal3;
        sx2 L0 = ha5Var.L0();
        long D = L0.D();
        L0.t().o();
        try {
            hpo hpoVar = (hpo) L0.a;
            int ordinal4 = o91Var.ordinal();
            float f5 = 1.0f;
            if (ordinal4 != 0) {
                if (ordinal4 != 1) {
                    if (ordinal4 != 2) {
                        if (ordinal4 != 3) {
                            throw new ndd();
                        }
                    }
                }
                f3 = -1.0f;
                ordinal = o91Var.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        throw new ndd();
                    }
                    f5 = -1.0f;
                }
                hpo.H(hpoVar, f3, f5);
                ha5.X0(ha5Var, b20Var, j2, f2, null, 56);
                mz1.v(L0, D);
                yf8 yf8Var = xth.a;
                aej a2 = jej.a(jejVar, str, xth.l(), 1020);
                long j4 = a2.c;
                float f6 = (int) (j4 >> 32);
                float H02 = (ha5Var.H0(61.5f) - f6) / 2.0f;
                f4 = (int) (j4 & 4294967295L);
                H0 = (ha5Var.H0(30.0f) - f4) / 2.0f;
                ordinal2 = o91Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                zzl.b();
                                return;
                            }
                        }
                    }
                    H02 = (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - H02) - f6;
                }
                ordinal3 = o91Var.ordinal();
                if (ordinal3 != 0 && ordinal3 != 1) {
                    if (ordinal3 == 2 && ordinal3 != 3) {
                        zzl.b();
                        return;
                    }
                    H0 = (Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - H0) - f4;
                }
                o6a.w(ha5Var, a2, j3, (Float.floatToRawIntBits(H0) & 4294967295L) | (Float.floatToRawIntBits(H02) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 248);
            }
            f3 = 1.0f;
            ordinal = o91Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    throw new ndd();
                }
                f5 = -1.0f;
            }
            hpo.H(hpoVar, f3, f5);
            ha5.X0(ha5Var, b20Var, j2, f2, null, 56);
            mz1.v(L0, D);
            yf8 yf8Var2 = xth.a;
            aej a22 = jej.a(jejVar, str, xth.l(), 1020);
            long j42 = a22.c;
            float f62 = (int) (j42 >> 32);
            float H022 = (ha5Var.H0(61.5f) - f62) / 2.0f;
            f4 = (int) (j42 & 4294967295L);
            H0 = (ha5Var.H0(30.0f) - f4) / 2.0f;
            ordinal2 = o91Var.ordinal();
            if (ordinal2 != 0) {
            }
            ordinal3 = o91Var.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 == 2) {
                }
                H0 = (Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - H0) - f4;
            }
            o6a.w(ha5Var, a22, j3, (Float.floatToRawIntBits(H0) & 4294967295L) | (Float.floatToRawIntBits(H022) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 248);
        } catch (Throwable th) {
            mz1.v(L0, D);
            throw th;
        }
    }

    public static final void N(glg glgVar) {
        glgVar.getClass();
        xbb b2 = kotlin.collections.a.b();
        nlg V0 = glgVar.V0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (V0.U0()) {
            try {
                b2.add(V0.F0(0));
            } finally {
            }
        }
        Unit unit = Unit.a;
        o1j.t(V0, null);
        ListIterator listIterator = kotlin.collections.a.a(b2).listIterator(0);
        while (true) {
            hc9 hc9Var = (hc9) listIterator;
            if (!hc9Var.hasNext()) {
                return;
            }
            String str = (String) hc9Var.next();
            if (c.v(str, "room_fts_content_sync_", false)) {
                b0a.F(glgVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final boolean O(long j2, long j3) {
        return j2 == j3;
    }

    public static final au3 P(Executor executor) {
        au3 au3Var;
        x45 x45Var = executor instanceof x45 ? (x45) executor : null;
        return (x45Var == null || (au3Var = x45Var.a) == null) ? new te6(executor) : au3Var;
    }

    public static Object Q(Class cls, Object obj) {
        if (obj instanceof tv8) {
            return cls.cast(obj);
        }
        if (obj instanceof uv8) {
            return Q(cls, ((uv8) obj).f());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + tv8.class + " or " + uv8.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int R(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                b2 = bArr[7];
            } else {
                i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                b3 = bArr[8];
            }
            i3 = (((b3 & 60) >> 2) | i4) + 1;
            z = true;
            return !z ? (i3 * 16) / 14 : i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
        b2 = bArr[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (!z) {
        }
    }

    public static final Intent S(za zaVar, pxj pxjVar, int i2, Function1 function1) {
        int i3 = pxjVar.b;
        if (zaVar instanceof vbi) {
            vbi vbiVar = (vbi) zaVar;
            Intent W = W(vbiVar, (pzc) function1.invoke(vbiVar.b));
            if (W.getData() == null) {
                W.setData(ao2.q(pxjVar, i2, 5, ""));
            }
            return W;
        }
        if (zaVar instanceof x9g) {
            int i4 = ActionCallbackBroadcastReceiver.a;
            x9g x9gVar = (x9g) zaVar;
            return ao2.l(t62.C(pxjVar.a, x9gVar.a, i3, (pzc) function1.invoke(x9gVar.b)), pxjVar, i2);
        }
        if (!(zaVar instanceof yka)) {
            cp4.g(zaVar, "Cannot create fill-in Intent for action type: ");
            return null;
        }
        ComponentName componentName = pxjVar.n;
        if (componentName != null) {
            return ao2.l(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i3), pxjVar, i2);
        }
        a70.p("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        return null;
    }

    public static int T(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static nm2 U(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new nm2(bArr, bArr.length, 3, (byte) 0);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        nm2 nm2Var = new nm2(copyOf, copyOf.length, 3, (byte) 0);
        if (copyOf[0] == 31) {
            nm2 nm2Var2 = new nm2(copyOf, copyOf.length, 3, (byte) 0);
            while (nm2Var2.b() >= 16) {
                nm2Var2.t(2);
                int i4 = nm2Var2.i(14) & 16383;
                int min = Math.min(8 - nm2Var.c, 14);
                int i5 = nm2Var.c;
                int i6 = (8 - i5) - min;
                byte[] bArr3 = nm2Var.d;
                int i7 = nm2Var.b;
                byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr3[i7]);
                bArr3[i7] = b5;
                int i8 = 14 - min;
                bArr3[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                int i9 = i7 + 1;
                while (true) {
                    bArr2 = nm2Var.d;
                    if (i8 > 8) {
                        bArr2[i9] = (byte) (i4 >>> (i8 - 8));
                        i8 -= 8;
                        i9++;
                    }
                }
                int i10 = 8 - i8;
                byte b6 = (byte) (bArr2[i9] & ((1 << i10) - 1));
                bArr2[i9] = b6;
                bArr2[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                nm2Var.t(14);
                nm2Var.a();
            }
        }
        nm2Var.p(copyOf, copyOf.length);
        return nm2Var;
    }

    public static final PendingIntent V(za zaVar, pxj pxjVar, int i2, Function1 function1) {
        int i3 = pxjVar.b;
        Context context = pxjVar.a;
        if (zaVar instanceof vbi) {
            vbi vbiVar = (vbi) zaVar;
            Intent W = W(vbiVar, (pzc) function1.invoke(vbiVar.b));
            if (W.getData() == null) {
                W.setData(ao2.q(pxjVar, i2, 5, ""));
            }
            Unit unit = Unit.a;
            return PendingIntent.getActivity(context, 0, W, 201326592, null);
        }
        if (zaVar instanceof x9g) {
            int i4 = ActionCallbackBroadcastReceiver.a;
            x9g x9gVar = (x9g) zaVar;
            Intent C = t62.C(context, x9gVar.a, i3, (pzc) function1.invoke(x9gVar.b));
            C.setData(ao2.q(pxjVar, i2, 5, ""));
            Unit unit2 = Unit.a;
            return PendingIntent.getBroadcast(context, 0, C, 201326592);
        }
        if (!(zaVar instanceof yka)) {
            cp4.g(zaVar, "Cannot create PendingIntent for action type: ");
            return null;
        }
        ComponentName componentName = pxjVar.n;
        if (componentName == null) {
            a70.p("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent putExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i3);
        putExtra.setData(ao2.q(pxjVar, i2, 5, null));
        Unit unit3 = Unit.a;
        return PendingIntent.getBroadcast(context, 0, putExtra, 201326592);
    }

    public static final Intent W(vbi vbiVar, pzc pzcVar) {
        if (!(vbiVar instanceof vbi)) {
            cp4.g(vbiVar, "Action type not defined in app widget package: ");
            return null;
        }
        Intent intent = vbiVar.a;
        Map unmodifiableMap = Collections.unmodifiableMap(pzcVar.a);
        ArrayList arrayList = new ArrayList(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            kc kcVar = (kc) entry.getKey();
            arrayList.add(new Pair(kcVar.a, entry.getValue()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        intent.putExtras(hz8.E((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x007c, B:15:0x0084, B:16:0x008f, B:23:0x009f, B:25:0x006b, B:29:0x00a2, B:33:0x00a7, B:34:0x00a8, B:18:0x0090, B:20:0x0096), top: B:11:0x002d, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9 A[Catch: all -> 0x00b2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00b2, blocks: (B:36:0x00a9, B:44:0x00b8, B:45:0x00bb, B:41:0x00b6), top: B:7:0x0021, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [g62, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ln2] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [ln2] */
    /* JADX WARN: Type inference failed for: r6v4, types: [ln2] */
    /* JADX WARN: Type inference failed for: r6v5, types: [ln2] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0079 -> B:13:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X(sq3 sq3Var) {
        f09 f09Var;
        int i2;
        ?? g2;
        imf imfVar;
        b62 b62Var;
        AtomicBoolean atomicBoolean;
        boolean z;
        try {
            if (sq3Var instanceof f09) {
                f09Var = (f09) sq3Var;
                int i3 = f09Var.w;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    f09Var.w = i3 - Integer.MIN_VALUE;
                    Object obj = f09Var.v;
                    lu3 lu3Var = lu3.a;
                    i2 = f09Var.w;
                    if (i2 != 0) {
                        y6a.M(obj);
                        g2 = ml4.g(1, 6, null);
                        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                        int i4 = 10;
                        i20 i20Var = new i20(i4, atomicBoolean2, g2);
                        synchronized (snh.c) {
                            snh.i = CollectionsKt.x0(snh.i, i20Var);
                            Unit unit = Unit.a;
                        }
                        snh.c();
                        imf imfVar2 = new imf(i20Var, i4);
                        try {
                            b62Var = new b62(g2);
                            imfVar = imfVar2;
                            atomicBoolean = atomicBoolean2;
                            f09Var.r = atomicBoolean;
                            f09Var.s = imfVar;
                            f09Var.t = g2;
                            f09Var.u = b62Var;
                            f09Var.w = 1;
                            obj = b62Var.a(f09Var);
                            g2 = g2;
                            if (obj == lu3Var) {
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            imfVar = imfVar2;
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b62Var = f09Var.u;
                        g2 = f09Var.t;
                        imfVar = f09Var.s;
                        atomicBoolean = f09Var.r;
                        try {
                            y6a.M(obj);
                            g2 = g2;
                            if (((Boolean) obj).booleanValue()) {
                                atomicBoolean.set(false);
                                synchronized (snh.c) {
                                    y0d y0dVar = snh.j.h;
                                    z = y0dVar != null && y0dVar.h();
                                }
                                if (z) {
                                    snh.c();
                                }
                                f09Var.r = atomicBoolean;
                                f09Var.s = imfVar;
                                f09Var.t = g2;
                                f09Var.u = b62Var;
                                f09Var.w = 1;
                                obj = b62Var.a(f09Var);
                                g2 = g2;
                                if (obj == lu3Var) {
                                    return lu3Var;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                    g2.e(null);
                                    imfVar.f();
                                    return Unit.a;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                K(g2, th);
                                throw th3;
                            }
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th4) {
            imfVar.f();
            throw th4;
        }
        f09Var = new f09(sq3Var);
        Object obj2 = f09Var.v;
        lu3 lu3Var2 = lu3.a;
        i2 = f09Var.w;
    }

    public static final xtc Y(xtc xtcVar, n9a n9aVar) {
        return xtcVar.z(new j9a(n9aVar));
    }

    public static xtc Z(xtc xtcVar, d7e d7eVar, io ioVar, op3 op3Var, float f2, ay1 ay1Var, int i2) {
        if ((i2 & 4) != 0) {
            ioVar = uxf.g;
        }
        io ioVar2 = ioVar;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i2 & 32) != 0) {
            ay1Var = null;
        }
        return xtcVar.z(new e7e(d7eVar, ioVar2, op3Var, f3, ay1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(axj axjVar, Function1 function1, xtc xtcVar, zo5 zo5Var, of6 of6Var, Function2 function2, ct8 ct8Var, of3 of3Var, int i2) {
        int i3;
        ct8 ct8Var2;
        int i4;
        po5 po5Var;
        zo5 zo5Var2;
        boolean g2;
        Object O;
        eoh eohVar;
        of6 of6Var2;
        boolean g3;
        Object O2;
        Object w;
        po5 po5Var2;
        boolean z;
        Object O3;
        Object O4;
        boolean z2;
        boolean z3;
        bxj bxjVar;
        q4k q4kVar;
        a99 a99Var;
        pwj pwjVar;
        axj axjVar2;
        boolean z4;
        pwj pwjVar2;
        pwj pwjVar3;
        pwj pwjVar4;
        boolean z5;
        boolean z6;
        pwj pwjVar5;
        pwj pwjVar6;
        pwj pwjVar7;
        pwj pwjVar8;
        boolean i5;
        Object O5;
        zo5 zo5Var3;
        of6 of6Var3;
        boolean h2;
        Object O6;
        Object O7;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1912839215);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(axjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(zo5Var) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.g(of6Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.i(function2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i6 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i6 |= av8Var.i(ct8Var) ? 8388608 : 4194304;
        }
        if (av8Var.T(i6 & 1, (4793491 & i6) != 4793490)) {
            e1d e1dVar = axjVar.d;
            t01 t01Var = axjVar.a;
            if (((Boolean) function1.invoke(((eoh) e1dVar).getValue())).booleanValue() || ((Boolean) function1.invoke(t01Var.w())).booleanValue() || axjVar.i() || axjVar.d()) {
                av8Var.d0(-232386135);
                int i7 = i6 & 14;
                int i8 = i7 | 48;
                int i9 = i8 & 14;
                boolean z7 = ((i9 ^ 6) > 4 && av8Var.g(axjVar)) || (i8 & 6) == 4;
                Object O8 = av8Var.O();
                a99 a99Var2 = nf3.a;
                if (z7 || O8 == a99Var2) {
                    O8 = t01Var.w();
                    av8Var.n0(O8);
                }
                if (axjVar.i()) {
                    O8 = t01Var.w();
                }
                av8Var.d0(1844425648);
                po5 b0 = b0(axjVar, function1, O8, av8Var);
                av8Var.s(false);
                Object value = ((eoh) axjVar.d).getValue();
                av8Var.d0(1844425648);
                po5 b02 = b0(axjVar, function1, value, av8Var);
                av8Var.s(false);
                int i10 = i9 | 3072;
                int i11 = (i10 & 14) ^ 6;
                int i12 = i6;
                boolean z8 = (i11 > 4 && av8Var.g(axjVar)) || (i10 & 6) == 4;
                Object O9 = av8Var.O();
                if (z8 || O9 == a99Var2) {
                    i4 = i10;
                    O9 = new axj(new h1d(b0), axjVar, mz1.o(new StringBuilder(), axjVar.c, " > EnterExitTransition"));
                    av8Var.n0(O9);
                } else {
                    i4 = i10;
                }
                axj axjVar3 = (axj) O9;
                boolean g4 = ((i11 > 4 && av8Var.g(axjVar)) || (i4 & 6) == 4) | av8Var.g(axjVar3);
                Object O10 = av8Var.O();
                if (g4 || O10 == a99Var2) {
                    O10 = new mwj(axjVar, axjVar3, false, 2);
                    av8Var.n0(O10);
                }
                hz8.d(axjVar3, (Function1) O10, av8Var);
                if (axjVar.i()) {
                    axjVar3.m(b0, b02);
                } else {
                    axjVar3.r(b02);
                    ((eoh) axjVar3.k).setValue(Boolean.FALSE);
                }
                q4k q4kVar2 = uo5.a;
                boolean g5 = av8Var.g(axjVar3);
                Object O11 = av8Var.O();
                if (g5 || O11 == a99Var2) {
                    O11 = e.f(zo5Var);
                    av8Var.n0(O11);
                }
                e1d e1dVar2 = (e1d) O11;
                t01 t01Var2 = axjVar3.a;
                t01 t01Var3 = axjVar3.a;
                e1d e1dVar3 = axjVar3.d;
                eoh eohVar2 = (eoh) e1dVar3;
                if (t01Var2.w() == eohVar2.getValue()) {
                    Object w2 = t01Var3.w();
                    po5Var = po5.b;
                    if (w2 == po5Var) {
                        if (axjVar3.i()) {
                            e1dVar2.setValue(zo5Var);
                        } else {
                            e1dVar2.setValue(zo5.b);
                        }
                        zo5Var2 = (zo5) e1dVar2.getValue();
                        g2 = av8Var.g(axjVar3);
                        O = av8Var.O();
                        if (!g2 || O == a99Var2) {
                            O = e.f(of6Var);
                            av8Var.n0(O);
                        }
                        e1d e1dVar4 = (e1d) O;
                        eohVar = (eoh) e1dVar3;
                        if (t01Var3.w() == eohVar.getValue() || t01Var3.w() != po5Var) {
                            if (eohVar.getValue() != po5Var) {
                                e1dVar4.setValue(((of6) e1dVar4.getValue()).a(of6Var));
                            }
                        } else if (axjVar3.i()) {
                            e1dVar4.setValue(of6Var);
                        } else {
                            e1dVar4.setValue(of6.b);
                        }
                        of6Var2 = (of6) e1dVar4.getValue();
                        e1d g6 = e.g(function2, av8Var);
                        Object invoke = function2.invoke(t01Var3.w(), ((eoh) e1dVar3).getValue());
                        g3 = av8Var.g(axjVar3) | av8Var.g(g6);
                        O2 = av8Var.O();
                        rq3 rq3Var = null;
                        if (!g3 || O2 == a99Var2) {
                            O2 = new g2(axjVar3, g6, rq3Var, 7);
                            av8Var.n0(O2);
                        }
                        e1d F = qea.F(av8Var, invoke, (Function2) O2);
                        w = t01Var3.w();
                        po5Var2 = po5.c;
                        if (w != po5Var2 && ((eoh) e1dVar3).getValue() == po5Var2 && ((Boolean) F.getValue()).booleanValue()) {
                            av8Var.d0(-229368781);
                            av8Var.s(false);
                            ct8Var2 = ct8Var;
                            z4 = false;
                        } else {
                            av8Var.d0(-230699766);
                            z = i7 != 4;
                            O3 = av8Var.O();
                            if (!z || O3 == a99Var2) {
                                O3 = new s70(axjVar3);
                                av8Var.n0(O3);
                            }
                            s70 s70Var = (s70) O3;
                            q4k q4kVar3 = lz.l;
                            O4 = av8Var.O();
                            if (O4 == a99Var2) {
                                O4 = zg3.o;
                                av8Var.n0(O4);
                            }
                            Function0 function0 = (Function0) O4;
                            av8Var.d0(-167964673);
                            av8Var.s(false);
                            av8Var.d0(-167961890);
                            av8Var.s(false);
                            bxj bxjVar2 = zo5Var2.a;
                            bxj bxjVar3 = of6Var2.a;
                            alh alhVar = bxjVar2.b;
                            in2 in2Var = bxjVar2.c;
                            z2 = alhVar == null || bxjVar3.b != null;
                            z3 = in2Var == null || bxjVar3.c != null;
                            if (z2) {
                                bxjVar = bxjVar3;
                                q4kVar = q4kVar3;
                                a99Var = a99Var2;
                                pwjVar = null;
                                axjVar2 = axjVar3;
                                z4 = false;
                                av8Var.d0(-911382324);
                                av8Var.s(false);
                                pwjVar2 = null;
                            } else {
                                av8Var.d0(-911488127);
                                Object O12 = av8Var.O();
                                if (O12 == a99Var2) {
                                    O12 = "Built-in slide";
                                    av8Var.n0("Built-in slide");
                                }
                                pwjVar = null;
                                bxjVar = bxjVar3;
                                a99Var = a99Var2;
                                axjVar2 = axjVar3;
                                z4 = false;
                                pwj v = yso.v(axjVar2, q4kVar3, (String) O12, av8Var, 384, 0);
                                q4kVar = q4kVar3;
                                av8Var.s(false);
                                pwjVar2 = v;
                            }
                            if (z3) {
                                av8Var.d0(-911179709);
                                av8Var.s(z4);
                                pwjVar3 = pwjVar;
                            } else {
                                av8Var.d0(-911290533);
                                q4k q4kVar4 = lz.m;
                                Object O13 = av8Var.O();
                                if (O13 == a99Var) {
                                    O13 = "Built-in shrink/expand";
                                    av8Var.n0("Built-in shrink/expand");
                                }
                                pwj v2 = yso.v(axjVar2, q4kVar4, (String) O13, av8Var, 384, 0);
                                av8Var.s(z4);
                                pwjVar3 = v2;
                            }
                            if (z3) {
                                av8Var.d0(-910935677);
                                av8Var.s(z4);
                                pwjVar4 = pwjVar;
                            } else {
                                av8Var.d0(-911106083);
                                Object O14 = av8Var.O();
                                if (O14 == a99Var) {
                                    O14 = "Built-in InterruptionHandlingOffset";
                                    av8Var.n0("Built-in InterruptionHandlingOffset");
                                }
                                pwj v3 = yso.v(axjVar2, q4kVar, (String) O14, av8Var, 384, 0);
                                av8Var.s(z4);
                                pwjVar4 = v3;
                            }
                            boolean z9 = !z3;
                            float[] fArr = l23.a;
                            av8Var.d0(-910130296);
                            av8Var.s(z4);
                            q4k q4kVar5 = lz.f;
                            z5 = (bxjVar2.a == null || bxjVar.a != null) ? true : z4;
                            z6 = (bxjVar2.d == null || bxjVar.d != null) ? true : z4;
                            if (z5) {
                                av8Var.d0(-703709976);
                                av8Var.s(z4);
                                pwjVar5 = pwjVar;
                            } else {
                                av8Var.d0(-703879421);
                                Object O15 = av8Var.O();
                                if (O15 == a99Var) {
                                    O15 = "Built-in alpha";
                                    av8Var.n0("Built-in alpha");
                                }
                                pwj v4 = yso.v(axjVar2, q4kVar5, (String) O15, av8Var, 384, 0);
                                av8Var.s(z4);
                                pwjVar5 = v4;
                            }
                            if (z6) {
                                av8Var.d0(-703472888);
                                av8Var.s(z4);
                                pwjVar6 = pwjVar;
                            } else {
                                av8Var.d0(-703642333);
                                Object O16 = av8Var.O();
                                if (O16 == a99Var) {
                                    O16 = "Built-in scale";
                                    av8Var.n0("Built-in scale");
                                }
                                pwj v5 = yso.v(axjVar2, q4kVar5, (String) O16, av8Var, 384, 0);
                                av8Var.s(z4);
                                pwjVar6 = v5;
                            }
                            if (z6) {
                                pwjVar7 = pwjVar6;
                                av8Var.d0(-703222904);
                                av8Var.s(z4);
                                pwjVar8 = pwjVar;
                            } else {
                                av8Var.d0(-703395232);
                                pwjVar7 = pwjVar6;
                                pwjVar8 = yso.v(axjVar2, uo5.a, "TransformOriginInterruptionHandling", av8Var, 384, 0);
                                av8Var.s(z4);
                            }
                            i5 = av8Var.i(pwjVar5) | av8Var.g(zo5Var2) | av8Var.g(of6Var2) | av8Var.i(pwjVar7) | av8Var.g(axjVar2) | av8Var.i(pwjVar8);
                            O5 = av8Var.O();
                            if (!i5 || O5 == a99Var) {
                                zo5Var3 = zo5Var2;
                                of6Var3 = of6Var2;
                                O5 = new ro5(pwjVar5, pwjVar7, axjVar2, zo5Var3, of6Var3, pwjVar8);
                                av8Var.n0(O5);
                            } else {
                                zo5Var3 = zo5Var2;
                                of6Var3 = of6Var2;
                            }
                            ro5 ro5Var = (ro5) O5;
                            h2 = av8Var.h(z9) | av8Var.g(function0);
                            O6 = av8Var.O();
                            if (!h2 || O6 == a99Var) {
                                O6 = new to5(z9, function0);
                                av8Var.n0(O6);
                            }
                            utc utcVar = utc.a;
                            xtc z10 = s02.M(utcVar, (Function1) O6).z(new qo5(axjVar2, pwjVar3, pwjVar4, pwjVar2, zo5Var3, of6Var3, function0, ro5Var)).z(utcVar);
                            av8Var.d0(-7404393);
                            av8Var.s(z4);
                            xtc z11 = xtcVar.z(z10.z(utcVar));
                            O7 = av8Var.O();
                            if (O7 == a99Var) {
                                O7 = new s60(s70Var);
                                av8Var.n0(O7);
                            }
                            s60 s60Var = (s60) O7;
                            int hashCode = Long.hashCode(av8Var.T);
                            aee m2 = av8Var.m();
                            xtc C = fqj.C(av8Var, z11);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.q0();
                            } else {
                                av8Var.l(zg3Var);
                            }
                            waa.K(av8Var, s60Var, hf3.g);
                            waa.K(av8Var, m2, hf3.f);
                            waa.C(av8Var, Integer.valueOf(hashCode), hf3.j);
                            waa.J(av8Var, hf3.k);
                            waa.K(av8Var, C, hf3.d);
                            ct8Var2 = ct8Var;
                            ct8Var2.invoke(s70Var, av8Var, Integer.valueOf((i12 >> 18) & 112));
                            av8Var.s(true);
                            av8Var.s(z4);
                        }
                        av8Var.s(z4);
                    }
                }
                Object value2 = eohVar2.getValue();
                po5Var = po5.b;
                if (value2 == po5Var) {
                    e1dVar2.setValue(((zo5) e1dVar2.getValue()).a(zo5Var));
                }
                zo5Var2 = (zo5) e1dVar2.getValue();
                g2 = av8Var.g(axjVar3);
                O = av8Var.O();
                if (!g2) {
                }
                O = e.f(of6Var);
                av8Var.n0(O);
                e1d e1dVar42 = (e1d) O;
                eohVar = (eoh) e1dVar3;
                if (t01Var3.w() == eohVar.getValue()) {
                }
                if (eohVar.getValue() != po5Var) {
                }
                of6Var2 = (of6) e1dVar42.getValue();
                e1d g62 = e.g(function2, av8Var);
                Object invoke2 = function2.invoke(t01Var3.w(), ((eoh) e1dVar3).getValue());
                g3 = av8Var.g(axjVar3) | av8Var.g(g62);
                O2 = av8Var.O();
                rq3 rq3Var2 = null;
                if (!g3) {
                }
                O2 = new g2(axjVar3, g62, rq3Var2, 7);
                av8Var.n0(O2);
                e1d F2 = qea.F(av8Var, invoke2, (Function2) O2);
                w = t01Var3.w();
                po5Var2 = po5.c;
                if (w != po5Var2) {
                }
                av8Var.d0(-230699766);
                if (i7 != 4) {
                }
                O3 = av8Var.O();
                if (!z) {
                }
                O3 = new s70(axjVar3);
                av8Var.n0(O3);
                s70 s70Var2 = (s70) O3;
                q4k q4kVar32 = lz.l;
                O4 = av8Var.O();
                if (O4 == a99Var2) {
                }
                Function0 function02 = (Function0) O4;
                av8Var.d0(-167964673);
                av8Var.s(false);
                av8Var.d0(-167961890);
                av8Var.s(false);
                bxj bxjVar22 = zo5Var2.a;
                bxj bxjVar32 = of6Var2.a;
                alh alhVar2 = bxjVar22.b;
                in2 in2Var2 = bxjVar22.c;
                if (alhVar2 == null) {
                }
                if (in2Var2 == null) {
                }
                if (z2) {
                }
                if (z3) {
                }
                if (z3) {
                }
                boolean z92 = !z3;
                float[] fArr2 = l23.a;
                av8Var.d0(-910130296);
                av8Var.s(z4);
                q4k q4kVar52 = lz.f;
                if (bxjVar22.a == null) {
                }
                if (bxjVar22.d == null) {
                }
                if (z5) {
                }
                if (z6) {
                }
                if (z6) {
                }
                i5 = av8Var.i(pwjVar5) | av8Var.g(zo5Var2) | av8Var.g(of6Var2) | av8Var.i(pwjVar7) | av8Var.g(axjVar2) | av8Var.i(pwjVar8);
                O5 = av8Var.O();
                if (i5) {
                }
                zo5Var3 = zo5Var2;
                of6Var3 = of6Var2;
                O5 = new ro5(pwjVar5, pwjVar7, axjVar2, zo5Var3, of6Var3, pwjVar8);
                av8Var.n0(O5);
                ro5 ro5Var2 = (ro5) O5;
                h2 = av8Var.h(z92) | av8Var.g(function02);
                O6 = av8Var.O();
                if (!h2) {
                }
                O6 = new to5(z92, function02);
                av8Var.n0(O6);
                utc utcVar2 = utc.a;
                xtc z102 = s02.M(utcVar2, (Function1) O6).z(new qo5(axjVar2, pwjVar3, pwjVar4, pwjVar2, zo5Var3, of6Var3, function02, ro5Var2)).z(utcVar2);
                av8Var.d0(-7404393);
                av8Var.s(z4);
                xtc z112 = xtcVar.z(z102.z(utcVar2));
                O7 = av8Var.O();
                if (O7 == a99Var) {
                }
                s60 s60Var2 = (s60) O7;
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m22 = av8Var.m();
                xtc C2 = fqj.C(av8Var, z112);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, s60Var2, hf3.g);
                waa.K(av8Var, m22, hf3.f);
                waa.C(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                ct8Var2 = ct8Var;
                ct8Var2.invoke(s70Var2, av8Var, Integer.valueOf((i12 >> 18) & 112));
                av8Var.s(true);
                av8Var.s(z4);
                av8Var.s(z4);
            } else {
                av8Var.d0(-229362829);
                av8Var.s(false);
                ct8Var2 = ct8Var;
            }
        } else {
            ct8Var2 = ct8Var;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new l70(axjVar, function1, xtcVar, zo5Var, of6Var, function2, ct8Var2, i2);
        }
    }

    public static int a0(nm2 nm2Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && nm2Var.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return nm2Var.i(iArr[i2]) + i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(v23 v23Var, boolean z, xtc xtcVar, zo5 zo5Var, of6 of6Var, String str, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        zo5 zo5Var2;
        int i5;
        of6 of6Var2;
        int i6;
        xtc xtcVar2;
        of6 of6Var3;
        zo5 zo5Var3;
        av8 av8Var;
        String str2;
        eqf u2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1799879339);
        if ((i2 & 48) == 0) {
            i4 = (av8Var2.h(z) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i4 | 384;
        int i8 = i3 & 4;
        if (i8 != 0) {
            i7 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            zo5Var2 = zo5Var;
            i7 |= av8Var2.g(zo5Var2) ? a.o : 1024;
            i5 = i3 & 8;
            if (i5 == 0) {
                i7 |= 24576;
            } else if ((i2 & 24576) == 0) {
                of6Var2 = of6Var;
                i7 |= av8Var2.g(of6Var2) ? 16384 : 8192;
                i6 = i7 | 196608;
                if ((1572864 & i2) == 0) {
                    i6 |= av8Var2.i(tc3Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                if (av8Var2.T(i6 & 1, (599185 & i6) != 599184)) {
                    if (i8 != 0) {
                        zo5Var2 = uo5.e(null, 3).a(uo5.d(null, null, 15));
                    }
                    zo5 zo5Var4 = zo5Var2;
                    if (i5 != 0) {
                        of6Var2 = uo5.f(null, 3).a(uo5.l(null, null, 15));
                    }
                    int i9 = i6 >> 3;
                    axj L = yso.L(Boolean.valueOf(z), "AnimatedVisibility", av8Var2, (i9 & 14) | ((i6 >> 12) & 112), 0);
                    Object O = av8Var2.O();
                    if (O == nf3.a) {
                        O = ry.A;
                        av8Var2.n0(O);
                    }
                    int i10 = (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (i9 & 458752);
                    utc utcVar = utc.a;
                    f(L, (Function1) O, utcVar, zo5Var4, of6Var2, tc3Var, av8Var2, i10);
                    of6Var3 = of6Var2;
                    av8Var = av8Var2;
                    str2 = "AnimatedVisibility";
                    zo5Var3 = zo5Var4;
                    xtcVar2 = utcVar;
                } else {
                    av8Var2.W();
                    xtcVar2 = xtcVar;
                    of6Var3 = of6Var2;
                    zo5Var3 = zo5Var2;
                    av8Var = av8Var2;
                    str2 = str;
                }
                u2 = av8Var.u();
                if (u2 != null) {
                    u2.d = new o70(v23Var, z, xtcVar2, zo5Var3, of6Var3, str2, tc3Var, i2, i3);
                    return;
                }
                return;
            }
            of6Var2 = of6Var;
            i6 = i7 | 196608;
            if ((1572864 & i2) == 0) {
            }
            if (av8Var2.T(i6 & 1, (599185 & i6) != 599184)) {
            }
            u2 = av8Var.u();
            if (u2 != null) {
            }
        }
        zo5Var2 = zo5Var;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        of6Var2 = of6Var;
        i6 = i7 | 196608;
        if ((1572864 & i2) == 0) {
        }
        if (av8Var2.T(i6 & 1, (599185 & i6) != 599184)) {
        }
        u2 = av8Var.u();
        if (u2 != null) {
        }
    }

    public static final po5 b0(axj axjVar, Function1 function1, Object obj, of3 of3Var) {
        po5 po5Var;
        av8 av8Var = (av8) of3Var;
        av8Var.a0(-422486745, axjVar);
        boolean i2 = axjVar.i();
        t01 t01Var = axjVar.a;
        if (i2) {
            av8Var.d0(-212166497);
            av8Var.s(false);
            po5Var = ((Boolean) function1.invoke(obj)).booleanValue() ? po5.b : ((Boolean) function1.invoke(t01Var.w())).booleanValue() ? po5.c : po5.a;
        } else {
            av8Var.d0(-211892364);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            if (((Boolean) function1.invoke(t01Var.w())).booleanValue()) {
                e1dVar.setValue(Boolean.TRUE);
            }
            po5Var = ((Boolean) function1.invoke(obj)).booleanValue() ? po5.b : ((Boolean) e1dVar.getValue()).booleanValue() ? po5.c : po5.a;
            av8Var.s(false);
        }
        av8Var.s(false);
        return po5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(h1d h1dVar, xtc xtcVar, zo5 zo5Var, of6 of6Var, String str, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        String str2;
        xtc xtcVar3;
        eqf u2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(657024243);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? av8Var.g(h1dVar) : av8Var.i(h1dVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i4 |= av8Var.g(zo5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= av8Var.g(of6Var) ? a.o : 1024;
            }
            i5 = i4 | 24576;
            if ((196608 & i2) == 0) {
                i5 |= av8Var.i(tc3Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            }
            if (av8Var.T(i5 & 1, (74899 & i5) == 74898)) {
                av8Var.W();
                str2 = str;
                xtcVar3 = xtcVar2;
            } else {
                xtc xtcVar4 = i6 != 0 ? utc.a : xtcVar2;
                axj H = yso.H(h1dVar, "AnimatedVisibility", av8Var, (i5 & 14) | ((i5 >> 9) & 112));
                Object O = av8Var.O();
                if (O == nf3.a) {
                    O = ry.B;
                    av8Var.n0(O);
                }
                Function1 function1 = (Function1) O;
                int i7 = i5 << 3;
                f(H, function1, xtcVar4, zo5Var, of6Var, tc3Var, av8Var, (i7 & 57344) | (i7 & 896) | 48 | (i7 & 7168) | (i5 & 458752));
                str2 = "AnimatedVisibility";
                xtcVar3 = xtcVar4;
            }
            u2 = av8Var.u();
            if (u2 == null) {
                u2.d = new p70(h1dVar, xtcVar3, zo5Var, of6Var, str2, tc3Var, i2, i3);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i5 = i4 | 24576;
        if ((196608 & i2) == 0) {
        }
        if (av8Var.T(i5 & 1, (74899 & i5) == 74898)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static String c0(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + t62.O(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + t62.O(Float.intBitsToFloat(i2)) + ", " + t62.O(Float.intBitsToFloat(i3)) + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(boolean z, xtc xtcVar, zo5 zo5Var, of6 of6Var, String str, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        zo5 zo5Var2;
        int i5;
        of6 of6Var2;
        int i6;
        xtc xtcVar2;
        zo5 zo5Var3;
        of6 of6Var3;
        String str2;
        eqf u2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(234057107);
        if ((i2 & 48) == 0) {
            i4 = (av8Var.h(z) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i4 | 384;
        int i8 = i3 & 4;
        if (i8 != 0) {
            i7 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            zo5Var2 = zo5Var;
            i7 |= av8Var.g(zo5Var2) ? a.o : 1024;
            i5 = i3 & 8;
            if (i5 == 0) {
                i7 |= 24576;
            } else if ((i2 & 24576) == 0) {
                of6Var2 = of6Var;
                i7 |= av8Var.g(of6Var2) ? 16384 : 8192;
                i6 = i7 | 196608;
                if ((1572864 & i2) == 0) {
                    i6 |= av8Var.i(tc3Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                if (av8Var.T(i6 & 1, (599185 & i6) != 599184)) {
                    if (i8 != 0) {
                        zo5Var2 = uo5.e(null, 3).a(uo5.a());
                    }
                    zo5 zo5Var4 = zo5Var2;
                    of6 a2 = i5 != 0 ? uo5.f(null, 3).a(uo5.i()) : of6Var2;
                    int i9 = i6 >> 3;
                    str2 = "AnimatedVisibility";
                    axj L = yso.L(Boolean.valueOf(z), "AnimatedVisibility", av8Var, (i9 & 14) | ((i6 >> 12) & 112), 0);
                    Object O = av8Var.O();
                    if (O == nf3.a) {
                        O = ry.z;
                        av8Var.n0(O);
                    }
                    utc utcVar = utc.a;
                    f(L, (Function1) O, utcVar, zo5Var4, a2, tc3Var, av8Var, (i6 & 896) | 48 | (i6 & 7168) | (i6 & 57344) | (458752 & i9));
                    xtcVar2 = utcVar;
                    zo5Var3 = zo5Var4;
                    of6Var3 = a2;
                } else {
                    av8Var.W();
                    xtcVar2 = xtcVar;
                    zo5Var3 = zo5Var2;
                    of6Var3 = of6Var2;
                    str2 = str;
                }
                u2 = av8Var.u();
                if (u2 != null) {
                    u2.d = new n70(z, xtcVar2, zo5Var3, of6Var3, str2, tc3Var, i2, i3, 1);
                    return;
                }
                return;
            }
            of6Var2 = of6Var;
            i6 = i7 | 196608;
            if ((1572864 & i2) == 0) {
            }
            if (av8Var.T(i6 & 1, (599185 & i6) != 599184)) {
            }
            u2 = av8Var.u();
            if (u2 != null) {
            }
        }
        zo5Var2 = zo5Var;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        of6Var2 = of6Var;
        i6 = i7 | 196608;
        if ((1572864 & i2) == 0) {
        }
        if (av8Var.T(i6 & 1, (599185 & i6) != 599184)) {
        }
        u2 = av8Var.u();
        if (u2 != null) {
        }
    }

    public static final xtc d0(xtc xtcVar, n9a n9aVar) {
        return xtcVar.z(new p9a(n9aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(boolean z, xtc xtcVar, zo5 zo5Var, of6 of6Var, String str, ct8 ct8Var, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        zo5 zo5Var2;
        int i6;
        of6 of6Var2;
        int i7;
        xtc xtcVar3;
        zo5 zo5Var3;
        of6 of6Var3;
        String str2;
        eqf u2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1448730565);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                zo5Var2 = zo5Var;
                i4 |= av8Var.g(zo5Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    of6Var2 = of6Var;
                    i4 |= av8Var.g(of6Var2) ? a.o : 1024;
                    i7 = i4 | 24576;
                    if ((196608 & i2) == 0) {
                        i7 |= av8Var.i(ct8Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    }
                    if (av8Var.T(i7 & 1, (74899 & i7) == 74898)) {
                        av8Var.W();
                        xtcVar3 = xtcVar2;
                        zo5Var3 = zo5Var2;
                        of6Var3 = of6Var2;
                        str2 = str;
                    } else {
                        xtc xtcVar4 = i8 != 0 ? utc.a : xtcVar2;
                        zo5 a2 = i5 != 0 ? uo5.e(null, 3).a(uo5.c(null, null, 15)) : zo5Var2;
                        of6 a3 = i6 != 0 ? uo5.k(null, null, 15).a(uo5.f(null, 3)) : of6Var2;
                        str2 = "AnimatedVisibility";
                        axj L = yso.L(Boolean.valueOf(z), "AnimatedVisibility", av8Var, (i7 & 14) | ((i7 >> 9) & 112), 0);
                        Object O = av8Var.O();
                        if (O == nf3.a) {
                            O = ry.y;
                            av8Var.n0(O);
                        }
                        Function1 function1 = (Function1) O;
                        int i9 = i7 << 3;
                        zo5 zo5Var4 = a2;
                        f(L, function1, xtcVar4, zo5Var4, a3, ct8Var, av8Var, (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168) | (i7 & 458752));
                        xtcVar3 = xtcVar4;
                        zo5Var3 = zo5Var4;
                        of6Var3 = a3;
                    }
                    u2 = av8Var.u();
                    if (u2 == null) {
                        u2.d = new n70(z, xtcVar3, zo5Var3, of6Var3, str2, ct8Var, i2, i3, 0);
                        return;
                    }
                    return;
                }
                of6Var2 = of6Var;
                i7 = i4 | 24576;
                if ((196608 & i2) == 0) {
                }
                if (av8Var.T(i7 & 1, (74899 & i7) == 74898)) {
                }
                u2 = av8Var.u();
                if (u2 == null) {
                }
            }
            zo5Var2 = zo5Var;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            of6Var2 = of6Var;
            i7 = i4 | 24576;
            if ((196608 & i2) == 0) {
            }
            if (av8Var.T(i7 & 1, (74899 & i7) == 74898)) {
            }
            u2 = av8Var.u();
            if (u2 == null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        zo5Var2 = zo5Var;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        of6Var2 = of6Var;
        i7 = i4 | 24576;
        if ((196608 & i2) == 0) {
        }
        if (av8Var.T(i7 & 1, (74899 & i7) == 74898)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static final void f(axj axjVar, Function1 function1, xtc xtcVar, zo5 zo5Var, of6 of6Var, ct8 ct8Var, of3 of3Var, int i2) {
        int i3;
        zo5 zo5Var2;
        of6 of6Var2;
        ct8 ct8Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1706321816);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(axjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            zo5Var2 = zo5Var;
            i3 |= av8Var.g(zo5Var2) ? a.o : 1024;
        } else {
            zo5Var2 = zo5Var;
        }
        if ((i2 & 24576) == 0) {
            of6Var2 = of6Var;
            i3 |= av8Var.g(of6Var2) ? 16384 : 8192;
        } else {
            of6Var2 = of6Var;
        }
        if ((i2 & 196608) == 0) {
            ct8Var2 = ct8Var;
            i3 |= av8Var.i(ct8Var2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            ct8Var2 = ct8Var;
        }
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new q70(function1, axjVar);
                av8Var.n0(O);
            }
            xtc A = s9a.A(xtcVar, (ct8) O);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = f50.u;
                av8Var.n0(O2);
            }
            a(axjVar, function1, A, zo5Var2, of6Var2, (Function2) O2, ct8Var2, av8Var, 196608 | i5 | i4 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128));
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new h60(axjVar, function1, xtcVar, zo5Var, of6Var, ct8Var, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0188, code lost:
    
        if (r11 == r0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final tee teeVar, xtc xtcVar, final String str, Function0 function0, of3 of3Var, int i2) {
        xtc xtcVar2;
        long j2;
        Object obj;
        a99 a99Var;
        utc utcVar;
        boolean z;
        Function0 function02 = function0;
        teeVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-594564873);
        int i3 = i2 | (av8Var.g(teeVar) ? 4 : 2) | 48 | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function02) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            final long D = lz.D(R.color.primary_default, av8Var);
            final long D2 = lz.D(R.color.n_lv_1, av8Var);
            final long D3 = lz.D(R.color.surface_1, av8Var);
            long D4 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                b20 a2 = e20.a();
                float H0 = kx4Var.H0(31.0f);
                float H02 = kx4Var.H0(123.0f);
                float H03 = kx4Var.H0(30.0f);
                j2 = D4;
                float H04 = kx4Var.H0(140.0f);
                a2.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                a2.f(H02, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                a2.f(H02, H03);
                a2.f(H0, H03);
                a2.f(H0, H04);
                a2.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, H04);
                a2.d();
                av8Var.n0(a2);
                obj = a2;
            } else {
                j2 = D4;
                obj = O;
            }
            final b20 b20Var = (b20) obj;
            final jej Q = h5a.Q(1, 6, 0, av8Var);
            Object O2 = av8Var.O();
            if (O2 == a99Var2) {
                kx4Var.getClass();
                float H05 = kx4Var.H0(32.0f);
                b20 a3 = e20.a();
                a3.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float f2 = -H05;
                float f3 = f2 / 2.0f;
                a3.f(f2, f3);
                a3.f(f2, f2);
                a3.f(H05, f2);
                a3.f(H05, f3);
                a3.d();
                av8Var.n0(a3);
                O2 = a3;
            }
            final b20 b20Var2 = (b20) O2;
            utc utcVar2 = utc.a;
            xtc m2 = bkh.m(utcVar2, 272.0f, 330.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C = fqj.C(av8Var, m2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m3, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc b2 = n12.a.b(utcVar2);
            final long j3 = j2;
            boolean i4 = ((i3 & 896) == 256) | ((i3 & 14) == 4) | av8Var.i(b20Var) | av8Var.f(D) | av8Var.g(Q) | av8Var.f(D2) | av8Var.f(D3) | av8Var.i(b20Var2) | av8Var.f(j3);
            Object O3 = av8Var.O();
            if (i4) {
                a99Var = a99Var2;
            } else {
                a99Var = a99Var2;
            }
            O3 = new Function1() { // from class: pn1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v2, types: [float] */
                /* JADX WARN: Type inference failed for: r1v4 */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, tee] */
                /* JADX WARN: Type inference failed for: r1v9 */
                /* JADX WARN: Type inference failed for: r3v0, types: [float] */
                /* JADX WARN: Type inference failed for: r3v1 */
                /* JADX WARN: Type inference failed for: r3v2, types: [float] */
                /* JADX WARN: Type inference failed for: r3v23 */
                /* JADX WARN: Type inference failed for: r3v24 */
                /* JADX WARN: Type inference failed for: r3v25 */
                /* JADX WARN: Type inference failed for: r3v26 */
                /* JADX WARN: Type inference failed for: r3v29 */
                /* JADX WARN: Type inference failed for: r3v31 */
                /* JADX WARN: Type inference failed for: r3v33 */
                /* JADX WARN: Type inference failed for: r3v34 */
                /* JADX WARN: Type inference failed for: r3v4 */
                /* JADX WARN: Type inference failed for: r3v5 */
                /* JADX WARN: Type inference failed for: r3v6, types: [ha5, kx4] */
                /* JADX WARN: Type inference failed for: r3v7 */
                /* JADX WARN: Type inference failed for: r3v9 */
                /* JADX WARN: Type inference failed for: r4v2, types: [hpo] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ?? r1;
                    Iterator it;
                    String str2;
                    long j4;
                    jej jejVar;
                    long j5;
                    long j6;
                    ha5 ha5Var;
                    Map map;
                    Float f4;
                    String str3;
                    float f5;
                    b20 b20Var3;
                    ha5 ha5Var2;
                    jej jejVar2;
                    o91 o91Var;
                    String str4;
                    pn1 pn1Var = this;
                    b20 b20Var4 = b20Var;
                    b20 b20Var5 = b20Var2;
                    long j7 = j3;
                    ha5 ha5Var3 = (ha5) obj2;
                    ha5Var3.getClass();
                    float H06 = ha5Var3.H0(24.0f);
                    ?? H07 = ha5Var3.H0(48.0f);
                    boolean z2 = false;
                    ((hpo) ha5Var3.L0().a).y(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, H06, H07);
                    try {
                        it = o91.c.iterator();
                        H07 = H07;
                    } catch (Throwable th) {
                        th = th;
                    }
                    while (true) {
                        boolean hasNext = it.hasNext();
                        r1 = tee.this;
                        str2 = str;
                        j4 = D;
                        jejVar = Q;
                        j5 = D2;
                        j6 = D3;
                        if (!hasNext) {
                            break;
                        }
                        try {
                            o91 o91Var2 = (o91) it.next();
                            b20 b20Var6 = b20Var4;
                            tl1 tl1Var = (tl1) r1.get(Integer.valueOf(o91Var2.a));
                            float l2 = yid.l(tl1Var != null ? Float.valueOf(tl1Var.b) : null);
                            if (tl1Var != null && (str4 = tl1Var.a) != null) {
                                str2 = str4;
                            }
                            float b3 = llf.b(l2, 0.1f, 1.0f);
                            if (l2 < 0.5f) {
                                j6 = j5;
                                ha5Var2 = ha5Var3;
                                b20Var4 = b20Var6;
                                jejVar2 = jejVar;
                                f5 = b3;
                                ha5Var3 = H07;
                                b20Var3 = b20Var5;
                                o91Var = o91Var2;
                            } else {
                                f5 = b3;
                                b20Var3 = b20Var5;
                                ha5Var2 = ha5Var3;
                                b20Var4 = b20Var6;
                                jejVar2 = jejVar;
                                ha5Var3 = H07;
                                o91Var = o91Var2;
                            }
                            try {
                                fz8.M(ha5Var2, b20Var4, o91Var, str2, j4, f5, jejVar2, j6);
                                ha5 ha5Var4 = ha5Var2;
                                ha5 ha5Var5 = ha5Var3;
                                ha5Var3 = ha5Var4;
                                H07 = ha5Var5;
                                b20Var5 = b20Var3;
                                z2 = false;
                                pn1Var = this;
                            } catch (Throwable th2) {
                                th = th2;
                                H07 = ha5Var2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            ha5 ha5Var6 = ha5Var3;
                            ha5Var3 = H07;
                            H07 = ha5Var6;
                        }
                        ha5 ha5Var7 = ha5Var3;
                        ha5Var3 = H07;
                        H07 = ha5Var7;
                        r1 = H06;
                        ((hpo) ha5Var3.L0().a).y(-0.0f, -0.0f, -r1, -H07);
                        throw th;
                    }
                    ha5 ha5Var8 = ha5Var3;
                    ha5Var3 = H07;
                    H07 = ha5Var8;
                    long j8 = j4;
                    b20 b20Var7 = b20Var5;
                    try {
                        try {
                            float H08 = H07.H0(33.0f);
                            float H09 = H07.H0(32.0f);
                            ((hpo) H07.L0().a).y(H08, H09, H08, H09);
                            try {
                                Map map2 = r1;
                                H07 = H07;
                                for (n91 n91Var : n91.c) {
                                    b20 b20Var8 = b20Var7;
                                    tl1 tl1Var2 = (tl1) map2.get(Integer.valueOf(n91Var.a));
                                    if (tl1Var2 != null) {
                                        map = map2;
                                        f4 = Float.valueOf(tl1Var2.b);
                                    } else {
                                        map = map2;
                                        f4 = null;
                                    }
                                    float l3 = yid.l(f4);
                                    int i5 = n91Var.a - 1;
                                    String str5 = (tl1Var2 == null || (str3 = tl1Var2.a) == null) ? str2 : str3;
                                    ha5 ha5Var9 = H07;
                                    try {
                                        float b4 = llf.b(l3, 0.1f, 1.0f);
                                        ha5 ha5Var10 = ha5Var3;
                                        ha5Var = ha5Var9;
                                        long j9 = (l3 > 0.5f ? 1 : (l3 == 0.5f ? 0 : -1)) < 0 ? j5 : j6;
                                        float f6 = H06;
                                        try {
                                            fz8.L(ha5Var, i5, str5, j8, b4, jejVar, j9);
                                            ha5Var3 = ha5Var10;
                                            H07 = ha5Var;
                                            H06 = f6;
                                            b20Var7 = b20Var8;
                                            map2 = map;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            float f7 = -H08;
                                            float f8 = -H09;
                                            ((hpo) ha5Var.L0().a).y(f7, f8, f7, f8);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        ha5Var = ha5Var9;
                                    }
                                }
                                ?? r12 = ha5Var3;
                                ha5 ha5Var11 = H07;
                                b20 b20Var9 = b20Var7;
                                float f9 = H06;
                                float f10 = -H08;
                                float f11 = -H09;
                                ((hpo) ha5Var11.L0().a).y(f10, f11, f10, f11);
                                ((hpo) ha5Var11.L0().a).y(-0.0f, -0.0f, -f9, -(r12 == true ? 1.0f : 0.0f));
                                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var11.n() >> 32)) - ha5Var11.H0(12.0f);
                                float H010 = ha5Var11.H0(48.0f);
                                hpo hpoVar = (hpo) ha5Var11.L0().a;
                                float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                hpoVar.y(intBitsToFloat, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, H010);
                                try {
                                    long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var11.n() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var11.n() & 4294967295L)) / 10.0f) & 4294967295L);
                                    int i6 = 0;
                                    while (i6 < 10) {
                                        long j10 = j8;
                                        ha5.o0(ha5Var11, j10, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) * r6) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32), floatToRawIntBits, 1.0f - (i6 * 0.1f), null, null, 112);
                                        j8 = j10;
                                        i6++;
                                        f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    }
                                    ((hpo) ha5Var11.L0().a).y(-intBitsToFloat, -0.0f, -0.0f, -H010);
                                    float intBitsToFloat2 = (Float.intBitsToFloat((int) (ha5Var11.n() >> 32)) / 2.0f) - ha5Var11.H0(12.0f);
                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var11.n() & 4294967295L));
                                    ((hpo) ha5Var11.L0().a).I(intBitsToFloat2, intBitsToFloat3);
                                    try {
                                        ha5.X0(ha5Var11, b20Var9, j7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                                        ((hpo) ha5Var11.L0().a).I(-intBitsToFloat2, -intBitsToFloat3);
                                        return Unit.a;
                                    } catch (Throwable th6) {
                                        ((hpo) ha5Var11.L0().a).I(-intBitsToFloat2, -intBitsToFloat3);
                                        throw th6;
                                    }
                                } catch (Throwable th7) {
                                    ((hpo) ha5Var11.L0().a).y(-intBitsToFloat, -0.0f, -0.0f, -H010);
                                    throw th7;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                ha5Var = H07;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                }
            };
            av8Var.n0(O3);
            lz.d(0, av8Var, b2, (Function1) O3);
            if (function0 != null) {
                av8Var.d0(-1073032930);
                xtc m4 = bkh.m(utcVar2, 248.0f, 282.0f);
                long D5 = lz.D(R.color.n_lv_4, av8Var);
                Object O4 = av8Var.O();
                if (O4 == a99Var) {
                    O4 = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O4;
                Object[] objArr = new Object[0];
                Object O5 = av8Var.O();
                if (O5 == a99Var) {
                    O5 = fi.l;
                    av8Var.n0(O5);
                }
                function02 = function0;
                gm gmVar = new gm(function02, (boh) o3a.N(objArr, (Function0) O5, av8Var, 48), 2);
                utcVar = utcVar2;
                z = true;
                nq8.h(av8Var, tol.y(m4, true, true, false, D5, wzcVar, gmVar, av8Var, 0));
                av8Var.s(false);
            } else {
                function02 = function0;
                utcVar = utcVar2;
                z = true;
                av8Var.d0(-1072687931);
                av8Var.s(false);
            }
            av8Var.s(z);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ace(i2, 2, teeVar, xtcVar2, str, function02);
        }
    }

    public static final void h(osa osaVar, String str, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1980660449);
        int i3 = i2 | (av8Var.i(osaVar) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.i(function1) ? 256 : 128) | (av8Var.i(function12) ? 2048 : 1024) | 24576;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 7);
            boolean z = ((i3 & 14) == 4 || av8Var.i(osaVar)) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                l50 l50Var = new l50(osaVar, str, function1, function12, 3);
                av8Var.n0(l50Var);
                O = l50Var;
            }
            utc utcVar = utc.a;
            v8a.a(utcVar, a2, C, null, null, null, false, null, (Function1) O, av8Var, 390, PglCryptUtils.BASE64_FAILED);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ere((Object) osaVar, (Object) str, (Object) function1, (Object) function12, (Object) xtcVar2, i2, 2);
        }
    }

    public static final void i(pyg pygVar, p63 p63Var, e93 e93Var, Function0 function0, of3 of3Var, int i2) {
        p63Var.getClass();
        e93Var.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-706593315);
        int i3 = i2 | (av8Var.i(pygVar) ? 4 : 2) | (av8Var.i(p63Var) ? 32 : 16) | (av8Var.e(e93Var.ordinal()) ? 256 : 128) | (av8Var.i(function0) ? 2048 : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            osa a2 = rsa.a(p63Var.j, av8Var);
            String str = p63Var.e;
            if (str == null) {
                str = "";
            }
            boolean i4 = ((i3 & 896) == 256) | av8Var.i(p63Var) | av8Var.i(pygVar) | ((i3 & 7168) == 2048);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i4 || O == a99Var) {
                l50 l50Var = new l50(p63Var, pygVar, e93Var, function0, 2);
                av8Var.n0(l50Var);
                O = l50Var;
            }
            Function1 function1 = (Function1) O;
            boolean i5 = av8Var.i(p63Var);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                O2 = new ox1(p63Var, 21);
                av8Var.n0(O2);
            }
            h(a2, str, function1, (Function1) O2, null, av8Var, 8);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ace(i2, 4, pygVar, p63Var, e93Var, function0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(final int i2, final int i3, long j2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        int i4;
        long j3;
        int i5;
        int i6;
        final xtc xtcVar3;
        eqf u2;
        xtc xtcVar4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-255991425);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            xtcVar2 = xtcVar;
        } else if ((i2 & 6) == 0) {
            xtcVar2 = xtcVar;
            i4 = (av8Var.g(xtcVar2) ? 4 : 2) | i2;
        } else {
            xtcVar2 = xtcVar;
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            j3 = j2;
            if (av8Var.f(j3)) {
                i5 = 32;
                i6 = i4 | i5;
                if (av8Var.T(i6 & 1, (i6 & 19) == 18)) {
                    av8Var.W();
                    xtcVar3 = xtcVar2;
                } else {
                    av8Var.Y();
                    if ((i2 & 1) == 0 || av8Var.B()) {
                        xtcVar4 = i7 != 0 ? utc.a : xtcVar2;
                        if ((i3 & 2) != 0) {
                            j3 = r13.c(lz.D(R.color.n_lv_1, av8Var), 0.15f);
                        }
                    } else {
                        av8Var.W();
                        xtcVar4 = xtcVar2;
                    }
                    av8Var.t();
                    e12.a(0, av8Var, n9e.q(l98.b0(bkh.l(xtcVar4, 16.0f), 5.5f), j3, o7g.a));
                    xtcVar3 = xtcVar4;
                }
                final long j4 = j3;
                u2 = av8Var.u();
                if (u2 == null) {
                    u2.d = new Function2() { // from class: s65
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            fz8.j(aba.K(i2 | 1), i3, j4, (of3) obj, xtcVar3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            j3 = j2;
        }
        i5 = 16;
        i6 = i4 | i5;
        if (av8Var.T(i6 & 1, (i6 & 19) == 18)) {
        }
        final long j42 = j3;
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static final void k(final FantasyPlayerUiModel fantasyPlayerUiModel, final Function0 function0, final boolean z, final xtc xtcVar, final float f2, of3 of3Var, final int i2) {
        int i3;
        av8 av8Var;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-776006371);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(fantasyPlayerUiModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.d(f2) ? 16384 : 8192;
        }
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            mv1 mv1Var = uxf.d;
            xtc q2 = n9e.q(xtcVar, lz.D(R.color.surface_2, av8Var2), o7g.a(12.0f));
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, q2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            d7e t2 = haa.t(R.drawable.ic_close, 0, av8Var2);
            long D = lz.D(R.color.primary_default, av8Var2);
            utc utcVar = utc.a;
            xtc A = wnn.A(l98.f0(utcVar, 4.0f, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), o7g.a);
            boolean z2 = (i3 & 112) == 32;
            Object O = av8Var2.O();
            if (z2 || O == nf3.a) {
                O = new v61(27, function0);
                av8Var2.n0(O);
            }
            int i4 = i3;
            kq9.a(t2, null, n12.a.a(bkh.l(l98.b0(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var2, 31), 4.0f), 24.0f), uxf.c), D, av8Var2, 56, 0);
            kv1 kv1Var = uxf.p;
            xtc c0 = l98.c0(utcVar, 4.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, c0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            wnn.l(fantasyPlayerUiModel.a, fantasyPlayerUiModel.c, z, bkh.l(utcVar, 48.0f), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, av8Var2, (i4 & 896) | 3072, 240);
            nq8.h(av8Var2, bkh.e(utcVar, 8.0f * f2));
            String str = fantasyPlayerUiModel.g;
            if (str == null) {
                str = fantasyPlayerUiModel.f;
            }
            String str2 = str;
            yf8 yf8Var = xth.a;
            dfj l2 = xth.l();
            long j2 = xth.l().a.b;
            v8a.l(j2);
            dfj a3 = dfj.a(l2, 0L, v8a.E(j2 & 1095216660480L, lfj.c(j2) * f2), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213);
            float f3 = 16.0f * f2;
            udj.c(str2, bkh.g(utcVar, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, a3, av8Var2, 0, 24960, 110584);
            nq8.h(av8Var2, bkh.e(utcVar, 4.0f * f2));
            String H = s02.H(fantasyPlayerUiModel.i.c, null, null, av8Var2, 4);
            dfj b2 = xth.b();
            long j3 = xth.b().a.b;
            v8a.l(j3);
            udj.c(H, bkh.g(utcVar, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, dfj.a(b2, 0L, v8a.E(1095216660480L & j3, lfj.c(j3) * f2), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), av8Var2, 0, 24960, 109560);
            av8Var = av8Var2;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2() { // from class: pc7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fz8.k(FantasyPlayerUiModel.this, function0, z, xtcVar, f2, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(ev6 ev6Var, nl7 nl7Var, Function1 function1, ct8 ct8Var, xtc xtcVar, of3 of3Var, int i2) {
        nl7Var.getClass();
        function1.getClass();
        ct8Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-551783158);
        int i3 = i2 | (av8Var.g(ev6Var) ? 4 : 2) | (av8Var.i(nl7Var) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(ct8Var) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(1408437208, av8Var, new ff7(nl7Var, function1, ev6Var, xtcVar, ct8Var, 10)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ere(ev6Var, nl7Var, function1, ct8Var, xtcVar, i2, 14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if ((r34 & 2) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(int i2, long j2, of3 of3Var, int i3, int i4) {
        long j3;
        int i5;
        int i6;
        long j4;
        eqf u2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2124488453);
        int i7 = i3 | (av8Var.e(i2) ? 4 : 2);
        if ((i4 & 2) == 0) {
            j3 = j2;
            if (av8Var.f(j3)) {
                i5 = 32;
                i6 = i7 | i5;
                if (av8Var.T(i6 & 1, (i6 & 19) == 18)) {
                    av8Var.W();
                    j4 = j3;
                } else {
                    av8Var.Y();
                    if ((i3 & 1) == 0 || av8Var.B()) {
                        if ((i4 & 2) != 0) {
                            j3 = lz.D(R.color.primary_default, av8Var);
                            i6 &= -113;
                        }
                        long j5 = j3;
                        av8Var.t();
                        utc utcVar = utc.a;
                        xtc b0 = l98.b0(bkh.d(utcVar, 1.0f), 8.0f);
                        l8g a2 = k8g.a(ww9.f, uxf.l, av8Var, 6);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m2 = av8Var.m();
                        xtc C = fqj.C(av8Var, b0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a2, hf3.g);
                        waa.K(av8Var, m2, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C, hf3.d);
                        String v = oea.v(i2, av8Var);
                        yf8 yf8Var = xth.a;
                        udj.c(v, null, j5, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, (i6 << 3) & 896, 0, 131066);
                        av8Var = av8Var;
                        nq8.h(av8Var, bkh.p(utcVar, 4.0f));
                        kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, null, j5, av8Var, ((i6 << 6) & 7168) | 48, 4);
                        j4 = j5;
                        av8Var.s(true);
                    } else {
                        av8Var.W();
                    }
                }
                u2 = av8Var.u();
                if (u2 == null) {
                    u2.d = new et4(i2, i3, i4, j4);
                    return;
                }
                return;
            }
        } else {
            j3 = j2;
        }
        i5 = 16;
        i6 = i7 | i5;
        if (av8Var.T(i6 & 1, (i6 & 19) == 18)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static final void n(String str, gv9 gv9Var, xtc xtcVar, gv9 gv9Var2, of3 of3Var, int i2) {
        av8 av8Var;
        str.getClass();
        gv9Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1439251173);
        int i3 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(gv9Var) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(gv9Var2) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(l98.f0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var2), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            yf8 yf8Var = xth.a;
            dfj l2 = xth.l();
            long D = lz.D(R.color.n_lv_1, av8Var2);
            utc utcVar = utc.a;
            udj.c(str, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, l2, av8Var2, (i3 & 14) | 48, 24960, 109560);
            av8Var = av8Var2;
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            if (gv9Var2 == null) {
                av8Var.d0(1219522874);
                av8Var.s(false);
            } else {
                av8Var.d0(1219522875);
                r(gv9Var2, av8Var, 0);
                Unit unit = Unit.a;
                av8Var.s(false);
            }
            av8Var.d0(-514844794);
            int i4 = 0;
            for (Object obj : gv9Var) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                gv9 gv9Var3 = (gv9) obj;
                av8Var.a0(1821471882, "row_" + i4);
                ng0 ng0Var = new ng0(2.0f, true, new a70(6));
                xtc d02 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                l8g a3 = k8g.a(ng0Var, uxf.l, av8Var, 6);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, d02);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, hf3.g);
                waa.K(av8Var, m3, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                Iterator p2 = ljg.p(av8Var, C2, hf3.d, 665032154, gv9Var3);
                while (p2.hasNext()) {
                    qp9 qp9Var = (qp9) p2.next();
                    av8Var.a0(-2020264315, qp9Var != null ? Integer.valueOf(qp9Var.a) : null);
                    q(qp9Var, new goa(1.0f, true), av8Var, 0);
                    av8Var.s(false);
                }
                ljg.t(av8Var, false, true, false);
                i4 = i5;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new mp9(str, gv9Var, xtcVar, gv9Var2, i2, 0);
        }
    }

    public static final void o(qp9 qp9Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        boolean z;
        r13 r13Var;
        long j2;
        boolean z2;
        int i4;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(587130682);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(qp9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            kv1 kv1Var = uxf.p;
            xtc A = wnn.A(xtcVar, o7g.a(4.0f));
            int i6 = 14;
            boolean i7 = ((i3 & 14) == 4) | av8Var.i(context);
            Object O = av8Var.O();
            if (i7 || O == nf3.a) {
                O = new ij8(i6, context, qp9Var);
                av8Var.n0(O);
            }
            xtc d0 = l98.d0(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc p2 = bkh.p(utcVar, 56.0f);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, p2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i8 = qp9Var.a;
            pp9 pp9Var = qp9Var.d;
            if (pp9Var == null) {
                av8Var.d0(-1980833026);
                z = false;
                av8Var.s(false);
                r13Var = null;
            } else {
                z = false;
                av8Var.d0(-1587918493);
                long a3 = pp9Var.a(av8Var);
                av8Var.s(false);
                r13Var = new r13(a3);
            }
            if (r13Var == null) {
                j2 = ljg.f(av8Var, -1587918201, R.color.n_lv_4, av8Var, z);
            } else {
                av8Var.d0(-1587919162);
                av8Var.s(z);
                j2 = r13Var.a;
            }
            long j3 = j2;
            mv1 mv1Var2 = uxf.g;
            n12 n12Var = n12.a;
            td4.C(i8, bkh.l(n12Var.a(utcVar, mv1Var2), 40.0f), j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 8);
            if (pp9Var == null) {
                av8Var.d0(-1980635463);
                z2 = false;
                av8Var.s(false);
            } else {
                av8Var.d0(-1980635462);
                long a4 = pp9Var.a(av8Var);
                ImageVector b2 = pp9Var.b(av8Var);
                xtc l2 = bkh.l(n12Var.a(utcVar, mv1Var), 16.0f);
                n7g n7gVar = o7g.a;
                kq9.b(b2, null, yso.o(n9e.q(wnn.A(l2, n7gVar), lz.D(R.color.on_color_primary, av8Var), oyn.e), 1.0f, lz.D(R.color.neutral_highlight, av8Var), n7gVar), a4, av8Var, 48, 0);
                Unit unit = Unit.a;
                z2 = false;
                av8Var.s(false);
            }
            bf3.t(av8Var, true, utcVar, 4.0f, av8Var);
            String str = qp9Var.b;
            yf8 yf8Var = xth.a;
            dfj n2 = xth.n();
            if (pp9Var == null) {
                i4 = -1537259443;
                i5 = R.color.n_lv_1;
            } else {
                i4 = -1537258963;
                i5 = R.color.n_lv_3;
            }
            udj.c(str, null, ljg.f(av8Var, i4, i5, av8Var, z2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, n2, av8Var, 0, 24960, 109562);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new lj(qp9Var, xtcVar, i2, 20);
        }
    }

    public static final void p(int i2, of3 of3Var, xtc xtcVar) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-224400319);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(xtcVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            ImageVector N = s6a.N(R.drawable.player_photo_placeholder, 6, av8Var);
            long j2 = r13.i;
            utc utcVar = utc.a;
            kq9.b(N, null, bkh.l(utcVar, 40.0f), j2, av8Var, V2.b.f, 0);
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            yf8 yf8Var = xth.a;
            udj.c("-", null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.n(), av8Var, 6, 0, 130042);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new xz(xtcVar, i2, 11);
        }
    }

    public static final void q(qp9 qp9Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1682510764);
        int i3 = (av8Var.g(qp9Var) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (!av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            av8Var.W();
        } else if (qp9Var == null) {
            av8Var.d0(-1409673978);
            p((i3 >> 3) & 14, av8Var, xtcVar);
            av8Var.s(false);
        } else {
            av8Var.d0(-1409564300);
            o(qp9Var, xtcVar, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            av8Var.s(false);
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new kz6(qp9Var, xtcVar, i2, 29);
        }
    }

    public static final void r(gv9 gv9Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-102209570);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            ng0 ng0Var = new ng0(2.0f, true, new a70(6));
            xtc d0 = l98.d0(bkh.d(utc.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a2 = k8g.a(ng0Var, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p2 = ljg.p(av8Var, C, hf3.d, -480764989, gv9Var);
            while (p2.hasNext()) {
                String str = (String) p2.next();
                av8Var.a0(-887410893, str);
                v(0, av8Var, new goa(1.0f, true), str);
                av8Var.s(false);
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new np9(i2, i4, gv9Var);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void s(int r44, defpackage.of3 r45, defpackage.xtc r46) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz8.s(int, of3, xtc):void");
    }

    public static final void t(pp9 pp9Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        q9k q9kVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1100513379);
        int i3 = (av8Var.e(pp9Var.ordinal()) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(pp9Var.b(av8Var), null, bkh.l(utcVar, 24.0f), pp9Var.a(av8Var), av8Var, 432, 0);
            int ordinal = pp9Var.ordinal();
            if (ordinal == 0) {
                q9kVar = new q9k(R.string.player_injured);
            } else if (ordinal == 1) {
                q9kVar = new q9k(R.string.injury_status_doubtful);
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return;
                }
                q9kVar = new q9k(R.string.player_suspended);
            }
            String a3 = q9kVar.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new op9(pp9Var, xtcVar2, i2, 0);
        }
    }

    public static final void u(int i2, of3 of3Var) {
        eqf u2;
        wqg wqgVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-161843179);
        int i3 = (av8Var.e(R.drawable.ic_world_cup_background) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            boolean z = (i3 & 14) == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            rq3 rq3Var = null;
            if (z || O == a99Var) {
                Drawable drawable = context.getDrawable(R.drawable.ic_world_cup_background);
                O = drawable != null ? new a10(u6h.U(drawable, 0, 0, 7)) : null;
                av8Var.n0(O);
            }
            a10 a10Var = (a10) O;
            if (a10Var == null) {
                u2 = av8Var.u();
                if (u2 != null) {
                    wqgVar = new wqg(i2, 12);
                    u2.d = wqgVar;
                }
                return;
            }
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var.n0(O2);
            }
            q50 q50Var = (q50) O2;
            Unit unit = Unit.a;
            boolean i4 = av8Var.i(q50Var);
            Object O3 = av8Var.O();
            if (i4 || O3 == a99Var) {
                O3 = new w07(q50Var, rq3Var, 10);
                av8Var.n0(O3);
            }
            hz8.o(av8Var, unit, (Function2) O3);
            g28 g28Var = bkh.c;
            boolean i5 = av8Var.i(a10Var) | av8Var.i(q50Var);
            Object O4 = av8Var.O();
            if (i5 || O4 == a99Var) {
                O4 = new aaf(21, a10Var, q50Var);
                av8Var.n0(O4);
            }
            lz.d(6, av8Var, g28Var, (Function1) O4);
        } else {
            av8Var.W();
        }
        u2 = av8Var.u();
        if (u2 != null) {
            wqgVar = new wqg(i2, 13);
            u2.d = wqgVar;
        }
    }

    public static final void v(int i2, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1590636973);
        int i3 = (av8Var2.g(str) ? 4 : 2) | i2 | (av8Var2.g(xtcVar) ? 32 : 16);
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(str, xtcVar, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.m(), av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0, 130040);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new x81(str, xtcVar, i2, 3);
        }
    }

    public static final void w(sz1 sz1Var, boolean z, Integer num, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        boolean z2;
        Object u2gVar;
        String str;
        xtc q2;
        int i3 = sz1Var.c;
        String str2 = sz1Var.b;
        mv1 mv1Var = uxf.g;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(358219032);
        int i4 = i2 | (av8Var.g(sz1Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192);
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            long D = lz.D(R.color.n_lv_1, av8Var);
            long D2 = lz.D(R.color.n_lv_2, av8Var);
            if (!z) {
                D = D2;
            }
            cdi a2 = wih.a(D, null, "text", av8Var, 384, 10);
            xtc c2 = bkh.c(xtcVar, 1.0f);
            long D3 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mce.D;
                av8Var.n0(O2);
            }
            xtc y = tol.y(c2, true, true, false, D3, wzcVar, new cyg(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 8), av8Var, 0);
            k1c c3 = e12.c(uxf.j, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            av8Var.d0(1120248906);
            mv1 mv1Var2 = uxf.d;
            n12 n12Var = n12.a;
            utc utcVar = utc.a;
            xtc O3 = rd0.O(n12Var.a(utcVar, mv1Var2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16.0f, 1);
            long D4 = lz.D(R.color.n_lv_4, av8Var);
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = mz1.e(av8Var);
            }
            wzc wzcVar2 = (wzc) O4;
            Object[] objArr2 = new Object[0];
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                O5 = mce.E;
                av8Var.n0(O5);
            }
            xtc l2 = bkh.l(tol.y(O3, true, true, false, D4, wzcVar2, new cyg(function0, (boh) o3a.N(objArr2, (Function0) O5, av8Var, 48), 9), av8Var, 0), 48.0f);
            n7g n7gVar = o7g.a;
            xtc A = wnn.A(l2, n7gVar);
            if (num != null) {
                if (num == null) {
                    av8Var.d0(-386603016);
                    z2 = false;
                    av8Var.s(false);
                    q2 = null;
                } else {
                    z2 = false;
                    av8Var.d0(-386603015);
                    q2 = n9e.q(utcVar, lz.D(num.intValue(), av8Var), n7gVar);
                    av8Var.s(false);
                }
                if (q2 == null) {
                    q2 = utcVar;
                }
                A = A.z(q2);
            } else {
                z2 = false;
            }
            av8Var.s(z2);
            k1c c4 = e12.c(mv1Var, z2);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, A);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            if (num == null) {
                av8Var.d0(-689474760);
                u(0, av8Var);
                av8Var.s(false);
            } else {
                av8Var.d0(-689384426);
                av8Var.s(false);
            }
            Context context = (Context) av8Var.k(nz.b);
            boolean e2 = av8Var.e(i3);
            Object O6 = av8Var.O();
            if (e2 || O6 == a99Var) {
                try {
                    p2g p2gVar = w2g.b;
                    Drawable drawable = context.getDrawable(i3);
                    u2gVar = drawable != null ? new a10(u6h.U(drawable, 0, 0, 7)) : null;
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                O6 = (a10) (u2gVar instanceof u2g ? null : u2gVar);
                av8Var.n0(O6);
            }
            a10 a10Var = (a10) O6;
            if (a10Var != null) {
                av8Var.d0(-689029631);
                str = str2;
                kq9.a(new cx1(a10Var), str, n12Var.a(utcVar, mv1Var), r13.i, av8Var, 3080, 0);
                av8Var.s(false);
            } else {
                str = str2;
                av8Var.d0(-688747531);
                kq9.b(s6a.N(R.drawable.ic_world_cup_fallback, 6, av8Var), str, n12Var.a(utcVar, mv1Var), r13.i, av8Var, 3072, 0);
                av8Var.s(false);
            }
            av8Var.s(true);
            long j2 = ((r13) a2.getValue()).a;
            yf8 yf8Var = xth.a;
            udj.c(str, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 7), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 1, 0, null, xth.b(), av8Var, 48, 24576, 113656);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new f70(sz1Var, z, num, function0, xtcVar, i2, 12);
        }
    }

    public static final void x(final gv9 gv9Var, final int i2, final float f2, final float f3, final xtc xtcVar, of3 of3Var, final int i3) {
        Object w;
        Object w2;
        Object w3;
        Object w4;
        int i4;
        Object b2;
        Object w5;
        nnh w6;
        Function1 e2;
        nnh C;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1189520993);
        int i5 = i3 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.d(f3) ? a.o : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192);
        if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            axj L = yso.L(Integer.valueOf(i2), "TabTransition", av8Var, ((i5 >> 3) & 14) | 48, 0);
            t01 t01Var = L.a;
            q4k q4kVar = lz.h;
            boolean i6 = L.i();
            a99 a99Var = nf3.a;
            if (i6) {
                av8Var.d0(1666827533);
                av8Var.s(false);
                w = t01Var.w();
            } else {
                av8Var.d0(1666573488);
                boolean g2 = av8Var.g(L);
                w = av8Var.O();
                if (g2 || w == a99Var) {
                    w6 = bea.w();
                    e2 = w6 != null ? w6.e() : null;
                    C = bea.C(w6);
                    try {
                        Object w7 = t01Var.w();
                        bea.K(w6, C, e2);
                        av8Var.n0(w7);
                        w = w7;
                    } finally {
                    }
                }
                av8Var.s(false);
            }
            int intValue = ((Number) w).intValue();
            av8Var.d0(-1762382114);
            float f4 = f2 / 2.0f;
            boolean z = ((sz1) gv9Var.get(intValue)).e;
            av8Var.s(false);
            p75 p75Var = new p75(((intValue * f2) + f4) - 28.0f);
            boolean g3 = av8Var.g(L);
            Object O = av8Var.O();
            if (g3 || O == a99Var) {
                O = goh.b(new c24(L, 6));
                av8Var.n0(O);
            }
            int intValue2 = ((Number) ((cdi) O).getValue()).intValue();
            av8Var.d0(-1762382114);
            boolean z2 = ((sz1) gv9Var.get(intValue2)).e;
            av8Var.s(false);
            p75 p75Var2 = new p75(((intValue2 * f2) + f4) - 28.0f);
            boolean g4 = av8Var.g(L);
            Object O2 = av8Var.O();
            if (g4 || O2 == a99Var) {
                O2 = goh.b(new c24(L, 7));
                av8Var.n0(O2);
            }
            av8Var.d0(-1953972046);
            Map map = hwk.a;
            g0i e0 = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new p75(0.4f), 3);
            av8Var.s(false);
            vwj x = yso.x(L, p75Var, p75Var2, e0, q4kVar, av8Var, 196608);
            if (L.i()) {
                av8Var.d0(1666827533);
                av8Var.s(false);
                w2 = t01Var.w();
            } else {
                av8Var.d0(1666573488);
                boolean g5 = av8Var.g(L);
                w2 = av8Var.O();
                if (g5 || w2 == a99Var) {
                    w6 = bea.w();
                    e2 = w6 != null ? w6.e() : null;
                    C = bea.C(w6);
                    try {
                        Object w8 = t01Var.w();
                        bea.K(w6, C, e2);
                        av8Var.n0(w8);
                        w2 = w8;
                    } finally {
                    }
                }
                av8Var.s(false);
            }
            int intValue3 = ((Number) w2).intValue();
            av8Var.d0(1567271480);
            float f5 = ((sz1) gv9Var.get(intValue3)).e ? -20.0f : 4.0f;
            av8Var.s(false);
            p75 p75Var3 = new p75(f5);
            boolean g6 = av8Var.g(L);
            Object O3 = av8Var.O();
            if (g6 || O3 == a99Var) {
                O3 = goh.b(new c24(L, 8));
                av8Var.n0(O3);
            }
            int intValue4 = ((Number) ((cdi) O3).getValue()).intValue();
            av8Var.d0(1567271480);
            float f6 = ((sz1) gv9Var.get(intValue4)).e ? -20.0f : 4.0f;
            av8Var.s(false);
            p75 p75Var4 = new p75(f6);
            boolean g7 = av8Var.g(L);
            Object O4 = av8Var.O();
            if (g7 || O4 == a99Var) {
                O4 = goh.b(new c24(L, 9));
                av8Var.n0(O4);
            }
            av8Var.d0(-1953972046);
            g0i e02 = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new p75(0.4f), 3);
            av8Var.s(false);
            vwj x2 = yso.x(L, p75Var3, p75Var4, e02, q4kVar, av8Var, 196608);
            if (L.i()) {
                av8Var.d0(1666827533);
                av8Var.s(false);
                w3 = t01Var.w();
            } else {
                av8Var.d0(1666573488);
                boolean g8 = av8Var.g(L);
                w3 = av8Var.O();
                if (g8 || w3 == a99Var) {
                    w6 = bea.w();
                    e2 = w6 != null ? w6.e() : null;
                    C = bea.C(w6);
                    try {
                        Object w9 = t01Var.w();
                        bea.K(w6, C, e2);
                        av8Var.n0(w9);
                        w3 = w9;
                    } finally {
                    }
                }
                av8Var.s(false);
            }
            int intValue5 = ((Number) w3).intValue();
            av8Var.d0(-159448793);
            boolean z3 = ((sz1) gv9Var.get(intValue5)).e;
            av8Var.s(false);
            p75 p75Var5 = new p75(56.0f);
            boolean g9 = av8Var.g(L);
            Object O5 = av8Var.O();
            if (g9 || O5 == a99Var) {
                O5 = goh.b(new c24(L, 10));
                av8Var.n0(O5);
            }
            int intValue6 = ((Number) ((cdi) O5).getValue()).intValue();
            av8Var.d0(-159448793);
            boolean z4 = ((sz1) gv9Var.get(intValue6)).e;
            av8Var.s(false);
            p75 p75Var6 = new p75(56.0f);
            boolean g10 = av8Var.g(L);
            Object O6 = av8Var.O();
            if (g10 || O6 == a99Var) {
                O6 = goh.b(new c24(L, 11));
                av8Var.n0(O6);
            }
            av8Var.d0(-1953972046);
            g0i e03 = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new p75(0.4f), 3);
            av8Var.s(false);
            vwj x3 = yso.x(L, p75Var5, p75Var6, e03, q4kVar, av8Var, 196608);
            if (L.i()) {
                av8Var.d0(1666827533);
                av8Var.s(false);
                w4 = t01Var.w();
            } else {
                av8Var.d0(1666573488);
                boolean g11 = av8Var.g(L);
                w4 = av8Var.O();
                if (g11 || w4 == a99Var) {
                    w6 = bea.w();
                    e2 = w6 != null ? w6.e() : null;
                    C = bea.C(w6);
                    try {
                        Object w10 = t01Var.w();
                        bea.K(w6, C, e2);
                        av8Var.n0(w10);
                        w4 = w10;
                    } finally {
                    }
                }
                av8Var.s(false);
            }
            int intValue7 = ((Number) w4).intValue();
            av8Var.d0(683620030);
            float f7 = ((sz1) gv9Var.get(intValue7)).e ? 56.0f : 32.0f;
            av8Var.s(false);
            p75 p75Var7 = new p75(f7);
            boolean g12 = av8Var.g(L);
            Object O7 = av8Var.O();
            if (g12 || O7 == a99Var) {
                O7 = goh.b(new c24(L, 2));
                av8Var.n0(O7);
            }
            int intValue8 = ((Number) ((cdi) O7).getValue()).intValue();
            av8Var.d0(683620030);
            float f8 = ((sz1) gv9Var.get(intValue8)).e ? 56.0f : 32.0f;
            av8Var.s(false);
            p75 p75Var8 = new p75(f8);
            boolean g13 = av8Var.g(L);
            Object O8 = av8Var.O();
            if (g13 || O8 == a99Var) {
                i4 = 3;
                b2 = goh.b(new c24(L, i4));
                av8Var.n0(b2);
            } else {
                b2 = O8;
                i4 = 3;
            }
            av8Var.d0(-1953972046);
            g0i e04 = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new p75(0.4f), i4);
            av8Var.s(false);
            vwj x4 = yso.x(L, p75Var7, p75Var8, e04, q4kVar, av8Var, 196608);
            if (L.i()) {
                av8Var.d0(1666827533);
                av8Var.s(false);
                w5 = t01Var.w();
            } else {
                av8Var.d0(1666573488);
                boolean g14 = av8Var.g(L);
                w5 = av8Var.O();
                if (g14 || w5 == a99Var) {
                    nnh w11 = bea.w();
                    Function1 e3 = w11 != null ? w11.e() : null;
                    nnh C2 = bea.C(w11);
                    try {
                        Object w12 = t01Var.w();
                        bea.K(w11, C2, e3);
                        av8Var.n0(w12);
                        w5 = w12;
                    } catch (Throwable th) {
                        bea.K(w11, C2, e3);
                        throw th;
                    }
                }
                av8Var.s(false);
            }
            int intValue9 = ((Number) w5).intValue();
            av8Var.d0(1354089374);
            float f9 = ((sz1) gv9Var.get(intValue9)).e ? 28.0f : 16.0f;
            av8Var.s(false);
            p75 p75Var9 = new p75(f9);
            boolean g15 = av8Var.g(L);
            Object O9 = av8Var.O();
            if (g15 || O9 == a99Var) {
                O9 = goh.b(new c24(L, 4));
                av8Var.n0(O9);
            }
            int intValue10 = ((Number) ((cdi) O9).getValue()).intValue();
            av8Var.d0(1354089374);
            float f10 = ((sz1) gv9Var.get(intValue10)).e ? 28.0f : 16.0f;
            av8Var.s(false);
            p75 p75Var10 = new p75(f10);
            boolean g16 = av8Var.g(L);
            Object O10 = av8Var.O();
            if (g16 || O10 == a99Var) {
                O10 = goh.b(new c24(L, 5));
                av8Var.n0(O10);
            }
            av8Var.d0(-1953972046);
            g0i e05 = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new p75(0.4f), 3);
            av8Var.s(false);
            e12.a(0, av8Var, n9e.q(wnn.A(bkh.e(bkh.p(rd0.N(xtcVar, ((p75) x.getValue()).a, ((p75) x2.getValue()).a + f3), ((p75) x3.getValue()).a), ((p75) x4.getValue()).a), o7g.a(((p75) yso.x(L, p75Var9, p75Var10, e05, q4kVar, av8Var, 196608).getValue()).a)), lz.D(R.color.n_lv_1, av8Var), oyn.e));
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(i2, f2, f3, xtcVar, i3) { // from class: kuh
                public final /* synthetic */ int b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ xtc e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    fz8.x(gv9.this, this.b, this.c, this.d, this.e, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void y(final gv9 gv9Var, final int i2, final Integer num, final boolean z, final Function1 function1, final Function2 function2, of3 of3Var, int i3) {
        gv9Var.getClass();
        function1.getClass();
        function2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1749413228);
        int i4 = i3 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192) | (av8Var.i(function2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            boolean z2 = (i4 & 14) == 4;
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (z2 || O == obj) {
                Iterator it = gv9Var.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (((sz1) it.next()).e) {
                        break;
                    } else {
                        i5++;
                    }
                }
                O = Integer.valueOf(i5);
                av8Var.n0(O);
            }
            int intValue = ((Number) O).intValue();
            boolean z3 = intValue != -1;
            boolean h2 = av8Var.h(z3);
            Object O2 = av8Var.O();
            if (h2 || O2 == obj) {
                O2 = new p75(z3 ? 84.0f : 56.0f);
                av8Var.n0(O2);
            }
            float f2 = ((p75) O2).a;
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            WeakHashMap weakHashMap = cal.w;
            int i6 = qea.p(av8Var).e.e().d;
            int i7 = qea.p(av8Var).g.e().d;
            int i8 = qea.p(av8Var).i.e().d;
            boolean g2 = av8Var.g(kx4Var) | av8Var.e(i6) | av8Var.e(i7);
            Object O3 = av8Var.O();
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (g2 || O3 == obj) {
                int max = Math.max(i6, Math.max(i7, i8));
                O3 = new p75(max > 0 ? kx4Var.C0(max) : Build.VERSION.SDK_INT <= 29 ? 48.0f : 0.0f);
                av8Var.n0(O3);
            }
            final float f4 = ((p75) O3).a;
            boolean d2 = av8Var.d(f2) | av8Var.d(f4);
            Object O4 = av8Var.O();
            if (d2 || O4 == obj) {
                O4 = new p75(f2 + f4);
                av8Var.n0(O4);
            }
            float f5 = ((p75) O4).a;
            boolean h3 = av8Var.h(z3);
            Object O5 = av8Var.O();
            if (h3 || O5 == obj) {
                if (z3) {
                    float f6 = k53.j;
                    f3 = 28.0f;
                }
                O5 = new p75(f3);
                av8Var.n0(O5);
            }
            final float f7 = ((p75) O5).a;
            boolean e2 = av8Var.e(gv9Var.size()) | av8Var.h(z3) | av8Var.e(intValue);
            Object O6 = av8Var.O();
            if (e2 || O6 == obj) {
                O6 = z3 ? new qh3(intValue, gv9Var.size()) : oyn.e;
                av8Var.n0(O6);
            }
            final uah uahVar = (uah) O6;
            xtc e3 = bkh.e(bkh.d(utc.a, 1.0f), f5);
            Object O7 = av8Var.O();
            if (O7 == obj) {
                O7 = new wth(22);
                av8Var.n0(O7);
            }
            dy0.b(oyn.w(e3, false, null, null, (Function0) O7, 14), null, yqo.H(-996834986, av8Var, new ct8() { // from class: luh
                @Override // defpackage.ct8
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    s22 s22Var = (s22) obj2;
                    of3 of3Var2 = (of3) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    s22Var.getClass();
                    if ((intValue2 & 6) == 0) {
                        intValue2 |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                    }
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                        mv1 mv1Var = uxf.j;
                        utc utcVar = utc.a;
                        float f8 = 1.0f;
                        xtc d3 = bkh.d(s22Var.a(utcVar, mv1Var), 1.0f);
                        float f9 = f4;
                        xtc e4 = bkh.e(d3, 56.0f + f9);
                        long D = lz.D(R.color.surface_P, av8Var2);
                        uah uahVar2 = uahVar;
                        e12.a(0, av8Var2, n9e.q(d2a.E(e4, 16.0f, uahVar2, false, D, 12), lz.D(R.color.surface_P, av8Var2), uahVar2));
                        float c2 = s22Var.c();
                        gv9 gv9Var2 = gv9Var;
                        xtc a2 = s22Var.a(utcVar, uxf.c);
                        int i9 = i2;
                        fz8.x(gv9Var2, i9, c2 / gv9Var2.size(), f7, a2, av8Var2, 0);
                        xtc e5 = bkh.e(l98.f0(bkh.d(s22Var.a(utcVar, mv1Var), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f9, 7), 56.0f);
                        l8g a3 = k8g.a(ww9.h, uxf.m, av8Var2, 54);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m2 = av8Var2.m();
                        xtc C = fqj.C(av8Var2, e5);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a3, hf3.g);
                        waa.K(av8Var2, m2, hf3.f);
                        waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var2, hf3.k);
                        Iterator p2 = ljg.p(av8Var2, C, hf3.d, 959752620, gv9Var2);
                        int i10 = 0;
                        while (p2.hasNext()) {
                            Object next = p2.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                b.q();
                                throw null;
                            }
                            sz1 sz1Var = (sz1) next;
                            int i12 = i9;
                            boolean z4 = i10 == i9;
                            av8Var2.d0(959758900);
                            xtc c3 = bkh.c(new goa(f8, true), f8);
                            boolean z5 = z;
                            Object obj5 = nf3.a;
                            if (!z5) {
                                Function2 function22 = function2;
                                boolean g3 = av8Var2.g(function22) | av8Var2.e(i10);
                                Object O8 = av8Var2.O();
                                if (g3 || O8 == obj5) {
                                    O8 = new muh(i10, 0, function22);
                                    av8Var2.n0(O8);
                                }
                                c3 = c3.z(un0.A(utcVar, (Function1) O8));
                            }
                            xtc xtcVar = c3;
                            av8Var2.s(false);
                            boolean z6 = sz1Var.e;
                            Function1 function12 = function1;
                            if (z6) {
                                av8Var2.d0(-1788951387);
                                boolean g4 = av8Var2.g(function12) | av8Var2.e(i10);
                                Object O9 = av8Var2.O();
                                if (g4 || O9 == obj5) {
                                    O9 = new kj4(i10, 1, function12);
                                    av8Var2.n0(O9);
                                }
                                fz8.w(sz1Var, z4, num, (Function0) O9, xtcVar, av8Var2, 0);
                                av8Var2.s(false);
                            } else {
                                av8Var2.d0(-1788624523);
                                boolean g5 = av8Var2.g(function12) | av8Var2.e(i10);
                                Object O10 = av8Var2.O();
                                if (g5 || O10 == obj5) {
                                    O10 = new kj4(i10, 2, function12);
                                    av8Var2.n0(O10);
                                }
                                av8 av8Var3 = av8Var2;
                                fz8.z(sz1Var, z4, (Function0) O10, xtcVar, av8Var3, 0);
                                av8Var2 = av8Var3;
                                av8Var2.s(false);
                            }
                            i9 = i12;
                            i10 = i11;
                            f8 = 1.0f;
                        }
                        av8Var2.s(false);
                        av8Var2.s(true);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 3072, 6);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ki4(gv9Var, i2, num, z, function1, function2, i3);
        }
    }

    public static final void z(sz1 sz1Var, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(422818434);
        int i3 = i2 | (av8Var.g(sz1Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            long D = lz.D(R.color.surface_1, av8Var);
            long D2 = lz.D(R.color.n_lv_2, av8Var);
            long D3 = lz.D(R.color.n_lv_1, av8Var);
            if (!z) {
                D = D2;
            }
            cdi a2 = wih.a(D, null, "iconTint", av8Var, 384, 10);
            cdi a3 = wih.a(z ? D3 : D2, null, "textColor", av8Var, 384, 10);
            Object[] objArr = new Object[0];
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new wth(23);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, av8Var, 48);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            xtc d0 = l98.d0(bkh.c(xtcVar, 1.0f), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            long D4 = lz.D(R.color.n_lv_4, av8Var);
            Object[] objArr2 = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = nuh.b;
                av8Var.n0(O3);
            }
            xtc y = tol.y(d0, true, true, false, D4, wzcVar, new cyg((boh) o3a.N(objArr2, (Function0) O3, av8Var, 48), sz1Var, function0, e1dVar), av8Var, 0);
            mv1 mv1Var = uxf.j;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            mv1 mv1Var2 = uxf.g;
            n12 n12Var = n12.a;
            utc utcVar = utc.a;
            xtc p2 = bkh.p(bkh.e(l98.f0(n12Var.a(utcVar, mv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, 7), 32.0f), 56.0f);
            k1c c3 = e12.c(mv1Var2, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, p2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            e12.a(0, av8Var, f1a.a(wnn.A(n12Var.b(utcVar), o7g.a(16.0f)), wzcVar, n5g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, lz.D(R.color.n_lv_1, av8Var), false)));
            xtc l2 = bkh.l(utcVar, 24.0f);
            k1c c4 = e12.c(uxf.c, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, l2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            wnn.d(Integer.valueOf(z ? sz1Var.c : sz1Var.d), null, null, "iconFade", yqo.H(107599121, av8Var, new hl6(9, sz1Var, a2)), av8Var, 27648, 6);
            av8Var.d0(-1768657289);
            av8Var.s(false);
            av8Var.s(true);
            av8Var.s(true);
            String str = sz1Var.b;
            long j2 = ((r13) a3.getValue()).a;
            yf8 yf8Var = xth.a;
            udj.c(str, l98.f0(n12Var.a(utcVar, uxf.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 38.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 109560);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new p81(sz1Var, z, function0, xtcVar, i2, 19);
        }
    }
}
