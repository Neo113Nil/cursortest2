package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qs7 extends g7 {
    public final hwg l;
    public final Function0 m;
    public final LayoutInflater n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs7(Context context, hwg hwgVar, Function0 function0) {
        super(context);
        context.getClass();
        this.l = hwgVar;
        this.m = function0;
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.n = from;
        this.a.d = new qm4(21, context, this);
    }

    public final void G(String str, List list) {
        list.getClass();
        str.getClass();
        List j = b.j(new ps7(), new ps7());
        if (list.isEmpty()) {
            F(CollectionsKt.w0(a.c(1), j));
        } else {
            F(CollectionsKt.w0(a.c(new os7(str)), CollectionsKt.w0(list, j)));
        }
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        if (i == 1) {
            return Integer.valueOf(R.id.empty_grid_item);
        }
        return null;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return new th(this.i, arrayList);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj.equals(1)) {
            return 1;
        }
        if (obj instanceof os7) {
            return 0;
        }
        if (obj instanceof UniqueTournament) {
            return 2;
        }
        if (obj instanceof Team) {
            return 3;
        }
        if (obj instanceof Player) {
            return 4;
        }
        if (obj instanceof ps7) {
            return 5;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.n;
        if (i == 0) {
            return new ns7(z82.h(layoutInflater, viewGroup), 0);
        }
        if (i != 1) {
            if (i == 2) {
                return new ns7(z82.h(layoutInflater, viewGroup), 3);
            }
            if (i == 3) {
                return new ns7(z82.h(layoutInflater, viewGroup), 2);
            }
            if (i == 4) {
                return new ns7(z82.h(layoutInflater, viewGroup), 1);
            }
            if (i != 5) {
                ilg.c();
                return null;
            }
            View inflate = layoutInflater.inflate(R.layout.empty_recycler_layout, viewGroup, false);
            if (inflate != null) {
                return new r71(6, inflate);
            }
            yhk.s("rootView");
            return null;
        }
        View inflate2 = layoutInflater.inflate(R.layout.favorites_editor_empty_state, viewGroup, false);
        int i2 = R.id.empty_grid_item;
        View B = nq8.B(R.id.empty_grid_item, inflate2);
        if (B != null) {
            z82 b = z82.b(B);
            i2 = R.id.subtitle;
            TextView textView = (TextView) nq8.B(R.id.subtitle, inflate2);
            if (textView != null) {
                i2 = R.id.title;
                TextView textView2 = (TextView) nq8.B(R.id.title, inflate2);
                if (textView2 != null) {
                    return new vh(this, new ez0((ConstraintLayout) inflate2, b, textView, textView2, 9));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
        return null;
    }
}
