package com.vk.auth.main;

import com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.screendata.VkExistingProfileScreenData;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthProfileInfo;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.NextStep;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.PasswordScreen;
import com.vk.superapp.api.states.VkAuthState;
import kotlin.NoWhenBranchMatchedException;
import xsna.e370;
import xsna.e3a0;
import xsna.icu0;
import xsna.l55;
import xsna.pbu0;
import xsna.vdx0;
import xsna.wfn0;

/* compiled from: PhoneConfirmedStrategy.kt */
/* loaded from: classes15.dex */
public final class c extends e {

    /* compiled from: PhoneConfirmedStrategy.kt */
    public static abstract class a {
        public final c a;
        public final VerificationScreenData b;
        public final boolean c;
        public final VkAuthProfileInfo d;
        public final String e;
        public final pbu0 f;
        public final SignUpDataHolder g;
        public final SignUpRouter h;
        public final AuthValidateRegistrationConfirmTextsDto i;
        public final AfterPhoneReuseVerificationWay j;

        /* compiled from: PhoneConfirmedStrategy.kt */
        /* renamed from: com.vk.auth.main.c$a$a, reason: collision with other inner class name */
        public static final class C0404a extends a {
            @Override // com.vk.auth.main.c.a
            public final boolean a() {
                return this.d != null;
            }

            @Override // com.vk.auth.main.c.a
            public final void b() {
                Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
                this.f.b(l55.c(l55.a, this.a.a, VkAuthState.a.c(this.e, this.b.b, true, false), icu0.a(this.g.I, this.j), 4));
            }
        }

        /* compiled from: PhoneConfirmedStrategy.kt */
        public static final class b extends a {
            @Override // com.vk.auth.main.c.a
            public final boolean a() {
                return true;
            }

            @Override // com.vk.auth.main.c.a
            public final void b() {
                String str;
                VerificationScreenData verificationScreenData = this.b;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = verificationScreenData.f;
                if (vkAuthValidatePhoneResult == null || (str = vkAuthValidatePhoneResult.r) == null) {
                    str = this.g.L;
                }
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                wfn0 e = vdx0Var.e();
                String str2 = this.e;
                this.f.a(e.z(str2, str), verificationScreenData.b, str2, str);
            }
        }

        /* compiled from: PhoneConfirmedStrategy.kt */
        /* renamed from: com.vk.auth.main.c$a$c, reason: collision with other inner class name */
        public static final class C0405c extends a {
            @Override // com.vk.auth.main.c.a
            public final boolean a() {
                return this.d != null;
            }

            @Override // com.vk.auth.main.c.a
            public final void b() {
                VerificationScreenData verificationScreenData = this.b;
                this.h.b1(new FullscreenPasswordData(verificationScreenData.b, verificationScreenData instanceof VerificationScreenData.Phone, verificationScreenData.d, false, null, false, 48, null));
            }
        }

        /* compiled from: PhoneConfirmedStrategy.kt */
        public static final class d extends a {
            @Override // com.vk.auth.main.c.a
            public final boolean a() {
                return true;
            }

            @Override // com.vk.auth.main.c.a
            public final void b() {
                this.a.j(SignUpRouter.DataScreen.PHONE, this.f);
            }
        }

        /* compiled from: PhoneConfirmedStrategy.kt */
        public static final class e extends a {
            @Override // com.vk.auth.main.c.a
            public final boolean a() {
                return this.d != null;
            }

            @Override // com.vk.auth.main.c.a
            public final void b() {
                c(false);
            }
        }

        /* compiled from: PhoneConfirmedStrategy.kt */
        public static final class f extends a {
            @Override // com.vk.auth.main.c.a
            public final boolean a() {
                return this.d != null;
            }

            @Override // com.vk.auth.main.c.a
            public final void b() {
                c(true);
            }
        }

        public a(e3a0 e3a0Var, c cVar) {
            this.a = cVar;
            this.b = e3a0Var.a;
            this.c = e3a0Var.c;
            this.d = e3a0Var.d;
            this.e = e3a0Var.e;
            this.f = e3a0Var.f;
            this.g = cVar.b;
            this.h = cVar.c;
            this.i = e3a0Var.h;
            this.j = e3a0Var.i;
        }

        public abstract boolean a();

        public abstract void b();

        public final void c(boolean z) {
            this.h.t(new VkExistingProfileScreenData(this.b.b, this.d, z, this.e, this.c, this.i, null, null, this.j, 128, null));
        }
    }

    public c(DefaultAuthActivity defaultAuthActivity, SignUpDataHolder signUpDataHolder, SignUpRouter signUpRouter, i iVar) {
        super(defaultAuthActivity, signUpDataHolder, signUpRouter, iVar);
    }

    public final void n(e3a0 e3a0Var) {
        a c0404a;
        PasswordScreen passwordScreen = e3a0Var.b;
        NextStep nextStep = e3a0Var.g;
        switch (d.$EnumSwitchMapping$0[nextStep.ordinal()]) {
            case 1:
                c0404a = new a.C0404a(e3a0Var, this);
                break;
            case 2:
                c0404a = new a.d(e3a0Var, this);
                break;
            case 3:
            case 4:
                if (nextStep != NextStep.SHOW_WITHOUT_PASSWORD && passwordScreen != PasswordScreen.HIDE) {
                    c0404a = new a.f(e3a0Var, this);
                    break;
                } else {
                    c0404a = new a.e(e3a0Var, this);
                    break;
                }
            case 5:
                if (passwordScreen != PasswordScreen.HIDE) {
                    c0404a = new a.C0405c(e3a0Var, this);
                    break;
                } else {
                    c0404a = new a.e(e3a0Var, this);
                    break;
                }
            case 6:
                c0404a = new a.b(e3a0Var, this);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (c0404a.a()) {
            c0404a.b();
            return;
        }
        c0404a.a.j(SignUpRouter.DataScreen.PHONE, c0404a.f);
    }
}
