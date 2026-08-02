package com.vk.auth.main;

import android.net.Uri;
import com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.entername.RequiredNameType;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.auth.screendata.ConsciousRegistrationScreenData;
import com.vk.auth.screendata.EnterProfileScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.screendata.VkExistingProfileScreenData;
import com.vk.auth.signup.VkAdditionalSignUpData;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthProfileInfo;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.NextStep;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import com.vk.superapp.core.api.models.VkGender;
import com.vk.superapp.multiaccount.api.SimpleDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e3a0;
import xsna.e43;
import xsna.emj0;
import xsna.g5g;
import xsna.icu0;
import xsna.j5g;
import xsna.l55;
import xsna.pbu0;
import xsna.r55;
import xsna.u1j0;
import xsna.vbu0;

/* compiled from: SignUpStrategy.kt */
/* loaded from: classes.dex */
public class e {
    public final DefaultAuthActivity a;
    public final SignUpDataHolder b;
    public final SignUpRouter c;
    public final i d;
    public final List<SignUpRouter.DataScreen> e;

    /* compiled from: SignUpStrategy.kt */
    public static final class a {
        public static final boolean a(List list, SignUpRouter.DataScreen dataScreen) {
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (dataScreen.h().contains((SignUpField) it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: SignUpStrategy.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignUpRouter.DataScreen.values().length];
            try {
                iArr[SignUpRouter.DataScreen.AGREEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignUpRouter.DataScreen.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignUpRouter.DataScreen.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SignUpRouter.DataScreen.PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SignUpRouter.DataScreen.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e(DefaultAuthActivity defaultAuthActivity, SignUpDataHolder signUpDataHolder, SignUpRouter signUpRouter, i iVar) {
        this.a = defaultAuthActivity;
        this.b = signUpDataHolder;
        this.c = signUpRouter;
        this.d = iVar;
        this.e = iVar.a;
    }

    public final void a() {
        SignUpRouter.DataScreen dataScreen = SignUpRouter.DataScreen.PHONE;
        List<SignUpRouter.DataScreen> list = this.e;
        int indexOf = list.indexOf(dataScreen);
        int h = e43.h(list);
        SignUpDataHolder signUpDataHolder = this.b;
        if (indexOf <= h) {
            while (true) {
                SignUpRouter.DataScreen dataScreen2 = list.get(indexOf);
                g5g.F(dataScreen2.h(), signUpDataHolder.t);
                if (indexOf == h) {
                    break;
                } else {
                    indexOf++;
                }
            }
        }
        signUpDataHolder.v = false;
    }

    public final void b(SignUpDataHolder signUpDataHolder, pbu0 pbu0Var) {
        l55 l55Var = l55.a;
        Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
        String str = signUpDataHolder.o;
        String str2 = signUpDataHolder.c;
        if (str2 == null && (str2 = signUpDataHolder.e) == null) {
            str2 = "";
        }
        pbu0Var.b(l55.c(l55Var, this.a, VkAuthState.a.c(str, str2, true, signUpDataHolder.F), signUpDataHolder.I, 4));
    }

    public final void c(SignUpDataHolder signUpDataHolder, pbu0 pbu0Var) {
        String str = signUpDataHolder.o;
        String str2 = signUpDataHolder.c;
        String str3 = signUpDataHolder.n;
        Uri uri = signUpDataHolder.h;
        SimpleDate simpleDate = signUpDataHolder.m;
        String simpleDate2 = simpleDate != null ? simpleDate.toString() : null;
        boolean z = signUpDataHolder.v;
        boolean z2 = signUpDataHolder.D;
        boolean z3 = signUpDataHolder.F;
        VkAuthMetaInfo zb = !z ? VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.REGISTRATION, null, null, 55) : signUpDataHolder.I;
        signUpDataHolder.I = zb;
        boolean z4 = signUpDataHolder.f;
        String str4 = signUpDataHolder.A;
        r55 r55Var = r55.a;
        pbu0Var.c(str, new SignUpData(signUpDataHolder.c, signUpDataHolder.l, signUpDataHolder.m, signUpDataHolder.h), r55.e().b().L(new u1j0(new emj0(signUpDataHolder, simpleDate2, str2, str, str3, z, z2, r55.h(), z4, str4, r55.c(), z3, this, zb, uri), 2), false));
    }

    public final void d() {
        a();
        SignUpDataHolder signUpDataHolder = this.b;
        SignUpRouter.a.a(this.c, signUpDataHolder.G ? signUpDataHolder.o : null, null, null, null, 14);
    }

    public final void e(VkAdditionalSignUpData vkAdditionalSignUpData, pbu0 pbu0Var) {
        List<SignUpField> list = vkAdditionalSignUpData.b;
        SignUpDataHolder signUpDataHolder = this.b;
        signUpDataHolder.q = list;
        signUpDataHolder.r = vkAdditionalSignUpData.c;
        signUpDataHolder.o = vkAdditionalSignUpData.d;
        signUpDataHolder.v = true;
        signUpDataHolder.w = vkAdditionalSignUpData.e;
        signUpDataHolder.D = vkAdditionalSignUpData.g;
        signUpDataHolder.E = vkAdditionalSignUpData.h;
        if (i()) {
            return;
        }
        k((SignUpField) j5g.b0(0, signUpDataHolder.d()), pbu0Var);
    }

    public final void f(VerificationScreenData verificationScreenData, vbu0 vbu0Var, pbu0 pbu0Var, AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay) {
        a();
        VerificationScreenData.Phone phone = verificationScreenData instanceof VerificationScreenData.Phone ? (VerificationScreenData.Phone) verificationScreenData : null;
        String str = phone != null ? phone.b : null;
        SignUpDataHolder signUpDataHolder = this.b;
        signUpDataHolder.c = str;
        signUpDataHolder.o = vbu0Var.j();
        signUpDataHolder.q = vbu0Var.k();
        signUpDataHolder.r = vbu0Var.n();
        signUpDataHolder.x = vbu0Var.h();
        signUpDataHolder.f = verificationScreenData.h;
        signUpDataHolder.J = vbu0Var.m();
        signUpDataHolder.B = vbu0Var.g();
        SignUpIncompleteFieldsModel l = vbu0Var.l();
        if (l != null) {
            signUpDataHolder.w = l;
            signUpDataHolder.u = l.Ab();
        }
        VkAuthProfileInfo e = vbu0Var.e();
        if (e != null) {
            vbu0Var.p();
        }
        SignUpRouter signUpRouter = this.c;
        signUpRouter.getClass();
        if (vbu0Var.i()) {
            g(vbu0Var.f());
            return;
        }
        NextStep c = vbu0Var.c();
        boolean z = signUpDataHolder.f;
        DefaultAuthActivity defaultAuthActivity = this.a;
        i iVar = this.d;
        if ((z && c != null) || c == NextStep.REGISTRATION) {
            new c(defaultAuthActivity, signUpDataHolder, signUpRouter, iVar).n(new e3a0(verificationScreenData, vbu0Var.d(), vbu0Var.b(), vbu0Var.e(), vbu0Var.j(), pbu0Var, c, vbu0Var.f(), afterPhoneReuseVerificationWay));
            return;
        }
        if (e == null) {
            iVar.getClass();
        }
        if (e == null) {
            j(SignUpRouter.DataScreen.PHONE, pbu0Var);
            return;
        }
        boolean b2 = vbu0Var.b();
        boolean z2 = verificationScreenData.g && b2;
        if (z2 || vbu0Var.p()) {
            Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
            pbu0Var.b(l55.c(l55.a, defaultAuthActivity, VkAuthState.a.c(vbu0Var.j(), verificationScreenData.b, z2, false), icu0.a(signUpDataHolder.I, afterPhoneReuseVerificationWay), 4));
            return;
        }
        String str2 = verificationScreenData.b;
        boolean a2 = vbu0Var.a();
        String j = vbu0Var.j();
        AuthValidateRegistrationConfirmTextsDto f = vbu0Var.f();
        VkExistingProfileScreenData.SignUpRestrictedReason a3 = VkExistingProfileScreenData.a.a(vbu0Var.o());
        SignUpIncompleteFieldsModel l2 = vbu0Var.l();
        signUpRouter.t(new VkExistingProfileScreenData(str2, e, a2, j, b2, f, a3, l2 != null ? l2.zb() : null, afterPhoneReuseVerificationWay));
    }

    public final void g(AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto) {
        ConsciousRegistrationScreenData consciousRegistrationScreenData = null;
        String title = authValidateRegistrationConfirmTextsDto != null ? authValidateRegistrationConfirmTextsDto.getTitle() : null;
        String d = authValidateRegistrationConfirmTextsDto != null ? authValidateRegistrationConfirmTextsDto.d() : null;
        if (title != null && d != null) {
            consciousRegistrationScreenData = new ConsciousRegistrationScreenData(title, d);
        }
        this.c.d(consciousRegistrationScreenData);
    }

    public final void h() {
        SignUpDataHolder signUpDataHolder = this.b;
        List<? extends SignUpField> list = signUpDataHolder.q;
        boolean z = signUpDataHolder.v;
        RequiredNameType.Companion.getClass();
        this.c.m(new EnterProfileScreenData(RequiredNameType.a.a(list), list.contains(SignUpField.GENDER), list.contains(SignUpField.BIRTHDAY), z, signUpDataHolder.u));
    }

    public final boolean i() {
        Object obj;
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m((SignUpRouter.DataScreen) obj)) {
                break;
            }
        }
        return obj != null;
    }

    public final void j(SignUpRouter.DataScreen dataScreen, pbu0 pbu0Var) {
        List<SignUpRouter.DataScreen> list = this.e;
        int indexOf = list.indexOf(dataScreen);
        if (indexOf == -1 || indexOf == e43.h(list)) {
            k((SignUpField) j5g.b0(0, this.b.d()), pbu0Var);
            return;
        }
        SignUpRouter.DataScreen dataScreen2 = list.get(indexOf + 1);
        if (m(dataScreen2)) {
            return;
        }
        j(dataScreen2, pbu0Var);
    }

    public final void k(SignUpField signUpField, pbu0 pbu0Var) {
        SignUpAgreementInfo signUpAgreementInfo;
        SignUpDataHolder signUpDataHolder = this.b;
        if (signUpField == null) {
            if (!signUpDataHolder.v || (signUpAgreementInfo = signUpDataHolder.E) == null || signUpAgreementInfo.d() || !signUpDataHolder.q.isEmpty()) {
                c(signUpDataHolder, pbu0Var);
                return;
            } else {
                b(signUpDataHolder, pbu0Var);
                return;
            }
        }
        if (SignUpRouter.DataScreen.NAME.h().contains(signUpField)) {
            h();
            return;
        }
        boolean contains = SignUpRouter.DataScreen.PASSWORD.h().contains(signUpField);
        SignUpRouter signUpRouter = this.c;
        if (contains) {
            signUpRouter.p(signUpDataHolder.v);
            return;
        }
        SignUpRouter.DataScreen dataScreen = SignUpRouter.DataScreen.EMAIL;
        if (dataScreen.h().contains(signUpField)) {
            signUpRouter.R0(a.a(signUpDataHolder.r, dataScreen));
        } else {
            c(signUpDataHolder, pbu0Var);
        }
    }

    public final void l() {
        List<? extends SignUpField> list;
        List<? extends SignUpField> list2;
        List list3;
        SignUpDataHolder signUpDataHolder = this.b;
        signUpDataHolder.b = null;
        signUpDataHolder.c = null;
        signUpDataHolder.d = null;
        signUpDataHolder.e = null;
        signUpDataHolder.h = null;
        signUpDataHolder.i = null;
        signUpDataHolder.j = null;
        signUpDataHolder.l = VkGender.UNDEFINED;
        signUpDataHolder.m = null;
        signUpDataHolder.n = null;
        signUpDataHolder.o = null;
        signUpDataHolder.p = null;
        signUpDataHolder.B = null;
        if (signUpDataHolder.f) {
            SignUpField.Companion.getClass();
            list3 = SignUpField.DEFAULT;
            ArrayList arrayList = new ArrayList(list3);
            arrayList.remove(SignUpField.PASSWORD);
            list2 = arrayList;
        } else {
            SignUpField.Companion.getClass();
            list = SignUpField.DEFAULT;
            list2 = list;
        }
        signUpDataHolder.q = list2;
        signUpDataHolder.r = EmptyList.b;
        signUpDataHolder.t.clear();
        signUpDataHolder.s.clear();
        signUpDataHolder.v = false;
        signUpDataHolder.w = null;
        signUpDataHolder.x = null;
        signUpDataHolder.y = null;
        signUpDataHolder.J = null;
        signUpDataHolder.z = false;
        signUpDataHolder.L = null;
        r55 r55Var = r55.a;
        r55.e().d(VkClientLibverifyInfo.Service.REGISTRATION);
        if (i()) {
            return;
        }
        SignUpRouter.a.a(this.c, null, null, null, null, 15);
    }

    public final boolean m(SignUpRouter.DataScreen dataScreen) {
        SignUpDataHolder signUpDataHolder = this.b;
        List<SignUpField> d = signUpDataHolder.d();
        int i = b.$EnumSwitchMapping$0[dataScreen.ordinal()];
        SignUpRouter signUpRouter = this.c;
        if (i == 1) {
            SignUpAgreementInfo signUpAgreementInfo = signUpDataHolder.E;
            if (signUpAgreementInfo == null || !signUpAgreementInfo.e()) {
                return false;
            }
            signUpRouter.e1(signUpAgreementInfo);
            return true;
        }
        if (i == 2) {
            if (signUpDataHolder.v || signUpDataHolder.c != null) {
                return false;
            }
            SignUpRouter.a.a(this.c, null, null, null, null, 15);
            return true;
        }
        if (i == 3) {
            if (!a.a(d, SignUpRouter.DataScreen.NAME)) {
                return false;
            }
            h();
            return true;
        }
        if (i == 4) {
            if (!a.a(d, SignUpRouter.DataScreen.PASSWORD)) {
                return false;
            }
            signUpRouter.p(signUpDataHolder.v);
            return true;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        SignUpRouter.DataScreen dataScreen2 = SignUpRouter.DataScreen.EMAIL;
        if (!a.a(d, dataScreen2)) {
            return false;
        }
        signUpRouter.R0(a.a(signUpDataHolder.r, dataScreen2));
        return true;
    }
}
