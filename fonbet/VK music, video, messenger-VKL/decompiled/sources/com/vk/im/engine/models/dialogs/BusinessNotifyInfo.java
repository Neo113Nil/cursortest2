package com.vk.im.engine.models.dialogs;

import com.vk.core.serialize.Serializer;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: BusinessNotifyInfo.kt */
/* loaded from: classes2.dex */
public final class BusinessNotifyInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<BusinessNotifyInfo> CREATOR = new a();
    public final long b;
    public final int c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BusinessNotifyInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BusinessNotifyInfo a(Serializer serializer) {
            return new BusinessNotifyInfo(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BusinessNotifyInfo[i];
        }
    }

    public BusinessNotifyInfo(long j, int i, int i2) {
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessNotifyInfo)) {
            return false;
        }
        BusinessNotifyInfo businessNotifyInfo = (BusinessNotifyInfo) obj;
        return this.b == businessNotifyInfo.b && this.c == businessNotifyInfo.c && this.d == businessNotifyInfo.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, Long.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessNotifyInfo(dialogId=");
        sb.append(this.b);
        sb.append(", lastMsgCnvId=");
        sb.append(this.c);
        sb.append(", countUnread=");
        return vu5.b(sb, this.d, ')');
    }

    public BusinessNotifyInfo(Serializer serializer, zcl zclVar) {
        this(serializer.w(), serializer.u(), serializer.u());
    }
}
