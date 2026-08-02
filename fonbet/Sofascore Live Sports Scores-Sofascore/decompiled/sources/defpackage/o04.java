package defpackage;

import com.sofascore.results.event.overs.view.CricketOverDialog;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o04 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ CricketOverDialog j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o04(CricketOverDialog cricketOverDialog, int i) {
        super(0);
        this.i = i;
        this.j = cricketOverDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        CricketOverDialog cricketOverDialog = this.j;
        switch (i) {
            case 0:
                return cricketOverDialog.requireActivity().getViewModelStore();
            case 1:
                return cricketOverDialog.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return cricketOverDialog.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
