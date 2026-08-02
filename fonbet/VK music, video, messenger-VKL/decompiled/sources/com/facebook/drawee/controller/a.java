package com.facebook.drawee.controller;

import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import xsna.cq70;
import xsna.dlo;
import xsna.yhn0;
import xsna.zuk;

/* compiled from: AbstractDraweeControllerBuilder.java */
/* loaded from: classes12.dex */
public final class a implements yhn0<zuk<Object>> {
    public final /* synthetic */ dlo a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ AbstractDraweeControllerBuilder.CacheLevel e;
    public final /* synthetic */ AbstractDraweeControllerBuilder f;

    public a(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, dlo dloVar, String str, Object obj, Object obj2, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        this.f = abstractDraweeControllerBuilder;
        this.a = dloVar;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = cacheLevel;
    }

    @Override // xsna.yhn0
    public final zuk<Object> get() {
        return this.f.c(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        cq70.a b = cq70.b(this);
        b.d(this.c.toString(), "request");
        return b.toString();
    }
}
