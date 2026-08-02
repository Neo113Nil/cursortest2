package com.squareup.moshi;

import com.squareup.moshi.y;

/* renamed from: com.squareup.moshi.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5974f<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private y.d<K, V> f60402a;

    public final y.d<K, V> a() {
        y.d<K, V> dVar = this.f60402a;
        if (dVar == null) {
            return null;
        }
        y.d<K, V> dVar2 = dVar.f60493a;
        dVar.f60493a = null;
        y.d<K, V> dVar3 = dVar.f60495c;
        while (true) {
            y.d<K, V> dVar4 = dVar2;
            dVar2 = dVar3;
            if (dVar2 == null) {
                this.f60402a = dVar4;
                return dVar;
            }
            dVar2.f60493a = dVar4;
            dVar3 = dVar2.f60494b;
        }
    }

    public final void b(y.d<K, V> dVar) {
        y.d<K, V> dVar2 = null;
        while (dVar != null) {
            dVar.f60493a = dVar2;
            dVar2 = dVar;
            dVar = dVar.f60494b;
        }
        this.f60402a = dVar2;
    }
}
