package com.vk.voip.ui.change_name.ui.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.zcl;

/* compiled from: VoipChangeNameResult.kt */
/* loaded from: classes7.dex */
public final class VoipChangeNameResult implements Parcelable {
    public static final Parcelable.Creator<VoipChangeNameResult> CREATOR = new a();
    public final JoinAs b;

    /* compiled from: VoipChangeNameResult.kt */
    public static abstract class JoinAs implements Parcelable {

        /* compiled from: VoipChangeNameResult.kt */
        public static final class Anonym extends JoinAs {
            public static final Parcelable.Creator<Anonym> CREATOR = new a();
            public final String b;

            /* compiled from: VoipChangeNameResult.kt */
            public static final class a implements Parcelable.Creator<Anonym> {
                @Override // android.os.Parcelable.Creator
                public final Anonym createFromParcel(Parcel parcel) {
                    return new Anonym(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Anonym[] newArray(int i) {
                    return new Anonym[i];
                }
            }

            public Anonym(String str) {
                super(null);
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
                return (obj instanceof Anonym) && epx.f(this.b, ((Anonym) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Anonym(name="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        /* compiled from: VoipChangeNameResult.kt */
        public static final class CurrentUser extends JoinAs {
            public static final Parcelable.Creator<CurrentUser> CREATOR = new a();
            public final String b;

            /* compiled from: VoipChangeNameResult.kt */
            public static final class a implements Parcelable.Creator<CurrentUser> {
                @Override // android.os.Parcelable.Creator
                public final CurrentUser createFromParcel(Parcel parcel) {
                    return new CurrentUser(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CurrentUser[] newArray(int i) {
                    return new CurrentUser[i];
                }
            }

            public CurrentUser(String str) {
                super(null);
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
                return (obj instanceof CurrentUser) && epx.f(this.b, ((CurrentUser) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CurrentUser(changedName="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        /* compiled from: VoipChangeNameResult.kt */
        public static final class Group extends JoinAs {
            public static final Parcelable.Creator<Group> CREATOR = new a();
            public final UserId b;

            /* compiled from: VoipChangeNameResult.kt */
            public static final class a implements Parcelable.Creator<Group> {
                @Override // android.os.Parcelable.Creator
                public final Group createFromParcel(Parcel parcel) {
                    return new Group((UserId) parcel.readParcelable(Group.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Group[] newArray(int i) {
                    return new Group[i];
                }
            }

            public Group(UserId userId) {
                super(null);
                this.b = userId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Group) && epx.f(this.b, ((Group) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("Group(groupId="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        public /* synthetic */ JoinAs(zcl zclVar) {
            this();
        }

        public JoinAs() {
        }
    }

    /* compiled from: VoipChangeNameResult.kt */
    public static final class a implements Parcelable.Creator<VoipChangeNameResult> {
        @Override // android.os.Parcelable.Creator
        public final VoipChangeNameResult createFromParcel(Parcel parcel) {
            return new VoipChangeNameResult((JoinAs) parcel.readParcelable(VoipChangeNameResult.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VoipChangeNameResult[] newArray(int i) {
            return new VoipChangeNameResult[i];
        }
    }

    public VoipChangeNameResult(JoinAs joinAs) {
        this.b = joinAs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VoipChangeNameResult) && epx.f(this.b, ((VoipChangeNameResult) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "VoipChangeNameResult(joinAs=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
