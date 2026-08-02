package com.sofascore.results.main.fantasy.center.elitefaceoff;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.duf;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.iw6;
import defpackage.jo6;
import defpackage.joa;
import defpackage.kw6;
import defpackage.otk;
import defpackage.t06;
import defpackage.tc3;
import defpackage.xp6;
import defpackage.ypa;
import defpackage.ypb;
import defpackage.yrh;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/main/fantasy/center/elitefaceoff/FantasyEliteFaceoffIntroBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyEliteFaceoffIntroBottomSheet extends Hilt_FantasyEliteFaceoffIntroBottomSheet {
    public final otk B;
    public final otk C;
    public final boolean D;

    public FantasyEliteFaceoffIntroBottomSheet() {
        joa a = ypa.a(ysa.c, new t06(new iw6(this, 3), 25));
        fuf fufVar = duf.a;
        this.B = new otk(fufVar.getOrCreateKotlinClass(kw6.class), new xp6(a, 13), new fi5(this, a, 25), new xp6(a, 14));
        this.C = new otk(fufVar.getOrCreateKotlinClass(ypb.class), new iw6(this, 0), new iw6(this, 2), new iw6(this, 1));
        this.D = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        yrh a = yrh.a(layoutInflater, (FrameLayout) v().l);
        a.b.setContent(new tc3(326588617, new jo6(this, 8), true));
        CoordinatorLayout coordinatorLayout = a.a;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((LinearLayout) v().n).setVisibility(8);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "FantasyFaceoffIntroModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
