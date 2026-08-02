package ru.ozon.app.android.video;

import E0.C2942q;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/video/VideoPosition;", "Landroid/os/Parcelable;", "", "link", "", "videoPosition", "<init>", "(Ljava/lang/String;J)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "J", "getVideoPosition", "()J", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoPosition implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<VideoPosition> CREATOR = new Creator();

    @NotNull
    private final String link;
    private final long videoPosition;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VideoPosition> {
        @Override // android.os.Parcelable.Creator
        public final VideoPosition createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VideoPosition(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPosition[] newArray(int i11) {
            return new VideoPosition[i11];
        }
    }

    public VideoPosition(@NotNull String link, long j11) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.link = link;
        this.videoPosition = j11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPosition)) {
            return false;
        }
        VideoPosition videoPosition = (VideoPosition) other;
        return Intrinsics.d(this.link, videoPosition.link) && this.videoPosition == videoPosition.videoPosition;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final long getVideoPosition() {
        return this.videoPosition;
    }

    public int hashCode() {
        return Long.hashCode(this.videoPosition) + (this.link.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder d11 = C2942q.d(this.videoPosition, "VideoPosition(link=", this.link, ", videoPosition=");
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.link);
        dest.writeLong(this.videoPosition);
    }
}
