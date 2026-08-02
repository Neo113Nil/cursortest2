package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    @NonNull
    public final d b;

    @NonNull
    public final List<CalendarConstraints.DateValidator> c;
    public static final a d = new a();
    public static final b e = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    public class a implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final boolean a(long j, @NonNull List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.Z6(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final int getId() {
            return 1;
        }
    }

    public class b implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final boolean a(long j, @NonNull List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.Z6(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final int getId() {
            return 2;
        }
    }

    public class c implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            d dVar = CompositeDateValidator.e;
            if (readInt != 2 && readInt == 1) {
                dVar = CompositeDateValidator.d;
            }
            readArrayList.getClass();
            return new CompositeDateValidator(readArrayList, dVar);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    public interface d {
        boolean a(long j, @NonNull List list);

        int getId();
    }

    public CompositeDateValidator(@NonNull List<CalendarConstraints.DateValidator> list, d dVar) {
        this.c = list;
        this.b = dVar;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean Z6(long j) {
        return this.b.a(j, this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.c.equals(compositeDateValidator.c) && this.b.getId() == compositeDateValidator.b.getId();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeList(this.c);
        parcel.writeInt(this.b.getId());
    }
}
