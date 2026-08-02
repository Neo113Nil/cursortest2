package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import kotlin.coroutines.d;
import xsna.wzs;
import xsna.zcl;

/* compiled from: CoroutineOpportunity.kt */
/* loaded from: classes14.dex */
public final class CoroutineOpportunity implements d.b {
    public static final Key Key = new Key(null);
    private final ByteString value;

    /* compiled from: CoroutineOpportunity.kt */
    public static final class Key implements d.c<CoroutineOpportunity> {
        public /* synthetic */ Key(zcl zclVar) {
            this();
        }

        private Key() {
        }
    }

    public CoroutineOpportunity(ByteString byteString) {
        this.value = byteString;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public d.c<?> getKey() {
        return Key;
    }

    public final ByteString getValue() {
        return this.value;
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return d.a.a(this, dVar);
    }
}
