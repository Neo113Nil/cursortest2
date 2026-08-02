package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g4f extends g7 {
    public final int l;
    public final int m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final jx5 r;
    public final hx5 s;
    public final gme t;
    public final LayoutInflater u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4f(Context context, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, jx5 jx5Var, hx5 hx5Var, gme gmeVar) {
        super(context);
        context.getClass();
        this.l = i;
        this.m = i2;
        this.n = num;
        this.o = num2;
        this.p = num3;
        this.q = num4;
        this.r = jx5Var;
        this.s = hx5Var;
        this.t = gmeVar;
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.u = from;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 6);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((w3f) obj).getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = this.u.inflate(R.layout.prediction_item, viewGroup, false);
        ComposeView composeView = (ComposeView) nq8.B(R.id.prediction_view, inflate);
        if (composeView != null) {
            return new z02(this, new ed((LinearLayout) inflate, 20, composeView));
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.prediction_view)));
        return null;
    }
}
