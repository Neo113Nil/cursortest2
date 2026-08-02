package com.blaze.blazesdk.style.players.moments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.IPlayerGradientStyle;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import defpackage.l4a;
import defpackage.wv8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0006J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006#"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerHeaderGradientStyle;", "Lcom/blaze/blazesdk/style/players/IPlayerGradientStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "startColor", "", "endColor", "<init>", "(ZII)V", "()Z", "setVisible", "(Z)V", "getStartColor", "()I", "setStartColor", "(I)V", "getEndColor", "setEndColor", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeMomentsPlayerHeaderGradientStyle implements IPlayerGradientStyle, BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerHeaderGradientStyle> CREATOR = new a();
    private int endColor;
    private boolean isVisible;
    private int startColor;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeMomentsPlayerHeaderGradientStyle(parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerHeaderGradientStyle[i];
        }
    }

    public BlazeMomentsPlayerHeaderGradientStyle(boolean z, int i, int i2) {
        this.isVisible = z;
        this.startColor = i;
        this.endColor = i2;
    }

    public static /* synthetic */ BlazeMomentsPlayerHeaderGradientStyle copy$default(BlazeMomentsPlayerHeaderGradientStyle blazeMomentsPlayerHeaderGradientStyle, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = blazeMomentsPlayerHeaderGradientStyle.isVisible;
        }
        if ((i3 & 2) != 0) {
            i = blazeMomentsPlayerHeaderGradientStyle.startColor;
        }
        if ((i3 & 4) != 0) {
            i2 = blazeMomentsPlayerHeaderGradientStyle.endColor;
        }
        return blazeMomentsPlayerHeaderGradientStyle.copy(z, i, i2);
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
    public final BlazeMomentsPlayerHeaderGradientStyle copy(boolean isVisible, int startColor, int endColor) {
        return new BlazeMomentsPlayerHeaderGradientStyle(isVisible, startColor, endColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerHeaderGradientStyle)) {
            return false;
        }
        BlazeMomentsPlayerHeaderGradientStyle blazeMomentsPlayerHeaderGradientStyle = (BlazeMomentsPlayerHeaderGradientStyle) other;
        return this.isVisible == blazeMomentsPlayerHeaderGradientStyle.isVisible && this.startColor == blazeMomentsPlayerHeaderGradientStyle.startColor && this.endColor == blazeMomentsPlayerHeaderGradientStyle.endColor;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public int getEndColor() {
        return this.endColor;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public int getStartColor() {
        return this.startColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.endColor) + l4a.e(this.startColor, Boolean.hashCode(this.isVisible) * 31);
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
        StringBuilder sb = new StringBuilder("BlazeMomentsPlayerHeaderGradientStyle(isVisible=");
        sb.append(this.isVisible);
        sb.append(", startColor=");
        sb.append(this.startColor);
        sb.append(", endColor=");
        return wv8.j(sb, this.endColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        dest.writeInt(this.startColor);
        dest.writeInt(this.endColor);
    }
}
