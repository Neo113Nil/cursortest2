package defpackage;

import java.net.URL;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lgp extends map {
    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ Object read(e7n e7nVar) {
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        String f0 = e7nVar.f0();
        if (f0.equals("null")) {
            return null;
        }
        return new URL(f0);
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        URL url = (URL) obj;
        f7nVar.H(url == null ? null : url.toExternalForm());
    }
}
