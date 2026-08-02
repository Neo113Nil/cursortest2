package e3;

import androidx.work.Worker;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Worker f8550b;

    public /* synthetic */ n0(Worker worker, int i5) {
        this.f8549a = i5;
        this.f8550b = worker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8549a) {
            case 0:
                return this.f8550b.c();
            default:
                this.f8550b.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }
}
