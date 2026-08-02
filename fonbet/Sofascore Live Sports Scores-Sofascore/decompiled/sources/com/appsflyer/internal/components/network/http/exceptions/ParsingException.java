package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1iSDK;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFd1iSDK<String> AFLogger;

    public ParsingException(String str, Throwable th, @NonNull AFd1iSDK<String> aFd1iSDK) {
        super(str, th);
        this.AFLogger = aFd1iSDK;
    }

    @NonNull
    public AFd1iSDK<String> getRawResponse() {
        return this.AFLogger;
    }
}
