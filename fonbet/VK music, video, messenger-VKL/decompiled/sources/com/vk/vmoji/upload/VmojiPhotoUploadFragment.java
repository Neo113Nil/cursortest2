package com.vk.vmoji.upload;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.c9w0;
import xsna.d9w0;
import xsna.e9w0;
import xsna.f2i;
import xsna.g9w0;
import xsna.gm50;
import xsna.h9w0;
import xsna.i9u0;
import xsna.i9w0;
import xsna.ies;
import xsna.izs;
import xsna.j9w0;
import xsna.km50;
import xsna.mk50;
import xsna.nds;
import xsna.oz50;
import xsna.qhg0;
import xsna.s3q0;
import xsna.uds;
import xsna.vds;
import xsna.vk50;
import xsna.xn50;

/* compiled from: VmojiPhotoUploadFragment.kt */
/* loaded from: classes7.dex */
public final class VmojiPhotoUploadFragment extends MviImplFragment<d9w0, j9w0, c9w0> implements ies, nds, uds, vds {
    public i9w0 Q;
    public final int R = -16777216;
    public final int S = -16777216;

    /* compiled from: VmojiPhotoUploadFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: VmojiPhotoUploadFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<c9w0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(c9w0 c9w0Var) {
            VmojiPhotoUploadFragment vmojiPhotoUploadFragment = (VmojiPhotoUploadFragment) this.receiver;
            vmojiPhotoUploadFragment.getClass();
            xn50.a.c(vmojiPhotoUploadFragment, c9w0Var);
            return s3q0.a;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        i9w0 i9w0Var = new i9w0(requireContext(), new b(1, this, VmojiPhotoUploadFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), getViewLifecycleOwner());
        this.Q = i9w0Var;
        return new mk50.c(i9w0Var.e);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        j9w0 j9w0Var = (j9w0) ao50Var;
        i9w0 i9w0Var = this.Q;
        if (i9w0Var == null) {
            i9w0Var = null;
        }
        getViewLifecycleOwner();
        i9w0Var.getClass();
        gm50.a.b(i9w0Var, j9w0Var.a, new i9u0(i9w0Var, 4));
        gm50.a.b(i9w0Var, j9w0Var.b, new qhg0(i9w0Var, 29));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return this.S;
    }

    @Override // xsna.woo0
    public final int o7() {
        return this.R;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        i9w0 i9w0Var = this.Q;
        if (i9w0Var == null) {
            i9w0Var = null;
        }
        ProgressDialog progressDialog = i9w0Var.g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        i9w0Var.g = null;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("extra_filename")) == null) {
            str = "";
        }
        return new d9w0(new g9w0(h9w0.b.b), new e9w0(str), new f2i(this));
    }
}
