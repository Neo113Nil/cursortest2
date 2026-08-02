package com.vk.dto;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: CounterSettings.kt */
/* loaded from: classes18.dex */
public final class CounterSettings extends Serializer.StreamParcelableAdapter {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public static final a e = new a();
    private static final CounterSettings STUB = new CounterSettings(false, false, false);
    public static final Serializer.c<CounterSettings> CREATOR = new b();

    /* compiled from: CounterSettings.kt */
    public static final class a {
        public final CounterSettings getSTUB() {
            return CounterSettings.STUB;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CounterSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CounterSettings a(Serializer serializer) {
            return new CounterSettings(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CounterSettings[i];
        }
    }

    public CounterSettings(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CounterSettings)) {
            return false;
        }
        CounterSettings counterSettings = (CounterSettings) obj;
        return this.b == counterSettings.b && this.c == counterSettings.c && this.d == counterSettings.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterSettings(isMutedIncluded=");
        sb.append(this.b);
        sb.append(", isGroupDialogsIncluded=");
        sb.append(this.c);
        sb.append(", isChannelsIncluded=");
        return q0.a(sb, this.d, ')');
    }

    public CounterSettings(Serializer serializer, zcl zclVar) {
        this(serializer.m(), serializer.m(), serializer.m());
    }
}
