package com.blaze.blazesdk.style.players.moments;

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
import defpackage.s6a;
import defpackage.u0a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001EBE\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#JX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u001a\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u00101R\"\u0010\u0005\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010.\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u00101R\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u00107R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u00108\u001a\u0004\b\t\u0010\u001e\"\u0004\b9\u0010:R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010 \"\u0004\b=\u0010>R\"\u0010\f\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u00108\u001a\u0004\b\f\u0010\u001e\"\u0004\b?\u0010:R\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010#\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;", "Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "width", "height", "", "color", "", C4018c8.k, "Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "customImage", "isVisibleForAds", "Landroid/widget/ImageView$ScaleType;", "scaleType", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;IZLcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;ZLandroid/widget/ImageView$ScaleType;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "component2", "component3", "component4", "()Z", "component5", "()Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "component6", "component7", "()Landroid/widget/ImageView$ScaleType;", "copy", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;IZLcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;ZLandroid/widget/ImageView$ScaleType;)Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getWidth", "setWidth", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getHeight", "setHeight", "I", "getColor", "setColor", "(I)V", "Z", "setVisible", "(Z)V", "Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "getCustomImage", "setCustomImage", "(Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;)V", "setVisibleForAds", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeMomentsPlayerButtonStyle implements IPlayerItemButtonStyle, BlazeParcelable {
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
    public static final Parcelable.Creator<BlazeMomentsPlayerButtonStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static BlazeMomentsPlayerButtonStyle a() {
            return new BlazeMomentsPlayerButtonStyle(new BlazeDp(48), new BlazeDp(48), -1, true, null, true, ImageView.ScaleType.CENTER_INSIDE);
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
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            BlazePlayerButtonCustomImageStates createFromParcel3 = parcel.readInt() == 0 ? null : BlazePlayerButtonCustomImageStates.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new BlazeMomentsPlayerButtonStyle(createFromParcel, createFromParcel2, readInt, z2, createFromParcel3, z, ImageView.ScaleType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerButtonStyle[i];
        }
    }

    public BlazeMomentsPlayerButtonStyle(@NotNull BlazeDp blazeDp, @NotNull BlazeDp blazeDp2, int i, boolean z, @Nullable BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates, boolean z2, @NotNull ImageView.ScaleType scaleType) {
        blazeDp.getClass();
        blazeDp2.getClass();
        scaleType.getClass();
        this.width = blazeDp;
        this.height = blazeDp2;
        this.color = i;
        this.isVisible = z;
        this.customImage = blazePlayerButtonCustomImageStates;
        this.isVisibleForAds = z2;
        this.scaleType = scaleType;
    }

    public static /* synthetic */ BlazeMomentsPlayerButtonStyle copy$default(BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle, BlazeDp blazeDp, BlazeDp blazeDp2, int i, boolean z, BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates, boolean z2, ImageView.ScaleType scaleType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeDp = blazeMomentsPlayerButtonStyle.width;
        }
        if ((i2 & 2) != 0) {
            blazeDp2 = blazeMomentsPlayerButtonStyle.height;
        }
        if ((i2 & 4) != 0) {
            i = blazeMomentsPlayerButtonStyle.color;
        }
        if ((i2 & 8) != 0) {
            z = blazeMomentsPlayerButtonStyle.isVisible;
        }
        if ((i2 & 16) != 0) {
            blazePlayerButtonCustomImageStates = blazeMomentsPlayerButtonStyle.customImage;
        }
        if ((i2 & 32) != 0) {
            z2 = blazeMomentsPlayerButtonStyle.isVisibleForAds;
        }
        if ((i2 & 64) != 0) {
            scaleType = blazeMomentsPlayerButtonStyle.scaleType;
        }
        boolean z3 = z2;
        ImageView.ScaleType scaleType2 = scaleType;
        BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates2 = blazePlayerButtonCustomImageStates;
        int i3 = i;
        return blazeMomentsPlayerButtonStyle.copy(blazeDp, blazeDp2, i3, z, blazePlayerButtonCustomImageStates2, z3, scaleType2);
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

    /* renamed from: component4, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final BlazePlayerButtonCustomImageStates getCustomImage() {
        return this.customImage;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsVisibleForAds() {
        return this.isVisibleForAds;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    @NotNull
    public final BlazeMomentsPlayerButtonStyle copy(@NotNull BlazeDp width, @NotNull BlazeDp height, int color, boolean isVisible, @Nullable BlazePlayerButtonCustomImageStates customImage, boolean isVisibleForAds, @NotNull ImageView.ScaleType scaleType) {
        width.getClass();
        height.getClass();
        scaleType.getClass();
        return new BlazeMomentsPlayerButtonStyle(width, height, color, isVisible, customImage, isVisibleForAds, scaleType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerButtonStyle)) {
            return false;
        }
        BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle = (BlazeMomentsPlayerButtonStyle) other;
        return Intrinsics.c(this.width, blazeMomentsPlayerButtonStyle.width) && Intrinsics.c(this.height, blazeMomentsPlayerButtonStyle.height) && this.color == blazeMomentsPlayerButtonStyle.color && this.isVisible == blazeMomentsPlayerButtonStyle.isVisible && Intrinsics.c(this.customImage, blazeMomentsPlayerButtonStyle.customImage) && this.isVisibleForAds == blazeMomentsPlayerButtonStyle.isVisibleForAds && this.scaleType == blazeMomentsPlayerButtonStyle.scaleType;
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
        int t = u0a.t(l4a.e(this.color, s6a.n(this.height, this.width.hashCode() * 31)), this.isVisible);
        BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates = this.customImage;
        return this.scaleType.hashCode() + u0a.t((t + (blazePlayerButtonCustomImageStates == null ? 0 : blazePlayerButtonCustomImageStates.hashCode())) * 31, this.isVisibleForAds);
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
        return "BlazeMomentsPlayerButtonStyle(width=" + this.width + ", height=" + this.height + ", color=" + this.color + ", isVisible=" + this.isVisible + ", customImage=" + this.customImage + ", isVisibleForAds=" + this.isVisibleForAds + ", scaleType=" + this.scaleType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.width.writeToParcel(dest, flags);
        this.height.writeToParcel(dest, flags);
        dest.writeInt(this.color);
        dest.writeInt(this.isVisible ? 1 : 0);
        BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates = this.customImage;
        if (blazePlayerButtonCustomImageStates == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazePlayerButtonCustomImageStates.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isVisibleForAds ? 1 : 0);
        dest.writeString(this.scaleType.name());
    }
}
