package com.yandex.mapkit.annotations;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface Speaker {
    double duration(@NonNull LocalizedPhrase localizedPhrase);

    void reset();

    void say(@NonNull LocalizedPhrase localizedPhrase);
}
