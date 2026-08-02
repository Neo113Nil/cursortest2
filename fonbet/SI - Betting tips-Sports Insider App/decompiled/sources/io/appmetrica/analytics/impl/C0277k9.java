package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277k9 {

    /* renamed from: a, reason: collision with root package name */
    public final We f14106a;

    /* renamed from: b, reason: collision with root package name */
    public final xo f14107b;

    /* renamed from: c, reason: collision with root package name */
    public final Rk f14108c;

    /* renamed from: d, reason: collision with root package name */
    public final L6 f14109d;

    /* renamed from: e, reason: collision with root package name */
    public final H8 f14110e;

    /* renamed from: f, reason: collision with root package name */
    public final Jk f14111f;

    /* renamed from: g, reason: collision with root package name */
    public final C0242j0 f14112g;

    /* renamed from: h, reason: collision with root package name */
    public final Z4 f14113h;

    /* renamed from: i, reason: collision with root package name */
    public final TimeProvider f14114i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public long f14115k;

    /* renamed from: l, reason: collision with root package name */
    public int f14116l;

    public C0277k9(We we2, xo xoVar, Rk rk, L6 l6, C0242j0 c0242j0, H8 h82, Jk jk, int i5, Z4 z42, SystemTimeProvider systemTimeProvider) {
        this.f14106a = we2;
        this.f14107b = xoVar;
        this.f14108c = rk;
        this.f14109d = l6;
        this.f14112g = c0242j0;
        this.f14110e = h82;
        this.f14111f = jk;
        this.j = i5;
        this.f14114i = systemTimeProvider;
        this.f14113h = z42;
        this.f14115k = we2.i();
        this.f14116l = we2.h();
    }

    public final void a(P5 p52, Tk tk) {
        long optLong;
        Map map = p52.f12741p;
        Jk jk = this.f14111f;
        jk.getClass();
        map.putAll(new HashMap(jk.f12445b));
        p52.c(this.f14106a.j());
        p52.f12740o = Integer.valueOf(this.f14107b.b());
        C0217i0 a7 = this.f14112g.a();
        H8 h82 = this.f14110e;
        h82.getClass();
        G8 g82 = (G8) h82.f12307b.a(EnumC0047bb.a(p52.f12730d));
        L6 l6 = this.f14109d;
        C0650z8 a10 = g82.a(p52);
        int i5 = p52.f12730d;
        xo xoVar = this.f14107b;
        C0198h7 c0198h7 = new C0198h7(l6.f12514g, tk, i5, xoVar, a10, (C0285kh) l6.f12515h.f13151k.a(), a7);
        Long valueOf = Long.valueOf(tk.f12936a);
        Vk vk = tk.f12939d;
        Long valueOf2 = Long.valueOf(tk.f12937b);
        EnumC0047bb a11 = EnumC0047bb.a(c0198h7.f13881h.f12730d);
        long j = 0;
        if (!AbstractC0576w9.f14831g.contains(EnumC0047bb.a(i5))) {
            synchronized (xoVar) {
                JSONObject a12 = xoVar.f14934a.a();
                optLong = a12.optLong("global_number", 0L);
                xoVar.f14934a.a(a12.put("global_number", optLong + 1));
            }
            j = optLong;
        }
        l6.a(l6.f12518l.fromModel(new C0120e7(valueOf, vk, valueOf2, a11, Long.valueOf(j), Long.valueOf(tk.f12938c), c0198h7.a())));
        this.f14113h.f13258a.h();
    }
}
