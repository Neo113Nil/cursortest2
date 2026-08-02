package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesEducationEventsInfoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEducationEventsInfoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEducationEventsInfoDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ROLES)
    private final List<MessagesEducationEventDto> roles;

    @pmi0("schedule")
    private final List<MessagesEducationEventDto> schedule;

    /* compiled from: MessagesEducationEventsInfoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEducationEventsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEducationEventsInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(MessagesEducationEventDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(MessagesEducationEventDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new MessagesEducationEventsInfoDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEducationEventsInfoDto[] newArray(int i) {
            return new MessagesEducationEventsInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesEducationEventsInfoDto() {
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
        if (!(obj instanceof MessagesEducationEventsInfoDto)) {
            return false;
        }
        MessagesEducationEventsInfoDto messagesEducationEventsInfoDto = (MessagesEducationEventsInfoDto) obj;
        return epx.f(this.schedule, messagesEducationEventsInfoDto.schedule) && epx.f(this.roles, messagesEducationEventsInfoDto.roles);
    }

    public final int hashCode() {
        List<MessagesEducationEventDto> list = this.schedule;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MessagesEducationEventDto> list2 = this.roles;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEducationEventsInfoDto(schedule=");
        sb.append(this.schedule);
        sb.append(", roles=");
        return ms9.a(')', sb, this.roles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MessagesEducationEventDto> list = this.schedule;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesEducationEventDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MessagesEducationEventDto> list2 = this.roles;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((MessagesEducationEventDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public MessagesEducationEventsInfoDto(List<MessagesEducationEventDto> list, List<MessagesEducationEventDto> list2) {
        this.schedule = list;
        this.roles = list2;
    }

    public /* synthetic */ MessagesEducationEventsInfoDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
