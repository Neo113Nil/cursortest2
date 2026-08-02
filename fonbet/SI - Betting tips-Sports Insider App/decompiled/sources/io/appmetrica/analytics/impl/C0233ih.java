package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ih, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233ih extends M5 {

    /* renamed from: b, reason: collision with root package name */
    public final X4 f13947b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0208hh f13948c;

    /* renamed from: d, reason: collision with root package name */
    public final C3 f13949d;

    public C0233ih(@NonNull X4 x42, @NonNull InterfaceC0208hh interfaceC0208hh) {
        this(x42, interfaceC0208hh, new C3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.M5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0285kh load(@NonNull L5 l52) {
        C0285kh c0285kh = (C0285kh) super.load(l52);
        c0285kh.f14133m = ((C0156fh) l52.componentArguments).f13737a;
        c0285kh.f14137r = this.f13947b.f13159t.a();
        c0285kh.f14142w = this.f13947b.q.a();
        C0156fh c0156fh = (C0156fh) l52.componentArguments;
        c0285kh.f14125d = c0156fh.f13738b;
        c0285kh.f14126e = c0156fh.f13739c;
        c0285kh.f14127f = c0156fh.f13740d;
        c0285kh.f14130i = c0156fh.f13741e;
        c0285kh.f14128g = c0156fh.f13742f;
        c0285kh.f14129h = c0156fh.f13743g;
        Boolean valueOf = Boolean.valueOf(c0156fh.f13744h);
        InterfaceC0208hh interfaceC0208hh = this.f13948c;
        c0285kh.j = valueOf;
        c0285kh.f14131k = interfaceC0208hh;
        C0156fh c0156fh2 = (C0156fh) l52.componentArguments;
        c0285kh.f14141v = c0156fh2.j;
        C0161fm c0161fm = l52.f12506a;
        C0297l4 c0297l4 = c0161fm.f13765n;
        c0285kh.f14134n = c0297l4.f14164a;
        C0606xe c0606xe = c0161fm.f13769s;
        if (c0606xe != null) {
            c0285kh.f14138s = c0606xe.f14918a;
            c0285kh.f14139t = c0606xe.f14919b;
        }
        c0285kh.f14135o = c0297l4.f14165b;
        c0285kh.q = c0161fm.f13757e;
        c0285kh.f14136p = c0161fm.f13762k;
        C3 c32 = this.f13949d;
        Map<String, String> map = c0156fh2.f13745i;
        C0645z3 f6 = C0353na.I.f();
        c32.getClass();
        c0285kh.f14140u = C3.a(map, c0161fm, f6);
        c0285kh.f14143x = this.f13947b.f13161v.f14454e.keySet();
        return c0285kh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C0285kh(this.f13947b);
    }

    public C0233ih(X4 x42, InterfaceC0208hh interfaceC0208hh, C3 c32) {
        super(x42.getContext(), x42.b().c());
        this.f13947b = x42;
        this.f13948c = interfaceC0208hh;
        this.f13949d = c32;
    }

    @NonNull
    public final C0285kh a() {
        return new C0285kh(this.f13947b);
    }
}
