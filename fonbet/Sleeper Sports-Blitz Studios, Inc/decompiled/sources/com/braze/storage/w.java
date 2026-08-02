package com.braze.storage;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKt;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class w extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f762a;
    public final /* synthetic */ DataStoreProvider b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(DataStoreProvider dataStoreProvider, Continuation continuation) {
        super(2, continuation);
        this.b = dataStoreProvider;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f762a;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.w$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.a();
                }
            }, 12, (Object) null);
            DataStore dataStore = this.b.getDataStore();
            v vVar = new v(null);
            this.f762a = 1;
            Object edit = PreferencesKt.edit(dataStore, vVar, this);
            return edit == coroutine_suspended ? coroutine_suspended : edit;
        } catch (Exception e) {
            final String str = "Failed to clear all data in file.";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.w$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.a(str);
                }
            }, 8, (Object) null);
            this.b.publishException("Failed to clear all data in file.", e);
            return Unit.INSTANCE;
        }
    }

    public static final String a() {
        return "Clearing all data in file.";
    }
}
