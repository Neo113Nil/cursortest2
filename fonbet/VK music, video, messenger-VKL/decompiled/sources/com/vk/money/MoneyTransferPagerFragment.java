package com.vk.money;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tabs.SkeletonTabLayout;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.VKTabLayout;
import com.vk.dto.common.id.UserId;
import com.vk.dto.money.MoneyTransfer;
import com.vk.dto.user.UserProfile;
import com.vk.money.createtransfer.AbsCreateTransferFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import me.grishka.appkit.fragments.LoaderFragment;
import xsna.a0a;
import xsna.bwt0;
import xsna.c5g;
import xsna.cc20;
import xsna.f4m;
import xsna.fq1;
import xsna.i9k;
import xsna.j4x;
import xsna.k1q0;
import xsna.l730;
import xsna.mhy;
import xsna.oz50;
import xsna.pv2;
import xsna.rsg0;
import xsna.rwi;
import xsna.u1u0;
import xsna.ugm;
import xsna.usn0;
import xsna.z1h0;

/* compiled from: MoneyTransferPagerFragment.kt */
/* loaded from: classes.dex */
public final class MoneyTransferPagerFragment extends LoaderFragment {
    public static final /* synthetic */ int w0 = 0;
    public UserProfile m0;
    public String n0;
    public String o0;
    public boolean p0;
    public boolean q0;
    public String r0;
    public SkeletonTabLayout t0;
    public ViewPager2 u0;
    public b v0;
    public UserId l0 = UserId.d;
    public final ArrayList s0 = new ArrayList();

    /* compiled from: MoneyTransferPagerFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a extends oz50 {
        public a() {
            super(MoneyTransferPagerFragment.class, null, null);
            s(true);
        }

        public final void A(boolean z) {
            this.j.putBoolean("startWithRequest", z);
        }

        public final void B(UserId userId) {
            this.j.putParcelable("to_id", userId);
        }

        public final void y(String str) {
            this.j.putString("amount", str);
        }

        public final void z(String str) {
            this.j.putString("ref", str);
        }
    }

    /* compiled from: MoneyTransferPagerFragment.kt */
    /* loaded from: classes3.dex */
    public final class b extends k1q0 {
        public final ArrayList s;

        public b(ViewPager2 viewPager2, ArrayList arrayList) {
            super(MoneyTransferPagerFragment.this, viewPager2, MoneyTransferPagerFragment.this.D);
            this.s = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.s.size();
        }

        @Override // xsna.scs, androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return ((oz50) this.s.get(i)).hashCode();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return !(this.s.get(i) instanceof AbsCreateTransferFragment.a) ? 1 : 0;
        }

        @Override // xsna.scs
        public final boolean y0(long j) {
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((oz50) it.next()).hashCode()));
            }
            return arrayList2.contains(Long.valueOf(j));
        }

        @Override // xsna.scs
        public final Fragment z0(int i) {
            FragmentImpl f = ((oz50) this.s.get(i)).f();
            G0(f, i);
            if (getItemViewType(i) == 0) {
                AbsCreateTransferFragment absCreateTransferFragment = (AbsCreateTransferFragment) f;
                absCreateTransferFragment.n0 = new fq1(MoneyTransferPagerFragment.this, 25);
                absCreateTransferFragment.o0 = true;
            }
            return f;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        if (arguments != null) {
            UserId userId = (UserId) arguments.getParcelable("to_id");
            if (userId == null) {
                userId = UserId.d;
            }
            this.l0 = userId;
            this.m0 = (UserProfile) arguments.getParcelable("to");
            this.n0 = arguments.getString("amount");
            this.o0 = arguments.getString("comment");
            this.p0 = arguments.getBoolean("isChatRequest", false);
            this.q0 = arguments.getBoolean("startWithRequest", false);
            String string = arguments.getString("ref");
            if (string == null) {
                UiTracker uiTracker = UiTracker.a;
                string = UiTracker.d();
            }
            this.r0 = string;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem add = menu.add(R.string.help);
        add.setIcon(R.drawable.vk_icon_help_outline_28);
        add.setShowAsAction(2);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        rwi.d().e().b(requireContext(), MoneyTransfer.n(a0a.d));
        return true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        u1u0.k(this.Q, R.drawable.vk_icon_cancel_outline_28, R.string.accessibility_cancel);
        if (this.p0) {
            setTitle(R.string.money_transfer_request_money);
        } else {
            setTitle(R.string.money_transfer);
        }
        ((AppBarLayout.d) ((Toolbar) view.findViewById(R.id.toolbar)).getLayoutParams()).a = 0;
        bwt0.Z(R.attr.vk_legacy_background_content, view);
        f4m.j(view.findViewById(R.id.shadow));
        this.t0 = (SkeletonTabLayout) view.findViewById(R.id.money_transfer_tabs);
        this.u0 = (ViewPager2) view.findViewById(R.id.money_transfer_pager);
        uo();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        uo();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.money_transfer_tabs, viewGroup, false);
    }

    public final void uo() {
        oo();
        SkeletonTabLayout skeletonTabLayout = this.t0;
        if (skeletonTabLayout == null) {
            skeletonTabLayout = null;
        }
        skeletonTabLayout.setShimmerAvailable(true);
        SkeletonTabLayout skeletonTabLayout2 = this.t0;
        if (skeletonTabLayout2 == null) {
            skeletonTabLayout2 = null;
        }
        skeletonTabLayout2.setShimmerVisible(true);
        SkeletonTabLayout skeletonTabLayout3 = this.t0;
        if (skeletonTabLayout3 == null) {
            skeletonTabLayout3 = null;
        }
        usn0.a(skeletonTabLayout3);
        SkeletonTabLayout skeletonTabLayout4 = this.t0;
        if (skeletonTabLayout4 == null) {
            skeletonTabLayout4 = null;
        }
        skeletonTabLayout4.getClass();
        skeletonTabLayout4.A0 = new SkeletonTabLayout.a.b();
        SkeletonTabLayout skeletonTabLayout5 = this.t0;
        if (skeletonTabLayout5 == null) {
            skeletonTabLayout5 = null;
        }
        if (skeletonTabLayout5.B0) {
            skeletonTabLayout5.B0 = false;
            skeletonTabLayout5.invalidate();
        }
        rsg0.y0(new l730(this.l0), null, null, 3).subscribe(new cc20(new ugm(this, 21), 1), new pv2(new j4x(this, 14), 27));
        ViewPager2 viewPager2 = this.u0;
        (viewPager2 != null ? viewPager2 : null).b(new c());
    }

    public final void vo(AbsCreateTransferFragment.a aVar) {
        aVar.D(this.l0);
        aVar.E(this.m0);
        String str = this.n0;
        if (str == null) {
            str = "";
        }
        aVar.y(str);
        String str2 = this.o0;
        aVar.z(str2 != null ? str2 : "");
        aVar.B(this.r0);
        aVar.A();
    }

    public final void wo(int i) {
        View view = getView();
        VKTabLayout vKTabLayout = view != null ? (VKTabLayout) view.findViewById(R.id.money_transfer_tabs) : null;
        boolean z = i == 1;
        if ((this.p0 || z) && vKTabLayout != null) {
            f4m.j(vKTabLayout);
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
    }

    /* compiled from: MoneyTransferPagerFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c extends ViewPager2.g {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i, float f, int i2) {
            b bVar = MoneyTransferPagerFragment.this.v0;
            if (bVar != null) {
                MoneyTransferPagerFragment moneyTransferPagerFragment = MoneyTransferPagerFragment.this;
                if (i2 == 0) {
                    ViewPager2 viewPager2 = moneyTransferPagerFragment.u0;
                    if (viewPager2 == null) {
                        viewPager2 = null;
                    }
                    if (viewPager2.getScrollState() != 1) {
                        z1h0 F0 = bVar.F0(i);
                        i9k i9kVar = F0 instanceof i9k ? (i9k) F0 : null;
                        if (i9kVar != null) {
                            i9kVar.n1();
                            return;
                        }
                        FragmentActivity activity = moneyTransferPagerFragment.getActivity();
                        if (activity != null) {
                            mhy.b(activity);
                            return;
                        }
                        return;
                    }
                }
                FragmentActivity activity2 = moneyTransferPagerFragment.getActivity();
                if (activity2 != null) {
                    mhy.b(activity2);
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
        }
    }
}
