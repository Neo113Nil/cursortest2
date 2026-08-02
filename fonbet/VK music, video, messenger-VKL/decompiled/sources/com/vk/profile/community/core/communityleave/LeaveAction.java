package com.vk.profile.community.core.communityleave;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityLeaveState.kt */
/* loaded from: classes5.dex */
public final class LeaveAction implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LeaveAction[] $VALUES;
    public static final Parcelable.Creator<LeaveAction> CREATOR;
    public static final LeaveAction REJECT_ADMIN;
    public static final LeaveAction STAY_ADMIN;

    /* compiled from: CommunityLeaveState.kt */
    public static final class a implements Parcelable.Creator<LeaveAction> {
        @Override // android.os.Parcelable.Creator
        public final LeaveAction createFromParcel(Parcel parcel) {
            return LeaveAction.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LeaveAction[] newArray(int i) {
            return new LeaveAction[i];
        }
    }

    static {
        LeaveAction leaveAction = new LeaveAction("STAY_ADMIN", 0);
        STAY_ADMIN = leaveAction;
        LeaveAction leaveAction2 = new LeaveAction("REJECT_ADMIN", 1);
        REJECT_ADMIN = leaveAction2;
        LeaveAction[] leaveActionArr = {leaveAction, leaveAction2};
        $VALUES = leaveActionArr;
        $ENTRIES = new asp(leaveActionArr);
        CREATOR = new a();
    }

    public LeaveAction() {
        throw null;
    }

    public static LeaveAction valueOf(String str) {
        return (LeaveAction) Enum.valueOf(LeaveAction.class, str);
    }

    public static LeaveAction[] values() {
        return (LeaveAction[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
