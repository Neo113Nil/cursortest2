package androidx.work;

import android.content.Context;
import defpackage.k3a;
import defpackage.rik;
import defpackage.ti3;
import defpackage.xbl;
import defpackage.yz1;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements k3a {
    static {
        rik.x("WrkMgrInitializer");
    }

    @Override // defpackage.k3a
    public final Object create(Context context) {
        rik.o().getClass();
        ti3 ti3Var = new ti3(new yz1(1));
        context.getClass();
        xbl.e(context, ti3Var);
        xbl d = xbl.d(context);
        d.getClass();
        return d;
    }

    @Override // defpackage.k3a
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
