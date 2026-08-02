package com.vk.attachpicker.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.PagerViewBottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.StubFragment;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.attachpicker.impl.location.LocationFragment;
import com.vk.attachpicker.widget.ContentViewPager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.h;
import com.vk.core.preference.Preference;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.components.button.VkButton;
import com.vk.documents.api.di.DocumentsComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.gallerypicker.di.GalleryPickerComponent;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.pushes.PushAwareActivity;
import com.vk.superapp.di.SuperAppServicesComponent;
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
import xsna.a3r0;
import xsna.aa5;
import xsna.akh;
import xsna.anj;
import xsna.bd70;
import xsna.biq;
import xsna.btn0;
import xsna.bwt0;
import xsna.c3r0;
import xsna.c7;
import xsna.cuz;
import xsna.cyn0;
import xsna.dhr0;
import xsna.e43;
import xsna.f0m;
import xsna.f44;
import xsna.g0k0;
import xsna.g0m;
import xsna.gbh;
import xsna.gz80;
import xsna.gzs;
import xsna.h0m;
import xsna.h2d0;
import xsna.hf8;
import xsna.hpb0;
import xsna.i0m;
import xsna.i0q0;
import xsna.iah0;
import xsna.iy2;
import xsna.j5g;
import xsna.j6i;
import xsna.jk9;
import xsna.k0m;
import xsna.k3t;
import xsna.l0m;
import xsna.l7n0;
import xsna.m0m;
import xsna.m7m;
import xsna.mag;
import xsna.mhy;
import xsna.n0m;
import xsna.n1i;
import xsna.n64;
import xsna.nl;
import xsna.o6;
import xsna.ozf;
import xsna.p3t;
import xsna.p870;
import xsna.pla;
import xsna.qtn0;
import xsna.qzg;
import xsna.rok;
import xsna.rvv;
import xsna.sk4;
import xsna.sok;
import xsna.sx0;
import xsna.t5m;
import xsna.tb0;
import xsna.tia0;
import xsna.tok;
import xsna.tun;
import xsna.tvv;
import xsna.u1u0;
import xsna.ux3;
import xsna.vbs;
import xsna.w40;
import xsna.xq3;
import xsna.xyh;
import xsna.z00;
import xsna.zmp0;

@Deprecated
/* loaded from: classes15.dex */
public class DeprecatedAttachActivity extends PushAwareActivity implements LocationFragment.a, tvv, rok, f44, h2d0 {
    public static final /* synthetic */ int K0 = 0;
    public FrameLayout A;
    public View B;
    public cyn0 C;
    public FrameLayout D;
    public PagerViewBottomSheetBehavior<?> E;
    public CoordinatorLayout F;
    public View G;
    public ContentViewPager H;
    public VkButton I;
    public ViewGroup J;
    public TextView K;
    public View L;
    public View M;
    public g N;
    public int O;
    public float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public String n0;
    public String o0;
    public long q0;
    public String r0;
    public boolean s0;
    public UserId u0;
    public int v0;
    public CopyOnWriteArrayList w0;
    public int y;
    public RecyclerView z;
    public final com.vk.attachpicker.c v = new com.vk.attachpicker.c();
    public final IntentFilter w = new IntentFilter("noPermissionsPickerAttachments");
    public final sok x = new sok(this);
    public int d0 = -1;
    public int e0 = 0;
    public int f0 = -1;
    public Integer m0 = null;
    public ArrayList<UserId> p0 = new ArrayList<>();
    public float t0 = -1.0f;
    public final c x0 = new c();
    public final d y0 = new d();
    public final z00 z0 = new z00(this, 3);
    public final e A0 = new e();
    public final f B0 = new f();
    public tun C0 = null;
    public k3t D0 = null;
    public l7n0 E0 = null;
    public final g0m F0 = new dhr0.e() { // from class: xsna.g0m
        @Override // xsna.dhr0.e
        public final void sb(VKTheme vKTheme) {
            int i = DeprecatedAttachActivity.K0;
            DeprecatedAttachActivity.this.V1();
        }
    };
    public jk9 G0 = null;
    public final h0m H0 = new bd70() { // from class: xsna.h0m
        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            int i3 = DeprecatedAttachActivity.K0;
            DeprecatedAttachActivity.this.Q2();
        }
    };
    public final a I0 = new a();
    public final b J0 = new b();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("count", 0);
            DeprecatedAttachActivity deprecatedAttachActivity = DeprecatedAttachActivity.this;
            VkButton vkButton = deprecatedAttachActivity.I;
            if (vkButton != null) {
                vkButton.setCount(Integer.valueOf(intExtra));
                if (intExtra > 0) {
                    deprecatedAttachActivity.U1(false, true);
                } else {
                    deprecatedAttachActivity.U1(true, true);
                }
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            DeprecatedAttachActivity.this.V2(intent);
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            DeprecatedAttachActivity.this.finish();
        }
    }

    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            DeprecatedAttachActivity.this.finish();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DeprecatedAttachActivity deprecatedAttachActivity = DeprecatedAttachActivity.this;
            FragmentImpl fragmentImpl = deprecatedAttachActivity.N.n;
            if (fragmentImpl == null || !(fragmentImpl instanceof BaseAttachPickerFragment)) {
                deprecatedAttachActivity.V2(deprecatedAttachActivity.v.w());
            } else {
                ((BaseAttachPickerFragment) fragmentImpl).so();
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.lifecycle.f fVar = DeprecatedAttachActivity.this.N.n;
            if (fVar instanceof n64) {
                ((n64) fVar).J5();
            }
        }
    }

    public class g extends h {
        public boolean k;
        public int l;
        public ViewGroup m;
        public FragmentImpl n;

        public g(vbs vbsVar) {
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
                return DeprecatedAttachActivity.this.C.f.get(i).d.invoke();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return DeprecatedAttachActivity.this.C.f.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(@NonNull Object obj) {
            return (this.k && (obj instanceof StubFragment)) ? -2 : -1;
        }

        @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return this.k ? super.isViewFromObject(view, obj) && !(obj instanceof StubFragment) : super.isViewFromObject(view, obj);
        }

        @Override // com.vk.core.fragments.h, xsna.s1q0, androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            d(viewGroup, i, obj);
            FragmentImpl fragmentImpl = (FragmentImpl) obj;
            FragmentImpl fragmentImpl2 = this.n;
            DeprecatedAttachActivity deprecatedAttachActivity = DeprecatedAttachActivity.this;
            if (fragmentImpl != fragmentImpl2) {
                h.e(fragmentImpl2, false);
                h.e(fragmentImpl, true);
                this.n = fragmentImpl;
                jk9 jk9Var = deprecatedAttachActivity.G0;
                if (jk9Var != null) {
                    i0q0.h(jk9Var);
                }
                jk9 jk9Var2 = new jk9(this, 3);
                deprecatedAttachActivity.G0 = jk9Var2;
                i0q0.e(jk9Var2);
            }
            androidx.lifecycle.f fVar = this.n;
            if (fVar instanceof BaseAttachPickerFragment) {
                BaseAttachPickerFragment baseAttachPickerFragment = (BaseAttachPickerFragment) fVar;
                if (baseAttachPickerFragment.isResumed()) {
                    baseAttachPickerFragment.to(baseAttachPickerFragment.c0.a.size());
                    return;
                }
                return;
            }
            if (fVar instanceof LocationFragment) {
                ((LocationFragment) fVar).jo();
                return;
            }
            if (fVar instanceof p3t) {
                ((p3t) fVar).Zk();
                int i2 = DeprecatedAttachActivity.K0;
                deprecatedAttachActivity.Q2();
            } else if (!(fVar instanceof PollEditorFragment)) {
                int i3 = DeprecatedAttachActivity.K0;
                deprecatedAttachActivity.U1(true, true);
            } else {
                hpb0 hpb0Var = ((PollEditorFragment) fVar).S;
                if (hpb0Var == null) {
                    hpb0Var = null;
                }
                hpb0Var.t();
            }
        }
    }

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void Li(tb0 tb0Var) {
        if (this.w0 == null) {
            this.w0 = new CopyOnWriteArrayList();
        }
        this.w0.add(tb0Var);
    }

    @Override // com.vk.attachpicker.impl.location.LocationFragment.a
    public final void N() {
        this.E.X(3);
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity
    public final void O1(Configuration configuration) {
        super.O1(configuration);
        X1(configuration.orientation);
        d2(this.t0);
    }

    public final void Q2() {
        com.vk.attachpicker.c cVar = this.v;
        if (cVar.e.size() > 0) {
            this.I.setCount(Integer.valueOf(cVar.e.size()));
        } else {
            this.I.setCount(1);
        }
        if (cVar.e.size() <= 0 || !Z1()) {
            U1(true, true);
        } else {
            U1(false, true);
        }
    }

    @Override // xsna.rok
    @Nullable
    public final tok R() {
        return this.x;
    }

    public final void T1(boolean z) {
        int i = z ? 0 : 8;
        if (i != this.L.getVisibility()) {
            ViewGroup.LayoutParams layoutParams = this.J.getLayoutParams();
            layoutParams.height = z ? iah0.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) : -2;
            this.J.setLayoutParams(layoutParams);
        }
        this.L.setVisibility(i);
    }

    public final void U1(boolean z, boolean z2) {
        if (z) {
            this.M.setOnClickListener(this.z0);
        } else {
            this.M.setOnClickListener(this.A0);
        }
        if (z2) {
            biq biqVar = new biq();
            biqVar.setDuration(200L);
            zmp0.a(this.J, biqVar);
        }
        if (z) {
            this.M.setVisibility(0);
            this.I.setVisibility(8);
        } else {
            this.M.setVisibility(8);
            this.I.setVisibility(0);
        }
    }

    public final void V1() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // xsna.j34
    public final void V2(Intent intent) {
        if (intent == null) {
            setResult(0);
            finish();
        } else {
            intent.putExtra("owner_id", this.u0);
            intent.putExtra("post_id", this.v0);
            setResult(-1, intent);
            finish();
        }
    }

    @Nullable
    public final StoryFragment W1() {
        int i = this.d0;
        if (i < 0) {
            return null;
        }
        FragmentImpl b2 = this.N.b(i);
        if (b2 instanceof StoryFragment) {
            return (StoryFragment) b2;
        }
        return null;
    }

    public final void X1(int i) {
        if (i == 1) {
            this.E.W((int) ((iah0.f().heightPixels * 1.8f) / 3.0f), false);
        } else {
            this.E.W((int) ((iah0.f().heightPixels * 3.0f) / 5.0f), false);
        }
    }

    public final boolean Y1() {
        return this.q0 != 0;
    }

    @Override // com.vk.attachpicker.b.InterfaceC0381b
    public final com.vk.attachpicker.b Yd() {
        return this.v;
    }

    public final boolean Z1() {
        return this.H.getCurrentItem() == this.e0;
    }

    public final void b2(View view, String str, boolean z, f0m f0mVar) {
        View findViewById = (!z || view == null) ? (view == null || f0mVar != null) ? view != null ? view.findViewById(R.id.attach_hint_point_left) : null : view.findViewById(R.id.attach_hint_point_right) : view.findViewById(R.id.iv_icon);
        if (findViewById == null || !pla.e().b().a(str)) {
            return;
        }
        bwt0.n(findViewById, new aa5(str, this, findViewById, f0mVar));
    }

    public final void d2(float f2) {
        this.A.setTranslationY(this.H.getTop() - this.A.getHeight());
        this.J.setTranslationY(Math.max(this.J.getHeight() + (this.H.getTop() - this.F.getHeight()), 0));
        if (f2 < 0.8f) {
            this.D.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.B.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.D.setVisibility(4);
        } else {
            float f3 = (f2 - 0.8f) / 0.19999999f;
            this.D.setAlpha(f3);
            this.B.setAlpha(f3);
            this.D.setVisibility(0);
        }
        if (f2 < -0.8f) {
            this.A.setAlpha(1.0f - (Math.min((-f2) - 0.8f, 0.099999964f) / 0.099999964f));
        } else {
            this.A.setAlpha(1.0f);
        }
        if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.F.setBackgroundColor(this.y);
        } else {
            int b2 = c3r0.b(-Math.max(-1.0f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2)), this.y, 0);
            this.F.setBackgroundColor(b2);
            u1u0.h(getWindow(), b2);
        }
        androidx.lifecycle.f fVar = this.N.n;
        if (fVar instanceof g0k0) {
            ((g0k0) fVar).n0(f2);
        }
    }

    public final void e2() {
        this.H.setAllowNestedViewHorizontalScroll(this.E.M == 3 || this.C.f.get(this.H.getCurrentItem()).c);
    }

    public final void f2() {
        for (int i = 0; i < this.z.getChildCount(); i++) {
            View childAt = this.z.getChildAt(i);
            ((qtn0) childAt).a(this.P, this.z.getChildAdapterPosition(childAt), this.O);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        this.E.X(5);
        if (this.E.M == 5) {
            V1();
        }
    }

    @Override // xsna.tvv
    public final boolean isIdle() {
        PagerViewBottomSheetBehavior<?> pagerViewBottomSheetBehavior = this.E;
        return (pagerViewBottomSheetBehavior == null || pagerViewBottomSheetBehavior.M == 2) ? false : true;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentImpl fragmentImpl;
        super.onActivityResult(i, i2, intent);
        CopyOnWriteArrayList copyOnWriteArrayList = this.w0;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((tb0) it.next()).onActivityResult(i, i2, intent);
            }
        }
        if (!Z1() || (fragmentImpl = this.N.n) == null) {
            return;
        }
        fragmentImpl.onActivityResult(i, i2, intent);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.N.n.a0()) {
            return;
        }
        if (Z1()) {
            com.vk.attachpicker.c cVar = this.v;
            if (cVar.e.size() > 0) {
                cVar.clear();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        int i;
        l7n0 l7n0Var;
        nl a2;
        dhr0.f(this.F0);
        setTheme(dhr0.C().b ? R.style.AttachTransparentMilkTheme : R.style.AttachTransparentMilkDarkTheme);
        super.onCreate(bundle);
        SharedPreferences f2 = Preference.f("Attach_Prefs");
        if (t5m.c() && !f2.getBoolean("IS_MEDIA_PERMISSION_REVOKED", false) && Build.VERSION.SDK_INT >= 33) {
            PermissionHelper.a.getClass();
            revokeSelfPermissionsOnKill(Arrays.asList(PermissionHelper.e));
            f2.edit().putBoolean("IS_MEDIA_PERMISSION_REVOKED", true).apply();
            L.G("revoke media permissions request");
        }
        overridePendingTransition(0, 0);
        mhy.h(this);
        this.C0 = ((DocumentsComponent) j6i.c(m7m.f(this), DocumentsComponent.class)).P0();
        this.D0 = ((GalleryPickerComponent) j6i.c(m7m.f(this), GalleryPickerComponent.class)).b2();
        this.E0 = ((SuperAppServicesComponent) j6i.c(m7m.f(this), SuperAppServicesComponent.class)).nd();
        this.y = getColor(R.color.picker_semi_transparent_background);
        this.v.a = getIntent().getIntExtra("selection_limit", 10);
        this.Q = getIntent().getBooleanExtra("enable_map_attachment", false);
        this.X = getIntent().getBooleanExtra("vk_video_type", false);
        this.Y = getIntent().getBooleanExtra("video_from_gallery_type", false);
        this.R = getIntent().getBooleanExtra("enable_gift_attachment", false);
        this.S = getIntent().getBooleanExtra("enable_graffiti_att", false);
        this.V = getIntent().getBooleanExtra("enable_poll_attachment", false);
        boolean booleanExtra = getIntent().getBooleanExtra("enable_story_attachment", false);
        this.T = booleanExtra;
        if (booleanExtra) {
            this.d0 = 0;
            this.e0 = 1;
        }
        this.W = getIntent().getBooleanExtra("enable_pick_from_vk", true);
        this.Z = getIntent().getBooleanExtra("enable_documents_search", true);
        this.U = getIntent().getBooleanExtra("enable_music_attachment", false);
        this.a0 = getIntent().getBooleanExtra("apps", false);
        this.b0 = getIntent().getBooleanExtra("achievements", false);
        getIntent().getBooleanExtra("new_photo_editor_entry_points", false);
        if (getIntent().hasExtra("gift_users")) {
            this.p0 = getIntent().getParcelableArrayListExtra("gift_users");
        }
        this.q0 = getIntent().getLongExtra("peer_id", 0L);
        this.r0 = getIntent().getStringExtra("peer_title");
        this.s0 = getIntent().getBooleanExtra("can_pin_attachment", false);
        com.vk.dto.common.b.a(this.q0);
        this.u0 = (UserId) getIntent().getParcelableExtra("owner_id");
        this.v0 = getIntent().getIntExtra("post_id", 0);
        this.n0 = getIntent().getStringExtra("graffiti_avatar");
        this.o0 = getIntent().getStringExtra("graffiti_title");
        getIntent().getBooleanExtra("is_dialog", true);
        this.c0 = getIntent().getBooleanExtra("is_community_channel", false);
        if (getIntent().hasExtra("inactive_background_color")) {
            this.g0 = getIntent().getIntExtra("inactive_background_color", 0);
        } else {
            this.g0 = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_inactive_background);
        }
        if (getIntent().hasExtra("active_background_color")) {
            this.h0 = getIntent().getIntExtra("active_background_color", 0);
        } else {
            this.h0 = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_active_background);
        }
        if (getIntent().hasExtra("inactive_icon_color")) {
            this.i0 = getIntent().getIntExtra("inactive_icon_color", 0);
        } else {
            this.i0 = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_inactive_icon);
        }
        if (getIntent().hasExtra("active_icon_color")) {
            this.j0 = getIntent().getIntExtra("active_icon_color", 0);
        } else {
            this.j0 = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_active_icon);
        }
        if (getIntent().hasExtra("inactive_text_color")) {
            this.k0 = getIntent().getIntExtra("inactive_text_color", 0);
        } else {
            this.k0 = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_inactive_text);
        }
        if (getIntent().hasExtra("active_text_color")) {
            this.l0 = getIntent().getIntExtra("active_text_color", 0);
        } else {
            this.l0 = dhr0.t.c(R.attr.vk_legacy_attach_picker_tab_active_text);
        }
        if (getIntent().hasExtra("attach_counter_button_color")) {
            this.m0 = Integer.valueOf(getIntent().getIntExtra("attach_counter_button_color", 0));
        }
        IntentFilter intentFilter = new IntentFilter("com.vkontakte.android.ACTION_GIFT_SENT");
        String str = hf8.a;
        anj.d(this, this.x0, intentFilter, str, 4);
        anj.d(this, this.y0, new IntentFilter("com.vkontakte.android.ACTION_MONEY_TRANSFER_SENT"), str, 4);
        int i2 = 5;
        if (bundle != null) {
            this.t0 = bundle.getFloat("SLIDE_OFFSET", -1.0f);
            i2 = bundle.getInt("BOTTOM_SHEET_STATE", 5);
        }
        u1u0.h(getWindow(), 0);
        setContentView(R.layout.picker_activity_attach);
        this.z = (RecyclerView) findViewById(R.id.rv_tabs);
        this.A = (FrameLayout) findViewById(R.id.fl_tabs_container);
        this.B = findViewById(R.id.tabs_overlay);
        this.D = (FrameLayout) findViewById(R.id.tc_toolbar_container);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.main_content);
        this.F = coordinatorLayout;
        coordinatorLayout.setBackgroundColor(this.y);
        this.G = findViewById(R.id.click_handler);
        this.H = (ContentViewPager) findViewById(R.id.pager);
        this.J = (ViewGroup) findViewById(R.id.fl_bottom_button);
        this.I = (VkButton) findViewById(R.id.acv_bottom_panel_counter);
        this.K = (TextView) findViewById(R.id.tv_bottom_panel_action_btn);
        this.L = findViewById(R.id.tv_bottom_panel_action);
        this.M = findViewById(R.id.tv_bottom_panel_cancel);
        this.J.setOnClickListener(new i0m());
        this.D.setOnClickListener(new i0m());
        this.A.setOnClickListener(new i0m());
        this.K.setOnClickListener(this.B0);
        View view = this.M;
        z00 z00Var = this.z0;
        view.setOnClickListener(z00Var);
        this.G.setOnClickListener(z00Var);
        this.I.setOnClickListener(this.A0);
        Integer num = this.m0;
        if (num != null) {
            this.I.setBackgroundColor(num.intValue());
        }
        this.z.setLayoutManager(new k0m(this, this));
        cyn0 cyn0Var = new cyn0(new l0m(this), new cyn0.c(this.g0, this.h0, this.i0, this.j0, this.k0, this.l0));
        this.C = cyn0Var;
        cyn0Var.c = new c7(this, 26);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.T) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_story_outline_32, R.string.story, new n1i(this, 2), false));
            arrayList2.add(TabOrderUtils$Tab.STORIES);
        }
        int i3 = this.Y ? R.string.picker_photo : R.string.picker_tab_photo_video;
        qzg qzgVar = new qzg(this, 9);
        int i4 = R.drawable.vk_icon_picture_outline_32;
        arrayList.add(new cyn0.b(R.drawable.vk_icon_picture_outline_32, i3, qzgVar, false));
        arrayList2.add(TabOrderUtils$Tab.GALLERY);
        if (this.b0) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_cup_outline_28, R.string.picker_tab_achievements, new ozf(this, 15), false));
            arrayList2.add(TabOrderUtils$Tab.ACHIEVEMENTS);
        }
        if (this.U) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_music_outline_32, R.string.music, new gbh(this, 7), false));
            arrayList2.add(TabOrderUtils$Tab.MUSIC);
        }
        if (this.Q && !com.vk.toggle.b.A.a(ImFeatures.DISABLE_GEO)) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_place_outline_32, R.string.picker_tab_location, new sk4(9), false));
            arrayList2.add(TabOrderUtils$Tab.MAP);
        }
        if (this.R && this.p0 != null) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_gift_outline_32, R.string.picker_tab_gift, new o6(12), true));
            arrayList2.add(TabOrderUtils$Tab.GIFTS);
        }
        arrayList.add(new cyn0.b(R.drawable.vk_icon_document_outline_32, R.string.picker_tab_document, new akh(this, 7), true));
        arrayList2.add(TabOrderUtils$Tab.DOCUMENTS);
        if (this.V) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_poll_outline_32, R.string.picker_tab_poll, new xyh(this, 3), false));
            arrayList2.add(TabOrderUtils$Tab.POLL);
        }
        if (this.S) {
            arrayList.add(new cyn0.b(R.drawable.vk_icon_deprecated_brush_outline_32, R.string.picker_graffiti, new mag(this, 10), false));
            arrayList2.add(TabOrderUtils$Tab.GRAFFITI);
        }
        if (this.W) {
            arrayList.add(new cyn0.b(com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_VK_PHOTO_PICKER) ? R.drawable.vk_icon_picture_stack_outline_28 : R.drawable.vk_icon_picture_outline_32, R.string.picker_tab_vk_photo, ((PhotosComponent) j6i.b(m7m.f(this), PhotosComponent.class)).m2(this.u0), true));
            arrayList2.add(TabOrderUtils$Tab.PHOTO_VK);
            arrayList.add(new cyn0.b(R.drawable.vk_icon_play_rectangle_stack_outline_28, R.string.picker_tab_vk_video, new sx0(this, 29), false));
            arrayList2.add(TabOrderUtils$Tab.VIDEO_VK);
        }
        if (this.X) {
            gzs<FragmentImpl> m2 = ((PhotosComponent) j6i.b(m7m.f(this), PhotosComponent.class)).m2(this.u0);
            if (com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_VK_PHOTO_PICKER)) {
                i4 = R.drawable.vk_icon_picture_stack_outline_28;
            }
            arrayList.add(new cyn0.b(i4, R.string.picker_tab_vk_photo, m2, true));
            arrayList2.add(TabOrderUtils$Tab.PHOTO_VK);
        }
        UserId userId = new UserId(this.q0);
        if (this.a0 && (l7n0Var = this.E0) != null && (a2 = l7n0Var.a(userId)) != null) {
            cyn0.b bVar = new cyn0.b(R.drawable.vk_icon_services_outline_28, R.string.vk_picker_app, new w40(a2, 6), false);
            bVar.e = HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP.getId();
            arrayList.add(bVar);
            arrayList2.add(TabOrderUtils$Tab.SERVICES);
        }
        List D0 = j5g.D0(new btn0(arrayList2, arrayList), arrayList);
        cyn0 cyn0Var2 = this.C;
        ArrayList<cyn0.b> arrayList3 = cyn0Var2.f;
        arrayList3.clear();
        arrayList3.addAll(D0);
        cyn0Var2.notifyDataSetChanged();
        Iterator it = D0.iterator();
        int i5 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            Object next = it.next();
            if (i5 < 0) {
                e43.t();
                throw null;
            }
            if (((cyn0.b) next).b == R.string.picker_tab_photo_video) {
                break;
            } else {
                i5++;
            }
        }
        Integer valueOf = i5 != -1 ? Integer.valueOf(i5) : null;
        if (this.R) {
            Iterator it2 = D0.iterator();
            int i6 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((cyn0.b) it2.next()).b == R.string.picker_tab_gift) {
                    i = i6;
                    break;
                }
                i6++;
            }
            this.f0 = i;
        }
        if (valueOf != null) {
            this.e0 = valueOf.intValue();
        }
        this.z.setAdapter(this.C);
        this.z.addOnScrollListener(new m0m(this));
        this.F.setStatusBarBackgroundColor(0);
        g gVar = new g(n());
        this.N = gVar;
        gVar.l = this.e0;
        this.H.setAdapter(gVar);
        this.H.setCurrentItem(this.e0);
        this.H.addOnPageChangeListener(new n0m(this));
        PagerViewBottomSheetBehavior<?> g0 = PagerViewBottomSheetBehavior.g0(this.H);
        this.E = g0;
        g0.V(true);
        this.E.X(i2);
        this.E.D(new com.vk.attachpicker.impl.b(this));
        this.H.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.j0m
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                DeprecatedAttachActivity.this.A.setTranslationY(r0.H.getTop() - r0.A.getHeight());
            }
        });
        X1(getResources().getConfiguration().orientation);
        ContentViewPager contentViewPager = this.H;
        contentViewPager.getViewTreeObserver().addOnPreDrawListener(new a3r0(contentViewPager, new xq3(this, 5)));
        U1(false, false);
        T1(false);
        p870.f().b(1, this.H0);
        cuz.a(this).b(this.I0, new IntentFilter("count"));
        new rvv(400L).b(100L, new ux3(this, 4));
        tia0.F0();
        dhr0.r0(this);
        rvv.f.add(this);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        cuz.a(this).d(this.I0);
        p870.f().g(this.H0);
        unregisterReceiver(this.x0);
        unregisterReceiver(this.y0);
        i0q0.h(this.G0);
        rvv.f.remove(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        d2(this.t0);
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        cuz.a(this).b(this.J0, this.w);
        super.onResume();
        e2();
        if (gz80.a(24) && isInMultiWindowMode()) {
            d2(this.t0);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putFloat("SLIDE_OFFSET", this.t0);
        bundle.putInt("BOTTOM_SHEET_STATE", this.E.N);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        cuz.a(this).d(this.J0);
    }

    @Override // xsna.h2d0
    public final void qm(@NonNull HashMap hashMap) {
        androidx.lifecycle.f fVar = this.N.n;
        if (fVar instanceof p3t) {
            ((p3t) fVar).R3(hashMap, new iy2(17));
            Q2();
        }
    }

    @Override // xsna.d1m0
    public final void rh() {
        this.H.setCurrentItem(this.e0, false);
    }

    public final String toString() {
        return "AttachActivity";
    }

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void yk(tb0 tb0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.w0;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(tb0Var);
        }
    }
}
