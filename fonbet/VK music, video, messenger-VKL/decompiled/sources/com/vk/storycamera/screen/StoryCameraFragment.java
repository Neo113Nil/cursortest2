package com.vk.storycamera.screen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import java.util.List;
import xsna.aeg0;
import xsna.bl30;
import xsna.cm9;
import xsna.d0m0;
import xsna.e0m0;
import xsna.g0m0;
import xsna.iah0;
import xsna.ies;
import xsna.kes;
import xsna.mnh0;
import xsna.nht;
import xsna.oen;
import xsna.oz50;
import xsna.p90;
import xsna.pt20;
import xsna.tb0;
import xsna.tvo;
import xsna.uds;
import xsna.vds;
import xsna.wc2;
import xsna.xds;

/* compiled from: StoryCameraFragment.kt */
/* loaded from: classes6.dex */
public final class StoryCameraFragment extends FragmentImpl implements ies, kes, xds, uds, vds, g0m0, tvo.a, nht, tb0 {
    public static final /* synthetic */ int T = 0;
    public StoryCameraParams O;
    public d0m0 P;
    public int Q;
    public final Handler N = new Handler(Looper.getMainLooper());
    public final int R = -16777216;
    public final int S = -16777216;

    /* compiled from: StoryCameraFragment.kt */
    public static final class a extends oz50 {
        public a(StoryCameraParams storyCameraParams) {
            super(StoryCameraFragment.class, null, null);
            this.j.putParcelable("camera_params", storyCameraParams);
        }
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        VideoFeatures videoFeatures = VideoFeatures.IMPLEMENT_GDPR_DIALOG_CALLBACK_IN_VK_VIDEO_BOTTOM_NAVIGATION;
        videoFeatures.getClass();
        if (b.A.a(videoFeatures)) {
            d0m0 d0m0Var = this.P;
            if (d0m0Var == null) {
                d0m0Var = null;
            }
            d0m0Var.K0(i, strArr);
        }
    }

    @Override // xsna.vds
    public final int Q0() {
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        return d0m0Var.getScreenLockedOrientation();
    }

    @Override // xsna.kes
    public final boolean Xf() {
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        return d0m0Var.a0();
    }

    @Override // xsna.g0m0
    public final void ad(int i, Intent intent) {
        if (intent == null) {
            setResult(i);
        } else {
            setResult(i, intent);
        }
    }

    @Override // xsna.xoo0
    public final int l2() {
        return this.R;
    }

    @Override // xsna.g0m0
    public final void o5(boolean z) {
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.Hj();
        this.y = z;
        finish();
    }

    @Override // xsna.woo0
    public final int o7() {
        return this.S;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1010 || i2 != -1 || intent == null) {
            d0m0 d0m0Var = this.P;
            (d0m0Var != null ? d0m0Var : null).onActivityResult(i, i2, intent);
            return;
        }
        String stringExtra = intent.getStringExtra("qr_code_result");
        if (stringExtra == null) {
            stringExtra = "";
        }
        Intent c = pt20.b().c(stringExtra);
        d0m0 d0m0Var2 = this.P;
        (d0m0Var2 != null ? d0m0Var2 : null).Md(c, true);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.O = (StoryCameraParams) requireArguments().getParcelable("camera_params");
        e0m0 b = pt20.b();
        FragmentActivity kn = kn();
        StoryCameraParams storyCameraParams = this.O;
        StoryCameraParams storyCameraParams2 = storyCameraParams == null ? null : storyCameraParams;
        if (storyCameraParams == null) {
            storyCameraParams = null;
        }
        cm9 a2 = b.a(kn, storyCameraParams2, this, storyCameraParams.z ? new bl30(this, 23) : null);
        this.P = a2;
        if (a2 == null) {
            a2 = null;
        }
        StoryCameraParams storyCameraParams3 = this.O;
        String str = (storyCameraParams3 == null ? null : storyCameraParams3).c;
        if (storyCameraParams3 == null) {
            storyCameraParams3 = null;
        }
        a2.v1(str, storyCameraParams3.b);
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.h3(bundle);
        Object obj = this.P;
        if (obj == null) {
            obj = null;
        }
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        StoryCameraParams storyCameraParams = this.O;
        if (storyCameraParams == null) {
            storyCameraParams = null;
        }
        d0m0Var.G2(storyCameraParams.c);
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
        this.N.removeCallbacksAndMessages(null);
        d0m0 d0m0Var2 = this.P;
        (d0m0Var2 != null ? d0m0Var2 : null).onDestroy();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            mnh0.y(this.Q, activity);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.T8(i, strArr, iArr);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        FragmentActivity activity;
        super.onResume();
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onResume();
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            Window window = activity2.getWindow();
            Integer valueOf = window != null ? Integer.valueOf(window.getStatusBarColor()) : null;
            if (valueOf != null) {
                i = valueOf.intValue();
                this.Q = i;
                activity = getActivity();
                if (activity != null && !iah0.n(activity) && !oen.a()) {
                    p90.d(activity);
                }
                this.N.post(new wc2(this, 18));
            }
        }
        i = this.R;
        this.Q = i;
        activity = getActivity();
        if (activity != null) {
            p90.d(activity);
        }
        this.N.post(new wc2(this, 18));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onStart();
        StoryCameraParams storyCameraParams = this.O;
        if (storyCameraParams == null) {
            storyCameraParams = null;
        }
        if (storyCameraParams.z) {
            d0m0 d0m0Var2 = this.P;
            (d0m0Var2 != null ? d0m0Var2 : null).C9();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onStop();
        StoryCameraParams storyCameraParams = this.O;
        if (storyCameraParams == null) {
            storyCameraParams = null;
        }
        if (storyCameraParams.z) {
            d0m0 d0m0Var2 = this.P;
            (d0m0Var2 != null ? d0m0Var2 : null).Nl();
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.pc(i, list);
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        d0m0 d0m0Var = this.P;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.wi(i, list);
    }
}
