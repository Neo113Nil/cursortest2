package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608xg {

    /* renamed from: a, reason: collision with root package name */
    public final String f14922a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14923b;

    /* renamed from: c, reason: collision with root package name */
    public final C0081cj f14924c;

    public C0608xg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C0081cj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f14922a + "', identifier='" + this.f14923b + "', screen=" + this.f14924c + '}';
    }

    public C0608xg(String str, String str2, C0081cj c0081cj) {
        this.f14922a = str;
        this.f14923b = str2;
        this.f14924c = c0081cj;
    }
}
