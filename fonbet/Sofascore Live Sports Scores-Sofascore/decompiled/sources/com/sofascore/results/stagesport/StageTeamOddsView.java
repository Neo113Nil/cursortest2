package com.sofascore.results.stagesport;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import defpackage.a3;
import defpackage.av8;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.fvg;
import defpackage.haa;
import defpackage.l98;
import defpackage.lz;
import defpackage.m8i;
import defpackage.n7g;
import defpackage.n8i;
import defpackage.n9e;
import defpackage.nv;
import defpackage.o7g;
import defpackage.of3;
import defpackage.s5h;
import defpackage.utc;
import defpackage.v5i;
import defpackage.vmd;
import defpackage.wmd;
import defpackage.y5i;
import defpackage.yqo;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/stagesport/StageTeamOddsView;", "La3;", "Ln8i;", "<set-?>", CampaignEx.JSON_KEY_AD_K, "Le1d;", "getOddsModel", "()Ln8i;", "setOddsModel", "(Ln8i;)V", "oddsModel", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageTeamOddsView extends a3 {
    public static final /* synthetic */ int n = 0;

    /* renamed from: k, reason: from kotlin metadata */
    public final e1d oddsModel;
    public OddsCountryProvider l;
    public boolean m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StageTeamOddsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.oddsModel = e.f(null);
        this.m = true;
    }

    private final n8i getOddsModel() {
        return (n8i) ((eoh) this.oddsModel).getValue();
    }

    public static final Unit l(StageTeamOddsView stageTeamOddsView, n7g n7gVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            m8i.a(stageTeamOddsView.getOddsModel(), l98.e0(n9e.q(l98.c0(utc.a, 8.0f, 4.0f), lz.D(R.color.surface_1, av8Var), n7gVar), 16.0f, 12.0f, 16.0f, 16.0f), av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final void setOddsModel(n8i n8iVar) {
        ((eoh) this.oddsModel).setValue(n8iVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2140052451);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            haa.f(yqo.H(581092872, av8Var, new s5h(12, this, o7g.a(16.0f))), av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fvg(this, i, 29);
        }
    }

    public final void m() {
        ServerType serverType;
        v5i v5iVar;
        n8i oddsModel = getOddsModel();
        OddsCountryProvider oddsCountryProvider = this.l;
        if (oddsModel != null) {
            wmd wmdVar = oddsModel.d;
            if (oddsCountryProvider != null) {
                Context context = getContext();
                context.getClass();
                String str = wmdVar.e;
                wmd wmdVar2 = wmdVar.h;
                if (wmdVar2 == null || (serverType = wmdVar2.b) == null) {
                    serverType = wmdVar.b;
                }
                switch (serverType == null ? -1 : y5i.a[serverType.ordinal()]) {
                    case 1:
                    case 2:
                        v5iVar = v5i.Practice;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        v5iVar = v5i.Qualifying;
                        break;
                    case 7:
                    default:
                        v5iVar = v5i.Race;
                        break;
                    case 8:
                        v5iVar = v5i.Season;
                        break;
                }
                nv.c0(context, str, oddsCountryProvider, v5iVar.a, wmdVar.a, this.m ? vmd.DRIVER_INFO : vmd.CONSTRUCTOR_INFO, null);
            }
        }
    }

    public final void n(OddsCountryProvider oddsCountryProvider, n8i n8iVar) {
        this.l = oddsCountryProvider;
        setOddsModel(n8iVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StageTeamOddsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
