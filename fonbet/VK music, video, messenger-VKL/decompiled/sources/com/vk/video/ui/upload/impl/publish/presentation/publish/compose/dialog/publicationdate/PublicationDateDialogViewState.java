package com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.publicationdate;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import xsna.epx;

/* compiled from: PublicationDateDialogViewState.kt */
/* loaded from: classes7.dex */
public final class PublicationDateDialogViewState implements Parcelable {
    public static final Parcelable.Creator<PublicationDateDialogViewState> CREATOR = new a();
    public final Date b;
    public final Date c;
    public final Date d;

    /* compiled from: PublicationDateDialogViewState.kt */
    public static final class a implements Parcelable.Creator<PublicationDateDialogViewState> {
        @Override // android.os.Parcelable.Creator
        public final PublicationDateDialogViewState createFromParcel(Parcel parcel) {
            return new PublicationDateDialogViewState((Date) parcel.readSerializable(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final PublicationDateDialogViewState[] newArray(int i) {
            return new PublicationDateDialogViewState[i];
        }
    }

    public PublicationDateDialogViewState(Date date, Date date2, Date date3) {
        this.b = date;
        this.c = date2;
        this.d = date3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicationDateDialogViewState)) {
            return false;
        }
        PublicationDateDialogViewState publicationDateDialogViewState = (PublicationDateDialogViewState) obj;
        return epx.f(this.b, publicationDateDialogViewState.b) && epx.f(this.c, publicationDateDialogViewState.c) && epx.f(this.d, publicationDateDialogViewState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PublicationDateDialogViewState(selectedDateInitial=" + this.b + ", minValidDate=" + this.c + ", maxValidDate=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.d);
    }
}
