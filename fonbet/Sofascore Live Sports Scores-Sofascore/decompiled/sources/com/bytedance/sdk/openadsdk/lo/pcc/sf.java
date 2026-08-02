package com.bytedance.sdk.openadsdk.lo.pcc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.oo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private byte[] gm;
    private Bitmap oo;
    int pcc;
    private Drawable sf;
    private Bitmap vj;

    public sf(Drawable drawable, int i) {
        this.gm = null;
        this.oo = null;
        this.vj = null;
        this.sf = drawable;
        this.pcc = i;
    }

    public byte[] gm() {
        try {
            if (this.gm == null) {
                this.gm = oo.pcc(this.oo);
            }
        } catch (OutOfMemoryError e) {
            lo.gm("GifRequestResult", e.getMessage());
        }
        return this.gm;
    }

    public Drawable oo() {
        return this.sf;
    }

    public Bitmap pcc() {
        return this.oo;
    }

    public Bitmap sf() {
        return this.vj;
    }

    public boolean vj() {
        if (this.oo != null || this.sf != null) {
            return true;
        }
        byte[] bArr = this.gm;
        return bArr != null && bArr.length > 0;
    }

    public sf(byte[] bArr, int i) {
        this.sf = null;
        this.oo = null;
        this.vj = null;
        this.gm = bArr;
        this.pcc = i;
    }

    public sf(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.sf = null;
        this.gm = null;
        this.vj = bitmap2;
        this.oo = bitmap;
        this.pcc = i;
    }
}
