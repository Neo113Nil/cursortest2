package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import coil.memory.MemoryCache$Key;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.fyber.inneractive.sdk.ignite.k;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.protobuf.Internal;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hpo implements ph2, mu, lii, MediaViewListener, bt8 {
    public static final aw8 b = new aw8(1);
    public static final hpo c = new hpo();
    public static final anf d = new anf(23);
    public Object a;

    public hpo(int i) {
        ygc ygcVar;
        switch (i) {
            case 3:
                int i2 = dpo.a;
                this.a = new d1l(new eqo[]{ccd.i, d}, 28);
                return;
            case 7:
                this.a = new AtomicBoolean(false);
                return;
            case 12:
                w45 w45Var = new w45();
                synchronized (w45Var) {
                    w45Var.b = 30;
                    Unit unit = Unit.a;
                }
                w45.c(w45Var, null, null, null, 7);
                this.a = w45Var;
                return;
            case 18:
                this.a = new LinkedHashMap();
                return;
            default:
                try {
                    ygcVar = (ygc) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused) {
                    ygcVar = b;
                }
                ygc[] ygcVarArr = {aw8.b, ygcVar};
                ftb ftbVar = new ftb();
                ftbVar.a = ygcVarArr;
                this.a = (ygc) Internal.checkNotNull(ftbVar, "messageInfoFactory");
                return;
        }
    }

    public static void H(hpo hpoVar, float f, float f2) {
        hpoVar.G(f, f2, yaa.u(((sx2) hpoVar.a).D()));
    }

    public static hpo K(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        hpo hpoVar = new hpo();
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new c2a(hpoVar, 11));
                return hpoVar;
            } catch (RuntimeException unused) {
                synchronized (hpo.class) {
                    hpoVar.a = null;
                }
            }
        }
        return hpoVar;
    }

    public static void a(String str, Object... objArr) {
        k kVar = (k) c.a;
        if (kVar != null) {
            kVar.d(str, objArr);
        }
    }

    public static void h(String str, Object... objArr) {
        k kVar = (k) c.a;
        if (kVar != null) {
            kVar.w(str, objArr);
        }
    }

    public static void r(hpo hpoVar, float f, float f2, int i) {
        sx2 sx2Var = (sx2) hpoVar.a;
        if ((i & 4) != 0) {
            f = Float.intBitsToFloat((int) (sx2Var.D() >> 32));
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = Float.intBitsToFloat((int) (sx2Var.D() & 4294967295L));
        }
        hpoVar.q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f2, 1);
    }

    public void A() {
        ((wn8) this.a).d.U();
    }

    public void B(Object obj, String str) {
        Object[] objArr;
        str.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (obj == null) {
            obj = null;
        } else {
            Class<?> cls = obj.getClass();
            fuf fufVar = duf.a;
            KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(cls);
            if (!Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Boolean.TYPE)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Byte.TYPE)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Integer.TYPE)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Long.TYPE)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Float.TYPE)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Double.TYPE)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(String.class)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Boolean[].class)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Byte[].class)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Integer[].class)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Long[].class)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Float[].class)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Double[].class)) && !Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(String[].class))) {
                int i = 0;
                if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    int i2 = gg4.a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    int i3 = gg4.a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(int[].class))) {
                    int[] iArr = (int[]) obj;
                    int i4 = gg4.a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(long[].class))) {
                    long[] jArr = (long[]) obj;
                    int i5 = gg4.a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(float[].class))) {
                    float[] fArr = (float[]) obj;
                    int i6 = gg4.a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else {
                    if (!Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(double[].class))) {
                        yhk.m("Key ", str, " has invalid type ", orCreateKotlinClass);
                        return;
                    }
                    double[] dArr = (double[]) obj;
                    int i7 = gg4.a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                }
                obj = objArr;
            }
        }
        linkedHashMap.put(str, obj);
    }

    public void C(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            B(entry.getValue(), (String) entry.getKey());
        }
    }

    public boolean E(String str) {
        return false;
    }

    public void F(long j, float f) {
        uj2 t = ((sx2) this.a).t();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        t.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        t.l(f);
        t.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void G(float f, float f2, long j) {
        uj2 t = ((sx2) this.a).t();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        t.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        t.a(f, f2);
        t.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void I(float f, float f2) {
        ((sx2) this.a).t().g(f, f2);
    }

    public Class J() {
        Class<?> loadClass = ((ClassLoader) this.a).loadClass("java.util.function.Consumer");
        loadClass.getClass();
        return loadClass;
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        List list = (List) obj;
        Collections.sort(list, (m39) this.a);
        return list;
    }

    @Override // defpackage.lii
    public pec d(MemoryCache$Key memoryCache$Key) {
        return null;
    }

    @Override // defpackage.ph2
    public void e(zg2 zg2Var, c2g c2gVar) {
        boolean z = c2gVar.a.q;
        ua3 ua3Var = (ua3) this.a;
        if (z) {
            ua3Var.complete(c2gVar.b);
        } else {
            ua3Var.completeExceptionally(new wi9(c2gVar));
        }
    }

    @Override // defpackage.lii
    public void f(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        ((d0l) this.a).g(memoryCache$Key, bitmap, map, wkn.y(bitmap));
    }

    public void g(int i, String str) {
        try {
            ((JSONObject) this.a).put(str, i);
        } catch (JSONException unused) {
            cp4.h(dmi.l(i, "Illegal JSON value ", str, ": "));
        }
    }

    public de0 i() {
        return new de0((JSONObject) this.a, 24);
    }

    @Override // defpackage.mu
    public void j(Bundle bundle) {
        ((iu) this.a).b("clx", "_ae", bundle);
    }

    public nc3 k() {
        l2a l2aVar = (l2a) this.a;
        if (l2aVar == null) {
            throw new IllegalStateException(l2a.class.getCanonicalName() + " must be set");
        }
        nc3 nc3Var = new nc3();
        int i = 0;
        nc3Var.a = w65.a(new m2a(l2aVar, i));
        int i2 = 2;
        uff a = w65.a(new m2a(l2aVar, i2));
        nc3Var.b = a;
        int i3 = 1;
        m2a m2aVar = new m2a(l2aVar, i3);
        nc3Var.c = m2aVar;
        nc3Var.d = w65.a(new vz0((uff) nc3Var.a, a, m2aVar, 3));
        nc3Var.e = w65.a(new vz0((uff) nc3Var.a, (uff) nc3Var.b, (m2a) nc3Var.c, i2));
        nc3Var.f = w65.a(new vz0((uff) nc3Var.a, (uff) nc3Var.b, (m2a) nc3Var.c, i));
        nc3Var.g = w65.a(new vz0((uff) nc3Var.a, (uff) nc3Var.b, (m2a) nc3Var.c, i3));
        return nc3Var;
    }

    public md4 l() {
        md4 md4Var = new md4((LinkedHashMap) this.a);
        ww9.I(md4Var);
        return md4Var;
    }

    @Override // defpackage.ph2
    public void m(zg2 zg2Var, Throwable th) {
        ((ua3) this.a).completeExceptionally(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String n(sm8 sm8Var) {
        String str;
        String z;
        String str2 = sm8Var.c;
        String str3 = sm8Var.b;
        if (!TextUtils.isEmpty(str2) && !C.LANGUAGE_UNDETERMINED.equals(str2)) {
            int i = lik.a;
            Locale forLanguageTag = i >= 21 ? Locale.forLanguageTag(str2) : new Locale(str2);
            Locale locale = i >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            str = forLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int offsetByCodePoints = str.offsetByCodePoints(0, 1);
                    str = str.substring(0, offsetByCodePoints).toUpperCase(locale) + str.substring(offsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
                z = z(str, o(sm8Var));
                if (TextUtils.isEmpty(z)) {
                    return z;
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                return str3;
            }
        }
        str = "";
        z = z(str, o(sm8Var));
        if (TextUtils.isEmpty(z)) {
        }
    }

    public String o(sm8 sm8Var) {
        Resources resources = (Resources) this.a;
        int i = sm8Var.e;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = z(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = z(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? z(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onComplete(MediaView mediaView) {
        MediationNativeAdCallback mediationNativeAdCallback = ((qm6) this.a).s;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoComplete();
        }
    }

    public void p(b20 b20Var) {
        ((sx2) this.a).t().r(b20Var);
    }

    public void q(float f, float f2, float f3, float f4, int i) {
        ((sx2) this.a).t().f(f, f2, f3, f4, i);
    }

    public ao3 s(Object obj, KClass kClass, Activity activity, wk6 wk6Var) {
        kClass.getClass();
        Object newProxyInstance = Proxy.newProxyInstance((ClassLoader) this.a, new Class[]{J()}, new zn3(kClass, wk6Var, 0));
        newProxyInstance.getClass();
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, J()).invoke(obj, activity, newProxyInstance);
        return new ao3(obj.getClass().getMethod("removeWindowLayoutInfoListener", J()), obj, newProxyInstance);
    }

    public void t() {
        ((mg3) this.a).getClass();
    }

    public mr8 u() {
        return null;
    }

    public vb5 v() {
        return (vb5) this.a;
    }

    public UUID w() {
        return nc2.a;
    }

    public int x() {
        return 1;
    }

    public void y(float f, float f2, float f3, float f4) {
        sx2 sx2Var = (sx2) this.a;
        uj2 t = sx2Var.t();
        float intBitsToFloat = Float.intBitsToFloat((int) (sx2Var.D() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (sx2Var.D() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            q3a.a("Width and height must be greater than or equal to zero");
        }
        sx2Var.N(floatToRawIntBits);
        t.g(f, f2);
    }

    public String z(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : ((Resources) this.a).getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    public void D(bc5 bc5Var) {
    }

    @Override // defpackage.lii
    public void b(int i) {
    }

    public void c(bc5 bc5Var) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onEnterFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onExitFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenBackground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenForeground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPause(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPlay(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onVolumeChange(MediaView mediaView, float f) {
    }

    public hpo(Context context) {
        context.getClass();
        JSONObject jSONObject = new JSONObject();
        this.a = jSONObject;
        g(0, "autoplay");
        g(0, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        g(0, "controls");
        g(1, "enablejsapi");
        g(0, L6.W0);
        String str = "https://" + context.getPackageName();
        try {
            jSONObject.put("origin", str);
            g(0, "rel");
            g(3, "iv_load_policy");
            g(0, "cc_load_policy");
        } catch (JSONException unused) {
            cp4.h("Illegal JSON value origin: ".concat(str));
            throw null;
        }
    }

    public hpo(ClassLoader classLoader) {
        classLoader.getClass();
        this.a = classLoader;
    }

    public /* synthetic */ hpo(Object obj) {
        this.a = obj;
    }
}
