package com.vk.dto.status;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.Owner;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.shy;

/* compiled from: StatusImageParticipants.kt */
/* loaded from: classes18.dex */
public final class StatusImageParticipants extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StatusImageParticipants> CREATOR = new a();
    public final List<Owner> b;
    public final int c;
    public final int d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StatusImageParticipants> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StatusImageParticipants a(Serializer serializer) {
            return new StatusImageParticipants(serializer.k(Owner.class), serializer.u(), serializer.u(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatusImageParticipants[i];
        }
    }

    public StatusImageParticipants(List<Owner> list, int i, int i2, String str) {
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusImageParticipants)) {
            return false;
        }
        StatusImageParticipants statusImageParticipants = (StatusImageParticipants) obj;
        return epx.f(this.b, statusImageParticipants.b) && this.c == statusImageParticipants.c && this.d == statusImageParticipants.d && epx.f(this.e, statusImageParticipants.e);
    }

    public final int hashCode() {
        List<Owner> list = this.b;
        int a2 = shy.a(this.d, shy.a(this.c, (list == null ? 0 : list.hashCode()) * 31, 31), 31);
        String str = this.e;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusImageParticipants(items=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", total=");
        sb.append(this.d);
        sb.append(", text=");
        return ho8.a(sb, this.e, ')');
    }
}
