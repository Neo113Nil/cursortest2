package io.ably.lib.network;

/* loaded from: classes9.dex */
public interface HttpEngine {
    HttpCall call(HttpRequest httpRequest);

    boolean isUsingProxy();
}
