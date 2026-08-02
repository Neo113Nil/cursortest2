package com.vk.newsfeed.impl.posting.attachments;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.core.view.StaticMapView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.geo.GeoPlace;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.e4t;
import xsna.ebs;
import xsna.ecc0;
import xsna.es00;
import xsna.ey90;
import xsna.fcc0;
import xsna.fv70;
import xsna.fv90;
import xsna.gcc0;
import xsna.hd60;
import xsna.hvt0;
import xsna.iah0;
import xsna.j34;
import xsna.jaa0;
import xsna.k7b0;
import xsna.kn4;
import xsna.l0i0;
import xsna.nht;
import xsna.od60;
import xsna.oz50;
import xsna.q7n0;
import xsna.rt0;
import xsna.s8g0;
import xsna.tvo;
import xsna.vif0;
import xsna.xhb0;
import xsna.yr00;
import xsna.yx90;
import xsna.zom0;

/* compiled from: PostingAttachLocationFragment.kt */
/* loaded from: classes4.dex */
public final class PostingAttachLocationFragment extends BaseAttachPickerFragment<GeoLocation, d> implements tvo.a, nht {
    public static final /* synthetic */ int I0 = 0;
    public FrameLayout A0;
    public View B0;
    public c C0;
    public s8g0 D0;
    public Location E0;
    public String F0;
    public ecc0 G0;
    public GeoLocation H0;
    public View z0;

    /* compiled from: PostingAttachLocationFragment.kt */
    public static final class a extends Throwable {
    }

    /* compiled from: PostingAttachLocationFragment.kt */
    public static final class b extends oz50 {
    }

    /* compiled from: PostingAttachLocationFragment.kt */
    public static final class c extends RecyclerView.e0 {
    }

    /* compiled from: PostingAttachLocationFragment.kt */
    public static final class d extends vif0<GeoLocation> implements View.OnClickListener {
        public final String n;
        public final PostingAttachLocationFragment o;
        public final TextView p;
        public final TextView q;
        public final VKImageView r;
        public final TextView s;
        public final StringBuilder t;

        public d(ViewGroup viewGroup, String str, PostingAttachLocationFragment postingAttachLocationFragment) {
            super(viewGroup, R.layout.places_item, 0);
            this.n = str;
            this.o = postingAttachLocationFragment;
            this.p = (TextView) this.itemView.findViewById(R.id.title);
            this.q = (TextView) this.itemView.findViewById(R.id.subtitle);
            this.r = (VKImageView) this.itemView.findViewById(R.id.photo);
            this.s = (TextView) this.itemView.findViewById(R.id.info);
            this.t = new StringBuilder();
            this.itemView.setOnClickListener(this);
        }

        @Override // xsna.vif0
        public final void i6(GeoLocation geoLocation) {
            String g6;
            GeoLocation geoLocation2 = geoLocation;
            if (geoLocation2 == null) {
                return;
            }
            int i = geoLocation2.c;
            String str = geoLocation2.k;
            int i2 = geoLocation2.f;
            int i3 = geoLocation2.b;
            String str2 = geoLocation2.j;
            VKImageView vKImageView = this.r;
            if (str2 == null || str2.length() == 0) {
                Parcelable.Creator<GeoPlace> creator = GeoPlace.CREATOR;
                if (i3 == -1) {
                    vKImageView.setImageResource(R.drawable.vk_icon_place_circle_fill_blue_48);
                } else {
                    vKImageView.setImageResource(R.drawable.vk_icon_place_circle_fill_gray_48);
                }
            } else {
                vKImageView.load(str2);
            }
            this.p.setText(geoLocation2.i);
            if (i3 < 0) {
                g6 = this.n;
                if (g6 == null || g6.length() == 0) {
                    int i4 = PostingAttachLocationFragment.I0;
                    Context context = this.itemView.getContext();
                    g6 = hd60.a().f(context) ? context.getString(R.string.loading) : "";
                }
            } else if (i2 > 0) {
                StringBuilder sb = this.t;
                sb.setLength(0);
                sb.append(k7b0.e(i2, this.itemView.getContext()));
                if (str != null && str.length() != 0) {
                    sb.append(" · ");
                    sb.append(str);
                }
                g6 = sb.toString();
            } else {
                g6 = g6(R.string.address);
            }
            this.q.setText(g6);
            boolean z = i > 0;
            TextView textView = this.s;
            bwt0.p0(textView, z);
            textView.setText(String.valueOf(i));
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object obj = this.m;
            this.o.li(getAdapterPosition(), obj);
        }
    }

    public PostingAttachLocationFragment() {
        Context context = e43.a;
        this.H0 = new GeoLocation(-1, 0, 0, 0, 0, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, (context == null ? null : context).getString(R.string.current_location), null, null, null, null, null, 8062, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener, xsna.ecc0] */
    public final void Ao() {
        ViewTreeObserver viewTreeObserver;
        if (this.G0 == null) {
            ?? r0 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: xsna.ecc0
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    int i = PostingAttachLocationFragment.I0;
                    if (z) {
                        PermissionHelper permissionHelper = PermissionHelper.a;
                        PostingAttachLocationFragment postingAttachLocationFragment = PostingAttachLocationFragment.this;
                        Context requireContext = postingAttachLocationFragment.requireContext();
                        permissionHelper.getClass();
                        if (PermissionHelper.c(requireContext, PermissionHelper.i) && hd60.a().x1(postingAttachLocationFragment.kn()) && hd60.a().A(postingAttachLocationFragment.requireContext())) {
                            postingAttachLocationFragment.yo();
                        }
                    }
                }
            };
            View view = getView();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != 0) {
                viewTreeObserver.addOnWindowFocusChangeListener(r0);
            }
            this.G0 = r0;
        }
    }

    @Override // xsna.txt0
    public final vif0 Cl(ViewGroup viewGroup, zom0 zom0Var) {
        return new d(viewGroup, this.F0, this);
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        s8g0 s8g0Var = this.D0;
        if (s8g0Var != null) {
            s8g0Var.K0(i, strArr);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        oo().c(this);
        return false;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, xsna.txt0
    public final RecyclerView.e0 bn(ViewGroup viewGroup) {
        FragmentActivity kn = kn();
        Location location = this.E0;
        int i = StaticMapView.n;
        int a2 = iah0.a(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE);
        StaticMapView staticMapView = new StaticMapView(kn, null);
        if (location != null) {
            staticMapView.e(location.getLatitude(), location.getLongitude());
        }
        staticMapView.setMaxWidth(640);
        staticMapView.setMaxHeight((a2 * 640) / iah0.v());
        staticMapView.setLayoutParams(new ViewGroup.LayoutParams(-1, StaticMapView.n));
        c cVar = new c(staticMapView);
        cVar.itemView.setPaddingRelative(0, 0, 0, iah0.a(8));
        this.C0 = cVar;
        return cVar;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final q<VkPaginationList<GeoLocation>> ko(int i, com.vk.lists.c cVar) {
        q<R> L = new s0(new od60(this, 1)).L(new xhb0(new fv90(this, 11), 3), false);
        fv70 fv70Var = new fv70(new es00(this, 26), 5);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return L.E(fv70Var, lVar, kVar, kVar).L(new rt0(new fcc0(this, i, cVar, 0), 27), false);
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, xsna.fux
    public final /* bridge */ /* synthetic */ void li(int i, Object obj) {
        xo((GeoLocation) obj);
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        int dimensionPixelSize = onCreateView.getContext().getResources().getDimensionPixelSize(R.dimen.newsfeed_newpost_permission_settings_view_top_space) * 2;
        this.z0 = layoutInflater.inflate(R.layout.view_newpost_location_settings, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = dimensionPixelSize;
        ViewGroup viewGroup2 = (ViewGroup) onCreateView;
        viewGroup2.addView(this.z0, 1, marginLayoutParams);
        this.A0 = new FrameLayout(kn());
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -2);
        fVar.c(new AppBarLayout.ScrollingViewBehavior());
        marginLayoutParams.topMargin = dimensionPixelSize;
        viewGroup2.addView(this.A0, 2, fVar);
        this.B0 = LayoutInflater.from(getActivity()).inflate(R.layout.vkim_stub_play_services_map, (ViewGroup) null);
        viewGroup2.addView(this.B0, 3, new ViewGroup.MarginLayoutParams(-1, -1));
        return onCreateView;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        this.z0 = null;
        this.A0 = null;
        this.C0 = null;
        ecc0 ecc0Var = this.G0;
        if (ecc0Var != null) {
            View view = getView();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnWindowFocusChangeListener(ecc0Var);
            }
            this.G0 = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        s8g0 s8g0Var = this.D0;
        if (s8g0Var != null) {
            s8g0Var.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        wo();
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((AppCompatActivity) getActivity()).setTitle(R.string.place);
        hvt0.a(R.id.attach_location_settings_button, view, new yr00(this, 22));
        ebs c2 = kn4.c(this);
        FrameLayout frameLayout = this.A0;
        dhr0.a.getClass();
        Context E = dhr0.E();
        ey90 ey90Var = new ey90(e3m.f(R.attr.vk_ui_background_content, E), e3m.f(R.attr.vk_ui_text_subhead, E));
        PermissionHelper.a.getClass();
        this.D0 = new s8g0(c2, frameLayout, ey90Var, new yx90(R.string.vk_permissions_location, 14, PermissionHelper.h, PermissionHelper.i, true), new jaa0(this, 3), null, null, null, null, null);
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        s8g0 s8g0Var = this.D0;
        if (s8g0Var != null) {
            s8g0Var.pc(i, list);
        }
        yo();
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final q<VkPaginationList<GeoLocation>> po(int i, com.vk.lists.c cVar) {
        return ko(i, cVar).U(new e4t(new gcc0(i, this), 10));
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final boolean qo() {
        return true;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    /* renamed from: uo */
    public final /* bridge */ /* synthetic */ void li(GeoLocation geoLocation, int i) {
        xo(geoLocation);
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        s8g0 s8g0Var = this.D0;
        if (s8g0Var != null) {
            s8g0Var.wi(i, list);
        }
        zo();
    }

    public final void wo() {
        if (!hd60.a().x1(kn())) {
            q7n0.a().d().a(requireContext(), null, null);
            FrameLayout frameLayout = this.A0;
            if (frameLayout != null) {
                bwt0.p0(frameLayout, false);
            }
            View view = this.z0;
            if (view != null) {
                bwt0.p0(view, true);
            }
            View view2 = this.B0;
            if (view2 != null) {
                bwt0.p0(view2, false);
            }
            VkRecyclerPaginatedView vkRecyclerPaginatedView = this.Z;
            if (vkRecyclerPaginatedView != null) {
                bwt0.p0(vkRecyclerPaginatedView, false);
            }
            l0i0 l0i0Var = this.U;
            if (l0i0Var != null) {
                l0i0Var.c.setVisible(false);
            }
            Ao();
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context requireContext = requireContext();
        permissionHelper.getClass();
        if (!PermissionHelper.c(requireContext, PermissionHelper.i)) {
            s8g0 s8g0Var = this.D0;
            if (s8g0Var != null) {
                s8g0Var.c(false);
            }
            zo();
            return;
        }
        if (hd60.a().A(requireContext())) {
            yo();
            return;
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            bwt0.p0(frameLayout2, false);
        }
        View view3 = this.z0;
        if (view3 != null) {
            bwt0.p0(view3, false);
        }
        View view4 = this.B0;
        if (view4 != null) {
            bwt0.p0(view4, true);
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView2 = this.Z;
        if (vkRecyclerPaginatedView2 != null) {
            bwt0.p0(vkRecyclerPaginatedView2, false);
        }
        l0i0 l0i0Var2 = this.U;
        if (l0i0Var2 != null) {
            l0i0Var2.c.setVisible(false);
        }
        Ao();
    }

    public final void xo(GeoLocation geoLocation) {
        oo().b();
        Intent putExtra = new Intent().putExtra("place", geoLocation);
        String str = this.F0;
        if (str == null) {
            str = "";
        }
        Intent putExtra2 = putExtra.putExtra(RTCStatsConstants.KEY_ADDRESS, str);
        oo().a(putExtra2);
        j34 io2 = io();
        if (io2 != null) {
            io2.V2(putExtra2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, xsna.mht] */
    public final void yo() {
        ViewTreeObserver viewTreeObserver;
        s8g0 s8g0Var = this.D0;
        if (s8g0Var != null) {
            ?? r2 = s8g0Var.m;
            if (r2 != 0) {
                r2.dismiss();
            }
            s8g0Var.m = null;
        }
        s8g0 s8g0Var2 = this.D0;
        if (s8g0Var2 != null) {
            androidx.appcompat.app.d dVar = s8g0Var2.n;
            if (dVar != null) {
                dVar.dismiss();
            }
            s8g0Var2.n = null;
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            bwt0.p0(frameLayout, false);
        }
        View view = this.z0;
        if (view != null) {
            bwt0.p0(view, false);
        }
        View view2 = this.B0;
        if (view2 != null) {
            bwt0.p0(view2, false);
        }
        com.vk.lists.c cVar = this.t0;
        if (cVar != null) {
            cVar.r(true);
        }
        com.vk.lists.c cVar2 = this.t0;
        if (cVar2 != null) {
            cVar2.d();
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.Z;
        if (vkRecyclerPaginatedView != null) {
            bwt0.p0(vkRecyclerPaginatedView, true);
        }
        ecc0 ecc0Var = this.G0;
        if (ecc0Var != null) {
            View view3 = getView();
            if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnWindowFocusChangeListener(ecc0Var);
            }
            this.G0 = null;
        }
    }

    public final void zo() {
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            bwt0.p0(frameLayout, true);
        }
        View view = this.z0;
        if (view != null) {
            bwt0.p0(view, false);
        }
        View view2 = this.B0;
        if (view2 != null) {
            bwt0.p0(view2, false);
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.Z;
        if (vkRecyclerPaginatedView != null) {
            bwt0.p0(vkRecyclerPaginatedView, false);
        }
        l0i0 l0i0Var = this.U;
        if (l0i0Var != null) {
            l0i0Var.c.setVisible(false);
        }
        Ao();
    }
}
