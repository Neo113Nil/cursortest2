package com.blaze.blazesdk.style.players;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.b6a;
import defpackage.g7a;
import defpackage.l4a;
import defpackage.s6a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0001HBS\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010!Jd\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u00100R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u00104R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u00104R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010:R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010>R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010!\"\u0004\bA\u0010BR\"\u0010\f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010?\u001a\u0004\bC\u0010!\"\u0004\bD\u0010BR$\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010?\u001a\u0004\bE\u0010!\"\u0004\bF\u0010B¨\u0006I"}, d2 = {"Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideCTAStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "", "title", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "textColorResId", "", "textSize", "fontResId", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "cornerRadius", "height", "width", "<init>", "(Ljava/lang/String;IIFLjava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()F", "component5", "()Ljava/lang/Integer;", "component6", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "component7", "component8", "copy", "(Ljava/lang/String;IIFLjava/lang/Integer;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideCTAStyle;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "I", "getBackgroundColor", "setBackgroundColor", "(I)V", "getTextColorResId", "setTextColorResId", "F", "getTextSize", "setTextSize", "(F)V", "Ljava/lang/Integer;", "getFontResId", "setFontResId", "(Ljava/lang/Integer;)V", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getCornerRadius", "setCornerRadius", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getHeight", "setHeight", "getWidth", "setWidth", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeFirstTimeSlideCTAStyle implements BlazeParcelable {
    private int backgroundColor;

    @NotNull
    private BlazeDp cornerRadius;

    @Nullable
    private Integer fontResId;

    @NotNull
    private BlazeDp height;
    private int textColorResId;
    private float textSize;

    @NotNull
    private String title;

    @Nullable
    private BlazeDp width;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeFirstTimeSlideCTAStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.BlazeFirstTimeSlideCTAStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            float readFloat = parcel.readFloat();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            return new BlazeFirstTimeSlideCTAStyle(readString, readInt, readInt2, readFloat, valueOf, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeFirstTimeSlideCTAStyle[i];
        }
    }

    public BlazeFirstTimeSlideCTAStyle(@NotNull String str, int i, int i2, float f, @Nullable Integer num, @NotNull BlazeDp blazeDp, @NotNull BlazeDp blazeDp2, @Nullable BlazeDp blazeDp3) {
        str.getClass();
        blazeDp.getClass();
        blazeDp2.getClass();
        this.title = str;
        this.backgroundColor = i;
        this.textColorResId = i2;
        this.textSize = f;
        this.fontResId = num;
        this.cornerRadius = blazeDp;
        this.height = blazeDp2;
        this.width = blazeDp3;
    }

    public static /* synthetic */ BlazeFirstTimeSlideCTAStyle copy$default(BlazeFirstTimeSlideCTAStyle blazeFirstTimeSlideCTAStyle, String str, int i, int i2, float f, Integer num, BlazeDp blazeDp, BlazeDp blazeDp2, BlazeDp blazeDp3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = blazeFirstTimeSlideCTAStyle.title;
        }
        if ((i3 & 2) != 0) {
            i = blazeFirstTimeSlideCTAStyle.backgroundColor;
        }
        if ((i3 & 4) != 0) {
            i2 = blazeFirstTimeSlideCTAStyle.textColorResId;
        }
        if ((i3 & 8) != 0) {
            f = blazeFirstTimeSlideCTAStyle.textSize;
        }
        if ((i3 & 16) != 0) {
            num = blazeFirstTimeSlideCTAStyle.fontResId;
        }
        if ((i3 & 32) != 0) {
            blazeDp = blazeFirstTimeSlideCTAStyle.cornerRadius;
        }
        if ((i3 & 64) != 0) {
            blazeDp2 = blazeFirstTimeSlideCTAStyle.height;
        }
        if ((i3 & 128) != 0) {
            blazeDp3 = blazeFirstTimeSlideCTAStyle.width;
        }
        BlazeDp blazeDp4 = blazeDp2;
        BlazeDp blazeDp5 = blazeDp3;
        Integer num2 = num;
        BlazeDp blazeDp6 = blazeDp;
        return blazeFirstTimeSlideCTAStyle.copy(str, i, i2, f, num2, blazeDp6, blazeDp4, blazeDp5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTextColorResId() {
        return this.textColorResId;
    }

    /* renamed from: component4, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getFontResId() {
        return this.fontResId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeDp getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeDp getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final BlazeDp getWidth() {
        return this.width;
    }

    @NotNull
    public final BlazeFirstTimeSlideCTAStyle copy(@NotNull String title, int backgroundColor, int textColorResId, float textSize, @Nullable Integer fontResId, @NotNull BlazeDp cornerRadius, @NotNull BlazeDp height, @Nullable BlazeDp width) {
        title.getClass();
        cornerRadius.getClass();
        height.getClass();
        return new BlazeFirstTimeSlideCTAStyle(title, backgroundColor, textColorResId, textSize, fontResId, cornerRadius, height, width);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeFirstTimeSlideCTAStyle)) {
            return false;
        }
        BlazeFirstTimeSlideCTAStyle blazeFirstTimeSlideCTAStyle = (BlazeFirstTimeSlideCTAStyle) other;
        return Intrinsics.c(this.title, blazeFirstTimeSlideCTAStyle.title) && this.backgroundColor == blazeFirstTimeSlideCTAStyle.backgroundColor && this.textColorResId == blazeFirstTimeSlideCTAStyle.textColorResId && Float.compare(this.textSize, blazeFirstTimeSlideCTAStyle.textSize) == 0 && Intrinsics.c(this.fontResId, blazeFirstTimeSlideCTAStyle.fontResId) && Intrinsics.c(this.cornerRadius, blazeFirstTimeSlideCTAStyle.cornerRadius) && Intrinsics.c(this.height, blazeFirstTimeSlideCTAStyle.height) && Intrinsics.c(this.width, blazeFirstTimeSlideCTAStyle.width);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
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

    public final int getTextColorResId() {
        return this.textColorResId;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final BlazeDp getWidth() {
        return this.width;
    }

    public int hashCode() {
        int o = g7a.o(this.textSize, l4a.e(this.textColorResId, l4a.e(this.backgroundColor, this.title.hashCode() * 31)));
        Integer num = this.fontResId;
        int n = s6a.n(this.height, s6a.n(this.cornerRadius, (o + (num == null ? 0 : num.hashCode())) * 31));
        BlazeDp blazeDp = this.width;
        return n + (blazeDp != null ? blazeDp.hashCode() : 0);
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
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

    public final void setTextColorResId(int i) {
        this.textColorResId = i;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    public final void setTitle(@NotNull String str) {
        str.getClass();
        this.title = str;
    }

    public final void setWidth(@Nullable BlazeDp blazeDp) {
        this.width = blazeDp;
    }

    @NotNull
    public String toString() {
        return "BlazeFirstTimeSlideCTAStyle(title=" + this.title + ", backgroundColor=" + this.backgroundColor + ", textColorResId=" + this.textColorResId + ", textSize=" + this.textSize + ", fontResId=" + this.fontResId + ", cornerRadius=" + this.cornerRadius + ", height=" + this.height + ", width=" + this.width + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.title);
        dest.writeInt(this.backgroundColor);
        dest.writeInt(this.textColorResId);
        dest.writeFloat(this.textSize);
        Integer num = this.fontResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        this.cornerRadius.writeToParcel(dest, flags);
        this.height.writeToParcel(dest, flags);
        BlazeDp blazeDp = this.width;
        if (blazeDp == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeDp.writeToParcel(dest, flags);
        }
    }
}
