package sa;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;
import na.b;
import r3.e0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23393b;

    /* renamed from: c, reason: collision with root package name */
    public int f23394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f23395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f23396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f23397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f23398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23399h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, String str, String str2, String str3, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f23393b = i10;
        this.f23395d = bVar;
        this.f23396e = str;
        this.f23397f = str2;
        this.f23398g = str3;
        this.f23399h = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23393b) {
            case 0:
                return new a(this.f23395d, this.f23396e, this.f23397f, this.f23398g, this.f23399h, continuation, 0);
            default:
                return new a(this.f23395d, this.f23396e, this.f23397f, this.f23398g, this.f23399h, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23393b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r5 == r0) goto L32;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.f23393b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f23394c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f23394c = 1;
                    obj = this.f23395d.d(this.f23396e, this.f23397f, this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                this.f23394c = 2;
                Object k6 = ((e0) obj).k(this.f23399h, this.f23398g, this);
                if (k6 != aVar) {
                    return k6;
                }
                return aVar;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f23394c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f23394c = 1;
                    obj = this.f23395d.d(this.f23396e, this.f23397f, this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                this.f23394c = 2;
                Object l6 = ((e0) obj).l(this.f23399h, this.f23398g, this);
                if (l6 != aVar2) {
                    return l6;
                }
                return aVar2;
        }
    }
}
