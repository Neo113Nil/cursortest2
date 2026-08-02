package h1;

import android.net.Uri;
import e1.AbstractC4134a;
import java.util.Map;

/* renamed from: h1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4402E implements InterfaceC4411g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4411g f47511a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4410f f47512b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47513c;

    /* renamed from: d, reason: collision with root package name */
    public long f47514d;

    public C4402E(InterfaceC4411g interfaceC4411g, InterfaceC4410f interfaceC4410f) {
        this.f47511a = (InterfaceC4411g) AbstractC4134a.e(interfaceC4411g);
        this.f47512b = (InterfaceC4410f) AbstractC4134a.e(interfaceC4410f);
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        long b10 = this.f47511a.b(c4418n);
        this.f47514d = b10;
        if (b10 == 0) {
            return 0L;
        }
        if (c4418n.f47560g == -1 && b10 != -1) {
            c4418n = c4418n.f(0L, b10);
        }
        this.f47513c = true;
        this.f47512b.b(c4418n);
        return this.f47514d;
    }

    @Override // h1.InterfaceC4411g
    public void c(InterfaceC4403F interfaceC4403F) {
        AbstractC4134a.e(interfaceC4403F);
        this.f47511a.c(interfaceC4403F);
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        try {
            this.f47511a.close();
        } finally {
            if (this.f47513c) {
                this.f47513c = false;
                this.f47512b.close();
            }
        }
    }

    @Override // h1.InterfaceC4411g
    public Map f() {
        return this.f47511a.f();
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        return this.f47511a.getUri();
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f47514d == 0) {
            return -1;
        }
        int read = this.f47511a.read(bArr, i10, i11);
        if (read > 0) {
            this.f47512b.write(bArr, i10, read);
            long j10 = this.f47514d;
            if (j10 != -1) {
                this.f47514d = j10 - read;
            }
        }
        return read;
    }
}
