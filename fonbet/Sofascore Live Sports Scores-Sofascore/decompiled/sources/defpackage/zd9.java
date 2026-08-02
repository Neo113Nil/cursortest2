package defpackage;

import com.sofascore.model.mvvm.model.Player;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zd9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ be9 b;

    public /* synthetic */ zd9(be9 be9Var, int i) {
        this.a = i;
        this.b = be9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        be9 be9Var = this.b;
        switch (i) {
            case 0:
                return be9.r(be9Var, (he9) obj);
            default:
                return be9.q(be9Var, (Player) obj);
        }
    }
}
