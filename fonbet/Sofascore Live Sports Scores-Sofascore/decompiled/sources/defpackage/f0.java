package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class f0 extends CancellationException {
    public final transient Object a;

    public f0(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.a = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
