package com.vk.dto.common;

import com.vk.core.serialize.Serializer;

/* compiled from: ClassifiedJob.kt */
/* loaded from: classes18.dex */
public final class Availability extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Availability> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Availability> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Availability a(Serializer serializer) {
            return new Availability(serializer.m(), serializer.m(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Availability[i];
        }
    }

    public Availability(boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }
}
