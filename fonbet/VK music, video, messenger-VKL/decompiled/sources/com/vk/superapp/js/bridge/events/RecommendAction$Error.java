package com.vk.superapp.js.bridge.events;

import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.a;
import xsna.epx;
import xsna.fr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: RecommendAction.kt */
/* loaded from: classes6.dex */
public final class RecommendAction$Error implements a {

    @pmi0("data")
    private final Responses$ClientError clientError;

    @pmi0("type")
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendAction$Error() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendAction$Error)) {
            return false;
        }
        RecommendAction$Error recommendAction$Error = (RecommendAction$Error) obj;
        return epx.f(this.type, recommendAction$Error.type) && epx.f(this.clientError, recommendAction$Error.clientError);
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

    public RecommendAction$Error(String str, Responses$ClientError responses$ClientError) {
        this.type = str;
        this.clientError = responses$ClientError;
    }

    public /* synthetic */ RecommendAction$Error(String str, Responses$ClientError responses$ClientError, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppRecommendationFailed" : str, (i & 2) != 0 ? null : responses$ClientError);
    }
}
