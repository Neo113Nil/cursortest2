package defpackage;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ngp extends map {
    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        try {
            String f0 = e7nVar.f0();
            if (f0.equals("null")) {
                return null;
            }
            return new URI(f0);
        } catch (URISyntaxException e) {
            throw new o9p(16, e);
        }
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        URI uri = (URI) obj;
        f7nVar.H(uri == null ? null : uri.toASCIIString());
    }
}
