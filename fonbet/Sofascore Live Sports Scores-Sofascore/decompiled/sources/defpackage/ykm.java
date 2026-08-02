package defpackage;

import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ykm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ ykm(ImageView imageView, int i) {
        this.a = i;
        this.b = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ImageView imageView = this.b;
        switch (i) {
            case 0:
                int i2 = dlm.o;
                imageView.getClass();
                evl.q(imageView);
                break;
            default:
                boolean z = e0n.n;
                imageView.getClass();
                evl.q(imageView);
                break;
        }
    }
}
