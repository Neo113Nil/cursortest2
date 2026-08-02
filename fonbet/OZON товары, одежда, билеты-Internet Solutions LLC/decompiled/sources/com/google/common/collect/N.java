package com.google.common.collect;

import com.google.common.collect.M;
import java.util.Map;

/* loaded from: classes.dex */
final class N extends M.b<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ M.c f59027a;

    N(M.c cVar) {
        this.f59027a = cVar;
    }

    @Override // com.google.common.collect.M.b
    public final <K, V> F<K, V> c() {
        Map b11 = this.f59027a.b();
        M.a aVar = new M.a();
        O o11 = new O(b11);
        o11.f59028f = aVar;
        return o11;
    }
}
