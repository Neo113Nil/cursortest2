package com.vk.voip.ui.history.past.presentation.base.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.FillingLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.a201;
import xsna.aig;
import xsna.ao50;
import xsna.avj0;
import xsna.awi0;
import xsna.b25;
import xsna.b8g;
import xsna.cvw0;
import xsna.dhr0;
import xsna.dp90;
import xsna.ef90;
import xsna.emu;
import xsna.f21;
import xsna.fcs0;
import xsna.fda0;
import xsna.fnj;
import xsna.fpf0;
import xsna.g1s0;
import xsna.g2v;
import xsna.gko;
import xsna.gm50;
import xsna.gzs;
import xsna.ho80;
import xsna.i9u0;
import xsna.iah0;
import xsna.ifw0;
import xsna.j59;
import xsna.k59;
import xsna.k7l0;
import xsna.kj50;
import xsna.km50;
import xsna.kp90;
import xsna.lng;
import xsna.m7m;
import xsna.mf90;
import xsna.mk50;
import xsna.mp90;
import xsna.muw0;
import xsna.n7w0;
import xsna.np90;
import xsna.os8;
import xsna.oz50;
import xsna.phh0;
import xsna.prq0;
import xsna.puw0;
import xsna.q7h0;
import xsna.r49;
import xsna.rd9;
import xsna.rte0;
import xsna.tlo0;
import xsna.to90;
import xsna.tq;
import xsna.tuw0;
import xsna.u5u0;
import xsna.uf20;
import xsna.uq80;
import xsna.vg20;
import xsna.vhg;
import xsna.vk50;
import xsna.w7w0;
import xsna.x7g;
import xsna.xn50;
import xsna.xp90;
import xsna.yhg;
import xsna.zqu;

/* compiled from: VoipPastCallsFragment.kt */
/* loaded from: classes7.dex */
public final class VoipPastCallsFragment extends MviImplFragment<puw0, cvw0, r49> {
    public static final /* synthetic */ int a0 = 0;
    public b Q;
    public final lng R = new lng();
    public final np90 S = new np90();
    public final c T;
    public final uq80 U;
    public final mf90 V;
    public final ArrayList<WeakReference<phh0>> W;
    public final muw0 X;
    public yhg Y;
    public kp90 Z;

    /* compiled from: VoipPastCallsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: VoipPastCallsFragment.kt */
    public static final class b {
        public final VkTopBar a;
        public final ViewFlipper b;
        public final VkPlaceholder c;
        public final CustomSwipeRefreshLayout d;
        public final dp90 e;

        public b(VkTopBar vkTopBar, ViewFlipper viewFlipper, VkPlaceholder vkPlaceholder, CustomSwipeRefreshLayout customSwipeRefreshLayout, dp90 dp90Var) {
            this.a = vkTopBar;
            this.b = viewFlipper;
            this.c = vkPlaceholder;
            this.d = customSwipeRefreshLayout;
            this.e = dp90Var;
        }
    }

    /* compiled from: VoipPastCallsFragment.kt */
    public static final class c implements k59<j59> {
        public c() {
        }

        @Override // xsna.k59
        public final void a(j59 j59Var) {
            r49[] r49VarArr;
            r49[] r49VarArr2;
            boolean z = j59Var instanceof aig;
            VoipPastCallsFragment voipPastCallsFragment = VoipPastCallsFragment.this;
            if (z) {
                voipPastCallsFragment.R.getClass();
                xn50.a.d(voipPastCallsFragment, (kj50[]) Arrays.copyOf(lng.a((aig) j59Var), 1));
                return;
            }
            if (!(j59Var instanceof mp90)) {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.w, new Object[]{"Unhandled event " + j59Var});
                return;
            }
            mp90 mp90Var = (mp90) j59Var;
            voipPastCallsFragment.S.getClass();
            if (mp90Var instanceof mp90.a.C3363a) {
                r49VarArr = new r49[]{new to90.d.b(((mp90.a.C3363a) mp90Var).a)};
            } else if (mp90Var instanceof mp90.a.b) {
                r49VarArr = new r49[]{new to90.d.c(((mp90.a.b) mp90Var).a)};
            } else if (mp90Var instanceof mp90.a.c) {
                r49VarArr = new r49[]{new to90.b(((mp90.a.c) mp90Var).a)};
            } else if (mp90Var instanceof mp90.b.e) {
                ((mp90.b.e) mp90Var).getClass();
                r49VarArr = new r49[]{to90.d.a.b, new ho80.a.C3012a()};
            } else if (mp90Var instanceof mp90.b.f) {
                ((mp90.b.f) mp90Var).getClass();
                r49VarArr = new r49[]{to90.d.a.b, new ho80.a.f.b()};
            } else if (mp90Var instanceof mp90.b.c) {
                r49VarArr = new r49[]{to90.d.a.b, new vhg.c.i(((mp90.b.c) mp90Var).a)};
            } else if (mp90Var instanceof mp90.b.a.c) {
                r49VarArr = new r49[]{to90.d.a.b, new ho80.a.f.C3013a(((mp90.b.a.c) mp90Var).a, false)};
            } else if (mp90Var instanceof mp90.b.a.d) {
                r49VarArr = new r49[]{to90.d.a.b, new ho80.a.f.C3013a(((mp90.b.a.d) mp90Var).a, true)};
            } else if (mp90Var instanceof mp90.b.a.h) {
                ((mp90.b.a.h) mp90Var).getClass();
                r49VarArr = new r49[]{to90.d.a.b, new vhg.c.j()};
            } else {
                if (mp90Var instanceof mp90.b.a.e) {
                    mp90.b.a.e eVar = (mp90.b.a.e) mp90Var;
                    r49VarArr2 = new r49[]{to90.d.a.b, new vhg.c.g(eVar.a, eVar.b, false, !eVar.c)};
                } else if (mp90Var instanceof mp90.b.a.f) {
                    mp90.b.a.f fVar = (mp90.b.a.f) mp90Var;
                    r49VarArr2 = new r49[]{to90.d.a.b, new vhg.c.g(fVar.a, fVar.b, true, !fVar.c)};
                } else if (mp90Var instanceof mp90.b.a.i) {
                    r49VarArr = new r49[]{to90.d.a.b, new vhg.c.e(((mp90.b.a.i) mp90Var).a)};
                } else if (mp90Var instanceof mp90.b.a.g) {
                    r49VarArr = new r49[]{to90.d.a.b, new to90.g(((mp90.b.a.g) mp90Var).a)};
                } else if (mp90Var instanceof mp90.b.a.C3365b) {
                    r49VarArr = new r49[]{to90.d.a.b, new to90.b(((mp90.b.a.C3365b) mp90Var).a)};
                } else if (mp90Var instanceof mp90.b.a.C3364a) {
                    r49VarArr = new r49[]{vhg.c.b.b};
                } else if (mp90Var instanceof mp90.b.AbstractC3366b.a) {
                    r49VarArr = new r49[]{to90.i.a.b};
                } else if (mp90Var instanceof mp90.b.d) {
                    r49VarArr = new r49[]{to90.d.a.b};
                } else if (mp90Var instanceof mp90.c.C3367c) {
                    r49VarArr = new r49[]{to90.e.d.b};
                } else if (mp90Var instanceof mp90.c.b) {
                    r49VarArr = new r49[]{to90.e.c.b};
                } else {
                    if (!(mp90Var instanceof mp90.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r49VarArr = new r49[]{to90.c.b.b};
                }
                r49VarArr = r49VarArr2;
            }
            xn50.a.d(voipPastCallsFragment, (kj50[]) Arrays.copyOf(r49VarArr, r49VarArr.length));
        }
    }

    public VoipPastCallsFragment() {
        c cVar = new c();
        this.T = cVar;
        this.U = new uq80(this, 14);
        this.V = new mf90(cVar);
        this.W = new ArrayList<>();
        muw0 muw0Var = new muw0(cVar);
        muw0Var.j = new uf20(this, 24);
        this.X = muw0Var;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_past_calls_history_fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        cvw0 cvw0Var = (cvw0) ao50Var;
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.voip_past_calls_history_topbar);
        ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(R.id.voip_flipper);
        VkPlaceholder vkPlaceholder = (VkPlaceholder) view.findViewById(R.id.voip_past_calls_placeholder);
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) view.findViewById(R.id.voip_past_calls_ptrl);
        customSwipeRefreshLayout.setOnRefreshListener(new awi0(this, 17));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.voip_past_calls_content);
        muw0 muw0Var = this.X;
        recyclerView.setAdapter(muw0Var);
        FillingLinearLayoutManager fillingLinearLayoutManager = new FillingLinearLayoutManager(requireContext());
        fillingLinearLayoutManager.r = new f21(8);
        recyclerView.setLayoutManager(fillingLinearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(new ef90(this.V));
        os8 os8Var = new os8(this.W);
        recyclerView.addOnScrollListener(os8Var);
        muw0Var.k = os8Var;
        this.Q = new b(vkTopBar, viewFlipper, vkPlaceholder, customSwipeRefreshLayout, new dp90(requireContext(), this, this.T));
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        int i = 3;
        vkTopBar.setBack(!fnj.d(requireContext) ? new VkTopBar.b(new prq0(this, 24), tq.h(tlo0.Companion, R.string.back), null, null, com.vk.core.compose.component.semantics.b.a(null, new g1s0(8), 3), 12) : null);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.voip_history_past_calls_header_title), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new u5u0(3), 3), 14), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        gko.b bVar = gko.Companion;
        int i2 = 28;
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_more_horizontal_28), new tlo0.f(R.string.voip_accessibility_more_options), new avj0(this, 28), 0 == true ? 1 : 0, new b8g(dhr0.t.c(R.attr.vk_ui_icon_accent_themed)), com.vk.core.compose.component.semantics.b.a(null, new n7w0(1), 3), 8), null, 6));
        b bVar2 = this.Q;
        if (bVar2 == null) {
            bVar2 = null;
        }
        VkPlaceholder vkPlaceholder2 = bVar2.c;
        vkPlaceholder2.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_error_triangle_outline_56), new x7g(R.attr.vk_ui_icon_accent_themed), null, 12));
        vkPlaceholder2.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.voip_past_calls_error))));
        vkPlaceholder2.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.retry), (gzs) new fcs0(this, 11), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, VkButton.Mode.Primary, VkButton.Appearance.Accent, false, 284), null, null, null, 8));
        gm50.a.b(this, cvw0Var.b, new fda0(this, i2));
        gm50.a.b(this, cvw0Var.a, new ifw0(this, i));
        gm50.a.b(this, cvw0Var.c, new i9u0(this, 9));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        puw0 puw0Var = (puw0) vk50Var;
        puw0Var.k.a(new tuw0(this, 0), this);
        puw0Var.m.a(new w7w0(this, 5), this);
        puw0Var.l.a(new k7l0(this, 28), this);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Y = new yhg(requireContext(), In(), g2v.c(), ((VoipCallComponent) m7m.d(this).a(fpf0.a(VoipCallComponent.class))).a(), ((VoipStereoRouterComponent) m7m.d(this).a(fpf0.a(VoipStereoRouterComponent.class))).a(), ((MaxUtilityComponent) m7m.d(this).mo408a(fpf0.a(MaxUtilityComponent.class))).j7());
        this.Z = new kp90(requireContext(), In());
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        In().a.l0("request_key_past_calls_filter_group_id", this, this.U);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        vg20 vg20Var = new vg20();
        b25 s = ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).s();
        rd9 rd9Var = new rd9();
        return new puw0(rd9Var, new xp90(vg20Var, rd9Var), new emu(vg20Var, new zqu()), new q7h0(vg20Var, rd9Var), new rte0(vg20Var), a201.b().e(), s, ((VoipAnalyticsInternalComponent) m7m.d(this).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df());
    }
}
