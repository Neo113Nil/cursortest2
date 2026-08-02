package kh;

import okio.AsyncTimeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o extends AsyncTimeout {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f19137a;

    public o(p pVar) {
        this.f19137a = pVar;
    }

    @Override // okio.AsyncTimeout
    public final void timedOut() {
        this.f19137a.cancel();
    }
}
