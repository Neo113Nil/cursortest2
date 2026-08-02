package defpackage;

import com.sofascore.results.tv.fragments.NewChannelsDialog;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class obd extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ NewChannelsDialog j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obd(NewChannelsDialog newChannelsDialog, int i) {
        super(0);
        this.i = i;
        this.j = newChannelsDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        NewChannelsDialog newChannelsDialog = this.j;
        switch (i) {
            case 0:
                return newChannelsDialog.requireActivity().getViewModelStore();
            case 1:
                return newChannelsDialog.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return newChannelsDialog.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
