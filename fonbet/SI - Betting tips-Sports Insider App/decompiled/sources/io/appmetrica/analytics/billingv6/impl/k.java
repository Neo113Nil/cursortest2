package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.v;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f11544a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f11545b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11546c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11547d;

    /* renamed from: e, reason: collision with root package name */
    public final d f11548e;

    /* renamed from: f, reason: collision with root package name */
    public final n f11549f;

    public k(UtilsProvider utilsProvider, Function0 function0, List list, List list2, d dVar, n nVar) {
        this.f11544a = utilsProvider;
        this.f11545b = function0;
        this.f11546c = list;
        this.f11547d = list2;
        this.f11548e = dVar;
        this.f11549f = nVar;
    }

    @Override // com.android.billingclient.api.v
    public final void onQueryPurchasesResponse(com.android.billingclient.api.k kVar, List list) {
        this.f11544a.getWorkerExecutor().execute(new j(this, kVar, list));
    }
}
