package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.google.android.gms.internal.ads.zzagn;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.view.SofascoreRatingView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class i9a implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static int d = -20000;
    public static final /* synthetic */ int e = 0;

    public static yj0 A(String str, of3 of3Var) {
        str.getClass();
        return uaa.w(fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", str, "/flag"), of3Var, 30);
    }

    public static yj0 B(int i, int i2, of3 of3Var, String str) {
        if (i2 == 0) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(-1989471588);
            yj0 C = C(i, av8Var);
            av8Var.s(false);
            return C;
        }
        if (i2 != 1) {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(-1543970660);
            av8Var2.s(false);
            return null;
        }
        av8 av8Var3 = (av8) of3Var;
        av8Var3.d0(-1989469978);
        yj0 A = A(str, av8Var3);
        av8Var3.s(false);
        return A;
    }

    public static yj0 C(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        Context context = (Context) av8Var.k(nz.b);
        ht9 ht9Var = new ht9(context);
        Drawable drawable = context.getDrawable(R.drawable.team_logo_placeholder);
        Drawable drawable2 = null;
        if (drawable != null) {
            v9g.K(drawable.mutate(), context.getColor(R.color.neutral_default));
        } else {
            drawable = null;
        }
        sl6 sl6Var = vt9.a;
        ht9Var.n = new yx7(drawable != null ? rfo.u(drawable) : null, 28);
        Drawable drawable3 = context.getDrawable(R.drawable.team_logo_placeholder);
        if (drawable3 != null) {
            v9g.K(drawable3.mutate(), context.getColor(R.color.neutral_default));
            drawable2 = drawable3;
        }
        vt9.b(ht9Var, drawable2);
        st9.a(ht9Var, true);
        ht9Var.c = pco.R(i);
        return uaa.w(ht9Var.a(), av8Var, 30);
    }

    public static f3f D(AppCompatTextView appCompatTextView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new f3f(c90.B(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (appCompatTextView.getInputType() & 15) != 3) {
                boolean z = appCompatTextView.getLayoutDirection() == 1;
                switch (appCompatTextView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(c90.p(DecimalFormatSymbols.getInstance(appCompatTextView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new f3f(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final boolean E(s6d s6dVar, List list) {
        s6dVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            int i = s6d.f;
            kClass.getClass();
            if (waa.y(sha.R(kClass)) == s6dVar.b.b) {
                return true;
            }
        }
        return false;
    }

    public static void F(dt5 dt5Var, int i) {
        LinearLayout linearLayout = dt5Var.b;
        ConstraintLayout constraintLayout = dt5Var.a;
        ImageView imageView = dt5Var.e;
        int width = linearLayout.getWidth() - dt5Var.f.getWidth();
        ImageView imageView2 = dt5Var.d;
        int i2 = 4;
        if (width <= 0) {
            imageView2.setVisibility(4);
            imageView.setVisibility(4);
            return;
        }
        Context context = constraintLayout.getContext();
        context.getClass();
        imageView2.setVisibility((!hkg.c0(context) ? i == 0 : i == width) ? 0 : 4);
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        if (!hkg.c0(context2) ? i != width : i != 0) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
    }

    public static long G(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void H(TextView textView, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, 1, 2);
        } else if (textView instanceof fs0) {
            ((fs0) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, 1, 2);
        }
    }

    public static void I(TextView textView, int i) {
        l4a.i(i);
        if (Build.VERSION.SDK_INT >= 28) {
            c90.O(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void J(TextView textView, int i) {
        l4a.i(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void K(TextView textView, int i) {
        l4a.i(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void L(Context context, Uri uri, Bundle bundle) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) StartActivity.class);
        if (uri != null) {
            intent.setAction("android.intent.action.VIEW");
            intent.setData(uri);
        }
        if (bundle != null) {
            intent.putExtra("main_activity_bundle", bundle);
        }
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    public static final i68 M(u4a u4aVar) {
        return new i68(yid.m(u4aVar != null ? Integer.valueOf(u4aVar.a) : null), yid.m(u4aVar != null ? Integer.valueOf(u4aVar.b) : null), yid.m(u4aVar != null ? Integer.valueOf(u4aVar.c) : null), yid.m(u4aVar != null ? Integer.valueOf(u4aVar.d) : null));
    }

    public static ActionMode.Callback N(ActionMode.Callback callback) {
        return callback instanceof nfj ? ((nfj) callback).a : callback;
    }

    public static ActionMode.Callback O(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof nfj) || callback == null) ? callback : new nfj(callback, textView);
    }

    public static int P(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                try {
                    int i3 = aso.a;
                    int length2 = str.length();
                    int i4 = 0;
                    while (i < length2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 2048) {
                            i4 += (127 - charAt2) >>> 31;
                        } else {
                            i4 += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i) < 65536) {
                                    throw new xro("Unpaired surrogate at index " + i + " of " + length2);
                                }
                                i++;
                            }
                        }
                        i++;
                    }
                    i2 += i4;
                } catch (xro unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i2 >= length) {
            return i2;
        }
        ogj.f(i2 + 4294967296L, "UTF-8 length does not fit in int: ");
        return 0;
    }

    public static final void a(bfc bfcVar, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1583208372);
        int i2 = (av8Var.g(bfcVar) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(kda.w(utcVar), 1.0f);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = o67.y;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(bkh.g(tol.y(d2, true, true, true, D, wzcVar, new gi(14, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, bfcVar), av8Var, 0), 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            tc3 tc3Var = bfcVar.d;
            av8Var.d0(-933829293);
            tc3Var.invoke(kda.O(bkh.l(utcVar, 24.0f), "image_first", av8Var), av8Var, 0);
            av8Var.s(false);
            xtc O3 = kda.O(new goa(1.0f, false), "item_text", av8Var);
            String str = bfcVar.c;
            yf8 yf8Var = xth.a;
            udj.c(str, O3, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(bfcVar, function1, i, 7);
        }
    }

    public static final void b(final gv9 gv9Var, final Function1 function1, final h1d h1dVar, Function0 function0, final ad5 ad5Var, oqf oqfVar, oqf oqfVar2, final boolean z, of3 of3Var, int i) {
        int i2;
        Function0 function02;
        av8 av8Var;
        mv1 mv1Var;
        mv1 mv1Var2;
        int i3;
        mv1 mv1Var3 = uxf.i;
        mv1 mv1Var4 = uxf.c;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1664347337);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(gv9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? av8Var2.g(h1dVar) : av8Var2.i(h1dVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= av8Var2.i(function02) ? a.o : 1024;
        } else {
            function02 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.g(ad5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var2.g(oqfVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var2.g(oqfVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var2.h(z) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (av8Var2.T(i4 & 1, (i4 & 4793491) != 4793490)) {
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            boolean z2 = av8Var2.k(dh3.n) == ema.b;
            final int e0 = kx4Var.e0(4.0f);
            if (z) {
                mv1Var = mv1Var3;
                i3 = wzb.b(oqfVar.d - oqfVar.b);
                mv1Var2 = mv1Var4;
            } else {
                mv1Var = mv1Var3;
                mv1Var2 = mv1Var4;
                i3 = -wzb.b(oqfVar.d - oqfVar.b);
            }
            long j = i3 & 4294967295L;
            final float D0 = z ? kx4Var.D0(oqfVar2.d - oqfVar.d) : kx4Var.D0(oqfVar.b - oqfVar2.b);
            final float C0 = kx4Var.C0(ad5Var.d);
            final float C02 = kx4Var.C0(ad5Var.c);
            mv1 mv1Var5 = z ? z2 ? uxf.e : mv1Var2 : z2 ? uxf.k : mv1Var;
            if (z) {
                mv1Var = mv1Var2;
            }
            final mv1 mv1Var6 = mv1Var5;
            final Function0 function03 = function02;
            av8Var = av8Var2;
            t20.b(mv1Var, j, function0, new g2f(27), yqo.H(-1611893370, av8Var2, new Function2() { // from class: poa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    lv1 lv1Var = uxf.n;
                    lv1 lv1Var2 = uxf.l;
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                        utc utcVar = utc.a;
                        xtc y = tol.y(bkh.d(bkh.e(utcVar, D0), 1.0f), false, false, false, 0L, null, function03, av8Var3, 27);
                        k1c c2 = e12.c(uxf.c, false);
                        int hashCode = Long.hashCode(av8Var3.T);
                        aee m = av8Var3.m();
                        xtc C = fqj.C(av8Var3, y);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, c2, hf3.g);
                        waa.K(av8Var3, m, hf3.f);
                        waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var3, hf3.k);
                        waa.K(av8Var3, C, hf3.d);
                        ad5 ad5Var2 = ad5Var;
                        boolean z3 = ad5Var2.b;
                        boolean z4 = z;
                        if (z3 == z4) {
                            av8Var3.d0(790382417);
                            n12 n12Var = n12.a;
                            final mv1 mv1Var7 = mv1Var6;
                            xtc a2 = n12Var.a(utcVar, mv1Var7);
                            boolean h = av8Var3.h(z4);
                            int i5 = e0;
                            boolean e2 = h | av8Var3.e(i5) | av8Var3.g(ad5Var2);
                            Object O = av8Var3.O();
                            if (e2 || O == nf3.a) {
                                O = new qoa(z4, i5, ad5Var2);
                                av8Var3.n0(O);
                            }
                            xtc r = rd0.r(a2, (Function1) O);
                            zo5 a3 = uo5.e(s02.h0(200, 0, null, 6), 2).a(uo5.d(s02.h0(200, 0, null, 6), z4 ? lv1Var2 : lv1Var, 12));
                            of6 f = uo5.f(s02.h0(200, 0, null, 6), 2);
                            i4k h0 = s02.h0(200, 0, null, 6);
                            if (z4) {
                                lv1Var = lv1Var2;
                            }
                            of6 a4 = f.a(uo5.l(h0, lv1Var, 12));
                            final float f2 = C0;
                            final float f3 = C02;
                            final gv9 gv9Var2 = gv9Var;
                            final Function1 function12 = function1;
                            fz8.c(h1dVar, r, a3, a4, null, yqo.H(-980913427, av8Var3, new ct8() { // from class: roa
                                @Override // defpackage.ct8
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    of3 of3Var3 = (of3) obj4;
                                    ((Integer) obj5).getClass();
                                    ((r70) obj3).getClass();
                                    xtc x = gz8.x(l98.d0(n9e.q(d2a.E(bkh.g(bkh.p(n12.a.a(utc.a, mv1.this), f2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1), 1.0f, o7g.a(8.0f), false, 0L, 28), lz.D(R.color.surface_P, of3Var3), o7g.a(8.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), null, null, 3);
                                    av8 av8Var4 = (av8) of3Var3;
                                    gv9 gv9Var3 = gv9Var2;
                                    boolean g = av8Var4.g(gv9Var3);
                                    Function1 function13 = function12;
                                    boolean g2 = g | av8Var4.g(function13);
                                    Object O2 = av8Var4.O();
                                    if (g2 || O2 == nf3.a) {
                                        O2 = new ij7(gv9Var3, function13, 1);
                                        av8Var4.n0(O2);
                                    }
                                    v8a.a(x, null, null, null, null, null, false, null, (Function1) O2, av8Var4, 0, 510);
                                    return Unit.a;
                                }
                            }), av8Var3, 196608, 16);
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(792336130);
                            av8Var3.s(false);
                        }
                        av8Var3.s(true);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            }), av8Var, ((i4 >> 3) & 896) | 27648, 0);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b87(gv9Var, function1, h1dVar, function0, ad5Var, oqfVar, oqfVar2, z, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x042e, code lost:
    
        if (r12 == defpackage.nf3.a) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03c1, code lost:
    
        if (r0 < r12) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03c3, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03e0, code lost:
    
        if (r0 < r12) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0119, code lost:
    
        if (r2 == defpackage.nf3.a) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0284  */
    /* JADX WARN: Type inference failed for: r13v30, types: [tc3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final gv9 gv9Var, final Function1 function1, final boolean z, Function0 function0, final Function0 function02, xtc xtcVar, hd5 hd5Var, final oqf oqfVar, final boolean z2, tc3 tc3Var, of3 of3Var, final int i) {
        int i2;
        tc3 tc3Var2;
        final hd5 hd5Var2;
        oqf oqfVar2;
        a99 a99Var;
        Object obj;
        e1d e1dVar;
        int i3;
        boolean z3;
        Object obj2;
        Pair pair;
        float f;
        int b2;
        int b3;
        Object obj3;
        e1d e1dVar2;
        Object obj4;
        boolean z4;
        Object obj5;
        Function0 function03 = function0;
        xtc xtcVar2 = xtcVar;
        gv9Var.getClass();
        function1.getClass();
        function03.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1005972883);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(gv9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function03) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.h(true) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var.g(xtcVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i2 | 12582912;
        if ((i & 100663296) == 0) {
            i4 |= av8Var.g(oqfVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= av8Var.h(z2) ? 536870912 : 268435456;
        }
        if (av8Var.T(i4 & 1, (i4 & 306783379) != 306783378)) {
            hd5 hd5Var3 = hd5.a;
            Context context = (Context) av8Var.k(nz.b);
            ff5 ff5Var = nz.f;
            View view = (View) av8Var.k(ff5Var);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            jej Q = h5a.Q(0, 0, 1, av8Var);
            int e0 = kx4Var.e0(16.0f);
            View view2 = (View) av8Var.k(ff5Var);
            boolean g = av8Var.g(view2);
            ?? O = av8Var.O();
            if (!g) {
                oqfVar2 = O;
            }
            Rect rect = new Rect();
            view2.getWindowVisibleDisplayFrame(rect);
            oqf O2 = wba.O(rect);
            av8Var.n0(O2);
            oqfVar2 = O2;
            oqf oqfVar3 = oqfVar2;
            Object O3 = av8Var.O();
            a99 a99Var2 = nf3.a;
            Object obj6 = O3;
            if (O3 == a99Var2) {
                WeakHashMap weakHashMap = bsk.a;
                x9l a2 = trk.a(view);
                i68 M = M(a2 != null ? a2.a.i(519) : null);
                av8Var.n0(M);
                obj6 = M;
            }
            w8l w8lVar = (w8l) obj6;
            oqf oqfVar4 = oqfVar == null ? oqfVar3 : oqfVar;
            Object O4 = av8Var.O();
            Object obj7 = O4;
            if (O4 == a99Var2) {
                context.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                znh c2 = e.c(sharedPreferences.getInt("KeyboardHeightPref", 0));
                av8Var.n0(c2);
                obj7 = c2;
            }
            znh znhVar = (znh) obj7;
            boolean e2 = av8Var.e(znhVar.h()) | av8Var.g(oqfVar4) | ((458752 & i4) == 131072);
            Object O5 = av8Var.O();
            if (e2 || O5 == a99Var2) {
                O5 = oqfVar == null ? oqf.b(oqfVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (oqfVar4.d - znhVar.h()) + w8lVar.c(kx4Var), 7) : oqfVar4;
                av8Var.n0(O5);
            }
            oqf oqfVar5 = (oqf) O5;
            Object O6 = av8Var.O();
            if (O6 == a99Var2) {
                a99Var = a99Var2;
                e1d f2 = e.f(jca.q(0L, 0L));
                av8Var.n0(f2);
                obj = f2;
            } else {
                a99Var = a99Var2;
                obj = O6;
            }
            e1d e1dVar3 = (e1d) obj;
            int i5 = i4 & 14;
            boolean z5 = (i5 == 4) | ((i4 & 29360128) == 8388608);
            Object O7 = av8Var.O();
            if (z5 || O7 == a99Var) {
                if (gv9Var.isEmpty()) {
                    e1dVar = e1dVar3;
                    i3 = 0;
                } else {
                    Iterator it = CollectionsKt.L0(CollectionsKt.H0(gv9Var, new se7(21)), 3).iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        String str = ((bfc) it.next()).c;
                        yf8 yf8Var = xth.a;
                        Iterator it2 = it;
                        e1d e1dVar4 = e1dVar3;
                        int i7 = (int) (jej.a(Q, str, xth.e(), 1020).c >> 32);
                        if (i7 > i6) {
                            i6 = i7;
                        }
                        it = it2;
                        e1dVar3 = e1dVar4;
                    }
                    e1dVar = e1dVar3;
                    if (!gv9Var.isEmpty()) {
                        Iterator it3 = gv9Var.iterator();
                        if (it3.hasNext()) {
                            tc3 tc3Var3 = ((bfc) it3.next()).d;
                            z3 = true;
                            i3 = kx4Var.e0(32.0f + (!z3 ? 40.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) + i6;
                        }
                    }
                    z3 = false;
                    i3 = kx4Var.e0(32.0f + (!z3 ? 40.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) + i6;
                }
                Integer valueOf = Integer.valueOf(i3);
                av8Var.n0(valueOf);
                obj2 = valueOf;
            } else {
                e1dVar = e1dVar3;
                obj2 = O7;
            }
            int intValue = ((Number) obj2).intValue();
            boolean g2 = av8Var.g((oqf) e1dVar.getValue()) | av8Var.g(oqfVar5) | av8Var.e(intValue);
            Object O8 = av8Var.O();
            if (g2 || O8 == nf3.a) {
                oqf oqfVar6 = (oqf) e1dVar.getValue();
                float f3 = oqfVar5.b;
                float f4 = oqfVar5.a;
                float f5 = oqfVar5.c;
                float f6 = e0;
                float f7 = f3 + f6;
                float f8 = oqfVar5.d;
                float f9 = f8 - f6;
                float f10 = oqfVar6.b;
                float f11 = oqfVar6.d;
                float f12 = oqfVar6.a;
                float f13 = oqfVar6.c;
                if (f10 > f8 || f11 < f3) {
                    pair = new Pair(gd5.c, Integer.valueOf(wzb.b(f9 - f7)));
                } else {
                    float min = Math.min(f10, f9) - f7;
                    float max = f9 - Math.max(f11, f7);
                    pair = min > max ? new Pair(gd5.b, Integer.valueOf(wzb.b(min))) : new Pair(gd5.a, Integer.valueOf(wzb.b(max)));
                }
                gd5 gd5Var = (gd5) pair.a;
                int intValue2 = ((Number) pair.b).intValue();
                int b4 = wzb.b(oqfVar6.a - oqfVar5.a);
                float f14 = f5 - f13;
                int b5 = wzb.b(f14);
                int b6 = b4 == b5 ? wzb.b(f13 - f12) : wzb.b(f5 - f4) - (Math.min(b4, b5) * 2);
                int ordinal = hd5Var3.ordinal();
                if (ordinal != 0) {
                    f = f14;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            zzl.b();
                            return;
                        }
                        b6 = Math.min(Math.max(wzb.b(f13 - f12), intValue), b6);
                    }
                } else {
                    f = f14;
                    b6 = wzb.b(f13 - f12);
                }
                int ordinal2 = (wzb.b(f) > wzb.b(oqfVar6.a - oqfVar5.a) ? zc5.a : zc5.b).ordinal();
                if (ordinal2 == 0) {
                    b2 = wzb.b(f12);
                    if (b2 + b6 > wzb.b(f5)) {
                        b2 = wzb.b(f13 - b6);
                        b3 = wzb.b(f4);
                    }
                    ad5 ad5Var = new ad5(b2, intValue2, b6, gd5Var != gd5.a);
                    av8Var.n0(ad5Var);
                    O8 = ad5Var;
                } else {
                    if (ordinal2 != 1) {
                        zzl.b();
                        return;
                    }
                    if (soa.a[hd5Var3.ordinal()] == 1) {
                        b2 = wzb.b(f);
                    } else {
                        b2 = wzb.b(f13 - b6);
                        b3 = wzb.b(f4);
                    }
                    ad5 ad5Var2 = new ad5(b2, intValue2, b6, gd5Var != gd5.a);
                    av8Var.n0(ad5Var2);
                    O8 = ad5Var2;
                }
            }
            ad5 ad5Var3 = (ad5) O8;
            av8Var.d0(-1340243005);
            WeakHashMap weakHashMap2 = cal.w;
            j50 j50Var = qea.p(av8Var).c;
            WeakHashMap weakHashMap3 = bsk.a;
            x9l a3 = trk.a(view);
            int i8 = M(a3 != null ? a3.a.i(8) : null).d;
            Integer valueOf2 = Integer.valueOf(i8);
            boolean e3 = av8Var.e(i8) | av8Var.i(context);
            Object O9 = av8Var.O();
            if (!e3) {
                obj3 = O9;
            }
            yp7 yp7Var = new yp7(i8, context, znhVar, (rq3) null);
            av8Var.n0(yp7Var);
            obj3 = yp7Var;
            hz8.o(av8Var, valueOf2, (Function2) obj3);
            e1d g3 = e.g(function02, av8Var);
            Unit unit = Unit.a;
            boolean g4 = av8Var.g(j50Var) | av8Var.g(kx4Var) | av8Var.g(g3);
            Object O10 = av8Var.O();
            if (g4 || O10 == nf3.a) {
                O10 = new va8(znhVar, j50Var, kx4Var, g3, null, 7);
                av8Var.n0(O10);
            }
            hz8.o(av8Var, unit, (Function2) O10);
            av8Var.s(false);
            boolean z6 = (oqfVar == null || z2) ? false : true;
            Object O11 = av8Var.O();
            a99 a99Var3 = nf3.a;
            Object obj8 = O11;
            if (O11 == a99Var3) {
                e1d f15 = e.f(Boolean.valueOf(!z6));
                av8Var.n0(f15);
                obj8 = f15;
            }
            e1d e1dVar5 = (e1d) obj8;
            if (z6) {
                av8Var.d0(-1338314402);
                Boolean valueOf3 = Boolean.valueOf(z);
                boolean z7 = (i4 & 896) == 256;
                Object O12 = av8Var.O();
                Object obj9 = O12;
                if (z7 || O12 == a99Var3) {
                    hw6 hw6Var = new hw6(z, e1dVar5, null, 1);
                    av8Var.n0(hw6Var);
                    obj9 = hw6Var;
                }
                hz8.q(valueOf3, oqfVar4, (Function2) obj9, av8Var);
                av8Var.s(false);
            } else {
                av8Var.d0(-1338052049);
                av8Var.s(false);
            }
            boolean z8 = (57344 & i4) == 16384;
            Object O13 = av8Var.O();
            Object obj10 = O13;
            if (z8 || O13 == a99Var3) {
                ve7 ve7Var = new ve7(16, function02);
                av8Var.n0(ve7Var);
                obj10 = ve7Var;
            }
            tol.a((i4 >> 6) & 14, 0, av8Var, (Function0) obj10, z);
            function03 = function0;
            e1d g5 = e.g(function03, av8Var);
            xtcVar2 = xtcVar;
            xtc Y = fz8.Y(xtcVar2, n9a.a);
            Object O14 = av8Var.O();
            if (O14 == a99Var3) {
                e1dVar2 = e1dVar;
                fw6 fw6Var = new fw6(15, e1dVar2);
                av8Var.n0(fw6Var);
                obj4 = fw6Var;
            } else {
                e1dVar2 = e1dVar;
                obj4 = O14;
            }
            xtc A = un0.A(Y, (Function1) obj4);
            boolean g6 = av8Var.g(g5);
            Object O15 = av8Var.O();
            if (g6 || O15 == a99Var3) {
                z4 = true;
                aq7 aq7Var = new aq7(true ? 1 : 0, g5);
                av8Var.n0(aq7Var);
                obj5 = aq7Var;
            } else {
                z4 = true;
                obj5 = O15;
            }
            xtc a4 = koi.a(A, unit, (PointerInputEventHandler) obj5);
            k1c c3 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, a4);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            ?? r13 = tc3Var;
            r13.invoke(av8Var, 6);
            Object O16 = av8Var.O();
            Object obj11 = O16;
            if (O16 == a99Var3) {
                h1d h1dVar = new h1d(Boolean.FALSE);
                av8Var.n0(h1dVar);
                obj11 = h1dVar;
            }
            h1d h1dVar2 = (h1d) obj11;
            h1dVar2.R(Boolean.valueOf((z && ((Boolean) e1dVar5.getValue()).booleanValue()) ? z4 : false));
            if (((Boolean) ((eoh) h1dVar2.c).getValue()).booleanValue() || ((Boolean) ((eoh) h1dVar2.d).getValue()).booleanValue()) {
                av8Var.d0(1501273806);
                int i9 = ((i4 >> 3) & 7168) | i5 | 12582912 | (i4 & 112);
                b(gv9Var, function1, h1dVar2, function02, ad5Var3, (oqf) e1dVar2.getValue(), oqfVar5, false, av8Var, i9);
                b(gv9Var, function1, h1dVar2, function02, ad5Var3, (oqf) e1dVar2.getValue(), oqfVar5, true, av8Var, i9);
                av8Var.s(false);
                z4 = true;
            } else {
                av8Var.d0(1502295349);
                av8Var.s(false);
            }
            av8Var.s(z4);
            hd5Var2 = hd5Var3;
            tc3Var2 = r13;
        } else {
            tc3Var2 = tc3Var;
            av8Var.W();
            hd5Var2 = hd5Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final Function0 function04 = function03;
            final xtc xtcVar3 = xtcVar2;
            final tc3 tc3Var4 = tc3Var2;
            u.d = new Function2() { // from class: ooa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj12, Object obj13) {
                    ((Integer) obj13).getClass();
                    i9a.c(gv9.this, function1, z, function04, function02, xtcVar3, hd5Var2, oqfVar, z2, tc3Var4, (of3) obj12, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(lya lyaVar, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1844047578);
        int i2 = i | (av8Var.g(lyaVar) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            int i3 = lyaVar.d;
            utc utcVar = utc.a;
            xtc l = bkh.l(l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 32.0f);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = jxa.f;
                av8Var.n0(O2);
            }
            td4.G(i3, tol.y(l, true, false, true, D, wzcVar, new i4b((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, lyaVar, 0), av8Var, 0), false, 0L, av8Var, 0, 12);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = mz1.e(av8Var);
            }
            wzc wzcVar2 = (wzc) O3;
            Object[] objArr2 = new Object[0];
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = jxa.g;
                av8Var.n0(O4);
            }
            xtc e0 = l98.e0(tol.y(goaVar, true, true, true, D2, wzcVar2, new i4b((boh) o3a.N(objArr2, (Function0) O4, av8Var, 48), context, lyaVar, 1), av8Var, 0), 8.0f, 8.0f, 16.0f, 8.0f);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e0);
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
            td4.C(lyaVar.a, bkh.l(utcVar, 32.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            u23 a4 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar2);
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
            String str = lyaVar.b;
            long D3 = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, null, D3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8 av8Var2 = av8Var;
            if (lyaVar.c == null) {
                av8Var2.d0(-75451846);
                av8Var2.s(false);
            } else {
                bf3.r(2.0f, -75451845, av8Var2, av8Var2, utcVar);
                udj.c(lyaVar.c, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131066);
                av8Var2 = av8Var2;
                Unit unit = Unit.a;
                av8Var2.s(false);
            }
            i.o(av8Var2, true, utcVar, 16.0f, av8Var2);
            av8 av8Var3 = av8Var2;
            udj.c(((r9k) lyaVar.f.d.invoke(lyaVar.e)).a(av8Var2), bkh.p(utcVar, 104.0f), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 0, 0, null, dfj.a(xth.b(), 0L, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 12582911), av8Var3, 48, 0, 130040);
            av8Var = av8Var3;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(lyaVar, xtcVar, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final int i, final int i2, final tc3 tc3Var, final tc3 tc3Var2, xtc xtcVar, long j, boolean z, boolean z2, boolean z3, float f, int i3, w8l w8lVar, of3 of3Var, final int i4, final int i5) {
        int i6;
        long j2;
        final boolean z4;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        int i9;
        int i10;
        int i11;
        final int i12;
        final w8l w8lVar2;
        final long j3;
        av8 av8Var;
        final boolean z7;
        final boolean z8;
        final xtc xtcVar2;
        final float f2;
        eqf u;
        int i13;
        float f3;
        w8l a2;
        xtc xtcVar3;
        long j4;
        int i14;
        int i15;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1768564354);
        if ((i4 & 6) == 0) {
            i6 = (av8Var2.e(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= av8Var2.e(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= av8Var2.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= av8Var2.i(tc3Var2) ? a.o : 1024;
        }
        int i16 = i6 | 24576;
        if ((196608 & i4) == 0) {
            if ((i5 & 32) == 0) {
                j2 = j;
                if (av8Var2.f(j2)) {
                    i15 = 131072;
                    i16 |= i15;
                }
            } else {
                j2 = j;
            }
            i15 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
            i16 |= i15;
        } else {
            j2 = j;
        }
        int i17 = i5 & 64;
        if (i17 != 0) {
            i16 |= 1572864;
        } else if ((1572864 & i4) == 0) {
            z4 = z;
            i16 |= av8Var2.h(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            i7 = i5 & 128;
            if (i7 == 0) {
                i16 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                z5 = z2;
                i16 |= av8Var2.h(z5) ? 8388608 : 4194304;
                i8 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i8 != 0) {
                    i16 |= 100663296;
                } else if ((100663296 & i4) == 0) {
                    z6 = z3;
                    i16 |= av8Var2.h(z6) ? 67108864 : 33554432;
                    i9 = i5 & 512;
                    if (i9 == 0) {
                        i16 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i10 = i9;
                        i16 |= av8Var2.d(f) ? 536870912 : 268435456;
                        i11 = i16;
                        if (av8Var2.T(i11 & 1, (i16 & 306783379) != 306783378)) {
                            av8Var2.Y();
                            if ((i4 & 1) == 0 || av8Var2.B()) {
                                if ((i5 & 32) != 0) {
                                    j2 = lz.D(R.color.surface_1, av8Var2);
                                    i13 = i11 & (-458753);
                                } else {
                                    i13 = i11;
                                }
                                if (i17 != 0) {
                                    z4 = true;
                                }
                                if (i7 != 0) {
                                    z5 = true;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                f3 = i10 != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f;
                                a2 = alj.a(av8Var2);
                                xtcVar3 = utc.a;
                                j4 = j2;
                                i14 = 300;
                            } else {
                                av8Var2.W();
                                i13 = (i5 & 32) != 0 ? i11 & (-458753) : i11;
                                xtcVar3 = xtcVar;
                                f3 = f;
                                a2 = w8lVar;
                                j4 = j2;
                                i14 = i3;
                            }
                            int i18 = i13;
                            final boolean z9 = z5;
                            final boolean z10 = z6;
                            av8Var2.t();
                            boolean z11 = av8Var2.k(dh3.n) == ema.b;
                            ff5 ff5Var = dh3.h;
                            final float H0 = ((kx4) av8Var2.k(ff5Var)).H0(24.0f);
                            float H02 = ((kx4) av8Var2.k(ff5Var)).H0(4.0f);
                            final float f4 = H0 + H02;
                            final float f5 = ((i - 1) * H02) + (i * H0);
                            final cdi b2 = a60.b(i2, s02.h0(i14, 0, null, 6), "step-indicator-step", av8Var2, 3072, 20);
                            final long D = lz.D(R.color.primary_default, av8Var2);
                            float f6 = f3;
                            xtc xtcVar4 = xtcVar3;
                            final int i19 = i14;
                            final w8l w8lVar3 = a2;
                            final boolean z12 = z4;
                            final boolean z13 = z11;
                            long j5 = j4;
                            uni.a(d2a.E(xtcVar4, f6, null, false, 0L, 30), null, j5, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(871747613, av8Var2, new Function2() { // from class: atd
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ry ryVar;
                                    float f7;
                                    n12 n12Var;
                                    of3 of3Var2 = (of3) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    mv1 mv1Var = uxf.c;
                                    av8 av8Var3 = (av8) of3Var2;
                                    if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                                        utc utcVar = utc.a;
                                        xtc c0 = l98.c0(bkh.g(wnn.B(td4.A0(bkh.d(utcVar, 1.0f), w8l.this)), 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f, 8.0f);
                                        k1c c2 = e12.c(mv1Var, false);
                                        int hashCode = Long.hashCode(av8Var3.T);
                                        aee m = av8Var3.m();
                                        xtc C = fqj.C(av8Var3, c0);
                                        if3.k7.getClass();
                                        zg3 zg3Var = hf3.b;
                                        av8Var3.h0();
                                        if (av8Var3.S) {
                                            av8Var3.l(zg3Var);
                                        } else {
                                            av8Var3.q0();
                                        }
                                        f50 f50Var = hf3.g;
                                        waa.K(av8Var3, c2, f50Var);
                                        ff3 ff3Var = hf3.f;
                                        waa.K(av8Var3, m, ff3Var);
                                        Integer valueOf = Integer.valueOf(hashCode);
                                        f50 f50Var2 = hf3.j;
                                        waa.K(av8Var3, valueOf, f50Var2);
                                        ry ryVar2 = hf3.k;
                                        waa.J(av8Var3, ryVar2);
                                        f50 f50Var3 = hf3.d;
                                        waa.K(av8Var3, C, f50Var3);
                                        if (z9) {
                                            ryVar = ryVar2;
                                            f7 = 1.0f;
                                        } else {
                                            ryVar = ryVar2;
                                            f7 = 0.0f;
                                        }
                                        int i20 = i19;
                                        ry ryVar3 = ryVar;
                                        cdi b3 = a60.b(f7, s02.h0(i20, 0, null, 6), null, av8Var3, 0, 28);
                                        mv1 mv1Var2 = uxf.f;
                                        n12 n12Var2 = n12.a;
                                        xtc a3 = n12Var2.a(utcVar, mv1Var2);
                                        boolean g = av8Var3.g(b3);
                                        Object O = av8Var3.O();
                                        a99 a99Var = nf3.a;
                                        if (g || O == a99Var) {
                                            O = new cl1(b3, 10);
                                            av8Var3.n0(O);
                                        }
                                        xtc M = s02.M(a3, (Function1) O);
                                        k1c c3 = e12.c(mv1Var, false);
                                        int hashCode2 = Long.hashCode(av8Var3.T);
                                        aee m2 = av8Var3.m();
                                        xtc C2 = fqj.C(av8Var3, M);
                                        av8Var3.h0();
                                        if (av8Var3.S) {
                                            av8Var3.l(zg3Var);
                                        } else {
                                            av8Var3.q0();
                                        }
                                        waa.K(av8Var3, c3, f50Var);
                                        waa.K(av8Var3, m2, ff3Var);
                                        bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar3);
                                        waa.K(av8Var3, C2, f50Var3);
                                        tc3Var.invoke(utcVar, av8Var3, 6);
                                        av8Var3.s(true);
                                        cdi b4 = a60.b(z12 ? 1.0f : 0.0f, s02.h0(i20, 0, null, 6), null, av8Var3, 0, 28);
                                        lv1 lv1Var = uxf.m;
                                        ng0 ng0Var = new ng0(4.0f, true, new a70(6));
                                        xtc a4 = n12Var2.a(gz8.x(utcVar, null, null, 3), uxf.g);
                                        boolean g2 = av8Var3.g(b4);
                                        Object O2 = av8Var3.O();
                                        if (g2 || O2 == a99Var) {
                                            n12Var = n12Var2;
                                            O2 = new cl1(b4, 11);
                                            av8Var3.n0(O2);
                                        } else {
                                            n12Var = n12Var2;
                                        }
                                        xtc M2 = s02.M(a4, (Function1) O2);
                                        final cdi cdiVar = b2;
                                        boolean g3 = av8Var3.g(cdiVar);
                                        final float f8 = f4;
                                        boolean d2 = g3 | av8Var3.d(f8);
                                        final boolean z14 = z13;
                                        boolean h = d2 | av8Var3.h(z14);
                                        final float f9 = f5;
                                        boolean d3 = h | av8Var3.d(f9);
                                        final float f10 = H0;
                                        boolean d4 = d3 | av8Var3.d(f10);
                                        final long j6 = D;
                                        boolean f11 = d4 | av8Var3.f(j6);
                                        Object O3 = av8Var3.O();
                                        if (f11 || O3 == a99Var) {
                                            O3 = new Function1() { // from class: ctd
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj3) {
                                                    yma ymaVar = (yma) obj3;
                                                    ymaVar.getClass();
                                                    ymaVar.a();
                                                    float floatValue = ((Number) cdiVar.getValue()).floatValue() * f8;
                                                    boolean z15 = z14;
                                                    float f12 = f10;
                                                    if (z15) {
                                                        floatValue = (f9 - f12) - floatValue;
                                                    }
                                                    float intBitsToFloat = Float.intBitsToFloat((int) (ymaVar.a.n() & 4294967295L));
                                                    ha5.o0(ymaVar, j6, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                                                    return Unit.a;
                                                }
                                            };
                                            av8Var3.n0(O3);
                                        }
                                        xtc Z = td4.Z(M2, (Function1) O3);
                                        l8g a5 = k8g.a(ng0Var, lv1Var, av8Var3, 54);
                                        int hashCode3 = Long.hashCode(av8Var3.T);
                                        aee m3 = av8Var3.m();
                                        xtc C3 = fqj.C(av8Var3, Z);
                                        av8Var3.h0();
                                        if (av8Var3.S) {
                                            av8Var3.l(zg3Var);
                                        } else {
                                            av8Var3.q0();
                                        }
                                        waa.K(av8Var3, a5, f50Var);
                                        waa.K(av8Var3, m3, ff3Var);
                                        bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar3);
                                        waa.K(av8Var3, C3, f50Var3);
                                        av8Var3.d0(877730961);
                                        for (int i21 = 0; i21 < i; i21++) {
                                            nq8.h(av8Var3, n9e.q(bkh.p(bkh.e(utcVar, 4.0f), 24.0f), lz.D(R.color.n_lv_4, av8Var3), oyn.e));
                                        }
                                        av8Var3.s(false);
                                        av8Var3.s(true);
                                        cdi b5 = a60.b(z10 ? 1.0f : 0.0f, s02.h0(i20, 0, null, 6), null, av8Var3, 0, 28);
                                        xtc a6 = n12Var.a(utcVar, uxf.h);
                                        boolean g4 = av8Var3.g(b5);
                                        Object O4 = av8Var3.O();
                                        if (g4 || O4 == a99Var) {
                                            O4 = new cl1(b5, 12);
                                            av8Var3.n0(O4);
                                        }
                                        xtc M3 = s02.M(a6, (Function1) O4);
                                        k1c c4 = e12.c(mv1Var, false);
                                        int hashCode4 = Long.hashCode(av8Var3.T);
                                        aee m4 = av8Var3.m();
                                        xtc C4 = fqj.C(av8Var3, M3);
                                        if3.k7.getClass();
                                        zg3 zg3Var2 = hf3.b;
                                        av8Var3.h0();
                                        if (av8Var3.S) {
                                            av8Var3.l(zg3Var2);
                                        } else {
                                            av8Var3.q0();
                                        }
                                        waa.K(av8Var3, c4, hf3.g);
                                        waa.K(av8Var3, m4, hf3.f);
                                        waa.K(av8Var3, Integer.valueOf(hashCode4), hf3.j);
                                        waa.J(av8Var3, hf3.k);
                                        waa.K(av8Var3, C4, hf3.d);
                                        tc3Var2.invoke(utcVar, av8Var3, 6);
                                        av8Var3.s(true);
                                        av8Var3.s(true);
                                    } else {
                                        av8Var3.W();
                                    }
                                    return Unit.a;
                                }
                            }), av8Var2, ((i18 >> 9) & 896) | 12582912, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                            j3 = j5;
                            av8Var = av8Var2;
                            i12 = i19;
                            w8lVar2 = w8lVar3;
                            z7 = z9;
                            z4 = z12;
                            z8 = z10;
                            xtcVar2 = xtcVar4;
                            f2 = f6;
                        } else {
                            av8Var2.W();
                            i12 = i3;
                            w8lVar2 = w8lVar;
                            j3 = j2;
                            av8Var = av8Var2;
                            z7 = z5;
                            z8 = z6;
                            xtcVar2 = xtcVar;
                            f2 = f;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new Function2() { // from class: btd
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int K = aba.K(i4 | 1);
                                    i9a.f(i, i2, tc3Var, tc3Var2, xtcVar2, j3, z4, z7, z8, f2, i12, w8lVar2, (of3) obj, K, i5);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i10 = i9;
                    i11 = i16;
                    if (av8Var2.T(i11 & 1, (i16 & 306783379) != 306783378)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                z6 = z3;
                i9 = i5 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i16;
                if (av8Var2.T(i11 & 1, (i16 & 306783379) != 306783378)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            z5 = z2;
            i8 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i8 != 0) {
            }
            z6 = z3;
            i9 = i5 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i16;
            if (av8Var2.T(i11 & 1, (i16 & 306783379) != 306783378)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z4 = z;
        i7 = i5 & 128;
        if (i7 == 0) {
        }
        z5 = z2;
        i8 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i8 != 0) {
        }
        z6 = z3;
        i9 = i5 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i16;
        if (av8Var2.T(i11 & 1, (i16 & 306783379) != 306783378)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void g(int i, of3 of3Var, xtc xtcVar, Integer num, String str) {
        String str2;
        boolean z;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1611530621);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16) | (av8Var.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 3;
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            if (num == null) {
                av8Var.d0(-299636953);
                av8Var.s(false);
                str2 = str;
                z = true;
            } else {
                av8Var.d0(-299636952);
                ImageVector N = s6a.N(num.intValue(), (i3 & 112) | 6, av8Var);
                av8Var.d0(947551834);
                av8Var.s(false);
                long j = r13.i;
                utc utcVar = utc.a;
                kq9.b(N, null, bkh.l(utcVar, 24.0f), j, av8Var, 432, 0);
                yf8 yf8Var = xth.a;
                udj.c(str, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, i2 & 14, 0, 131064);
                str2 = str;
                av8Var = av8Var;
                kq9.b(s6a.N(R.drawable.ic_chevron_right, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var.s(false);
                z = true;
            }
            av8Var.s(z);
        } else {
            str2 = str;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mw6(str2, xtcVar, num, i);
        }
    }

    public static final void h(String str, d7e d7eVar, Function0 function0, xtc xtcVar, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        xtc xtcVar3;
        str.getClass();
        d7eVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(846433935);
        int i4 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.i(d7eVar) ? 32 : 16) | (av8Var.i(function0) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i4 | (av8Var.g(xtcVar2) ? a.o : 1024);
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i5 != 0 ? utcVar : xtcVar2;
            lv1 lv1Var = uxf.m;
            xtc q = n9e.q(wnn.A(xtcVar4, o7g.a(12.0f)), lz.D(R.color.surface_2, av8Var), oyn.e);
            boolean z = (i3 & 896) == 256;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new rsd(9, function0);
                av8Var.n0(O);
            }
            xtc xtcVar5 = xtcVar4;
            xtc b0 = l98.b0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 8.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.a(d7eVar, null, bkh.l(utcVar, 24.0f), lz.D(R.color.primary_default, av8Var), av8Var, 440 | ((i3 >> 3) & 14), 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            yf8 yf8Var = xth.a;
            udj.c(str, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, i3 & 14, 24960, 110584);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.p(utcVar, 2.0f));
            kq9.a(haa.t(R.drawable.ic_chevron_right_large_16, 0, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 440, 0);
            av8Var.s(true);
            xtcVar3 = xtcVar5;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(str, d7eVar, function0, xtcVar3, i, i2, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(Double d2, final boolean z, xtc xtcVar, p75 p75Var, Integer num, p75 p75Var2, boolean z2, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        int i5;
        p75 p75Var3;
        int i6;
        Integer num2;
        int i7;
        p75 p75Var4;
        int i8;
        boolean z3;
        p75 p75Var5;
        xtc xtcVar3;
        av8 av8Var;
        p75 p75Var6;
        Integer num3;
        boolean z4;
        eqf u;
        int i9;
        boolean z5;
        boolean z6;
        p75 p75Var7;
        Integer num4;
        p75 p75Var8;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1547525314);
        if ((i & 6) == 0) {
            i3 = (av8Var2.g(d2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var2.h(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? a.o : 1024;
            i4 = i3 | 24576;
            i5 = i2 & 32;
            if (i5 == 0) {
                i4 = 221184 | i3;
            } else if ((196608 & i) == 0) {
                p75Var3 = p75Var;
                i4 |= av8Var2.g(p75Var3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i6 = i2 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    num2 = num;
                } else {
                    num2 = num;
                    if ((i & 1572864) == 0) {
                        i4 |= av8Var2.g(num2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                    p75Var4 = p75Var2;
                } else {
                    p75Var4 = p75Var2;
                    if ((i & 12582912) == 0) {
                        i4 |= av8Var2.g(p75Var4) ? 8388608 : 4194304;
                    }
                }
                i8 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i8 != 0) {
                    i4 |= 100663296;
                    z3 = z2;
                } else {
                    z3 = z2;
                    if ((i & 100663296) == 0) {
                        i4 |= av8Var2.h(z3) ? 67108864 : 33554432;
                    }
                }
                if (av8Var2.T(i4 & 1, (i4 & 38347923) != 38347922)) {
                    xtc xtcVar4 = i10 != 0 ? utc.a : xtcVar2;
                    final p75 p75Var9 = i5 != 0 ? null : p75Var3;
                    if (i6 != 0) {
                        num2 = null;
                    }
                    final p75 p75Var10 = i7 != 0 ? null : p75Var4;
                    final boolean z7 = i8 != 0 ? false : z3;
                    final double doubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                    ry ryVar = ry.v;
                    int i11 = i4 & 112;
                    int i12 = i4 & 896;
                    xtc xtcVar5 = xtcVar4;
                    boolean c2 = ((234881024 & i4) == 67108864) | (i11 == 32) | (i12 == 256) | ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608) | av8Var2.c(doubleValue);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (c2 || O == a99Var) {
                        i9 = i4;
                        final Integer num5 = num2;
                        Function1 function1 = new Function1() { // from class: avh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Context context = (Context) obj;
                                context.getClass();
                                FrameLayout frameLayout = new FrameLayout(context);
                                SofascoreRatingView sofascoreRatingView = new SofascoreRatingView(context, null, 6);
                                sofascoreRatingView.setMinimumWidth(ao2.s(32, context));
                                sofascoreRatingView.setMinWidth(ao2.s(32, context));
                                sofascoreRatingView.setShouldAnimate(z);
                                sofascoreRatingView.setAllowZeroRating(z7);
                                p75 p75Var11 = p75Var9;
                                if (p75Var11 != null) {
                                    sofascoreRatingView.setTextSize(1, p75Var11.a);
                                }
                                Integer num6 = num5;
                                if (num6 != null) {
                                    sofascoreRatingView.setTextColor(context.getColor(num6.intValue()));
                                    sofascoreRatingView.setEdgeLineColor(context.getColor(num6.intValue()));
                                }
                                p75 p75Var12 = p75Var10;
                                if (p75Var12 != null) {
                                    sofascoreRatingView.m713setRatingSize0680j_4(p75Var12.a);
                                }
                                sofascoreRatingView.m(doubleValue, false);
                                frameLayout.addView(sofascoreRatingView);
                                return frameLayout;
                            }
                        };
                        z5 = z;
                        z6 = z7;
                        p75Var7 = p75Var9;
                        num4 = num5;
                        p75Var8 = p75Var10;
                        av8Var2.n0(function1);
                        O = function1;
                    } else {
                        z6 = z7;
                        p75Var7 = p75Var9;
                        i9 = i4;
                        p75Var8 = p75Var10;
                        num4 = num2;
                        z5 = z;
                    }
                    Function1 function12 = (Function1) O;
                    boolean c3 = ((57344 & i9) == 16384) | av8Var2.c(doubleValue) | (i11 == 32) | (i12 == 256);
                    Object O2 = av8Var2.O();
                    if (c3 || O2 == a99Var) {
                        O2 = new zj8(doubleValue, z5);
                        av8Var2.n0(O2);
                    }
                    xtcVar3 = xtcVar5;
                    td4.b(function12, xtcVar3, ryVar, null, (Function1) O2, av8Var2, (i9 >> 6) & 112, 8);
                    av8Var = av8Var2;
                    p75Var5 = p75Var7;
                    num3 = num4;
                    p75Var6 = p75Var8;
                    z4 = z6;
                } else {
                    av8Var2.W();
                    p75Var5 = p75Var3;
                    xtcVar3 = xtcVar2;
                    av8Var = av8Var2;
                    p75Var6 = p75Var4;
                    num3 = num2;
                    z4 = z3;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new h47(d2, z, xtcVar3, p75Var5, num3, p75Var6, z4, i, i2);
                    return;
                }
                return;
            }
            p75Var3 = p75Var;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i8 != 0) {
            }
            if (av8Var2.T(i4 & 1, (i4 & 38347923) != 38347922)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i3 | 24576;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        p75Var3 = p75Var;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i8 != 0) {
        }
        if (av8Var2.T(i4 & 1, (i4 & 38347923) != 38347922)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(final Double d2, final boolean z, final boolean z2, xtc xtcVar, boolean z3, boolean z4, p75 p75Var, of3 of3Var, final int i, final int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        p75 p75Var2;
        final boolean z7;
        final xtc xtcVar3;
        final p75 p75Var3;
        final boolean z8;
        eqf u;
        int i7;
        xtc xtcVar4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(149463888);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(d2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? a.o : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z5 = z3;
                i3 |= av8Var.h(z5) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    z6 = z4;
                } else {
                    z6 = z4;
                    if ((i & 196608) == 0) {
                        i3 |= av8Var.h(z6) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    p75Var2 = p75Var;
                } else {
                    p75Var2 = p75Var;
                    if ((i & 1572864) == 0) {
                        i3 |= av8Var.g(p75Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                }
                if (av8Var.T(i3 & 1, (i3 & 599187) != 599186)) {
                    if (i8 != 0) {
                        xtcVar4 = utc.a;
                        i7 = i4;
                    } else {
                        i7 = i4;
                        xtcVar4 = xtcVar2;
                    }
                    z8 = i7 != 0 ? false : z5;
                    if (i5 != 0) {
                        z6 = false;
                    }
                    p75Var3 = i6 != 0 ? null : p75Var2;
                    ry ryVar = ry.v;
                    int i9 = i3 & 112;
                    int i10 = i3 & 896;
                    boolean z9 = ((458752 & i3) == 131072) | (i9 == 32) | (i10 == 256) | ((3670016 & i3) == 1048576);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (z9 || O == a99Var) {
                        O = new bvh(z, z2, z6, p75Var3);
                        av8Var.n0(O);
                    }
                    Function1 function1 = (Function1) O;
                    int i11 = i3;
                    boolean z10 = ((57344 & i3) == 16384) | ((i11 & 14) == 4) | (i9 == 32) | (i10 == 256);
                    Object O2 = av8Var.O();
                    if (z10 || O2 == a99Var) {
                        O2 = new bvh(z8, d2, z, z2);
                        av8Var.n0(O2);
                    }
                    td4.b(function1, xtcVar4, ryVar, null, (Function1) O2, av8Var, (i11 >> 6) & 112, 8);
                    z7 = z6;
                    xtcVar3 = xtcVar4;
                } else {
                    av8Var.W();
                    z7 = z6;
                    xtcVar3 = xtcVar2;
                    p75Var3 = p75Var2;
                    z8 = z5;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: cvh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            i9a.j(d2, z, z2, xtcVar3, z8, z7, p75Var3, (of3) obj, aba.K(i | 1), i2);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            z5 = z3;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if (av8Var.T(i3 & 1, (i3 & 599187) != 599186)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z5 = z3;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 599187) != 599186)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void k(mhj mhjVar, r13 r13Var, long j, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        int i3;
        ff3 ff3Var;
        long j2;
        int i4 = mhjVar.a;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(675043501);
        int i5 = i & 6;
        p8g p8gVar = p8g.a;
        if (i5 == 0) {
            i2 = (av8Var2.g(p8gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(mhjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(r13Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.f(j) ? a.o : 1024;
        }
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc r = bkh.r(wnn.A(p8gVar.a(1.0f, utcVar, true), o7g.a(8.0f)), null, 3);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, r);
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
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var2, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            n12 n12Var = n12.a;
            xtc b2 = n12Var.b(utcVar);
            if (r13Var == null) {
                i3 = i2;
                ff3Var = ff3Var2;
                j2 = ljg.f(av8Var2, 1722056356, R.color.on_color_highlight_2, av8Var2, false);
            } else {
                i3 = i2;
                av8Var2.d0(1722055767);
                av8Var2.s(false);
                ff3Var = ff3Var2;
                j2 = r13Var.a;
            }
            e12.a(0, av8Var2, n9e.q(b2, j2, oyn.e));
            xtc a2 = n12Var.a(l98.b0(utcVar, 8.0f), uxf.g);
            l8g a3 = k8g.a(ww9.f, uxf.l, av8Var2, 6);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, a2);
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
            ye9 ye9Var = mo.a;
            ebl eblVar = new ebl(ye9Var);
            String U = StringsKt.U(2, String.valueOf(i4));
            yf8 yf8Var = xth.a;
            int i6 = (i3 >> 3) & 896;
            udj.c(U, eblVar, j, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var2, i6, 0, 131064);
            av8Var = av8Var2;
            xtc f0 = l98.f0(new ebl(ye9Var), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            String upperCase = oea.w(mhjVar.b, new Object[]{Integer.valueOf(i4)}, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            udj.c(upperCase, f0, j, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, i6, 24960, 110584);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bo7(mhjVar, r13Var, j, i, 3);
        }
    }

    public static final void l(int i, long j, of3 of3Var, xtc xtcVar, d7e d7eVar, String str) {
        str.getClass();
        d7eVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1405037938);
        int i2 = (av8Var.g(str) ? 4 : 2) | i | (av8Var.i(d7eVar) ? 32 : 16) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            utc utcVar = utc.a;
            kq9.a(d7eVar, null, bkh.l(utcVar, 16.0f), j, av8Var, ((i2 >> 3) & 14) | 440 | ((i2 << 3) & 7168), 0);
            goa d2 = bf3.d(utcVar, 8.0f, av8Var, 1.0f, false);
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, d2, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, i2 & 14, 24960, 110584);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new jq9(str, d7eVar, j, xtcVar, i);
        }
    }

    public static final void m(fnk fnkVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2021488395);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(fnkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            tc3 H = yqo.H(-1795347228, av8Var2, new lqj(fnkVar, 11));
            tc3 tc3Var = pco.d;
            tc3 tc3Var2 = pco.e;
            tc3 H2 = yqo.H(1736340934, av8Var2, new kr1(fnkVar, 6));
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new fej(15, function1, fnkVar);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, H, tc3Var, tc3Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, H2, null, null, (Function0) O, av8Var, ((i2 >> 6) & 14) | 100666800, 1776);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(fnkVar, function1, xtcVar, i, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(int i, int i2, boolean z, Function0 function0, Function1 function1, xtc xtcVar, of3 of3Var, int i3) {
        xtc xtcVar2;
        boolean z2;
        Object O;
        a99 a99Var;
        int i4;
        boolean z3;
        Object O2;
        ff3 ff3Var;
        Object O3;
        Object O4;
        n1k n1kVar;
        function0.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-770137986);
        int i5 = i3 | (av8Var.e(i) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192) | 196608;
        if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
            utc utcVar = utc.a;
            Context context = (Context) av8Var.k(nz.b);
            if ((i == 0 && i2 > 0) || z) {
                context.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                if (sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                    z2 = true;
                    xtc d2 = bkh.d(utcVar, 1.0f);
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, d2);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, c2, f50Var);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var, m, ff3Var2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    n12 n12Var = n12.a;
                    av8Var.d0(-521799212);
                    xtc f0 = l98.f0(n12Var.a(utcVar, uxf.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, !z2 ? 8.0f : 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9);
                    O = av8Var.O();
                    a99Var = nf3.a;
                    if (O != a99Var) {
                        i4 = i5;
                        O = new nxk(6);
                        av8Var.n0(O);
                    } else {
                        i4 = i5;
                    }
                    xtc B = dy0.B(f0, (Function1) O);
                    z3 = (i4 & 57344) != 16384;
                    O2 = av8Var.O();
                    if (!z3 || O2 == a99Var) {
                        O2 = new fuj(4, function1);
                        av8Var.n0(O2);
                    }
                    xtc A = un0.A(B, (Function1) O2);
                    if (z2) {
                        ff3Var = ff3Var2;
                        d2a.E(utcVar, 4.0f, o7g.a(8.0f), false, 0L, 28);
                        A = A.z(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var), o7g.a(8.0f)));
                    } else {
                        ff3Var = ff3Var2;
                    }
                    av8Var.s(false);
                    long D = lz.D(R.color.n_lv_4, av8Var);
                    O3 = av8Var.O();
                    if (O3 == a99Var) {
                        O3 = mz1.e(av8Var);
                    }
                    wzc wzcVar = (wzc) O3;
                    xtc xtcVar3 = A;
                    Object[] objArr = new Object[0];
                    O4 = av8Var.O();
                    if (O4 == a99Var) {
                        O4 = wzj.i;
                        av8Var.n0(O4);
                    }
                    ff3 ff3Var3 = ff3Var;
                    xtc c0 = l98.c0(tol.y(xtcVar3, true, true, true, D, wzcVar, new cyg((boh) o3a.N(objArr, (Function0) O4, av8Var, 48), function0, 27), av8Var, 0), 8.0f, 4.0f);
                    l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, c0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    waa.K(av8Var, a2, f50Var);
                    waa.K(av8Var, m2, ff3Var3);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    kq9.a(haa.t(R.drawable.ic_weekly_streak, 0, av8Var), null, u6h.C(bkh.l(utcVar, 16.0f), (!z2 || Boolean.valueOf(z).equals(Boolean.TRUE)) ? 0.4f : 1.0f), r13.i, av8Var, 3128, 0);
                    if (!Boolean.valueOf(z).equals(Boolean.TRUE)) {
                        av8Var.d0(-768878305);
                        String string = context.getString(R.string.streak_restore_pending_label);
                        yf8 yf8Var = xth.a;
                        n1kVar = new n1k(string, xth.l(), new r13(lz.D(R.color.primary_default, av8Var)));
                        av8Var.s(false);
                    } else if (z2) {
                        av8Var.d0(-768873384);
                        String string2 = context.getString(R.string.streak_restore_button);
                        yf8 yf8Var2 = xth.a;
                        n1kVar = new n1k(string2, xth.l(), new r13(lz.D(R.color.primary_default, av8Var)));
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-768869042);
                        String valueOf2 = String.valueOf(i);
                        yf8 yf8Var3 = xth.a;
                        n1kVar = new n1k(valueOf2, xth.m(), new r13(lz.D(R.color.n_lv_1, av8Var)));
                        av8Var.s(false);
                    }
                    Object obj = n1kVar.a;
                    obj.getClass();
                    udj.c((String) obj, l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), ((r13) n1kVar.c).a, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, (dfj) n1kVar.b, av8Var, 48, 24576, 114680);
                    av8Var = av8Var;
                    av8Var.s(true);
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                }
            }
            z2 = false;
            xtc d22 = bkh.d(utcVar, 1.0f);
            k1c c22 = e12.c(uxf.c, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d22);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, c22, f50Var4);
            ff3 ff3Var22 = hf3.f;
            waa.K(av8Var, m3, ff3Var22);
            Integer valueOf3 = Integer.valueOf(hashCode3);
            f50 f50Var22 = hf3.j;
            waa.K(av8Var, valueOf3, f50Var22);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var32 = hf3.d;
            waa.K(av8Var, C3, f50Var32);
            n12 n12Var2 = n12.a;
            av8Var.d0(-521799212);
            xtc f02 = l98.f0(n12Var2.a(utcVar, uxf.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, !z2 ? 8.0f : 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9);
            O = av8Var.O();
            a99Var = nf3.a;
            if (O != a99Var) {
            }
            xtc B2 = dy0.B(f02, (Function1) O);
            if ((i4 & 57344) != 16384) {
            }
            O2 = av8Var.O();
            if (!z3) {
            }
            O2 = new fuj(4, function1);
            av8Var.n0(O2);
            xtc A2 = un0.A(B2, (Function1) O2);
            if (z2) {
            }
            av8Var.s(false);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            O3 = av8Var.O();
            if (O3 == a99Var) {
            }
            wzc wzcVar2 = (wzc) O3;
            xtc xtcVar32 = A2;
            Object[] objArr2 = new Object[0];
            O4 = av8Var.O();
            if (O4 == a99Var) {
            }
            ff3 ff3Var32 = ff3Var;
            xtc c02 = l98.c0(tol.y(xtcVar32, true, true, true, D2, wzcVar2, new cyg((boh) o3a.N(objArr2, (Function0) O4, av8Var, 48), function0, 27), av8Var, 0), 8.0f, 4.0f);
            l8g a22 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode22 = Long.hashCode(av8Var.T);
            aee m22 = av8Var.m();
            xtc C22 = fqj.C(av8Var, c02);
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a22, f50Var4);
            waa.K(av8Var, m22, ff3Var32);
            bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
            waa.K(av8Var, C22, f50Var32);
            kq9.a(haa.t(R.drawable.ic_weekly_streak, 0, av8Var), null, u6h.C(bkh.l(utcVar, 16.0f), (!z2 || Boolean.valueOf(z).equals(Boolean.TRUE)) ? 0.4f : 1.0f), r13.i, av8Var, 3128, 0);
            if (!Boolean.valueOf(z).equals(Boolean.TRUE)) {
            }
            Object obj2 = n1kVar.a;
            obj2.getClass();
            udj.c((String) obj2, l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), ((r13) n1kVar.c).a, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, (dfj) n1kVar.b, av8Var, 48, 24576, 114680);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vm7(i, i2, z, function0, function1, xtcVar2, i3);
        }
    }

    public static final void o(final js8 js8Var, final xtc xtcVar, boolean z, Integer num, r13 r13Var, r13 r13Var2, String str, String str2, Function0 function0, of3 of3Var, final int i, final int i2) {
        boolean z2;
        int i3;
        Integer num2;
        int i4;
        r13 r13Var3;
        int i5;
        r13 r13Var4;
        int i6;
        String str3;
        int i7;
        int i8;
        int i9;
        av8 av8Var;
        final String str4;
        final boolean z3;
        final Integer num3;
        final String str5;
        final r13 r13Var5;
        final r13 r13Var6;
        final Function0 function02;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Function0 function03;
        r13 r13Var7;
        long j;
        Function0 function04;
        String str11;
        String str12;
        f50 f50Var;
        r13 r13Var8;
        String str13;
        Function0 function05;
        ff3 ff3Var;
        n12 n12Var;
        zg3 zg3Var;
        float f;
        boolean z4;
        lv1 lv1Var = uxf.l;
        jf9 jf9Var = oyn.e;
        js8Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(214959249);
        int i10 = i | (av8Var2.g(js8Var) ? 4 : 2) | (av8Var2.g(xtcVar) ? 32 : 16);
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 = i10 | 384;
            z2 = z;
        } else {
            z2 = z;
            i3 = i10 | (av8Var2.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i4 = i3 | 3072;
            num2 = num;
        } else {
            num2 = num;
            i4 = i3 | (av8Var2.g(num2) ? a.o : 1024);
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i5 = i4 | 24576;
            r13Var3 = r13Var;
        } else {
            r13Var3 = r13Var;
            i5 = i4 | (av8Var2.g(r13Var3) ? 16384 : 8192);
        }
        int i14 = i2 & 32;
        if (i14 != 0) {
            i6 = i5 | 196608;
            r13Var4 = r13Var2;
        } else {
            r13Var4 = r13Var2;
            i6 = i5 | (av8Var2.g(r13Var4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }
        int i15 = i2 & 64;
        if (i15 != 0) {
            i7 = i6 | 1572864;
            str3 = str;
        } else {
            str3 = str;
            i7 = i6 | (av8Var2.g(str3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i16 = i7;
        int i17 = i2 & 128;
        if (i17 != 0) {
            i8 = i16 | 12582912;
        } else {
            i8 = i16 | (av8Var2.g(str2) ? 8388608 : 4194304);
        }
        int i18 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i18 != 0) {
            i9 = i8 | 100663296;
        } else {
            i9 = i8 | (av8Var2.i(function0) ? 67108864 : 33554432);
        }
        int i19 = i9;
        if (av8Var2.T(i19 & 1, (i19 & 38347923) != 38347922)) {
            if (i11 != 0) {
                z2 = false;
            }
            if (i12 != 0) {
                num2 = null;
            }
            r13 r13Var9 = i13 != 0 ? null : r13Var3;
            r13 r13Var10 = i14 != 0 ? null : r13Var4;
            if (i15 != 0) {
                str3 = null;
            }
            String str14 = i17 != 0 ? null : str2;
            Function0 function06 = i18 != 0 ? null : function0;
            Context context = (Context) av8Var2.k(nz.b);
            boolean z5 = z2;
            Integer num4 = num2;
            if (!z5 || num4 == null) {
                str6 = str14;
                str7 = str3;
                str8 = null;
            } else {
                str6 = str14;
                str7 = str3;
                str8 = vxd.j(num4.intValue(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "branding/provider/", "/featured-unique-tournament/16/timer-image");
            }
            if (num4 != null) {
                str9 = vxd.j(num4.intValue(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "branding/provider/", "/powered-by-image");
            } else {
                str9 = null;
            }
            boolean z6 = (i19 & 57344) == 16384;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z6 || O == a99Var) {
                if (r13Var9 != null) {
                    function03 = function06;
                    str10 = str8;
                    r13Var7 = new r13(hkg.B(r13.c(r13.b, 0.25f), r13Var9.a));
                } else {
                    str10 = str8;
                    function03 = function06;
                    r13Var7 = null;
                }
                av8Var2.n0(r13Var7);
                O = r13Var7;
            } else {
                str10 = str8;
                function03 = function06;
            }
            r13 r13Var11 = (r13) O;
            if (r13Var10 == null) {
                j = ljg.f(av8Var2, 417435039, R.color.on_color_primary, av8Var2, false);
            } else {
                av8Var2.d0(417434481);
                av8Var2.s(false);
                j = r13Var10.a;
            }
            long j2 = j;
            xtc A = wnn.A(bkh.d(xtcVar, 1.0f), o7g.a(16.0f));
            utc utcVar = utc.a;
            if (r13Var9 != null) {
                A = A.z(n9e.q(utcVar, r13Var9.a, jf9Var));
            }
            xtc xtcVar2 = A;
            boolean z7 = (function03 == null && str7 == null) ? false : true;
            boolean i20 = ((i19 & 29360128) == 8388608) | ((i19 & 234881024) == 67108864) | av8Var2.i(context) | ((i19 & 3670016) == 1048576);
            Object O2 = av8Var2.O();
            if (i20 || O2 == a99Var) {
                O2 = new fjl(function03, context, str6, str7, 0);
                function04 = function03;
                str11 = str6;
                str12 = str7;
                av8Var2.n0(O2);
            } else {
                function04 = function03;
                str11 = str6;
                str12 = str7;
            }
            xtc y = tol.y(xtcVar2, z7, false, false, 0L, null, (Function0) O2, av8Var2, 30);
            av8 av8Var3 = av8Var2;
            xtc b0 = l98.b0(y, 2.0f);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            String str15 = str9;
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, b0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var3.h0();
            String str16 = str12;
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var3, c2, f50Var2);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var3, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var3);
            ry ryVar = hf3.k;
            waa.J(av8Var3, ryVar);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var3, C, f50Var4);
            ug5 ug5Var = mp3.a;
            n12 n12Var2 = n12.a;
            if (str10 == null && r13Var11 == null) {
                r13Var8 = r13Var10;
                av8Var3.d0(-344369324);
                str13 = str11;
                function05 = function04;
                f50Var = f50Var4;
                n12Var = n12Var2;
                ff3Var = ff3Var2;
                zg3Var = zg3Var2;
                wkn.l(s6a.N(R.drawable.wc26_headern_pattern, 6, av8Var3), n9e.q(wnn.A(n12Var2.b(utcVar), o7g.a(16.0f)), lz.D(R.color.graphics_dark, av8Var3), jf9Var), null, ug5Var, 0.75f, null, av8Var3, 221232, 72);
                av8Var3 = av8Var3;
                av8Var3.s(false);
            } else {
                f50Var = f50Var4;
                r13Var8 = r13Var10;
                str13 = str11;
                function05 = function04;
                ff3Var = ff3Var2;
                n12Var = n12Var2;
                zg3Var = zg3Var2;
                av8Var3.d0(-343956745);
                av8Var3.s(false);
            }
            xtc A2 = wnn.A(utcVar, o7g.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f));
            if (r13Var11 != null) {
                A2 = A2.z(n9e.q(utcVar, r13Var11.a, jf9Var));
            }
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var3, 48);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, A2);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, f50Var2);
            waa.K(av8Var3, m2, ff3Var);
            bf3.s(hashCode2, av8Var3, f50Var3, av8Var3, ryVar);
            waa.K(av8Var3, C2, f50Var);
            if (str15 != null) {
                av8Var3.d0(882961807);
                xtc O3 = kda.O(bkh.e(bkh.d(utcVar, 1.0f), 24.0f), "wc26_timer_brand_strip", av8Var3);
                if (r13Var9 != null) {
                    O3 = O3.z(n9e.q(utcVar, r13Var9.a, jf9Var));
                }
                l8g a3 = k8g.a(ww9.f, lv1Var, av8Var3, 6);
                int hashCode3 = Long.hashCode(av8Var3.T);
                aee m3 = av8Var3.m();
                xtc C3 = fqj.C(av8Var3, O3);
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var);
                } else {
                    av8Var3.q0();
                }
                waa.K(av8Var3, a3, f50Var2);
                waa.K(av8Var3, m3, ff3Var);
                bf3.s(hashCode3, av8Var3, f50Var3, av8Var3, ryVar);
                waa.K(av8Var3, C3, f50Var);
                f = 1.0f;
                td4.h(48, av8Var3, bkh.e(bkh.d(utcVar, 1.0f), 24.0f), str15);
                av8Var3.s(true);
                z4 = false;
                av8Var3.s(false);
            } else {
                f = 1.0f;
                z4 = false;
                av8Var3.d0(883636429);
                av8Var3.s(false);
            }
            xtc d2 = bkh.d(utcVar, f);
            k1c c3 = e12.c(mv1Var, z4);
            int hashCode4 = Long.hashCode(av8Var3.T);
            aee m4 = av8Var3.m();
            xtc C4 = fqj.C(av8Var3, d2);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, c3, f50Var2);
            waa.K(av8Var3, m4, ff3Var);
            bf3.s(hashCode4, av8Var3, f50Var3, av8Var3, ryVar);
            waa.K(av8Var3, C4, f50Var);
            if (str10 != null) {
                av8Var3.d0(-28663261);
                td4.f(str10, ug5Var, n12Var.b(utcVar), av8Var3, 48);
                av8Var3.s(false);
            } else {
                av8Var3.d0(-28445517);
                av8Var3.s(false);
            }
            int i21 = js8Var.d;
            mhj mhjVar = new mhj(i21, R.string.days_short);
            mhj mhjVar2 = new mhj(js8Var.e, R.string.hours_short);
            mhj mhjVar3 = new mhj(js8Var.f, R.string.minutes_short);
            r13 r13Var12 = r13Var9;
            mhj mhjVar4 = new mhj(js8Var.g, R.string.seconds_short);
            xtc c0 = l98.c0(kda.O(bkh.d(utcVar, 1.0f), "wc26_timer_countdown", av8Var3), 8.0f, 8.0f);
            l8g a4 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var3, 6);
            int hashCode5 = Long.hashCode(av8Var3.T);
            aee m5 = av8Var3.m();
            xtc C5 = fqj.C(av8Var3, c0);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a4, f50Var2);
            waa.K(av8Var3, m5, ff3Var);
            bf3.s(hashCode5, av8Var3, f50Var3, av8Var3, ryVar);
            waa.K(av8Var3, C5, f50Var);
            int i22 = ((i19 >> 6) & 896) | 6;
            k(i21 > 0 ? mhjVar : mhjVar2, r13Var12, j2, av8Var3, i22);
            av8 av8Var4 = av8Var3;
            k(i21 > 0 ? mhjVar2 : mhjVar3, r13Var12, j2, av8Var4, i22);
            k(i21 > 0 ? mhjVar3 : mhjVar4, r13Var12, j2, av8Var4, i22);
            r13Var5 = r13Var12;
            av8Var = av8Var4;
            i.p(av8Var, true, true, true, true);
            str5 = str16;
            z3 = z5;
            num3 = num4;
            r13Var6 = r13Var8;
            str4 = str13;
            function02 = function05;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            str4 = str2;
            z3 = z2;
            num3 = num2;
            str5 = str3;
            r13Var5 = r13Var3;
            r13Var6 = r13Var4;
            function02 = function0;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(xtcVar, z3, num3, r13Var5, r13Var6, str5, str4, function02, i, i2) { // from class: gjl
                public final /* synthetic */ xtc b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Integer d;
                public final /* synthetic */ r13 e;
                public final /* synthetic */ r13 f;
                public final /* synthetic */ String g;
                public final /* synthetic */ String h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ int j;

                {
                    this.j = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    i9a.o(js8.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (of3) obj, K, this.j);
                    return Unit.a;
                }
            };
        }
    }

    public static Map p(String str, String str2) {
        return fn0.p(str, str2);
    }

    public static final int q(int i, i1d i1dVar) {
        int i2 = i1dVar.c - 1;
        int i3 = 0;
        while (i3 < i2) {
            int f = wt3.f(i2, i3, 2, i3);
            Object[] objArr = i1dVar.a;
            int i4 = ((h9a) objArr[f]).a;
            if (i4 != i) {
                if (i4 < i) {
                    i3 = f + 1;
                    if (i < ((h9a) objArr[i3]).a) {
                    }
                } else {
                    i2 = f - 1;
                }
            }
            return f;
        }
        return i3;
    }

    public static void r(dt5 dt5Var, tug tugVar, w91 w91Var) {
        TextView textView;
        tugVar.getClass();
        w91Var.getClass();
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = dt5Var.f;
        ConstraintLayout constraintLayout = dt5Var.a;
        LinearLayout linearLayout = dt5Var.b;
        tugVar.d(scrollInterceptorHorizontalScrollView);
        tugVar.a(scrollInterceptorHorizontalScrollView, new mme(dt5Var, 3));
        List list = w91Var.b;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            yse yseVar = (yse) obj;
            if (i < linearLayout.getChildCount()) {
                View childAt = linearLayout.getChildAt(i);
                if (childAt == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.TextView");
                    return;
                } else {
                    textView = (TextView) childAt;
                    textView.setVisibility(0);
                }
            } else {
                textView = u22.b(LayoutInflater.from(constraintLayout.getContext()), linearLayout).b;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                Context context = textView.getContext();
                context.getClass();
                layoutParams.width = ao2.v(40, context);
                textView.setLayoutParams(layoutParams);
                linearLayout.addView(textView);
            }
            textView.setVisibility(0);
            r9k g = yseVar.g();
            Context context2 = textView.getContext();
            context2.getClass();
            textView.setText(g.b(context2));
            textView.setOnClickListener(new eyd(9, textView, yseVar));
            i = i2;
        }
        z8e.J(linearLayout, b.i(list));
        constraintLayout.post(new kdc(8, tugVar, dt5Var, dt5Var));
    }

    public static long s(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(lnb.l(j2, ")", ljg.o("overflow: checkedAdd(", j, ", ")));
    }

    public static byte t(long j) {
        z1a.p(j, (j >> 8) == 0, "out of range: %s");
        return (byte) j;
    }

    public static final xtc u(xtc xtcVar, View view, final jvg jvgVar, Function1 function1, of3 of3Var, int i) {
        xtcVar.getClass();
        view.getClass();
        jvgVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.d0(-2016430662);
        final int i2 = 0;
        if (jvgVar.d() || jvgVar.c()) {
            boolean i3 = av8Var.i(jvgVar);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i3 || O == a99Var) {
                O = new Function0() { // from class: iug
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean d2;
                        int i4 = i2;
                        jvg jvgVar2 = jvgVar;
                        switch (i4) {
                            case 0:
                                d2 = jvgVar2.d();
                                break;
                            default:
                                d2 = jvgVar2.c();
                                break;
                        }
                        return Boolean.valueOf(d2);
                    }
                };
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            boolean i4 = av8Var.i(jvgVar);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                final int i5 = 1;
                O2 = new Function0() { // from class: iug
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean d2;
                        int i42 = i5;
                        jvg jvgVar2 = jvgVar;
                        switch (i42) {
                            case 0:
                                d2 = jvgVar2.d();
                                break;
                            default:
                                d2 = jvgVar2.c();
                                break;
                        }
                        return Boolean.valueOf(d2);
                    }
                };
                av8Var.n0(O2);
            }
            xtcVar = v(xtcVar, view, function0, (Function0) O2, function1, av8Var, (i << 3) & 57344);
        } else {
            function1.invoke(Boolean.FALSE);
        }
        av8Var.s(false);
        return xtcVar;
    }

    public static final xtc v(xtc xtcVar, View view, Function0 function0, Function0 function02, Function1 function1, of3 of3Var, int i) {
        xtcVar.getClass();
        view.getClass();
        function0.getClass();
        function02.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        boolean z = av8Var.k(dh3.n) == ema.b;
        Unit unit = Unit.a;
        boolean i2 = av8Var.i(view) | ((((57344 & i) ^ 24576) > 16384 && av8Var.g(function1)) || (i & 24576) == 16384) | av8Var.h(z) | av8Var.g(function02) | av8Var.g(function0);
        Object O = av8Var.O();
        if (i2 || O == nf3.a) {
            kug kugVar = new kug(view, function1, z, function02, function0);
            av8Var.n0(kugVar);
            O = kugVar;
        }
        return koi.a(xtcVar, unit, (PointerInputEventHandler) O);
    }

    public static final f6g w(Context context, Class cls, String str) {
        context.getClass();
        if (StringsKt.R(str)) {
            a70.p("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new f6g(context, cls, str);
        }
        a70.p("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long x(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (ujb.a[roundingMode.ordinal()]) {
            case 1:
                f6a.k(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + i;
            case 4:
                return j3 + i;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + i;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                long abs2 = abs - (Math.abs(j2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (abs2 <= 0) {
                    return j3;
                }
                return j3 + i;
            default:
                ogj.b();
                return 0L;
        }
    }

    public static boolean y(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(U3.i.d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static long z(long j, long j2) {
        f6a.j(j, "a");
        f6a.j(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }
}
