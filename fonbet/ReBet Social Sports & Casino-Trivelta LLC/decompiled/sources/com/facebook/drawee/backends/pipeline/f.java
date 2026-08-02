package com.facebook.drawee.backends.pipeline;

import A7.k;
import C7.C1055t;
import W6.b;
import android.content.Context;
import android.net.Uri;
import b7.InterfaceC2406a;
import com.facebook.imagepipeline.request.b;
import java.util.Set;
import o7.InterfaceC5825g;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public class f extends W6.b {

    /* renamed from: s, reason: collision with root package name */
    public final C1055t f30385s;

    /* renamed from: t, reason: collision with root package name */
    public final h f30386t;

    /* renamed from: u, reason: collision with root package name */
    public D6.f f30387u;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$drawee$controller$AbstractDraweeControllerBuilder$CacheLevel;

        static {
            int[] iArr = new int[b.c.values().length];
            $SwitchMap$com$facebook$drawee$controller$AbstractDraweeControllerBuilder$CacheLevel = iArr;
            try {
                iArr[b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$drawee$controller$AbstractDraweeControllerBuilder$CacheLevel[b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$drawee$controller$AbstractDraweeControllerBuilder$CacheLevel[b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context, h hVar, C1055t c1055t, Set set, Set set2) {
        super(context, set, set2);
        this.f30385s = c1055t;
        this.f30386t = hVar;
    }

    public static b.c I(b.c cVar) {
        int i10 = a.$SwitchMap$com$facebook$drawee$controller$AbstractDraweeControllerBuilder$CacheLevel[cVar.ordinal()];
        if (i10 == 1) {
            return b.c.FULL_FETCH;
        }
        if (i10 == 2) {
            return b.c.DISK_CACHE;
        }
        if (i10 == 3) {
            return b.c.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    public final InterfaceC6713d J() {
        com.facebook.imagepipeline.request.b bVar = (com.facebook.imagepipeline.request.b) n();
        k r10 = this.f30385s.r();
        if (r10 == null || bVar == null) {
            return null;
        }
        return bVar.getPostprocessor() != null ? r10.c(bVar, f()) : r10.a(bVar, f());
    }

    @Override // W6.b
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public M6.c i(InterfaceC2406a interfaceC2406a, String str, com.facebook.imagepipeline.request.b bVar, Object obj, b.c cVar) {
        return this.f30385s.m(bVar, obj, I(cVar), L(interfaceC2406a), str);
    }

    public J7.e L(InterfaceC2406a interfaceC2406a) {
        if (interfaceC2406a instanceof e) {
            return ((e) interfaceC2406a).p0();
        }
        return null;
    }

    @Override // W6.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public e x() {
        if (N7.b.d()) {
            N7.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            InterfaceC2406a p10 = p();
            String e10 = W6.b.e();
            e c10 = p10 instanceof e ? (e) p10 : this.f30386t.c();
            c10.r0(y(c10, e10), e10, J(), f(), this.f30387u);
            c10.s0(null, this);
            if (N7.b.d()) {
                N7.b.b();
            }
            return c10;
        } catch (Throwable th2) {
            if (N7.b.d()) {
                N7.b.b();
            }
            throw th2;
        }
    }

    public f N(InterfaceC5825g interfaceC5825g) {
        return (f) r();
    }

    @Override // b7.InterfaceC2409d
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public f b(Uri uri) {
        return uri == null ? (f) super.E(null) : (f) super.E(com.facebook.imagepipeline.request.c.x(uri).P(B7.h.e()).a());
    }
}
