package defpackage;

import android.content.Context;
import com.sofascore.results.player.PlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u31 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boh b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public u31(boh bohVar, Context context, cn2 cn2Var, int i, int i2) {
        this.b = bohVar;
        this.e = context;
        this.f = cn2Var;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    ((Function1) obj2).invoke(new mw7(this.c, i2));
                    ((Function0) obj).invoke();
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    int i3 = PlayerActivity.Z;
                    jle.q((Context) obj2, ((cn2) obj).d.intValue(), this.c, Integer.valueOf(i2), null, false, null, null, 496);
                }
                break;
        }
        return Unit.a;
    }

    public u31(boh bohVar, Function1 function1, int i, int i2, Function0 function0) {
        this.b = bohVar;
        this.e = function1;
        this.c = i;
        this.d = i2;
        this.f = function0;
    }
}
