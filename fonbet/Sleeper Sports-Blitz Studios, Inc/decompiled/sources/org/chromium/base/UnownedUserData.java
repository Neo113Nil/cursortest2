package org.chromium.base;

/* loaded from: classes10.dex */
public interface UnownedUserData {
    default boolean informOnDetachmentFromHost() {
        return true;
    }

    default void onDetachedFromHost(UnownedUserDataHost host) {
    }
}
