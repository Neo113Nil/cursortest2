package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109dl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Hf f13596a;

    /* renamed from: b, reason: collision with root package name */
    public final C0608xg f13597b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0044b8 f13598c;

    public C0109dl(@NonNull ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new Hf(eCommerceProduct), eCommerceReferrer == null ? null : new C0608xg(eCommerceReferrer), new C0134el());
    }

    @NonNull
    public final InterfaceC0044b8 a() {
        return this.f13598c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f13598c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f13596a + ", referrer=" + this.f13597b + ", converter=" + this.f13598c + '}';
    }

    public C0109dl(@NonNull Hf hf2, C0608xg c0608xg, @NonNull InterfaceC0044b8 interfaceC0044b8) {
        this.f13596a = hf2;
        this.f13597b = c0608xg;
        this.f13598c = interfaceC0044b8;
    }
}
