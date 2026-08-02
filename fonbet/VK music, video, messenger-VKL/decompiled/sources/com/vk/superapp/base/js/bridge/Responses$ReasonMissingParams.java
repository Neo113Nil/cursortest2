package com.vk.superapp.base.js.bridge;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Responses.kt */
/* loaded from: classes6.dex */
public final class Responses$ReasonMissingParams {

    @pmi0("error_code")
    private final int errorCode;

    @pmi0("error_reason")
    private final String errorReason;

    /* JADX WARN: Multi-variable type inference failed */
    public Responses$ReasonMissingParams() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Responses$ReasonMissingParams)) {
            return false;
        }
        Responses$ReasonMissingParams responses$ReasonMissingParams = (Responses$ReasonMissingParams) obj;
        return this.errorCode == responses$ReasonMissingParams.errorCode && epx.f(this.errorReason, responses$ReasonMissingParams.errorReason);
    }

    public final int hashCode() {
        return this.errorReason.hashCode() + (Integer.hashCode(this.errorCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReasonMissingParams(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorReason=");
        return ho8.a(sb, this.errorReason, ')');
    }

    public Responses$ReasonMissingParams(int i, String str) {
        this.errorCode = i;
        this.errorReason = str;
    }

    public /* synthetic */ Responses$ReasonMissingParams(int i, String str, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? "Missing required params" : str);
    }
}
