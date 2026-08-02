package h1;

import java.io.IOException;

/* renamed from: h1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4415k extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f47548a;

    public C4415k(int i10) {
        this.f47548a = i10;
    }

    public static boolean a(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof C4415k) && ((C4415k) iOException2).f47548a == 2008) {
                return true;
            }
        }
        return false;
    }

    public C4415k(Throwable th2, int i10) {
        super(th2);
        this.f47548a = i10;
    }

    public C4415k(String str, int i10) {
        super(str);
        this.f47548a = i10;
    }

    public C4415k(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f47548a = i10;
    }
}
