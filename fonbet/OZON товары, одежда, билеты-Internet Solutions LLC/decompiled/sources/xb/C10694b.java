package xb;

import Bb.g;
import Bb.h;
import Bb.i;
import Sc.r;
import Sc.s;
import We.A;
import We.E;
import We.G;
import We.InterfaceC4865g;
import We.J;
import We.L;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import yb.C10878a;

@e(c = "com.vk.push.core.network.data.source.MasterHostApi$getHostList$2", f = "MasterHostApi.kt", l = {104, 105}, m = "invokeSuspend")
/* renamed from: xb.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10694b extends j implements Function2<M, d<? super r<? extends List<? extends Za.a>>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    L f105258d;

    /* renamed from: e, reason: collision with root package name */
    int f105259e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<String> f105260f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10695c f105261g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10694b(List<String> list, C10695c c10695c, d<? super C10694b> dVar) {
        super(2, dVar);
        this.f105260f = list;
        this.f105261g = c10695c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new C10694b(this.f105260f, this.f105261g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super r<? extends List<? extends Za.a>>> dVar) {
        return ((C10694b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009a A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:8:0x0092, B:10:0x009a, B:14:0x00ae, B:16:0x00b4, B:17:0x00bf, B:20:0x001e, B:21:0x0079, B:26:0x0070), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:8:0x0092, B:10:0x009a, B:14:0x00ae, B:16:0x00b4, B:17:0x00bf, B:20:0x001e, B:21:0x0079, B:26:0x0070), top: B:2:0x0006 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Za.c cVar;
        E e11;
        L l11;
        String str;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105259e;
        try {
        } catch (Exception e12) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(e12);
        }
        if (i11 == 0) {
            s.b(obj);
            String jSONObject = new JSONObject().put("packages", new JSONArray((Collection) this.f105260f)).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           …              .toString()");
            J a12 = h.a(jSONObject);
            C10695c c10695c = this.f105261g;
            cVar = c10695c.f105263b;
            A.a a13 = Bb.e.a(cVar);
            a13.c("v1/multihost/list");
            A e13 = a13.e();
            G.a aVar2 = new G.a();
            aVar2.j(e13);
            aVar2.g(a12);
            G b11 = aVar2.b();
            e11 = c10695c.f105262a;
            InterfaceC4865g a14 = e11.a(b11);
            this.f105259e = 1;
            obj = Bb.c.a(a14, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l11 = this.f105258d;
                s.b(obj);
                str = (String) obj;
                if (!i.a(str)) {
                    yb.b bVar = new yb.b(i.b(str).toString());
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(bVar);
                } else if (l11.v()) {
                    a11 = g.a(Bb.a.a(str));
                    r.Companion companion3 = r.INSTANCE;
                } else {
                    C10878a c10878a = new C10878a(l11.w(), l11.m());
                    r.Companion companion4 = r.INSTANCE;
                    a11 = s.a(c10878a);
                }
                return r.a(a11);
            }
            s.b(obj);
        }
        L l12 = (L) obj;
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b bVar2 = He.b.f10879b;
        Bb.b bVar3 = new Bb.b(l12, null);
        this.f105258d = l12;
        this.f105259e = 2;
        Object f7 = C10727i.f(bVar2, bVar3, this);
        if (f7 != aVar) {
            l11 = l12;
            obj = f7;
            str = (String) obj;
            if (!i.a(str)) {
            }
            return r.a(a11);
        }
        return aVar;
    }
}
