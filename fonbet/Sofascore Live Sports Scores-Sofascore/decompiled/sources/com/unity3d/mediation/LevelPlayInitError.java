package com.unity3d.mediation;

import com.appsflyer.internal.i;
import com.ironsource.C4221ne;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlayInitError {
    private final int a;

    @NotNull
    private final String b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(@NotNull C4221ne c4221ne) {
        this(c4221ne.c(), c4221ne.d());
        c4221ne.getClass();
    }

    public final int getErrorCode() {
        return this.a;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return i.g(this.a, "LevelPlayError(errorCode=", ", errorMessage='", this.b, "')");
    }

    public LevelPlayInitError(int i, @NotNull String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
