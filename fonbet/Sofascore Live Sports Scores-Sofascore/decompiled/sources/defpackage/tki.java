package defpackage;

import com.android.billingclient.api.BillingClient;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tki extends sq3 {
    public List r;
    public BillingClient s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ bli v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tki(bli bliVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = bliVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
