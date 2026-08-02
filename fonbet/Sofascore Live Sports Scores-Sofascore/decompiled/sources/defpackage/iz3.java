package defpackage;

import com.sofascore.results.event.graphs.view.CricketBowlerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class iz3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CricketBowlerView b;

    public /* synthetic */ iz3(CricketBowlerView cricketBowlerView, int i) {
        this.a = i;
        this.b = cricketBowlerView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        CricketBowlerView cricketBowlerView = this.b;
        switch (i) {
            case 0:
                return CricketBowlerView.j(cricketBowlerView, (of3) obj, ((Integer) obj2).intValue());
            default:
                String str = (String) obj;
                ((Integer) obj2).getClass();
                int i2 = CricketBowlerView.n;
                str.getClass();
                cricketBowlerView.r(str);
                return Unit.a;
        }
    }
}
