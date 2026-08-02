package com.giphy.sdk.core.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/giphy/sdk/core/models/VideoCaptions;", "Landroid/os/Parcelable;", "videoCaption", "Lcom/giphy/sdk/core/models/VideoCaption;", "(Lcom/giphy/sdk/core/models/VideoCaption;)V", "getVideoCaption", "()Lcom/giphy/sdk/core/models/VideoCaption;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoCaptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VideoCaptions> CREATOR = new Creator();

    @c("en")
    @Nullable
    private final VideoCaption videoCaption;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VideoCaptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final VideoCaptions createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VideoCaptions(parcel.readInt() == 0 ? null : VideoCaption.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final VideoCaptions[] newArray(int i10) {
            return new VideoCaptions[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoCaptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final VideoCaption getVideoCaption() {
        return this.videoCaption;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        VideoCaption videoCaption = this.videoCaption;
        if (videoCaption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoCaption.writeToParcel(parcel, flags);
        }
    }

    public VideoCaptions(@Nullable VideoCaption videoCaption) {
        this.videoCaption = videoCaption;
    }

    public /* synthetic */ VideoCaptions(VideoCaption videoCaption, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : videoCaption);
    }
}
