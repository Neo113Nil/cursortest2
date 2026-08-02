package defpackage;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.player.PlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mz9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Player d;

    public /* synthetic */ mz9(boh bohVar, Context context, Player player, int i) {
        this.a = i;
        this.b = bohVar;
        this.c = context;
        this.d = player;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Player player = this.d;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    int i2 = PlayerActivity.Z;
                    jle.q(this.c, player.getId(), 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    int i3 = PlayerActivity.Z;
                    jle.q(this.c, player.getId(), 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                }
                break;
        }
        return Unit.a;
    }
}
