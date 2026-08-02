package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/giphy/sdk/core/models/Video;", "Landroid/os/Parcelable;", "hlsManifestURL", "", "dashManifestURL", "assets", "Lcom/giphy/sdk/core/models/Assets;", "previews", "Lcom/giphy/sdk/core/models/Previews;", "captions", "Lcom/giphy/sdk/core/models/VideoCaptions;", "duration", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/giphy/sdk/core/models/Assets;Lcom/giphy/sdk/core/models/Previews;Lcom/giphy/sdk/core/models/VideoCaptions;Ljava/lang/Float;)V", "getAssets", "()Lcom/giphy/sdk/core/models/Assets;", "getCaptions", "()Lcom/giphy/sdk/core/models/VideoCaptions;", "getDashManifestURL", "()Ljava/lang/String;", "getDuration", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHlsManifestURL", "getPreviews", "()Lcom/giphy/sdk/core/models/Previews;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Video implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Video> CREATOR = new Creator();

    @Nullable
    private final Assets assets;

    @Nullable
    private final VideoCaptions captions;

    @Nullable
    private final String dashManifestURL;

    @Nullable
    private final Float duration;

    @Nullable
    private final String hlsManifestURL;

    @Nullable
    private final Previews previews;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Video> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Video createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Video(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Assets.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Previews.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoCaptions.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Video[] newArray(int i10) {
            return new Video[i10];
        }
    }

    public Video() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Assets getAssets() {
        return this.assets;
    }

    @Nullable
    public final VideoCaptions getCaptions() {
        return this.captions;
    }

    @Nullable
    public final String getDashManifestURL() {
        return this.dashManifestURL;
    }

    @Nullable
    public final Float getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getHlsManifestURL() {
        return this.hlsManifestURL;
    }

    @Nullable
    public final Previews getPreviews() {
        return this.previews;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.hlsManifestURL);
        parcel.writeString(this.dashManifestURL);
        Assets assets = this.assets;
        if (assets == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            assets.writeToParcel(parcel, flags);
        }
        Previews previews = this.previews;
        if (previews == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            previews.writeToParcel(parcel, flags);
        }
        VideoCaptions videoCaptions = this.captions;
        if (videoCaptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoCaptions.writeToParcel(parcel, flags);
        }
        Float f10 = this.duration;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f10.floatValue());
        }
    }

    public Video(@Nullable String str, @Nullable String str2, @Nullable Assets assets, @Nullable Previews previews, @Nullable VideoCaptions videoCaptions, @Nullable Float f10) {
        this.hlsManifestURL = str;
        this.dashManifestURL = str2;
        this.assets = assets;
        this.previews = previews;
        this.captions = videoCaptions;
        this.duration = f10;
    }

    public /* synthetic */ Video(String str, String str2, Assets assets, Previews previews, VideoCaptions videoCaptions, Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : assets, (i10 & 8) != 0 ? null : previews, (i10 & 16) != 0 ? null : videoCaptions, (i10 & 32) != 0 ? null : f10);
    }
}
