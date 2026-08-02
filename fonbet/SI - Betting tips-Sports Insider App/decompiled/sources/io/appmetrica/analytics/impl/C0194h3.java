package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194h3 extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f13867d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13868e = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f13869a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final C0271k3 f13870b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0044b8 f13871c;

    public C0194h3(int i5, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i5, new C0271k3(eCommerceCartItem), new C0220i3());
    }

    @NonNull
    public final InterfaceC0044b8 a() {
        return this.f13871c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i5 = this.f13869a;
        return i5 != 4 ? i5 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f13871c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f13869a + ", cartItem=" + this.f13870b + ", converter=" + this.f13871c + '}';
    }

    public C0194h3(int i5, @NonNull C0271k3 c0271k3, @NonNull InterfaceC0044b8 interfaceC0044b8) {
        this.f13869a = i5;
        this.f13870b = c0271k3;
        this.f13871c = interfaceC0044b8;
    }
}
