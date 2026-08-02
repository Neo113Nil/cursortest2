package com.blaze.blazesdk.style.players.stories;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.BlazePlayerButtonCustomImageStates;
import com.blaze.blazesdk.style.players.IPlayerItemButtonStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import defpackage.l4a;
import defpackage.lnb;
import defpackage.s6a;
import defpackage.u0a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001EBE\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010\"JX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u001a\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u00101R\"\u0010\u0005\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010.\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u00101R\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u00107R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010;R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010 \"\u0004\b>\u0010?R\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010@\u001a\u0004\b\r\u0010\"\"\u0004\bA\u0010BR\"\u0010\u000e\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010@\u001a\u0004\b\u000e\u0010\"\"\u0004\bC\u0010B¨\u0006F"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;", "Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "width", "height", "", "color", "Landroid/widget/ImageView$ScaleType;", "scaleType", "Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "customImage", "", C4018c8.k, "isVisibleForAds", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;ILandroid/widget/ImageView$ScaleType;Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;ZZ)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "component2", "component3", "component4", "()Landroid/widget/ImageView$ScaleType;", "component5", "()Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "component6", "()Z", "component7", "copy", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;ILandroid/widget/ImageView$ScaleType;Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;ZZ)Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getWidth", "setWidth", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getHeight", "setHeight", "I", "getColor", "setColor", "(I)V", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "getCustomImage", "setCustomImage", "(Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;)V", "Z", "setVisible", "(Z)V", "setVisibleForAds", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeStoryPlayerButtonStyle implements IPlayerItemButtonStyle, BlazeParcelable {
    private int color;

    @Nullable
    private BlazePlayerButtonCustomImageStates customImage;

    @NotNull
    private BlazeDp height;
    private boolean isVisible;
    private boolean isVisibleForAds;

    @NotNull
    private ImageView.ScaleType scaleType;

    @NotNull
    private BlazeDp width;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeStoryPlayerButtonStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static BlazeStoryPlayerButtonStyle a() {
            return new BlazeStoryPlayerButtonStyle(new BlazeDp(48), new BlazeDp(48), -1, ImageView.ScaleType.CENTER_INSIDE, null, true, true);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            parcel.getClass();
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            BlazeDp createFromParcel = creator.createFromParcel(parcel);
            BlazeDp createFromParcel2 = creator.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ImageView.ScaleType valueOf = ImageView.ScaleType.valueOf(parcel.readString());
            BlazePlayerButtonCustomImageStates createFromParcel3 = parcel.readInt() == 0 ? null : BlazePlayerButtonCustomImageStates.CREATOR.createFromParcel(parcel);
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new BlazeStoryPlayerButtonStyle(createFromParcel, createFromParcel2, readInt, valueOf, createFromParcel3, z2, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeStoryPlayerButtonStyle[i];
        }
    }

    public BlazeStoryPlayerButtonStyle(@NotNull BlazeDp blazeDp, @NotNull BlazeDp blazeDp2, int i, @NotNull ImageView.ScaleType scaleType, @Nullable BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates, boolean z, boolean z2) {
        blazeDp.getClass();
        blazeDp2.getClass();
        scaleType.getClass();
        this.width = blazeDp;
        this.height = blazeDp2;
        this.color = i;
        this.scaleType = scaleType;
        this.customImage = blazePlayerButtonCustomImageStates;
        this.isVisible = z;
        this.isVisibleForAds = z2;
    }

    public static /* synthetic */ BlazeStoryPlayerButtonStyle copy$default(BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle, BlazeDp blazeDp, BlazeDp blazeDp2, int i, ImageView.ScaleType scaleType, BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeDp = blazeStoryPlayerButtonStyle.width;
        }
        if ((i2 & 2) != 0) {
            blazeDp2 = blazeStoryPlayerButtonStyle.height;
        }
        if ((i2 & 4) != 0) {
            i = blazeStoryPlayerButtonStyle.color;
        }
        if ((i2 & 8) != 0) {
            scaleType = blazeStoryPlayerButtonStyle.scaleType;
        }
        if ((i2 & 16) != 0) {
            blazePlayerButtonCustomImageStates = blazeStoryPlayerButtonStyle.customImage;
        }
        if ((i2 & 32) != 0) {
            z = blazeStoryPlayerButtonStyle.isVisible;
        }
        if ((i2 & 64) != 0) {
            z2 = blazeStoryPlayerButtonStyle.isVisibleForAds;
        }
        boolean z3 = z;
        boolean z4 = z2;
        BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates2 = blazePlayerButtonCustomImageStates;
        int i3 = i;
        return blazeStoryPlayerButtonStyle.copy(blazeDp, blazeDp2, i3, scaleType, blazePlayerButtonCustomImageStates2, z3, z4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeDp getWidth() {
        return this.width;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeDp getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final BlazePlayerButtonCustomImageStates getCustomImage() {
        return this.customImage;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsVisibleForAds() {
        return this.isVisibleForAds;
    }

    @NotNull
    public final BlazeStoryPlayerButtonStyle copy(@NotNull BlazeDp width, @NotNull BlazeDp height, int color, @NotNull ImageView.ScaleType scaleType, @Nullable BlazePlayerButtonCustomImageStates customImage, boolean isVisible, boolean isVisibleForAds) {
        width.getClass();
        height.getClass();
        scaleType.getClass();
        return new BlazeStoryPlayerButtonStyle(width, height, color, scaleType, customImage, isVisible, isVisibleForAds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeStoryPlayerButtonStyle)) {
            return false;
        }
        BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle = (BlazeStoryPlayerButtonStyle) other;
        return Intrinsics.c(this.width, blazeStoryPlayerButtonStyle.width) && Intrinsics.c(this.height, blazeStoryPlayerButtonStyle.height) && this.color == blazeStoryPlayerButtonStyle.color && this.scaleType == blazeStoryPlayerButtonStyle.scaleType && Intrinsics.c(this.customImage, blazeStoryPlayerButtonStyle.customImage) && this.isVisible == blazeStoryPlayerButtonStyle.isVisible && this.isVisibleForAds == blazeStoryPlayerButtonStyle.isVisibleForAds;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    public int getColor() {
        return this.color;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    @Nullable
    public BlazePlayerButtonCustomImageStates getCustomImage() {
        return this.customImage;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    @NotNull
    public BlazeDp getHeight() {
        return this.height;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    @NotNull
    public ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    @NotNull
    public BlazeDp getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = (this.scaleType.hashCode() + l4a.e(this.color, s6a.n(this.height, this.width.hashCode() * 31))) * 31;
        BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates = this.customImage;
        return Boolean.hashCode(this.isVisibleForAds) + u0a.t((hashCode + (blazePlayerButtonCustomImageStates == null ? 0 : blazePlayerButtonCustomImageStates.hashCode())) * 31, this.isVisible);
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    public boolean isVisible() {
        return this.isVisible;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    public boolean isVisibleForAds() {
        return this.isVisibleForAds;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    public void setColor(int i) {
        this.color = i;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    public void setCustomImage(@Nullable BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates) {
        this.customImage = blazePlayerButtonCustomImageStates;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    public void setHeight(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.height = blazeDp;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    public void setScaleType(@NotNull ImageView.ScaleType scaleType) {
        scaleType.getClass();
        this.scaleType = scaleType;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    public void setVisibleForAds(boolean z) {
        this.isVisibleForAds = z;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonStyle
    public void setWidth(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.width = blazeDp;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeStoryPlayerButtonStyle(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", scaleType=");
        sb.append(this.scaleType);
        sb.append(", customImage=");
        sb.append(this.customImage);
        sb.append(", isVisible=");
        sb.append(this.isVisible);
        sb.append(", isVisibleForAds=");
        return lnb.r(sb, this.isVisibleForAds, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.width.writeToParcel(dest, flags);
        this.height.writeToParcel(dest, flags);
        dest.writeInt(this.color);
        dest.writeString(this.scaleType.name());
        BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates = this.customImage;
        if (blazePlayerButtonCustomImageStates == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazePlayerButtonCustomImageStates.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isVisible ? 1 : 0);
        dest.writeInt(this.isVisibleForAds ? 1 : 0);
    }
}
