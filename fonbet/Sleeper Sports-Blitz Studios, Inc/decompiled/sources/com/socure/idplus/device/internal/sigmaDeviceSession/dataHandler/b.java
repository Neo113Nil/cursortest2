package com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler;

import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateSessionWindowRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.socure.idplus.device.internal.api.a f884a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CreateSessionWindowRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.socure.idplus.device.internal.api.a aVar, String str, CreateSessionWindowRequest createSessionWindowRequest) {
        super(0);
        this.f884a = aVar;
        this.b = str;
        this.c = createSessionWindowRequest;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f884a.a(this.b, this.c);
    }
}
