package ru.ozon.app.android.storefront.widgets.playvideo.data.models;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.videomolecule.data.VideoMolecule;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoDTO;", "", "video", "Lru/ozon/app/android/videomolecule/data/VideoMolecule;", "content", "Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoContent;", "closeTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/videomolecule/data/VideoMolecule;Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoContent;Ljava/util/Map;)V", "getVideo", "()Lru/ozon/app/android/videomolecule/data/VideoMolecule;", "getContent", "()Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoContent;", "getCloseTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlayVideoDTO {
    public static final int $stable = 8;
    private final Map<String, TokenizedTrackingInfo> closeTrackingInfo;

    @NotNull
    private final PlayVideoContent content;

    @NotNull
    private final VideoMolecule video;

    public PlayVideoDTO(@NotNull VideoMolecule video, @NotNull PlayVideoContent content, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(content, "content");
        this.video = video;
        this.content = content;
        this.closeTrackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayVideoDTO copy$default(PlayVideoDTO playVideoDTO, VideoMolecule videoMolecule, PlayVideoContent playVideoContent, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            videoMolecule = playVideoDTO.video;
        }
        if ((i11 & 2) != 0) {
            playVideoContent = playVideoDTO.content;
        }
        if ((i11 & 4) != 0) {
            map = playVideoDTO.closeTrackingInfo;
        }
        return playVideoDTO.copy(videoMolecule, playVideoContent, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final VideoMolecule getVideo() {
        return this.video;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PlayVideoContent getContent() {
        return this.content;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.closeTrackingInfo;
    }

    @NotNull
    public final PlayVideoDTO copy(@NotNull VideoMolecule video, @NotNull PlayVideoContent content, Map<String, TokenizedTrackingInfo> closeTrackingInfo) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(content, "content");
        return new PlayVideoDTO(video, content, closeTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayVideoDTO)) {
            return false;
        }
        PlayVideoDTO playVideoDTO = (PlayVideoDTO) other;
        return Intrinsics.d(this.video, playVideoDTO.video) && Intrinsics.d(this.content, playVideoDTO.content) && Intrinsics.d(this.closeTrackingInfo, playVideoDTO.closeTrackingInfo);
    }

    public final Map<String, TokenizedTrackingInfo> getCloseTrackingInfo() {
        return this.closeTrackingInfo;
    }

    @NotNull
    public final PlayVideoContent getContent() {
        return this.content;
    }

    @NotNull
    public final VideoMolecule getVideo() {
        return this.video;
    }

    public int hashCode() {
        int hashCode = (this.content.hashCode() + (this.video.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.closeTrackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        VideoMolecule videoMolecule = this.video;
        PlayVideoContent playVideoContent = this.content;
        Map<String, TokenizedTrackingInfo> map = this.closeTrackingInfo;
        StringBuilder sb2 = new StringBuilder("PlayVideoDTO(video=");
        sb2.append(videoMolecule);
        sb2.append(", content=");
        sb2.append(playVideoContent);
        sb2.append(", closeTrackingInfo=");
        return P.f(sb2, map, ")");
    }
}
