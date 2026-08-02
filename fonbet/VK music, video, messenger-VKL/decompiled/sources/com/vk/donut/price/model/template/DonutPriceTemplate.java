package com.vk.donut.price.model.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.donut.price.model.template.item.DonutPriceTemplateItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;

/* compiled from: DonutPriceTemplate.kt */
/* loaded from: classes18.dex */
public final class DonutPriceTemplate implements Parcelable {
    public static final Parcelable.Creator<DonutPriceTemplate> CREATOR = new a();
    public final List<DonutPriceTemplateItem> b;

    /* compiled from: DonutPriceTemplate.kt */
    public static final class a implements Parcelable.Creator<DonutPriceTemplate> {
        @Override // android.os.Parcelable.Creator
        public final DonutPriceTemplate createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(DonutPriceTemplate.class, parcel, arrayList, i, 1);
            }
            return new DonutPriceTemplate(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutPriceTemplate[] newArray(int i) {
            return new DonutPriceTemplate[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DonutPriceTemplate(List<? extends DonutPriceTemplateItem> list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonutPriceTemplate) && epx.f(this.b, ((DonutPriceTemplate) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("DonutPriceTemplate(items="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
