package v7;

import a10.AbstractC4920h;
import android.graphics.Typeface;

/* renamed from: v7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10266a extends AbstractC4920h {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f102449a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2224a f102450b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f102451c;

    /* renamed from: v7.a$a, reason: collision with other inner class name */
    public interface InterfaceC2224a {
        void a(Typeface typeface);
    }

    public C10266a(InterfaceC2224a interfaceC2224a, Typeface typeface) {
        this.f102449a = typeface;
        this.f102450b = interfaceC2224a;
    }

    @Override // a10.AbstractC4920h
    public final void a(int i11) {
        if (this.f102451c) {
            return;
        }
        this.f102450b.a(this.f102449a);
    }

    @Override // a10.AbstractC4920h
    public final void b(Typeface typeface, boolean z11) {
        if (this.f102451c) {
            return;
        }
        this.f102450b.a(typeface);
    }

    public final void c() {
        this.f102451c = true;
    }
}
