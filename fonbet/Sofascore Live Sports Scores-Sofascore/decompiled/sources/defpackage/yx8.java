package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yx8 implements e1g, d3a {
    public final Drawable a;
    public final /* synthetic */ int b;

    public yx8(Drawable drawable, int i) {
        this.b = i;
        w1a.m(drawable, "Argument must not be null");
        this.a = drawable;
    }

    @Override // defpackage.e1g
    public final int a() {
        int i = this.b;
        Drawable drawable = this.a;
        switch (i) {
            case 0:
                dy8 dy8Var = (dy8) ((xx8) drawable).a.b;
                k9i k9iVar = dy8Var.a;
                return (k9iVar.j.length * 4) + k9iVar.d.limit() + k9iVar.i.length + dy8Var.o;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // defpackage.d3a
    public void b() {
        int i = this.b;
        Drawable drawable = this.a;
        switch (i) {
            case 0:
                ((dy8) ((xx8) drawable).a.b).m.prepareToDraw();
                break;
            default:
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof xx8) {
                        ((dy8) ((xx8) drawable).a.b).m.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.e1g
    public final void c() {
        kn4 kn4Var;
        kn4 kn4Var2;
        kn4 kn4Var3;
        switch (this.b) {
            case 0:
                xx8 xx8Var = (xx8) this.a;
                xx8Var.stop();
                xx8Var.d = true;
                dy8 dy8Var = (dy8) xx8Var.a.b;
                n0g n0gVar = dy8Var.d;
                dy8Var.c.clear();
                Bitmap bitmap = dy8Var.m;
                if (bitmap != null) {
                    dy8Var.e.i(bitmap);
                    dy8Var.m = null;
                }
                dy8Var.f = false;
                by8 by8Var = dy8Var.j;
                if (by8Var != null) {
                    n0gVar.a(by8Var);
                    dy8Var.j = null;
                }
                by8 by8Var2 = dy8Var.l;
                if (by8Var2 != null) {
                    n0gVar.a(by8Var2);
                    dy8Var.l = null;
                }
                by8 by8Var3 = dy8Var.n;
                if (by8Var3 != null) {
                    n0gVar.a(by8Var3);
                    dy8Var.n = null;
                }
                k9i k9iVar = dy8Var.a;
                fp4 fp4Var = k9iVar.c;
                k9iVar.l = null;
                byte[] bArr = k9iVar.i;
                if (bArr != null && (kn4Var3 = (kn4) fp4Var.c) != null) {
                    kn4Var3.j(bArr);
                }
                int[] iArr = k9iVar.j;
                if (iArr != null && (kn4Var2 = (kn4) fp4Var.c) != null) {
                    kn4Var2.j(iArr);
                }
                Bitmap bitmap2 = k9iVar.m;
                if (bitmap2 != null) {
                    ((dx1) fp4Var.b).i(bitmap2);
                }
                k9iVar.m = null;
                k9iVar.d = null;
                k9iVar.s = null;
                byte[] bArr2 = k9iVar.e;
                if (bArr2 != null && (kn4Var = (kn4) fp4Var.c) != null) {
                    kn4Var.j(bArr2);
                }
                dy8Var.k = true;
                break;
        }
    }

    @Override // defpackage.e1g
    public final Class d() {
        switch (this.b) {
            case 0:
                return xx8.class;
            default:
                return this.a.getClass();
        }
    }

    @Override // defpackage.e1g
    public final Object get() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    private final void e() {
    }
}
