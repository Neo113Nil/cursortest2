package defpackage;

import com.sofascore.model.profile.InvitedUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class z8b implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ z8b(n8b n8bVar, boolean z, r8b r8bVar, boolean z2, xtc xtcVar, boolean z3, int i) {
        this.e = n8bVar;
        this.b = z;
        this.f = r8bVar;
        this.c = z2;
        this.g = xtcVar;
        this.d = z3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(24577);
                b9b.d((n8b) this.e, this.b, (r8b) this.f, this.c, (xtc) this.g, this.d, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                sea.d((InvitedUser) this.e, this.b, this.c, this.d, (Function0) this.f, (Function0) this.g, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ z8b(InvitedUser invitedUser, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, int i) {
        this.e = invitedUser;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = function0;
        this.g = function02;
    }
}
