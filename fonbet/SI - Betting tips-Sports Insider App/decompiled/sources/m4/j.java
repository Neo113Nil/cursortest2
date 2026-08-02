package m4;

import android.content.Context;
import c4.b0;
import c4.v;
import gf.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements f4.g {

    /* renamed from: a, reason: collision with root package name */
    public final t f20381a;

    /* renamed from: b, reason: collision with root package name */
    public final t f20382b;

    /* renamed from: c, reason: collision with root package name */
    public final x5.h f20383c;

    public j(Function0 function0) {
        id.a aVar = new id.a(12);
        i iVar = i.f20380a;
        this.f20381a = gf.k.b(function0);
        this.f20382b = gf.k.b(aVar);
        x5.h hVar = new x5.h();
        hVar.f25409a = iVar;
        hVar.f25410b = n4.b.f20854a;
        this.f20383c = hVar;
    }

    @Override // f4.g
    public final f4.h a(Object obj, q4.n nVar, v vVar) {
        b0 b0Var = (b0) obj;
        if (!Intrinsics.areEqual(b0Var.f3571c, "http") && !Intrinsics.areEqual(b0Var.f3571c, "https")) {
            return null;
        }
        String str = b0Var.f3569a;
        t tVar = this.f20381a;
        t b10 = gf.k.b(new a2.q(29, vVar));
        t tVar2 = this.f20382b;
        x5.h hVar = this.f20383c;
        Context context = nVar.f22007a;
        Object obj2 = hVar.f25410b;
        n4.b bVar = n4.b.f20854a;
        if (obj2 == bVar) {
            synchronized (hVar) {
                obj2 = hVar.f25410b;
                if (obj2 == bVar) {
                    Function1 function1 = (Function1) hVar.f25409a;
                    Intrinsics.checkNotNull(function1);
                    Object invoke = function1.invoke(context);
                    hVar.f25410b = invoke;
                    hVar.f25409a = null;
                    obj2 = invoke;
                }
            }
        }
        return new o(str, nVar, tVar, b10, tVar2, (e) obj2);
    }
}
