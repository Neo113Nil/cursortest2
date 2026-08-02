package com.vk.voip.ui.qr.ui;

import android.os.Bundle;
import android.view.View;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.qr.ui.a;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.subjects.f;
import java.util.List;
import java.util.Locale;
import xsna.a201;
import xsna.ao50;
import xsna.asu0;
import xsna.aww0;
import xsna.bzb0;
import xsna.c5v0;
import xsna.cm9;
import xsna.cwb0;
import xsna.d0m0;
import xsna.dw20;
import xsna.emh0;
import xsna.fm50;
import xsna.g0m0;
import xsna.gfv0;
import xsna.gko;
import xsna.gm50;
import xsna.hfv0;
import xsna.hri0;
import xsna.jne0;
import xsna.km50;
import xsna.lne0;
import xsna.mk50;
import xsna.mll0;
import xsna.nht;
import xsna.on0;
import xsna.pt20;
import xsna.tlo0;
import xsna.tq;
import xsna.tvo;
import xsna.ubt0;
import xsna.vk50;
import xsna.vvw0;
import xsna.vyq0;
import xsna.x7g;
import xsna.xau0;
import xsna.xvr0;
import xsna.z7t0;
import xsna.z8l0;
import xsna.zvw0;

/* compiled from: VoipQrCodeScannerFragment.kt */
/* loaded from: classes7.dex */
public final class VoipQrCodeScannerFragment extends MviImplFragment<vvw0, a, jne0> implements g0m0, tvo.a, nht {
    public static final /* synthetic */ int W = 0;
    public d0m0 Q;
    public final b R = new b();
    public final f<lne0> S = new f<>();
    public final on0 T = new on0();
    public bzb0 U;
    public dw20 V;

    @Override // xsna.xn50
    public final mk50 Fl() {
        String lowerCase;
        this.U = new bzb0(requireContext());
        Bundle arguments = getArguments();
        if (arguments == null || (lowerCase = arguments.getString("event_screen")) == null) {
            lowerCase = "VOIP_CALL".toLowerCase(Locale.ROOT);
        }
        String lowerCase2 = "QR_SCANNER".toLowerCase(Locale.ROOT);
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(lowerCase, lowerCase2);
        aVar.s();
        aVar.C = true;
        aVar.c();
        aVar.Z = false;
        cm9 a = pt20.b().a(requireContext(), aVar.a(), this, new emh0(this, 28));
        this.Q = a;
        if (a == null) {
            a = null;
        }
        a.C9();
        d0m0 d0m0Var = this.Q;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.v1(lowerCase, lowerCase2);
        d0m0 d0m0Var2 = this.Q;
        if (d0m0Var2 == null) {
            d0m0Var2 = null;
        }
        d0m0Var2.h3(null);
        d0m0 d0m0Var3 = this.Q;
        return new mk50.c((View) (d0m0Var3 != null ? d0m0Var3 : null));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        a aVar = (a) ao50Var;
        gm50.a.b(this, aVar.a, new vyq0(this, 14));
        gm50.a.b(this, aVar.b, new ubt0(this, 10));
        gm50.a.b(this, aVar.c, new gfv0(this, 6));
        gm50.a.b(this, aVar.e, new hfv0(this, 5));
        gm50.a.b(this, aVar.d, new xau0(this, 9));
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        d0m0 d0m0Var = this.Q;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.K0(i, strArr);
    }

    public final void fo(fm50<? extends aww0> fm50Var) {
        if (fm50Var instanceof a.e) {
            bzb0 bzb0Var = this.U;
            if (bzb0Var == null) {
                bzb0Var = null;
            }
            bzb0Var.c(cwb0.r0.e, null);
        } else {
            bzb0 bzb0Var2 = this.U;
            if (bzb0Var2 == null) {
                bzb0Var2 = null;
            }
            bzb0Var2.a();
        }
        if (fm50Var instanceof a.C2071a) {
            dw20 dw20Var = this.V;
            if (dw20Var != null) {
                dw20Var.dismiss();
            }
            this.V = null;
            go(R.string.voip_add_room_to_call_success_message, R.drawable.vk_icon_check_circle_outline_56);
            return;
        }
        if (fm50Var instanceof a.b) {
            gm50.a.a(this, ((a.b) fm50Var).a, new z8l0(this, 19));
            return;
        }
        if (!(fm50Var instanceof a.d)) {
            dw20 dw20Var2 = this.V;
            if (dw20Var2 != null) {
                dw20Var2.dismiss();
            }
            this.V = null;
            return;
        }
        dw20 dw20Var3 = this.V;
        if (dw20Var3 != null) {
            dw20Var3.dismiss();
        }
        this.V = null;
        go(R.string.voip_error_common, R.drawable.vk_icon_error_outline_56);
    }

    public final void go(int i, int i2) {
        new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(i2), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(14, tq.h(tlo0.Companion, i), null), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.voip_add_room_to_call_success_ok_button), new hri0(this, 24), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) null, 6), 52), new mll0(this, 22), false, 20).b(requireContext(), "VoipQrCodeScannerFragment");
    }

    @Override // xsna.g0m0
    public final void o5(boolean z) {
        d0m0 d0m0Var = this.Q;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.Hj();
        finish();
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.R.b(this.S.a0(asu0.p()).r0(asu0Var.d()).subscribe(new xvr0(new z7t0(this, 10), 7)));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        d0m0 d0m0Var = this.Q;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onDestroy();
        this.R.dispose();
        dw20 dw20Var = this.V;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        bzb0 bzb0Var = this.U;
        (bzb0Var != null ? bzb0Var : null).a();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        d0m0 d0m0Var = this.Q;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        d0m0 d0m0Var = this.Q;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.T8(i, strArr, iArr);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d0m0 d0m0Var = this.Q;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onResume();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        d0m0 d0m0Var = this.Q;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.onStart();
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        d0m0 d0m0Var = this.Q;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.pc(i, list);
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        d0m0 d0m0Var = this.Q;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.wi(i, list);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        zvw0 zvw0Var = new zvw0(aww0.c.b);
        String string = requireArguments().getString("call_join_link");
        return new vvw0(zvw0Var, string != null ? new jne0.a.c(string) : new jne0.a.C3129a(a201.b().b()));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.QR_SCANNER;
    }
}
