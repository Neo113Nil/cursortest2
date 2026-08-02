package com.blaze.blazesdk.style.players.moments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerChipsStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "ad", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerChipStyle;", "<init>", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerChipStyle;)V", "getAd", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerChipStyle;", "setAd", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeMomentsPlayerChipsStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerChipsStyle> CREATOR = new a();

    @NotNull
    private BlazeMomentsPlayerChipStyle ad;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeMomentsPlayerChipsStyle(BlazeMomentsPlayerChipStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerChipsStyle[i];
        }
    }

    public BlazeMomentsPlayerChipsStyle(@NotNull BlazeMomentsPlayerChipStyle blazeMomentsPlayerChipStyle) {
        blazeMomentsPlayerChipStyle.getClass();
        this.ad = blazeMomentsPlayerChipStyle;
    }

    public static /* synthetic */ BlazeMomentsPlayerChipsStyle copy$default(BlazeMomentsPlayerChipsStyle blazeMomentsPlayerChipsStyle, BlazeMomentsPlayerChipStyle blazeMomentsPlayerChipStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeMomentsPlayerChipStyle = blazeMomentsPlayerChipsStyle.ad;
        }
        return blazeMomentsPlayerChipsStyle.copy(blazeMomentsPlayerChipStyle);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeMomentsPlayerChipStyle getAd() {
        return this.ad;
    }

    @NotNull
    public final BlazeMomentsPlayerChipsStyle copy(@NotNull BlazeMomentsPlayerChipStyle ad) {
        ad.getClass();
        return new BlazeMomentsPlayerChipsStyle(ad);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BlazeMomentsPlayerChipsStyle) && Intrinsics.c(this.ad, ((BlazeMomentsPlayerChipsStyle) other).ad);
    }

    @NotNull
    public final BlazeMomentsPlayerChipStyle getAd() {
        return this.ad;
    }

    public int hashCode() {
        return this.ad.hashCode();
    }

    public final void setAd(@NotNull BlazeMomentsPlayerChipStyle blazeMomentsPlayerChipStyle) {
        blazeMomentsPlayerChipStyle.getClass();
        this.ad = blazeMomentsPlayerChipStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeMomentsPlayerChipsStyle(ad=" + this.ad + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.ad.writeToParcel(dest, flags);
    }
}
