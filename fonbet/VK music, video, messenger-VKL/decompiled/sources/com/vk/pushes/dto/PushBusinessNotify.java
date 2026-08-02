package com.vk.pushes.dto;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PushBusinessNotify.kt */
/* loaded from: classes5.dex */
public final class PushBusinessNotify extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PushBusinessNotify> CREATOR = new a();
    public final Integer b;
    public final String c;
    public final String d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PushBusinessNotify> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PushBusinessNotify a(Serializer serializer) {
            Integer num = (Integer) serializer.C();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new PushBusinessNotify(num, H, H2 != null ? H2 : "", serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushBusinessNotify[i];
        }
    }

    public /* synthetic */ PushBusinessNotify(Integer num, String str, String str2, boolean z, int i, zcl zclVar) {
        this(num, str, str2, (i & 8) != 0 ? false : z);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushBusinessNotify)) {
            return false;
        }
        PushBusinessNotify pushBusinessNotify = (PushBusinessNotify) obj;
        return epx.f(this.b, pushBusinessNotify.b) && epx.f(this.c, pushBusinessNotify.c) && epx.f(this.d, pushBusinessNotify.d) && this.e == pushBusinessNotify.e;
    }

    public final int hashCode() {
        Integer num = this.b;
        return Boolean.hashCode(this.e) + urd0.a(urd0.a((num == null ? 0 : num.hashCode()) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushBusinessNotify(cmid=");
        sb.append(this.b);
        sb.append(", sender=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", removedFromNotifyPanel=");
        return q0.a(sb, this.e, ')');
    }

    public PushBusinessNotify(Integer num, String str, String str2, boolean z) {
        this.b = num;
        this.c = str;
        this.d = str2;
        this.e = z;
    }
}
