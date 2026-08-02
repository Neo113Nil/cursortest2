package le;

import android.content.Context;
import com.sports.insider.ui.pays.VipAccessFragment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l2 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Context f19872a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VipAccessFragment f19874c;

    /* renamed from: d, reason: collision with root package name */
    public int f19875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(VipAccessFragment vipAccessFragment, mf.c cVar) {
        super(cVar);
        this.f19874c = vipAccessFragment;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19873b = obj;
        this.f19875d |= Integer.MIN_VALUE;
        return VipAccessFragment.G(this.f19874c, null, null, this);
    }
}
