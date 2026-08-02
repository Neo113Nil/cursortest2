package Ph;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class f1 extends CancellationException implements F {

    /* renamed from: a, reason: collision with root package name */
    public final transient C0 f9085a;

    public f1(String str, C0 c02) {
        super(str);
        this.f9085a = c02;
    }

    @Override // Ph.F
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        f1 f1Var = new f1(message, this.f9085a);
        f1Var.initCause(this);
        return f1Var;
    }

    public f1(String str) {
        this(str, null);
    }
}
