package com.vk.ecomm.reviews.impl.pinnedreview.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;

/* compiled from: PinReviewDetailsScreenResult.kt */
/* loaded from: classes18.dex */
public interface PinReviewDetailsScreenResult extends Parcelable {

    /* compiled from: PinReviewDetailsScreenResult.kt */
    public static final class ChangePaymentMethodClick implements PinReviewDetailsScreenResult {
        public static final ChangePaymentMethodClick b = new ChangePaymentMethodClick();
        public static final Parcelable.Creator<ChangePaymentMethodClick> CREATOR = new a();

        /* compiled from: PinReviewDetailsScreenResult.kt */
        public static final class a implements Parcelable.Creator<ChangePaymentMethodClick> {
            @Override // android.os.Parcelable.Creator
            public final ChangePaymentMethodClick createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ChangePaymentMethodClick.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ChangePaymentMethodClick[] newArray(int i) {
                return new ChangePaymentMethodClick[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangePaymentMethodClick);
        }

        public final int hashCode() {
            return 1217544276;
        }

        public final String toString() {
            return "ChangePaymentMethodClick";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PinReviewDetailsScreenResult.kt */
    public static final class ResumeSubscriptionClick implements PinReviewDetailsScreenResult {
        public static final ResumeSubscriptionClick b = new ResumeSubscriptionClick();
        public static final Parcelable.Creator<ResumeSubscriptionClick> CREATOR = new a();

        /* compiled from: PinReviewDetailsScreenResult.kt */
        public static final class a implements Parcelable.Creator<ResumeSubscriptionClick> {
            @Override // android.os.Parcelable.Creator
            public final ResumeSubscriptionClick createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ResumeSubscriptionClick.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ResumeSubscriptionClick[] newArray(int i) {
                return new ResumeSubscriptionClick[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResumeSubscriptionClick);
        }

        public final int hashCode() {
            return -1356256229;
        }

        public final String toString() {
            return "ResumeSubscriptionClick";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PinReviewDetailsScreenResult.kt */
    public static final class SuspendSubscriptionClick implements PinReviewDetailsScreenResult {
        public static final Parcelable.Creator<SuspendSubscriptionClick> CREATOR = new a();
        public final int b;

        /* compiled from: PinReviewDetailsScreenResult.kt */
        public static final class a implements Parcelable.Creator<SuspendSubscriptionClick> {
            @Override // android.os.Parcelable.Creator
            public final SuspendSubscriptionClick createFromParcel(Parcel parcel) {
                return new SuspendSubscriptionClick(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SuspendSubscriptionClick[] newArray(int i) {
                return new SuspendSubscriptionClick[i];
            }
        }

        public SuspendSubscriptionClick(int i) {
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuspendSubscriptionClick) && this.b == ((SuspendSubscriptionClick) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SuspendSubscriptionClick(date="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }
}
