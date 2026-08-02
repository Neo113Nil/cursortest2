package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.error.SigmaDeviceError;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateSessionWindowResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f892a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, f fVar, g gVar) {
        super(1);
        this.f892a = jVar;
        this.b = fVar;
        this.c = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CreateSessionWindowResponse createSessionWindowResponse = (CreateSessionWindowResponse) obj;
        Intrinsics.checkNotNullParameter(createSessionWindowResponse, "createSessionWindowResponse");
        String deviceToken = createSessionWindowResponse.getSessionMetadata().getDeviceToken();
        String sessionWindowToken = createSessionWindowResponse.getSessionMetadata().getSessionWindowToken();
        this.f892a.getClass();
        if (deviceToken.length() <= 0 || sessionWindowToken.length() <= 0) {
            this.c.invoke(SigmaDeviceError.DataFetchError, "Unable to create session");
        } else {
            this.f892a.b.a();
            com.socure.idplus.device.internal.sharedPrefs.a aVar = this.f892a.b;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", deviceToken);
            aVar.b.putString("socure_customer_session", jSONObject.toString());
            aVar.b.commit();
            this.b.invoke(createSessionWindowResponse);
        }
        return Unit.INSTANCE;
    }
}
