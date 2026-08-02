package defpackage;

import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.player.statistics.career.modal.CareerStatsTournamentPickerModal;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ll2 extends ot8 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PickerItem.Tournament tournament = (PickerItem.Tournament) obj;
        tournament.getClass();
        CareerStatsTournamentPickerModal careerStatsTournamentPickerModal = (CareerStatsTournamentPickerModal) this.receiver;
        u6b parentFragment = careerStatsTournamentPickerModal.getParentFragment();
        parentFragment.getClass();
        PlayerCareerStatisticsFragment playerCareerStatisticsFragment = (PlayerCareerStatisticsFragment) ((kl2) parentFragment);
        ((eoh) playerCareerStatisticsFragment.J).setValue(tournament);
        playerCareerStatisticsFragment.R();
        careerStatsTournamentPickerModal.j();
        return Unit.a;
    }
}
