package com.vk.ecomm.reviews.api.model.createreview;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.reviews.api.model.createreview.ProgressInfo;
import xsna.epx;
import xsna.nr;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UploadImageModel.kt */
/* loaded from: classes18.dex */
public final class UploadImageModel implements Parcelable {
    public static final Parcelable.Creator<UploadImageModel> CREATOR = new a();
    public final Integer b;
    public final String c;
    public final Integer d;
    public final ProgressInfo e;
    public final String f;
    public final Integer g;

    /* compiled from: UploadImageModel.kt */
    public static final class a implements Parcelable.Creator<UploadImageModel> {
        @Override // android.os.Parcelable.Creator
        public final UploadImageModel createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            ProgressInfo progressInfo = (ProgressInfo) parcel.readParcelable(UploadImageModel.class.getClassLoader());
            Integer num2 = num;
            Integer num3 = valueOf2;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                num2 = Integer.valueOf(parcel.readInt());
            }
            return new UploadImageModel(valueOf, readString, num3, progressInfo, readString2, num2);
        }

        @Override // android.os.Parcelable.Creator
        public final UploadImageModel[] newArray(int i) {
            return new UploadImageModel[i];
        }
    }

    public UploadImageModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static UploadImageModel a(UploadImageModel uploadImageModel, Integer num, Integer num2, ProgressInfo progressInfo, int i) {
        if ((i & 1) != 0) {
            num = uploadImageModel.b;
        }
        Integer num3 = num;
        String str = uploadImageModel.c;
        if ((i & 4) != 0) {
            num2 = uploadImageModel.d;
        }
        Integer num4 = num2;
        if ((i & 8) != 0) {
            progressInfo = uploadImageModel.e;
        }
        String str2 = uploadImageModel.f;
        Integer num5 = uploadImageModel.g;
        uploadImageModel.getClass();
        return new UploadImageModel(num3, str, num4, progressInfo, str2, num5);
    }

    public final Integer d() {
        Integer num = this.g;
        return num == null ? this.b : num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadImageModel)) {
            return false;
        }
        UploadImageModel uploadImageModel = (UploadImageModel) obj;
        return epx.f(this.b, uploadImageModel.b) && epx.f(this.c, uploadImageModel.c) && epx.f(this.d, uploadImageModel.d) && epx.f(this.e, uploadImageModel.e) && epx.f(this.f, uploadImageModel.f) && epx.f(this.g, uploadImageModel.g);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.g;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadImageModel(localImageId=");
        sb.append(this.b);
        sb.append(", localImageUrl=");
        sb.append(this.c);
        sb.append(", uploadedImageId=");
        sb.append(this.d);
        sb.append(", progressInfo=");
        sb.append(this.e);
        sb.append(", sentImageUrl=");
        sb.append(this.f);
        sb.append(", sentImageId=");
        return uqi.b(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.c);
        Integer num2 = this.d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        Integer num3 = this.g;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public UploadImageModel(Integer num, String str, Integer num2, ProgressInfo progressInfo, String str2, Integer num3) {
        this.b = num;
        this.c = str;
        this.d = num2;
        this.e = progressInfo;
        this.f = str2;
        this.g = num3;
    }

    public /* synthetic */ UploadImageModel(Integer num, String str, Integer num2, ProgressInfo progressInfo, String str2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? ProgressInfo.None.b : progressInfo, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num3);
    }
}
