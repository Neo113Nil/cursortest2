package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: c, reason: collision with root package name */
    public static final a4 f5397c = new a4();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5399b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final r3 f5398a = new r3();

    public final d4 a(Class cls) {
        d4 u10;
        Charset charset = l3.f5497a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f5399b;
        d4 d4Var = (d4) concurrentHashMap.get(cls);
        if (d4Var != null) {
            return d4Var;
        }
        r3 r3Var = this.f5398a;
        r3Var.getClass();
        e3 e3Var = e4.f5441a;
        g3.class.isAssignableFrom(cls);
        c4 a7 = ((r3) r3Var.f5558a).a(cls);
        if ((a7.f5419d & 2) == 2) {
            e3 e3Var2 = e4.f5441a;
            e3 e3Var3 = b3.f5401a;
            u10 = new x3(e3Var2, a7.f5416a);
        } else {
            int i5 = y3.f5657a;
            int i10 = q3.f5553a;
            e3 e3Var4 = e4.f5441a;
            e3 e3Var5 = a7.a() + (-1) != 1 ? b3.f5401a : null;
            int i11 = t3.f5589a;
            u10 = w3.u(a7, e3Var4, e3Var5);
        }
        d4 d4Var2 = (d4) concurrentHashMap.putIfAbsent(cls, u10);
        return d4Var2 == null ? u10 : d4Var2;
    }
}
