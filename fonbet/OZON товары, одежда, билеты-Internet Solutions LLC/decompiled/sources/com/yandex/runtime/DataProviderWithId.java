package com.yandex.runtime;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface DataProviderWithId {
    @NonNull
    byte[] load();

    @NonNull
    String providerId();
}
