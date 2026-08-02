package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rk2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CareerStatsFilterModal b;

    public /* synthetic */ rk2(CareerStatsFilterModal careerStatsFilterModal, int i) {
        this.a = i;
        this.b = careerStatsFilterModal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        CareerStatsFilterModal careerStatsFilterModal = this.b;
        switch (i) {
            case 0:
                careerStatsFilterModal.P(fzg.e);
                break;
            case 1:
                careerStatsFilterModal.D = null;
                careerStatsFilterModal.M();
                careerStatsFilterModal.E = vk2.c;
                careerStatsFilterModal.M();
                ListAdapter adapter = ((MaterialAutoCompleteTextView) careerStatsFilterModal.H().e).getAdapter();
                dl2 dl2Var = adapter instanceof dl2 ? (dl2) adapter : null;
                if (dl2Var != null) {
                    dl2Var.b = 0;
                }
                ((MaterialAutoCompleteTextView) careerStatsFilterModal.H().e).setText(careerStatsFilterModal.getString(R.string.all_teams));
                ListAdapter adapter2 = ((MaterialAutoCompleteTextView) careerStatsFilterModal.H().j).getAdapter();
                al2 al2Var = adapter2 instanceof al2 ? (al2) adapter2 : null;
                if (al2Var != null) {
                    al2Var.b = careerStatsFilterModal.E.ordinal();
                }
                ((MaterialAutoCompleteTextView) careerStatsFilterModal.H().j).setText(careerStatsFilterModal.getString(careerStatsFilterModal.E.b));
                Integer num = careerStatsFilterModal.K().d;
                if (num != null) {
                    int intValue = num.intValue();
                    Integer num2 = careerStatsFilterModal.K().e;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        RangeSlider rangeSlider = (RangeSlider) careerStatsFilterModal.H().m;
                        int indexOf = careerStatsFilterModal.F().indexOf(Integer.valueOf(intValue));
                        if (indexOf < 0) {
                            indexOf = 0;
                        }
                        rangeSlider.setValueFrom(indexOf);
                        RangeSlider rangeSlider2 = (RangeSlider) careerStatsFilterModal.H().m;
                        int indexOf2 = careerStatsFilterModal.F().indexOf(Integer.valueOf(intValue2));
                        if (indexOf2 < 1) {
                            indexOf2 = 1;
                        }
                        rangeSlider2.setValueTo(indexOf2);
                        ((RangeSlider) careerStatsFilterModal.H().m).setValues(b.e(Float.valueOf(careerStatsFilterModal.F().indexOf(Integer.valueOf(intValue)) >= 0 ? r9 : 0), Float.valueOf(careerStatsFilterModal.F().indexOf(Integer.valueOf(intValue2)) >= 1 ? r1 : 1)));
                    }
                }
                careerStatsFilterModal.P(careerStatsFilterModal.K().c);
                break;
            case 2:
                Fragment parentFragment = careerStatsFilterModal.getParentFragment();
                parentFragment.getClass();
                com.sofascore.results.player.statistics.career.modal.b bVar = (com.sofascore.results.player.statistics.career.modal.b) parentFragment;
                CareerStatsFilterModal.CareerStatsFilterData careerStatsFilterData = new CareerStatsFilterModal.CareerStatsFilterData(careerStatsFilterModal.D, careerStatsFilterModal.E, careerStatsFilterModal.I(), ((RangeSlider) careerStatsFilterModal.H().m).getVisibility() == 0 ? Integer.valueOf(careerStatsFilterModal.N()) : null, ((RangeSlider) careerStatsFilterModal.H().m).getVisibility() == 0 ? Integer.valueOf(careerStatsFilterModal.O()) : null);
                PlayerCareerStatisticsFragment playerCareerStatisticsFragment = (PlayerCareerStatisticsFragment) bVar;
                if (!Intrinsics.c(playerCareerStatisticsFragment.E(), careerStatsFilterData)) {
                    ome N = playerCareerStatisticsFragment.N();
                    N.j.clear();
                    N.k = true;
                    playerCareerStatisticsFragment.N = true;
                    playerCareerStatisticsFragment.G = careerStatsFilterData;
                    Context requireContext = playerCareerStatisticsFragment.requireContext();
                    requireContext.getClass();
                    n9e.u(requireContext, new cme(playerCareerStatisticsFragment, 9));
                    playerCareerStatisticsFragment.U();
                    playerCareerStatisticsFragment.u();
                }
                careerStatsFilterModal.j();
                break;
            case 3:
                ((MaterialAutoCompleteTextView) careerStatsFilterModal.H().e).clearFocus();
                ((MaterialAutoCompleteTextView) careerStatsFilterModal.H().j).clearFocus();
                break;
            default:
                careerStatsFilterModal.P(fzg.f);
                break;
        }
    }
}
