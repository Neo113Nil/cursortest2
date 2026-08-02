package com.vk.voip.api.id;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.zcl;

/* compiled from: CallId.kt */
/* loaded from: classes11.dex */
public final class CallId extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CallId> CREATOR = new b();
    public static final CallId e = new CallId("");
    public final String b;
    public final boolean c;
    public final boolean d;

    /* compiled from: CallId.kt */
    public static final class a {
        public static CallId a(String str) {
            return (str == null || str.length() == 0) ? CallId.e : new CallId(str);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CallId> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CallId a(Serializer serializer) {
            return new CallId(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CallId[i];
        }
    }

    public CallId(String str) {
        this.b = str;
        this.c = str.length() == 0;
        this.d = str.length() > 0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallId) && epx.f(this.b, ((CallId) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CallId(Serializer serializer, zcl zclVar) {
        this(r1);
        String H = serializer.H();
        if (H != null) {
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
