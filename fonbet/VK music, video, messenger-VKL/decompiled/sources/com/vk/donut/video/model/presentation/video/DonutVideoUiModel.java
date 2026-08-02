package com.vk.donut.video.model.presentation.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import xsna.epx;
import xsna.urd0;

/* compiled from: DonutVideoUiModel.kt */
/* loaded from: classes18.dex */
public final class DonutVideoUiModel implements Parcelable {
    public static final Parcelable.Creator<DonutVideoUiModel> CREATOR = new a();
    public final PreviewBadge b;
    public final DescriptionChip c;

    /* compiled from: DonutVideoUiModel.kt */
    public static final class DescriptionChip implements Parcelable {
        public static final Parcelable.Creator<DescriptionChip> CREATOR = new a();
        public final String b;
        public final DonutPriceTemplate c;
        public final String d;
        public final DonutVideoAction e;

        /* compiled from: DonutVideoUiModel.kt */
        public static final class a implements Parcelable.Creator<DescriptionChip> {
            @Override // android.os.Parcelable.Creator
            public final DescriptionChip createFromParcel(Parcel parcel) {
                return new DescriptionChip(parcel.readString(), (DonutPriceTemplate) parcel.readParcelable(DescriptionChip.class.getClassLoader()), parcel.readString(), (DonutVideoAction) parcel.readParcelable(DescriptionChip.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DescriptionChip[] newArray(int i) {
                return new DescriptionChip[i];
            }
        }

        public DescriptionChip(String str, DonutPriceTemplate donutPriceTemplate, String str2, DonutVideoAction donutVideoAction) {
            this.b = str;
            this.c = donutPriceTemplate;
            this.d = str2;
            this.e = donutVideoAction;
        }

        public final String d() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DescriptionChip)) {
                return false;
            }
            DescriptionChip descriptionChip = (DescriptionChip) obj;
            return epx.f(this.b, descriptionChip.b) && epx.f(this.c, descriptionChip.c) && epx.f(this.d, descriptionChip.d) && epx.f(this.e, descriptionChip.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            DonutPriceTemplate donutPriceTemplate = this.c;
            int a2 = urd0.a((hashCode + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31, 31, this.d);
            DonutVideoAction donutVideoAction = this.e;
            return a2 + (donutVideoAction != null ? donutVideoAction.hashCode() : 0);
        }

        public final String toString() {
            return "DescriptionChip(text=" + this.b + ", priceTemplate=" + this.c + ", contentDescription=" + this.d + ", action=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
        }
    }

    /* compiled from: DonutVideoUiModel.kt */
    public static final class PreviewBadge implements Parcelable {
        public static final Parcelable.Creator<PreviewBadge> CREATOR = new a();
        public final String b;
        public final DonutPriceTemplate c;
        public final String d;
        public final DonutVideoAction e;

        /* compiled from: DonutVideoUiModel.kt */
        public static final class a implements Parcelable.Creator<PreviewBadge> {
            @Override // android.os.Parcelable.Creator
            public final PreviewBadge createFromParcel(Parcel parcel) {
                return new PreviewBadge(parcel.readString(), (DonutPriceTemplate) parcel.readParcelable(PreviewBadge.class.getClassLoader()), parcel.readString(), (DonutVideoAction) parcel.readParcelable(PreviewBadge.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PreviewBadge[] newArray(int i) {
                return new PreviewBadge[i];
            }
        }

        public PreviewBadge(String str, DonutPriceTemplate donutPriceTemplate, String str2, DonutVideoAction donutVideoAction) {
            this.b = str;
            this.c = donutPriceTemplate;
            this.d = str2;
            this.e = donutVideoAction;
        }

        public final String d() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreviewBadge)) {
                return false;
            }
            PreviewBadge previewBadge = (PreviewBadge) obj;
            return epx.f(this.b, previewBadge.b) && epx.f(this.c, previewBadge.c) && epx.f(this.d, previewBadge.d) && epx.f(this.e, previewBadge.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            DonutPriceTemplate donutPriceTemplate = this.c;
            int a2 = urd0.a((hashCode + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31, 31, this.d);
            DonutVideoAction donutVideoAction = this.e;
            return a2 + (donutVideoAction != null ? donutVideoAction.hashCode() : 0);
        }

        public final String toString() {
            return "PreviewBadge(text=" + this.b + ", priceTemplate=" + this.c + ", contentDescription=" + this.d + ", action=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
        }
    }

    /* compiled from: DonutVideoUiModel.kt */
    public static final class a implements Parcelable.Creator<DonutVideoUiModel> {
        @Override // android.os.Parcelable.Creator
        public final DonutVideoUiModel createFromParcel(Parcel parcel) {
            return new DonutVideoUiModel(parcel.readInt() == 0 ? null : PreviewBadge.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DescriptionChip.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutVideoUiModel[] newArray(int i) {
            return new DonutVideoUiModel[i];
        }
    }

    public DonutVideoUiModel(PreviewBadge previewBadge, DescriptionChip descriptionChip) {
        this.b = previewBadge;
        this.c = descriptionChip;
    }

    public final DescriptionChip d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PreviewBadge e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutVideoUiModel)) {
            return false;
        }
        DonutVideoUiModel donutVideoUiModel = (DonutVideoUiModel) obj;
        return epx.f(this.b, donutVideoUiModel.b) && epx.f(this.c, donutVideoUiModel.c);
    }

    public final int hashCode() {
        PreviewBadge previewBadge = this.b;
        int hashCode = (previewBadge == null ? 0 : previewBadge.hashCode()) * 31;
        DescriptionChip descriptionChip = this.c;
        return hashCode + (descriptionChip != null ? descriptionChip.hashCode() : 0);
    }

    public final String toString() {
        return "DonutVideoUiModel(previewBadge=" + this.b + ", descriptionChip=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PreviewBadge previewBadge = this.b;
        if (previewBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            previewBadge.writeToParcel(parcel, i);
        }
        DescriptionChip descriptionChip = this.c;
        if (descriptionChip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            descriptionChip.writeToParcel(parcel, i);
        }
    }
}
