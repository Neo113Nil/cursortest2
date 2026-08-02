package com.vk.money;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.dto.money.MoneyTransfer;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import me.grishka.appkit.fragments.LoaderFragment;
import xsna.a0a;
import xsna.a8v;
import xsna.bwt0;
import xsna.cvk;
import xsna.f4m;
import xsna.fvr;
import xsna.hn2;
import xsna.oz50;
import xsna.rsg0;
import xsna.rwi;
import xsna.tkc;
import xsna.tts;
import xsna.w110;
import xsna.x2y;
import xsna.zo4;

/* compiled from: MoneyTransferLinkFragment.kt */
/* loaded from: classes3.dex */
public final class MoneyTransferLinkFragment extends LoaderFragment {
    public static final /* synthetic */ int u0 = 0;
    public TextView l0;
    public View m0;
    public TextView n0;
    public View o0;
    public ImageView p0;
    public View q0;
    public View r0;
    public View s0;
    public final b t0 = new b();

    /* compiled from: MoneyTransferLinkFragment.kt */
    public static final class a extends oz50 {
        public a(boolean z) {
            super(MoneyTransferLinkFragment.class, null, null);
            this.j.putBoolean("hide_toolbar", z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        setTitle(R.string.money_transfer_link);
        qo();
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
        add.setShowAsAction(2);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.t0.dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        rwi.d().e().b(getActivity(), MoneyTransfer.n(a0a.d));
        return true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Toolbar toolbar;
        super.onViewCreated(view, bundle);
        bwt0.Z(R.attr.vk_legacy_background_content, view);
        Toolbar toolbar2 = this.Q;
        if (toolbar2 != null) {
            AppBarLayout.d dVar = (AppBarLayout.d) toolbar2.getLayoutParams();
            dVar.a = 4;
            toolbar2.setLayoutParams(dVar);
            toolbar2.requestLayout();
        }
        Bundle arguments = getArguments();
        if (!(arguments != null ? arguments.getBoolean("hide_toolbar", false) : false) || (toolbar = this.Q) == null) {
            return;
        }
        f4m.j(toolbar);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        this.t0.b(rsg0.y0(new zo4(), null, null, 3).subscribe(new a8v(new w110(this, 5), 5), new tts(new x2y(this, 11), 12)));
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.money_transfer_link, viewGroup, false);
        this.l0 = (TextView) inflate.findViewById(R.id.public_link_view);
        this.m0 = inflate.findViewById(R.id.public_link_copy_view);
        this.n0 = (TextView) inflate.findViewById(R.id.anon_link_view);
        this.o0 = inflate.findViewById(R.id.anon_link_copy_view);
        this.p0 = (ImageView) inflate.findViewById(R.id.money_transfer_qr);
        this.q0 = inflate.findViewById(R.id.money_transfer_qr_container);
        this.r0 = inflate.findViewById(R.id.money_transfer_qr_save);
        this.s0 = inflate.findViewById(R.id.money_transfer_qr_share);
        View view = this.r0;
        if (view == null) {
            view = null;
        }
        view.setOnClickListener(new tkc(this, 3));
        View view2 = this.s0;
        (view2 != null ? view2 : null).setOnClickListener(new hn2(this, 7));
        return inflate;
    }

    public final void uo(String str) {
        fvr.l(getActivity(), str);
        cvk.u(R.string.link_copied, false);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
    }
}
