package com.bytedance.sdk.openadsdk.ork;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.vj.dax;
import com.bytedance.sdk.component.vj.vh;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rnn;
import defpackage.a70;
import defpackage.zzl;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements dax {
    private dax gm;
    private final WeakReference<ImageView> pcc;
    private final String sf = "ImageLoaderToViewWrapper";

    private gm(ImageView imageView, dax daxVar) {
        this.pcc = new WeakReference<>(imageView);
        this.gm = daxVar;
    }

    @Override // com.bytedance.sdk.component.vj.dax
    public void pcc(vh vhVar) {
        final ImageView imageView = this.pcc.get();
        if (imageView != null) {
            final Object sf = vhVar.sf();
            if (!(sf instanceof Bitmap)) {
                if (sf instanceof Drawable) {
                    if (rnn.wh()) {
                        pcc(sf, imageView);
                        return;
                    } else {
                        jr.gm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ork.gm.2
                            @Override // java.lang.Runnable
                            public void run() {
                                gm.this.pcc(sf, imageView);
                            }
                        });
                        return;
                    }
                }
                return;
            }
            if (rnn.wh()) {
                imageView.setImageBitmap((Bitmap) sf);
            } else {
                jr.gm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ork.gm.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap((Bitmap) sf);
                    }
                });
            }
            dax daxVar = this.gm;
            if (daxVar != null) {
                daxVar.pcc(vhVar);
            }
        }
    }

    private gm(ImageView imageView) {
        this.pcc = new WeakReference<>(imageView);
    }

    public static dax pcc(of ofVar, String str, ImageView imageView) {
        return new sf(ofVar, str, new gm(imageView));
    }

    public static dax pcc(of ofVar, String str, ImageView imageView, dax daxVar) {
        return new sf(ofVar, str, new gm(imageView, daxVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && zzl.n(obj)) {
            a70.e(obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.vj.dax
    public void pcc(int i, String str, @Nullable Throwable th) {
        dax daxVar = this.gm;
        if (daxVar != null) {
            daxVar.pcc(i, str, th);
        }
    }
}
