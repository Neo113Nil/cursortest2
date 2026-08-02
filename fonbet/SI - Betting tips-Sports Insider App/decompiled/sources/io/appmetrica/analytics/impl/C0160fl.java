package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160fl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final C0081cj f13751a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0044b8 f13752b;

    public C0160fl(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C0081cj(eCommerceScreen), new C0186gl());
    }

    @NonNull
    public final InterfaceC0044b8 a() {
        return this.f13752b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f13752b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f13751a + ", converter=" + this.f13752b + '}';
    }

    public C0160fl(@NonNull C0081cj c0081cj, @NonNull InterfaceC0044b8 interfaceC0044b8) {
        this.f13751a = c0081cj;
        this.f13752b = interfaceC0044b8;
    }
}
