package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements BillingInfoStorage {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f11429a;

    /* renamed from: b, reason: collision with root package name */
    public C0000a f11430b;

    public k(@NotNull ProtobufStateStorage<C0000a> protobufStateStorage) {
        this.f11429a = protobufStateStorage;
        this.f11430b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    @NotNull
    public final List<BillingInfo> getBillingInfo() {
        return this.f11430b.f11410a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f11430b.f11411b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(@NotNull List<? extends BillingInfo> list, boolean z5) {
        for (BillingInfo billingInfo : list) {
        }
        C0000a c0000a = new C0000a(list, z5);
        this.f11430b = c0000a;
        this.f11429a.save(c0000a);
    }
}
