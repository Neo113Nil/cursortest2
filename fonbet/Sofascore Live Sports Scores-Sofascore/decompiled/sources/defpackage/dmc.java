package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dmc extends w0 {
    @Override // defpackage.w0
    public final f3 I(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 26);
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        cmc[] cmcVarArr = cmc.a;
        if (i == 0) {
            return Integer.valueOf(R.id.ripple_holder);
        }
        return null;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return (obj instanceof Event) || (obj instanceof UniqueTournament);
    }

    @Override // defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof Event) {
            cmc[] cmcVarArr = cmc.a;
            return 0;
        }
        if (obj instanceof UniqueTournament) {
            cmc[] cmcVarArr2 = cmc.a;
            return 1;
        }
        if (obj instanceof j29) {
            cmc[] cmcVarArr3 = cmc.a;
            return 3;
        }
        if (obj instanceof ylc) {
            cmc[] cmcVarArr4 = cmc.a;
            return 2;
        }
        super.v(obj);
        return Sdk.SDKError.Reason.AD_NO_FILL_VALUE;
    }

    @Override // defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        cmc[] cmcVarArr = cmc.a;
        Context context = this.b;
        if (i == 0) {
            return new ja9(8, new olc(context));
        }
        if (i == 1) {
            return new ja9(ez0.d(LayoutInflater.from(context).inflate(R.layout.mma_organisation_header_cell, viewGroup, false)));
        }
        if (i != 3) {
            return i == 2 ? new xlc(kqb.c(LayoutInflater.from(context), viewGroup), 0) : super.z(viewGroup, i);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) v82.g(LayoutInflater.from(context), viewGroup).b;
        constraintLayout.getClass();
        return new wh(constraintLayout);
    }
}
