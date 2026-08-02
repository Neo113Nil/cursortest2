package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesKeyboardDto.kt */
/* loaded from: classes15.dex */
public final class MessagesKeyboardDto implements Parcelable {
    public static final Parcelable.Creator<MessagesKeyboardDto> CREATOR = new a();

    @pmi0("author_id")
    private final UserId authorId;

    @pmi0("buttons")
    private final List<List<MessagesKeyboardButtonDto>> buttons;

    @pmi0("inline")
    private final Boolean inline;

    @pmi0("one_time")
    private final boolean oneTime;

    /* compiled from: MessagesKeyboardDto.kt */
    public static final class a implements Parcelable.Creator<MessagesKeyboardDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesKeyboardDto createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(MessagesKeyboardButtonDto.CREATOR, parcel, arrayList2, i2, 1);
                }
                arrayList.add(arrayList2);
            }
            return new MessagesKeyboardDto(z, arrayList, (UserId) parcel.readParcelable(MessagesKeyboardDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesKeyboardDto[] newArray(int i) {
            return new MessagesKeyboardDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesKeyboardDto(boolean z, List<? extends List<MessagesKeyboardButtonDto>> list, UserId userId, Boolean bool) {
        this.oneTime = z;
        this.buttons = list;
        this.authorId = userId;
        this.inline = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesKeyboardDto)) {
            return false;
        }
        MessagesKeyboardDto messagesKeyboardDto = (MessagesKeyboardDto) obj;
        return this.oneTime == messagesKeyboardDto.oneTime && epx.f(this.buttons, messagesKeyboardDto.buttons) && epx.f(this.authorId, messagesKeyboardDto.authorId) && epx.f(this.inline, messagesKeyboardDto.inline);
    }

    public final int hashCode() {
        int a2 = fw3.a(Boolean.hashCode(this.oneTime) * 31, 31, this.buttons);
        UserId userId = this.authorId;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool = this.inline;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesKeyboardDto(oneTime=");
        sb.append(this.oneTime);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", inline=");
        return tn.a(sb, this.inline, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.oneTime ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.buttons);
        while (a2.hasNext()) {
            Iterator a3 = ao.a(parcel, (List) a2.next());
            while (a3.hasNext()) {
                ((MessagesKeyboardButtonDto) a3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.authorId, i);
        Boolean bool = this.inline;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesKeyboardDto(boolean z, List list, UserId userId, Boolean bool, int i, zcl zclVar) {
        this(z, list, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : bool);
    }
}
