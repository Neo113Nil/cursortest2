package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vs7 extends g7 {
    public final hwg l;
    public final Function0 m;
    public final LayoutInflater n;
    public String o;

    public vs7(BaseActivity baseActivity, hwg hwgVar, Function0 function0) {
        super(baseActivity);
        this.l = hwgVar;
        this.m = function0;
        LayoutInflater from = LayoutInflater.from(baseActivity);
        from.getClass();
        this.n = from;
        this.o = "";
        this.a.d = new qm4(22, baseActivity, this);
    }

    @Override // defpackage.g7
    public final void F(List list) {
        list.getClass();
        if (list.isEmpty()) {
            super.F(list);
            return;
        }
        int ordinal = this.l.ordinal();
        Context context = this.b;
        super.F(CollectionsKt.w0(list, ordinal != 1 ? ordinal != 2 ? ordinal != 4 ? a.c(context.getString(R.string.favorite_trending_in_area)) : a.c(context.getString(R.string.trending_competitions)) : a.c(context.getString(R.string.trending_athletes)) : a.c(context.getString(R.string.trending_teams))));
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return !(obj instanceof String);
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return new th(this.i, arrayList);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof String) {
            return 0;
        }
        if (obj instanceof UniqueTournament) {
            return 1;
        }
        if (obj instanceof Team) {
            return 2;
        }
        if (obj instanceof Player) {
            return 3;
        }
        if (obj instanceof us7) {
            return 4;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.n;
        if (i == 0) {
            return new wh(lqb.a(layoutInflater.inflate(R.layout.main_section_left_with_icon, viewGroup, false)));
        }
        if (i == 1) {
            return new ts7(z82.k(layoutInflater, viewGroup), 1);
        }
        if (i == 2) {
            return new vh(this, z82.k(layoutInflater, viewGroup));
        }
        if (i == 3) {
            return new ts7(z82.k(layoutInflater, viewGroup), 0);
        }
        if (i != 4) {
            ilg.c();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.list_item_favorites_show_more, viewGroup, false);
        if (((TextView) nq8.B(R.id.team_name, inflate)) == null) {
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.team_name)));
            return null;
        }
        MaterialCardView materialCardView = (MaterialCardView) inflate;
        materialCardView.getClass();
        return new r71(7, materialCardView);
    }
}
