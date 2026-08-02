package com.evervault.sdk.core;

import com.evervault.sdk.HttpConfig;
import com.evervault.sdk.core.keys.CageKey;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/evervault/sdk/core/Http;", "", "config", "Lcom/evervault/sdk/HttpConfig;", "teamId", "", "appId", "context", "(Lcom/evervault/sdk/HttpConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "keysLoader", "Lcom/evervault/sdk/core/HttpKeysLoader;", "httpRequest", "Lcom/evervault/sdk/core/HttpRequest;", "(Lcom/evervault/sdk/core/HttpKeysLoader;Lcom/evervault/sdk/core/HttpRequest;)V", "decryptWithToken", "token", EventKeys.DATA, "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadKeys", "Lcom/evervault/sdk/core/keys/CageKey;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Http {

    @NotNull
    private final HttpRequest httpRequest;

    @NotNull
    private final HttpKeysLoader keysLoader;

    public Http(@NotNull HttpKeysLoader keysLoader, @NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(keysLoader, "keysLoader");
        Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
        this.keysLoader = keysLoader;
        this.httpRequest = httpRequest;
    }

    @Nullable
    public final Object decryptWithToken(@NotNull String str, @NotNull Object obj, @NotNull Continuation<Object> continuation) {
        return this.httpRequest.decryptWithToken(str, obj, continuation);
    }

    @Nullable
    public final Object loadKeys(@NotNull Continuation<? super CageKey> continuation) {
        return this.keysLoader.loadKeys(continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Http(@NotNull HttpConfig config, @NotNull String teamId, @NotNull String appId, @NotNull String context) {
        this(new HttpKeysLoader(config.getKeysUrl() + "/" + teamId + "/apps/" + appId + "?context=" + context), new HttpRequest(config));
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(teamId, "teamId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
