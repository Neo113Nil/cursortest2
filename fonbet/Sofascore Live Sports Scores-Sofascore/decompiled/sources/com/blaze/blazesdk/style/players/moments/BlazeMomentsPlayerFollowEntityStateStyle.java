package com.blaze.blazesdk.style.players.moments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001)B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStateStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityAvatarStyle;", "avatar", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle;", "chip", "<init>", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityAvatarStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityAvatarStyle;", "component2", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle;", "copy", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityAvatarStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle;)Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityStateStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityAvatarStyle;", "getAvatar", "setAvatar", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityAvatarStyle;)V", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle;", "getChip", "setChip", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle;)V", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeMomentsPlayerFollowEntityStateStyle implements BlazeParcelable {

    @NotNull
    private BlazeMomentsPlayerFollowEntityAvatarStyle avatar;

    @NotNull
    private BlazeMomentsPlayerFollowEntityChipStyle chip;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerFollowEntityStateStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityStateStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeMomentsPlayerFollowEntityStateStyle(BlazeMomentsPlayerFollowEntityAvatarStyle.CREATOR.createFromParcel(parcel), BlazeMomentsPlayerFollowEntityChipStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerFollowEntityStateStyle[i];
        }
    }

    public BlazeMomentsPlayerFollowEntityStateStyle(@NotNull BlazeMomentsPlayerFollowEntityAvatarStyle blazeMomentsPlayerFollowEntityAvatarStyle, @NotNull BlazeMomentsPlayerFollowEntityChipStyle blazeMomentsPlayerFollowEntityChipStyle) {
        blazeMomentsPlayerFollowEntityAvatarStyle.getClass();
        blazeMomentsPlayerFollowEntityChipStyle.getClass();
        this.avatar = blazeMomentsPlayerFollowEntityAvatarStyle;
        this.chip = blazeMomentsPlayerFollowEntityChipStyle;
    }

    public static /* synthetic */ BlazeMomentsPlayerFollowEntityStateStyle copy$default(BlazeMomentsPlayerFollowEntityStateStyle blazeMomentsPlayerFollowEntityStateStyle, BlazeMomentsPlayerFollowEntityAvatarStyle blazeMomentsPlayerFollowEntityAvatarStyle, BlazeMomentsPlayerFollowEntityChipStyle blazeMomentsPlayerFollowEntityChipStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeMomentsPlayerFollowEntityAvatarStyle = blazeMomentsPlayerFollowEntityStateStyle.avatar;
        }
        if ((i & 2) != 0) {
            blazeMomentsPlayerFollowEntityChipStyle = blazeMomentsPlayerFollowEntityStateStyle.chip;
        }
        return blazeMomentsPlayerFollowEntityStateStyle.copy(blazeMomentsPlayerFollowEntityAvatarStyle, blazeMomentsPlayerFollowEntityChipStyle);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeMomentsPlayerFollowEntityAvatarStyle getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeMomentsPlayerFollowEntityChipStyle getChip() {
        return this.chip;
    }

    @NotNull
    public final BlazeMomentsPlayerFollowEntityStateStyle copy(@NotNull BlazeMomentsPlayerFollowEntityAvatarStyle avatar, @NotNull BlazeMomentsPlayerFollowEntityChipStyle chip) {
        avatar.getClass();
        chip.getClass();
        return new BlazeMomentsPlayerFollowEntityStateStyle(avatar, chip);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerFollowEntityStateStyle)) {
            return false;
        }
        BlazeMomentsPlayerFollowEntityStateStyle blazeMomentsPlayerFollowEntityStateStyle = (BlazeMomentsPlayerFollowEntityStateStyle) other;
        return Intrinsics.c(this.avatar, blazeMomentsPlayerFollowEntityStateStyle.avatar) && Intrinsics.c(this.chip, blazeMomentsPlayerFollowEntityStateStyle.chip);
    }

    @NotNull
    public final BlazeMomentsPlayerFollowEntityAvatarStyle getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final BlazeMomentsPlayerFollowEntityChipStyle getChip() {
        return this.chip;
    }

    public int hashCode() {
        return this.chip.hashCode() + (this.avatar.hashCode() * 31);
    }

    public final void setAvatar(@NotNull BlazeMomentsPlayerFollowEntityAvatarStyle blazeMomentsPlayerFollowEntityAvatarStyle) {
        blazeMomentsPlayerFollowEntityAvatarStyle.getClass();
        this.avatar = blazeMomentsPlayerFollowEntityAvatarStyle;
    }

    public final void setChip(@NotNull BlazeMomentsPlayerFollowEntityChipStyle blazeMomentsPlayerFollowEntityChipStyle) {
        blazeMomentsPlayerFollowEntityChipStyle.getClass();
        this.chip = blazeMomentsPlayerFollowEntityChipStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeMomentsPlayerFollowEntityStateStyle(avatar=" + this.avatar + ", chip=" + this.chip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.avatar.writeToParcel(dest, flags);
        this.chip.writeToParcel(dest, flags);
    }
}
