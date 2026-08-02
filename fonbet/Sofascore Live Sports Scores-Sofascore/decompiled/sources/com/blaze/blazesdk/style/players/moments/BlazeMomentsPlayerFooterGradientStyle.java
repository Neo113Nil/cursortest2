package com.blaze.blazesdk.style.players.moments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.IPlayerGradientStyle;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.l4a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001*B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0006J\u0013\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFooterGradientStyle;", "Lcom/blaze/blazesdk/style/players/IPlayerGradientStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "startColor", "", "endColor", "endPositioning", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFooterGradientStyle$BlazeEndPositioning;", "<init>", "(ZIILcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFooterGradientStyle$BlazeEndPositioning;)V", "()Z", "setVisible", "(Z)V", "getStartColor", "()I", "setStartColor", "(I)V", "getEndColor", "setEndColor", "getEndPositioning", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFooterGradientStyle$BlazeEndPositioning;", "setEndPositioning", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFooterGradientStyle$BlazeEndPositioning;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeEndPositioning", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeMomentsPlayerFooterGradientStyle implements IPlayerGradientStyle, BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerFooterGradientStyle> CREATOR = new a();
    private int endColor;

    @NotNull
    private BlazeEndPositioning endPositioning;
    private boolean isVisible;
    private int startColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFooterGradientStyle$BlazeEndPositioning;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOM_TO_PLAYER", "BOTTOM_TO_CONTAINER", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class BlazeEndPositioning {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeEndPositioning[] $VALUES;
        public static final BlazeEndPositioning BOTTOM_TO_PLAYER = new BlazeEndPositioning("BOTTOM_TO_PLAYER", 0);
        public static final BlazeEndPositioning BOTTOM_TO_CONTAINER = new BlazeEndPositioning("BOTTOM_TO_CONTAINER", 1);

        private static final /* synthetic */ BlazeEndPositioning[] $values() {
            return new BlazeEndPositioning[]{BOTTOM_TO_PLAYER, BOTTOM_TO_CONTAINER};
        }

        static {
            BlazeEndPositioning[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private BlazeEndPositioning(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeEndPositioning valueOf(String str) {
            return (BlazeEndPositioning) Enum.valueOf(BlazeEndPositioning.class, str);
        }

        public static BlazeEndPositioning[] values() {
            return (BlazeEndPositioning[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeMomentsPlayerFooterGradientStyle(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), BlazeEndPositioning.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerFooterGradientStyle[i];
        }
    }

    public BlazeMomentsPlayerFooterGradientStyle(boolean z, int i, int i2, @NotNull BlazeEndPositioning blazeEndPositioning) {
        blazeEndPositioning.getClass();
        this.isVisible = z;
        this.startColor = i;
        this.endColor = i2;
        this.endPositioning = blazeEndPositioning;
    }

    public static /* synthetic */ BlazeMomentsPlayerFooterGradientStyle copy$default(BlazeMomentsPlayerFooterGradientStyle blazeMomentsPlayerFooterGradientStyle, boolean z, int i, int i2, BlazeEndPositioning blazeEndPositioning, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = blazeMomentsPlayerFooterGradientStyle.isVisible;
        }
        if ((i3 & 2) != 0) {
            i = blazeMomentsPlayerFooterGradientStyle.startColor;
        }
        if ((i3 & 4) != 0) {
            i2 = blazeMomentsPlayerFooterGradientStyle.endColor;
        }
        if ((i3 & 8) != 0) {
            blazeEndPositioning = blazeMomentsPlayerFooterGradientStyle.endPositioning;
        }
        return blazeMomentsPlayerFooterGradientStyle.copy(z, i, i2, blazeEndPositioning);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartColor() {
        return this.startColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEndColor() {
        return this.endColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeEndPositioning getEndPositioning() {
        return this.endPositioning;
    }

    @NotNull
    public final BlazeMomentsPlayerFooterGradientStyle copy(boolean isVisible, int startColor, int endColor, @NotNull BlazeEndPositioning endPositioning) {
        endPositioning.getClass();
        return new BlazeMomentsPlayerFooterGradientStyle(isVisible, startColor, endColor, endPositioning);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerFooterGradientStyle)) {
            return false;
        }
        BlazeMomentsPlayerFooterGradientStyle blazeMomentsPlayerFooterGradientStyle = (BlazeMomentsPlayerFooterGradientStyle) other;
        return this.isVisible == blazeMomentsPlayerFooterGradientStyle.isVisible && this.startColor == blazeMomentsPlayerFooterGradientStyle.startColor && this.endColor == blazeMomentsPlayerFooterGradientStyle.endColor && this.endPositioning == blazeMomentsPlayerFooterGradientStyle.endPositioning;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public int getEndColor() {
        return this.endColor;
    }

    @NotNull
    public final BlazeEndPositioning getEndPositioning() {
        return this.endPositioning;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public int getStartColor() {
        return this.startColor;
    }

    public int hashCode() {
        return this.endPositioning.hashCode() + l4a.e(this.endColor, l4a.e(this.startColor, Boolean.hashCode(this.isVisible) * 31));
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    /* renamed from: isVisible */
    public boolean getIsVisible() {
        return this.isVisible;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public void setEndColor(int i) {
        this.endColor = i;
    }

    public final void setEndPositioning(@NotNull BlazeEndPositioning blazeEndPositioning) {
        blazeEndPositioning.getClass();
        this.endPositioning = blazeEndPositioning;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public void setStartColor(int i) {
        this.startColor = i;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeMomentsPlayerFooterGradientStyle(isVisible=" + this.isVisible + ", startColor=" + this.startColor + ", endColor=" + this.endColor + ", endPositioning=" + this.endPositioning + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        dest.writeInt(this.startColor);
        dest.writeInt(this.endColor);
        dest.writeString(this.endPositioning.name());
    }
}
