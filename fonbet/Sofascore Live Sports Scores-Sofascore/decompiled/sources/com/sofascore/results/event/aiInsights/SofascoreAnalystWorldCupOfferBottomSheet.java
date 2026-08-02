package com.sofascore.results.event.aiInsights;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import defpackage.bv;
import defpackage.duf;
import defpackage.e1f;
import defpackage.fvg;
import defpackage.tc3;
import defpackage.vz1;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/aiInsights/SofascoreAnalystWorldCupOfferBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "Lvz1;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SofascoreAnalystWorldCupOfferBottomSheet extends ComposeModalBottomSheetDialog implements vz1 {
    public final KClass x = duf.a.getOrCreateKotlinClass(e1f.class);

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getE() {
        return new tc3(501786470, new fvg(this, 18), true);
    }

    @Override // defpackage.vz1
    /* renamed from: b, reason: from getter */
    public final KClass getE() {
        return this.x;
    }

    @Override // defpackage.vz1
    public final bv e() {
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.t.b = "world_cup2026";
        ((ImageView) v().c).setVisibility(0);
        ((ImageView) v().c).setImageResource(2131232923);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AIInsightsOfferModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
