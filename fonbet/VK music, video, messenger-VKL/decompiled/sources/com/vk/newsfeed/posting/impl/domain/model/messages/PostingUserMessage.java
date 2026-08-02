package com.vk.newsfeed.posting.impl.domain.model.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import defpackage.q0;
import xsna.epx;
import xsna.zcl;

/* compiled from: PostingUserMessage.kt */
/* loaded from: classes4.dex */
public interface PostingUserMessage extends Parcelable {

    /* compiled from: PostingUserMessage.kt */
    public static final class PopupDialog implements PostingUserMessage {
        public static final Parcelable.Creator<PopupDialog> CREATOR = new a();
        public final PostingUserMessageIcon b;
        public final PostingUserMessageText c;
        public final PostingUserMessageText d;
        public final PostingUserMessageButton e;

        /* compiled from: PostingUserMessage.kt */
        public static final class a implements Parcelable.Creator<PopupDialog> {
            @Override // android.os.Parcelable.Creator
            public final PopupDialog createFromParcel(Parcel parcel) {
                return new PopupDialog(PostingUserMessageIcon.CREATOR.createFromParcel(parcel), (PostingUserMessageText) parcel.readParcelable(PopupDialog.class.getClassLoader()), (PostingUserMessageText) parcel.readParcelable(PopupDialog.class.getClassLoader()), parcel.readInt() == 0 ? null : PostingUserMessageButton.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final PopupDialog[] newArray(int i) {
                return new PopupDialog[i];
            }
        }

        public PopupDialog(PostingUserMessageIcon postingUserMessageIcon, PostingUserMessageText postingUserMessageText, PostingUserMessageText postingUserMessageText2, PostingUserMessageButton postingUserMessageButton) {
            this.b = postingUserMessageIcon;
            this.c = postingUserMessageText;
            this.d = postingUserMessageText2;
            this.e = postingUserMessageButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PopupDialog)) {
                return false;
            }
            PopupDialog popupDialog = (PopupDialog) obj;
            return epx.f(this.b, popupDialog.b) && epx.f(this.c, popupDialog.c) && epx.f(this.d, popupDialog.d) && epx.f(this.e, popupDialog.e);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31;
            PostingUserMessageButton postingUserMessageButton = this.e;
            return hashCode + (postingUserMessageButton == null ? 0 : postingUserMessageButton.hashCode());
        }

        public final String toString() {
            return "PopupDialog(icon=" + this.b + ", title=" + this.c + ", message=" + this.d + ", button=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            PostingUserMessageButton postingUserMessageButton = this.e;
            if (postingUserMessageButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                postingUserMessageButton.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: PostingUserMessage.kt */
    public static final class Service implements PostingUserMessage {
        public static final Parcelable.Creator<Service> CREATOR = new a();
        public final PostingRule b;
        public final PostingAction c;
        public final boolean d;

        /* compiled from: PostingUserMessage.kt */
        public static final class a implements Parcelable.Creator<Service> {
            @Override // android.os.Parcelable.Creator
            public final Service createFromParcel(Parcel parcel) {
                return new Service((PostingRule) parcel.readParcelable(Service.class.getClassLoader()), (PostingAction) parcel.readParcelable(Service.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Service[] newArray(int i) {
                return new Service[i];
            }
        }

        public Service(PostingRule postingRule, PostingAction postingAction, boolean z) {
            this.b = postingRule;
            this.c = postingAction;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Service)) {
                return false;
            }
            Service service = (Service) obj;
            return epx.f(this.b, service.b) && epx.f(this.c, service.c) && this.d == service.d;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            PostingAction postingAction = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (postingAction == null ? 0 : postingAction.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Service(rule=");
            sb.append(this.b);
            sb.append(", action=");
            sb.append(this.c);
            sb.append(", composeWithOriginalAction=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ Service(PostingRule postingRule, PostingAction postingAction, boolean z, int i, zcl zclVar) {
            this(postingRule, (i & 2) != 0 ? null : postingAction, (i & 4) != 0 ? false : z);
        }
    }

    /* compiled from: PostingUserMessage.kt */
    public static final class Snackbar implements PostingUserMessage {
        public static final Parcelable.Creator<Snackbar> CREATOR = new a();
        public final PostingUserMessageIcon b;
        public final PostingUserMessageText c;
        public final PostingUserMessageButton d;

        /* compiled from: PostingUserMessage.kt */
        public static final class a implements Parcelable.Creator<Snackbar> {
            @Override // android.os.Parcelable.Creator
            public final Snackbar createFromParcel(Parcel parcel) {
                return new Snackbar(parcel.readInt() == 0 ? null : PostingUserMessageIcon.CREATOR.createFromParcel(parcel), (PostingUserMessageText) parcel.readParcelable(Snackbar.class.getClassLoader()), parcel.readInt() != 0 ? PostingUserMessageButton.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Snackbar[] newArray(int i) {
                return new Snackbar[i];
            }
        }

        public Snackbar(PostingUserMessageIcon postingUserMessageIcon, PostingUserMessageText postingUserMessageText, PostingUserMessageButton postingUserMessageButton) {
            this.b = postingUserMessageIcon;
            this.c = postingUserMessageText;
            this.d = postingUserMessageButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Snackbar)) {
                return false;
            }
            Snackbar snackbar = (Snackbar) obj;
            return epx.f(this.b, snackbar.b) && epx.f(this.c, snackbar.c) && epx.f(this.d, snackbar.d);
        }

        public final int hashCode() {
            PostingUserMessageIcon postingUserMessageIcon = this.b;
            int hashCode = (this.c.hashCode() + ((postingUserMessageIcon == null ? 0 : postingUserMessageIcon.hashCode()) * 31)) * 31;
            PostingUserMessageButton postingUserMessageButton = this.d;
            return hashCode + (postingUserMessageButton != null ? postingUserMessageButton.hashCode() : 0);
        }

        public final String toString() {
            return "Snackbar(icon=" + this.b + ", message=" + this.c + ", button=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            PostingUserMessageIcon postingUserMessageIcon = this.b;
            if (postingUserMessageIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                postingUserMessageIcon.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.c, i);
            PostingUserMessageButton postingUserMessageButton = this.d;
            if (postingUserMessageButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                postingUserMessageButton.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ Snackbar(PostingUserMessageIcon postingUserMessageIcon, PostingUserMessageText postingUserMessageText, PostingUserMessageButton postingUserMessageButton, int i, zcl zclVar) {
            this(postingUserMessageIcon, postingUserMessageText, (i & 4) != 0 ? null : postingUserMessageButton);
        }
    }

    /* compiled from: PostingUserMessage.kt */
    public static final class AlertDialog implements PostingUserMessage {
        public static final Parcelable.Creator<AlertDialog> CREATOR = new a();
        public final PostingUserMessageText b;
        public final PostingUserMessageText c;
        public final PostingUserMessageButton d;
        public final PostingUserMessageButton e;
        public final PostingUserMessageButton f;

        /* compiled from: PostingUserMessage.kt */
        public static final class a implements Parcelable.Creator<AlertDialog> {
            @Override // android.os.Parcelable.Creator
            public final AlertDialog createFromParcel(Parcel parcel) {
                return new AlertDialog((PostingUserMessageText) parcel.readParcelable(AlertDialog.class.getClassLoader()), (PostingUserMessageText) parcel.readParcelable(AlertDialog.class.getClassLoader()), parcel.readInt() == 0 ? null : PostingUserMessageButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PostingUserMessageButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PostingUserMessageButton.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AlertDialog[] newArray(int i) {
                return new AlertDialog[i];
            }
        }

        public AlertDialog(PostingUserMessageText postingUserMessageText, PostingUserMessageText postingUserMessageText2, PostingUserMessageButton postingUserMessageButton, PostingUserMessageButton postingUserMessageButton2, PostingUserMessageButton postingUserMessageButton3) {
            this.b = postingUserMessageText;
            this.c = postingUserMessageText2;
            this.d = postingUserMessageButton;
            this.e = postingUserMessageButton2;
            this.f = postingUserMessageButton3;
        }

        public static AlertDialog a(AlertDialog alertDialog, PostingUserMessageButton postingUserMessageButton) {
            return new AlertDialog(alertDialog.b, alertDialog.c, postingUserMessageButton, alertDialog.e, alertDialog.f);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlertDialog)) {
                return false;
            }
            AlertDialog alertDialog = (AlertDialog) obj;
            return epx.f(this.b, alertDialog.b) && epx.f(this.c, alertDialog.c) && epx.f(this.d, alertDialog.d) && epx.f(this.e, alertDialog.e) && epx.f(this.f, alertDialog.f);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            PostingUserMessageText postingUserMessageText = this.c;
            int hashCode2 = (hashCode + (postingUserMessageText == null ? 0 : postingUserMessageText.hashCode())) * 31;
            PostingUserMessageButton postingUserMessageButton = this.d;
            int hashCode3 = (hashCode2 + (postingUserMessageButton == null ? 0 : postingUserMessageButton.hashCode())) * 31;
            PostingUserMessageButton postingUserMessageButton2 = this.e;
            int hashCode4 = (hashCode3 + (postingUserMessageButton2 == null ? 0 : postingUserMessageButton2.hashCode())) * 31;
            PostingUserMessageButton postingUserMessageButton3 = this.f;
            return hashCode4 + (postingUserMessageButton3 != null ? postingUserMessageButton3.hashCode() : 0);
        }

        public final String toString() {
            return "AlertDialog(title=" + this.b + ", text=" + this.c + ", positiveButton=" + this.d + ", cancelButton=" + this.e + ", neutralButton=" + this.f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            PostingUserMessageButton postingUserMessageButton = this.d;
            if (postingUserMessageButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                postingUserMessageButton.writeToParcel(parcel, i);
            }
            PostingUserMessageButton postingUserMessageButton2 = this.e;
            if (postingUserMessageButton2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                postingUserMessageButton2.writeToParcel(parcel, i);
            }
            PostingUserMessageButton postingUserMessageButton3 = this.f;
            if (postingUserMessageButton3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                postingUserMessageButton3.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ AlertDialog(PostingUserMessageText postingUserMessageText, PostingUserMessageText postingUserMessageText2, PostingUserMessageButton postingUserMessageButton, PostingUserMessageButton postingUserMessageButton2, PostingUserMessageButton postingUserMessageButton3, int i, zcl zclVar) {
            this(postingUserMessageText, (i & 2) != 0 ? null : postingUserMessageText2, (i & 4) != 0 ? null : postingUserMessageButton, (i & 8) != 0 ? null : postingUserMessageButton2, (i & 16) != 0 ? null : postingUserMessageButton3);
        }
    }
}
