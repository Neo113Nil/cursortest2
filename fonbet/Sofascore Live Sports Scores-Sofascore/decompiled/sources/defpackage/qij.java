package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qij extends CancellationException implements ct3 {
    public final transient yda a;

    public qij(String str, yda ydaVar) {
        super(str);
        this.a = ydaVar;
    }

    @Override // defpackage.ct3
    public final Throwable d() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        qij qijVar = new qij(message, this.a);
        qijVar.initCause(this);
        return qijVar;
    }
}
