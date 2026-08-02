package com.sofascore.results.event.aiInsights;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.bv;
import defpackage.cg4;
import defpackage.duf;
import defpackage.fuh;
import defpackage.fvg;
import defpackage.g1f;
import defpackage.guh;
import defpackage.h1f;
import defpackage.joa;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.vz1;
import defpackage.w9g;
import defpackage.wca;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/event/aiInsights/SofascoreAnalystTennisPromoBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "Lvz1;", "<init>", "()V", "guh", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SofascoreAnalystTennisPromoBottomSheet extends Hilt_SofascoreAnalystTennisPromoBottomSheet implements vz1 {
    public final boolean C = true;
    public cg4 D;
    public final joa E;
    public final joa F;

    public SofascoreAnalystTennisPromoBottomSheet() {
        fuh fuhVar = new fuh(this, 0);
        ysa ysaVar = ysa.c;
        this.E = ypa.a(ysaVar, fuhVar);
        this.F = ypa.a(ysaVar, new fuh(this, 1));
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getE() {
        return new tc3(-736375450, new fvg(this, 16), true);
    }

    @Override // defpackage.vz1
    /* renamed from: b */
    public final KClass getX() {
        int ordinal = ((guh) this.E.getValue()).ordinal();
        if (ordinal == 0) {
            return duf.a.getOrCreateKotlinClass(g1f.class);
        }
        if (ordinal == 1) {
            return duf.a.getOrCreateKotlinClass(h1f.class);
        }
        zzl.b();
        return null;
    }

    @Override // defpackage.vz1
    public final bv e() {
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (((guh) this.E.getValue()) == guh.f) {
            this.t.a = Integer.valueOf(((Number) this.F.getValue()).intValue());
        }
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new w9g(this, null, 14), 3);
        ((LinearLayout) v().n).setVisibility(8);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "TennisPromoModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.C;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
