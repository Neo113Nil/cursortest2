package com.blaze.blazesdk.style.players.moments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.follow.models.BlazeFollowEntityType;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "followState", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStateStyle;", "unfollowState", "entityType", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;", "<init>", "(ZLcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStateStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStateStyle;Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;)V", "()Z", "setVisible", "(Z)V", "getFollowState", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStateStyle;", "setFollowState", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStateStyle;)V", "getUnfollowState", "setUnfollowState", "getEntityType", "()Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;", "setEntityType", "(Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeMomentsPlayerFollowEntityStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerFollowEntityStyle> CREATOR = new a();

    @NotNull
    private BlazeFollowEntityType entityType;

    @NotNull
    private BlazeMomentsPlayerFollowEntityStateStyle followState;
    private boolean isVisible;

    @NotNull
    private BlazeMomentsPlayerFollowEntityStateStyle unfollowState;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            Parcelable.Creator<BlazeMomentsPlayerFollowEntityStateStyle> creator = BlazeMomentsPlayerFollowEntityStateStyle.CREATOR;
            return new BlazeMomentsPlayerFollowEntityStyle(z, creator.createFromParcel(parcel), creator.createFromParcel(parcel), (BlazeFollowEntityType) parcel.readParcelable(BlazeMomentsPlayerFollowEntityStyle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerFollowEntityStyle[i];
        }
    }

    public BlazeMomentsPlayerFollowEntityStyle(boolean z, @NotNull BlazeMomentsPlayerFollowEntityStateStyle blazeMomentsPlayerFollowEntityStateStyle, @NotNull BlazeMomentsPlayerFollowEntityStateStyle blazeMomentsPlayerFollowEntityStateStyle2, @NotNull BlazeFollowEntityType blazeFollowEntityType) {
        blazeMomentsPlayerFollowEntityStateStyle.getClass();
        blazeMomentsPlayerFollowEntityStateStyle2.getClass();
        blazeFollowEntityType.getClass();
        this.isVisible = z;
        this.followState = blazeMomentsPlayerFollowEntityStateStyle;
        this.unfollowState = blazeMomentsPlayerFollowEntityStateStyle2;
        this.entityType = blazeFollowEntityType;
    }

    public static /* synthetic */ BlazeMomentsPlayerFollowEntityStyle copy$default(BlazeMomentsPlayerFollowEntityStyle blazeMomentsPlayerFollowEntityStyle, boolean z, BlazeMomentsPlayerFollowEntityStateStyle blazeMomentsPlayerFollowEntityStateStyle, BlazeMomentsPlayerFollowEntityStateStyle blazeMomentsPlayerFollowEntityStateStyle2, BlazeFollowEntityType blazeFollowEntityType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeMomentsPlayerFollowEntityStyle.isVisible;
        }
        if ((i & 2) != 0) {
            blazeMomentsPlayerFollowEntityStateStyle = blazeMomentsPlayerFollowEntityStyle.followState;
        }
        if ((i & 4) != 0) {
            blazeMomentsPlayerFollowEntityStateStyle2 = blazeMomentsPlayerFollowEntityStyle.unfollowState;
        }
        if ((i & 8) != 0) {
            blazeFollowEntityType = blazeMomentsPlayerFollowEntityStyle.entityType;
        }
        return blazeMomentsPlayerFollowEntityStyle.copy(z, blazeMomentsPlayerFollowEntityStateStyle, blazeMomentsPlayerFollowEntityStateStyle2, blazeFollowEntityType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeMomentsPlayerFollowEntityStateStyle getFollowState() {
        return this.followState;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeMomentsPlayerFollowEntityStateStyle getUnfollowState() {
        return this.unfollowState;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeFollowEntityType getEntityType() {
        return this.entityType;
    }

    @NotNull
    public final BlazeMomentsPlayerFollowEntityStyle copy(boolean isVisible, @NotNull BlazeMomentsPlayerFollowEntityStateStyle followState, @NotNull BlazeMomentsPlayerFollowEntityStateStyle unfollowState, @NotNull BlazeFollowEntityType entityType) {
        followState.getClass();
        unfollowState.getClass();
        entityType.getClass();
        return new BlazeMomentsPlayerFollowEntityStyle(isVisible, followState, unfollowState, entityType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerFollowEntityStyle)) {
            return false;
        }
        BlazeMomentsPlayerFollowEntityStyle blazeMomentsPlayerFollowEntityStyle = (BlazeMomentsPlayerFollowEntityStyle) other;
        return this.isVisible == blazeMomentsPlayerFollowEntityStyle.isVisible && Intrinsics.c(this.followState, blazeMomentsPlayerFollowEntityStyle.followState) && Intrinsics.c(this.unfollowState, blazeMomentsPlayerFollowEntityStyle.unfollowState) && Intrinsics.c(this.entityType, blazeMomentsPlayerFollowEntityStyle.entityType);
    }

    @NotNull
    public final BlazeFollowEntityType getEntityType() {
        return this.entityType;
    }

    @NotNull
    public final BlazeMomentsPlayerFollowEntityStateStyle getFollowState() {
        return this.followState;
    }

    @NotNull
    public final BlazeMomentsPlayerFollowEntityStateStyle getUnfollowState() {
        return this.unfollowState;
    }

    public int hashCode() {
        return this.entityType.hashCode() + ((this.unfollowState.hashCode() + ((this.followState.hashCode() + (Boolean.hashCode(this.isVisible) * 31)) * 31)) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setEntityType(@NotNull BlazeFollowEntityType blazeFollowEntityType) {
        blazeFollowEntityType.getClass();
        this.entityType = blazeFollowEntityType;
    }

    public final void setFollowState(@NotNull BlazeMomentsPlayerFollowEntityStateStyle blazeMomentsPlayerFollowEntityStateStyle) {
        blazeMomentsPlayerFollowEntityStateStyle.getClass();
        this.followState = blazeMomentsPlayerFollowEntityStateStyle;
    }

    public final void setUnfollowState(@NotNull BlazeMomentsPlayerFollowEntityStateStyle blazeMomentsPlayerFollowEntityStateStyle) {
        blazeMomentsPlayerFollowEntityStateStyle.getClass();
        this.unfollowState = blazeMomentsPlayerFollowEntityStateStyle;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeMomentsPlayerFollowEntityStyle(isVisible=" + this.isVisible + ", followState=" + this.followState + ", unfollowState=" + this.unfollowState + ", entityType=" + this.entityType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        this.followState.writeToParcel(dest, flags);
        this.unfollowState.writeToParcel(dest, flags);
        dest.writeParcelable(this.entityType, flags);
    }
}
