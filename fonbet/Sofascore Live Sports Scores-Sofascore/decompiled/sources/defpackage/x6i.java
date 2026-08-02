package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x6i extends w0 {
    @Override // defpackage.w0
    public final f3 I(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 11);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof d7i) {
            return 0;
        }
        if (obj instanceof c7i) {
            return 1;
        }
        super.v(obj);
        return Sdk.SDKError.Reason.AD_NO_FILL_VALUE;
    }

    @Override // defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.b;
        if (i == 0) {
            View inflate = hkg.S(context).inflate(R.layout.item_stage_series, viewGroup, false);
            int i2 = R.id.bell_button;
            BellButton bellButton = (BellButton) nq8.B(R.id.bell_button, inflate);
            if (bellButton != null) {
                i2 = R.id.divider;
                if (((MaterialDivider) nq8.B(R.id.divider, inflate)) != null) {
                    i2 = R.id.unique_stage_name;
                    TextView textView = (TextView) nq8.B(R.id.unique_stage_name, inflate);
                    if (textView != null) {
                        return new l32(new dd((ConstraintLayout) inflate, bellButton, textView, 17));
                    }
                }
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        if (i != 1) {
            return super.z(viewGroup, i);
        }
        View inflate2 = hkg.S(context).inflate(R.layout.item_stage_series_sub, viewGroup, false);
        int i3 = R.id.barrier;
        if (((Barrier) nq8.B(R.id.barrier, inflate2)) != null) {
            i3 = R.id.live_indicator;
            TextView textView2 = (TextView) nq8.B(R.id.live_indicator, inflate2);
            if (textView2 != null) {
                i3 = R.id.stage_name;
                TextView textView3 = (TextView) nq8.B(R.id.stage_name, inflate2);
                if (textView3 != null) {
                    i3 = R.id.sub_stage_info;
                    TextView textView4 = (TextView) nq8.B(R.id.sub_stage_info, inflate2);
                    if (textView4 != null) {
                        i3 = R.id.winner_name;
                        TextView textView5 = (TextView) nq8.B(R.id.winner_name, inflate2);
                        if (textView5 != null) {
                            return new pq5(new e92((ConstraintLayout) inflate2, textView2, textView3, textView4, textView5, 8));
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
        return null;
    }
}
