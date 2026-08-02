package w7;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements d, c, b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24982a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final int f24983b;

    /* renamed from: c, reason: collision with root package name */
    public final m f24984c;

    /* renamed from: d, reason: collision with root package name */
    public int f24985d;

    /* renamed from: e, reason: collision with root package name */
    public int f24986e;

    /* renamed from: f, reason: collision with root package name */
    public int f24987f;

    /* renamed from: g, reason: collision with root package name */
    public Exception f24988g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24989h;

    public i(int i5, m mVar) {
        this.f24983b = i5;
        this.f24984c = mVar;
    }

    public final void a() {
        int i5 = this.f24985d + this.f24986e + this.f24987f;
        int i10 = this.f24983b;
        if (i5 == i10) {
            Exception exc = this.f24988g;
            m mVar = this.f24984c;
            if (exc == null) {
                if (this.f24989h) {
                    mVar.o();
                    return;
                } else {
                    mVar.m(null);
                    return;
                }
            }
            int i11 = this.f24986e;
            int length = String.valueOf(i11).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 8 + 24);
            sb2.append(i11);
            sb2.append(" out of ");
            sb2.append(i10);
            sb2.append(" underlying tasks failed");
            mVar.n(new ExecutionException(sb2.toString(), this.f24988g));
        }
    }

    @Override // w7.b
    public final void b() {
        synchronized (this.f24982a) {
            this.f24987f++;
            this.f24989h = true;
            a();
        }
    }

    @Override // w7.c
    public final void c(Exception exc) {
        synchronized (this.f24982a) {
            this.f24986e++;
            this.f24988g = exc;
            a();
        }
    }

    @Override // w7.d
    public final void onSuccess(Object obj) {
        synchronized (this.f24982a) {
            this.f24985d++;
            a();
        }
    }
}
