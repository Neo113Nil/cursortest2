package com.appsflyer.internal;

import com.ironsource.C4427z5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/internal/AFd1pSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AFKeystoreWrapper", "Ljava/lang/String;", "AFLogger", "unregisterClient", "registerClient", "d", "w", "e", "v", "force"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum AFd1pSDK {
    TEXT("text/plain"),
    JSON(C4427z5.M),
    OCTET_STREAM("application/octet-stream"),
    XML("application/xml"),
    HTML("text/html"),
    FORM("application/x-www-form-urlencoded"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_PNG("image/png");


    @NotNull
    public final String AFKeystoreWrapper;

    AFd1pSDK(String str) {
        this.AFKeystoreWrapper = str;
    }
}
