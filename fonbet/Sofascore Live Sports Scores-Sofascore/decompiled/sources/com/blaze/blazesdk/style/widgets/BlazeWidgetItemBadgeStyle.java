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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003JY\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000201HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 ¨\u0006="}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "position", "Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", "margins", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "padding", "liveUnreadState", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;", "liveReadState", "unreadState", "readState", "<init>", "(ZLcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;)V", "()Z", "setVisible", "(Z)V", "getPosition", "()Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", "setPosition", "(Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;)V", "getMargins", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "setMargins", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "getPadding", "setPadding", "getLiveUnreadState", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;", "setLiveUnreadState", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;)V", "getLiveReadState", "setLiveReadState", "getUnreadState", "setUnreadState", "getReadState", "setReadState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemBadgeStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemBadgeStyle> CREATOR = new a();
    private boolean isVisible;

    @NotNull
    private BlazeWidgetItemBadgeStateStyle liveReadState;

    @NotNull
    private BlazeWidgetItemBadgeStateStyle liveUnreadState;

    @NotNull
    private BlazeInsets margins;

    @NotNull
    private BlazeInsets padding;

    @NotNull
    private BlazeObjectPositioning position;

    @NotNull
    private BlazeWidgetItemBadgeStateStyle readState;

    @NotNull
    private BlazeWidgetItemBadgeStateStyle unreadState;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            BlazeObjectPositioning createFromParcel = BlazeObjectPositioning.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<BlazeInsets> creator = BlazeInsets.CREATOR;
            BlazeInsets createFromParcel2 = creator.createFromParcel(parcel);
            BlazeInsets createFromParcel3 = creator.createFromParcel(parcel);
            Parcelable.Creator<BlazeWidgetItemBadgeStateStyle> creator2 = BlazeWidgetItemBadgeStateStyle.CREATOR;
            return new BlazeWidgetItemBadgeStyle(z, createFromParcel, createFromParcel2, createFromParcel3, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), creator2.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemBadgeStyle[i];
        }
    }

    public BlazeWidgetItemBadgeStyle(boolean z, @NotNull BlazeObjectPositioning blazeObjectPositioning, @NotNull BlazeInsets blazeInsets, @NotNull BlazeInsets blazeInsets2, @NotNull BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle, @NotNull BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle2, @NotNull BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle3, @NotNull BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle4) {
        blazeObjectPositioning.getClass();
        blazeInsets.getClass();
        blazeInsets2.getClass();
        blazeWidgetItemBadgeStateStyle.getClass();
        blazeWidgetItemBadgeStateStyle2.getClass();
        blazeWidgetItemBadgeStateStyle3.getClass();
        blazeWidgetItemBadgeStateStyle4.getClass();
        this.isVisible = z;
        this.position = blazeObjectPositioning;
        this.margins = blazeInsets;
        this.padding = blazeInsets2;
        this.liveUnreadState = blazeWidgetItemBadgeStateStyle;
        this.liveReadState = blazeWidgetItemBadgeStateStyle2;
        this.unreadState = blazeWidgetItemBadgeStateStyle3;
        this.readState = blazeWidgetItemBadgeStateStyle4;
    }

    public static /* synthetic */ BlazeWidgetItemBadgeStyle copy$default(BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle, boolean z, BlazeObjectPositioning blazeObjectPositioning, BlazeInsets blazeInsets, BlazeInsets blazeInsets2, BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle, BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle2, BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle3, BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeWidgetItemBadgeStyle.isVisible;
        }
        if ((i & 2) != 0) {
            blazeObjectPositioning = blazeWidgetItemBadgeStyle.position;
        }
        if ((i & 4) != 0) {
            blazeInsets = blazeWidgetItemBadgeStyle.margins;
        }
        if ((i & 8) != 0) {
            blazeInsets2 = blazeWidgetItemBadgeStyle.padding;
        }
        if ((i & 16) != 0) {
            blazeWidgetItemBadgeStateStyle = blazeWidgetItemBadgeStyle.liveUnreadState;
        }
        if ((i & 32) != 0) {
            blazeWidgetItemBadgeStateStyle2 = blazeWidgetItemBadgeStyle.liveReadState;
        }
        if ((i & 64) != 0) {
            blazeWidgetItemBadgeStateStyle3 = blazeWidgetItemBadgeStyle.unreadState;
        }
        if ((i & 128) != 0) {
            blazeWidgetItemBadgeStateStyle4 = blazeWidgetItemBadgeStyle.readState;
        }
        BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle5 = blazeWidgetItemBadgeStateStyle3;
        BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle6 = blazeWidgetItemBadgeStateStyle4;
        BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle7 = blazeWidgetItemBadgeStateStyle;
        BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle8 = blazeWidgetItemBadgeStateStyle2;
        return blazeWidgetItemBadgeStyle.copy(z, blazeObjectPositioning, blazeInsets, blazeInsets2, blazeWidgetItemBadgeStateStyle7, blazeWidgetItemBadgeStateStyle8, blazeWidgetItemBadgeStateStyle5, blazeWidgetItemBadgeStateStyle6);
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
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeWidgetItemBadgeStateStyle getLiveUnreadState() {
        return this.liveUnreadState;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeWidgetItemBadgeStateStyle getLiveReadState() {
        return this.liveReadState;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeWidgetItemBadgeStateStyle getUnreadState() {
        return this.unreadState;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeWidgetItemBadgeStateStyle getReadState() {
        return this.readState;
    }

    @NotNull
    public final BlazeWidgetItemBadgeStyle copy(boolean isVisible, @NotNull BlazeObjectPositioning position, @NotNull BlazeInsets margins, @NotNull BlazeInsets padding, @NotNull BlazeWidgetItemBadgeStateStyle liveUnreadState, @NotNull BlazeWidgetItemBadgeStateStyle liveReadState, @NotNull BlazeWidgetItemBadgeStateStyle unreadState, @NotNull BlazeWidgetItemBadgeStateStyle readState) {
        position.getClass();
        margins.getClass();
        padding.getClass();
        liveUnreadState.getClass();
        liveReadState.getClass();
        unreadState.getClass();
        readState.getClass();
        return new BlazeWidgetItemBadgeStyle(isVisible, position, margins, padding, liveUnreadState, liveReadState, unreadState, readState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemBadgeStyle)) {
            return false;
        }
        BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle = (BlazeWidgetItemBadgeStyle) other;
        return this.isVisible == blazeWidgetItemBadgeStyle.isVisible && Intrinsics.c(this.position, blazeWidgetItemBadgeStyle.position) && Intrinsics.c(this.margins, blazeWidgetItemBadgeStyle.margins) && Intrinsics.c(this.padding, blazeWidgetItemBadgeStyle.padding) && Intrinsics.c(this.liveUnreadState, blazeWidgetItemBadgeStyle.liveUnreadState) && Intrinsics.c(this.liveReadState, blazeWidgetItemBadgeStyle.liveReadState) && Intrinsics.c(this.unreadState, blazeWidgetItemBadgeStyle.unreadState) && Intrinsics.c(this.readState, blazeWidgetItemBadgeStyle.readState);
    }

    @NotNull
    public final BlazeWidgetItemBadgeStateStyle getLiveReadState() {
        return this.liveReadState;
    }

    @NotNull
    public final BlazeWidgetItemBadgeStateStyle getLiveUnreadState() {
        return this.liveUnreadState;
    }

    @NotNull
    public final BlazeInsets getMargins() {
        return this.margins;
    }

    @NotNull
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    public final BlazeObjectPositioning getPosition() {
        return this.position;
    }

    @NotNull
    public final BlazeWidgetItemBadgeStateStyle getReadState() {
        return this.readState;
    }

    @NotNull
    public final BlazeWidgetItemBadgeStateStyle getUnreadState() {
        return this.unreadState;
    }

    public int hashCode() {
        return this.readState.hashCode() + ((this.unreadState.hashCode() + ((this.liveReadState.hashCode() + ((this.liveUnreadState.hashCode() + ((this.padding.hashCode() + ((this.margins.hashCode() + ((this.position.hashCode() + (Boolean.hashCode(this.isVisible) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setLiveReadState(@NotNull BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle) {
        blazeWidgetItemBadgeStateStyle.getClass();
        this.liveReadState = blazeWidgetItemBadgeStateStyle;
    }

    public final void setLiveUnreadState(@NotNull BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle) {
        blazeWidgetItemBadgeStateStyle.getClass();
        this.liveUnreadState = blazeWidgetItemBadgeStateStyle;
    }

    public final void setMargins(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.margins = blazeInsets;
    }

    public final void setPadding(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.padding = blazeInsets;
    }

    public final void setPosition(@NotNull BlazeObjectPositioning blazeObjectPositioning) {
        blazeObjectPositioning.getClass();
        this.position = blazeObjectPositioning;
    }

    public final void setReadState(@NotNull BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle) {
        blazeWidgetItemBadgeStateStyle.getClass();
        this.readState = blazeWidgetItemBadgeStateStyle;
    }

    public final void setUnreadState(@NotNull BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle) {
        blazeWidgetItemBadgeStateStyle.getClass();
        this.unreadState = blazeWidgetItemBadgeStateStyle;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetItemBadgeStyle(isVisible=" + this.isVisible + ", position=" + this.position + ", margins=" + this.margins + ", padding=" + this.padding + ", liveUnreadState=" + this.liveUnreadState + ", liveReadState=" + this.liveReadState + ", unreadState=" + this.unreadState + ", readState=" + this.readState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        this.position.writeToParcel(dest, flags);
        this.margins.writeToParcel(dest, flags);
        this.padding.writeToParcel(dest, flags);
        this.liveUnreadState.writeToParcel(dest, flags);
        this.liveReadState.writeToParcel(dest, flags);
        this.unreadState.writeToParcel(dest, flags);
        this.readState.writeToParcel(dest, flags);
    }
}
