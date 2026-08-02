package df;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f8372b;

    public /* synthetic */ a(r rVar, int i5) {
        this.f8371a = i5;
        this.f8372b = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        switch (this.f8371a) {
            case 0:
                return r.b(this.f8372b, (LocationManager) obj);
            default:
                return r.a(this.f8372b, (LocationManager) obj);
        }
    }
}
