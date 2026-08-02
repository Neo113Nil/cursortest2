package com.vk.onepasspromo.impl;

import com.vk.dto.hints.HintId;
import com.vk.toggle.anonymous.SakFeatures;
import xsna.bpn0;
import xsna.cd3;
import xsna.vys;
import xsna.w8i;
import xsna.w94;
import xsna.wvw;
import xsna.zl90;

/* compiled from: OnePassPromoCondition.kt */
/* loaded from: classes.dex */
public final class a implements vys, w8i {
    public static boolean c;
    public static final a b = new a();
    public static final bpn0 d = new bpn0(new w94(12));
    public static final bpn0 e = new bpn0(new cd3(9));

    @Override // xsna.vys
    public final boolean isValid() {
        return c && ((zl90) e.getValue()).a() && ((wvw) d.getValue()).b().m(HintId.ACCOUNT_ONEPASS_PROMO) && SakFeatures.Type.VKC_ONEPASS_PROMO.h();
    }
}
