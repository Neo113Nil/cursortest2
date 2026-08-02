package com.braze.models.inappmessage;

import com.braze.managers.m0;
import com.braze.managers.r;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f632a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ m0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, m0 m0Var, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = m0Var;
    }

    public static final String a() {
        return "Logging click on in-app message";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.b, this.c, this.d, continuation);
        bVar.f632a = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f632a;
        String str = this.b;
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.models.inappmessage.b$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a();
                }
            }, 6, (Object) null);
            com.braze.models.k k = com.braze.models.outgoing.event.b.g.k(this.c);
            if (k != null) {
                ((r) this.d).a(k);
            }
        } else {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            final String str2 = this.b;
            BrazeLogger.brazelog$default(brazeLogger, (Object) coroutineScope, priority, (Throwable) null, false, new Function0() { // from class: com.braze.models.inappmessage.b$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a(str2);
                }
            }, 6, (Object) null);
            com.braze.models.k i = com.braze.models.outgoing.event.b.g.i(this.c, this.b);
            if (i != null) {
                ((r) this.d).a(i);
            }
        }
        return Unit.INSTANCE;
    }

    public static final String a(String str) {
        return "Logging click on in-app message with button id: " + str;
    }
}
