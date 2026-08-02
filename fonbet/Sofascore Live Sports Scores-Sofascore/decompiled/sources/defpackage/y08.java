package defpackage;

import android.webkit.MimeTypeMap;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y08 implements ez7 {
    public final File a;

    public y08(File file) {
        this.a = file;
    }

    @Override // defpackage.ez7
    public final Object a(rq3 rq3Var) {
        String str = uae.b;
        File file = this.a;
        return new nwh(new c18(tnf.k(file), s18.a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(d28.h(file)), 3);
    }
}
