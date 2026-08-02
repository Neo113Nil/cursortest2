package com.vk.newsfeed.posting.poll_editor.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PollEditorScreen.kt */
/* loaded from: classes4.dex */
public interface PollEditorScreen extends Parcelable {

    /* compiled from: PollEditorScreen.kt */
    public static final class ExitPollEditorAlert implements PollEditorScreen {
        public static final Parcelable.Creator<ExitPollEditorAlert> CREATOR = new a();
        public final boolean b;

        /* compiled from: PollEditorScreen.kt */
        public static final class a implements Parcelable.Creator<ExitPollEditorAlert> {
            @Override // android.os.Parcelable.Creator
            public final ExitPollEditorAlert createFromParcel(Parcel parcel) {
                return new ExitPollEditorAlert(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ExitPollEditorAlert[] newArray(int i) {
                return new ExitPollEditorAlert[i];
            }
        }

        public ExitPollEditorAlert() {
            this(false, 1, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExitPollEditorAlert) && this.b == ((ExitPollEditorAlert) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ExitPollEditorAlert(shouldExpandOnCancel="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }

        public ExitPollEditorAlert(boolean z) {
            this.b = z;
        }

        public /* synthetic */ ExitPollEditorAlert(boolean z, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* compiled from: PollEditorScreen.kt */
    public static final class PollDatePicker implements PollEditorScreen {
        public static final Parcelable.Creator<PollDatePicker> CREATOR = new a();
        public final long b;

        /* compiled from: PollEditorScreen.kt */
        public static final class a implements Parcelable.Creator<PollDatePicker> {
            @Override // android.os.Parcelable.Creator
            public final PollDatePicker createFromParcel(Parcel parcel) {
                return new PollDatePicker(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final PollDatePicker[] newArray(int i) {
                return new PollDatePicker[i];
            }
        }

        public PollDatePicker(long j) {
            this.b = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PollDatePicker) && this.b == ((PollDatePicker) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("PollDatePicker(date="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
        }
    }

    /* compiled from: PollEditorScreen.kt */
    public static final class PollTimePicker implements PollEditorScreen {
        public static final Parcelable.Creator<PollTimePicker> CREATOR = new a();
        public final long b;

        /* compiled from: PollEditorScreen.kt */
        public static final class a implements Parcelable.Creator<PollTimePicker> {
            @Override // android.os.Parcelable.Creator
            public final PollTimePicker createFromParcel(Parcel parcel) {
                return new PollTimePicker(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final PollTimePicker[] newArray(int i) {
                return new PollTimePicker[i];
            }
        }

        public PollTimePicker(long j) {
            this.b = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PollTimePicker) && this.b == ((PollTimePicker) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("PollTimePicker(date="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
        }
    }

    /* compiled from: PollEditorScreen.kt */
    public static final class RemovePollAlert implements PollEditorScreen {
        public static final RemovePollAlert b = new RemovePollAlert();
        public static final Parcelable.Creator<RemovePollAlert> CREATOR = new a();

        /* compiled from: PollEditorScreen.kt */
        public static final class a implements Parcelable.Creator<RemovePollAlert> {
            @Override // android.os.Parcelable.Creator
            public final RemovePollAlert createFromParcel(Parcel parcel) {
                parcel.readInt();
                return RemovePollAlert.b;
            }

            @Override // android.os.Parcelable.Creator
            public final RemovePollAlert[] newArray(int i) {
                return new RemovePollAlert[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemovePollAlert);
        }

        public final int hashCode() {
            return -1969659788;
        }

        public final String toString() {
            return "RemovePollAlert";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}
