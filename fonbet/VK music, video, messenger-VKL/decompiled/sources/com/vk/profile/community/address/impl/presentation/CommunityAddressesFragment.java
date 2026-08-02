package com.vk.profile.community.address.impl.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.PlainAddress;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import defpackage.y;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.t;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import xsna.a670;
import xsna.ac20;
import xsna.af2;
import xsna.arg;
import xsna.asu0;
import xsna.axf;
import xsna.b1y;
import xsna.b8g;
import xsna.bo3;
import xsna.bwt0;
import xsna.ca6;
import xsna.cb;
import xsna.crg;
import xsna.db;
import xsna.dhr0;
import xsna.drg;
import xsna.edr0;
import xsna.ef2;
import xsna.epx;
import xsna.erg;
import xsna.fkq0;
import xsna.fpf0;
import xsna.fre;
import xsna.frg;
import xsna.fu0;
import xsna.ga;
import xsna.ger0;
import xsna.gko;
import xsna.h03;
import xsna.h60;
import xsna.h6s;
import xsna.ha;
import xsna.hg1;
import xsna.hh1;
import xsna.hrg;
import xsna.ia;
import xsna.iah0;
import xsna.ies;
import xsna.io00;
import xsna.io00.a;
import xsna.irg;
import xsna.j1i;
import xsna.j5g;
import xsna.ji0;
import xsna.ju1;
import xsna.kah0;
import xsna.kbr0;
import xsna.krg;
import xsna.lah0;
import xsna.lf3;
import xsna.m7m;
import xsna.mbh;
import xsna.mm1;
import xsna.mv9;
import xsna.n6s;
import xsna.ndr0;
import xsna.nt0;
import xsna.ocg;
import xsna.od01;
import xsna.ofx;
import xsna.ou4;
import xsna.oz50;
import xsna.p0e0;
import xsna.pcg;
import xsna.pd90;
import xsna.pf8;
import xsna.prg;
import xsna.pw;
import xsna.pwd0;
import xsna.py;
import xsna.qi0;
import xsna.qrg;
import xsna.rc4;
import xsna.rdr0;
import xsna.rhh0;
import xsna.rj4;
import xsna.ry0;
import xsna.s3q0;
import xsna.s9u;
import xsna.sm9;
import xsna.t12;
import xsna.tar0;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;
import xsna.tqg;
import xsna.trg;
import xsna.tw3;
import xsna.uf20;
import xsna.uj00;
import xsna.vj00;
import xsna.vqg;
import xsna.wwf;
import xsna.wzf;
import xsna.x6s;
import xsna.xa4;
import xsna.xa80;
import xsna.xwf;
import xsna.yh1;
import xsna.yov;
import xsna.zq5;

/* compiled from: CommunityAddressesFragment.kt */
/* loaded from: classes5.dex */
public final class CommunityAddressesFragment extends BaseFragment implements ies, too0 {
    public static final int E0 = -iah0.a(4);
    public vqg A0;
    public int B0;
    public prg C0;
    public final bo3 D0;
    public g S;
    public crg T;
    public pd90<crg> U;
    public RecyclerView V;
    public View W;
    public VkTopBar X;
    public View Y;
    public View Z;
    public View a0;
    public View b0;
    public VkTopBar c0;
    public VkSpinner d0;
    public VkPlaceholder e0;
    public arg f0;
    public boolean g0;
    public Bitmap j0;
    public View k0;
    public final int m0;
    public final int n0;
    public Address o0;
    public int p0;
    public int q0;
    public ndr0 r0;
    public wwf<tqg> s0;
    public qrg t0;
    public CommunityAddressesListBehavior<RecyclerView> u0;
    public VkBottomSheetBehavior<View> v0;
    public xwf w0;
    public int x0;
    public int y0;
    public boolean z0;
    public final Handler h0 = new Handler();
    public UserId i0 = UserId.d;
    public final int l0 = iah0.a(86);

    /* compiled from: CommunityAddressesFragment.kt */
    public static final class c extends oz50 {
        public c(UserId userId, String str, Address address) {
            super(CommunityAddressesFragment.class, null, null);
            s(false);
            this.j.putParcelable("address_id", userId);
            this.j.putString("url", str);
            this.j.putParcelable("main_address", address);
        }

        public final void A(int i) {
            this.j.putInt("start_form_aid", i);
        }

        public final void y(boolean z) {
            this.j.putBoolean("old_address", z);
        }

        public final void z(long j) {
            this.j.putLong("market_item_id", j);
        }
    }

    /* compiled from: CommunityAddressesFragment.kt */
    public static final class h implements ger0 {
        public final /* synthetic */ FragmentActivity b;

        public h(FragmentActivity fragmentActivity) {
            this.b = fragmentActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.ger0
        public final void a(ndr0 ndr0Var) {
            s9u s9uVar = ndr0Var.a;
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            communityAddressesFragment.r0 = ndr0Var;
            FragmentActivity activity = communityAddressesFragment.getActivity();
            if (activity != null) {
                View view = communityAddressesFragment.W;
                if (view == null) {
                    view = null;
                }
                communityAddressesFragment.Z = view.findViewWithTag("GoogleWatermark");
                View view2 = communityAddressesFragment.W;
                if (view2 == null) {
                    view2 = null;
                }
                communityAddressesFragment.a0 = view2.findViewWithTag("GoogleCopyrights");
                dhr0.a.getClass();
                ndr0Var.f(dhr0.I());
                if (communityAddressesFragment.requireArguments().getBoolean("old_address", false)) {
                    View view3 = communityAddressesFragment.Z;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    View view4 = communityAddressesFragment.a0;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                }
                vj00 vj00Var = ofx.a;
                if (vj00Var == null) {
                    vj00Var = null;
                }
                vj00Var.getClass();
                kbr0 kbr0Var = new kbr0(activity, ndr0Var);
                communityAddressesFragment.s0 = kbr0Var;
                ry0 ry0Var = new ry0(communityAddressesFragment, 25);
                io00 io00Var = kbr0Var.b;
                if (io00Var != null) {
                    HashMap hashMap = io00Var.c;
                    if (hashMap.get("selected") != null) {
                        throw new IllegalArgumentException("collection id is not unique: ".concat("selected"));
                    }
                    io00.a aVar = io00Var.new a();
                    hashMap.put("selected", aVar);
                    aVar.e = new ac20(ry0Var, 19);
                }
                Context requireContext = communityAddressesFragment.requireContext();
                vj00 vj00Var2 = ofx.a;
                if (vj00Var2 == null) {
                    vj00Var2 = null;
                }
                vj00Var2.getClass();
                axf axfVar = new axf(requireContext, ndr0Var, kbr0Var);
                vj00 vj00Var3 = ofx.a;
                qrg qrgVar = new qrg(axfVar, requireContext, kbr0Var, new pf8(1, vj00Var3 != null ? vj00Var3 : null, uj00.class, "createBitmapDescriptor", "createBitmapDescriptor(Landroid/graphics/Bitmap;)Lcom/vk/maps/common/BitmapDescriptor;", 0, 3));
                qrgVar.l = new ji0(communityAddressesFragment, 23);
                qrgVar.i(communityAddressesFragment.j0);
                kbr0Var.o(qrgVar);
                communityAddressesFragment.t0 = qrgVar;
                vj00 vj00Var4 = ofx.a;
                if (vj00Var4 == null) {
                    vj00Var4 = null;
                }
                vj00Var4.getClass();
                a670 a670Var = new a670();
                a670Var.f = new rhh0(a670Var);
                if (a670Var instanceof kah0) {
                    kbr0Var.l((kah0) a670Var);
                } else {
                    kbr0Var.l(new lah0(a670Var));
                }
                b1y f = s9uVar.f();
                f.getClass();
                try {
                    ((yov) f.c).g1();
                    ndr0Var.k(true);
                    b1y f2 = s9uVar.f();
                    f2.getClass();
                    try {
                        ((yov) f2.c).b1();
                        ndr0Var.l();
                        ndr0Var.r();
                        ndr0Var.n(kbr0Var);
                        ndr0Var.p(kbr0Var);
                        kbr0Var.n(new ju1(communityAddressesFragment, 16));
                        kbr0Var.m(new krg(communityAddressesFragment));
                        Address address = communityAddressesFragment.o0;
                        if (address != null) {
                            vj00 vj00Var5 = ofx.a;
                            if (vj00Var5 == null) {
                                vj00Var5 = null;
                            }
                            vj00Var5.getClass();
                            ndr0Var.b(new tar0(xa4.F(new LatLng(address.c, address.d), 13.0f)));
                        }
                        if (communityAddressesFragment.o0 == null) {
                            io.reactivex.rxjava3.disposables.c subscribe = nt0.e(activity, false).subscribe(new defpackage.d(new pcg(ndr0Var, 2), 17));
                            vqg vqgVar = communityAddressesFragment.A0;
                            if (vqgVar == null) {
                                vqgVar = null;
                            }
                            vqgVar.d.b(subscribe);
                        }
                        ndr0Var.o(new com.vk.profile.community.address.impl.presentation.a(communityAddressesFragment));
                        ndr0Var.o(new com.vk.profile.community.address.impl.presentation.b(communityAddressesFragment));
                        try {
                            s9uVar.a.Y0(new od01(new uf20(new mv9(communityAddressesFragment, ndr0Var), 19)));
                            int i = communityAddressesFragment.p0;
                            int a = i == 0 ? communityAddressesFragment.l0 : i + iah0.a(8);
                            communityAddressesFragment.B0 = a;
                            ndr0Var.q(a);
                            ofx.b();
                        } catch (RemoteException e) {
                            throw new RuntimeRemoteException(e);
                        }
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                } catch (RemoteException e3) {
                    throw new RuntimeRemoteException(e3);
                }
            }
            vqg vqgVar2 = communityAddressesFragment.A0;
            vqg vqgVar3 = vqgVar2 != null ? vqgVar2 : null;
            vqgVar3.getClass();
            if (!vqg.a()) {
                vqgVar3.b();
            }
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            PermissionHelper.i(permissionHelper, this.b, PermissionHelper.h, PermissionHelper.i, R.string.permissions_location_community, R.string.location_permissions_settings, new pw(5, ndr0Var, communityAddressesFragment), null, null, 448);
        }
    }

    public CommunityAddressesFragment() {
        int a2 = iah0.a(12);
        this.m0 = a2;
        this.n0 = a2 - iah0.a(8);
        this.D0 = new bo3(this, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void io(CommunityAddressesFragment communityAddressesFragment, Throwable th) {
        boolean z;
        VkPlaceholder vkPlaceholder;
        VkPlaceholder.c.b bVar;
        VkPlaceholder vkPlaceholder2;
        int i;
        if (th instanceof VKApiExecutionException) {
            communityAddressesFragment.getClass();
            if (h03.a(th)) {
                z = true;
                vkPlaceholder = communityAddressesFragment.e0;
                com.vk.core.compose.component.semantics.a aVar = null;
                if (vkPlaceholder == null) {
                    vkPlaceholder = null;
                }
                if (z) {
                    bVar = new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_error_outline_56), new b8g(dhr0.t.c(R.attr.vk_ui_icon_secondary)), null, 28);
                } else {
                    if (dhr0.a.c(communityAddressesFragment.mo2getContext())) {
                        gko.b bVar2 = gko.Companion;
                        i = R.drawable.vk_icon_illustration_antenna_dark_56;
                    } else {
                        gko.b bVar3 = gko.Companion;
                        i = R.drawable.vk_icon_illustration_antenna_light_56;
                    }
                    bVar = new VkPlaceholder.c.b(new gko(i), null, null, 30);
                }
                vkPlaceholder.setTop(bVar);
                vkPlaceholder2 = communityAddressesFragment.e0;
                if (vkPlaceholder2 == null) {
                    vkPlaceholder2 = null;
                }
                vkPlaceholder2.setMiddle(new VkPlaceholder.b(!z ? tq.h(tlo0.Companion, R.string.community_addresses_internet_error_title) : tq.h(tlo0.Companion, R.string.community_addresses_server_error_title), !z ? tq.h(tlo0.Companion, R.string.community_addresses_internet_error_description) : tq.h(tlo0.Companion, R.string.community_addresses_server_error_description), aVar, 10));
            }
        }
        z = false;
        vkPlaceholder = communityAddressesFragment.e0;
        com.vk.core.compose.component.semantics.a aVar2 = null;
        if (vkPlaceholder == null) {
        }
        if (z) {
        }
        vkPlaceholder.setTop(bVar);
        vkPlaceholder2 = communityAddressesFragment.e0;
        if (vkPlaceholder2 == null) {
        }
        vkPlaceholder2.setMiddle(new VkPlaceholder.b(!z ? tq.h(tlo0.Companion, R.string.community_addresses_internet_error_title) : tq.h(tlo0.Companion, R.string.community_addresses_server_error_title), !z ? tq.h(tlo0.Companion, R.string.community_addresses_internet_error_description) : tq.h(tlo0.Companion, R.string.community_addresses_server_error_description), aVar2, 10));
    }

    public static final void jo(CommunityAddressesFragment communityAddressesFragment) {
        ArrayList<PlainAddress> arrayList;
        int min = Math.min(iah0.a(16) + communityAddressesFragment.q0, communityAddressesFragment.mo() / 2);
        if (min == 0) {
            min = communityAddressesFragment.mo() / 2;
        }
        ndr0 ndr0Var = communityAddressesFragment.r0;
        if (ndr0Var != null) {
            ndr0Var.q(min);
        }
        ndr0 ndr0Var2 = communityAddressesFragment.r0;
        if (ndr0Var2 != null) {
            vqg vqgVar = communityAddressesFragment.A0;
            trg trgVar = (vqgVar != null ? vqgVar : null).g;
            if (trgVar == null) {
                trgVar = null;
            }
            ArrayList<PlainAddress> arrayList2 = trgVar.e;
            if (vqgVar == null) {
                vqgVar = null;
            }
            Location location = vqgVar.e;
            vj00 vj00Var = ofx.a;
            (vj00Var != null ? vj00Var : null).getClass();
            int i = nt0.a;
            if (!arrayList2.isEmpty()) {
                float[] fArr = new float[1];
                ArrayList arrayList3 = new ArrayList();
                Iterator<PlainAddress> it = arrayList2.iterator();
                while (it.hasNext()) {
                    PlainAddress next = it.next();
                    PlainAddress plainAddress = next;
                    if (location == null) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        Location.distanceBetween(location.getLatitude(), location.getLongitude(), plainAddress.c, plainAddress.d, fArr);
                        if (fArr[0] < 100000.0f) {
                            arrayList3.add(next);
                        }
                    }
                    arrayList2 = arrayList;
                }
                ArrayList<PlainAddress> arrayList4 = arrayList2;
                List<PlainAddress> O0 = j5g.O0(arrayList3);
                O0.isEmpty();
                if (O0.isEmpty()) {
                    ndr0Var2.c(new tar0(xa4.F(new LatLng(arrayList4.get(0).c, arrayList4.get(0).d), 13.0f)));
                } else if (O0.size() == 1) {
                    ndr0Var2.c(new tar0(xa4.F(new LatLng(((PlainAddress) O0.get(0)).c, ((PlainAddress) O0.get(0)).d), 13.0f)));
                } else {
                    double d2 = Double.MAX_VALUE;
                    double d3 = Double.MIN_VALUE;
                    double d4 = Double.MIN_VALUE;
                    double d5 = Double.MAX_VALUE;
                    for (PlainAddress plainAddress2 : O0) {
                        d3 = Math.max(d3, plainAddress2.c);
                        d2 = Math.min(d2, plainAddress2.c);
                        d4 = Math.max(d4, plainAddress2.d);
                        d5 = Math.min(d5, plainAddress2.d);
                    }
                    ndr0Var2.c(new tar0(xa4.E(new LatLngBounds(new LatLng(d2, d5), new LatLng(d3, d4)), nt0.a)));
                }
            }
        }
        ndr0 ndr0Var3 = communityAddressesFragment.r0;
        if (ndr0Var3 != null) {
            ndr0Var3.q(communityAddressesFragment.B0);
        }
    }

    public static final void ko(CommunityAddressesFragment communityAddressesFragment, PlainAddress plainAddress) {
        ndr0 ndr0Var = communityAddressesFragment.r0;
        float max = Math.max(ndr0Var != null ? ndr0Var.h().a.c : 13.0f, 13.0f);
        ndr0 ndr0Var2 = communityAddressesFragment.r0;
        if (ndr0Var2 != null) {
            vj00 vj00Var = ofx.a;
            if (vj00Var == null) {
                vj00Var = null;
            }
            vj00Var.getClass();
            ndr0Var2.c(new tar0(xa4.F(new LatLng(plainAddress.c, plainAddress.d), max)));
        }
    }

    public static final x lo(CommunityAddressesFragment communityAddressesFragment, PlainAddress plainAddress) {
        ndr0 ndr0Var = communityAddressesFragment.r0;
        if (ndr0Var == null) {
            return x.k(Boolean.FALSE);
        }
        v vVar = new v(new qi0(1, ndr0Var, communityAddressesFragment));
        asu0 asu0Var = asu0.a;
        return vVar.q(asu0Var.c()).m(asu0Var.d()).l(new yh1(new lf3(communityAddressesFragment, plainAddress, ndr0Var, 2), 11));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        ndr0 ndr0Var = this.r0;
        if (ndr0Var != null) {
            dhr0.a.getClass();
            ndr0Var.f(dhr0.I());
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        g gVar = this.S;
        if (gVar == null) {
            gVar = null;
        }
        if (gVar.a0()) {
            return true;
        }
        finish();
        return true;
    }

    public final int mo() {
        View view = this.k0;
        if (view == null) {
            view = null;
        }
        return view.getMeasuredHeight();
    }

    public final void no() {
        Bundle arguments = getArguments();
        new t(new irg(0, arguments != null ? arguments.getString("url") : null, this)).U(new rj4(new af2(8), 6)).U(new ca6(new db(24), 10)).subscribe(new fu0(new fre(this, 7), 14), new h60(new py(15), 14));
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserId userId = (UserId) requireArguments().getParcelable("address_id");
        if (userId == null) {
            userId = UserId.d;
        }
        this.i0 = userId;
        boolean z = requireArguments().getBoolean("old_address");
        long j = requireArguments().getLong("market_item_id");
        this.o0 = (Address) requireArguments().getParcelable("main_address");
        this.A0 = z ? new mbh(this.i0, this) : j != 0 ? new j1i(fkq0.e(this.i0), j, this) : new vqg(this.i0, this);
        no();
        UserId userId2 = this.i0;
        Set<String> set = p0e0.a;
        b.d dVar = new b.d("groups_addresses");
        dVar.b("show", "action");
        dVar.b(userId2, "group_id");
        dVar.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"MissingPermission"})
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_community_addres, viewGroup, false);
        this.k0 = inflate;
        this.f0 = new arg((LinearLayout) inflate.findViewById(R.id.full_address), new cb(this, 25));
        View view = this.k0;
        VkPlaceholder.a.C0854a c0854a = null;
        if (view == null) {
            view = null;
        }
        this.V = (RecyclerView) view.findViewById(R.id.addresses_recycler);
        View view2 = this.k0;
        if (view2 == null) {
            view2 = null;
        }
        this.X = (VkTopBar) view2.findViewById(R.id.toolbar);
        View view3 = this.k0;
        if (view3 == null) {
            view3 = null;
        }
        this.W = view3.findViewById(R.id.map_frame);
        View view4 = this.k0;
        if (view4 == null) {
            view4 = null;
        }
        this.b0 = view4.findViewById(R.id.community_addresses_grabber);
        View view5 = this.k0;
        if (view5 == null) {
            view5 = null;
        }
        this.c0 = (VkTopBar) view5.findViewById(R.id.community_addresses_list_top_bar);
        View view6 = this.k0;
        if (view6 == null) {
            view6 = null;
        }
        this.d0 = (VkSpinner) view6.findViewById(R.id.progress);
        View view7 = this.k0;
        if (view7 == null) {
            view7 = null;
        }
        this.e0 = (VkPlaceholder) view7.findViewById(R.id.community_addresses_placeholder);
        View view8 = this.k0;
        if (view8 == null) {
            view8 = null;
        }
        this.Y = view8.findViewById(R.id.recycler_frame);
        VkTopBar vkTopBar = this.c0;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
        VkTopBar vkTopBar2 = this.c0;
        if (vkTopBar2 == null) {
            vkTopBar2 = null;
        }
        vkTopBar2.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_dropdown_24), tq.h(tlo0.Companion, R.string.community_addresses_hide_addresses_modal), new ocg(this, 2), null, null, 56));
        VkTopBar vkTopBar3 = this.c0;
        if (vkTopBar3 == null) {
            vkTopBar3 = null;
        }
        vkTopBar3.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.all_addresses), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        this.u0 = new CommunityAddressesListBehavior<>();
        View view9 = this.Y;
        if (view9 == null) {
            view9 = null;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view9.getLayoutParams();
        CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = this.u0;
        if (communityAddressesListBehavior == null) {
            communityAddressesListBehavior = null;
        }
        fVar.c(communityAddressesListBehavior);
        this.v0 = new VkBottomSheetBehavior<>();
        arg argVar = this.f0;
        if (argVar == null) {
            argVar = null;
        }
        CoordinatorLayout.f fVar2 = (CoordinatorLayout.f) argVar.a.getLayoutParams();
        VkBottomSheetBehavior<View> vkBottomSheetBehavior = this.v0;
        if (vkBottomSheetBehavior == null) {
            vkBottomSheetBehavior = null;
        }
        fVar2.c(vkBottomSheetBehavior);
        VkTopBar vkTopBar4 = this.X;
        if (vkTopBar4 == null) {
            vkTopBar4 = null;
        }
        vkTopBar4.setBack(new VkTopBar.b(new hh1(this, 24), new tlo0.f(R.string.community_profile_accessibility_back), null, null, null, 28));
        VkTopBar vkTopBar5 = this.X;
        if (vkTopBar5 == null) {
            vkTopBar5 = null;
        }
        vkTopBar5.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.all_addresses), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        new Handler().post(new rc4(this, 3));
        RecyclerView recyclerView = this.V;
        if (recyclerView == null) {
            recyclerView = null;
        }
        kn();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment$onCreateView$3
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
                CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
                crg crgVar = communityAddressesFragment.T;
                if (crgVar != null) {
                    RecyclerView recyclerView2 = communityAddressesFragment.V;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    crgVar.x0(recyclerView2, communityAddressesFragment.D0);
                }
                super.onLayoutChildren(vVar, a0Var);
            }
        });
        int a2 = iah0.a(12);
        CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior2 = this.u0;
        if (communityAddressesListBehavior2 == null) {
            communityAddressesListBehavior2 = null;
        }
        communityAddressesListBehavior2.p = new erg(this, a2);
        VkPlaceholder vkPlaceholder = this.e0;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(R.string.community_addresses_error_retry), new drg(this, 0), null, null, VkButton.Size.Small, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, false, null, 1596), c0854a, 6));
        VkBottomSheetBehavior<View> vkBottomSheetBehavior2 = this.v0;
        (vkBottomSheetBehavior2 != null ? vkBottomSheetBehavior2 : null).h = true;
        if (vkBottomSheetBehavior2 == null) {
            vkBottomSheetBehavior2 = null;
        }
        vkBottomSheetBehavior2.J(5);
        CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior3 = this.u0;
        if (communityAddressesListBehavior3 == null) {
            communityAddressesListBehavior3 = null;
        }
        communityAddressesListBehavior3.I(-4, false);
        crg crgVar = new crg(new frg(this, 0));
        this.T = crgVar;
        pd90<crg> pd90Var = new pd90<>(crgVar, n6s.a, x6s.a, h6s.a, new xa80() { // from class: xsna.grg
            @Override // xsna.xa80
            public final void b() {
                vqg vqgVar = CommunityAddressesFragment.this.A0;
                if (vqgVar == null) {
                    vqgVar = null;
                }
                vqgVar.getClass();
            }
        });
        this.U = pd90Var;
        RecyclerView recyclerView2 = this.V;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(pd90Var);
        d dVar = new d();
        this.S = dVar;
        dVar.initialize();
        View view10 = this.k0;
        if (view10 == null) {
            view10 = null;
        }
        bwt0.R(view10, new hrg(this, 0));
        RecyclerView recyclerView3 = this.V;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        pd90<crg> pd90Var2 = this.U;
        if (pd90Var2 == null) {
            pd90Var2 = null;
        }
        this.C0 = new prg(recyclerView3, pd90Var2, this);
        vqg vqgVar = this.A0;
        if (vqgVar == null) {
            vqgVar = null;
        }
        vqgVar.c(false);
        so(false);
        Ng();
        View view11 = this.k0;
        if (view11 == null) {
            return null;
        }
        return view11;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        vqg vqgVar = this.A0;
        if (vqgVar == null) {
            vqgVar = null;
        }
        vqgVar.d.e();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        vqg vqgVar = this.A0;
        if (vqgVar == null) {
            vqgVar = null;
        }
        if (vqgVar.e == null && vqg.a() && !vqgVar.f) {
            vqgVar.b();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        vqg vqgVar = this.A0;
        if (vqgVar == null) {
            vqgVar = null;
        }
        vqgVar.getClass();
        vqgVar.f = vqg.a();
    }

    public final void oo() {
        xwf xwfVar = this.w0;
        if (xwfVar != null) {
            int i = this.x0 + 1;
            this.x0 = i;
            int i2 = i % xwfVar.c;
            this.x0 = i2;
            Iterator it = xwfVar.b.iterator();
            while (i2 != 0) {
                it.next();
                i2--;
            }
            tqg tqgVar = (tqg) it.next();
            qo(tqgVar);
            g gVar = this.S;
            if (gVar == null) {
                gVar = null;
            }
            gVar.g(false, tqgVar.a);
        }
    }

    public final void po(Location location) {
        if (location != null && !epx.f(location.getProvider(), "NO_LOCATION")) {
            crg crgVar = this.T;
            if (crgVar != null) {
                crgVar.e = location;
            }
            arg argVar = this.f0;
            arg argVar2 = argVar != null ? argVar : null;
            argVar2.l = location;
            Address address = argVar2.j;
            if (address != null) {
                argVar2.d(address);
                return;
            }
            return;
        }
        crg crgVar2 = this.T;
        if (crgVar2 != null) {
            crgVar2.e = null;
        }
        arg argVar3 = this.f0;
        if (argVar3 == null) {
            argVar3 = null;
        }
        argVar3.l = null;
        Address address2 = argVar3.j;
        if (address2 != null) {
            argVar3.d(address2);
        }
    }

    public final void qo(tqg tqgVar) {
        wwf<tqg> wwfVar;
        wwf<tqg> wwfVar2 = this.s0;
        if (wwfVar2 != null) {
            wwfVar2.k();
        }
        if (tqgVar == null || (wwfVar = this.s0) == null) {
            return;
        }
        vj00 vj00Var = ofx.a;
        if (vj00Var == null) {
            vj00Var = null;
        }
        rdr0 c2 = vj00Var.c();
        MarkerOptions markerOptions = c2.a;
        c2.b(tqgVar.b);
        markerOptions.f = 0.5f;
        markerOptions.g = 0.5f;
        qrg qrgVar = this.t0;
        c2.a(qrgVar != null ? qrgVar.i : null);
        markerOptions.o = 10.0f;
        wwfVar.i(c2);
    }

    public final void ro(Throwable th) {
        pwd0 E7;
        if (th instanceof VKApiExecutionException) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            if (vKApiExecutionException.T() && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
                Bundle w = vKApiExecutionException.w();
                long j = w != null ? w.getLong("owner_id") : 0L;
                if (j != 0) {
                    E7 = ((ProfileFragmentProviderComponent) m7m.d(this).a(fpf0.a(ProfileFragmentProviderComponent.class))).E7(j);
                    E7.l(this);
                    finish();
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                return;
            }
        }
        g gVar = this.S;
        if (gVar == null) {
            gVar = null;
        }
        gVar.onError(th);
    }

    public final void so(boolean z) {
        VkPlaceholder vkPlaceholder = this.e0;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        vkPlaceholder.setVisibility(8);
        View view = this.Y;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        View view2 = this.W;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(0);
        if (z) {
            VkSpinner vkSpinner = this.d0;
            if (vkSpinner == null) {
                vkSpinner = null;
            }
            vkSpinner.setVisibility(0);
            View view3 = this.b0;
            if (view3 == null) {
                view3 = null;
            }
            view3.setVisibility(8);
            VkTopBar vkTopBar = this.c0;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            vkTopBar.setVisibility(8);
            RecyclerView recyclerView = this.V;
            (recyclerView != null ? recyclerView : null).setVisibility(8);
            return;
        }
        VkSpinner vkSpinner2 = this.d0;
        if (vkSpinner2 == null) {
            vkSpinner2 = null;
        }
        vkSpinner2.setVisibility(8);
        View view4 = this.b0;
        if (view4 == null) {
            view4 = null;
        }
        view4.setVisibility(0);
        VkTopBar vkTopBar2 = this.c0;
        if (vkTopBar2 == null) {
            vkTopBar2 = null;
        }
        vkTopBar2.setVisibility(0);
        RecyclerView recyclerView2 = this.V;
        (recyclerView2 != null ? recyclerView2 : null).setVisibility(0);
    }

    public final void to() {
        CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = this.u0;
        if (communityAddressesListBehavior == null) {
            communityAddressesListBehavior = null;
        }
        communityAddressesListBehavior.f.clear();
        CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior2 = this.u0;
        if (communityAddressesListBehavior2 == null) {
            communityAddressesListBehavior2 = null;
        }
        communityAddressesListBehavior2.d = Math.min((mo() - this.p0) - this.n0, mo() - this.l0);
        CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior3 = this.u0;
        CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior4 = communityAddressesListBehavior3 != null ? communityAddressesListBehavior3 : null;
        if (communityAddressesListBehavior3 == null) {
            communityAddressesListBehavior3 = null;
        }
        communityAddressesListBehavior4.c = communityAddressesListBehavior3.d;
        int i = this.q0;
        RecyclerView recyclerView = this.V;
        if (recyclerView == null) {
            recyclerView = null;
        }
        if (i > recyclerView.getMeasuredHeight() / 2) {
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior5 = this.u0;
            if (communityAddressesListBehavior5 == null) {
                communityAddressesListBehavior5 = null;
            }
            RecyclerView recyclerView2 = this.V;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            int measuredHeight = recyclerView2.getMeasuredHeight() / 2;
            TreeSet<Integer> treeSet = communityAddressesListBehavior5.f;
            treeSet.clear();
            treeSet.add(Integer.valueOf(measuredHeight));
        }
        int i2 = this.q0;
        RecyclerView recyclerView3 = this.V;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        if (i2 < recyclerView3.getMeasuredHeight()) {
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior6 = this.u0;
            if (communityAddressesListBehavior6 == null) {
                communityAddressesListBehavior6 = null;
            }
            RecyclerView recyclerView4 = this.V;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            communityAddressesListBehavior6.c = (recyclerView4.getMeasuredHeight() - this.q0) - iah0.a(24);
        } else {
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior7 = this.u0;
            if (communityAddressesListBehavior7 == null) {
                communityAddressesListBehavior7 = null;
            }
            communityAddressesListBehavior7.c = E0;
        }
        CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior8 = this.u0;
        if ((communityAddressesListBehavior8 != null ? communityAddressesListBehavior8 : null).c > (communityAddressesListBehavior8 != null ? communityAddressesListBehavior8 : null).d) {
            (communityAddressesListBehavior8 != null ? communityAddressesListBehavior8 : null).c = (communityAddressesListBehavior8 != null ? communityAddressesListBehavior8 : null).d;
        }
    }

    /* compiled from: CommunityAddressesFragment.kt */
    public final class a implements g {
        public int a = -3;

        public a() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void a() {
            int i = CommunityAddressesFragment.E0;
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            communityAddressesFragment.to();
            int i2 = this.a;
            if (i2 != -3) {
                CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
                if (communityAddressesListBehavior == null) {
                    communityAddressesListBehavior = null;
                }
                communityAddressesListBehavior.I(i2, true);
            }
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final boolean a0() {
            return false;
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void c() {
            CommunityAddressesFragment.jo(CommunityAddressesFragment.this);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void d() {
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = CommunityAddressesFragment.this.u0;
            if (communityAddressesListBehavior == null) {
                communityAddressesListBehavior = null;
            }
            communityAddressesListBehavior.I(-1, true);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final x<Boolean> f() {
            return x.k(Boolean.FALSE);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void g(boolean z, PlainAddress plainAddress) {
            edr0 edr0Var;
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            xwf xwfVar = communityAddressesFragment.w0;
            if (xwfVar != null && (edr0Var = xwfVar.a) != null && (edr0Var.a != plainAddress.c || edr0Var.b != plainAddress.d)) {
                communityAddressesFragment.w0 = null;
            }
            b bVar = communityAddressesFragment.new b(true, this, plainAddress);
            communityAddressesFragment.S = bVar;
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
            this.a = (communityAddressesListBehavior != null ? communityAddressesListBehavior : null).b;
            bVar.initialize();
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void h() {
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            RecyclerView recyclerView = communityAddressesFragment.V;
            if (recyclerView == null) {
                recyclerView = null;
            }
            ((LinearLayoutManager) recyclerView.getLayoutManager()).K(0, 0);
            RecyclerView recyclerView2 = communityAddressesFragment.V;
            (recyclerView2 != null ? recyclerView2 : null).post(new ou4(communityAddressesFragment, 2));
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void initialize() {
            int i = CommunityAddressesFragment.E0;
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            communityAddressesFragment.to();
            VkSpinner vkSpinner = communityAddressesFragment.d0;
            if (vkSpinner == null) {
                vkSpinner = null;
            }
            vkSpinner.setVisibility(8);
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior2 = communityAddressesListBehavior != null ? communityAddressesListBehavior : null;
            if (communityAddressesListBehavior2.f.isEmpty()) {
                communityAddressesListBehavior2.I(-2, true);
            } else {
                communityAddressesListBehavior2.I(0, true);
            }
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void e() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void b(Address address) {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void onError(Throwable th) {
        }
    }

    /* compiled from: CommunityAddressesFragment.kt */
    public final class b extends VkBottomSheetBehavior.a implements g {
        public final boolean a;
        public final g b;
        public final PlainAddress c;
        public b d;
        public boolean e;
        public float f;
        public Address g;

        public b(boolean z, g gVar, PlainAddress plainAddress) {
            this.a = z;
            this.b = gVar;
            this.c = plainAddress;
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final boolean a0() {
            this.e = true;
            VkBottomSheetBehavior<View> vkBottomSheetBehavior = CommunityAddressesFragment.this.v0;
            if ((vkBottomSheetBehavior != null ? vkBottomSheetBehavior : null).i == 5) {
                l();
            } else {
                if (vkBottomSheetBehavior == null) {
                    vkBottomSheetBehavior = null;
                }
                vkBottomSheetBehavior.J(5);
            }
            return true;
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void b(Address address) {
            if (address.b != this.c.b) {
                return;
            }
            this.g = address;
            k();
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void c() {
            CommunityAddressesFragment.ko(CommunityAddressesFragment.this, this.c);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final x<Boolean> f() {
            return CommunityAddressesFragment.lo(CommunityAddressesFragment.this, this.c);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void g(boolean z, PlainAddress plainAddress) {
            edr0 edr0Var;
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            xwf xwfVar = communityAddressesFragment.w0;
            if (xwfVar != null && (edr0Var = xwfVar.a) != null && (edr0Var.a != plainAddress.c || edr0Var.b != plainAddress.d)) {
                communityAddressesFragment.w0 = null;
            }
            qrg qrgVar = communityAddressesFragment.t0;
            if (qrgVar != null) {
                qrgVar.j(null);
            }
            int i = plainAddress.b;
            if (i < 0 || i != this.c.b) {
                this.d = communityAddressesFragment.new b(z, this.b, plainAddress);
                VkBottomSheetBehavior<View> vkBottomSheetBehavior = communityAddressesFragment.v0;
                (vkBottomSheetBehavior != null ? vkBottomSheetBehavior : null).J(5);
                if (communityAddressesFragment.y0 == 1) {
                    communityAddressesFragment.y0 = 0;
                }
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void i(View view, float f) {
            this.f = f;
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void initialize() {
            PlainAddress plainAddress = this.c;
            boolean z = plainAddress instanceof Address;
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            if (z) {
                this.g = (Address) plainAddress;
                k();
            } else {
                vqg vqgVar = communityAddressesFragment.A0;
                if (vqgVar == null) {
                    vqgVar = null;
                }
                trg trgVar = vqgVar.g;
                if (trgVar == null) {
                    trgVar = null;
                }
                vqgVar.d.b(hg1.m(trgVar.b(plainAddress.b), vqgVar.c.requireContext(), 1500L, false, 60).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ga(new wzf(vqgVar, 1), 18), new ia(new ha(vqgVar, 20), 16)));
            }
            if (this.a) {
                CommunityAddressesFragment.ko(communityAddressesFragment, plainAddress);
            }
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
            if (communityAddressesListBehavior == null) {
                communityAddressesListBehavior = null;
            }
            communityAddressesListBehavior.F();
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior2 = communityAddressesFragment.u0;
            (communityAddressesListBehavior2 != null ? communityAddressesListBehavior2 : null).l = false;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void j(int i, View view) {
            if (i == 5 || (this.f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i == 4)) {
                l();
            }
        }

        public final void k() {
            Address address = this.g;
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            if (address != null) {
                qrg qrgVar = communityAddressesFragment.t0;
                if (qrgVar != null) {
                    qrgVar.j(address);
                }
                arg argVar = communityAddressesFragment.f0;
                if (argVar == null) {
                    argVar = null;
                }
                argVar.c(communityAddressesFragment.i0, address);
                edr0 edr0Var = new edr0(address.c, address.d);
                wwf<tqg> wwfVar = communityAddressesFragment.s0;
                if (wwfVar != null) {
                    wwfVar.k();
                }
                wwf<tqg> wwfVar2 = communityAddressesFragment.s0;
                if (wwfVar2 != null) {
                    vj00 vj00Var = ofx.a;
                    if (vj00Var == null) {
                        vj00Var = null;
                    }
                    rdr0 c = vj00Var.c();
                    MarkerOptions markerOptions = c.a;
                    c.b(edr0Var);
                    markerOptions.f = 0.5f;
                    markerOptions.g = 0.5f;
                    qrg qrgVar2 = communityAddressesFragment.t0;
                    c.a(qrgVar2 != null ? qrgVar2.i : null);
                    markerOptions.o = 10.0f;
                    wwfVar2.i(c);
                }
            }
            arg argVar2 = communityAddressesFragment.f0;
            if (argVar2 == null) {
                argVar2 = null;
            }
            bwt0.T(argVar2.a, new mm1(8, communityAddressesFragment, this));
            arg argVar3 = communityAddressesFragment.f0;
            (argVar3 != null ? argVar3 : null).a.post(new zq5(2, communityAddressesFragment, this));
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l() {
            qrg qrgVar;
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator animate2;
            ViewPropertyAnimator alpha2;
            ViewPropertyAnimator duration2;
            b bVar = this.d;
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            if (bVar != null) {
                communityAddressesFragment.S = bVar;
                bVar.initialize();
                return;
            }
            this.e = true;
            int i = CommunityAddressesFragment.E0;
            communityAddressesFragment.qo(null);
            int a = iah0.a(8) + communityAddressesFragment.p0;
            communityAddressesFragment.B0 = a;
            ndr0 ndr0Var = communityAddressesFragment.r0;
            if (ndr0Var != null) {
                ndr0Var.q(a);
            }
            View view = communityAddressesFragment.Z;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = communityAddressesFragment.Z;
            if (view2 != null) {
                view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            View view3 = communityAddressesFragment.Z;
            if (view3 != null && (animate2 = view3.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null && (duration2 = alpha2.setDuration(200L)) != null) {
                duration2.start();
            }
            View view4 = communityAddressesFragment.a0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = communityAddressesFragment.a0;
            if (view5 != null) {
                view5.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            View view6 = communityAddressesFragment.a0;
            if (view6 != null && (animate = view6.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(200L)) != null) {
                duration.start();
            }
            if (communityAddressesFragment.y0 == 1) {
                communityAddressesFragment.y0 = 0;
            }
            VkBottomSheetBehavior<View> vkBottomSheetBehavior = communityAddressesFragment.v0;
            if (vkBottomSheetBehavior == null) {
                vkBottomSheetBehavior = null;
            }
            vkBottomSheetBehavior.J(5);
            VkBottomSheetBehavior<View> vkBottomSheetBehavior2 = communityAddressesFragment.v0;
            if (vkBottomSheetBehavior2 == null) {
                vkBottomSheetBehavior2 = null;
            }
            vkBottomSheetBehavior2.q = null;
            g gVar = this.b;
            communityAddressesFragment.S = gVar;
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
            if (communityAddressesListBehavior == null) {
                communityAddressesListBehavior = null;
            }
            communityAddressesListBehavior.l = true;
            if (gVar == null) {
                gVar = null;
            }
            gVar.a();
            if (!this.e) {
                g gVar2 = communityAddressesFragment.S;
                if (gVar2 == null) {
                    gVar2 = null;
                }
                if (!(gVar2 instanceof e)) {
                    RecyclerView recyclerView = communityAddressesFragment.V;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    recyclerView.scrollToPosition(0);
                    RecyclerView recyclerView2 = communityAddressesFragment.V;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    recyclerView2.post(new t12(communityAddressesFragment, 6));
                    qrgVar = communityAddressesFragment.t0;
                    if (qrgVar != null) {
                        qrgVar.j(null);
                    }
                    VkTopBar vkTopBar = communityAddressesFragment.c0;
                    (vkTopBar != null ? vkTopBar : null).setVisibility(4);
                }
            }
            g gVar3 = communityAddressesFragment.S;
            if (gVar3 == null) {
                gVar3 = null;
            }
            gVar3.a();
            qrgVar = communityAddressesFragment.t0;
            if (qrgVar != null) {
            }
            VkTopBar vkTopBar2 = communityAddressesFragment.c0;
            (vkTopBar2 != null ? vkTopBar2 : null).setVisibility(4);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void a() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void d() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void e() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void h() {
        }
    }

    /* compiled from: CommunityAddressesFragment.kt */
    public final class d implements g {
        public d() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final boolean a0() {
            return false;
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void c() {
            CommunityAddressesFragment.jo(CommunityAddressesFragment.this);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final x<Boolean> f() {
            return x.k(Boolean.FALSE);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void initialize() {
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
            if (communityAddressesListBehavior == null) {
                communityAddressesListBehavior = null;
            }
            communityAddressesListBehavior.I(-4, false);
            VkBottomSheetBehavior<View> vkBottomSheetBehavior = communityAddressesFragment.v0;
            (vkBottomSheetBehavior != null ? vkBottomSheetBehavior : null).J(5);
            communityAddressesFragment.h0.postDelayed(new ef2(this, 7), 500L);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void onError(Throwable th) {
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            g gVar = communityAddressesFragment.S;
            if (gVar == null) {
                gVar = null;
            }
            if (epx.f(gVar, this)) {
                VkPlaceholder vkPlaceholder = communityAddressesFragment.e0;
                if (vkPlaceholder == null) {
                    vkPlaceholder = null;
                }
                vkPlaceholder.setVisibility(0);
                CommunityAddressesFragment.io(communityAddressesFragment, th);
                View view = communityAddressesFragment.Y;
                if (view == null) {
                    view = null;
                }
                view.setVisibility(4);
                View view2 = communityAddressesFragment.W;
                (view2 != null ? view2 : null).setVisibility(4);
            }
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void a() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void d() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void e() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void h() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void b(Address address) {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void g(boolean z, PlainAddress plainAddress) {
        }
    }

    /* compiled from: CommunityAddressesFragment.kt */
    public final class e implements g {
        public Throwable a;

        public e() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void a() {
            Throwable th = this.a;
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            if (th != null) {
                g gVar = communityAddressesFragment.S;
                if (gVar == null) {
                    gVar = null;
                }
                gVar.onError(th);
                this.a = null;
                return;
            }
            if (i()) {
                return;
            }
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
            if (communityAddressesListBehavior == null) {
                communityAddressesListBehavior = null;
            }
            communityAddressesListBehavior.e = communityAddressesFragment.mo() - communityAddressesFragment.l0;
            communityAddressesListBehavior.m = true;
            WeakReference<RecyclerView> weakReference = communityAddressesListBehavior.i;
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            if (recyclerView == null) {
                return;
            }
            communityAddressesListBehavior.G(communityAddressesListBehavior.e, recyclerView);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final boolean a0() {
            return false;
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void c() {
            CommunityAddressesFragment.jo(CommunityAddressesFragment.this);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void e() {
            i();
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final x<Boolean> f() {
            return x.k(Boolean.FALSE);
        }

        public final boolean i() {
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            if (!communityAddressesFragment.g0) {
                return false;
            }
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
            if (communityAddressesListBehavior == null) {
                communityAddressesListBehavior = null;
            }
            communityAddressesListBehavior.m = false;
            View view = communityAddressesFragment.W;
            (view != null ? view : null).invalidate();
            a aVar = communityAddressesFragment.new a();
            communityAddressesFragment.S = aVar;
            aVar.initialize();
            return true;
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void initialize() {
            a();
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void onError(Throwable th) {
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            g gVar = communityAddressesFragment.S;
            if (gVar == null) {
                gVar = null;
            }
            if (!epx.f(gVar, this)) {
                this.a = th;
                return;
            }
            VkPlaceholder vkPlaceholder = communityAddressesFragment.e0;
            if (vkPlaceholder == null) {
                vkPlaceholder = null;
            }
            vkPlaceholder.setVisibility(0);
            CommunityAddressesFragment.io(communityAddressesFragment, th);
            View view = communityAddressesFragment.Y;
            if (view == null) {
                view = null;
            }
            view.setVisibility(4);
            View view2 = communityAddressesFragment.W;
            (view2 != null ? view2 : null).setVisibility(4);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void d() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void h() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void b(Address address) {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void g(boolean z, PlainAddress plainAddress) {
        }
    }

    /* compiled from: CommunityAddressesFragment.kt */
    public final class f implements g {
        public final UserId a;
        public final Address b;

        public f(UserId userId, Address address) {
            this.a = userId;
            this.b = address;
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final boolean a0() {
            return false;
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final x<Boolean> f() {
            return CommunityAddressesFragment.lo(CommunityAddressesFragment.this, this.b);
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void initialize() {
            CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
            arg argVar = communityAddressesFragment.f0;
            if (argVar == null) {
                argVar = null;
            }
            argVar.c(this.a, this.b);
            arg argVar2 = communityAddressesFragment.f0;
            if (argVar2 == null) {
                argVar2 = null;
            }
            bwt0.T(argVar2.a, new y(6, communityAddressesFragment, this));
            arg argVar3 = communityAddressesFragment.f0;
            if (argVar3 == null) {
                argVar3 = null;
            }
            argVar3.a.post(new sm9(communityAddressesFragment, 4));
            communityAddressesFragment.h0.postDelayed(new tw3(communityAddressesFragment, 3), 300L);
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
            if (communityAddressesListBehavior == null) {
                communityAddressesListBehavior = null;
            }
            communityAddressesListBehavior.F();
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior2 = communityAddressesFragment.u0;
            (communityAddressesListBehavior2 != null ? communityAddressesListBehavior2 : null).l = false;
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void a() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void c() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void d() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void e() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void h() {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void b(Address address) {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void onError(Throwable th) {
        }

        @Override // com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.g
        public final void g(boolean z, PlainAddress plainAddress) {
        }
    }

    /* compiled from: CommunityAddressesFragment.kt */
    public interface g {
        default boolean a0() {
            return false;
        }

        default x<Boolean> f() {
            return x.k(Boolean.FALSE);
        }

        default void a() {
        }

        default void c() {
        }

        default void d() {
        }

        default void e() {
        }

        default void h() {
        }

        default void initialize() {
        }

        default void b(Address address) {
        }

        default void onError(Throwable th) {
        }

        default void g(boolean z, PlainAddress plainAddress) {
        }
    }
}
