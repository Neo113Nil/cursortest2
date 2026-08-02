package lb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzaf;
import java.util.List;
import kb.AbstractC5238x;
import kb.AbstractC5239y;

/* renamed from: lb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5430i extends AbstractC5238x {

    /* renamed from: a, reason: collision with root package name */
    public final zzaf f55763a;

    public C5430i(zzaf zzafVar) {
        AbstractC3191o.m(zzafVar);
        this.f55763a = zzafVar;
    }

    @Override // kb.AbstractC5238x
    public final Task a(AbstractC5239y abstractC5239y, String str) {
        AbstractC3191o.m(abstractC5239y);
        zzaf zzafVar = this.f55763a;
        return FirebaseAuth.getInstance(zzafVar.n0()).T(zzafVar, abstractC5239y, str);
    }

    @Override // kb.AbstractC5238x
    public final List b() {
        return this.f55763a.B0();
    }

    @Override // kb.AbstractC5238x
    public final Task c() {
        return this.f55763a.h(false).continueWithTask(new C5429h(this));
    }

    @Override // kb.AbstractC5238x
    public final Task d(String str) {
        AbstractC3191o.g(str);
        zzaf zzafVar = this.f55763a;
        return FirebaseAuth.getInstance(zzafVar.n0()).S(zzafVar, str);
    }
}
