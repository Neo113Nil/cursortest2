package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364nl implements InterfaceC0465rn {

    /* renamed from: d, reason: collision with root package name */
    public static final long f14368d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final Context f14369a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f14370b;

    /* renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f14371c;

    public C0364nl(Context context) {
        long j = f14368d;
        this.f14371c = new CachedDataProvider.CachedData(j, j, "sim-info");
        this.f14369a = context;
        this.f14370b = C0353na.k().j();
    }

    public final C0237il b() {
        return new C0237il((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f14369a, "phone", "getting SimMcc", "TelephonyManager", new C0263jl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f14369a, "phone", "getting SimMnc", "TelephonyManager", new C0289kl()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f14369a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C0339ml(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f14369a, "phone", "getting SimOperatorName", "TelephonyManager", new C0314ll()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0465rn
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C0237il> a() {
        List<C0237il> list;
        try {
            List<C0237il> list2 = (List) this.f14371c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.f14371c.shouldUpdateData()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (C0353na.I.f14339u.b().f13765n.f14167d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.f14370b.hasPermission(this.f14369a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(C0389ol.a(this.f14369a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.f14371c.setData(arrayList);
            list = arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }
}
