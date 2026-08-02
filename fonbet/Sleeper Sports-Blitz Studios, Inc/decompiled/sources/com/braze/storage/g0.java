package com.braze.storage;

import androidx.datastore.preferences.core.Preferences;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class g0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f707a;
    public final /* synthetic */ DataStoreProvider b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(DataStoreProvider dataStoreProvider, Continuation continuation) {
        super(2, continuation);
        this.b = dataStoreProvider;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g0(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f707a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.g0$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g0.a();
                    }
                }, 12, (Object) null);
                Flow data = this.b.getDataStore().getData();
                this.f707a = 1;
                obj = FlowKt.first(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((Preferences) obj).asMap();
        } catch (Exception e) {
            final String str = "Failed to read all data from DataStore";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.g0$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g0.a(str);
                }
            }, 8, (Object) null);
            this.b.publishException("Failed to read all data from DataStore", e);
            return MapsKt.emptyMap();
        }
    }

    public static final String a() {
        return "Reading all data from DataStore.";
    }
}
