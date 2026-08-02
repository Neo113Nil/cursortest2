package com.evervault.sdk.core.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/evervault/sdk/core/exceptions/ExceededMaxFileSizeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "maxFileSizeInMB", "", "(I)V", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExceededMaxFileSizeException extends Exception {
    public ExceededMaxFileSizeException(int i10) {
        super("File size exceeds " + i10 + " MB limit");
    }
}
