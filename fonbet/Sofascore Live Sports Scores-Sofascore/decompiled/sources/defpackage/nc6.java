package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnc6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class nc6 extends q8 {
    public final t9c e;
    public final int f;
    public final yzc g;
    public final yzc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc6(Application application, t9c t9cVar, fqg fqgVar) {
        super(application);
        t9cVar.getClass();
        fqgVar.getClass();
        this.e = t9cVar;
        Integer num = (Integer) fqgVar.a("ARG_EVENT_ID");
        this.f = num != null ? num.intValue() : -1;
        yzc yzcVar = new yzc();
        this.g = yzcVar;
        this.h = yzcVar;
        xw3.L(un0.z(this), z45.a, null, new rh4(this, (rq3) null, 15), 2);
    }
}
