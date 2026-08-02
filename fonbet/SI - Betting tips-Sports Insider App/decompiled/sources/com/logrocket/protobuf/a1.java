package com.logrocket.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f6664c = new a1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6666b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final n0 f6665a = new n0(0);

    public final g1 a(Class cls) {
        g1 s8;
        Class cls2;
        Charset charset = d0.f6681a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f6666b;
        g1 g1Var = (g1) concurrentHashMap.get(cls);
        if (g1Var != null) {
            return g1Var;
        }
        n0 n0Var = this.f6665a;
        n0Var.getClass();
        Class cls3 = h1.f6725a;
        if (!z.class.isAssignableFrom(cls) && (cls2 = h1.f6725a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        c1 a7 = ((m0) n0Var.f6757a).a(cls);
        int i5 = a7.f6677d;
        a aVar = a7.f6674a;
        if ((i5 & 2) == 2) {
            if (z.class.isAssignableFrom(cls)) {
                s8 = new v0(h1.f6727c, t.f6786a, aVar);
            } else {
                p1 p1Var = h1.f6726b;
                s sVar = t.f6787b;
                if (sVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                s8 = new v0(p1Var, sVar, aVar);
            }
        } else if (z.class.isAssignableFrom(cls)) {
            s8 = (a7.f6677d & 1) == 1 ? u0.s(a7, x0.f6818b, l0.f6746b, h1.f6727c, t.f6786a, r0.f6783b) : u0.s(a7, x0.f6818b, l0.f6746b, h1.f6727c, null, r0.f6783b);
        } else if ((a7.f6677d & 1) == 1) {
            w0 w0Var = x0.f6817a;
            j0 j0Var = l0.f6745a;
            p1 p1Var2 = h1.f6726b;
            s sVar2 = t.f6787b;
            if (sVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            s8 = u0.s(a7, w0Var, j0Var, p1Var2, sVar2, r0.f6782a);
        } else {
            s8 = u0.s(a7, x0.f6817a, l0.f6745a, h1.f6726b, null, r0.f6782a);
        }
        g1 g1Var2 = (g1) concurrentHashMap.putIfAbsent(cls, s8);
        return g1Var2 != null ? g1Var2 : s8;
    }
}
