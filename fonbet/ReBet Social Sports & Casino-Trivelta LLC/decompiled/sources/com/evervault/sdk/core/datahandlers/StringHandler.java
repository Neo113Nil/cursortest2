package com.evervault.sdk.core.datahandlers;

import com.evervault.sdk.core.DataType;
import com.evervault.sdk.core.EncryptionService;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/evervault/sdk/core/datahandlers/StringHandler;", "Lcom/evervault/sdk/core/datahandlers/DataHandler;", "encryptionService", "Lcom/evervault/sdk/core/EncryptionService;", "(Lcom/evervault/sdk/core/EncryptionService;)V", "canEncrypt", "", EventKeys.DATA, "", "encrypt", "context", "Lcom/evervault/sdk/core/datahandlers/DataHandlerContext;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StringHandler implements DataHandler {

    @NotNull
    private final EncryptionService encryptionService;

    public StringHandler(@NotNull EncryptionService encryptionService) {
        Intrinsics.checkNotNullParameter(encryptionService, "encryptionService");
        this.encryptionService = encryptionService;
    }

    @Override // com.evervault.sdk.core.datahandlers.DataHandler
    public boolean canEncrypt(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data instanceof String;
    }

    @Override // com.evervault.sdk.core.datahandlers.DataHandler
    @NotNull
    public Object encrypt(@NotNull Object data, @NotNull DataHandlerContext context) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        return this.encryptionService.encryptString((String) data, DataType.STRING);
    }
}
