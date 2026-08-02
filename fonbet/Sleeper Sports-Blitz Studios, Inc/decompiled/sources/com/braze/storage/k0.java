package com.braze.storage;

import com.braze.enums.DataStoreKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class k0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataStoreKey f723a;

    public k0(DataStoreKey dataStoreKey) {
        this.f723a = dataStoreKey;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Key " + this.f723a.getKey() + " is not a MAP type. Returning empty map.";
    }
}
