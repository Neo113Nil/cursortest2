package com.vk.superapp.auth.js.bridge.api.events;

import com.vk.superapp.base.js.bridge.a;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VerifyUserServicesInfo.kt */
/* loaded from: classes6.dex */
public final class VerifyUserServicesInfo$Error implements a {

    @pmi0("type")
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public VerifyUserServicesInfo$Error() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifyUserServicesInfo$Error) && epx.f(this.type, ((VerifyUserServicesInfo$Error) obj).type);
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Error(type="), this.type, ')');
    }

    public VerifyUserServicesInfo$Error(String str) {
        this.type = str;
    }

    public /* synthetic */ VerifyUserServicesInfo$Error(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppVerifyUserServicesInfoFailed" : str);
    }
}
