package defpackage;

import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d18 implements mja {
    public final boolean a;

    public d18(boolean z) {
        this.a = z;
    }

    @Override // defpackage.mja
    public final String a(Object obj, xvd xvdVar) {
        File file = (File) obj;
        if (!this.a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
