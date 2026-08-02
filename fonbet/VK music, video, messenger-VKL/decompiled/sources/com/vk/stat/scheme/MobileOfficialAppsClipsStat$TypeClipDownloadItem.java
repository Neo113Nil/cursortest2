package com.vk.stat.scheme;

import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipDownloadItem {

    @pmi0("download_quality")
    private final DownloadQuality downloadQuality;

    @pmi0("download_state")
    private final DownloadState downloadState;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("video_id")
    private final Long videoId;

    @pmi0("with_remote_transcoding")
    private final boolean withRemoteTranscoding;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class DownloadQuality {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DownloadQuality[] $VALUES;

        @pmi0("1080p")
        public static final DownloadQuality TYPE_1080P;

        @pmi0("480p")
        public static final DownloadQuality TYPE_480P;

        @pmi0("720p")
        public static final DownloadQuality TYPE_720P;

        static {
            DownloadQuality downloadQuality = new DownloadQuality("TYPE_1080P", 0);
            TYPE_1080P = downloadQuality;
            DownloadQuality downloadQuality2 = new DownloadQuality("TYPE_720P", 1);
            TYPE_720P = downloadQuality2;
            DownloadQuality downloadQuality3 = new DownloadQuality("TYPE_480P", 2);
            TYPE_480P = downloadQuality3;
            DownloadQuality[] downloadQualityArr = {downloadQuality, downloadQuality2, downloadQuality3};
            $VALUES = downloadQualityArr;
            $ENTRIES = new asp(downloadQualityArr);
        }

        private DownloadQuality(String str, int i) {
        }

        public static DownloadQuality valueOf(String str) {
            return (DownloadQuality) Enum.valueOf(DownloadQuality.class, str);
        }

        public static DownloadQuality[] values() {
            return (DownloadQuality[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class DownloadState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DownloadState[] $VALUES;

        @pmi0("cancelled")
        public static final DownloadState CANCELLED;

        @pmi0("finished")
        public static final DownloadState FINISHED;

        @pmi0(X3.i.d0)
        public static final DownloadState STARTED;

        static {
            DownloadState downloadState = new DownloadState(SignalingProtocol.STATE_STARTED, 0);
            STARTED = downloadState;
            DownloadState downloadState2 = new DownloadState("FINISHED", 1);
            FINISHED = downloadState2;
            DownloadState downloadState3 = new DownloadState("CANCELLED", 2);
            CANCELLED = downloadState3;
            DownloadState[] downloadStateArr = {downloadState, downloadState2, downloadState3};
            $VALUES = downloadStateArr;
            $ENTRIES = new asp(downloadStateArr);
        }

        private DownloadState(String str, int i) {
        }

        public static DownloadState valueOf(String str) {
            return (DownloadState) Enum.valueOf(DownloadState.class, str);
        }

        public static DownloadState[] values() {
            return (DownloadState[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeClipDownloadItem(DownloadState downloadState, boolean z, DownloadQuality downloadQuality, String str, Long l, Long l2) {
        this.downloadState = downloadState;
        this.withRemoteTranscoding = z;
        this.downloadQuality = downloadQuality;
        this.trackCode = str;
        this.ownerId = l;
        this.videoId = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipDownloadItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipDownloadItem mobileOfficialAppsClipsStat$TypeClipDownloadItem = (MobileOfficialAppsClipsStat$TypeClipDownloadItem) obj;
        return this.downloadState == mobileOfficialAppsClipsStat$TypeClipDownloadItem.downloadState && this.withRemoteTranscoding == mobileOfficialAppsClipsStat$TypeClipDownloadItem.withRemoteTranscoding && this.downloadQuality == mobileOfficialAppsClipsStat$TypeClipDownloadItem.downloadQuality && epx.f(this.trackCode, mobileOfficialAppsClipsStat$TypeClipDownloadItem.trackCode) && epx.f(this.ownerId, mobileOfficialAppsClipsStat$TypeClipDownloadItem.ownerId) && epx.f(this.videoId, mobileOfficialAppsClipsStat$TypeClipDownloadItem.videoId);
    }

    public final int hashCode() {
        int b = qoy.b(this.downloadState.hashCode() * 31, 31, this.withRemoteTranscoding);
        DownloadQuality downloadQuality = this.downloadQuality;
        int hashCode = (b + (downloadQuality == null ? 0 : downloadQuality.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.ownerId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.videoId;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipDownloadItem(downloadState=");
        sb.append(this.downloadState);
        sb.append(", withRemoteTranscoding=");
        sb.append(this.withRemoteTranscoding);
        sb.append(", downloadQuality=");
        sb.append(this.downloadQuality);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", videoId=");
        return iq.b(sb, this.videoId, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipDownloadItem(DownloadState downloadState, boolean z, DownloadQuality downloadQuality, String str, Long l, Long l2, int i, zcl zclVar) {
        this(downloadState, z, (i & 4) != 0 ? null : downloadQuality, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2);
    }
}
