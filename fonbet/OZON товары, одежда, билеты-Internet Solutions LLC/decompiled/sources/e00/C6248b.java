package e00;

import S0.M;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Le00/b;", "LS0/M;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e00.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6248b implements M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J f61734a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G f61735b;

    public C6248b(J j11, G g10) {
        this.f61734a = j11;
        this.f61735b = g10;
    }

    @Override // S0.M
    public void dispose() {
        this.f61734a.getLifecycle().e(this.f61735b);
    }
}
