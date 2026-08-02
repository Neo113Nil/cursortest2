package com.yandex.mapkit.search.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.search.SuggestOptions;
import com.yandex.mapkit.search.SuggestSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class SuggestSessionBinding implements SuggestSession {
    private final NativeObject nativeObject;

    protected SuggestSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.SuggestSession
    public native void reset();

    @Override // com.yandex.mapkit.search.SuggestSession
    public native void suggest(@NonNull String str, @NonNull BoundingBox boundingBox, @NonNull SuggestOptions suggestOptions, @NonNull SuggestSession.SuggestListener suggestListener);
}
