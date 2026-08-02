package defpackage;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfbf;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class fbf extends q8 {
    public final fyk e;
    public final String f;
    public final t6e g;
    public final boolean h;
    public final fu3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbf(Application application, fyk fykVar, fqg fqgVar) {
        super(application);
        fykVar.getClass();
        fqgVar.getClass();
        this.e = fykVar;
        String str = (String) fqgVar.a("OPEN_PROFILE_ID");
        if (str == null) {
            ia0 ia0Var = ia0.q;
            str = fc6.e();
        }
        this.f = str;
        t6e t6eVar = (t6e) fqgVar.a("PAGING_TYPE");
        this.g = t6eVar == null ? t6e.a : t6eVar;
        ia0 ia0Var2 = ia0.q;
        this.h = Intrinsics.c(str, ok3.p().e().getId());
        this.i = j72.t(new wf2(pco.w(new k4e(new ej(new ate(this, 16), null, 6), new k9(100, 58)).e, un0.z(this)), 9));
    }
}
