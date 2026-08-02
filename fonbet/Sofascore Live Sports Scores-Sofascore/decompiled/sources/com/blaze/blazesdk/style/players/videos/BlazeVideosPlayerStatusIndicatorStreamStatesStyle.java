package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\""}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStreamStatesStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "upcomingStreamState", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStateStyle;", "liveStreamState", "endedStreamState", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStateStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStateStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStateStyle;)V", "getUpcomingStreamState", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStateStyle;", "setUpcomingStreamState", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStateStyle;)V", "getLiveStreamState", "setLiveStreamState", "getEndedStreamState", "setEndedStreamState", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerStatusIndicatorStreamStatesStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerStatusIndicatorStreamStatesStyle> CREATOR = new a();

    @NotNull
    private BlazeVideosPlayerStatusIndicatorStateStyle endedStreamState;

    @NotNull
    private BlazeVideosPlayerStatusIndicatorStateStyle liveStreamState;

    @NotNull
    private BlazeVideosPlayerStatusIndicatorStateStyle upcomingStreamState;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeVideosPlayerStatusIndicatorStateStyle> creator = BlazeVideosPlayerStatusIndicatorStateStyle.CREATOR;
            return new BlazeVideosPlayerStatusIndicatorStreamStatesStyle(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerStatusIndicatorStreamStatesStyle[i];
        }
    }

    public BlazeVideosPlayerStatusIndicatorStreamStatesStyle(@NotNull BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle, @NotNull BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle2, @NotNull BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle3) {
        blazeVideosPlayerStatusIndicatorStateStyle.getClass();
        blazeVideosPlayerStatusIndicatorStateStyle2.getClass();
        blazeVideosPlayerStatusIndicatorStateStyle3.getClass();
        this.upcomingStreamState = blazeVideosPlayerStatusIndicatorStateStyle;
        this.liveStreamState = blazeVideosPlayerStatusIndicatorStateStyle2;
        this.endedStreamState = blazeVideosPlayerStatusIndicatorStateStyle3;
    }

    public static /* synthetic */ BlazeVideosPlayerStatusIndicatorStreamStatesStyle copy$default(BlazeVideosPlayerStatusIndicatorStreamStatesStyle blazeVideosPlayerStatusIndicatorStreamStatesStyle, BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle, BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle2, BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle3, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeVideosPlayerStatusIndicatorStateStyle = blazeVideosPlayerStatusIndicatorStreamStatesStyle.upcomingStreamState;
        }
        if ((i & 2) != 0) {
            blazeVideosPlayerStatusIndicatorStateStyle2 = blazeVideosPlayerStatusIndicatorStreamStatesStyle.liveStreamState;
        }
        if ((i & 4) != 0) {
            blazeVideosPlayerStatusIndicatorStateStyle3 = blazeVideosPlayerStatusIndicatorStreamStatesStyle.endedStreamState;
        }
        return blazeVideosPlayerStatusIndicatorStreamStatesStyle.copy(blazeVideosPlayerStatusIndicatorStateStyle, blazeVideosPlayerStatusIndicatorStateStyle2, blazeVideosPlayerStatusIndicatorStateStyle3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeVideosPlayerStatusIndicatorStateStyle getUpcomingStreamState() {
        return this.upcomingStreamState;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeVideosPlayerStatusIndicatorStateStyle getLiveStreamState() {
        return this.liveStreamState;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeVideosPlayerStatusIndicatorStateStyle getEndedStreamState() {
        return this.endedStreamState;
    }

    @NotNull
    public final BlazeVideosPlayerStatusIndicatorStreamStatesStyle copy(@NotNull BlazeVideosPlayerStatusIndicatorStateStyle upcomingStreamState, @NotNull BlazeVideosPlayerStatusIndicatorStateStyle liveStreamState, @NotNull BlazeVideosPlayerStatusIndicatorStateStyle endedStreamState) {
        upcomingStreamState.getClass();
        liveStreamState.getClass();
        endedStreamState.getClass();
        return new BlazeVideosPlayerStatusIndicatorStreamStatesStyle(upcomingStreamState, liveStreamState, endedStreamState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerStatusIndicatorStreamStatesStyle)) {
            return false;
        }
        BlazeVideosPlayerStatusIndicatorStreamStatesStyle blazeVideosPlayerStatusIndicatorStreamStatesStyle = (BlazeVideosPlayerStatusIndicatorStreamStatesStyle) other;
        return Intrinsics.c(this.upcomingStreamState, blazeVideosPlayerStatusIndicatorStreamStatesStyle.upcomingStreamState) && Intrinsics.c(this.liveStreamState, blazeVideosPlayerStatusIndicatorStreamStatesStyle.liveStreamState) && Intrinsics.c(this.endedStreamState, blazeVideosPlayerStatusIndicatorStreamStatesStyle.endedStreamState);
    }

    @NotNull
    public final BlazeVideosPlayerStatusIndicatorStateStyle getEndedStreamState() {
        return this.endedStreamState;
    }

    @NotNull
    public final BlazeVideosPlayerStatusIndicatorStateStyle getLiveStreamState() {
        return this.liveStreamState;
    }

    @NotNull
    public final BlazeVideosPlayerStatusIndicatorStateStyle getUpcomingStreamState() {
        return this.upcomingStreamState;
    }

    public int hashCode() {
        return this.endedStreamState.hashCode() + ((this.liveStreamState.hashCode() + (this.upcomingStreamState.hashCode() * 31)) * 31);
    }

    public final void setEndedStreamState(@NotNull BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle) {
        blazeVideosPlayerStatusIndicatorStateStyle.getClass();
        this.endedStreamState = blazeVideosPlayerStatusIndicatorStateStyle;
    }

    public final void setLiveStreamState(@NotNull BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle) {
        blazeVideosPlayerStatusIndicatorStateStyle.getClass();
        this.liveStreamState = blazeVideosPlayerStatusIndicatorStateStyle;
    }

    public final void setUpcomingStreamState(@NotNull BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle) {
        blazeVideosPlayerStatusIndicatorStateStyle.getClass();
        this.upcomingStreamState = blazeVideosPlayerStatusIndicatorStateStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosPlayerStatusIndicatorStreamStatesStyle(upcomingStreamState=" + this.upcomingStreamState + ", liveStreamState=" + this.liveStreamState + ", endedStreamState=" + this.endedStreamState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.upcomingStreamState.writeToParcel(dest, flags);
        this.liveStreamState.writeToParcel(dest, flags);
        this.endedStreamState.writeToParcel(dest, flags);
    }
}
