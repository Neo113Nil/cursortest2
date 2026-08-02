package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p92 implements dz7 {
    public final /* synthetic */ int a;
    public final tvd b;
    public final Object c;

    public /* synthetic */ p92(Object obj, tvd tvdVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = tvdVar;
    }

    @Override // defpackage.dz7
    public final Object a(zn5 zn5Var) {
        int i = this.a;
        Object obj = this.c;
        tvd tvdVar = this.b;
        switch (i) {
            case 0:
                x52 x52Var = new x52();
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                x52Var.write(bArr, 0, bArr.length);
                return new fwh(c6o.i(x52Var, tvdVar.f), null, pe4.b);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new fwh(new hwh(new lof(new z92(byteBuffer)), tvdVar.f, new da2(byteBuffer)), null, pe4.b);
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = gjk.a;
                boolean z = (drawable instanceof VectorDrawable) || (drawable instanceof gmk);
                if (z) {
                    drawable = new BitmapDrawable(tvdVar.a.getResources(), m6k.y(drawable, vt9.c(tvdVar), tvdVar.b, tvdVar.c, (kjh) fqj.x(tvdVar, st9.b), tvdVar.d == e3f.b));
                }
                return new bs9(rfo.u(drawable), z, pe4.b);
        }
    }
}
