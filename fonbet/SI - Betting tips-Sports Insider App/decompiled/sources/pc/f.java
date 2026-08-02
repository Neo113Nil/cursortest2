package pc;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.w;
import eg.c0;
import eg.m0;
import eg.y;
import eg.z;
import ic.h0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public w f21623b;

    /* renamed from: c, reason: collision with root package name */
    public u f21624c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f21625d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21626e;

    /* renamed from: f, reason: collision with root package name */
    public int f21627f;

    /* renamed from: g, reason: collision with root package name */
    public int f21628g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f21629h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f21630i;
    public final /* synthetic */ boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f21631k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u uVar, boolean z5, long j, Continuation continuation) {
        super(2, continuation);
        this.f21630i = uVar;
        this.j = z5;
        this.f21631k = j;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f21630i, this.j, this.f21631k, continuation);
        fVar.f21629h = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b6  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z5;
        w wVar;
        boolean z7;
        w wVar2;
        int i5;
        Iterator it;
        z zVar = (z) this.f21629h;
        lf.a aVar = lf.a.f20034a;
        int i10 = this.f21628g;
        int i11 = 2;
        int i12 = 1;
        u uVar = this.f21630i;
        Continuation continuation = null;
        if (i10 == 0) {
            h8.b.B(obj);
            boolean d10 = u.n().d();
            this.f21629h = zVar;
            this.f21626e = d10;
            this.f21628g = 1;
            Object v5 = u.v("subs", d10, this);
            if (v5 != aVar) {
                z5 = d10;
                obj = v5;
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                z7 = this.f21626e;
                wVar2 = this.f21623b;
                h8.b.B(obj);
                wVar = wVar2;
                z5 = z7;
                i5 = 0;
                it = wVar.f4111b.iterator();
                while (it.hasNext()) {
                }
                return Unit.f19194a;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i5 = this.f21627f;
            z5 = this.f21626e;
            it = this.f21625d;
            uVar = this.f21624c;
            h8.b.B(obj);
            while (it.hasNext()) {
                h0 w10 = uVar.w((Purchase) it.next());
                this.f21629h = null;
                this.f21623b = null;
                this.f21624c = uVar;
                this.f21625d = it;
                this.f21626e = z5;
                this.f21627f = i5;
                this.f21628g = 3;
                lg.e eVar = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new oe.j(uVar, w10, continuation, i11), this);
                if (A != lf.a.f20034a) {
                    A = Unit.f19194a;
                }
                if (A == aVar) {
                    return aVar;
                }
            }
            return Unit.f19194a;
        }
        z5 = this.f21626e;
        h8.b.B(obj);
        wVar = (w) obj;
        if (wVar.f4110a.f4037a != 0) {
            return Unit.f19194a;
        }
        lg.e eVar2 = m0.f9201a;
        c4.w wVar3 = uVar.f21721w;
        eVar2.getClass();
        c0.e(zVar, kotlin.coroutines.e.c(eVar2, wVar3).t(new y("OnAllOwnedSubs")), new oe.j(uVar, wVar, continuation, i12), 2);
        if (this.j && !wVar.f4111b.isEmpty()) {
            long j = this.f21631k;
            if (j > 0) {
                this.f21629h = null;
                this.f21623b = wVar;
                this.f21626e = z5;
                this.f21628g = 2;
                if (c0.j(j, this) != aVar) {
                    z7 = z5;
                    wVar2 = wVar;
                    wVar = wVar2;
                    z5 = z7;
                }
                return aVar;
            }
            i5 = 0;
            it = wVar.f4111b.iterator();
            while (it.hasNext()) {
            }
        }
        return Unit.f19194a;
    }
}
