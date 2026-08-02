package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.config.dynamic.utils.image.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class aul implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ ImageView c;

    public /* synthetic */ aul(Bitmap bitmap, ImageView imageView, int i) {
        this.a = i;
        this.b = bitmap;
        this.c = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ImageView imageView = this.c;
        Bitmap bitmap = this.b;
        switch (i) {
            case 0:
                b.b(bitmap, imageView);
                break;
            case 1:
                b.a(bitmap, imageView);
                break;
            case 2:
                b.d(bitmap, imageView);
                break;
            default:
                b.c(bitmap, imageView);
                break;
        }
    }
}
