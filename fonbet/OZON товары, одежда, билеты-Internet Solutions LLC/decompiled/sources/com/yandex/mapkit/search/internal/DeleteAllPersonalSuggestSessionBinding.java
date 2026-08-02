package com.yandex.mapkit.search.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.search.DeleteAllPersonalSuggestSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class DeleteAllPersonalSuggestSessionBinding implements DeleteAllPersonalSuggestSession {
    private final NativeObject nativeObject;

    protected DeleteAllPersonalSuggestSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.DeleteAllPersonalSuggestSession
    public native void cancel();

    @Override // com.yandex.mapkit.search.DeleteAllPersonalSuggestSession
    public native void retry(@NonNull DeleteAllPersonalSuggestSession.PersonalSuggestListener personalSuggestListener);
}
