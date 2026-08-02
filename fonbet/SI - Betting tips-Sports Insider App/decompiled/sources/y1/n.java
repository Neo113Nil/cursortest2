package y1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f25594b;

    public /* synthetic */ n(r rVar, int i5) {
        this.f25593a = i5;
        this.f25594b = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r0.b() > 1) goto L12;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z5;
        switch (this.f25593a) {
            case 0:
                r rVar = this.f25594b;
                ge.d dVar = rVar.f25629f;
                if (rVar.f25630g) {
                    z5 = true;
                    break;
                }
                z5 = false;
                dVar.f(z5);
                return Unit.f19194a;
            default:
                r rVar2 = this.f25594b;
                return new g0(rVar2.f25624a, rVar2.f25625b.f3001r);
        }
    }
}
