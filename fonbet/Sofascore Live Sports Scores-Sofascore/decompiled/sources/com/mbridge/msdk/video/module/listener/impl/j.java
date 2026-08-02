package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class j extends e {
    private int d;

    public j(ImageView imageView, int i) {
        super(imageView);
        this.d = i;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.e, com.mbridge.msdk.foundation.same.image.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap a;
        if (bitmap == null) {
            return;
        }
        try {
            if (this.a == null || bitmap.isRecycled() || (a = p0.a(bitmap, 1, this.d)) == null) {
                return;
            }
            this.a.setImageBitmap(a);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
