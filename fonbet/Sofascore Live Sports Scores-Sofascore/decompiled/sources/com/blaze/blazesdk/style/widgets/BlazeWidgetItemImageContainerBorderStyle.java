package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006+"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "liveUnreadState", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStateStyle;", "liveReadState", "readState", "unreadState", "<init>", "(ZLcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStateStyle;)V", "()Z", "setVisible", "(Z)V", "getLiveUnreadState", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStateStyle;", "setLiveUnreadState", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStateStyle;)V", "getLiveReadState", "setLiveReadState", "getReadState", "setReadState", "getUnreadState", "setUnreadState", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemImageContainerBorderStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemImageContainerBorderStyle> CREATOR = new a();
    private boolean isVisible;

    @NotNull
    private BlazeWidgetItemImageContainerBorderStateStyle liveReadState;

    @NotNull
    private BlazeWidgetItemImageContainerBorderStateStyle liveUnreadState;

    @NotNull
    private BlazeWidgetItemImageContainerBorderStateStyle readState;

    @NotNull
    private BlazeWidgetItemImageContainerBorderStateStyle unreadState;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            Parcelable.Creator<BlazeWidgetItemImageContainerBorderStateStyle> creator = BlazeWidgetItemImageContainerBorderStateStyle.CREATOR;
            return new BlazeWidgetItemImageContainerBorderStyle(z, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemImageContainerBorderStyle[i];
        }
    }

    public BlazeWidgetItemImageContainerBorderStyle(boolean z, @NotNull BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle, @NotNull BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle2, @NotNull BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle3, @NotNull BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle4) {
        blazeWidgetItemImageContainerBorderStateStyle.getClass();
        blazeWidgetItemImageContainerBorderStateStyle2.getClass();
        blazeWidgetItemImageContainerBorderStateStyle3.getClass();
        blazeWidgetItemImageContainerBorderStateStyle4.getClass();
        this.isVisible = z;
        this.liveUnreadState = blazeWidgetItemImageContainerBorderStateStyle;
        this.liveReadState = blazeWidgetItemImageContainerBorderStateStyle2;
        this.readState = blazeWidgetItemImageContainerBorderStateStyle3;
        this.unreadState = blazeWidgetItemImageContainerBorderStateStyle4;
    }

    public static /* synthetic */ BlazeWidgetItemImageContainerBorderStyle copy$default(BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle, boolean z, BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle, BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle2, BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle3, BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeWidgetItemImageContainerBorderStyle.isVisible;
        }
        if ((i & 2) != 0) {
            blazeWidgetItemImageContainerBorderStateStyle = blazeWidgetItemImageContainerBorderStyle.liveUnreadState;
        }
        if ((i & 4) != 0) {
            blazeWidgetItemImageContainerBorderStateStyle2 = blazeWidgetItemImageContainerBorderStyle.liveReadState;
        }
        if ((i & 8) != 0) {
            blazeWidgetItemImageContainerBorderStateStyle3 = blazeWidgetItemImageContainerBorderStyle.readState;
        }
        if ((i & 16) != 0) {
            blazeWidgetItemImageContainerBorderStateStyle4 = blazeWidgetItemImageContainerBorderStyle.unreadState;
        }
        BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle5 = blazeWidgetItemImageContainerBorderStateStyle4;
        BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle6 = blazeWidgetItemImageContainerBorderStateStyle2;
        return blazeWidgetItemImageContainerBorderStyle.copy(z, blazeWidgetItemImageContainerBorderStateStyle, blazeWidgetItemImageContainerBorderStateStyle6, blazeWidgetItemImageContainerBorderStateStyle3, blazeWidgetItemImageContainerBorderStateStyle5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeWidgetItemImageContainerBorderStateStyle getLiveUnreadState() {
        return this.liveUnreadState;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeWidgetItemImageContainerBorderStateStyle getLiveReadState() {
        return this.liveReadState;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeWidgetItemImageContainerBorderStateStyle getReadState() {
        return this.readState;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeWidgetItemImageContainerBorderStateStyle getUnreadState() {
        return this.unreadState;
    }

    @NotNull
    public final BlazeWidgetItemImageContainerBorderStyle copy(boolean isVisible, @NotNull BlazeWidgetItemImageContainerBorderStateStyle liveUnreadState, @NotNull BlazeWidgetItemImageContainerBorderStateStyle liveReadState, @NotNull BlazeWidgetItemImageContainerBorderStateStyle readState, @NotNull BlazeWidgetItemImageContainerBorderStateStyle unreadState) {
        liveUnreadState.getClass();
        liveReadState.getClass();
        readState.getClass();
        unreadState.getClass();
        return new BlazeWidgetItemImageContainerBorderStyle(isVisible, liveUnreadState, liveReadState, readState, unreadState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemImageContainerBorderStyle)) {
            return false;
        }
        BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle = (BlazeWidgetItemImageContainerBorderStyle) other;
        return this.isVisible == blazeWidgetItemImageContainerBorderStyle.isVisible && Intrinsics.c(this.liveUnreadState, blazeWidgetItemImageContainerBorderStyle.liveUnreadState) && Intrinsics.c(this.liveReadState, blazeWidgetItemImageContainerBorderStyle.liveReadState) && Intrinsics.c(this.readState, blazeWidgetItemImageContainerBorderStyle.readState) && Intrinsics.c(this.unreadState, blazeWidgetItemImageContainerBorderStyle.unreadState);
    }

    @NotNull
    public final BlazeWidgetItemImageContainerBorderStateStyle getLiveReadState() {
        return this.liveReadState;
    }

    @NotNull
    public final BlazeWidgetItemImageContainerBorderStateStyle getLiveUnreadState() {
        return this.liveUnreadState;
    }

    @NotNull
    public final BlazeWidgetItemImageContainerBorderStateStyle getReadState() {
        return this.readState;
    }

    @NotNull
    public final BlazeWidgetItemImageContainerBorderStateStyle getUnreadState() {
        return this.unreadState;
    }

    public int hashCode() {
        return this.unreadState.hashCode() + ((this.readState.hashCode() + ((this.liveReadState.hashCode() + ((this.liveUnreadState.hashCode() + (Boolean.hashCode(this.isVisible) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setLiveReadState(@NotNull BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle) {
        blazeWidgetItemImageContainerBorderStateStyle.getClass();
        this.liveReadState = blazeWidgetItemImageContainerBorderStateStyle;
    }

    public final void setLiveUnreadState(@NotNull BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle) {
        blazeWidgetItemImageContainerBorderStateStyle.getClass();
        this.liveUnreadState = blazeWidgetItemImageContainerBorderStateStyle;
    }

    public final void setReadState(@NotNull BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle) {
        blazeWidgetItemImageContainerBorderStateStyle.getClass();
        this.readState = blazeWidgetItemImageContainerBorderStateStyle;
    }

    public final void setUnreadState(@NotNull BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle) {
        blazeWidgetItemImageContainerBorderStateStyle.getClass();
        this.unreadState = blazeWidgetItemImageContainerBorderStateStyle;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetItemImageContainerBorderStyle(isVisible=" + this.isVisible + ", liveUnreadState=" + this.liveUnreadState + ", liveReadState=" + this.liveReadState + ", readState=" + this.readState + ", unreadState=" + this.unreadState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        this.liveUnreadState.writeToParcel(dest, flags);
        this.liveReadState.writeToParcel(dest, flags);
        this.readState.writeToParcel(dest, flags);
        this.unreadState.writeToParcel(dest, flags);
    }
}
