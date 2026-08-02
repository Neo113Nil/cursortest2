package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r08 implements j1g {
    public final /* synthetic */ int a;

    public /* synthetic */ r08(int i) {
        this.a = i;
    }

    @Override // defpackage.j1g
    public final boolean a(Object obj, uvd uvdVar) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.j1g
    public final e1g b(Object obj, int i, int i2, uvd uvdVar) {
        switch (this.a) {
            case 0:
                return new lc2((File) obj);
            case 1:
                return new lc2((Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new yx8(drawable, 1);
                }
                return null;
        }
    }
}
