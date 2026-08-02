package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import defpackage.a70;
import defpackage.zzl;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class atb implements com.bytedance.sdk.component.vj.dax {
    private final WeakReference<ImageView> pcc;

    public atb(ImageView imageView) {
        this.pcc = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.vj.dax
    public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
        ImageView imageView = this.pcc.get();
        if (imageView == null) {
            return;
        }
        try {
            Object sf = vhVar.sf();
            if (sf instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) sf);
                return;
            }
            if (!(sf instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && zzl.n(sf)) {
                a70.e(sf).start();
            }
            imageView.setImageDrawable((Drawable) sf);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.vj.dax
    public void pcc(int i, String str, @Nullable Throwable th) {
        ImageView imageView = this.pcc.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
