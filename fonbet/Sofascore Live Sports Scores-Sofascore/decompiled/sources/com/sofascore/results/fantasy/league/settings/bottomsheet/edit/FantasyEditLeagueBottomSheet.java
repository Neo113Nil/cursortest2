package com.sofascore.results.fantasy.league.settings.bottomsheet.edit;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.sofascore.results.R;
import defpackage.aw6;
import defpackage.duf;
import defpackage.dw6;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.j37;
import defpackage.joa;
import defpackage.otk;
import defpackage.t06;
import defpackage.tc3;
import defpackage.xp6;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yso;
import defpackage.zv6;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/league/settings/bottomsheet/edit/FantasyEditLeagueBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "Lj67;", "league", "Lcw6;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyEditLeagueBottomSheet extends Hilt_FantasyEditLeagueBottomSheet {
    public final otk B;
    public final otk C;
    public final boolean D;

    public FantasyEditLeagueBottomSheet() {
        joa a = ypa.a(ysa.c, new t06(new aw6(this, 3), 24));
        fuf fufVar = duf.a;
        this.B = new otk(fufVar.getOrCreateKotlinClass(dw6.class), new xp6(a, 11), new fi5(this, a, 24), new xp6(a, 12));
        this.C = new otk(fufVar.getOrCreateKotlinClass(j37.class), new aw6(this, 0), new aw6(this, 2), new aw6(this, 1));
        this.D = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View C(LayoutInflater layoutInflater) {
        return yso.s(this, new tc3(1740843005, new zv6(this, 0), true));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        return yso.s(this, new tc3(-1337369904, new zv6(this, 1), true));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n(0, R.style.ResizableBottomSheetDialog);
        this.g = false;
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "EditLeagueModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
