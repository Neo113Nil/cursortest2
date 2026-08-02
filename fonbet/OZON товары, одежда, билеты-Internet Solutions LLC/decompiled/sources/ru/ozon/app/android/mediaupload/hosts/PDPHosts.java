package ru.ozon.app.android.mediaupload.hosts;

import U7.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.hosts.CoreHosts;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/mediaupload/hosts/PDPHosts;", "", "hosts", "Lru/ozon/app/android/storage/hosts/CoreHosts;", "<init>", "(Lru/ozon/app/android/storage/hosts/CoreHosts;)V", "webSocketUrl", "", "getWebSocketUrl", "()Ljava/lang/String;", "videoUploadingBaseHttpUrl", "getVideoUploadingBaseHttpUrl", "videoUploadingMetricsBaseHttpUrl", "getVideoUploadingMetricsBaseHttpUrl", "videoUploadingBaseWebSocketUrl", "getVideoUploadingBaseWebSocketUrl", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PDPHosts {

    @NotNull
    private final CoreHosts hosts;

    public PDPHosts(@NotNull CoreHosts hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        this.hosts = hosts;
    }

    @NotNull
    public final String getVideoUploadingBaseHttpUrl() {
        return this.hosts.getVideoUploadingBaseHttpUrl();
    }

    @NotNull
    public final String getVideoUploadingBaseWebSocketUrl() {
        return this.hosts.getVideoUploadingBaseWebSocketUrl();
    }

    @NotNull
    public final String getVideoUploadingMetricsBaseHttpUrl() {
        return this.hosts.getVideoUploadingMetricsBaseHttpUrl();
    }

    @NotNull
    public final String getWebSocketUrl() {
        return d.e(this.hosts.getWebSocketBaseUrl(), "/chat-notification.bx/ws");
    }
}
