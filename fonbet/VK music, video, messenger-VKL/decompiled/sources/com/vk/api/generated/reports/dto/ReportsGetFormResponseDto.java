package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ReportsGetFormResponseDto.kt */
/* loaded from: classes15.dex */
public final class ReportsGetFormResponseDto implements Parcelable {
    public static final Parcelable.Creator<ReportsGetFormResponseDto> CREATOR = new a();

    @pmi0("after_submit_actions")
    private final List<String> afterSubmitActions;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("header")
    private final String header;

    @pmi0("more")
    private final String more;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reason_categories")
    private final List<ReportsReasonCategoryDto> reasonCategories;

    @pmi0("silent_mode_hash")
    private final String silentModeHash;

    @pmi0("snippet")
    private final ReportsFormSnippetDto snippet;

    /* compiled from: ReportsGetFormResponseDto.kt */
    public static final class a implements Parcelable.Creator<ReportsGetFormResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsGetFormResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(ReportsReasonCategoryDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            ReportsFormSnippetDto createFromParcel = parcel.readInt() == 0 ? null : ReportsFormSnippetDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList3 = null;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(ReportsGetFormResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(ReportsGetFormResponseDto.class, parcel, arrayList4, i, 1);
                }
                arrayList3 = arrayList4;
            }
            return new ReportsGetFormResponseDto(readString, readString2, arrayList2, createFromParcel, createStringArrayList, arrayList, arrayList3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsGetFormResponseDto[] newArray(int i) {
            return new ReportsGetFormResponseDto[i];
        }
    }

    public ReportsGetFormResponseDto(String str, String str2, List<ReportsReasonCategoryDto> list, ReportsFormSnippetDto reportsFormSnippetDto, List<String> list2, List<UsersUserFullDto> list3, List<GroupsGroupFullDto> list4, String str3) {
        this.header = str;
        this.more = str2;
        this.reasonCategories = list;
        this.snippet = reportsFormSnippetDto;
        this.afterSubmitActions = list2;
        this.profiles = list3;
        this.groups = list4;
        this.silentModeHash = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportsGetFormResponseDto)) {
            return false;
        }
        ReportsGetFormResponseDto reportsGetFormResponseDto = (ReportsGetFormResponseDto) obj;
        return epx.f(this.header, reportsGetFormResponseDto.header) && epx.f(this.more, reportsGetFormResponseDto.more) && epx.f(this.reasonCategories, reportsGetFormResponseDto.reasonCategories) && epx.f(this.snippet, reportsGetFormResponseDto.snippet) && epx.f(this.afterSubmitActions, reportsGetFormResponseDto.afterSubmitActions) && epx.f(this.profiles, reportsGetFormResponseDto.profiles) && epx.f(this.groups, reportsGetFormResponseDto.groups) && epx.f(this.silentModeHash, reportsGetFormResponseDto.silentModeHash);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.header.hashCode() * 31, 31, this.more), 31, this.reasonCategories);
        ReportsFormSnippetDto reportsFormSnippetDto = this.snippet;
        int hashCode = (a2 + (reportsFormSnippetDto == null ? 0 : reportsFormSnippetDto.hashCode())) * 31;
        List<String> list = this.afterSubmitActions;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.silentModeHash;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportsGetFormResponseDto(header=");
        sb.append(this.header);
        sb.append(", more=");
        sb.append(this.more);
        sb.append(", reasonCategories=");
        sb.append(this.reasonCategories);
        sb.append(", snippet=");
        sb.append(this.snippet);
        sb.append(", afterSubmitActions=");
        sb.append(this.afterSubmitActions);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", silentModeHash=");
        return ho8.a(sb, this.silentModeHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.header);
        parcel.writeString(this.more);
        Iterator a2 = ao.a(parcel, this.reasonCategories);
        while (a2.hasNext()) {
            ((ReportsReasonCategoryDto) a2.next()).writeToParcel(parcel, i);
        }
        ReportsFormSnippetDto reportsFormSnippetDto = this.snippet;
        if (reportsFormSnippetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reportsFormSnippetDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.afterSubmitActions);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.silentModeHash);
    }

    public /* synthetic */ ReportsGetFormResponseDto(String str, String str2, List list, ReportsFormSnippetDto reportsFormSnippetDto, List list2, List list3, List list4, String str3, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : reportsFormSnippetDto, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : list4, (i & 128) != 0 ? null : str3);
    }
}
