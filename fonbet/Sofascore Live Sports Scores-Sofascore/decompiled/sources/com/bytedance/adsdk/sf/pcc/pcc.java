package com.bytedance.adsdk.sf.pcc;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.sf.wh.vj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends Paint {
    public pcc(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(vj.pcc(i, 0, 255));
        } else {
            setColor((vj.pcc(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public pcc(int i) {
        super(i);
    }

    public pcc() {
    }

    public pcc(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
