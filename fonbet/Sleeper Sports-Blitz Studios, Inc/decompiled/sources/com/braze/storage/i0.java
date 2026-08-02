package com.braze.storage;

import com.braze.enums.DataStoreKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class i0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataStoreKey f716a;

    public i0(DataStoreKey dataStoreKey) {
        this.f716a = dataStoreKey;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to read list from DataStore for key: " + this.f716a.getKey();
    }
}
