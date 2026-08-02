package com.vk.superapp.js.bridge.events;

import com.vk.superapp.base.js.bridge.Responses$AuthError;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.a;
import xsna.epx;
import xsna.fr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetAuthToken.kt */
/* loaded from: classes6.dex */
public final class GetAuthToken$Error implements a {

    @pmi0("auth_error")
    private final Responses$AuthError authError;

    @pmi0("client_error")
    private final Responses$ClientError clientError;

    @pmi0("type")
    private final String type;

    public GetAuthToken$Error() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthToken$Error)) {
            return false;
        }
        GetAuthToken$Error getAuthToken$Error = (GetAuthToken$Error) obj;
        return epx.f(this.type, getAuthToken$Error.type) && epx.f(this.authError, getAuthToken$Error.authError) && epx.f(this.clientError, getAuthToken$Error.clientError);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Responses$AuthError responses$AuthError = this.authError;
        int hashCode2 = (hashCode + (responses$AuthError == null ? 0 : responses$AuthError.hashCode())) * 31;
        Responses$ClientError responses$ClientError = this.clientError;
        return hashCode2 + (responses$ClientError != null ? responses$ClientError.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(type=");
        sb.append(this.type);
        sb.append(", authError=");
        sb.append(this.authError);
        sb.append(", clientError=");
        return fr.a(sb, this.clientError, ')');
    }

    public GetAuthToken$Error(String str, Responses$AuthError responses$AuthError, Responses$ClientError responses$ClientError) {
        this.type = str;
        this.authError = responses$AuthError;
        this.clientError = responses$ClientError;
    }

    public /* synthetic */ GetAuthToken$Error(String str, Responses$AuthError responses$AuthError, Responses$ClientError responses$ClientError, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAccessTokenFailed" : str, (i & 2) != 0 ? null : responses$AuthError, (i & 4) != 0 ? null : responses$ClientError);
    }
}
