package com.vk.antispam;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.zcl;

/* compiled from: SpamAction.kt */
/* loaded from: classes14.dex */
public abstract class ChatSpamAction extends SpamAction {

    /* compiled from: SpamAction.kt */
    public static final class ExitChatAndClearHistory extends ChatSpamAction {
        public static final ExitChatAndClearHistory b = new ExitChatAndClearHistory(null);
        public static final Parcelable.Creator<ExitChatAndClearHistory> CREATOR = new a();

        /* compiled from: SpamAction.kt */
        public static final class a implements Parcelable.Creator<ExitChatAndClearHistory> {
            @Override // android.os.Parcelable.Creator
            public final ExitChatAndClearHistory createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ExitChatAndClearHistory.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ExitChatAndClearHistory[] newArray(int i) {
                return new ExitChatAndClearHistory[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitChatAndClearHistory);
        }

        public final int hashCode() {
            return -1821235736;
        }

        public final String toString() {
            return "ExitChatAndClearHistory";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SpamAction.kt */
    public static final class Report extends ChatSpamAction {
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
            return -1458428972;
        }

        public final String toString() {
            return "Report";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ChatSpamAction(zcl zclVar) {
        this();
    }

    public ChatSpamAction() {
        super(null);
    }
}
