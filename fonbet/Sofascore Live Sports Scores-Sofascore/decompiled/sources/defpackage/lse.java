package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.player.PlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class lse implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pse b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lse(Object obj, pse pseVar) {
        this.a = 3;
        this.c = obj;
        this.b = pseVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        pse pseVar = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = PlayerActivity.Z;
                jle.q(pseVar.a, ((fae) obj).b.getPlayer1().getId(), 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                break;
            case 1:
                int i3 = PlayerActivity.Z;
                jle.q(pseVar.a, ((fae) obj).b.getPlayer2().getId(), 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                break;
            case 2:
                int i4 = PlayerActivity.Z;
                jle.q(pseVar.a, ((lt1) obj).c.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                break;
            default:
                Player wicketBowler = ((lt1) obj).c.getWicketBowler();
                if (wicketBowler != null) {
                    int i5 = PlayerActivity.Z;
                    jle.q(pseVar.a, wicketBowler.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lse(pse pseVar, Object obj, int i) {
        this.a = i;
        this.b = pseVar;
        this.c = obj;
    }
}
