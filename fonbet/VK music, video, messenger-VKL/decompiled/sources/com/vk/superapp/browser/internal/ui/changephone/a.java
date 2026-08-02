package com.vk.superapp.browser.internal.ui.changephone;

import android.os.Bundle;
import android.view.View;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.browser.internal.ui.changephone.VkChangePhoneResult;
import java.util.Map;
import xsna.a0a;
import xsna.bpn0;
import xsna.bqm0;
import xsna.d8t0;
import xsna.dhr0;
import xsna.e370;
import xsna.ecu0;
import xsna.eju0;
import xsna.f6m0;
import xsna.frf0;
import xsna.gfx0;
import xsna.i7y;
import xsna.mhy;
import xsna.n9m0;
import xsna.qr;
import xsna.r3y;
import xsna.r6y;

/* compiled from: VkChangePhoneFragment.kt */
/* loaded from: classes6.dex */
public class a extends com.vk.superapp.browser.ui.a {
    public VkChangePhoneResult S = VkChangePhoneResult.Error.b;
    public final bpn0 T = new bpn0(new d8t0(this, 6));

    /* compiled from: VkChangePhoneFragment.kt */
    /* renamed from: com.vk.superapp.browser.internal.ui.changephone.a$a, reason: collision with other inner class name */
    public static final class C1870a {
        public static Bundle a(String str, Map map) {
            return qr.b(CommonConstant.KEY_ACCESS_TOKEN, str, "key_url", bqm0.a("https://id." + a0a.d + "/account/#/phone-change", map));
        }
    }

    @Override // com.vk.superapp.browser.ui.a
    public final r6y Dn() {
        return new i7y(yn(), new f6m0(this, 18));
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.PHONE_CHANGE_ACCOUNT, null, null, null, 30);
        r3y.a("phone_change", new n9m0(this, 20));
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.g(SchemeStatSak$EventScreen.PHONE_CHANGE_ACCOUNT, SchemeStatSak$EventScreen.VERIFICATION_ASK_NUMBER, null, null, 12);
        r3y.b();
        eju0.a.a(this.S);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        b bVar = (b) this.T.getValue();
        if (z) {
            bVar.getClass();
        } else {
            bVar.f(bVar.a.getView());
        }
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((b) this.T.getValue()).b();
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((b) this.T.getValue()).c(view, false);
        mhy.d(view);
    }

    /* compiled from: VkChangePhoneFragment.kt */
    public static final class b extends ecu0 {
        @Override // xsna.ecu0
        public final void g(boolean z) {
            super.g(z);
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.getClass();
            d(!dhr0.M());
        }

        @Override // xsna.ecu0
        public final void e(boolean z) {
        }
    }
}
