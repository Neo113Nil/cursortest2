package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.IPlayerItemTextStyle;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.C4018c8;
import defpackage.b6a;
import defpackage.g7a;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.l4a;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00019B?\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0004HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003JL\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u0006J\u0013\u0010.\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0006HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001a¨\u0006:"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/players/IPlayerItemTextStyle;", C4018c8.k, "", "fontResId", "", "textColor", "textSize", "", "contentSource", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle$BlazeContentSource;", "maxLines", "<init>", "(ZLjava/lang/Integer;IFLcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle$BlazeContentSource;I)V", "()Z", "setVisible", "(Z)V", "getFontResId", "()Ljava/lang/Integer;", "setFontResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTextColor", "()I", "setTextColor", "(I)V", "getTextSize", "()F", "setTextSize", "(F)V", "getContentSource", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle$BlazeContentSource;", "setContentSource", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle$BlazeContentSource;)V", "getMaxLines", "setMaxLines", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;IFLcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle$BlazeContentSource;I)Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeContentSource", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerHeadingTextStyle implements BlazeParcelable, IPlayerItemTextStyle {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerHeadingTextStyle> CREATOR = new a();

    @NotNull
    private BlazeContentSource contentSource;

    @Nullable
    private Integer fontResId;
    private boolean isVisible;
    private int maxLines;
    private int textColor;
    private float textSize;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerHeadingTextStyle$BlazeContentSource;", "", "<init>", "(Ljava/lang/String;I)V", NativeAdContent.ViewTag.AD_TITLE, "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlazeContentSource {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeContentSource[] $VALUES;
        public static final BlazeContentSource TITLE = new BlazeContentSource(NativeAdContent.ViewTag.AD_TITLE, 0);

        private static final /* synthetic */ BlazeContentSource[] $values() {
            return new BlazeContentSource[]{TITLE};
        }

        static {
            BlazeContentSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private BlazeContentSource(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeContentSource valueOf(String str) {
            return (BlazeContentSource) Enum.valueOf(BlazeContentSource.class, str);
        }

        public static BlazeContentSource[] values() {
            return (BlazeContentSource[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeVideosPlayerHeadingTextStyle(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readFloat(), BlazeContentSource.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerHeadingTextStyle[i];
        }
    }

    public BlazeVideosPlayerHeadingTextStyle(boolean z, @Nullable Integer num, int i, float f, @NotNull BlazeContentSource blazeContentSource, int i2) {
        blazeContentSource.getClass();
        this.isVisible = z;
        this.fontResId = num;
        this.textColor = i;
        this.textSize = f;
        this.contentSource = blazeContentSource;
        this.maxLines = i2;
    }

    public static /* synthetic */ BlazeVideosPlayerHeadingTextStyle copy$default(BlazeVideosPlayerHeadingTextStyle blazeVideosPlayerHeadingTextStyle, boolean z, Integer num, int i, float f, BlazeContentSource blazeContentSource, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = blazeVideosPlayerHeadingTextStyle.isVisible;
        }
        if ((i3 & 2) != 0) {
            num = blazeVideosPlayerHeadingTextStyle.fontResId;
        }
        if ((i3 & 4) != 0) {
            i = blazeVideosPlayerHeadingTextStyle.textColor;
        }
        if ((i3 & 8) != 0) {
            f = blazeVideosPlayerHeadingTextStyle.textSize;
        }
        if ((i3 & 16) != 0) {
            blazeContentSource = blazeVideosPlayerHeadingTextStyle.contentSource;
        }
        if ((i3 & 32) != 0) {
            i2 = blazeVideosPlayerHeadingTextStyle.maxLines;
        }
        BlazeContentSource blazeContentSource2 = blazeContentSource;
        int i4 = i2;
        return blazeVideosPlayerHeadingTextStyle.copy(z, num, i, f, blazeContentSource2, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getFontResId() {
        return this.fontResId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeContentSource getContentSource() {
        return this.contentSource;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    @NotNull
    public final BlazeVideosPlayerHeadingTextStyle copy(boolean isVisible, @Nullable Integer fontResId, int textColor, float textSize, @NotNull BlazeContentSource contentSource, int maxLines) {
        contentSource.getClass();
        return new BlazeVideosPlayerHeadingTextStyle(isVisible, fontResId, textColor, textSize, contentSource, maxLines);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerHeadingTextStyle)) {
            return false;
        }
        BlazeVideosPlayerHeadingTextStyle blazeVideosPlayerHeadingTextStyle = (BlazeVideosPlayerHeadingTextStyle) other;
        return this.isVisible == blazeVideosPlayerHeadingTextStyle.isVisible && Intrinsics.c(this.fontResId, blazeVideosPlayerHeadingTextStyle.fontResId) && this.textColor == blazeVideosPlayerHeadingTextStyle.textColor && Float.compare(this.textSize, blazeVideosPlayerHeadingTextStyle.textSize) == 0 && this.contentSource == blazeVideosPlayerHeadingTextStyle.contentSource && this.maxLines == blazeVideosPlayerHeadingTextStyle.maxLines;
    }

    @NotNull
    public final BlazeContentSource getContentSource() {
        return this.contentSource;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemTextStyle
    @Nullable
    public Integer getFontResId() {
        return this.fontResId;
    }

    public final int getMaxLines() {
        return this.maxLines;
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
        int hashCode = Boolean.hashCode(this.isVisible) * 31;
        Integer num = this.fontResId;
        return Integer.hashCode(this.maxLines) + ((this.contentSource.hashCode() + g7a.o(this.textSize, l4a.e(this.textColor, (hashCode + (num == null ? 0 : num.hashCode())) * 31))) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setContentSource(@NotNull BlazeContentSource blazeContentSource) {
        blazeContentSource.getClass();
        this.contentSource = blazeContentSource;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemTextStyle
    public void setFontResId(@Nullable Integer num) {
        this.fontResId = num;
    }

    public final void setMaxLines(int i) {
        this.maxLines = i;
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
        StringBuilder sb = new StringBuilder("BlazeVideosPlayerHeadingTextStyle(isVisible=");
        sb.append(this.isVisible);
        sb.append(", fontResId=");
        sb.append(this.fontResId);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", textSize=");
        sb.append(this.textSize);
        sb.append(", contentSource=");
        sb.append(this.contentSource);
        sb.append(", maxLines=");
        return wv8.j(sb, this.maxLines, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        Integer num = this.fontResId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        dest.writeInt(this.textColor);
        dest.writeFloat(this.textSize);
        dest.writeString(this.contentSource.name());
        dest.writeInt(this.maxLines);
    }
}
