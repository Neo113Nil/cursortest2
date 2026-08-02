package com.blaze.blazesdk.style.players.moments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.l4a;
import defpackage.lnb;
import defpackage.o6a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00017B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010(R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010,R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u00100R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u00100R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00103\u001a\u0004\b\n\u0010\u001c\"\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerChipStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "padding", "", "text", "", "textColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", C4018c8.k, "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Ljava/lang/String;IIZ)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Z", "copy", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Ljava/lang/String;IIZ)Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerChipStyle;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "getPadding", "setPadding", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "Ljava/lang/String;", "getText", "setText", "(Ljava/lang/String;)V", "I", "getTextColor", "setTextColor", "(I)V", "getBackgroundColor", "setBackgroundColor", "Z", "setVisible", "(Z)V", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeMomentsPlayerChipStyle implements BlazeParcelable {
    private int backgroundColor;
    private boolean isVisible;

    @NotNull
    private BlazeInsets padding;

    @NotNull
    private String text;
    private int textColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerChipStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerChipStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeMomentsPlayerChipStyle(BlazeInsets.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerChipStyle[i];
        }
    }

    public BlazeMomentsPlayerChipStyle(@NotNull BlazeInsets blazeInsets, @NotNull String str, int i, int i2, boolean z) {
        blazeInsets.getClass();
        str.getClass();
        this.padding = blazeInsets;
        this.text = str;
        this.textColor = i;
        this.backgroundColor = i2;
        this.isVisible = z;
    }

    public static /* synthetic */ BlazeMomentsPlayerChipStyle copy$default(BlazeMomentsPlayerChipStyle blazeMomentsPlayerChipStyle, BlazeInsets blazeInsets, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            blazeInsets = blazeMomentsPlayerChipStyle.padding;
        }
        if ((i3 & 2) != 0) {
            str = blazeMomentsPlayerChipStyle.text;
        }
        if ((i3 & 4) != 0) {
            i = blazeMomentsPlayerChipStyle.textColor;
        }
        if ((i3 & 8) != 0) {
            i2 = blazeMomentsPlayerChipStyle.backgroundColor;
        }
        if ((i3 & 16) != 0) {
            z = blazeMomentsPlayerChipStyle.isVisible;
        }
        boolean z2 = z;
        int i4 = i;
        return blazeMomentsPlayerChipStyle.copy(blazeInsets, str, i4, i2, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public final BlazeMomentsPlayerChipStyle copy(@NotNull BlazeInsets padding, @NotNull String text, int textColor, int backgroundColor, boolean isVisible) {
        padding.getClass();
        text.getClass();
        return new BlazeMomentsPlayerChipStyle(padding, text, textColor, backgroundColor, isVisible);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerChipStyle)) {
            return false;
        }
        BlazeMomentsPlayerChipStyle blazeMomentsPlayerChipStyle = (BlazeMomentsPlayerChipStyle) other;
        return Intrinsics.c(this.padding, blazeMomentsPlayerChipStyle.padding) && Intrinsics.c(this.text, blazeMomentsPlayerChipStyle.text) && this.textColor == blazeMomentsPlayerChipStyle.textColor && this.backgroundColor == blazeMomentsPlayerChipStyle.backgroundColor && this.isVisible == blazeMomentsPlayerChipStyle.isVisible;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVisible) + l4a.e(this.backgroundColor, l4a.e(this.textColor, o6a.k(this.text, this.padding.hashCode() * 31)));
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setPadding(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.padding = blazeInsets;
    }

    public final void setText(@NotNull String str) {
        str.getClass();
        this.text = str;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeMomentsPlayerChipStyle(padding=");
        sb.append(this.padding);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", isVisible=");
        return lnb.r(sb, this.isVisible, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.padding.writeToParcel(dest, flags);
        dest.writeString(this.text);
        dest.writeInt(this.textColor);
        dest.writeInt(this.backgroundColor);
        dest.writeInt(this.isVisible ? 1 : 0);
    }
}
