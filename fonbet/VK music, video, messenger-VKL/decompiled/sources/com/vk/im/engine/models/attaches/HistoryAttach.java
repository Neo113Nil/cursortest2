package com.vk.im.engine.models.attaches;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithId;
import com.vk.im.engine.models.users.User;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.htx0;
import xsna.zcl;

/* compiled from: HistoryAttach.kt */
/* loaded from: classes2.dex */
public final class HistoryAttach extends Serializer.StreamParcelableAdapter implements htx0 {
    public static final Serializer.c<HistoryAttach> CREATOR = new a();
    public final int b;
    public final long c;
    public final Attach d;
    public final User e;
    public final Long f;
    public final Integer g;
    public final String h;
    public final long i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<HistoryAttach> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HistoryAttach a(Serializer serializer) {
            return new HistoryAttach(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HistoryAttach[i];
        }
    }

    public /* synthetic */ HistoryAttach(int i, long j, Attach attach, User user, Long l, Integer num, String str, int i2, zcl zclVar) {
        this(i, j, attach, user, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.vk.dto.attaches.Attach] */
    public static HistoryAttach zb(HistoryAttach historyAttach, AttachVideo attachVideo, User user, int i) {
        int i2 = historyAttach.b;
        long j = historyAttach.c;
        AttachVideo attachVideo2 = attachVideo;
        if ((i & 4) != 0) {
            attachVideo2 = historyAttach.d;
        }
        AttachVideo attachVideo3 = attachVideo2;
        if ((i & 8) != 0) {
            user = historyAttach.e;
        }
        Long l = historyAttach.f;
        Integer num = historyAttach.g;
        String str = historyAttach.h;
        historyAttach.getClass();
        return new HistoryAttach(i2, j, attachVideo3, user, l, num, str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.Y(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.b0(this.f);
        serializer.V(this.g);
        serializer.m0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryAttach)) {
            return false;
        }
        HistoryAttach historyAttach = (HistoryAttach) obj;
        return this.b == historyAttach.b && this.c == historyAttach.c && epx.f(this.d, historyAttach.d) && epx.f(this.e, historyAttach.e) && epx.f(this.f, historyAttach.f) && epx.f(this.g, historyAttach.g) && epx.f(this.h, historyAttach.h);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + bh10.a(Integer.hashCode(this.b) * 31, 31, this.c)) * 31;
        User user = this.e;
        int hashCode2 = (hashCode + (user == null ? 0 : user.hashCode())) * 31;
        Long l = this.f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.h;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryAttach(msgCnvId=");
        sb.append(this.b);
        sb.append(", fromId=");
        sb.append(this.c);
        sb.append(", attach=");
        sb.append(this.d);
        sb.append(", fromUser=");
        sb.append(this.e);
        sb.append(", date=");
        sb.append(this.f);
        sb.append(", linkedCmid=");
        sb.append(this.g);
        sb.append(", linkedText=");
        return ho8.a(sb, this.h, ')');
    }

    public HistoryAttach(int i, long j, Attach attach, User user, Long l, Integer num, String str) {
        this.b = i;
        this.c = j;
        this.d = attach;
        this.e = user;
        this.f = l;
        this.g = num;
        this.h = str;
        this.i = attach instanceof AttachWithId ? ((AttachWithId) attach).getId() : Integer.hashCode(i) + (attach.hashCode() * 31);
    }

    public HistoryAttach(Serializer serializer) {
        this(serializer.u(), serializer.w(), (Attach) serializer.G(Attach.class.getClassLoader()), (User) serializer.G(User.class.getClassLoader()), serializer.x(), serializer.v(), serializer.I());
    }
}
