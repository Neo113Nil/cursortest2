package defpackage;

import java.io.FileDescriptor;
import java.io.FileInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vzf extends yzf {
    public final /* synthetic */ zdc c;
    public final /* synthetic */ FileDescriptor d;

    public vzf(FileDescriptor fileDescriptor, zdc zdcVar) {
        this.c = zdcVar;
        this.d = fileDescriptor;
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        return this.c;
    }

    @Override // defpackage.yzf
    public final boolean isOneShot() {
        return true;
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        FileInputStream fileInputStream = new FileInputStream(this.d);
        try {
            k62Var.u().M0(f6a.I(fileInputStream));
            fileInputStream.close();
        } finally {
        }
    }
}
