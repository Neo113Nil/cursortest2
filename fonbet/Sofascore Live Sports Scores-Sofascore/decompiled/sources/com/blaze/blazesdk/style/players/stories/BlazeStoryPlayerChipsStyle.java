package com.blaze.blazesdk.style.players.stories;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerChipsStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "ad", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerChipStyle;", "live", "<init>", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerChipStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerChipStyle;)V", "getAd", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerChipStyle;", "setAd", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerChipStyle;)V", "getLive", "setLive", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeStoryPlayerChipsStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeStoryPlayerChipsStyle> CREATOR = new a();

    @NotNull
    private BlazeStoryPlayerChipStyle ad;

    @NotNull
    private BlazeStoryPlayerChipStyle live;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeStoryPlayerChipStyle> creator = BlazeStoryPlayerChipStyle.CREATOR;
            return new BlazeStoryPlayerChipsStyle(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeStoryPlayerChipsStyle[i];
        }
    }

    public BlazeStoryPlayerChipsStyle(@NotNull BlazeStoryPlayerChipStyle blazeStoryPlayerChipStyle, @NotNull BlazeStoryPlayerChipStyle blazeStoryPlayerChipStyle2) {
        blazeStoryPlayerChipStyle.getClass();
        blazeStoryPlayerChipStyle2.getClass();
        this.ad = blazeStoryPlayerChipStyle;
        this.live = blazeStoryPlayerChipStyle2;
    }

    public static /* synthetic */ BlazeStoryPlayerChipsStyle copy$default(BlazeStoryPlayerChipsStyle blazeStoryPlayerChipsStyle, BlazeStoryPlayerChipStyle blazeStoryPlayerChipStyle, BlazeStoryPlayerChipStyle blazeStoryPlayerChipStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeStoryPlayerChipStyle = blazeStoryPlayerChipsStyle.ad;
        }
        if ((i & 2) != 0) {
            blazeStoryPlayerChipStyle2 = blazeStoryPlayerChipsStyle.live;
        }
        return blazeStoryPlayerChipsStyle.copy(blazeStoryPlayerChipStyle, blazeStoryPlayerChipStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeStoryPlayerChipStyle getAd() {
        return this.ad;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeStoryPlayerChipStyle getLive() {
        return this.live;
    }

    @NotNull
    public final BlazeStoryPlayerChipsStyle copy(@NotNull BlazeStoryPlayerChipStyle ad, @NotNull BlazeStoryPlayerChipStyle live) {
        ad.getClass();
        live.getClass();
        return new BlazeStoryPlayerChipsStyle(ad, live);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeStoryPlayerChipsStyle)) {
            return false;
        }
        BlazeStoryPlayerChipsStyle blazeStoryPlayerChipsStyle = (BlazeStoryPlayerChipsStyle) other;
        return Intrinsics.c(this.ad, blazeStoryPlayerChipsStyle.ad) && Intrinsics.c(this.live, blazeStoryPlayerChipsStyle.live);
    }

    @NotNull
    public final BlazeStoryPlayerChipStyle getAd() {
        return this.ad;
    }

    @NotNull
    public final BlazeStoryPlayerChipStyle getLive() {
        return this.live;
    }

    public int hashCode() {
        return this.live.hashCode() + (this.ad.hashCode() * 31);
    }

    public final void setAd(@NotNull BlazeStoryPlayerChipStyle blazeStoryPlayerChipStyle) {
        blazeStoryPlayerChipStyle.getClass();
        this.ad = blazeStoryPlayerChipStyle;
    }

    public final void setLive(@NotNull BlazeStoryPlayerChipStyle blazeStoryPlayerChipStyle) {
        blazeStoryPlayerChipStyle.getClass();
        this.live = blazeStoryPlayerChipStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeStoryPlayerChipsStyle(ad=" + this.ad + ", live=" + this.live + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.ad.writeToParcel(dest, flags);
        this.live.writeToParcel(dest, flags);
    }
}
