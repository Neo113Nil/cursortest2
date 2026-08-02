package com.vk.money.createtransfer;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.view.AppBarShadowView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.money.MoneyTransfer;
import com.vk.dto.user.UserProfile;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vkontakte.android.R;
import me.grishka.appkit.fragments.LoaderFragment;
import xsna.a0a;
import xsna.ba;
import xsna.bwt0;
import xsna.ca;
import xsna.e3m;
import xsna.fq1;
import xsna.i0q0;
import xsna.j03;
import xsna.krv0;
import xsna.n720;
import xsna.oak;
import xsna.oz50;
import xsna.p90;
import xsna.rwi;
import xsna.u1u0;

/* compiled from: AbsCreateTransferFragment.kt */
/* loaded from: classes3.dex */
public abstract class AbsCreateTransferFragment<T extends oak> extends LoaderFragment {
    public TextView l0;
    public T m0;
    public fq1 n0;
    public boolean o0;
    public TransferInputField p0;

    /* compiled from: AbsCreateTransferFragment.kt */
    public static abstract class a extends oz50 {
        public final void A() {
            this.j.putBoolean("hide_toolbar", true);
        }

        public final void B(String str) {
            this.j.putString("ref", str);
        }

        public final void C(boolean z) {
            this.j.putBoolean("startWithRequest", z);
        }

        public final void D(UserId userId) {
            this.j.putParcelable("to_id", userId);
        }

        public final void E(UserProfile userProfile) {
            this.j.putParcelable("to", userProfile);
        }

        public final void y(String str) {
            this.j.putString("amount", str);
        }

        public final void z(String str) {
            this.j.putString("comment", str);
        }
    }

    /* compiled from: AbsCreateTransferFragment.kt */
    public static final class b implements TransferInputField.a {
        public final /* synthetic */ AbsCreateTransferFragment<T> a;

        public b(AbsCreateTransferFragment<T> absCreateTransferFragment) {
            this.a = absCreateTransferFragment;
        }

        @Override // com.vk.money.createtransfer.input.TransferInputField.a
        public final void a(String str) {
            T t = this.a.m0;
            if (t == null) {
                t = null;
            }
            t.a(str);
        }

        @Override // com.vk.money.createtransfer.input.TransferInputField.a
        public final void b(String str) {
            T t = this.a.m0;
            if (t == null) {
                t = null;
            }
            t.b(str);
        }

        @Override // com.vk.money.createtransfer.input.TransferInputField.a
        public final void e() {
            T t = this.a.m0;
            if (t == null) {
                t = null;
            }
            t.e();
        }

        @Override // com.vk.money.createtransfer.input.TransferInputField.a
        public final void f() {
            AbsCreateTransferFragment<T> absCreateTransferFragment = this.a;
            T t = absCreateTransferFragment.m0;
            if (t == null) {
                t = null;
            }
            t.x(absCreateTransferFragment.requireContext());
        }
    }

    public final void Ao(Throwable th) {
        if (th instanceof VKApiExecutionException) {
            j03.i(mo2getContext(), (VKApiExecutionException) th);
        }
    }

    public final void d0() {
        i0q0.f(new ca(this, 0));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000) {
            if (i2 != -1) {
                if (i2 != 5) {
                    return;
                }
                xo();
                T t = this.m0;
                if (t == null) {
                    t = null;
                }
                t.k();
                return;
            }
            FragmentActivity activity = getActivity();
            if (activity == null || !isAdded() || isRemoving() || isDetached() || p90.e(activity)) {
                return;
            }
            fq1 fq1Var = this.n0;
            if (fq1Var != null) {
                fq1Var.a();
            }
            wo();
        }
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.m0 = uo(requireArguments());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem add = menu.add(R.string.help);
        add.setIcon(R.drawable.vk_icon_help_outline_28);
        n720.b(add, ColorStateList.valueOf(e3m.f(R.attr.vk_legacy_accent, requireContext())));
        add.setShowAsAction(2);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.l0 = (TextView) onCreateView.findViewById(R.id.positive);
        this.p0 = (TransferInputField) onCreateView.findViewById(R.id.transfer_input_field);
        return onCreateView;
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        T t = this.m0;
        if (t == null) {
            t = null;
        }
        t.onDestroyView();
        this.p0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        rwi.d().e().b(requireContext(), MoneyTransfer.n(a0a.d));
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        TransferInputField transferInputField;
        super.onResume();
        if (this.o0 && isResumed() && (transferInputField = this.p0) != null) {
            transferInputField.n1();
        }
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((AppBarShadowView) view.findViewById(R.id.shadow)).setSeparatorAllowed(false);
        xo();
        T t = this.m0;
        if (t == null) {
            t = null;
        }
        t.d();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void oo() {
        TransferInputField transferInputField;
        super.oo();
        if (this.o0 && isResumed() && (transferInputField = this.p0) != null) {
            transferInputField.n1();
        }
    }

    public abstract T uo(Bundle bundle);

    public final void vo() {
        TextView textView = this.l0;
        if (textView == null) {
            textView = null;
        }
        textView.setEnabled(false);
    }

    public final void wo() {
        finish();
        Fragment parentFragment = getParentFragment();
        MoneyTransferPagerFragment moneyTransferPagerFragment = parentFragment instanceof MoneyTransferPagerFragment ? (MoneyTransferPagerFragment) parentFragment : null;
        if (moneyTransferPagerFragment != null) {
            moneyTransferPagerFragment.finish();
        }
    }

    public final void xo() {
        TextView textView = this.l0;
        if (textView == null) {
            textView = null;
        }
        textView.setOnClickListener(new ba(0, this, textView));
        TransferInputField transferInputField = this.p0;
        if (transferInputField != null) {
            transferInputField.setCallback(new b(this));
        }
        TextView textView2 = this.l0;
        (textView2 != null ? textView2 : null).setEnabled(false);
        Toolbar ho = ho();
        AppBarLayout.d dVar = (AppBarLayout.d) ho.getLayoutParams();
        dVar.a = 4;
        bwt0.Z(R.attr.vk_legacy_background_content, ho);
        ho.setNavigationIcon(R.drawable.vk_icon_cancel_outline_28);
        ho.setLayoutParams(dVar);
        ho.requestLayout();
        String string = requireArguments().getString("toolbarTitle");
        if (string != null) {
            ho.setTitle(string);
        }
        ho.setTitleTextColor(krv0.l(R.attr.vk_legacy_header_text));
        u1u0.k(ho, R.drawable.vk_icon_cancel_outline_28, R.string.accessibility_cancel);
    }

    public final void yo(String str) {
        TransferInputField transferInputField = this.p0;
        if (transferInputField != null) {
            transferInputField.t1(str, isResumed());
        }
    }

    public final void zo(String str) {
        TextView textView = this.l0;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
    }
}
