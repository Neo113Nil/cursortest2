package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hpe implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerEventStatisticsModal b;

    public /* synthetic */ hpe(PlayerEventStatisticsModal playerEventStatisticsModal, int i) {
        this.a = i;
        this.b = playerEventStatisticsModal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int intValue;
        switch (this.a) {
            case 0:
                boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
                PlayerEventStatisticsModal playerEventStatisticsModal = this.b;
                if (z != playerEventStatisticsModal.J) {
                    playerEventStatisticsModal.J = z;
                    hzd hzdVar = playerEventStatisticsModal.N;
                    if (hzdVar == null) {
                        Intrinsics.i("data");
                        throw null;
                    }
                    xoe e = hzdVar.e(Integer.valueOf(playerEventStatisticsModal.O));
                    hzd hzdVar2 = playerEventStatisticsModal.N;
                    if (hzdVar2 != null) {
                        playerEventStatisticsModal.a0(e, hzdVar2.e(playerEventStatisticsModal.Q), playerEventStatisticsModal.W, playerEventStatisticsModal.X, true, true);
                        return;
                    } else {
                        Intrinsics.i("data");
                        throw null;
                    }
                }
                return;
            default:
                int i9 = i8 - i6;
                int i10 = i4 - i2;
                PlayerEventStatisticsModal playerEventStatisticsModal2 = this.b;
                rfe rfeVar = playerEventStatisticsModal2.D;
                if (rfeVar == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                int paddingBottom = ((RecyclerView) rfeVar.e).getPaddingBottom();
                joa joaVar = playerEventStatisticsModal2.A0;
                if (i10 == 0) {
                    intValue = ((Number) joaVar.getValue()).intValue() + i9;
                    if (intValue < paddingBottom) {
                        intValue = paddingBottom;
                    }
                } else {
                    intValue = ((Number) joaVar.getValue()).intValue();
                }
                if (paddingBottom != intValue) {
                    rfe rfeVar2 = playerEventStatisticsModal2.D;
                    if (rfeVar2 == null) {
                        Intrinsics.i("modalBinding");
                        throw null;
                    }
                    RecyclerView recyclerView = (RecyclerView) rfeVar2.e;
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), intValue);
                    return;
                }
                return;
        }
    }
}
