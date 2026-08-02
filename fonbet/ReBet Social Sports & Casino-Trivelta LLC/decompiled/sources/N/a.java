package N;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public Paint f7768a;

    /* renamed from: b, reason: collision with root package name */
    public int f7769b;

    public a(Paint internalPaint) {
        Intrinsics.checkNotNullParameter(internalPaint, "internalPaint");
        this.f7768a = internalPaint;
        this.f7769b = c.f7774a.a();
    }

    @Override // N.l
    public void a(long j10) {
        b.c(this.f7768a, j10);
    }

    @Override // N.l
    public void b(int i10) {
        b.e(this.f7768a, i10);
    }

    @Override // N.l
    public void c(float f10) {
        b.d(this.f7768a, f10);
    }

    public a() {
        this(b.b());
    }
}
