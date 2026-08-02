package com.vk.donut.price.model.template.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;
import xsna.epx;
import xsna.ho8;

/* compiled from: DonutPriceTemplateItem.kt */
/* loaded from: classes18.dex */
public interface DonutPriceTemplateItem extends Parcelable {

    /* compiled from: DonutPriceTemplateItem.kt */
    public static final class PlainText implements DonutPriceTemplateItem {
        public static final Parcelable.Creator<PlainText> CREATOR = new a();
        public final String b;

        /* compiled from: DonutPriceTemplateItem.kt */
        public static final class a implements Parcelable.Creator<PlainText> {
            @Override // android.os.Parcelable.Creator
            public final PlainText createFromParcel(Parcel parcel) {
                return new PlainText(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PlainText[] newArray(int i) {
                return new PlainText[i];
            }
        }

        public PlainText(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlainText) && epx.f(this.b, ((PlainText) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("PlainText(text="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: DonutPriceTemplateItem.kt */
    public static final class StrikethroughText implements DonutPriceTemplateItem {
        public static final Parcelable.Creator<StrikethroughText> CREATOR = new a();
        public final String b;
        public final DonutPriceTemplateItemStyle c;

        /* compiled from: DonutPriceTemplateItem.kt */
        public static final class a implements Parcelable.Creator<StrikethroughText> {
            @Override // android.os.Parcelable.Creator
            public final StrikethroughText createFromParcel(Parcel parcel) {
                return new StrikethroughText(parcel.readString(), parcel.readInt() == 0 ? null : DonutPriceTemplateItemStyle.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final StrikethroughText[] newArray(int i) {
                return new StrikethroughText[i];
            }
        }

        public StrikethroughText(String str, DonutPriceTemplateItemStyle donutPriceTemplateItemStyle) {
            this.b = str;
            this.c = donutPriceTemplateItemStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StrikethroughText)) {
                return false;
            }
            StrikethroughText strikethroughText = (StrikethroughText) obj;
            return epx.f(this.b, strikethroughText.b) && this.c == strikethroughText.c;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            DonutPriceTemplateItemStyle donutPriceTemplateItemStyle = this.c;
            return hashCode + (donutPriceTemplateItemStyle == null ? 0 : donutPriceTemplateItemStyle.hashCode());
        }

        public final String toString() {
            return "StrikethroughText(text=" + this.b + ", style=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            DonutPriceTemplateItemStyle donutPriceTemplateItemStyle = this.c;
            if (donutPriceTemplateItemStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(donutPriceTemplateItemStyle.name());
            }
        }
    }
}
