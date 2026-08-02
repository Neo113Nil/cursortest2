package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.N;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vzm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ vzm(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                int i2 = a.I;
                w3m w3mVar = (w3m) aVar.getViewModel();
                w3mVar.y.k(null);
                w3mVar.k(a1n.a, false);
                break;
            case 1:
                String str = (String) obj;
                int i3 = a.I;
                if (str != null) {
                    n1n n1nVar = n1n.a;
                    a aVar2 = this.b;
                    aVar2.e(n1nVar, false);
                    aVar2.u();
                    ful.invokeShareChooser$default(aVar2, str, null, tub.h(new Pair("videoId", String.valueOf(aVar2.p.h)), new Pair("link text", str)), 2, null);
                }
                break;
            case 2:
                fqm fqmVar = (fqm) obj;
                int i4 = a.I;
                fqmVar.getClass();
                aVar.o(new pbm(aVar, fqmVar, null));
                if (aVar.t() && ((w3m) aVar.getViewModel()).L() && (function1 = aVar.z) != null) {
                    function1.invoke(Boolean.valueOf(fqmVar.a));
                }
                break;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i5 = a.I;
                aVar.o(new z5m(aVar, booleanValue, null));
                break;
            default:
                ((Boolean) obj).getClass();
                int i6 = a.I;
                B b = ((w3m) aVar.getViewModel()).p0;
                if (b != null) {
                    N n = N.b;
                    n.getClass();
                    B copy$default = B.copy$default(b, null, null, null, null, null, null, 63, null);
                    copy$default.getClass();
                    copy$default.b = n;
                    Function1 function12 = aVar.w;
                    if (function12 != null) {
                        function12.invoke(copy$default);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
