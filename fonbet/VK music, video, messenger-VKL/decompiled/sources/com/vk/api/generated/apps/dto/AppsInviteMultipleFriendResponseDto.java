package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AppsInviteMultipleFriendResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsInviteMultipleFriendResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsInviteMultipleFriendResponseDto> CREATOR = new a();

    @pmi0("not_sent_ids")
    private final List<Integer> notSentIds;

    @pmi0("sent_count")
    private final Integer sentCount;

    @pmi0("text")
    private final String text;

    /* compiled from: AppsInviteMultipleFriendResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsInviteMultipleFriendResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsInviteMultipleFriendResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            return new AppsInviteMultipleFriendResponseDto(readString, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsInviteMultipleFriendResponseDto[] newArray(int i) {
            return new AppsInviteMultipleFriendResponseDto[i];
        }
    }

    public AppsInviteMultipleFriendResponseDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.sentCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInviteMultipleFriendResponseDto)) {
            return false;
        }
        AppsInviteMultipleFriendResponseDto appsInviteMultipleFriendResponseDto = (AppsInviteMultipleFriendResponseDto) obj;
        return epx.f(this.text, appsInviteMultipleFriendResponseDto.text) && epx.f(this.notSentIds, appsInviteMultipleFriendResponseDto.notSentIds) && epx.f(this.sentCount, appsInviteMultipleFriendResponseDto.sentCount);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Integer> list = this.notSentIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.sentCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsInviteMultipleFriendResponseDto(text=");
        sb.append(this.text);
        sb.append(", notSentIds=");
        sb.append(this.notSentIds);
        sb.append(", sentCount=");
        return uqi.b(sb, this.sentCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        List<Integer> list = this.notSentIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Integer num = this.sentCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public AppsInviteMultipleFriendResponseDto(String str, List<Integer> list, Integer num) {
        this.text = str;
        this.notSentIds = list;
        this.sentCount = num;
    }

    public /* synthetic */ AppsInviteMultipleFriendResponseDto(String str, List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }
}
