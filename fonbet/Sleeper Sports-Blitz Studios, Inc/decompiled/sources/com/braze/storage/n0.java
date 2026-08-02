package com.braze.storage;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class n0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f733a;
    public final /* synthetic */ DataStoreProvider b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Preferences.Key d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(DataStoreProvider dataStoreProvider, Object obj, Preferences.Key key, Continuation continuation) {
        super(2, continuation);
        this.b = dataStoreProvider;
        this.c = obj;
        this.d = key;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f733a;
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
            final Object obj2 = this.c;
            final Preferences.Key key = this.d;
            BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new Function0() { // from class: com.braze.storage.n0$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n0.a(obj2, key);
                }
            }, 12, (Object) null);
            DataStore dataStore = this.b.getDataStore();
            m0 m0Var = new m0(this.d, this.c, null);
            this.f733a = 1;
            Object edit = PreferencesKt.edit(dataStore, m0Var, this);
            return edit == coroutine_suspended ? coroutine_suspended : edit;
        } catch (Exception e) {
            final String str = "Failed to write data:" + this.c + " for key: " + this.d.getName() + ".";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.n0$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n0.a(str);
                }
            }, 8, (Object) null);
            this.b.publishException(str, e);
            return Unit.INSTANCE;
        }
    }

    public static final String a(Object obj, Preferences.Key key) {
        return "Writing data:" + obj + " for key: " + key.getName() + ".";
    }
}
