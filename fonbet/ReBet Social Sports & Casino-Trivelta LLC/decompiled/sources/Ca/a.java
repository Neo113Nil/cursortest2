package Ca;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f1539a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0036a f1540b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1541c;

    /* renamed from: Ca.a$a, reason: collision with other inner class name */
    public interface InterfaceC0036a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0036a interfaceC0036a, Typeface typeface) {
        this.f1539a = typeface;
        this.f1540b = interfaceC0036a;
    }

    @Override // Ca.g
    public void a(int i10) {
        d(this.f1539a);
    }

    @Override // Ca.g
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f1541c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f1541c) {
            return;
        }
        this.f1540b.a(typeface);
    }
}
