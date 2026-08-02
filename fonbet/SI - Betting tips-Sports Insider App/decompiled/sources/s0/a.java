package s0;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f22582a;

    /* renamed from: b, reason: collision with root package name */
    public final b f22583b;

    /* renamed from: c, reason: collision with root package name */
    public g0.d f22584c;

    /* renamed from: d, reason: collision with root package name */
    public g0.d f22585d;

    /* renamed from: e, reason: collision with root package name */
    public c f22586e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorDrawable f22587f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22588g;

    /* renamed from: h, reason: collision with root package name */
    public int f22589h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public a(int i5, int i10) {
        b bVar = new b();
        bVar.f22590a = -1;
        bVar.f22591b = -1;
        g0.d dVar = g0.d.f9675e;
        bVar.f22592c = dVar;
        bVar.f22593d = false;
        bVar.f22594e = null;
        bVar.f22595f = 0.0f;
        bVar.f22596g = 0.0f;
        bVar.f22597h = 1.0f;
        this.f22583b = bVar;
        this.f22584c = dVar;
        this.f22585d = dVar;
        this.f22586e = null;
        if (i5 != 1 && i5 != 2 && i5 != 4 && i5 != 8) {
            throw new IllegalArgumentException(c1.i(i5, "Unexpected side: "));
        }
        this.f22582a = i5;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f22587f = colorDrawable;
        this.f22589h = 0;
        this.f22588g = true;
        if (i10 != 0) {
            this.f22589h = i10;
            colorDrawable.setColor(i10);
            bVar.f22594e = colorDrawable;
            io.sentry.util.network.b bVar2 = bVar.f22598i;
            if (bVar2 != null) {
                ((View) bVar2.f17177c).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f6) {
        float f10 = f6 * 1.0f;
        b bVar = this.f22583b;
        if (bVar.f22597h != f10) {
            bVar.f22597h = f10;
            io.sentry.util.network.b bVar2 = bVar.f22598i;
            if (bVar2 != null) {
                ((View) bVar2.f17177c).setAlpha(f10);
            }
        }
    }

    public final void b(float f6) {
        float f10 = f6 * 1.0f;
        b bVar = this.f22583b;
        int i5 = this.f22582a;
        if (i5 == 1) {
            float f11 = (-(1.0f - f10)) * bVar.f22590a;
            if (bVar.f22595f != f11) {
                bVar.f22595f = f11;
                io.sentry.util.network.b bVar2 = bVar.f22598i;
                if (bVar2 != null) {
                    ((View) bVar2.f17177c).setTranslationX(f11);
                    return;
                }
                return;
            }
            return;
        }
        if (i5 == 2) {
            float f12 = (-(1.0f - f10)) * bVar.f22591b;
            if (bVar.f22596g != f12) {
                bVar.f22596g = f12;
                io.sentry.util.network.b bVar3 = bVar.f22598i;
                if (bVar3 != null) {
                    ((View) bVar3.f17177c).setTranslationY(f12);
                    return;
                }
                return;
            }
            return;
        }
        if (i5 == 4) {
            float f13 = (1.0f - f10) * bVar.f22590a;
            if (bVar.f22595f != f13) {
                bVar.f22595f = f13;
                io.sentry.util.network.b bVar4 = bVar.f22598i;
                if (bVar4 != null) {
                    ((View) bVar4.f17177c).setTranslationX(f13);
                    return;
                }
                return;
            }
            return;
        }
        if (i5 != 8) {
            return;
        }
        float f14 = (1.0f - f10) * bVar.f22591b;
        if (bVar.f22596g != f14) {
            bVar.f22596g = f14;
            io.sentry.util.network.b bVar5 = bVar.f22598i;
            if (bVar5 != null) {
                ((View) bVar5.f17177c).setTranslationY(f14);
            }
        }
    }
}
