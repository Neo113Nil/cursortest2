package b6;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f3071a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.g f3072b = new w7.g();

    /* renamed from: c, reason: collision with root package name */
    public final int f3073c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f3074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3075e;

    public n(int i5, int i10, Bundle bundle, int i11) {
        this.f3075e = i11;
        this.f3071a = i5;
        this.f3073c = i10;
        this.f3074d = bundle;
    }

    public final boolean a() {
        switch (this.f3075e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(o oVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + oVar.toString());
        }
        this.f3072b.a(oVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f3072b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f3073c + " id=" + this.f3071a + " oneWay=" + a() + "}";
    }
}
