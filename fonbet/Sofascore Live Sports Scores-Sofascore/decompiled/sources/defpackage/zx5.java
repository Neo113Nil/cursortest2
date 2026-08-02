package defpackage;

import com.sofascore.results.event.details.EventDetailsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zx5 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ EventDetailsFragment j;
    public final /* synthetic */ joa k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx5(EventDetailsFragment eventDetailsFragment, joa joaVar, int i) {
        super(0);
        this.i = i;
        this.j = eventDetailsFragment;
        this.k = joaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        h79 h79Var;
        int i = this.i;
        EventDetailsFragment eventDetailsFragment = this.j;
        joa joaVar = this.k;
        switch (i) {
            case 0:
                ttk ttkVar = (ttk) joaVar.getValue();
                h79Var = ttkVar instanceof h79 ? (h79) ttkVar : null;
                if (h79Var == null || (r3 = h79Var.getDefaultViewModelProviderFactory()) == null) {
                    break;
                }
                break;
            case 1:
                ttk ttkVar2 = (ttk) joaVar.getValue();
                h79Var = ttkVar2 instanceof h79 ? (h79) ttkVar2 : null;
                if (h79Var == null || (r3 = h79Var.getDefaultViewModelProviderFactory()) == null) {
                    break;
                }
                break;
            default:
                ttk ttkVar3 = (ttk) joaVar.getValue();
                h79Var = ttkVar3 instanceof h79 ? (h79) ttkVar3 : null;
                if (h79Var == null || (r3 = h79Var.getDefaultViewModelProviderFactory()) == null) {
                    break;
                }
                break;
        }
        return eventDetailsFragment.getDefaultViewModelProviderFactory();
    }
}
