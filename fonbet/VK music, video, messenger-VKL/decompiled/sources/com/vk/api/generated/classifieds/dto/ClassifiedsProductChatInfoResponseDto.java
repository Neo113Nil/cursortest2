package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ClassifiedsProductChatInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsProductChatInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsProductChatInfoResponseDto> CREATOR = new a();

    @pmi0("call_disabled_reason")
    private final String callDisabledReason;

    @pmi0("is_call_enabled")
    private final Boolean isCallEnabled;

    @pmi0("is_call_recommended")
    private final Boolean isCallRecommended;

    @pmi0("product_id")
    private final String productId;

    @pmi0("suggests")
    private final List<ClassifiedsProductChatSuggestDto> suggests;

    /* compiled from: ClassifiedsProductChatInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsProductChatInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProductChatInfoResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
                arrayList = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                arrayList = null;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(ClassifiedsProductChatSuggestDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ClassifiedsProductChatInfoResponseDto(readString, valueOf, valueOf2, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProductChatInfoResponseDto[] newArray(int i) {
            return new ClassifiedsProductChatInfoResponseDto[i];
        }
    }

    public ClassifiedsProductChatInfoResponseDto(String str, Boolean bool, Boolean bool2, String str2, List<ClassifiedsProductChatSuggestDto> list) {
        this.productId = str;
        this.isCallEnabled = bool;
        this.isCallRecommended = bool2;
        this.callDisabledReason = str2;
        this.suggests = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsProductChatInfoResponseDto)) {
            return false;
        }
        ClassifiedsProductChatInfoResponseDto classifiedsProductChatInfoResponseDto = (ClassifiedsProductChatInfoResponseDto) obj;
        return epx.f(this.productId, classifiedsProductChatInfoResponseDto.productId) && epx.f(this.isCallEnabled, classifiedsProductChatInfoResponseDto.isCallEnabled) && epx.f(this.isCallRecommended, classifiedsProductChatInfoResponseDto.isCallRecommended) && epx.f(this.callDisabledReason, classifiedsProductChatInfoResponseDto.callDisabledReason) && epx.f(this.suggests, classifiedsProductChatInfoResponseDto.suggests);
    }

    public final int hashCode() {
        int hashCode = this.productId.hashCode() * 31;
        Boolean bool = this.isCallEnabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCallRecommended;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.callDisabledReason;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<ClassifiedsProductChatSuggestDto> list = this.suggests;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsProductChatInfoResponseDto(productId=");
        sb.append(this.productId);
        sb.append(", isCallEnabled=");
        sb.append(this.isCallEnabled);
        sb.append(", isCallRecommended=");
        sb.append(this.isCallRecommended);
        sb.append(", callDisabledReason=");
        sb.append(this.callDisabledReason);
        sb.append(", suggests=");
        return ms9.a(')', sb, this.suggests);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        Boolean bool = this.isCallEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isCallRecommended;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.callDisabledReason);
        List<ClassifiedsProductChatSuggestDto> list = this.suggests;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((ClassifiedsProductChatSuggestDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ClassifiedsProductChatInfoResponseDto(String str, Boolean bool, Boolean bool2, String str2, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list);
    }
}
