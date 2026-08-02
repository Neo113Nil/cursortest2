package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsActionButtonsDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsActionButtonsDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsActionButtonsDto> CREATOR = new a();

    @pmi0(TtmlNode.LEFT)
    private final List<NotificationsUnifiedButtonDto> left;

    @pmi0(TtmlNode.RIGHT)
    private final List<NotificationsUnifiedButtonDto> right;

    /* compiled from: NotificationsActionButtonsDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsActionButtonsDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsActionButtonsDto createFromParcel(Parcel parcel) {
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
                    i2 = en.a(NotificationsUnifiedButtonDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(NotificationsUnifiedButtonDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new NotificationsActionButtonsDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsActionButtonsDto[] newArray(int i) {
            return new NotificationsActionButtonsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsActionButtonsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<NotificationsUnifiedButtonDto> d() {
        return this.left;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<NotificationsUnifiedButtonDto> e() {
        return this.right;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsActionButtonsDto)) {
            return false;
        }
        NotificationsActionButtonsDto notificationsActionButtonsDto = (NotificationsActionButtonsDto) obj;
        return epx.f(this.left, notificationsActionButtonsDto.left) && epx.f(this.right, notificationsActionButtonsDto.right);
    }

    public final int hashCode() {
        List<NotificationsUnifiedButtonDto> list = this.left;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NotificationsUnifiedButtonDto> list2 = this.right;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsActionButtonsDto(left=");
        sb.append(this.left);
        sb.append(", right=");
        return ms9.a(')', sb, this.right);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<NotificationsUnifiedButtonDto> list = this.left;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((NotificationsUnifiedButtonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<NotificationsUnifiedButtonDto> list2 = this.right;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((NotificationsUnifiedButtonDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public NotificationsActionButtonsDto(List<NotificationsUnifiedButtonDto> list, List<NotificationsUnifiedButtonDto> list2) {
        this.left = list;
        this.right = list2;
    }

    public /* synthetic */ NotificationsActionButtonsDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
