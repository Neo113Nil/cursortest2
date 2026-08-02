package com.vk.superapp.miniapps.picker;

import android.os.Bundle;
import com.vk.bridges.ProfileType;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import xsna.bpn0;
import xsna.l7n0;
import xsna.nl;
import xsna.o25;

/* compiled from: AppsGamesPickerFactory.kt */
/* loaded from: classes6.dex */
public final class a implements l7n0 {
    @Override // xsna.l7n0
    public final nl a(UserId userId) {
        ProfileType c0 = o25.a().c0();
        if (userId.equals(o25.a().c()) || c0 != ProfileType.NORMAL) {
            return null;
        }
        bpn0 bpn0Var = AppsPickerFragment.V;
        AppsPickerFragment.PickerType pickerType = AppsPickerFragment.PickerType.Apps;
        AppsPickerFragment appsPickerFragment = new AppsPickerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_picker_type_key", pickerType);
        bundle.putParcelable("extra_peer_id_key", userId);
        appsPickerFragment.setArguments(bundle);
        return new nl(appsPickerFragment, false);
    }
}
