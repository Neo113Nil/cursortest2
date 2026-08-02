package com.sofascore.results.wc26.bottomSheet;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sofascore.results.R;
import defpackage.bjl;
import defpackage.duf;
import defpackage.kv;
import defpackage.lqj;
import defpackage.njl;
import defpackage.nv;
import defpackage.otk;
import defpackage.qkl;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.z45;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\u0014\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/wc26/bottomSheet/WorldCupTeamPickerBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "Lgv9;", "Luv3;", "countries", "", "selectedCountryAlpha2", "Lvnb;", "Loil;", "state", "selectedCountry", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WorldCupTeamPickerBottomSheet extends Hilt_WorldCupTeamPickerBottomSheet {
    public boolean D;
    public final otk C = new otk(duf.a.getOrCreateKotlinClass(qkl.class), new bjl(this, 0), new bjl(this, 2), new bjl(this, 1));
    public final tc3 E = new tc3(-1621702415, new lqj(this, 21), true);

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getY() {
        return this.E;
    }

    public final qkl L() {
        return (qkl) this.C.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        Context context = getContext();
        if (context != null) {
            nv.z0(context, kv.CLICK, !this.D ? "open_spotlight_team_picker" : "choose_spotlight_team", "featured_tournament_tab");
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((LinearLayout) v().n).setBackground(null);
        ((ImageView) v().e).setBackground(requireContext().getDrawable(R.drawable.wc_26_bottom_sheet_bg_pattern));
        ((ImageView) v().d).setBackground(requireContext().getDrawable(R.drawable.wc_26_bottom_sheet_bg_pattern));
        z8e.V(requireContext().getColor(R.color.on_color_secondary), (ImageView) v().h);
        ((ImageView) v().c).setBackgroundColor(requireContext().getColor(R.color.graphics_dark));
        ((ImageView) v().c).setVisibility(0);
        ((ImageView) v().e).setVisibility(0);
        ((ImageView) v().d).setVisibility(0);
        ((ImageView) v().d).setRotationX(180.0f);
        ((ImageView) v().d).setRotationY(180.0f);
        qkl L = L();
        xw3.L(un0.z(L), z45.a, null, new njl(L, null, 2), 2);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "SpotlightTeamPickerModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getC() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
