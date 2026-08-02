package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.android.billingclient.api.c f11517a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f11518b = new LinkedHashSet();

    public d(com.android.billingclient.api.c cVar) {
        this.f11517a = cVar;
    }

    public final void a(Object obj) {
        this.f11518b.remove(obj);
        if (this.f11518b.size() == 0) {
            this.f11517a.a();
        }
    }
}
