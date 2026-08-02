package com.braze.storage;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKt;
import com.braze.support.BrazeLogger;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f749a;
    public final /* synthetic */ DataStoreProvider b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Set d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(DataStoreProvider dataStoreProvider, Map map, Set set, Continuation continuation) {
        super(2, continuation);
        this.b = dataStoreProvider;
        this.c = map;
        this.d = set;
    }

    public static final String a(String str) {
        return str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f749a;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            DataStore dataStore = this.b.getDataStore();
            r rVar = new r(this.d, this.c, null);
            this.f749a = 1;
            Object edit = PreferencesKt.edit(dataStore, rVar, this);
            return edit == coroutine_suspended ? coroutine_suspended : edit;
        } catch (Exception e) {
            final String str = "Failed to perform batch update with updates:" + this.c + " and removals:" + this.d;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.s$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.a(str);
                }
            }, 8, (Object) null);
            this.b.publishException(str, e);
            return Unit.INSTANCE;
        }
    }
}
