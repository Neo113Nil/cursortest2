package com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler;

import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateCustomerSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.socure.idplus.device.internal.api.a f883a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CreateCustomerSession c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.socure.idplus.device.internal.api.a aVar, String str, CreateCustomerSession createCustomerSession) {
        super(0);
        this.f883a = aVar;
        this.b = str;
        this.c = createCustomerSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f883a.a(this.b, this.c);
    }
}
