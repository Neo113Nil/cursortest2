package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class tv5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventCommentaryFragment b;

    public /* synthetic */ tv5(EventCommentaryFragment eventCommentaryFragment, int i) {
        this.a = i;
        this.b = eventCommentaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        EventCommentaryFragment eventCommentaryFragment = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                krk krkVar = eventCommentaryFragment.l;
                krkVar.getClass();
                ((yq8) krkVar).b.setElevation(floatValue);
                break;
            default:
                Player player = (Player) obj;
                player.getClass();
                eventCommentaryFragment.H(player, false);
                break;
        }
        return Unit.a;
    }
}
