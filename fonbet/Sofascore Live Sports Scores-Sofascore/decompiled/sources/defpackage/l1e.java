package defpackage;

import android.content.Context;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.player.PlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l1e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ m1e d;

    public /* synthetic */ l1e(boh bohVar, Context context, m1e m1eVar, int i) {
        this.a = i;
        this.b = bohVar;
        this.c = context;
        this.d = m1eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boh bohVar = this.b;
        m1e m1eVar = this.d;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    int i2 = PlayerActivity.Z;
                    jle.q(this.c, m1eVar.a, m1eVar.e, Integer.valueOf(m1eVar.g), zxe.d, false, null, null, 480);
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    a99.A(LeagueActivity.h0, this.c, Integer.valueOf(m1eVar.e), 0, Integer.valueOf(m1eVar.g), y4b.g, null, null, 4048);
                }
                break;
        }
        return Unit.a;
    }
}
