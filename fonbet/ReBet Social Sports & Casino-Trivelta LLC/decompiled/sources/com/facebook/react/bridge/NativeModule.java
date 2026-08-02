package com.facebook.react.bridge;

import h8.InterfaceC4488a;

@InterfaceC4488a
/* loaded from: classes2.dex */
public interface NativeModule {
    @Deprecated
    default boolean canOverrideExistingModule() {
        return false;
    }

    String getName();

    void initialize();

    void invalidate();

    @Deprecated(forRemoval = true, since = "Use invalidate method instead")
    default void onCatalystInstanceDestroy() {
    }
}
