package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e6 {

    /* renamed from: c, reason: collision with root package name */
    public static final e6 f5030c = new e6();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5032b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final u5 f5031a = new u5(0);

    public final h6 a(Class cls) {
        h6 u10;
        Charset charset = n5.f5148a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f5032b;
        h6 h6Var = (h6) concurrentHashMap.get(cls);
        if (h6Var != null) {
            return h6Var;
        }
        u5 u5Var = this.f5031a;
        u5Var.getClass();
        e5 e5Var = i6.f5086a;
        g5.class.isAssignableFrom(cls);
        g6 b10 = ((u5) u5Var.f5267a).b(cls);
        if ((b10.f5063d & 2) == 2) {
            e5 e5Var2 = i6.f5086a;
            e5 e5Var3 = a5.f4910a;
            u10 = new b6(e5Var2, b10.f5060a);
        } else {
            int i5 = c6.f4953a;
            int i10 = r5.f5229a;
            e5 e5Var4 = i6.f5086a;
            e5 e5Var5 = b10.a() + (-1) != 1 ? a5.f4910a : null;
            int i11 = x5.f5359a;
            u10 = a6.u(b10, e5Var4, e5Var5);
        }
        h6 h6Var2 = (h6) concurrentHashMap.putIfAbsent(cls, u10);
        return h6Var2 != null ? h6Var2 : u10;
    }
}
