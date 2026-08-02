package v3;

import oi.q;
import oi.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24409a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f24410b;

    /* renamed from: c, reason: collision with root package name */
    public final b f24411c;

    public d(q qVar) {
        r7.a aVar;
        this.f24410b = qVar != null ? qVar.code() : -1;
        if (qVar != null) {
            aVar = new r7.a(15);
            aVar.f22318b = qVar.response();
            qVar.response();
        } else {
            aVar = null;
        }
        this.f24411c = aVar;
    }

    @Override // v3.c, v3.e
    public final b getHttpException() {
        switch (this.f24409a) {
            case 0:
                return (r7.a) this.f24411c;
            default:
                return this.f24411c;
        }
    }

    @Override // v3.c, v3.e
    public final int getStatusCode() {
        switch (this.f24409a) {
        }
        return this.f24410b;
    }

    public d(b bVar) {
        s0 response;
        this.f24410b = (bVar == null || (response = bVar.getResponse()) == null) ? -1 : response.f21334a.f10276d;
        this.f24411c = bVar;
    }
}
