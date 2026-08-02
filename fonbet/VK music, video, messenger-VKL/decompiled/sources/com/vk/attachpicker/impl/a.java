package com.vk.attachpicker.impl;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.PagerViewBottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.StubFragment;
import com.vk.attachpicker.b;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.attachpicker.impl.fragment.AttachMediaFragment;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.attachpicker.impl.location.LocationFragment;
import com.vk.attachpicker.widget.ContentViewPager;
import com.vk.attachpicker.widget.TabsLayoutManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.log.L;
import com.vk.movika.sdk.base.ui.t;
import com.vk.movika.sdk.base.ui.v;
import com.vk.permission.PermissionHelper;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.toggle.Features;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import xsna.a3r0;
import xsna.aa5;
import xsna.aeg0;
import xsna.anj;
import xsna.biq;
import xsna.btn0;
import xsna.bwt0;
import xsna.c3r0;
import xsna.ca;
import xsna.cuz;
import xsna.cyn0;
import xsna.dhr0;
import xsna.e43;
import xsna.ek;
import xsna.f44;
import xsna.g0k0;
import xsna.g2v;
import xsna.gz80;
import xsna.gzs;
import xsna.h2d0;
import xsna.h44;
import xsna.h7;
import xsna.hf8;
import xsna.hpb0;
import xsna.i0q0;
import xsna.i44;
import xsna.iah0;
import xsna.iin0;
import xsna.j44;
import xsna.j5g;
import xsna.k3t;
import xsna.k44;
import xsna.l44;
import xsna.l7n0;
import xsna.n44;
import xsna.n64;
import xsna.nl;
import xsna.no;
import xsna.o44;
import xsna.p3t;
import xsna.p870;
import xsna.pla;
import xsna.px0;
import xsna.q44;
import xsna.qtn0;
import xsna.r44;
import xsna.ra;
import xsna.rj1;
import xsna.rvv;
import xsna.t5m;
import xsna.tb0;
import xsna.tia0;
import xsna.tun;
import xsna.tvv;
import xsna.u1u0;
import xsna.v6;
import xsna.vbs;
import xsna.w40;
import xsna.y6;
import xsna.zmp0;

/* compiled from: AttachViewDelegate.java */
/* loaded from: classes15.dex */
public final class a implements b.InterfaceC0381b, tvv, aeg0, h2d0, LocationFragment.a {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public int K;
    public int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final Integer S;
    public final String T;
    public final String U;
    public final ArrayList<UserId> V;
    public final long W;
    public final String X;
    public final boolean Y;
    public float Z;
    public final UserId a0;
    public final com.vk.attachpicker.c b;
    public final int b0;
    public final IntentFilter c;
    public CopyOnWriteArrayList c0;
    public final int d;
    public final Object d0;
    public RecyclerView e;
    public Window e0;
    public FrameLayout f;
    public final c f0;
    public View g;
    public final d g0;
    public cyn0 h;
    public final l44 h0;
    public FrameLayout i;
    public final e i0;
    public PagerViewBottomSheetBehavior<?> j;
    public final f j0;
    public CoordinatorLayout k;
    public final h44 k0;
    public View l;
    public final g l0;
    public ContentViewPager m;
    public final h m0;
    public VkButton n;
    public final tun n0;
    public ViewGroup o;
    public final k3t o0;
    public TextView p;
    public final l7n0 p0;
    public View q;
    public final gzs<FragmentImpl> q0;
    public View r;
    public r44 r0;
    public m s;
    public final rvv s0;
    public int t;
    public float u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* compiled from: AttachViewDelegate.java */
    /* renamed from: com.vk.attachpicker.impl.a$a, reason: collision with other inner class name */
    public class C0384a extends ViewPager.m {
        public C0384a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            a aVar = a.this;
            aVar.t = i;
            aVar.u = f;
            int i3 = aVar.J;
            StoryFragment d = aVar.d();
            if (d != null) {
                if (!aVar.y || aVar.t != i3) {
                    d.fo(1.0f, aVar.m.getWidth());
                } else if (d.fo(f, i2)) {
                    aVar.m.setCurrentItem(i3);
                }
            }
            aVar.p();
        }

        /* JADX WARN: Type inference failed for: r10v10, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            a aVar = a.this;
            int i2 = aVar.L;
            if (i == i2) {
                if (i2 >= 0) {
                    g2v.d().a().d(aVar.d0.kn(), aVar.V, false, "attach", null);
                }
                aVar.m.setCurrentItem(aVar.t, false);
                return;
            }
            aVar.e.smoothScrollToPosition(i);
            aVar.t = i;
            aVar.u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            cyn0.b bVar = aVar.h.f.get(i);
            if (aVar.b.e.size() <= 0 || !aVar.f()) {
                aVar.b(true, true);
            } else {
                aVar.b(false, true);
            }
            if (aVar.E && bVar.a == R.drawable.vk_icon_cup_outline_28) {
                aVar.a(true);
                aVar.p.setText(R.string.picker_achievements_action_btn);
            } else {
                aVar.a(false);
            }
            aVar.o();
            if (bVar.a == R.drawable.money_transfer_outline_32) {
                Preference.f("Attach_Prefs").edit().putBoolean("MONEY_ATTACH_BADGE_SEEN", true).apply();
            }
            aVar.p();
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public class b extends BottomSheetBehavior.d {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(@NonNull View view, float f) {
            a aVar = a.this;
            aVar.n(f);
            aVar.Z = f;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, @NonNull View view) {
            a aVar = a.this;
            if (i == 5) {
                aVar.c();
                return;
            }
            aVar.m.setSwipeEnabled(i == 4 || i == 2);
            if (i != 2) {
                m mVar = aVar.s;
                if (!mVar.k) {
                    mVar.k = true;
                    mVar.notifyDataSetChanged();
                }
            }
            aVar.o();
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            a.this.c();
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            a.this.c();
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            FragmentImpl fragmentImpl = aVar.s.n;
            if (fragmentImpl == null || !(fragmentImpl instanceof BaseAttachPickerFragment)) {
                aVar.l(aVar.b.w());
            } else {
                ((BaseAttachPickerFragment) fragmentImpl).so();
            }
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.lifecycle.f fVar = a.this.s.n;
            if (fVar instanceof n64) {
                ((n64) fVar).J5();
            }
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public class g extends BroadcastReceiver {
        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("count", 0);
            a aVar = a.this;
            VkButton vkButton = aVar.n;
            if (vkButton != null) {
                vkButton.setCount(Integer.valueOf(intExtra));
                if (intExtra > 0) {
                    aVar.b(false, true);
                } else {
                    aVar.b(true, true);
                }
            }
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public class h extends BroadcastReceiver {
        public h() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            a.this.l(intent);
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public class i extends TabsLayoutManager {
        public i(Activity activity) {
            super(activity);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
            super.onLayoutCompleted(a0Var);
            if (pla.e().b().a(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP.getId())) {
                int x = x();
                a aVar = a.this;
                List list = (List) aVar.h.f.stream().filter(new i44(0)).collect(Collectors.toList());
                cyn0.b bVar = (cyn0.b) list.stream().reduce(new j44()).orElse(null);
                if (bVar != null) {
                    int indexOf = aVar.h.f.indexOf(bVar);
                    View findViewByPosition = findViewByPosition(indexOf);
                    String str = bVar.e;
                    if (x > indexOf) {
                        aVar.m(findViewByPosition, str, list.size() == 1, null);
                    } else {
                        aVar.m(findViewByPosition(x), str, false, new k44(aVar, indexOf, 0));
                    }
                }
            }
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public class j implements cyn0.a {
        public j() {
        }

        @Override // xsna.cyn0.a
        public final float a() {
            return a.this.u;
        }

        @Override // xsna.cyn0.a
        public final int position() {
            return a.this.t;
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public class k extends RecyclerView.t {
        public k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            a.this.p();
        }
    }

    /* compiled from: AttachViewDelegate.java */
    public interface l extends f44 {
        void Bm();

        vbs d4();

        Activity kn();

        Bundle requireArguments();

        void setResult(int i);

        void setResult(int i, Intent intent);
    }

    /* compiled from: AttachViewDelegate.java */
    public class m extends com.vk.core.fragments.h {
        public boolean k;
        public int l;
        public ViewGroup m;
        public FragmentImpl n;

        public m(vbs vbsVar) {
            super(vbsVar, false);
            this.k = false;
            this.l = 0;
        }

        @Override // com.vk.core.fragments.h
        @NonNull
        public final FragmentImpl c(int i) {
            if (!this.k && i != this.l) {
                return new StubFragment();
            }
            try {
                return a.this.h.f.get(i).d.invoke();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return a.this.h.f.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(@NonNull Object obj) {
            return (this.k && (obj instanceof StubFragment)) ? -2 : -1;
        }

        @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return this.k ? super.isViewFromObject(view, obj) && !(obj instanceof StubFragment) : super.isViewFromObject(view, obj);
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
        @Override // com.vk.core.fragments.h, xsna.s1q0, androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            ViewGroup Wj;
            d(viewGroup, i, obj);
            FragmentImpl fragmentImpl = (FragmentImpl) obj;
            FragmentImpl fragmentImpl2 = this.n;
            a aVar = a.this;
            if (fragmentImpl != fragmentImpl2) {
                com.vk.core.fragments.h.e(fragmentImpl2, false);
                com.vk.core.fragments.h.e(fragmentImpl, true);
                this.n = fragmentImpl;
                r44 r44Var = aVar.r0;
                if (r44Var != null) {
                    i0q0.h(r44Var);
                }
                r44 r44Var2 = new r44(this, 0);
                aVar.r0 = r44Var2;
                i0q0.e(r44Var2);
            }
            androidx.lifecycle.f fVar = this.n;
            if ((fVar instanceof iin0) && (Wj = ((iin0) fVar).Wj(aVar.d0.kn())) != null && this.m != Wj) {
                if (Wj.getParent() != null) {
                    ((ViewGroup) Wj.getParent()).removeView(Wj);
                }
                aVar.i.removeAllViews();
                Wj.setVisibility(0);
                aVar.i.addView(Wj);
                this.m = Wj;
            }
            androidx.lifecycle.f fVar2 = this.n;
            if (fVar2 instanceof BaseAttachPickerFragment) {
                BaseAttachPickerFragment baseAttachPickerFragment = (BaseAttachPickerFragment) fVar2;
                if (baseAttachPickerFragment.isResumed()) {
                    baseAttachPickerFragment.to(baseAttachPickerFragment.c0.a.size());
                    return;
                }
                return;
            }
            if (fVar2 instanceof LocationFragment) {
                ((LocationFragment) fVar2).jo();
                return;
            }
            if (fVar2 instanceof p3t) {
                ((p3t) fVar2).Zk();
                aVar.q();
            } else {
                if (fVar2 instanceof AttachMediaFragment) {
                    aVar.q();
                    return;
                }
                if (!(fVar2 instanceof PollEditorFragment)) {
                    aVar.b(true, true);
                    return;
                }
                hpb0 hpb0Var = ((PollEditorFragment) fVar2).S;
                if (hpb0Var == null) {
                    hpb0Var = null;
                }
                hpb0Var.t();
            }
        }
    }

    public a(l lVar, tun tunVar, k3t k3tVar, l7n0 l7n0Var, PhotosComponent photosComponent) {
        com.vk.attachpicker.c cVar = new com.vk.attachpicker.c();
        this.b = cVar;
        this.c = new IntentFilter("noPermissionsPickerAttachments");
        this.I = false;
        this.J = -1;
        this.K = 0;
        this.L = -1;
        this.S = null;
        this.V = new ArrayList<>();
        this.Z = -1.0f;
        c cVar2 = new c();
        this.f0 = cVar2;
        d dVar = new d();
        this.g0 = dVar;
        this.i0 = new e();
        this.j0 = new f();
        h44 h44Var = new h44(this, 0);
        this.k0 = h44Var;
        g gVar = new g();
        this.l0 = gVar;
        this.m0 = new h();
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        rvv rvvVar = new rvv(400L);
        this.s0 = rvvVar;
        this.d0 = lVar;
        this.h0 = new l44(this, 0);
        dhr0.f(new dhr0.e() { // from class: xsna.m44
            @Override // xsna.dhr0.e
            public final void sb(VKTheme vKTheme) {
                com.vk.attachpicker.impl.a.this.c();
            }
        });
        SharedPreferences f2 = Preference.f("Attach_Prefs");
        if (t5m.c() && !f2.getBoolean("IS_MEDIA_PERMISSION_REVOKED", false) && Build.VERSION.SDK_INT >= 33) {
            Activity kn = lVar.kn();
            PermissionHelper.a.getClass();
            kn.revokeSelfPermissionsOnKill(Arrays.asList(PermissionHelper.e));
            f2.edit().putBoolean("IS_MEDIA_PERMISSION_REVOKED", true).apply();
            L.G("revoke media permissions request");
        }
        this.n0 = tunVar;
        this.o0 = k3tVar;
        this.p0 = l7n0Var;
        this.d = lVar.kn().getColor(R.color.picker_semi_transparent_background);
        cVar.a = lVar.requireArguments().getInt("selection_limit", 10);
        this.v = lVar.requireArguments().getBoolean("enable_map_attachment", false);
        this.w = lVar.requireArguments().getBoolean("enable_gift_attachment", false);
        this.x = lVar.requireArguments().getBoolean("enable_graffiti_att", false);
        this.A = lVar.requireArguments().getBoolean("enable_poll_attachment", false);
        boolean z = lVar.requireArguments().getBoolean("enable_story_attachment", false);
        this.y = z;
        this.F = lVar.requireArguments().getBoolean("vk_video_type", false);
        this.G = lVar.requireArguments().getBoolean("video_from_gallery_type", false);
        if (z) {
            this.J = 0;
            this.K = 1;
        }
        this.B = lVar.requireArguments().getBoolean("enable_pick_from_vk", true);
        this.C = lVar.requireArguments().getBoolean("enable_documents_search", true);
        this.z = lVar.requireArguments().getBoolean("enable_music_attachment", false);
        this.D = lVar.requireArguments().getBoolean("apps", false);
        this.E = lVar.requireArguments().getBoolean("achievements", false);
        lVar.requireArguments().getBoolean("new_photo_editor_entry_points", false);
        if (lVar.requireArguments().containsKey("gift_users")) {
            this.V = lVar.requireArguments().getParcelableArrayList("gift_users");
        }
        long j2 = lVar.requireArguments().getLong("peer_id", 0L);
        this.W = j2;
        this.X = lVar.requireArguments().getString("peer_title");
        this.Y = lVar.requireArguments().getBoolean("can_pin_attachment", false);
        com.vk.dto.common.b.a(j2);
        UserId userId = (UserId) lVar.requireArguments().getParcelable("owner_id");
        this.a0 = userId;
        this.b0 = lVar.requireArguments().getInt("post_id", 0);
        this.T = lVar.requireArguments().getString("graffiti_avatar");
        this.U = lVar.requireArguments().getString("graffiti_title");
        lVar.requireArguments().getBoolean("is_dialog", true);
        this.H = lVar.requireArguments().getBoolean("is_community_channel", false);
        if (lVar.requireArguments().containsKey("inactive_background_color")) {
            this.M = lVar.requireArguments().getInt("inactive_background_color", 0);
        } else {
            this.M = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_inactive_background);
        }
        if (lVar.requireArguments().containsKey("active_background_color")) {
            this.N = lVar.requireArguments().getInt("active_background_color", 0);
        } else {
            this.N = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_active_background);
        }
        if (lVar.requireArguments().containsKey("inactive_icon_color")) {
            this.O = lVar.requireArguments().getInt("inactive_icon_color", 0);
        } else {
            this.O = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_inactive_icon);
        }
        if (lVar.requireArguments().containsKey("active_icon_color")) {
            this.P = lVar.requireArguments().getInt("active_icon_color", 0);
        } else {
            this.P = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_active_icon);
        }
        if (lVar.requireArguments().containsKey("inactive_text_color")) {
            this.Q = lVar.requireArguments().getInt("inactive_text_color", 0);
        } else {
            this.Q = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_inactive_text);
        }
        if (lVar.requireArguments().containsKey("active_text_color")) {
            this.R = lVar.requireArguments().getInt("active_text_color", 0);
        } else {
            this.R = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_active_text);
        }
        if (lVar.requireArguments().containsKey("attach_counter_button_color")) {
            this.S = Integer.valueOf(lVar.requireArguments().getInt("attach_counter_button_color", 0));
        }
        if (lVar.requireArguments().containsKey("window_flag_secure")) {
            this.I = lVar.requireArguments().getBoolean("window_flag_secure", false);
        }
        Activity kn2 = lVar.kn();
        IntentFilter intentFilter = new IntentFilter("com.vkontakte.android.ACTION_GIFT_SENT");
        String str = hf8.a;
        anj.d(kn2, cVar2, intentFilter, str, 4);
        anj.d(lVar.kn(), dVar, new IntentFilter("com.vkontakte.android.ACTION_MONEY_TRANSFER_SENT"), str, 4);
        p870.f().b(1, h44Var);
        cuz.a(lVar.kn()).b(gVar, new IntentFilter("count"));
        rvvVar.b(100L, new n44(this, 0));
        this.q0 = photosComponent.m2(userId);
        tia0.F0();
        rvv.f.add(this);
    }

    @Override // xsna.aeg0
    public final void Li(tb0 tb0Var) {
        if (this.c0 == null) {
            this.c0 = new CopyOnWriteArrayList();
        }
        this.c0.add(tb0Var);
    }

    @Override // com.vk.attachpicker.impl.location.LocationFragment.a
    public final void N() {
        this.j.X(3);
    }

    @Override // com.vk.attachpicker.b.InterfaceC0381b
    public final com.vk.attachpicker.b Yd() {
        return this.b;
    }

    public final void a(boolean z) {
        int i2 = z ? 0 : 8;
        if (i2 != this.q.getVisibility()) {
            ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
            layoutParams.height = z ? iah0.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) : -2;
            this.o.setLayoutParams(layoutParams);
        }
        this.q.setVisibility(i2);
    }

    public final void b(boolean z, boolean z2) {
        if (z) {
            this.r.setOnClickListener(this.h0);
        } else {
            this.r.setOnClickListener(this.i0);
        }
        if (z2) {
            biq biqVar = new biq();
            biqVar.setDuration(200L);
            zmp0.a(this.o, biqVar);
        }
        if (z) {
            this.r.setVisibility(0);
            this.n.setVisibility(8);
        } else {
            this.r.setVisibility(8);
            this.n.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    public final void c() {
        this.j.X(5);
        if (this.j.M == 5) {
            this.d0.Bm();
        }
    }

    @Nullable
    public final StoryFragment d() {
        int i2 = this.J;
        if (i2 < 0) {
            return null;
        }
        FragmentImpl b2 = this.s.b(i2);
        if (b2 instanceof StoryFragment) {
            return (StoryFragment) b2;
        }
        return null;
    }

    public final void e(int i2) {
        if (i2 == 1) {
            this.j.W((int) ((iah0.f().heightPixels * 1.8f) / 3.0f), false);
        } else {
            this.j.W((int) ((iah0.f().heightPixels * 3.0f) / 5.0f), false);
        }
    }

    public final boolean f() {
        return this.m.getCurrentItem() == this.K;
    }

    public final void g(int i2, int i3, Intent intent) {
        FragmentImpl fragmentImpl;
        CopyOnWriteArrayList copyOnWriteArrayList = this.c0;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((tb0) it.next()).onActivityResult(i2, i3, intent);
            }
        }
        if (!f() || (fragmentImpl = this.s.n) == null) {
            return;
        }
        fragmentImpl.onActivityResult(i2, i3, intent);
    }

    public final boolean h() {
        if (this.s.n.a0()) {
            return true;
        }
        if (!f()) {
            return false;
        }
        com.vk.attachpicker.c cVar = this.b;
        if (cVar.e.size() <= 0) {
            return false;
        }
        cVar.clear();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    @Nullable
    public final View i(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @Nullable Window window) {
        int i2;
        l7n0 l7n0Var;
        nl a;
        int i3 = 5;
        if (bundle != null) {
            this.Z = bundle.getFloat("SLIDE_OFFSET", -1.0f);
            i3 = bundle.getInt("BOTTOM_SHEET_STATE", 5);
        }
        ?? r1 = this.d0;
        Window window2 = window != null ? window : r1.kn().getWindow();
        this.e0 = window2;
        u1u0.h(window2, 0);
        View inflate = layoutInflater.inflate(R.layout.picker_activity_attach, viewGroup, false);
        this.e = (RecyclerView) inflate.findViewById(R.id.rv_tabs);
        this.f = (FrameLayout) inflate.findViewById(R.id.fl_tabs_container);
        this.g = inflate.findViewById(R.id.tabs_overlay);
        this.i = (FrameLayout) inflate.findViewById(R.id.tc_toolbar_container);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.main_content);
        this.k = coordinatorLayout;
        coordinatorLayout.setBackgroundColor(this.d);
        this.l = inflate.findViewById(R.id.click_handler);
        this.m = (ContentViewPager) inflate.findViewById(R.id.pager);
        this.o = (ViewGroup) inflate.findViewById(R.id.fl_bottom_button);
        this.n = (VkButton) inflate.findViewById(R.id.acv_bottom_panel_counter);
        this.p = (TextView) inflate.findViewById(R.id.tv_bottom_panel_action_btn);
        this.q = inflate.findViewById(R.id.tv_bottom_panel_action);
        this.r = inflate.findViewById(R.id.tv_bottom_panel_cancel);
        this.o.setOnClickListener(new o44(0));
        this.i.setOnClickListener(new o44(0));
        this.f.setOnClickListener(new o44(0));
        this.p.setOnClickListener(this.j0);
        View view = this.r;
        l44 l44Var = this.h0;
        view.setOnClickListener(l44Var);
        this.l.setOnClickListener(l44Var);
        this.n.setOnClickListener(this.i0);
        Integer num = this.S;
        if (num != null) {
            this.n.setBackgroundColor(num.intValue());
        }
        this.e.setLayoutManager(new i(r1.kn()));
        cyn0 cyn0Var = new cyn0(new j(), new cyn0.c(this.M, this.N, this.O, this.P, this.Q, this.R));
        this.h = cyn0Var;
        cyn0Var.c = new h7(this, 3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.y) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_story_outline_32, R.string.story, new ra(this, 3), false));
            arrayList2.add(TabOrderUtils$Tab.STORIES);
        }
        arrayList.add(new cyn0.b(R.drawable.vk_icon_picture_outline_32, this.G ? R.string.picker_photo : R.string.picker_tab_photo_video, new ca(this, 6), false));
        arrayList2.add(TabOrderUtils$Tab.GALLERY);
        if (this.E) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_cup_outline_28, R.string.picker_tab_achievements, new px0(this, 3), false));
            arrayList2.add(TabOrderUtils$Tab.ACHIEVEMENTS);
        }
        if (this.z) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_music_outline_32, R.string.music, new t(this, 4), false));
            arrayList2.add(TabOrderUtils$Tab.MUSIC);
        }
        if (this.v && !com.vk.toggle.b.A.a(ImFeatures.DISABLE_GEO)) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_place_outline_32, R.string.picker_tab_location, new v(3), false));
            arrayList2.add(TabOrderUtils$Tab.MAP);
        }
        boolean z = this.w;
        if (z && this.V != null) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_gift_outline_32, R.string.picker_tab_gift, new ek(1), true));
            arrayList2.add(TabOrderUtils$Tab.GIFTS);
        }
        arrayList.add(new cyn0.b(R.drawable.vk_icon_document_outline_32, R.string.picker_tab_document, new v6(this, 3), true));
        arrayList2.add(TabOrderUtils$Tab.DOCUMENTS);
        if (this.A) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_poll_outline_32, R.string.picker_tab_poll, new y6(this, 3), false));
            arrayList2.add(TabOrderUtils$Tab.POLL);
        }
        if (this.x) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_deprecated_brush_outline_32, R.string.picker_graffiti, new rj1(this, 4), false));
            arrayList2.add(TabOrderUtils$Tab.GRAFFITI);
        }
        boolean z2 = this.B;
        gzs<FragmentImpl> gzsVar = this.q0;
        if (z2) {
            arrayList.add(new cyn0.b(com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_VK_PHOTO_PICKER) ? R.drawable.vk_icon_picture_stack_outline_28 : R.drawable.vk_icon_picture_outline_32, R.string.picker_tab_vk_photo, gzsVar, true));
            arrayList2.add(TabOrderUtils$Tab.PHOTO_VK);
            arrayList.add(new cyn0.b(R.drawable.vk_icon_play_rectangle_stack_outline_28, R.string.picker_tab_vk_video, new no(this, 3), false));
            arrayList2.add(TabOrderUtils$Tab.VIDEO_VK);
        }
        if (this.F) {
            arrayList.add(new cyn0.b(com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_VK_PHOTO_PICKER) ? R.drawable.vk_icon_picture_stack_outline_28 : R.drawable.vk_icon_picture_outline_32, R.string.picker_tab_vk_photo, gzsVar, true));
            arrayList2.add(TabOrderUtils$Tab.PHOTO_VK);
        }
        UserId userId = new UserId(this.W);
        if (this.D && (l7n0Var = this.p0) != null && (a = l7n0Var.a(userId)) != null) {
            cyn0.b bVar = new cyn0.b(R.drawable.vk_icon_services_outline_28, R.string.vk_picker_app, new w40(a, 6), false);
            bVar.e = HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP.getId();
            arrayList.add(bVar);
            arrayList2.add(TabOrderUtils$Tab.SERVICES);
        }
        List D0 = j5g.D0(new btn0(arrayList2, arrayList), arrayList);
        cyn0 cyn0Var2 = this.h;
        ArrayList<cyn0.b> arrayList3 = cyn0Var2.f;
        arrayList3.clear();
        arrayList3.addAll(D0);
        cyn0Var2.notifyDataSetChanged();
        Iterator it = D0.iterator();
        int i4 = 0;
        while (true) {
            i2 = -1;
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            Object next = it.next();
            if (i4 < 0) {
                e43.t();
                throw null;
            }
            if (((cyn0.b) next).b == R.string.picker_tab_photo_video) {
                break;
            }
            i4++;
        }
        Integer valueOf = i4 != -1 ? Integer.valueOf(i4) : null;
        if (z) {
            Iterator it2 = D0.iterator();
            int i5 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((cyn0.b) it2.next()).b == R.string.picker_tab_gift) {
                    i2 = i5;
                    break;
                }
                i5++;
            }
            this.L = i2;
        }
        if (valueOf != null) {
            this.K = valueOf.intValue();
        }
        this.e.setAdapter(this.h);
        this.e.addOnScrollListener(new k());
        this.k.setStatusBarBackgroundColor(0);
        m mVar = new m(r1.d4());
        this.s = mVar;
        mVar.l = this.K;
        this.m.setAdapter(mVar);
        this.m.setCurrentItem(this.K);
        this.m.addOnPageChangeListener(new C0384a());
        PagerViewBottomSheetBehavior<?> g0 = PagerViewBottomSheetBehavior.g0(this.m);
        this.j = g0;
        g0.V(true);
        this.j.X(i3);
        this.j.D(new b());
        this.m.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.p44
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                com.vk.attachpicker.impl.a.this.f.setTranslationY(r0.m.getTop() - r0.f.getHeight());
            }
        });
        e(r1.kn().getResources().getConfiguration().orientation);
        ContentViewPager contentViewPager = this.m;
        contentViewPager.getViewTreeObserver().addOnPreDrawListener(new a3r0(contentViewPager, new q44(this, 0)));
        b(false, false);
        a(false);
        return inflate;
    }

    @Override // xsna.tvv
    public final boolean isIdle() {
        PagerViewBottomSheetBehavior<?> pagerViewBottomSheetBehavior = this.j;
        return (pagerViewBottomSheetBehavior == null || pagerViewBottomSheetBehavior.M == 2) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    public final void j() {
        ?? r0 = this.d0;
        cuz.a(r0.kn()).d(this.l0);
        p870.f().g(this.k0);
        r0.kn().unregisterReceiver(this.f0);
        r0.kn().unregisterReceiver(this.g0);
        i0q0.h(this.r0);
        rvv.f.remove(this);
        this.s0.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    public final void k() {
        ?? r0 = this.d0;
        cuz.a(r0.kn()).b(this.m0, this.c);
        o();
        if (gz80.a(24) && r0.kn().isInMultiWindowMode()) {
            n(this.Z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    public final void l(Intent intent) {
        ?? r0 = this.d0;
        if (intent == null) {
            r0.setResult(0);
            c();
        } else {
            intent.putExtra("owner_id", this.a0);
            intent.putExtra("post_id", this.b0);
            r0.setResult(-1, intent);
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    public final void m(View view, String str, boolean z, k44 k44Var) {
        View findViewById = (!z || view == null) ? (view == null || k44Var != null) ? view != null ? view.findViewById(R.id.attach_hint_point_left) : null : view.findViewById(R.id.attach_hint_point_right) : view.findViewById(R.id.iv_icon);
        if (findViewById != null) {
            Activity kn = this.d0.kn();
            if (pla.e().b().a(str)) {
                bwt0.n(findViewById, new aa5(str, kn, findViewById, k44Var));
            }
        }
    }

    public final void n(float f2) {
        this.f.setTranslationY(this.m.getTop() - this.f.getHeight());
        this.o.setTranslationY(Math.max(this.o.getHeight() + (this.m.getTop() - this.k.getHeight()), 0));
        if (f2 < 0.8f) {
            this.i.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.g.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.i.setVisibility(4);
        } else {
            float f3 = (f2 - 0.8f) / 0.19999999f;
            this.i.setAlpha(f3);
            this.g.setAlpha(f3);
            this.i.setVisibility(0);
        }
        if (f2 < -0.8f) {
            this.f.setAlpha(1.0f - (Math.min((-f2) - 0.8f, 0.099999964f) / 0.099999964f));
        } else {
            this.f.setAlpha(1.0f);
        }
        int i2 = this.d;
        if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.k.setBackgroundColor(i2);
        } else {
            int b2 = c3r0.b(-Math.max(-1.0f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2)), i2, 0);
            this.k.setBackgroundColor(b2);
            u1u0.h(this.e0, b2);
        }
        androidx.lifecycle.f fVar = this.s.n;
        if (fVar instanceof g0k0) {
            ((g0k0) fVar).n0(f2);
        }
    }

    public final void o() {
        this.m.setAllowNestedViewHorizontalScroll(this.j.M == 3 || this.h.f.get(this.m.getCurrentItem()).c);
    }

    public final void p() {
        for (int i2 = 0; i2 < this.e.getChildCount(); i2++) {
            View childAt = this.e.getChildAt(i2);
            ((qtn0) childAt).a(this.u, this.e.getChildAdapterPosition(childAt), this.t);
        }
    }

    public final void q() {
        com.vk.attachpicker.c cVar = this.b;
        ArrayList arrayList = cVar.e;
        ArrayList arrayList2 = cVar.e;
        if (arrayList.size() > 0) {
            this.n.setCount(Integer.valueOf(arrayList2.size()));
        } else {
            this.n.setCount(1);
        }
        if (arrayList2.size() <= 0 || !f()) {
            b(true, true);
        } else {
            b(false, true);
        }
    }

    @Override // xsna.h2d0
    public final void qm(@NonNull HashMap hashMap) {
        androidx.lifecycle.f fVar = this.s.n;
        if (fVar instanceof p3t) {
            ((p3t) fVar).R3(hashMap, new com.vk.movika.sdk.base.logic.interactor.l(4));
            q();
        }
    }

    @NonNull
    public final String toString() {
        return this.d0.toString();
    }

    @Override // xsna.aeg0
    public final void yk(tb0 tb0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c0;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(tb0Var);
        }
    }
}
