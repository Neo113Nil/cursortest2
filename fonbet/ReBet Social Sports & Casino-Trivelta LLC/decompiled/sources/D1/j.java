package D1;

import D1.k;
import D1.m;
import ai.verisoul.sdk.Core;
import b1.C2338G;
import h1.C4415k;
import h1.C4424t;
import h1.C4428x;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f2443a;

    public j() {
        this(-1);
    }

    @Override // D1.k
    public k.b a(k.a aVar, k.c cVar) {
        if (!e(cVar.f2452c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new k.b(1, Core.sensorDataTimeout);
        }
        if (aVar.a(2)) {
            return new k.b(2, 60000L);
        }
        return null;
    }

    @Override // D1.k
    public long b(k.c cVar) {
        IOException iOException = cVar.f2452c;
        if ((iOException instanceof C2338G) || (iOException instanceof FileNotFoundException) || (iOException instanceof C4424t) || (iOException instanceof m.h) || C4415k.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f2453d - 1) * 1000, 5000);
    }

    @Override // D1.k
    public int c(int i10) {
        int i11 = this.f2443a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    public boolean e(IOException iOException) {
        if (!(iOException instanceof C4428x)) {
            return false;
        }
        int i10 = ((C4428x) iOException).f47621d;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    public j(int i10) {
        this.f2443a = i10;
    }
}
