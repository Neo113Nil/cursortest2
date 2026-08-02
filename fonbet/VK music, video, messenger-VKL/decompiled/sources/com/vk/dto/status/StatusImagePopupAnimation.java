package com.vk.dto.status;

import com.vk.core.serialize.Serializer;
import xsna.bh10;
import xsna.epx;
import xsna.shy;
import xsna.vu5;

/* compiled from: StatusImagePopupAnimation.kt */
/* loaded from: classes18.dex */
public final class StatusImagePopupAnimation extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StatusImagePopupAnimation> CREATOR = new a();
    public final String b;
    public final long c;
    public final int d;
    public final int e;
    public final long f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StatusImagePopupAnimation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StatusImagePopupAnimation a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new StatusImagePopupAnimation(H, serializer.w(), serializer.u(), serializer.u(), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatusImagePopupAnimation[i];
        }
    }

    public StatusImagePopupAnimation(String str, long j, int i, int i2, long j2) {
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = j2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.Y(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.Y(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusImagePopupAnimation)) {
            return false;
        }
        StatusImagePopupAnimation statusImagePopupAnimation = (StatusImagePopupAnimation) obj;
        return epx.f(this.b, statusImagePopupAnimation.b) && this.c == statusImagePopupAnimation.c && this.d == statusImagePopupAnimation.d && this.e == statusImagePopupAnimation.e && this.f == statusImagePopupAnimation.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + shy.a(this.e, shy.a(this.d, bh10.a(this.b.hashCode() * 31, 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusImagePopupAnimation(url=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append(", delay=");
        return vu5.a(')', this.f, sb);
    }
}
