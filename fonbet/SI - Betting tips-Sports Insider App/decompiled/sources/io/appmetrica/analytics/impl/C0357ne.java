package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357ne extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f14349d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14350e = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f14351a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final C0407pe f14352b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0044b8 f14353c;

    public C0357ne(int i5, @NonNull ECommerceOrder eCommerceOrder) {
        this(i5, new C0407pe(eCommerceOrder), new C0382oe());
    }

    @NonNull
    public final InterfaceC0044b8 a() {
        return this.f14353c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f14353c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f14351a + ", order=" + this.f14352b + ", converter=" + this.f14353c + '}';
    }

    public C0357ne(int i5, @NonNull C0407pe c0407pe, @NonNull InterfaceC0044b8 interfaceC0044b8) {
        this.f14351a = i5;
        this.f14352b = c0407pe;
        this.f14353c = interfaceC0044b8;
    }
}
