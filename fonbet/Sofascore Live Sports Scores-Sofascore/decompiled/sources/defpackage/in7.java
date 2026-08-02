package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class in7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyTransfersFragment b;

    public /* synthetic */ in7(FantasyTransfersFragment fantasyTransfersFragment, int i) {
        this.a = i;
        this.b = fantasyTransfersFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyTransfersFragment fantasyTransfersFragment = this.b;
        switch (i) {
        }
        return yqo.A(fantasyTransfersFragment).b.e(R.id.nav_graph_transfers);
    }
}
