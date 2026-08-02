package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: Flags.kt */
/* loaded from: classes18.dex */
public final class Flags extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Flags> CREATOR = new a();
    public long b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Flags> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Flags a(Serializer serializer) {
            return new Flags(serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Flags[i];
        }
    }

    public Flags() {
        this(0L, 1, null);
    }

    public final void Ab(long j, boolean z) {
        long j2 = this.b;
        this.b = z ? j | j2 : (~j) & j2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
    }

    public final boolean zb(long j) {
        return (j & this.b) != 0;
    }

    public Flags(long j) {
        this.b = j;
    }

    public /* synthetic */ Flags(long j, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j);
    }
}
