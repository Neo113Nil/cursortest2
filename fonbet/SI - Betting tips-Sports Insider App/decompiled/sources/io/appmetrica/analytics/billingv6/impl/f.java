package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.r;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f11522a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.c f11523b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f11524c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f11525d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11526e;

    /* renamed from: f, reason: collision with root package name */
    public final d f11527f;

    /* renamed from: g, reason: collision with root package name */
    public final n f11528g;

    public f(String str, com.android.billingclient.api.c cVar, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f11522a = str;
        this.f11523b = cVar;
        this.f11524c = utilsProvider;
        this.f11525d = hVar;
        this.f11526e = list;
        this.f11527f = dVar;
        this.f11528g = nVar;
    }

    @Override // com.android.billingclient.api.r
    public final void onProductDetailsResponse(com.android.billingclient.api.k kVar, List list) {
        this.f11524c.getWorkerExecutor().execute(new e(this, kVar, list));
    }
}
