package defpackage;

import com.blaze.blazesdk.players.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class scm implements wke {
    public final /* synthetic */ a a;
    public final /* synthetic */ n4m b;
    public final /* synthetic */ Function0 c;

    public scm(a aVar, n4m n4mVar, Function0 function0) {
        this.a = aVar;
        this.b = n4mVar;
        this.c = function0;
    }

    @Override // defpackage.wke
    public final void onRenderedFirstFrame() {
        n4m n4mVar = this.a.c;
        if (Intrinsics.c(n4mVar != null ? n4mVar.a : null, this.b.a)) {
            this.c.invoke();
        }
    }
}
