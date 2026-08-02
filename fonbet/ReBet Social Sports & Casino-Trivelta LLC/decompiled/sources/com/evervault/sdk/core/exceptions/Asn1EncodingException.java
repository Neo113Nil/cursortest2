package com.evervault.sdk.core.exceptions;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/evervault/sdk/core/exceptions/Asn1EncodingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Asn1EncodingException extends Exception {

    @NotNull
    public static final Asn1EncodingException INSTANCE = new Asn1EncodingException();

    private Asn1EncodingException() {
        super("ASN1 encoding error");
    }
}
