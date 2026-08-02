package defpackage;

import com.sofascore.results.profile.contributionScreen.contributionLogDialog.ContributionLogDialog;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class as3 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ContributionLogDialog j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as3(ContributionLogDialog contributionLogDialog, int i) {
        super(0);
        this.i = i;
        this.j = contributionLogDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        ContributionLogDialog contributionLogDialog = this.j;
        switch (i) {
            case 0:
                return contributionLogDialog.requireActivity().getViewModelStore();
            case 1:
                return contributionLogDialog.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return contributionLogDialog.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
