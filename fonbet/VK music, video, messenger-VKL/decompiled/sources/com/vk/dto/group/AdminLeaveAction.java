package com.vk.dto.group;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsLeaveLeaveModeDto;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdminLeaveAction.kt */
/* loaded from: classes18.dex */
public final class AdminLeaveAction implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdminLeaveAction[] $VALUES;
    public static final Parcelable.Creator<AdminLeaveAction> CREATOR;
    public static final AdminLeaveAction LEAVE_ADMIN;
    public static final AdminLeaveAction STAY_ADMIN;
    private final String apiValue;

    /* compiled from: AdminLeaveAction.kt */
    public static final class a implements Parcelable.Creator<AdminLeaveAction> {
        @Override // android.os.Parcelable.Creator
        public final AdminLeaveAction createFromParcel(Parcel parcel) {
            return AdminLeaveAction.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdminLeaveAction[] newArray(int i) {
            return new AdminLeaveAction[i];
        }
    }

    /* compiled from: AdminLeaveAction.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdminLeaveAction.values().length];
            try {
                iArr[AdminLeaveAction.STAY_ADMIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdminLeaveAction.LEAVE_ADMIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AdminLeaveAction adminLeaveAction = new AdminLeaveAction("STAY_ADMIN", 0, "admin_leave_with_right");
        STAY_ADMIN = adminLeaveAction;
        AdminLeaveAction adminLeaveAction2 = new AdminLeaveAction("LEAVE_ADMIN", 1, "admin_leave_without_right");
        LEAVE_ADMIN = adminLeaveAction2;
        AdminLeaveAction[] adminLeaveActionArr = {adminLeaveAction, adminLeaveAction2};
        $VALUES = adminLeaveActionArr;
        $ENTRIES = new asp(adminLeaveActionArr);
        CREATOR = new a();
    }

    public AdminLeaveAction(String str, int i, String str2) {
        this.apiValue = str2;
    }

    public static AdminLeaveAction valueOf(String str) {
        return (AdminLeaveAction) Enum.valueOf(AdminLeaveAction.class, str);
    }

    public static AdminLeaveAction[] values() {
        return (AdminLeaveAction[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsLeaveLeaveModeDto i() {
        int i = b.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return GroupsLeaveLeaveModeDto.ADMIN_LEAVE_WITH_RIGHT;
        }
        if (i == 2) {
            return GroupsLeaveLeaveModeDto.ADMIN_LEAVE_WITHOUT_RIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
