package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.utils.BlazeParcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "margins", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "padding", "playbackStates", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle;", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle;)V", "getMargins", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "setMargins", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "getPadding", "setPadding", "getPlaybackStates", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle;", "setPlaybackStates", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerBackToLiveButtonStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerBackToLiveButtonStyle> CREATOR = new a();

    @NotNull
    private BlazeInsets margins;

    @NotNull
    private BlazeInsets padding;

    @NotNull
    private BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle playbackStates;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeInsets> creator = BlazeInsets.CREATOR;
            return new BlazeVideosPlayerBackToLiveButtonStyle(creator.createFromParcel(parcel), creator.createFromParcel(parcel), BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerBackToLiveButtonStyle[i];
        }
    }

    public BlazeVideosPlayerBackToLiveButtonStyle(@NotNull BlazeInsets blazeInsets, @NotNull BlazeInsets blazeInsets2, @NotNull BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle) {
        blazeInsets.getClass();
        blazeInsets2.getClass();
        blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle.getClass();
        this.margins = blazeInsets;
        this.padding = blazeInsets2;
        this.playbackStates = blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle;
    }

    public static /* synthetic */ BlazeVideosPlayerBackToLiveButtonStyle copy$default(BlazeVideosPlayerBackToLiveButtonStyle blazeVideosPlayerBackToLiveButtonStyle, BlazeInsets blazeInsets, BlazeInsets blazeInsets2, BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeInsets = blazeVideosPlayerBackToLiveButtonStyle.margins;
        }
        if ((i & 2) != 0) {
            blazeInsets2 = blazeVideosPlayerBackToLiveButtonStyle.padding;
        }
        if ((i & 4) != 0) {
            blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle = blazeVideosPlayerBackToLiveButtonStyle.playbackStates;
        }
        return blazeVideosPlayerBackToLiveButtonStyle.copy(blazeInsets, blazeInsets2, blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeInsets getMargins() {
        return this.margins;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle getPlaybackStates() {
        return this.playbackStates;
    }

    @NotNull
    public final BlazeVideosPlayerBackToLiveButtonStyle copy(@NotNull BlazeInsets margins, @NotNull BlazeInsets padding, @NotNull BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle playbackStates) {
        margins.getClass();
        padding.getClass();
        playbackStates.getClass();
        return new BlazeVideosPlayerBackToLiveButtonStyle(margins, padding, playbackStates);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerBackToLiveButtonStyle)) {
            return false;
        }
        BlazeVideosPlayerBackToLiveButtonStyle blazeVideosPlayerBackToLiveButtonStyle = (BlazeVideosPlayerBackToLiveButtonStyle) other;
        return Intrinsics.c(this.margins, blazeVideosPlayerBackToLiveButtonStyle.margins) && Intrinsics.c(this.padding, blazeVideosPlayerBackToLiveButtonStyle.padding) && Intrinsics.c(this.playbackStates, blazeVideosPlayerBackToLiveButtonStyle.playbackStates);
    }

    @NotNull
    public final BlazeInsets getMargins() {
        return this.margins;
    }

    @NotNull
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    public final BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle getPlaybackStates() {
        return this.playbackStates;
    }

    public int hashCode() {
        return this.playbackStates.hashCode() + ((this.padding.hashCode() + (this.margins.hashCode() * 31)) * 31);
    }

    public final void setMargins(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.margins = blazeInsets;
    }

    public final void setPadding(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.padding = blazeInsets;
    }

    public final void setPlaybackStates(@NotNull BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle) {
        blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle.getClass();
        this.playbackStates = blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosPlayerBackToLiveButtonStyle(margins=" + this.margins + ", padding=" + this.padding + ", playbackStates=" + this.playbackStates + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.margins.writeToParcel(dest, flags);
        this.padding.writeToParcel(dest, flags);
        this.playbackStates.writeToParcel(dest, flags);
    }
}
