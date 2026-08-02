package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1hSDK;
import java.io.IOException;

/* loaded from: classes8.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1hSDK<String> AFInAppEventType;

    public ParsingException(String str, Throwable th2, @NonNull AFe1hSDK<String> aFe1hSDK) {
        super(str, th2);
        this.AFInAppEventType = aFe1hSDK;
    }

    @NonNull
    public AFe1hSDK<String> getRawResponse() {
        return this.AFInAppEventType;
    }
}
