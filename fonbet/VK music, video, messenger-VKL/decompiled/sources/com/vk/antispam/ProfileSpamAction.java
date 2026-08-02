package com.vk.antispam;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.zcl;

/* compiled from: SpamAction.kt */
/* loaded from: classes14.dex */
public abstract class ProfileSpamAction extends SpamAction {

    /* compiled from: SpamAction.kt */
    public static final class BlackList extends ProfileSpamAction {
        public static final BlackList b = new BlackList(null);
        public static final Parcelable.Creator<BlackList> CREATOR = new a();

        /* compiled from: SpamAction.kt */
        public static final class a implements Parcelable.Creator<BlackList> {
            @Override // android.os.Parcelable.Creator
            public final BlackList createFromParcel(Parcel parcel) {
                parcel.readInt();
                return BlackList.b;
            }

            @Override // android.os.Parcelable.Creator
            public final BlackList[] newArray(int i) {
                return new BlackList[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BlackList);
        }

        public final int hashCode() {
            return -230877600;
        }

        public final String toString() {
            return "BlackList";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SpamAction.kt */
    public static final class DeleteChat extends ProfileSpamAction {
        public static final DeleteChat b = new DeleteChat(null);
        public static final Parcelable.Creator<DeleteChat> CREATOR = new a();

        /* compiled from: SpamAction.kt */
        public static final class a implements Parcelable.Creator<DeleteChat> {
            @Override // android.os.Parcelable.Creator
            public final DeleteChat createFromParcel(Parcel parcel) {
                parcel.readInt();
                return DeleteChat.b;
            }

            @Override // android.os.Parcelable.Creator
            public final DeleteChat[] newArray(int i) {
                return new DeleteChat[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeleteChat);
        }

        public final int hashCode() {
            return 557673184;
        }

        public final String toString() {
            return "DeleteChat";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SpamAction.kt */
    public static final class Report extends ProfileSpamAction {
        public static final Report b = new Report(null);
        public static final Parcelable.Creator<Report> CREATOR = new a();

        /* compiled from: SpamAction.kt */
        public static final class a implements Parcelable.Creator<Report> {
            @Override // android.os.Parcelable.Creator
            public final Report createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Report.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Report[] newArray(int i) {
                return new Report[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Report);
        }

        public final int hashCode() {
            return 885860081;
        }

        public final String toString() {
            return "Report";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ProfileSpamAction(zcl zclVar) {
        this();
    }

    public ProfileSpamAction() {
        super(null);
    }
}
