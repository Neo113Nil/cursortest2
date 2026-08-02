package defpackage;

import android.content.Context;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uv5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventCommentaryFragment b;

    public /* synthetic */ uv5(EventCommentaryFragment eventCommentaryFragment, int i) {
        this.a = i;
        this.b = eventCommentaryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        EventCommentaryFragment eventCommentaryFragment = this.b;
        switch (i) {
            case 0:
                eventCommentaryFragment.n();
                return Unit.a;
            case 1:
                EventCommentaryFragment eventCommentaryFragment2 = this.b;
                Context requireContext = eventCommentaryFragment2.requireContext();
                requireContext.getClass();
                return new aw5(requireContext, eventCommentaryFragment2.E(), new k43(1, eventCommentaryFragment2, EventCommentaryFragment.class, "handleCommentaryAction", "handleCommentaryAction(Lcom/sofascore/results/event/commentary/adapter/CommentaryAction;)V", 0, 19));
            case 2:
                Context requireContext2 = eventCommentaryFragment.requireContext();
                requireContext2.getClass();
                return new pse(requireContext2);
            default:
                return new vv5(eventCommentaryFragment.requireContext());
        }
    }
}
