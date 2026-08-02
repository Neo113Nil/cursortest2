package com.socure.idplus.device.internal.behavior.manager;

import com.socure.idplus.device.internal.behavior.model.SessionDataResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f845a = new a();

    public a() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SessionDataResponse it = (SessionDataResponse) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter("BehaviorSessionManager", "tag");
        Intrinsics.checkNotNullParameter("Uploading behavior data : Success", "msg");
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.f870a;
        return Unit.INSTANCE;
    }
}
