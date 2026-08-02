package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AddToFavorites.kt */
/* loaded from: classes6.dex */
public final class AddToFavorites$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AddToFavorites$Parameters(String str) {
        this.requestId = str;
    }

    public static final AddToFavorites$Parameters a(AddToFavorites$Parameters addToFavorites$Parameters) {
        return addToFavorites$Parameters.requestId == null ? new AddToFavorites$Parameters("default_request_id") : addToFavorites$Parameters;
    }

    public static final void b(AddToFavorites$Parameters addToFavorites$Parameters) {
        if (addToFavorites$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddToFavorites$Parameters) && epx.f(this.requestId, ((AddToFavorites$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
