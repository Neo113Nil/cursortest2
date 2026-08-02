package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.icu.text.MessageFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import com.sofascore.model.fantasy.FantasyLeagueType;
import com.sofascore.model.fantasy.FantasyPlayerFixture;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.shared.FantasyRoundPlayerInfo;
import com.sofascore.results.fantasy.shared.FantasyWorker;
import com.sofascore.results.fantasy.ui.model.BasicTournamentInfo;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class hkg {
    public static Context a = null;
    public static Object b = null;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static Handler f;
    public static jod g;
    public static jod i;
    public static final /* synthetic */ int v = 0;
    public static final /* synthetic */ int w = 0;
    public static final /* synthetic */ int x = 0;
    public static final /* synthetic */ int y = 0;
    public static final Object h = new Object();
    public static final Object j = new Object();
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final tc3 l = new tc3(196628343, new pr1(3), false);
    public static final tc3 m = new tc3(318475929, new qd3(4), false);
    public static final tc3 n = new tc3(1547100534, new qd3(5), false);
    public static final Object o = new Object();
    public static final gfg p = new gfg(11);
    public static final sc6 q = new sc6(20);
    public static final byte[] r = {0, 0, 0, 1};
    public static final float[] s = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object t = new Object();
    public static int[] u = new int[10];

    public static final FantasyRoundPlayerUiModel A(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        fantasyRoundPlayerUiModel.getClass();
        return FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel, null, 0, false, false, false, null, null, 536870891);
    }

    public static final long B(long j2, long j3) {
        float f2;
        float f3;
        long b2 = r13.b(j2, r13.f(j3));
        float d2 = r13.d(j3);
        float d3 = r13.d(b2);
        float f4 = 1.0f - d3;
        float f5 = (d2 * f4) + d3;
        float h2 = r13.h(b2);
        float h3 = r13.h(j3);
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        } else {
            f2 = (((h3 * d2) * f4) + (h2 * d3)) / f5;
        }
        float g2 = r13.g(b2);
        float g3 = r13.g(j3);
        if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = 0.0f;
        } else {
            f3 = (((g3 * d2) * f4) + (g2 * d3)) / f5;
        }
        float e2 = r13.e(b2);
        float e3 = r13.e(j3);
        if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f6 = (((e3 * d2) * f4) + (e2 * d3)) / f5;
        }
        return q(f2, f3, f6, f5, r13.f(j3));
    }

    public static final void C(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
        ClipData newPlainText = ClipData.newPlainText(str2, str);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
    }

    public static final za9 D(Context context, qtk qtkVar) {
        context.getClass();
        qtkVar.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                gc4 gc4Var = (gc4) ((xa9) fz8.Q(xa9.class, (ComponentActivity) context));
                return new za9(gc4Var.a(), qtkVar, new z41(21, gc4Var.a, gc4Var.b));
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        yhk.r(context, "Expected an activity context for creating a HiltViewModelFactory but instead found: ");
        return null;
    }

    public static final z88 E(z88 z88Var, long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? z88Var : F(z88Var, new yz(j2, 26));
        }
        a70.p("Debounce timeout should not be negative");
        return null;
    }

    public static final wf2 F(z88 z88Var, Function1 function1) {
        return new wf2(new q98(function1, z88Var, null), 3);
    }

    public static final void G(rq3 rq3Var, Throwable th) {
        if (th instanceof q45) {
            th = ((q45) th).a;
        }
        p2g p2gVar = w2g.b;
        rq3Var.resumeWith(new u2g(th));
        throw th;
    }

    public static final z88 H(z88 z88Var) {
        return z88Var instanceof ddi ? z88Var : I(z88Var, p, q);
    }

    public static final y55 I(z88 z88Var, Function1 function1, Function2 function2) {
        if (z88Var instanceof y55) {
            y55 y55Var = (y55) z88Var;
            if (y55Var.b == function1 && y55Var.c == function2) {
                return y55Var;
            }
        }
        return new y55(z88Var, function1, function2);
    }

    public static final xtc J() {
        return bkh.r(bkh.c, null, 3);
    }

    public static final FragmentActivity K(Context context) {
        context.getClass();
        while (!(context instanceof FragmentActivity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        return (FragmentActivity) context;
    }

    public static int L(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        qx9.t(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            z(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            z(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            z(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    z(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static final FragmentActivity O(Context context) {
        context.getClass();
        return K(context);
    }

    public static Object P(Future future) {
        Object obj;
        z1a.C(future, "Future was expected to be done: %s", future.isDone());
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final String Q(Context context, int i2, Gender gender, Object[] objArr) {
        context.getClass();
        objArr.getClass();
        try {
            String string = context.getString(i2);
            if (gender == null) {
                gender = Gender.Male;
            }
            String format = MessageFormat.format(string, (Map<String, Object>) sub.d(new Pair(InneractiveMediationDefs.KEY_GENDER, gender.getValue())));
            if (objArr.length != 0) {
                format.getClass();
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                format = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            }
            format.getClass();
            return format;
        } catch (Exception e2) {
            s38.a().c(e2);
            return "";
        }
    }

    public static final LayoutInflater S(Context context) {
        context.getClass();
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        return from;
    }

    public static Handler T() {
        Handler handler = f;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        f = handler2;
        return handler2;
    }

    public static final long U(int i2, of3 of3Var, boolean z, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (z) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(1254719043);
            if ((i2 != 2) ^ z2) {
                i5 = -790807823;
                i6 = R.color.home_primary;
            } else {
                i5 = -790807110;
                i6 = R.color.home_primary_highlight;
            }
            long f2 = ljg.f(av8Var, i5, i6, av8Var, false);
            av8Var.s(false);
            return f2;
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(1254818243);
        if ((i2 != 1) ^ z2) {
            i3 = -790804623;
            i4 = R.color.away_primary;
        } else {
            i3 = -790803910;
            i4 = R.color.away_primary_highlight;
        }
        long f3 = ljg.f(av8Var2, i3, i4, av8Var2, false);
        av8Var2.s(false);
        return f3;
    }

    public static jod V() {
        jod jodVar;
        synchronized (h) {
            try {
                jodVar = g;
                if (jodVar == null) {
                    iod iodVar = new iod();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    iodVar.c(10L, timeUnit);
                    iodVar.A = yol.b("timeout", 10L, timeUnit);
                    iodVar.d(30L, timeUnit);
                    dlg dlgVar = dlg.d;
                    dlgVar.getClass();
                    iodVar.k = dlgVar;
                    iodVar.d.add(new kh2(5));
                    jod jodVar2 = new jod(iodVar);
                    g = jodVar2;
                    jodVar = jodVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jodVar;
    }

    public static jod W() {
        jod jodVar;
        synchronized (j) {
            try {
                jodVar = i;
                if (jodVar == null) {
                    iod iodVar = new iod();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    iodVar.c(10L, timeUnit);
                    iodVar.A = yol.b("timeout", 10L, timeUnit);
                    iodVar.d(30L, timeUnit);
                    iodVar.d.add(new kh2(6));
                    jod jodVar2 = new jod(iodVar);
                    i = jodVar2;
                    jodVar = jodVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jodVar;
    }

    public static final int X(Context context) {
        Resources.Theme theme;
        TypedValue typedValue = new TypedValue();
        if (context == null || (theme = context.getTheme()) == null || !theme.resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return 0;
        }
        return typedValue.data;
    }

    public static final Typeface Y(int i2, Context context) {
        context.getClass();
        try {
            return z1g.a(i2, context);
        } catch (Exception unused) {
            return Typeface.DEFAULT;
        }
    }

    public static xtc Z(xtc xtcVar, qug qugVar, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return q0(xtcVar, qugVar, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f2, float f3, float f4, float f5, j23 j23Var) {
        int i2;
        int i3;
        int i4;
        float b2;
        float a2;
        int i5;
        int i6;
        int i7;
        int i8;
        float b3;
        float a3;
        int i9;
        int i10;
        int i11;
        boolean c2 = j23Var.c();
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (c2) {
            float f7 = f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i12 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i13 = i12 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i14 = i13 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f6 = f4;
            }
            float f10 = f6 <= 1.0f ? f6 : 1.0f;
            d8k d8kVar = e8k.b;
            long j2 = (i14 | ((int) ((f10 * 255.0f) + 0.5f))) << 32;
            int i15 = r13.j;
            return j2;
        }
        if (((int) (j23Var.b >> 32)) != 3) {
            q3a.a("Color only works with ColorSpaces with 3 components");
        }
        int i16 = j23Var.c;
        if (i16 == -1) {
            q3a.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b4 = j23Var.b(0);
        float a4 = j23Var.a(0);
        if (f2 >= b4) {
            b4 = f2;
        }
        if (b4 <= a4) {
            a4 = b4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a4);
        int i17 = floatToRawIntBits >>> 31;
        int i18 = (floatToRawIntBits >>> 23) & 255;
        int i19 = floatToRawIntBits & 8388607;
        if (i18 == 255) {
            i3 = i19 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i18 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i20 = i19 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i20) + 1) | (i17 << 15);
                    short s2 = (short) i4;
                    b2 = j23Var.b(1);
                    a2 = j23Var.a(1);
                    if (f3 >= b2) {
                        b2 = f3;
                    }
                    if (b2 <= a2) {
                        a2 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                    int i21 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i22 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i22 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i7 = 0;
                            i6 = 49;
                        } else if (i6 > 0) {
                            int i23 = i22 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i23) + 1) | (i21 << 15);
                                short s3 = (short) i8;
                                b3 = j23Var.b(2);
                                a3 = j23Var.a(2);
                                if (f4 >= b3) {
                                    b3 = f4;
                                }
                                if (b3 <= a3) {
                                    a3 = b3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a3);
                                int i24 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i10 = i25 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i26 = i9 - 112;
                                    if (i26 >= 31) {
                                        i10 = 0;
                                        r7 = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i11 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            short s4 = (short) i11;
                                            if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                f6 = f5;
                                            }
                                            long j3 = (i16 & 63) | ((s2 & 65535) << 48) | ((s3 & 65535) << 32) | ((65535 & s4) << 16) | ((((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            d8k d8kVar2 = e8k.b;
                                            int i28 = r13.j;
                                            return j3;
                                        }
                                        i10 = i27;
                                        r7 = i26;
                                    } else if (i26 >= -10) {
                                        int i29 = (i25 | 8388608) >> (1 - i26);
                                        if ((i29 & 4096) != 0) {
                                            i29 += 8192;
                                        }
                                        i10 = i29 >> 13;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                i11 = i10 | (i24 << 15) | (r7 << 10);
                                short s42 = (short) i11;
                                if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                }
                                long j32 = (i16 & 63) | ((s2 & 65535) << 48) | ((s3 & 65535) << 32) | ((65535 & s42) << 16) | ((((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                d8k d8kVar22 = e8k.b;
                                int i282 = r13.j;
                                return j32;
                            }
                            i7 = i23;
                        } else if (i6 >= -10) {
                            int i30 = (i22 | 8388608) >> (1 - i6);
                            if ((i30 & 4096) != 0) {
                                i30 += 8192;
                            }
                            i7 = i30 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i21 << 15) | (i6 << 10);
                    short s32 = (short) i8;
                    b3 = j23Var.b(2);
                    a3 = j23Var.a(2);
                    if (f4 >= b3) {
                    }
                    if (b3 <= a3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a3);
                    int i242 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i11 = i10 | (i242 << 15) | (r7 << 10);
                    short s422 = (short) i11;
                    if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    }
                    long j322 = (i16 & 63) | ((s2 & 65535) << 48) | ((s32 & 65535) << 32) | ((65535 & s422) << 16) | ((((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    d8k d8kVar222 = e8k.b;
                    int i2822 = r13.j;
                    return j322;
                }
                i3 = i20;
            } else if (i2 >= -10) {
                int i31 = (i19 | 8388608) >> (1 - i2);
                if ((i31 & 4096) != 0) {
                    i31 += 8192;
                }
                i3 = i31 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i17 << 15) | (i2 << 10);
        short s22 = (short) i4;
        b2 = j23Var.b(1);
        a2 = j23Var.a(1);
        if (f3 >= b2) {
        }
        if (b2 <= a2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a2);
        int i212 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i222 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i212 << 15) | (i6 << 10);
        short s322 = (short) i8;
        b3 = j23Var.b(2);
        a3 = j23Var.a(2);
        if (f4 >= b3) {
        }
        if (b3 <= a3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a3);
        int i2422 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i11 = i10 | (i2422 << 15) | (r7 << 10);
        short s4222 = (short) i11;
        if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        long j3222 = (i16 & 63) | ((s22 & 65535) << 48) | ((s322 & 65535) << 32) | ((65535 & s4222) << 16) | ((((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        d8k d8kVar2222 = e8k.b;
        int i28222 = r13.j;
        return j3222;
    }

    public static ru9 a0(Object obj) {
        return obj == null ? ru9.b : new ru9(obj);
    }

    public static final long b(int i2) {
        long j2 = i2;
        d8k d8kVar = e8k.b;
        long j3 = j2 << 32;
        int i3 = r13.j;
        return j3;
    }

    public static final boolean b0(Context context) {
        context.getClass();
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        return i2 != 16 && i2 == 32;
    }

    public static final long c(int i2, int i3, int i4, int i5) {
        return b(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final boolean c0(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        d8k d8kVar = e8k.b;
        int i2 = r13.j;
        return j3;
    }

    public static final long d0(long j2, long j3, float f2) {
        jpd jpdVar = l23.x;
        long b2 = r13.b(j2, jpdVar);
        long b3 = r13.b(j3, jpdVar);
        float d2 = r13.d(b2);
        float h2 = r13.h(b2);
        float g2 = r13.g(b2);
        float e2 = r13.e(b2);
        float d3 = r13.d(b3);
        float h3 = r13.h(b3);
        float g3 = r13.g(b3);
        float e3 = r13.e(b3);
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return r13.b(q(b6a.t(h2, h3, f2), b6a.t(g2, g3, f2), b6a.t(e2, e3, f2), b6a.t(d2, d3, f2), jpdVar), r13.f(j3));
    }

    public static final float e0(long j2) {
        j23 f2 = r13.f(j2);
        if (!kik.p(f2.b, 12884901888L)) {
            q3a.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) kik.b0(f2.b)));
        }
        x4g x4gVar = ((b5g) f2).p;
        double h2 = x4gVar.h(r13.h(j2));
        float h3 = (float) ((x4gVar.h(r13.e(j2)) * 0.0722d) + (x4gVar.h(r13.g(j2)) * 0.7152d) + (h2 * 0.2126d));
        if (h3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            h3 = 0.0f;
        }
        if (h3 > 1.0f) {
            return 1.0f;
        }
        return h3;
    }

    public static final void f(CrowdsourcingContribution crowdsourcingContribution, xtc xtcVar, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        boolean z;
        String valueOf;
        crowdsourcingContribution.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1109352509);
        int i5 = (av8Var.i(crowdsourcingContribution) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i5 | (av8Var.g(xtcVar2) ? 32 : 16);
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc xtcVar3 = i6 != 0 ? utcVar : xtcVar2;
            xtc d2 = bkh.d(bkh.e(l98.d0(xtcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), 24.0f), 1.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
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
            List<String> L0 = crowdsourcingContribution.getUserImages().size() > 5 ? CollectionsKt.L0(crowdsourcingContribution.getUserImages(), 5) : crowdsourcingContribution.getUserImages();
            int size = (L0.size() - 1) * 12;
            av8Var.d0(-808354859);
            int i7 = 0;
            for (Object obj : L0) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    b.q();
                    throw null;
                }
                td4.L(0, av8Var, rd0.O(bkh.l(utcVar, 24.0f), -(i7 * 12), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), (String) obj);
                i7 = i8;
            }
            av8Var.s(false);
            int count = crowdsourcingContribution.getCount();
            if (count == 0) {
                valueOf = "";
                z = true;
            } else {
                z = true;
                valueOf = (1 > count || count >= 16) ? "15+" : String.valueOf(count);
            }
            String quantityString = ((Context) av8Var.k(nz.b)).getResources().getQuantityString(R.plurals.crowdsourcing_users_contribution_counter, count, valueOf);
            quantityString.getClass();
            yf8 yf8Var = xth.a;
            udj.c(quantityString, rd0.O(bkh.d(utcVar, 1.0f), (-size) + 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.s(z);
            xtcVar2 = xtcVar3;
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new lj(crowdsourcingContribution, xtcVar2, i2, i3);
        }
    }

    public static JSONObject f0(HashMap hashMap) {
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList);
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            jSONObject.put(str, hashMap.get(str));
        }
        return jSONObject;
    }

    public static final void g(gv9 gv9Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(170037999);
        int i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            xtc h2 = ljg.h(16.0f, bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), 16.0f);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, h2);
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
            String v2 = oea.v(R.string.league_tab_stats, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            av8Var.d0(-2122879303);
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                cy5 cy5Var = (cy5) it.next();
                av8Var.a0(1561902838, cy5Var.a);
                p(cy5Var, null, av8Var, 0);
                av8Var.s(false);
            }
            bf3.t(av8Var, false, utcVar, 8.0f, av8Var);
            String v3 = oea.v(R.string.more_stats_button, av8Var);
            yf8 yf8Var2 = xth.a;
            bea.f(v3, null, xth.l(), false, function0, Integer.valueOf(R.drawable.ic_chevron_right_large_16), av8Var, (i3 << 9) & 57344, 10);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new cyb(gv9Var, function0, xtcVar, i2, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x037b  */
    /* JADX WARN: Type inference failed for: r2v1, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FantasyRoundPlayerUiModel g0(FantasyRoundPlayer fantasyRoundPlayer, Context context) {
        String str;
        String str2;
        String str3;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel;
        List<FantasyPlayerFixture> fixtures;
        FantasyPlayerMissingData fantasyPlayerMissingData;
        FantasyPlayerMissingData fantasyPlayerMissingData2;
        String nameCode;
        Float price;
        List<FantasyPlayerFixture> fixtures2;
        Boolean bool;
        Tournament tournament;
        BasicTournamentInfo basicTournamentInfo;
        List<FantasyPlayerFixture> fixtures3;
        ?? r2;
        List<FantasyPlayerFixture> fixtures4;
        UniqueTournament uniqueTournament;
        Collection values;
        FantasyPlayerFixture fantasyPlayerFixture;
        FantasyPlayerFixture fantasyPlayerFixture2;
        Object obj;
        FantasyPlayerFixture fantasyPlayerFixture3;
        String str4;
        fantasyRoundPlayer.getClass();
        List<FantasyPlayerFixture> fixtures5 = fantasyRoundPlayer.getFixtures();
        String str5 = "-";
        boolean z = true;
        if (fixtures5 == null || fixtures5.isEmpty()) {
            str = "-";
        } else {
            if (fixtures5.size() <= 2) {
                str4 = CollectionsKt.f0(fixtures5, null, null, null, new e87(22), 31);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : fixtures5) {
                    if (Intrinsics.c(((FantasyPlayerFixture) obj2).getEventStatusType(), StatusKt.STATUS_NOT_STARTED)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    FantasyPlayerFixture fantasyPlayerFixture4 = (FantasyPlayerFixture) CollectionsKt.Y(fixtures5);
                    String nameCode2 = fantasyPlayerFixture4.getTeam().getNameCode();
                    if (nameCode2 == null && (nameCode2 = fantasyPlayerFixture4.getTeam().getShortName()) == null) {
                        nameCode2 = fantasyPlayerFixture4.getTeam().getName();
                    }
                    str4 = nameCode2 + " +" + (fixtures5.size() - 1);
                } else {
                    str4 = CollectionsKt.f0(CollectionsKt.L0(arrayList, 2), null, null, null, new e87(23), 31);
                }
            }
            str = str4;
        }
        Float price2 = fantasyRoundPlayer.getPrice();
        if (price2 != null) {
            float floatValue = price2.floatValue();
            Locale d2 = dla.d();
            Set set = o84.a;
            str2 = String.format(d2, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(floatValue)}, 2));
        } else {
            str2 = "-";
        }
        Float averageScore = fantasyRoundPlayer.getFantasyPlayer().getAverageScore();
        String format = averageScore != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(averageScore.floatValue())}, 1)) : "-";
        Float expectedPoints = fantasyRoundPlayer.getExpectedPoints();
        String format2 = expectedPoints != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(expectedPoints.floatValue())}, 1)) : "-";
        FantasyPlayerFixture s0 = k53.s0(fantasyRoundPlayer);
        Map map = null;
        if (s0 != null) {
            long eventStartTimestamp = s0.getEventStartTimestamp();
            if (fc6.B(fc6.t(Instant.ofEpochSecond(eventStartTimestamp)))) {
                String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
                bestPattern.getClass();
                str3 = fc6.i(eventStartTimestamp, hk4.a(bestPattern));
            } else {
                str3 = rik.j(context, eventStartTimestamp, bi4.PATTERN_DM, " ");
            }
        } else {
            str3 = null;
        }
        String str6 = str3 == null ? "-" : str3;
        FantasyPlayerFixture s02 = k53.s0(fantasyRoundPlayer);
        FantasyPlayerFixtureUiModel D = s02 != null ? s9a.D(s02, false) : null;
        List<FantasyPlayerFixture> fixtures6 = fantasyRoundPlayer.getFixtures();
        if (fixtures6 != null) {
            if (fixtures6.size() != 1) {
                fixtures6 = null;
            }
            if (fixtures6 != null && (fantasyPlayerFixture3 = (FantasyPlayerFixture) CollectionsKt.firstOrNull(fixtures6)) != null) {
                fantasyPlayerFixtureUiModel = s9a.D(fantasyPlayerFixture3, false);
                FantasyRoundPlayerInfo fantasyRoundPlayerInfo = new FantasyRoundPlayerInfo(str, str2, format, format2, str6, D, fantasyPlayerFixtureUiModel);
                fixtures = fantasyRoundPlayer.getFixtures();
                if (fixtures == null && !fixtures.isEmpty()) {
                    List<FantasyPlayerFixture> fixtures7 = fantasyRoundPlayer.getFixtures();
                    if (fixtures7 == null || fixtures7.isEmpty()) {
                        fantasyPlayerFixture = null;
                    } else {
                        Iterator it = CollectionsKt.H0(fixtures7, new se7(4)).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (Intrinsics.c(((FantasyPlayerFixture) obj).getEventStatusType(), StatusKt.STATUS_NOT_STARTED)) {
                                break;
                            }
                        }
                        fantasyPlayerFixture = (FantasyPlayerFixture) obj;
                        if (fantasyPlayerFixture == null) {
                            fantasyPlayerFixture = (FantasyPlayerFixture) CollectionsKt.h0(fixtures7);
                        }
                    }
                    ListIterator<FantasyPlayerFixture> listIterator = fixtures.listIterator(fixtures.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            fantasyPlayerFixture2 = null;
                            break;
                        }
                        fantasyPlayerFixture2 = listIterator.previous();
                        FantasyPlayerFixture fantasyPlayerFixture5 = fantasyPlayerFixture2;
                        if (fantasyPlayerFixture5.getMissingType() != null && fantasyPlayerFixture5.getMissingReason() != null) {
                            break;
                        }
                    }
                    FantasyPlayerFixture fantasyPlayerFixture6 = fantasyPlayerFixture2;
                    if (fantasyPlayerFixture == null) {
                        fantasyPlayerFixture = fantasyPlayerFixture6;
                    }
                    if (fantasyPlayerFixture != null) {
                        zic zicVar = ad7.a;
                        String playerFixtureStatus = fantasyPlayerFixture.getPlayerFixtureStatus();
                        zicVar.getClass();
                        if (zic.v(playerFixtureStatus) != ad7.b) {
                            wxf wxfVar = sd7.c;
                            String missingType = fantasyPlayerFixture.getMissingType();
                            wxfVar.getClass();
                            sd7 g2 = wxf.g(missingType);
                            if (g2 != null) {
                                uxf uxfVar = rd7.b;
                                Integer missingReason = fantasyPlayerFixture.getMissingReason();
                                uxfVar.getClass();
                                rd7 C = uxf.C(missingReason);
                                if (C != null) {
                                    fantasyPlayerMissingData = new FantasyPlayerMissingData(g2, C, fantasyPlayerFixture.getMissingDescription());
                                }
                            }
                        }
                    }
                    fantasyPlayerMissingData2 = null;
                    int id = fantasyRoundPlayer.getFantasyPlayer().getId();
                    FantasyPlayerUiModel X = m6k.X(fantasyRoundPlayer.getFantasyPlayer(), context);
                    int id2 = fantasyRoundPlayer.getId();
                    int id3 = fantasyRoundPlayer.getTeam().getId();
                    String p2 = tba.p(context, fantasyRoundPlayer.getTeam());
                    nameCode = fantasyRoundPlayer.getTeam().getNameCode();
                    if (nameCode == null) {
                        nameCode = iii.H(3, fantasyRoundPlayer.getTeam().getName());
                    }
                    String str7 = nameCode;
                    f7a f7aVar = rz6.g;
                    String position = fantasyRoundPlayer.getFantasyPlayer().getPosition();
                    f7aVar.getClass();
                    rz6 g3 = f7a.g(position);
                    boolean captain = fantasyRoundPlayer.getCaptain();
                    Integer score = fantasyRoundPlayer.getScore();
                    Float expectedPoints2 = fantasyRoundPlayer.getExpectedPoints();
                    Float goalProbability = fantasyRoundPlayer.getGoalProbability();
                    Float assistProbability = fantasyRoundPlayer.getAssistProbability();
                    Float cleanSheetProbability = fantasyRoundPlayer.getCleanSheetProbability();
                    Float price3 = fantasyRoundPlayer.getPrice();
                    boolean substitute = fantasyRoundPlayer.getSubstitute();
                    int order = fantasyRoundPlayer.getOrder();
                    Long lockedFrom = fantasyRoundPlayer.getLockedFrom();
                    boolean z2 = lockedFrom != null ? yaa.w() >= lockedFrom.longValue() : false;
                    boolean isLive = fantasyRoundPlayer.isLive();
                    price = fantasyRoundPlayer.getPrice();
                    if (price != null) {
                        float floatValue2 = price.floatValue();
                        Locale d3 = dla.d();
                        Set set2 = o84.a;
                        str5 = String.format(d3, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(floatValue2)}, 2));
                    }
                    String str8 = str5;
                    fixtures2 = fantasyRoundPlayer.getFixtures();
                    if (fixtures2 != null) {
                        if (!fixtures2.isEmpty()) {
                            Iterator it2 = fixtures2.iterator();
                            while (it2.hasNext()) {
                                if (((FantasyPlayerFixture) it2.next()).getEventStartTimestamp() > yaa.w()) {
                                    break;
                                }
                            }
                        }
                        z = false;
                        bool = Boolean.valueOf(z);
                    } else {
                        bool = null;
                    }
                    boolean c2 = Intrinsics.c(bool, Boolean.TRUE);
                    Map<Integer, Float> priceHistory = fantasyRoundPlayer.getPriceHistory();
                    List S0 = (priceHistory != null || (values = new TreeMap(priceHistory).values()) == null) ? null : CollectionsKt.S0(values);
                    Integer expectedPointsRank = fantasyRoundPlayer.getExpectedPointsRank();
                    tournament = fantasyRoundPlayer.getTeam().getTournament();
                    if (tournament != null || (uniqueTournament = tournament.getUniqueTournament()) == null) {
                        basicTournamentInfo = null;
                    } else {
                        int id4 = uniqueTournament.getId();
                        String x2 = tba.x(uniqueTournament);
                        if (x2 == null && (x2 = uniqueTournament.getName()) == null) {
                            x2 = "";
                        }
                        basicTournamentInfo = new BasicTournamentInfo(id4, x2, uniqueTournament.getCategory().getId());
                    }
                    fixtures3 = fantasyRoundPlayer.getFixtures();
                    if (fixtures3 != null) {
                        r2 = new ArrayList(k13.r(fixtures3, 10));
                        Iterator it3 = fixtures3.iterator();
                        while (it3.hasNext()) {
                            r2.add(s9a.D((FantasyPlayerFixture) it3.next(), false));
                        }
                    } else {
                        r2 = km5.a;
                    }
                    List list = r2;
                    fixtures4 = fantasyRoundPlayer.getFixtures();
                    if (fixtures4 != null) {
                        int c3 = sub.c(k13.r(fixtures4, 10));
                        if (c3 < 16) {
                            c3 = 16;
                        }
                        map = new LinkedHashMap(c3);
                        for (FantasyPlayerFixture fantasyPlayerFixture7 : fixtures4) {
                            Integer valueOf = Integer.valueOf(fantasyPlayerFixture7.getEventId());
                            wxf wxfVar2 = sd7.c;
                            String missingType2 = fantasyPlayerFixture7.getMissingType();
                            wxfVar2.getClass();
                            sd7 g4 = wxf.g(missingType2);
                            uxf uxfVar2 = rd7.b;
                            Integer missingReason2 = fantasyPlayerFixture7.getMissingReason();
                            uxfVar2.getClass();
                            rd7 C2 = uxf.C(missingReason2);
                            zic zicVar2 = ad7.a;
                            String playerFixtureStatus2 = fantasyPlayerFixture7.getPlayerFixtureStatus();
                            zicVar2.getClass();
                            map.put(valueOf, new FantasyPlayerFixtureData(g4, C2, zic.v(playerFixtureStatus2)));
                        }
                    }
                    if (map == null) {
                        map = lm5.a;
                        map.getClass();
                    }
                    return new FantasyRoundPlayerUiModel(id, g3, order, id2, X, id3, p2, str7, substitute, fantasyPlayerMissingData2, captain, score, str8, price3, expectedPoints2, expectedPointsRank, goalProbability, assistProbability, cleanSheetProbability, z2, isLive, list, map, c2, S0, basicTournamentInfo, fantasyRoundPlayerInfo, 16);
                }
                fantasyPlayerMissingData = new FantasyPlayerMissingData(sd7.e, rd7.c, null);
                fantasyPlayerMissingData2 = fantasyPlayerMissingData;
                int id5 = fantasyRoundPlayer.getFantasyPlayer().getId();
                FantasyPlayerUiModel X2 = m6k.X(fantasyRoundPlayer.getFantasyPlayer(), context);
                int id22 = fantasyRoundPlayer.getId();
                int id32 = fantasyRoundPlayer.getTeam().getId();
                String p22 = tba.p(context, fantasyRoundPlayer.getTeam());
                nameCode = fantasyRoundPlayer.getTeam().getNameCode();
                if (nameCode == null) {
                }
                String str72 = nameCode;
                f7a f7aVar2 = rz6.g;
                String position2 = fantasyRoundPlayer.getFantasyPlayer().getPosition();
                f7aVar2.getClass();
                rz6 g32 = f7a.g(position2);
                boolean captain2 = fantasyRoundPlayer.getCaptain();
                Integer score2 = fantasyRoundPlayer.getScore();
                Float expectedPoints22 = fantasyRoundPlayer.getExpectedPoints();
                Float goalProbability2 = fantasyRoundPlayer.getGoalProbability();
                Float assistProbability2 = fantasyRoundPlayer.getAssistProbability();
                Float cleanSheetProbability2 = fantasyRoundPlayer.getCleanSheetProbability();
                Float price32 = fantasyRoundPlayer.getPrice();
                boolean substitute2 = fantasyRoundPlayer.getSubstitute();
                int order2 = fantasyRoundPlayer.getOrder();
                Long lockedFrom2 = fantasyRoundPlayer.getLockedFrom();
                if (lockedFrom2 != null) {
                }
                boolean isLive2 = fantasyRoundPlayer.isLive();
                price = fantasyRoundPlayer.getPrice();
                if (price != null) {
                }
                String str82 = str5;
                fixtures2 = fantasyRoundPlayer.getFixtures();
                if (fixtures2 != null) {
                }
                boolean c22 = Intrinsics.c(bool, Boolean.TRUE);
                Map<Integer, Float> priceHistory2 = fantasyRoundPlayer.getPriceHistory();
                if (priceHistory2 != null) {
                }
                Integer expectedPointsRank2 = fantasyRoundPlayer.getExpectedPointsRank();
                tournament = fantasyRoundPlayer.getTeam().getTournament();
                if (tournament != null) {
                }
                basicTournamentInfo = null;
                fixtures3 = fantasyRoundPlayer.getFixtures();
                if (fixtures3 != null) {
                }
                List list2 = r2;
                fixtures4 = fantasyRoundPlayer.getFixtures();
                if (fixtures4 != null) {
                }
                if (map == null) {
                }
                return new FantasyRoundPlayerUiModel(id5, g32, order2, id22, X2, id32, p22, str72, substitute2, fantasyPlayerMissingData2, captain2, score2, str82, price32, expectedPoints22, expectedPointsRank2, goalProbability2, assistProbability2, cleanSheetProbability2, z2, isLive2, list2, map, c22, S0, basicTournamentInfo, fantasyRoundPlayerInfo, 16);
            }
        }
        fantasyPlayerFixtureUiModel = null;
        FantasyRoundPlayerInfo fantasyRoundPlayerInfo2 = new FantasyRoundPlayerInfo(str, str2, format, format2, str6, D, fantasyPlayerFixtureUiModel);
        fixtures = fantasyRoundPlayer.getFixtures();
        if (fixtures == null) {
        }
        fantasyPlayerMissingData = new FantasyPlayerMissingData(sd7.e, rd7.c, null);
        fantasyPlayerMissingData2 = fantasyPlayerMissingData;
        int id52 = fantasyRoundPlayer.getFantasyPlayer().getId();
        FantasyPlayerUiModel X22 = m6k.X(fantasyRoundPlayer.getFantasyPlayer(), context);
        int id222 = fantasyRoundPlayer.getId();
        int id322 = fantasyRoundPlayer.getTeam().getId();
        String p222 = tba.p(context, fantasyRoundPlayer.getTeam());
        nameCode = fantasyRoundPlayer.getTeam().getNameCode();
        if (nameCode == null) {
        }
        String str722 = nameCode;
        f7a f7aVar22 = rz6.g;
        String position22 = fantasyRoundPlayer.getFantasyPlayer().getPosition();
        f7aVar22.getClass();
        rz6 g322 = f7a.g(position22);
        boolean captain22 = fantasyRoundPlayer.getCaptain();
        Integer score22 = fantasyRoundPlayer.getScore();
        Float expectedPoints222 = fantasyRoundPlayer.getExpectedPoints();
        Float goalProbability22 = fantasyRoundPlayer.getGoalProbability();
        Float assistProbability22 = fantasyRoundPlayer.getAssistProbability();
        Float cleanSheetProbability22 = fantasyRoundPlayer.getCleanSheetProbability();
        Float price322 = fantasyRoundPlayer.getPrice();
        boolean substitute22 = fantasyRoundPlayer.getSubstitute();
        int order22 = fantasyRoundPlayer.getOrder();
        Long lockedFrom22 = fantasyRoundPlayer.getLockedFrom();
        if (lockedFrom22 != null) {
        }
        boolean isLive22 = fantasyRoundPlayer.isLive();
        price = fantasyRoundPlayer.getPrice();
        if (price != null) {
        }
        String str822 = str5;
        fixtures2 = fantasyRoundPlayer.getFixtures();
        if (fixtures2 != null) {
        }
        boolean c222 = Intrinsics.c(bool, Boolean.TRUE);
        Map<Integer, Float> priceHistory22 = fantasyRoundPlayer.getPriceHistory();
        if (priceHistory22 != null) {
        }
        Integer expectedPointsRank22 = fantasyRoundPlayer.getExpectedPointsRank();
        tournament = fantasyRoundPlayer.getTeam().getTournament();
        if (tournament != null) {
        }
        basicTournamentInfo = null;
        fixtures3 = fantasyRoundPlayer.getFixtures();
        if (fixtures3 != null) {
        }
        List list22 = r2;
        fixtures4 = fantasyRoundPlayer.getFixtures();
        if (fixtures4 != null) {
        }
        if (map == null) {
        }
        return new FantasyRoundPlayerUiModel(id52, g322, order22, id222, X22, id322, p222, str722, substitute22, fantasyPlayerMissingData2, captain22, score22, str822, price322, expectedPoints222, expectedPointsRank22, goalProbability22, assistProbability22, cleanSheetProbability22, z2, isLive22, list22, map, c222, S0, basicTournamentInfo, fantasyRoundPlayerInfo2, 16);
    }

    public static final void h(final gk7 gk7Var, final Function1 function1, final Function1 function12, final Function0 function0, final boolean z, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        gk7Var.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1655991551);
        int i3 = i2 | (av8Var2.i(gk7Var) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function0) ? a.o : 1024) | (av8Var2.h(z) ? 16384 : 8192) | 196608;
        int i4 = 0;
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            final Context context = (Context) av8Var2.k(nz.b);
            final osa a2 = rsa.a(gk7Var.t, av8Var2);
            final e1d v2 = rfo.v(gk7Var.m, Boolean.FALSE, av8Var2, 48);
            final e1d x2 = rfo.x(gk7Var.i, av8Var2, 0);
            e1d x3 = rfo.x(gk7Var.n, av8Var2, 0);
            final e1d x4 = rfo.x(gk7Var.o, av8Var2, 0);
            final e1d x5 = rfo.x(gk7Var.p, av8Var2, 0);
            final e1d x6 = rfo.x(gk7Var.q, av8Var2, 0);
            final e1d x7 = rfo.x(gk7Var.r, av8Var2, 0);
            final e1d x8 = rfo.x(gk7Var.s, av8Var2, 0);
            long j2 = r13.h;
            tc3 H = yqo.H(-1435134525, av8Var2, new uo6(gk7Var, function0, x3, i4));
            tc3 H2 = yqo.H(1728031630, av8Var2, new ct8() { // from class: vo6
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    rz6 rz6Var;
                    p3e p3eVar = (p3e) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    p3eVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(p3eVar) ? 4 : 2;
                    }
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                        xtc a0 = l98.a0(utc.a, p3eVar);
                        boolean booleanValue = ((Boolean) v2.getValue()).booleanValue();
                        w28 w28Var = (w28) x2.getValue();
                        ho1 ho1Var = (ho1) x4.getValue();
                        Float f2 = (Float) x5.getValue();
                        String str = (String) x6.getValue();
                        if (str != null) {
                            rz6.g.getClass();
                            rz6Var = f7a.g(str);
                        } else {
                            rz6Var = null;
                        }
                        rz6 rz6Var2 = rz6Var;
                        gk7 gk7Var2 = gk7.this;
                        boolean i5 = av8Var3.i(gk7Var2);
                        Object O = av8Var3.O();
                        a99 a99Var = nf3.a;
                        if (i5 || O == a99Var) {
                            O = new ny(0, gk7Var2, gk7.class, "clearFilters", "clearFilters()V", 0, 25);
                            av8Var3.n0(O);
                        }
                        KFunction kFunction = (KFunction) O;
                        cdi cdiVar = x7;
                        mei meiVar = (mei) cdiVar.getValue();
                        cdi cdiVar2 = x8;
                        nei neiVar = (nei) cdiVar2.getValue();
                        Function1 function13 = function1;
                        boolean g2 = av8Var3.g(function13);
                        Function0 function02 = function0;
                        boolean g3 = g2 | av8Var3.g(function02);
                        Object O2 = av8Var3.O();
                        if (g3 || O2 == a99Var) {
                            O2 = new xo6(function13, function02, 0);
                            av8Var3.n0(O2);
                        }
                        Function1 function14 = (Function1) O2;
                        boolean i6 = av8Var3.i(gk7Var2);
                        Object O3 = av8Var3.O();
                        if (i6 || O3 == a99Var) {
                            O3 = new wo6(gk7Var2, 1);
                            av8Var3.n0(O3);
                        }
                        Function1 function15 = (Function1) O3;
                        boolean i7 = av8Var3.i(gk7Var2);
                        Object O4 = av8Var3.O();
                        if (i7 || O4 == a99Var) {
                            O4 = new wo6(gk7Var2, 2);
                            av8Var3.n0(O4);
                        }
                        Function1 function16 = (Function1) O4;
                        boolean i8 = av8Var3.i(gk7Var2);
                        Object O5 = av8Var3.O();
                        if (i8 || O5 == a99Var) {
                            O5 = new wo6(gk7Var2, 3);
                            av8Var3.n0(O5);
                        }
                        Function1 function17 = (Function1) O5;
                        Function0 function03 = (Function0) kFunction;
                        Context context2 = context;
                        boolean i9 = av8Var3.i(context2) | av8Var3.g(cdiVar) | av8Var3.i(gk7Var2) | av8Var3.g(cdiVar2);
                        Object O6 = av8Var3.O();
                        if (i9 || O6 == a99Var) {
                            O6 = new yo6(context2, gk7Var2, cdiVar, cdiVar2, 0);
                            av8Var3.n0(O6);
                        }
                        pe7.a(a2, w28Var, booleanValue, false, function14, function12, ho1Var, function15, f2, function16, rz6Var2, function17, function03, meiVar, neiVar, (Function1) O6, z, a0, null, ok3.e, av8Var3, 3080, 805306368, 262144);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            });
            utc utcVar = utc.a;
            av8Var = av8Var2;
            q5a.p(utcVar, H, null, null, null, 0, j2, 0L, null, H2, av8Var, 806879286, 444);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new x64(gk7Var, function1, function12, function0, z, xtcVar2, i2);
        }
    }

    public static ddb h0(ddb ddbVar) {
        if (ddbVar.isDone()) {
            return ddbVar;
        }
        st8 st8Var = new st8();
        st8Var.h = ddbVar;
        ddbVar.addListener(st8Var, f35.a);
        return st8Var;
    }

    public static final void i(zx6 zx6Var, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1781924171);
        int i3 = (av8Var.i(zx6Var) ? 4 : 2) | i2 | (av8Var.i(function0) ? 32 : 16);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            wkn.a(zx6Var.a, null, null, null, yqo.H(1548610554, av8Var, new hl6(i4, function0, zx6Var)), av8Var, 24576, 14);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ns4(zx6Var, function0, i2, 29);
        }
    }

    public static b3d i0(int i2, int i3, byte[] bArr) {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8 = 2;
        nm2 nm2Var = new nm2(bArr, i2 + 2, i3);
        nm2Var.t(4);
        int i9 = nm2Var.i(3);
        nm2Var.s();
        int i10 = nm2Var.i(2);
        boolean h2 = nm2Var.h();
        int i11 = nm2Var.i(5);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            z = true;
            if (i12 >= 32) {
                break;
            }
            if (nm2Var.h()) {
                i13 |= 1 << i12;
            }
            i12++;
        }
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = nm2Var.i(8);
        }
        int i15 = i13;
        int i16 = nm2Var.i(8);
        int i17 = 0;
        for (int i18 = 0; i18 < i9; i18++) {
            if (nm2Var.h()) {
                i17 += 89;
            }
            if (nm2Var.h()) {
                i17 += 8;
            }
        }
        nm2Var.t(i17);
        if (i9 > 0) {
            nm2Var.t((8 - i9) * 2);
        }
        nm2Var.m();
        int m2 = nm2Var.m();
        if (m2 == 3) {
            nm2Var.s();
        }
        int m3 = nm2Var.m();
        int m4 = nm2Var.m();
        if (nm2Var.h()) {
            int m5 = nm2Var.m();
            int m6 = nm2Var.m();
            int m7 = nm2Var.m();
            i4 = i10;
            int m8 = nm2Var.m();
            if (m2 != 1 && m2 != 2) {
                i8 = 1;
            }
            int i19 = m2 == 1 ? 2 : 1;
            m3 = lnb.x(m5, m6, i8, m3);
            m4 = lnb.x(m7, m8, i19, m4);
        } else {
            i4 = i10;
        }
        nm2Var.m();
        nm2Var.m();
        int m9 = nm2Var.m();
        for (int i20 = nm2Var.h() ? 0 : i9; i20 <= i9; i20++) {
            nm2Var.m();
            nm2Var.m();
            nm2Var.m();
        }
        nm2Var.m();
        nm2Var.m();
        nm2Var.m();
        nm2Var.m();
        nm2Var.m();
        nm2Var.m();
        if (nm2Var.h() && nm2Var.h()) {
            int i21 = 0;
            while (true) {
                int i22 = 4;
                if (i21 >= 4) {
                    break;
                }
                int i23 = 0;
                while (i23 < 6) {
                    if (nm2Var.h()) {
                        int min = Math.min(64, 1 << ((i21 << 1) + i22));
                        if (i21 > 1) {
                            nm2Var.n();
                        }
                        for (int i24 = 0; i24 < min; i24++) {
                            nm2Var.n();
                        }
                    } else {
                        nm2Var.m();
                    }
                    i23 += i21 == 3 ? 3 : 1;
                    i22 = 4;
                }
                i21++;
            }
        }
        nm2Var.t(2);
        if (nm2Var.h()) {
            nm2Var.t(8);
            nm2Var.m();
            nm2Var.m();
            nm2Var.s();
        }
        int m10 = nm2Var.m();
        int i25 = 0;
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i26 = -1;
        int i27 = -1;
        while (i25 < m10) {
            if (i25 == 0 || !nm2Var.h()) {
                i5 = m9;
                i6 = m10;
                i7 = i25;
                z2 = z;
                int m11 = nm2Var.m();
                int m12 = nm2Var.m();
                int[] iArr4 = new int[m11];
                for (int i28 = 0; i28 < m11; i28++) {
                    iArr4[i28] = nm2Var.m() + 1;
                    nm2Var.s();
                }
                int[] iArr5 = new int[m12];
                for (int i29 = 0; i29 < m12; i29++) {
                    iArr5[i29] = nm2Var.m() + 1;
                    nm2Var.s();
                }
                i26 = m11;
                i27 = m12;
                iArr3 = iArr5;
                iArr2 = iArr4;
            } else {
                z2 = z;
                int i30 = i26 + i27;
                int m13 = (1 - ((nm2Var.h() ? 1 : 0) * 2)) * (nm2Var.m() + 1);
                i5 = m9;
                int i31 = i30 + 1;
                i6 = m10;
                boolean[] zArr = new boolean[i31];
                for (int i32 = 0; i32 <= i30; i32++) {
                    if (nm2Var.h()) {
                        zArr[i32] = z2;
                    } else {
                        zArr[i32] = nm2Var.h();
                    }
                }
                int[] iArr6 = new int[i31];
                int[] iArr7 = new int[i31];
                int i33 = 0;
                for (int i34 = i27 - 1; i34 >= 0; i34--) {
                    int i35 = iArr3[i34] + m13;
                    if (i35 < 0 && zArr[i26 + i34]) {
                        iArr6[i33] = i35;
                        i33++;
                    }
                }
                if (m13 < 0 && zArr[i30]) {
                    iArr6[i33] = m13;
                    i33++;
                }
                i7 = i25;
                int i36 = i33;
                int[] iArr8 = iArr2;
                for (int i37 = 0; i37 < i26; i37++) {
                    int i38 = iArr8[i37] + m13;
                    if (i38 < 0 && zArr[i37]) {
                        iArr6[i36] = i38;
                        i36++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr6, i36);
                int i39 = 0;
                for (int i40 = i26 - 1; i40 >= 0; i40--) {
                    int i41 = iArr8[i40] + m13;
                    if (i41 > 0 && zArr[i40]) {
                        iArr7[i39] = i41;
                        i39++;
                    }
                }
                if (m13 > 0 && zArr[i30]) {
                    iArr7[i39] = m13;
                    i39++;
                }
                int i42 = i39;
                for (int i43 = 0; i43 < i27; i43++) {
                    int i44 = iArr3[i43] + m13;
                    if (i44 > 0 && zArr[i26 + i43]) {
                        iArr7[i42] = i44;
                        i42++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr7, i42);
                i26 = i36;
                i27 = i42;
                iArr2 = copyOf;
            }
            i25 = i7 + 1;
            z = z2;
            m9 = i5;
            m10 = i6;
        }
        int i45 = m9;
        if (nm2Var.h()) {
            for (int i46 = 0; i46 < nm2Var.m(); i46++) {
                nm2Var.t(i45 + 5);
            }
        }
        nm2Var.t(2);
        float f2 = 1.0f;
        if (nm2Var.h()) {
            if (nm2Var.h()) {
                int i47 = nm2Var.i(8);
                if (i47 == 255) {
                    int i48 = nm2Var.i(16);
                    int i49 = nm2Var.i(16);
                    if (i48 != 0 && i49 != 0) {
                        f2 = i48 / i49;
                    }
                } else if (i47 < 17) {
                    f2 = s[i47];
                } else {
                    m6k.f0();
                }
            }
            if (nm2Var.h()) {
                nm2Var.s();
            }
            if (nm2Var.h()) {
                nm2Var.t(4);
                if (nm2Var.h()) {
                    nm2Var.t(24);
                }
            }
            if (nm2Var.h()) {
                nm2Var.m();
                nm2Var.m();
            }
            nm2Var.s();
            if (nm2Var.h()) {
                m4 *= 2;
            }
        }
        return new b3d(i4, h2, i11, i15, iArr, i16, m3, m4, f2);
    }

    public static final void j(ay6 ay6Var, of3 of3Var, int i2) {
        ay6 ay6Var2;
        ay6Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1032081840);
        int i3 = (av8Var.i(ay6Var) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            zx6 zx6Var = (zx6) rfo.x(ay6Var.h, av8Var, 0).getValue();
            boolean i4 = av8Var.i(ay6Var);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                ay6Var2 = ay6Var;
                av6 av6Var = new av6(0, ay6Var2, ay6.class, ToolBar.REFRESH, "refresh()V", 0, 4);
                av8Var.n0(av6Var);
                O = av6Var;
            } else {
                ay6Var2 = ay6Var;
            }
            i(zx6Var, (Function0) ((KFunction) O), av8Var, 0);
        } else {
            ay6Var2 = ay6Var;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new jo6(ay6Var2, i2, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g3d j0(int i2, int i3, byte[] bArr) {
        int m2;
        boolean h2;
        nm2 nm2Var;
        int i4;
        int i5;
        boolean z;
        boolean h3;
        int i6;
        int i7;
        int i8;
        int i9;
        nm2 nm2Var2 = new nm2(bArr, i2 + 1, i3);
        int i10 = nm2Var2.i(8);
        int i11 = nm2Var2.i(8);
        int i12 = nm2Var2.i(8);
        int m3 = nm2Var2.m();
        if (i10 == 100 || i10 == 110 || i10 == 122 || i10 == 244 || i10 == 44 || i10 == 83 || i10 == 86 || i10 == 118 || i10 == 128 || i10 == 138) {
            m2 = nm2Var2.m();
            h2 = m2 == 3 ? nm2Var2.h() : false;
            nm2Var2.m();
            nm2Var2.m();
            nm2Var2.s();
            if (nm2Var2.h()) {
                int i13 = m2 != 3 ? 8 : 12;
                int i14 = 0;
                while (i14 < i13) {
                    if (nm2Var2.h()) {
                        int i15 = i14 < 6 ? 16 : 64;
                        int i16 = 8;
                        int i17 = 8;
                        for (int i18 = 0; i18 < i15; i18++) {
                            if (i16 != 0) {
                                i16 = ((nm2Var2.n() + i17) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
                            }
                            if (i16 != 0) {
                                i17 = i16;
                            }
                        }
                    }
                    i14++;
                }
            }
        } else {
            m2 = 1;
            h2 = false;
        }
        int m4 = nm2Var2.m() + 4;
        int m5 = nm2Var2.m();
        if (m5 == 0) {
            i5 = nm2Var2.m() + 4;
            nm2Var = nm2Var2;
            i4 = 16;
        } else {
            if (m5 == 1) {
                boolean h4 = nm2Var2.h();
                nm2Var2.n();
                nm2Var2.n();
                i4 = 16;
                long m6 = nm2Var2.m();
                nm2Var = nm2Var2;
                for (int i19 = 0; i19 < m6; i19++) {
                    nm2Var.m();
                }
                z = h4;
                i5 = 0;
                nm2Var.m();
                nm2Var.s();
                int m7 = nm2Var.m() + 1;
                int m8 = nm2Var.m() + 1;
                h3 = nm2Var.h();
                int i20 = 2 - (h3 ? 1 : 0);
                int i21 = m8 * i20;
                if (!h3) {
                    nm2Var.s();
                }
                nm2Var.s();
                int i22 = m7 * 16;
                int i23 = i21 * 16;
                if (nm2Var.h()) {
                    i6 = i10;
                    i7 = i11;
                } else {
                    int m9 = nm2Var.m();
                    int m10 = nm2Var.m();
                    int m11 = nm2Var.m();
                    i6 = i10;
                    int m12 = nm2Var.m();
                    if (m2 == 0) {
                        i7 = i11;
                        i9 = 1;
                    } else {
                        i7 = i11;
                        int i24 = m2 == 3 ? 1 : 2;
                        i20 *= m2 != 1 ? 1 : 2;
                        i9 = i24;
                    }
                    int i25 = i20;
                    i22 = lnb.x(m9, m10, i9, i22);
                    i23 = lnb.x(m11, m12, i25, i23);
                }
                int i26 = i22;
                float f2 = 1.0f;
                if (nm2Var.h() && nm2Var.h()) {
                    i8 = nm2Var.i(8);
                    if (i8 != 255) {
                        int i27 = i4;
                        int i28 = nm2Var.i(i27);
                        int i29 = nm2Var.i(i27);
                        if (i28 != 0 && i29 != 0) {
                            f2 = i28 / i29;
                        }
                    } else if (i8 < 17) {
                        f2 = s[i8];
                    } else {
                        m6k.f0();
                    }
                }
                return new g3d(i6, i7, i12, m3, i26, i23, f2, h2, h3, m4, m5, i5, z);
            }
            nm2Var = nm2Var2;
            i4 = 16;
            i5 = 0;
        }
        z = false;
        nm2Var.m();
        nm2Var.s();
        int m72 = nm2Var.m() + 1;
        int m82 = nm2Var.m() + 1;
        h3 = nm2Var.h();
        int i202 = 2 - (h3 ? 1 : 0);
        int i212 = m82 * i202;
        if (!h3) {
        }
        nm2Var.s();
        int i222 = m72 * 16;
        int i232 = i212 * 16;
        if (nm2Var.h()) {
        }
        int i262 = i222;
        float f22 = 1.0f;
        if (nm2Var.h()) {
            i8 = nm2Var.i(8);
            if (i8 != 255) {
            }
        }
        return new g3d(i6, i7, i12, m3, i262, i232, f22, h2, h3, m4, m5, i5, z);
    }

    public static final void k(fo7 fo7Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        final fo7 fo7Var2;
        av8 av8Var;
        xtc xtcVar2;
        Function0 function0;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(699430193);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var2.g(fo7Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        int i5 = 0;
        if (av8Var2.T(i4 & 1, (i4 & 147) != 146)) {
            j67 j67Var = fo7Var.a;
            utc utcVar = utc.a;
            xtc q2 = n9e.q(wnn.A(bkh.d(utcVar, 1.0f), o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var2), oyn.e);
            boolean g2 = ((i4 & 112) == 32) | av8Var2.g(j67Var);
            Object O = av8Var2.O();
            if (g2 || O == nf3.a) {
                O = new n37(i5, (Object) j67Var, (Object) function1);
                av8Var2.n0(O);
            }
            xtc y2 = tol.y(q2, false, false, false, 0L, null, (Function0) O, av8Var2, 31);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, y2);
            if3.k7.getClass();
            Function0 function02 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function02);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            lv1 lv1Var = uxf.m;
            ng0 ng0Var = new ng0(16.0f, true, new a70(6));
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            l8g a3 = k8g.a(ng0Var, lv1Var, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function02);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            m(j67Var, bkh.l(utcVar, 32.0f), av8Var2, 48);
            p8g p8gVar = p8g.a;
            xtc a4 = p8gVar.a(1.0f, utcVar, true);
            final int i6 = 0;
            u23 a5 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, a4);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function02);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a5, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            String str = j67Var != null ? j67Var.b : null;
            if (str == null) {
                str = "";
            }
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, 0, 24960, 110586);
            if (j67Var == null) {
                av8Var2.d0(1471732228);
                av8Var2.s(false);
                fo7Var2 = fo7Var;
            } else {
                av8Var2.d0(1471732229);
                fo7Var2 = fo7Var;
                l(j67Var, fo7Var2.c, null, av8Var2, 0);
                Unit unit = Unit.a;
                av8Var2.s(false);
            }
            final int i7 = 1;
            av8Var2.s(true);
            mv1 mv1Var = uxf.g;
            xtc l2 = bkh.l(utcVar, 48.0f);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode4 = Long.hashCode(av8Var2.T);
            aee m5 = av8Var2.m();
            xtc C4 = fqj.C(av8Var2, l2);
            av8Var2.h0();
            if (av8Var2.S) {
                function0 = function02;
                av8Var2.l(function0);
            } else {
                function0 = function02;
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var);
            waa.K(av8Var2, m5, ff3Var);
            bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C4, f50Var3);
            av8Var = av8Var2;
            kq9.b(s6a.N(R.drawable.ic_chevron_right_small_16, 6, av8Var2), null, bkh.l(utcVar, 24.0f), lz.D(R.color.primary_default, av8Var2), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a6 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m6 = av8Var.m();
            xtc C5 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var);
            waa.K(av8Var, m6, ff3Var);
            bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C5, f50Var3);
            o(oea.v(R.string.rank, av8Var), p8gVar.a(1.0f, utcVar, true), yqo.H(872446412, av8Var, new Function2() { // from class: o37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = i6;
                    fo7 fo7Var3 = fo7Var2;
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i8) {
                        case 0:
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                                Integer num = fo7Var3.b.a;
                                String i9 = num != null ? dla.i(num) : null;
                                Regex regex = yid.a;
                                if (i9 == null) {
                                    i9 = "-";
                                }
                                String str2 = i9;
                                yf8 yf8Var2 = xth.a;
                                fqj.a(str2, xth.j(), lz.D(R.color.n_lv_1, av8Var3), null, null, av8Var3, 0, 24);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            av8 av8Var4 = (av8) of3Var2;
                            if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                                td4.o(fo7Var3.b.d(), null, null, av8Var4, 0, 6);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }), av8Var, 384);
            o(oea.v(R.string.fantasy_league_change, av8Var), p8gVar.a(1.0f, utcVar, true), yqo.H(-1750574155, av8Var, new Function2() { // from class: o37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = i7;
                    fo7 fo7Var3 = fo7Var2;
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i8) {
                        case 0:
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                                Integer num = fo7Var3.b.a;
                                String i9 = num != null ? dla.i(num) : null;
                                Regex regex = yid.a;
                                if (i9 == null) {
                                    i9 = "-";
                                }
                                String str2 = i9;
                                yf8 yf8Var2 = xth.a;
                                fqj.a(str2, xth.j(), lz.D(R.color.n_lv_1, av8Var3), null, null, av8Var3, 0, 24);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            av8 av8Var4 = (av8) of3Var2;
                            if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                                td4.o(fo7Var3.b.d(), null, null, av8Var4, 0, 6);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }), av8Var, 384);
            o(oea.v(R.string.fantasy_league_managers, av8Var), p8gVar.a(1.0f, utcVar, true), yqo.H(1576432212, av8Var, new jo6(j67Var, 21)), av8Var, 384);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            fo7Var2 = fo7Var;
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new b30(fo7Var2, function1, xtcVar2, i2, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k0(j20 j20Var, jwj jwjVar, cej cejVar, qu9 qu9Var, i43 i43Var, w9j w9jVar, b1d b1dVar, hsk hskVar, x9j x9jVar, sq3 sq3Var) {
        y30 y30Var;
        int i2;
        if (sq3Var instanceof y30) {
            y30Var = (y30) sq3Var;
            int i3 = y30Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y30Var.s = i3 - Integer.MIN_VALUE;
                y30 y30Var2 = y30Var;
                Object obj = y30Var2.r;
                lu3 lu3Var = lu3.a;
                i2 = y30Var2.s;
                if (i2 == 0) {
                    if (i2 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    y6a.M(obj);
                    View view = j20Var.a;
                    z41 fe3Var = Build.VERSION.SDK_INT >= 34 ? new fe3(view) : new z41(view);
                    y30Var2.s = 1;
                    l0(j20Var, jwjVar, cejVar, qu9Var, i43Var, w9jVar, fe3Var, b1dVar, hskVar, x9jVar, y30Var2);
                    return;
                }
            }
        }
        y30Var = new y30(sq3Var);
        y30 y30Var22 = y30Var;
        Object obj2 = y30Var22.r;
        lu3 lu3Var2 = lu3.a;
        i2 = y30Var22.s;
        if (i2 == 0) {
        }
    }

    public static final void l(j67 j67Var, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        utc utcVar;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1711644461);
        int i4 = i2 | (av8Var.g(j67Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | 384;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            String str = j67Var.g;
            FantasyLeagueType fantasyLeagueType = j67Var.j;
            FantasyLeagueType fantasyLeagueType2 = FantasyLeagueType.PRIVATE;
            utc utcVar2 = utc.a;
            if (fantasyLeagueType != fantasyLeagueType2 || str == null || StringsKt.R(str)) {
                utcVar = utcVar2;
                av8Var.d0(-1747333075);
                if (fantasyLeagueType == null) {
                    av8Var.d0(-1747333076);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1747333075);
                    int i5 = p37.a[fantasyLeagueType.ordinal()];
                    if (i5 == 1) {
                        i3 = R.string.fantasy_global_league;
                    } else if (i5 == 2) {
                        i3 = R.string.fantasy_country_league;
                    } else if (i5 == 3) {
                        i3 = R.string.fantasy_random_league;
                    } else {
                        if (i5 != 4) {
                            zzl.b();
                            return;
                        }
                        i3 = R.string.fantasy_private_league;
                    }
                    String v2 = oea.v(i3, av8Var);
                    yf8 yf8Var = xth.a;
                    udj.c(v2, utcVar, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 48, 24960, 110584);
                    av8Var = av8Var;
                    av8Var.s(false);
                    Unit unit = Unit.a;
                }
                av8Var.s(false);
            } else {
                av8Var.d0(-1748107176);
                xtc d2 = bkh.d(utcVar2, 1.0f);
                l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(av8Var, d2);
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
                if (z) {
                    av8Var.d0(847048878);
                    kq9.b(s6a.N(R.drawable.ic_shield_person, 6, av8Var), null, bkh.l(utcVar2, 16.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 432, 0);
                    av8Var.s(false);
                } else {
                    av8Var.d0(847308782);
                    av8Var.s(false);
                }
                yf8 yf8Var2 = xth.a;
                utcVar = utcVar2;
                udj.c(str, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(true);
                av8Var.s(false);
            }
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new t60((Object) j67Var, z, xtcVar2, i2, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l0(j20 j20Var, jwj jwjVar, cej cejVar, qu9 qu9Var, Function1 function1, Function0 function0, z41 z41Var, b1d b1dVar, hsk hskVar, Function1 function12, sq3 sq3Var) {
        z30 z30Var;
        int i2;
        if (sq3Var instanceof z30) {
            z30Var = (z30) sq3Var;
            int i3 = z30Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z30Var.s = i3 - Integer.MIN_VALUE;
                Object obj = z30Var.r;
                lu3 lu3Var = lu3.a;
                i2 = z30Var.s;
                if (i2 != 0) {
                    y6a.M(obj);
                    d40 d40Var = new d40(b1dVar, jwjVar, cejVar, z41Var, j20Var, qu9Var, function1, function0, hskVar, function12, null);
                    z30Var.s = 1;
                    if (s9a.r(d40Var, z30Var) == lu3Var) {
                        return;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    y6a.M(obj);
                }
                pvd.x();
            }
        }
        z30Var = new z30(sq3Var);
        Object obj2 = z30Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = z30Var.s;
        if (i2 != 0) {
        }
        pvd.x();
    }

    public static final void m(j67 j67Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1454006540);
        int i3 = (av8Var2.g(j67Var) ? 4 : 2) | i2;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            FantasyLeagueType fantasyLeagueType = j67Var != null ? j67Var.j : null;
            int i4 = fantasyLeagueType == null ? -1 : p37.a[fantasyLeagueType.ordinal()];
            if (i4 == 1) {
                xtcVar2 = xtcVar;
                av8Var = av8Var2;
                av8Var.d0(-1563491809);
                td4.i(1468, xtcVar2, av8Var, 54);
                av8Var.s(false);
            } else if (i4 != 2) {
                av8Var2.d0(-1563151367);
                av8Var = av8Var2;
                wkn.l(s6a.N(R.drawable.ic_sofascore_2, 6, av8Var2), l98.b0(n9e.q(xtcVar, lz.D(R.color.primary_default, av8Var2), oyn.e), 4.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 48, 120);
                av8Var.s(false);
                xtcVar2 = xtcVar;
            } else {
                av8Var2.d0(-1563311420);
                xtcVar2 = xtcVar;
                td4.k(j67Var.i, xtcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 48, 12);
                av8Var = av8Var2;
                av8Var.s(false);
            }
        } else {
            xtcVar2 = xtcVar;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new kz6(j67Var, xtcVar2, i2, 3);
        }
    }

    public static final void n(int i2, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1927004609);
        int i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            ff5 ff5Var = dh3.h;
            tol.b(ff5Var.a(new nx4(((kx4) av8Var.k(ff5Var)).j(), 1.0f)), yqo.H(-2024283777, av8Var, new l63(xtcVar)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new l63(xtcVar, i2, 11);
        }
    }

    public static final void o(String str, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2) {
        tc3 tc3Var2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-365702715);
        int i3 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(xtcVar) ? 32 : 16);
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            ng0 ng0Var = new ng0(2.0f, true, new a70(6));
            xtc d0 = l98.d0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var2, 54);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.c(), av8Var2, 0, 24960, 109562);
            av8Var = av8Var2;
            xtc e2 = bkh.e(utc.a, 20.0f);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e2);
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
            tc3Var2 = tc3Var;
            tc3Var2.invoke(av8Var, 6);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            tc3Var2 = tc3Var;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new j93(str, xtcVar, tc3Var2, i2, 1);
        }
    }

    public static final qug o0(of3 of3Var) {
        Object[] objArr = new Object[0];
        boolean e2 = ((av8) of3Var).e(0);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (e2 || O == nf3.a) {
            O = new dtg(1);
            av8Var.n0(O);
        }
        return (qug) o3a.M(objArr, qug.j, (Function0) O, av8Var, 0);
    }

    public static final void p(cy5 cy5Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-42363340);
        int i3 = i2 | (av8Var.g(cy5Var) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
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
            xtc d2 = bkh.d(utcVar, 1.0f);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String str = cy5Var.b;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.e(), av8Var, 0, 24576, 114682);
            String str2 = cy5Var.a;
            dfj b2 = xth.b();
            long D = lz.D(R.color.n_lv_1, av8Var);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            udj.c(str2, l98.d0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, b2, av8Var, 0, 24960, 109560);
            udj.c(cy5Var.c, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.e(), av8Var, 0, 24576, 114682);
            av8Var = av8Var;
            utc utcVar2 = utcVar;
            bf3.t(av8Var, true, utcVar2, 8.0f, av8Var);
            xtc d3 = bkh.d(utcVar2, 1.0f);
            l8g a4 = k8g.a(wxfVar, uxf.l, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            ff5 ff5Var = dh3.n;
            Object k2 = av8Var.k(ff5Var);
            ema emaVar = ema.b;
            if (k2 == emaVar) {
                emaVar = ema.a;
            }
            tol.b(ff5Var.a(emaVar), yqo.H(-202775611, av8Var, new fv2(cy5Var, 27)), av8Var, 56);
            nq8.h(av8Var, bkh.p(utcVar2, 16.0f));
            long U = U(cy5Var.g, av8Var, false, cy5Var.f);
            long j2 = r13.h;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc q2 = n9e.q(wnn.A(bkh.e(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 6.0f), o7g.a(16.0f)), lz.D(R.color.n_lv_5, av8Var), oyn.e);
            boolean z = (i3 & 14) == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new wb6(cy5Var, 0);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new au5(25);
                av8Var.n0(O2);
            }
            ncf.c(function0, q2, U, j2, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function1) O2, av8Var, 1772544);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ns4(cy5Var, xtcVar2, i2, 16);
        }
    }

    public static void p0(int i2, Context context) {
        context.getClass();
        rq3 rq3Var = null;
        kq7 kq7Var = new kq7(i2, rq3Var, 1);
        ia0 ia0Var = ia0.q;
        ia0 p2 = ok3.p();
        d17 d17Var = new d17(kq7Var, rq3Var, 13);
        hs4 hs4Var = z45.a;
        p2.b(rob.a, d17Var);
        Pair[] pairArr = {new Pair("ACTION", "REMOVE_COMPETITION"), new Pair("COMPETITION_ID", Integer.valueOf(i2))};
        hpo hpoVar = new hpo(18);
        for (int i3 = 0; i3 < 2; i3++) {
            Pair pair = pairArr[i3];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l2 = hpoVar.l();
        vxd.h(context).b("FantasyWorker-".concat(mha.o(l2)), nf6.a, (ltd) vxd.g(FantasyWorker.class, l2).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long q(float f2, float f3, float f4, float f5, j23 j23Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (j23Var.c()) {
            d8k d8kVar = e8k.b;
            long j2 = ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f))) << 32;
            int i11 = r13.j;
            return j2;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        int i12 = floatToRawIntBits >>> 31;
        int i13 = (floatToRawIntBits >>> 23) & 255;
        int i14 = floatToRawIntBits & 8388607;
        int i15 = 49;
        int i16 = 0;
        if (i13 == 255) {
            i3 = i14 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i13 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else if (i2 > 0) {
                int i17 = i14 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i17) + 1) | (i12 << 15);
                    short s2 = (short) i4;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    int i18 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i19 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i19 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i6 = 49;
                            i7 = 0;
                        } else if (i6 > 0) {
                            int i20 = i19 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i20) + 1) | (i18 << 15);
                                short s3 = (short) i8;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                int i21 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i22 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i16 = i22 == 0 ? 0 : 512;
                                    i15 = 31;
                                } else {
                                    int i23 = i9 - 112;
                                    if (i23 < 31) {
                                        if (i23 > 0) {
                                            i16 = i22 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i10 = (((i23 << 10) | i16) + 1) | (i21 << 15);
                                                long max = ((((short) i10) & 65535) << 16) | ((s2 & 65535) << 48) | ((s3 & 65535) << 32) | ((((int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (j23Var.c & 63);
                                                d8k d8kVar2 = e8k.b;
                                                int i24 = r13.j;
                                                return max;
                                            }
                                            i15 = i23;
                                        } else if (i23 >= -10) {
                                            int i25 = (i22 | 8388608) >> (1 - i23);
                                            if ((i25 & 4096) != 0) {
                                                i25 += 8192;
                                            }
                                            i15 = 0;
                                            i16 = i25 >> 13;
                                        } else {
                                            i15 = 0;
                                        }
                                    }
                                }
                                i10 = (i21 << 15) | (i15 << 10) | i16;
                                long max2 = ((((short) i10) & 65535) << 16) | ((s2 & 65535) << 48) | ((s3 & 65535) << 32) | ((((int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (j23Var.c & 63);
                                d8k d8kVar22 = e8k.b;
                                int i242 = r13.j;
                                return max2;
                            }
                            i7 = i20;
                        } else if (i6 >= -10) {
                            int i26 = (i19 | 8388608) >> (1 - i6);
                            if ((i26 & 4096) != 0) {
                                i26 += 8192;
                            }
                            i7 = i26 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i18 << 15) | (i6 << 10);
                    short s32 = (short) i8;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f4);
                    int i212 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i222 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i10 = (i212 << 15) | (i15 << 10) | i16;
                    long max22 = ((((short) i10) & 65535) << 16) | ((s2 & 65535) << 48) | ((s32 & 65535) << 32) | ((((int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (j23Var.c & 63);
                    d8k d8kVar222 = e8k.b;
                    int i2422 = r13.j;
                    return max22;
                }
                i3 = i17;
            } else if (i2 >= -10) {
                int i27 = (i14 | 8388608) >> (1 - i2);
                if ((i27 & 4096) != 0) {
                    i27 += 8192;
                }
                i3 = i27 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i12 << 15) | (i2 << 10);
        short s22 = (short) i4;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f3);
        int i182 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i192 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i182 << 15) | (i6 << 10);
        short s322 = (short) i8;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f4);
        int i2122 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2222 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i10 = (i2122 << 15) | (i15 << 10) | i16;
        long max222 = ((((short) i10) & 65535) << 16) | ((s22 & 65535) << 48) | ((s322 & 65535) << 32) | ((((int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (j23Var.c & 63);
        d8k d8kVar2222 = e8k.b;
        int i24222 = r13.j;
        return max222;
    }

    public static xtc q0(xtc xtcVar, qug qugVar, boolean z, boolean z2) {
        ewd ewdVar = z2 ? ewd.a : ewd.b;
        xzc xzcVar = qugVar.d;
        ewd ewdVar2 = ewd.a;
        utc utcVar = utc.a;
        return xtcVar.z(ewdVar == ewdVar2 ? wnn.A(utcVar, jf9.c) : wnn.A(utcVar, jf9.b)).z(new uug(null, null, xzcVar, ewdVar, null, qugVar, z, true)).z(new nvg(qugVar, z2));
    }

    public static void r(int i2, Context context) {
        context.getClass();
        rq3 rq3Var = null;
        int i3 = 0;
        kq7 kq7Var = new kq7(i2, rq3Var, i3);
        ia0 ia0Var = ia0.q;
        ia0 p2 = ok3.p();
        d17 d17Var = new d17(kq7Var, rq3Var, 13);
        hs4 hs4Var = z45.a;
        p2.b(rob.a, d17Var);
        Pair[] pairArr = {new Pair("ACTION", "ADD_COMPETITION"), new Pair("COMPETITION_ID", Integer.valueOf(i2))};
        hpo hpoVar = new hpo(18);
        while (i3 < 2) {
            Pair pair = pairArr[i3];
            hpoVar.B(pair.b, (String) pair.a);
            i3++;
        }
        md4 l2 = hpoVar.l();
        vxd.h(context).b("FantasyWorker-".concat(mha.o(l2)), nf6.a, (ltd) vxd.g(FantasyWorker.class, l2).a());
    }

    public static final void r0(Function2 function2, c3 c3Var, c3 c3Var2) {
        try {
            rq3 b2 = z9a.b(z9a.a(c3Var, c3Var2, function2));
            p2g p2gVar = w2g.b;
            t45.a(b2, Unit.a);
        } catch (Throwable th) {
            G(c3Var2, th);
            throw null;
        }
    }

    public static final void s(int i2, View view) {
        tz1 tz1Var = new tz1(i2, view);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(view, tz1Var);
    }

    public static final int s0(long j2) {
        float[] fArr = l23.a;
        long b2 = r13.b(j2, l23.e) >>> 32;
        d8k d8kVar = e8k.b;
        return (int) b2;
    }

    public static final void t(int i2, View view) {
        uz1 uz1Var = new uz1(i2, 0);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(view, uz1Var);
    }

    public static int t0(byte[] bArr, int i2) {
        int i3;
        synchronized (t) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = u;
                    if (iArr.length <= i5) {
                        iArr = Arrays.copyOf(iArr, iArr.length * 2);
                        u = iArr;
                    }
                    iArr[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = u[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static final float u(float f2, of3 of3Var, int i2) {
        if ((i2 & 1) != 0) {
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        WeakHashMap weakHashMap = cal.w;
        return xw3.s(qea.p(of3Var).e, of3Var).a() + (kik.s ? 84.0f : 56.0f) + f2;
    }

    public static xtc u0(xtc xtcVar, qug qugVar, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return q0(xtcVar, qugVar, z, true);
    }

    public static void v(List list, int i2, ujg ujgVar) {
        if (ujgVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ERRORCODE", String.valueOf(i2));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ujgVar.J(tz9.K((String) it.next(), hashMap));
        }
    }

    public static void z(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public abstract x3 M(g4 g4Var);

    public abstract f4 N(g4 g4Var);

    public abstract void m0(f4 f4Var, f4 f4Var2);

    public abstract void n0(f4 f4Var, Thread thread);

    public abstract boolean w(g4 g4Var, x3 x3Var, x3 x3Var2);

    public abstract boolean x(g4 g4Var, Object obj, Object obj2);

    public abstract boolean y(g4 g4Var, f4 f4Var, f4 f4Var2);
}
