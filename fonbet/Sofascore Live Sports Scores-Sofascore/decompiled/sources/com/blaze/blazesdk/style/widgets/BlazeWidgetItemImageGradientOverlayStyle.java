package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0005J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "startColor", "", "endColor", "position", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle$BlazeGradientPosition;", "<init>", "(ZIILcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle$BlazeGradientPosition;)V", "()Z", "setVisible", "(Z)V", "getStartColor", "()I", "setStartColor", "(I)V", "getEndColor", "setEndColor", "getPosition", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle$BlazeGradientPosition;", "setPosition", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle$BlazeGradientPosition;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeGradientPosition", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemImageGradientOverlayStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemImageGradientOverlayStyle> CREATOR = new a();
    private int endColor;
    private boolean isVisible;

    @NotNull
    private BlazeGradientPosition position;
    private int startColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageGradientOverlayStyle$BlazeGradientPosition;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "CENTER", "BOTTOM", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BlazeGradientPosition {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeGradientPosition[] $VALUES;
        public static final BlazeGradientPosition TOP = new BlazeGradientPosition("TOP", 0);
        public static final BlazeGradientPosition CENTER = new BlazeGradientPosition("CENTER", 1);
        public static final BlazeGradientPosition BOTTOM = new BlazeGradientPosition("BOTTOM", 2);

        private static final /* synthetic */ BlazeGradientPosition[] $values() {
            return new BlazeGradientPosition[]{TOP, CENTER, BOTTOM};
        }

        static {
            BlazeGradientPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private BlazeGradientPosition(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeGradientPosition valueOf(String str) {
            return (BlazeGradientPosition) Enum.valueOf(BlazeGradientPosition.class, str);
        }

        public static BlazeGradientPosition[] values() {
            return (BlazeGradientPosition[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeWidgetItemImageGradientOverlayStyle(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), BlazeGradientPosition.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemImageGradientOverlayStyle[i];
        }
    }

    public BlazeWidgetItemImageGradientOverlayStyle(boolean z, int i, int i2, @NotNull BlazeGradientPosition blazeGradientPosition) {
        blazeGradientPosition.getClass();
        this.isVisible = z;
        this.startColor = i;
        this.endColor = i2;
        this.position = blazeGradientPosition;
    }

    public static /* synthetic */ BlazeWidgetItemImageGradientOverlayStyle copy$default(BlazeWidgetItemImageGradientOverlayStyle blazeWidgetItemImageGradientOverlayStyle, boolean z, int i, int i2, BlazeGradientPosition blazeGradientPosition, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = blazeWidgetItemImageGradientOverlayStyle.isVisible;
        }
        if ((i3 & 2) != 0) {
            i = blazeWidgetItemImageGradientOverlayStyle.startColor;
        }
        if ((i3 & 4) != 0) {
            i2 = blazeWidgetItemImageGradientOverlayStyle.endColor;
        }
        if ((i3 & 8) != 0) {
            blazeGradientPosition = blazeWidgetItemImageGradientOverlayStyle.position;
        }
        return blazeWidgetItemImageGradientOverlayStyle.copy(z, i, i2, blazeGradientPosition);
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
    public final BlazeGradientPosition getPosition() {
        return this.position;
    }

    @NotNull
    public final BlazeWidgetItemImageGradientOverlayStyle copy(boolean isVisible, int startColor, int endColor, @NotNull BlazeGradientPosition position) {
        position.getClass();
        return new BlazeWidgetItemImageGradientOverlayStyle(isVisible, startColor, endColor, position);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemImageGradientOverlayStyle)) {
            return false;
        }
        BlazeWidgetItemImageGradientOverlayStyle blazeWidgetItemImageGradientOverlayStyle = (BlazeWidgetItemImageGradientOverlayStyle) other;
        return this.isVisible == blazeWidgetItemImageGradientOverlayStyle.isVisible && this.startColor == blazeWidgetItemImageGradientOverlayStyle.startColor && this.endColor == blazeWidgetItemImageGradientOverlayStyle.endColor && this.position == blazeWidgetItemImageGradientOverlayStyle.position;
    }

    public final int getEndColor() {
        return this.endColor;
    }

    @NotNull
    public final BlazeGradientPosition getPosition() {
        return this.position;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public int hashCode() {
        return this.position.hashCode() + l4a.e(this.endColor, l4a.e(this.startColor, Boolean.hashCode(this.isVisible) * 31));
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setEndColor(int i) {
        this.endColor = i;
    }

    public final void setPosition(@NotNull BlazeGradientPosition blazeGradientPosition) {
        blazeGradientPosition.getClass();
        this.position = blazeGradientPosition;
    }

    public final void setStartColor(int i) {
        this.startColor = i;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetItemImageGradientOverlayStyle(isVisible=" + this.isVisible + ", startColor=" + this.startColor + ", endColor=" + this.endColor + ", position=" + this.position + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        dest.writeInt(this.startColor);
        dest.writeInt(this.endColor);
        dest.writeString(this.position.name());
    }
}
