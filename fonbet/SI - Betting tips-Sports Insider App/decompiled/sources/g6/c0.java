package g6;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 extends q {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f9799g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e eVar, int i5, Bundle bundle) {
        super(eVar, i5, bundle);
        this.f9799g = eVar;
    }

    @Override // g6.q
    public final boolean a() {
        this.f9799g.j.g(ConnectionResult.f4439f);
        return true;
    }

    @Override // g6.q
    public final void b(ConnectionResult connectionResult) {
        e eVar = this.f9799g;
        eVar.getClass();
        eVar.j.g(connectionResult);
        System.currentTimeMillis();
    }
}
