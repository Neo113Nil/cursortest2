package com.vk.superapp.base.js.bridge;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Responses.kt */
/* loaded from: classes6.dex */
public final class Responses$ReasonNeedUserPermission {

    @pmi0("error_code")
    private final int errorCode;

    @pmi0("error_reason")
    private final String errorReason;

    /* JADX WARN: Multi-variable type inference failed */
    public Responses$ReasonNeedUserPermission() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Responses$ReasonNeedUserPermission)) {
            return false;
        }
        Responses$ReasonNeedUserPermission responses$ReasonNeedUserPermission = (Responses$ReasonNeedUserPermission) obj;
        return this.errorCode == responses$ReasonNeedUserPermission.errorCode && epx.f(this.errorReason, responses$ReasonNeedUserPermission.errorReason);
    }

    public final int hashCode() {
        return this.errorReason.hashCode() + (Integer.hashCode(this.errorCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReasonNeedUserPermission(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorReason=");
        return ho8.a(sb, this.errorReason, ')');
    }

    public Responses$ReasonNeedUserPermission(int i, String str) {
        this.errorCode = i;
        this.errorReason = str;
    }

    public /* synthetic */ Responses$ReasonNeedUserPermission(int i, String str, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 8 : i, (i2 & 2) != 0 ? "Need user permission" : str);
    }
}
