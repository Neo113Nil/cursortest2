package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.b6a;
import defpackage.g7a;
import defpackage.l4a;
import defpackage.wt3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003JZ\u0010/\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020\u0003J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001b¨\u0006>"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "fontResId", "", "letterSpacing", "", "textColor", "textSize", "lineHeight", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "maxLines", "gravity", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;IFLcom/blaze/blazesdk/style/shared/models/BlazeDp;II)V", "getFontResId", "()Ljava/lang/Integer;", "setFontResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLetterSpacing", "()Ljava/lang/Float;", "setLetterSpacing", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getTextColor", "()I", "setTextColor", "(I)V", "getTextSize", "()F", "setTextSize", "(F)V", "getLineHeight", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setLineHeight", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getMaxLines", "setMaxLines", "getGravity", "setGravity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Float;IFLcom/blaze/blazesdk/style/shared/models/BlazeDp;II)Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemTextStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemTextStyle> CREATOR = new a();

    @Nullable
    private Integer fontResId;
    private int gravity;

    @Nullable
    private Float letterSpacing;

    @Nullable
    private BlazeDp lineHeight;
    private int maxLines;
    private int textColor;
    private float textSize;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeWidgetItemTextStyle(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt(), parcel.readFloat(), parcel.readInt() != 0 ? BlazeDp.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemTextStyle[i];
        }
    }

    public BlazeWidgetItemTextStyle(@Nullable Integer num, @Nullable Float f, int i, float f2, @Nullable BlazeDp blazeDp, int i2, int i3) {
        this.fontResId = num;
        this.letterSpacing = f;
        this.textColor = i;
        this.textSize = f2;
        this.lineHeight = blazeDp;
        this.maxLines = i2;
        this.gravity = i3;
    }

    public static /* synthetic */ BlazeWidgetItemTextStyle copy$default(BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, Integer num, Float f, int i, float f2, BlazeDp blazeDp, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = blazeWidgetItemTextStyle.fontResId;
        }
        if ((i4 & 2) != 0) {
            f = blazeWidgetItemTextStyle.letterSpacing;
        }
        if ((i4 & 4) != 0) {
            i = blazeWidgetItemTextStyle.textColor;
        }
        if ((i4 & 8) != 0) {
            f2 = blazeWidgetItemTextStyle.textSize;
        }
        if ((i4 & 16) != 0) {
            blazeDp = blazeWidgetItemTextStyle.lineHeight;
        }
        if ((i4 & 32) != 0) {
            i2 = blazeWidgetItemTextStyle.maxLines;
        }
        if ((i4 & 64) != 0) {
            i3 = blazeWidgetItemTextStyle.gravity;
        }
        int i5 = i2;
        int i6 = i3;
        BlazeDp blazeDp2 = blazeDp;
        int i7 = i;
        return blazeWidgetItemTextStyle.copy(num, f, i7, f2, blazeDp2, i5, i6);
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

    /* renamed from: component6, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component7, reason: from getter */
    public final int getGravity() {
        return this.gravity;
    }

    @NotNull
    public final BlazeWidgetItemTextStyle copy(@Nullable Integer fontResId, @Nullable Float letterSpacing, int textColor, float textSize, @Nullable BlazeDp lineHeight, int maxLines, int gravity) {
        return new BlazeWidgetItemTextStyle(fontResId, letterSpacing, textColor, textSize, lineHeight, maxLines, gravity);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemTextStyle)) {
            return false;
        }
        BlazeWidgetItemTextStyle blazeWidgetItemTextStyle = (BlazeWidgetItemTextStyle) other;
        return Intrinsics.c(this.fontResId, blazeWidgetItemTextStyle.fontResId) && Intrinsics.c(this.letterSpacing, blazeWidgetItemTextStyle.letterSpacing) && this.textColor == blazeWidgetItemTextStyle.textColor && Float.compare(this.textSize, blazeWidgetItemTextStyle.textSize) == 0 && Intrinsics.c(this.lineHeight, blazeWidgetItemTextStyle.lineHeight) && this.maxLines == blazeWidgetItemTextStyle.maxLines && this.gravity == blazeWidgetItemTextStyle.gravity;
    }

    @Nullable
    public final Integer getFontResId() {
        return this.fontResId;
    }

    public final int getGravity() {
        return this.gravity;
    }

    @Nullable
    public final Float getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    public final BlazeDp getLineHeight() {
        return this.lineHeight;
    }

    public final int getMaxLines() {
        return this.maxLines;
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
        return Integer.hashCode(this.gravity) + l4a.e(this.maxLines, (o + (blazeDp != null ? blazeDp.hashCode() : 0)) * 31);
    }

    public final void setFontResId(@Nullable Integer num) {
        this.fontResId = num;
    }

    public final void setGravity(int i) {
        this.gravity = i;
    }

    public final void setLetterSpacing(@Nullable Float f) {
        this.letterSpacing = f;
    }

    public final void setLineHeight(@Nullable BlazeDp blazeDp) {
        this.lineHeight = blazeDp;
    }

    public final void setMaxLines(int i) {
        this.maxLines = i;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeWidgetItemTextStyle(fontResId=");
        sb.append(this.fontResId);
        sb.append(", letterSpacing=");
        sb.append(this.letterSpacing);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", textSize=");
        sb.append(this.textSize);
        sb.append(", lineHeight=");
        sb.append(this.lineHeight);
        sb.append(", maxLines=");
        sb.append(this.maxLines);
        sb.append(", gravity=");
        return wv8.j(sb, this.gravity, ')');
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
        dest.writeInt(this.maxLines);
        dest.writeInt(this.gravity);
    }
}
