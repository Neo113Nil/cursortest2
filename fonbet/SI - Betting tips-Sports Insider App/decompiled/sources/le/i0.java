package le;

import android.content.Context;
import com.sports.insider.ui.pays.PayExpressFragment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Context f19822a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayExpressFragment f19824c;

    /* renamed from: d, reason: collision with root package name */
    public int f19825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(PayExpressFragment payExpressFragment, mf.c cVar) {
        super(cVar);
        this.f19824c = payExpressFragment;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19823b = obj;
        this.f19825d |= Integer.MIN_VALUE;
        return PayExpressFragment.G(this.f19824c, null, null, this);
    }
}
