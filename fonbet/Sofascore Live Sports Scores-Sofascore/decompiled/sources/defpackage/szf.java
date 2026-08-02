package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class szf extends yzf {
    public final /* synthetic */ zdc c;
    public final /* synthetic */ File d;

    public szf(zdc zdcVar, File file) {
        this.c = zdcVar;
        this.d = file;
    }

    @Override // defpackage.yzf
    public final long contentLength() {
        return this.d.length();
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        return this.c;
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        File file = this.d;
        file.getClass();
        xk0 xk0Var = new xk0(new FileInputStream(file), pij.d);
        try {
            k62Var.M0(xk0Var);
            xk0Var.close();
        } finally {
        }
    }
}
