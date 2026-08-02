package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseException;
import xsna.exc0;

/* loaded from: classes.dex */
public class FirebaseRemoteConfigException extends FirebaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseRemoteConfigException(@NonNull String str, @Nullable Exception exc) {
        super(str, exc);
        exc0.g(str, "Detail message must not be empty");
    }
}
