package u4;

import b1.C2333B;
import b1.z;
import kotlin.jvm.internal.Intrinsics;
import r4.C6206b;
import r4.i;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6497c {

    /* renamed from: a, reason: collision with root package name */
    public static final C6497c f66095a = new C6497c();

    public static final C2333B a(i.b bVar) {
        if (bVar != null) {
            return new C2333B.b().p0(bVar.e()).n0(bVar.d()).W(bVar.b()).Q(bVar.a()).S(bVar.c()).J();
        }
        return null;
    }

    public static final z.g.a b(C6206b bufferConfig) {
        Intrinsics.checkNotNullParameter(bufferConfig, "bufferConfig");
        z.g.a aVar = new z.g.a();
        C6206b.C0887b h10 = bufferConfig.h();
        if (bufferConfig.h().a() >= 0) {
            aVar.g(h10.a());
        }
        if (bufferConfig.h().b() >= 0.0f) {
            aVar.h(h10.b());
        }
        if (bufferConfig.h().e() >= 0) {
            aVar.k(h10.e());
        }
        if (bufferConfig.h().c() >= 0) {
            aVar.i(h10.c());
        }
        if (bufferConfig.h().d() >= 0.0f) {
            aVar.j(h10.d());
        }
        return aVar;
    }
}
