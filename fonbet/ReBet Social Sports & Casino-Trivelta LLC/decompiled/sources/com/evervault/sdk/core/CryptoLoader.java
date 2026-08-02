package com.evervault.sdk.core;

import Ph.Q;
import Ph.X;
import com.evervault.sdk.Config;
import com.evervault.sdk.core.DataCipher;
import com.evervault.sdk.core.format.R1StdEncryptionFormatter;
import com.evervault.sdk.core.keys.CageKey;
import com.evervault.sdk.core.keys.GeneratedSharedKey;
import com.evervault.sdk.core.keys.SharedSecretDeriver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/evervault/sdk/core/CryptoLoader;", "", "Lcom/evervault/sdk/Config;", "config", "Lcom/evervault/sdk/core/Http;", "http", "Lcom/evervault/sdk/core/keys/SharedSecretDeriver;", "sharedSecretDeriver", "Lcom/evervault/sdk/core/DataCipher$Factory;", "dataCipherFactory", "", "isInDebugMode", "<init>", "(Lcom/evervault/sdk/Config;Lcom/evervault/sdk/core/Http;Lcom/evervault/sdk/core/keys/SharedSecretDeriver;Lcom/evervault/sdk/core/DataCipher$Factory;Ljava/lang/Boolean;)V", "Lcom/evervault/sdk/core/Crypto;", "fetchKeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/evervault/sdk/core/EncryptionService;", "loadCipher", "Lcom/evervault/sdk/Config;", "Lcom/evervault/sdk/core/Http;", "Lcom/evervault/sdk/core/keys/SharedSecretDeriver;", "Lcom/evervault/sdk/core/DataCipher$Factory;", "Ljava/lang/Boolean;", "LPh/X;", "activeTask", "LPh/X;", "cachedKey", "Lcom/evervault/sdk/core/Crypto;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptoLoader {

    @Nullable
    private X activeTask;

    @Nullable
    private Crypto cachedKey;

    @NotNull
    private final Config config;

    @NotNull
    private final DataCipher.Factory dataCipherFactory;

    @NotNull
    private final Http http;

    @Nullable
    private final Boolean isInDebugMode;

    @NotNull
    private final SharedSecretDeriver sharedSecretDeriver;

    public CryptoLoader(@NotNull Config config, @NotNull Http http, @NotNull SharedSecretDeriver sharedSecretDeriver, @NotNull DataCipher.Factory dataCipherFactory, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(sharedSecretDeriver, "sharedSecretDeriver");
        Intrinsics.checkNotNullParameter(dataCipherFactory, "dataCipherFactory");
        this.config = config;
        this.http = http;
        this.sharedSecretDeriver = sharedSecretDeriver;
        this.dataCipherFactory = dataCipherFactory;
        this.isInDebugMode = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchKeys(Continuation<? super Crypto> continuation) {
        CryptoLoader$fetchKeys$1 cryptoLoader$fetchKeys$1;
        int i10;
        CryptoLoader cryptoLoader;
        CageKey debugKey;
        CryptoLoader cryptoLoader2;
        if (continuation instanceof CryptoLoader$fetchKeys$1) {
            cryptoLoader$fetchKeys$1 = (CryptoLoader$fetchKeys$1) continuation;
            int i11 = cryptoLoader$fetchKeys$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cryptoLoader$fetchKeys$1.label = i11 - Integer.MIN_VALUE;
                Object obj = cryptoLoader$fetchKeys$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cryptoLoader$fetchKeys$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String publicKey = this.config.getEncryption().getPublicKey();
                    if (publicKey != null) {
                        debugKey = new CageKey(publicKey, false, 2, null);
                    } else if (Intrinsics.areEqual(this.isInDebugMode, Boxing.boxBoolean(true))) {
                        debugKey = this.config.getDebugKey();
                    } else {
                        Http http = this.http;
                        cryptoLoader$fetchKeys$1.L$0 = this;
                        cryptoLoader$fetchKeys$1.label = 1;
                        obj = http.loadKeys(cryptoLoader$fetchKeys$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        cryptoLoader = this;
                    }
                    cryptoLoader2 = this;
                    GeneratedSharedKey deriveSharedSecret = cryptoLoader2.sharedSecretDeriver.deriveSharedSecret(debugKey);
                    byte[] decode$default = Base64.decode$default(Base64.INSTANCE, debugKey.getEcdhP256Key(), 0, 0, 6, (Object) null);
                    byte[] sharedKey = deriveSharedSecret.getSharedKey();
                    byte[] generatedEcdhKey = deriveSharedSecret.getGeneratedEcdhKey();
                    Boolean bool = cryptoLoader2.isInDebugMode;
                    return new Crypto(new R1StdEncryptionFormatter(cryptoLoader2.config.getEncryption().getEvVersion(), generatedEcdhKey, bool != null ? bool.booleanValue() : debugKey.isDebugMode()), cryptoLoader2.dataCipherFactory.createCipher(decode$default, sharedKey, cryptoLoader2.config.getEncryption()), cryptoLoader2.config.getEncryption());
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cryptoLoader = (CryptoLoader) cryptoLoader$fetchKeys$1.L$0;
                ResultKt.throwOnFailure(obj);
                CryptoLoader cryptoLoader3 = cryptoLoader;
                debugKey = (CageKey) obj;
                cryptoLoader2 = cryptoLoader3;
                GeneratedSharedKey deriveSharedSecret2 = cryptoLoader2.sharedSecretDeriver.deriveSharedSecret(debugKey);
                byte[] decode$default2 = Base64.decode$default(Base64.INSTANCE, debugKey.getEcdhP256Key(), 0, 0, 6, (Object) null);
                byte[] sharedKey2 = deriveSharedSecret2.getSharedKey();
                byte[] generatedEcdhKey2 = deriveSharedSecret2.getGeneratedEcdhKey();
                Boolean bool2 = cryptoLoader2.isInDebugMode;
                return new Crypto(new R1StdEncryptionFormatter(cryptoLoader2.config.getEncryption().getEvVersion(), generatedEcdhKey2, bool2 != null ? bool2.booleanValue() : debugKey.isDebugMode()), cryptoLoader2.dataCipherFactory.createCipher(decode$default2, sharedKey2, cryptoLoader2.config.getEncryption()), cryptoLoader2.config.getEncryption());
            }
        }
        cryptoLoader$fetchKeys$1 = new CryptoLoader$fetchKeys$1(this, continuation);
        Object obj2 = cryptoLoader$fetchKeys$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cryptoLoader$fetchKeys$1.label;
        if (i10 != 0) {
        }
        CryptoLoader cryptoLoader32 = cryptoLoader;
        debugKey = (CageKey) obj2;
        cryptoLoader2 = cryptoLoader32;
        GeneratedSharedKey deriveSharedSecret22 = cryptoLoader2.sharedSecretDeriver.deriveSharedSecret(debugKey);
        byte[] decode$default22 = Base64.decode$default(Base64.INSTANCE, debugKey.getEcdhP256Key(), 0, 0, 6, (Object) null);
        byte[] sharedKey22 = deriveSharedSecret22.getSharedKey();
        byte[] generatedEcdhKey22 = deriveSharedSecret22.getGeneratedEcdhKey();
        Boolean bool22 = cryptoLoader2.isInDebugMode;
        return new Crypto(new R1StdEncryptionFormatter(cryptoLoader2.config.getEncryption().getEvVersion(), generatedEcdhKey22, bool22 != null ? bool22.booleanValue() : debugKey.isDebugMode()), cryptoLoader2.dataCipherFactory.createCipher(decode$default22, sharedKey22, cryptoLoader2.config.getEncryption()), cryptoLoader2.config.getEncryption());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadCipher(@NotNull Continuation<? super EncryptionService> continuation) {
        CryptoLoader$loadCipher$1 cryptoLoader$loadCipher$1;
        int i10;
        CryptoLoader cryptoLoader;
        if (continuation instanceof CryptoLoader$loadCipher$1) {
            cryptoLoader$loadCipher$1 = (CryptoLoader$loadCipher$1) continuation;
            int i11 = cryptoLoader$loadCipher$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cryptoLoader$loadCipher$1.label = i11 - Integer.MIN_VALUE;
                Object obj = cryptoLoader$loadCipher$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cryptoLoader$loadCipher$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    X x10 = this.activeTask;
                    if (x10 != null) {
                        cryptoLoader$loadCipher$1.label = 1;
                        Object await = x10.await(cryptoLoader$loadCipher$1);
                        if (await != coroutine_suspended) {
                            return await;
                        }
                    } else {
                        CryptoLoader$loadCipher$task$1 cryptoLoader$loadCipher$task$1 = new CryptoLoader$loadCipher$task$1(this, null);
                        cryptoLoader$loadCipher$1.L$0 = this;
                        cryptoLoader$loadCipher$1.label = 2;
                        obj = Q.g(cryptoLoader$loadCipher$task$1, cryptoLoader$loadCipher$1);
                        if (obj != coroutine_suspended) {
                            cryptoLoader = this;
                        }
                    }
                }
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                cryptoLoader = (CryptoLoader) cryptoLoader$loadCipher$1.L$0;
                ResultKt.throwOnFailure(obj);
                X x11 = (X) obj;
                cryptoLoader.activeTask = x11;
                cryptoLoader$loadCipher$1.L$0 = null;
                cryptoLoader$loadCipher$1.label = 3;
                Object await2 = x11.await(cryptoLoader$loadCipher$1);
                return await2 != coroutine_suspended ? coroutine_suspended : await2;
            }
        }
        cryptoLoader$loadCipher$1 = new CryptoLoader$loadCipher$1(this, continuation);
        Object obj2 = cryptoLoader$loadCipher$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cryptoLoader$loadCipher$1.label;
        if (i10 != 0) {
        }
        X x112 = (X) obj2;
        cryptoLoader.activeTask = x112;
        cryptoLoader$loadCipher$1.L$0 = null;
        cryptoLoader$loadCipher$1.label = 3;
        Object await22 = x112.await(cryptoLoader$loadCipher$1);
        if (await22 != coroutine_suspended2) {
        }
    }
}
