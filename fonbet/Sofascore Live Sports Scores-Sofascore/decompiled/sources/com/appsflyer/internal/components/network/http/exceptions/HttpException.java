package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1kSDK;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFd1kSDK AFKeystoreWrapper;

    public HttpException(@NonNull Throwable th, @NonNull AFd1kSDK aFd1kSDK) {
        super(th.getMessage(), th);
        this.AFKeystoreWrapper = aFd1kSDK;
    }

    @NonNull
    public AFd1kSDK getMetrics() {
        return this.AFKeystoreWrapper;
    }
}
