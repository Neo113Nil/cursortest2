package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import xsna.epx;
import xsna.zcl;

/* compiled from: ActionsAvailabilityState.kt */
/* loaded from: classes4.dex */
public final class ActionsAvailabilityState implements Parcelable {
    public static final Parcelable.Creator<ActionsAvailabilityState> CREATOR = new a();
    public static final ActionsAvailabilityState j = new ActionsAvailabilityState(null, null, null, null, null, null, null, null, 255, null);
    public final Availability b;
    public final Attachments c;
    public final Availability d;
    public final Availability e;
    public final Availability f;
    public final Availability g;
    public final Availability h;
    public final Availability i;

    /* compiled from: ActionsAvailabilityState.kt */
    public static final class AttachmentState implements Parcelable {
        public static final Parcelable.Creator<AttachmentState> CREATOR = new a();
        public static final AttachmentState d = new AttachmentState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        public final Availability b;
        public final Availability c;

        /* compiled from: ActionsAvailabilityState.kt */
        public static final class a implements Parcelable.Creator<AttachmentState> {
            @Override // android.os.Parcelable.Creator
            public final AttachmentState createFromParcel(Parcel parcel) {
                return new AttachmentState((Availability) parcel.readParcelable(AttachmentState.class.getClassLoader()), (Availability) parcel.readParcelable(AttachmentState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AttachmentState[] newArray(int i) {
                return new AttachmentState[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AttachmentState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final AttachmentState a(AttachmentState attachmentState) {
            return new AttachmentState(this.b.m5(attachmentState.b), this.c.m5(attachmentState.c));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AttachmentState)) {
                return false;
            }
            AttachmentState attachmentState = (AttachmentState) obj;
            return epx.f(this.b, attachmentState.b) && epx.f(this.c, attachmentState.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "AttachmentState(adding=" + this.b + ", removing=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
        }

        public AttachmentState(Availability availability, Availability availability2) {
            this.b = availability;
            this.c = availability2;
        }

        public /* synthetic */ AttachmentState(Availability availability, Availability availability2, int i, zcl zclVar) {
            this((i & 1) != 0 ? Availability.Available.b : availability, (i & 2) != 0 ? Availability.Available.b : availability2);
        }
    }

    /* compiled from: ActionsAvailabilityState.kt */
    public static final class Attachments implements Parcelable {
        public static final Parcelable.Creator<Attachments> CREATOR = new a();
        public static final Attachments n = new Attachments(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        public final AttachmentState b;
        public final AttachmentState c;
        public final AttachmentState d;
        public final AttachmentState e;
        public final AttachmentState f;
        public final AttachmentState g;
        public final AttachmentState h;
        public final AttachmentState i;
        public final AttachmentState j;
        public final AttachmentState k;
        public final AttachmentState l;
        public final AttachmentState m;

        /* compiled from: ActionsAvailabilityState.kt */
        public static final class a implements Parcelable.Creator<Attachments> {
            @Override // android.os.Parcelable.Creator
            public final Attachments createFromParcel(Parcel parcel) {
                Parcelable.Creator<AttachmentState> creator = AttachmentState.CREATOR;
                return new Attachments(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Attachments[] newArray(int i) {
                return new Attachments[i];
            }
        }

        public Attachments() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        public static Attachments a(Attachments attachments, AttachmentState attachmentState, AttachmentState attachmentState2, AttachmentState attachmentState3, AttachmentState attachmentState4, AttachmentState attachmentState5, AttachmentState attachmentState6, AttachmentState attachmentState7, AttachmentState attachmentState8, AttachmentState attachmentState9, AttachmentState attachmentState10, AttachmentState attachmentState11, AttachmentState attachmentState12, int i) {
            if ((i & 1) != 0) {
                attachmentState = attachments.b;
            }
            AttachmentState attachmentState13 = attachmentState;
            if ((i & 2) != 0) {
                attachmentState2 = attachments.c;
            }
            AttachmentState attachmentState14 = attachmentState2;
            AttachmentState attachmentState15 = (i & 4) != 0 ? attachments.d : attachmentState3;
            AttachmentState attachmentState16 = (i & 8) != 0 ? attachments.e : attachmentState4;
            AttachmentState attachmentState17 = (i & 16) != 0 ? attachments.f : attachmentState5;
            AttachmentState attachmentState18 = (i & 32) != 0 ? attachments.g : attachmentState6;
            AttachmentState attachmentState19 = (i & 64) != 0 ? attachments.h : attachmentState7;
            AttachmentState attachmentState20 = (i & 128) != 0 ? attachments.i : attachmentState8;
            AttachmentState attachmentState21 = (i & 256) != 0 ? attachments.j : attachmentState9;
            AttachmentState attachmentState22 = (i & 512) != 0 ? attachments.k : attachmentState10;
            AttachmentState attachmentState23 = (i & 1024) != 0 ? attachments.l : attachmentState11;
            AttachmentState attachmentState24 = (i & 2048) != 0 ? attachments.m : attachmentState12;
            attachments.getClass();
            return new Attachments(attachmentState13, attachmentState14, attachmentState15, attachmentState16, attachmentState17, attachmentState18, attachmentState19, attachmentState20, attachmentState21, attachmentState22, attachmentState23, attachmentState24);
        }

        public final Attachments b(Attachments attachments) {
            return new Attachments(this.b.a(attachments.b), this.c.a(attachments.c), this.d.a(attachments.d), this.e.a(attachments.e), this.f.a(attachments.f), this.g.a(attachments.g), this.h.a(attachments.h), this.i.a(attachments.i), this.j.a(attachments.j), this.k.a(attachments.k), this.l.a(attachments.l), this.m.a(attachments.m));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attachments)) {
                return false;
            }
            Attachments attachments = (Attachments) obj;
            return epx.f(this.b, attachments.b) && epx.f(this.c, attachments.c) && epx.f(this.d, attachments.d) && epx.f(this.e, attachments.e) && epx.f(this.f, attachments.f) && epx.f(this.g, attachments.g) && epx.f(this.h, attachments.h) && epx.f(this.i, attachments.i) && epx.f(this.j, attachments.j) && epx.f(this.k, attachments.k) && epx.f(this.l, attachments.l) && epx.f(this.m, attachments.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Attachments(video=" + this.b + ", gif=" + this.c + ", photo=" + this.d + ", link=" + this.e + ", place=" + this.f + ", audio=" + this.g + ", audioPlaylist=" + this.h + ", poll=" + this.i + ", market=" + this.j + ", file=" + this.k + ", actionButton=" + this.l + ", article=" + this.m + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            this.c.writeToParcel(parcel, i);
            this.d.writeToParcel(parcel, i);
            this.e.writeToParcel(parcel, i);
            this.f.writeToParcel(parcel, i);
            this.g.writeToParcel(parcel, i);
            this.h.writeToParcel(parcel, i);
            this.i.writeToParcel(parcel, i);
            this.j.writeToParcel(parcel, i);
            this.k.writeToParcel(parcel, i);
            this.l.writeToParcel(parcel, i);
            this.m.writeToParcel(parcel, i);
        }

        public Attachments(AttachmentState attachmentState, AttachmentState attachmentState2, AttachmentState attachmentState3, AttachmentState attachmentState4, AttachmentState attachmentState5, AttachmentState attachmentState6, AttachmentState attachmentState7, AttachmentState attachmentState8, AttachmentState attachmentState9, AttachmentState attachmentState10, AttachmentState attachmentState11, AttachmentState attachmentState12) {
            this.b = attachmentState;
            this.c = attachmentState2;
            this.d = attachmentState3;
            this.e = attachmentState4;
            this.f = attachmentState5;
            this.g = attachmentState6;
            this.h = attachmentState7;
            this.i = attachmentState8;
            this.j = attachmentState9;
            this.k = attachmentState10;
            this.l = attachmentState11;
            this.m = attachmentState12;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Attachments(AttachmentState attachmentState, AttachmentState attachmentState2, AttachmentState attachmentState3, AttachmentState attachmentState4, AttachmentState attachmentState5, AttachmentState attachmentState6, AttachmentState attachmentState7, AttachmentState attachmentState8, AttachmentState attachmentState9, AttachmentState attachmentState10, AttachmentState attachmentState11, AttachmentState attachmentState12, int i, zcl zclVar) {
            this(attachmentState, attachmentState2, attachmentState3, attachmentState4, r7, r8, r9, r10, r11, r12, r13, r14);
            if ((i & 1) != 0) {
                Parcelable.Creator<AttachmentState> creator = AttachmentState.CREATOR;
                attachmentState = AttachmentState.d;
            }
            if ((i & 2) != 0) {
                Parcelable.Creator<AttachmentState> creator2 = AttachmentState.CREATOR;
                attachmentState2 = AttachmentState.d;
            }
            if ((i & 4) != 0) {
                Parcelable.Creator<AttachmentState> creator3 = AttachmentState.CREATOR;
                attachmentState3 = AttachmentState.d;
            }
            if ((i & 8) != 0) {
                Parcelable.Creator<AttachmentState> creator4 = AttachmentState.CREATOR;
                attachmentState4 = AttachmentState.d;
            }
            if ((i & 16) != 0) {
                Parcelable.Creator<AttachmentState> creator5 = AttachmentState.CREATOR;
                attachmentState5 = AttachmentState.d;
            }
            if ((i & 32) != 0) {
                Parcelable.Creator<AttachmentState> creator6 = AttachmentState.CREATOR;
                attachmentState6 = AttachmentState.d;
            }
            if ((i & 64) != 0) {
                Parcelable.Creator<AttachmentState> creator7 = AttachmentState.CREATOR;
                attachmentState7 = AttachmentState.d;
            }
            if ((i & 128) != 0) {
                Parcelable.Creator<AttachmentState> creator8 = AttachmentState.CREATOR;
                attachmentState8 = AttachmentState.d;
            }
            if ((i & 256) != 0) {
                Parcelable.Creator<AttachmentState> creator9 = AttachmentState.CREATOR;
                attachmentState9 = AttachmentState.d;
            }
            if ((i & 512) != 0) {
                Parcelable.Creator<AttachmentState> creator10 = AttachmentState.CREATOR;
                attachmentState10 = AttachmentState.d;
            }
            if ((i & 1024) != 0) {
                Parcelable.Creator<AttachmentState> creator11 = AttachmentState.CREATOR;
                attachmentState11 = AttachmentState.d;
            }
            if ((i & 2048) != 0) {
                Parcelable.Creator<AttachmentState> creator12 = AttachmentState.CREATOR;
                attachmentState12 = AttachmentState.d;
            }
            AttachmentState attachmentState13 = attachmentState11;
            AttachmentState attachmentState14 = attachmentState12;
            AttachmentState attachmentState15 = attachmentState9;
            AttachmentState attachmentState16 = attachmentState10;
            AttachmentState attachmentState17 = attachmentState7;
            AttachmentState attachmentState18 = attachmentState8;
            AttachmentState attachmentState19 = attachmentState5;
            AttachmentState attachmentState20 = attachmentState6;
        }
    }

    /* compiled from: ActionsAvailabilityState.kt */
    public interface Availability extends Parcelable {

        /* compiled from: ActionsAvailabilityState.kt */
        public static final class Available implements Availability {
            public static final Available b = new Available();
            public static final Parcelable.Creator<Available> CREATOR = new a();

            /* compiled from: ActionsAvailabilityState.kt */
            public static final class a implements Parcelable.Creator<Available> {
                @Override // android.os.Parcelable.Creator
                public final Available createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Available.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Available[] newArray(int i) {
                    return new Available[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Available);
            }

            public final int hashCode() {
                return -77307315;
            }

            public final String toString() {
                return "Available";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ActionsAvailabilityState.kt */
        public static final class NotAvailable implements Availability {
            public static final Parcelable.Creator<NotAvailable> CREATOR = new a();
            public final PostingUserMessage b;

            /* compiled from: ActionsAvailabilityState.kt */
            public static final class a implements Parcelable.Creator<NotAvailable> {
                @Override // android.os.Parcelable.Creator
                public final NotAvailable createFromParcel(Parcel parcel) {
                    return new NotAvailable((PostingUserMessage) parcel.readParcelable(NotAvailable.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final NotAvailable[] newArray(int i) {
                    return new NotAvailable[i];
                }
            }

            public NotAvailable(PostingUserMessage postingUserMessage) {
                this.b = postingUserMessage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NotAvailable) && epx.f(this.b, ((NotAvailable) obj).b);
            }

            public final int hashCode() {
                PostingUserMessage postingUserMessage = this.b;
                if (postingUserMessage == null) {
                    return 0;
                }
                return postingUserMessage.hashCode();
            }

            public final String toString() {
                return "NotAvailable(reason=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        default Availability m5(Availability availability) {
            return this instanceof NotAvailable ? this : availability instanceof NotAvailable ? availability : Available.b;
        }
    }

    /* compiled from: ActionsAvailabilityState.kt */
    public static final class a implements Parcelable.Creator<ActionsAvailabilityState> {
        @Override // android.os.Parcelable.Creator
        public final ActionsAvailabilityState createFromParcel(Parcel parcel) {
            return new ActionsAvailabilityState((Availability) parcel.readParcelable(ActionsAvailabilityState.class.getClassLoader()), Attachments.CREATOR.createFromParcel(parcel), (Availability) parcel.readParcelable(ActionsAvailabilityState.class.getClassLoader()), (Availability) parcel.readParcelable(ActionsAvailabilityState.class.getClassLoader()), (Availability) parcel.readParcelable(ActionsAvailabilityState.class.getClassLoader()), (Availability) parcel.readParcelable(ActionsAvailabilityState.class.getClassLoader()), (Availability) parcel.readParcelable(ActionsAvailabilityState.class.getClassLoader()), (Availability) parcel.readParcelable(ActionsAvailabilityState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionsAvailabilityState[] newArray(int i) {
            return new ActionsAvailabilityState[i];
        }
    }

    public ActionsAvailabilityState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static ActionsAvailabilityState a(ActionsAvailabilityState actionsAvailabilityState, Availability availability, Attachments attachments, Availability availability2, Availability availability3, Availability availability4, int i) {
        if ((i & 1) != 0) {
            availability = actionsAvailabilityState.b;
        }
        Availability availability5 = availability;
        if ((i & 2) != 0) {
            attachments = actionsAvailabilityState.c;
        }
        Attachments attachments2 = attachments;
        Availability availability6 = actionsAvailabilityState.d;
        Availability availability7 = actionsAvailabilityState.e;
        Availability availability8 = actionsAvailabilityState.f;
        if ((i & 32) != 0) {
            availability2 = actionsAvailabilityState.g;
        }
        Availability availability9 = availability2;
        if ((i & 64) != 0) {
            availability3 = actionsAvailabilityState.h;
        }
        Availability availability10 = availability3;
        if ((i & 128) != 0) {
            availability4 = actionsAvailabilityState.i;
        }
        actionsAvailabilityState.getClass();
        return new ActionsAvailabilityState(availability5, attachments2, availability6, availability7, availability8, availability9, availability10, availability4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionsAvailabilityState)) {
            return false;
        }
        ActionsAvailabilityState actionsAvailabilityState = (ActionsAvailabilityState) obj;
        return epx.f(this.b, actionsAvailabilityState.b) && epx.f(this.c, actionsAvailabilityState.c) && epx.f(this.d, actionsAvailabilityState.d) && epx.f(this.e, actionsAvailabilityState.e) && epx.f(this.f, actionsAvailabilityState.f) && epx.f(this.g, actionsAvailabilityState.g) && epx.f(this.h, actionsAvailabilityState.h) && epx.f(this.i, actionsAvailabilityState.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ActionsAvailabilityState(nextStep=" + this.b + ", attachments=" + this.c + ", postpone=" + this.d + ", coauthors=" + this.e + ", additional=" + this.f + ", publish=" + this.g + ", changeDisplayMode=" + this.h + ", privacy=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
    }

    public ActionsAvailabilityState(Availability availability, Attachments attachments, Availability availability2, Availability availability3, Availability availability4, Availability availability5, Availability availability6, Availability availability7) {
        this.b = availability;
        this.c = attachments;
        this.d = availability2;
        this.e = availability3;
        this.f = availability4;
        this.g = availability5;
        this.h = availability6;
        this.i = availability7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionsAvailabilityState(Availability availability, Attachments attachments, Availability availability2, Availability availability3, Availability availability4, Availability availability5, Availability availability6, Availability availability7, int i, zcl zclVar) {
        this(availability, attachments, (i & 4) != 0 ? Availability.Available.b : availability2, (i & 8) != 0 ? Availability.Available.b : availability3, (i & 16) != 0 ? Availability.Available.b : availability4, (i & 32) != 0 ? Availability.Available.b : availability5, (i & 64) != 0 ? Availability.Available.b : availability6, (i & 128) != 0 ? Availability.Available.b : availability7);
        availability = (i & 1) != 0 ? Availability.Available.b : availability;
        if ((i & 2) != 0) {
            Parcelable.Creator<Attachments> creator = Attachments.CREATOR;
            attachments = Attachments.n;
        }
    }
}
