package com.bytedance.sdk.component.wh.pcc.pcc.pcc;

import android.content.Context;
import com.bytedance.sdk.component.wh.pcc.pcc.pcc.sf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends sf {
    private static volatile pcc pcc;

    private pcc(Context context) {
        super(context);
    }

    public static pcc pcc(Context context) {
        if (pcc == null) {
            synchronized (pcc.class) {
                try {
                    if (pcc == null) {
                        pcc = new pcc(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.sf
    public /* bridge */ /* synthetic */ sf.C0059sf pcc() {
        return super.pcc();
    }
}
