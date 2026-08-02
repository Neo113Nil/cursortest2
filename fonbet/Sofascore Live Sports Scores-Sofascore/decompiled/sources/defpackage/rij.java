package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rij extends CancellationException {
    public final String a;
    public final int b;

    public rij(String str, int i) {
        super(str);
        this.a = str;
        this.b = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(this.a);
        sb.append(", ");
        return wv8.j(sb, this.b, ')');
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
