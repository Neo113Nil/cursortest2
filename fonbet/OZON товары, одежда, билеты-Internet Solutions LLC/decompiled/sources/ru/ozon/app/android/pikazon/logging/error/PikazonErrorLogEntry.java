package ru.ozon.app.android.pikazon.logging.error;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.ConnectionType;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B{\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b)\u0010\u0019R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/PikazonErrorLogEntry;", "", "", "requestUuid", "contextMessage", "originalUrl", ImagesContract.URL, "", "statusCode", "statusCodeType", "", "vpn", "proxy", "cronet", "Lru/ozon/android/networkinfo/models/ConnectionType;", "connectionType", "protocolVersion", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "exceptionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZZLru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/String;)V", "Ljava/lang/String;", "getRequestUuid", "()Ljava/lang/String;", "getContextMessage", "getOriginalUrl", "getUrl", "I", "getStatusCode", "()I", "getStatusCodeType", "Z", "getVpn", "()Z", "getProxy", "getCronet", "Lru/ozon/android/networkinfo/models/ConnectionType;", "getConnectionType", "()Lru/ozon/android/networkinfo/models/ConnectionType;", "getProtocolVersion", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "getExceptionName", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PikazonErrorLogEntry {

    @NotNull
    private final ConnectionType connectionType;

    @NotNull
    private final String contextMessage;
    private final boolean cronet;
    private final Exception exception;
    private final String exceptionName;

    @NotNull
    private final String originalUrl;

    @NotNull
    private final String protocolVersion;
    private final boolean proxy;

    @NotNull
    private final String requestUuid;
    private final int statusCode;

    @NotNull
    private final String statusCodeType;

    @NotNull
    private final String url;
    private final boolean vpn;

    public PikazonErrorLogEntry(@NotNull String requestUuid, @NotNull String contextMessage, @NotNull String originalUrl, @NotNull String url, int i11, @NotNull String statusCodeType, boolean z11, boolean z12, boolean z13, @NotNull ConnectionType connectionType, @NotNull String protocolVersion, Exception exc, String str) {
        Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        Intrinsics.checkNotNullParameter(contextMessage, "contextMessage");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(statusCodeType, "statusCodeType");
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        this.requestUuid = requestUuid;
        this.contextMessage = contextMessage;
        this.originalUrl = originalUrl;
        this.url = url;
        this.statusCode = i11;
        this.statusCodeType = statusCodeType;
        this.vpn = z11;
        this.proxy = z12;
        this.cronet = z13;
        this.connectionType = connectionType;
        this.protocolVersion = protocolVersion;
        this.exception = exc;
        this.exceptionName = str;
    }

    @NotNull
    public final ConnectionType getConnectionType() {
        return this.connectionType;
    }

    @NotNull
    public final String getContextMessage() {
        return this.contextMessage;
    }

    public final boolean getCronet() {
        return this.cronet;
    }

    public final String getExceptionName() {
        return this.exceptionName;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @NotNull
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    public final boolean getProxy() {
        return this.proxy;
    }

    @NotNull
    public final String getRequestUuid() {
        return this.requestUuid;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final String getStatusCodeType() {
        return this.statusCodeType;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final boolean getVpn() {
        return this.vpn;
    }
}
