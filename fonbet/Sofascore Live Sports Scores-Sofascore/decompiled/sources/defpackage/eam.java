package defpackage;

import com.blaze.blazesdk.players.a;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eam implements wke {
    public final /* synthetic */ a a;
    public final /* synthetic */ n4m b;
    public final /* synthetic */ Function1 c;

    public eam(a aVar, n4m n4mVar, Function1 function1) {
        this.a = aVar;
        this.b = n4mVar;
        this.c = function1;
    }

    @Override // defpackage.wke
    public final void onMediaItemTransition(h6c h6cVar, int i) {
        n4m n4mVar = this.a.c;
        Object obj = null;
        if (Intrinsics.c(n4mVar != null ? n4mVar.a : null, this.b.a)) {
            Iterator<E> it = htl.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((htl) next).a == i) {
                    obj = next;
                    break;
                }
            }
            htl htlVar = (htl) obj;
            if (htlVar != null) {
                this.c.invoke(htlVar);
            }
        }
    }
}
