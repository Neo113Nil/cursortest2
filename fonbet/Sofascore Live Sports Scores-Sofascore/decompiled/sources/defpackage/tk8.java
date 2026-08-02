package defpackage;

import com.sofascore.model.newNetwork.FootballShotmapItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class tk8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk8 b;

    public /* synthetic */ tk8(wk8 wk8Var, int i) {
        this.a = i;
        this.b = wk8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        wk8 wk8Var = this.b;
        switch (i) {
            case 0:
                return wk8.o(wk8Var, (FootballShotmapItem) obj);
            default:
                return wk8.n(wk8Var, (x31) obj);
        }
    }
}
