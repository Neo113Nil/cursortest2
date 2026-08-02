package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ex1 implements e1g, d3a {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public ex1(dx1 dx1Var, Bitmap bitmap) {
        w1a.m(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        w1a.m(dx1Var, "BitmapPool must not be null");
        this.c = dx1Var;
    }

    @Override // defpackage.e1g
    public final int a() {
        switch (this.a) {
            case 0:
                return kik.r((Bitmap) this.b);
            default:
                return ((e1g) this.c).a();
        }
    }

    @Override // defpackage.d3a
    public final void b() {
        switch (this.a) {
            case 0:
                ((Bitmap) this.b).prepareToDraw();
                break;
            default:
                e1g e1gVar = (e1g) this.c;
                if (e1gVar instanceof d3a) {
                    ((d3a) e1gVar).b();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.e1g
    public final void c() {
        switch (this.a) {
            case 0:
                ((dx1) this.c).i((Bitmap) this.b);
                break;
            default:
                ((e1g) this.c).c();
                break;
        }
    }

    @Override // defpackage.e1g
    public final Class d() {
        switch (this.a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // defpackage.e1g
    public final Object get() {
        switch (this.a) {
            case 0:
                return (Bitmap) this.b;
            default:
                return new BitmapDrawable((Resources) this.b, (Bitmap) ((e1g) this.c).get());
        }
    }

    public ex1(Resources resources, e1g e1gVar) {
        w1a.m(resources, "Argument must not be null");
        this.b = resources;
        w1a.m(e1gVar, "Argument must not be null");
        this.c = e1gVar;
    }
}
