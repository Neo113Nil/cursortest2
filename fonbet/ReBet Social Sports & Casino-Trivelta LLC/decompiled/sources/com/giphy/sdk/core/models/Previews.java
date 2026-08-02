package com.giphy.sdk.core.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/giphy/sdk/core/models/Previews;", "Landroid/os/Parcelable;", "fixedWidth", "Lcom/giphy/sdk/core/models/VideoPreviewAsset;", "fixedHeight", "(Lcom/giphy/sdk/core/models/VideoPreviewAsset;Lcom/giphy/sdk/core/models/VideoPreviewAsset;)V", "getFixedHeight", "()Lcom/giphy/sdk/core/models/VideoPreviewAsset;", "getFixedWidth", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Previews implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Previews> CREATOR = new Creator();

    @c("fixed_height")
    @NotNull
    private final VideoPreviewAsset fixedHeight;

    @c("fixed_width")
    @NotNull
    private final VideoPreviewAsset fixedWidth;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Previews> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Previews createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<VideoPreviewAsset> creator = VideoPreviewAsset.CREATOR;
            return new Previews(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Previews[] newArray(int i10) {
            return new Previews[i10];
        }
    }

    public Previews(@NotNull VideoPreviewAsset fixedWidth, @NotNull VideoPreviewAsset fixedHeight) {
        Intrinsics.checkNotNullParameter(fixedWidth, "fixedWidth");
        Intrinsics.checkNotNullParameter(fixedHeight, "fixedHeight");
        this.fixedWidth = fixedWidth;
        this.fixedHeight = fixedHeight;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final VideoPreviewAsset getFixedHeight() {
        return this.fixedHeight;
    }

    @NotNull
    public final VideoPreviewAsset getFixedWidth() {
        return this.fixedWidth;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.fixedWidth.writeToParcel(parcel, flags);
        this.fixedHeight.writeToParcel(parcel, flags);
    }
}
