package com.vk.superapp.base.js.bridge;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Responses.kt */
/* loaded from: classes6.dex */
public final class Responses$ReasonCustom {

    @pmi0("error_code")
    private final int errorCode;

    @pmi0("error_reason")
    private final String errorReason;

    public Responses$ReasonCustom(int i, String str) {
        this.errorCode = i;
        this.errorReason = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Responses$ReasonCustom)) {
            return false;
        }
        Responses$ReasonCustom responses$ReasonCustom = (Responses$ReasonCustom) obj;
        return this.errorCode == responses$ReasonCustom.errorCode && epx.f(this.errorReason, responses$ReasonCustom.errorReason);
    }

    public final int hashCode() {
        return this.errorReason.hashCode() + (Integer.hashCode(this.errorCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReasonCustom(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorReason=");
        return ho8.a(sb, this.errorReason, ')');
    }

    public /* synthetic */ Responses$ReasonCustom(int i, String str, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 13 : i, str);
    }
}
