package com.blaze.blazesdk.style.players;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.b6a;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001GBU\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJl\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u0017J\u001a\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b\u0003\u0010\u0019\"\u0004\b/\u00100R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u00104R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u00104R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010:R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00101\u001a\u0004\b;\u0010\u0017\"\u0004\b<\u00104R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010 \"\u0004\b?\u0010@R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010.\u001a\u0004\b\u000b\u0010\u0019\"\u0004\bA\u00100R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00107\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010:R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00107\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010:¨\u0006H"}, d2 = {"Lcom/blaze/blazesdk/style/players/BlazeSeekBarStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "", C4018c8.k, "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "progressColor", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "cornerRadius", "thumbColor", "thumbImageResId", "isThumbVisible", "height", "thumbSize", "<init>", "(ZIILcom/blaze/blazesdk/style/shared/models/BlazeDp;ILjava/lang/Integer;ZLcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "component3", "component4", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "copy", "(ZIILcom/blaze/blazesdk/style/shared/models/BlazeDp;ILjava/lang/Integer;ZLcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)Lcom/blaze/blazesdk/style/players/BlazeSeekBarStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "setVisible", "(Z)V", "I", "getBackgroundColor", "setBackgroundColor", "(I)V", "getProgressColor", "setProgressColor", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getCornerRadius", "setCornerRadius", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getThumbColor", "setThumbColor", "Ljava/lang/Integer;", "getThumbImageResId", "setThumbImageResId", "(Ljava/lang/Integer;)V", "setThumbVisible", "getHeight", "setHeight", "getThumbSize", "setThumbSize", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeSeekBarStyle implements BlazeParcelable {
    private int backgroundColor;

    @NotNull
    private BlazeDp cornerRadius;

    @NotNull
    private BlazeDp height;
    private boolean isThumbVisible;
    private boolean isVisible;
    private int progressColor;
    private int thumbColor;

    @Nullable
    private Integer thumbImageResId;

    @NotNull
    private BlazeDp thumbSize;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeSeekBarStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.BlazeSeekBarStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            parcel.getClass();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            int readInt = parcel.readInt();
            boolean z4 = z2;
            int readInt2 = parcel.readInt();
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            BlazeDp createFromParcel = creator.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                z = z4;
            }
            return new BlazeSeekBarStyle(z3, readInt, readInt2, createFromParcel, readInt3, valueOf, z, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeSeekBarStyle[i];
        }
    }

    public BlazeSeekBarStyle(boolean z, int i, int i2, @NotNull BlazeDp blazeDp, int i3, @Nullable Integer num, boolean z2, @NotNull BlazeDp blazeDp2, @NotNull BlazeDp blazeDp3) {
        blazeDp.getClass();
        blazeDp2.getClass();
        blazeDp3.getClass();
        this.isVisible = z;
        this.backgroundColor = i;
        this.progressColor = i2;
        this.cornerRadius = blazeDp;
        this.thumbColor = i3;
        this.thumbImageResId = num;
        this.isThumbVisible = z2;
        this.height = blazeDp2;
        this.thumbSize = blazeDp3;
    }

    public static /* synthetic */ BlazeSeekBarStyle copy$default(BlazeSeekBarStyle blazeSeekBarStyle, boolean z, int i, int i2, BlazeDp blazeDp, int i3, Integer num, boolean z2, BlazeDp blazeDp2, BlazeDp blazeDp3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = blazeSeekBarStyle.isVisible;
        }
        if ((i4 & 2) != 0) {
            i = blazeSeekBarStyle.backgroundColor;
        }
        if ((i4 & 4) != 0) {
            i2 = blazeSeekBarStyle.progressColor;
        }
        if ((i4 & 8) != 0) {
            blazeDp = blazeSeekBarStyle.cornerRadius;
        }
        if ((i4 & 16) != 0) {
            i3 = blazeSeekBarStyle.thumbColor;
        }
        if ((i4 & 32) != 0) {
            num = blazeSeekBarStyle.thumbImageResId;
        }
        if ((i4 & 64) != 0) {
            z2 = blazeSeekBarStyle.isThumbVisible;
        }
        if ((i4 & 128) != 0) {
            blazeDp2 = blazeSeekBarStyle.height;
        }
        if ((i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            blazeDp3 = blazeSeekBarStyle.thumbSize;
        }
        BlazeDp blazeDp4 = blazeDp2;
        BlazeDp blazeDp5 = blazeDp3;
        Integer num2 = num;
        boolean z3 = z2;
        int i5 = i3;
        int i6 = i2;
        return blazeSeekBarStyle.copy(z, i, i6, blazeDp, i5, num2, z3, blazeDp4, blazeDp5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProgressColor() {
        return this.progressColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component5, reason: from getter */
    public final int getThumbColor() {
        return this.thumbColor;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getThumbImageResId() {
        return this.thumbImageResId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsThumbVisible() {
        return this.isThumbVisible;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeDp getHeight() {
        return this.height;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final BlazeDp getThumbSize() {
        return this.thumbSize;
    }

    @NotNull
    public final BlazeSeekBarStyle copy(boolean isVisible, int backgroundColor, int progressColor, @NotNull BlazeDp cornerRadius, int thumbColor, @Nullable Integer thumbImageResId, boolean isThumbVisible, @NotNull BlazeDp height, @NotNull BlazeDp thumbSize) {
        cornerRadius.getClass();
        height.getClass();
        thumbSize.getClass();
        return new BlazeSeekBarStyle(isVisible, backgroundColor, progressColor, cornerRadius, thumbColor, thumbImageResId, isThumbVisible, height, thumbSize);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeSeekBarStyle)) {
            return false;
        }
        BlazeSeekBarStyle blazeSeekBarStyle = (BlazeSeekBarStyle) other;
        return this.isVisible == blazeSeekBarStyle.isVisible && this.backgroundColor == blazeSeekBarStyle.backgroundColor && this.progressColor == blazeSeekBarStyle.progressColor && Intrinsics.c(this.cornerRadius, blazeSeekBarStyle.cornerRadius) && this.thumbColor == blazeSeekBarStyle.thumbColor && Intrinsics.c(this.thumbImageResId, blazeSeekBarStyle.thumbImageResId) && this.isThumbVisible == blazeSeekBarStyle.isThumbVisible && Intrinsics.c(this.height, blazeSeekBarStyle.height) && Intrinsics.c(this.thumbSize, blazeSeekBarStyle.thumbSize);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final BlazeDp getHeight() {
        return this.height;
    }

    public final int getProgressColor() {
        return this.progressColor;
    }

    public final int getThumbColor() {
        return this.thumbColor;
    }

    @Nullable
    public final Integer getThumbImageResId() {
        return this.thumbImageResId;
    }

    @NotNull
    public final BlazeDp getThumbSize() {
        return this.thumbSize;
    }

    public int hashCode() {
        int e = l4a.e(this.thumbColor, s6a.n(this.cornerRadius, l4a.e(this.progressColor, l4a.e(this.backgroundColor, Boolean.hashCode(this.isVisible) * 31))));
        Integer num = this.thumbImageResId;
        return this.thumbSize.hashCode() + s6a.n(this.height, u0a.t((e + (num == null ? 0 : num.hashCode())) * 31, this.isThumbVisible));
    }

    public final boolean isThumbVisible() {
        return this.isThumbVisible;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setCornerRadius(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.cornerRadius = blazeDp;
    }

    public final void setHeight(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.height = blazeDp;
    }

    public final void setProgressColor(int i) {
        this.progressColor = i;
    }

    public final void setThumbColor(int i) {
        this.thumbColor = i;
    }

    public final void setThumbImageResId(@Nullable Integer num) {
        this.thumbImageResId = num;
    }

    public final void setThumbSize(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.thumbSize = blazeDp;
    }

    public final void setThumbVisible(boolean z) {
        this.isThumbVisible = z;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeSeekBarStyle(isVisible=" + this.isVisible + ", backgroundColor=" + this.backgroundColor + ", progressColor=" + this.progressColor + ", cornerRadius=" + this.cornerRadius + ", thumbColor=" + this.thumbColor + ", thumbImageResId=" + this.thumbImageResId + ", isThumbVisible=" + this.isThumbVisible + ", height=" + this.height + ", thumbSize=" + this.thumbSize + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        dest.writeInt(this.backgroundColor);
        dest.writeInt(this.progressColor);
        this.cornerRadius.writeToParcel(dest, flags);
        dest.writeInt(this.thumbColor);
        Integer num = this.thumbImageResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        dest.writeInt(this.isThumbVisible ? 1 : 0);
        this.height.writeToParcel(dest, flags);
        this.thumbSize.writeToParcel(dest, flags);
    }
}
