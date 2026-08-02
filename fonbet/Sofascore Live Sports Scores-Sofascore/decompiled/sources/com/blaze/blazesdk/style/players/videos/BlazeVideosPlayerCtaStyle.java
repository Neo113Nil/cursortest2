package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import defpackage.b6a;
import defpackage.g7a;
import defpackage.s6a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003JZ\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020\tJ\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\tHÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006="}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "cornerRadius", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "textSize", "", "fontResId", "", "width", "height", "icon", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle;", "<init>", "(ZLcom/blaze/blazesdk/style/shared/models/BlazeDp;FLjava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle;)V", "()Z", "setVisible", "(Z)V", "getCornerRadius", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setCornerRadius", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getTextSize", "()F", "setTextSize", "(F)V", "getFontResId", "()Ljava/lang/Integer;", "setFontResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getWidth", "setWidth", "getHeight", "setHeight", "getIcon", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle;", "setIcon", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLcom/blaze/blazesdk/style/shared/models/BlazeDp;FLjava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaIconStyle;)Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerCtaStyle;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerCtaStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerCtaStyle> CREATOR = new a();

    @NotNull
    private BlazeDp cornerRadius;

    @Nullable
    private Integer fontResId;

    @NotNull
    private BlazeDp height;

    @Nullable
    private BlazeVideosPlayerCtaIconStyle icon;
    private boolean isVisible;
    private float textSize;

    @Nullable
    private BlazeDp width;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            return new BlazeVideosPlayerCtaStyle(z, creator.createFromParcel(parcel), parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0 ? BlazeVideosPlayerCtaIconStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerCtaStyle[i];
        }
    }

    public BlazeVideosPlayerCtaStyle(boolean z, @NotNull BlazeDp blazeDp, float f, @Nullable Integer num, @Nullable BlazeDp blazeDp2, @NotNull BlazeDp blazeDp3, @Nullable BlazeVideosPlayerCtaIconStyle blazeVideosPlayerCtaIconStyle) {
        blazeDp.getClass();
        blazeDp3.getClass();
        this.isVisible = z;
        this.cornerRadius = blazeDp;
        this.textSize = f;
        this.fontResId = num;
        this.width = blazeDp2;
        this.height = blazeDp3;
        this.icon = blazeVideosPlayerCtaIconStyle;
    }

    public static /* synthetic */ BlazeVideosPlayerCtaStyle copy$default(BlazeVideosPlayerCtaStyle blazeVideosPlayerCtaStyle, boolean z, BlazeDp blazeDp, float f, Integer num, BlazeDp blazeDp2, BlazeDp blazeDp3, BlazeVideosPlayerCtaIconStyle blazeVideosPlayerCtaIconStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeVideosPlayerCtaStyle.isVisible;
        }
        if ((i & 2) != 0) {
            blazeDp = blazeVideosPlayerCtaStyle.cornerRadius;
        }
        if ((i & 4) != 0) {
            f = blazeVideosPlayerCtaStyle.textSize;
        }
        if ((i & 8) != 0) {
            num = blazeVideosPlayerCtaStyle.fontResId;
        }
        if ((i & 16) != 0) {
            blazeDp2 = blazeVideosPlayerCtaStyle.width;
        }
        if ((i & 32) != 0) {
            blazeDp3 = blazeVideosPlayerCtaStyle.height;
        }
        if ((i & 64) != 0) {
            blazeVideosPlayerCtaIconStyle = blazeVideosPlayerCtaStyle.icon;
        }
        BlazeDp blazeDp4 = blazeDp3;
        BlazeVideosPlayerCtaIconStyle blazeVideosPlayerCtaIconStyle2 = blazeVideosPlayerCtaIconStyle;
        BlazeDp blazeDp5 = blazeDp2;
        float f2 = f;
        return blazeVideosPlayerCtaStyle.copy(z, blazeDp, f2, num, blazeDp5, blazeDp4, blazeVideosPlayerCtaIconStyle2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getFontResId() {
        return this.fontResId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final BlazeDp getWidth() {
        return this.width;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeDp getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final BlazeVideosPlayerCtaIconStyle getIcon() {
        return this.icon;
    }

    @NotNull
    public final BlazeVideosPlayerCtaStyle copy(boolean isVisible, @NotNull BlazeDp cornerRadius, float textSize, @Nullable Integer fontResId, @Nullable BlazeDp width, @NotNull BlazeDp height, @Nullable BlazeVideosPlayerCtaIconStyle icon) {
        cornerRadius.getClass();
        height.getClass();
        return new BlazeVideosPlayerCtaStyle(isVisible, cornerRadius, textSize, fontResId, width, height, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerCtaStyle)) {
            return false;
        }
        BlazeVideosPlayerCtaStyle blazeVideosPlayerCtaStyle = (BlazeVideosPlayerCtaStyle) other;
        return this.isVisible == blazeVideosPlayerCtaStyle.isVisible && Intrinsics.c(this.cornerRadius, blazeVideosPlayerCtaStyle.cornerRadius) && Float.compare(this.textSize, blazeVideosPlayerCtaStyle.textSize) == 0 && Intrinsics.c(this.fontResId, blazeVideosPlayerCtaStyle.fontResId) && Intrinsics.c(this.width, blazeVideosPlayerCtaStyle.width) && Intrinsics.c(this.height, blazeVideosPlayerCtaStyle.height) && Intrinsics.c(this.icon, blazeVideosPlayerCtaStyle.icon);
    }

    @NotNull
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public final Integer getFontResId() {
        return this.fontResId;
    }

    @NotNull
    public final BlazeDp getHeight() {
        return this.height;
    }

    @Nullable
    public final BlazeVideosPlayerCtaIconStyle getIcon() {
        return this.icon;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @Nullable
    public final BlazeDp getWidth() {
        return this.width;
    }

    public int hashCode() {
        int o = g7a.o(this.textSize, s6a.n(this.cornerRadius, Boolean.hashCode(this.isVisible) * 31));
        Integer num = this.fontResId;
        int hashCode = (o + (num == null ? 0 : num.hashCode())) * 31;
        BlazeDp blazeDp = this.width;
        int n = s6a.n(this.height, (hashCode + (blazeDp == null ? 0 : blazeDp.hashCode())) * 31);
        BlazeVideosPlayerCtaIconStyle blazeVideosPlayerCtaIconStyle = this.icon;
        return n + (blazeVideosPlayerCtaIconStyle != null ? blazeVideosPlayerCtaIconStyle.hashCode() : 0);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setCornerRadius(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.cornerRadius = blazeDp;
    }

    public final void setFontResId(@Nullable Integer num) {
        this.fontResId = num;
    }

    public final void setHeight(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.height = blazeDp;
    }

    public final void setIcon(@Nullable BlazeVideosPlayerCtaIconStyle blazeVideosPlayerCtaIconStyle) {
        this.icon = blazeVideosPlayerCtaIconStyle;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public final void setWidth(@Nullable BlazeDp blazeDp) {
        this.width = blazeDp;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosPlayerCtaStyle(isVisible=" + this.isVisible + ", cornerRadius=" + this.cornerRadius + ", textSize=" + this.textSize + ", fontResId=" + this.fontResId + ", width=" + this.width + ", height=" + this.height + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        this.cornerRadius.writeToParcel(dest, flags);
        dest.writeFloat(this.textSize);
        Integer num = this.fontResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        BlazeDp blazeDp = this.width;
        if (blazeDp == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeDp.writeToParcel(dest, flags);
        }
        this.height.writeToParcel(dest, flags);
        BlazeVideosPlayerCtaIconStyle blazeVideosPlayerCtaIconStyle = this.icon;
        if (blazeVideosPlayerCtaIconStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeVideosPlayerCtaIconStyle.writeToParcel(dest, flags);
        }
    }
}
