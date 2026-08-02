package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.v;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f11597a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f11598b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11599c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11600d;

    /* renamed from: e, reason: collision with root package name */
    public final d f11601e;

    /* renamed from: f, reason: collision with root package name */
    public final n f11602f;

    public k(UtilsProvider utilsProvider, Function0 function0, List list, List list2, d dVar, n nVar) {
        this.f11597a = utilsProvider;
        this.f11598b = function0;
        this.f11599c = list;
        this.f11600d = list2;
        this.f11601e = dVar;
        this.f11602f = nVar;
    }

    @Override // com.android.billingclient.api.v
    public final void onQueryPurchasesResponse(com.android.billingclient.api.k kVar, List list) {
        this.f11597a.getWorkerExecutor().execute(new j(this, kVar, list));
    }
}
