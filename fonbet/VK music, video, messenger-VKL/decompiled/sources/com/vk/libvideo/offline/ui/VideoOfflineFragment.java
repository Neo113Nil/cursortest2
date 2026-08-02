package com.vk.libvideo.offline.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.bridges.ProfileType;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.ImageScreenSize;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.VKRecyclerFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import me.grishka.appkit.views.UsableRecyclerView;
import one.video.exo.offline.DownloadInfo;
import xsna.asu0;
import xsna.bwt0;
import xsna.czs0;
import xsna.d3j0;
import xsna.dw20;
import xsna.edt0;
import xsna.ezs0;
import xsna.f6m0;
import xsna.fnj;
import xsna.fxc0;
import xsna.ggb0;
import xsna.gkc0;
import xsna.gko;
import xsna.gkt0;
import xsna.gzs;
import xsna.h6m0;
import xsna.h8l0;
import xsna.hmq0;
import xsna.hu70;
import xsna.iah0;
import xsna.ie90;
import xsna.ikk0;
import xsna.ikv0;
import xsna.jsb0;
import xsna.l0t0;
import xsna.l8g;
import xsna.lqs0;
import xsna.m33;
import xsna.msy;
import xsna.n0t0;
import xsna.n3b0;
import xsna.o25;
import xsna.oq;
import xsna.oz50;
import xsna.pyr0;
import xsna.q8i0;
import xsna.qah0;
import xsna.qjg0;
import xsna.qyi0;
import xsna.r7a0;
import xsna.rtg0;
import xsna.szf0;
import xsna.t9c0;
import xsna.tbe0;
import xsna.tf3;
import xsna.tlo0;
import xsna.tq;
import xsna.ugm0;
import xsna.uhs0;
import xsna.uvs0;
import xsna.vhs0;
import xsna.wgm0;
import xsna.wjf0;
import xsna.wng0;
import xsna.wys0;
import xsna.x150;
import xsna.x1e0;
import xsna.x9l0;
import xsna.yka0;
import xsna.zt70;

/* compiled from: VideoOfflineFragment.kt */
/* loaded from: classes3.dex */
public final class VideoOfflineFragment extends VKRecyclerFragment<wys0> implements hu70, szf0, zt70 {
    public static final /* synthetic */ int f1 = 0;
    public final ezs0 I0;
    public final Object J0;
    public final Object K0;
    public final Object L0;
    public final boolean M0;
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final io.reactivex.rxjava3.disposables.b Q0;
    public final lqs0 R0;
    public final h6m0 S0;
    public e T0;
    public f U0;
    public a V0;
    public VkPlaceholder W0;
    public VkTopBar X0;
    public boolean Y0;
    public boolean Z0;
    public dw20 a1;
    public io.reactivex.rxjava3.disposables.c b1;
    public ikv0 c1;
    public final Object d1;
    public final Object e1;

    /* compiled from: VideoOfflineFragment.kt */
    public abstract class a extends UsableRecyclerView.c<UsableRecyclerView.x> {
        public a() {
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            VideoOfflineFragment videoOfflineFragment = VideoOfflineFragment.this;
            Context requireContext = videoOfflineFragment.requireContext();
            HashSet hashSet = iah0.a;
            ImageSize Cb = ((wys0) videoOfflineFragment.v0.get(i)).a.I0.Cb((fnj.d(requireContext) ? ImageScreenSize.BIG : ImageScreenSize.SMALL).h(), true, false);
            if (Cb != null) {
                return Cb.d.d;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int i = VideoOfflineFragment.f1;
            ArrayList<T> arrayList = VideoOfflineFragment.this.v0;
            if (arrayList == 0) {
                return 0;
            }
            return arrayList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            int i2 = VideoOfflineFragment.f1;
            return ((wys0) VideoOfflineFragment.this.v0.get(i)).a.r1().hashCode();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return x0(viewGroup, new vhs0(VideoOfflineFragment.this, 3));
        }

        public abstract UsableRecyclerView.x x0(ViewGroup viewGroup, vhs0 vhs0Var);
    }

    /* compiled from: VideoOfflineFragment.kt */
    public static final class b extends oz50 {
        public b() {
            super(VideoOfflineFragment.class, null, null);
        }

        @Override // xsna.oz50
        public final boolean p() {
            return fxc0.B().s().y();
        }
    }

    /* compiled from: VideoOfflineFragment.kt */
    public final class c extends a {
        public c() {
            super();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            UsableRecyclerView.x xVar = (UsableRecyclerView.x) e0Var;
            n0t0 n0t0Var = xVar instanceof n0t0 ? (n0t0) xVar : null;
            if (n0t0Var != null) {
                int i2 = VideoOfflineFragment.f1;
                VideoOfflineFragment videoOfflineFragment = VideoOfflineFragment.this;
                n0t0Var.V5(new czs0(((wys0) videoOfflineFragment.v0.get(i)).a, ((wys0) videoOfflineFragment.v0.get(i)).b));
            }
        }

        @Override // com.vk.libvideo.offline.ui.VideoOfflineFragment.a
        public final UsableRecyclerView.x x0(ViewGroup viewGroup, vhs0 vhs0Var) {
            return new n0t0(viewGroup, VideoOfflineFragment.this.I0, vhs0Var);
        }
    }

    /* compiled from: VideoOfflineFragment.kt */
    public final class d extends a {
        public d() {
            super();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            UsableRecyclerView.x xVar = (UsableRecyclerView.x) e0Var;
            com.vk.libvideo.offline.ui.a aVar = xVar instanceof com.vk.libvideo.offline.ui.a ? (com.vk.libvideo.offline.ui.a) xVar : null;
            if (aVar != null) {
                int i2 = VideoOfflineFragment.f1;
                aVar.V5(VideoOfflineFragment.this.v0.get(i));
            }
        }

        @Override // com.vk.libvideo.offline.ui.VideoOfflineFragment.a
        public final UsableRecyclerView.x x0(ViewGroup viewGroup, vhs0 vhs0Var) {
            return new com.vk.libvideo.offline.ui.a(viewGroup, VideoOfflineFragment.this.I0, vhs0Var);
        }
    }

    /* compiled from: VideoOfflineFragment.kt */
    public final class e extends RecyclerView.Adapter<l0t0> {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            VideoOfflineFragment videoOfflineFragment = VideoOfflineFragment.this;
            if (!videoOfflineFragment.Y0 && !videoOfflineFragment.Z0) {
                return 0;
            }
            a aVar = videoOfflineFragment.V0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.getItemCount() != 0 ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(l0t0 l0t0Var, int i) {
            l0t0 l0t0Var2 = l0t0Var;
            boolean z = VideoOfflineFragment.this.Z0;
            VkSimpleButton vkSimpleButton = l0t0Var2.u;
            TextView textView = l0t0Var2.n;
            ImageView imageView = l0t0Var2.r;
            int f = l8g.f(0.12f, imageView.getContext().getColor(R.color.vk_steel_gray_250));
            imageView.setImageResource(z ? R.drawable.vk_icon_globe_outline_28 : R.drawable.vk_icon_download_outline_28);
            float f2 = 12;
            imageView.setBackground(new wng0(f, iah0.a(f2)));
            imageView.setPadding(iah0.a(f2), iah0.a(f2), iah0.a(f2), iah0.a(f2));
            TextView textView2 = l0t0Var2.p;
            Context context = l0t0Var2.itemView.getContext();
            int i2 = R.string.offline_status;
            textView2.setText(context.getString(z ? R.string.online_status : R.string.offline_status));
            l0t0Var2.q.setText(l0t0Var2.itemView.getContext().getString(z ? R.string.video_online_status_description : R.string.video_offline_status_description));
            Context context2 = l0t0Var2.itemView.getContext();
            if (z) {
                i2 = R.string.online_status_collapsed;
            }
            textView.setText(context2.getString(i2));
            textView.setCompoundDrawablesWithIntrinsicBounds(m33.a(z ? R.drawable.vk_icon_globe_outline_20 : R.drawable.vk_icon_globe_cross_outline_20, l0t0Var2.itemView.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
            vkSimpleButton.setText(BuildInfo.q() ? R.string.video_open_catalog_short_redesign : R.string.video_open_catalog_short);
            bwt0.p0(vkSimpleButton, z);
            bwt0.p0(l0t0Var2.t, z);
            l0t0Var2.V5();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final l0t0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new l0t0(tf3.b(viewGroup, R.layout.offline_status_placeholder, viewGroup, false), VideoOfflineFragment.this.R0);
        }
    }

    public VideoOfflineFragment() {
        super(Integer.MAX_VALUE);
        this.I0 = fxc0.B().s();
        gkc0 gkc0Var = new gkc0(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.J0 = msy.a(lazyThreadSafetyMode, gkc0Var);
        this.K0 = msy.a(lazyThreadSafetyMode, new pyr0(this, 5));
        this.L0 = msy.a(lazyThreadSafetyMode, new x9l0(this, 14));
        this.M0 = fxc0.B().J().x0();
        this.N0 = fxc0.B().J().f0();
        boolean z = false;
        boolean z2 = o25.a().c0() == ProfileType.RELATED;
        this.O0 = z2;
        if (fxc0.B().J().Z0() && !z2 && !Jo()) {
            z = true;
        }
        this.P0 = z;
        this.Q0 = new io.reactivex.rxjava3.disposables.b();
        this.R0 = new lqs0(this, 3);
        this.S0 = new h6m0(this, 15);
        this.d1 = msy.a(lazyThreadSafetyMode, new ikk0(this, 15));
        this.e1 = msy.a(lazyThreadSafetyMode, new tbe0(this, 27));
    }

    @Override // xsna.szf0
    public final boolean Hg(Bundle bundle) {
        return true;
    }

    public final void Io() {
        Context requireContext;
        int i;
        String string;
        String string2;
        if (this.O0 || Jo()) {
            if (Jo()) {
                requireContext = requireContext();
                i = R.string.kid_mode_downloads_placeholder_button;
            } else {
                requireContext = requireContext();
                i = R.string.child_downloads_placeholder_button;
            }
            String string3 = requireContext.getString(i);
            VkPlaceholder vkPlaceholder = this.W0;
            if (vkPlaceholder == null) {
                vkPlaceholder = null;
            }
            tlo0.a aVar = tlo0.Companion;
            String string4 = requireContext().getString(R.string.kid_mode_downloads_placeholder_title);
            aVar.getClass();
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, new tlo0.h(string4)), new VkPlaceholder.b.C0859b(14, null)));
            VkPlaceholder vkPlaceholder2 = this.W0;
            (vkPlaceholder2 != null ? vkPlaceholder2 : null).setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.h(string3), (gzs) new qah0(this, 17), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, (VkButton.Mode) null, (VkButton.Appearance) null, false, IronSourceError.ERROR_CODE_INIT_FAILED), null, null, null, 8));
            return;
        }
        if (this.Y0) {
            string = requireContext().getString(R.string.video_download_offline_empty_title);
            string2 = requireContext().getString(R.string.video_download_offline_empty_description);
        } else if (this.Z0) {
            string = requireContext().getString(R.string.video_download_online_empty_title);
            string2 = requireContext().getString(R.string.video_download_online_empty_description);
        } else {
            string = requireContext().getString(R.string.video_download_empty_title);
            string2 = requireContext().getString(R.string.video_download_empty_description);
        }
        VkPlaceholder vkPlaceholder3 = this.W0;
        if (vkPlaceholder3 == null) {
            vkPlaceholder3 = null;
        }
        vkPlaceholder3.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, oq.d(tlo0.Companion, string)), new VkPlaceholder.b.C0859b(14, new tlo0.h(string2))));
        VkPlaceholder vkPlaceholder4 = this.W0;
        if (vkPlaceholder4 == null) {
            vkPlaceholder4 = null;
        }
        vkPlaceholder4.setBottom(this.Z0 ? new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.video_open_catalog), (gzs) new d3j0(this, 18), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, (VkButton.Mode) null, (VkButton.Appearance) null, false, IronSourceError.ERROR_CODE_INIT_FAILED), null, null, null, 8) : null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean Jo() {
        return ((Boolean) this.K0.getValue()).booleanValue();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.w1d0.a
    public final void Kj() {
        q();
    }

    public final void Ko() {
        io.reactivex.rxjava3.disposables.c cVar = this.b1;
        if (cVar == null || cVar.h()) {
            com.vk.core.utils.newtork.b.a.getClass();
            this.b1 = com.vk.core.utils.newtork.b.f().A(3L, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new r7a0(new n3b0(this, 23), 20));
        }
    }

    public final void Lo() {
        boolean z;
        if (this.Y0 || this.Z0) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (com.vk.core.utils.newtork.b.d()) {
                z = true;
                this.Z0 = z;
                com.vk.core.utils.newtork.b.a.getClass();
                this.Y0 = !com.vk.core.utils.newtork.b.d();
            }
        }
        z = false;
        this.Z0 = z;
        com.vk.core.utils.newtork.b.a.getClass();
        this.Y0 = !com.vk.core.utils.newtork.b.d();
    }

    public final void Mo() {
        VkTopBar vkTopBar = this.X0;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, (this.N0 || !this.Y0) ? R.string.video_downloaded_title : R.string.video_offline_title), null, null, null, null, 30), null, null, com.vk.core.compose.component.semantics.b.a(null, new ie90(this, 27), 3), 6));
        }
    }

    @Override // xsna.zt70
    public final void ia(boolean z) {
        VkTopBar vkTopBar = this.X0;
        if (vkTopBar != null) {
            bwt0.p0(vkTopBar, z);
        }
        q();
        if (this.Y0) {
            Ko();
        }
    }

    @Override // xsna.hu70
    public final void kg(Map<String, ? extends DownloadInfo> map) {
        if (Jo()) {
            this.v0.clear();
        } else {
            this.Q0.b(this.I0.h().m(asu0.a.d()).l(new ugm0(new yka0(this, 22), 5)).subscribe(new h8l0(new wgm0(this, 12), 6), new hmq0(new q8i0(this, 23), 3)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.P0) {
            setHasOptionsMenu(true);
        }
        Lo();
        ((gkt0) this.L0.getValue()).getClass();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dw20 dw20Var = this.a1;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.a1 = null;
        this.Q0.dispose();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        if (getArguments() == null) {
            setArguments(new Bundle());
        }
        super.onInflate(context, attributeSet, bundle);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        io.reactivex.rxjava3.disposables.c cVar = this.b1;
        if (cVar != null) {
            cVar.dispose();
        }
        this.b1 = null;
        edt0 edt0Var = (edt0) this.e1.getValue();
        ikv0 ikv0Var = edt0Var.d;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        edt0Var.d = null;
        ikv0 ikv0Var2 = this.c1;
        if (ikv0Var2 != null) {
            ikv0Var2.a();
        }
        this.c1 = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        View view;
        kg(this.I0.u());
        if (this.Y0) {
            Ko();
        }
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.b(requireContext) && this.M0 && (view = this.e0) != null) {
            float f2 = 12;
            view.setPadding(iah0.a(f2), 0, iah0.a(f2), 0);
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.I0.t(this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.I0.z(this);
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = this.e0;
        AttributeSet attributeSet = null;
        AppBarShadowView appBarShadowView = view2 instanceof AppBarShadowView ? (AppBarShadowView) view2 : null;
        int i = 0;
        if (appBarShadowView != null) {
            appBarShadowView.setSeparatorAllowed(false);
        }
        VkTopBar vkTopBar = new VkTopBar(requireContext(), attributeSet, 6, i);
        vkTopBar.setShowBottomDivider(false);
        vkTopBar.setBack(new VkTopBar.b(new x1e0(this, 29), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new rtg0(this, 21), 3), 14));
        if (this.P0) {
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_settings_outline_28), tq.h(tlo0.Companion, R.string.video_download_settings_menu_title), new uhs0(this, 5), null, null, com.vk.core.compose.component.semantics.b.a(null, new qyi0(this, 21), 3), 24), null, 6));
        }
        this.X0 = vkTopBar;
        Mo();
        VkTopBar vkTopBar2 = this.X0;
        if (vkTopBar2 != null) {
            jo(vkTopBar2);
        }
        if (this.f0) {
            oo();
        } else {
            qo();
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.w1d0.a
    public final void q() {
        Lo();
        Mo();
        wjf0.c(this.n0, new uvs0(this, 1));
        Io();
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View ro = super.ro(layoutInflater, viewGroup, bundle);
        this.t0.removeView(this.o0);
        this.W0 = new VkPlaceholder(requireContext(), null, 6, 0);
        Io();
        ViewGroup viewGroup2 = this.t0;
        VkPlaceholder vkPlaceholder = this.W0;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        viewGroup2.addView(vkPlaceholder, new ViewGroup.LayoutParams(-1, -1));
        UsableRecyclerView usableRecyclerView = this.n0;
        VkPlaceholder vkPlaceholder2 = this.W0;
        usableRecyclerView.setEmptyView(vkPlaceholder2 != null ? vkPlaceholder2 : null);
        return ro;
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        if (Jo()) {
            Ao(EmptyList.b);
            return;
        }
        this.Q0.b(this.I0.h().m(asu0.a.d()).l(new t9c0(9, new f6m0(this, 15))).subscribe(new x150(new qjg0(this, 14), 18), new jsb0(new ggb0(this, 29), 17)));
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter<?> wo() {
        ConcatAdapter.Config.b.getClass();
        ConcatAdapter.Config config = new ConcatAdapter.Config(ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS);
        e eVar = new e();
        eVar.setHasStableIds(true);
        this.T0 = eVar;
        f fVar = new f();
        fVar.setHasStableIds(true);
        this.U0 = fVar;
        a dVar = this.N0 ? new d() : new c();
        this.V0 = dVar;
        dVar.setHasStableIds(true);
        e eVar2 = this.T0;
        if (eVar2 == null) {
            eVar2 = null;
        }
        f fVar2 = this.U0;
        if (fVar2 == null) {
            fVar2 = null;
        }
        a aVar = this.V0;
        return new ConcatAdapter(config, eVar2, fVar2, aVar != null ? aVar : null);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final View yo(LayoutInflater layoutInflater) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        if (getArguments() == null) {
            setArguments(new Bundle());
        }
        super.onInflate(activity, attributeSet, bundle);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.views.UsableRecyclerView.p
    public final void N0() {
    }

    @Override // xsna.y760
    public final void h9(Intent intent) {
    }

    /* compiled from: VideoOfflineFragment.kt */
    public final class f extends RecyclerView.Adapter<RecyclerView.e0> {

        /* compiled from: VideoOfflineFragment.kt */
        public static final class a extends RecyclerView.e0 {
        }

        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            VideoOfflineFragment videoOfflineFragment = VideoOfflineFragment.this;
            if (videoOfflineFragment.N0) {
                return 0;
            }
            if (videoOfflineFragment.Y0 || videoOfflineFragment.Z0) {
                a aVar = videoOfflineFragment.V0;
                if (aVar == null) {
                    aVar = null;
                }
                if (aVar.getItemCount() != 0) {
                    return 1;
                }
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(tf3.b(viewGroup, R.layout.offline_status_separator, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        }
    }
}
