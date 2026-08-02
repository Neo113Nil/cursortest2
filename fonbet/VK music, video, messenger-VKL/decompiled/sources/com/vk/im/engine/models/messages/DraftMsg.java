package com.vk.im.engine.models.messages;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.messages.MsgTextFormat;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.drm0;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DraftMsg.kt */
/* loaded from: classes2.dex */
public final class DraftMsg implements Serializer.StreamParcelable {
    public static final Serializer.c<DraftMsg> CREATOR = new b();
    public static final DraftMsg h = new DraftMsg(0, null, null, null, null, null, 63, null);
    public final long b;
    public final String c;
    public final MsgTextFormat d;
    public final List<Attach> e;
    public final Integer f;
    public final List<CnvMsgId> g;

    /* compiled from: DraftMsg.kt */
    public static final class a {
        public static DraftMsg a() {
            return DraftMsg.h;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<DraftMsg> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DraftMsg a(Serializer serializer) {
            return new DraftMsg(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DraftMsg[i];
        }
    }

    public DraftMsg() {
        this(0L, null, null, null, null, null, 63, null);
    }

    public static DraftMsg a(DraftMsg draftMsg, int i) {
        long j = draftMsg.b;
        String str = draftMsg.c;
        MsgTextFormat msgTextFormat = draftMsg.d;
        List<Attach> list = draftMsg.e;
        Integer num = (i & 16) != 0 ? draftMsg.f : null;
        List<CnvMsgId> list2 = draftMsg.g;
        draftMsg.getClass();
        return new DraftMsg(j, str, msgTextFormat, list, num, list2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.W(this.e);
        serializer.V(this.f);
        serializer.W(this.g);
    }

    public final boolean d() {
        return !isEmpty();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftMsg)) {
            return false;
        }
        DraftMsg draftMsg = (DraftMsg) obj;
        return this.b == draftMsg.b && epx.f(this.c, draftMsg.c) && epx.f(this.d, draftMsg.d) && epx.f(this.e, draftMsg.e) && epx.f(this.f, draftMsg.f) && epx.f(this.g, draftMsg.g);
    }

    public final int hashCode() {
        int a2 = fw3.a((this.d.hashCode() + urd0.a(Long.hashCode(this.b) * 31, 31, this.c)) * 31, 31, this.e);
        Integer num = this.f;
        return this.g.hashCode() + ((a2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final boolean isEmpty() {
        return drm0.N(this.c) && this.e.isEmpty() && this.f == null && this.g.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftMsg(time=");
        sb.append(this.b);
        sb.append(", body=");
        sb.append(this.c);
        sb.append(", bodyFormat=");
        sb.append(this.d);
        sb.append(", attachList=");
        sb.append(this.e);
        sb.append(", replyCnvId=");
        sb.append(this.f);
        sb.append(", fwdCnvIds=");
        return ms9.a(')', sb, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraftMsg(long j, String str, MsgTextFormat msgTextFormat, List<? extends Attach> list, Integer num, List<CnvMsgId> list2) {
        this.b = j;
        this.c = str;
        this.d = msgTextFormat;
        this.e = list;
        this.f = num;
        this.g = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DraftMsg(long j, String str, MsgTextFormat msgTextFormat, List list, Integer num, List list2, int i, zcl zclVar) {
        this(r0, r2, r3, (i & 8) != 0 ? EmptyList.b : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? EmptyList.b : list2);
        MsgTextFormat msgTextFormat2;
        long j2 = (i & 1) != 0 ? 0L : j;
        String str2 = (i & 2) != 0 ? "" : str;
        if ((i & 4) != 0) {
            MsgTextFormat msgTextFormat3 = MsgTextFormat.d;
            msgTextFormat2 = MsgTextFormat.d;
        } else {
            msgTextFormat2 = msgTextFormat;
        }
    }

    public DraftMsg(Serializer serializer, zcl zclVar) {
        this(serializer.w(), serializer.H(), (MsgTextFormat) serializer.G(MsgTextFormat.class.getClassLoader()), serializer.l(Attach.class.getClassLoader()), serializer.v(), serializer.k(CnvMsgId.class));
    }
}
