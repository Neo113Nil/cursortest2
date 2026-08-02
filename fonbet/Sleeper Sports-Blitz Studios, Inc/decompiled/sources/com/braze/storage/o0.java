package com.braze.storage;

import com.braze.enums.DataStoreKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class o0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataStoreKey f736a;

    public o0(DataStoreKey dataStoreKey) {
        this.f736a = dataStoreKey;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Key " + this.f736a.getKey() + " is not a LIST type. Cannot write key:" + this.f736a.getKey();
    }
}
