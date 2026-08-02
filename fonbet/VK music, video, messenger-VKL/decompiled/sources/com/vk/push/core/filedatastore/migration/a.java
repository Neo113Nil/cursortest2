package com.vk.push.core.filedatastore.migration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: DataStoreMigration.kt */
@b6l(c = "com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration", f = "DataStoreMigration.kt", l = {72}, m = "hasKeys")
/* loaded from: classes5.dex */
public final class a extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PreferenceDataStoreByKeyMigration<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PreferenceDataStoreByKeyMigration<Object> preferenceDataStoreByKeyMigration, spj<? super a> spjVar) {
        super(spjVar);
        this.this$0 = preferenceDataStoreByKeyMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        a = this.this$0.a(null, this);
        return a;
    }
}
