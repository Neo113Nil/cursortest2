package b9;

import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3098b;

    public /* synthetic */ c(d dVar, int i5) {
        this.f3097a = i5;
        this.f3098b = dVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        c9.b k6;
        c9.b i5;
        int i10;
        switch (this.f3097a) {
            case 0:
                this.f3098b.b();
                return;
            case 1:
                d dVar = this.f3098b;
                synchronized (d.f3099m) {
                    try {
                        h8.g gVar = dVar.f3100a;
                        gVar.a();
                        l1.a h10 = l1.a.h(gVar.f10401a);
                        try {
                            k6 = dVar.f3102c.k();
                            if (h10 != null) {
                                h10.A();
                            }
                        } catch (Throwable th2) {
                            if (h10 != null) {
                                h10.A();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i11 = k6.f3708b;
                    if (!(i11 == 5)) {
                        if (!(i11 == 3)) {
                            if (dVar.f3103d.a(k6)) {
                                i5 = dVar.c(k6);
                                dVar.f(i5);
                                dVar.m(k6, i5);
                                if (i5.f3708b == 4) {
                                    dVar.l(i5.f3707a);
                                }
                                i10 = i5.f3708b;
                                if (i10 != 5) {
                                    dVar.j(new f());
                                    return;
                                } else if (i10 == 2 || i10 == 1) {
                                    dVar.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    dVar.k(i5);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    i5 = dVar.i(k6);
                    dVar.f(i5);
                    dVar.m(k6, i5);
                    if (i5.f3708b == 4) {
                    }
                    i10 = i5.f3708b;
                    if (i10 != 5) {
                    }
                } catch (f e7) {
                    dVar.j(e7);
                    return;
                }
            default:
                this.f3098b.b();
                return;
        }
    }
}
