package com.vk.superapp.base.js.bridge;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Responses.kt */
/* loaded from: classes6.dex */
public final class Responses$ReasonUnsupportedPlatform {

    @pmi0("error_code")
    private final int errorCode;

    @pmi0("error_reason")
    private final String errorReason;

    /* JADX WARN: Multi-variable type inference failed */
    public Responses$ReasonUnsupportedPlatform() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Responses$ReasonUnsupportedPlatform)) {
            return false;
        }
        Responses$ReasonUnsupportedPlatform responses$ReasonUnsupportedPlatform = (Responses$ReasonUnsupportedPlatform) obj;
        return this.errorCode == responses$ReasonUnsupportedPlatform.errorCode && epx.f(this.errorReason, responses$ReasonUnsupportedPlatform.errorReason);
    }

    public final int hashCode() {
        return this.errorReason.hashCode() + (Integer.hashCode(this.errorCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReasonUnsupportedPlatform(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorReason=");
        return ho8.a(sb, this.errorReason, ')');
    }

    public Responses$ReasonUnsupportedPlatform(int i, String str) {
        this.errorCode = i;
        this.errorReason = str;
    }

    public /* synthetic */ Responses$ReasonUnsupportedPlatform(int i, String str, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 6 : i, (i2 & 2) != 0 ? "Unsupported platform" : str);
    }
}
