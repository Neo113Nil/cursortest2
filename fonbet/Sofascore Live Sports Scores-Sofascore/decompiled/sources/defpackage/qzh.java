package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.sofascore.results.stagesport.StageCategoryActivity;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class qzh extends w0 implements hc6 {
    public final int q;
    public final LayoutInflater r;
    public final ArrayList s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzh(Context context) {
        super(context);
        context.getClass();
        this.q = 16;
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.r = from;
        this.s = new ArrayList();
        this.a.d = new pte(this, 21);
    }

    @Override // defpackage.w0
    public void G(t54 t54Var, int i, int i2, AdBannerView adBannerView) {
        super.G(t54Var, i, i2, adBannerView);
        adBannerView.setBackgroundColor(this.b.getColor(R.color.surface_1));
    }

    public final void O(View view, Object obj) {
        boolean z = obj instanceof y21;
        Context context = this.b;
        if (z) {
            wxf wxfVar = EventActivity.h0;
            wxf.B(context, ((y21) obj).d().getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            return;
        }
        if (obj instanceof lrj) {
            Tournament tournament = ((lrj) obj).a;
            if (!Intrinsics.c(tournament.getCategory().getSport().getSlug(), Sports.MMA)) {
                LeagueActivity.h0.z(context, tournament);
                return;
            } else {
                int i = MmaFightNightActivity.R;
                x2a.S(tournament.getId(), context);
                return;
            }
        }
        if (obj instanceof Transfer) {
            Calendar calendar = ke0.a;
            ke0.g(context, v8a.t(context, (Transfer) obj), 0);
        } else if (obj instanceof nak) {
            int i2 = StageCategoryActivity.R;
            yfa.J(context, ((nak) obj).a);
        } else if (obj instanceof m5i) {
            fff fffVar = StageDetailsActivity.T;
            Stage stage = ((m5i) obj).a;
            fffVar.g(context, stage, Integer.valueOf(stage.getId()));
        }
    }

    public int P() {
        return this.q;
    }

    @Override // defpackage.w0
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public ame I(ArrayList arrayList) {
        return new ame(this.i, arrayList);
    }

    public boolean R() {
        return false;
    }

    public boolean S() {
        return false;
    }

    public boolean T() {
        return false;
    }

    public void U() {
        Event d;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            y21 y21Var = obj instanceof y21 ? (y21) obj : null;
            if (y21Var != null && (d = y21Var.d()) != null) {
                notifyItemChanged(this.g.size() + i, new scb(d));
            }
        }
    }

    public Integer a(int i) {
        Integer valueOf = Integer.valueOf(R.id.card_content);
        haf hafVar = pzh.b;
        if (i == 0) {
            return valueOf;
        }
        haf hafVar2 = pzh.b;
        if (i == 5) {
            return valueOf;
        }
        haf hafVar3 = pzh.b;
        if (i == 7) {
            return valueOf;
        }
        haf hafVar4 = pzh.b;
        if (i == 8) {
            return valueOf;
        }
        haf hafVar5 = pzh.b;
        if (i == 4) {
            return valueOf;
        }
        haf hafVar6 = pzh.b;
        if (i == 2) {
            return valueOf;
        }
        return null;
    }

    public boolean j(int i, Object obj) {
        if (i < 0) {
            return false;
        }
        kp5 kp5Var = pzh.f;
        if (i < kp5Var.size()) {
            return ((pzh) kp5Var.get(i)).a;
        }
        return false;
    }

    @Override // defpackage.hc6
    public final void k() {
        Iterator it = this.i.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            jfj jfjVar = null;
            if (i < 0) {
                b.q();
                throw null;
            }
            if (next instanceof y21) {
                y21 y21Var = (y21) next;
                if (Intrinsics.c(y21Var.d().getStatus().getType(), StatusKt.STATUS_IN_PROGRESS)) {
                    jfj jfjVar2 = y21Var.h;
                    if (jfjVar2 != null) {
                        jfjVar = jfj.a(jfjVar2, s9a.v(this.b, y21Var.d(), y21Var.d().getHideDate()), null, 6);
                    }
                    y21Var.h = jfjVar;
                    notifyItemChanged(this.g.size() + i, new ucb(y21Var.d()));
                }
            }
            i = i2;
        }
    }

    @Override // defpackage.w0, defpackage.g7
    public int v(Object obj) {
        obj.getClass();
        if (obj instanceof mj8) {
            haf hafVar = pzh.b;
            return 5;
        }
        if (obj instanceof n5j) {
            haf hafVar2 = pzh.b;
            return 7;
        }
        if (obj instanceof hr1) {
            haf hafVar3 = pzh.b;
            return 8;
        }
        if (obj instanceof j04) {
            haf hafVar4 = pzh.b;
            return 4;
        }
        if (obj instanceof hm1) {
            haf hafVar5 = pzh.b;
            return 1;
        }
        if (obj instanceof y21) {
            haf hafVar6 = pzh.b;
            return 0;
        }
        if (obj instanceof lrj) {
            haf hafVar7 = pzh.b;
            return 2;
        }
        if (obj instanceof krj) {
            haf hafVar8 = pzh.b;
            return 3;
        }
        if (obj instanceof Transfer) {
            haf hafVar9 = pzh.b;
            return 22;
        }
        if (obj instanceof CustomizableDivider) {
            haf hafVar10 = pzh.b;
            return 9;
        }
        if (obj instanceof j29) {
            haf hafVar11 = pzh.b;
            return 10;
        }
        super.v(obj);
        return Sdk.SDKError.Reason.AD_NO_FILL_VALUE;
    }

    @Override // defpackage.w0, defpackage.g7
    public p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        LayoutInflater layoutInflater = this.r;
        if (i == 4) {
            return new k04(p12.e(layoutInflater, viewGroup), null, P(), 2);
        }
        if (i == 0) {
            return new ir1(bcb.a(layoutInflater, viewGroup), R(), false, (sl6) null, P(), 12);
        }
        if (i == 5) {
            return new nj8(pvk.a(layoutInflater, viewGroup), R(), (sl6) null, P(), 4);
        }
        if (i == 7) {
            return new nj8(qvk.a(layoutInflater, viewGroup), R(), (sl6) null, P(), 4);
        }
        if (i == 8) {
            return new ir1(j22.d(layoutInflater, viewGroup), R(), (sl6) null, T(), P(), 4);
        }
        if (i == 2) {
            return new wrj(zl.e(layoutInflater, viewGroup), false, P(), S(), 18);
        }
        if (i == 3) {
            return new j8i(u22.e(layoutInflater, viewGroup), this instanceof ehe);
        }
        if (i == 22) {
            ConstraintLayout constraintLayout = (ConstraintLayout) nr1.c(layoutInflater.inflate(R.layout.sport_recycler_transfer_row, viewGroup, false)).c;
            constraintLayout.getClass();
            return new vh(this, constraintLayout);
        }
        if (i == 9) {
            return new wh(new SofaDivider(this.b, null, 6));
        }
        if (i != 10) {
            return super.z(viewGroup, i);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) v82.g(layoutInflater, viewGroup).b;
        constraintLayout2.getClass();
        return new wh(constraintLayout2);
    }
}
