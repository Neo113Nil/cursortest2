package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.play_billing.zzo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.BreakIterator;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KFunction;
import kotlin.text.c;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class hda {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static boolean c = true;
    public static wom d;
    public static CountDownTimer e;

    public static int A(Context context) {
        return o23.e(-1, H(R.attr.colorPrimary, context)) >= 3.0d ? -1 : -570425344;
    }

    public static float B(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static final cl5 C() {
        if (!cl5.d()) {
            return null;
        }
        cl5 a2 = cl5.a();
        if (a2.c() == 1) {
            return a2;
        }
        return null;
    }

    public static Drawable D(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable d0 = td4.d0(obtainStyledAttributes.getResourceId(0, 0), context);
        if (J(context)) {
            d0.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        obtainStyledAttributes.recycle();
        return d0;
    }

    public static final k6b E(u6b u6bVar) {
        u6bVar.getClass();
        return wca.x(u6bVar.getLifecycle());
    }

    public static int F(Context context) {
        return J(context) ? A(context) == -570425344 ? R.style.Theme_MediaRouter_Light : R.style.Theme_MediaRouter_Light_DarkControlPanel : A(context) == -570425344 ? R.style.Theme_MediaRouter_LightControlPanel : R.style.Theme_MediaRouter;
    }

    public static final String G(String str, JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            String string = jSONObject.getString(str);
            if (string.length() == 0) {
                return null;
            }
            return string;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static int H(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int I(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean J(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static final LinkedHashSet K(wek wekVar) {
        nd4 nd4Var;
        nd4[] nd4VarArr = wekVar.g;
        if (nd4VarArr != null) {
            int length = nd4VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    nd4Var = null;
                    break;
                }
                nd4Var = nd4VarArr[i];
                if (Intrinsics.c(nd4Var.b, "nimbus")) {
                    break;
                }
                i++;
            }
            if (nd4Var == null) {
                nd4Var = new nd4();
                int length2 = nd4VarArr.length;
                Arrays.copyOf(nd4VarArr, length2 + 1)[length2] = nd4Var;
            }
        } else {
            nd4Var = new nd4();
            wekVar.g = new nd4[]{nd4Var};
        }
        Set set = nd4Var.c;
        LinkedHashSet V0 = set != null ? CollectionsKt.V0(set) : new LinkedHashSet();
        nd4Var.c = V0;
        return V0;
    }

    public static void L(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof bqd) && !(th instanceof qkc) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof yf3)) {
            th = new kx2(9, "The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static final cdi M(long j, of3 of3Var, int i) {
        e1d N = N(j, of3Var, i & 14);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = goh.b(new e40(j, N));
            av8Var.n0(O);
        }
        return (cdi) O;
    }

    public static final e1d N(long j, of3 of3Var, int i) {
        Long valueOf = Long.valueOf(yaa.w() + xe6.c().b);
        boolean z = (((i & 14) ^ 6) > 4 && ((av8) of3Var).f(j)) || (i & 6) == 4;
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (z || O == nf3.a) {
            O = new z40(j, null);
            av8Var.n0(O);
        }
        return qea.F(av8Var, valueOf, (Function2) O);
    }

    public static final c1h O(wek wekVar, String str) {
        nd4 nd4Var;
        Set set;
        nd4[] nd4VarArr = wekVar.g;
        Object obj = null;
        if (nd4VarArr != null) {
            int length = nd4VarArr.length;
            for (int i = 0; i < length; i++) {
                nd4Var = nd4VarArr[i];
                if (Intrinsics.c(nd4Var.b, "nimbus")) {
                    break;
                }
            }
        }
        nd4Var = null;
        if (nd4Var == null || (set = nd4Var.c) == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.c(((c1h) next).b, str)) {
                obj = next;
                break;
            }
        }
        return (c1h) obj;
    }

    public static void P(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(context.getColor(J(context) ? R.color.mr_cast_progressbar_progress_and_thumb_light : R.color.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }

    public static final q80 Q(CharSequence charSequence, kx4 kx4Var) {
        charSequence.getClass();
        kx4Var.getClass();
        if (!(charSequence instanceof Spanned)) {
            return new q80(charSequence.toString());
        }
        o80 o80Var = new o80();
        o80Var.d(charSequence.toString());
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, charSequence.length(), Object.class);
        spans.getClass();
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 0) {
                    o80Var.a(new pwh(0L, 0L, wg8.g, new rg8(0), (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65523), spanStart, spanEnd);
                } else if (style == 1) {
                    o80Var.a(new pwh(0L, 0L, wg8.j, new rg8(0), (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65523), spanStart, spanEnd);
                } else if (style == 2) {
                    o80Var.a(new pwh(0L, 0L, wg8.g, new rg8(1), (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65523), spanStart, spanEnd);
                } else if (style == 3) {
                    o80Var.a(new pwh(0L, 0L, wg8.j, new rg8(1), (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65523), spanStart, spanEnd);
                }
            } else if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                o80Var.a(new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, Intrinsics.c(family, C.SANS_SERIF_NAME) ? tf8.b : Intrinsics.c(family, C.SERIF_NAME) ? tf8.c : Intrinsics.c(family, "monospace") ? tf8.d : Intrinsics.c(family, "cursive") ? tf8.e : tf8.a, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65503), spanStart, spanEnd);
            } else if (obj instanceof BulletSpan) {
                o80Var.a(new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65535), spanStart, spanEnd);
            } else if (obj instanceof AbsoluteSizeSpan) {
                AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                boolean dip = absoluteSizeSpan.getDip();
                int size = absoluteSizeSpan.getSize();
                o80Var.a(new pwh(0L, dip ? kx4Var.u(size) : kx4Var.N(size), (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65533), spanStart, spanEnd);
            } else if (obj instanceof RelativeSizeSpan) {
                o80Var.a(new pwh(0L, v8a.E(8589934592L, ((RelativeSizeSpan) obj).getSizeChange()), (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65533), spanStart, spanEnd);
            } else if (obj instanceof StrikethroughSpan) {
                o80Var.a(new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, v8j.d, (qah) null, 61439), spanStart, spanEnd);
            } else if (obj instanceof UnderlineSpan) {
                o80Var.a(new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, v8j.c, (qah) null, 61439), spanStart, spanEnd);
            } else if (obj instanceof SuperscriptSpan) {
                o80Var.a(new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, new sn1(0.5f), (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65279), spanStart, spanEnd);
            } else if (obj instanceof SubscriptSpan) {
                o80Var.a(new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, new sn1(-0.5f), (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65279), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                o80Var.a(new pwh(hkg.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534), spanStart, spanEnd);
            } else {
                o80Var.a(new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65535), spanStart, spanEnd);
            }
        }
        return o80Var.h();
    }

    public static void R(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            zrj.i(viewGroup, z);
        } else if (c) {
            try {
                zrj.i(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
    }

    public static final LinkedHashMap S(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        ml3 b2 = e5h.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                IntRange j = llf.j(0, jSONArray.length());
                int c2 = sub.c(k13.r(j, 10));
                if (c2 < 16) {
                    c2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c2);
                v6a it2 = j.iterator();
                while (it2.c) {
                    int nextInt = it2.nextInt();
                    linkedHashMap2.put(String.valueOf(nextInt), jSONArray.get(nextInt));
                }
                obj = CollectionsKt.S0(S(new JSONObject(linkedHashMap2)).values());
            } else if (obj instanceof JSONObject) {
                obj = S((JSONObject) obj);
            } else if (Intrinsics.c(obj, JSONObject.NULL)) {
                obj = null;
            }
            linkedHashMap.put(next, obj);
        }
        return linkedHashMap;
    }

    public static final v2h T(yih yihVar, zz0 zz0Var, v2h v2hVar) {
        int i = zz0Var.c;
        int i2 = zz0Var.b;
        boolean z = yihVar.b;
        int i3 = z ? i2 : i;
        aej aejVar = (aej) zz0Var.e;
        int i4 = zz0Var.d;
        ysa ysaVar = ysa.c;
        joa a2 = ypa.a(ysaVar, new bk7(zz0Var, i3, 5));
        joa a3 = ypa.a(ysaVar, new xj7(zz0Var, i3, z ? i : i2, yihVar, a2));
        if (1 != v2hVar.c) {
            return (v2h) a3.getValue();
        }
        if (i3 == i4) {
            return v2hVar;
        }
        if (((Number) a2.getValue()).intValue() != aejVar.b.d(i4)) {
            return (v2h) a3.getValue();
        }
        int i5 = v2hVar.b;
        long k = aejVar.k(i5);
        if (i4 != -1) {
            if (i3 != i4) {
                if (!(((i2 < i ? z14.b : i2 > i ? z14.a : z14.c) == z14.a) ^ z)) {
                }
            }
            return zz0Var.d(i3);
        }
        int i6 = pej.c;
        return (i5 == ((int) (k >> 32)) || i5 == ((int) (4294967295L & k))) ? (v2h) a3.getValue() : zz0Var.d(i3);
    }

    public static final b U(yea yeaVar, Object obj, KSerializer kSerializer) {
        yeaVar.getClass();
        kSerializer.getClass();
        fsf fsfVar = new fsf();
        new tga(yeaVar, new k31(fsfVar, 3), 1).l(kSerializer, obj);
        Object obj2 = fsfVar.a;
        if (obj2 != null) {
            return (b) obj2;
        }
        Intrinsics.i("result");
        throw null;
    }

    public static Intent V(String str, String str2, Map map) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("play.google.com").path("store/apps/details").appendQueryParameter("id", str).appendQueryParameter(Payload.RFR, str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals(Payload.RFR)) {
                    appendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    public static Intent X(String str, String str2, String str3, Map map) {
        Intent intent = new Intent("android.intent.action.VIEW", Z(str, str2, map));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    public static Uri Z(String str, String str2, Map map) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("play.google.com").path("d").appendQueryParameter("id", str).appendQueryParameter(Payload.RFR, str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals(Payload.RFR)) {
                    appendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        return appendQueryParameter.build();
    }

    public static final void a(gmh gmhVar, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i) {
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-977568115);
        int i2 = (i & 6) == 0 ? (av8Var.g(gmhVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        boolean z2 = false;
        boolean z3 = true;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            String B = cga.B(R.string.m3c_snackbar_pane_title, av8Var);
            Object O = av8Var.O();
            Object obj = O;
            if (O == nf3.a) {
                cn6 cn6Var = new cn6();
                cn6Var.a = new Object();
                cn6Var.b = new ArrayList();
                av8Var.n0(cn6Var);
                obj = cn6Var;
            }
            cn6 cn6Var2 = (cn6) obj;
            Object obj2 = cn6Var2.a;
            ArrayList arrayList = cn6Var2.b;
            if (Intrinsics.c(gmhVar, obj2)) {
                z = true;
                av8Var.d0(1443908949);
                av8Var.s(false);
            } else {
                av8Var.d0(1154891761);
                cn6Var2.a = gmhVar;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((gmh) ((bn6) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(gmhVar)) {
                    arrayList3.add(gmhVar);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj3 = arrayList3.get(i4);
                    if (obj3 != null) {
                        arrayList4.add(obj3);
                    }
                }
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    gmh gmhVar2 = (gmh) arrayList4.get(i5);
                    arrayList.add(new bn6(gmhVar2, yqo.H(-1952400805, av8Var, new fmh(gmhVar2, gmhVar, cn6Var2, B))));
                    i5++;
                    z3 = z3;
                }
                z = z3;
                av8Var.s(false);
            }
            k1c c2 = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            eqf A = av8Var.A();
            if (A == null) {
                a70.r("no recompose scope found");
                return;
            }
            A.b |= 1;
            cn6Var2.c = A;
            av8Var.d0(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                bn6 bn6Var = (bn6) arrayList.get(i6);
                gmh gmhVar3 = (gmh) bn6Var.a;
                tc3 tc3Var2 = bn6Var.b;
                av8Var.a0(1325010085, gmhVar3);
                tc3Var2.invoke(yqo.H(-1893791890, av8Var, new kp1(tc3Var, gmhVar3, z2, 13)), av8Var, 6);
                av8Var.s(false);
            }
            av8Var.s(false);
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(gmhVar, xtcVar, tc3Var, i, 2);
        }
    }

    public static final void b(xtc xtcVar, boolean z, long j, Function0 function0, Function0 function02, of3 of3Var, int i) {
        Long l;
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-436763393);
        int i2 = i | (av8Var.g(xtcVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.f(j) ? 256 : 128) | (av8Var.i(function0) ? 2048 : 1024) | (av8Var.i(function02) ? 16384 : 8192);
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Unit unit = Unit.a;
            boolean z2 = (i2 & 7168) == 2048;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            rq3 rq3Var = null;
            if (z2 || O == a99Var) {
                O = new nea(function0, rq3Var, i3);
                av8Var.n0(O);
            }
            hz8.o(av8Var, unit, (Function2) O);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = e.d(j - xe6.c().b().longValue());
                av8Var.n0(O2);
            }
            boh bohVar = (boh) O2;
            Long valueOf = Long.valueOf(bohVar.h());
            boolean z3 = (i2 & 896) == 256;
            Object O3 = av8Var.O();
            if (z3 || O3 == a99Var) {
                l = valueOf;
                z40 z40Var = new z40(j, bohVar, rq3Var, 4);
                av8Var.n0(z40Var);
                O3 = z40Var;
            } else {
                l = valueOf;
            }
            hz8.o(av8Var, l, (Function2) O3);
            long S = wkn.S(bohVar.h(), be5.SECONDS);
            wd5 wd5Var = xd5.b;
            long k = xd5.k(S, be5.HOURS) % 24;
            if (k < 0) {
                k = 0;
            }
            int i4 = (int) k;
            long k2 = xd5.k(S, be5.MINUTES) % 60;
            int i5 = (int) (k2 >= 0 ? k2 : 0L);
            xtc c0 = l98.c0(n9e.q(bkh.d(l98.b0(xtcVar, 16.0f), 1.0f), lz.D(R.color.surface_P, av8Var), o7g.a(8.0f)), 16.0f, 24.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            String i6 = wv8.i(oea.v(R.string.next_weekly_challenge, av8Var), " ", String.format("%sh %smin", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}, 2)));
            yf8 yf8Var = xth.a;
            udj.c(i6, d2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 131064);
            udj.c(oea.v(R.string.next_weekly_challenge_CTA, av8Var), l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            mea meaVar = mea.b;
            boolean z4 = (57344 & i2) == 16384;
            Object O4 = av8Var.O();
            if (z4 || O4 == a99Var) {
                O4 = new ve7(25, function02);
                av8Var.n0(O4);
            }
            pea.e(f0, z, meaVar, (Function0) O4, av8Var, (i2 & 112) | 390);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e30(xtcVar, z, j, function0, function02, i);
        }
    }

    public static final void c(hth hthVar, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i) {
        xtc xtcVar2;
        fm8 fm8Var;
        Object hjVar;
        q50 q50Var;
        Boolean bool;
        tc3 tc3Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(865877392);
        int i2 = i | (av8Var.g(hthVar) ? 4 : 2);
        int i3 = 1;
        int i4 = 0;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object b2 = hthVar.b();
            gv9 gv9Var = hthVar.a;
            int i5 = hthVar.c;
            int i6 = hthVar.b;
            boolean g = av8Var.g(b2);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (g || O == obj) {
                O = ml4.b(1.0f);
                av8Var.n0(O);
            }
            q50 q50Var2 = (q50) O;
            boolean g2 = av8Var.g(hthVar.b());
            Object O2 = av8Var.O();
            if (g2 || O2 == obj) {
                O2 = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var.n0(O2);
            }
            q50 q50Var3 = (q50) O2;
            boolean g3 = av8Var.g(hthVar.b());
            Object O3 = av8Var.O();
            if (g3 || O3 == obj) {
                O3 = ml4.b(0.9f);
                av8Var.n0(O3);
            }
            q50 q50Var4 = (q50) O3;
            boolean g4 = av8Var.g(hthVar.b()) | av8Var.e(i5) | av8Var.e(i6);
            Object O4 = av8Var.O();
            if (g4 || O4 == obj) {
                if (i5 > 0) {
                    fm8Var = (fm8) ((tfi) gv9Var.get(i6)).e().get(i5 - 1);
                } else if (i6 <= 0 || i5 != 0) {
                    fm8Var = null;
                } else {
                    int i7 = i6 - 1;
                    fm8Var = (fm8) ((tfi) gv9Var.get(i7)).e().get(kotlin.collections.b.i(((tfi) gv9Var.get(i7)).e()));
                }
                O4 = e.f(fm8Var);
                av8Var.n0(O4);
            }
            e1d e1dVar = (e1d) O4;
            boolean g5 = av8Var.g(hthVar.b());
            Object O5 = av8Var.O();
            if (g5 || O5 == obj) {
                O5 = e.f(hthVar.b());
                av8Var.n0(O5);
            }
            e1d e1dVar2 = (e1d) O5;
            Object O6 = av8Var.O();
            if (O6 == obj) {
                O6 = e.c(i6);
                av8Var.n0(O6);
            }
            znh znhVar = (znh) O6;
            boolean z = i6 == znhVar.h() || hthVar.f;
            int i8 = i2 & 14;
            boolean z2 = i8 == 4;
            Object O7 = av8Var.O();
            if (z2 || O7 == obj) {
                O7 = new zbe(i4, hthVar, znhVar);
                av8Var.n0(O7);
            }
            hz8.t((Function0) O7, av8Var);
            fm8 fm8Var2 = (fm8) e1dVar2.getValue();
            Boolean valueOf = Boolean.valueOf(hthVar.e);
            boolean i9 = (i8 == 4) | av8Var.i(q50Var2) | av8Var.i(q50Var3) | av8Var.i(q50Var4) | av8Var.g(e1dVar) | av8Var.h(z);
            Object O8 = av8Var.O();
            if (i9 || O8 == obj) {
                q50Var = q50Var2;
                bool = valueOf;
                hjVar = new hj(hthVar, q50Var, q50Var3, q50Var4, e1dVar, z, (rq3) null);
                av8Var.n0(hjVar);
            } else {
                hjVar = O8;
                bool = valueOf;
                q50Var = q50Var2;
            }
            hz8.q(fm8Var2, bool, (Function2) hjVar, av8Var);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtcVar2 = xtcVar;
            xtc C = fqj.C(av8Var, xtcVar2);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (z) {
                av8Var.d0(-1143176793);
                Object obj2 = (fm8) e1dVar.getValue();
                if (obj2 == null) {
                    av8Var.d0(-1078742214);
                    av8Var.s(false);
                    tc3Var2 = tc3Var;
                } else {
                    av8Var.d0(-1078742213);
                    av8Var.a0(1763344986, obj2);
                    tc3Var2 = tc3Var;
                    tol.b(ufi.a.a(sfi.b), yqo.H(-473583486, av8Var, new cyb(i3, q50Var, tc3Var2, obj2)), av8Var, 56);
                    av8Var.s(false);
                    Unit unit = Unit.a;
                    av8Var.s(false);
                }
                av8Var.s(false);
            } else {
                tc3Var2 = tc3Var;
                av8Var.d0(-1078070164);
                av8Var.s(false);
            }
            Object obj3 = (fm8) e1dVar2.getValue();
            if (obj3 == null) {
                av8Var.d0(-1077987736);
                av8Var.s(false);
            } else {
                av8Var.d0(-1077987735);
                av8Var.a0(-909161127, obj3);
                tol.b(ufi.a.a(z ? sfi.a : sfi.b), yqo.H(-273419033, av8Var, new ace(q50Var3, q50Var4, tc3Var2, obj3, 0)), av8Var, 56);
                av8Var.s(false);
                Unit unit2 = Unit.a;
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(hthVar, xtcVar2, tc3Var, i, 10);
        }
    }

    public static final void d(ale aleVar, xtc xtcVar, int i, of3 of3Var, int i2) {
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(12998269);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.i(aleVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i5 & 147) == 146 && av8Var.D()) {
            av8Var.W();
            i4 = i;
        } else {
            av8Var.d0(-1232449568);
            av8Var.d0(-316851119);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(null);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            av8Var.s(false);
            av8Var.d0(-316847932);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new fw6(25, e1dVar);
                av8Var.n0(O2);
            }
            Function1 function1 = (Function1) O2;
            av8Var.s(false);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                eh3 eh3Var = new eh3(hz8.G(g.a, av8Var));
                av8Var.n0(eh3Var);
                O3 = eh3Var;
            }
            ku3 ku3Var = ((eh3) O3).a;
            av8Var.d0(-316834021);
            boolean i6 = av8Var.i(ku3Var);
            Object O4 = av8Var.O();
            if (i6 || O4 == a99Var) {
                O4 = new ord(23, ku3Var, e1dVar);
                av8Var.n0(O4);
            }
            Function1 function12 = (Function1) O4;
            av8Var.s(false);
            av8Var.d0(-316803765);
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                O5 = wwe.b;
                av8Var.n0(O5);
            }
            av8Var.s(false);
            Function2 function2 = (Function2) ((KFunction) O5);
            av8Var.d0(-316802035);
            Object O6 = av8Var.O();
            if (O6 == a99Var) {
                O6 = xwe.b;
                av8Var.n0(O6);
            }
            av8Var.s(false);
            e(aleVar, xtcVar, function1, function2, (Function2) ((KFunction) O6), function12, av8Var, (i5 & 112) | (i5 & 14) | 28032, 0);
            av8Var.s(false);
            i4 = 1;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wx1(aleVar, xtcVar, i4, i2, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(ale aleVar, xtc xtcVar, Function1 function1, Function2 function2, Function2 function22, Function1 function12, of3 of3Var, int i, int i2) {
        int i3;
        Function1 function13;
        Object obj;
        Function1 function14;
        Object O;
        boolean z;
        Object O2;
        Object O3;
        Object O4;
        Object obj2;
        Object t53Var;
        Object obj3;
        boolean z2;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(25948461);
        if ((i & 6) == 0) {
            i3 = (av8Var.i(aleVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var.i(function2) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var.i(function22) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            function13 = function12;
            i3 |= av8Var.i(function13) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if ((74899 & i3) == 74898 || !av8Var.D()) {
                obj = nf3.a;
                if (i5 == 0) {
                    av8Var.d0(-1838626673);
                    Object O5 = av8Var.O();
                    if (O5 == obj) {
                        O5 = new jie(i4);
                        av8Var.n0(O5);
                    }
                    function14 = (Function1) O5;
                    av8Var.s(false);
                } else {
                    function14 = function13;
                }
                av8Var.d0(-1838625934);
                O = av8Var.O();
                if (O == obj) {
                    O = e.f(null);
                    av8Var.n0(O);
                }
                e1d e1dVar = (e1d) O;
                av8Var.s(false);
                av8Var.d0(-1838622977);
                z = (i3 & 896) != 256;
                O2 = av8Var.O();
                if (!z || O2 == obj) {
                    O2 = new k1e(3, function1);
                    av8Var.n0(O2);
                }
                Function1 function15 = (Function1) O2;
                av8Var.s(false);
                av8Var.d0(-1838621905);
                O3 = av8Var.O();
                if (O3 == obj) {
                    O3 = new jie(17);
                    av8Var.n0(O3);
                }
                Function1 function16 = (Function1) O3;
                av8Var.s(false);
                av8Var.d0(-1838621350);
                O4 = av8Var.O();
                if (O4 == obj) {
                    O4 = new fw6(26, e1dVar);
                    av8Var.n0(O4);
                }
                av8Var.s(false);
                td4.b(function15, xtcVar, function16, null, (Function1) O4, av8Var, (i3 & 112) | 24960, 8);
                obj2 = (View) e1dVar.getValue();
                if (obj2 != null) {
                    function13 = function14;
                } else {
                    av8Var.d0(-898367774);
                    boolean i6 = av8Var.i(aleVar) | ((458752 & i3) == 131072) | av8Var.i(obj2);
                    Object O6 = av8Var.O();
                    if (i6 || O6 == obj) {
                        O6 = new vsc(9, aleVar, function14, obj2);
                        av8Var.n0(O6);
                    }
                    av8Var.s(false);
                    hz8.b(obj2, aleVar, (Function1) O6, av8Var);
                    av8Var.d0(-898353912);
                    boolean i7 = av8Var.i(aleVar) | av8Var.i(obj2) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048);
                    Object O7 = av8Var.O();
                    if (i7 || O7 == obj) {
                        obj3 = obj2;
                        function13 = function14;
                        z2 = false;
                        t53Var = new t53(aleVar, obj3, function2, function22, null, 6);
                        av8Var.n0(t53Var);
                    } else {
                        function13 = function14;
                        t53Var = O7;
                        z2 = false;
                        obj3 = obj2;
                    }
                    av8Var.s(z2);
                    hz8.q(obj3, aleVar, (Function2) t53Var, av8Var);
                }
            } else {
                av8Var.W();
            }
            Function1 function17 = function13;
            u = av8Var.u();
            if (u == null) {
                u.d = new hk2(aleVar, xtcVar, function1, function2, function22, function17, i, i2);
                return;
            }
            return;
        }
        function13 = function12;
        if ((74899 & i3) == 74898) {
        }
        obj = nf3.a;
        if (i5 == 0) {
        }
        av8Var.d0(-1838625934);
        O = av8Var.O();
        if (O == obj) {
        }
        e1d e1dVar2 = (e1d) O;
        av8Var.s(false);
        av8Var.d0(-1838622977);
        if ((i3 & 896) != 256) {
        }
        O2 = av8Var.O();
        if (!z) {
        }
        O2 = new k1e(3, function1);
        av8Var.n0(O2);
        Function1 function152 = (Function1) O2;
        av8Var.s(false);
        av8Var.d0(-1838621905);
        O3 = av8Var.O();
        if (O3 == obj) {
        }
        Function1 function162 = (Function1) O3;
        av8Var.s(false);
        av8Var.d0(-1838621350);
        O4 = av8Var.O();
        if (O4 == obj) {
        }
        av8Var.s(false);
        td4.b(function152, xtcVar, function162, null, (Function1) O4, av8Var, (i3 & 112) | 24960, 8);
        obj2 = (View) e1dVar2.getValue();
        if (obj2 != null) {
        }
        Function1 function172 = function13;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void f(qbf qbfVar, xtc xtcVar, of3 of3Var, int i) {
        utc utcVar;
        utc utcVar2;
        qbfVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-65280432);
        int i2 = (av8Var.g(qbfVar) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc q = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.primary_default, av8Var), o7g.a(16.0f));
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new s8f(11);
                av8Var.n0(O);
            }
            xtc d0 = l98.d0(oyn.w(q, false, null, null, (Function0) O, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String str = qbfVar.c;
            utc utcVar3 = utc.a;
            td4.L(48, av8Var, bkh.l(l98.f0(utcVar3, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 32.0f), str);
            String str2 = qbfVar.d;
            yf8 yf8Var = xth.a;
            udj.c(str2, fn0.e(1.0f, l98.f0(utcVar3, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), true), lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.m(), av8Var, 0, 0, 131064);
            av8 av8Var2 = av8Var;
            String str3 = qbfVar.f;
            if (str3 == null) {
                av8Var2.d0(-1680353139);
                av8Var2.s(false);
                utcVar = utcVar3;
            } else {
                av8Var2.d0(-1680353138);
                utcVar = utcVar3;
                udj.c(str3, bkh.p(utcVar3, 48.0f), lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 2, 0, null, xth.m(), av8Var2, 48, 24576, 113656);
                av8Var2 = av8Var2;
                Unit unit = Unit.a;
                av8Var2.s(false);
            }
            String str4 = qbfVar.g;
            if (str4 == null) {
                av8Var2.d0(-1680029778);
                av8Var2.s(false);
                utcVar2 = utcVar;
            } else {
                av8Var2.d0(-1680029777);
                utc utcVar4 = utcVar;
                av8 av8Var3 = av8Var2;
                utcVar2 = utcVar4;
                udj.c(str4, bkh.p(l98.f0(utcVar4, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 48.0f), lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 2, 0, null, xth.m(), av8Var3, 48, 24576, 113656);
                av8Var2 = av8Var3;
                Unit unit2 = Unit.a;
                av8Var2.s(false);
            }
            av8 av8Var4 = av8Var2;
            udj.c(dmi.q("\u200e", qbfVar.h), bkh.p(l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 48.0f), lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 2, 0, null, xth.m(), av8Var4, 48, 24576, 113656);
            av8Var = av8Var4;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(qbfVar, xtcVar, i, 17);
        }
    }

    public static final void g(imh imhVar, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1077081618);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(imhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            gmh gmhVar = (gmh) ((eoh) imhVar.b).getValue();
            w9 w9Var = (w9) av8Var.k(dh3.a);
            boolean g = av8Var.g(gmhVar) | av8Var.i(w9Var);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new big(gmhVar, w9Var, null, 13);
                av8Var.n0(O);
            }
            hz8.o(av8Var, gmhVar, (Function2) O);
            gmh gmhVar2 = (gmh) ((eoh) imhVar.b).getValue();
            utc utcVar = utc.a;
            a(gmhVar2, utcVar, tc3Var, av8Var, 432);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(imhVar, xtcVar2, tc3Var, i, 1);
        }
    }

    public static final void h(lwi lwiVar, Function0 function0, Function0 function02, Function0 function03, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        YearMonth yearMonth;
        YearMonth yearMonth2;
        zg3 zg3Var;
        ry ryVar;
        ff3 ff3Var;
        f50 f50Var;
        float f;
        mv1 mv1Var;
        boolean z;
        int i3;
        utc utcVar;
        boolean z2;
        boolean z3;
        lwi lwiVar2 = lwiVar;
        jf9 jf9Var = oyn.e;
        YearMonth yearMonth3 = lwiVar2.g;
        YearMonth yearMonth4 = lwiVar2.a;
        YearMonth yearMonth5 = lwiVar2.f;
        mv1 mv1Var2 = uxf.c;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(272455704);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(lwiVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function03) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, a2, f50Var2);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf, f50Var3);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            kg0 kg0Var = ww9.h;
            int i4 = i2;
            lv1 lv1Var = uxf.m;
            utc utcVar2 = utc.a;
            jf9 jf9Var2 = jf9Var;
            xtc d0 = l98.d0(bkh.d(utcVar2, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var2);
            waa.K(av8Var, m2, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var3, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var4);
            if (yearMonth5 == null || yearMonth4.compareTo(yearMonth5) <= 0) {
                yearMonth = yearMonth4;
                yearMonth2 = yearMonth5;
                zg3Var = zg3Var2;
                ryVar = ryVar2;
                ff3Var = ff3Var2;
                f50Var = f50Var2;
                f = 8.0f;
                mv1Var = mv1Var2;
                z = true;
                i3 = 6;
                utcVar = utcVar2;
                z2 = false;
                av8Var.d0(-2069069923);
                nq8.h(av8Var, bkh.l(utcVar, 32.0f));
                av8Var.s(false);
            } else {
                av8Var.d0(-2069672935);
                xtc q = n9e.q(wnn.A(utcVar2, o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), jf9Var2);
                yearMonth = yearMonth4;
                yearMonth2 = yearMonth5;
                f = 8.0f;
                f50Var = f50Var2;
                zg3Var = zg3Var2;
                ff3Var = ff3Var2;
                jf9Var2 = jf9Var2;
                ryVar = ryVar2;
                z2 = false;
                xtc y = tol.y(q, false, false, false, 0L, null, function0, av8Var, 31);
                av8Var = av8Var;
                xtc b0 = l98.b0(y, 4.0f);
                k1c c2 = e12.c(mv1Var2, false);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, b0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var3, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var4);
                i3 = 6;
                mv1Var = mv1Var2;
                utcVar = utcVar2;
                kq9.b(s6a.N(R.drawable.ic_chevron_left, 6, av8Var), null, bkh.l(utcVar2, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                z = true;
                av8Var.s(true);
                av8Var.s(false);
            }
            av8 av8Var2 = av8Var;
            r4a.k(new oxh(lwiVar.a, lwiVar.b, null, null, null, false, 252), function03, null, sxh.i, (yearMonth2 == null || yearMonth3 == null) ? z2 : z, null, av8Var2, ((i4 >> 6) & 112) | 3072, 36);
            av8Var = av8Var2;
            if (yearMonth3 == null || yearMonth.compareTo(yearMonth3) >= 0) {
                z3 = true;
                av8Var.d0(-2068005600);
                e12.a(6, av8Var, bkh.l(utcVar, 32.0f));
                av8Var.s(z2);
            } else {
                av8Var.d0(-2068605636);
                xtc y2 = tol.y(n9e.q(wnn.A(utcVar, o7g.a(f)), lz.D(R.color.surface_2, av8Var), jf9Var2), false, false, false, 0L, null, function02, av8Var, 31);
                av8Var = av8Var;
                xtc b02 = l98.b0(y2, 4.0f);
                k1c c3 = e12.c(mv1Var, z2);
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C4 = fqj.C(av8Var, b02);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c3, f50Var);
                waa.K(av8Var, m4, ff3Var);
                bf3.s(hashCode4, av8Var, f50Var3, av8Var, ryVar);
                waa.K(av8Var, C4, f50Var4);
                kq9.b(s6a.N(R.drawable.ic_chevron_right, i3, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                z3 = true;
                av8Var.s(true);
                av8Var.s(z2);
            }
            av8Var.s(z3);
            lwiVar2 = lwiVar;
            wnn.d(Boolean.valueOf(lwiVar2.e), null, null, null, m6k.b, av8Var, 24576, 14);
            av8Var.s(z3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(lwiVar2, function0, function02, function03, xtcVar, i);
        }
    }

    public static final void i(z6j z6jVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-805465259);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(z6jVar) ? 4 : 2) | i;
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
            String str = z6jVar.h;
            String str2 = z6jVar.i;
            tc3 H = yqo.H(-1151451980, av8Var2, new w6j(z6jVar, i3));
            Integer valueOf = Integer.valueOf(R.drawable.media_card_rating_background);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new x6j(function1, z6jVar, i3);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, null, H, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, valueOf, null, str, str2, (Function0) O, av8Var, ((i2 >> 6) & 14) | 384, 378);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y6j(z6jVar, function1, xtcVar, i, 1);
        }
    }

    public static final void j(int i, Bitmap bitmap, jfj jfjVar, int i2, jfj jfjVar2, jfj jfjVar3, boolean z, int i3, vy8 vy8Var, of3 of3Var, int i4) {
        int i5;
        jfj jfjVar4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1199131005);
        if ((i4 & 6) == 0) {
            i5 = (av8Var.e(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= av8Var.i(bitmap) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= av8Var.g(jfjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= av8Var.e(i2) ? a.o : 1024;
        }
        if ((i4 & 24576) == 0) {
            jfjVar4 = jfjVar2;
            i5 |= av8Var.g(jfjVar4) ? 16384 : 8192;
        } else {
            jfjVar4 = jfjVar2;
        }
        if ((196608 & i4) == 0) {
            i5 |= av8Var.g(jfjVar3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i4) == 0) {
            i5 |= av8Var.h(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= av8Var.e(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= av8Var.g(vy8Var) ? 67108864 : 33554432;
        }
        if (av8Var.T(i5 & 1, (38347923 & i5) != 38347922)) {
            lz.c(j72.x(h5a.O(c5n.t(nq8.F(nq8.A(vy8Var), 44.0f), new h1g(R.color.surface_1)), 16.0f, 2), ok3.H((Context) av8Var.k(bh3.b), "stage_id", "open_stage", i)), ho.e, yqo.H(2012235483, av8Var, new ci(i3, bitmap, jfjVar, i2, jfjVar4, z, jfjVar3)), av8Var, 384, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kkf(i, bitmap, jfjVar, i2, jfjVar2, jfjVar3, z, i3, vy8Var, i4);
        }
    }

    public static final void k(skl sklVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1685691893);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(sklVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtcVar = utc.a;
            xtc Y = fz8.Y(bkh.d(xtcVar, 1.0f), n9a.b);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, Y);
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
            p7l p7lVar = sklVar != null ? sklVar.a.b : p7l.a;
            mll mllVar = sklVar != null ? sklVar.a : null;
            p8g p8gVar = p8g.a;
            nq8.r(p7lVar, mllVar, bkh.c(p8gVar.a(1.0f, xtcVar, true), 1.0f), av8Var, 0);
            nq8.h(av8Var, bkh.p(xtcVar, 4.0f));
            nq8.r(sklVar != null ? sklVar.b.b : p7l.c, sklVar != null ? sklVar.b : null, bkh.c(p8gVar.a(1.0f, xtcVar, true), 1.0f), av8Var, 0);
            nq8.h(av8Var, bkh.p(xtcVar, 4.0f));
            tba.f(sklVar != null ? sklVar.c : null, bkh.c(p8gVar.a(1.0f, xtcVar, true), 1.0f), av8Var, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(sklVar, xtcVar, i, 25);
        }
    }

    public static final void l(Bitmap bitmap, skl sklVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        Bitmap bitmap2;
        skl sklVar2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-642385650);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.i(bitmap) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(sklVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            n7g a2 = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc A = wnn.A(utcVar, a2);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, A);
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
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            wkn.k(haa.t(R.drawable.wc_widget_background, 0, av8Var), null, n12.a.b(utcVar), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 24632, 104);
            xtc b0 = l98.b0(utcVar, 8.0f);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b0);
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
            xtc d2 = bkh.d(utcVar, 1.0f);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            xtc A2 = wnn.A(ljg.g(av8Var, C3, f50Var3, 1.0f, true), o7g.a(8.0f));
            long D = lz.D(R.color.on_color_highlight_2, av8Var);
            jf9 jf9Var = oyn.e;
            xtc b02 = l98.b0(n9e.q(A2, D, jf9Var), 8.0f);
            l8g a5 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, b02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_sofascore_logomark, 6, av8Var), null, l98.b0(n9e.q(bkh.l(utcVar, 20.0f), hkg.d(4281814517L), jf9Var), 4.0f), r13.d, av8Var, V2.b.f, 0);
            String v = oea.v(R.string.search_in_sofascore, av8Var);
            xtc f0 = l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            long D2 = lz.D(R.color.on_color_secondary, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, f0, D2, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.c(), av8Var, 48, 24576, 114680);
            av8Var = av8Var;
            i.o(av8Var, true, utcVar, 16.0f, av8Var);
            if (bitmap != null) {
                av8Var.d0(1561442013);
                bitmap2 = bitmap;
                boolean g = av8Var.g(bitmap2);
                Object O = av8Var.O();
                if (g || O == nf3.a) {
                    O = new cx1(new a10(bitmap2));
                    av8Var.n0(O);
                }
                wkn.k((cx1) O, null, bkh.l(utcVar, 28.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                bitmap2 = bitmap;
                av8Var.d0(1561818508);
                kq9.b(s6a.N(R.drawable.team_logo_placeholder, 6, av8Var), null, bkh.l(utcVar, 28.0f), lz.D(R.color.on_color_secondary, av8Var), av8Var, 432, 0);
                av8Var.s(false);
            }
            bf3.t(av8Var, true, utcVar, 8.0f, av8Var);
            sklVar2 = sklVar;
            k(sklVar2, null, av8Var, (i3 >> 3) & 14);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            bitmap2 = bitmap;
            sklVar2 = sklVar;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(bitmap2, sklVar2, xtcVar2, i, 23);
        }
    }

    public static final void m(Bitmap bitmap, skl sklVar, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1875200508);
        int i2 = i | (av8Var.i(bitmap) ? 4 : 2) | (av8Var.i(sklVar) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc A = wnn.A(l98.f0(bkh.d(utcVar, 1.0f), 16.0f, 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            long j = r13.d;
            xtc b0 = l98.b0(n9e.p(A, wxf.D(new Pair[]{new Pair(valueOf, new r13(r13.c(j, 0.15f))), new Pair(Float.valueOf(1.0f), new r13(r13.c(j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.POSITIVE_INFINITY), null, 6), 16.0f);
            wxf wxfVar = ww9.b;
            lv1 lv1Var = uxf.l;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 0);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc Z = fz8.Z(wnn.A(bkh.d(utcVar, 1.0f), o7g.c(32.0f, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), haa.t(R.drawable.wc_widget_phone_mockup_background, 0, av8Var), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 54);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new pcl(19);
                av8Var.n0(O);
            }
            xtc b02 = l98.b0(td4.X(Z, (Function1) O), 16.0f);
            u23 a3 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b02);
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
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a4 = k8g.a(ww9.f, lv1Var, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d2);
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
            e12.a(0, av8Var, n9e.q(wnn.A(bkh.e(bkh.p(utcVar, 86.0f), 26.0f), o7g.a(16.0f)), r13.b, oyn.e));
            bf3.t(av8Var, true, utcVar, 16.0f, av8Var);
            l(bitmap, sklVar, null, av8Var, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dgl(bitmap, sklVar, xtcVar2, i, 6);
        }
    }

    public static final w2h n(yih yihVar, q02 q02Var) {
        z14 l = yihVar.l();
        zz0 zz0Var = (zz0) yihVar.d;
        boolean z = l == z14.a;
        return new w2h(o(zz0Var, z, true, q02Var), o(zz0Var, z, false, q02Var), z);
    }

    public static final v2h o(zz0 zz0Var, boolean z, boolean z2, q02 q02Var) {
        long j;
        long g = q02Var.g(zz0Var, z2 ? zz0Var.b : zz0Var.c);
        if (z ^ z2) {
            int i = pej.c;
            j = g >> 32;
        } else {
            int i2 = pej.c;
            j = 4294967295L & g;
        }
        return zz0Var.d((int) j);
    }

    public static final List p(jle jleVar, int i, int i2, ArrayList arrayList, tzc tzcVar, int i3, int i4, int i5, Function1 function1) {
        int i6;
        tzc tzcVar2;
        long j;
        long j2;
        int i7;
        Object obj;
        int i8;
        if (jleVar == null || arrayList.isEmpty() || (i6 = tzcVar.b) == 0) {
            return km5.a;
        }
        int i9 = -1;
        if (i2 - i < 0 || i6 == 0) {
            tzcVar2 = m6a.a;
        } else {
            IntRange j3 = llf.j(0, i6);
            int i10 = j3.a;
            int i11 = j3.b;
            int i12 = -1;
            if (i10 <= i11) {
                while (tzcVar.c(i10) <= i) {
                    i12 = tzcVar.c(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                }
            }
            if (i12 == -1) {
                tzcVar2 = m6a.a;
            } else {
                tzc tzcVar3 = m6a.a;
                tzcVar2 = new tzc(1);
                tzcVar2.a(i12);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj2 = arrayList.get(i13);
            int index = ((xqa) obj2).getIndex();
            int[] iArr = tzcVar.a;
            int i14 = tzcVar.b;
            int i15 = 0;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                if (iArr[i15] == index) {
                    arrayList3.add(obj2);
                    break;
                }
                i15++;
            }
        }
        int[] iArr2 = tzcVar2.a;
        int i16 = tzcVar2.b;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = i9;
                    break;
                }
                if (((xqa) it.next()).getIndex() == i18) {
                    break;
                }
                i19++;
            }
            xqa xqaVar = i19 == i9 ? (xqa) function1.invoke(Integer.valueOf(i18)) : (xqa) arrayList.remove(i19);
            int f = xqaVar.f();
            if (i19 == i9) {
                j = 4294967295L;
                i7 = Integer.MIN_VALUE;
            } else {
                long i20 = xqaVar.i(0);
                if (xqaVar.e()) {
                    j = 4294967295L;
                    j2 = i20 & 4294967295L;
                } else {
                    j = 4294967295L;
                    j2 = i20 >> 32;
                }
                i7 = (int) j2;
            }
            int size2 = arrayList3.size();
            int i21 = 0;
            while (true) {
                if (i21 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i21);
                if (((xqa) obj).getIndex() != i18) {
                    break;
                }
                i21++;
            }
            xqa xqaVar2 = (xqa) obj;
            if (xqaVar2 != null) {
                long i22 = xqaVar2.i(0);
                i8 = (int) (xqaVar2.e() ? i22 & j : i22 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int max = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                max = Math.min(max, i8 - f);
            }
            xqaVar.h();
            xqaVar.a(max, 0, i4, i5);
            arrayList2.add(xqaVar);
            i17++;
            i9 = -1;
        }
        return arrayList2;
    }

    public static rtc q(JSONObject jSONObject) {
        float[] fArr;
        float[] fArr2;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("use_case");
            String string2 = jSONObject.getString("asset_uri");
            String optString = jSONObject.optString("rules_uri", null);
            int i = jSONObject.getInt("version_id");
            stc stcVar = stc.a;
            JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
            Set set = cw3.a;
            if (!set.contains(stc.class)) {
                try {
                } catch (Throwable th) {
                    cw3.a(stc.class, th);
                }
                if (!set.contains(stcVar) && jSONArray != null) {
                    try {
                        fArr = new float[jSONArray.length()];
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            try {
                                String string3 = jSONArray.getString(i2);
                                string3.getClass();
                                fArr[i2] = Float.parseFloat(string3);
                            } catch (JSONException unused) {
                            }
                        }
                    } catch (Throwable th2) {
                        cw3.a(stcVar, th2);
                    }
                    fArr2 = fArr;
                    string.getClass();
                    string2.getClass();
                    return new rtc(string, string2, optString, i, fArr2);
                }
                fArr = null;
                fArr2 = fArr;
                string.getClass();
                string2.getClass();
                return new rtc(string, string2, optString, i, fArr2);
            }
            fArr2 = null;
            string.getClass();
            string2.getClass();
            return new rtc(string, string2, optString, i, fArr2);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static ArrayList r(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static gsg s(Callable callable) {
        try {
            Object call = callable.call();
            rha.x(call, "Scheduler Callable result can't be null");
            return (gsg) call;
        } catch (Throwable th) {
            throw be6.c(th);
        }
    }

    public static final v2h t(v2h v2hVar, zz0 zz0Var, int i) {
        return new v2h(((aej) zz0Var.e).a(i), i, v2hVar.c);
    }

    public static ContextThemeWrapper u(Context context, boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, I(!z ? R.attr.dialogTheme : R.attr.alertDialogTheme, context));
        return I(R.attr.mediaRouteTheme, contextThemeWrapper) != 0 ? new ContextThemeWrapper(contextThemeWrapper, F(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static final w2h v(w2h w2hVar, yih yihVar) {
        zz0 zz0Var = (zz0) yihVar.d;
        if (w2hVar != null) {
            v2h v2hVar = w2hVar.a;
            long j = v2hVar.c;
            v2h v2hVar2 = w2hVar.b;
            if (j != v2hVar2.c) {
                boolean z = w2hVar.c;
                if ((z ? v2hVar : v2hVar2).b != 0) {
                    return w2hVar;
                }
                if (z) {
                    v2hVar = v2hVar2;
                }
                if (((aej) zz0Var.e).a.a.b.length() != v2hVar.b) {
                    return w2hVar;
                }
            } else if (v2hVar.b != v2hVar2.b) {
                return w2hVar;
            }
        }
        w2h w2hVar2 = (w2h) yihVar.c;
        String str = ((aej) zz0Var.e).a.a.b;
        if (w2hVar2 == null || str.length() == 0) {
            return w2hVar;
        }
        boolean z2 = yihVar.b;
        String str2 = ((aej) zz0Var.e).a.a.b;
        int i = zz0Var.b;
        int length = str2.length();
        if (i == 0) {
            int x = x(0, str2);
            return z2 ? w2h.a(w2hVar, t(w2hVar.a, zz0Var, x), null, true, 2) : w2h.a(w2hVar, null, t(w2hVar.b, zz0Var, x), false, 1);
        }
        if (i == length) {
            int y = y(length, str2);
            return z2 ? w2h.a(w2hVar, t(w2hVar.a, zz0Var, y), null, false, 2) : w2h.a(w2hVar, null, t(w2hVar.b, zz0Var, y), true, 1);
        }
        boolean z3 = w2hVar2.c;
        int y2 = z2 ^ z3 ? y(i, str2) : x(i, str2);
        return z2 ? w2h.a(w2hVar, t(w2hVar.a, zz0Var, y2), null, z3, 2) : w2h.a(w2hVar, null, t(w2hVar.b, zz0Var, y2), z3, 1);
    }

    public static void w(rtc rtcVar, ArrayList arrayList) {
        File[] listFiles;
        String str = rtcVar.a;
        int i = rtcVar.d;
        File p = rik.p();
        if (p != null && (listFiles = p.listFiles()) != null && listFiles.length != 0) {
            String str2 = str + '_' + i;
            for (File file : listFiles) {
                String name = file.getName();
                name.getClass();
                if (c.v(name, str, false) && !c.v(name, str2, false)) {
                    file.delete();
                }
            }
        }
        String str3 = str + '_' + i;
        String str4 = rtcVar.b;
        kr9 kr9Var = new kr9(arrayList, 14);
        File file2 = new File(rik.p(), str3);
        if (str4 == null || file2.exists()) {
            kr9Var.c(file2);
        } else {
            new w08(str4, file2, kr9Var).execute(new String[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int x(int i, String str) {
        String str2;
        int i2;
        cl5 C = C();
        Integer num = null;
        if (C != null) {
            l4a.k("Not initialized yet", C.c() == 1);
            l4a.j(str, "charSequence cannot be null");
            l2a l2aVar = (l2a) C.e.b;
            l2aVar.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    e6k[] e6kVarArr = (e6k[]) spanned.getSpans(i, i + 1, e6k.class);
                    if (e6kVarArr.length > 0) {
                        i2 = spanned.getSpanEnd(e6kVarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((pl5) l2aVar.E(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new pl5(i))).c;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int y(int i, String str) {
        cl5 C = C();
        Integer num = null;
        if (C != null) {
            Integer valueOf = Integer.valueOf(C.b(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final Boolean z(String str, JSONObject jSONObject) {
        Integer num;
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (JSONException unused) {
            try {
                num = Integer.valueOf(jSONObject.getInt(str));
            } catch (JSONException unused2) {
                num = null;
            }
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                return Boolean.FALSE;
            }
            if (intValue != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
    }

    public abstract void W(dxo dxoVar, dxo dxoVar2);

    public abstract void Y(dxo dxoVar, Thread thread);

    public abstract boolean a0(zzo zzoVar, vjo vjoVar, vjo vjoVar2);

    public abstract boolean b0(zzo zzoVar, Object obj, Object obj2);

    public abstract boolean c0(zzo zzoVar, dxo dxoVar, dxo dxoVar2);
}
