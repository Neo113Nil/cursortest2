package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.mxl;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006&"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStreamStatesStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "upcomingStreamState", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStateStyle;", "liveStreamState", "endedStreamState", "<init>", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStateStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStateStyle;)V", "getUpcomingStreamState", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStateStyle;", "setUpcomingStreamState", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStateStyle;)V", "getLiveStreamState", "setLiveStreamState", "getEndedStreamState", "setEndedStreamState", "getStyleByStreamStatus", "status", "Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLiveStreamStatus;", "getStyleByStreamStatus$blazesdk_release", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemEventTimeElementStreamStatesStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemEventTimeElementStreamStatesStyle> CREATOR = new a();

    @NotNull
    private BlazeWidgetItemEventTimeElementStateStyle endedStreamState;

    @NotNull
    private BlazeWidgetItemEventTimeElementStateStyle liveStreamState;

    @NotNull
    private BlazeWidgetItemEventTimeElementStateStyle upcomingStreamState;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeWidgetItemEventTimeElementStateStyle> creator = BlazeWidgetItemEventTimeElementStateStyle.CREATOR;
            return new BlazeWidgetItemEventTimeElementStreamStatesStyle(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemEventTimeElementStreamStatesStyle[i];
        }
    }

    public BlazeWidgetItemEventTimeElementStreamStatesStyle(@NotNull BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle, @NotNull BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle2, @NotNull BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle3) {
        blazeWidgetItemEventTimeElementStateStyle.getClass();
        blazeWidgetItemEventTimeElementStateStyle2.getClass();
        blazeWidgetItemEventTimeElementStateStyle3.getClass();
        this.upcomingStreamState = blazeWidgetItemEventTimeElementStateStyle;
        this.liveStreamState = blazeWidgetItemEventTimeElementStateStyle2;
        this.endedStreamState = blazeWidgetItemEventTimeElementStateStyle3;
    }

    public static /* synthetic */ BlazeWidgetItemEventTimeElementStreamStatesStyle copy$default(BlazeWidgetItemEventTimeElementStreamStatesStyle blazeWidgetItemEventTimeElementStreamStatesStyle, BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle, BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle2, BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle3, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeWidgetItemEventTimeElementStateStyle = blazeWidgetItemEventTimeElementStreamStatesStyle.upcomingStreamState;
        }
        if ((i & 2) != 0) {
            blazeWidgetItemEventTimeElementStateStyle2 = blazeWidgetItemEventTimeElementStreamStatesStyle.liveStreamState;
        }
        if ((i & 4) != 0) {
            blazeWidgetItemEventTimeElementStateStyle3 = blazeWidgetItemEventTimeElementStreamStatesStyle.endedStreamState;
        }
        return blazeWidgetItemEventTimeElementStreamStatesStyle.copy(blazeWidgetItemEventTimeElementStateStyle, blazeWidgetItemEventTimeElementStateStyle2, blazeWidgetItemEventTimeElementStateStyle3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeWidgetItemEventTimeElementStateStyle getUpcomingStreamState() {
        return this.upcomingStreamState;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeWidgetItemEventTimeElementStateStyle getLiveStreamState() {
        return this.liveStreamState;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeWidgetItemEventTimeElementStateStyle getEndedStreamState() {
        return this.endedStreamState;
    }

    @NotNull
    public final BlazeWidgetItemEventTimeElementStreamStatesStyle copy(@NotNull BlazeWidgetItemEventTimeElementStateStyle upcomingStreamState, @NotNull BlazeWidgetItemEventTimeElementStateStyle liveStreamState, @NotNull BlazeWidgetItemEventTimeElementStateStyle endedStreamState) {
        upcomingStreamState.getClass();
        liveStreamState.getClass();
        endedStreamState.getClass();
        return new BlazeWidgetItemEventTimeElementStreamStatesStyle(upcomingStreamState, liveStreamState, endedStreamState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemEventTimeElementStreamStatesStyle)) {
            return false;
        }
        BlazeWidgetItemEventTimeElementStreamStatesStyle blazeWidgetItemEventTimeElementStreamStatesStyle = (BlazeWidgetItemEventTimeElementStreamStatesStyle) other;
        return Intrinsics.c(this.upcomingStreamState, blazeWidgetItemEventTimeElementStreamStatesStyle.upcomingStreamState) && Intrinsics.c(this.liveStreamState, blazeWidgetItemEventTimeElementStreamStatesStyle.liveStreamState) && Intrinsics.c(this.endedStreamState, blazeWidgetItemEventTimeElementStreamStatesStyle.endedStreamState);
    }

    @NotNull
    public final BlazeWidgetItemEventTimeElementStateStyle getEndedStreamState() {
        return this.endedStreamState;
    }

    @NotNull
    public final BlazeWidgetItemEventTimeElementStateStyle getLiveStreamState() {
        return this.liveStreamState;
    }

    @NotNull
    public final BlazeWidgetItemEventTimeElementStateStyle getStyleByStreamStatus$blazesdk_release(@NotNull BlazeLiveStreamStatus status) {
        status.getClass();
        int i = mxl.a[status.ordinal()];
        if (i == 1) {
            return this.upcomingStreamState;
        }
        if (i == 2) {
            return this.liveStreamState;
        }
        if (i == 3) {
            return this.endedStreamState;
        }
        zzl.b();
        return null;
    }

    @NotNull
    public final BlazeWidgetItemEventTimeElementStateStyle getUpcomingStreamState() {
        return this.upcomingStreamState;
    }

    public int hashCode() {
        return this.endedStreamState.hashCode() + ((this.liveStreamState.hashCode() + (this.upcomingStreamState.hashCode() * 31)) * 31);
    }

    public final void setEndedStreamState(@NotNull BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle) {
        blazeWidgetItemEventTimeElementStateStyle.getClass();
        this.endedStreamState = blazeWidgetItemEventTimeElementStateStyle;
    }

    public final void setLiveStreamState(@NotNull BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle) {
        blazeWidgetItemEventTimeElementStateStyle.getClass();
        this.liveStreamState = blazeWidgetItemEventTimeElementStateStyle;
    }

    public final void setUpcomingStreamState(@NotNull BlazeWidgetItemEventTimeElementStateStyle blazeWidgetItemEventTimeElementStateStyle) {
        blazeWidgetItemEventTimeElementStateStyle.getClass();
        this.upcomingStreamState = blazeWidgetItemEventTimeElementStateStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetItemEventTimeElementStreamStatesStyle(upcomingStreamState=" + this.upcomingStreamState + ", liveStreamState=" + this.liveStreamState + ", endedStreamState=" + this.endedStreamState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.upcomingStreamState.writeToParcel(dest, flags);
        this.liveStreamState.writeToParcel(dest, flags);
        this.endedStreamState.writeToParcel(dest, flags);
    }
}
