package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "padding", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "streamStates", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStreamStatesStyle;", "<init>", "(ZLcom/blaze/blazesdk/style/shared/models/BlazeInsets;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStreamStatesStyle;)V", "()Z", "setVisible", "(Z)V", "getPadding", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "setPadding", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "getStreamStates", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStreamStatesStyle;", "setStreamStates", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStatusIndicatorStreamStatesStyle;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerStatusIndicatorStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerStatusIndicatorStyle> CREATOR = new a();
    private boolean isVisible;

    @NotNull
    private BlazeInsets padding;

    @NotNull
    private BlazeVideosPlayerStatusIndicatorStreamStatesStyle streamStates;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeVideosPlayerStatusIndicatorStyle(parcel.readInt() != 0, BlazeInsets.CREATOR.createFromParcel(parcel), BlazeVideosPlayerStatusIndicatorStreamStatesStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerStatusIndicatorStyle[i];
        }
    }

    public BlazeVideosPlayerStatusIndicatorStyle(boolean z, @NotNull BlazeInsets blazeInsets, @NotNull BlazeVideosPlayerStatusIndicatorStreamStatesStyle blazeVideosPlayerStatusIndicatorStreamStatesStyle) {
        blazeInsets.getClass();
        blazeVideosPlayerStatusIndicatorStreamStatesStyle.getClass();
        this.isVisible = z;
        this.padding = blazeInsets;
        this.streamStates = blazeVideosPlayerStatusIndicatorStreamStatesStyle;
    }

    public static /* synthetic */ BlazeVideosPlayerStatusIndicatorStyle copy$default(BlazeVideosPlayerStatusIndicatorStyle blazeVideosPlayerStatusIndicatorStyle, boolean z, BlazeInsets blazeInsets, BlazeVideosPlayerStatusIndicatorStreamStatesStyle blazeVideosPlayerStatusIndicatorStreamStatesStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeVideosPlayerStatusIndicatorStyle.isVisible;
        }
        if ((i & 2) != 0) {
            blazeInsets = blazeVideosPlayerStatusIndicatorStyle.padding;
        }
        if ((i & 4) != 0) {
            blazeVideosPlayerStatusIndicatorStreamStatesStyle = blazeVideosPlayerStatusIndicatorStyle.streamStates;
        }
        return blazeVideosPlayerStatusIndicatorStyle.copy(z, blazeInsets, blazeVideosPlayerStatusIndicatorStreamStatesStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeVideosPlayerStatusIndicatorStreamStatesStyle getStreamStates() {
        return this.streamStates;
    }

    @NotNull
    public final BlazeVideosPlayerStatusIndicatorStyle copy(boolean isVisible, @NotNull BlazeInsets padding, @NotNull BlazeVideosPlayerStatusIndicatorStreamStatesStyle streamStates) {
        padding.getClass();
        streamStates.getClass();
        return new BlazeVideosPlayerStatusIndicatorStyle(isVisible, padding, streamStates);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerStatusIndicatorStyle)) {
            return false;
        }
        BlazeVideosPlayerStatusIndicatorStyle blazeVideosPlayerStatusIndicatorStyle = (BlazeVideosPlayerStatusIndicatorStyle) other;
        return this.isVisible == blazeVideosPlayerStatusIndicatorStyle.isVisible && Intrinsics.c(this.padding, blazeVideosPlayerStatusIndicatorStyle.padding) && Intrinsics.c(this.streamStates, blazeVideosPlayerStatusIndicatorStyle.streamStates);
    }

    @NotNull
    public final BlazeInsets getPadding() {
        return this.padding;
    }

    @NotNull
    public final BlazeVideosPlayerStatusIndicatorStreamStatesStyle getStreamStates() {
        return this.streamStates;
    }

    public int hashCode() {
        return this.streamStates.hashCode() + ((this.padding.hashCode() + (Boolean.hashCode(this.isVisible) * 31)) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setPadding(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.padding = blazeInsets;
    }

    public final void setStreamStates(@NotNull BlazeVideosPlayerStatusIndicatorStreamStatesStyle blazeVideosPlayerStatusIndicatorStreamStatesStyle) {
        blazeVideosPlayerStatusIndicatorStreamStatesStyle.getClass();
        this.streamStates = blazeVideosPlayerStatusIndicatorStreamStatesStyle;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosPlayerStatusIndicatorStyle(isVisible=" + this.isVisible + ", padding=" + this.padding + ", streamStates=" + this.streamStates + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        this.padding.writeToParcel(dest, flags);
        this.streamStates.writeToParcel(dest, flags);
    }
}
