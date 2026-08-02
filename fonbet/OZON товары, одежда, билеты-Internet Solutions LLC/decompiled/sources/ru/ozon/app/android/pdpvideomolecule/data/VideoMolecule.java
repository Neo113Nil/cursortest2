package ru.ozon.app.android.pdpvideomolecule.data;

import Kk.C3532b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "", "link", "", "format", "Lru/ozon/app/android/pdpvideomolecule/data/VideoFormat;", "portraitRatio", "", "playerState", "Lru/ozon/app/android/pdpvideomolecule/data/PlayerState;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdpvideomolecule/data/VideoFormat;ZLru/ozon/app/android/pdpvideomolecule/data/PlayerState;)V", "getLink", "()Ljava/lang/String;", "getFormat", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoFormat;", "getPortraitRatio", "()Z", "getPlayerState", "()Lru/ozon/app/android/pdpvideomolecule/data/PlayerState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VideoMolecule {

    @NotNull
    private final VideoFormat format;

    @NotNull
    private final String link;

    @NotNull
    private final transient PlayerState playerState;
    private final boolean portraitRatio;

    public VideoMolecule(@NotNull String link, @NotNull VideoFormat format, boolean z11, @NotNull PlayerState playerState) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        this.link = link;
        this.format = format;
        this.portraitRatio = z11;
        this.playerState = playerState;
    }

    public static /* synthetic */ VideoMolecule copy$default(VideoMolecule videoMolecule, String str, VideoFormat videoFormat, boolean z11, PlayerState playerState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = videoMolecule.link;
        }
        if ((i11 & 2) != 0) {
            videoFormat = videoMolecule.format;
        }
        if ((i11 & 4) != 0) {
            z11 = videoMolecule.portraitRatio;
        }
        if ((i11 & 8) != 0) {
            playerState = videoMolecule.playerState;
        }
        return videoMolecule.copy(str, videoFormat, z11, playerState);
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

    /* renamed from: component3, reason: from getter */
    public final boolean getPortraitRatio() {
        return this.portraitRatio;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PlayerState getPlayerState() {
        return this.playerState;
    }

    @NotNull
    public final VideoMolecule copy(@NotNull String link, @NotNull VideoFormat format, boolean portraitRatio, @NotNull PlayerState playerState) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        return new VideoMolecule(link, format, portraitRatio, playerState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoMolecule)) {
            return false;
        }
        VideoMolecule videoMolecule = (VideoMolecule) other;
        return Intrinsics.d(this.link, videoMolecule.link) && this.format == videoMolecule.format && this.portraitRatio == videoMolecule.portraitRatio && Intrinsics.d(this.playerState, videoMolecule.playerState);
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

    public final boolean getPortraitRatio() {
        return this.portraitRatio;
    }

    public int hashCode() {
        return this.playerState.hashCode() + C3532b.a((this.format.hashCode() + (this.link.hashCode() * 31)) * 31, 31, this.portraitRatio);
    }

    @NotNull
    public String toString() {
        return "VideoMolecule(link=" + this.link + ", format=" + this.format + ", portraitRatio=" + this.portraitRatio + ", playerState=" + this.playerState + ")";
    }

    public /* synthetic */ VideoMolecule(String str, VideoFormat videoFormat, boolean z11, PlayerState playerState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? VideoFormat.HLS : videoFormat, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? new PlayerState(0L, null, false, true, 6, null) : playerState);
    }
}
