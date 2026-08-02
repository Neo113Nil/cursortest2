package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.callback.SessionTokenCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;

/* loaded from: classes8.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SessionTokenCallback f885a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, SessionTokenCallback sessionTokenCallback) {
        super(1);
        this.f885a = sessionTokenCallback;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ResponseBody it = (ResponseBody) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        SessionTokenCallback sessionTokenCallback = this.f885a;
        if (sessionTokenCallback != null) {
            sessionTokenCallback.onComplete(this.b);
        }
        Intrinsics.checkNotNullParameter("SigmaDeviceSessionManager", "tag");
        Intrinsics.checkNotNullParameter("Successfully associated the Customer Session", "msg");
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.f870a;
        return Unit.INSTANCE;
    }
}
