package com.vk.api.generated.messages.dto;

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
import xsna.zcl;

/* compiled from: MessagesMessageTemplateDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageTemplateDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageTemplateDto> CREATOR = new a();

    @pmi0("elements")
    private final List<MessagesMessageCarouselItemDto> elements;

    @pmi0("type")
    private final String type;

    /* compiled from: MessagesMessageTemplateDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageTemplateDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageTemplateDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesMessageCarouselItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesMessageTemplateDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageTemplateDto[] newArray(int i) {
            return new MessagesMessageTemplateDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesMessageTemplateDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageTemplateDto)) {
            return false;
        }
        MessagesMessageTemplateDto messagesMessageTemplateDto = (MessagesMessageTemplateDto) obj;
        return epx.f(this.type, messagesMessageTemplateDto.type) && epx.f(this.elements, messagesMessageTemplateDto.elements);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MessagesMessageCarouselItemDto> list = this.elements;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageTemplateDto(type=");
        sb.append(this.type);
        sb.append(", elements=");
        return ms9.a(')', sb, this.elements);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        List<MessagesMessageCarouselItemDto> list = this.elements;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MessagesMessageCarouselItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MessagesMessageTemplateDto(String str, List<MessagesMessageCarouselItemDto> list) {
        this.type = str;
        this.elements = list;
    }

    public /* synthetic */ MessagesMessageTemplateDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
