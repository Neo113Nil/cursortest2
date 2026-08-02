package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsGroupDonutSubscriptionsLevelDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutSubscriptionsLevelDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutSubscriptionsLevelDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("action_text")
    private final String actionText;

    @pmi0("benefits")
    private final List<GroupsGroupDonutSubscriptionsBenefitDto> benefits;

    @pmi0("expiration_date")
    private final String expirationDate;

    @pmi0("next_payment_date")
    private final String nextPaymentDate;

    @pmi0("price")
    private final String price;

    @pmi0("status")
    private final String status;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsGroupDonutSubscriptionsLevelDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutSubscriptionsLevelDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionsLevelDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            BaseLinkButtonActionDto createFromParcel = parcel.readInt() == 0 ? null : BaseLinkButtonActionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsGroupDonutSubscriptionsBenefitDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new GroupsGroupDonutSubscriptionsLevelDto(readString, readString2, readString3, readString4, readString5, readString6, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionsLevelDto[] newArray(int i) {
            return new GroupsGroupDonutSubscriptionsLevelDto[i];
        }
    }

    public GroupsGroupDonutSubscriptionsLevelDto(String str, String str2, String str3, String str4, String str5, String str6, BaseLinkButtonActionDto baseLinkButtonActionDto, List<GroupsGroupDonutSubscriptionsBenefitDto> list) {
        this.status = str;
        this.title = str2;
        this.actionText = str3;
        this.price = str4;
        this.nextPaymentDate = str5;
        this.expirationDate = str6;
        this.action = baseLinkButtonActionDto;
        this.benefits = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutSubscriptionsLevelDto)) {
            return false;
        }
        GroupsGroupDonutSubscriptionsLevelDto groupsGroupDonutSubscriptionsLevelDto = (GroupsGroupDonutSubscriptionsLevelDto) obj;
        return epx.f(this.status, groupsGroupDonutSubscriptionsLevelDto.status) && epx.f(this.title, groupsGroupDonutSubscriptionsLevelDto.title) && epx.f(this.actionText, groupsGroupDonutSubscriptionsLevelDto.actionText) && epx.f(this.price, groupsGroupDonutSubscriptionsLevelDto.price) && epx.f(this.nextPaymentDate, groupsGroupDonutSubscriptionsLevelDto.nextPaymentDate) && epx.f(this.expirationDate, groupsGroupDonutSubscriptionsLevelDto.expirationDate) && epx.f(this.action, groupsGroupDonutSubscriptionsLevelDto.action) && epx.f(this.benefits, groupsGroupDonutSubscriptionsLevelDto.benefits);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.status.hashCode() * 31, 31, this.title);
        String str = this.actionText;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.price;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nextPaymentDate;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expirationDate;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode5 = (hashCode4 + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        List<GroupsGroupDonutSubscriptionsBenefitDto> list = this.benefits;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupDonutSubscriptionsLevelDto(status=");
        sb.append(this.status);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", actionText=");
        sb.append(this.actionText);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", nextPaymentDate=");
        sb.append(this.nextPaymentDate);
        sb.append(", expirationDate=");
        sb.append(this.expirationDate);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", benefits=");
        return ms9.a(')', sb, this.benefits);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.status);
        parcel.writeString(this.title);
        parcel.writeString(this.actionText);
        parcel.writeString(this.price);
        parcel.writeString(this.nextPaymentDate);
        parcel.writeString(this.expirationDate);
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        if (baseLinkButtonActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionDto.writeToParcel(parcel, i);
        }
        List<GroupsGroupDonutSubscriptionsBenefitDto> list = this.benefits;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsGroupDonutSubscriptionsBenefitDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupDonutSubscriptionsLevelDto(String str, String str2, String str3, String str4, String str5, String str6, BaseLinkButtonActionDto baseLinkButtonActionDto, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : baseLinkButtonActionDto, (i & 128) != 0 ? null : list);
    }
}
