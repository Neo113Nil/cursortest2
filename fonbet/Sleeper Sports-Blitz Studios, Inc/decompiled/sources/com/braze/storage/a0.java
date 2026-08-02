package com.braze.storage;

import androidx.datastore.preferences.core.Preferences;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class a0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f686a;
    public final /* synthetic */ DataStoreProvider b;
    public final /* synthetic */ Preferences.Key c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(DataStoreProvider dataStoreProvider, Preferences.Key key, Continuation continuation) {
        super(2, continuation);
        this.b = dataStoreProvider;
        this.c = key;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a0(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f686a;
        boolean z = false;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String tag = DataStoreProvider.INSTANCE.getTAG();
                BrazeLogger.Priority priority = BrazeLogger.Priority.V;
                final Preferences.Key key = this.c;
                BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new Function0() { // from class: com.braze.storage.a0$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a0.a(Preferences.Key.this);
                    }
                }, 12, (Object) null);
                z zVar = new z(this.b.getDataStore().getData(), this.c);
                this.f686a = 1;
                obj = FlowKt.firstOrNull(zVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (obj != null) {
                z = true;
            }
        } catch (Exception e) {
            final String str = "Failed to check if data store contains key: " + this.c.getName() + ". Using default value: false.";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.a0$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a0.a(str);
                }
            }, 8, (Object) null);
            this.b.publishException(str, e);
        }
        return Boxing.boxBoolean(z);
    }

    public static final String a(Preferences.Key key) {
        return "Checking if data store contains data for key: " + key.getName() + ".";
    }
}
