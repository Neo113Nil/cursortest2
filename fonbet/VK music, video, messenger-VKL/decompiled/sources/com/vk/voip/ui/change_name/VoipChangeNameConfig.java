package com.vk.voip.ui.change_name;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import com.vkontakte.android.R;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VoipChangeNameConfig.kt */
/* loaded from: classes7.dex */
public final class VoipChangeNameConfig implements Parcelable {
    public static final Parcelable.Creator<VoipChangeNameConfig> CREATOR = new a();
    public final CallId b;
    public final String c;
    public final PreselectedUser d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final OpenedFrom i;

    /* compiled from: VoipChangeNameConfig.kt */
    public static abstract class OpenedFrom implements Parcelable {

        /* compiled from: VoipChangeNameConfig.kt */
        public static final class ActiveCall extends OpenedFrom {
            public static final Parcelable.Creator<ActiveCall> CREATOR = new a();
            public final String b;

            /* compiled from: VoipChangeNameConfig.kt */
            public static final class a implements Parcelable.Creator<ActiveCall> {
                @Override // android.os.Parcelable.Creator
                public final ActiveCall createFromParcel(Parcel parcel) {
                    return new ActiveCall(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ActiveCall[] newArray(int i) {
                    return new ActiveCall[i];
                }
            }

            public ActiveCall(String str) {
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
                return (obj instanceof ActiveCall) && epx.f(this.b, ((ActiveCall) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ActiveCall(name="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        /* compiled from: VoipChangeNameConfig.kt */
        public static final class JoinScreen extends OpenedFrom {
            public static final JoinScreen b = new JoinScreen(null);
            public static final Parcelable.Creator<JoinScreen> CREATOR = new a();

            /* compiled from: VoipChangeNameConfig.kt */
            public static final class a implements Parcelable.Creator<JoinScreen> {
                @Override // android.os.Parcelable.Creator
                public final JoinScreen createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return JoinScreen.b;
                }

                @Override // android.os.Parcelable.Creator
                public final JoinScreen[] newArray(int i) {
                    return new JoinScreen[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ OpenedFrom(zcl zclVar) {
            this();
        }

        public OpenedFrom() {
        }
    }

    /* compiled from: VoipChangeNameConfig.kt */
    public static abstract class PreselectedUser implements Parcelable {

        /* compiled from: VoipChangeNameConfig.kt */
        public static final class Anonym extends PreselectedUser {
            public static final Parcelable.Creator<Anonym> CREATOR = new a();
            public final String b;

            /* compiled from: VoipChangeNameConfig.kt */
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

            /* JADX WARN: Multi-variable type inference failed */
            public Anonym() {
                this(null, 1, 0 == true ? 1 : 0);
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
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Anonym(name="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }

            public Anonym(String str) {
                super(null);
                this.b = str;
            }

            public /* synthetic */ Anonym(String str, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : str);
            }
        }

        /* compiled from: VoipChangeNameConfig.kt */
        public static final class Group extends PreselectedUser {
            public static final Parcelable.Creator<Group> CREATOR = new a();
            public final UserId b;

            /* compiled from: VoipChangeNameConfig.kt */
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

        /* compiled from: VoipChangeNameConfig.kt */
        public static final class User extends PreselectedUser {
            public static final User b = new User(null);
            public static final Parcelable.Creator<User> CREATOR = new a();

            /* compiled from: VoipChangeNameConfig.kt */
            public static final class a implements Parcelable.Creator<User> {
                @Override // android.os.Parcelable.Creator
                public final User createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return User.b;
                }

                @Override // android.os.Parcelable.Creator
                public final User[] newArray(int i) {
                    return new User[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ PreselectedUser(zcl zclVar) {
            this();
        }

        public PreselectedUser() {
        }
    }

    /* compiled from: VoipChangeNameConfig.kt */
    public static final class a implements Parcelable.Creator<VoipChangeNameConfig> {
        @Override // android.os.Parcelable.Creator
        public final VoipChangeNameConfig createFromParcel(Parcel parcel) {
            Class cls;
            PreselectedUser preselectedUser;
            boolean z;
            Class cls2;
            boolean z2;
            CallId callId = (CallId) parcel.readParcelable(VoipChangeNameConfig.class.getClassLoader());
            String readString = parcel.readString();
            PreselectedUser preselectedUser2 = (PreselectedUser) parcel.readParcelable(VoipChangeNameConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = VoipChangeNameConfig.class;
                preselectedUser = preselectedUser2;
                z = true;
            } else {
                cls = VoipChangeNameConfig.class;
                preselectedUser = preselectedUser2;
                z = false;
            }
            if (parcel.readInt() != 0) {
                cls2 = cls;
                z2 = true;
            } else {
                cls2 = cls;
                z2 = false;
            }
            return new VoipChangeNameConfig(callId, readString, preselectedUser, z, z2, parcel.readInt() != 0, parcel.readInt(), (OpenedFrom) parcel.readParcelable(cls2.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VoipChangeNameConfig[] newArray(int i) {
            return new VoipChangeNameConfig[i];
        }
    }

    public VoipChangeNameConfig(CallId callId, String str, PreselectedUser preselectedUser, boolean z, boolean z2, boolean z3, int i, OpenedFrom openedFrom) {
        this.b = callId;
        this.c = str;
        this.d = preselectedUser;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = i;
        this.i = openedFrom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoipChangeNameConfig)) {
            return false;
        }
        VoipChangeNameConfig voipChangeNameConfig = (VoipChangeNameConfig) obj;
        return epx.f(this.b, voipChangeNameConfig.b) && epx.f(this.c, voipChangeNameConfig.c) && epx.f(this.d, voipChangeNameConfig.d) && this.e == voipChangeNameConfig.e && this.f == voipChangeNameConfig.f && this.g == voipChangeNameConfig.g && this.h == voipChangeNameConfig.h && epx.f(this.i, voipChangeNameConfig.i);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.b.hashCode() * 31, 31, this.c);
        PreselectedUser preselectedUser = this.d;
        return this.i.hashCode() + shy.a(this.h, qoy.b(qoy.b(qoy.b((a2 + (preselectedUser == null ? 0 : preselectedUser.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        return "VoipChangeNameConfig(callId=" + this.b + ", requestKey=" + this.c + ", preselectedUser=" + this.d + ", withGroups=" + this.e + ", withAnonym=" + this.f + ", withChangeName=" + this.g + ", toolbarTitleRes=" + this.h + ", openedFrom=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
        parcel.writeParcelable(this.i, i);
    }

    public /* synthetic */ VoipChangeNameConfig(CallId callId, String str, PreselectedUser preselectedUser, boolean z, boolean z2, boolean z3, int i, OpenedFrom openedFrom, int i2, zcl zclVar) {
        this(callId, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? PreselectedUser.User.b : preselectedUser, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) == 0 ? z3 : true, (i2 & 64) != 0 ? R.string.voip_change_name_dialog_default_toolbar_title : i, (i2 & 128) != 0 ? OpenedFrom.JoinScreen.b : openedFrom);
    }
}
