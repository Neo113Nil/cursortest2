package t0;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f23727f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CancellationSignal cancellationSignal, int i5) {
        super(1);
        this.f23726e = i5;
        this.f23727f = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23726e) {
            case 0:
                this.f23727f.cancel();
                break;
            default:
                this.f23727f.cancel();
                break;
        }
        return Unit.f19194a;
    }
}
