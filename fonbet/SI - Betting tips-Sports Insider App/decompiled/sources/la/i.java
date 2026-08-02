package la;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f19487b;

    /* renamed from: c, reason: collision with root package name */
    public int f19488c;

    /* renamed from: d, reason: collision with root package name */
    public int f19489d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f19490e;

    /* renamed from: f, reason: collision with root package name */
    public int f19491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ha.d f19492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f19493h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ha.d dVar, m mVar, Continuation continuation) {
        super(2, continuation);
        this.f19492g = dVar;
        this.f19493h = mVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f19492g, this.f19493h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00eb, code lost:
    
        if (r12 != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r12.e(r10, r11) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int intValue;
        int intValue2;
        int i5;
        Integer num;
        int i10;
        int i11;
        Integer num2;
        y8.d dVar;
        Integer num3;
        int i12;
        int i13;
        Integer num4;
        Object A;
        Object obj2 = lf.a.f20034a;
        int i14 = this.f19491f;
        int i15 = 1;
        m mVar = this.f19493h;
        if (i14 == 0) {
            h8.b.B(obj);
            ha.d dVar2 = this.f19492g;
            Integer num5 = dVar2.f10460k;
            intValue = num5 != null ? num5.intValue() : 0;
            Integer num6 = dVar2.f10459i;
            intValue2 = num6 != null ? num6.intValue() : 0;
            i5 = dVar2.j;
            num = dVar2.f10461l;
            mVar.getClass();
            y8.d dVar3 = new y8.d();
            Integer num7 = new Integer(intValue);
            this.f19490e = num;
            this.f19487b = intValue;
            this.f19488c = intValue2;
            this.f19489d = i5;
            this.f19491f = 1;
        } else if (i14 == 1) {
            i5 = this.f19489d;
            intValue2 = this.f19488c;
            intValue = this.f19487b;
            num = this.f19490e;
            h8.b.B(obj);
        } else {
            if (i14 == 2) {
                i5 = this.f19489d;
                i10 = this.f19488c;
                i11 = this.f19487b;
                num2 = this.f19490e;
                h8.b.B(obj);
                mVar.getClass();
                dVar = new y8.d();
                num3 = new Integer(i5);
                this.f19490e = num2;
                this.f19487b = i11;
                this.f19488c = i10;
                this.f19489d = i5;
                this.f19491f = 3;
                if (dVar.o(num3, this) != obj2) {
                    i12 = i10;
                    i13 = i11;
                    num4 = num2;
                    mVar.getClass();
                    this.f19490e = null;
                    this.f19487b = i13;
                    this.f19488c = i12;
                    this.f19489d = i5;
                    this.f19491f = 4;
                    lg.e eVar = eg.m0.f9201a;
                    A = eg.c0.A(lg.d.f20063c, new cb.b(new y8.d(), num4, null, i15), this);
                    if (A != obj2) {
                    }
                }
                return obj2;
            }
            if (i14 != 3) {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                return Unit.f19194a;
            }
            i5 = this.f19489d;
            i12 = this.f19488c;
            i13 = this.f19487b;
            num4 = this.f19490e;
            h8.b.B(obj);
            mVar.getClass();
            this.f19490e = null;
            this.f19487b = i13;
            this.f19488c = i12;
            this.f19489d = i5;
            this.f19491f = 4;
            lg.e eVar2 = eg.m0.f9201a;
            A = eg.c0.A(lg.d.f20063c, new cb.b(new y8.d(), num4, null, i15), this);
            if (A != obj2) {
                A = Unit.f19194a;
            }
        }
        mVar.getClass();
        y8.d dVar4 = new y8.d();
        Integer num8 = new Integer(intValue2);
        this.f19490e = num;
        this.f19487b = intValue;
        this.f19488c = intValue2;
        this.f19489d = i5;
        this.f19491f = 2;
        if (dVar4.h(num8, this) != obj2) {
            i10 = intValue2;
            i11 = intValue;
            num2 = num;
            mVar.getClass();
            dVar = new y8.d();
            num3 = new Integer(i5);
            this.f19490e = num2;
            this.f19487b = i11;
            this.f19488c = i10;
            this.f19489d = i5;
            this.f19491f = 3;
            if (dVar.o(num3, this) != obj2) {
            }
        }
        return obj2;
    }
}
