package j$.util.stream;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class q1 extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f18045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Predicate f18046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(v1 v1Var, Predicate predicate) {
        super(v1Var);
        this.f18045c = v1Var;
        this.f18046d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f18097a) {
            return;
        }
        boolean test = this.f18046d.test(obj);
        v1 v1Var = this.f18045c;
        if (test == v1Var.f18108a) {
            this.f18097a = true;
            this.f18098b = v1Var.f18109b;
        }
    }
}
