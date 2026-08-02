package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zw1 implements ez7 {
    public final /* synthetic */ int a;
    public final xvd b;
    public final Object c;

    public /* synthetic */ zw1(Object obj, xvd xvdVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = xvdVar;
    }

    @Override // defpackage.ez7
    public final Object a(rq3 rq3Var) {
        int i = this.a;
        Object obj = this.c;
        xvd xvdVar = this.b;
        switch (i) {
            case 0:
                return new ya5(2, new BitmapDrawable(xvdVar.a.getResources(), (Bitmap) obj), false);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    x52 x52Var = new x52();
                    x52Var.write(byteBuffer);
                    byteBuffer.position(0);
                    return new nwh(new iwh(x52Var, new au9(xvdVar.a, 0), null), null, 2);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = l.a;
                boolean z = (drawable instanceof VectorDrawable) || (drawable instanceof gmk);
                if (z) {
                    drawable = new BitmapDrawable(xvdVar.a.getResources(), fqj.r(drawable, xvdVar.b, xvdVar.c, xvdVar.d, xvdVar.e));
                }
                return new ya5(2, drawable, z);
        }
    }
}
