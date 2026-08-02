package com.evervault.sdk.core;

import com.evervault.sdk.EncryptionConfig;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/evervault/sdk/core/DataCipher;", "", "encrypt", "Lcom/evervault/sdk/core/EncryptedData;", EventKeys.DATA, "", "Factory", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DataCipher {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/evervault/sdk/core/DataCipher$Factory;", "", "createCipher", "Lcom/evervault/sdk/core/DataCipher;", "ecdhTeamKey", "", "derivedSecret", "config", "Lcom/evervault/sdk/EncryptionConfig;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        @NotNull
        DataCipher createCipher(@NotNull byte[] ecdhTeamKey, @NotNull byte[] derivedSecret, @NotNull EncryptionConfig config);
    }

    @NotNull
    EncryptedData encrypt(@NotNull byte[] data);
}
