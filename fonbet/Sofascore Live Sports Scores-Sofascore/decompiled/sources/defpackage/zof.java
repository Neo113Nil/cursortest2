package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zof extends a implements cu3 {
    public final /* synthetic */ bpf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zof(bpf bpfVar) {
        super(bu3.a);
        this.b = bpfVar;
    }

    @Override // defpackage.cu3
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        zid zidVar = this.b.d;
        if (zidVar == null || zidVar.b > 6 || th == null) {
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        stringWriter.toString();
    }
}
