package com.vk.newsfeed.impl.discover.repository;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.j5g;
import xsna.zcl;

/* compiled from: TemporaryCache.kt */
/* loaded from: classes.dex */
public final class TemporaryCache extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<TemporaryCache> CREATOR = new a();
    public final HashSet<String> b;
    public final AtomicBoolean c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<TemporaryCache> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TemporaryCache a(Serializer serializer) {
            ArrayList<String> h = serializer.h();
            return new TemporaryCache(h != null ? j5g.M0(j5g.V(h)) : new HashSet());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TemporaryCache[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemporaryCache() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.l0(j5g.O0(this.b));
    }

    public TemporaryCache(HashSet<String> hashSet) {
        this.b = hashSet;
        this.c = new AtomicBoolean(false);
    }

    public /* synthetic */ TemporaryCache(HashSet hashSet, int i, zcl zclVar) {
        this((i & 1) != 0 ? new HashSet() : hashSet);
    }
}
