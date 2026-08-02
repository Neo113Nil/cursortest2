package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.b;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.internal.d;
import com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.internal.zzah;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcni;
import com.google.android.gms.internal.ads.zzdus;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.internal.wearable.zzc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wearable.internal.zzf;
import com.google.android.gms.wearable.internal.zzgq;
import com.google.android.gms.wearable.internal.zzkf;
import com.google.android.gms.wearable.internal.zzko;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.ironsource.L6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.results.R;
import com.sofascore.results.service.WatchService;
import com.sofascore.results.view.header.TeamLogoView;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ejg implements lt9, ozg, tti, zzaat, RemoteCall, z7p, zzcni {
    public static ejg e;
    public static final Object f = new Object();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public ejg(lo0[] lo0VarArr) {
        this.a = 5;
        dhh dhhVar = new dhh();
        byte[] bArr = lik.e;
        dhhVar.k = bArr;
        dhhVar.l = bArr;
        wvh wvhVar = new wvh();
        wvhVar.c = 1.0f;
        wvhVar.d = 1.0f;
        go0 go0Var = go0.e;
        wvhVar.e = go0Var;
        wvhVar.f = go0Var;
        wvhVar.g = go0Var;
        wvhVar.h = go0Var;
        ByteBuffer byteBuffer = lo0.a;
        wvhVar.k = byteBuffer;
        wvhVar.l = byteBuffer.asShortBuffer();
        wvhVar.m = byteBuffer;
        wvhVar.b = -1;
        lo0[] lo0VarArr2 = new lo0[lo0VarArr.length + 2];
        this.c = lo0VarArr2;
        System.arraycopy(lo0VarArr, 0, lo0VarArr2, 0, lo0VarArr.length);
        this.b = dhhVar;
        this.d = wvhVar;
        lo0VarArr2[lo0VarArr.length] = dhhVar;
        lo0VarArr2[lo0VarArr.length + 1] = wvhVar;
    }

    public static void a(p8 p8Var, int i, Object obj, int i2, List list) {
        if (list.isEmpty()) {
            p8Var.b(i, i2, obj);
            return;
        }
        for (Object obj2 : list) {
            try {
                p8Var.c(i, i2, obj2);
            } catch (ClassCastException unused) {
                p8Var.a(obj2);
            }
        }
    }

    public static ejg f(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ejg ejgVar = new ejg(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) ejgVar.b)) {
            try {
                ((ArrayDeque) ejgVar.b).clear();
                String string = ((SharedPreferences) ejgVar.c).getString("topic_operation_queue", "");
                if (!TextUtils.isEmpty(string) && string.contains(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
                    String[] split = string.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
                    int length = split.length;
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) ejgVar.b).add(str);
                        }
                    }
                    return ejgVar;
                }
                return ejgVar;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static umg j(smg smgVar, String str) {
        umg j;
        umg umgVar = (umg) smgVar;
        if (str.equals(umgVar.c)) {
            return umgVar;
        }
        for (Object obj : smgVar.a()) {
            if (obj instanceof umg) {
                umg umgVar2 = (umg) obj;
                if (str.equals(umgVar2.c)) {
                    return umgVar2;
                }
                if ((obj instanceof smg) && (j = j((smg) obj, str)) != null) {
                    return j;
                }
            }
        }
        return null;
    }

    public static Method m(Class cls, String str, Class[] clsArr) {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return m(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized ejg p() {
        ejg ejgVar;
        synchronized (ejg.class) {
            if (e == null) {
                ejg ejgVar2 = new ejg(0, (boolean) (0 == true ? 1 : 0));
                ejgVar2.c = Boolean.FALSE;
                ejgVar2.b = "Not Applicable";
                ejgVar2.d = "16ac05a";
                e = ejgVar2;
                try {
                    Class<?> cls = Class.forName("com.equativ.displaysdk.coresdkdisplay.BuildConfig");
                    Field declaredField = cls.getDeclaredField("DEBUG");
                    Field declaredField2 = cls.getDeclaredField("CORE_VERSION_NAME");
                    Field declaredField3 = cls.getDeclaredField("REVISION_NUMBER");
                    Object newInstance = cls.newInstance();
                    ejg ejgVar3 = e;
                    Boolean bool = (Boolean) declaredField.get(newInstance);
                    bool.booleanValue();
                    ejgVar3.c = bool;
                    e.b = (String) declaredField2.get(newInstance);
                    e.d = (String) declaredField3.get(newInstance);
                } catch (Exception unused) {
                }
            }
            ejgVar = e;
        }
        return ejgVar;
    }

    public static hcc x() {
        hcc hccVar = new hcc(12, false);
        hccVar.c = sm0.b;
        hccVar.d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return hccVar;
    }

    @Override // defpackage.tti
    public void A(nr9 nr9Var) {
        Function1 function1 = (Function1) this.d;
        TeamLogoView teamLogoView = (TeamLogoView) this.b;
        Resources resources = teamLogoView.getContext().getResources();
        resources.getClass();
        function1.invoke(rfo.t(nr9Var, resources));
        teamLogoView.requestLayout();
    }

    public void B(rfb rfbVar) {
        this.c = rfbVar.a;
        this.d = rfbVar.c;
        this.b = rfbVar.b;
    }

    public void C(sfb sfbVar, qfb qfbVar) {
        sfbVar.getClass();
        int ordinal = sfbVar.ordinal();
        if (ordinal == 0) {
            this.c = qfbVar;
            return;
        }
        if (ordinal == 1) {
            this.b = qfbVar;
        } else if (ordinal == 2) {
            this.d = qfbVar;
        } else {
            zzl.b();
        }
    }

    @Override // defpackage.lt9
    public void E(fq5 fq5Var) {
        zad zadVar;
        nt9 a;
        ImageView imageView = (ImageView) this.c;
        Throwable th = fq5Var.c;
        String str = null;
        ui9 ui9Var = th instanceof ui9 ? (ui9) th : null;
        if (ui9Var == null || (zadVar = ui9Var.a) == null || zadVar.a != 404) {
            return;
        }
        String j = vxd.j(((Integer) this.d).intValue(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image");
        apf a2 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = j;
        vt9.f(ht9Var, imageView);
        String str2 = (String) this.b;
        ht9Var.f = str2;
        ht9Var.i = str2;
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        if (I != null && (a = I.a()) != null) {
            str = a.e;
        }
        z8e.Q(ht9Var, context, R.drawable.cup_logo_placeholder, str, Integer.valueOf(R.color.neutral_default));
        a2.a(ht9Var.a());
    }

    public rfb F() {
        return new rfb((qfb) this.c, (qfb) this.b, (qfb) this.d);
    }

    public void G(xm3 xm3Var, int i, int i2, int i3) {
        xm3Var.getClass();
        int i4 = xm3Var.c0;
        int i5 = xm3Var.d0;
        xm3Var.c0 = 0;
        xm3Var.d0 = 0;
        xm3Var.S(i2);
        xm3Var.N(i3);
        if (i4 < 0) {
            xm3Var.c0 = 0;
        } else {
            xm3Var.c0 = i4;
        }
        if (i5 < 0) {
            xm3Var.d0 = 0;
        } else {
            xm3Var.d0 = i5;
        }
        xm3 xm3Var2 = (xm3) this.d;
        xm3Var2.u0 = i;
        xm3Var2.Z();
    }

    public void H(xm3 xm3Var) {
        ArrayList arrayList = (ArrayList) this.c;
        arrayList.clear();
        int size = xm3Var.r0.size();
        for (int i = 0; i < size; i++) {
            wm3 wm3Var = (wm3) xm3Var.r0.get(i);
            int[] iArr = wm3Var.q0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(wm3Var);
            }
        }
        xm3Var.t0.b = true;
    }

    @Override // defpackage.ozg
    public void b(j9e j9eVar) {
        long d;
        long j;
        ((djj) this.b).getClass();
        String str = nik.a;
        djj djjVar = (djj) this.b;
        synchronized (djjVar) {
            try {
                long j2 = djjVar.c;
                d = j2 != C.TIME_UNSET ? j2 + djjVar.b : djjVar.d();
            } finally {
            }
        }
        djj djjVar2 = (djj) this.b;
        synchronized (djjVar2) {
            j = djjVar2.b;
        }
        if (d == C.TIME_UNSET || j == C.TIME_UNSET) {
            return;
        }
        b bVar = (b) this.c;
        if (j != bVar.t) {
            qm8 a = bVar.a();
            a.s = j;
            b bVar2 = new b(a);
            this.c = bVar2;
            ((vsj) this.d).d(bVar2);
        }
        int a2 = j9eVar.a();
        ((vsj) this.d).g(a2, j9eVar);
        ((vsj) this.d).a(d, 1, a2, 0, null);
    }

    @Override // defpackage.ozg
    public void c(djj djjVar, pl6 pl6Var, c2k c2kVar) {
        this.b = djjVar;
        c2kVar.a();
        c2kVar.b();
        vsj mo2track = pl6Var.mo2track(c2kVar.e, 5);
        this.d = mo2track;
        mo2track.d((b) this.c);
    }

    public void d() {
        hcc hccVar = (hcc) this.c;
        if (hccVar != null) {
            int i = ((yz8) this.d).n.e;
            dcc dccVar = (dcc) hccVar.b;
            dccVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            dccVar.a.setPlaybackToLocal(builder.build());
            this.b = null;
        }
    }

    public void e(long j, j9e j9eVar) {
        if (j9eVar.a() < 9) {
            return;
        }
        int m = j9eVar.m();
        int m2 = j9eVar.m();
        int A = j9eVar.A();
        if (m == 434 && m2 == 1195456820 && A == 3) {
            ((jy0) this.d).b(j, j9eVar);
        }
    }

    public void g(pl6 pl6Var, c2k c2kVar) {
        vsj[] vsjVarArr = (vsj[]) this.b;
        for (int i = 0; i < vsjVarArr.length; i++) {
            c2kVar.a();
            c2kVar.b();
            vsj mo2track = pl6Var.mo2track(c2kVar.e, 3);
            b bVar = (b) ((List) this.c).get(i);
            String str = bVar.o;
            z1a.q(str, "Invalid closed caption MIME type provided: %s", MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str));
            qm8 qm8Var = new qm8();
            c2kVar.b();
            qm8Var.a = c2kVar.f;
            qm8Var.m = sjc.p("video/mp2t");
            qm8Var.n = sjc.p(str);
            qm8Var.e = bVar.e;
            qm8Var.d = bVar.d;
            qm8Var.K = bVar.L;
            qm8Var.q = bVar.r;
            w1l.r(qm8Var, mo2track);
            vsjVarArr[i] = mo2track;
        }
    }

    public qfb h(sfb sfbVar) {
        sfbVar.getClass();
        int ordinal = sfbVar.ordinal();
        if (ordinal == 0) {
            return (qfb) this.c;
        }
        if (ordinal == 1) {
            return (qfb) this.b;
        }
        if (ordinal == 2) {
            return (qfb) this.d;
        }
        zzl.b();
        return null;
    }

    public w0d i() {
        int i;
        float f2;
        int i2;
        pmg pmgVar = (pmg) this.c;
        amg amgVar = pmgVar.r;
        amg amgVar2 = pmgVar.s;
        if (amgVar == null || amgVar.g() || (i = amgVar.b) == 9 || i == 2 || i == 3) {
            return new w0d(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float a = amgVar.a();
        if (amgVar2 == null) {
            w0d w0dVar = ((pmg) this.c).o;
            f2 = w0dVar != null ? (w0dVar.e * a) / w0dVar.d : a;
        } else {
            if (amgVar2.g() || (i2 = amgVar2.b) == 9 || i2 == 2 || i2 == 3) {
                return new w0d(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f2 = amgVar2.a();
        }
        return new w0d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, f2);
    }

    public Method k(Class cls) {
        Class cls2;
        Method m = m(cls, (String) this.b, (Class[]) this.d);
        if (m == null || (cls2 = (Class) this.c) == null || cls2.isAssignableFrom(m.getReturnType())) {
            return m;
        }
        return null;
    }

    public Object l() {
        int i = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.d;
            if (i >= objArr.length) {
                return null;
            }
            Object[] objArr2 = objArr[i];
            if (ffb.d == objArr2[0]) {
                return objArr2[1];
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public s o(int i, zzbg zzbgVar, int[] iArr) {
        gio gioVar = zzabc.k;
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        for (int i2 = 0; i2 < zzbgVar.a; i2++) {
            zzgxjVar.c(new w5n(i, zzbgVar, i2, (zzaaq) this.c, iArr[i2], (String) this.b, (String) this.d));
        }
        return zzgxjVar.f();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(87:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(84:263|264|(1:24)|25|26|27|(1:29)|260|31|32|33|34|35|(65:242|(2:246|(2:250|(3:252|(1:254)(1:256)|255)))|38|(1:40)|41|(1:43)|44|(3:229|(2:237|238)|(1:236))|50|(1:52)|53|(1:55)(2:219|(1:224)(1:223))|56|(1:58)(1:218)|59|(1:61)(5:208|(1:210)|211|(1:213)(1:217)|(1:215)(1:216))|62|(1:64)(6:190|(4:193|(2:201|202)(1:199)|200|191)|203|204|(1:206)|207)|65|(1:67)(1:189)|(1:69)|70|(38:185|186|(1:76)|77|(1:79)|80|(1:82)|(1:84)|85|(1:87)|(1:89)|90|(1:92)|(1:94)|95|(23:167|168|(1:99)|100|(3:157|158|(20:160|(1:162)|163|(1:104)|105|(4:142|143|144|(2:146|(14:148|(3:109|(1:114)(1:112)|113)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:141)|126|(4:130|131|(1:133)(1:136)|134)|128|129)(2:149|150))(2:151|152))|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)(2:164|165))|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|72|(41:181|182|(0)|77|(0)|80|(1:177)|82|(0)|85|(1:173)|87|(0)|90|(1:171)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|37|38|(0)|41|(0)|44|(2:46|225)|229|(1:231)|237|238|(1:234)|236|50|(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|22|(0)|25|26|27|(0)|260|31|32|33|34|35|(0)|37|38|(0)|41|(0)|44|(0)|229|(0)|237|238|(0)|236|50|(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129) */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01a1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01a2, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x00ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x00ae, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0321 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[Catch: NameNotFoundException -> 0x00ad, TRY_LEAVE, TryCatch #12 {NameNotFoundException -> 0x00ad, blocks: (B:27:0x00a1, B:29:0x00a7), top: B:26:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03df  */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v160 */
    /* JADX WARN: Type inference failed for: r0v161 */
    /* JADX WARN: Type inference failed for: r0v87, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean q() {
        vr9 vr9Var;
        FirebaseMessagingService firebaseMessagingService;
        bka bkaVar;
        Bundle bundle;
        String packageName;
        PackageManager packageManager;
        String r;
        String r2;
        String s;
        int i;
        String s2;
        Uri defaultUri;
        String s3;
        Intent launchIntentForPackage;
        int i2;
        PendingIntent activity;
        PendingIntent broadcast;
        String s4;
        Integer valueOf;
        String s5;
        Integer p;
        Integer p2;
        Integer p3;
        String s6;
        Long valueOf2;
        JSONArray q;
        long[] jArr;
        JSONArray q2;
        int[] iArr;
        ?? r0;
        String s7;
        IconCompat iconCompat;
        boolean z;
        int i3;
        ApplicationInfo applicationInfo;
        int i4 = 1;
        if (((bka) this.d).o("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.b;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String s8 = ((bka) this.d).s("gcm.n.image");
        if (!TextUtils.isEmpty(s8)) {
            try {
                vr9Var = new vr9(new URL(s8));
            } catch (MalformedURLException unused) {
            }
            if (vr9Var != null) {
                ExecutorService executorService = (ExecutorService) this.c;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                vr9Var.b = executorService.submit(new yq5(11, vr9Var, taskCompletionSource));
                vr9Var.c = taskCompletionSource.getTask();
            }
            firebaseMessagingService = (FirebaseMessagingService) this.b;
            bkaVar = (bka) this.d;
            AtomicInteger atomicInteger = y43.a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String s9 = bkaVar.s("gcm.n.android_channel_id");
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(s9) || notificationManager.getNotificationChannel(s9) == null) {
                    s9 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (TextUtils.isEmpty(s9) || notificationManager.getNotificationChannel(s9) == null) {
                        s9 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", identifier == 0 ? "Misc" : firebaseMessagingService.getString(identifier), 3));
                        }
                    }
                }
                AtomicInteger atomicInteger2 = y43.a;
                packageName = firebaseMessagingService.getPackageName();
                Resources resources = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                efd efdVar = new efd(firebaseMessagingService, s9);
                r = bkaVar.r(resources, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(r)) {
                    efdVar.d(r);
                }
                r2 = bkaVar.r(resources, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(r2)) {
                    efdVar.f = efd.c(r2);
                    afd afdVar = new afd(0);
                    afdVar.d = efd.c(r2);
                    efdVar.g(afdVar);
                }
                s = bkaVar.s("gcm.n.icon");
                if (!TextUtils.isEmpty(s) || (((i = resources.getIdentifier(s, "drawable", packageName)) == 0 || !y43.a(resources, i)) && ((i = resources.getIdentifier(s, "mipmap", packageName)) == 0 || !y43.a(resources, i)))) {
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i != 0 || !y43.a(resources, i)) {
                        i = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i != 0 || !y43.a(resources, i)) {
                        i = 17301651;
                    }
                }
                efdVar.v.icon = i;
                s2 = bkaVar.s("gcm.n.sound2");
                if (TextUtils.isEmpty(s2)) {
                    s2 = bkaVar.s("gcm.n.sound");
                }
                if (TextUtils.isEmpty(s2)) {
                    defaultUri = null;
                } else if (BuildConfig.FLAVOR.equals(s2) || resources.getIdentifier(s2, "raw", packageName) == 0) {
                    defaultUri = RingtoneManager.getDefaultUri(2);
                } else {
                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + s2);
                }
                if (defaultUri != null) {
                    Notification notification = efdVar.v;
                    notification.sound = defaultUri;
                    notification.audioStreamType = -1;
                    notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                }
                s3 = bkaVar.s("gcm.n.click_action");
                if (TextUtils.isEmpty(s3)) {
                    String s10 = bkaVar.s("gcm.n.link_android");
                    if (TextUtils.isEmpty(s10)) {
                        s10 = bkaVar.s("gcm.n.link");
                    }
                    Uri parse = !TextUtils.isEmpty(s10) ? Uri.parse(s10) : null;
                    if (parse != null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setPackage(packageName);
                        launchIntentForPackage.setData(parse);
                    } else {
                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    }
                } else {
                    launchIntentForPackage = new Intent(s3);
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setFlags(268435456);
                }
                if (launchIntentForPackage == null) {
                    i2 = 1;
                    activity = null;
                } else {
                    launchIntentForPackage.addFlags(67108864);
                    Bundle bundle3 = (Bundle) bkaVar.b;
                    Bundle bundle4 = new Bundle(bundle3);
                    for (String str : bundle3.keySet()) {
                        int i5 = i4;
                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                            bundle4.remove(str);
                        }
                        i4 = i5;
                    }
                    i2 = i4;
                    launchIntentForPackage.putExtras(bundle4);
                    if (bkaVar.o("google.c.a.e")) {
                        launchIntentForPackage.putExtra("gcm.n.analytics_data", bkaVar.w());
                    }
                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                }
                efdVar.g = activity;
                broadcast = !bkaVar.o("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bkaVar.w())), 1140850688);
                if (broadcast != null) {
                    efdVar.v.deleteIntent = broadcast;
                }
                s4 = bkaVar.s("gcm.n.color");
                if (!TextUtils.isEmpty(s4)) {
                    try {
                        valueOf = Integer.valueOf(Color.parseColor(s4));
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (valueOf != null) {
                        efdVar.o = valueOf.intValue();
                    }
                    efdVar.e(16, !bkaVar.o("gcm.n.sticky"));
                    efdVar.m = bkaVar.o("gcm.n.local_only");
                    s5 = bkaVar.s("gcm.n.ticker");
                    if (s5 != null) {
                        efdVar.v.tickerText = efd.c(s5);
                    }
                    p = bkaVar.p("gcm.n.notification_priority");
                    if (p != null || p.intValue() < -2 || p.intValue() > 2) {
                        p = null;
                    }
                    if (p != null) {
                        efdVar.j = p.intValue();
                    }
                    p2 = bkaVar.p("gcm.n.visibility");
                    if (p2 != null || p2.intValue() < -1 || p2.intValue() > i2) {
                        p2 = null;
                    }
                    if (p2 != null) {
                        efdVar.p = p2.intValue();
                    }
                    p3 = bkaVar.p("gcm.n.notification_count");
                    if (p3 != null || p3.intValue() < 0) {
                        p3 = null;
                    }
                    if (p3 != null) {
                        efdVar.i = p3.intValue();
                    }
                    s6 = bkaVar.s("gcm.n.event_time");
                    if (!TextUtils.isEmpty(s6)) {
                        try {
                            valueOf2 = Long.valueOf(Long.parseLong(s6));
                        } catch (NumberFormatException unused3) {
                            bka.z("gcm.n.event_time");
                        }
                        if (valueOf2 != null) {
                            efdVar.k = true;
                            efdVar.v.when = valueOf2.longValue();
                        }
                        q = bkaVar.q("gcm.n.vibrate_timings");
                        if (q != null) {
                            try {
                            } catch (NumberFormatException | JSONException unused4) {
                                q.toString();
                            }
                            if (q.length() <= 1) {
                                throw new JSONException("vibrateTimings have invalid length");
                            }
                            int length = q.length();
                            jArr = new long[length];
                            for (int i6 = 0; i6 < length; i6++) {
                                jArr[i6] = q.optLong(i6);
                            }
                            if (jArr != null) {
                                efdVar.v.vibrate = jArr;
                            }
                            q2 = bkaVar.q("gcm.n.light_settings");
                            if (q2 != null) {
                                iArr = new int[3];
                                try {
                                } catch (IllegalArgumentException e2) {
                                    q2.toString();
                                    e2.getMessage();
                                } catch (JSONException unused5) {
                                    q2.toString();
                                }
                                if (q2.length() != 3) {
                                    throw new JSONException("lightSettings don't have all three fields");
                                }
                                int parseColor = Color.parseColor(q2.optString(0));
                                if (parseColor == -16777216) {
                                    throw new IllegalArgumentException("Transparent color is invalid");
                                }
                                iArr[0] = parseColor;
                                iArr[1] = q2.optInt(1);
                                iArr[2] = q2.optInt(2);
                                if (iArr != null) {
                                    int i7 = iArr[0];
                                    int i8 = iArr[1];
                                    int i9 = iArr[2];
                                    Notification notification2 = efdVar.v;
                                    notification2.ledARGB = i7;
                                    notification2.ledOnMS = i8;
                                    notification2.ledOffMS = i9;
                                    notification2.flags = ((i8 == 0 || i9 == 0) ? 0 : 1) | ((-2) & notification2.flags);
                                }
                                boolean o = bkaVar.o("gcm.n.default_sound");
                                boolean z2 = o;
                                if (bkaVar.o("gcm.n.default_vibrate_timings")) {
                                    z2 = (o ? 1 : 0) | 2;
                                }
                                r0 = z2;
                                if (bkaVar.o("gcm.n.default_light_settings")) {
                                    r0 = (z2 ? 1 : 0) | 4;
                                }
                                Notification notification3 = efdVar.v;
                                notification3.defaults = r0;
                                if ((r0 & 4) != 0) {
                                    notification3.flags |= 1;
                                }
                                s7 = bkaVar.s("gcm.n.tag");
                                if (TextUtils.isEmpty(s7)) {
                                    s7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                }
                                String str2 = s7;
                                if (vr9Var != null) {
                                    try {
                                        Task task = vr9Var.c;
                                        Preconditions.i(task);
                                        Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                                        efdVar.f(bitmap);
                                        zed zedVar = new zed();
                                        if (bitmap == null) {
                                            iconCompat = null;
                                            z = true;
                                        } else {
                                            z = true;
                                            iconCompat = new IconCompat(1);
                                            iconCompat.b = bitmap;
                                        }
                                        zedVar.c = iconCompat;
                                        zedVar.d = null;
                                        zedVar.e = z;
                                        efdVar.g(zedVar);
                                    } catch (InterruptedException unused6) {
                                        vr9Var.close();
                                        Thread.currentThread().interrupt();
                                    } catch (ExecutionException e3) {
                                        Objects.toString(e3.getCause());
                                    } catch (TimeoutException unused7) {
                                        vr9Var.close();
                                    }
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str2, 0, efdVar.b());
                                return true;
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean o2 = bkaVar.o("gcm.n.default_sound");
                            boolean z22 = o2;
                            if (bkaVar.o("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z22;
                            if (bkaVar.o("gcm.n.default_light_settings")) {
                            }
                            Notification notification32 = efdVar.v;
                            notification32.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            s7 = bkaVar.s("gcm.n.tag");
                            if (TextUtils.isEmpty(s7)) {
                            }
                            String str22 = s7;
                            if (vr9Var != null) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str22, 0, efdVar.b());
                            return true;
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        q2 = bkaVar.q("gcm.n.light_settings");
                        if (q2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean o22 = bkaVar.o("gcm.n.default_sound");
                        boolean z222 = o22;
                        if (bkaVar.o("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z222;
                        if (bkaVar.o("gcm.n.default_light_settings")) {
                        }
                        Notification notification322 = efdVar.v;
                        notification322.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        s7 = bkaVar.s("gcm.n.tag");
                        if (TextUtils.isEmpty(s7)) {
                        }
                        String str222 = s7;
                        if (vr9Var != null) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str222, 0, efdVar.b());
                        return true;
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    q = bkaVar.q("gcm.n.vibrate_timings");
                    if (q != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    q2 = bkaVar.q("gcm.n.light_settings");
                    if (q2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean o222 = bkaVar.o("gcm.n.default_sound");
                    boolean z2222 = o222;
                    if (bkaVar.o("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z2222;
                    if (bkaVar.o("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222 = efdVar.v;
                    notification3222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    s7 = bkaVar.s("gcm.n.tag");
                    if (TextUtils.isEmpty(s7)) {
                    }
                    String str2222 = s7;
                    if (vr9Var != null) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str2222, 0, efdVar.b());
                    return true;
                }
                i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i3 != 0) {
                    try {
                        valueOf = Integer.valueOf(firebaseMessagingService.getColor(i3));
                    } catch (Resources.NotFoundException unused8) {
                    }
                    if (valueOf != null) {
                    }
                    efdVar.e(16, !bkaVar.o("gcm.n.sticky"));
                    efdVar.m = bkaVar.o("gcm.n.local_only");
                    s5 = bkaVar.s("gcm.n.ticker");
                    if (s5 != null) {
                    }
                    p = bkaVar.p("gcm.n.notification_priority");
                    if (p != null) {
                    }
                    p = null;
                    if (p != null) {
                    }
                    p2 = bkaVar.p("gcm.n.visibility");
                    if (p2 != null) {
                    }
                    p2 = null;
                    if (p2 != null) {
                    }
                    p3 = bkaVar.p("gcm.n.notification_count");
                    if (p3 != null) {
                    }
                    p3 = null;
                    if (p3 != null) {
                    }
                    s6 = bkaVar.s("gcm.n.event_time");
                    if (!TextUtils.isEmpty(s6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    q = bkaVar.q("gcm.n.vibrate_timings");
                    if (q != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    q2 = bkaVar.q("gcm.n.light_settings");
                    if (q2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean o2222 = bkaVar.o("gcm.n.default_sound");
                    boolean z22222 = o2222;
                    if (bkaVar.o("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z22222;
                    if (bkaVar.o("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222 = efdVar.v;
                    notification32222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    s7 = bkaVar.s("gcm.n.tag");
                    if (TextUtils.isEmpty(s7)) {
                    }
                    String str22222 = s7;
                    if (vr9Var != null) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str22222, 0, efdVar.b());
                    return true;
                }
                valueOf = null;
                if (valueOf != null) {
                }
                efdVar.e(16, !bkaVar.o("gcm.n.sticky"));
                efdVar.m = bkaVar.o("gcm.n.local_only");
                s5 = bkaVar.s("gcm.n.ticker");
                if (s5 != null) {
                }
                p = bkaVar.p("gcm.n.notification_priority");
                if (p != null) {
                }
                p = null;
                if (p != null) {
                }
                p2 = bkaVar.p("gcm.n.visibility");
                if (p2 != null) {
                }
                p2 = null;
                if (p2 != null) {
                }
                p3 = bkaVar.p("gcm.n.notification_count");
                if (p3 != null) {
                }
                p3 = null;
                if (p3 != null) {
                }
                s6 = bkaVar.s("gcm.n.event_time");
                if (!TextUtils.isEmpty(s6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                q = bkaVar.q("gcm.n.vibrate_timings");
                if (q != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                q2 = bkaVar.q("gcm.n.light_settings");
                if (q2 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean o22222 = bkaVar.o("gcm.n.default_sound");
                boolean z222222 = o22222;
                if (bkaVar.o("gcm.n.default_vibrate_timings")) {
                }
                r0 = z222222;
                if (bkaVar.o("gcm.n.default_light_settings")) {
                }
                Notification notification322222 = efdVar.v;
                notification322222.defaults = r0;
                if ((r0 & 4) != 0) {
                }
                s7 = bkaVar.s("gcm.n.tag");
                if (TextUtils.isEmpty(s7)) {
                }
                String str222222 = s7;
                if (vr9Var != null) {
                }
                ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str222222, 0, efdVar.b());
                return true;
            }
            s9 = null;
            AtomicInteger atomicInteger22 = y43.a;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources2 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            efd efdVar2 = new efd(firebaseMessagingService, s9);
            r = bkaVar.r(resources2, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(r)) {
            }
            r2 = bkaVar.r(resources2, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(r2)) {
            }
            s = bkaVar.s("gcm.n.icon");
            if (!TextUtils.isEmpty(s)) {
            }
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i != 0) {
            }
            i = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i != 0) {
            }
            i = 17301651;
            efdVar2.v.icon = i;
            s2 = bkaVar.s("gcm.n.sound2");
            if (TextUtils.isEmpty(s2)) {
            }
            if (TextUtils.isEmpty(s2)) {
            }
            if (defaultUri != null) {
            }
            s3 = bkaVar.s("gcm.n.click_action");
            if (TextUtils.isEmpty(s3)) {
            }
            if (launchIntentForPackage == null) {
            }
            efdVar2.g = activity;
            if (!bkaVar.o("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            s4 = bkaVar.s("gcm.n.color");
            if (!TextUtils.isEmpty(s4)) {
            }
            i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i3 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            efdVar2.e(16, !bkaVar.o("gcm.n.sticky"));
            efdVar2.m = bkaVar.o("gcm.n.local_only");
            s5 = bkaVar.s("gcm.n.ticker");
            if (s5 != null) {
            }
            p = bkaVar.p("gcm.n.notification_priority");
            if (p != null) {
            }
            p = null;
            if (p != null) {
            }
            p2 = bkaVar.p("gcm.n.visibility");
            if (p2 != null) {
            }
            p2 = null;
            if (p2 != null) {
            }
            p3 = bkaVar.p("gcm.n.notification_count");
            if (p3 != null) {
            }
            p3 = null;
            if (p3 != null) {
            }
            s6 = bkaVar.s("gcm.n.event_time");
            if (!TextUtils.isEmpty(s6)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            q = bkaVar.q("gcm.n.vibrate_timings");
            if (q != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            q2 = bkaVar.q("gcm.n.light_settings");
            if (q2 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean o222222 = bkaVar.o("gcm.n.default_sound");
            boolean z2222222 = o222222;
            if (bkaVar.o("gcm.n.default_vibrate_timings")) {
            }
            r0 = z2222222;
            if (bkaVar.o("gcm.n.default_light_settings")) {
            }
            Notification notification3222222 = efdVar2.v;
            notification3222222.defaults = r0;
            if ((r0 & 4) != 0) {
            }
            s7 = bkaVar.s("gcm.n.tag");
            if (TextUtils.isEmpty(s7)) {
            }
            String str2222222 = s7;
            if (vr9Var != null) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str2222222, 0, efdVar2.b());
            return true;
        }
        vr9Var = null;
        if (vr9Var != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.b;
        bkaVar = (bka) this.d;
        AtomicInteger atomicInteger3 = y43.a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String s92 = bkaVar.s("gcm.n.android_channel_id");
        if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
        }
        s92 = null;
        AtomicInteger atomicInteger222 = y43.a;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources22 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        efd efdVar22 = new efd(firebaseMessagingService, s92);
        r = bkaVar.r(resources22, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(r)) {
        }
        r2 = bkaVar.r(resources22, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(r2)) {
        }
        s = bkaVar.s("gcm.n.icon");
        if (!TextUtils.isEmpty(s)) {
        }
        i = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i != 0) {
        }
        i = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i != 0) {
        }
        i = 17301651;
        efdVar22.v.icon = i;
        s2 = bkaVar.s("gcm.n.sound2");
        if (TextUtils.isEmpty(s2)) {
        }
        if (TextUtils.isEmpty(s2)) {
        }
        if (defaultUri != null) {
        }
        s3 = bkaVar.s("gcm.n.click_action");
        if (TextUtils.isEmpty(s3)) {
        }
        if (launchIntentForPackage == null) {
        }
        efdVar22.g = activity;
        if (!bkaVar.o("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        s4 = bkaVar.s("gcm.n.color");
        if (!TextUtils.isEmpty(s4)) {
        }
        i3 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i3 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        efdVar22.e(16, !bkaVar.o("gcm.n.sticky"));
        efdVar22.m = bkaVar.o("gcm.n.local_only");
        s5 = bkaVar.s("gcm.n.ticker");
        if (s5 != null) {
        }
        p = bkaVar.p("gcm.n.notification_priority");
        if (p != null) {
        }
        p = null;
        if (p != null) {
        }
        p2 = bkaVar.p("gcm.n.visibility");
        if (p2 != null) {
        }
        p2 = null;
        if (p2 != null) {
        }
        p3 = bkaVar.p("gcm.n.notification_count");
        if (p3 != null) {
        }
        p3 = null;
        if (p3 != null) {
        }
        s6 = bkaVar.s("gcm.n.event_time");
        if (!TextUtils.isEmpty(s6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        q = bkaVar.q("gcm.n.vibrate_timings");
        if (q != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        q2 = bkaVar.q("gcm.n.light_settings");
        if (q2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean o2222222 = bkaVar.o("gcm.n.default_sound");
        boolean z22222222 = o2222222;
        if (bkaVar.o("gcm.n.default_vibrate_timings")) {
        }
        r0 = z22222222;
        if (bkaVar.o("gcm.n.default_light_settings")) {
        }
        Notification notification32222222 = efdVar22.v;
        notification32222222.defaults = r0;
        if ((r0 & 4) != 0) {
        }
        s7 = bkaVar.s("gcm.n.tag");
        if (TextUtils.isEmpty(s7)) {
        }
        String str22222222 = s7;
        if (vr9Var != null) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.b).getSystemService("notification")).notify(str22222222, 0, efdVar22.b());
        return true;
    }

    public Object r(Object obj, Object... objArr) {
        Method k = k(obj.getClass());
        if (k == null) {
            throw new AssertionError("Method " + ((String) this.b) + " not supported for object " + obj);
        }
        try {
            return k.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + k);
            assertionError.initCause(e2);
            throw assertionError;
        }
    }

    public void s(Object obj, Object... objArr) {
        try {
            Method k = k(obj.getClass());
            if (k == null) {
                return;
            }
            try {
                k.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // defpackage.tti
    public void t(nr9 nr9Var) {
        Drawable drawable;
        TeamLogoView teamLogoView = (TeamLogoView) this.b;
        Function1 function1 = (Function1) this.c;
        if (nr9Var != null) {
            Resources resources = teamLogoView.getContext().getResources();
            resources.getClass();
            drawable = rfo.t(nr9Var, resources);
        } else {
            drawable = null;
        }
        function1.invoke(drawable);
        teamLogoView.invalidate();
    }

    public String toString() {
        switch (this.a) {
            case 11:
                en0 I = qea.I(this);
                I.e((List) this.c, "addrs");
                I.e((sm0) this.b, "attrs");
                I.e(Arrays.deepToString((Object[][]) this.d), "customOptions");
                return I.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        switch (this.a) {
            case 23:
                zzkf zzkfVar = (zzkf) anyClient;
                bso bsoVar = new bso(taskCompletionSource);
                WatchService watchService = (WatchService) this.c;
                ListenerHolder listenerHolder = (ListenerHolder) this.b;
                IntentFilter[] intentFilterArr = (IntentFilter[]) this.d;
                zzkfVar.getClass();
                zzko zzkoVar = new zzko(intentFilterArr);
                zzkoVar.a = listenerHolder;
                ygo ygoVar = zzkfVar.S;
                HashMap hashMap = ygoVar.a;
                synchronized (hashMap) {
                    try {
                        if (hashMap.get(watchService) != null) {
                            if (Log.isLoggable("WearableClient", 2)) {
                                new StringBuilder(String.valueOf(watchService).length() + 20);
                            }
                            bsoVar.a(new Status(4001, null, null, null));
                            return;
                        }
                        if (Log.isLoggable("WearableClient", 2)) {
                            new StringBuilder(String.valueOf(watchService).length() + 14);
                        }
                        hashMap.put(watchService, zzkoVar);
                        try {
                            zzgq zzgqVar = (zzgq) zzkfVar.getService();
                            hgo hgoVar = new hgo(hashMap, watchService, bsoVar);
                            zzf zzfVar = new zzf(zzkoVar);
                            Parcel S1 = zzgqVar.S1();
                            zzc.b(S1, hgoVar);
                            S1.writeInt(1);
                            zzfVar.writeToParcel(S1, 0);
                            zzgqVar.J(S1, 16);
                            return;
                        } catch (RemoteException e2) {
                            if (Log.isLoggable("WearableClient", 3)) {
                                new StringBuilder(String.valueOf(watchService).length() + 39);
                            }
                            ygoVar.a.remove(watchService);
                            throw e2;
                        }
                    } finally {
                    }
                }
            case 24:
                String str = (String) this.b;
                String str2 = (String) this.d;
                zzy zzyVar = (zzy) anyClient;
                zzbm zzbmVar = (zzbm) this.c;
                HashMap hashMap2 = zzbmVar.C;
                long incrementAndGet = zzbmVar.r.incrementAndGet();
                zzbmVar.m();
                try {
                    hashMap2.put(Long.valueOf(incrementAndGet), taskCompletionSource);
                    zzyVar.getContext();
                    ApiMetadata a = zzff.a();
                    zzah zzahVar = (zzah) zzyVar.getService();
                    Parcel J = zzahVar.J();
                    J.writeString(str);
                    J.writeString(str2);
                    J.writeLong(incrementAndGet);
                    com.google.android.gms.internal.cast.zzc.b(J, a);
                    zzahVar.l2(J, 9);
                    return;
                } catch (RemoteException e3) {
                    hashMap2.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource.setException(e3);
                    return;
                }
            default:
                zzbm zzbmVar2 = (zzbm) this.c;
                String str3 = (String) this.b;
                Cast.MessageReceivedCallback messageReceivedCallback = (Cast.MessageReceivedCallback) this.d;
                zzy zzyVar2 = (zzy) anyClient;
                Preconditions.k("Not active connection", zzbmVar2.G != 1);
                zzyVar2.getContext();
                ApiMetadata a2 = zzff.a();
                zzah zzahVar2 = (zzah) zzyVar2.getService();
                Parcel J2 = zzahVar2.J();
                J2.writeString(str3);
                com.google.android.gms.internal.cast.zzc.b(J2, a2);
                zzahVar2.l2(J2, 12);
                if (messageReceivedCallback != null) {
                    zzah zzahVar3 = (zzah) zzyVar2.getService();
                    Parcel J3 = zzahVar3.J();
                    J3.writeString(str3);
                    com.google.android.gms.internal.cast.zzc.b(J3, a2);
                    zzahVar3.l2(J3, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public Object v(Object obj, Object... objArr) {
        try {
            return r(obj, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean w(int i, do1 do1Var, wm3 wm3Var) {
        co1 co1Var = (co1) this.b;
        int[] iArr = wm3Var.q0;
        int[] iArr2 = wm3Var.u;
        co1Var.a = iArr[0];
        co1Var.b = iArr[1];
        co1Var.c = wm3Var.r();
        co1Var.d = wm3Var.l();
        co1Var.i = false;
        co1Var.j = i;
        boolean z = co1Var.a == 3;
        boolean z2 = co1Var.b == 3;
        boolean z3 = z && wm3Var.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = z2 && wm3Var.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z3 && iArr2[0] == 4) {
            co1Var.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            co1Var.b = 1;
        }
        do1Var.b(wm3Var, co1Var);
        wm3Var.S(co1Var.e);
        wm3Var.N(co1Var.f);
        wm3Var.F = co1Var.h;
        wm3Var.J(co1Var.g);
        co1Var.j = 0;
        return co1Var.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r6 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(ysk yskVar, p8 p8Var, int i, List list) {
        int itemViewType;
        int e2;
        Object g;
        View view;
        View view2;
        View view3;
        p8Var.getClass();
        list.getClass();
        if (i < yskVar.getItemCount() && (itemViewType = yskVar.getItemViewType(i)) >= 0 && (g = yskVar.g((e2 = yskVar.e(i)))) != null) {
            Integer a = yskVar.a(itemViewType);
            if (a != null) {
                view = p8Var.itemView.findViewById(a.intValue());
            }
            view = p8Var.itemView;
            view.getClass();
            int itemCount = (yskVar.getItemCount() - yskVar.l()) - yskVar.d();
            if (yskVar.j(itemViewType, g)) {
                if (yskVar.b()) {
                    view.setBackground(null);
                }
                a(p8Var, e2, g, itemCount, list);
                Integer a2 = yskVar.a(itemViewType);
                if (a2 != null) {
                    view3 = p8Var.itemView.findViewById(a2.intValue());
                }
                view3 = p8Var.itemView;
                view3.getClass();
                if (!(view3.getBackground() instanceof RippleDrawable)) {
                    aba.y(view3, ((Number) ((mqi) this.b).getValue()).intValue(), 2);
                }
                view.setOnClickListener(new glc(this, p8Var, e2, g));
                return;
            }
            Integer a3 = yskVar.a(itemViewType);
            if (a3 != null) {
                view2 = p8Var.itemView.findViewById(a3.intValue());
            }
            view2 = p8Var.itemView;
            view2.getClass();
            if (view2.getBackground() instanceof RippleDrawable) {
                Drawable background = view2.getBackground();
                background.getClass();
                try {
                    view2.setBackground(((RippleDrawable) background).getDrawable(0));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (view.hasOnClickListeners()) {
                view.setOnClickListener(null);
            }
            a(p8Var, e2, g, itemCount, list);
            if (yskVar.b()) {
                view.setBackground(null);
            }
        }
    }

    public umg z(String str) {
        if (str != null) {
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
            } else if (str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1).replace("\\'", "'");
            }
            String replace = str.replace("\\\n", "").replace("\\A", "\n");
            if (replace.length() > 1 && replace.startsWith("#")) {
                String substring = replace.substring(1);
                HashMap hashMap = (HashMap) this.d;
                if (substring.length() == 0) {
                    return null;
                }
                if (substring.equals(((pmg) this.c).c)) {
                    return (pmg) this.c;
                }
                if (hashMap.containsKey(substring)) {
                    return (umg) hashMap.get(substring);
                }
                umg j = j((pmg) this.c, substring);
                hashMap.put(substring, j);
                return j;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcni
    public void zza(boolean z, int i, String str, String str2) {
        zzdus zzdusVar = (zzdus) this.c;
        zzclm zzclmVar = (zzclm) this.b;
        zzcgn zzcgnVar = (zzcgn) this.d;
        zzdusVar.getClass();
        zzflw zzflwVar = zzdusVar.a;
        if (!((Boolean) zzba.zzc().a(zzbjg.W4)).booleanValue()) {
            zzfw zzfwVar = zzflwVar.a;
            if (zzfwVar != null && zzclmVar.zzh() != null) {
                zzclmVar.zzh().E4(zzfwVar);
            }
            zzcgnVar.b();
            return;
        }
        if (z) {
            zzfw zzfwVar2 = zzflwVar.a;
            if (zzfwVar2 != null && zzclmVar.zzh() != null) {
                zzclmVar.zzh().E4(zzfwVar2);
            }
            zzcgnVar.b();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        fn0.s(i, "Native Video WebView failed to load. Error code: ", ", Description: ", str, sb);
        zzcgnVar.zzd(new zzeqf(1, mz1.o(sb, ", Failing URL: ", str2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ce  */
    @Override // defpackage.z7p, com.google.android.gms.internal.ads.zzhcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzb(Object obj) {
        String str;
        iqn iqnVar;
        WebView webView = (WebView) obj;
        BridgeConfiguration bridgeConfiguration = (BridgeConfiguration) this.d;
        vdb vdbVar = (vdb) this.c;
        Context context = (Context) this.b;
        webView.setBackgroundColor(0);
        webView.getSettings().setMixedContentMode(0);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setOnTouchListener((w2o) vdbVar.h);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        if (y0l.b("WEB_MESSAGE_LISTENER")) {
            try {
                Uri baseUri = bridgeConfiguration.baseUri();
                String str2 = baseUri.getScheme() + "://" + baseUri.getHost();
                if (baseUri.getPort() != -1) {
                    str2 = str2 + ":" + baseUri.getPort();
                }
                ohn ohnVar = new ohn(vdbVar, 4);
                int i = c4p.c;
                v0l.a(webView, "androidWebViewCompatSender", new p5p(str2), ohnVar);
                str = "4";
            } catch (Throwable unused) {
            }
            webView.setWebViewClient(new otn(vdbVar, (sen) vdbVar.g));
            new n8o();
            l8o l8oVar = new l8o(webView);
            iqnVar = cqn.a;
            Context applicationContext = context.getApplicationContext();
            iqnVar.getClass();
            pea.J(applicationContext, "Application Context cannot be null");
            if (!iqnVar.a) {
                iqnVar.a = true;
                avn a = avn.a();
                a.getClass();
                new zqn();
                a.b = new rrn(new Handler(), applicationContext, a);
                lsn lsnVar = lsn.d;
                lsnVar.getClass();
                boolean z = applicationContext instanceof Application;
                if (z) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(lsnVar);
                }
                bea.d = (UiModeManager) applicationContext.getSystemService("uimode");
                WindowManager windowManager = myn.a;
                myn.c = applicationContext.getResources().getDisplayMetrics().density;
                myn.a = (WindowManager) applicationContext.getSystemService("window");
                applicationContext.registerReceiver(new xyn(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                gun gunVar = gun.b;
                gunVar.getClass();
                gunVar.a = applicationContext.getApplicationContext();
                esn esnVar = esn.e;
                if (!esnVar.b) {
                    gtn gtnVar = esnVar.c;
                    if (z) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(gtnVar);
                    }
                    gtnVar.c = esnVar;
                    gtnVar.a = true;
                    gtnVar.b = x5n.g().importance == 100;
                    esnVar.d = gtnVar.b;
                    esnVar.b = true;
                }
                tvn tvnVar = tvn.d;
                tvnVar.getClass();
                tvnVar.a = new WeakReference(applicationContext);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                applicationContext.registerReceiver(new d(tvnVar, 15), intentFilter);
            }
            if (!TextUtils.isEmpty("Google1")) {
                a70.p("Name is null or empty");
                return;
            }
            if (TextUtils.isEmpty("3.39.0")) {
                a70.p("Version is null or empty");
                return;
            }
            try {
                l8oVar.c = new p03(new kif(24), webView);
            } catch (UnsupportedOperationException unused2) {
            }
            Uri.Builder appendQueryParameter = bridgeConfiguration.baseUri().buildUpon().appendQueryParameter("sdk_version", "a.3.39.0").appendQueryParameter("hl", bridgeConfiguration.language()).appendQueryParameter(L6.E, "1.5.2-google_20241009").appendQueryParameter("app", bridgeConfiguration.packageName()).appendQueryParameter("sswv_dai", "false").appendQueryParameter("page_correlator", String.valueOf(bridgeConfiguration.pageCorrelator()));
            appendQueryParameter.appendQueryParameter(L6.b1, str);
            if (bridgeConfiguration.testingConfiguration().d()) {
                TestingConfiguration testingConfiguration = (TestingConfiguration) bridgeConfiguration.testingConfiguration().g();
                i9p i9pVar = new i9p();
                i9pVar.c.add(new t1p());
                r1p r1pVar = new r1p();
                nbp nbpVar = i9pVar.a;
                nbp clone = nbpVar.clone();
                ArrayList arrayList = new ArrayList(nbpVar.a);
                clone.a = arrayList;
                arrayList.add(r1pVar);
                i9pVar.a = clone;
                appendQueryParameter.appendQueryParameter(TestingConfiguration.PARAMETER_KEY, i9pVar.b().d(testingConfiguration));
                q3p forceExperimentIds = testingConfiguration.forceExperimentIds();
                if (forceExperimentIds != null && !forceExperimentIds.isEmpty()) {
                    Iterator<E> it = forceExperimentIds.iterator();
                    StringBuilder sb = new StringBuilder();
                    try {
                        if (it.hasNext()) {
                            Object next = it.next();
                            Objects.requireNonNull(next);
                            sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                            while (it.hasNext()) {
                                sb.append((CharSequence) BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                Object next2 = it.next();
                                Objects.requireNonNull(next2);
                                sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                            }
                        }
                        appendQueryParameter.encodedFragment("deid=".concat(sb.toString()));
                    } catch (IOException e2) {
                        a70.j(e2);
                        return;
                    }
                }
            }
            webView.loadUrl(appendQueryParameter.build().toString());
            vdbVar.c = new e2p(new fln(webView, l8oVar));
            return;
        }
        str = "0";
        webView.setWebViewClient(new otn(vdbVar, (sen) vdbVar.g));
        new n8o();
        l8o l8oVar2 = new l8o(webView);
        iqnVar = cqn.a;
        Context applicationContext2 = context.getApplicationContext();
        iqnVar.getClass();
        pea.J(applicationContext2, "Application Context cannot be null");
        if (!iqnVar.a) {
        }
        if (!TextUtils.isEmpty("Google1")) {
        }
    }

    @Override // defpackage.lt9
    public void onSuccess() {
    }

    @Override // defpackage.tti
    public void D(nr9 nr9Var) {
    }

    public /* synthetic */ ejg(int i, boolean z) {
        this.a = i;
    }

    public ejg(Context context) {
        this.a = 16;
        context.getClass();
        this.c = context;
        this.b = ypa.b(new ate(this, 23));
    }

    public ejg(Drawable.Callback callback, String str, Map map) {
        this.a = 1;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.b = str.concat("/");
        } else {
            this.b = str;
        }
        this.d = map;
        if (!(callback instanceof View)) {
            this.c = null;
        } else {
            this.c = ((View) callback).getContext().getApplicationContext();
        }
    }

    public ejg(Executor executor, Executor executor2, Executor executor3) {
        this.a = 7;
        this.d = executor;
        this.c = executor2;
        this.b = executor3;
    }

    public ejg(List list) {
        this.a = 21;
        this.c = list;
        this.b = new vsj[list.size()];
        jy0 jy0Var = new jy0(new imf(this, 27));
        this.d = jy0Var;
        jy0Var.f(3);
    }

    public ejg(String str) {
        this.a = 15;
        qm8 qm8Var = new qm8();
        qm8Var.m = sjc.p("video/mp2t");
        qm8Var.n = sjc.p(str);
        this.c = new b(qm8Var);
    }

    public ejg(int i) {
        this.a = i;
        switch (i) {
            case 13:
                pfb pfbVar = pfb.c;
                this.c = pfbVar;
                this.b = pfbVar;
                this.d = pfbVar;
                break;
            default:
                g88 g88Var = new g88();
                g88Var.a = Float.NaN;
                this.c = g88Var;
                this.b = new gl4();
                break;
        }
    }

    public ejg(FirebaseMessagingService firebaseMessagingService, bka bkaVar, ExecutorService executorService) {
        this.a = 6;
        this.c = executorService;
        this.b = firebaseMessagingService;
        this.d = bkaVar;
    }

    public ejg(View view) {
        this.a = 10;
        this.c = view;
        this.b = ypa.a(ysa.c, new hv7(this, 9));
        this.d = new bka(view);
    }

    public ejg(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = 18;
        this.b = new ArrayDeque();
        this.c = sharedPreferences;
        this.d = scheduledThreadPoolExecutor;
    }

    public ejg(xm3 xm3Var) {
        this.a = 3;
        this.c = new ArrayList();
        this.b = new co1();
        this.d = xm3Var;
    }

    public ejg(int i, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.a = 20;
        this.b = str;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }

    @Override // defpackage.z7p, com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        vdb vdbVar = (vdb) this.c;
        vdbVar.a = true;
        q3p u = q3p.u((Set) vdbVar.i);
        int size = u.size();
        for (int i = 0; i < size; i++) {
            ((bun) u.get(i)).zza();
        }
    }

    public /* synthetic */ ejg(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public ejg(ImageView imageView, Integer num, String str) {
        this.a = 9;
        this.c = imageView;
        this.d = num;
        this.b = str;
    }

    public ejg(List list, sm0 sm0Var, Object[][] objArr) {
        this.a = 11;
        z1a.y(list, "addresses are not set");
        this.c = list;
        z1a.y(sm0Var, "attrs");
        this.b = sm0Var;
        z1a.y(objArr, "customOptions");
        this.d = objArr;
    }

    public ejg(yz8 yz8Var, hcc hccVar) {
        this.a = 8;
        this.d = yz8Var;
        this.c = hccVar;
    }
}
