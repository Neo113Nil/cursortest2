package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l6b extends CancellationException {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6b(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.a) {
            case 1:
                setStackTrace(rz8.i);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
