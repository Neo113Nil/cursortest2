package com.unity3d.mediation;

import com.ironsource.C2602pe;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class LevelPlayInitError {
    private final int a;
    private final String b;

    public LevelPlayInitError(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.a = i;
        this.b = errorMessage;
    }

    public final int getErrorCode() {
        return this.a;
    }

    public final String getErrorMessage() {
        return this.b;
    }

    public String toString() {
        return "LevelPlayError(errorCode=" + this.a + ", errorMessage='" + this.b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(C2602pe sdkError) {
        this(sdkError.c(), sdkError.d());
        Intrinsics.checkNotNullParameter(sdkError, "sdkError");
    }
}
