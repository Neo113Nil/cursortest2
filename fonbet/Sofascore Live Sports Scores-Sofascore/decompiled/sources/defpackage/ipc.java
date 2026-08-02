package defpackage;

import com.sofascore.results.mma.organisation.details.MmaOrganisationDetailsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ipc extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ MmaOrganisationDetailsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ipc(MmaOrganisationDetailsFragment mmaOrganisationDetailsFragment, int i) {
        super(0);
        this.i = i;
        this.j = mmaOrganisationDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        MmaOrganisationDetailsFragment mmaOrganisationDetailsFragment = this.j;
        switch (i) {
            case 0:
                return mmaOrganisationDetailsFragment.requireActivity().getViewModelStore();
            case 1:
                return mmaOrganisationDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return mmaOrganisationDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return mmaOrganisationDetailsFragment;
        }
    }
}
