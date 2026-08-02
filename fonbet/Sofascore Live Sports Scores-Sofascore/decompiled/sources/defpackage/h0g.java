package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh0g;", "Ll0g;", "request_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0g implements l0g {
    public final /* synthetic */ oog a;

    public h0g(oog oogVar) {
        this.a = oogVar;
    }

    @Override // defpackage.vcd
    public final void onAdResponse(wcd wcdVar) {
        wcdVar.getClass();
        p2g p2gVar = w2g.b;
        this.a.resumeWith(wcdVar);
    }

    @Override // defpackage.l0g, defpackage.pcd
    public final void onError(qcd qcdVar) {
        qcdVar.getClass();
        p2g p2gVar = w2g.b;
        this.a.resumeWith(new u2g(qcdVar));
    }
}
