package s7;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f22808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k1 f22809e;

    public /* synthetic */ i1(k1 k1Var, String str, String str2, String str3, int i5) {
        this.f22805a = i5;
        this.f22806b = str;
        this.f22807c = str2;
        this.f22808d = str3;
        this.f22809e = k1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f22805a) {
            case 0:
                k1 k1Var = this.f22809e;
                k1Var.f22848a.B();
                j jVar = k1Var.f22848a.f22989c;
                r3.U(jVar);
                return jVar.f0(this.f22806b, this.f22807c, this.f22808d);
            case 1:
                k1 k1Var2 = this.f22809e;
                k1Var2.f22848a.B();
                j jVar2 = k1Var2.f22848a.f22989c;
                r3.U(jVar2);
                return jVar2.f0(this.f22806b, this.f22807c, this.f22808d);
            case 2:
                k1 k1Var3 = this.f22809e;
                k1Var3.f22848a.B();
                j jVar3 = k1Var3.f22848a.f22989c;
                r3.U(jVar3);
                return jVar3.j0(this.f22806b, this.f22807c, this.f22808d);
            default:
                k1 k1Var4 = this.f22809e;
                k1Var4.f22848a.B();
                j jVar4 = k1Var4.f22848a.f22989c;
                r3.U(jVar4);
                return jVar4.j0(this.f22806b, this.f22807c, this.f22808d);
        }
    }
}
