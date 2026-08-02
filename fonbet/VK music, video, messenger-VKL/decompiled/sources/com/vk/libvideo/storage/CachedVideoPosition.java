package com.vk.libvideo.storage;

import com.vk.core.serialize.Serializer;

/* compiled from: CachedVideoPosition.kt */
/* loaded from: classes3.dex */
public final class CachedVideoPosition extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CachedVideoPosition> CREATOR = new a();
    public final String b;
    public final long c;
    public final long d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CachedVideoPosition> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CachedVideoPosition a(Serializer serializer) {
            return new CachedVideoPosition(serializer.H(), serializer.w(), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CachedVideoPosition[i];
        }
    }

    public CachedVideoPosition(String str, long j, long j2) {
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final long Ab() {
        return this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.Y(this.c);
        serializer.Y(this.d);
    }

    public final long getTimestamp() {
        return this.d;
    }

    public final String zb() {
        return this.b;
    }
}
