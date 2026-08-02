package com.evervault.sdk;

import com.evervault.sdk.EvervaultException;
import com.evervault.sdk.core.Http;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\bJ\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006J!\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/evervault/sdk/Evervault;", "", "teamId", "", "appId", "customConfig", "Lcom/evervault/sdk/CustomConfig;", "(Ljava/lang/String;Ljava/lang/String;Lcom/evervault/sdk/CustomConfig;)V", "()V", "client", "Lcom/evervault/sdk/Client;", "configure", "", "decrypt", "token", EventKeys.DATA, "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "encrypt", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Evervault {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Evervault shared = new Evervault();

    @Nullable
    private Client client;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/evervault/sdk/Evervault$Companion;", "", "()V", "shared", "Lcom/evervault/sdk/Evervault;", "getShared", "()Lcom/evervault/sdk/Evervault;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Evervault getShared() {
            return Evervault.shared;
        }

        private Companion() {
        }
    }

    private Evervault() {
    }

    public static /* synthetic */ void configure$default(Evervault evervault, String str, String str2, CustomConfig customConfig, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            customConfig = null;
        }
        evervault.configure(str, str2, customConfig);
    }

    public final void configure(@NotNull String teamId, @NotNull String appId, @Nullable CustomConfig customConfig) {
        ConfigUrls configUrls;
        Http http;
        Intrinsics.checkNotNullParameter(teamId, "teamId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        if (customConfig == null || (configUrls = customConfig.getUrls()) == null) {
            configUrls = new ConfigUrls(null, null, 3, null);
        }
        Config config = new Config(teamId, appId, configUrls, customConfig != null ? customConfig.getPublicKey() : null);
        http = EvervaultKt.getHttp(config);
        this.client = new Client(config, http, customConfig != null ? customConfig.isDebugMode() : null);
    }

    @Nullable
    public final Object decrypt(@NotNull String str, @NotNull Object obj, @NotNull Continuation<Object> continuation) {
        Client client = this.client;
        if (client != null) {
            return client.decryptWithToken(str, obj, continuation);
        }
        throw EvervaultException.InitializationError.INSTANCE;
    }

    @Nullable
    public final Object encrypt(@NotNull Object obj, @NotNull Continuation<Object> continuation) {
        Client client = this.client;
        if (client != null) {
            return client.encrypt(obj, continuation);
        }
        throw EvervaultException.InitializationError.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Evervault(@NotNull String teamId, @NotNull String appId, @Nullable CustomConfig customConfig) {
        this();
        Intrinsics.checkNotNullParameter(teamId, "teamId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        configure(teamId, appId, customConfig);
    }

    public /* synthetic */ Evervault(String str, String str2, CustomConfig customConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : customConfig);
    }
}
