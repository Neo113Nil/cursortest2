package defpackage;

import com.google.android.material.slider.RangeSlider;
import com.google.android.material.slider.b;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.dialog.TransferFilterModal;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class tk2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseModalBottomSheetDialog b;

    public /* synthetic */ tk2(BaseModalBottomSheetDialog baseModalBottomSheetDialog, int i) {
        this.a = i;
        this.b = baseModalBottomSheetDialog;
    }

    public final void a(b bVar) {
        int i = this.a;
        BaseModalBottomSheetDialog baseModalBottomSheetDialog = this.b;
        RangeSlider rangeSlider = (RangeSlider) bVar;
        switch (i) {
            case 0:
                CareerStatsFilterModal careerStatsFilterModal = (CareerStatsFilterModal) baseModalBottomSheetDialog;
                int N = careerStatsFilterModal.N();
                int O = careerStatsFilterModal.O();
                careerStatsFilterModal.H().g.setText(N != O ? fc6.g(N, O, " - ") : String.valueOf(N));
                careerStatsFilterModal.M();
                return;
            default:
                List<Float> values = rangeSlider.getValues();
                values.getClass();
                int floatValue = (int) values.get(0).floatValue();
                int floatValue2 = (int) values.get(1).floatValue();
                js2 js2Var = ((TransferFilterModal) baseModalBottomSheetDialog).x;
                if (js2Var == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                js2Var.d.setText(floatValue + " - " + floatValue2);
                return;
        }
    }
}
