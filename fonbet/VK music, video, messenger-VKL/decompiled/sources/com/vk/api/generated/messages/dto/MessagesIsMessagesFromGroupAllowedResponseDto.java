package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesIsMessagesFromGroupAllowedResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesIsMessagesFromGroupAllowedResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesIsMessagesFromGroupAllowedResponseDto> CREATOR = new a();

    @pmi0("error_code")
    private final Integer errorCode;

    @pmi0("intents")
    private final List<String> intents;

    @pmi0("is_allowed")
    private final BaseBoolIntDto isAllowed;

    @pmi0("subscribe_ids")
    private final List<Integer> subscribeIds;

    /* compiled from: MessagesIsMessagesFromGroupAllowedResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesIsMessagesFromGroupAllowedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesIsMessagesFromGroupAllowedResponseDto createFromParcel(Parcel parcel) {
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(MessagesIsMessagesFromGroupAllowedResponseDto.class.getClassLoader());
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesIsMessagesFromGroupAllowedResponseDto(baseBoolIntDto, valueOf, createStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesIsMessagesFromGroupAllowedResponseDto[] newArray(int i) {
            return new MessagesIsMessagesFromGroupAllowedResponseDto[i];
        }
    }

    public MessagesIsMessagesFromGroupAllowedResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final List<String> d() {
        return this.intents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Integer> e() {
        return this.subscribeIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesIsMessagesFromGroupAllowedResponseDto)) {
            return false;
        }
        MessagesIsMessagesFromGroupAllowedResponseDto messagesIsMessagesFromGroupAllowedResponseDto = (MessagesIsMessagesFromGroupAllowedResponseDto) obj;
        return this.isAllowed == messagesIsMessagesFromGroupAllowedResponseDto.isAllowed && epx.f(this.errorCode, messagesIsMessagesFromGroupAllowedResponseDto.errorCode) && epx.f(this.intents, messagesIsMessagesFromGroupAllowedResponseDto.intents) && epx.f(this.subscribeIds, messagesIsMessagesFromGroupAllowedResponseDto.subscribeIds);
    }

    public final BaseBoolIntDto f() {
        return this.isAllowed;
    }

    public final int hashCode() {
        BaseBoolIntDto baseBoolIntDto = this.isAllowed;
        int hashCode = (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode()) * 31;
        Integer num = this.errorCode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.intents;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.subscribeIds;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesIsMessagesFromGroupAllowedResponseDto(isAllowed=");
        sb.append(this.isAllowed);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", intents=");
        sb.append(this.intents);
        sb.append(", subscribeIds=");
        return ms9.a(')', sb, this.subscribeIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.isAllowed, i);
        Integer num = this.errorCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeStringList(this.intents);
        List<Integer> list = this.subscribeIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public MessagesIsMessagesFromGroupAllowedResponseDto(BaseBoolIntDto baseBoolIntDto, Integer num, List<String> list, List<Integer> list2) {
        this.isAllowed = baseBoolIntDto;
        this.errorCode = num;
        this.intents = list;
        this.subscribeIds = list2;
    }

    public /* synthetic */ MessagesIsMessagesFromGroupAllowedResponseDto(BaseBoolIntDto baseBoolIntDto, Integer num, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseBoolIntDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
