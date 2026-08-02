package com.vk.push.core.filedatastore.migration;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: DataStoreMigration.kt */
@b6l(c = "com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration", f = "DataStoreMigration.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "hasKeysToMigrate")
/* loaded from: classes5.dex */
public final class b extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PreferenceDataStoreByKeyMigration<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PreferenceDataStoreByKeyMigration<Object> preferenceDataStoreByKeyMigration, spj<? super b> spjVar) {
        super(spjVar);
        this.this$0 = preferenceDataStoreByKeyMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        b = this.this$0.b(null, this);
        return b;
    }
}
