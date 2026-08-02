package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ozn extends TimeoutException {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozn(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    setStackTrace(new StackTraceElement[0]);
                    return this;
                default:
                    setStackTrace(new StackTraceElement[0]);
                    return this;
            }
        }
    }
}
