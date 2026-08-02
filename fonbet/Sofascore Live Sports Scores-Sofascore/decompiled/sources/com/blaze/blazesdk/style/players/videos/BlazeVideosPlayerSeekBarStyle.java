package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.BlazeSeekBarStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import defpackage.s6a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006."}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerSeekBarStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "bottomMargin", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "horizontalMargin", "playingState", "Lcom/blaze/blazesdk/style/players/BlazeSeekBarStyle;", "pausedState", "<init>", "(ZLcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/players/BlazeSeekBarStyle;Lcom/blaze/blazesdk/style/players/BlazeSeekBarStyle;)V", "()Z", "setVisible", "(Z)V", "getBottomMargin", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setBottomMargin", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getHorizontalMargin", "setHorizontalMargin", "getPlayingState", "()Lcom/blaze/blazesdk/style/players/BlazeSeekBarStyle;", "setPlayingState", "(Lcom/blaze/blazesdk/style/players/BlazeSeekBarStyle;)V", "getPausedState", "setPausedState", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerSeekBarStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerSeekBarStyle> CREATOR = new a();

    @NotNull
    private BlazeDp bottomMargin;

    @NotNull
    private BlazeDp horizontalMargin;
    private boolean isVisible;

    @NotNull
    private BlazeSeekBarStyle pausedState;

    @NotNull
    private BlazeSeekBarStyle playingState;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            BlazeDp createFromParcel = creator.createFromParcel(parcel);
            BlazeDp createFromParcel2 = creator.createFromParcel(parcel);
            Parcelable.Creator<BlazeSeekBarStyle> creator2 = BlazeSeekBarStyle.CREATOR;
            return new BlazeVideosPlayerSeekBarStyle(z, createFromParcel, createFromParcel2, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerSeekBarStyle[i];
        }
    }

    public BlazeVideosPlayerSeekBarStyle(boolean z, @NotNull BlazeDp blazeDp, @NotNull BlazeDp blazeDp2, @NotNull BlazeSeekBarStyle blazeSeekBarStyle, @NotNull BlazeSeekBarStyle blazeSeekBarStyle2) {
        blazeDp.getClass();
        blazeDp2.getClass();
        blazeSeekBarStyle.getClass();
        blazeSeekBarStyle2.getClass();
        this.isVisible = z;
        this.bottomMargin = blazeDp;
        this.horizontalMargin = blazeDp2;
        this.playingState = blazeSeekBarStyle;
        this.pausedState = blazeSeekBarStyle2;
    }

    public static /* synthetic */ BlazeVideosPlayerSeekBarStyle copy$default(BlazeVideosPlayerSeekBarStyle blazeVideosPlayerSeekBarStyle, boolean z, BlazeDp blazeDp, BlazeDp blazeDp2, BlazeSeekBarStyle blazeSeekBarStyle, BlazeSeekBarStyle blazeSeekBarStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeVideosPlayerSeekBarStyle.isVisible;
        }
        if ((i & 2) != 0) {
            blazeDp = blazeVideosPlayerSeekBarStyle.bottomMargin;
        }
        if ((i & 4) != 0) {
            blazeDp2 = blazeVideosPlayerSeekBarStyle.horizontalMargin;
        }
        if ((i & 8) != 0) {
            blazeSeekBarStyle = blazeVideosPlayerSeekBarStyle.playingState;
        }
        if ((i & 16) != 0) {
            blazeSeekBarStyle2 = blazeVideosPlayerSeekBarStyle.pausedState;
        }
        BlazeSeekBarStyle blazeSeekBarStyle3 = blazeSeekBarStyle2;
        BlazeDp blazeDp3 = blazeDp2;
        return blazeVideosPlayerSeekBarStyle.copy(z, blazeDp, blazeDp3, blazeSeekBarStyle, blazeSeekBarStyle3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeDp getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeDp getHorizontalMargin() {
        return this.horizontalMargin;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeSeekBarStyle getPlayingState() {
        return this.playingState;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeSeekBarStyle getPausedState() {
        return this.pausedState;
    }

    @NotNull
    public final BlazeVideosPlayerSeekBarStyle copy(boolean isVisible, @NotNull BlazeDp bottomMargin, @NotNull BlazeDp horizontalMargin, @NotNull BlazeSeekBarStyle playingState, @NotNull BlazeSeekBarStyle pausedState) {
        bottomMargin.getClass();
        horizontalMargin.getClass();
        playingState.getClass();
        pausedState.getClass();
        return new BlazeVideosPlayerSeekBarStyle(isVisible, bottomMargin, horizontalMargin, playingState, pausedState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerSeekBarStyle)) {
            return false;
        }
        BlazeVideosPlayerSeekBarStyle blazeVideosPlayerSeekBarStyle = (BlazeVideosPlayerSeekBarStyle) other;
        return this.isVisible == blazeVideosPlayerSeekBarStyle.isVisible && Intrinsics.c(this.bottomMargin, blazeVideosPlayerSeekBarStyle.bottomMargin) && Intrinsics.c(this.horizontalMargin, blazeVideosPlayerSeekBarStyle.horizontalMargin) && Intrinsics.c(this.playingState, blazeVideosPlayerSeekBarStyle.playingState) && Intrinsics.c(this.pausedState, blazeVideosPlayerSeekBarStyle.pausedState);
    }

    @NotNull
    public final BlazeDp getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final BlazeDp getHorizontalMargin() {
        return this.horizontalMargin;
    }

    @NotNull
    public final BlazeSeekBarStyle getPausedState() {
        return this.pausedState;
    }

    @NotNull
    public final BlazeSeekBarStyle getPlayingState() {
        return this.playingState;
    }

    public int hashCode() {
        return this.pausedState.hashCode() + ((this.playingState.hashCode() + s6a.n(this.horizontalMargin, s6a.n(this.bottomMargin, Boolean.hashCode(this.isVisible) * 31))) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setBottomMargin(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.bottomMargin = blazeDp;
    }

    public final void setHorizontalMargin(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.horizontalMargin = blazeDp;
    }

    public final void setPausedState(@NotNull BlazeSeekBarStyle blazeSeekBarStyle) {
        blazeSeekBarStyle.getClass();
        this.pausedState = blazeSeekBarStyle;
    }

    public final void setPlayingState(@NotNull BlazeSeekBarStyle blazeSeekBarStyle) {
        blazeSeekBarStyle.getClass();
        this.playingState = blazeSeekBarStyle;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosPlayerSeekBarStyle(isVisible=" + this.isVisible + ", bottomMargin=" + this.bottomMargin + ", horizontalMargin=" + this.horizontalMargin + ", playingState=" + this.playingState + ", pausedState=" + this.pausedState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        this.bottomMargin.writeToParcel(dest, flags);
        this.horizontalMargin.writeToParcel(dest, flags);
        this.playingState.writeToParcel(dest, flags);
        this.pausedState.writeToParcel(dest, flags);
    }
}
