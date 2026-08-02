package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Map f29911a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f29912b = new HashMap();

    public l a(com.bumptech.glide.load.g gVar, boolean z10) {
        return (l) b(z10).get(gVar);
    }

    public final Map b(boolean z10) {
        return z10 ? this.f29912b : this.f29911a;
    }

    public void c(com.bumptech.glide.load.g gVar, l lVar) {
        b(lVar.p()).put(gVar, lVar);
    }

    public void d(com.bumptech.glide.load.g gVar, l lVar) {
        Map b10 = b(lVar.p());
        if (lVar.equals(b10.get(gVar))) {
            b10.remove(gVar);
        }
    }
}
