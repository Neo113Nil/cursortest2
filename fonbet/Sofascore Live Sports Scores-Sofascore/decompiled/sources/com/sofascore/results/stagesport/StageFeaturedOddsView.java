package com.sofascore.results.stagesport;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.odds.OddsCountryProvider;
import defpackage.a3;
import defpackage.av8;
import defpackage.d5i;
import defpackage.e1d;
import defpackage.e5i;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.f5i;
import defpackage.haa;
import defpackage.nv;
import defpackage.of3;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/stagesport/StageFeaturedOddsView;", "La3;", "Le5i;", "<set-?>", CampaignEx.JSON_KEY_AD_K, "Le1d;", "getOddsModel", "()Le5i;", "setOddsModel", "(Le5i;)V", "oddsModel", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageFeaturedOddsView extends a3 {
    public static final /* synthetic */ int m = 0;

    /* renamed from: k, reason: from kotlin metadata */
    public final e1d oddsModel;
    public OddsCountryProvider l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StageFeaturedOddsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.oddsModel = e.f(null);
    }

    private final e5i getOddsModel() {
        return (e5i) ((eoh) this.oddsModel).getValue();
    }

    public static final Unit l(StageFeaturedOddsView stageFeaturedOddsView, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            d5i.b(stageFeaturedOddsView.getOddsModel(), av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final void setOddsModel(e5i e5iVar) {
        ((eoh) this.oddsModel).setValue(e5iVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(428110593);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            haa.f(yqo.H(280143910, av8Var, new f5i(this)), av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f5i(this, i);
        }
    }

    public final void m() {
        ServerType serverType;
        v5i v5iVar;
        e5i oddsModel = getOddsModel();
        OddsCountryProvider oddsCountryProvider = this.l;
        if (oddsModel != null) {
            wmd wmdVar = oddsModel.c;
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
                nv.c0(context, str, oddsCountryProvider, v5iVar.a, wmdVar.a, vmd.RACE_RESULTS, null);
            }
        }
    }

    public final void n(OddsCountryProvider oddsCountryProvider, e5i e5iVar) {
        this.l = oddsCountryProvider;
        setOddsModel(e5iVar);
    }
}
