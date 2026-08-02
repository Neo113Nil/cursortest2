package qb;

import eg.z;
import f3.x;
import java.util.Iterator;
import java.util.List;
import k2.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.i;
import rb.e;
import rb.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fb.b f22092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f22093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(fb.b bVar, List list, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22091b = i5;
        this.f22092c = bVar;
        this.f22093d = list;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22091b) {
            case 0:
                return new c(this.f22092c, this.f22093d, continuation, 0);
            case 1:
                return new c(this.f22092c, this.f22093d, continuation, 1);
            case 2:
                return new c(this.f22092c, this.f22093d, continuation, 2);
            default:
                return new c(this.f22092c, this.f22093d, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22091b) {
        }
        return ((c) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f22091b;
        int i10 = 0;
        List<ka.a> ids = this.f22093d;
        int i11 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                g P0 = fb.b.P0();
                if (ids == null) {
                    P0.getClass();
                } else {
                    e eVar = P0.f22382a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(ids, "ids");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DELETE FROM support_table WHERE remoteId IN (");
                    m4.g.c(ids.size(), sb2);
                    sb2.append(")");
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    i10 = ((Number) x.n0(eVar.f22378a, false, true, new hb.e(sb3, ids, 2))).intValue();
                }
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                g P02 = fb.b.P0();
                if (ids == null) {
                    P02.getClass();
                    break;
                } else {
                    e eVar2 = P02.f22382a;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(ids, "ids");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("SELECT content FROM support_table WHERE remoteId IN (");
                    m4.g.c(ids.size(), sb4);
                    sb4.append(")");
                    String sb5 = sb4.toString();
                    Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
                    List list = (List) x.n0(eVar2.f22378a, true, false, new hb.e(sb5, ids, i11));
                    if (list != null) {
                        break;
                    }
                }
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                e eVar3 = fb.b.P0().f22382a;
                if (ids != null) {
                    for (ka.a aVar4 : ids) {
                        int i12 = aVar4.f18945a;
                        w wVar = eVar3.f22378a;
                        w wVar2 = eVar3.f22378a;
                        if (((Number) x.n0(wVar, true, false, new eb.b(i12, 15))).intValue() > 0) {
                            int i13 = aVar4.f18945a;
                            String str = aVar4.f18951g;
                            String str2 = aVar4.j;
                            x.n0(wVar2, false, true, new rb.c(str, aVar4.f18952h, aVar4.f18954k, str2, aVar4.f18946b, i13, 3));
                        } else {
                            x.n0(wVar2, false, true, new rb.c(aVar4.f18945a, aVar4.f18951g, aVar4.f18946b, aVar4.f18952h, aVar4.j, aVar4.f18954k, 0));
                        }
                    }
                }
                break;
            default:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                g P03 = fb.b.P0();
                P03.getClass();
                Intrinsics.checkNotNullParameter(ids, "list");
                Iterator it = ids.iterator();
                while (it.hasNext()) {
                    lc.c cVar = (lc.c) it.next();
                    e eVar4 = P03.f22382a;
                    int id2 = cVar.getId();
                    String question = cVar.getQuestion();
                    String answer = cVar.getAnswer();
                    eVar4.getClass();
                    Intrinsics.checkNotNullParameter(question, "question");
                    Intrinsics.checkNotNullParameter(answer, "answer");
                    x.n0(eVar4.f22378a, false, true, new pb.a(id2, question, answer, 4));
                }
                break;
        }
        return Unit.f19194a;
    }
}
