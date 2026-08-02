package c5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.c1;
import com.appsflyer.AdRevenueScheme;
import d5.f;
import d5.g;
import d5.h;
import d5.i;
import d5.j;
import d5.k;
import d5.l;
import d5.n;
import d5.o;
import d5.q;
import d5.r;
import d5.s;
import d5.t;
import d5.u;
import d5.v;
import f5.e;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import v8.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final r7.a f3644a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f3645b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3646c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f3647d;

    /* renamed from: e, reason: collision with root package name */
    public final n5.a f3648e;

    /* renamed from: f, reason: collision with root package name */
    public final n5.a f3649f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3650g;

    public c(Context context, n5.a aVar, n5.a aVar2) {
        d dVar = new d();
        d5.c cVar = d5.c.f8183a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f8196a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        d5.d dVar2 = d5.d.f8185a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        d5.b bVar = d5.b.f8171a;
        dVar.a(d5.a.class, bVar);
        dVar.a(h.class, bVar);
        d5.e eVar = d5.e.f8188a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f8204a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f24461d = true;
        this.f3644a = new r7.a(16, dVar);
        this.f3646c = context;
        this.f3645b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f3647d = b(a.f3635c);
        this.f3648e = aVar2;
        this.f3649f = aVar;
        this.f3650g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException(c1.m("Invalid url: ", str), e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((d5.t) d5.t.f8238a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e5.h a(e5.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f3645b.getActiveNetworkInfo();
        a0 c2 = hVar.c();
        int i5 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c2.f685g;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i5));
        c2.j(CommonUrlParts.MODEL, Build.MODEL);
        c2.j("hardware", Build.HARDWARE);
        c2.j("device", Build.DEVICE);
        c2.j("product", Build.PRODUCT);
        c2.j("os-uild", Build.ID);
        c2.j(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER);
        c2.j("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        HashMap hashMap3 = (HashMap) c2.f685g;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i10 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f8240a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c2.f685g;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f8238a;
                subtype = 100;
            }
            hashMap = (HashMap) c2.f685g;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c2.j(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            c2.j(CommonUrlParts.LOCALE, Locale.getDefault().getLanguage());
            Context context = this.f3646c;
            c2.j("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e7) {
                ci.c.p("CctTransportBackend", "Unable to find version code for package", e7);
            }
            c2.j("application_build", Integer.toString(i10));
            return c2.p();
        }
        SparseArray sparseArray3 = t.f8238a;
        subtype = 0;
        hashMap = (HashMap) c2.f685g;
        if (hashMap != null) {
        }
    }
}
