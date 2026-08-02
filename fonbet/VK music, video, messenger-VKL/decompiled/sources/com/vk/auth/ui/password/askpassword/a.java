package com.vk.auth.ui.password.askpassword;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.auth.signup.VkAdditionalSignUpData;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.auth.validation.VkBanRouterInfo;
import com.vk.auth.validation.VkPassportRouterInfo;
import com.vk.auth.validation.VkValidatePhoneInfo;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.exceptions.AuthException;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a2b;
import xsna.ajr0;
import xsna.b1v0;
import xsna.b3m0;
import xsna.bpn0;
import xsna.c1v0;
import xsna.cbu0;
import xsna.clt0;
import xsna.czi;
import xsna.d1v0;
import xsna.d4a0;
import xsna.e1v0;
import xsna.e4a0;
import xsna.ebu0;
import xsna.epq0;
import xsna.hy0;
import xsna.i060;
import xsna.i8n0;
import xsna.i9u0;
import xsna.iyd0;
import xsna.izs;
import xsna.mnh0;
import xsna.p6e0;
import xsna.q55;
import xsna.r55;
import xsna.s3q0;
import xsna.tmu0;
import xsna.umu0;
import xsna.vgg;
import xsna.w5k0;
import xsna.ygg;

/* compiled from: VkAskPasswordPresenter.kt */
/* loaded from: classes15.dex */
public final class a {
    public final Context a;
    public final VkAskPasswordView b;
    public final cbu0 c;
    public VkAskPasswordData d;
    public czi e = ajr0.c;
    public boolean f = true;
    public final b g = new b();
    public final ebu0 h = new ebu0(this);
    public final bpn0 i = new bpn0(new clt0(this, 3));

    /* compiled from: VkAskPasswordPresenter.kt */
    /* renamed from: com.vk.auth.ui.password.askpassword.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0418a extends FunctionReferenceImpl implements izs<vgg, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(vgg vggVar) {
            boolean z;
            boolean z2;
            vgg vggVar2 = vggVar;
            a aVar = (a) this.receiver;
            aVar.getClass();
            Throwable th = vggVar2.a;
            q55 q55Var = q55.a;
            SignUpDataHolder signUpDataHolder = q55.c().a;
            Context context = aVar.a;
            Context context2 = context;
            while (true) {
                z = context2 instanceof FragmentActivity;
                if (z || !(context2 instanceof ContextWrapper)) {
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context2 : null);
            hy0 hy0Var = new hy0(aVar, 12);
            r55 r55Var = r55.a;
            umu0 umu0Var = r55.g;
            if (umu0Var == null) {
                umu0Var = null;
            }
            tmu0 tmu0Var = umu0Var.k;
            com.vk.auth.validation.a aVar2 = new com.vk.auth.validation.a(fragmentActivity);
            e4a0 e4a0Var = new e4a0(fragmentActivity, hy0Var);
            if (th instanceof AuthException.NeedValidationException) {
                while (true) {
                    z2 = context instanceof Activity;
                    if (z2 || !(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                AuthException.NeedValidationException needValidationException = (AuthException.NeedValidationException) th;
                new i060(z2 ? (Activity) context : null, signUpDataHolder.I, new b3m0(aVar, 17), new i8n0(aVar, 14)).a(needValidationException.d(), needValidationException.g(), aVar.g);
            } else {
                VkAuthMetaInfo vkAuthMetaInfo = signUpDataHolder.I;
                p6e0 p6e0Var = new p6e0(21);
                w5k0 w5k0Var = new w5k0(9);
                if (th instanceof AuthException.PhoneValidationRequiredException) {
                    AuthException.PhoneValidationRequiredException phoneValidationRequiredException = (AuthException.PhoneValidationRequiredException) th;
                    q55.a(new d4a0(e4a0Var.a.getApplicationContext(), vkAuthMetaInfo, phoneValidationRequiredException.h(), phoneValidationRequiredException.g(), hy0Var, w5k0Var));
                    VkValidatePhoneInfo a = VkValidatePhoneInfo.a.a(phoneValidationRequiredException.k(), phoneValidationRequiredException.j(), phoneValidationRequiredException.i(), phoneValidationRequiredException.d(), true);
                    if (a instanceof VkValidatePhoneInfo.ConfirmPhone) {
                        VkValidatePhoneInfo.ConfirmPhone confirmPhone = (VkValidatePhoneInfo.ConfirmPhone) a;
                        aVar2.D0(new PhoneValidationContract$ValidationDialogMetaInfo(confirmPhone.d, confirmPhone.c, confirmPhone.b, confirmPhone.e, confirmPhone.f));
                    } else {
                        com.vk.auth.validation.b.a(r55.d, fragmentActivity, a, 48);
                    }
                } else if (th instanceof AuthException.NeedSignUpException) {
                    AuthException.NeedSignUpException needSignUpException = (AuthException.NeedSignUpException) th;
                    VkAdditionalSignUpData vkAdditionalSignUpData = new VkAdditionalSignUpData(needSignUpException.g(), needSignUpException.i(), needSignUpException.d(), needSignUpException.h(), vkAuthMetaInfo, needSignUpException.k(), new SignUpAgreementInfo(needSignUpException.l(), needSignUpException.j()));
                    q55.a(new c1v0(w5k0Var, p6e0Var));
                    aVar2.e(vkAdditionalSignUpData);
                } else if (th instanceof AuthException.DeactivatedUserException) {
                    AuthException.DeactivatedUserException deactivatedUserException = (AuthException.DeactivatedUserException) th;
                    VkPassportRouterInfo vkPassportRouterInfo = new VkPassportRouterInfo(deactivatedUserException.d(), deactivatedUserException.g(), vkAuthMetaInfo, deactivatedUserException.h(), null, 16, null);
                    q55.a(new e1v0(w5k0Var, p6e0Var));
                    aVar2.c(vkPassportRouterInfo);
                } else if (th instanceof AuthException.BannedUserException) {
                    VkBanRouterInfo vkBanRouterInfo = new VkBanRouterInfo(((AuthException.BannedUserException) th).d(), vkAuthMetaInfo);
                    q55.a(new d1v0(w5k0Var, p6e0Var));
                    aVar2.b(vkBanRouterInfo);
                } else if (th instanceof AuthException.VkEmailSignUpRequiredException) {
                    Serializer.c<CreateVkEmailRequiredData> cVar = CreateVkEmailRequiredData.CREATOR;
                    CreateVkEmailRequiredData a2 = CreateVkEmailRequiredData.a.a((AuthException.VkEmailSignUpRequiredException) th, r55.h().e(), vkAuthMetaInfo);
                    q55.a(new b1v0(w5k0Var, p6e0Var));
                    aVar2.C0(a2);
                } else {
                    aVar.a(vggVar2);
                }
                vggVar2.c();
            }
            return s3q0.a;
        }
    }

    public a(Context context, VkAskPasswordView vkAskPasswordView, cbu0 cbu0Var) {
        this.a = context;
        this.b = vkAskPasswordView;
        this.c = cbu0Var;
    }

    public final void a(vgg vggVar) {
        Throwable th = vggVar.a;
        if (vggVar.b() != ApiErrorViewType.CUSTOM) {
            vggVar.c();
            return;
        }
        boolean z = th instanceof AuthException.IncorrectLoginDataException;
        Context context = this.a;
        VkAskPasswordView vkAskPasswordView = this.b;
        if (z || ((th instanceof VKWebAuthException) && ((VKWebAuthException) th).k())) {
            vkAskPasswordView.hh(context.getString(R.string.vk_connect_ask_password_wrong_pass));
        } else {
            vkAskPasswordView.hh(context.getString(R.string.vk_auth_load_network_error));
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public final void b(q<AuthResult> qVar) {
        epq0 epq0Var = new epq0(new iyd0(this, 21), 5);
        qVar.getClass();
        this.g.b(mnh0.B(new c0(qVar, epq0Var, io.reactivex.rxjava3.internal.functions.a.c).G(new a2b(this, 6)), (ygg) this.i.getValue(), new i9u0(this, 1), new C0418a(1, this, a.class, "handleExtendLoginError", "handleExtendLoginError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0), null));
    }
}
