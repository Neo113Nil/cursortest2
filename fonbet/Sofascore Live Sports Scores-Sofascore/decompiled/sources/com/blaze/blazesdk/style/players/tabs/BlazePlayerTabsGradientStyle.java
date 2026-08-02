package com.blaze.blazesdk.style.players.tabs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import defpackage.l4a;
import defpackage.wv8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0005J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006&"}, d2 = {"Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsGradientStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "startColor", "", "middleColor", "endColor", "<init>", "(ZIII)V", "()Z", "setVisible", "(Z)V", "getStartColor", "()I", "setStartColor", "(I)V", "getMiddleColor", "setMiddleColor", "getEndColor", "setEndColor", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazePlayerTabsGradientStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazePlayerTabsGradientStyle> CREATOR = new a();
    private int endColor;
    private boolean isVisible;
    private int middleColor;
    private int startColor;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazePlayerTabsGradientStyle(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazePlayerTabsGradientStyle[i];
        }
    }

    public BlazePlayerTabsGradientStyle(boolean z, int i, int i2, int i3) {
        this.isVisible = z;
        this.startColor = i;
        this.middleColor = i2;
        this.endColor = i3;
    }

    public static /* synthetic */ BlazePlayerTabsGradientStyle copy$default(BlazePlayerTabsGradientStyle blazePlayerTabsGradientStyle, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = blazePlayerTabsGradientStyle.isVisible;
        }
        if ((i4 & 2) != 0) {
            i = blazePlayerTabsGradientStyle.startColor;
        }
        if ((i4 & 4) != 0) {
            i2 = blazePlayerTabsGradientStyle.middleColor;
        }
        if ((i4 & 8) != 0) {
            i3 = blazePlayerTabsGradientStyle.endColor;
        }
        return blazePlayerTabsGradientStyle.copy(z, i, i2, i3);
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
    public final int getMiddleColor() {
        return this.middleColor;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEndColor() {
        return this.endColor;
    }

    @NotNull
    public final BlazePlayerTabsGradientStyle copy(boolean isVisible, int startColor, int middleColor, int endColor) {
        return new BlazePlayerTabsGradientStyle(isVisible, startColor, middleColor, endColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazePlayerTabsGradientStyle)) {
            return false;
        }
        BlazePlayerTabsGradientStyle blazePlayerTabsGradientStyle = (BlazePlayerTabsGradientStyle) other;
        return this.isVisible == blazePlayerTabsGradientStyle.isVisible && this.startColor == blazePlayerTabsGradientStyle.startColor && this.middleColor == blazePlayerTabsGradientStyle.middleColor && this.endColor == blazePlayerTabsGradientStyle.endColor;
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final int getMiddleColor() {
        return this.middleColor;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.endColor) + l4a.e(this.middleColor, l4a.e(this.startColor, Boolean.hashCode(this.isVisible) * 31));
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setEndColor(int i) {
        this.endColor = i;
    }

    public final void setMiddleColor(int i) {
        this.middleColor = i;
    }

    public final void setStartColor(int i) {
        this.startColor = i;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazePlayerTabsGradientStyle(isVisible=");
        sb.append(this.isVisible);
        sb.append(", startColor=");
        sb.append(this.startColor);
        sb.append(", middleColor=");
        sb.append(this.middleColor);
        sb.append(", endColor=");
        return wv8.j(sb, this.endColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        dest.writeInt(this.startColor);
        dest.writeInt(this.middleColor);
        dest.writeInt(this.endColor);
    }
}
