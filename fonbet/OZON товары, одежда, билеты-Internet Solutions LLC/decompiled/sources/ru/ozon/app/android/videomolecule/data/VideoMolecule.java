package ru.ozon.app.android.videomolecule.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/videomolecule/data/VideoMolecule;", "", "link", "", "format", "Lru/ozon/app/android/videomolecule/data/VideoFormat;", "playerState", "Lru/ozon/app/android/videomolecule/data/PlayerState;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/videomolecule/data/VideoFormat;Lru/ozon/app/android/videomolecule/data/PlayerState;)V", "getLink", "()Ljava/lang/String;", "getFormat", "()Lru/ozon/app/android/videomolecule/data/VideoFormat;", "getPlayerState", "()Lru/ozon/app/android/videomolecule/data/PlayerState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoMolecule {

    @NotNull
    private final VideoFormat format;

    @NotNull
    private final String link;

    @NotNull
    private final transient PlayerState playerState;

    public VideoMolecule(@NotNull String link, @NotNull VideoFormat format, @NotNull PlayerState playerState) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        this.link = link;
        this.format = format;
        this.playerState = playerState;
    }

    public static /* synthetic */ VideoMolecule copy$default(VideoMolecule videoMolecule, String str, VideoFormat videoFormat, PlayerState playerState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = videoMolecule.link;
        }
        if ((i11 & 2) != 0) {
            videoFormat = videoMolecule.format;
        }
        if ((i11 & 4) != 0) {
            playerState = videoMolecule.playerState;
        }
        return videoMolecule.copy(str, videoFormat, playerState);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final VideoFormat getFormat() {
        return this.format;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PlayerState getPlayerState() {
        return this.playerState;
    }

    @NotNull
    public final VideoMolecule copy(@NotNull String link, @NotNull VideoFormat format, @NotNull PlayerState playerState) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        return new VideoMolecule(link, format, playerState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoMolecule)) {
            return false;
        }
        VideoMolecule videoMolecule = (VideoMolecule) other;
        return Intrinsics.d(this.link, videoMolecule.link) && this.format == videoMolecule.format && Intrinsics.d(this.playerState, videoMolecule.playerState);
    }

    @NotNull
    public final VideoFormat getFormat() {
        return this.format;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final PlayerState getPlayerState() {
        return this.playerState;
    }

    public int hashCode() {
        return this.playerState.hashCode() + ((this.format.hashCode() + (this.link.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "VideoMolecule(link=" + this.link + ", format=" + this.format + ", playerState=" + this.playerState + ")";
    }

    public /* synthetic */ VideoMolecule(String str, VideoFormat videoFormat, PlayerState playerState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? VideoFormat.HLS : videoFormat, (i11 & 4) != 0 ? new PlayerState(0L, null, true, 2, null) : playerState);
    }
}
