package com.vk.movika.sdk.base.logic.interactor;

import kotlin.LazyThreadSafetyMode;
import kotlin.random.XorWowRandom;
import xsna.arm0;
import xsna.msy;

/* loaded from: classes3.dex */
public final class o {
    public final boolean a;
    public final Object b;
    public boolean c;
    public final Object d;
    public final Object e;

    public o(XorWowRandom xorWowRandom, com.vk.ecomm.catalog.impl.geo.a aVar, boolean z) {
        this.a = z;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, new l(this));
        int i = 0;
        this.d = msy.a(lazyThreadSafetyMode, new m(i));
        this.e = msy.a(lazyThreadSafetyMode, new n(this, aVar, xorWowRandom, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r2 >= r1.doubleValue()) goto L13;
     */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k a(com.vk.movika.sdk.base.model.s sVar) {
        String str = sVar.a.b;
        if (str != null) {
            Double k = arm0.k(com.vk.movika.sdk.utils.e.a(str));
            Double valueOf = Double.valueOf(-1.0d);
            if (k == null) {
                k = valueOf;
            }
            double doubleValue = k.doubleValue();
            Double k2 = arm0.k(com.vk.movika.sdk.utils.e.a("3.3.0"));
            if (k2 != null) {
                valueOf = k2;
            }
        }
        if (!this.c && str == null) {
            this.c = true;
            if (com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
                com.vk.movika.sdk.utils.c.a(this, null);
            }
        }
        return (k) this.e.getValue();
    }
}
