package com.vk.dto.masks;

import com.vk.core.serialize.Serializer;

/* compiled from: CachedMask.kt */
/* loaded from: classes18.dex */
public final class CachedMask extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CachedMask> CREATOR = new a();
    public final Mask b;
    public final int c;
    public final long d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CachedMask> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CachedMask a(Serializer serializer) {
            return new CachedMask((Mask) serializer.G(Mask.class.getClassLoader()), serializer.u(), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CachedMask[i];
        }
    }

    public CachedMask(Mask mask, int i, long j) {
        this.b = mask;
        this.c = i;
        this.d = j;
    }

    public final int Ab() {
        return this.c;
    }

    public final Mask Bb() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.S(this.c);
        serializer.Y(this.d);
    }

    public final long zb() {
        return this.d;
    }
}
