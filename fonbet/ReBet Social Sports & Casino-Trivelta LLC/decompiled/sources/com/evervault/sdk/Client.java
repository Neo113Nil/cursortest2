package com.evervault.sdk;

import com.evervault.sdk.core.CryptoLoader;
import com.evervault.sdk.core.EncryptionService;
import com.evervault.sdk.core.Http;
import com.evervault.sdk.core.datahandlers.DataHandlers;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ!\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/evervault/sdk/Client;", "", "config", "Lcom/evervault/sdk/Config;", "http", "Lcom/evervault/sdk/core/Http;", "debugMode", "", "(Lcom/evervault/sdk/Config;Lcom/evervault/sdk/core/Http;Ljava/lang/Boolean;)V", "cryptoLoader", "Lcom/evervault/sdk/core/CryptoLoader;", "Ljava/lang/Boolean;", "decryptWithToken", "token", "", EventKeys.DATA, "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "encrypt", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Client {

    @NotNull
    private final Config config;

    @NotNull
    private final CryptoLoader cryptoLoader;

    @Nullable
    private final Boolean debugMode;

    @NotNull
    private final Http http;

    public Client(@NotNull Config config, @NotNull Http http, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(http, "http");
        this.config = config;
        this.http = http;
        this.debugMode = bool;
        EvervaultFactory evervaultFactory = EvervaultFactory.INSTANCE;
        this.cryptoLoader = new CryptoLoader(config, http, evervaultFactory.createSharedSecretDeriver(), evervaultFactory.createDataCipherFactory(), bool);
    }

    @Nullable
    public final Object decryptWithToken(@NotNull String str, @NotNull Object obj, @NotNull Continuation<Object> continuation) {
        return this.http.decryptWithToken(str, obj, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object encrypt(@NotNull Object obj, @NotNull Continuation<Object> continuation) {
        Client$encrypt$1 client$encrypt$1;
        int i10;
        if (continuation instanceof Client$encrypt$1) {
            client$encrypt$1 = (Client$encrypt$1) continuation;
            int i11 = client$encrypt$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                client$encrypt$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = client$encrypt$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = client$encrypt$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    CryptoLoader cryptoLoader = this.cryptoLoader;
                    client$encrypt$1.L$0 = obj;
                    client$encrypt$1.label = 1;
                    obj2 = cryptoLoader.loadCipher(client$encrypt$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = client$encrypt$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                }
                return new DataHandlers((EncryptionService) obj2).encrypt(obj);
            }
        }
        client$encrypt$1 = new Client$encrypt$1(this, continuation);
        Object obj22 = client$encrypt$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = client$encrypt$1.label;
        if (i10 != 0) {
        }
        return new DataHandlers((EncryptionService) obj22).encrypt(obj);
    }
}
