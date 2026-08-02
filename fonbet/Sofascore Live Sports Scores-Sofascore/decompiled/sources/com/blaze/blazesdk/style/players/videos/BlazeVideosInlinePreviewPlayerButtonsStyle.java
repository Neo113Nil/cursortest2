package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010!R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010!¨\u0006&"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerButtonsStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "replay", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;", "component2", "copy", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;)Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerButtonsStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;", "getMute", "setMute", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;)V", "getReplay", "setReplay", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosInlinePreviewPlayerButtonsStyle implements BlazeParcelable {

    @NotNull
    private BlazeVideosPlayerButtonStyle mute;

    @NotNull
    private BlazeVideosPlayerButtonStyle replay;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosInlinePreviewPlayerButtonsStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.videos.BlazeVideosInlinePreviewPlayerButtonsStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeVideosPlayerButtonStyle> creator = BlazeVideosPlayerButtonStyle.CREATOR;
            return new BlazeVideosInlinePreviewPlayerButtonsStyle(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosInlinePreviewPlayerButtonsStyle[i];
        }
    }

    public BlazeVideosInlinePreviewPlayerButtonsStyle(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle2) {
        blazeVideosPlayerButtonStyle.getClass();
        blazeVideosPlayerButtonStyle2.getClass();
        this.mute = blazeVideosPlayerButtonStyle;
        this.replay = blazeVideosPlayerButtonStyle2;
    }

    public static /* synthetic */ BlazeVideosInlinePreviewPlayerButtonsStyle copy$default(BlazeVideosInlinePreviewPlayerButtonsStyle blazeVideosInlinePreviewPlayerButtonsStyle, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeVideosPlayerButtonStyle = blazeVideosInlinePreviewPlayerButtonsStyle.mute;
        }
        if ((i & 2) != 0) {
            blazeVideosPlayerButtonStyle2 = blazeVideosInlinePreviewPlayerButtonsStyle.replay;
        }
        return blazeVideosInlinePreviewPlayerButtonsStyle.copy(blazeVideosPlayerButtonStyle, blazeVideosPlayerButtonStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getMute() {
        return this.mute;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getReplay() {
        return this.replay;
    }

    @NotNull
    public final BlazeVideosInlinePreviewPlayerButtonsStyle copy(@NotNull BlazeVideosPlayerButtonStyle mute, @NotNull BlazeVideosPlayerButtonStyle replay) {
        mute.getClass();
        replay.getClass();
        return new BlazeVideosInlinePreviewPlayerButtonsStyle(mute, replay);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosInlinePreviewPlayerButtonsStyle)) {
            return false;
        }
        BlazeVideosInlinePreviewPlayerButtonsStyle blazeVideosInlinePreviewPlayerButtonsStyle = (BlazeVideosInlinePreviewPlayerButtonsStyle) other;
        return Intrinsics.c(this.mute, blazeVideosInlinePreviewPlayerButtonsStyle.mute) && Intrinsics.c(this.replay, blazeVideosInlinePreviewPlayerButtonsStyle.replay);
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getMute() {
        return this.mute;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getReplay() {
        return this.replay;
    }

    public int hashCode() {
        return this.replay.hashCode() + (this.mute.hashCode() * 31);
    }

    public final void setMute(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.mute = blazeVideosPlayerButtonStyle;
    }

    public final void setReplay(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.replay = blazeVideosPlayerButtonStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosInlinePreviewPlayerButtonsStyle(mute=" + this.mute + ", replay=" + this.replay + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.mute.writeToParcel(dest, flags);
        this.replay.writeToParcel(dest, flags);
    }
}
