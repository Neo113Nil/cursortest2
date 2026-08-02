package com.vk.clips.sdk.shared.api.decoration;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import xsna.cq;
import xsna.epx;

/* compiled from: RecommendationDecorationPayload.kt */
/* loaded from: classes17.dex */
public final class RecommendationDecorationPayload implements ClipsFeedDecorationPayload {
    public static final Parcelable.Creator<RecommendationDecorationPayload> CREATOR = new a();
    public final SdkClipVideoFile b;

    /* compiled from: RecommendationDecorationPayload.kt */
    public static final class a implements Parcelable.Creator<RecommendationDecorationPayload> {
        @Override // android.os.Parcelable.Creator
        public final RecommendationDecorationPayload createFromParcel(Parcel parcel) {
            return new RecommendationDecorationPayload((SdkClipVideoFile) parcel.readParcelable(RecommendationDecorationPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendationDecorationPayload[] newArray(int i) {
            return new RecommendationDecorationPayload[i];
        }
    }

    public RecommendationDecorationPayload(SdkClipVideoFile sdkClipVideoFile) {
        this.b = sdkClipVideoFile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendationDecorationPayload) && epx.f(this.b, ((RecommendationDecorationPayload) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return cq.d(new StringBuilder("RecommendationDecorationPayload(sdkClipVideoFile="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
