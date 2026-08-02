package com.vk.auth.verification.base;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.smartflow.mail.password.MailPasswordData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.c;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import com.vk.emailforwarding.api.di.EmailForwardingComponent;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.movika.sdk.base.logic.interactor.d;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.analytics.MaxMessengerAnalytics;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.ok.gl.tf.Tensorflow;
import xsna.ab6;
import xsna.ai3;
import xsna.brm0;
import xsna.bv3;
import xsna.dd40;
import xsna.drm0;
import xsna.eeu0;
import xsna.epx;
import xsna.f35;
import xsna.fpf0;
import xsna.ga;
import xsna.gf0;
import xsna.ha;
import xsna.ie3;
import xsna.inr0;
import xsna.j50;
import xsna.j66;
import xsna.k9b;
import xsna.knr0;
import xsna.l0c;
import xsna.m63;
import xsna.ma;
import xsna.mnh0;
import xsna.mp0;
import xsna.ngl;
import xsna.nn9;
import xsna.ns1;
import xsna.p66;
import xsna.par0;
import xsna.px0;
import xsna.q55;
import xsna.r04;
import xsna.s3q0;
import xsna.sp;
import xsna.sx0;
import xsna.tl0;
import xsna.v2j;
import xsna.v74;
import xsna.vbu0;
import xsna.vgg;
import xsna.wbu0;
import xsna.x65;
import xsna.z2a0;
import xsna.za6;
import xsna.zn70;

/* compiled from: BaseCheckPresenter.kt */
/* loaded from: classes15.dex */
public abstract class b<V extends c> extends p66<V> implements l0c<V> {
    public static final long G = TimeUnit.MILLISECONDS.toMillis(500);
    public boolean A;
    public Boolean B;
    public String C;
    public final MaxMessengerAnalytics D;
    public final inr0 E;
    public final z2a0 F;
    public final CheckPresenterInfo x;
    public String y = "";
    public CodeState z;

    /* compiled from: BaseCheckPresenter.kt */
    public final class a extends p66<V>.a {
        public a() {
            super();
        }

        @Override // xsna.e66
        public final void z(String str) {
            c cVar = (c) b.this.a;
            if (cVar != null) {
                cVar.E1(str, (r5 & 2) == 0, (r5 & 4) == 0);
            }
        }
    }

    public b(CodeState codeState, Bundle bundle, CheckPresenterInfo checkPresenterInfo) {
        CodeState codeState2;
        this.x = checkPresenterInfo;
        if (codeState == null) {
            codeState2 = bundle != null ? (CodeState) bundle.getParcelable("VkAuthLib_codeState") : null;
            if (codeState2 == null) {
                codeState2 = new CodeState.SmsWait(System.currentTimeMillis(), CodeState.d, 0);
            }
        } else {
            codeState2 = codeState;
        }
        this.z = codeState2;
        MaxMessengerAnalytics Q9 = ((SakAnalyticsComponent) k0().a(fpf0.a(SakAnalyticsComponent.class))).Q9();
        this.D = Q9;
        this.E = new inr0(codeState == null ? new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null) : codeState, this, checkPresenterInfo, Q9);
        this.F = new z2a0();
    }

    public int A0() {
        if (!(B0() instanceof CodeState.NotReceive)) {
            return B0().d();
        }
        CodeState codeState = B0().b;
        return codeState != null ? codeState.d() : B0().d();
    }

    public CodeState B0() {
        return this.z;
    }

    public final int C0() {
        if (this.x instanceof CheckPresenterInfo.Auth) {
            return Math.max(B0().d(), 8);
        }
        if (B0().d() == 0) {
            return 10;
        }
        return B0().d();
    }

    public boolean D0() {
        return A0() > 0 && this.y.length() == A0();
    }

    public boolean E0() {
        return true;
    }

    public final void F0(String str, String str2) {
        this.F.getClass();
        r04 a2 = z2a0.a(str, this.x);
        o0((String) a2.a, (bv3) a2.b, (ma) a2.c, str2);
    }

    public final void G0(String str, vgg vggVar) {
        Throwable th = vggVar.a;
        par0.a.getClass();
        par0.c("[CheckPresenter] onPhoneConfirmError", th);
        this.E.b(th);
        boolean z = th instanceof IOException;
        Context context = this.b;
        if (z || ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1)) {
            if (vggVar.b() != ApiErrorViewType.CUSTOM) {
                vggVar.c();
                return;
            }
            c cVar = (c) this.a;
            if (cVar != null) {
                cVar.E1(wbu0.a(context, th, false).a, (r5 & 2) == 0, (r5 & 4) == 0);
            }
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        Throwable th2 = vggVar.a;
        wbu0.a a2 = wbu0.a(context, th2, false);
        if (!(th2 instanceof VKApiExecutionException)) {
            if (vggVar.b() != ApiErrorViewType.CUSTOM) {
                vggVar.c();
                return;
            }
            c cVar2 = (c) this.a;
            if (cVar2 != null) {
                cVar2.vf(a2);
            }
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th2;
        int s = vKApiExecutionException.s();
        int i = 5;
        if (s == 5) {
            if (f35.d(vKApiExecutionException)) {
                sp.v(this.a, context, new com.vk.movika.sdk.base.logic.interactor.b(this, 7));
                return;
            }
            return;
        }
        if (s == 8) {
            sx0 sx0Var = new sx0(vggVar, i);
            zn70 zn70Var = this.q;
            (zn70Var != null ? zn70Var : null).a(vKApiExecutionException.s(), vKApiExecutionException.C(), new j66(0, sx0Var));
            return;
        }
        int i2 = 1;
        if (s == 15) {
            c cVar3 = (c) this.a;
            if (cVar3 != null) {
                x65.a.a(cVar3, context.getString(R.string.vk_auth_error), a2.a, context.getString(R.string.vk_ok), new ie3(i2, this, str), null, null, false, null, null, Tensorflow.FRAME_WIDTH);
                return;
            }
            return;
        }
        if (s != 1004) {
            if (s != 1110) {
                vggVar.c();
                return;
            }
            if (vggVar.b() != ApiErrorViewType.CUSTOM) {
                vggVar.c();
                return;
            }
            c cVar4 = (c) this.a;
            if (cVar4 != null) {
                cVar4.E1(context.getString(R.string.vk_auth_wrong_code), (r5 & 2) == 0, (r5 & 4) == 0);
            }
            s3q0 s3q0Var3 = s3q0.a;
            return;
        }
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        Bundle bundle = signUpDataHolder.K;
        if (bundle == null || !bundle.getBoolean("promo_ok")) {
            if (vggVar.b() != ApiErrorViewType.CUSTOM) {
                vggVar.c();
                return;
            } else {
                F0(str, a2.a);
                s3q0 s3q0Var4 = s3q0.a;
                return;
            }
        }
        SignUpRouter signUpRouter = this.n;
        FragmentActivity B0 = (signUpRouter != null ? signUpRouter : null).B0();
        px0 px0Var = new px0(this, 5);
        eeu0.a aVar = new eeu0.a(B0);
        aVar.c = false;
        View inflate = B0.getLayoutInflater().inflate(R.layout.vk_promo_error_another_account, (ViewGroup) B0.getWindow().getDecorView().findViewById(android.R.id.content), false);
        ((Button) inflate.findViewById(R.id.positive_button)).setOnClickListener(new nn9(px0Var, 11));
        aVar.f = inflate;
        aVar.m();
    }

    public void H0(vbu0 vbu0Var) {
        par0.a.getClass();
        par0.a("[CheckPresenter] onPhoneConfirmSuccess");
        this.E.c(vbu0Var.b != null);
        CodeState z0 = z0();
        this.F.getClass();
        z2a0.b(this.x, vbu0Var, this.w, z0);
    }

    public final void I0(String str) {
        if (str == null) {
            return;
        }
        boolean z = this.x instanceof CheckPresenterInfo.Auth;
        AuthModel authModel = this.c;
        if (z && J0(str, authModel.m())) {
            return;
        }
        J0(str, authModel.g());
    }

    public final boolean J0(String str, Pattern pattern) {
        String group;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find() || (group = matcher.group(0)) == null) {
            return false;
        }
        this.B = Boolean.TRUE;
        this.y = group;
        N0();
        c cVar = (c) this.a;
        if (cVar != null) {
            cVar.O2(group);
        }
        if (D0()) {
            return true;
        }
        O0(group);
        return true;
    }

    public final void K0(v2j v2jVar) {
        this.F.getClass();
        CheckPresenterInfo checkPresenterInfo = this.x;
        b0 c = z2a0.c(checkPresenterInfo, v2jVar);
        if ((checkPresenterInfo instanceof CheckPresenterInfo.SignUp) || (checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth)) {
            mp0 mp0Var = new mp0(new tl0(this, 12), 4);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            c = c.E(mp0Var, lVar, kVar, kVar).F(new ga(new d(this, 11), 8));
        }
        this.t.b(mnh0.B(w0(c.a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new ha(this, 7), new v74(1, this, v2jVar), new ngl(null, null, new za6(this, v2jVar), null, new ai3(this, 2), null, null, null, null, null, 1003)));
    }

    public void L0(CodeState codeState) {
        this.z = codeState;
    }

    public final void M0() {
        CodeState B0 = B0();
        boolean z = B0 instanceof CodeState.NotReceive;
        inr0 inr0Var = this.E;
        if (z) {
            inr0Var.getClass();
            return;
        }
        CodeState codeState = inr0Var.c;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = B0 instanceof CodeState.CallResetPreview ? SchemeStatSak$EventScreen.CALLRESET_WARNING : SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY;
        if ((codeState instanceof CodeState.CallResetPreview ? SchemeStatSak$EventScreen.CALLRESET_WARNING : SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY) != schemeStatSak$EventScreen) {
            inr0Var.e();
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            bVar.getClass();
            com.vk.registration.funnels.b.z(bVar, schemeStatSak$EventScreen, null, null, null, 30);
            s3q0 s3q0Var = s3q0.a;
        }
        inr0Var.c = B0;
        inr0Var.f = null;
        inr0Var.e();
    }

    public void N0() {
        if (this.A) {
            return;
        }
        c cVar = (c) this.a;
        if (cVar != null) {
            cVar.Ud(B0(), C0());
        }
        CodeState B0 = B0();
        CodeState.WithTime withTime = B0 instanceof CodeState.WithTime ? (CodeState.WithTime) B0 : null;
        if (withTime != null && System.currentTimeMillis() > withTime.e + withTime.f) {
            CodeState codeState = withTime.c;
            if (codeState == null) {
                codeState = withTime.f();
                codeState.b = withTime;
            }
            L0(codeState);
        }
        if (B0() instanceof CodeState.CallResetPreview) {
            c cVar2 = (c) this.a;
            if (cVar2 != null) {
                cVar2.s0();
                return;
            }
            return;
        }
        if (B0() instanceof CodeState.MessengerRegistration) {
            c cVar3 = (c) this.a;
            if (cVar3 != null) {
                cVar3.s0();
                return;
            }
            return;
        }
        if (drm0.N(this.y)) {
            c cVar4 = (c) this.a;
            if (cVar4 != null) {
                cVar4.d2();
                return;
            }
            return;
        }
        c cVar5 = (c) this.a;
        if (cVar5 != null) {
            cVar5.s0();
        }
    }

    public void O0(String str) {
        inr0 inr0Var = this.E;
        inr0Var.getClass();
        inr0Var.d(new k9b(com.vk.registration.funnels.b.a, 5));
    }

    @Override // xsna.l0c
    public final void P() {
        inr0 inr0Var = this.E;
        inr0Var.getClass();
        inr0Var.d(new dd40(com.vk.registration.funnels.b.a));
        CheckPresenterInfo checkPresenterInfo = this.x;
        CheckPresenterInfo.PasswordLessAuth passwordLessAuth = checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth ? (CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo : null;
        if (passwordLessAuth == null) {
            return;
        }
        VerificationScreenData verificationScreenData = passwordLessAuth.b;
        FullscreenPasswordData fullscreenPasswordData = new FullscreenPasswordData(verificationScreenData.b, verificationScreenData instanceof VerificationScreenData.Phone, verificationScreenData.d, false, null, false, 48, null);
        com.vk.auth.main.b bVar = this.d;
        (bVar != null ? bVar : null).T0(fullscreenPasswordData, true);
    }

    @Override // xsna.l0c
    public void a() {
        O0(this.y);
    }

    @Override // xsna.l0c
    public final void a0(String str) {
        SignUpRouter signUpRouter = this.n;
        if (signUpRouter == null) {
            signUpRouter = null;
        }
        SignUpRouter.a.a(signUpRouter, str, null, null, null, 14);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.PHONE_CODE;
    }

    @Override // xsna.l0c
    public final void h() {
        CodeState z0 = z0();
        CodeState.MaxCodeWait maxCodeWait = z0 instanceof CodeState.MaxCodeWait ? (CodeState.MaxCodeWait) z0 : null;
        if (maxCodeWait == null) {
            return;
        }
        L0(new CodeState.MaxCodeWait(maxCodeWait.e, maxCodeWait.f, maxCodeWait.g, maxCodeWait.h, maxCodeWait.i, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r4.hasMimeType("text/html") == true) goto L18;
     */
    @Override // xsna.l0c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i() {
        CharSequence text;
        String obj;
        String str = null;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) this.b.getSystemService("clipboard");
            if (clipboardManager.hasPrimaryClip()) {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip != null) {
                    if (primaryClip.getItemCount() != 0) {
                        ClipDescription description = primaryClip.getDescription();
                        if (description != null && description.hasMimeType("text/plain")) {
                            ClipData.Item itemAt = primaryClip.getItemAt(0);
                            if (itemAt != null && (text = itemAt.getText()) != null && (obj = text.toString()) != null) {
                                str = brm0.y(obj, " ", "");
                            }
                        }
                    }
                    ClipDescription description2 = primaryClip.getDescription();
                    if (description2 != null) {
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (this.y.length() != 0 || epx.f(str, this.C) || str == null || drm0.N(str)) {
            return false;
        }
        I0(str);
        this.C = str;
        return true;
    }

    @Override // xsna.l0c
    public final void l(String str) {
        com.vk.auth.main.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        bVar.S0(new RestoreReason.Enter2FACode(str));
    }

    @Override // xsna.p66
    public final void p0() {
        if (this.x instanceof CheckPresenterInfo.Auth) {
            this.E.c(true);
        }
        this.e.f(AuthStatSender.Screen.PHONE_CODE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // xsna.smp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        MailAuthFlowConfig mailAuthFlowConfig;
        MailAuthFlowConfig e;
        Bundle bundle;
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.l();
        String str = null;
        try {
            q55 q55Var = q55.a;
            bundle = q55.c().a.K;
        } catch (Throwable unused) {
        }
        if (bundle != null) {
            mailAuthFlowConfig = m63.e(bundle);
            if (mailAuthFlowConfig != null) {
                ((EmailForwardingComponent) k0().a(fpf0.a(EmailForwardingComponent.class))).Hb();
                throw null;
            }
            CheckPresenterInfo checkPresenterInfo = this.x;
            CheckPresenterInfo.PasswordLessAuth passwordLessAuth = checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth ? (CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo : null;
            if (passwordLessAuth == null) {
                return;
            }
            VerificationScreenData verificationScreenData = passwordLessAuth.b;
            com.vk.auth.main.b bVar = this.d;
            if (bVar == null) {
                bVar = null;
            }
            try {
                q55 q55Var2 = q55.a;
                Bundle bundle2 = q55.c().a.K;
                if (bundle2 != null && (e = m63.e(bundle2)) != null) {
                    str = e.b;
                }
            } catch (Throwable unused2) {
            }
            if (str == null) {
                str = "···@mail.ru";
            }
            new MailPasswordData(str, verificationScreenData.d, false, 4, null);
            bVar.getClass();
            return;
        }
        mailAuthFlowConfig = null;
        if (mailAuthFlowConfig != null) {
        }
    }

    @Override // xsna.l0c
    public void s(boolean z) {
        par0.a.getClass();
        par0.a("[CheckPresenter] onResendClick");
        inr0 inr0Var = this.E;
        inr0Var.f = null;
        if (z) {
            inr0Var.e();
            com.vk.registration.funnels.b.a.getClass();
            com.vk.registration.funnels.b.x();
            s3q0 s3q0Var = s3q0.a;
        } else {
            inr0Var.d(new knr0(0, com.vk.registration.funnels.b.a, com.vk.registration.funnels.b.class, "onVerificationSendAgainTap", "onVerificationSendAgainTap(Ljava/util/ArrayList;)V", 0));
        }
        this.e.c(AuthStatSender.Screen.PHONE_CODE, AuthStatSender.Status.DEFAULT, AuthStatSender.Element.RESEND_CODE_BUTTON);
    }

    @Override // xsna.p66, xsna.z55
    public final void x(Bundle bundle) {
        bundle.putParcelable("VkAuthLib_codeState", B0());
    }

    @Override // xsna.p66, xsna.z55
    public void y0(V v) {
        VerificationScreenData verificationScreenData;
        super.y0(v);
        v.da(this.E.a() == VerificationStatFlow.SIGN_UP);
        M0();
        v.Ud(z0(), C0());
        i0(q.R(G, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new gf0(new ns1(this, 8), 2)));
        CheckPresenterInfo checkPresenterInfo = this.x;
        CheckPresenterInfo.PasswordLessAuth passwordLessAuth = checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth ? (CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo : null;
        if (passwordLessAuth != null && (verificationScreenData = passwordLessAuth.b) != null && verificationScreenData.i) {
            v.id();
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        i0(v.Pb().subscribe(new j50(new ab6(this, ref$BooleanRef, v, 0), 3)));
        if (E0()) {
            v.O1();
        }
    }

    public final CodeState z0() {
        if (!(B0() instanceof CodeState.NotReceive)) {
            return B0();
        }
        CodeState codeState = B0().b;
        return codeState == null ? B0() : codeState;
    }
}
