package defpackage;

import com.blaze.blazesdk.players.a;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eim implements wke {
    public final /* synthetic */ a a;
    public final /* synthetic */ n4m b;
    public final /* synthetic */ Function1 c;

    public eim(a aVar, n4m n4mVar, Function1 function1) {
        this.a = aVar;
        this.b = n4mVar;
        this.c = function1;
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        Object obj;
        a aVar = this.a;
        n4m n4mVar = aVar.c;
        if (Intrinsics.c(n4mVar != null ? n4mVar.a : null, this.b.a)) {
            Iterator<E> it = ywl.k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ywl) obj).a == i) {
                        break;
                    }
                }
            }
            ywl ywlVar = (ywl) obj;
            if (ywlVar != null) {
                g9i g9iVar = aVar.r;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                aVar.r = null;
                ywl ywlVar2 = ywl.c;
                Function1 function1 = this.c;
                if (ywlVar == ywlVar2) {
                    aVar.r = xw3.L(aVar.a.b(), null, null, new cgm(function1, ywlVar, null), 3);
                } else {
                    function1.invoke(ywlVar);
                }
            }
        }
    }
}
