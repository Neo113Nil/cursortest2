package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import defpackage.u0a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\u000e\u00105\u001a\u00020\u000fHÀ\u0003¢\u0006\u0002\b6Jc\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0006\u00108\u001a\u000209J\u0013\u0010:\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000209HÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u000209R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006E"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "position", "Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", C4018c8.k, "", "margins", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "padding", "liveUnreadState", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;", "liveReadState", "unreadState", "readState", "streamStates", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStreamStatesStyle;", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;ZLcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStreamStatesStyle;)V", "getPosition", "()Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", "setPosition", "(Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;)V", "()Z", "setVisible", "(Z)V", "getMargins", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "setMargins", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "getPadding", "setPadding", "getLiveUnreadState", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;", "setLiveUnreadState", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;)V", "getLiveReadState", "setLiveReadState", "getUnreadState", "setUnreadState", "getReadState", "setReadState", "getStreamStates$blazesdk_release", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStreamStatesStyle;", "setStreamStates$blazesdk_release", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStreamStatesStyle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component9$blazesdk_release", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemStatusIndicatorStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemStatusIndicatorStyle> CREATOR = new a();
    private boolean isVisible;

    @NotNull
    private BlazeWidgetItemStatusIndicatorStateStyle liveReadState;

    @NotNull
    private BlazeWidgetItemStatusIndicatorStateStyle liveUnreadState;

    @NotNull
    private BlazeInsets margins;

    @NotNull
    private BlazeInsets padding;

    @NotNull
    private BlazeObjectPositioning position;

    @NotNull
    private BlazeWidgetItemStatusIndicatorStateStyle readState;

    @NotNull
    private BlazeWidgetItemStatusIndicatorStreamStatesStyle streamStates;

    @NotNull
    private BlazeWidgetItemStatusIndicatorStateStyle unreadState;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            BlazeObjectPositioning createFromParcel = BlazeObjectPositioning.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            Parcelable.Creator<BlazeInsets> creator = BlazeInsets.CREATOR;
            BlazeInsets createFromParcel2 = creator.createFromParcel(parcel);
            BlazeInsets createFromParcel3 = creator.createFromParcel(parcel);
            Parcelable.Creator<BlazeWidgetItemStatusIndicatorStateStyle> creator2 = BlazeWidgetItemStatusIndicatorStateStyle.CREATOR;
            return new BlazeWidgetItemStatusIndicatorStyle(createFromParcel, z, createFromParcel2, createFromParcel3, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), BlazeWidgetItemStatusIndicatorStreamStatesStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemStatusIndicatorStyle[i];
        }
    }

    public BlazeWidgetItemStatusIndicatorStyle(@NotNull BlazeObjectPositioning blazeObjectPositioning, boolean z, @NotNull BlazeInsets blazeInsets, @NotNull BlazeInsets blazeInsets2, @NotNull BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle, @NotNull BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle2, @NotNull BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle3, @NotNull BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle4, @NotNull BlazeWidgetItemStatusIndicatorStreamStatesStyle blazeWidgetItemStatusIndicatorStreamStatesStyle) {
        blazeObjectPositioning.getClass();
        blazeInsets.getClass();
        blazeInsets2.getClass();
        blazeWidgetItemStatusIndicatorStateStyle.getClass();
        blazeWidgetItemStatusIndicatorStateStyle2.getClass();
        blazeWidgetItemStatusIndicatorStateStyle3.getClass();
        blazeWidgetItemStatusIndicatorStateStyle4.getClass();
        blazeWidgetItemStatusIndicatorStreamStatesStyle.getClass();
        this.position = blazeObjectPositioning;
        this.isVisible = z;
        this.margins = blazeInsets;
        this.padding = blazeInsets2;
        this.liveUnreadState = blazeWidgetItemStatusIndicatorStateStyle;
        this.liveReadState = blazeWidgetItemStatusIndicatorStateStyle2;
        this.unreadState = blazeWidgetItemStatusIndicatorStateStyle3;
        this.readState = blazeWidgetItemStatusIndicatorStateStyle4;
        this.streamStates = blazeWidgetItemStatusIndicatorStreamStatesStyle;
    }

    public static /* synthetic */ BlazeWidgetItemStatusIndicatorStyle copy$default(BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle, BlazeObjectPositioning blazeObjectPositioning, boolean z, BlazeInsets blazeInsets, BlazeInsets blazeInsets2, BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle, BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle2, BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle3, BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle4, BlazeWidgetItemStatusIndicatorStreamStatesStyle blazeWidgetItemStatusIndicatorStreamStatesStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeObjectPositioning = blazeWidgetItemStatusIndicatorStyle.position;
        }
        if ((i & 2) != 0) {
            z = blazeWidgetItemStatusIndicatorStyle.isVisible;
        }
        if ((i & 4) != 0) {
            blazeInsets = blazeWidgetItemStatusIndicatorStyle.margins;
        }
        if ((i & 8) != 0) {
            blazeInsets2 = blazeWidgetItemStatusIndicatorStyle.padding;
        }
        if ((i & 16) != 0) {
            blazeWidgetItemStatusIndicatorStateStyle = blazeWidgetItemStatusIndicatorStyle.liveUnreadState;
        }
        if ((i & 32) != 0) {
            blazeWidgetItemStatusIndicatorStateStyle2 = blazeWidgetItemStatusIndicatorStyle.liveReadState;
        }
        if ((i & 64) != 0) {
            blazeWidgetItemStatusIndicatorStateStyle3 = blazeWidgetItemStatusIndicatorStyle.unreadState;
        }
        if ((i & 128) != 0) {
            blazeWidgetItemStatusIndicatorStateStyle4 = blazeWidgetItemStatusIndicatorStyle.readState;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            blazeWidgetItemStatusIndicatorStreamStatesStyle = blazeWidgetItemStatusIndicatorStyle.streamStates;
        }
        BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle5 = blazeWidgetItemStatusIndicatorStateStyle4;
        BlazeWidgetItemStatusIndicatorStreamStatesStyle blazeWidgetItemStatusIndicatorStreamStatesStyle2 = blazeWidgetItemStatusIndicatorStreamStatesStyle;
        BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle6 = blazeWidgetItemStatusIndicatorStateStyle2;
        BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle7 = blazeWidgetItemStatusIndicatorStateStyle3;
        BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle8 = blazeWidgetItemStatusIndicatorStateStyle;
        BlazeInsets blazeInsets3 = blazeInsets;
        return blazeWidgetItemStatusIndicatorStyle.copy(blazeObjectPositioning, z, blazeInsets3, blazeInsets2, blazeWidgetItemStatusIndicatorStateStyle8, blazeWidgetItemStatusIndicatorStateStyle6, blazeWidgetItemStatusIndicatorStateStyle7, blazeWidgetItemStatusIndicatorStateStyle5, blazeWidgetItemStatusIndicatorStreamStatesStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeObjectPositioning getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
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
    public final BlazeWidgetItemStatusIndicatorStateStyle getLiveUnreadState() {
        return this.liveUnreadState;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeWidgetItemStatusIndicatorStateStyle getLiveReadState() {
        return this.liveReadState;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeWidgetItemStatusIndicatorStateStyle getUnreadState() {
        return this.unreadState;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeWidgetItemStatusIndicatorStateStyle getReadState() {
        return this.readState;
    }

    @NotNull
    /* renamed from: component9$blazesdk_release, reason: from getter */
    public final BlazeWidgetItemStatusIndicatorStreamStatesStyle getStreamStates() {
        return this.streamStates;
    }

    @NotNull
    public final BlazeWidgetItemStatusIndicatorStyle copy(@NotNull BlazeObjectPositioning position, boolean isVisible, @NotNull BlazeInsets margins, @NotNull BlazeInsets padding, @NotNull BlazeWidgetItemStatusIndicatorStateStyle liveUnreadState, @NotNull BlazeWidgetItemStatusIndicatorStateStyle liveReadState, @NotNull BlazeWidgetItemStatusIndicatorStateStyle unreadState, @NotNull BlazeWidgetItemStatusIndicatorStateStyle readState, @NotNull BlazeWidgetItemStatusIndicatorStreamStatesStyle streamStates) {
        position.getClass();
        margins.getClass();
        padding.getClass();
        liveUnreadState.getClass();
        liveReadState.getClass();
        unreadState.getClass();
        readState.getClass();
        streamStates.getClass();
        return new BlazeWidgetItemStatusIndicatorStyle(position, isVisible, margins, padding, liveUnreadState, liveReadState, unreadState, readState, streamStates);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemStatusIndicatorStyle)) {
            return false;
        }
        BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle = (BlazeWidgetItemStatusIndicatorStyle) other;
        return Intrinsics.c(this.position, blazeWidgetItemStatusIndicatorStyle.position) && this.isVisible == blazeWidgetItemStatusIndicatorStyle.isVisible && Intrinsics.c(this.margins, blazeWidgetItemStatusIndicatorStyle.margins) && Intrinsics.c(this.padding, blazeWidgetItemStatusIndicatorStyle.padding) && Intrinsics.c(this.liveUnreadState, blazeWidgetItemStatusIndicatorStyle.liveUnreadState) && Intrinsics.c(this.liveReadState, blazeWidgetItemStatusIndicatorStyle.liveReadState) && Intrinsics.c(this.unreadState, blazeWidgetItemStatusIndicatorStyle.unreadState) && Intrinsics.c(this.readState, blazeWidgetItemStatusIndicatorStyle.readState) && Intrinsics.c(this.streamStates, blazeWidgetItemStatusIndicatorStyle.streamStates);
    }

    @NotNull
    public final BlazeWidgetItemStatusIndicatorStateStyle getLiveReadState() {
        return this.liveReadState;
    }

    @NotNull
    public final BlazeWidgetItemStatusIndicatorStateStyle getLiveUnreadState() {
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
    public final BlazeWidgetItemStatusIndicatorStateStyle getReadState() {
        return this.readState;
    }

    @NotNull
    public final BlazeWidgetItemStatusIndicatorStreamStatesStyle getStreamStates$blazesdk_release() {
        return this.streamStates;
    }

    @NotNull
    public final BlazeWidgetItemStatusIndicatorStateStyle getUnreadState() {
        return this.unreadState;
    }

    public int hashCode() {
        return this.streamStates.hashCode() + ((this.readState.hashCode() + ((this.unreadState.hashCode() + ((this.liveReadState.hashCode() + ((this.liveUnreadState.hashCode() + ((this.padding.hashCode() + ((this.margins.hashCode() + u0a.t(this.position.hashCode() * 31, this.isVisible)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setLiveReadState(@NotNull BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle) {
        blazeWidgetItemStatusIndicatorStateStyle.getClass();
        this.liveReadState = blazeWidgetItemStatusIndicatorStateStyle;
    }

    public final void setLiveUnreadState(@NotNull BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle) {
        blazeWidgetItemStatusIndicatorStateStyle.getClass();
        this.liveUnreadState = blazeWidgetItemStatusIndicatorStateStyle;
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

    public final void setReadState(@NotNull BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle) {
        blazeWidgetItemStatusIndicatorStateStyle.getClass();
        this.readState = blazeWidgetItemStatusIndicatorStateStyle;
    }

    public final void setStreamStates$blazesdk_release(@NotNull BlazeWidgetItemStatusIndicatorStreamStatesStyle blazeWidgetItemStatusIndicatorStreamStatesStyle) {
        blazeWidgetItemStatusIndicatorStreamStatesStyle.getClass();
        this.streamStates = blazeWidgetItemStatusIndicatorStreamStatesStyle;
    }

    public final void setUnreadState(@NotNull BlazeWidgetItemStatusIndicatorStateStyle blazeWidgetItemStatusIndicatorStateStyle) {
        blazeWidgetItemStatusIndicatorStateStyle.getClass();
        this.unreadState = blazeWidgetItemStatusIndicatorStateStyle;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetItemStatusIndicatorStyle(position=" + this.position + ", isVisible=" + this.isVisible + ", margins=" + this.margins + ", padding=" + this.padding + ", liveUnreadState=" + this.liveUnreadState + ", liveReadState=" + this.liveReadState + ", unreadState=" + this.unreadState + ", readState=" + this.readState + ", streamStates=" + this.streamStates + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.position.writeToParcel(dest, flags);
        dest.writeInt(this.isVisible ? 1 : 0);
        this.margins.writeToParcel(dest, flags);
        this.padding.writeToParcel(dest, flags);
        this.liveUnreadState.writeToParcel(dest, flags);
        this.liveReadState.writeToParcel(dest, flags);
        this.unreadState.writeToParcel(dest, flags);
        this.readState.writeToParcel(dest, flags);
        this.streamStates.writeToParcel(dest, flags);
    }
}
