package com.blaze.blazesdk.style.players.tabs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.b6a;
import defpackage.g7a;
import defpackage.l4a;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\b\u0000\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003JF\u0010'\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\u0003J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00066"}, d2 = {"Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabItemStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "fontResId", "", "letterSpacing", "", "textColor", "textSize", "lineHeight", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;IFLcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getFontResId", "()Ljava/lang/Integer;", "setFontResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLetterSpacing", "()Ljava/lang/Float;", "setLetterSpacing", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getTextColor", "()I", "setTextColor", "(I)V", "getTextSize", "()F", "setTextSize", "(F)V", "getLineHeight", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setLineHeight", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Float;IFLcom/blaze/blazesdk/style/shared/models/BlazeDp;)Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabItemStyle;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazePlayerTabItemStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazePlayerTabItemStyle> CREATOR = new a();

    @Nullable
    private Integer fontResId;

    @Nullable
    private Float letterSpacing;

    @Nullable
    private BlazeDp lineHeight;
    private int textColor;
    private float textSize;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazePlayerTabItemStyle(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt(), parcel.readFloat(), parcel.readInt() != 0 ? BlazeDp.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazePlayerTabItemStyle[i];
        }
    }

    public BlazePlayerTabItemStyle(@Nullable Integer num, @Nullable Float f, int i, float f2, @Nullable BlazeDp blazeDp) {
        this.fontResId = num;
        this.letterSpacing = f;
        this.textColor = i;
        this.textSize = f2;
        this.lineHeight = blazeDp;
    }

    public static /* synthetic */ BlazePlayerTabItemStyle copy$default(BlazePlayerTabItemStyle blazePlayerTabItemStyle, Integer num, Float f, int i, float f2, BlazeDp blazeDp, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = blazePlayerTabItemStyle.fontResId;
        }
        if ((i2 & 2) != 0) {
            f = blazePlayerTabItemStyle.letterSpacing;
        }
        if ((i2 & 4) != 0) {
            i = blazePlayerTabItemStyle.textColor;
        }
        if ((i2 & 8) != 0) {
            f2 = blazePlayerTabItemStyle.textSize;
        }
        if ((i2 & 16) != 0) {
            blazeDp = blazePlayerTabItemStyle.lineHeight;
        }
        BlazeDp blazeDp2 = blazeDp;
        int i3 = i;
        return blazePlayerTabItemStyle.copy(num, f, i3, f2, blazeDp2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getFontResId() {
        return this.fontResId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Float getLetterSpacing() {
        return this.letterSpacing;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final BlazeDp getLineHeight() {
        return this.lineHeight;
    }

    @NotNull
    public final BlazePlayerTabItemStyle copy(@Nullable Integer fontResId, @Nullable Float letterSpacing, int textColor, float textSize, @Nullable BlazeDp lineHeight) {
        return new BlazePlayerTabItemStyle(fontResId, letterSpacing, textColor, textSize, lineHeight);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazePlayerTabItemStyle)) {
            return false;
        }
        BlazePlayerTabItemStyle blazePlayerTabItemStyle = (BlazePlayerTabItemStyle) other;
        return Intrinsics.c(this.fontResId, blazePlayerTabItemStyle.fontResId) && Intrinsics.c(this.letterSpacing, blazePlayerTabItemStyle.letterSpacing) && this.textColor == blazePlayerTabItemStyle.textColor && Float.compare(this.textSize, blazePlayerTabItemStyle.textSize) == 0 && Intrinsics.c(this.lineHeight, blazePlayerTabItemStyle.lineHeight);
    }

    @Nullable
    public final Integer getFontResId() {
        return this.fontResId;
    }

    @Nullable
    public final Float getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    public final BlazeDp getLineHeight() {
        return this.lineHeight;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public int hashCode() {
        Integer num = this.fontResId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.letterSpacing;
        int o = g7a.o(this.textSize, l4a.e(this.textColor, (hashCode + (f == null ? 0 : f.hashCode())) * 31));
        BlazeDp blazeDp = this.lineHeight;
        return o + (blazeDp != null ? blazeDp.hashCode() : 0);
    }

    public final void setFontResId(@Nullable Integer num) {
        this.fontResId = num;
    }

    public final void setLetterSpacing(@Nullable Float f) {
        this.letterSpacing = f;
    }

    public final void setLineHeight(@Nullable BlazeDp blazeDp) {
        this.lineHeight = blazeDp;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    @NotNull
    public String toString() {
        return "BlazePlayerTabItemStyle(fontResId=" + this.fontResId + ", letterSpacing=" + this.letterSpacing + ", textColor=" + this.textColor + ", textSize=" + this.textSize + ", lineHeight=" + this.lineHeight + ')';
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
        Float f = this.letterSpacing;
        if (f == null) {
            dest.writeInt(0);
        } else {
            wt3.w(dest, 1, f);
        }
        dest.writeInt(this.textColor);
        dest.writeFloat(this.textSize);
        BlazeDp blazeDp = this.lineHeight;
        if (blazeDp == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeDp.writeToParcel(dest, flags);
        }
    }
}
