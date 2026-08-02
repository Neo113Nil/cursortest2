package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e27 implements n55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ e27(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // defpackage.n55
    public final void d() {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                Bitmap bitmap = (Bitmap) e1dVar.getValue();
                if (bitmap != null) {
                    bitmap.recycle();
                    break;
                }
                break;
            case 1:
                Bitmap bitmap2 = (Bitmap) e1dVar.getValue();
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    break;
                }
                break;
            case 2:
                Bitmap bitmap3 = (Bitmap) e1dVar.getValue();
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    break;
                }
                break;
            default:
                ale aleVar = (ale) e1dVar.getValue();
                if (aleVar != null) {
                    aleVar.stop();
                }
                ale aleVar2 = (ale) e1dVar.getValue();
                if (aleVar2 != null) {
                    aleVar2.release();
                }
                e1dVar.setValue(null);
                break;
        }
    }
}
