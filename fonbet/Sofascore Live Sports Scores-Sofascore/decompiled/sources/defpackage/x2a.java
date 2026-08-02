package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.format.DateFormat;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.shared.models.shared_models.BaseLayerDto;
import com.blaze.blazesdk.features.shared.models.shared_models.ContentDto;
import com.blaze.blazesdk.features.shared.models.shared_models.RenditionsDto;
import com.blaze.blazesdk.features.shared.models.shared_models.c;
import com.blaze.blazesdk.features.shared.models.ui_shared.BaseLayerType;
import com.facebook.AccessToken;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.facebook.d0;
import com.facebook.h0;
import com.facebook.internal.p0;
import com.facebook.t;
import com.google.android.gms.internal.ads.zzguk;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.network.response.TwitterAccount;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class x2a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static Intent A(Context context, int i, Intent intent) {
        context.getClass();
        Intent intent2 = new Intent(context, (Class<?>) MmaFightNightActivity.class);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("ARG_TOURNAMENT_ID", i);
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent2.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent2.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent2;
    }

    public static final String B(Context context) {
        SharedPreferences d;
        context.getClass();
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        String string = sharedPreferences.getString("PREF_ODDS", "DECIMAL");
        string.getClass();
        return string;
    }

    public static final int C(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static xh2 D(CoroutineContext coroutineContext, Function2 function2) {
        nu3 nu3Var = nu3.a;
        coroutineContext.getClass();
        return f5p.A(new li3(7, coroutineContext, nu3Var, function2));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E(Context context, ylb ylbVar, String str, String str2, String str3, String str4, sq3 sq3Var) {
        rwf rwfVar;
        lu3 lu3Var;
        int i;
        String str5;
        String str6;
        String str7;
        Context context2;
        plb plbVar;
        Context context3;
        Object R;
        String str8;
        plb plbVar2;
        String str9;
        Object R2;
        if (sq3Var instanceof rwf) {
            rwfVar = (rwf) sq3Var;
            int i2 = rwfVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rwfVar.w = i2 - Integer.MIN_VALUE;
                Object obj = rwfVar.v;
                lu3Var = lu3.a;
                i = rwfVar.w;
                int i3 = 1;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    qmb F = F(context, ylbVar, str4);
                    rwfVar.r = context;
                    str5 = str;
                    rwfVar.s = str5;
                    rwfVar.t = str2;
                    str6 = str3;
                    rwfVar.u = str6;
                    rwfVar.w = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(rwfVar));
                    lj2Var.t();
                    F.b(new qwf(lj2Var, 0));
                    F.a(new qwf(lj2Var, i3));
                    obj = lj2Var.q();
                    if (obj != lu3Var) {
                        str7 = str2;
                        context2 = context;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        plb plbVar3 = (plb) rwfVar.r;
                        y6a.M(obj);
                        return plbVar3;
                    }
                    plbVar2 = (plb) rwfVar.u;
                    str9 = rwfVar.t;
                    str8 = rwfVar.s;
                    context3 = (Context) rwfVar.r;
                    y6a.M(obj);
                    rwfVar.r = plbVar2;
                    rwfVar.s = null;
                    rwfVar.t = null;
                    rwfVar.u = null;
                    rwfVar.w = 3;
                    if (plbVar2.f.isEmpty()) {
                        hs4 hs4Var = z45.a;
                        Context context4 = context3;
                        R2 = xw3.R(hq4.c, new t53(plbVar2, context4, str8, str9, null, 9), rwfVar);
                        if (R2 != lu3Var) {
                            R2 = Unit.a;
                        }
                    } else {
                        R2 = Unit.a;
                    }
                    return R2 != lu3Var ? lu3Var : plbVar2;
                }
                String str10 = (String) rwfVar.u;
                String str11 = rwfVar.t;
                String str12 = rwfVar.s;
                context2 = (Context) rwfVar.r;
                y6a.M(obj);
                str6 = str10;
                str7 = str11;
                str5 = str12;
                plbVar = (plb) obj;
                rwfVar.r = context2;
                rwfVar.s = str7;
                rwfVar.t = str6;
                rwfVar.u = plbVar;
                rwfVar.w = 2;
                if (plbVar.d.isEmpty()) {
                    hs4 hs4Var2 = z45.a;
                    Context context5 = context2;
                    context3 = context5;
                    R = xw3.R(hq4.c, new k50(plbVar, context5, str5, rq3Var, 18), rwfVar);
                    if (R != lu3Var) {
                        R = Unit.a;
                    }
                } else {
                    R = Unit.a;
                    context3 = context2;
                }
                if (R != lu3Var) {
                    str8 = str7;
                    plbVar2 = plbVar;
                    str9 = str6;
                    rwfVar.r = plbVar2;
                    rwfVar.s = null;
                    rwfVar.t = null;
                    rwfVar.u = null;
                    rwfVar.w = 3;
                    if (plbVar2.f.isEmpty()) {
                    }
                    if (R2 != lu3Var) {
                    }
                }
            }
        }
        rwfVar = new rwf(sq3Var);
        Object obj2 = rwfVar.v;
        lu3Var = lu3.a;
        i = rwfVar.w;
        int i32 = 1;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        plbVar = (plb) obj2;
        rwfVar.r = context2;
        rwfVar.s = str7;
        rwfVar.t = str6;
        rwfVar.u = plbVar;
        rwfVar.w = 2;
        if (plbVar.d.isEmpty()) {
        }
        if (R != lu3Var) {
        }
    }

    public static final qmb F(Context context, ylb ylbVar, String str) {
        if (!(ylbVar instanceof ylb)) {
            zzl.b();
            return null;
        }
        if (!Intrinsics.c(str, "__LottieInternalDefaultCacheKey__")) {
            return ulb.f(context, ylbVar.a, str);
        }
        int i = ylbVar.a;
        return ulb.f(context, i, ulb.l(i, context));
    }

    public static final d0 G(AccessToken accessToken, Uri uri, p0 p0Var) {
        uri.getClass();
        String path = uri.getPath();
        boolean equalsIgnoreCase = U3.i.b.equalsIgnoreCase(uri.getScheme());
        h0 h0Var = h0.b;
        if (equalsIgnoreCase && path != null) {
            GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType = new GraphRequest$ParcelableResourceWithMimeType(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(U3.i.b, graphRequest$ParcelableResourceWithMimeType);
            return new d0(accessToken, "me/staging_resources", bundle, h0Var, p0Var);
        }
        if (!HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equalsIgnoreCase(uri.getScheme())) {
            t.a("The image Uri must be either a file:// or content:// Uri");
            return null;
        }
        GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType2 = new GraphRequest$ParcelableResourceWithMimeType(uri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable(U3.i.b, graphRequest$ParcelableResourceWithMimeType2);
        return new d0(accessToken, "me/staging_resources", bundle2, h0Var, p0Var);
    }

    public static long H(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    public static final xlb I(ylb ylbVar, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.e0(-1248473602);
        int i = 3;
        xf2 xf2Var = new xf2(i, null, i);
        Context context = (Context) av8Var.k(nz.b);
        av8Var.e0(1388713953);
        boolean g = av8Var.g(ylbVar);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (g || O == a99Var) {
            O = e.f(new xlb());
            av8Var.n0(O);
        }
        e1d e1dVar = (e1d) O;
        av8Var.s(false);
        av8Var.e0(1388714244);
        boolean g2 = av8Var.g(ylbVar) | av8Var.g("__LottieInternalDefaultCacheKey__");
        Object O2 = av8Var.O();
        if (g2 || O2 == a99Var) {
            O2 = F(context, ylbVar, "__LottieInternalDefaultCacheKey__");
            av8Var.n0(O2);
        }
        av8Var.s(false);
        hz8.q(ylbVar, "__LottieInternalDefaultCacheKey__", new jr5(xf2Var, context, ylbVar, e1dVar, (rq3) null), av8Var);
        xlb xlbVar = (xlb) e1dVar.getValue();
        av8Var.s(false);
        return xlbVar;
    }

    public static final xhf J(of3 of3Var) {
        Object[] objArr = new Object[0];
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = new s8f(13);
            av8Var.n0(O);
        }
        return (xhf) o3a.M(objArr, xhf.b, (Function0) O, av8Var, 384);
    }

    public static TypedValue K(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean L(Resources.Theme theme, int i, boolean z) {
        TypedValue K = K(theme, i);
        return (K == null || K.type != 18) ? z : K.data != 0;
    }

    public static int M(Context context, int i, int i2) {
        TypedValue K = K(context.getTheme(), i);
        return (K == null || K.type != 16) ? i2 : K.data;
    }

    public static int N(Context context) {
        Resources.Theme theme = context.getTheme();
        TypedValue K = K(theme, R.attr.minTouchTargetSize);
        float dimension = (K == null || K.type != 5) ? Float.NaN : K.getDimension(theme.getResources().getDisplayMetrics());
        return Float.isNaN(dimension) ? (int) context.getResources().getDimension(R.dimen.mtrl_min_touch_target_size) : (int) dimension;
    }

    public static TypedValue O(int i, View view) {
        return P(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static TypedValue P(Context context, int i, String str) {
        TypedValue K = K(context.getTheme(), i);
        if (K != null) {
            return K;
        }
        sw9.n("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(xh9 xh9Var, sq3 sq3Var) {
        wpg wpgVar;
        int i;
        if (sq3Var instanceof wpg) {
            wpgVar = (wpg) sq3Var;
            int i2 = wpgVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wpgVar.t = i2 - Integer.MIN_VALUE;
                Object obj = wpgVar.s;
                lu3 lu3Var = lu3.a;
                i = wpgVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    db2 c2 = xh9Var.d().c();
                    wpgVar.r = xh9Var;
                    wpgVar.t = 1;
                    obj = l6g.Q(c2, wpgVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xh9Var = wpgVar.r;
                    y6a.M(obj);
                }
                bwh bwhVar = (bwh) obj;
                bwhVar.getClass();
                return new xpg(xh9Var.a, xh9Var.c(), xh9Var.d(), yaa.M(bwhVar, -1));
            }
        }
        wpgVar = new wpg(sq3Var);
        Object obj2 = wpgVar.s;
        lu3 lu3Var2 = lu3.a;
        i = wpgVar.t;
        if (i != 0) {
        }
        bwh bwhVar2 = (bwh) obj2;
        bwhVar2.getClass();
        return new xpg(xh9Var.a, xh9Var.c(), xh9Var.d(), yaa.M(bwhVar2, -1));
    }

    public static r5a R(int i, ml6 ml6Var, nkk nkkVar) {
        r5a d = r5a.d(ml6Var, nkkVar);
        while (true) {
            int i2 = d.a;
            if (i2 == i) {
                return d;
            }
            m6k.f0();
            long j = d.b + 8;
            if (j > 2147483647L) {
                throw r9e.b("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            ml6Var.skipFully((int) j);
            d = r5a.d(ml6Var, nkkVar);
        }
    }

    public static void S(int i, Context context) {
        context.getClass();
        context.startActivity(A(context, i, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void T(rq3 rq3Var, Throwable th) {
        dka dkaVar;
        int i;
        if (rq3Var instanceof dka) {
            dkaVar = (dka) rq3Var;
            int i2 = dkaVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dkaVar.s = i2 - Integer.MIN_VALUE;
                Object obj = dkaVar.r;
                lu3 lu3Var = lu3.a;
                i = dkaVar.s;
                if (i == 0) {
                    if (i == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    y6a.M(obj);
                    dkaVar.s = 1;
                    z45.a.i(dkaVar.getContext(), new a8p(14, dkaVar, th));
                    return;
                }
            }
        }
        dkaVar = new dka(rq3Var);
        Object obj2 = dkaVar.r;
        lu3 lu3Var2 = lu3.a;
        i = dkaVar.s;
        if (i == 0) {
        }
    }

    public static void U(z82 z82Var) {
        LinearLayout linearLayout = (LinearLayout) z82Var.g;
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) z82Var.e;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        ((ViewGroup.MarginLayoutParams) tl3Var).width = 0;
        tl3Var.u = scrollInterceptorHorizontalScrollView.getId();
        linearLayout.setLayoutParams(tl3Var);
        ViewGroup.LayoutParams layoutParams2 = scrollInterceptorHorizontalScrollView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var2 = (tl3) layoutParams2;
        Context context = ((ConstraintLayout) z82Var.b).getContext();
        context.getClass();
        ((ViewGroup.MarginLayoutParams) tl3Var2).width = ao2.s(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, context);
        scrollInterceptorHorizontalScrollView.setLayoutParams(tl3Var2);
    }

    public static long V(double d) {
        zzguk.b("not a normal value", X(d));
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L;
    }

    public static String W(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b2);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean X(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static final void a(a88 a88Var, long j, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1353562852);
        int i2 = (av8Var.g(a88Var) ? 4 : 2) | i | (av8Var.f(j) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            Object obj = O;
            if (O == a99Var) {
                b20 a2 = e20.a();
                a2.j(1);
                av8Var.n0(a2);
                obj = a2;
            }
            b20 b20Var = (b20) obj;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = goh.b(new ate(a88Var, 20));
                av8Var.n0(O2);
            }
            cdi b2 = a60.b(((Number) ((cdi) O2).getValue()).floatValue(), ufa.I(bwc.c, av8Var), null, av8Var, 0, 28);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object O3 = av8Var.O();
            if (z || O3 == a99Var) {
                O3 = new mme(a88Var, 12);
                av8Var.n0(O3);
            }
            AtomicInteger atomicInteger = o3h.a;
            xtc l = bkh.l(new ew2((Function1) O3), 16.0f);
            boolean g = ((i2 & 112) == 32) | (i3 == 4) | av8Var.g(b2) | av8Var.i(b20Var);
            Object O4 = av8Var.O();
            if (g || O4 == a99Var) {
                lz1 lz1Var = new lz1(3, j, a88Var, b2, b20Var);
                av8Var.n0(lz1Var);
                O4 = lz1Var;
            }
            lz.d(0, av8Var, l, (Function1) O4);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o47(a88Var, j, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0503, code lost:
    
        if (r8 == r1) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0728 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0413  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(xel xelVar, wla wlaVar, xtc xtcVar, float f, Function1 function1, of3 of3Var, int i) {
        int i2;
        xel xelVar2;
        boolean z;
        utc utcVar;
        xtc q;
        Integer num;
        boolean z2;
        boolean i3;
        Object O;
        boolean z3;
        int i4;
        int i5;
        int i6;
        long f2;
        String a2;
        boolean z4;
        String str;
        char c2;
        long j;
        String str2;
        a99 a99Var;
        String str3;
        boolean z5;
        int i7;
        int i8;
        long f3;
        utc utcVar2;
        Integer num2;
        av8 av8Var;
        boolean z6;
        boolean z7;
        and andVar;
        f50 f50Var;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var2;
        f50 f50Var3;
        float f4;
        utc utcVar3;
        boolean z8;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-544818019);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(xelVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? av8Var2.g(wlaVar) : av8Var2.i(wlaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.d(f) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.i(function1) ? 16384 : 8192;
        }
        if (av8Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) av8Var2.k(nz.b);
            wn1 wn1Var = xelVar.a;
            boolean z9 = xelVar.g;
            boolean c3 = wn1Var.c();
            boolean b2 = wn1Var.b();
            long j2 = wn1Var.p;
            String str4 = wn1Var.r;
            String str5 = wn1Var.q;
            Integer num3 = wn1Var.u;
            if (c3) {
                int i9 = ke0.c;
                if (zu3.V.hasMcc(Integer.valueOf(i9)) || zu3.d0.hasMcc(Integer.valueOf(i9)) || zu3.z.hasMcc(Integer.valueOf(i9))) {
                    z = true;
                    mv1 mv1Var = uxf.c;
                    k1c c4 = e12.c(mv1Var, false);
                    int i10 = i2;
                    boolean z10 = z;
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, xtcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.q0();
                    } else {
                        av8Var2.l(zg3Var);
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var2, c4, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var2, m, ff3Var2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var2, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var2, C, f50Var6);
                    av8Var2.d0(-1555907746);
                    av8Var2.d0(-1555911653);
                    utcVar = utc.a;
                    xtc A = wnn.A(bkh.c(fz8.d0(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), n9a.b), 1.0f), o7g.a(16.0f));
                    long D = lz.D(R.color.surface_1, av8Var2);
                    jf9 jf9Var = oyn.e;
                    q = n9e.q(A, D, jf9Var);
                    if (c3) {
                        num = num3;
                    } else {
                        num = num3;
                        q = q.z(n9e.q(utcVar, r13.c(lz.D(R.color.live, av8Var2), 0.1f), jf9Var));
                    }
                    av8Var2.s(false);
                    if (!c3 || z9) {
                        q = q.z(yso.o(utcVar, 2.0f, !c3 ? ljg.f(av8Var2, -1087210443, R.color.live, av8Var2, false) : ljg.f(av8Var2, -1087209962, R.color.value, av8Var2, false), o7g.a(16.0f)));
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    av8Var2.s(z2);
                    int i11 = i10 & 14;
                    i3 = (i11 != 4 ? true : z2) | av8Var2.i(context);
                    O = av8Var2.O();
                    a99 a99Var2 = nf3.a;
                    if (!i3 || O == a99Var2) {
                        O = new yel(context, xelVar, 1);
                        av8Var2.n0(O);
                    }
                    Integer num4 = num;
                    zg3 zg3Var2 = zg3Var;
                    xtc b0 = l98.b0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var2, 31), 8.0f);
                    p4h p4hVar = ww9.d;
                    kv1 kv1Var = uxf.o;
                    u23 a3 = t23.a(p4hVar, kv1Var, av8Var2, 0);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.q0();
                    } else {
                        av8Var2.l(zg3Var2);
                    }
                    waa.K(av8Var2, a3, f50Var4);
                    waa.K(av8Var2, m2, ff3Var2);
                    bf3.s(hashCode2, av8Var2, f50Var5, av8Var2, ryVar2);
                    waa.K(av8Var2, C2, f50Var6);
                    if (c3) {
                        z3 = false;
                        if (z9) {
                            i5 = -1211064821;
                            i6 = R.color.value;
                        } else if (xelVar.f) {
                            i5 = -1211062924;
                            i6 = R.color.pedestal_bronze;
                        } else {
                            i4 = -1211061526;
                        }
                        f2 = ljg.f(av8Var2, i5, i6, av8Var2, false);
                        xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        long j3 = f2;
                        l8g a4 = k8g.a(ww9.f, uxf.l, av8Var2, 6);
                        int hashCode3 = Long.hashCode(av8Var2.T);
                        aee m3 = av8Var2.m();
                        xtc C3 = fqj.C(av8Var2, d0);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var2);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a4, f50Var4);
                        waa.K(av8Var2, m3, ff3Var2);
                        bf3.s(hashCode3, av8Var2, f50Var5, av8Var2, ryVar2);
                        waa.K(av8Var2, C3, f50Var6);
                        a2 = xelVar.b.a(av8Var2);
                        if (a2.length() <= 0) {
                            a2 = null;
                        }
                        if (a2 == null) {
                            av8Var2.d0(-100761785);
                            a2 = xelVar.c.a(av8Var2);
                            z4 = false;
                        } else {
                            z4 = false;
                            av8Var2.d0(-100764482);
                        }
                        av8Var2.s(z4);
                        String str6 = a2;
                        yf8 yf8Var = xth.a;
                        udj.c(str6, null, j3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
                        av8 av8Var3 = av8Var2;
                        if (Intrinsics.c(str5, StatusKt.STATUS_IN_PROGRESS)) {
                            String str7 = wn1Var.t;
                            if (str7 != null) {
                                str = l4a.O(str7);
                                if (str != null) {
                                    av8Var3.d0(1172047757);
                                    av8Var3.s(false);
                                    str2 = StatusKt.STATUS_NOT_STARTED;
                                } else {
                                    av8Var3.d0(1172047758);
                                    nq8.h(av8Var3, new goa(1.0f, true));
                                    dfj c5 = xth.c();
                                    if (c3) {
                                        c2 = 448;
                                        j = ljg.f(av8Var3, -575899132, R.color.live, av8Var3, false);
                                    } else {
                                        c2 = 448;
                                        av8Var3.d0(-575898647);
                                        av8Var3.s(false);
                                        j = j3;
                                    }
                                    str2 = StatusKt.STATUS_NOT_STARTED;
                                    udj.c(str, null, j, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, c5, av8Var3, 0, 0, 131066);
                                    av8Var3 = av8Var3;
                                    Unit unit = Unit.a;
                                    av8Var3.s(false);
                                }
                                av8Var3.s(true);
                                xtc d02 = l98.d0(bkh.d(bkh.q(utcVar, 118.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                lv1 lv1Var = uxf.m;
                                l8g a5 = k8g.a(ww9.h, lv1Var, av8Var3, 54);
                                int hashCode4 = Long.hashCode(av8Var3.T);
                                aee m4 = av8Var3.m();
                                xtc C4 = fqj.C(av8Var3, d02);
                                av8Var3.h0();
                                if (av8Var3.S) {
                                    av8Var3.q0();
                                } else {
                                    av8Var3.l(zg3Var2);
                                }
                                waa.K(av8Var3, a5, f50Var4);
                                waa.K(av8Var3, m4, ff3Var2);
                                bf3.s(hashCode4, av8Var3, f50Var5, av8Var3, ryVar2);
                                waa.K(av8Var3, C4, f50Var6);
                                xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                                u23 a6 = t23.a(new ng0(8.0f, true, new a70(6)), kv1Var, av8Var3, 6);
                                int hashCode5 = Long.hashCode(av8Var3.T);
                                aee m5 = av8Var3.m();
                                xtc C5 = fqj.C(av8Var3, f0);
                                av8Var3.h0();
                                if (av8Var3.S) {
                                    av8Var3.q0();
                                } else {
                                    av8Var3.l(zg3Var2);
                                }
                                waa.K(av8Var3, a6, f50Var4);
                                waa.K(av8Var3, m5, ff3Var2);
                                bf3.s(hashCode5, av8Var3, f50Var5, av8Var3, ryVar2);
                                waa.K(av8Var3, C5, f50Var6);
                                float f5 = 8.0f;
                                j(wn1Var.b, wn1Var.f, (b2 || (num4 != null && num4.intValue() == 1)) ? ljg.f(av8Var3, 394329881, R.color.n_lv_1, av8Var3, false) : ljg.f(av8Var3, 394329401, R.color.n_lv_3, av8Var3, false), av8Var3, 0);
                                j(wn1Var.c, wn1Var.i, (b2 || (num4 != null && num4.intValue() == 2)) ? ljg.f(av8Var3, 394339865, R.color.n_lv_1, av8Var3, false) : ljg.f(av8Var3, 394339385, R.color.n_lv_3, av8Var3, false), av8Var3, 0);
                                av8Var3.s(true);
                                if (ph0.a0(new String[]{str2, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_DELAYED}).contains(str5)) {
                                    a99Var = a99Var2;
                                    av8Var3.d0(-849606007);
                                    xtc f02 = l98.f0(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                                    u23 a7 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.q, av8Var3, 54);
                                    int hashCode6 = Long.hashCode(av8Var3.T);
                                    aee m6 = av8Var3.m();
                                    xtc C6 = fqj.C(av8Var3, f02);
                                    av8Var3.h0();
                                    if (av8Var3.S) {
                                        av8Var3.l(zg3Var2);
                                    } else {
                                        av8Var3.q0();
                                    }
                                    waa.K(av8Var3, a7, f50Var4);
                                    waa.K(av8Var3, m6, ff3Var2);
                                    bf3.s(hashCode6, av8Var3, f50Var5, av8Var3, ryVar2);
                                    waa.K(av8Var3, C6, f50Var6);
                                    Integer num5 = wn1Var.l;
                                    String k = num5 != null ? lnb.k(num5.intValue(), " (", ")") : "";
                                    Integer num6 = wn1Var.m;
                                    String k2 = num6 != null ? lnb.k(num6.intValue(), " (", ")") : "";
                                    Integer num7 = wn1Var.j;
                                    if (num7 == null || (str3 = String.valueOf(num7.intValue())) == null) {
                                        str3 = "";
                                    }
                                    String concat = str3.concat(k);
                                    dfj j4 = xth.j();
                                    if (c3) {
                                        i7 = 1624069653;
                                        i8 = R.color.live;
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                        if (num4 != null && num4.intValue() == 1) {
                                            f3 = ljg.f(av8Var3, 1624072213, R.color.n_lv_1, av8Var3, false);
                                            av8 av8Var4 = av8Var3;
                                            f5 = 8.0f;
                                            String str8 = k2;
                                            utcVar2 = utcVar;
                                            udj.c(concat, null, f3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j4, av8Var4, 0, 0, 131066);
                                            num2 = wn1Var.k;
                                            if (num2 != null || (r10 = String.valueOf(num2.intValue())) == null) {
                                                String str9 = "";
                                            }
                                            udj.c(str9.concat(str8), null, !c3 ? ljg.f(av8Var4, 1624085205, R.color.live, av8Var4, false) : (num4 != null && num4.intValue() == 2) ? ljg.f(av8Var4, 1624087765, R.color.n_lv_1, av8Var4, false) : ljg.f(av8Var4, 1624089365, R.color.n_lv_3, av8Var4, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var4, 0, 0, 131066);
                                            av8Var = av8Var4;
                                            z6 = true;
                                            av8Var.s(true);
                                            z7 = false;
                                            av8Var.s(false);
                                        } else {
                                            i7 = 1624073813;
                                            i8 = R.color.n_lv_3;
                                        }
                                    }
                                    f3 = ljg.f(av8Var3, i7, i8, av8Var3, z5);
                                    av8 av8Var42 = av8Var3;
                                    f5 = 8.0f;
                                    String str82 = k2;
                                    utcVar2 = utcVar;
                                    udj.c(concat, null, f3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j4, av8Var42, 0, 0, 131066);
                                    num2 = wn1Var.k;
                                    if (num2 != null) {
                                    }
                                    String str92 = "";
                                    udj.c(str92.concat(str82), null, !c3 ? ljg.f(av8Var42, 1624085205, R.color.live, av8Var42, false) : (num4 != null && num4.intValue() == 2) ? ljg.f(av8Var42, 1624087765, R.color.n_lv_1, av8Var42, false) : ljg.f(av8Var42, 1624089365, R.color.n_lv_3, av8Var42, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var42, 0, 0, 131066);
                                    av8Var = av8Var42;
                                    z6 = true;
                                    av8Var.s(true);
                                    z7 = false;
                                    av8Var.s(false);
                                } else {
                                    av8Var3.d0(-850220365);
                                    boolean f6 = av8Var3.f(j2);
                                    Object O2 = av8Var3.O();
                                    if (f6) {
                                        a99Var = a99Var2;
                                    } else {
                                        a99Var = a99Var2;
                                    }
                                    context.getClass();
                                    String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
                                    bestPattern.getClass();
                                    O2 = hk4.a(bestPattern).format(Instant.ofEpochSecond(j2));
                                    O2.getClass();
                                    av8Var3.n0(O2);
                                    av8 av8Var5 = av8Var3;
                                    udj.c((String) O2, bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 1), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var5, 48, 24960, 110584);
                                    av8Var = av8Var5;
                                    z7 = false;
                                    av8Var.s(false);
                                    utcVar2 = utcVar;
                                    z6 = true;
                                }
                                av8Var.s(z6);
                                xelVar2 = xelVar;
                                andVar = xelVar2.h;
                                goa goaVar = new goa(1.0f, z6);
                                k1c c6 = e12.c(mv1Var, z7);
                                int hashCode7 = Long.hashCode(av8Var.T);
                                aee m7 = av8Var.m();
                                xtc C7 = fqj.C(av8Var, goaVar);
                                av8Var.h0();
                                if (av8Var.S) {
                                    av8Var.q0();
                                } else {
                                    av8Var.l(zg3Var2);
                                }
                                waa.K(av8Var, c6, f50Var4);
                                waa.K(av8Var, m7, ff3Var2);
                                bf3.s(hashCode7, av8Var, f50Var5, av8Var, ryVar2);
                                waa.K(av8Var, C7, f50Var6);
                                if (andVar != null || z10) {
                                    f50Var = f50Var4;
                                    ff3Var = ff3Var2;
                                    ryVar = ryVar2;
                                    f50Var2 = f50Var5;
                                    f50Var3 = f50Var6;
                                    f4 = 4.0f;
                                    utcVar3 = utcVar2;
                                    z8 = false;
                                    av8Var.d0(31187847);
                                    av8Var.s(false);
                                } else {
                                    av8Var.d0(29243186);
                                    utc utcVar4 = utcVar2;
                                    xtc d03 = l98.d0(bkh.d(utcVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                                    boolean g = ((i10 & 57344) == 16384) | (i11 == 4) | av8Var.g(andVar) | av8Var.i(context);
                                    Object O3 = av8Var.O();
                                    if (g || O3 == a99Var) {
                                        O3 = new m61(function1, xelVar2, andVar, context);
                                        av8Var.n0(O3);
                                    }
                                    f50Var = f50Var4;
                                    f50Var3 = f50Var6;
                                    av8 av8Var6 = av8Var;
                                    xtc P = bea.P(d03, wlaVar, (Function0) O3, av8Var6, 6 | (i10 & 112), 6);
                                    String str10 = wn1Var.q;
                                    old oldVar = andVar.a;
                                    fgf fgfVar = andVar.b;
                                    long D2 = lz.D(R.color.surface_1, av8Var6);
                                    boolean i12 = av8Var6.i(context) | av8Var6.g(andVar) | (i11 == 4);
                                    Object O4 = av8Var6.O();
                                    if (i12 || O4 == a99Var) {
                                        O4 = new ncj(context, andVar, xelVar2, 12);
                                        av8Var6.n0(O4);
                                    }
                                    Function1 function12 = (Function1) O4;
                                    ryVar = ryVar2;
                                    f50Var2 = f50Var5;
                                    ff3Var = ff3Var2;
                                    utcVar3 = utcVar4;
                                    f4 = 4.0f;
                                    zg3Var2 = zg3Var2;
                                    nld.c(str10, fgfVar, D2, function12, P, oldVar, av8Var6, 27648);
                                    av8Var = av8Var6;
                                    z8 = false;
                                    av8Var.s(false);
                                }
                                av8Var.s(true);
                                xtc f03 = l98.f0(bkh.d(utcVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                l8g a8 = k8g.a(new ng0(f4, true, new l1(uxf.p, 5)), lv1Var, av8Var, 54);
                                int hashCode8 = Long.hashCode(av8Var.T);
                                aee m8 = av8Var.m();
                                xtc C8 = fqj.C(av8Var, f03);
                                av8Var.h0();
                                if (av8Var.S) {
                                    av8Var.q0();
                                } else {
                                    av8Var.l(zg3Var2);
                                }
                                waa.K(av8Var, a8, f50Var);
                                waa.K(av8Var, m8, ff3Var);
                                bf3.s(hashCode8, av8Var, f50Var2, av8Var, ryVar);
                                waa.K(av8Var, C8, f50Var3);
                                av8 av8Var7 = av8Var;
                                kq9.b(s6a.N(R.drawable.ic_location, 6, av8Var), null, bkh.l(utcVar3, 12.0f), j3, av8Var7, 432, 0);
                                udj.c(xelVar2.d, null, j3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var7, 0, 0, 131066);
                                av8Var2 = av8Var7;
                                av8Var2.s(true);
                                av8Var2.s(true);
                                if (z9) {
                                    av8Var2.d0(-979796277);
                                    av8Var2.s(z8);
                                } else {
                                    av8Var2.d0(-980090653);
                                    wkn.l(s6a.N(R.drawable.ic_world_cup_trophy, 6, av8Var2), f6a.D(n12.a.b(utcVar3), 0.8f, 0.8f), null, null, 0.1f, null, av8Var2, 196656, 88);
                                    av8Var2 = av8Var2;
                                    av8Var2.s(z8);
                                }
                                av8Var2.s(true);
                            }
                            str = str4;
                            if (str != null) {
                            }
                            av8Var3.s(true);
                            xtc d022 = l98.d0(bkh.d(bkh.q(utcVar, 118.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                            lv1 lv1Var2 = uxf.m;
                            l8g a52 = k8g.a(ww9.h, lv1Var2, av8Var3, 54);
                            int hashCode42 = Long.hashCode(av8Var3.T);
                            aee m42 = av8Var3.m();
                            xtc C42 = fqj.C(av8Var3, d022);
                            av8Var3.h0();
                            if (av8Var3.S) {
                            }
                            waa.K(av8Var3, a52, f50Var4);
                            waa.K(av8Var3, m42, ff3Var2);
                            bf3.s(hashCode42, av8Var3, f50Var5, av8Var3, ryVar2);
                            waa.K(av8Var3, C42, f50Var6);
                            xtc f04 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                            u23 a62 = t23.a(new ng0(8.0f, true, new a70(6)), kv1Var, av8Var3, 6);
                            int hashCode52 = Long.hashCode(av8Var3.T);
                            aee m52 = av8Var3.m();
                            xtc C52 = fqj.C(av8Var3, f04);
                            av8Var3.h0();
                            if (av8Var3.S) {
                            }
                            waa.K(av8Var3, a62, f50Var4);
                            waa.K(av8Var3, m52, ff3Var2);
                            bf3.s(hashCode52, av8Var3, f50Var5, av8Var3, ryVar2);
                            waa.K(av8Var3, C52, f50Var6);
                            float f52 = 8.0f;
                            j(wn1Var.b, wn1Var.f, (b2 || (num4 != null && num4.intValue() == 1)) ? ljg.f(av8Var3, 394329881, R.color.n_lv_1, av8Var3, false) : ljg.f(av8Var3, 394329401, R.color.n_lv_3, av8Var3, false), av8Var3, 0);
                            j(wn1Var.c, wn1Var.i, (b2 || (num4 != null && num4.intValue() == 2)) ? ljg.f(av8Var3, 394339865, R.color.n_lv_1, av8Var3, false) : ljg.f(av8Var3, 394339385, R.color.n_lv_3, av8Var3, false), av8Var3, 0);
                            av8Var3.s(true);
                            if (ph0.a0(new String[]{str2, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_DELAYED}).contains(str5)) {
                            }
                            av8Var.s(z6);
                            xelVar2 = xelVar;
                            andVar = xelVar2.h;
                            goa goaVar2 = new goa(1.0f, z6);
                            k1c c62 = e12.c(mv1Var, z7);
                            int hashCode72 = Long.hashCode(av8Var.T);
                            aee m72 = av8Var.m();
                            xtc C72 = fqj.C(av8Var, goaVar2);
                            av8Var.h0();
                            if (av8Var.S) {
                            }
                            waa.K(av8Var, c62, f50Var4);
                            waa.K(av8Var, m72, ff3Var2);
                            bf3.s(hashCode72, av8Var, f50Var5, av8Var, ryVar2);
                            waa.K(av8Var, C72, f50Var6);
                            if (andVar != null) {
                            }
                            f50Var = f50Var4;
                            ff3Var = ff3Var2;
                            ryVar = ryVar2;
                            f50Var2 = f50Var5;
                            f50Var3 = f50Var6;
                            f4 = 4.0f;
                            utcVar3 = utcVar2;
                            z8 = false;
                            av8Var.d0(31187847);
                            av8Var.s(false);
                            av8Var.s(true);
                            xtc f032 = l98.f0(bkh.d(utcVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            l8g a82 = k8g.a(new ng0(f4, true, new l1(uxf.p, 5)), lv1Var2, av8Var, 54);
                            int hashCode82 = Long.hashCode(av8Var.T);
                            aee m82 = av8Var.m();
                            xtc C82 = fqj.C(av8Var, f032);
                            av8Var.h0();
                            if (av8Var.S) {
                            }
                            waa.K(av8Var, a82, f50Var);
                            waa.K(av8Var, m82, ff3Var);
                            bf3.s(hashCode82, av8Var, f50Var2, av8Var, ryVar);
                            waa.K(av8Var, C82, f50Var3);
                            av8 av8Var72 = av8Var;
                            kq9.b(s6a.N(R.drawable.ic_location, 6, av8Var), null, bkh.l(utcVar3, 12.0f), j3, av8Var72, 432, 0);
                            udj.c(xelVar2.d, null, j3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var72, 0, 0, 131066);
                            av8Var2 = av8Var72;
                            av8Var2.s(true);
                            av8Var2.s(true);
                            if (z9) {
                            }
                            av8Var2.s(true);
                        } else {
                            if (Intrinsics.c(str5, StatusKt.STATUS_NOT_STARTED)) {
                                str = null;
                                if (str != null) {
                                }
                                av8Var3.s(true);
                                xtc d0222 = l98.d0(bkh.d(bkh.q(utcVar, 118.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                lv1 lv1Var22 = uxf.m;
                                l8g a522 = k8g.a(ww9.h, lv1Var22, av8Var3, 54);
                                int hashCode422 = Long.hashCode(av8Var3.T);
                                aee m422 = av8Var3.m();
                                xtc C422 = fqj.C(av8Var3, d0222);
                                av8Var3.h0();
                                if (av8Var3.S) {
                                }
                                waa.K(av8Var3, a522, f50Var4);
                                waa.K(av8Var3, m422, ff3Var2);
                                bf3.s(hashCode422, av8Var3, f50Var5, av8Var3, ryVar2);
                                waa.K(av8Var3, C422, f50Var6);
                                xtc f042 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                                u23 a622 = t23.a(new ng0(8.0f, true, new a70(6)), kv1Var, av8Var3, 6);
                                int hashCode522 = Long.hashCode(av8Var3.T);
                                aee m522 = av8Var3.m();
                                xtc C522 = fqj.C(av8Var3, f042);
                                av8Var3.h0();
                                if (av8Var3.S) {
                                }
                                waa.K(av8Var3, a622, f50Var4);
                                waa.K(av8Var3, m522, ff3Var2);
                                bf3.s(hashCode522, av8Var3, f50Var5, av8Var3, ryVar2);
                                waa.K(av8Var3, C522, f50Var6);
                                float f522 = 8.0f;
                                j(wn1Var.b, wn1Var.f, (b2 || (num4 != null && num4.intValue() == 1)) ? ljg.f(av8Var3, 394329881, R.color.n_lv_1, av8Var3, false) : ljg.f(av8Var3, 394329401, R.color.n_lv_3, av8Var3, false), av8Var3, 0);
                                j(wn1Var.c, wn1Var.i, (b2 || (num4 != null && num4.intValue() == 2)) ? ljg.f(av8Var3, 394339865, R.color.n_lv_1, av8Var3, false) : ljg.f(av8Var3, 394339385, R.color.n_lv_3, av8Var3, false), av8Var3, 0);
                                av8Var3.s(true);
                                if (ph0.a0(new String[]{str2, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_DELAYED}).contains(str5)) {
                                }
                                av8Var.s(z6);
                                xelVar2 = xelVar;
                                andVar = xelVar2.h;
                                goa goaVar22 = new goa(1.0f, z6);
                                k1c c622 = e12.c(mv1Var, z7);
                                int hashCode722 = Long.hashCode(av8Var.T);
                                aee m722 = av8Var.m();
                                xtc C722 = fqj.C(av8Var, goaVar22);
                                av8Var.h0();
                                if (av8Var.S) {
                                }
                                waa.K(av8Var, c622, f50Var4);
                                waa.K(av8Var, m722, ff3Var2);
                                bf3.s(hashCode722, av8Var, f50Var5, av8Var, ryVar2);
                                waa.K(av8Var, C722, f50Var6);
                                if (andVar != null) {
                                }
                                f50Var = f50Var4;
                                ff3Var = ff3Var2;
                                ryVar = ryVar2;
                                f50Var2 = f50Var5;
                                f50Var3 = f50Var6;
                                f4 = 4.0f;
                                utcVar3 = utcVar2;
                                z8 = false;
                                av8Var.d0(31187847);
                                av8Var.s(false);
                                av8Var.s(true);
                                xtc f0322 = l98.f0(bkh.d(utcVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f522, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                l8g a822 = k8g.a(new ng0(f4, true, new l1(uxf.p, 5)), lv1Var22, av8Var, 54);
                                int hashCode822 = Long.hashCode(av8Var.T);
                                aee m822 = av8Var.m();
                                xtc C822 = fqj.C(av8Var, f0322);
                                av8Var.h0();
                                if (av8Var.S) {
                                }
                                waa.K(av8Var, a822, f50Var);
                                waa.K(av8Var, m822, ff3Var);
                                bf3.s(hashCode822, av8Var, f50Var2, av8Var, ryVar);
                                waa.K(av8Var, C822, f50Var3);
                                av8 av8Var722 = av8Var;
                                kq9.b(s6a.N(R.drawable.ic_location, 6, av8Var), null, bkh.l(utcVar3, 12.0f), j3, av8Var722, 432, 0);
                                udj.c(xelVar2.d, null, j3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var722, 0, 0, 131066);
                                av8Var2 = av8Var722;
                                av8Var2.s(true);
                                av8Var2.s(true);
                                if (z9) {
                                }
                                av8Var2.s(true);
                            }
                            str = str4;
                            if (str != null) {
                            }
                            av8Var3.s(true);
                            xtc d02222 = l98.d0(bkh.d(bkh.q(utcVar, 118.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                            lv1 lv1Var222 = uxf.m;
                            l8g a5222 = k8g.a(ww9.h, lv1Var222, av8Var3, 54);
                            int hashCode4222 = Long.hashCode(av8Var3.T);
                            aee m4222 = av8Var3.m();
                            xtc C4222 = fqj.C(av8Var3, d02222);
                            av8Var3.h0();
                            if (av8Var3.S) {
                            }
                            waa.K(av8Var3, a5222, f50Var4);
                            waa.K(av8Var3, m4222, ff3Var2);
                            bf3.s(hashCode4222, av8Var3, f50Var5, av8Var3, ryVar2);
                            waa.K(av8Var3, C4222, f50Var6);
                            xtc f0422 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                            u23 a6222 = t23.a(new ng0(8.0f, true, new a70(6)), kv1Var, av8Var3, 6);
                            int hashCode5222 = Long.hashCode(av8Var3.T);
                            aee m5222 = av8Var3.m();
                            xtc C5222 = fqj.C(av8Var3, f0422);
                            av8Var3.h0();
                            if (av8Var3.S) {
                            }
                            waa.K(av8Var3, a6222, f50Var4);
                            waa.K(av8Var3, m5222, ff3Var2);
                            bf3.s(hashCode5222, av8Var3, f50Var5, av8Var3, ryVar2);
                            waa.K(av8Var3, C5222, f50Var6);
                            float f5222 = 8.0f;
                            j(wn1Var.b, wn1Var.f, (b2 || (num4 != null && num4.intValue() == 1)) ? ljg.f(av8Var3, 394329881, R.color.n_lv_1, av8Var3, false) : ljg.f(av8Var3, 394329401, R.color.n_lv_3, av8Var3, false), av8Var3, 0);
                            j(wn1Var.c, wn1Var.i, (b2 || (num4 != null && num4.intValue() == 2)) ? ljg.f(av8Var3, 394339865, R.color.n_lv_1, av8Var3, false) : ljg.f(av8Var3, 394339385, R.color.n_lv_3, av8Var3, false), av8Var3, 0);
                            av8Var3.s(true);
                            if (ph0.a0(new String[]{str2, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_DELAYED}).contains(str5)) {
                            }
                            av8Var.s(z6);
                            xelVar2 = xelVar;
                            andVar = xelVar2.h;
                            goa goaVar222 = new goa(1.0f, z6);
                            k1c c6222 = e12.c(mv1Var, z7);
                            int hashCode7222 = Long.hashCode(av8Var.T);
                            aee m7222 = av8Var.m();
                            xtc C7222 = fqj.C(av8Var, goaVar222);
                            av8Var.h0();
                            if (av8Var.S) {
                            }
                            waa.K(av8Var, c6222, f50Var4);
                            waa.K(av8Var, m7222, ff3Var2);
                            bf3.s(hashCode7222, av8Var, f50Var5, av8Var, ryVar2);
                            waa.K(av8Var, C7222, f50Var6);
                            if (andVar != null) {
                            }
                            f50Var = f50Var4;
                            ff3Var = ff3Var2;
                            ryVar = ryVar2;
                            f50Var2 = f50Var5;
                            f50Var3 = f50Var6;
                            f4 = 4.0f;
                            utcVar3 = utcVar2;
                            z8 = false;
                            av8Var.d0(31187847);
                            av8Var.s(false);
                            av8Var.s(true);
                            xtc f03222 = l98.f0(bkh.d(utcVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            l8g a8222 = k8g.a(new ng0(f4, true, new l1(uxf.p, 5)), lv1Var222, av8Var, 54);
                            int hashCode8222 = Long.hashCode(av8Var.T);
                            aee m8222 = av8Var.m();
                            xtc C8222 = fqj.C(av8Var, f03222);
                            av8Var.h0();
                            if (av8Var.S) {
                            }
                            waa.K(av8Var, a8222, f50Var);
                            waa.K(av8Var, m8222, ff3Var);
                            bf3.s(hashCode8222, av8Var, f50Var2, av8Var, ryVar);
                            waa.K(av8Var, C8222, f50Var3);
                            av8 av8Var7222 = av8Var;
                            kq9.b(s6a.N(R.drawable.ic_location, 6, av8Var), null, bkh.l(utcVar3, 12.0f), j3, av8Var7222, 432, 0);
                            udj.c(xelVar2.d, null, j3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var7222, 0, 0, 131066);
                            av8Var2 = av8Var7222;
                            av8Var2.s(true);
                            av8Var2.s(true);
                            if (z9) {
                            }
                            av8Var2.s(true);
                        }
                    } else {
                        i4 = -1211066518;
                        z3 = false;
                    }
                    f2 = ljg.f(av8Var2, i4, R.color.n_lv_3, av8Var2, z3);
                    xtc d04 = l98.d0(bkh.d(utcVar, 1.0f), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    long j32 = f2;
                    l8g a42 = k8g.a(ww9.f, uxf.l, av8Var2, 6);
                    int hashCode32 = Long.hashCode(av8Var2.T);
                    aee m32 = av8Var2.m();
                    xtc C32 = fqj.C(av8Var2, d04);
                    av8Var2.h0();
                    if (av8Var2.S) {
                    }
                    waa.K(av8Var2, a42, f50Var4);
                    waa.K(av8Var2, m32, ff3Var2);
                    bf3.s(hashCode32, av8Var2, f50Var5, av8Var2, ryVar2);
                    waa.K(av8Var2, C32, f50Var6);
                    a2 = xelVar.b.a(av8Var2);
                    if (a2.length() <= 0) {
                    }
                    if (a2 == null) {
                    }
                    av8Var2.s(z4);
                    String str62 = a2;
                    yf8 yf8Var2 = xth.a;
                    udj.c(str62, null, j32, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
                    av8 av8Var32 = av8Var2;
                    if (Intrinsics.c(str5, StatusKt.STATUS_IN_PROGRESS)) {
                    }
                }
            }
            z = false;
            mv1 mv1Var2 = uxf.c;
            k1c c42 = e12.c(mv1Var2, false);
            int i102 = i2;
            boolean z102 = z;
            int hashCode9 = Long.hashCode(av8Var2.T);
            aee m9 = av8Var2.m();
            xtc C9 = fqj.C(av8Var2, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var3 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
            }
            f50 f50Var42 = hf3.g;
            waa.K(av8Var2, c42, f50Var42);
            ff3 ff3Var22 = hf3.f;
            waa.K(av8Var2, m9, ff3Var22);
            Integer valueOf2 = Integer.valueOf(hashCode9);
            f50 f50Var52 = hf3.j;
            waa.K(av8Var2, valueOf2, f50Var52);
            ry ryVar22 = hf3.k;
            waa.J(av8Var2, ryVar22);
            f50 f50Var62 = hf3.d;
            waa.K(av8Var2, C9, f50Var62);
            av8Var2.d0(-1555907746);
            av8Var2.d0(-1555911653);
            utcVar = utc.a;
            xtc A2 = wnn.A(bkh.c(fz8.d0(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), n9a.b), 1.0f), o7g.a(16.0f));
            long D3 = lz.D(R.color.surface_1, av8Var2);
            jf9 jf9Var2 = oyn.e;
            q = n9e.q(A2, D3, jf9Var2);
            if (c3) {
            }
            av8Var2.s(false);
            if (c3) {
            }
            q = q.z(yso.o(utcVar, 2.0f, !c3 ? ljg.f(av8Var2, -1087210443, R.color.live, av8Var2, false) : ljg.f(av8Var2, -1087209962, R.color.value, av8Var2, false), o7g.a(16.0f)));
            z2 = false;
            av8Var2.s(z2);
            int i112 = i102 & 14;
            i3 = (i112 != 4 ? true : z2) | av8Var2.i(context);
            O = av8Var2.O();
            a99 a99Var22 = nf3.a;
            if (!i3) {
            }
            O = new yel(context, xelVar, 1);
            av8Var2.n0(O);
            Integer num42 = num;
            zg3 zg3Var22 = zg3Var3;
            xtc b02 = l98.b0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var2, 31), 8.0f);
            p4h p4hVar2 = ww9.d;
            kv1 kv1Var2 = uxf.o;
            u23 a32 = t23.a(p4hVar2, kv1Var2, av8Var2, 0);
            int hashCode22 = Long.hashCode(av8Var2.T);
            aee m22 = av8Var2.m();
            xtc C22 = fqj.C(av8Var2, b02);
            av8Var2.h0();
            if (av8Var2.S) {
            }
            waa.K(av8Var2, a32, f50Var42);
            waa.K(av8Var2, m22, ff3Var22);
            bf3.s(hashCode22, av8Var2, f50Var52, av8Var2, ryVar22);
            waa.K(av8Var2, C22, f50Var62);
            if (c3) {
            }
            f2 = ljg.f(av8Var2, i4, R.color.n_lv_3, av8Var2, z3);
            xtc d042 = l98.d0(bkh.d(utcVar, 1.0f), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            long j322 = f2;
            l8g a422 = k8g.a(ww9.f, uxf.l, av8Var2, 6);
            int hashCode322 = Long.hashCode(av8Var2.T);
            aee m322 = av8Var2.m();
            xtc C322 = fqj.C(av8Var2, d042);
            av8Var2.h0();
            if (av8Var2.S) {
            }
            waa.K(av8Var2, a422, f50Var42);
            waa.K(av8Var2, m322, ff3Var22);
            bf3.s(hashCode322, av8Var2, f50Var52, av8Var2, ryVar22);
            waa.K(av8Var2, C322, f50Var62);
            a2 = xelVar.b.a(av8Var2);
            if (a2.length() <= 0) {
            }
            if (a2 == null) {
            }
            av8Var2.s(z4);
            String str622 = a2;
            yf8 yf8Var22 = xth.a;
            udj.c(str622, null, j322, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
            av8 av8Var322 = av8Var2;
            if (Intrinsics.c(str5, StatusKt.STATUS_IN_PROGRESS)) {
            }
        } else {
            xelVar2 = xelVar;
            av8Var2.W();
        }
        eqf u = av8Var2.u();
        if (u != null) {
            u.d = new zel(xelVar2, wlaVar, xtcVar, f, function1, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0110, code lost:
    
        r5 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0114, code lost:
    
        if (r6 == (-1)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0116, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x011a, code lost:
    
        r12.n0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0118, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00c9, code lost:
    
        r5 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00cd, code lost:
    
        if (r11 == (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00cf, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d3, code lost:
    
        r12.n0(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00d1, code lost:
    
        r11 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(tee teeVar, Function1 function1, wla wlaVar, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var;
        qug qugVar;
        koh kohVar;
        Context context;
        boolean z;
        String a2;
        boolean z2;
        boolean z3;
        float f;
        a99 a99Var;
        String a3;
        teeVar.getClass();
        function1.getClass();
        wlaVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1073582191);
        int i2 = (i & 6) == 0 ? (av8Var2.g(teeVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? av8Var2.g(wlaVar) : av8Var2.i(wlaVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i3 = i2 | 3072;
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z4 = (i3 & 14) == 4;
            Object O = av8Var2.O();
            a99 a99Var2 = nf3.a;
            if (z4 || O == a99Var2) {
                O = l6g.W(k13.s(teeVar.values()));
                av8Var2.n0(O);
            }
            gv9 gv9Var = (gv9) O;
            boolean g = av8Var2.g(gv9Var);
            Object O2 = av8Var2.O();
            if (g || O2 == a99Var2) {
                gv9Var.getClass();
                Iterator<E> it = gv9Var.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    xel xelVar = (xel) next;
                    xelVar.getClass();
                    if (xelVar.a.c()) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            Integer num = (Integer) O2;
            boolean g2 = av8Var2.g(gv9Var);
            Object O3 = av8Var2.O();
            if (g2 || O3 == a99Var2) {
                gv9Var.getClass();
                Iterator<E> it2 = gv9Var.iterator();
                int i5 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    Object next2 = it2.next();
                    if (i5 < 0) {
                        b.q();
                        throw null;
                    }
                    xel xelVar2 = (xel) next2;
                    xelVar2.getClass();
                    if (xelVar2.a.d()) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            Integer num2 = (Integer) O3;
            int intValue = num != null ? num.intValue() : num2 != null ? num2.intValue() : 0;
            qug o0 = hkg.o0(av8Var2);
            boolean g3 = av8Var2.g(gv9Var);
            Object O4 = av8Var2.O();
            if (g3 || O4 == a99Var2) {
                O4 = new koh();
                av8Var2.n0(O4);
            }
            koh kohVar2 = (koh) O4;
            Context context2 = (Context) av8Var2.k(nz.b);
            Integer valueOf = Integer.valueOf(intValue);
            boolean e = av8Var2.e(intValue) | av8Var2.g(kohVar2) | av8Var2.i(context2) | av8Var2.g(o0);
            Object O5 = av8Var2.O();
            if (e || O5 == a99Var2) {
                qugVar = o0;
                kohVar = kohVar2;
                O5 = new z23(intValue, context2, qugVar, kohVar, (rq3) null);
                context = context2;
                av8Var2.n0(O5);
            } else {
                context = context2;
                qugVar = o0;
                kohVar = kohVar2;
            }
            hz8.o(av8Var2, valueOf, (Function2) O5);
            boolean g4 = av8Var2.g(gv9Var);
            Object O6 = av8Var2.O();
            Object obj = O6;
            if (g4 || O6 == a99Var2) {
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                for (Object obj2 : gv9Var) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        b.q();
                        throw null;
                    }
                    xel xelVar3 = (xel) obj2;
                    Pair pair = xelVar3.e != null ? new Pair(Integer.valueOf(i6), xelVar3.e) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i6 = i7;
                }
                av8Var2.n0(arrayList);
                obj = arrayList;
            }
            gv9 W = l6g.W((List) obj);
            u23 a4 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var2, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a4, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf2, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            a99 a99Var3 = a99Var2;
            qug qugVar2 = qugVar;
            koh kohVar3 = kohVar;
            boolean z5 = true;
            u0a.s(W, qugVar2, kohVar3, kda.O(l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "wc26_matches_date_row", av8Var2), av8Var2, 0);
            xtc d0 = l98.d0(hkg.Z(fz8.Y(bkh.d(utcVar, 1.0f), n9a.b), qugVar2, false, 14), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a5 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.n, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a5, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            Iterator p = ljg.p(av8Var2, C2, f50Var3, -1958083797, gv9Var);
            int i8 = 0;
            av8 av8Var3 = av8Var2;
            while (p.hasNext()) {
                Object next3 = p.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    b.q();
                    throw null;
                }
                xel xelVar4 = (xel) next3;
                xel xelVar5 = (xel) CollectionsKt.a0(i9, gv9Var);
                r9k r9kVar = xelVar5 != null ? xelVar5.e : null;
                if (r9kVar == null) {
                    av8Var3.d0(1767572613);
                    z = false;
                    av8Var3.s(false);
                    a2 = null;
                } else {
                    z = false;
                    av8Var3.d0(749755132);
                    a2 = r9kVar.a(av8Var3);
                    av8Var3.s(false);
                }
                if (a2 != null) {
                    av8Var3.d0(749757503);
                    r9k r9kVar2 = xelVar4.e;
                    if (r9kVar2 == null) {
                        av8Var3.d0(1767679749);
                        av8Var3.s(z);
                        a3 = null;
                    } else {
                        av8Var3.d0(749758588);
                        a3 = r9kVar2.a(av8Var3);
                        av8Var3.s(z);
                    }
                    z2 = a2.equals(a3) ^ z5;
                    av8Var3.s(z);
                } else {
                    av8Var3.d0(1767647350);
                    av8Var3.s(z);
                    z2 = z;
                }
                if (z2) {
                    z3 = z;
                    f = 8.0f;
                } else {
                    z3 = z;
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                av8Var3.a0(749760667, Integer.valueOf(xelVar4.a.a));
                boolean g5 = av8Var3.g(kohVar3) | av8Var3.e(i8) | av8Var3.i(context);
                Object O7 = av8Var3.O();
                if (g5) {
                    a99Var = a99Var3;
                } else {
                    a99Var = a99Var3;
                    if (O7 != a99Var) {
                        Context context3 = context;
                        av8 av8Var4 = av8Var3;
                        b(xelVar4, wlaVar, dy0.B(utcVar, (Function1) O7), f, function1, av8Var4, ((i3 >> 3) & 112) | ((i3 << 9) & 57344));
                        av8Var4.s(z3);
                        i8 = i9;
                        gv9Var = gv9Var;
                        a99Var3 = a99Var;
                        context = context3;
                        z5 = true;
                        av8Var3 = av8Var4;
                    }
                }
                O7 = new y51(kohVar3, i8, context, 16);
                av8Var3.n0(O7);
                Context context32 = context;
                av8 av8Var42 = av8Var3;
                b(xelVar4, wlaVar, dy0.B(utcVar, (Function1) O7), f, function1, av8Var42, ((i3 >> 3) & 112) | ((i3 << 9) & 57344));
                av8Var42.s(z3);
                i8 = i9;
                gv9Var = gv9Var;
                a99Var3 = a99Var;
                context = context32;
                z5 = true;
                av8Var3 = av8Var42;
            }
            av8 av8Var5 = av8Var3;
            a99 a99Var4 = a99Var3;
            av8Var5.s(false);
            av8Var5.s(true);
            nq8.h(av8Var5, bkh.e(utcVar, 16.0f));
            String v = oea.v(R.string.full_schedule, av8Var5);
            boolean z6 = (i3 & 112) == 32;
            Object O8 = av8Var5.O();
            if (z6 || O8 == a99Var4) {
                O8 = new b4j(9, function1);
                av8Var5.n0(O8);
            }
            tz9.s(0, 0, av8Var5, kda.O(new we9(uxf.p), "wc26_matches_full_schedule_cta", av8Var5), v, (Function0) O8);
            av8 av8Var6 = av8Var5;
            av8Var6.s(true);
            xtcVar2 = utcVar;
            av8Var = av8Var6;
        } else {
            av8Var2.W();
            xtcVar2 = xtcVar;
            av8Var = av8Var2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b1j(teeVar, function1, wlaVar, xtcVar2, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final String str, xtc xtcVar, ImageVector imageVector, long j, long j2, long j3, Function0 function0, Function2 function2, lv1 lv1Var, float f, lv1 lv1Var2, of3 of3Var, final int i, final int i2, final int i3) {
        ImageVector imageVector2;
        int i4;
        long j4;
        int i5;
        long j5;
        int i6;
        long j6;
        int i7;
        int i8;
        Function0 function02;
        int i9;
        int i10;
        lv1 lv1Var3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final Function0 function03;
        final long j7;
        xtc xtcVar2;
        final Function2 function22;
        final ImageVector imageVector3;
        final long j8;
        final long j9;
        final lv1 lv1Var4;
        final float f2;
        final lv1 lv1Var5;
        eqf u;
        xtc xtcVar3;
        lv1 lv1Var6;
        ImageVector imageVector4;
        float f3;
        int i17;
        lv1 lv1Var7;
        Function2 function23;
        Function0 function04;
        long j10;
        long j11;
        lv1 lv1Var8;
        Function2 function24;
        boolean z;
        lv1 lv1Var9 = uxf.m;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(239838950);
        int i18 = i | (av8Var.g(str) ? 4 : 2);
        int i19 = i3 & 2;
        if (i19 != 0) {
            i18 |= 48;
        } else if ((i & 48) == 0) {
            i18 |= av8Var.g(xtcVar) ? 32 : 16;
            if ((i3 & 4) != 0) {
                imageVector2 = imageVector;
                if (av8Var.g(imageVector2)) {
                    i4 = NotificationCompat.FLAG_LOCAL_ONLY;
                    int i20 = i18 | i4;
                    if ((i3 & 8) == 0) {
                        j4 = j;
                        if (av8Var.f(j4)) {
                            i5 = a.o;
                            int i21 = i20 | i5;
                            if ((i3 & 16) != 0) {
                                j5 = j2;
                                if (av8Var.f(j5)) {
                                    i6 = 16384;
                                    int i22 = i21 | i6;
                                    if ((i3 & 32) == 0) {
                                        j6 = j3;
                                        if (av8Var.f(j6)) {
                                            i7 = 131072;
                                            int i23 = i22 | i7;
                                            i8 = i3 & 64;
                                            if (i8 == 0) {
                                                i9 = i23 | 1572864;
                                                function02 = function0;
                                            } else {
                                                function02 = function0;
                                                i9 = i23 | (av8Var.i(function02) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
                                            }
                                            i10 = i3 & 128;
                                            if (i10 == 0) {
                                                i9 |= 12582912;
                                            } else if ((i & 12582912) == 0) {
                                                lv1Var3 = lv1Var9;
                                                i9 |= av8Var.i(function2) ? 8388608 : 4194304;
                                                i11 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                                                if (i11 != 0) {
                                                    i9 |= 100663296;
                                                } else if ((i & 100663296) == 0) {
                                                    i12 = i11;
                                                    i9 |= av8Var.g(lv1Var) ? 67108864 : 33554432;
                                                    i13 = i3 & 512;
                                                    if (i13 == 0) {
                                                        i9 |= 805306368;
                                                    } else if ((i & 805306368) == 0) {
                                                        i14 = i13;
                                                        i9 |= av8Var.d(f) ? 536870912 : 268435456;
                                                        i15 = i3 & 1024;
                                                        if (i15 != 0) {
                                                            i16 = 6;
                                                        } else if ((i2 & 6) == 0) {
                                                            i16 = i2 | (av8Var.g(lv1Var2) ? 4 : 2);
                                                        } else {
                                                            i16 = i2;
                                                        }
                                                        if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 3) != 2)) {
                                                            av8Var.Y();
                                                            int i24 = i & 1;
                                                            utc utcVar = utc.a;
                                                            if (i24 == 0 || av8Var.B()) {
                                                                xtcVar3 = i19 != 0 ? utcVar : xtcVar;
                                                                if ((i3 & 4) != 0) {
                                                                    imageVector2 = s6a.N(R.drawable.ic_info, 6, av8Var);
                                                                    i9 &= -897;
                                                                }
                                                                if ((i3 & 8) != 0) {
                                                                    j4 = lz.D(R.color.n_lv_3, av8Var);
                                                                    i9 &= -7169;
                                                                }
                                                                if ((i3 & 16) != 0) {
                                                                    j5 = lz.D(R.color.n_lv_1, av8Var);
                                                                    i9 &= -57345;
                                                                }
                                                                if ((i3 & 32) != 0) {
                                                                    j6 = lz.D(R.color.surface_1, av8Var);
                                                                    i9 &= -458753;
                                                                }
                                                                if (i8 != 0) {
                                                                    function02 = null;
                                                                }
                                                                Function2 function25 = i10 != 0 ? null : function2;
                                                                lv1Var6 = i12 != 0 ? lv1Var3 : lv1Var;
                                                                imageVector4 = imageVector2;
                                                                f3 = i14 != 0 ? 16.0f : f;
                                                                i17 = i9;
                                                                if (i15 != 0) {
                                                                    Function2 function26 = function25;
                                                                    function04 = function02;
                                                                    j10 = j5;
                                                                    j11 = j6;
                                                                    lv1Var7 = lv1Var3;
                                                                    function23 = function26;
                                                                } else {
                                                                    long j12 = j6;
                                                                    lv1Var7 = lv1Var2;
                                                                    function23 = function25;
                                                                    function04 = function02;
                                                                    j10 = j5;
                                                                    j11 = j12;
                                                                }
                                                            } else {
                                                                av8Var.W();
                                                                if ((i3 & 4) != 0) {
                                                                    i9 &= -897;
                                                                }
                                                                if ((i3 & 8) != 0) {
                                                                    i9 &= -7169;
                                                                }
                                                                if ((i3 & 16) != 0) {
                                                                    i9 &= -57345;
                                                                }
                                                                if ((i3 & 32) != 0) {
                                                                    i9 &= -458753;
                                                                }
                                                                xtcVar3 = xtcVar;
                                                                lv1Var6 = lv1Var;
                                                                f3 = f;
                                                                function04 = function02;
                                                                imageVector4 = imageVector2;
                                                                i17 = i9;
                                                                j10 = j5;
                                                                j11 = j6;
                                                                function23 = function2;
                                                                lv1Var7 = lv1Var2;
                                                            }
                                                            av8Var.t();
                                                            xtc q = n9e.q(bkh.d(xtcVar3, 1.0f), j11, o7g.a(f3));
                                                            boolean z2 = function04 != null;
                                                            xtcVar2 = xtcVar3;
                                                            boolean z3 = (i17 & 3670016) == 1048576;
                                                            Object O = av8Var.O();
                                                            if (z3 || O == nf3.a) {
                                                                O = new ve7(12, function04);
                                                                av8Var.n0(O);
                                                            }
                                                            xtc c0 = l98.c0(tol.y(q, z2, false, false, 0L, null, (Function0) O, av8Var, 30), 16.0f, 8.0f);
                                                            long j13 = j10;
                                                            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var7, av8Var, (((((i16 << 6) & 896) | 48) >> 3) & 112) | 6);
                                                            int hashCode = Long.hashCode(av8Var.T);
                                                            aee m = av8Var.m();
                                                            xtc C = fqj.C(av8Var, c0);
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
                                                            waa.K(av8Var, m, ff3Var);
                                                            Integer valueOf = Integer.valueOf(hashCode);
                                                            f50 f50Var2 = hf3.j;
                                                            waa.K(av8Var, valueOf, f50Var2);
                                                            ry ryVar = hf3.k;
                                                            waa.J(av8Var, ryVar);
                                                            f50 f50Var3 = hf3.d;
                                                            waa.K(av8Var, C, f50Var3);
                                                            int i25 = i17 >> 6;
                                                            ImageVector imageVector5 = imageVector4;
                                                            long j14 = j4;
                                                            kq9.b(imageVector5, null, bkh.l(utcVar, 24.0f), j14, av8Var, (i25 & 14) | 432 | (i17 & 7168), 0);
                                                            goa goaVar = new goa(1.0f, true);
                                                            yf8 yf8Var = xth.a;
                                                            Function0 function05 = function04;
                                                            int i26 = i17;
                                                            long j15 = j11;
                                                            Function2 function27 = function23;
                                                            lv1 lv1Var10 = lv1Var7;
                                                            lv1 lv1Var11 = lv1Var6;
                                                            udj.c(str, goaVar, j13, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, (i17 & 14) | (i25 & 896), 0, 131064);
                                                            av8Var = av8Var;
                                                            if (function27 == null) {
                                                                av8Var.d0(41522014);
                                                                av8Var.s(false);
                                                                function24 = function27;
                                                                lv1Var8 = lv1Var11;
                                                                z = true;
                                                            } else {
                                                                av8Var.d0(41522015);
                                                                lv1Var8 = lv1Var11;
                                                                xtc z4 = bkh.r(utcVar, null, 3).z(new nok(lv1Var8));
                                                                k1c c2 = e12.c(uxf.c, false);
                                                                int hashCode2 = Long.hashCode(av8Var.T);
                                                                aee m2 = av8Var.m();
                                                                xtc C2 = fqj.C(av8Var, z4);
                                                                av8Var.h0();
                                                                if (av8Var.S) {
                                                                    av8Var.l(zg3Var);
                                                                } else {
                                                                    av8Var.q0();
                                                                }
                                                                waa.K(av8Var, c2, f50Var);
                                                                waa.K(av8Var, m2, ff3Var);
                                                                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                                                                waa.K(av8Var, C2, f50Var3);
                                                                function24 = function27;
                                                                function24.invoke(av8Var, Integer.valueOf((i26 >> 21) & 14));
                                                                z = true;
                                                                av8Var.s(true);
                                                                av8Var.s(false);
                                                            }
                                                            av8Var.s(z);
                                                            function03 = function05;
                                                            lv1Var4 = lv1Var8;
                                                            function22 = function24;
                                                            f2 = f3;
                                                            imageVector3 = imageVector5;
                                                            j9 = j15;
                                                            lv1Var5 = lv1Var10;
                                                            j8 = j13;
                                                            j7 = j14;
                                                        } else {
                                                            av8Var.W();
                                                            long j16 = j4;
                                                            function03 = function02;
                                                            j7 = j16;
                                                            xtcVar2 = xtcVar;
                                                            function22 = function2;
                                                            imageVector3 = imageVector2;
                                                            j8 = j5;
                                                            j9 = j6;
                                                            lv1Var4 = lv1Var;
                                                            f2 = f;
                                                            lv1Var5 = lv1Var2;
                                                        }
                                                        u = av8Var.u();
                                                        if (u != null) {
                                                            final xtc xtcVar4 = xtcVar2;
                                                            u.d = new Function2() { // from class: v2a
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj, Object obj2) {
                                                                    ((Integer) obj2).getClass();
                                                                    int K = aba.K(i | 1);
                                                                    int K2 = aba.K(i2);
                                                                    x2a.d(str, xtcVar4, imageVector3, j7, j8, j9, function03, function22, lv1Var4, f2, lv1Var5, (of3) obj, K, K2, i3);
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    i14 = i13;
                                                    i15 = i3 & 1024;
                                                    if (i15 != 0) {
                                                    }
                                                    if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 3) != 2)) {
                                                    }
                                                    u = av8Var.u();
                                                    if (u != null) {
                                                    }
                                                }
                                                i12 = i11;
                                                i13 = i3 & 512;
                                                if (i13 == 0) {
                                                }
                                                i14 = i13;
                                                i15 = i3 & 1024;
                                                if (i15 != 0) {
                                                }
                                                if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 3) != 2)) {
                                                }
                                                u = av8Var.u();
                                                if (u != null) {
                                                }
                                            }
                                            lv1Var3 = lv1Var9;
                                            i11 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                                            if (i11 != 0) {
                                            }
                                            i12 = i11;
                                            i13 = i3 & 512;
                                            if (i13 == 0) {
                                            }
                                            i14 = i13;
                                            i15 = i3 & 1024;
                                            if (i15 != 0) {
                                            }
                                            if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 3) != 2)) {
                                            }
                                            u = av8Var.u();
                                            if (u != null) {
                                            }
                                        }
                                    } else {
                                        j6 = j3;
                                    }
                                    i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                    int i232 = i22 | i7;
                                    i8 = i3 & 64;
                                    if (i8 == 0) {
                                    }
                                    i10 = i3 & 128;
                                    if (i10 == 0) {
                                    }
                                    lv1Var3 = lv1Var9;
                                    i11 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                                    if (i11 != 0) {
                                    }
                                    i12 = i11;
                                    i13 = i3 & 512;
                                    if (i13 == 0) {
                                    }
                                    i14 = i13;
                                    i15 = i3 & 1024;
                                    if (i15 != 0) {
                                    }
                                    if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 3) != 2)) {
                                    }
                                    u = av8Var.u();
                                    if (u != null) {
                                    }
                                }
                            } else {
                                j5 = j2;
                            }
                            i6 = 8192;
                            int i222 = i21 | i6;
                            if ((i3 & 32) == 0) {
                            }
                            i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            int i2322 = i222 | i7;
                            i8 = i3 & 64;
                            if (i8 == 0) {
                            }
                            i10 = i3 & 128;
                            if (i10 == 0) {
                            }
                            lv1Var3 = lv1Var9;
                            i11 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                            if (i11 != 0) {
                            }
                            i12 = i11;
                            i13 = i3 & 512;
                            if (i13 == 0) {
                            }
                            i14 = i13;
                            i15 = i3 & 1024;
                            if (i15 != 0) {
                            }
                            if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 3) != 2)) {
                            }
                            u = av8Var.u();
                            if (u != null) {
                            }
                        }
                    } else {
                        j4 = j;
                    }
                    i5 = 1024;
                    int i212 = i20 | i5;
                    if ((i3 & 16) != 0) {
                    }
                    i6 = 8192;
                    int i2222 = i212 | i6;
                    if ((i3 & 32) == 0) {
                    }
                    i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    int i23222 = i2222 | i7;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                    }
                    lv1Var3 = lv1Var9;
                    i11 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                    }
                    if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 3) != 2)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
            } else {
                imageVector2 = imageVector;
            }
            i4 = 128;
            int i202 = i18 | i4;
            if ((i3 & 8) == 0) {
            }
            i5 = 1024;
            int i2122 = i202 | i5;
            if ((i3 & 16) != 0) {
            }
            i6 = 8192;
            int i22222 = i2122 | i6;
            if ((i3 & 32) == 0) {
            }
            i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
            int i232222 = i22222 | i7;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            lv1Var3 = lv1Var9;
            i11 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 3) != 2)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        if ((i3 & 4) != 0) {
        }
        i4 = 128;
        int i2022 = i18 | i4;
        if ((i3 & 8) == 0) {
        }
        i5 = 1024;
        int i21222 = i2022 | i5;
        if ((i3 & 16) != 0) {
        }
        i6 = 8192;
        int i222222 = i21222 | i6;
        if ((i3 & 32) == 0) {
        }
        i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        int i2322222 = i222222 | i7;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        lv1Var3 = lv1Var9;
        i11 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 3) != 2)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, final Function0 function0, xtc xtcVar, Integer num, long j, long j2, String str2, int i, lv1 lv1Var, int i2, int i3, int i4, of3 of3Var, final int i5, final int i6, final int i7) {
        int i8;
        xtc xtcVar2;
        long j3;
        int i9;
        String str3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        final Integer num2;
        final long j4;
        av8 av8Var;
        final long j5;
        final String str4;
        final int i21;
        final xtc xtcVar3;
        final lv1 lv1Var2;
        final int i22;
        final int i23;
        final int i24;
        eqf u;
        Integer num3;
        long j6;
        long j7;
        String str5;
        int i25;
        int i26;
        Integer num4;
        int i27;
        String str6;
        int i28;
        int i29;
        lv1 lv1Var3;
        long j8;
        lv1 lv1Var4;
        long j9;
        int i30;
        int i31;
        lv1 lv1Var5 = uxf.m;
        str.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1394878863);
        if ((i5 & 6) == 0) {
            i8 = (av8Var2.g(str) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= av8Var2.i(function0) ? 32 : 16;
        }
        int i32 = i7 & 4;
        if (i32 != 0) {
            i8 |= 384;
        } else if ((i5 & 384) == 0) {
            xtcVar2 = xtcVar;
            i8 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i5 & 3072) == 0) {
                if ((i7 & 8) == 0 && av8Var2.g(num)) {
                    i31 = a.o;
                    i8 |= i31;
                }
                i31 = 1024;
                i8 |= i31;
            }
            if ((i5 & 24576) != 0) {
                j3 = j;
                i8 |= ((i7 & 16) == 0 && av8Var2.f(j3)) ? 16384 : 8192;
            } else {
                j3 = j;
            }
            if ((i5 & 196608) != 0) {
                i9 = i8 | (((i7 & 32) == 0 && av8Var2.f(j2)) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
            } else {
                i9 = i8;
            }
            if ((i5 & 1572864) != 0) {
                str3 = str2;
                i9 |= ((i7 & 64) == 0 && av8Var2.g(str3)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            } else {
                str3 = str2;
            }
            if ((i5 & 12582912) != 0) {
                if ((i7 & 128) == 0) {
                    i10 = i;
                    if (av8Var2.e(i10)) {
                        i30 = 8388608;
                        i9 |= i30;
                    }
                } else {
                    i10 = i;
                }
                i30 = 4194304;
                i9 |= i30;
            } else {
                i10 = i;
            }
            int i33 = i9 | 100663296;
            i11 = i7 & 512;
            if (i11 == 0) {
                i33 = i9 | 905969664;
                i12 = i11;
            } else if ((i5 & 805306368) == 0) {
                i12 = i11;
                i33 |= av8Var2.g(lv1Var) ? 536870912 : 268435456;
            } else {
                i12 = i11;
            }
            i13 = i33;
            i14 = i7 & 1024;
            if (i14 == 0) {
                i16 = i6 | 6;
                i15 = i14;
            } else if ((i6 & 6) == 0) {
                i15 = i14;
                i16 = i6 | (av8Var2.e(i2) ? 4 : 2);
            } else {
                i15 = i14;
                i16 = i6;
            }
            i17 = i7 & a.o;
            if (i17 == 0) {
                i16 |= 48;
                i18 = i17;
            } else if ((i6 & 48) == 0) {
                i18 = i17;
                i16 |= av8Var2.e(i3) ? 32 : 16;
            } else {
                i18 = i17;
            }
            i19 = i16;
            i20 = i7 & 4096;
            if (i20 == 0) {
                i19 |= 384;
            } else if ((i6 & 384) == 0) {
                i19 |= av8Var2.e(i4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                if (av8Var2.T(i13 & 1, (i13 & 306783379) == 306783378 || (i19 & 147) != 146)) {
                    av8Var2.Y();
                    int i34 = i5 & 1;
                    utc utcVar = utc.a;
                    if (i34 == 0 || av8Var2.B()) {
                        if (i32 != 0) {
                            xtcVar2 = utcVar;
                        }
                        if ((i7 & 8) != 0) {
                            num3 = Integer.valueOf(R.drawable.ic_info);
                            i13 &= -7169;
                        } else {
                            num3 = num;
                        }
                        if ((i7 & 16) != 0) {
                            j6 = lz.D(R.color.n_lv_3, av8Var2);
                            i13 &= -57345;
                        } else {
                            j6 = j3;
                        }
                        if ((i7 & 32) != 0) {
                            j7 = lz.D(R.color.surface_1, av8Var2);
                            i13 &= -458753;
                        } else {
                            j7 = j2;
                        }
                        if ((i7 & 64) != 0) {
                            str5 = oea.v(R.string.learn_more_button, av8Var2);
                            i13 &= -3670017;
                        } else {
                            str5 = str3;
                        }
                        if ((i7 & 128) != 0) {
                            i13 &= -29360129;
                            i25 = R.drawable.ic_external_link_16;
                        } else {
                            i25 = i10;
                        }
                        lv1 lv1Var6 = i12 != 0 ? lv1Var5 : lv1Var;
                        int i35 = i15 != 0 ? 16 : i2;
                        int i36 = i18 != 0 ? 0 : i3;
                        if (i20 != 0) {
                            num4 = num3;
                            i27 = i13;
                            str6 = str5;
                            i28 = i36;
                            i29 = i35;
                            i26 = 0;
                        } else {
                            i26 = i4;
                            num4 = num3;
                            i27 = i13;
                            str6 = str5;
                            i28 = i36;
                            i29 = i35;
                        }
                        lv1Var3 = lv1Var6;
                        j8 = j7;
                    } else {
                        av8Var2.W();
                        if ((i7 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i7 & 16) != 0) {
                            i13 &= -57345;
                        }
                        if ((i7 & 32) != 0) {
                            i13 &= -458753;
                        }
                        if ((i7 & 64) != 0) {
                            i13 &= -3670017;
                        }
                        if ((i7 & 128) != 0) {
                            i13 &= -29360129;
                        }
                        i29 = i2;
                        i28 = i3;
                        i26 = i4;
                        i27 = i13;
                        j6 = j3;
                        str6 = str3;
                        i25 = i10;
                        num4 = num;
                        j8 = j2;
                        lv1Var3 = lv1Var;
                    }
                    av8Var2.t();
                    String str7 = str6;
                    long j10 = j6;
                    xtc q = n9e.q(bkh.d(xtcVar2, 1.0f), j8, o7g.a(i29));
                    long D = lz.D(R.color.n_lv_4, av8Var2);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = mz1.e(av8Var2);
                    }
                    wzc wzcVar = (wzc) O;
                    int i37 = i29;
                    Object[] objArr = new Object[0];
                    Object O2 = av8Var2.O();
                    if (O2 == a99Var) {
                        O2 = o67.u;
                        av8Var2.n0(O2);
                    }
                    xtc c0 = l98.c0(tol.y(q, true, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), 3), av8Var2, 0), 16.0f, 8.0f);
                    l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var2, 6);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, c0);
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
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    long j11 = j8;
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    if (num4 == null) {
                        av8Var2.d0(-1508398138);
                        av8Var2.s(false);
                        lv1Var4 = lv1Var3;
                        j9 = j10;
                    } else {
                        av8Var2.d0(-1508398137);
                        lv1Var4 = lv1Var3;
                        kq9.b(s6a.N(num4.intValue(), ((i27 >> 6) & 112) | 6, av8Var2), null, bkh.l(utcVar, 24.0f), j10, av8Var2, ((i27 >> 3) & 7168) | 432, 0);
                        j9 = j10;
                        Unit unit = Unit.a;
                        av8Var2.s(false);
                    }
                    xtc xtcVar4 = xtcVar2;
                    goa goaVar = new goa(1.0f, true);
                    int i38 = i25;
                    u23 a3 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var2, 6);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, goaVar);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a3, f50Var);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    yf8 yf8Var = xth.a;
                    udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, i27 & 14, 0, 131066);
                    xtc c02 = l98.c0(utcVar, i28, i26);
                    l8g a4 = k8g.a(ww9.b, lv1Var5, av8Var2, 48);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, c02);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a4, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var3);
                    int i39 = i27 >> 18;
                    av8Var = av8Var2;
                    udj.c(str7, null, lz.D(R.color.primary_default, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, i39 & 14, 0, 131066);
                    kq9.b(s6a.N(i38, (i39 & 112) | 6, av8Var2), null, ljg.i(utcVar, 2.0f, av8Var2, utcVar, 16.0f), lz.D(R.color.primary_default, av8Var2), av8Var2, 432, 0);
                    av8Var2.s(true);
                    av8Var2.s(true);
                    av8Var2.d0(-1507122085);
                    av8Var2.s(false);
                    av8Var2.s(true);
                    num2 = num4;
                    i23 = i28;
                    i24 = i26;
                    i21 = i38;
                    str4 = str7;
                    i22 = i37;
                    j4 = j11;
                    lv1Var2 = lv1Var4;
                    j5 = j9;
                    xtcVar3 = xtcVar4;
                } else {
                    av8Var2.W();
                    num2 = num;
                    j4 = j2;
                    av8Var = av8Var2;
                    j5 = j3;
                    str4 = str3;
                    i21 = i10;
                    xtcVar3 = xtcVar2;
                    lv1Var2 = lv1Var;
                    i22 = i2;
                    i23 = i3;
                    i24 = i4;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: w2a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int K = aba.K(i5 | 1);
                            int K2 = aba.K(i6);
                            x2a.e(str, function0, xtcVar3, num2, j5, j4, str4, i21, lv1Var2, i22, i23, i24, (of3) obj, K, K2, i7);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            if (av8Var2.T(i13 & 1, (i13 & 306783379) == 306783378 || (i19 & 147) != 146)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i5 & 3072) == 0) {
        }
        if ((i5 & 24576) != 0) {
        }
        if ((i5 & 196608) != 0) {
        }
        if ((i5 & 1572864) != 0) {
        }
        if ((i5 & 12582912) != 0) {
        }
        int i332 = i9 | 100663296;
        i11 = i7 & 512;
        if (i11 == 0) {
        }
        i13 = i332;
        i14 = i7 & 1024;
        if (i14 == 0) {
        }
        i17 = i7 & a.o;
        if (i17 == 0) {
        }
        i19 = i16;
        i20 = i7 & 4096;
        if (i20 == 0) {
        }
        if (av8Var2.T(i13 & 1, (i13 & 306783379) == 306783378 || (i19 & 147) != 146)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void f(int i, of3 of3Var, xtc xtcVar, Function0 function0) {
        int i2;
        xtc xtcVar2;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-559825850);
        int i3 = i | (av8Var.e(R.string.who_is_your_goat) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.who_is_your_goat, av8Var);
            yf8 yf8Var = xth.a;
            i2 = 6;
            udj.c(v, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131064);
            ImageVector N = s6a.N(R.drawable.ic_menu_list_share, 6, av8Var);
            long D = lz.D(R.color.n_lv_1, av8Var);
            xtcVar2 = utcVar;
            xtc l = bkh.l(xtcVar2, 32.0f);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = o67.C;
                av8Var.n0(O2);
            }
            xtc b0 = l98.b0(tol.y(l, true, false, true, D2, wzcVar, new p28((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 9), av8Var, 0), 4.0f);
            av8Var = av8Var;
            kq9.b(N, null, b0, D, av8Var, 48, 0);
            av8Var.s(true);
        } else {
            i2 = 6;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fm(function0, xtcVar2, i, i2);
        }
    }

    public static final void g(d6d d6dVar, mpg mpgVar, tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(233973821);
        if ((((av8Var.i(d6dVar) ? 4 : 2) | i | (av8Var.i(mpgVar) ? 32 : 16)) & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            tol.c(new gb0[]{cib.a.a(d6dVar), mhb.a.a(d6dVar), shb.a.a(d6dVar)}, yqo.H(1808964477, av8Var, new kp1(10, mpgVar, tc3Var)), av8Var, 56);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(d6dVar, mpgVar, tc3Var, i, 1);
        }
    }

    public static final void h(boolean z, Function0 function0, xtc xtcVar, xhf xhfVar, io ioVar, ct8 ct8Var, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        io ioVar2;
        io ioVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-532332839);
        if ((i & 6) == 0) {
            i2 = (av8Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(xhfVar) ? a.o : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= av8Var.i(ct8Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= av8Var.i(tc3Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                ioVar3 = uxf.c;
            } else {
                av8Var.W();
                ioVar3 = ioVar;
            }
            av8Var.t();
            xtc z2 = xtcVar.z(new qhf(z, function0, xhfVar, phf.c));
            k1c c2 = e12.c(ioVar3, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, z2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            Object valueOf = Integer.valueOf(((i3 >> 15) & 112) | 6);
            Object obj = n12.a;
            tc3Var.invoke(obj, av8Var, valueOf);
            ct8Var.invoke(obj, av8Var, Integer.valueOf(((i3 >> 12) & 112) | 6));
            av8Var.s(true);
            ioVar2 = ioVar3;
        } else {
            av8Var.W();
            ioVar2 = ioVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new et2(z, function0, xtcVar, xhfVar, ioVar2, ct8Var, tc3Var, i);
        }
    }

    public static final void i(mpg mpgVar, tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(832919318);
        int i2 = (av8Var.i(mpgVar) ? 4 : 2) | i | (av8Var.i(tc3Var) ? 32 : 16);
        int i3 = 18;
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new clc(21);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            ttk a2 = cib.a(av8Var);
            if (a2 == null) {
                a70.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            fuf fufVar = duf.a;
            KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(ay0.class);
            l3a l3aVar = new l3a(0);
            l3aVar.a(fufVar.getOrCreateKotlinClass(ay0.class), function1);
            ay0 ay0Var = (ay0) sea.A(orCreateKotlinClass, a2, l3aVar.b(), a2 instanceof h79 ? ((h79) a2).getDefaultViewModelCreationExtras() : jy3.b, av8Var);
            ay0Var.c = new bka(mpgVar);
            mpgVar.b(ay0Var.b, tc3Var, av8Var, ((i2 << 6) & 896) | (i2 & 112));
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(mpgVar, tc3Var, i, i3);
        }
    }

    public static final void j(int i, String str, long j, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(534901523);
        int i3 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.G(i, bkh.l(utcVar, 24.0f), false, 0L, av8Var, (i3 & 14) | 48, 12);
            xtc f0 = l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            String str2 = str == null ? "" : str;
            yf8 yf8Var = xth.a;
            udj.c(str2, f0, j, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, (i3 & 896) | 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new pu8(i, i2, str, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(gmh gmhVar, xtc xtcVar, ku3 ku3Var, epi epiVar, tc3 tc3Var, of3 of3Var, int i, int i2) {
        ku3 ku3Var2;
        int i3;
        int i4;
        xtc xtcVar2;
        ku3 ku3Var3;
        epi epiVar2;
        eqf u;
        xtc xtcVar3;
        epi epiVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2126863007);
        int i5 = i | (av8Var.g(gmhVar) ? 4 : 2) | 48;
        if ((i2 & 4) == 0) {
            ku3Var2 = ku3Var;
            if (av8Var.i(ku3Var2)) {
                i3 = NotificationCompat.FLAG_LOCAL_ONLY;
                i4 = i5 | i3 | 1024;
                byte b2 = 0;
                if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
                    av8Var.W();
                    xtcVar2 = xtcVar;
                    ku3Var3 = ku3Var2;
                    epiVar2 = epiVar;
                } else {
                    av8Var.Y();
                    if ((i & 1) == 0 || av8Var.B()) {
                        int i6 = i2 & 4;
                        a99 a99Var = nf3.a;
                        if (i6 != 0) {
                            Object O = av8Var.O();
                            if (O == a99Var) {
                                O = hz8.G(g.a, av8Var);
                                av8Var.n0(O);
                            }
                            ku3Var2 = (ku3) O;
                            i4 &= -897;
                        }
                        int i7 = 14;
                        boolean i8 = av8Var.i(ku3Var2) | ((i4 & 14) == 4);
                        Object O2 = av8Var.O();
                        if (i8 || O2 == a99Var) {
                            O2 = new aaf(26, ku3Var2, gmhVar);
                            av8Var.n0(O2);
                        }
                        Function1 function1 = (Function1) O2;
                        fpi fpiVar = fpi.c;
                        av8Var.d0(-485754360);
                        ff5 ff5Var = dh3.h;
                        kx4 kx4Var = (kx4) av8Var.k(ff5Var);
                        boolean g = av8Var.g(kx4Var);
                        Object O3 = av8Var.O();
                        if (g || O3 == a99Var) {
                            O3 = new g2i(kx4Var, i7);
                            av8Var.n0(O3);
                        }
                        Function1 function12 = (Function1) O3;
                        av8Var.s(false);
                        kx4 kx4Var2 = (kx4) av8Var.k(ff5Var);
                        Object[] objArr = new Object[0];
                        y3g y3gVar = new y3g(9, new c8i(b2, 13), new vsc(20, kx4Var2, function1, function12));
                        boolean e = av8Var.e(2) | av8Var.g(kx4Var2) | av8Var.g(function1) | av8Var.g(function12);
                        Object O4 = av8Var.O();
                        if (e || O4 == a99Var) {
                            O4 = new m61(fpiVar, kx4Var2, function1, function12);
                            av8Var.n0(O4);
                        }
                        epi epiVar4 = (epi) o3a.M(objArr, y3gVar, (Function0) O4, av8Var, 0);
                        xtcVar3 = utc.a;
                        epiVar3 = epiVar4;
                    } else {
                        av8Var.W();
                        xtcVar3 = xtcVar;
                        epiVar3 = epiVar;
                    }
                    ku3 ku3Var4 = ku3Var2;
                    av8Var.t();
                    i2a.h(epiVar3, xtcVar3, false, false, false, null, tc3Var, av8Var, 12583352);
                    epiVar2 = epiVar3;
                    xtcVar2 = xtcVar3;
                    ku3Var3 = ku3Var4;
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new s52(gmhVar, xtcVar2, ku3Var3, epiVar2, tc3Var, i, i2);
                    return;
                }
                return;
            }
        } else {
            ku3Var2 = ku3Var;
        }
        i3 = 128;
        i4 = i5 | i3 | 1024;
        byte b22 = 0;
        if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void l(boolean z, vnb vnbVar, Function1 function1, n52 n52Var, of3 of3Var, int i) {
        int i2;
        vnb vnbVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1318429681);
        if ((i & 6) == 0) {
            i2 = (av8Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            vnbVar2 = vnbVar;
            i2 |= av8Var.g(vnbVar2) ? 32 : 16;
        } else {
            vnbVar2 = vnbVar;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(n52Var) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            boolean z2 = (i2 & 896) == 256;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new vbc(27, function1);
                av8Var.n0(O);
            }
            ktm.s(vnbVar2, (Function0) O, z, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(-753432269, av8Var, new zya(12, n52Var, function1, context)), av8Var, ((i2 >> 3) & 14) | 100663296 | ((i2 << 6) & 896), 248);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(z, vnbVar, function1, n52Var, i, 20);
        }
    }

    public static final void m(g2j g2jVar, n52 n52Var, of3 of3Var, int i) {
        n52 n52Var2;
        g2jVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1954868052);
        int i2 = (av8Var.i(g2jVar) ? 4 : 2) | i | (av8Var.g(n52Var) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(g2jVar.f, av8Var, 0);
            e1d x2 = rfo.x(g2jVar.j, av8Var, 0);
            vnb vnbVar = (vnb) x.getValue();
            boolean booleanValue = ((Boolean) x2.getValue()).booleanValue();
            boolean i3 = av8Var.i(context) | av8Var.i(g2jVar);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new dvi(7, context, g2jVar);
                av8Var.n0(O);
            }
            n52Var2 = n52Var;
            l(booleanValue, vnbVar, (Function1) O, n52Var2, av8Var, (i2 << 6) & 7168);
        } else {
            n52Var2 = n52Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(g2jVar, n52Var2, i, 19);
        }
    }

    public static final void n(TwitterAccount twitterAccount, of3 of3Var, int i) {
        zg3 zg3Var;
        char c2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1559991040);
        int i2 = (av8Var.i(twitterAccount) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            lv1 lv1Var = uxf.m;
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            haa.b(twitterAccount.getProfilePictureUrl(), null, bkh.l(utcVar, 32.0f), td4.b0(haa.t(R.drawable.player_photo_placeholder, 0, av8Var), null, 14), td4.b0(haa.t(R.drawable.player_photo_placeholder, 0, av8Var), null, 14), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 37296, 6, 31712);
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            l8g a4 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            String name = twitterAccount.getName();
            yf8 yf8Var = xth.a;
            udj.c(name, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            if (Intrinsics.c(twitterAccount.getVerified(), Boolean.TRUE)) {
                av8Var.d0(-1460187215);
                c2 = 6;
                kq9.b(s6a.N(R.drawable.ic_official_checkmark, 6, av8Var), null, bkh.l(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var.s(false);
            } else {
                c2 = 6;
                av8Var.d0(-1459812828);
                av8Var.s(false);
            }
            av8Var.s(true);
            udj.c(twitterAccount.getHandle(), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            kq9.b(s6a.N(R.drawable.ic_twitter, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lqj(twitterAccount, i, 5);
        }
    }

    public static final void o(gv9 gv9Var, boolean z, ct8 ct8Var, Function0 function0, of3 of3Var, int i) {
        int i2;
        long f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1884723671);
        int i3 = i | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(ct8Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = (i3 & 14) == 4;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new b61(1, gv9Var);
                av8Var.n0(O);
            }
            pr4 b2 = c6e.b(0, (Function0) O, av8Var, 6, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            f6a.a(b2, qx9.p(bkh.d(utcVar, 1.0f), 1.7777778f), null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, yqo.H(1585552480, av8Var, new k4k(0, function0, gv9Var, ct8Var, z)), av8Var, 48, 27648, 8188);
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            l8g a3 = k8g.a(ww9.f, uxf.l, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            av8Var.d0(1289229595);
            int size = gv9Var.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (b2.k() == i4) {
                    i2 = 0;
                    f = ljg.f(av8Var, -694261242, R.color.primary_default, av8Var, false);
                } else {
                    i2 = 0;
                    f = ljg.f(av8Var, -694260440, R.color.primary_highlight, av8Var, false);
                }
                e12.a(i2, av8Var, bkh.l(n9e.q(wnn.A(l98.b0(utcVar, 4.0f), o7g.a), f, oyn.e), 8.0f));
            }
            ljg.t(av8Var, false, true, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(gv9Var, z, ct8Var, function0, i, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v59 */
    public static final void p(final l4k l4kVar, final Function1 function1, xtc xtcVar, wla wlaVar, of3 of3Var, int i) {
        xtc xtcVar2;
        f50 f50Var;
        f50 f50Var2;
        ff3 ff3Var;
        f50 f50Var3;
        ry ryVar;
        zg3 zg3Var;
        utc utcVar;
        boolean z;
        av8 av8Var;
        float f;
        boolean z2;
        f50 f50Var4;
        av8 av8Var2;
        av8 av8Var3;
        ?? r3;
        boolean z3;
        float f2;
        av8 av8Var4;
        utc utcVar2;
        float f3;
        boolean z4;
        function1.getClass();
        av8 av8Var5 = (av8) of3Var;
        av8Var5.f0(155348496);
        int i2 = i | (av8Var5.i(l4kVar) ? 4 : 2) | (av8Var5.i(function1) ? 32 : 16) | 384 | (av8Var5.g(wlaVar) ? a.o : 1024);
        if (av8Var5.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object O = av8Var5.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.TRUE);
                av8Var5.n0(O);
            }
            e1d e1dVar = (e1d) O;
            n7g a2 = o7g.a(16.0f);
            utc utcVar3 = utc.a;
            xtc d = bkh.d(n9e.q(wnn.A(utcVar3, a2), lz.D(R.color.surface_1, av8Var5), o7g.a(16.0f)), 1.0f);
            long D = lz.D(R.color.n_lv_4, av8Var5);
            Object O2 = av8Var5.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var5);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var5.O();
            if (O3 == a99Var) {
                O3 = wzj.g;
                av8Var5.n0(O3);
            }
            xtc y = tol.y(d, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O3, av8Var5, 48), function1, l4kVar, 12), av8Var5, 0);
            Object O4 = av8Var5.O();
            if (O4 == a99Var) {
                O4 = new eqh(10, e1dVar);
                av8Var5.n0(O4);
            }
            xtc O5 = kda.O(s02.V(y, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wlaVar, (Function1) O4), "twitter_component", av8Var5);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var5, 0);
            int hashCode = Long.hashCode(av8Var5.T);
            aee m = av8Var5.m();
            xtc C = fqj.C(av8Var5, O5);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var5.h0();
            if (av8Var5.S) {
                av8Var5.l(zg3Var2);
            } else {
                av8Var5.q0();
            }
            f50 f50Var5 = hf3.g;
            waa.K(av8Var5, a3, f50Var5);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var5, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var6 = hf3.j;
            waa.K(av8Var5, valueOf, f50Var6);
            ry ryVar2 = hf3.k;
            waa.J(av8Var5, ryVar2);
            f50 f50Var7 = hf3.d;
            waa.K(av8Var5, C, f50Var7);
            boolean z5 = l4kVar.h;
            gv9 gv9Var = l4kVar.f;
            if (z5) {
                av8Var5.d0(2107396756);
                gv9 gv9Var2 = l4kVar.f;
                boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                int i3 = i2 & 112;
                boolean z6 = i3 == 32;
                Object O6 = av8Var5.O();
                if (z6 || O6 == a99Var) {
                    O6 = new y47(22, function1);
                    av8Var5.n0(O6);
                }
                ct8 ct8Var = (ct8) O6;
                boolean i4 = (i3 == 32) | av8Var5.i(l4kVar);
                Object O7 = av8Var5.O();
                if (i4 || O7 == a99Var) {
                    z4 = false;
                    final boolean z7 = false ? 1 : 0;
                    O7 = new Function0() { // from class: j4k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i5 = z7;
                            l4k l4kVar2 = l4kVar;
                            Function1 function12 = function1;
                            switch (i5) {
                                case 0:
                                    function12.invoke(new b2c(l4kVar2));
                                    break;
                                default:
                                    function12.invoke(new b2c(l4kVar2));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var5.n0(O7);
                } else {
                    z4 = false;
                }
                f50Var = f50Var5;
                av8 av8Var6 = av8Var5;
                f50Var2 = f50Var7;
                o(gv9Var2, booleanValue, ct8Var, (Function0) O7, av8Var6, 0);
                av8Var6.s(z4);
                r3 = z4;
                f50Var3 = f50Var6;
                ryVar = ryVar2;
                utcVar = utcVar3;
                f = 1.0f;
                ff3Var = ff3Var2;
                zg3Var = zg3Var2;
                av8Var3 = av8Var6;
            } else {
                f50Var = f50Var5;
                av8 av8Var7 = av8Var5;
                f50Var2 = f50Var7;
                if (gv9Var.isEmpty()) {
                    ff3Var = ff3Var2;
                    f50Var3 = f50Var6;
                    ryVar = ryVar2;
                    zg3Var = zg3Var2;
                    utcVar = utcVar3;
                    z = false;
                    av8Var7.d0(906437896);
                    av8Var7.s(false);
                    av8Var = av8Var7;
                } else {
                    av8Var7.d0(905303606);
                    o4k o4kVar = (o4k) CollectionsKt.firstOrNull(gv9Var);
                    if (o4kVar instanceof m4k) {
                        av8Var7.d0(905449151);
                        q((m4k) o4kVar, qx9.p(bkh.d(utcVar3, 1.0f), 1.7777778f), av8Var7, 48);
                        av8Var7.s(false);
                        ff3Var = ff3Var2;
                        z2 = false;
                        utcVar = utcVar3;
                        f50Var3 = f50Var6;
                        ryVar = ryVar2;
                        zg3Var = zg3Var2;
                        av8Var2 = av8Var7;
                    } else {
                        utcVar = utcVar3;
                        if (o4kVar instanceof n4k) {
                            av8Var7.d0(905796568);
                            xtc p = qx9.p(bkh.d(utcVar, 1.0f), 1.7777778f);
                            n4k n4kVar = (n4k) o4kVar;
                            boolean booleanValue2 = ((Boolean) e1dVar.getValue()).booleanValue();
                            int i5 = i2 & 112;
                            boolean z8 = i5 == 32;
                            Object O8 = av8Var7.O();
                            if (z8 || O8 == a99Var) {
                                f50Var4 = f50Var6;
                                O8 = new y47(23, function1);
                                av8Var7.n0(O8);
                            } else {
                                f50Var4 = f50Var6;
                            }
                            ct8 ct8Var2 = (ct8) O8;
                            boolean i6 = (i5 == 32) | av8Var7.i(l4kVar);
                            Object O9 = av8Var7.O();
                            if (i6 || O9 == a99Var) {
                                final int i7 = 1;
                                O9 = new Function0() { // from class: j4k
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i52 = i7;
                                        l4k l4kVar2 = l4kVar;
                                        Function1 function12 = function1;
                                        switch (i52) {
                                            case 0:
                                                function12.invoke(new b2c(l4kVar2));
                                                break;
                                            default:
                                                function12.invoke(new b2c(l4kVar2));
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var7.n0(O9);
                            }
                            zg3Var = zg3Var2;
                            ryVar = ryVar2;
                            f50Var3 = f50Var4;
                            ff3Var = ff3Var2;
                            r(n4kVar, p, booleanValue2, ct8Var2, (Function0) O9, av8Var7, 48);
                            av8 av8Var8 = av8Var7;
                            z2 = false;
                            av8Var8.s(false);
                            av8Var2 = av8Var8;
                        } else {
                            ff3Var = ff3Var2;
                            f50Var3 = f50Var6;
                            ryVar = ryVar2;
                            zg3Var = zg3Var2;
                            z2 = false;
                            av8Var7.d0(906414088);
                            av8Var7.s(false);
                            av8Var2 = av8Var7;
                        }
                    }
                    av8Var2.s(z2);
                    z = z2;
                    av8Var = av8Var2;
                }
                f = 1.0f;
                r3 = z;
                av8Var3 = av8Var;
            }
            xtc q = n9e.q(bkh.d(utcVar, f), lz.D(R.color.surface_1, av8Var3), oyn.e);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var3, r3);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, q);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a4, f50Var);
            waa.K(av8Var3, m2, ff3Var);
            bf3.s(hashCode2, av8Var3, f50Var3, av8Var3, ryVar);
            waa.K(av8Var3, C2, f50Var2);
            nq8.h(av8Var3, bkh.e(utcVar, 8.0f));
            TwitterAccount twitterAccount = l4kVar.d;
            if (twitterAccount == null) {
                av8Var3.d0(1960351428);
                z3 = false;
                av8Var3.s(false);
            } else {
                z3 = false;
                av8Var3.d0(1960351429);
                n(twitterAccount, av8Var3, 0);
                Unit unit = Unit.a;
                av8Var3.s(false);
            }
            String str = l4kVar.e;
            if (str.length() <= 0) {
                str = null;
            }
            String str2 = str;
            if (str2 == null) {
                av8Var3.d0(1960472731);
                av8Var3.s(z3);
                f3 = 8.0f;
                av8Var4 = av8Var3;
                utcVar2 = utcVar;
                f2 = 16.0f;
            } else {
                av8Var3.d0(1960472732);
                f2 = 16.0f;
                xtc c0 = l98.c0(utcVar, 16.0f, 8.0f);
                yf8 yf8Var = xth.a;
                av8 av8Var9 = av8Var3;
                udj.c(str2, c0, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var9, 48, 0, 131064);
                av8Var4 = av8Var9;
                Unit unit2 = Unit.a;
                av8Var4.s(z3);
                utcVar2 = utcVar;
                f3 = 8.0f;
            }
            xtc c02 = l98.c0(utcVar2, f2, f3);
            String str3 = l4kVar.g;
            yf8 yf8Var2 = xth.a;
            av8 av8Var10 = av8Var4;
            udj.c(str3, c02, lz.D(R.color.n_lv_3, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var10, 48, 0, 131064);
            av8Var5 = av8Var10;
            av8Var5.s(true);
            av8Var5.s(true);
            xtcVar2 = utcVar2;
        } else {
            av8Var5.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var5.u();
        if (u != null) {
            u.d = new mp9(l4kVar, function1, xtcVar2, wlaVar, i, 18);
        }
    }

    public static final void q(m4k m4kVar, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(644179245);
        int i2 = (av8Var.g(m4kVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtcVar2 = xtcVar;
            haa.b(m4kVar.b, null, xtcVar2, wv8.c(lz.D(R.color.n_lv_3, av8Var), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var), 12), wv8.c(lz.D(R.color.n_lv_3, av8Var), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var), 12), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 37296, 6, 31712);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(m4kVar, xtcVar2, i, 8);
        }
    }

    public static final void r(n4k n4kVar, xtc xtcVar, boolean z, ct8 ct8Var, Function0 function0, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1721735894);
        int i2 = i | (av8Var.g(n4kVar) ? 4 : 2) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(ct8Var) ? a.o : 1024) | (av8Var.i(function0) ? 16384 : 8192);
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            rd0.q(n4kVar.c, n4kVar.b, xtcVar, ct8Var, z, null, function0, null, av8Var, (i2 & 7168) | 384 | (57344 & (i2 << 6)) | ((i2 << 12) & 234881024), 736);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(n4kVar, xtcVar, z, ct8Var, function0, i);
        }
    }

    public static final rvl s(BaseLayerDto baseLayerDto, n3m n3mVar) {
        nfm a2;
        List<RenditionsDto> renditions;
        n3mVar.getClass();
        List list = null;
        BaseLayerType type = baseLayerDto != null ? baseLayerDto.getType() : null;
        ContentDto content = baseLayerDto != null ? baseLayerDto.getContent() : null;
        if (content != null && (renditions = content.getRenditions()) != null) {
            list = CollectionsKt.W(renditions);
        }
        if (list == null) {
            list = km5.a;
        }
        if (list.isEmpty()) {
            a2 = new nfm(km5.a, n3mVar);
        } else {
            a2 = com.blaze.blazesdk.features.shared.models.shared_models.a.a(list, RenditionsDto.FileTypeDto.HLS);
            if (a2 == null && (a2 = com.blaze.blazesdk.features.shared.models.shared_models.a.a(list, RenditionsDto.FileTypeDto.DASH)) == null && (a2 = com.blaze.blazesdk.features.shared.models.shared_models.a.a(list, RenditionsDto.FileTypeDto.MP4)) == null) {
                a2 = new nfm(c.a(list), n3mVar);
            }
        }
        return new rvl(type, a2);
    }

    public static final Object t(zg2 zg2Var, rq3 rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        lj2Var.v(new aka(zg2Var, 0));
        zg2Var.M(new bka(lj2Var, 0));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public static final Object u(zg2 zg2Var, rq3 rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        lj2Var.v(new aka(zg2Var, 1));
        zg2Var.M(new cka(lj2Var));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public static boolean v(ml6 ml6Var) {
        nkk nkkVar = new nkk(8);
        int i = r5a.d(ml6Var, nkkVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ml6Var.peekFully(nkkVar.a, 0, 4);
        nkkVar.E(0);
        if (nkkVar.f() == 1463899717) {
            return true;
        }
        m6k.B();
        return false;
    }

    public static void w(Object obj) {
        if (obj != null) {
            return;
        }
        yhk.s("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final void x(ha5 ha5Var, b20 b20Var, oqf oqfVar, long j, float f, qh0 qh0Var) {
        b20Var.i();
        b20Var.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float H0 = ha5Var.H0(10.0f);
        float f2 = qh0Var.b;
        b20Var.f((H0 * f2) / 2.0f, ha5Var.H0(5.0f) * f2);
        b20Var.f(ha5Var.H0(10.0f) * f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float intBitsToFloat = (Float.intBitsToFloat((int) (oqfVar.d() >> 32)) + (Math.min(oqfVar.c - oqfVar.a, oqfVar.d - oqfVar.b) / 2.0f)) - ((ha5Var.H0(10.0f) * f2) / 2.0f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (oqfVar.d() & 4294967295L)) - ha5Var.H0(2.5f);
        b20Var.k((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        float H02 = qh0Var.a - ha5Var.H0(2.5f);
        long O0 = ha5Var.O0();
        sx2 L0 = ha5Var.L0();
        long D = L0.D();
        L0.t().o();
        try {
            ((hpo) L0.a).F(O0, H02);
            ha5.X0(ha5Var, b20Var, j, f, new jii(ha5Var.H0(2.5f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 48);
        } finally {
            mz1.v(L0, D);
        }
    }

    public static String y(ec2 ec2Var) {
        StringBuilder sb = new StringBuilder(ec2Var.size());
        for (int i = 0; i < ec2Var.size(); i++) {
            byte c2 = ec2Var.c(i);
            if (c2 == 34) {
                sb.append("\\\"");
            } else if (c2 == 39) {
                sb.append("\\'");
            } else if (c2 != 92) {
                switch (c2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (c2 < 32 || c2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c2 >>> 6) & 3) + 48));
                            sb.append((char) (((c2 >>> 3) & 7) + 48));
                            sb.append((char) ((c2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final xh2 z(Executor executor, String str, Function0 function0) {
        executor.getClass();
        return f5p.A(new li3(8, executor, str, function0));
    }
}
