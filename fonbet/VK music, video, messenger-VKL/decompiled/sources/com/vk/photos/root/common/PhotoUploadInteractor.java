package com.vk.photos.root.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: PhotoUploadInteractor.kt */
/* loaded from: classes4.dex */
public interface PhotoUploadInteractor {

    /* compiled from: PhotoUploadInteractor.kt */
    public static final class UploadTaskExtraParams implements Parcelable {
        public static final Parcelable.Creator<UploadTaskExtraParams> CREATOR = new a();
        public final List<String> b;

        /* compiled from: PhotoUploadInteractor.kt */
        public static final class a implements Parcelable.Creator<UploadTaskExtraParams> {
            @Override // android.os.Parcelable.Creator
            public final UploadTaskExtraParams createFromParcel(Parcel parcel) {
                return new UploadTaskExtraParams(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final UploadTaskExtraParams[] newArray(int i) {
                return new UploadTaskExtraParams[i];
            }
        }

        public UploadTaskExtraParams(List<String> list) {
            this.b = list;
            list.size();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UploadTaskExtraParams) && epx.f(this.b, ((UploadTaskExtraParams) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UploadTaskExtraParams(photos="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.b);
        }
    }

    /* compiled from: PhotoUploadInteractor.kt */
    public interface a {
        com.vk.photos.root.common.a a(int i, UserId userId);
    }

    Integer a(int i, int i2, Intent intent, io.reactivex.rxjava3.disposables.b bVar);
}
