package com.vk.superapp.js.bridge.events;

import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.a;
import xsna.epx;
import xsna.fr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AddToCommunity.kt */
/* loaded from: classes6.dex */
public final class AddToCommunity$Error implements a {

    @pmi0("data")
    private final Responses$ClientError clientError;

    @pmi0("type")
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public AddToCommunity$Error() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCommunity$Error)) {
            return false;
        }
        AddToCommunity$Error addToCommunity$Error = (AddToCommunity$Error) obj;
        return epx.f(this.type, addToCommunity$Error.type) && epx.f(this.clientError, addToCommunity$Error.clientError);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Responses$ClientError responses$ClientError = this.clientError;
        return hashCode + (responses$ClientError != null ? responses$ClientError.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(type=");
        sb.append(this.type);
        sb.append(", clientError=");
        return fr.a(sb, this.clientError, ')');
    }

    public AddToCommunity$Error(String str, Responses$ClientError responses$ClientError) {
        this.type = str;
        this.clientError = responses$ClientError;
    }

    public /* synthetic */ AddToCommunity$Error(String str, Responses$ClientError responses$ClientError, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAddToCommunityFailed" : str, (i & 2) != 0 ? null : responses$ClientError);
    }
}
