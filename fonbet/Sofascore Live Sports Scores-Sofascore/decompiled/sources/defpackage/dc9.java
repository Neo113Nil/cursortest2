package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dc9 extends p8 {
    public final bv1 c;
    public final Function1 d;
    public Season e;
    public final e1d f;
    public final e1d g;
    public rlj h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dc9(bv1 bv1Var, mxa mxaVar) {
        super(r0);
        String Q;
        mxaVar.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
        constraintLayout.getClass();
        this.c = bv1Var;
        this.d = mxaVar;
        this.f = e.f(km5.a);
        this.g = e.f(null);
        TextView textView = (TextView) bv1Var.d;
        Q = hkg.Q(this.b, R.string.top_players, null, new Object[0]);
        textView.setText(Q);
        ((ComposeView) bv1Var.f).setContent(new tc3(-1818583230, new hl7(this, 26), true));
        ((TextView) bv1Var.c).setOnClickListener(new cd5(this, 12));
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        rlj rljVar;
        Object obj2;
        tb9 tb9Var = (tb9) obj;
        tb9Var.getClass();
        List list = tb9Var.c;
        e1d e1dVar = this.f;
        ((eoh) e1dVar).setValue(list);
        Season season = this.e;
        Season season2 = tb9Var.e;
        if (Intrinsics.c(season, season2) || this.h == null) {
            rljVar = this.h;
            if (rljVar == null) {
                rljVar = (rlj) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue());
            }
        } else {
            Iterator it = ((List) ((eoh) e1dVar).getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String g0 = ((rlj) next).g0();
                rlj rljVar2 = this.h;
                if (Intrinsics.c(g0, rljVar2 != null ? rljVar2.g0() : null)) {
                    obj2 = next;
                    break;
                }
            }
            rljVar = (rlj) obj2;
            if (rljVar == null) {
                rljVar = (rlj) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue());
            }
        }
        e1d e1dVar2 = this.g;
        ((eoh) e1dVar2).setValue(rljVar);
        this.h = (rlj) ((eoh) e1dVar2).getValue();
        this.e = season2;
        d((rlj) ((eoh) e1dVar2).getValue());
    }

    public final void d(rlj rljVar) {
        List f0;
        List f02;
        List f03;
        Boolean bool;
        boolean z = rljVar instanceof cmj;
        Context context = this.b;
        slj sljVar = null;
        String Q = z ? hkg.Q(context, R.string.top_players, null, new Object[0]) : rljVar instanceof moj ? context.getString(R.string.top_teams) : rljVar instanceof qmj ? context.getString(R.string.top_stats) : null;
        bv1 bv1Var = this.c;
        if (Q != null) {
            ((TextView) bv1Var.d).setText(Q);
        }
        Season season = this.e;
        Boolean valueOf = season != null ? Boolean.valueOf(season.isAllTimeSeason()) : null;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.c(valueOf, bool2)) {
            if (rljVar != null) {
                context.getClass();
                bool = Boolean.valueOf(Intrinsics.c(rljVar.g0(), context.getString(R.string.average_sofascore_rating)));
            } else {
                bool = null;
            }
            if (Intrinsics.c(bool, bool2)) {
                ((ImageView) bv1Var.e).setVisibility(0);
                z8e.a0((ImageView) bv1Var.e, 1000L, new ij8(9, this, rljVar));
                e((j22) bv1Var.g, (rljVar != null || (f03 = rljVar.f0()) == null) ? null : (slj) CollectionsKt.a0(0, f03));
                e((j22) bv1Var.h, (rljVar != null || (f02 = rljVar.f0()) == null) ? null : (slj) CollectionsKt.a0(1, f02));
                j22 j22Var = (j22) bv1Var.j;
                if (rljVar != null && (f0 = rljVar.f0()) != null) {
                    sljVar = (slj) CollectionsKt.a0(2, f0);
                }
                e(j22Var, sljVar);
            }
        }
        ((ImageView) bv1Var.e).setVisibility(8);
        ((ImageView) bv1Var.e).setOnClickListener(null);
        e((j22) bv1Var.g, (rljVar != null || (f03 = rljVar.f0()) == null) ? null : (slj) CollectionsKt.a0(0, f03));
        e((j22) bv1Var.h, (rljVar != null || (f02 = rljVar.f0()) == null) ? null : (slj) CollectionsKt.a0(1, f02));
        j22 j22Var2 = (j22) bv1Var.j;
        if (rljVar != null) {
            sljVar = (slj) CollectionsKt.a0(2, f0);
        }
        e(j22Var2, sljVar);
    }

    public final void e(j22 j22Var, final slj sljVar) {
        ConstraintLayout constraintLayout = j22Var.b;
        constraintLayout.getClass();
        final int i = 0;
        constraintLayout.setVisibility(sljVar != null ? 0 : 8);
        constraintLayout.getClass();
        aba.y(constraintLayout, 0, 3);
        if (sljVar instanceof fmj) {
            aik.r(j22Var, this.b, (fmj) sljVar, Sports.FOOTBALL, 0, false);
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: cc9
                public final /* synthetic */ dc9 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    slj sljVar2 = sljVar;
                    dc9 dc9Var = this.b;
                    switch (i2) {
                        case 0:
                            int i3 = PlayerActivity.Z;
                            jle.q(dc9Var.b, ((fmj) sljVar2).a.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                            break;
                        case 1:
                            int i4 = TeamActivity.Z;
                            jle.r(dc9Var.b, ((noj) sljVar2).a.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                        default:
                            loj lojVar = (loj) sljVar2;
                            EventActivity.h0.C(dc9Var.b, lojVar.b.getId(), lojVar.a.getId());
                            break;
                    }
                }
            });
        } else if (sljVar instanceof noj) {
            aik.t(j22Var, this.b, (noj) sljVar, 0, false, false);
            final int i2 = 1;
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: cc9
                public final /* synthetic */ dc9 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i2;
                    slj sljVar2 = sljVar;
                    dc9 dc9Var = this.b;
                    switch (i22) {
                        case 0:
                            int i3 = PlayerActivity.Z;
                            jle.q(dc9Var.b, ((fmj) sljVar2).a.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                            break;
                        case 1:
                            int i4 = TeamActivity.Z;
                            jle.r(dc9Var.b, ((noj) sljVar2).a.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                        default:
                            loj lojVar = (loj) sljVar2;
                            EventActivity.h0.C(dc9Var.b, lojVar.b.getId(), lojVar.a.getId());
                            break;
                    }
                }
            });
        } else if (sljVar instanceof loj) {
            aik.s(j22Var, this.b, (loj) sljVar, 0, false);
            final int i3 = 2;
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: cc9
                public final /* synthetic */ dc9 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i3;
                    slj sljVar2 = sljVar;
                    dc9 dc9Var = this.b;
                    switch (i22) {
                        case 0:
                            int i32 = PlayerActivity.Z;
                            jle.q(dc9Var.b, ((fmj) sljVar2).a.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                            break;
                        case 1:
                            int i4 = TeamActivity.Z;
                            jle.r(dc9Var.b, ((noj) sljVar2).a.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                        default:
                            loj lojVar = (loj) sljVar2;
                            EventActivity.h0.C(dc9Var.b, lojVar.b.getId(), lojVar.a.getId());
                            break;
                    }
                }
            });
        }
    }
}
