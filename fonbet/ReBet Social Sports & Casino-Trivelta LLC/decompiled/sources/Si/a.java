package Si;

import java.io.IOException;

/* loaded from: classes5.dex */
public class a extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f10827a;

    public a(String str, Throwable th2) {
        super(str);
        this.f10827a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10827a;
    }
}
