package com.blaze.blazesdk.style.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.s6a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006&"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "start", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", PlayerKt.E_SPORTS_TOP, TtmlNode.END, "bottom", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getStart", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setStart", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getTop", "setTop", "getEnd", "setEnd", "getBottom", "setBottom", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeInsets implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeInsets> CREATOR = new a();

    @NotNull
    private BlazeDp bottom;

    @NotNull
    private BlazeDp end;

    @NotNull
    private BlazeDp start;

    @NotNull
    private BlazeDp top;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            return new BlazeInsets(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeInsets[i];
        }
    }

    public BlazeInsets(@NotNull BlazeDp blazeDp, @NotNull BlazeDp blazeDp2, @NotNull BlazeDp blazeDp3, @NotNull BlazeDp blazeDp4) {
        blazeDp.getClass();
        blazeDp2.getClass();
        blazeDp3.getClass();
        blazeDp4.getClass();
        this.start = blazeDp;
        this.top = blazeDp2;
        this.end = blazeDp3;
        this.bottom = blazeDp4;
    }

    public static /* synthetic */ BlazeInsets copy$default(BlazeInsets blazeInsets, BlazeDp blazeDp, BlazeDp blazeDp2, BlazeDp blazeDp3, BlazeDp blazeDp4, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeDp = blazeInsets.start;
        }
        if ((i & 2) != 0) {
            blazeDp2 = blazeInsets.top;
        }
        if ((i & 4) != 0) {
            blazeDp3 = blazeInsets.end;
        }
        if ((i & 8) != 0) {
            blazeDp4 = blazeInsets.bottom;
        }
        return blazeInsets.copy(blazeDp, blazeDp2, blazeDp3, blazeDp4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeDp getStart() {
        return this.start;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeDp getTop() {
        return this.top;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeDp getEnd() {
        return this.end;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeDp getBottom() {
        return this.bottom;
    }

    @NotNull
    public final BlazeInsets copy(@NotNull BlazeDp start, @NotNull BlazeDp top, @NotNull BlazeDp end, @NotNull BlazeDp bottom) {
        start.getClass();
        top.getClass();
        end.getClass();
        bottom.getClass();
        return new BlazeInsets(start, top, end, bottom);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeInsets)) {
            return false;
        }
        BlazeInsets blazeInsets = (BlazeInsets) other;
        return Intrinsics.c(this.start, blazeInsets.start) && Intrinsics.c(this.top, blazeInsets.top) && Intrinsics.c(this.end, blazeInsets.end) && Intrinsics.c(this.bottom, blazeInsets.bottom);
    }

    @NotNull
    public final BlazeDp getBottom() {
        return this.bottom;
    }

    @NotNull
    public final BlazeDp getEnd() {
        return this.end;
    }

    @NotNull
    public final BlazeDp getStart() {
        return this.start;
    }

    @NotNull
    public final BlazeDp getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.bottom.hashCode() + s6a.n(this.end, s6a.n(this.top, this.start.hashCode() * 31));
    }

    public final void setBottom(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.bottom = blazeDp;
    }

    public final void setEnd(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.end = blazeDp;
    }

    public final void setStart(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.start = blazeDp;
    }

    public final void setTop(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.top = blazeDp;
    }

    @NotNull
    public String toString() {
        return "BlazeInsets(start=" + this.start + ", top=" + this.top + ", end=" + this.end + ", bottom=" + this.bottom + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.start.writeToParcel(dest, flags);
        this.top.writeToParcel(dest, flags);
        this.end.writeToParcel(dest, flags);
        this.bottom.writeToParcel(dest, flags);
    }
}
