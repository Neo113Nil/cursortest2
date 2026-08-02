package com.sofascore.results.dialog;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import defpackage.a5f;
import defpackage.bv;
import defpackage.d1f;
import defpackage.duf;
import defpackage.t1d;
import defpackage.tc3;
import defpackage.uic;
import defpackage.vz1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/dialog/RemoveAdsYearlyOfferBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "Lvz1;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RemoveAdsYearlyOfferBottomSheet extends ComposeModalBottomSheetDialog implements vz1 {
    public final KClass x = duf.a.getOrCreateKotlinClass(d1f.class);
    public long y;

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getE() {
        return new tc3(546426589, new t1d(this, 25), true);
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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        SharedPreferences d;
        SharedPreferences d2;
        super.onCreate(bundle);
        if (bundle == null) {
            Context requireContext = requireContext();
            requireContext.getClass();
            requireContext.getClass();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = requireContext.getApplicationContext();
                synchronized (uic.i) {
                    d2 = a5f.d(applicationContext);
                    uic.j = d2;
                }
                d2.getClass();
                sharedPreferences = d2;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.putLong("PREF_REMOVE_ADS_YEARLY_OFFER_LAST_SHOWN_TIMESTAMP", System.currentTimeMillis());
            Unit unit = Unit.a;
            edit.apply();
        }
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        requireContext2.getClass();
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = requireContext2.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext2);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences2 = d;
        }
        this.y = sharedPreferences2.getLong("PREF_REMOVE_ADS_YEARLY_OFFER_LAST_SHOWN_TIMESTAMP", 0L);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((LinearLayout) v().n).setVisibility(8);
        this.t.b = "50%_yearly";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AdsOfferModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
