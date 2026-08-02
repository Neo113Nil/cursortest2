package com.giphy.sdk.core.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/giphy/sdk/core/models/Assets;", "Landroid/os/Parcelable;", "source", "Lcom/giphy/sdk/core/models/Asset;", "size360p", "size480p", "size720p", "size1080p", "size4k", "(Lcom/giphy/sdk/core/models/Asset;Lcom/giphy/sdk/core/models/Asset;Lcom/giphy/sdk/core/models/Asset;Lcom/giphy/sdk/core/models/Asset;Lcom/giphy/sdk/core/models/Asset;Lcom/giphy/sdk/core/models/Asset;)V", "getSize1080p", "()Lcom/giphy/sdk/core/models/Asset;", "getSize360p", "getSize480p", "getSize4k", "getSize720p", "getSource", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Assets implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Assets> CREATOR = new Creator();

    @c("1080p")
    @Nullable
    private final Asset size1080p;

    @c("360p")
    @Nullable
    private final Asset size360p;

    @c("480p")
    @Nullable
    private final Asset size480p;

    @c("4k")
    @Nullable
    private final Asset size4k;

    @c("720p")
    @Nullable
    private final Asset size720p;

    @c("source")
    @Nullable
    private final Asset source;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Assets> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Assets createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Assets(parcel.readInt() == 0 ? null : Asset.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Asset.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Asset.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Asset.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Asset.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Asset.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Assets[] newArray(int i10) {
            return new Assets[i10];
        }
    }

    public Assets() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Asset getSize1080p() {
        return this.size1080p;
    }

    @Nullable
    public final Asset getSize360p() {
        return this.size360p;
    }

    @Nullable
    public final Asset getSize480p() {
        return this.size480p;
    }

    @Nullable
    public final Asset getSize4k() {
        return this.size4k;
    }

    @Nullable
    public final Asset getSize720p() {
        return this.size720p;
    }

    @Nullable
    public final Asset getSource() {
        return this.source;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Asset asset = this.source;
        if (asset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            asset.writeToParcel(parcel, flags);
        }
        Asset asset2 = this.size360p;
        if (asset2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            asset2.writeToParcel(parcel, flags);
        }
        Asset asset3 = this.size480p;
        if (asset3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            asset3.writeToParcel(parcel, flags);
        }
        Asset asset4 = this.size720p;
        if (asset4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            asset4.writeToParcel(parcel, flags);
        }
        Asset asset5 = this.size1080p;
        if (asset5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            asset5.writeToParcel(parcel, flags);
        }
        Asset asset6 = this.size4k;
        if (asset6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            asset6.writeToParcel(parcel, flags);
        }
    }

    public Assets(@Nullable Asset asset, @Nullable Asset asset2, @Nullable Asset asset3, @Nullable Asset asset4, @Nullable Asset asset5, @Nullable Asset asset6) {
        this.source = asset;
        this.size360p = asset2;
        this.size480p = asset3;
        this.size720p = asset4;
        this.size1080p = asset5;
        this.size4k = asset6;
    }

    public /* synthetic */ Assets(Asset asset, Asset asset2, Asset asset3, Asset asset4, Asset asset5, Asset asset6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : asset, (i10 & 2) != 0 ? null : asset2, (i10 & 4) != 0 ? null : asset3, (i10 & 8) != 0 ? null : asset4, (i10 & 16) != 0 ? null : asset5, (i10 & 32) != 0 ? null : asset6);
    }
}
