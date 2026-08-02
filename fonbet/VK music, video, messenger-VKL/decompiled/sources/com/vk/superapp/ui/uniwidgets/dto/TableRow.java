package com.vk.superapp.ui.uniwidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.ui.uniwidgets.blocks.TableBlock;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: TableUniWidget.kt */
/* loaded from: classes6.dex */
public final class TableRow implements Parcelable {
    public static final a CREATOR = new a();
    public final List<TableBlock> b;

    /* compiled from: TableUniWidget.kt */
    public static final class a implements Parcelable.Creator<TableRow> {
        @Override // android.os.Parcelable.Creator
        public final TableRow createFromParcel(Parcel parcel) {
            return new TableRow(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TableRow[] newArray(int i) {
            return new TableRow[i];
        }
    }

    public TableRow(List<TableBlock> list) {
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
        return (obj instanceof TableRow) && epx.f(this.b, ((TableRow) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("TableRow(blocks="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
    }

    public TableRow(Parcel parcel) {
        this(parcel.createTypedArrayList(TableBlock.CREATOR));
    }
}
