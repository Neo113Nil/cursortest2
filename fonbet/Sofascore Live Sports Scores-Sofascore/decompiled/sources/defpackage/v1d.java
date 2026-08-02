package defpackage;

import com.sofascore.results.notifications.ui.MuteNotificationsBottomSheet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v1d extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ MuteNotificationsBottomSheet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1d(MuteNotificationsBottomSheet muteNotificationsBottomSheet, int i) {
        super(0);
        this.i = i;
        this.j = muteNotificationsBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        MuteNotificationsBottomSheet muteNotificationsBottomSheet = this.j;
        switch (i) {
            case 0:
                return muteNotificationsBottomSheet.requireActivity().getViewModelStore();
            case 1:
                return muteNotificationsBottomSheet.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return muteNotificationsBottomSheet.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
