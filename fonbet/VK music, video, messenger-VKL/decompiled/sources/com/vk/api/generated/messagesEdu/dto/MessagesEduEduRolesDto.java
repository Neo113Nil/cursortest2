package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesEduEduRolesDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduEduRolesDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduEduRolesDto> CREATOR = new a();

    @pmi0("main_role_code")
    private final MainRoleCodeDto mainRoleCode;

    @pmi0("main_roles")
    private final String mainRoles;

    @pmi0("organizations")
    private final List<MessagesEduOrganizationDto> organizations;

    @pmi0("user_id")
    private final UserId userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesEduEduRolesDto.kt */
    public static final class MainRoleCodeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MainRoleCodeDto[] $VALUES;

        @pmi0("admin")
        public static final MainRoleCodeDto ADMIN;
        public static final Parcelable.Creator<MainRoleCodeDto> CREATOR;

        @pmi0("employee")
        public static final MainRoleCodeDto EMPLOYEE;

        @pmi0("parent")
        public static final MainRoleCodeDto PARENT;

        @pmi0("student")
        public static final MainRoleCodeDto STUDENT;

        @pmi0("teacher")
        public static final MainRoleCodeDto TEACHER;
        private final String value;

        /* compiled from: MessagesEduEduRolesDto.kt */
        public static final class a implements Parcelable.Creator<MainRoleCodeDto> {
            @Override // android.os.Parcelable.Creator
            public final MainRoleCodeDto createFromParcel(Parcel parcel) {
                return MainRoleCodeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MainRoleCodeDto[] newArray(int i) {
                return new MainRoleCodeDto[i];
            }
        }

        static {
            MainRoleCodeDto mainRoleCodeDto = new MainRoleCodeDto("ADMIN", 0, "admin");
            ADMIN = mainRoleCodeDto;
            MainRoleCodeDto mainRoleCodeDto2 = new MainRoleCodeDto("EMPLOYEE", 1, "employee");
            EMPLOYEE = mainRoleCodeDto2;
            MainRoleCodeDto mainRoleCodeDto3 = new MainRoleCodeDto("TEACHER", 2, "teacher");
            TEACHER = mainRoleCodeDto3;
            MainRoleCodeDto mainRoleCodeDto4 = new MainRoleCodeDto("PARENT", 3, "parent");
            PARENT = mainRoleCodeDto4;
            MainRoleCodeDto mainRoleCodeDto5 = new MainRoleCodeDto("STUDENT", 4, "student");
            STUDENT = mainRoleCodeDto5;
            MainRoleCodeDto[] mainRoleCodeDtoArr = {mainRoleCodeDto, mainRoleCodeDto2, mainRoleCodeDto3, mainRoleCodeDto4, mainRoleCodeDto5};
            $VALUES = mainRoleCodeDtoArr;
            $ENTRIES = new asp(mainRoleCodeDtoArr);
            CREATOR = new a();
        }

        private MainRoleCodeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static MainRoleCodeDto valueOf(String str) {
            return (MainRoleCodeDto) Enum.valueOf(MainRoleCodeDto.class, str);
        }

        public static MainRoleCodeDto[] values() {
            return (MainRoleCodeDto[]) $VALUES.clone();
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

    /* compiled from: MessagesEduEduRolesDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduEduRolesDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduEduRolesDto createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(MessagesEduEduRolesDto.class.getClassLoader());
            String readString = parcel.readString();
            ArrayList arrayList = null;
            MainRoleCodeDto createFromParcel = parcel.readInt() == 0 ? null : MainRoleCodeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesEduOrganizationDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesEduEduRolesDto(userId, readString, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduEduRolesDto[] newArray(int i) {
            return new MessagesEduEduRolesDto[i];
        }
    }

    public MessagesEduEduRolesDto(UserId userId, String str, MainRoleCodeDto mainRoleCodeDto, List<MessagesEduOrganizationDto> list) {
        this.userId = userId;
        this.mainRoles = str;
        this.mainRoleCode = mainRoleCodeDto;
        this.organizations = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduEduRolesDto)) {
            return false;
        }
        MessagesEduEduRolesDto messagesEduEduRolesDto = (MessagesEduEduRolesDto) obj;
        return epx.f(this.userId, messagesEduEduRolesDto.userId) && epx.f(this.mainRoles, messagesEduEduRolesDto.mainRoles) && this.mainRoleCode == messagesEduEduRolesDto.mainRoleCode && epx.f(this.organizations, messagesEduEduRolesDto.organizations);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.userId.b) * 31;
        String str = this.mainRoles;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MainRoleCodeDto mainRoleCodeDto = this.mainRoleCode;
        int hashCode3 = (hashCode2 + (mainRoleCodeDto == null ? 0 : mainRoleCodeDto.hashCode())) * 31;
        List<MessagesEduOrganizationDto> list = this.organizations;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduEduRolesDto(userId=");
        sb.append(this.userId);
        sb.append(", mainRoles=");
        sb.append(this.mainRoles);
        sb.append(", mainRoleCode=");
        sb.append(this.mainRoleCode);
        sb.append(", organizations=");
        return ms9.a(')', sb, this.organizations);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.mainRoles);
        MainRoleCodeDto mainRoleCodeDto = this.mainRoleCode;
        if (mainRoleCodeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mainRoleCodeDto.writeToParcel(parcel, i);
        }
        List<MessagesEduOrganizationDto> list = this.organizations;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MessagesEduOrganizationDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesEduEduRolesDto(UserId userId, String str, MainRoleCodeDto mainRoleCodeDto, List list, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : mainRoleCodeDto, (i & 8) != 0 ? null : list);
    }
}
