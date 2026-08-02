package com.evervault.sdk.core.datahandlers;

import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/evervault/sdk/core/datahandlers/DataHandler;", "", "canEncrypt", "", EventKeys.DATA, "encrypt", "context", "Lcom/evervault/sdk/core/datahandlers/DataHandlerContext;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DataHandler {
    boolean canEncrypt(@NotNull Object data);

    @NotNull
    Object encrypt(@NotNull Object data, @NotNull DataHandlerContext context);
}
