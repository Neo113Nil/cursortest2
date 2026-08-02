package com.vk.auth.ui.checkaccess;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.auth.ui.VkAuthTextView;
import com.vk.auth.ui.VkLoadingButton;
import com.vkontakte.android.R;
import defpackage.h;
import io.reactivex.rxjava3.disposables.b;
import xsna.ac;
import xsna.aj6;
import xsna.bc;
import xsna.bpn0;
import xsna.ehg;
import xsna.enj;
import xsna.hm90;
import xsna.im90;
import xsna.oa6;
import xsna.qno0;
import xsna.s3q0;
import xsna.uhv0;
import xsna.vgg;
import xsna.w8;
import xsna.wcl;
import xsna.x8;

/* compiled from: BasePasswordCheckFragment.kt */
/* loaded from: classes15.dex */
public abstract class a extends uhv0 implements hm90 {
    public VkAuthTextView i;
    public ImageView j;
    public PasswordCheckInitStructure k;
    public VkAuthPasswordView l;
    public TextView m;
    public VkLoadingButton n;
    public Group o;
    public ProgressBar p;
    public LinearLayout q;
    public TextView r;
    public TextView s;
    public final bpn0 h = new bpn0(new h(this, 8));
    public final b t = new b();

    @Override // xsna.hm90
    public final void I() {
        VkLoadingButton vkLoadingButton = this.n;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setLoading(true);
    }

    @Override // xsna.hm90
    public final void Jd() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putBoolean("dismiss", true);
        s3q0 s3q0Var = s3q0.a;
        parentFragmentManager.k0(bundle, "key_check_access_result");
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        return new wcl(requireContext());
    }

    @Override // xsna.hm90
    public final void Pf(Integer num, vgg vggVar) {
        ProgressBar progressBar = this.p;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(4);
        LinearLayout linearLayout = this.q;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.setVisibility(0);
        if (num != null && num.intValue() == 106) {
            vggVar.d(new ac(this, 7));
            return;
        }
        VkAuthTextView vkAuthTextView = this.i;
        if (vkAuthTextView == null) {
            vkAuthTextView = null;
        }
        vkAuthTextView.setOnClickListener(new bc(this, 2));
        ImageView imageView = this.j;
        if (imageView == null) {
            imageView = null;
        }
        Context mo2getContext = mo2getContext();
        imageView.setImageDrawable(mo2getContext != null ? enj.e(R.drawable.vk_icon_globe_cross_outline_56, R.attr.vk_ui_icon_secondary, mo2getContext) : null);
        TextView textView = this.r;
        if (textView == null) {
            textView = null;
        }
        Context mo2getContext2 = mo2getContext();
        textView.setText(mo2getContext2 != null ? mo2getContext2.getString(R.string.vk_auth_load_network_title_error) : null);
        TextView textView2 = this.s;
        if (textView2 == null) {
            textView2 = null;
        }
        Context mo2getContext3 = mo2getContext();
        textView2.setText(mo2getContext3 != null ? mo2getContext3.getString(R.string.vk_auth_load_network_error) : null);
    }

    @Override // xsna.hm90
    public final void hh(String str) {
        TextView textView = this.m;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
        TextView textView2 = this.m;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setVisibility(0);
        VkAuthPasswordView vkAuthPasswordView = this.l;
        (vkAuthPasswordView != null ? vkAuthPasswordView : null).setPasswordBackgroundId(Integer.valueOf(R.drawable.vk_auth_bg_edittext_error));
    }

    @Override // xsna.hm90
    public final void i0() {
        Group group = this.o;
        if (group == null) {
            group = null;
        }
        group.setVisibility(0);
        ProgressBar progressBar = this.p;
        (progressBar != null ? progressBar : null).setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        tn().d.dispose();
        this.t.dispose();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        PasswordCheckInitStructure passwordCheckInitStructure;
        Parcelable parcelable;
        Object parcelable2;
        this.m = (TextView) view.findViewById(R.id.error_view);
        this.l = (VkAuthPasswordView) view.findViewById(R.id.password_container);
        this.p = (ProgressBar) view.findViewById(R.id.progress);
        this.o = (Group) view.findViewById(R.id.content_group);
        this.n = (VkLoadingButton) view.findViewById(R.id.next);
        this.i = (VkAuthTextView) view.findViewById(R.id.retry_button);
        this.q = (LinearLayout) view.findViewById(R.id.retry_layout);
        this.r = (TextView) view.findViewById(R.id.load_error_title);
        this.s = (TextView) view.findViewById(R.id.load_error_description);
        this.j = (ImageView) view.findViewById(R.id.load_error_icon);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("structure", PasswordCheckInitStructure.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("structure");
                if (!(parcelable3 instanceof PasswordCheckInitStructure)) {
                    parcelable3 = null;
                }
                parcelable = (PasswordCheckInitStructure) parcelable3;
            }
            passwordCheckInitStructure = (PasswordCheckInitStructure) parcelable;
        } else {
            passwordCheckInitStructure = null;
        }
        this.k = passwordCheckInitStructure;
        VkLoadingButton vkLoadingButton = this.n;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setOnClickListener(new oa6(this, 2));
        LinearLayout linearLayout = this.q;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new aj6(this, 0));
        im90 tn = tn();
        PasswordCheckInitStructure passwordCheckInitStructure2 = this.k;
        if (passwordCheckInitStructure2 == null) {
            passwordCheckInitStructure2 = null;
        }
        tn.b(passwordCheckInitStructure2);
        VkAuthPasswordView vkAuthPasswordView = this.l;
        this.t.b(new qno0((vkAuthPasswordView != null ? vkAuthPasswordView : null).c).subscribe(new x8(new w8(this, 8), 4)));
        super.onViewCreated(view, bundle);
    }

    @Override // xsna.hm90
    public final void r() {
        VkLoadingButton vkLoadingButton = this.n;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setLoading(false);
    }

    public final im90 tn() {
        return (im90) this.h.getValue();
    }

    public final void un() {
        ProgressBar progressBar = this.p;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(0);
        LinearLayout linearLayout = this.q;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.setVisibility(4);
        im90 tn = tn();
        PasswordCheckInitStructure passwordCheckInitStructure = this.k;
        tn.b(passwordCheckInitStructure != null ? passwordCheckInitStructure : null);
    }
}
