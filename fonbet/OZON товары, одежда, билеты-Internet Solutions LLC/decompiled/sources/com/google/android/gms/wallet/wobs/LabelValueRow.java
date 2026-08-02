package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "LabelValueRowCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zze();

    @SafeParcelable.Field(id = 2)
    @Deprecated
    String zzfq;

    @SafeParcelable.Field(id = 3)
    @Deprecated
    String zzfr;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 4)
    ArrayList<LabelValue> zzfs;

    public final class Builder {
        private Builder() {
        }

        public final Builder addColumn(LabelValue labelValue) {
            LabelValueRow.this.zzfs.add(labelValue);
            return this;
        }

        public final Builder addColumns(Collection<LabelValue> collection) {
            LabelValueRow.this.zzfs.addAll(collection);
            return this;
        }

        public final LabelValueRow build() {
            return LabelValueRow.this;
        }

        @Deprecated
        public final Builder setHexBackgroundColor(String str) {
            LabelValueRow.this.zzfr = str;
            return this;
        }

        @Deprecated
        public final Builder setHexFontColor(String str) {
            LabelValueRow.this.zzfq = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    LabelValueRow(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) ArrayList<LabelValue> arrayList) {
        this.zzfq = str;
        this.zzfr = str2;
        this.zzfs = arrayList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final ArrayList<LabelValue> getColumns() {
        return this.zzfs;
    }

    @Deprecated
    public final String getHexBackgroundColor() {
        return this.zzfr;
    }

    @Deprecated
    public final String getHexFontColor() {
        return this.zzfq;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzfq, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzfr, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.zzfs, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    LabelValueRow() {
        this.zzfs = ArrayUtils.newArrayList();
    }
}
