package v;

import v.U0;

/* loaded from: classes8.dex */
public final /* synthetic */ class T0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f101078a;

    public /* synthetic */ T0(U0 u02) {
        this.f101078a = u02;
    }

    public final void a() {
        U0 u02 = this.f101078a;
        synchronized (u02.f101084a) {
            try {
                if (u02.f101092i == U0.b.OPENED) {
                    u02.t(u02.f101089f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
