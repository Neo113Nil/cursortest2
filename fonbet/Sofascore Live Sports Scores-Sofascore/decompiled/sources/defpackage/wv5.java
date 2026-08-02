package defpackage;

import com.sofascore.results.event.commentary.EventCommentaryFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wv5 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventCommentaryFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv5(EventCommentaryFragment eventCommentaryFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventCommentaryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventCommentaryFragment eventCommentaryFragment = this.j;
        switch (i) {
            case 0:
                return eventCommentaryFragment.requireActivity().getViewModelStore();
            case 1:
                return eventCommentaryFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventCommentaryFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return eventCommentaryFragment;
        }
    }
}
