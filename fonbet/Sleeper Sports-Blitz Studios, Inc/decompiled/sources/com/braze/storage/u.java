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

/* loaded from: classes6.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f756a;
    public final /* synthetic */ DataStoreProvider b;
    public final /* synthetic */ Preferences.Key c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(DataStoreProvider dataStoreProvider, Preferences.Key key, Continuation continuation) {
        super(2, continuation);
        this.b = dataStoreProvider;
        this.c = key;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f756a;
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
            BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new Function0() { // from class: com.braze.storage.u$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u.a(Preferences.Key.this);
                }
            }, 12, (Object) null);
            DataStore dataStore = this.b.getDataStore();
            t tVar = new t(this.c, null);
            this.f756a = 1;
            Object edit = PreferencesKt.edit(dataStore, tVar, this);
            return edit == coroutine_suspended ? coroutine_suspended : edit;
        } catch (Exception e) {
            final String str = "Failed to clear data for key: " + this.c + ".";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.u$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u.a(str);
                }
            }, 8, (Object) null);
            this.b.publishException(str, e);
            return Unit.INSTANCE;
        }
    }

    public static final String a(Preferences.Key key) {
        return "Clearing all data for key: " + key + ".";
    }
}
