package com.braze.storage;

import androidx.datastore.preferences.core.Preferences;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class f0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f702a;
    public final /* synthetic */ DataStoreProvider b;
    public final /* synthetic */ Preferences.Key c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(DataStoreProvider dataStoreProvider, Preferences.Key key, Object obj, Continuation continuation) {
        super(2, continuation);
        this.b = dataStoreProvider;
        this.c = key;
        this.d = obj;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f702a;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            String tag = DataStoreProvider.INSTANCE.getTAG();
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            final Preferences.Key key = this.c;
            BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new Function0() { // from class: com.braze.storage.f0$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f0.a(Preferences.Key.this);
                }
            }, 12, (Object) null);
            e0 e0Var = new e0(this.b.getDataStore().getData(), this.c, this.d);
            this.f702a = 1;
            Object first = FlowKt.first(e0Var, this);
            return first == coroutine_suspended ? coroutine_suspended : first;
        } catch (Exception e) {
            final String str = "Failed to read data for key: " + this.c.getName() + ". Using default value: " + this.d + ".";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.f0$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f0.a(str);
                }
            }, 8, (Object) null);
            this.b.publishException(str, e);
            return this.d;
        }
    }

    public static final String a(Preferences.Key key) {
        return "Reading data for key: " + key.getName() + ".";
    }
}
