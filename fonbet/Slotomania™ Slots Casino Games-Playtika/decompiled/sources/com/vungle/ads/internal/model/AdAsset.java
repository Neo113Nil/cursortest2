package com.vungle.ads.internal.model;

import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdAsset.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001@B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u00108\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010:\u001a\u00020\tH\u0016J\u0006\u0010;\u001a\u00020\u0007J\u0006\u0010<\u001a\u00020=J\b\u0010>\u001a\u00020\u0003H\u0016J\u0006\u0010?\u001a\u00020=R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010 R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u001e\u0010$\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0010\"\u0004\b,\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\fR\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset;", "", "adIdentifier", "", "serverPath", "localPath", "isRequired", "", "percentage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "getAdIdentifier", "()Ljava/lang/String;", "contentLength", "", "getContentLength", "()J", "setContentLength", "(J)V", "fileSize", "getFileSize", "setFileSize", "isDownloaded", "()Z", "isHtmlTemplate", "isMainAssets", "isMainVideo", "isPrivacyIcon", "getLocalPath", "mimeType", "getMimeType", "setMimeType", "(Ljava/lang/String;)V", "getPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "rangeEnd", "getRangeEnd", "()Ljava/lang/Long;", "setRangeEnd", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "rangeStart", "getRangeStart", "setRangeStart", "getServerPath", "status", "Lcom/vungle/ads/internal/model/AdAsset$Status;", "getStatus", "()Lcom/vungle/ads/internal/model/AdAsset$Status;", "setStatus", "(Lcom/vungle/ads/internal/model/AdAsset$Status;)V", "waitLock", "Ljava/lang/Object;", "waitingForDownload", "Ljava/util/concurrent/atomic/AtomicBoolean;", "equals", "other", "hashCode", "isWaitingForDownload", "notifyDownloadEnough", "", "toString", "waitForDownload", "Status", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class AdAsset {
    private final String adIdentifier;
    private long contentLength;
    private long fileSize;
    private final boolean isRequired;
    private final String localPath;
    private String mimeType;
    private final Integer percentage;
    private Long rangeEnd;
    private long rangeStart;
    private final String serverPath;
    private Status status;
    private final Object waitLock;
    private final AtomicBoolean waitingForDownload;

    /* compiled from: AdAsset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset$Status;", "", "(Ljava/lang/String;I)V", "NEW", "DOWNLOAD_RUNNING", "DOWNLOAD_FAILED", "DOWNLOAD_SUCCESS", "PROCESSED", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public AdAsset(String adIdentifier, String serverPath, String localPath, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(serverPath, "serverPath");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.isRequired = z;
        this.percentage = num;
        this.status = Status.NEW;
        this.mimeType = "application/octet-stream";
        this.waitLock = new Object();
        this.waitingForDownload = new AtomicBoolean(false);
    }

    public /* synthetic */ AdAsset(String str, String str2, String str3, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, (i & 16) != 0 ? null : num);
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    /* renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public final Integer getPercentage() {
        return this.percentage;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final void setStatus(Status status) {
        Intrinsics.checkNotNullParameter(status, "<set-?>");
        this.status = status;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final void setMimeType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mimeType = str;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final void setContentLength(long j) {
        this.contentLength = j;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    public final void setRangeStart(long j) {
        this.rangeStart = j;
    }

    public final Long getRangeEnd() {
        return this.rangeEnd;
    }

    public final void setRangeEnd(Long l) {
        this.rangeEnd = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0027, B:7:0x002d, B:16:0x001d, B:4:0x000b), top: B:3:0x000b, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void waitForDownload() {
        Object m11180constructorimpl;
        Throwable m11183exceptionOrNullimpl;
        this.waitingForDownload.set(true);
        synchronized (this.waitLock) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AdAsset adAsset = this;
                this.waitLock.wait();
                m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
            } finally {
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                if (m11183exceptionOrNullimpl != null) {
                }
            }
            m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
            if (m11183exceptionOrNullimpl != null) {
                Logger.INSTANCE.e("AdAsset", "Interrupted while waiting for file download: " + this, m11183exceptionOrNullimpl);
            }
        }
    }

    public final void notifyDownloadEnough() {
        if (this.waitingForDownload.getAndSet(false)) {
            synchronized (this.waitLock) {
                this.waitLock.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean isWaitingForDownload() {
        return this.waitingForDownload.get();
    }

    public final boolean isMainVideo() {
        return Intrinsics.areEqual(this.adIdentifier, "MAIN_VIDEO");
    }

    public final boolean isMainAssets() {
        return Intrinsics.areEqual(this.adIdentifier, NativeAdInternal.TOKEN_MAIN_IMAGE) || Intrinsics.areEqual(this.adIdentifier, "MAIN_VIDEO");
    }

    public final boolean isDownloaded() {
        return this.status == Status.DOWNLOAD_SUCCESS;
    }

    public final boolean isHtmlTemplate() {
        return Intrinsics.areEqual(this.adIdentifier, AdPayload.KEY_VM);
    }

    public final boolean isPrivacyIcon() {
        return Intrinsics.areEqual(this.adIdentifier, "VUNGLE_PRIVACY_ICON_URL");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) other;
        if (this.status == adAsset.status && this.fileSize == adAsset.fileSize && this.isRequired == adAsset.isRequired && Intrinsics.areEqual(this.adIdentifier, adAsset.adIdentifier) && Intrinsics.areEqual(this.serverPath, adAsset.serverPath) && this.contentLength == adAsset.contentLength && Intrinsics.areEqual(this.percentage, adAsset.percentage)) {
            return Intrinsics.areEqual(this.localPath, adAsset.localPath);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((this.adIdentifier.hashCode() * 31) + this.serverPath.hashCode()) * 31) + this.localPath.hashCode()) * 31) + this.status.hashCode()) * 31;
        long j = this.fileSize;
        int hashCode2 = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + Boolean.hashCode(this.isRequired)) * 31;
        long j2 = this.contentLength;
        int i = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Integer num = this.percentage;
        return i + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AdAsset(adIdentifier=" + this.adIdentifier + ", serverPath=" + this.serverPath + ", localPath=" + this.localPath + ", status=" + this.status + ", fileSize=" + this.fileSize + ", contentLength=" + this.contentLength + ", isRequired=" + this.isRequired + ", percentage=" + this.percentage + ')';
    }
}
