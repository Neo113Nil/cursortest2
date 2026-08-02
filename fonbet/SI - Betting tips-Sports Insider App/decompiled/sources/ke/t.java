package ke;

import com.sports.insider.ui.onboarding.SportInsiderFragment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f19059a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19060b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19061c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f19062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SportInsiderFragment f19063e;

    /* renamed from: f, reason: collision with root package name */
    public int f19064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SportInsiderFragment sportInsiderFragment, mf.c cVar) {
        super(cVar);
        this.f19063e = sportInsiderFragment;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19062d = obj;
        this.f19064f |= Integer.MIN_VALUE;
        return SportInsiderFragment.G(this.f19063e, this);
    }
}
