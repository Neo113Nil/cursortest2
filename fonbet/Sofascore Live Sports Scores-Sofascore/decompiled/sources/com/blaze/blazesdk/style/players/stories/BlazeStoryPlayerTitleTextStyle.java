package com.blaze.blazesdk.style.players.stories;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.IPlayerItemTextStyle;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import defpackage.b6a;
import defpackage.g7a;
import defpackage.l4a;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0000\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J8\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u0004J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006."}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerTitleTextStyle;", "Lcom/blaze/blazesdk/style/players/IPlayerItemTextStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "fontResId", "", "textSize", "", "textColor", C4018c8.k, "", "<init>", "(Ljava/lang/Integer;FIZ)V", "getFontResId", "()Ljava/lang/Integer;", "setFontResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTextSize", "()F", "setTextSize", "(F)V", "getTextColor", "()I", "setTextColor", "(I)V", "()Z", "setVisible", "(Z)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;FIZ)Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerTitleTextStyle;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeStoryPlayerTitleTextStyle implements IPlayerItemTextStyle, BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeStoryPlayerTitleTextStyle> CREATOR = new a();

    @Nullable
    private Integer fontResId;
    private boolean isVisible;
    private int textColor;
    private float textSize;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeStoryPlayerTitleTextStyle(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeStoryPlayerTitleTextStyle[i];
        }
    }

    public BlazeStoryPlayerTitleTextStyle(@Nullable Integer num, float f, int i, boolean z) {
        this.fontResId = num;
        this.textSize = f;
        this.textColor = i;
        this.isVisible = z;
    }

    public static /* synthetic */ BlazeStoryPlayerTitleTextStyle copy$default(BlazeStoryPlayerTitleTextStyle blazeStoryPlayerTitleTextStyle, Integer num, float f, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = blazeStoryPlayerTitleTextStyle.fontResId;
        }
        if ((i2 & 2) != 0) {
            f = blazeStoryPlayerTitleTextStyle.textSize;
        }
        if ((i2 & 4) != 0) {
            i = blazeStoryPlayerTitleTextStyle.textColor;
        }
        if ((i2 & 8) != 0) {
            z = blazeStoryPlayerTitleTextStyle.isVisible;
        }
        return blazeStoryPlayerTitleTextStyle.copy(num, f, i, z);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getFontResId() {
        return this.fontResId;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public final BlazeStoryPlayerTitleTextStyle copy(@Nullable Integer fontResId, float textSize, int textColor, boolean isVisible) {
        return new BlazeStoryPlayerTitleTextStyle(fontResId, textSize, textColor, isVisible);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeStoryPlayerTitleTextStyle)) {
            return false;
        }
        BlazeStoryPlayerTitleTextStyle blazeStoryPlayerTitleTextStyle = (BlazeStoryPlayerTitleTextStyle) other;
        return Intrinsics.c(this.fontResId, blazeStoryPlayerTitleTextStyle.fontResId) && Float.compare(this.textSize, blazeStoryPlayerTitleTextStyle.textSize) == 0 && this.textColor == blazeStoryPlayerTitleTextStyle.textColor && this.isVisible == blazeStoryPlayerTitleTextStyle.isVisible;
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
        Integer num = this.fontResId;
        return Boolean.hashCode(this.isVisible) + l4a.e(this.textColor, g7a.o(this.textSize, (num == null ? 0 : num.hashCode()) * 31));
    }

    public final boolean isVisible() {
        return this.isVisible;
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

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeStoryPlayerTitleTextStyle(fontResId=");
        sb.append(this.fontResId);
        sb.append(", textSize=");
        sb.append(this.textSize);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", isVisible=");
        return lnb.r(sb, this.isVisible, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Integer num = this.fontResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        dest.writeFloat(this.textSize);
        dest.writeInt(this.textColor);
        dest.writeInt(this.isVisible ? 1 : 0);
    }
}
