package com.vk.auth.enterphone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.auth.enterphone.EnterPhonePresenterInfo;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.movika.sdk.base.ui.p0;
import com.vk.registration.funnels.b;
import com.vk.video.ui.discovery.minimizable.related_videos.j;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.bbu;
import xsna.cpp;
import xsna.d50;
import xsna.dmj0;
import xsna.dv2;
import xsna.e10;
import xsna.e370;
import xsna.edi;
import xsna.gzs;
import xsna.h3i;
import xsna.hjj;
import xsna.i5s;
import xsna.iou;
import xsna.izs;
import xsna.jeq0;
import xsna.jg0;
import xsna.mk;
import xsna.mnh0;
import xsna.msy;
import xsna.nao0;
import xsna.ngl;
import xsna.nvg;
import xsna.o19;
import xsna.o860;
import xsna.p3a0;
import xsna.p66;
import xsna.pvh;
import xsna.qcv0;
import xsna.rex0;
import xsna.s3q0;
import xsna.sir0;
import xsna.x65;
import xsna.x8m;
import xsna.xqf0;
import xsna.zlj0;

/* compiled from: EnterPhonePresenter.kt */
/* loaded from: classes15.dex */
public final class a extends p66<cpp> implements nao0 {
    public final Object A;
    public final Object B;
    public Country C;
    public String D;
    public boolean E;
    public boolean F;
    public final Object G;
    public final EnterPhonePresenterInfo x;
    public final qcv0 y;
    public final nvg z = new nvg(this, 18);

    public a(EnterPhonePresenterInfo enterPhonePresenterInfo, qcv0 qcv0Var, Bundle bundle) {
        Country country;
        String str;
        this.x = enterPhonePresenterInfo;
        this.y = qcv0Var;
        dv2 dv2Var = new dv2(15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.A = msy.a(lazyThreadSafetyMode, dv2Var);
        this.B = msy.a(lazyThreadSafetyMode, new jg0(18));
        this.G = msy.a(lazyThreadSafetyMode, new pvh(this, 4));
        EnterPhonePresenterInfo.SignUp signUp = enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.SignUp ? (EnterPhonePresenterInfo.SignUp) enterPhonePresenterInfo : null;
        if (bundle == null || (country = (Country) bundle.getParcelable("VkAuthLib_chosenCountry")) == null) {
            country = signUp != null ? signUp.c : null;
            if (country == null) {
                country = this.c.a();
            }
        }
        this.C = country;
        if (bundle == null || (str = bundle.getString("VkAuthLib_phoneWithoutCode")) == null) {
            String str2 = signUp != null ? signUp.d : null;
            str = str2 == null ? "" : str2;
        }
        this.D = str;
    }

    public final void A0(String str) {
        this.t.b(mnh0.B(w0(this.c.i(), false), this.s, new d50(14, str, this), new x8m(4), null));
    }

    @Override // xsna.nao0
    public final void U() {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.b, jeq0.g(this.c.c(this.C.d)));
        this.e.c(AuthStatSender.Screen.PHONE, AuthStatSender.Status.DEFAULT, AuthStatSender.Element.TERMS_LINK);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.PHONE;
    }

    @Override // xsna.nao0
    public final void j() {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.b, jeq0.g(this.c.l(this.C.d)));
        this.e.c(AuthStatSender.Screen.PHONE, AuthStatSender.Status.DEFAULT, AuthStatSender.Element.PRIVACY_LINK);
    }

    @Override // xsna.p66
    public final void o0(String str, gzs<s3q0> gzsVar, izs<? super String, s3q0> izsVar, String str2) {
        final boolean z = this.x instanceof EnterPhonePresenterInfo.Validate;
        if (z) {
            b bVar = b.a;
            xqf0 xqf0Var = new xqf0(0);
            bVar.getClass();
            b.a(xqf0Var);
        }
        cpp cppVar = (cpp) this.a;
        if (cppVar != null) {
            Context context = this.b;
            x65.a.a(cppVar, context.getString(R.string.vk_auth_error), str2, context.getString(R.string.vk_auth_sign_up_account_apply_new_number), gzsVar, context.getString(R.string.vk_auth_sign_up_account_unavailable_go_to_support), new mk(10, izsVar, str), gzsVar == null, null, new gzs() { // from class: xsna.fpp
                @Override // xsna.gzs
                public final Object invoke() {
                    if (z) {
                        com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
                        wqf0 wqf0Var = new wqf0(0);
                        bVar2.getClass();
                        com.vk.registration.funnels.b.a(wqf0Var);
                    }
                    return s3q0.a;
                }
            }, 128);
        }
    }

    @Override // xsna.p66, xsna.z55
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 18375) {
            return false;
        }
        if (i2 == -1 && intent != null) {
            qcv0 qcv0Var = this.y;
            String a = qcv0Var != null ? qcv0Var.a(intent) : null;
            if (a != null) {
                A0(a);
            }
        }
        if (i2 != 0) {
            return true;
        }
        b.a.getClass();
        b.n();
        return true;
    }

    @Override // xsna.p66, xsna.z55
    public final void x(Bundle bundle) {
        bundle.putParcelable("VkAuthLib_chosenCountry", this.C);
        bundle.putString("VkAuthLib_phoneWithoutCode", this.D);
    }

    public final String y0() {
        String str = this.D;
        boolean z = str.length() >= this.c.b();
        cpp cppVar = (cpp) this.a;
        if (cppVar != null) {
            cppVar.W0(!z);
        }
        if (z) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void z0(Country country, String str) {
        cpp cppVar = (cpp) this.a;
        if (cppVar != null) {
            cppVar.cj();
        }
        String a = i5s.a(new StringBuilder("+"), country.c, str);
        EnterPhonePresenterInfo enterPhonePresenterInfo = this.x;
        boolean z = enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.Validate;
        boolean a2 = !z ? this.c.n().a() : false;
        boolean z2 = !z || ((EnterPhonePresenterInfo.Validate) enterPhonePresenterInfo).c;
        String str2 = enterPhonePresenterInfo.b;
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        sir0.e eVar = new sir0.e(str2, a, a2, false, false, false, z2, signUpDataHolder.C, false, null, 824);
        this.F = false;
        this.t.b(mnh0.B(w0(sir0.h(sir0.a, eVar).L(new o860(new iou(new bbu(new zlj0(eVar), new dmj0(), new edi(21), (p3a0) this.G.getValue(), new o19()), 28), 1), false), true), this.s, new j(this, country, a), new hjj(this, country, a, str, 1), new ngl(null, new e10(this, 25), new h3i(this, a), null, null, null, null, null, new p0(this, 18), null, 761)));
    }
}
