package com.vk.voip.ui.join.directly.withpreview;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.ui.join.directly.withpreview.JoinCallConfig;
import com.vkontakte.android.R;
import xsna.a201;
import xsna.ao50;
import xsna.b25;
import xsna.bzx;
import xsna.d49;
import xsna.d9;
import xsna.emu;
import xsna.fpf0;
import xsna.gm50;
import xsna.gz80;
import xsna.hdh0;
import xsna.ifg;
import xsna.il7;
import xsna.iw50;
import xsna.jrh;
import xsna.jsa;
import xsna.km50;
import xsna.krh;
import xsna.kzx;
import xsna.lwh;
import xsna.lyk0;
import xsna.m7m;
import xsna.mk50;
import xsna.o19;
import xsna.os9;
import xsna.oz50;
import xsna.p19;
import xsna.pwk;
import xsna.q29;
import xsna.qau0;
import xsna.rlh;
import xsna.s55;
import xsna.tzx;
import xsna.vg20;
import xsna.vk50;
import xsna.w89;
import xsna.wzx;
import xsna.x9p;
import xsna.xn50;
import xsna.yzx;
import xsna.zqu;
import xsna.zxo;

/* compiled from: JoinCallFragment.kt */
/* loaded from: classes7.dex */
public final class JoinCallFragment extends MviImplFragment<kzx, yzx, bzx> {
    public static final /* synthetic */ int U = 0;
    public final d49 Q = new d49();
    public final d9 R = new d9(this, 19);
    public FrameLayout S;
    public x9p T;

    /* compiled from: JoinCallFragment.kt */
    public static final class a {

        /* compiled from: JoinCallFragment.kt */
        /* renamed from: com.vk.voip.ui.join.directly.withpreview.JoinCallFragment$a$a, reason: collision with other inner class name */
        public static final class C2064a extends qau0 {
            public final iw50 c;

            public C2064a() {
                super(new hdh0.a());
                this.c = new iw50(0);
            }

            @Override // xsna.nch0
            public final iw50 a() {
                return this.c;
            }
        }

        public static void a(Context context, JoinCallConfig joinCallConfig) {
            oz50 oz50Var = new oz50(JoinCallFragment.class, JoinCallActivity.class, null);
            oz50Var.j.putParcelable("KEY_JOIN_CALL_CONFIG", joinCallConfig);
            oz50Var.k(context);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_join_call_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        yzx yzxVar = (yzx) ao50Var;
        wzx wzxVar = new wzx(view, getViewLifecycleOwner(), this.T, new s55(1, this, JoinCallFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 9), getChildFragmentManager(), new krh(this, 26));
        this.S = (FrameLayout) view.findViewById(R.id.voip_join_call_preview_render_container);
        gm50.a.b(this, yzxVar.c, new ifg(wzxVar, 26));
        gm50.a.b(this, yzxVar.a, new lwh(wzxVar, 21));
        gm50.a.b(this, yzxVar.b, new rlh(wzxVar, 17));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        getFeature().n.a(new il7(8, this, ((VoipCallComponent) m7m.d(this).a(fpf0.a(VoipCallComponent.class))).a()), this);
        getFeature().o.a(new pwk(this, 23), this);
        getFeature().p.a(new zxo(this, 20), this);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getChildFragmentManager().l0("request_key_change_name", this, this.R);
        this.T = a201.b().d();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        x9p x9pVar;
        super.onPause();
        if (isVisible() || (x9pVar = this.T) == null) {
            return;
        }
        FrameLayout frameLayout = this.S;
        if (frameLayout == null) {
            frameLayout = null;
        }
        x9pVar.b(frameLayout);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, bzx.a.b);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        JoinCallConfig joinCallConfig;
        Object parcelable;
        JoinCallConfig joinCallConfig2 = null;
        if (gz80.a(33)) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                parcelable = arguments.getParcelable("KEY_JOIN_CALL_CONFIG", JoinCallConfig.class);
                joinCallConfig2 = (JoinCallConfig) parcelable;
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                joinCallConfig2 = (JoinCallConfig) arguments2.getParcelable("KEY_JOIN_CALL_CONFIG");
            }
        }
        if (joinCallConfig2 == null) {
            throw new IllegalStateException("config not passed");
        }
        b25 s = ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).s();
        vg20 vg20Var = new vg20();
        tzx tzxVar = new tzx(joinCallConfig2.i);
        boolean z = joinCallConfig2.h;
        p19 provide = ((VoipCallComponent) m7m.d(this).a(fpf0.a(VoipCallComponent.class))).t1().provide();
        if (provide != null) {
            q29.a aVar = provide.d().a;
            JoinCallConfig.JoinAs joinAs = joinCallConfig2.g;
            boolean z2 = aVar.a;
            boolean z3 = aVar.b;
            boolean z4 = aVar.c;
            joinAs.getClass();
            joinCallConfig = new JoinCallConfig(joinCallConfig2.b, joinCallConfig2.c, joinCallConfig2.d, joinCallConfig2.e, joinCallConfig2.f, new JoinCallConfig.JoinAs(z2, z3, z4), joinCallConfig2.h, joinCallConfig2.i);
        } else {
            joinCallConfig = joinCallConfig2;
        }
        return new kzx(tzxVar, z, joinCallConfig, new jsa(new os9(new jrh(s, 20), 2)), new emu(vg20Var, new zqu()), new lyk0(requireContext(), new o19()), a201.b().b(), s, new w89());
    }
}
