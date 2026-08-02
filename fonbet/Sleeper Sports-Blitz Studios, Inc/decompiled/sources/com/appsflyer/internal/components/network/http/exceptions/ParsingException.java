package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1iSDK;
import java.io.IOException;

/* loaded from: classes6.dex */
public class ParsingException extends IOException {
    private final AFe1iSDK<String> getRevenue;

    public ParsingException(String str, Throwable th, AFe1iSDK<String> aFe1iSDK) {
        super(str, th);
        this.getRevenue = aFe1iSDK;
    }

    public AFe1iSDK<String> getRawResponse() {
        return this.getRevenue;
    }
}
