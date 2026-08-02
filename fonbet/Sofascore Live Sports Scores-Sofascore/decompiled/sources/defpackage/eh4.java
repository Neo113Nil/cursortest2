package defpackage;

import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eh4 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ DateMatchesFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh4(DateMatchesFragment dateMatchesFragment, int i) {
        super(0);
        this.i = i;
        this.j = dateMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        DateMatchesFragment dateMatchesFragment = this.j;
        switch (i) {
            case 0:
                return dateMatchesFragment.requireActivity().getViewModelStore();
            case 1:
                return dateMatchesFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return dateMatchesFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return dateMatchesFragment;
        }
    }
}
