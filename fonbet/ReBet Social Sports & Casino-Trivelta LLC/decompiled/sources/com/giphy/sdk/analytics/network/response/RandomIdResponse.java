package com.giphy.sdk.analytics.network.response;

import com.giphy.sdk.analytics.models.RandomId;
import com.giphy.sdk.core.network.response.GenericResponse;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/giphy/sdk/analytics/network/response/RandomIdResponse;", "Lcom/giphy/sdk/core/network/response/GenericResponse;", EventKeys.DATA, "Lcom/giphy/sdk/analytics/models/RandomId;", "(Lcom/giphy/sdk/analytics/models/RandomId;)V", "getData", "()Lcom/giphy/sdk/analytics/models/RandomId;", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RandomIdResponse implements GenericResponse {

    @Nullable
    private final RandomId data;

    /* JADX WARN: Multi-variable type inference failed */
    public RandomIdResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final RandomId getData() {
        return this.data;
    }

    public RandomIdResponse(@Nullable RandomId randomId) {
        this.data = randomId;
    }

    public /* synthetic */ RandomIdResponse(RandomId randomId, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : randomId);
    }
}
