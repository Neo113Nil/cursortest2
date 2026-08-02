package defpackage;

import com.blaze.blazesdk.interactions.models.dto.InteractionAnswerResponse;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aam extends hoi implements Function1 {
    public final /* synthetic */ m0m r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aam(m0m m0mVar, String str, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = m0mVar;
        this.s = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new aam(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new aam(this.r, this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        cim cimVar;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        String str = this.s;
        int i = m0m.e;
        m0m m0mVar = this.r;
        m0mVar.getClass();
        try {
            InteractionAnswerResponse interactionAnswerResponse = (InteractionAnswerResponse) new Gson().fromJson(str, InteractionAnswerResponse.class);
            String userResponse = interactionAnswerResponse.getUserResponse();
            if (userResponse != null && (cimVar = m0mVar.c) != null) {
                cimVar.a(userResponse);
            }
            String str2 = m0mVar.a;
            if (str2 != null) {
                vym vymVar = vym.a;
                String newInitData = interactionAnswerResponse.getNewInitData();
                if (newInitData != null) {
                    vym.b.put(str2, newInitData);
                }
            }
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
        return Unit.a;
    }
}
