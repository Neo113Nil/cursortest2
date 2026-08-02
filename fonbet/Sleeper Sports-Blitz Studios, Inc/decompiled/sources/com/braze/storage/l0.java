package com.braze.storage;

import com.braze.enums.DataStoreKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class l0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataStoreKey f726a;

    public l0(DataStoreKey dataStoreKey) {
        this.f726a = dataStoreKey;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to read map from DataStore for key: " + this.f726a.getKey();
    }
}
