package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057bl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Hf f13460a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final C0081cj f13461b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0044b8 f13462c;

    public C0057bl(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new Hf(eCommerceProduct), new C0081cj(eCommerceScreen), new C0083cl());
    }

    @NonNull
    public final InterfaceC0044b8 a() {
        return this.f13462c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f13462c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f13460a + ", screen=" + this.f13461b + ", converter=" + this.f13462c + '}';
    }

    public C0057bl(@NonNull Hf hf2, @NonNull C0081cj c0081cj, @NonNull InterfaceC0044b8 interfaceC0044b8) {
        this.f13460a = hf2;
        this.f13461b = c0081cj;
        this.f13462c = interfaceC0044b8;
    }
}
