package q7;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;
import n7.C8448a;
import ru.ozon.app.android.R;
import v7.b;

/* renamed from: q7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8995a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f81732f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f81733a;

    /* renamed from: b, reason: collision with root package name */
    private final int f81734b;

    /* renamed from: c, reason: collision with root package name */
    private final int f81735c;

    /* renamed from: d, reason: collision with root package name */
    private final int f81736d;

    /* renamed from: e, reason: collision with root package name */
    private final float f81737e;

    public C8995a(@NonNull Context context) {
        TypedValue a11 = b.a(R.attr.elevationOverlayEnabled, context);
        boolean z11 = (a11 == null || a11.type != 18 || a11.data == 0) ? false : true;
        int a12 = C8448a.a(R.attr.elevationOverlayColor, 0, context);
        int a13 = C8448a.a(R.attr.elevationOverlayAccentColor, 0, context);
        int a14 = C8448a.a(R.attr.colorSurface, 0, context);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f81733a = z11;
        this.f81734b = a12;
        this.f81735c = a13;
        this.f81736d = a14;
        this.f81737e = f7;
    }

    public final int a(float f7, int i11) {
        int i12;
        if (!this.f81733a || c.f(i11, 255) != this.f81736d) {
            return i11;
        }
        float min = (this.f81737e <= 0.0f || f7 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f7 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i11);
        int d11 = C8448a.d(min, c.f(i11, 255), this.f81734b);
        if (min > 0.0f && (i12 = this.f81735c) != 0) {
            d11 = c.d(c.f(i12, f81732f), d11);
        }
        return c.f(d11, alpha);
    }

    public final int b(float f7) {
        return a(f7, this.f81736d);
    }

    public final boolean c() {
        return this.f81733a;
    }
}
