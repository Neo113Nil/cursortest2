package com.vk.music.notifications.restriction;

import com.vk.billing.StorePurchasesManager;
import com.vk.dto.common.data.Subscription;
import com.vkontakte.android.R;
import xsna.cvk;
import xsna.nge0;
import xsna.s750;

/* compiled from: BaseMusicRestrictionPopupDisplayer.kt */
/* loaded from: classes3.dex */
public final class b implements StorePurchasesManager.a<Subscription> {
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;

    public b(a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void a() {
        cvk.u(R.string.purchase_cancelled, false);
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void c(Subscription subscription, nge0 nge0Var) {
        a aVar = this.b;
        s750 s750Var = aVar.b;
        String str = this.c;
        s750Var.W(str, "success");
        s750Var.E0(str, subscription.t);
        aVar.f();
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void d(Subscription subscription) {
        s750 s750Var = this.b.b;
        String str = this.c;
        s750Var.W(str, "err_unknown");
        s750Var.z0(str);
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void b() {
    }
}
