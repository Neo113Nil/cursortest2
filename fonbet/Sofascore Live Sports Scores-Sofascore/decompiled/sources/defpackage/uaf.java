package defpackage;

import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uaf extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ProfilePredictionsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uaf(ProfilePredictionsFragment profilePredictionsFragment, int i) {
        super(0);
        this.i = i;
        this.j = profilePredictionsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        return this.j;
    }
}
