package com.vk.api.generated.marusia.dto;

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

/* compiled from: MarusiaWidgetMessagesConversationItemDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaWidgetMessagesConversationItemDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaWidgetMessagesConversationItemDto> CREATOR = new a();

    @pmi0("conversation_name")
    private final String conversationName;

    @pmi0("peer_id")
    private final int peerId;

    @pmi0("photos")
    private final List<BaseImageDto> photos;

    /* compiled from: MarusiaWidgetMessagesConversationItemDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaWidgetMessagesConversationItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaWidgetMessagesConversationItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(MarusiaWidgetMessagesConversationItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarusiaWidgetMessagesConversationItemDto(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaWidgetMessagesConversationItemDto[] newArray(int i) {
            return new MarusiaWidgetMessagesConversationItemDto[i];
        }
    }

    public MarusiaWidgetMessagesConversationItemDto(int i, String str, List<BaseImageDto> list) {
        this.peerId = i;
        this.conversationName = str;
        this.photos = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaWidgetMessagesConversationItemDto)) {
            return false;
        }
        MarusiaWidgetMessagesConversationItemDto marusiaWidgetMessagesConversationItemDto = (MarusiaWidgetMessagesConversationItemDto) obj;
        return this.peerId == marusiaWidgetMessagesConversationItemDto.peerId && epx.f(this.conversationName, marusiaWidgetMessagesConversationItemDto.conversationName) && epx.f(this.photos, marusiaWidgetMessagesConversationItemDto.photos);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.peerId) * 31;
        String str = this.conversationName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.photos;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaWidgetMessagesConversationItemDto(peerId=");
        sb.append(this.peerId);
        sb.append(", conversationName=");
        sb.append(this.conversationName);
        sb.append(", photos=");
        return ms9.a(')', sb, this.photos);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.peerId);
        parcel.writeString(this.conversationName);
        List<BaseImageDto> list = this.photos;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MarusiaWidgetMessagesConversationItemDto(int i, String str, List list, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : list);
    }
}
