package le;

import android.content.Context;
import com.sports.insider.ui.pays.PayPremiumFragment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o1 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Context f19897a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayPremiumFragment f19899c;

    /* renamed from: d, reason: collision with root package name */
    public int f19900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(PayPremiumFragment payPremiumFragment, mf.c cVar) {
        super(cVar);
        this.f19899c = payPremiumFragment;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19898b = obj;
        this.f19900d |= Integer.MIN_VALUE;
        return PayPremiumFragment.G(this.f19899c, null, null, this);
    }
}
