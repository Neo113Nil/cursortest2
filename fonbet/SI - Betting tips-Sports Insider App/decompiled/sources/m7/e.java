package m7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.y3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends e6.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w7.g f20455g;

    public e(Boolean bool, w7.g gVar) {
        this.f20454f = bool;
        this.f20455g = gVar;
    }

    @Override // e6.g
    public final void l(Status status) {
        y3.y(status, this.f20454f, this.f20455g);
    }
}
