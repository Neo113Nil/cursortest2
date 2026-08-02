package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zbwa extends zbwh {
    zbwa() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh
    public final void zba() {
        if (!zbj()) {
            for (int i11 = 0; i11 < zbc(); i11++) {
                ((zbtt) ((zbwb) zbg(i11)).zba()).zbg();
            }
            Iterator it = zbd().iterator();
            while (it.hasNext()) {
                ((zbtt) ((Map.Entry) it.next()).getKey()).zbg();
            }
        }
        super.zba();
    }
}
