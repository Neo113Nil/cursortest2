package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.IPlayerItemTextStyle;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.b6a;
import defpackage.bf3;
import defpackage.l4a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/players/IPlayerItemTextStyle;", "textSize", "", "textColor", "", "fontResId", "<init>", "(FILjava/lang/Integer;)V", "getTextSize", "()F", "setTextSize", "(F)V", "getTextColor", "()I", "setTextColor", "(I)V", "getFontResId", "()Ljava/lang/Integer;", "setFontResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(FILjava/lang/Integer;)Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerTextStyle;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerTextStyle implements BlazeParcelable, IPlayerItemTextStyle {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerTextStyle> CREATOR = new a();

    @Nullable
    private Integer fontResId;
    private int textColor;
    private float textSize;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeVideosPlayerTextStyle(parcel.readFloat(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerTextStyle[i];
        }
    }

    public BlazeVideosPlayerTextStyle(float f, int i, @Nullable Integer num) {
        this.textSize = f;
        this.textColor = i;
        this.fontResId = num;
    }

    public static /* synthetic */ BlazeVideosPlayerTextStyle copy$default(BlazeVideosPlayerTextStyle blazeVideosPlayerTextStyle, float f, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = blazeVideosPlayerTextStyle.textSize;
        }
        if ((i2 & 2) != 0) {
            i = blazeVideosPlayerTextStyle.textColor;
        }
        if ((i2 & 4) != 0) {
            num = blazeVideosPlayerTextStyle.fontResId;
        }
        return blazeVideosPlayerTextStyle.copy(f, i, num);
    }

    /* renamed from: component1, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getFontResId() {
        return this.fontResId;
    }

    @NotNull
    public final BlazeVideosPlayerTextStyle copy(float textSize, int textColor, @Nullable Integer fontResId) {
        return new BlazeVideosPlayerTextStyle(textSize, textColor, fontResId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerTextStyle)) {
            return false;
        }
        BlazeVideosPlayerTextStyle blazeVideosPlayerTextStyle = (BlazeVideosPlayerTextStyle) other;
        return Float.compare(this.textSize, blazeVideosPlayerTextStyle.textSize) == 0 && this.textColor == blazeVideosPlayerTextStyle.textColor && Intrinsics.c(this.fontResId, blazeVideosPlayerTextStyle.fontResId);
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemTextStyle
    @Nullable
    public Integer getFontResId() {
        return this.fontResId;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemTextStyle
    public int getTextColor() {
        return this.textColor;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemTextStyle
    public float getTextSize() {
        return this.textSize;
    }

    public int hashCode() {
        int e = l4a.e(this.textColor, Float.hashCode(this.textSize) * 31);
        Integer num = this.fontResId;
        return e + (num == null ? 0 : num.hashCode());
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemTextStyle
    public void setFontResId(@Nullable Integer num) {
        this.fontResId = num;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemTextStyle
    public void setTextColor(int i) {
        this.textColor = i;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemTextStyle
    public void setTextSize(float f) {
        this.textSize = f;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeVideosPlayerTextStyle(textSize=");
        sb.append(this.textSize);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", fontResId=");
        return bf3.n(sb, this.fontResId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeFloat(this.textSize);
        dest.writeInt(this.textColor);
        Integer num = this.fontResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
    }
}
