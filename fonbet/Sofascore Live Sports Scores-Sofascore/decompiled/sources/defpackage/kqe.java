package defpackage;

import com.sofascore.results.player.matches.PlayerEventsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class kqe implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerEventsFragment b;

    public /* synthetic */ kqe(PlayerEventsFragment playerEventsFragment, int i) {
        this.a = i;
        this.b = playerEventsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        PlayerEventsFragment playerEventsFragment = this.b;
        switch (i) {
            case 0:
                zse zseVar = (zse) obj;
                kda.p(wca.x(playerEventsFragment.getLifecycle()), new n50(playerEventsFragment, zseVar, null, 11), new ord(17, playerEventsFragment, zseVar));
                return Unit.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                String string = playerEventsFragment.requireContext().getString(k03.l(playerEventsFragment.G(), str).g());
                string.getClass();
                return string;
            default:
                gqe gqeVar = (gqe) obj;
                gqeVar.getClass();
                ((eoh) playerEventsFragment.A).setValue(gqeVar);
                playerEventsFragment.u = true;
                u6e.b((u6e) playerEventsFragment.D.getValue());
                krk krkVar = playerEventsFragment.l;
                krkVar.getClass();
                ((xq8) krkVar).c.scrollToPosition(0);
                playerEventsFragment.u();
                return Unit.a;
        }
    }
}
