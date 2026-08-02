package fd;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import eg.g0;
import eg.y;
import eg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import la.c0;
import m3.f;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9567b;

    /* renamed from: c, reason: collision with root package name */
    public int f9568c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f9569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f9571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i5, boolean z5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f9567b = i10;
        this.f9569d = dVar;
        this.f9570e = i5;
        this.f9571f = z5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f9567b) {
            case 0:
                return new b(this.f9569d, this.f9570e, this.f9571f, continuation, 0);
            default:
                return new b(this.f9569d, this.f9570e, this.f9571f, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f9567b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        List list;
        switch (this.f9567b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f9568c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f9568c = 1;
                Object L0 = ((c0) y3.m(c0.class, null, 6)).L0(this.f9570e, this.f9571f, this);
                return L0 == aVar ? aVar : L0;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f9568c;
                Continuation continuation = null;
                try {
                    if (i10 == 0) {
                        h8.b.B(obj);
                        g0 e7 = eg.c0.e(MyApp.f6830c, new y("NewsUseCase"), new b(this.f9569d, this.f9570e, this.f9571f, continuation, 0), 2);
                        this.f9568c = 1;
                        obj = e7.m(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    list = (List) obj;
                } catch (CancellationException unused) {
                } catch (Exception ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                }
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(v.k(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(f.d((ia.a) it.next()));
                }
                return arrayList;
        }
    }
}
