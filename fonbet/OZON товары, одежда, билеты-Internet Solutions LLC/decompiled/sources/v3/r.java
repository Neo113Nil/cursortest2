package v3;

import Am.C2438a;
import j3.C7272n;

/* loaded from: classes.dex */
public final class r extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f101939a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f101940b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(int i11, int i12, int i13, int i14, int i15, C7272n c7272n, boolean z11, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder a11 = C2438a.a("AudioTrack init failed ", i11, " Config(", ", ", i12);
        Ek.a.f(i13, i14, ", ", ", ", a11);
        a11.append(i15);
        a11.append(") ");
        a11.append(c7272n);
        a11.append(z11 ? " (recoverable)" : "");
        this.f101939a = i11;
        this.f101940b = z11;
    }
}
