package ru.ozon.app.android.mediaupload.video.validation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.websockets.OzonWebSocketUrl;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/mediaupload/video/validation/VideoValidationWebSocketUrl;", "Lru/ozon/app/android/network/websockets/OzonWebSocketUrl;", "fileSize", "", "baseWsUrl", "", "headers", "", "<init>", "(JLjava/lang/String;Ljava/util/Map;)V", "getUrl", "getHeaders", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoValidationWebSocketUrl implements OzonWebSocketUrl {

    @NotNull
    private final String baseWsUrl;
    private final long fileSize;
    private final Map<String, String> headers;

    public VideoValidationWebSocketUrl(long j11, @NotNull String baseWsUrl, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(baseWsUrl, "baseWsUrl");
        this.fileSize = j11;
        this.baseWsUrl = baseWsUrl;
        this.headers = map;
    }

    @Override // ru.ozon.app.android.network.websockets.OzonWebSocketUrl
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // ru.ozon.app.android.network.websockets.OzonWebSocketUrl
    @NotNull
    public String getUrl() {
        return this.baseWsUrl + "/validate?size=" + this.fileSize;
    }
}
