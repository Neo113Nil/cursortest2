package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jn7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyTransfersFragment b;
    public final /* synthetic */ mqi c;

    public /* synthetic */ jn7(FantasyTransfersFragment fantasyTransfersFragment, mqi mqiVar, int i) {
        this.a = i;
        this.b = fantasyTransfersFragment;
        this.c = mqiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        mqi mqiVar = this.c;
        FantasyTransfersFragment fantasyTransfersFragment = this.b;
        switch (i) {
            case 0:
                FragmentActivity requireActivity = fantasyTransfersFragment.requireActivity();
                requireActivity.getClass();
                return hkg.D(requireActivity, ((d6d) mqiVar.getValue()).h.l);
            default:
                FragmentActivity requireActivity2 = fantasyTransfersFragment.requireActivity();
                requireActivity2.getClass();
                return hkg.D(requireActivity2, ((d6d) mqiVar.getValue()).h.l);
        }
    }
}
