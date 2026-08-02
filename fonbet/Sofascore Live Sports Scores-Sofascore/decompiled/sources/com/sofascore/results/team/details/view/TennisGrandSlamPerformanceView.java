package com.sofascore.results.team.details.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a3;
import defpackage.av8;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.haa;
import defpackage.of3;
import defpackage.q8i;
import defpackage.y5j;
import defpackage.yqo;
import defpackage.z5j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/team/details/view/TennisGrandSlamPerformanceView;", "La3;", "Ly5j;", "<set-?>", CampaignEx.JSON_KEY_AD_K, "Le1d;", "getUiModel", "()Ly5j;", "setUiModel", "(Ly5j;)V", "uiModel", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TennisGrandSlamPerformanceView extends a3 {
    public static final /* synthetic */ int l = 0;

    /* renamed from: k, reason: from kotlin metadata */
    public final e1d uiModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TennisGrandSlamPerformanceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.uiModel = e.f(null);
        setVisibility(8);
    }

    private final y5j getUiModel() {
        return (y5j) ((eoh) this.uiModel).getValue();
    }

    private final void setUiModel(y5j y5jVar) {
        ((eoh) this.uiModel).setValue(y5jVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(388926217);
        int i2 = (av8Var.g(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            y5j uiModel = getUiModel();
            if (uiModel == null) {
                av8Var.d0(-1320797628);
                av8Var.s(false);
            } else {
                av8Var.d0(-1320797627);
                haa.f(yqo.H(-2028504706, av8Var, new z5j(uiModel)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new q8i(this, i, 23);
        }
    }

    public final void l(y5j y5jVar) {
        y5jVar.getClass();
        if (getVisibility() == 0) {
            return;
        }
        setVisibility(0);
        setUiModel(y5jVar);
    }
}
