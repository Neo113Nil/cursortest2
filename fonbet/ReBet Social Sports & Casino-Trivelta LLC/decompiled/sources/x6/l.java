package x6;

import java.io.IOException;
import w6.InterfaceC6711b;
import w6.InterfaceC6712c;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public class l implements InterfaceC6711b {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f67941i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static l f67942j;

    /* renamed from: k, reason: collision with root package name */
    public static int f67943k;

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC6713d f67944a;

    /* renamed from: b, reason: collision with root package name */
    public String f67945b;

    /* renamed from: c, reason: collision with root package name */
    public long f67946c;

    /* renamed from: d, reason: collision with root package name */
    public long f67947d;

    /* renamed from: e, reason: collision with root package name */
    public long f67948e;

    /* renamed from: f, reason: collision with root package name */
    public IOException f67949f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC6712c.a f67950g;

    /* renamed from: h, reason: collision with root package name */
    public l f67951h;

    public static l a() {
        synchronized (f67941i) {
            try {
                l lVar = f67942j;
                if (lVar == null) {
                    return new l();
                }
                f67942j = lVar.f67951h;
                lVar.f67951h = null;
                f67943k--;
                return lVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        synchronized (f67941i) {
            try {
                if (f67943k < 5) {
                    c();
                    f67943k++;
                    l lVar = f67942j;
                    if (lVar != null) {
                        this.f67951h = lVar;
                    }
                    f67942j = this;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        this.f67944a = null;
        this.f67945b = null;
        this.f67946c = 0L;
        this.f67947d = 0L;
        this.f67948e = 0L;
        this.f67949f = null;
        this.f67950g = null;
    }

    public l d(InterfaceC6713d interfaceC6713d) {
        this.f67944a = interfaceC6713d;
        return this;
    }

    public l e(long j10) {
        this.f67947d = j10;
        return this;
    }

    public l f(long j10) {
        this.f67948e = j10;
        return this;
    }

    public l g(InterfaceC6712c.a aVar) {
        this.f67950g = aVar;
        return this;
    }

    public l h(IOException iOException) {
        this.f67949f = iOException;
        return this;
    }

    public l i(long j10) {
        this.f67946c = j10;
        return this;
    }

    public l j(String str) {
        this.f67945b = str;
        return this;
    }
}
