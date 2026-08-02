package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.calls.dto.CallsCustomNameForCallDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesAnonymDto.kt */
/* loaded from: classes15.dex */
public final class MessagesAnonymDto implements Parcelable {
    public static final Parcelable.Creator<MessagesAnonymDto> CREATOR = new a();

    @pmi0("custom_names_for_calls")
    private final List<CallsCustomNameForCallDto> customNamesForCalls;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final String photo;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_400")
    private final String photo400;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    /* compiled from: MessagesAnonymDto.kt */
    public static final class a implements Parcelable.Creator<MessagesAnonymDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesAnonymDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(MessagesAnonymDto.class, parcel, arrayList, i, 1);
                }
            }
            return new MessagesAnonymDto(readInt, readString, readString2, readString3, readString4, readString5, readString6, readString7, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesAnonymDto[] newArray(int i) {
            return new MessagesAnonymDto[i];
        }
    }

    public MessagesAnonymDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<CallsCustomNameForCallDto> list) {
        this.id = i;
        this.name = str;
        this.photo = str2;
        this.photo200 = str3;
        this.photo400 = str4;
        this.photo50 = str5;
        this.photo100 = str6;
        this.photoBase = str7;
        this.customNamesForCalls = list;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.photo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesAnonymDto)) {
            return false;
        }
        MessagesAnonymDto messagesAnonymDto = (MessagesAnonymDto) obj;
        return this.id == messagesAnonymDto.id && epx.f(this.name, messagesAnonymDto.name) && epx.f(this.photo, messagesAnonymDto.photo) && epx.f(this.photo200, messagesAnonymDto.photo200) && epx.f(this.photo400, messagesAnonymDto.photo400) && epx.f(this.photo50, messagesAnonymDto.photo50) && epx.f(this.photo100, messagesAnonymDto.photo100) && epx.f(this.photoBase, messagesAnonymDto.photoBase) && epx.f(this.customNamesForCalls, messagesAnonymDto.customNamesForCalls);
    }

    public final String f() {
        return this.photo200;
    }

    public final String g() {
        return this.photoBase;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.photo;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo200;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo400;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo50;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo100;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photoBase;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<CallsCustomNameForCallDto> list = this.customNamesForCalls;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesAnonymDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photo400=");
        sb.append(this.photo400);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", customNamesForCalls=");
        return ms9.a(')', sb, this.customNamesForCalls);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.photo);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photo400);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photoBase);
        List<CallsCustomNameForCallDto> list = this.customNamesForCalls;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MessagesAnonymDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : list);
    }
}
