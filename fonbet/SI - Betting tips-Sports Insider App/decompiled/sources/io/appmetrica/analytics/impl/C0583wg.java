package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583wg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14837a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f14838b;

    /* renamed from: c, reason: collision with root package name */
    public final Ra f14839c;

    /* renamed from: d, reason: collision with root package name */
    public final Dc f14840d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14841e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14842f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14843g;

    public C0583wg(Context context, SafePackageManager safePackageManager, Ra ra2) {
        this.f14837a = context;
        this.f14838b = safePackageManager;
        this.f14839c = ra2;
        Dc dc2 = new Dc(0);
        dc2.a(EnumC0334mg.f14268d, 1);
        dc2.a(EnumC0334mg.f14267c, 2);
        this.f14840d = dc2;
        this.f14841e = TimeUnit.DAYS.toSeconds(1L);
        this.f14842f = "com.android.vending";
        this.f14843g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (((java.lang.Number) r6).longValue() < r13.f14841e) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0359ng a(List list) {
        C0359ng c0359ng;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (C0359ng) list.get(0);
        }
        SafePackageManager safePackageManager = this.f14838b;
        Context context = this.f14837a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C0359ng c0359ng2 = (C0359ng) it.next();
            Pair pair = new Pair(c0359ng2, Long.valueOf(Math.abs(c0359ng2.f14363c - seconds)));
            while (true) {
                boolean hasNext = it.hasNext();
                Object obj = pair.f19193b;
                if (!hasNext) {
                    break;
                }
                C0359ng c0359ng3 = (C0359ng) it.next();
                Long valueOf = Long.valueOf(Math.abs(c0359ng3.f14363c - seconds));
                Pair pair2 = new Pair(c0359ng3, valueOf);
                if (jf.a.a((Comparable) obj, valueOf) > 0) {
                    pair = pair2;
                }
            }
            c0359ng = (C0359ng) pair.f19192a;
        }
        c0359ng = null;
        if (c0359ng == null) {
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C0359ng c0359ng4 = (C0359ng) it2.next();
            while (it2.hasNext()) {
                C0359ng c0359ng5 = (C0359ng) it2.next();
                if (a(this, c0359ng4, c0359ng5) < 0) {
                    c0359ng4 = c0359ng5;
                }
            }
            c0359ng = c0359ng4;
        }
        Ra ra2 = this.f14839c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C0359ng c0359ng6 = (C0359ng) it3.next();
            arrayList.add(new JSONObject().put("referrer", c0359ng6.f14361a).put("install_timestamp_seconds", c0359ng6.f14363c).put("click_timestamp_seconds", c0359ng6.f14362b).put(AdRevenueConstants.SOURCE_KEY, c0359ng6.f14364d.f14270a));
        }
        ra2.reportEvent("several_filled_referrers", jSONObject.put("candidates", lo.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", c0359ng.f14361a).put("install_timestamp_seconds", c0359ng.f14363c).put("click_timestamp_seconds", c0359ng.f14362b).put(AdRevenueConstants.SOURCE_KEY, c0359ng.f14364d.f14270a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c0359ng;
    }

    public /* synthetic */ C0583wg(Context context) {
        this(context, new SafePackageManager(), AbstractC0593x1.a());
    }

    public static final int a(C0583wg c0583wg, C0359ng c0359ng, C0359ng c0359ng2) {
        int signum = Long.signum(c0359ng.f14363c - c0359ng2.f14363c);
        return signum == 0 ? ((Number) c0583wg.f14840d.a(c0359ng.f14364d)).intValue() - ((Number) c0583wg.f14840d.a(c0359ng2.f14364d)).intValue() : signum;
    }
}
