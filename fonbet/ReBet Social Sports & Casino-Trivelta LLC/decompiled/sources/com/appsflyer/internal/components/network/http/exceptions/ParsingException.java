package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1wSDK;
import java.io.IOException;

/* loaded from: classes.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1wSDK<String> getCurrencyIso4217Code;

    public ParsingException(String str, Throwable th2, @NonNull AFe1wSDK<String> aFe1wSDK) {
        super(str, th2);
        this.getCurrencyIso4217Code = aFe1wSDK;
    }

    @NonNull
    public AFe1wSDK<String> getRawResponse() {
        return this.getCurrencyIso4217Code;
    }
}
