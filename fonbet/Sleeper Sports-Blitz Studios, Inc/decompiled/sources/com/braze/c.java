package com.braze;

import com.braze.managers.j1;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f470a;
    public final /* synthetic */ Braze b;
    public final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Braze braze, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.b = braze;
        this.c = jSONObject;
    }

    public static final String a() {
        return "Content Cards are disabled. Not deserializing json. Returning null.";
    }

    public static final String b() {
        return "Cannot deserialize null content card json. Returning null.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.b, this.c, continuation);
        cVar.f470a = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f470a;
        if (!((j1) this.b.getUdm$android_sdk_base_release()).o.E()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.c$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.a();
                }
            }, 6, (Object) null);
            return null;
        }
        if (this.c == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.c$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.b();
                }
            }, 6, (Object) null);
            return null;
        }
        com.braze.storage.p pVar = ((j1) this.b.getUdm$android_sdk_base_release()).D;
        JSONObject cardJson = this.c;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(cardJson, "cardJson");
        return com.braze.models.h.a(cardJson, pVar.b, pVar, pVar.j);
    }
}
