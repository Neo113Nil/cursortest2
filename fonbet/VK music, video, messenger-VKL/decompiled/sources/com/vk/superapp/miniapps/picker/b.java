package com.vk.superapp.miniapps.picker;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.dto.hints.HintId;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vk.superapp.miniapps.picker.PickerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.cbn0;
import xsna.mf3;
import xsna.pla;
import xsna.q7n0;

/* compiled from: AppsPickerFragment.kt */
/* loaded from: classes6.dex */
public final class b implements k {
    public final /* synthetic */ AppsPickerFragment a;
    public final /* synthetic */ View b;

    public b(AppsPickerFragment appsPickerFragment, View view) {
        this.a = appsPickerFragment;
        this.b = view;
    }

    @Override // com.vk.superapp.miniapps.picker.k
    public final void e() {
        bpn0 bpn0Var = AppsPickerFragment.V;
        this.a.ko();
    }

    @Override // com.vk.superapp.miniapps.picker.k
    public final void f(PickerItem.c cVar) {
        cbn0 a = q7n0.a().a();
        AppsPickerFragment appsPickerFragment = this.a;
        cbn0.c(a, appsPickerFragment.requireContext(), cVar.f, null, appsPickerFragment.io(), null, 32);
        this.b.postDelayed(new mf3(appsPickerFragment, 0), 700L);
    }

    @Override // com.vk.superapp.miniapps.picker.k
    public final void g(PickerItem.d dVar) {
        FragmentActivity fragmentActivity;
        boolean z;
        bpn0 bpn0Var = AppsPickerFragment.V;
        AppsPickerFragment appsPickerFragment = this.a;
        Context mo2getContext = appsPickerFragment.mo2getContext();
        if (mo2getContext != null) {
            while (true) {
                z = mo2getContext instanceof FragmentActivity;
                if (z || !(mo2getContext instanceof ContextWrapper)) {
                    break;
                } else {
                    mo2getContext = ((ContextWrapper) mo2getContext).getBaseContext();
                }
            }
            fragmentActivity = (FragmentActivity) (z ? (Activity) mo2getContext : null);
        } else {
            fragmentActivity = null;
        }
        FragmentManager supportFragmentManager = fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            j jVar = new j();
            jVar.g1 = new c(appsPickerFragment, this.b, jVar, dVar);
            jVar.f1 = dVar;
            jVar.Td(supportFragmentManager, "apps_picker_confirm_dialog");
        }
    }

    @Override // com.vk.superapp.miniapps.picker.k
    public final void h() {
        AppsPickerFragment appsPickerFragment = this.a;
        i iVar = appsPickerFragment.S;
        if (iVar == null) {
            return;
        }
        List<PickerItem> y0 = iVar.y0();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) y0).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            PickerItem pickerItem = (PickerItem) next;
            if (!(pickerItem instanceof PickerItem.e) && pickerItem.a() != PickerItem.ItemId.BannerSeparator.h()) {
                arrayList.add(next);
            }
        }
        iVar.setItems(arrayList);
        if (AppsPickerFragment.a.$EnumSwitchMapping$0[appsPickerFragment.jo().ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        pla.e().b().b(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_BANNER_APPS.getId());
    }
}
