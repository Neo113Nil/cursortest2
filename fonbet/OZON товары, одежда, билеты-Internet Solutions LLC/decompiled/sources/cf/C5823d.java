package cf;

import We.A;
import We.C4859a;
import We.E;
import We.O;
import We.v;
import cf.o;
import ef.C6357g;
import ef.InterfaceC6354d;
import gf.C6725a;
import gf.EnumC6726b;
import gf.t;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: cf.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5823d {

    /* renamed from: a, reason: collision with root package name */
    private o.a f57088a;

    /* renamed from: b, reason: collision with root package name */
    private o f57089b;

    /* renamed from: c, reason: collision with root package name */
    private int f57090c;

    /* renamed from: d, reason: collision with root package name */
    private int f57091d;

    /* renamed from: e, reason: collision with root package name */
    private int f57092e;

    /* renamed from: f, reason: collision with root package name */
    private O f57093f;

    /* renamed from: g, reason: collision with root package name */
    private final l f57094g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C4859a f57095h;

    /* renamed from: i, reason: collision with root package name */
    private final C5824e f57096i;

    /* renamed from: j, reason: collision with root package name */
    private final v f57097j;

    public C5823d(@NotNull l connectionPool, @NotNull C4859a address, @NotNull C5824e call, @NotNull v eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f57094g = connectionPool;
        this.f57095h = address;
        this.f57096i = call;
        this.f57097j = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final j b(int i11, int i12, int i13, int i14, boolean z11, boolean z12) throws IOException {
        List<O> a11;
        boolean z13;
        Socket r11;
        while (!this.f57096i.isCanceled()) {
            j h11 = this.f57096i.h();
            if (h11 != null) {
                synchronized (h11) {
                    try {
                        if (!h11.m() && e(h11.x().a().l())) {
                            r11 = null;
                            Unit unit = Unit.f71690a;
                        }
                        r11 = this.f57096i.r();
                        Unit unit2 = Unit.f71690a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (this.f57096i.h() != null) {
                    if (r11 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z13 = z12;
                    if (h11.r(z13)) {
                        return h11;
                    }
                    h11.w();
                    if (this.f57093f == null) {
                        o.a aVar = this.f57088a;
                        if (aVar != null ? aVar.b() : true) {
                            continue;
                        } else {
                            o oVar = this.f57089b;
                            if (!(oVar != null ? oVar.b() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (r11 != null) {
                        Ye.b.f(r11);
                    }
                    this.f57097j.connectionReleased(this.f57096i, h11);
                }
            }
            this.f57090c = 0;
            this.f57091d = 0;
            this.f57092e = 0;
            if (this.f57094g.a(this.f57095h, this.f57096i, null, false)) {
                h11 = this.f57096i.h();
                Intrinsics.f(h11);
                this.f57097j.connectionAcquired(this.f57096i, h11);
            } else {
                O o11 = this.f57093f;
                try {
                    if (o11 != null) {
                        this.f57093f = null;
                    } else {
                        o.a aVar2 = this.f57088a;
                        if (aVar2 == null || !aVar2.b()) {
                            o oVar2 = this.f57089b;
                            if (oVar2 == null) {
                                oVar2 = new o(this.f57095h, this.f57096i.g().s(), this.f57096i, this.f57097j);
                                this.f57089b = oVar2;
                            }
                            o.a c11 = oVar2.c();
                            this.f57088a = c11;
                            a11 = c11.a();
                            if (this.f57096i.isCanceled()) {
                                throw new IOException("Canceled");
                            }
                            if (this.f57094g.a(this.f57095h, this.f57096i, a11, false)) {
                                h11 = this.f57096i.h();
                                Intrinsics.f(h11);
                                this.f57097j.connectionAcquired(this.f57096i, h11);
                            } else {
                                o11 = c11.c();
                                j jVar = new j(this.f57094g, o11);
                                this.f57096i.t(jVar);
                                jVar.f(i11, i12, i13, i14, z11, this.f57096i, this.f57097j);
                                this.f57096i.t(null);
                                this.f57096i.g().s().a(jVar.x());
                                if (this.f57094g.a(this.f57095h, this.f57096i, a11, true)) {
                                    synchronized (jVar) {
                                        this.f57094g.f(jVar);
                                        this.f57096i.c(jVar);
                                        Unit unit3 = Unit.f71690a;
                                    }
                                    this.f57097j.connectionAcquired(this.f57096i, jVar);
                                    z13 = z12;
                                    h11 = jVar;
                                    if (h11.r(z13)) {
                                    }
                                } else {
                                    h11 = this.f57096i.h();
                                    Intrinsics.f(h11);
                                    this.f57093f = o11;
                                    Ye.b.f(jVar.A());
                                    this.f57097j.connectionAcquired(this.f57096i, h11);
                                }
                            }
                        } else {
                            o.a aVar3 = this.f57088a;
                            Intrinsics.f(aVar3);
                            o11 = aVar3.c();
                        }
                    }
                    jVar.f(i11, i12, i13, i14, z11, this.f57096i, this.f57097j);
                    this.f57096i.t(null);
                    this.f57096i.g().s().a(jVar.x());
                    if (this.f57094g.a(this.f57095h, this.f57096i, a11, true)) {
                    }
                } catch (Throwable th3) {
                    this.f57096i.t(null);
                    throw th3;
                }
                a11 = null;
                j jVar2 = new j(this.f57094g, o11);
                this.f57096i.t(jVar2);
            }
            z13 = z12;
            if (h11.r(z13)) {
            }
        }
        throw new IOException("Canceled");
    }

    @NotNull
    public final InterfaceC6354d a(@NotNull E client, @NotNull C6357g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
        } catch (n e11) {
            e = e11;
        } catch (IOException e12) {
            e = e12;
        }
        try {
            return b(chain.c(), chain.e(), chain.g(), client.y(), client.E(), !Intrinsics.d(chain.f().h(), "GET")).t(client, chain);
        } catch (n e13) {
            e = e13;
            n nVar = e;
            f(nVar.d());
            throw nVar;
        } catch (IOException e14) {
            e = e14;
            IOException iOException = e;
            f(iOException);
            throw new n(iOException);
        }
    }

    @NotNull
    public final C4859a c() {
        return this.f57095h;
    }

    public final boolean d() {
        o oVar;
        j h11;
        int i11 = this.f57090c;
        if (i11 == 0 && this.f57091d == 0 && this.f57092e == 0) {
            return false;
        }
        if (this.f57093f == null) {
            O o11 = null;
            if (i11 <= 1 && this.f57091d <= 1 && this.f57092e <= 0 && (h11 = this.f57096i.h()) != null) {
                synchronized (h11) {
                    if (h11.n() == 0) {
                        if (Ye.b.c(h11.x().a().l(), this.f57095h.l())) {
                            o11 = h11.x();
                        }
                    }
                }
            }
            if (o11 != null) {
                this.f57093f = o11;
                return true;
            }
            o.a aVar = this.f57088a;
            if ((aVar == null || !aVar.b()) && (oVar = this.f57089b) != null) {
                return oVar.b();
            }
        }
        return true;
    }

    public final boolean e(@NotNull A url) {
        Intrinsics.checkNotNullParameter(url, "url");
        A l11 = this.f57095h.l();
        return url.n() == l11.n() && Intrinsics.d(url.h(), l11.h());
    }

    public final void f(@NotNull IOException e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.f57093f = null;
        if ((e11 instanceof t) && ((t) e11).f64462a == EnumC6726b.REFUSED_STREAM) {
            this.f57090c++;
        } else if (e11 instanceof C6725a) {
            this.f57091d++;
        } else {
            this.f57092e++;
        }
    }
}
