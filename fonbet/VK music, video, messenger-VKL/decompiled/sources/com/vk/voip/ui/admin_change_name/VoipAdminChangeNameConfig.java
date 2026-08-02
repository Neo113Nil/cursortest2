package com.vk.voip.ui.admin_change_name;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;

/* compiled from: VoipAdminChangeNameConfig.kt */
/* loaded from: classes7.dex */
public final class VoipAdminChangeNameConfig implements Parcelable {
    public static final Parcelable.Creator<VoipAdminChangeNameConfig> CREATOR = new a();
    public final CallId b;
    public final UserId c;
    public final ParticipantToChangeName d;

    /* compiled from: VoipAdminChangeNameConfig.kt */
    public static final class ParticipantToChangeName implements Parcelable {
        public static final Parcelable.Creator<ParticipantToChangeName> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: VoipAdminChangeNameConfig.kt */
        public static final class a implements Parcelable.Creator<ParticipantToChangeName> {
            @Override // android.os.Parcelable.Creator
            public final ParticipantToChangeName createFromParcel(Parcel parcel) {
                return new ParticipantToChangeName(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ParticipantToChangeName[] newArray(int i) {
                return new ParticipantToChangeName[i];
            }
        }

        public ParticipantToChangeName(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: VoipAdminChangeNameConfig.kt */
    public static final class a implements Parcelable.Creator<VoipAdminChangeNameConfig> {
        @Override // android.os.Parcelable.Creator
        public final VoipAdminChangeNameConfig createFromParcel(Parcel parcel) {
            return new VoipAdminChangeNameConfig((CallId) parcel.readParcelable(VoipAdminChangeNameConfig.class.getClassLoader()), (UserId) parcel.readParcelable(VoipAdminChangeNameConfig.class.getClassLoader()), ParticipantToChangeName.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VoipAdminChangeNameConfig[] newArray(int i) {
            return new VoipAdminChangeNameConfig[i];
        }
    }

    public VoipAdminChangeNameConfig(CallId callId, UserId userId, ParticipantToChangeName participantToChangeName) {
        this.b = callId;
        this.c = userId;
        this.d = participantToChangeName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        this.d.writeToParcel(parcel, i);
    }
}
