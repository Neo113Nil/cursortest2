package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import xsna.ae;
import xsna.alr;
import xsna.ce;
import xsna.dlo;
import xsna.dvk;
import xsna.eot;
import xsna.fc6;
import xsna.ghs;
import xsna.gtw;
import xsna.hfg0;
import xsna.kpa0;
import xsna.kqj;
import xsna.lhs;
import xsna.sex0;
import xsna.yhn0;
import xsna.zuk;

/* loaded from: classes12.dex */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> {
    public static final a m = new a();
    public static final NullPointerException n = new NullPointerException("No image request was specified!");
    public static final AtomicLong o = new AtomicLong();
    public final Context a;
    public Object b;
    public REQUEST c;
    public REQUEST d;
    public REQUEST[] e;
    public boolean f;
    public yhn0<zuk<IMAGE>> g;
    public kqj<? super INFO> h;
    public boolean i;
    public boolean j;
    public boolean k;
    public dlo l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CacheLevel {
        private static final /* synthetic */ CacheLevel[] $VALUES;
        public static final CacheLevel BITMAP_MEMORY_CACHE;
        public static final CacheLevel DISK_CACHE;
        public static final CacheLevel FULL_FETCH;

        static {
            CacheLevel cacheLevel = new CacheLevel("FULL_FETCH", 0);
            FULL_FETCH = cacheLevel;
            CacheLevel cacheLevel2 = new CacheLevel("DISK_CACHE", 1);
            DISK_CACHE = cacheLevel2;
            CacheLevel cacheLevel3 = new CacheLevel("BITMAP_MEMORY_CACHE", 2);
            BITMAP_MEMORY_CACHE = cacheLevel3;
            $VALUES = new CacheLevel[]{cacheLevel, cacheLevel2, cacheLevel3};
        }

        public CacheLevel() {
            throw null;
        }

        public static CacheLevel valueOf(String str) {
            return (CacheLevel) Enum.valueOf(CacheLevel.class, str);
        }

        public static CacheLevel[] values() {
            return (CacheLevel[]) $VALUES.clone();
        }
    }

    public class a extends fc6<Object> {
        @Override // xsna.fc6, xsna.kqj
        public final void e(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    public AbstractDraweeControllerBuilder(Context context) {
        this.a = context;
        d();
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ce b() {
        REQUEST request;
        REQUEST[] requestArr = this.e;
        boolean z = true;
        if (!(requestArr == null || this.c == null)) {
            throw new IllegalStateException("Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        }
        if (this.g != null && (requestArr != null || this.c != null || this.d != null)) {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        }
        if (this.c == null && requestArr == null && (request = this.d) != null) {
            this.c = request;
            this.d = null;
        }
        if (lhs.d()) {
            lhs.a("AbstractDraweeControllerBuilder#buildController");
        }
        kpa0 e = e();
        e.o = this.k;
        boolean z2 = this.i;
        if (z2) {
            if (e.d == null) {
                hfg0 hfg0Var = new hfg0();
                hfg0Var.a = false;
                hfg0Var.b = 4;
                hfg0Var.c = 0;
                e.d = hfg0Var;
            }
            e.d.a = z2;
            if (e.e == null) {
                eot eotVar = new eot(this.a);
                e.e = eotVar;
                eotVar.a = e;
            }
        }
        kqj<? super INFO> kqjVar = this.h;
        if (kqjVar != null) {
            e.a(kqjVar);
        }
        if (this.j) {
            e.a(m);
        }
        if (lhs.d()) {
            lhs.b();
        }
        return e;
    }

    public abstract ae c(dlo dloVar, String str, Object obj, Object obj2, CacheLevel cacheLevel);

    public final void d() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = true;
        this.h = null;
        this.i = false;
        this.j = false;
        this.l = null;
    }

    public abstract kpa0 e();

    public final yhn0 f(kpa0 kpa0Var, String str) {
        AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO> abstractDraweeControllerBuilder;
        kpa0 kpa0Var2;
        String str2;
        yhn0 yhn0Var;
        yhn0<zuk<IMAGE>> yhn0Var2 = this.g;
        if (yhn0Var2 != null) {
            return yhn0Var2;
        }
        REQUEST request = this.c;
        if (request != null) {
            yhn0Var = new com.facebook.drawee.controller.a(this, kpa0Var, str, request, this.b, CacheLevel.FULL_FETCH);
            str2 = str;
            kpa0Var2 = kpa0Var;
            abstractDraweeControllerBuilder = this;
        } else {
            abstractDraweeControllerBuilder = this;
            kpa0Var2 = kpa0Var;
            str2 = str;
            REQUEST[] requestArr = abstractDraweeControllerBuilder.e;
            if (requestArr != null) {
                boolean z = abstractDraweeControllerBuilder.f;
                ArrayList arrayList = new ArrayList(requestArr.length * 2);
                if (z) {
                    for (REQUEST request2 : requestArr) {
                        arrayList.add(new com.facebook.drawee.controller.a(abstractDraweeControllerBuilder, kpa0Var2, str2, request2, abstractDraweeControllerBuilder.b, CacheLevel.BITMAP_MEMORY_CACHE));
                    }
                }
                for (REQUEST request3 : requestArr) {
                    arrayList.add(new com.facebook.drawee.controller.a(abstractDraweeControllerBuilder, kpa0Var2, str2, request3, abstractDraweeControllerBuilder.b, CacheLevel.FULL_FETCH));
                }
                yhn0Var = new alr(arrayList);
            } else {
                yhn0Var = null;
            }
        }
        if (yhn0Var != null && abstractDraweeControllerBuilder.d != null) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(yhn0Var);
            arrayList2.add(new com.facebook.drawee.controller.a(abstractDraweeControllerBuilder, kpa0Var2, str2, abstractDraweeControllerBuilder.d, abstractDraweeControllerBuilder.b, CacheLevel.FULL_FETCH));
            yhn0Var = new gtw(arrayList2);
        }
        return yhn0Var == null ? new dvk() : yhn0Var;
    }

    public final void g() {
        d();
    }

    public final void h(boolean z) {
        this.j = z;
    }

    public final void i(Object obj) {
        this.b = obj;
    }

    public final void j(ghs ghsVar) {
        this.h = ghsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(Object[] objArr) {
        sex0.b("No requests specified!", objArr == 0 || objArr.length > 0);
        this.e = objArr;
        this.f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(ImageRequest imageRequest) {
        this.c = imageRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(ImageRequest imageRequest) {
        this.d = imageRequest;
    }

    public final AbstractDraweeControllerBuilder n(dlo dloVar) {
        this.l = dloVar;
        return this;
    }

    public final void o(dlo dloVar) {
        this.l = dloVar;
    }

    public final void p() {
        this.k = true;
    }
}
