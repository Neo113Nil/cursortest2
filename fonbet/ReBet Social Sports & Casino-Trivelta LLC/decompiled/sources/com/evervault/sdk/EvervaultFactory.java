package com.evervault.sdk;

import com.evervault.sdk.core.DataCipher;
import com.evervault.sdk.core.JvmDataCipher;
import com.evervault.sdk.core.keys.JvmSharedSecretDeriver;
import com.evervault.sdk.core.keys.SharedSecretDeriver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/evervault/sdk/EvervaultFactory;", "", "()V", "createDataCipherFactory", "Lcom/evervault/sdk/core/DataCipher$Factory;", "createSharedSecretDeriver", "Lcom/evervault/sdk/core/keys/SharedSecretDeriver;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EvervaultFactory {

    @NotNull
    public static final EvervaultFactory INSTANCE = new EvervaultFactory();

    private EvervaultFactory() {
    }

    @NotNull
    public final DataCipher.Factory createDataCipherFactory() {
        return JvmDataCipher.INSTANCE;
    }

    @NotNull
    public final SharedSecretDeriver createSharedSecretDeriver() {
        return new JvmSharedSecretDeriver();
    }
}
