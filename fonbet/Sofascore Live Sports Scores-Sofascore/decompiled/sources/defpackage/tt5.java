package defpackage;

import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tt5 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventBoxScoreFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt5(EventBoxScoreFragment eventBoxScoreFragment, int i) {
        super(0);
        this.i = i;
        this.j = eventBoxScoreFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        EventBoxScoreFragment eventBoxScoreFragment = this.j;
        switch (i) {
            case 0:
                return eventBoxScoreFragment.requireActivity().getViewModelStore();
            case 1:
                return eventBoxScoreFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return eventBoxScoreFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return eventBoxScoreFragment;
        }
    }
}
