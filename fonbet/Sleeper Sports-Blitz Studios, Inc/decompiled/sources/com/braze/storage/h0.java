package com.braze.storage;

import com.braze.enums.DataStoreKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class h0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataStoreKey f711a;

    public h0(DataStoreKey dataStoreKey) {
        this.f711a = dataStoreKey;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Key " + this.f711a.getKey() + " is not a LIST type. Returning empty list.";
    }
}
