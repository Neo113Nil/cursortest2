package va;

import Ca.b;
import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.AbstractC2074d;
import ia.c;
import sa.AbstractC6344a;

/* renamed from: va.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6680a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f67128f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f67129a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67130b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67131c;

    /* renamed from: d, reason: collision with root package name */
    public final int f67132d;

    /* renamed from: e, reason: collision with root package name */
    public final float f67133e;

    public C6680a(Context context) {
        this(b.b(context, c.f48270y, false), AbstractC6344a.b(context, c.f48268x, 0), AbstractC6344a.b(context, c.f48266w, 0), AbstractC6344a.b(context, c.f48260t, 0), context.getResources().getDisplayMetrics().density);
    }

    public float a(float f10) {
        if (this.f67133e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float a10 = a(f10);
        int alpha = Color.alpha(i10);
        int j10 = AbstractC6344a.j(AbstractC2074d.k(i10, 255), this.f67130b, a10);
        if (a10 > 0.0f && (i11 = this.f67131c) != 0) {
            j10 = AbstractC6344a.i(j10, AbstractC2074d.k(i11, f67128f));
        }
        return AbstractC2074d.k(j10, alpha);
    }

    public int c(int i10, float f10) {
        return (this.f67129a && f(i10)) ? b(i10, f10) : i10;
    }

    public int d(float f10) {
        return c(this.f67132d, f10);
    }

    public boolean e() {
        return this.f67129a;
    }

    public final boolean f(int i10) {
        return AbstractC2074d.k(i10, 255) == this.f67132d;
    }

    public C6680a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f67129a = z10;
        this.f67130b = i10;
        this.f67131c = i11;
        this.f67132d = i12;
        this.f67133e = f10;
    }
}
