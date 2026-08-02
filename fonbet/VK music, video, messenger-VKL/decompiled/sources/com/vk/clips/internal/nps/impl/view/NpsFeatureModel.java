package com.vk.clips.internal.nps.impl.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import com.vk.dto.common.Image;
import xsna.epx;
import xsna.fq;

/* compiled from: NpsFeatureModel.kt */
/* loaded from: classes16.dex */
public final class NpsFeatureModel implements Parcelable {
    public static final Parcelable.Creator<NpsFeatureModel> CREATOR = new a();
    public final String b;
    public final Image c;
    public final InternalNpsQuestions d;

    /* compiled from: NpsFeatureModel.kt */
    public static final class a implements Parcelable.Creator<NpsFeatureModel> {
        @Override // android.os.Parcelable.Creator
        public final NpsFeatureModel createFromParcel(Parcel parcel) {
            return new NpsFeatureModel(parcel.readString(), (Image) parcel.readParcelable(NpsFeatureModel.class.getClassLoader()), (InternalNpsQuestions) parcel.readParcelable(NpsFeatureModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NpsFeatureModel[] newArray(int i) {
            return new NpsFeatureModel[i];
        }
    }

    public NpsFeatureModel(String str, Image image, InternalNpsQuestions internalNpsQuestions) {
        this.b = str;
        this.c = image;
        this.d = internalNpsQuestions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NpsFeatureModel)) {
            return false;
        }
        NpsFeatureModel npsFeatureModel = (NpsFeatureModel) obj;
        return epx.f(this.b, npsFeatureModel.b) && epx.f(this.c, npsFeatureModel.c) && epx.f(this.d, npsFeatureModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fq.b(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "NpsFeatureModel(contentId=" + this.b + ", image=" + this.c + ", questions=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
