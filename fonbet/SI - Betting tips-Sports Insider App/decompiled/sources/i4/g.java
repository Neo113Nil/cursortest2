package i4;

import android.content.Context;
import c4.m;
import c4.v;
import eg.z;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import q4.n;
import q4.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f10966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f10967c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q4.h f10968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f10970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.i f10971g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l4.a f10972h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f10973i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, q4.h hVar2, Object obj, n nVar, c4.i iVar, l4.a aVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.f10967c = hVar;
        this.f10968d = hVar2;
        this.f10969e = obj;
        this.f10970f = nVar;
        this.f10971g = iVar;
        this.f10972h = aVar;
        this.f10973i = lVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f10967c, this.f10968d, this.f10969e, this.f10970f, this.f10971g, this.f10972h, this.f10973i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f10966b;
        if (i5 == 0) {
            h8.b.B(obj);
            h hVar = this.f10967c;
            q4.h hVar2 = this.f10968d;
            Object obj2 = this.f10969e;
            n nVar = this.f10970f;
            c4.i iVar = this.f10971g;
            this.f10966b = 1;
            b10 = h.b(hVar, hVar2, obj2, nVar, iVar, this);
            if (b10 == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            b10 = obj;
        }
        a aVar2 = (a) b10;
        kh.h hVar3 = this.f10967c.f10975b;
        synchronized (hVar3) {
            try {
                v vVar = (v) ((WeakReference) hVar3.f19119b).get();
                if (vVar == null) {
                    hVar3.e();
                } else if (((Context) hVar3.f19122e) == null) {
                    Context context = vVar.f3628a.f3602a;
                    hVar3.f19122e = context;
                    context.registerComponentCallbacks((v4.b) hVar3.f19121d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean E = this.f10967c.f10977d.E(this.f10972h, this.f10968d, aVar2);
        m mVar = aVar2.f10923a;
        q4.h hVar4 = this.f10968d;
        d4.h hVar5 = aVar2.f10925c;
        l4.a aVar3 = this.f10972h;
        if (!E) {
            aVar3 = null;
        }
        l4.a aVar4 = aVar3;
        String str = aVar2.f10926d;
        boolean z5 = aVar2.f10924b;
        l lVar = this.f10973i;
        return new p(mVar, hVar4, hVar5, aVar4, str, z5, lVar != null && lVar.f10997g);
    }
}
