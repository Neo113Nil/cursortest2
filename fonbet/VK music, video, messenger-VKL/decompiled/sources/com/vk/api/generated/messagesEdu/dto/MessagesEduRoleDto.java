package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesEduRoleDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduRoleDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduRoleDto> CREATOR = new a();

    @pmi0("details")
    private final String details;

    @pmi0(C4504q2.u)
    private final int order;

    @pmi0("role_code")
    private final RoleCodeDto roleCode;

    @pmi0("source")
    private final String source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesEduRoleDto.kt */
    public static final class RoleCodeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RoleCodeDto[] $VALUES;

        @pmi0("admin")
        public static final RoleCodeDto ADMIN;
        public static final Parcelable.Creator<RoleCodeDto> CREATOR;

        @pmi0("employee")
        public static final RoleCodeDto EMPLOYEE;

        @pmi0("parent")
        public static final RoleCodeDto PARENT;

        @pmi0("student")
        public static final RoleCodeDto STUDENT;

        @pmi0("teacher")
        public static final RoleCodeDto TEACHER;
        private final String value;

        /* compiled from: MessagesEduRoleDto.kt */
        public static final class a implements Parcelable.Creator<RoleCodeDto> {
            @Override // android.os.Parcelable.Creator
            public final RoleCodeDto createFromParcel(Parcel parcel) {
                return RoleCodeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RoleCodeDto[] newArray(int i) {
                return new RoleCodeDto[i];
            }
        }

        static {
            RoleCodeDto roleCodeDto = new RoleCodeDto("ADMIN", 0, "admin");
            ADMIN = roleCodeDto;
            RoleCodeDto roleCodeDto2 = new RoleCodeDto("EMPLOYEE", 1, "employee");
            EMPLOYEE = roleCodeDto2;
            RoleCodeDto roleCodeDto3 = new RoleCodeDto("TEACHER", 2, "teacher");
            TEACHER = roleCodeDto3;
            RoleCodeDto roleCodeDto4 = new RoleCodeDto("PARENT", 3, "parent");
            PARENT = roleCodeDto4;
            RoleCodeDto roleCodeDto5 = new RoleCodeDto("STUDENT", 4, "student");
            STUDENT = roleCodeDto5;
            RoleCodeDto[] roleCodeDtoArr = {roleCodeDto, roleCodeDto2, roleCodeDto3, roleCodeDto4, roleCodeDto5};
            $VALUES = roleCodeDtoArr;
            $ENTRIES = new asp(roleCodeDtoArr);
            CREATOR = new a();
        }

        private RoleCodeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static RoleCodeDto valueOf(String str) {
            return (RoleCodeDto) Enum.valueOf(RoleCodeDto.class, str);
        }

        public static RoleCodeDto[] values() {
            return (RoleCodeDto[]) $VALUES.clone();
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

    /* compiled from: MessagesEduRoleDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduRoleDto createFromParcel(Parcel parcel) {
            return new MessagesEduRoleDto(RoleCodeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduRoleDto[] newArray(int i) {
            return new MessagesEduRoleDto[i];
        }
    }

    public MessagesEduRoleDto(RoleCodeDto roleCodeDto, String str, int i, String str2) {
        this.roleCode = roleCodeDto;
        this.details = str;
        this.order = i;
        this.source = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduRoleDto)) {
            return false;
        }
        MessagesEduRoleDto messagesEduRoleDto = (MessagesEduRoleDto) obj;
        return this.roleCode == messagesEduRoleDto.roleCode && epx.f(this.details, messagesEduRoleDto.details) && this.order == messagesEduRoleDto.order && epx.f(this.source, messagesEduRoleDto.source);
    }

    public final int hashCode() {
        int a2 = shy.a(this.order, urd0.a(this.roleCode.hashCode() * 31, 31, this.details), 31);
        String str = this.source;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduRoleDto(roleCode=");
        sb.append(this.roleCode);
        sb.append(", details=");
        sb.append(this.details);
        sb.append(", order=");
        sb.append(this.order);
        sb.append(", source=");
        return ho8.a(sb, this.source, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.roleCode.writeToParcel(parcel, i);
        parcel.writeString(this.details);
        parcel.writeInt(this.order);
        parcel.writeString(this.source);
    }

    public /* synthetic */ MessagesEduRoleDto(RoleCodeDto roleCodeDto, String str, int i, String str2, int i2, zcl zclVar) {
        this(roleCodeDto, str, i, (i2 & 8) != 0 ? null : str2);
    }
}
