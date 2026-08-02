package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Base64;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.b;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.league.LeagueActivity;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a99 implements u02, lkk, lx2, oic, gsk, zzqp, zzyh, qp0, op3, jr8, puk, ii9, f7h, im9, fb9 {
    public static final a99 b = new a99(1);
    public static final a99 c = new a99(2);
    public static final a99 d = new a99(3);
    public static final a99 e = new a99(4);
    public static final a99 f = new a99(5);
    public static final a99 g = new a99(6);
    public static final byte[] h = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    public static final a99 i = new a99(8);
    public static final a99 j = new a99(9);
    public static final a99 k = new a99(10);
    public static final a99 l = new a99(11);
    public static final a99 m = new a99(12);
    public static final a99 n = new a99(13);
    public static final a99 o = new a99(14);
    public final /* synthetic */ int a;

    public /* synthetic */ a99(int i2) {
        this.a = i2;
    }

    public static void A(a99 a99Var, Context context, Integer num, Integer num2, Integer num3, y4b y4bVar, Integer num4, String str, int i2) {
        boj bojVar = boj.PLAYERS;
        Integer num5 = (i2 & 8) != 0 ? null : num3;
        y4b y4bVar2 = (i2 & 32) != 0 ? null : y4bVar;
        boj bojVar2 = (i2 & 64) != 0 ? null : bojVar;
        Integer num6 = (i2 & 128) != 0 ? null : num4;
        boolean z = (i2 & 512) == 0;
        String str2 = (i2 & a.o) != 0 ? null : str;
        context.getClass();
        context.startActivity(x(a99Var, context, num, num2, num5, null, y4bVar2, false, z, null, bojVar2, num6, str2, null, 4096));
    }

    public static n9j s(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, wej wejVar, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, of3 of3Var, int i2, int i3, int i4) {
        long j40 = (i3 & 8) != 0 ? r13.i : j5;
        long j41 = (i3 & 64) != 0 ? r13.i : j8;
        long j42 = (i3 & 128) != 0 ? r13.i : j9;
        long j43 = (i3 & 512) != 0 ? r13.i : j11;
        wej wejVar2 = (i3 & 1024) != 0 ? null : wejVar;
        long j44 = (i3 & 8192) != 0 ? r13.i : j14;
        long j45 = (i3 & 16384) != 0 ? r13.i : j15;
        long j46 = (32768 & i3) != 0 ? r13.i : j16;
        long j47 = (65536 & i3) != 0 ? r13.i : j17;
        long j48 = (131072 & i3) != 0 ? r13.i : j18;
        long j49 = (262144 & i3) != 0 ? r13.i : j19;
        long j50 = (524288 & i3) != 0 ? r13.i : j20;
        long j51 = (1048576 & i3) != 0 ? r13.i : j21;
        long j52 = (2097152 & i3) != 0 ? r13.i : j22;
        long j53 = (4194304 & i3) != 0 ? r13.i : j23;
        long j54 = (33554432 & i3) != 0 ? r13.i : j26;
        long j55 = (67108864 & i3) != 0 ? r13.i : j27;
        long j56 = (134217728 & i3) != 0 ? r13.i : j28;
        long j57 = (268435456 & i3) != 0 ? r13.i : j29;
        long j58 = (536870912 & i3) != 0 ? r13.i : j30;
        long j59 = (i3 & 1073741824) != 0 ? r13.i : j31;
        long j60 = r13.i;
        return w((g23) ((av8) of3Var).k(i23.a), of3Var).a(j2, j3, j4, j40, j6, j7, j41, j42, j10, j43, wejVar2, j12, j13, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j24, j25, j54, j55, j56, j57, j58, j59, j60, j60, j60, j60, (i4 & 16) != 0 ? j60 : j32, (i4 & 32) != 0 ? j60 : j33, (i4 & 64) != 0 ? j60 : j34, (i4 & 128) != 0 ? j60 : j35, (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? j60 : j36, (i4 & 512) != 0 ? j60 : j37, (i4 & 1024) != 0 ? j60 : j38, (i4 & a.o) != 0 ? j60 : j39);
    }

    public static ByteArrayInputStream u(String str) {
        if (!str.startsWith("data:image")) {
            a70.p("Not a valid image data URL.");
            return null;
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            a70.p("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, indexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
        }
        a70.p("Not a base64 image data URL.");
        return null;
    }

    public static i08 v(String str) {
        Object obj;
        Iterator<E> it = i08.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((i08) obj).a.equals(str)) {
                break;
            }
        }
        return (i08) obj;
    }

    public static n9j w(g23 g23Var, of3 of3Var) {
        n9j n9jVar = g23Var.f0;
        if (n9jVar == null) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(390452338);
            av8Var.s(false);
            n9jVar = null;
        } else {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(390452339);
            wej wejVar = (wej) av8Var2.k(xej.a);
            if (!Intrinsics.c(n9jVar.k, wejVar)) {
                n9jVar = n9jVar.a(n9jVar.a, n9jVar.b, n9jVar.c, n9jVar.d, n9jVar.e, n9jVar.f, n9jVar.g, n9jVar.h, n9jVar.i, n9jVar.j, wejVar, n9jVar.l, n9jVar.m, n9jVar.n, n9jVar.o, n9jVar.p, n9jVar.q, n9jVar.r, n9jVar.s, n9jVar.t, n9jVar.u, n9jVar.v, n9jVar.w, n9jVar.x, n9jVar.y, n9jVar.z, n9jVar.A, n9jVar.B, n9jVar.C, n9jVar.D, n9jVar.E, n9jVar.F, n9jVar.G, n9jVar.H, n9jVar.I, n9jVar.J, n9jVar.K, n9jVar.L, n9jVar.M, n9jVar.N, n9jVar.O, n9jVar.P, n9jVar.Q);
                g23Var.f0 = n9jVar;
            }
            av8Var2.s(false);
        }
        if (n9jVar != null) {
            av8 av8Var3 = (av8) of3Var;
            av8Var3.d0(-1788515437);
            av8Var3.s(false);
            return n9jVar;
        }
        av8 av8Var4 = (av8) of3Var;
        av8Var4.d0(-1788321191);
        long c2 = i23.c(g23Var, xxd.p);
        long c3 = i23.c(g23Var, xxd.v);
        h23 h23Var = xxd.c;
        long c4 = r13.c(i23.c(g23Var, h23Var), 0.38f);
        long c5 = i23.c(g23Var, xxd.j);
        long j2 = r13.h;
        long c6 = i23.c(g23Var, xxd.a);
        long c7 = i23.c(g23Var, xxd.i);
        wej wejVar2 = (wej) av8Var4.k(xej.a);
        long c8 = i23.c(g23Var, xxd.s);
        long c9 = i23.c(g23Var, xxd.B);
        long c10 = r13.c(i23.c(g23Var, xxd.f), 0.12f);
        long c11 = i23.c(g23Var, xxd.m);
        long c12 = i23.c(g23Var, xxd.r);
        long c13 = i23.c(g23Var, xxd.A);
        long c14 = r13.c(i23.c(g23Var, xxd.e), 0.38f);
        long c15 = i23.c(g23Var, xxd.l);
        long c16 = i23.c(g23Var, xxd.u);
        long c17 = i23.c(g23Var, xxd.D);
        long c18 = r13.c(i23.c(g23Var, xxd.h), 0.38f);
        long c19 = i23.c(g23Var, xxd.o);
        long c20 = i23.c(g23Var, xxd.q);
        long c21 = i23.c(g23Var, xxd.z);
        long c22 = r13.c(i23.c(g23Var, xxd.d), 0.38f);
        long c23 = i23.c(g23Var, xxd.k);
        h23 h23Var2 = xxd.w;
        long c24 = i23.c(g23Var, h23Var2);
        long c25 = i23.c(g23Var, h23Var2);
        long c26 = r13.c(i23.c(g23Var, h23Var), 0.38f);
        long c27 = i23.c(g23Var, h23Var2);
        long c28 = i23.c(g23Var, xxd.t);
        long c29 = i23.c(g23Var, xxd.C);
        long c30 = r13.c(i23.c(g23Var, xxd.g), 0.38f);
        long c31 = i23.c(g23Var, xxd.n);
        h23 h23Var3 = xxd.x;
        long c32 = i23.c(g23Var, h23Var3);
        long c33 = i23.c(g23Var, h23Var3);
        long c34 = r13.c(i23.c(g23Var, h23Var3), 0.38f);
        long c35 = i23.c(g23Var, h23Var3);
        h23 h23Var4 = xxd.y;
        n9j n9jVar2 = new n9j(c2, c3, c4, c5, j2, j2, j2, j2, c6, c7, wejVar2, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, c34, c35, i23.c(g23Var, h23Var4), i23.c(g23Var, h23Var4), r13.c(i23.c(g23Var, h23Var4), 0.38f), i23.c(g23Var, h23Var4));
        g23Var.f0 = n9jVar2;
        av8Var4.s(false);
        return n9jVar2;
    }

    public static Intent x(a99 a99Var, Context context, Integer num, Integer num2, Integer num3, Integer num4, y4b y4bVar, boolean z, boolean z2, Intent intent, boj bojVar, Integer num5, String str, String str2, int i2) {
        Integer num6 = (i2 & 8) != 0 ? null : num3;
        Integer num7 = (i2 & 16) != 0 ? null : num4;
        y4b y4bVar2 = (i2 & 32) != 0 ? null : y4bVar;
        boolean z3 = (i2 & 64) != 0 ? false : z;
        boolean z4 = (i2 & 128) == 0 ? z2 : false;
        Intent intent2 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : intent;
        boj bojVar2 = (i2 & 512) != 0 ? null : bojVar;
        Integer num8 = (i2 & 1024) != 0 ? null : num5;
        String str3 = (i2 & a.o) != 0 ? null : str;
        String str4 = (i2 & 4096) != 0 ? null : str2;
        context.getClass();
        Intent intent3 = new Intent(context, (Class<?>) LeagueActivity.class);
        if (intent2 != null) {
            intent3.putExtras(intent2);
        }
        if (num != null) {
            intent3.putExtra("UNIQUE_TOURNAMENT_ID", num.intValue());
        }
        if (num2 != null) {
            intent3.putExtra("TOURNAMENT_ID", num2.intValue());
        }
        if (num6 != null) {
            intent3.putExtra("SEASON_ID", num6.intValue());
        }
        if (num7 != null) {
            intent3.putExtra("TEAM_OF_THE_PERIOD_ID", num7.intValue());
        }
        intent3.putExtra("initialTab", y4bVar2);
        intent3.putExtra("POSITION_ON_MEDIA", z3);
        intent3.putExtra("POSITION_ON_TEAM_OF_THE_WEEK", z4);
        intent3.putExtra("initialTopStatsType", bojVar2);
        intent3.putExtra("initialFilter", num8);
        intent3.putExtra("positionOnGroup", str3);
        if (str4 != null) {
            intent3.putExtra(MBInterstitialActivity.INTENT_CAMAPIGN, str4);
        }
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent3.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent3.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent3;
    }

    public static int y(int i2) {
        switch (i2) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                ilg.c();
                return 0;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    public boolean B(b bVar) {
        String str = bVar.o;
        return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.gsk
    public Function0 a(a3 a3Var) {
        if (!a3Var.isAttachedToWindow()) {
            fsf fsfVar = new fsf();
            a16 a16Var = new a16(a3Var, 10, fsfVar);
            a3Var.addOnAttachStateChangeListener(a16Var);
            fsfVar.a = new ilj(8, a3Var, a16Var);
            return new s2j(fsfVar, 19);
        }
        u6b w = qha.w(a3Var);
        if (w != null) {
            return tba.F(a3Var, w.getLifecycle());
        }
        r3a.c("View tree for " + a3Var + " has no ViewTreeLifecycleOwner");
        pvd.x();
        return null;
    }

    @Override // defpackage.im9
    public bjb c(String str) {
        return t2d.a;
    }

    @Override // defpackage.oic
    public byte[] d(Object obj) {
        byte[] bytes = ((String) obj).getBytes(xp2.c);
        int i2 = 0;
        while (i2 < bytes.length) {
            byte b2 = bytes[i2];
            if (b2 < 32 || b2 >= 126 || b2 == 37) {
                byte[] bArr = new byte[((bytes.length - i2) * 3) + i2];
                if (i2 != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i2);
                }
                int i3 = i2;
                while (i2 < bytes.length) {
                    byte b3 = bytes[i2];
                    if (b3 < 32 || b3 >= 126 || b3 == 37) {
                        bArr[i3] = 37;
                        byte[] bArr2 = h;
                        bArr[i3 + 1] = bArr2[(b3 >> 4) & 15];
                        bArr[i3 + 2] = bArr2[b3 & 15];
                        i3 += 3;
                    } else {
                        bArr[i3] = b3;
                        i3++;
                    }
                    i2++;
                }
                return Arrays.copyOf(bArr, i3);
            }
            i2++;
        }
        return bytes;
    }

    @Override // defpackage.op3
    public long e(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        int i2 = mrg.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.u02
    public Rect f(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            invoke.getClass();
            return new Rect((Rect) invoke);
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            u02.h7.getClass();
            return ug5.a.f(activity);
        }
    }

    @Override // defpackage.ii9
    public pm0 getKey() {
        return tk9.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lx2
    public void h(vh9 vh9Var, hoi hoiVar) {
        vh9Var.e.f(rj9.j, new bx((et8) hoiVar, (rq3) null, 7));
    }

    @Override // defpackage.lkk
    public Object i(wga wgaVar, float f2) {
        return Float.valueOf(nha.d(wgaVar) * f2);
    }

    @Override // defpackage.puk
    public void j(View view, float f2) {
        view.setTranslationX((-f2) * view.getWidth());
        if (f2 < -1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setAlpha(1.0f);
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setRotationY(Math.abs(f2) * 90.0f);
        } else {
            if (f2 > 1.0f) {
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            view.setAlpha(1.0f);
            view.setPivotX(view.getWidth());
            view.setRotationY(Math.abs(f2) * (-90.0f));
        }
    }

    @Override // defpackage.ii9
    public void k(Object obj, vh9 vh9Var) {
        tk9 tk9Var = (tk9) obj;
        tk9Var.getClass();
        vh9Var.e.f(rj9.m, new c37(tk9Var, vh9Var, null, 7));
    }

    @Override // defpackage.ii9
    public Object l(Function1 function1) {
        function1.getClass();
        function1.invoke(new ug5());
        return new tk9();
    }

    @Override // defpackage.qp0
    public qzf m(v7g v7gVar, d2g d2gVar) {
        return null;
    }

    @Override // defpackage.f7h
    public boolean n(Object obj) {
        ((urb) obj).getClass();
        return true;
    }

    @Override // defpackage.f7h
    public int o(Object obj) {
        ((hod) ((urb) obj)).getClass();
        try {
            Class.forName("android.app.Application", false, hod.class.getClassLoader());
            return 8;
        } catch (Exception unused) {
            return 3;
        }
    }

    @Override // defpackage.oic
    public Object p(byte[] bArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            if (b2 < 32 || b2 >= 126 || (b2 == 37 && i2 + 2 < bArr.length)) {
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] == 37 && i3 + 2 < bArr.length) {
                        try {
                            allocate.put((byte) Integer.parseInt(new String(bArr, i3 + 1, 2, xp2.a), 16));
                            i3 += 3;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    allocate.put(bArr[i3]);
                    i3++;
                }
                return new String(allocate.array(), 0, allocate.position(), xp2.c);
            }
        }
        return new String(bArr, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x006a  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(final boolean z, final boolean z2, final wzc wzcVar, xtc xtcVar, final n9j n9jVar, final uah uahVar, float f2, float f3, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        int i4;
        float f4;
        float f5;
        av8 av8Var;
        final xtc xtcVar3;
        final float f6;
        final float f7;
        eqf u;
        boolean z3;
        bwc bwcVar;
        ?? r0;
        cdi g2;
        av8 av8Var2;
        cdi g3;
        av8 av8Var3;
        int i5;
        int i6;
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(1035477640);
        int i7 = (av8Var4.h(z) ? 4 : 2) | i2 | (av8Var4.h(z2) ? 32 : 16) | (av8Var4.g(wzcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            xtcVar2 = xtcVar;
            i7 |= av8Var4.g(xtcVar2) ? a.o : 1024;
            i4 = i7 | (!av8Var4.g(n9jVar) ? 16384 : 8192) | (!av8Var4.g(uahVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    f4 = f2;
                    if (av8Var4.d(f4)) {
                        i6 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i4 |= i6;
                    }
                } else {
                    f4 = f2;
                }
                i6 = 524288;
                i4 |= i6;
            } else {
                f4 = f2;
            }
            if ((12582912 & i2) != 0) {
                if ((i3 & 128) == 0) {
                    f5 = f3;
                    if (av8Var4.d(f5)) {
                        i5 = 8388608;
                        i4 |= i5;
                    }
                } else {
                    f5 = f3;
                }
                i5 = 4194304;
                i4 |= i5;
            } else {
                f5 = f3;
            }
            if (av8Var4.T(i4 & 1, (38347923 & i4) == 38347922)) {
                av8Var = av8Var4;
                av8Var.W();
                xtcVar3 = xtcVar2;
                f6 = f4;
                f7 = f5;
            } else {
                av8Var4.Y();
                if ((i2 & 1) == 0 || av8Var4.B()) {
                    xtcVar3 = i8 != 0 ? utc.a : xtcVar2;
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        f6 = 2.0f;
                    } else {
                        f6 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        f7 = 1.0f;
                        av8Var4.t();
                        boolean booleanValue = ((Boolean) xw3.z(wzcVar, av8Var4, (i4 >> 6) & 14).getValue()).booleanValue();
                        long c2 = n9jVar.c(z, z2, booleanValue);
                        bwc bwcVar2 = bwc.d;
                        g0i I = ufa.I(bwcVar2, av8Var4);
                        if (z) {
                            z3 = booleanValue;
                            bwcVar = bwcVar2;
                            av8 av8Var5 = av8Var4;
                            r0 = 0;
                            av8Var5.d0(-1674427244);
                            g2 = e.g(new r13(c2), av8Var5);
                            av8Var5.s(false);
                            av8Var2 = av8Var5;
                        } else {
                            z3 = booleanValue;
                            av8Var4.d0(-1674507999);
                            bwcVar = bwcVar2;
                            r0 = 0;
                            g2 = wih.a(c2, I, null, av8Var4, 0, 12);
                            av8 av8Var6 = av8Var4;
                            av8Var6.s(false);
                            av8Var2 = av8Var6;
                        }
                        cdi cdiVar = g2;
                        g0i I2 = ufa.I(bwc.b, av8Var2);
                        if (z) {
                            av8Var2.d0(-1674063769);
                            g3 = e.g(new p75(f7), av8Var2);
                            av8Var2.s(r0);
                            av8Var3 = av8Var2;
                        } else {
                            av8Var2.d0(-1674245832);
                            of3 of3Var2 = av8Var2;
                            g3 = a60.a(z3 ? f6 : f7, I2, null, null, of3Var2, 0, 12);
                            av8 av8Var7 = of3Var2;
                            av8Var7.s(r0);
                            av8Var3 = av8Var7;
                        }
                        e1d g4 = e.g(fcp.H(((r13) cdiVar.getValue()).a, ((p75) g3.getValue()).a), av8Var3);
                        av8 av8Var8 = av8Var3;
                        cdi a = wih.a(z ? n9jVar.g : z2 ? n9jVar.h : z3 ? n9jVar.e : n9jVar.f, ufa.I(bwcVar, av8Var3), null, av8Var8, 0, 12);
                        av8Var = av8Var8;
                        qz1 qz1Var = (qz1) g4.getValue();
                        e12.a(r0, av8Var, td4.Y(yso.p(xtcVar3, qz1Var.a, qz1Var.b, uahVar), new dvi(13, uahVar, new eaj(new apa(0, 4, cdi.class, a, U3.i.X, "getValue()Ljava/lang/Object;")))));
                    }
                } else {
                    av8Var4.W();
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    xtcVar3 = xtcVar2;
                    f6 = f4;
                }
                f7 = f5;
                av8Var4.t();
                boolean booleanValue2 = ((Boolean) xw3.z(wzcVar, av8Var4, (i4 >> 6) & 14).getValue()).booleanValue();
                long c22 = n9jVar.c(z, z2, booleanValue2);
                bwc bwcVar22 = bwc.d;
                g0i I3 = ufa.I(bwcVar22, av8Var4);
                if (z) {
                }
                cdi cdiVar2 = g2;
                g0i I22 = ufa.I(bwc.b, av8Var2);
                if (z) {
                }
                e1d g42 = e.g(fcp.H(((r13) cdiVar2.getValue()).a, ((p75) g3.getValue()).a), av8Var3);
                av8 av8Var82 = av8Var3;
                cdi a2 = wih.a(z ? n9jVar.g : z2 ? n9jVar.h : z3 ? n9jVar.e : n9jVar.f, ufa.I(bwcVar, av8Var3), null, av8Var82, 0, 12);
                av8Var = av8Var82;
                qz1 qz1Var2 = (qz1) g42.getValue();
                e12.a(r0, av8Var, td4.Y(yso.p(xtcVar3, qz1Var2.a, qz1Var2.b, uahVar), new dvi(13, uahVar, new eaj(new apa(0, 4, cdi.class, a2, U3.i.X, "getValue()Ljava/lang/Object;")))));
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: lxd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a99.this.q(z, z2, wzcVar, xtcVar3, n9jVar, uahVar, f6, f7, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        i4 = i7 | (!av8Var4.g(n9jVar) ? 16384 : 8192) | (!av8Var4.g(uahVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if ((1572864 & i2) != 0) {
        }
        if ((12582912 & i2) != 0) {
        }
        if (av8Var4.T(i4 & 1, (38347923 & i4) == 38347922)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public void r(final String str, final Function2 function2, final boolean z, final boolean z2, final jwk jwkVar, final wzc wzcVar, final boolean z3, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final Function2 function26, final n9j n9jVar, p3e p3eVar, final tc3 tc3Var, of3 of3Var, final int i2) {
        int i3;
        boolean z4;
        boolean z5;
        av8 av8Var;
        final p3e p3eVar2;
        p3e t3eVar;
        int i4;
        tc3 tc3Var2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1732281618);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z4 = z;
            i3 |= av8Var2.h(z4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            z4 = z;
        }
        int i5 = i2 & 3072;
        int i6 = a.o;
        if (i5 == 0) {
            z5 = z2;
            i3 |= av8Var2.h(z5) ? 2048 : 1024;
        } else {
            z5 = z2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.g(jwkVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var2.g(wzcVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= av8Var2.h(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= av8Var2.i(function22) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= av8Var2.i(function23) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= av8Var2.i(function24) ? 536870912 : 268435456;
        }
        int i7 = 14155776 | (av8Var2.i(function25) ? 4 : 2) | (av8Var2.i(null) ? 32 : 16) | (av8Var2.i(null) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (!av8Var2.i(function26)) {
            i6 = 1024;
        }
        int i8 = i7 | i6 | (av8Var2.g(n9jVar) ? 16384 : 8192) | C.DEFAULT_BUFFER_SEGMENT_SIZE;
        if (av8Var2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i8 & 4793491) == 4793490) ? false : true)) {
            av8Var2.Y();
            if ((i2 & 1) == 0 || av8Var2.B()) {
                t3eVar = new t3e(16.0f, 16.0f, 16.0f, 16.0f);
                i4 = i8 & (-458753);
            } else {
                av8Var2.W();
                i4 = i8 & (-458753);
                t3eVar = p3eVar;
            }
            av8Var2.t();
            int i9 = i4;
            boolean z6 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object O = av8Var2.O();
            if (z6 || O == nf3.a) {
                O = jwkVar.a(new q80(str));
                av8Var2.n0(O);
            }
            String str2 = ((gwj) O).a.b;
            vcj vcjVar = vcj.b;
            uaj uajVar = new uaj();
            if (function22 == null) {
                av8Var2.d0(1927058812);
                av8Var2.s(false);
                tc3Var2 = null;
            } else {
                av8Var2.d0(1927058813);
                tc3 H = yqo.H(-1459717586, av8Var2, new g31(function22, 4));
                av8Var2.s(false);
                tc3Var2 = H;
            }
            int i10 = i3 >> 9;
            int i11 = i9 << 21;
            av8Var = av8Var2;
            qha.a(vcjVar, str2, function2, uajVar, tc3Var2, function23, function24, function25, function26, z5, z4, z3, wzcVar, t3eVar, n9jVar, tc3Var, av8Var, ((i3 << 3) & 896) | 6 | (i10 & 458752) | (i10 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i3 & 896) | ((i9 >> 9) & 14) | ((i3 >> 6) & 112) | (i10 & 7168) | ((i3 >> 3) & 57344) | ((i9 << 6) & 3670016) | 12582912);
            p3eVar2 = t3eVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            p3eVar2 = p3eVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: mxd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i2 | 1);
                    a99.this.r(str, function2, z, z2, jwkVar, wzcVar, z3, function22, function23, function24, function25, function26, n9jVar, p3eVar2, tc3Var, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public v7a t(b bVar) {
        int i2;
        int i3;
        String str = bVar.o;
        if (str != null) {
            i2 = 1;
            i3 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new ce0(i3);
                case "application/x-icy":
                    return new rq9();
                case "application/id3":
                    return new xq9(null);
                case "application/x-emsg":
                    return new ce0(i2);
                case "application/x-scte35":
                    return new ayh();
            }
        }
        a70.p(dmi.q("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 18:
                return "Empty";
            default:
                return super.toString();
        }
    }

    public void z(Context context, Tournament tournament) {
        context.getClass();
        tournament.getClass();
        UniqueTournament uniqueTournament = tournament.getUniqueTournament();
        Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
        Integer valueOf2 = Integer.valueOf(tournament.getId());
        Season season = tournament.getSeason();
        A(this, context, valueOf, valueOf2, season != null ? Integer.valueOf(season.getId()) : null, null, null, null, 4080);
    }

    @Override // defpackage.jr8
    public void b(FragmentActivity fragmentActivity) {
    }

    @Override // defpackage.fb9
    public void g(vvk vvkVar) {
    }
}
