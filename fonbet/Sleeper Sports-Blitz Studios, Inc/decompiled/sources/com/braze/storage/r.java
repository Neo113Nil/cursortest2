package com.braze.storage;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.storage.DataStoreProvider;
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
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f745a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Set set, Map map, Continuation continuation) {
        super(2, continuation);
        this.b = set;
        this.c = map;
    }

    public static final String a(String str) {
        return "Removing key: " + str + " from DataStore.";
    }

    public static final String b(String str, Object obj) {
        return "Unsupported value type for key '" + str + "': " + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = new r(this.b, this.c, continuation);
        rVar.f745a = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.f745a;
        for (final String str : this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.r$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.a(str);
                }
            }, 12, (Object) null);
            mutablePreferences.remove(PreferencesKeys.stringKey(str));
            mutablePreferences.remove(PreferencesKeys.intKey(str));
            mutablePreferences.remove(PreferencesKeys.longKey(str));
            mutablePreferences.remove(PreferencesKeys.floatKey(str));
            mutablePreferences.remove(PreferencesKeys.doubleKey(str));
            mutablePreferences.remove(PreferencesKeys.booleanKey(str));
        }
        for (Map.Entry entry : this.c.entrySet()) {
            final String str2 = (String) entry.getKey();
            final Object value = entry.getValue();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            DataStoreProvider.Companion companion = DataStoreProvider.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.r$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.a(str2, value);
                }
            }, 12, (Object) null);
            if (value instanceof String) {
                mutablePreferences.set(PreferencesKeys.stringKey(str2), value);
            } else if (value instanceof Integer) {
                mutablePreferences.set(PreferencesKeys.intKey(str2), value);
            } else if (value instanceof Long) {
                mutablePreferences.set(PreferencesKeys.longKey(str2), value);
            } else if (value instanceof Float) {
                mutablePreferences.set(PreferencesKeys.floatKey(str2), value);
            } else if (value instanceof Double) {
                mutablePreferences.set(PreferencesKeys.doubleKey(str2), value);
            } else if (value instanceof Boolean) {
                mutablePreferences.set(PreferencesKeys.booleanKey(str2), value);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, new Function0() { // from class: com.braze.storage.r$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.b(str2, value);
                    }
                }, 12, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final String a(String str, Object obj) {
        return "Adding/updating key: " + str + " with value: " + obj + " in DataStore.";
    }
}
