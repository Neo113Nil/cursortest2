package com.vk.money.createtransfer.people.pin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.api.money.MoneySendTransfer;
import com.vk.money.pin.PinFragment;
import java.util.Arrays;
import xsna.a0a;
import xsna.qla0;
import xsna.qp4;
import xsna.xbv0;
import xsna.xwk;

/* compiled from: VkPayPinFragment.kt */
/* loaded from: classes3.dex */
public final class VkPayPinFragment extends PinFragment {
    public static final /* synthetic */ int c0 = 0;

    /* compiled from: VkPayPinFragment.kt */
    public static final class a extends PinFragment.a {
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        qla0 qla0Var = (qla0) this.S;
        if (qla0Var != null) {
            return qla0Var.a0();
        }
        return true;
    }

    @Override // com.vk.money.pin.PinFragment
    public final qla0 jo(Bundle bundle) {
        return new xbv0(bundle != null ? (MoneySendTransfer) bundle.getParcelable("money_transfer_key") : null, this, getArguments().getInt("symbols_count", 4));
    }

    public final void mo() {
        xwk.d().e().a(getActivity(), String.format("https://%s/vkpay#action=pin-restore", Arrays.copyOf(new Object[]{a0a.d}, 1)));
    }

    @Override // com.vk.money.pin.PinFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        Toolbar toolbar = this.U;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setNavigationOnClickListener(new qp4(this, 12));
        return onCreateView;
    }
}
