package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqm;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.inmobi.media.core.config.models.CrashConfig;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.f;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class kpg implements qs3, f, q02, zzyh, zzqp, n4p, y78, l41, ac2, sm6, c79, pl6 {
    public static final kpg b = new kpg(1);
    public static final kpg c = new kpg(2);
    public static final kpg d = new kpg(3);
    public static final /* synthetic */ kpg e = new kpg(4);
    public static final kpg f = new kpg(6);
    public static final /* synthetic */ kpg g = new kpg(7);
    public static final zaj h = new zaj();
    public static final kpg i = new kpg(8);
    public static final kpg j = new kpg(9);
    public static final kpg k = new kpg(10);
    public static final kpg l = new kpg(11);
    public static final kpg m = new kpg(12);
    public static final kpg n = new kpg(13);
    public static final kpg o = new kpg(14);
    public final /* synthetic */ int a;

    public /* synthetic */ kpg(int i2) {
        this.a = i2;
    }

    public static ArrayList o(List list) {
        ArrayList k2 = me4.k(list);
        for (Object obj : list) {
            if (((qff) obj) != qff.HTTP_1_0) {
                k2.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList(k13.r(k2, 10));
        Iterator it = k2.iterator();
        while (it.hasNext()) {
            arrayList.add(((qff) it.next()).a);
        }
        return arrayList;
    }

    public static byte[] p(List list) {
        list.getClass();
        x52 x52Var = new x52();
        Iterator it = o(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            x52Var.Y0(str.length());
            x52Var.g1(str);
        }
        return x52Var.j0(x52Var.b);
    }

    public static p68 s(String str) {
        Object obj;
        Iterator<E> it = p68.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((p68) obj).a.equals(str)) {
                break;
            }
        }
        return (p68) obj;
    }

    public static int u(Context context, double d2, Integer num) {
        context.getClass();
        if (num != null) {
            d2 = yid.s(d2, num.intValue());
        }
        return context.getColor(z(d2));
    }

    public static final int v(Context context, String str) {
        context.getClass();
        Double f2 = b.f(str);
        return u(context, f2 != null ? f2.doubleValue() : 0.0d, null);
    }

    public static long x(double d2, of3 of3Var) {
        return lz.D(z(d2), of3Var);
    }

    public static int z(double d2) {
        return d2 == 0.0d ? R.color.rating_00 : d2 < 6.0d ? R.color.rating_10 : d2 < 6.5d ? R.color.rating_60 : d2 < 7.0d ? R.color.rating_65 : d2 < 8.0d ? R.color.rating_70 : d2 < 9.0d ? R.color.rating_80 : d2 <= 10.0d ? R.color.rating_90 : R.color.rating_00;
    }

    public Signature[] A(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.n4p
    public a5p a(Class cls) {
        if (!zzqm.class.isAssignableFrom(cls)) {
            a70.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (a5p) zzqm.i(cls.asSubclass(zzqm.class)).f(3);
        } catch (Exception e2) {
            vp2.e("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // defpackage.n4p
    public boolean b(Class cls) {
        return zzqm.class.isAssignableFrom(cls);
    }

    @Override // defpackage.sm6
    public Object c() {
        return new ArrayList();
    }

    @Override // defpackage.qs3
    public Object convert(Object obj) {
        return (i2g) obj;
    }

    @Override // defpackage.ac2
    public byte[] d(int i2, int i3, byte[] bArr) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.c79
    public boolean e() {
        boolean z;
        synchronized (u08.a) {
            try {
                int i2 = u08.c;
                u08.c = i2 + 1;
                if (i2 >= 30 || SystemClock.uptimeMillis() > u08.d + CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                    u08.c = 0;
                    u08.d = SystemClock.uptimeMillis();
                    String[] list = u08.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    u08.e = list.length < 800;
                }
                z = u08.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.c79
    public boolean f(jjh jjhVar) {
        s02 s02Var = jjhVar.a;
        if ((s02Var instanceof u25 ? ((u25) s02Var).j : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        s02 s02Var2 = jjhVar.b;
        return (s02Var2 instanceof u25 ? ((u25) s02Var2).j : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.q02
    public long g(zz0 zz0Var, int i2) {
        String str = ((aej) zz0Var.e).a.a.b;
        return t6a.g(wca.u(str, i2), wca.t(str, i2));
    }

    @Override // defpackage.l41
    public boolean h(float f2) {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.l41
    public nja i() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.l41
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.l41
    public boolean j(float f2) {
        return false;
    }

    @Override // defpackage.y78
    public float k(float f2, float f3, long j2) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.l41
    public float l() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.l41
    public float n() {
        return 1.0f;
    }

    @Override // defpackage.y78
    public float q() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(Context context, Uri uri, Bitmap bitmap, sq3 sq3Var) {
        tr9 tr9Var;
        int i2;
        if (sq3Var instanceof tr9) {
            tr9Var = (tr9) sq3Var;
            int i3 = tr9Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tr9Var.t = i3 - Integer.MIN_VALUE;
                Object obj = tr9Var.r;
                lu3 lu3Var = lu3.a;
                i2 = tr9Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    k50 k50Var = new k50(context, uri, bitmap, null, 10);
                    tr9Var.t = 1;
                    obj = xw3.R(hs4Var, k50Var, tr9Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        tr9Var = new tr9(this, sq3Var);
        Object obj2 = tr9Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = tr9Var.t;
        if (i2 != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    @Override // defpackage.y78
    public long t(float f2) {
        return 0L;
    }

    public String toString() {
        switch (this.a) {
            case 18:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.pl6
    /* renamed from: track */
    public vsj mo2track(int i2, int i3) {
        return new q35();
    }

    @Override // defpackage.y78
    public float w(float f2, float f3) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.y78
    public float y(long j2, float f2) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.pl6
    public void endTracks() {
    }

    @Override // defpackage.pl6
    public void m(b0h b0hVar) {
    }
}
