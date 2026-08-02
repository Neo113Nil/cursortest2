package com.sofascore.results.country;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sofascore.results.R;
import defpackage.duf;
import defpackage.ev3;
import defpackage.fv2;
import defpackage.h63;
import defpackage.mqi;
import defpackage.otk;
import defpackage.ov3;
import defpackage.tc3;
import defpackage.ypa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/sofascore/results/country/CountryListBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "Lgv9;", "Luv3;", "allCountries", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CountryListBottomSheet extends Hilt_CountryListBottomSheet {
    public final otk C = new otk(duf.a.getOrCreateKotlinClass(ov3.class), new ev3(this, 0), new ev3(this, 2), new ev3(this, 1));
    public final mqi D = ypa.b(new h63(this, 8));
    public final tc3 E = new tc3(857497299, new fv2(this, 5), true);

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getE() {
        return this.E;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n(0, R.style.ResizableBottomSheetDialog);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        parent.getClass();
        BottomSheetBehavior C = BottomSheetBehavior.C((View) parent);
        C.K = true;
        C.J(true);
        C.M(3);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "FeedCountrySelectorModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getX() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.feed_filter_which_country);
        string.getClass();
        return string;
    }
}
