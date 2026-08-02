package com.evervault.sdk.core.format;

import com.evervault.sdk.core.DataType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/evervault/sdk/core/format/EncryptionFormatter;", "", "formatEncryptedData", "", "dataType", "Lcom/evervault/sdk/core/DataType;", "keyIv", "", "encryptedData", "formatFile", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface EncryptionFormatter {
    @NotNull
    String formatEncryptedData(@NotNull DataType dataType, @NotNull byte[] keyIv, @NotNull String encryptedData);

    @NotNull
    byte[] formatFile(@NotNull byte[] keyIv, @NotNull byte[] encryptedData);
}
