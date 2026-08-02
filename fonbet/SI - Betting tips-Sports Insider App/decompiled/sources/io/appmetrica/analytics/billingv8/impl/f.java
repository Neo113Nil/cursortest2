package io.appmetrica.analytics.billingv8.impl;

import androidx.annotation.NonNull;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.r;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f11575a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.c f11576b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f11577c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f11578d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11579e;

    /* renamed from: f, reason: collision with root package name */
    public final d f11580f;

    /* renamed from: g, reason: collision with root package name */
    public final n f11581g;

    public f(String str, com.android.billingclient.api.c cVar, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f11575a = str;
        this.f11576b = cVar;
        this.f11577c = utilsProvider;
        this.f11578d = hVar;
        this.f11579e = list;
        this.f11580f = dVar;
        this.f11581g = nVar;
    }

    public final void onProductDetailsResponse(com.android.billingclient.api.k kVar, QueryProductDetailsResult queryProductDetailsResult) {
        this.f11577c.getWorkerExecutor().execute(new e(this, kVar, queryProductDetailsResult));
    }

    @Override // com.android.billingclient.api.r
    public abstract /* synthetic */ void onProductDetailsResponse(@NonNull com.android.billingclient.api.k kVar, @NonNull List list);
}
