package pc;

import com.android.billingclient.api.a0;
import eg.z;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21635b;

    /* renamed from: c, reason: collision with root package name */
    public int f21636c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f21637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f21638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f21639f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(List list, u uVar, String str, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21635b = i5;
        this.f21637d = list;
        this.f21638e = uVar;
        this.f21639f = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21635b) {
            case 0:
                return new h(this.f21637d, this.f21638e, this.f21639f, continuation, 0);
            default:
                return new h(this.f21637d, this.f21638e, this.f21639f, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21635b) {
        }
        return ((h) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f21635b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f21636c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    List list = this.f21637d;
                    if (list.isEmpty()) {
                        return null;
                    }
                    yb.i n9 = u.n();
                    this.f21636c = 1;
                    obj = n9.j(this.f21639f, list, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return (com.android.billingclient.api.s) obj;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f21636c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    List list2 = this.f21637d;
                    if (list2.isEmpty()) {
                        return null;
                    }
                    yb.i n10 = u.n();
                    this.f21636c = 1;
                    obj = n10.k(this.f21639f, list2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return (a0) obj;
        }
    }
}
