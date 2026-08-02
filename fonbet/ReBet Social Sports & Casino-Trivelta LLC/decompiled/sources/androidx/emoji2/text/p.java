package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class p {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f19803d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f19804a;

    /* renamed from: b, reason: collision with root package name */
    public final n f19805b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f19806c = 0;

    public p(n nVar, int i10) {
        this.f19805b = nVar;
        this.f19804a = i10;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f19805b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        canvas.drawText(this.f19805b.c(), this.f19804a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f19806c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final P0.a g() {
        ThreadLocal threadLocal = f19803d;
        P0.a aVar = (P0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new P0.a();
            threadLocal.set(aVar);
        }
        this.f19805b.d().j(aVar, this.f19804a);
        return aVar;
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f19806c & 4) > 0;
    }

    public void l(boolean z10) {
        int d10 = d();
        if (z10) {
            this.f19806c = d10 | 4;
        } else {
            this.f19806c = d10;
        }
    }

    public void m(boolean z10) {
        int i10 = this.f19806c & 4;
        this.f19806c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
