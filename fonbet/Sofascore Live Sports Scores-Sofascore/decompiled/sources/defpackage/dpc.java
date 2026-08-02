package defpackage;

import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dpc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MmaOrganisationActivity b;

    public /* synthetic */ dpc(MmaOrganisationActivity mmaOrganisationActivity, int i) {
        this.a = i;
        this.b = mmaOrganisationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MmaOrganisationActivity mmaOrganisationActivity = this.b;
        switch (i) {
            case 0:
                return mmaOrganisationActivity.getDefaultViewModelProviderFactory();
            case 1:
                return mmaOrganisationActivity.getViewModelStore();
            default:
                return mmaOrganisationActivity.getDefaultViewModelCreationExtras();
        }
    }
}
