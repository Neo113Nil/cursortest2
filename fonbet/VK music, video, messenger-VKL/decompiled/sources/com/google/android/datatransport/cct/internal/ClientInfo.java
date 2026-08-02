package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import xsna.g52;

/* loaded from: classes.dex */
public abstract class ClientInfo {

    /* loaded from: classes12.dex */
    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes12.dex */
    public static abstract class a {
    }

    @Nullable
    public abstract g52 a();

    @Nullable
    public abstract ClientType b();
}
