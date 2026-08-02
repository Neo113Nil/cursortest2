package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u00061"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTitleStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "position", "Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", "margins", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "unreadState", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "readState", "<init>", "(ZLcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;)V", "()Z", "setVisible", "(Z)V", "getPosition", "()Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", "setPosition", "(Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;)V", "getMargins", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "setMargins", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "getUnreadState", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "setUnreadState", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;)V", "getReadState", "setReadState", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemTitleStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemTitleStyle> CREATOR = new a();
    private boolean isVisible;

    @NotNull
    private BlazeInsets margins;

    @NotNull
    private BlazeObjectPositioning position;

    @NotNull
    private BlazeWidgetItemTextStyle readState;

    @NotNull
    private BlazeWidgetItemTextStyle unreadState;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            BlazeObjectPositioning createFromParcel = BlazeObjectPositioning.CREATOR.createFromParcel(parcel);
            BlazeInsets createFromParcel2 = BlazeInsets.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<BlazeWidgetItemTextStyle> creator = BlazeWidgetItemTextStyle.CREATOR;
            return new BlazeWidgetItemTitleStyle(z, createFromParcel, createFromParcel2, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemTitleStyle[i];
        }
    }

    public BlazeWidgetItemTitleStyle(boolean z, @NotNull BlazeObjectPositioning blazeObjectPositioning, @NotNull BlazeInsets blazeInsets, @NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, @NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle2) {
        blazeObjectPositioning.getClass();
        blazeInsets.getClass();
        blazeWidgetItemTextStyle.getClass();
        blazeWidgetItemTextStyle2.getClass();
        this.isVisible = z;
        this.position = blazeObjectPositioning;
        this.margins = blazeInsets;
        this.unreadState = blazeWidgetItemTextStyle;
        this.readState = blazeWidgetItemTextStyle2;
    }

    public static /* synthetic */ BlazeWidgetItemTitleStyle copy$default(BlazeWidgetItemTitleStyle blazeWidgetItemTitleStyle, boolean z, BlazeObjectPositioning blazeObjectPositioning, BlazeInsets blazeInsets, BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, BlazeWidgetItemTextStyle blazeWidgetItemTextStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeWidgetItemTitleStyle.isVisible;
        }
        if ((i & 2) != 0) {
            blazeObjectPositioning = blazeWidgetItemTitleStyle.position;
        }
        if ((i & 4) != 0) {
            blazeInsets = blazeWidgetItemTitleStyle.margins;
        }
        if ((i & 8) != 0) {
            blazeWidgetItemTextStyle = blazeWidgetItemTitleStyle.unreadState;
        }
        if ((i & 16) != 0) {
            blazeWidgetItemTextStyle2 = blazeWidgetItemTitleStyle.readState;
        }
        BlazeWidgetItemTextStyle blazeWidgetItemTextStyle3 = blazeWidgetItemTextStyle2;
        BlazeInsets blazeInsets2 = blazeInsets;
        return blazeWidgetItemTitleStyle.copy(z, blazeObjectPositioning, blazeInsets2, blazeWidgetItemTextStyle, blazeWidgetItemTextStyle3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeObjectPositioning getPosition() {
        return this.position;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeInsets getMargins() {
        return this.margins;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeWidgetItemTextStyle getUnreadState() {
        return this.unreadState;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeWidgetItemTextStyle getReadState() {
        return this.readState;
    }

    @NotNull
    public final BlazeWidgetItemTitleStyle copy(boolean isVisible, @NotNull BlazeObjectPositioning position, @NotNull BlazeInsets margins, @NotNull BlazeWidgetItemTextStyle unreadState, @NotNull BlazeWidgetItemTextStyle readState) {
        position.getClass();
        margins.getClass();
        unreadState.getClass();
        readState.getClass();
        return new BlazeWidgetItemTitleStyle(isVisible, position, margins, unreadState, readState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemTitleStyle)) {
            return false;
        }
        BlazeWidgetItemTitleStyle blazeWidgetItemTitleStyle = (BlazeWidgetItemTitleStyle) other;
        return this.isVisible == blazeWidgetItemTitleStyle.isVisible && Intrinsics.c(this.position, blazeWidgetItemTitleStyle.position) && Intrinsics.c(this.margins, blazeWidgetItemTitleStyle.margins) && Intrinsics.c(this.unreadState, blazeWidgetItemTitleStyle.unreadState) && Intrinsics.c(this.readState, blazeWidgetItemTitleStyle.readState);
    }

    @NotNull
    public final BlazeInsets getMargins() {
        return this.margins;
    }

    @NotNull
    public final BlazeObjectPositioning getPosition() {
        return this.position;
    }

    @NotNull
    public final BlazeWidgetItemTextStyle getReadState() {
        return this.readState;
    }

    @NotNull
    public final BlazeWidgetItemTextStyle getUnreadState() {
        return this.unreadState;
    }

    public int hashCode() {
        return this.readState.hashCode() + ((this.unreadState.hashCode() + ((this.margins.hashCode() + ((this.position.hashCode() + (Boolean.hashCode(this.isVisible) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setMargins(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.margins = blazeInsets;
    }

    public final void setPosition(@NotNull BlazeObjectPositioning blazeObjectPositioning) {
        blazeObjectPositioning.getClass();
        this.position = blazeObjectPositioning;
    }

    public final void setReadState(@NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle) {
        blazeWidgetItemTextStyle.getClass();
        this.readState = blazeWidgetItemTextStyle;
    }

    public final void setUnreadState(@NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle) {
        blazeWidgetItemTextStyle.getClass();
        this.unreadState = blazeWidgetItemTextStyle;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetItemTitleStyle(isVisible=" + this.isVisible + ", position=" + this.position + ", margins=" + this.margins + ", unreadState=" + this.unreadState + ", readState=" + this.readState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        this.position.writeToParcel(dest, flags);
        this.margins.writeToParcel(dest, flags);
        this.unreadState.writeToParcel(dest, flags);
        this.readState.writeToParcel(dest, flags);
    }
}
