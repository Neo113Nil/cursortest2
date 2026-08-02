package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFd1cSDK;
import java.io.IOException;

/* loaded from: classes8.dex */
public class ParsingException extends IOException {
    private final AFd1cSDK<String> AFAdRevenueData;

    public ParsingException(String str, Throwable th, AFd1cSDK<String> aFd1cSDK) {
        super(str, th);
        this.AFAdRevenueData = aFd1cSDK;
    }

    public AFd1cSDK<String> getRawResponse() {
        return this.AFAdRevenueData;
    }
}
