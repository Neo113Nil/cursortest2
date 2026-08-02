package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesMessageAttachmentLinkCuratorDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageAttachmentLinkCuratorDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageAttachmentLinkCuratorDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("url")
    private final String url;

    /* compiled from: MessagesMessageAttachmentLinkCuratorDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageAttachmentLinkCuratorDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentLinkCuratorDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(MessagesMessageAttachmentLinkCuratorDto.class, parcel, arrayList, i, 1);
                }
            }
            return new MessagesMessageAttachmentLinkCuratorDto(readInt, readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentLinkCuratorDto[] newArray(int i) {
            return new MessagesMessageAttachmentLinkCuratorDto[i];
        }
    }

    public MessagesMessageAttachmentLinkCuratorDto(int i, String str, String str2, String str3, List<BaseImageDto> list) {
        this.id = i;
        this.url = str;
        this.name = str2;
        this.description = str3;
        this.photo = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageAttachmentLinkCuratorDto)) {
            return false;
        }
        MessagesMessageAttachmentLinkCuratorDto messagesMessageAttachmentLinkCuratorDto = (MessagesMessageAttachmentLinkCuratorDto) obj;
        return this.id == messagesMessageAttachmentLinkCuratorDto.id && epx.f(this.url, messagesMessageAttachmentLinkCuratorDto.url) && epx.f(this.name, messagesMessageAttachmentLinkCuratorDto.name) && epx.f(this.description, messagesMessageAttachmentLinkCuratorDto.description) && epx.f(this.photo, messagesMessageAttachmentLinkCuratorDto.photo);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BaseImageDto> list = this.photo;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageAttachmentLinkCuratorDto(id=");
        sb.append(this.id);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", photo=");
        return ms9.a(')', sb, this.photo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.url);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        List<BaseImageDto> list = this.photo;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MessagesMessageAttachmentLinkCuratorDto(int i, String str, String str2, String str3, List list, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : list);
    }
}
