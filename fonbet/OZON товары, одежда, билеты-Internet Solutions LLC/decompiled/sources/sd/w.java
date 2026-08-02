package sd;

import Ld.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import sd.u;
import td.InterfaceC9839e;
import te.b;

/* loaded from: classes10.dex */
public final class w extends b.AbstractC2189b<InterfaceC9839e, u.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f98619a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M<u.a> f98620b;

    w(String str, M<u.a> m11) {
        this.f98619a = str;
        this.f98620b = m11;
    }

    @Override // te.b.d
    public final Object a() {
        u.a aVar = this.f98620b.f71787a;
        return aVar == null ? u.a.NOT_CONSIDERED : aVar;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [T, sd.u$a] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, sd.u$a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, sd.u$a] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, sd.u$a] */
    @Override // te.b.d
    public final boolean b(Object obj) {
        InterfaceC9839e javaClassDescriptor = (InterfaceC9839e) obj;
        Intrinsics.checkNotNullParameter(javaClassDescriptor, "javaClassDescriptor");
        String a11 = C.a(javaClassDescriptor, this.f98619a);
        int i11 = z.f98630h;
        boolean contains = z.d().contains(a11);
        M<u.a> m11 = this.f98620b;
        if (contains) {
            m11.f71787a = u.a.HIDDEN;
        } else if (z.g().contains(a11)) {
            m11.f71787a = u.a.VISIBLE;
        } else if (z.a().contains(a11)) {
            m11.f71787a = u.a.DEPRECATED_LIST_METHODS;
        } else if (z.b().contains(a11)) {
            m11.f71787a = u.a.DROP;
        }
        return m11.f71787a == null;
    }
}
