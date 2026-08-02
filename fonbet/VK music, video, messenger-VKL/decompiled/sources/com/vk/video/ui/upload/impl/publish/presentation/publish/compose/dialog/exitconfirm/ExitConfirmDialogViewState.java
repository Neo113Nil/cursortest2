package com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.exitconfirm;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: ExitConfirmDialogViewState.kt */
/* loaded from: classes7.dex */
public final class ExitConfirmDialogViewState implements Parcelable {
    public static final Parcelable.Creator<ExitConfirmDialogViewState> CREATOR = new a();
    public final String b;

    /* compiled from: ExitConfirmDialogViewState.kt */
    public static final class a implements Parcelable.Creator<ExitConfirmDialogViewState> {
        @Override // android.os.Parcelable.Creator
        public final ExitConfirmDialogViewState createFromParcel(Parcel parcel) {
            return new ExitConfirmDialogViewState(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExitConfirmDialogViewState[] newArray(int i) {
            return new ExitConfirmDialogViewState[i];
        }
    }

    public ExitConfirmDialogViewState(String str) {
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
        return (obj instanceof ExitConfirmDialogViewState) && epx.f(this.b, ((ExitConfirmDialogViewState) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ExitConfirmDialogViewState(description="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
