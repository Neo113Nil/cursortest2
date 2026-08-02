package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.widget.ImageView;
import androidx.compose.runtime.e;
import coil.memory.MemoryCache$Key;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.sofascore.model.Sports;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class wj9 implements cn9, lt9, ay2, yx2, aki, w0c, y0i, SDKInitStatusListener {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public wj9(Context context, int i) {
        this.a = i;
        switch (i) {
            case 24:
                this.b = context;
                ld0 ld0Var = new ld0(this, 23);
                int i2 = 91;
                ld0 ld0Var2 = new ld0(90, i2, 24);
                int i3 = 92;
                ld0 ld0Var3 = new ld0(i2, i3, 25);
                ld0 ld0Var4 = new ld0(i3, 93, 26);
                pjc pjcVar = new pjc(this, 2);
                ld0 ld0Var5 = new ld0(this, 27);
                ld0 ld0Var6 = new ld0(this, 28);
                ld0 ld0Var7 = new ld0(96, 97, 29);
                qjc qjcVar = new qjc(this, 0);
                this.c = new njc[]{ld0Var, ld0Var2, ld0Var3, ld0Var4, pjcVar, ld0Var5, ld0Var6, ld0Var7, qjcVar, qjcVar, new qjc(this, 1), new qjc(this, 2), new pjc(this, 0), new ld0(this, 19), new ld0(this, 20), new ld0(this, 21), new ld0(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 22), rfo.h, pco.h, new pjc(this, 1)};
                break;
            default:
                this.c = null;
                this.b = context;
                break;
        }
    }

    public static void D(dni dniVar, String str, String str2, String str3) {
        if (dniVar.A0("SELECT * FROM ".concat(str)).getColumnIndex(str2) == -1) {
            StringBuilder s = mz1.s("ALTER TABLE ", str, " ADD COLUMN ", str2, " ");
            s.append(str3);
            dniVar.E(s.toString());
        }
    }

    public static void F(dni dniVar, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("SportName", str);
        contentValues.put("NotificationName", str2);
        contentValues.put("NotificationValue", Boolean.TRUE);
        dniVar.D0("NotificationSettings", 4, contentValues);
    }

    public static fmi I(i5d i5dVar, ot9 ot9Var, MemoryCache$Key memoryCache$Key, pec pecVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(ot9Var.a.getResources(), pecVar.a);
        Map map = pecVar.b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = l.a;
        if (i5dVar != null && i5dVar.b) {
            z = true;
        }
        return new fmi(bitmapDrawable, ot9Var, 1, memoryCache$Key, str, booleanValue, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006f, TryCatch #0 {IOException -> 0x006f, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005b), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wj9 J(String... strArr) {
        String str;
        try {
            gc2[] gc2VarArr = new gc2[strArr.length];
            x52 x52Var = new x52();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = wga.e;
                x52Var.Y0(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = str2.charAt(i3);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                        if (i2 < i3) {
                            x52Var.f1(i2, i3, str2);
                        }
                        x52Var.g1(str);
                        i2 = i3 + 1;
                    } else {
                        if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                        }
                        x52Var.g1(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    x52Var.f1(i2, length, str2);
                }
                x52Var.Y0(34);
                x52Var.readByte();
                gc2VarArr[i] = x52Var.l0(x52Var.b);
            }
            String[] strArr3 = (String[]) strArr.clone();
            int i4 = wvd.c;
            return new wj9(8, strArr3, wca.D(gc2VarArr));
        } catch (IOException e) {
            a70.j(e);
            return null;
        }
    }

    public Object A(kmb kmbVar) {
        return (ihh) this.c;
    }

    @Override // defpackage.ay2
    public void B() {
        ((ay2) this.b).B();
    }

    public Object C(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        kmb kmbVar = (kmb) this.b;
        kmbVar.a = f;
        kmbVar.b = f2;
        kmbVar.c = obj;
        kmbVar.d = obj2;
        kmbVar.e = f3;
        kmbVar.f = f4;
        kmbVar.g = f5;
        return A(kmbVar);
    }

    @Override // defpackage.lt9
    public void E(fq5 fq5Var) {
        ((ImageView) this.b).setVisibility(8);
    }

    public MemoryCache$Key G(ot9 ot9Var, Object obj, xvd xvdVar, e26 e26Var) {
        String str;
        Map map;
        ot9Var.getClass();
        List list = ot9Var.f;
        List list2 = ((bpf) this.b).g.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str = null;
                break;
            }
            Pair pair = (Pair) list2.get(i);
            mja mjaVar = (mja) pair.a;
            if (((Class) pair.b).isAssignableFrom(obj.getClass())) {
                mjaVar.getClass();
                str = mjaVar.a(obj, xvdVar);
                if (str != null) {
                    break;
                }
            }
            i++;
        }
        if (str == null) {
            return null;
        }
        Map map2 = ot9Var.r.a;
        if (map2.isEmpty()) {
            map = lm5.a;
            map.getClass();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                pvd.j();
                return null;
            }
            map = linkedHashMap;
        }
        if (list.isEmpty() && map.isEmpty()) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return new MemoryCache$Key(str, lm5Var);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        if (!list.isEmpty()) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedHashMap2.put(ljg.j(i2, "coil#transformation_"), ((cwj) list.get(i2)).b());
            }
            linkedHashMap2.put("coil#transformation_size", xvdVar.c.toString());
        }
        return new MemoryCache$Key(str, linkedHashMap2);
    }

    @Override // defpackage.igi
    public void H() {
        ((yx2) this.b).H();
    }

    public void K(jac jacVar) {
        if (jacVar == null) {
            a70.p("callback must not be null");
            return;
        }
        if (((ConcurrentHashMap) this.c).putIfAbsent(jacVar, Boolean.TRUE) != null) {
            return;
        }
        Handler handler = new Handler();
        jacVar.f(handler);
        a aVar = (a) this.b;
        aVar.a.registerCallback(jacVar.a, handler);
        synchronized (aVar.b) {
            if (aVar.e.a() != null) {
                d4c d4cVar = new d4c(jacVar);
                aVar.d.put(jacVar, d4cVar);
                jacVar.c = d4cVar;
                try {
                    aVar.e.a().W3(d4cVar);
                    jacVar.e(13, null, null);
                } catch (RemoteException unused) {
                }
            } else {
                jacVar.c = null;
                aVar.c.add(jacVar);
            }
        }
    }

    public void L() {
        g9i g9iVar = (g9i) this.b;
        j80 j80Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.c = new d80(lz.f, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), j80Var, 60);
    }

    public void M(jac jacVar) {
        if (jacVar == null) {
            a70.p("callback must not be null");
        } else {
            if (((ConcurrentHashMap) this.c).remove(jacVar) == null) {
                return;
            }
            try {
                ((a) this.b).b(jacVar);
            } finally {
                jacVar.f(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void N(float f, kx4 kx4Var, ku3 ku3Var) {
        if (f <= kx4Var.H0(1.0f)) {
            return;
        }
        nnh w = bea.w();
        rq3 rq3Var = null;
        Object[] objArr = 0;
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            float floatValue = ((Number) ((eoh) ((d80) this.c).b).getValue()).floatValue();
            g9i g9iVar = (g9i) this.b;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            d80 d80Var = (d80) this.c;
            if (d80Var.f) {
                this.c = t62.B(d80Var, floatValue - f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
            } else {
                this.c = new d80(lz.f, Float.valueOf(-f), objArr == true ? 1 : 0, 60);
            }
            this.b = xw3.L(ku3Var, null, null, new ppa(this, rq3Var, 1), 3);
            Unit unit = Unit.a;
            bea.K(w, C, e);
        } catch (Throwable th) {
            bea.K(w, C, e);
            throw th;
        }
    }

    @Override // defpackage.w0c
    public void a(k55 k55Var) {
        switch (this.a) {
            case 15:
                r55.e((na3) this.c, k55Var);
                break;
            default:
                r55.e((na3) this.c, k55Var);
                break;
        }
    }

    @Override // defpackage.cn9
    public yzc b() {
        return (yzc) this.c;
    }

    @Override // defpackage.igi
    public void c(tz2 tz2Var) {
        ((yx2) this.b).c(tz2Var);
    }

    @Override // defpackage.yx2
    public void d(int i) {
        ((yx2) this.b).d(i);
    }

    @Override // defpackage.y0i
    public StackTraceElement[] e(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        y0i[] y0iVarArr = (y0i[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            y0i y0iVar = y0iVarArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = y0iVar.e(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((mx9) this.c).e(stackTraceElementArr2) : stackTraceElementArr2;
    }

    public void f(dni dniVar, String str, int i) {
        dni dniVar2;
        SharedPreferences d;
        xbb b = kotlin.collections.a.b();
        b.add(Sports.FOOTBALL);
        b.add(Sports.TENNIS);
        b.add(Sports.BASKETBALL);
        b.add(Sports.ICE_HOCKEY);
        b.add(Sports.VOLLEYBALL);
        b.add(Sports.HANDBALL);
        b.add(Sports.E_SPORTS);
        b.add(Sports.MMA);
        b.add(Sports.BASEBALL);
        b.add(Sports.CRICKET);
        b.add(Sports.MOTORSPORT);
        b.add(Sports.AMERICAN_FOOTBALL);
        b.add(Sports.RUGBY);
        b.add(Sports.BADMINTON);
        b.add(Sports.SNOOKER);
        b.add(Sports.DARTS);
        b.add(Sports.FUTSAL);
        b.add(Sports.TABLE_TENNIS);
        b.add(Sports.BEACH_VOLLEY);
        b.add(Sports.WATERPOLO);
        b.add(Sports.CYCLING);
        b.add(Sports.AUSSIE_RULES);
        b.add(Sports.FLOORBALL);
        b.add(Sports.BANDY);
        int size = oea.l(ke0.c, kotlin.collections.a.a(b)).size() - 1;
        if (i <= size) {
            while (true) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("SPORT_ORDER", Integer.valueOf(size + 1));
                dniVar2 = dniVar;
                dniVar2.x0("SportOrder", 5, contentValues, "SPORT_ORDER = " + size, null);
                if (size == i) {
                    break;
                }
                size--;
                dniVar = dniVar2;
            }
        } else {
            dniVar2 = dniVar;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("SPORT_NAME", str);
        contentValues2.put("SPORT_ORDER", Integer.valueOf(i));
        dniVar2.D0("SportOrder", 5, contentValues2);
        Context context = (Context) this.b;
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
        sharedPreferences.edit().putBoolean("PREF_SHOW_NEW_SPORT_POPUP", true).apply();
    }

    @Override // defpackage.igi
    public void flush() {
        ((yx2) this.b).flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(aq4 aq4Var, sq3 sq3Var) {
        xk9 xk9Var;
        int i;
        if (sq3Var instanceof xk9) {
            xk9Var = (xk9) sq3Var;
            int i2 = xk9Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xk9Var.t = i2 - Integer.MIN_VALUE;
                Object obj = xk9Var.r;
                lu3 lu3Var = lu3.a;
                i = xk9Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    CoroutineContext.Element element = aq4Var.getCoroutineContext().get(uic.g);
                    element.getClass();
                    aea aeaVar = (aea) ((xa3) element);
                    aeaVar.j0();
                    try {
                        fkf.y(aq4Var.c());
                    } catch (Throwable unused) {
                    }
                    xk9Var.t = 1;
                    if (aeaVar.Z(xk9Var) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        xk9Var = new xk9(this, sq3Var);
        Object obj2 = xk9Var.r;
        lu3 lu3Var2 = lu3.a;
        i = xk9Var.t;
        if (i != 0) {
        }
        return Unit.a;
    }

    @Override // defpackage.aki
    public void h(zji zjiVar) {
        h0d h0dVar = (h0d) this.c;
        h0dVar.a();
        m0d m0dVar = (m0d) zjiVar.b;
        Object[] objArr = m0dVar.b;
        long[] jArr = m0dVar.c;
        int i = m0dVar.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object b = ((tqa) this.b).b(obj);
            int d = h0dVar.d(b);
            int i3 = d >= 0 ? h0dVar.c[d] : 0;
            if (i3 == 7) {
                zjiVar.remove(obj);
            } else {
                h0dVar.g(i3 + 1, b);
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(sq3 sq3Var) {
        yk9 yk9Var;
        Object obj;
        Object obj2;
        int i;
        xh9 xh9Var;
        try {
            if (sq3Var instanceof yk9) {
                yk9Var = (yk9) sq3Var;
                int i2 = yk9Var.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yk9Var.u = i2 - Integer.MIN_VALUE;
                    obj = yk9Var.s;
                    obj2 = lu3.a;
                    i = yk9Var.u;
                    if (i != 0) {
                        y6a.M(obj);
                        yj9 yj9Var = new yj9();
                        yj9 yj9Var2 = (yj9) this.b;
                        yj9Var.e = yj9Var2.e;
                        yj9Var.e(yj9Var2);
                        vh9 vh9Var = (vh9) this.c;
                        yk9Var.u = 1;
                        obj = vh9Var.e(yj9Var, yk9Var);
                        if (obj == obj2) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                aq4 aq4Var = (aq4) yk9Var.r;
                                y6a.M(obj);
                                return aq4Var;
                            }
                            xh9Var = (xh9) yk9Var.r;
                            y6a.M(obj);
                            aq4 d = ((xh9) obj).d();
                            aq4 d2 = xh9Var.d();
                            yk9Var.r = d;
                            yk9Var.u = 3;
                            return g(d2, yk9Var) == obj2 ? obj2 : d;
                        }
                        y6a.M(obj);
                    }
                    xh9Var = (xh9) obj;
                    yk9Var.r = xh9Var;
                    yk9Var.u = 2;
                    obj = x2a.Q(xh9Var, yk9Var);
                    if (obj == obj2) {
                    }
                    aq4 d3 = ((xh9) obj).d();
                    aq4 d22 = xh9Var.d();
                    yk9Var.r = d3;
                    yk9Var.u = 3;
                    if (g(d22, yk9Var) == obj2) {
                    }
                }
            }
            if (i != 0) {
            }
            xh9Var = (xh9) obj;
            yk9Var.r = xh9Var;
            yk9Var.u = 2;
            obj = x2a.Q(xh9Var, yk9Var);
            if (obj == obj2) {
            }
            aq4 d32 = ((xh9) obj).d();
            aq4 d222 = xh9Var.d();
            yk9Var.r = d32;
            yk9Var.u = 3;
            if (g(d222, yk9Var) == obj2) {
            }
        } catch (CancellationException e) {
            throw xw3.Q(e);
        }
        yk9Var = new yk9(this, sq3Var);
        obj = yk9Var.s;
        obj2 = lu3.a;
        i = yk9Var.u;
    }

    @Override // defpackage.igi
    public boolean isReady() {
        return ((yx2) this.b).isReady();
    }

    @Override // defpackage.aki
    public boolean j(Object obj, Object obj2) {
        tqa tqaVar = (tqa) this.b;
        return Intrinsics.c(tqaVar.b(obj), tqaVar.b(obj2));
    }

    @Override // defpackage.igi
    public void k(zef zefVar) {
        ((yx2) this.b).k(zefVar);
    }

    @Override // defpackage.yx2
    public void l(xei xeiVar) {
        ((yx2) this.b).l(xeiVar);
    }

    @Override // defpackage.yx2
    public void m(int i) {
        ((yx2) this.b).m(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory n(String str) {
        Bundle bundle;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        Map map = (Map) this.c;
        if (map == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) != null) {
                bundle = serviceInfo.metaData;
                if (bundle != null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str2 : bundle.keySet()) {
                        Object obj = bundle.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1)) {
                                String trim = str3.trim();
                                if (!trim.isEmpty()) {
                                    hashMap.put(trim, str2.substring(8));
                                }
                            }
                        }
                    }
                    map = hashMap;
                }
                this.c = map;
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) map.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    @Override // defpackage.igi
    public void o() {
        ((yx2) this.b).o();
    }

    @Override // defpackage.w0c
    public void onComplete() {
        switch (this.a) {
            case 15:
                ((w0c) this.b).onComplete();
                break;
            default:
                ((w0c) this.b).onComplete();
                break;
        }
    }

    @Override // defpackage.w0c
    public void onError(Throwable th) {
        switch (this.a) {
            case 15:
                ((w0c) this.b).onError(th);
                break;
            default:
                ((w0c) this.b).onError(th);
                break;
        }
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public void onInitFail(String str) {
        AdError n = vha.n(105, str);
        ((InitializationCompleteCallback) this.c).onInitializationFailed(n.getMessage());
        String str2 = MintegralMediationAdapter.TAG;
        n.toString();
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public void onInitSuccess() {
        Context context = (Context) this.b;
        MBridgeSDKImpl mBridgeSDKImpl = MintegralMediationAdapter.d;
        int tagForChildDirectedTreatment = MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment();
        int tagForUnderAgeOfConsent = MobileAds.getRequestConfiguration().getTagForUnderAgeOfConsent();
        boolean z = n9e.I() && MobileAds.getRequestConfiguration().getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD;
        if (tagForChildDirectedTreatment == 1 || tagForUnderAgeOfConsent == 1 || z) {
            mBridgeSDKImpl.setCoppaStatus(context, true);
        } else if (tagForChildDirectedTreatment == 0 || tagForUnderAgeOfConsent == 0) {
            mBridgeSDKImpl.setCoppaStatus(context, false);
        }
        ((InitializationCompleteCallback) this.c).onInitializationSucceeded();
    }

    @Override // defpackage.w0c
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 15:
                ((w0c) this.b).onSuccess(obj);
                break;
            default:
                ((w0c) this.b).onSuccess(obj);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
    
        if (java.lang.Math.abs(r15 - (r21 * r4)) > 1.0d) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011b, code lost:
    
        if (r17 != 1.0d) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011e, code lost:
    
        if (r1 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0120, code lost:
    
        if (r0 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0125, code lost:
    
        if (r0.b > 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
    
        java.util.Objects.toString(r5);
        java.util.Objects.toString(r11);
        java.util.Objects.toString(r3);
        defpackage.ljg.x(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0137, code lost:
    
        if (r17 <= 1.0d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0139, code lost:
    
        if (r8 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013b, code lost:
    
        if (r0 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0140, code lost:
    
        if (r0.b > 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0142, code lost:
    
        java.util.Objects.toString(r5);
        java.util.Objects.toString(r11);
        java.util.Objects.toString(r3);
        defpackage.ljg.x(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010a, code lost:
    
        if (java.lang.Math.abs(r13 - r2) > 1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0116, code lost:
    
        if (java.lang.Math.abs(r15 - r4) > 1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pec p(ot9 ot9Var, MemoryCache$Key memoryCache$Key, jjh jjhVar, int i) {
        pec pecVar;
        pec pecVar2;
        boolean equals;
        int i2 = ot9Var.z;
        Object obj = ot9Var.b;
        if (mz1.a(i2)) {
            gpf gpfVar = (gpf) ((bpf) this.b).c.getValue();
            if (gpfVar != null) {
                pecVar = gpfVar.a.d(memoryCache$Key);
                if (pecVar == null) {
                    pecVar = gpfVar.b.d(memoryCache$Key);
                }
            } else {
                pecVar = null;
            }
            if (pecVar != null) {
                Bitmap bitmap = pecVar.a;
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                boolean k = x6k.k(ot9Var, config);
                zid zidVar = (zid) this.c;
                if (k) {
                    Object obj2 = pecVar.b.get("coil#is_sampled");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (!Intrinsics.c(jjhVar, jjh.c)) {
                        String str = (String) memoryCache$Key.b.get("coil#transformation_size");
                        if (str != null) {
                            equals = str.equals(jjhVar.toString());
                            pecVar2 = null;
                        } else {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            s02 s02Var = jjhVar.a;
                            s02 s02Var2 = jjhVar.b;
                            int i3 = s02Var instanceof u25 ? ((u25) s02Var).j : Integer.MAX_VALUE;
                            int i4 = s02Var2 instanceof u25 ? ((u25) s02Var2).j : Integer.MAX_VALUE;
                            pecVar2 = null;
                            double u = ktm.u(width, height, i3, i4, i);
                            boolean a = j.a(ot9Var);
                            if (a) {
                                double d = u > 1.0d ? 1.0d : u;
                                if (Math.abs(i3 - (width * d)) > 1.0d) {
                                }
                                equals = true;
                            } else {
                                if (i3 != Integer.MIN_VALUE) {
                                    if (i3 != Integer.MAX_VALUE) {
                                    }
                                }
                                if (i4 != Integer.MIN_VALUE) {
                                    if (i4 != Integer.MAX_VALUE) {
                                    }
                                }
                                equals = true;
                            }
                        }
                    } else if (!booleanValue) {
                        pecVar2 = null;
                        equals = true;
                    } else if (zidVar == null || zidVar.b > 3) {
                        pecVar2 = null;
                        equals = false;
                    } else {
                        Objects.toString(obj);
                    }
                    return !equals ? pecVar : pecVar2;
                }
                if (zidVar != null && zidVar.b <= 3) {
                    Objects.toString(obj);
                }
                equals = false;
                pecVar2 = null;
                if (!equals) {
                }
            }
        }
        return null;
    }

    @Override // defpackage.ay2
    public void q(qic qicVar) {
        ((ay2) this.b).q(qicVar);
    }

    @Override // defpackage.yx2
    public void r(om4 om4Var) {
        ((yx2) this.b).r(om4Var);
    }

    @Override // defpackage.yx2
    public void s(hl4 hl4Var) {
        ((yx2) this.b).s(hl4Var);
    }

    @Override // defpackage.yx2
    public void t() {
        ((yx2) this.b).t();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("GET ");
                sb.append((String) this.b);
                sb.append(" HTTP/1.1\r\n");
                Map map = ((p89) this.c).a;
                for (String str : Collections.unmodifiableSet(map.keySet())) {
                    List list = (List) map.get(str);
                    Iterator it = (list == null ? null : Collections.unmodifiableList(list)).iterator();
                    while (it.hasNext()) {
                        bf3.v(sb, str, ": ", (String) it.next(), "\r\n");
                    }
                }
                sb.append("\r\n");
                return sb.toString();
            case 1:
                return "HttpStatement[" + ((yj9) this.b).a + ']';
            case 2:
            case 3:
            case 4:
            default:
                return super.toString();
            case 5:
                en0 I = qea.I(this);
                I.e((ay2) this.b, "delegate");
                return I.toString();
            case 6:
                en0 I2 = qea.I(this);
                I2.e((yx2) this.b, "delegate");
                return I2.toString();
        }
    }

    public k1c u() {
        return (k1c) ((eoh) ((e1d) this.c)).getValue();
    }

    @Override // defpackage.ay2
    public void v(cqa cqaVar) {
        ((ay2) this.b).v(cqaVar);
    }

    @Override // defpackage.yx2
    public void w(ay2 ay2Var) {
        ((sjb) ((p8a) this.c).b.b).i();
        System.currentTimeMillis();
        ((yx2) this.b).w(new wj9(this, ay2Var, false, 5));
    }

    @Override // defpackage.yx2
    public void x(zl1 zl1Var) {
        ((yx2) this.b).x(zl1Var);
    }

    public f4c y() {
        MediaController.TransportControls transportControls = ((a) this.b).a.getTransportControls();
        return Build.VERSION.SDK_INT >= 29 ? new g4c(transportControls) : new f4c(transportControls);
    }

    @Override // defpackage.ay2
    public void z(xei xeiVar, zx2 zx2Var, qic qicVar) {
        x6k x6kVar = ((p8a) ((wj9) this.c).c).b;
        if (xeiVar.f()) {
            ((sjb) x6kVar.c).i();
        } else {
            ((sjb) x6kVar.d).i();
        }
        ((ay2) this.b).z(xeiVar, zx2Var, qicVar);
    }

    @Override // defpackage.lt9
    public void onSuccess() {
        ((ImageView) this.c).setVisibility(0);
    }

    public /* synthetic */ wj9(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public wj9(sx2 sx2Var) {
        this.a = 26;
        l2a l2aVar = new l2a(sx2Var);
        this.c = new yia((byte) 0, 6);
        this.b = l2aVar;
    }

    public wj9(y0i[] y0iVarArr) {
        this.a = 23;
        this.b = y0iVarArr;
        this.c = new mx9();
    }

    public wj9(wma wmaVar, k1c k1cVar) {
        this.a = 7;
        this.b = wmaVar;
        this.c = e.f(k1cVar);
    }

    public wj9(yj9 yj9Var, vh9 vh9Var) {
        this.a = 1;
        vh9Var.getClass();
        this.b = yj9Var;
        this.c = vh9Var;
    }

    public wj9(bpf bpfVar, x6k x6kVar, zid zidVar) {
        this.a = 21;
        this.b = bpfVar;
        this.c = zidVar;
    }

    public wj9(int i) {
        this.a = i;
        switch (i) {
            case 2:
                yzc yzcVar = new yzc();
                this.b = yzcVar;
                this.c = yzcVar;
                break;
            case 11:
                q4k q4kVar = lz.f;
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.c = new d80(q4kVar, valueOf, (j80) q4kVar.a.invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 13:
                this.b = new kmb();
                this.c = null;
                break;
            case 27:
                this.b = new AtomicReference();
                this.c = new dh0(0);
                break;
            default:
                this.b = "/";
                this.c = new p89();
                break;
        }
    }

    public wj9(ihh ihhVar) {
        this.a = 13;
        this.b = new kmb();
        this.c = ihhVar;
    }

    public wj9(byte[] bArr) {
        this.a = 18;
        this.b = bArr;
    }

    public wj9(xei xeiVar, Object obj) {
        this.a = 4;
        z1a.y(xeiVar, "status");
        this.b = xeiVar;
        this.c = obj;
    }

    public /* synthetic */ wj9(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public wj9(tqa tqaVar) {
        this.a = 10;
        this.b = tqaVar;
        h0d h0dVar = vjd.a;
        this.c = new h0d();
    }

    public wj9(Context context, hcc hccVar) {
        this.a = 17;
        this.c = new ConcurrentHashMap();
        MediaSessionCompat$Token mediaSessionCompat$Token = ((dcc) hccVar.b).b;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new e4c(context, mediaSessionCompat$Token);
        } else {
            this.b = new a(context, mediaSessionCompat$Token);
        }
    }

    public wj9(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = 17;
        this.c = new ConcurrentHashMap();
        if (mediaSessionCompat$Token != null) {
            this.b = new a(context, mediaSessionCompat$Token);
        } else {
            a70.p("sessionToken must not be null");
            throw null;
        }
    }
}
