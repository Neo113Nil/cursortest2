package com.vk.attachpicker.impl.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.BaseFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.bwt0;
import xsna.iin0;
import xsna.msy;
import xsna.oz50;
import xsna.r8a0;
import xsna.ufk;
import xsna.uq50;
import xsna.vt30;

/* compiled from: PollPickerFragment.kt */
/* loaded from: classes15.dex */
public final class PollPickerFragment extends BaseFragment implements iin0 {
    public static final /* synthetic */ int W = 0;
    public final bpn0 S = new bpn0(new ufk(this, 29));
    public final bpn0 T = new bpn0(new vt30(this, 16));
    public final Object U = msy.a(LazyThreadSafetyMode.NONE, new uq50(this, 17));
    public ViewGroup V;

    /* compiled from: PollPickerFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(PollPickerFragment.class, null, null);
        }
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        if (this.V == null) {
            this.V = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.picker_toolbar_poll, (ViewGroup) null);
        }
        return this.V;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        if (i2 == -1 && i == 10009 && (activity = getActivity()) != null) {
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.poll_picker_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.poll_picker_create_btn);
        if (findViewById != null) {
            bwt0.i0(findViewById, new r8a0(this, 4));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.poll_picker_create_description);
        if (textView != null) {
            textView.setText(((Number) this.T.getValue()).intValue() == 1 ? R.string.poll_picker_channel_description : R.string.poll_picker_description);
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.V = null;
        super.onDestroyView();
    }
}
