package com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;

/* compiled from: ModerationBlockedItemDialog.kt */
/* loaded from: classes18.dex */
public final class ModerationBlockedItemArgs implements Parcelable {
    public static final Parcelable.Creator<ModerationBlockedItemArgs> CREATOR = new a();
    public final boolean b;
    public final UserId c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* compiled from: ModerationBlockedItemDialog.kt */
    public static final class a implements Parcelable.Creator<ModerationBlockedItemArgs> {
        @Override // android.os.Parcelable.Creator
        public final ModerationBlockedItemArgs createFromParcel(Parcel parcel) {
            return new ModerationBlockedItemArgs(parcel.readInt() != 0, (UserId) parcel.readParcelable(ModerationBlockedItemArgs.class.getClassLoader()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModerationBlockedItemArgs[] newArray(int i) {
            return new ModerationBlockedItemArgs[i];
        }
    }

    public ModerationBlockedItemArgs(boolean z, UserId userId, long j, String str, String str2, String str3, String str4) {
        this.b = z;
        this.c = userId;
        this.d = j;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
