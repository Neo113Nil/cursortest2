package com.vk.clips.sdk.shared.item.common.error;

import com.vk.clips.sdk.shared.item.common.error.b;
import xsna.gvp;
import xsna.iwp;
import xsna.oy8;

/* compiled from: ErrorOverlayMapper.kt */
/* loaded from: classes17.dex */
public final class a extends oy8<iwp, b> {
    @Override // xsna.oy8
    public final b b(iwp iwpVar) {
        iwp iwpVar2 = iwpVar;
        String str = iwpVar2.b;
        if (!iwpVar2.a) {
            return new b.a(str);
        }
        gvp gvpVar = iwpVar2.c;
        return gvpVar instanceof gvp.a ? new b.C0670b(str, ((gvp.a) gvpVar).a) : new b.a(str);
    }
}
