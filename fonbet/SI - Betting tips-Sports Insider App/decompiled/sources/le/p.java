package le;

import android.content.Context;
import com.sports.insider.ui.pays.LivePayFragment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Context f19901a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LivePayFragment f19903c;

    /* renamed from: d, reason: collision with root package name */
    public int f19904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(LivePayFragment livePayFragment, mf.c cVar) {
        super(cVar);
        this.f19903c = livePayFragment;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19902b = obj;
        this.f19904d |= Integer.MIN_VALUE;
        return LivePayFragment.G(this.f19903c, null, null, this);
    }
}
