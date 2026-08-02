package com.vk.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.VkExtendTokenData;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpData;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.main.a;
import com.vk.auth.main.b;
import com.vk.auth.oauth.VkOAuthGoal;
import com.vk.auth.oauth.VkOAuthRouterInfo;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.auth.screendata.DefaultFirstScreenData;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.MultiAccountData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.signup.VkAdditionalSignUpData;
import com.vk.auth.smartflow.ValidateAccountRoutingData;
import com.vk.auth.ui.checkaccess.PasswordCheckInitStructure;
import com.vk.auth.utils.VkPassportPage;
import com.vk.auth.validation.VkBanRouterInfo;
import com.vk.auth.validation.VkPassportRouterInfo;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.auth.validation.VkValidateRouterInfo;
import com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent;
import com.vk.auth.validation.fullscreen.success.PhoneValidationSuccessFragment;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.checkaccess.VkCheckAccessRequiredData;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.odnoklassniki.registration.data.StartOkMimicryRegData;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatFlowType;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.dto.auth.AuthPayload;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.whitelabelauth.di.data.WhiteLabelAuthData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aeg0;
import xsna.af2;
import xsna.arf0;
import xsna.asp;
import xsna.c2r0;
import xsna.c7v0;
import xsna.dhr0;
import xsna.e370;
import xsna.ea3;
import xsna.epx;
import xsna.ezf;
import xsna.fnj;
import xsna.frf0;
import xsna.g5z;
import xsna.g71;
import xsna.gfx0;
import xsna.gzs;
import xsna.i13;
import xsna.iah0;
import xsna.izs;
import xsna.j1;
import xsna.j5g;
import xsna.jq0;
import xsna.knf;
import xsna.krv0;
import xsna.m63;
import xsna.msy;
import xsna.myc0;
import xsna.oou0;
import xsna.ozl;
import xsna.p4g;
import xsna.par0;
import xsna.pbu0;
import xsna.q55;
import xsna.qro0;
import xsna.r1d0;
import xsna.r55;
import xsna.rdk;
import xsna.s25;
import xsna.s3q0;
import xsna.sd9;
import xsna.sv1;
import xsna.t25;
import xsna.t6v0;
import xsna.tb0;
import xsna.tdk;
import xsna.tgn0;
import xsna.umu0;
import xsna.v3a0;
import xsna.w3a0;
import xsna.wqf;
import xsna.wze;
import xsna.xwu0;
import xsna.yxu;
import xsna.z1h0;
import xsna.z3a0;
import xsna.zrp;

/* compiled from: DefaultAuthActivity.kt */
/* loaded from: classes.dex */
public class DefaultAuthActivity extends VkSdkActivity implements aeg0 {
    public static DefaultAuthActivity U;
    public PasswordCheckInitStructure A;
    public VerificationScreenData.Email B;
    public RestoreReason C;
    public ArrayList D;
    public WhiteLabelAuthData E;
    public StartOkMimicryRegData F;
    public boolean G;
    public ValidateAccountRoutingData H;
    public ArrayList I;
    public CreateVkEmailRequiredData J;
    public Integer K;
    public MultiAccountData L;
    public AuthPayload M;
    public AuthResult N;
    public com.vk.auth.a P;
    public boolean R;
    public boolean S;
    public boolean T;
    public com.vk.auth.main.a g;
    public t25.a h;
    public boolean k;
    public boolean l;
    public String m;
    public String n;
    public VkValidateRouterInfo o;
    public PhoneValidationContract$ValidationDialogMetaInfo p;
    public boolean q;
    public VkAdditionalSignUpData r;
    public VkPassportRouterInfo s;
    public VkBanRouterInfo t;
    public VkExtendTokenData u;
    public VkOAuthRouterInfo v;
    public c7v0 w;
    public VkValidatePhoneRouterInfo y;
    public VkCheckAccessRequiredData z;
    public final ArrayList f = new ArrayList();
    public final c i = new c();
    public final i j = new i();
    public final Object x = msy.a(LazyThreadSafetyMode.NONE, new knf(3));
    public final rdk O = new rdk(this);
    public final io.reactivex.rxjava3.disposables.b Q = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: DefaultAuthActivity.kt */
    /* loaded from: classes15.dex */
    public static final class BottomSheetActivity extends DefaultAuthActivity {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DefaultAuthActivity.kt */
    public static final class IntentSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IntentSource[] $VALUES;
        public static final IntentSource ON_CREATE;
        public static final IntentSource ON_NEW_INTENT;

        static {
            IntentSource intentSource = new IntentSource("ON_CREATE", 0);
            ON_CREATE = intentSource;
            IntentSource intentSource2 = new IntentSource("ON_NEW_INTENT", 1);
            ON_NEW_INTENT = intentSource2;
            IntentSource[] intentSourceArr = {intentSource, intentSource2};
            $VALUES = intentSourceArr;
            $ENTRIES = new asp(intentSourceArr);
        }

        public IntentSource() {
            throw null;
        }

        public static IntentSource valueOf(String str) {
            return (IntentSource) Enum.valueOf(IntentSource.class, str);
        }

        public static IntentSource[] values() {
            return (IntentSource[]) $VALUES.clone();
        }
    }

    /* compiled from: DefaultAuthActivity.kt */
    public static abstract class a {

        /* compiled from: DefaultAuthActivity.kt */
        /* renamed from: com.vk.auth.DefaultAuthActivity$a$a, reason: collision with other inner class name */
        public static final class C0398a extends a {
            public static final C0398a a = new C0398a();
        }

        /* compiled from: DefaultAuthActivity.kt */
        public static final class b extends a {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }
        }
    }

    /* compiled from: DefaultAuthActivity.kt */
    public static final class b {
        public static void a(Intent intent) {
            intent.putExtra("closeOnEmptyBackStack", true);
        }
    }

    /* compiled from: DefaultAuthActivity.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<s25, s3q0> {
        public static final d b = new d(1, s25.class, "onAdditionalSignUpError", "onAdditionalSignUpError()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(s25 s25Var) {
            s25Var.u();
            return s3q0.a;
        }
    }

    /* compiled from: DefaultAuthActivity.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<s25, s3q0> {
        public static final e b = new e(1, s25.class, "onRestoreDeactivatedUserError", "onRestoreDeactivatedUserError()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(s25 s25Var) {
            s25Var.p();
            return s3q0.a;
        }
    }

    /* compiled from: DefaultAuthActivity.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<s25, s3q0> {
        public static final f b = new f(1, s25.class, "onRestoreBannedUserError", "onRestoreBannedUserError()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(s25 s25Var) {
            s25Var.o();
            return s3q0.a;
        }
    }

    /* compiled from: DefaultAuthActivity.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<s25, s3q0> {
        public static final g b = new g(1, s25.class, "onEmailSignUpError", "onEmailSignUpError()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(s25 s25Var) {
            s25Var.A();
            return s3q0.a;
        }
    }

    /* compiled from: DefaultAuthActivity.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<s25, s3q0> {
        public static final h b = new h(1, s25.class, "onValidatePhoneError", "onValidatePhoneError()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(s25 s25Var) {
            s25Var.t();
            return s3q0.a;
        }
    }

    /* compiled from: DefaultAuthActivity.kt */
    public static final class i implements z3a0 {
        public i() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
        
            if (r1.d() != com.vk.auth.validation.VkPhoneValidationErrorReason.UNLINK) goto L15;
         */
        @Override // xsna.z3a0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(PhoneValidationPendingEvent phoneValidationPendingEvent) {
            DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.this;
            if (defaultAuthActivity.p != null || defaultAuthActivity.o != null) {
                if (!(phoneValidationPendingEvent instanceof PhoneValidationPendingEvent.Success)) {
                    if (phoneValidationPendingEvent instanceof PhoneValidationPendingEvent.Error) {
                        PhoneValidationPendingEvent.Error error = (PhoneValidationPendingEvent.Error) phoneValidationPendingEvent;
                        if (error.d() != VkPhoneValidationErrorReason.LOGOUT) {
                        }
                    }
                }
                com.vk.auth.a aVar = defaultAuthActivity.P;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.getClass();
                par0.a.getClass();
                par0.a("[AuthScreenOpenerDelegate] open success verification, " + phoneValidationPendingEvent);
                aVar.b.b.h1(phoneValidationPendingEvent);
                return;
            }
            phoneValidationPendingEvent.n4();
        }
    }

    @Override // xsna.aeg0
    public final void Li(tb0 tb0Var) {
        if (tb0Var != null) {
            this.f.add(tb0Var);
        }
    }

    public a O1(Intent intent, IntentSource intentSource) {
        return a.C0398a.a;
    }

    public com.vk.auth.main.a Q1(a.C0403a c0403a) {
        DefaultAuthActivity defaultAuthActivity = c0403a.a;
        SignUpDataHolder signUpDataHolder = c0403a.c;
        com.vk.auth.c cVar = c0403a.b;
        com.vk.auth.main.e eVar = new com.vk.auth.main.e(defaultAuthActivity, signUpDataHolder, cVar != null ? cVar : null, c0403a.d);
        if (cVar == null) {
            cVar = null;
        }
        return new com.vk.auth.main.a(signUpDataHolder, cVar, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r1.getBoolean("openLoginPass", false) == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void R1(Intent intent) {
        boolean z;
        WhiteLabelAuthData whiteLabelAuthData;
        String str;
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            z = true;
        }
        z = false;
        this.l = z;
        this.m = intent != null ? intent.getStringExtra("reg_unauth_id") : null;
        this.n = intent != null ? intent.getStringExtra("key_invite_hash") : null;
        this.o = intent != null ? (VkValidateRouterInfo) intent.getParcelableExtra("validationData") : null;
        this.p = intent != null ? (PhoneValidationContract$ValidationDialogMetaInfo) intent.getParcelableExtra("validationPhoneOfferData") : null;
        this.r = intent != null ? (VkAdditionalSignUpData) intent.getParcelableExtra("additionalSignUpData") : null;
        this.s = intent != null ? (VkPassportRouterInfo) intent.getParcelableExtra("passportData") : null;
        this.t = intent != null ? (VkBanRouterInfo) intent.getParcelableExtra("banData") : null;
        this.v = intent != null ? (VkOAuthRouterInfo) intent.getParcelableExtra("oauthData") : null;
        this.u = intent != null ? (VkExtendTokenData) intent.getParcelableExtra("extendTokenData") : null;
        this.z = intent != null ? (VkCheckAccessRequiredData) intent.getParcelableExtra("validateAccessData") : null;
        this.A = intent != null ? (PasswordCheckInitStructure) intent.getParcelableExtra("checkUserActionData") : null;
        this.y = intent != null ? (VkValidatePhoneRouterInfo) intent.getParcelableExtra("validatePhoneData") : null;
        this.B = intent != null ? (VerificationScreenData.Email) intent.getParcelableExtra("validateEmailData") : null;
        this.D = intent != null ? intent.getParcelableArrayListExtra("trackingFieldsData") : null;
        this.J = intent != null ? (CreateVkEmailRequiredData) intent.getParcelableExtra("createVkEmailRequiredData") : null;
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("loginConfirmationData", 0)) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            valueOf = null;
        }
        this.K = valueOf;
        this.C = intent != null ? (RestoreReason) intent.getParcelableExtra("restoreReason") : null;
        this.R = intent != null ? intent.getBooleanExtra("closeOnEmptyBackStack", false) : false;
        this.L = intent != null ? (MultiAccountData) intent.getParcelableExtra("multiAccountData") : null;
        if (intent == null || (whiteLabelAuthData = (WhiteLabelAuthData) intent.getParcelableExtra("whiteLabelAuthData")) == null) {
            VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo = this.y;
            whiteLabelAuthData = (vkValidatePhoneRouterInfo == null || (str = vkValidatePhoneRouterInfo.c.k) == null) ? null : new WhiteLabelAuthData("", str);
        }
        this.E = whiteLabelAuthData;
        this.H = intent != null ? (ValidateAccountRoutingData) intent.getParcelableExtra("key_validate_account_data") : null;
        this.F = intent != null ? (StartOkMimicryRegData) intent.getParcelableExtra("key_ok_registration_data") : null;
        this.T = intent != null ? intent.getBooleanExtra("forRustoreQrAuth", false) : false;
        this.I = intent != null ? intent.getParcelableArrayListExtra("okHeadsAuthData") : null;
    }

    public final List<Pair<TrackingElement.Registration, gzs<String>>> T1() {
        z1h0 G = getSupportFragmentManager().G(R.id.vk_fragment_container);
        com.vk.registration.funnels.c cVar = G instanceof com.vk.registration.funnels.c ? (com.vk.registration.funnels.c) G : null;
        if (cVar != null) {
            return cVar.aa();
        }
        return null;
    }

    public int U1() {
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        gfx0 gfx0Var = e370.b;
        return tgn0Var.c(gfx0Var != null ? gfx0Var : null);
    }

    public void V1(Bundle bundle) {
        this.k = bundle != null ? bundle.getBoolean("isAuthCompleted", false) : false;
        this.q = bundle != null ? bundle.getBoolean("validationCompleted", false) : false;
        this.G = bundle != null ? bundle.getBoolean("is_cancel_result", false) : false;
        VkOAuthRouterInfo vkOAuthRouterInfo = this.v;
        if (vkOAuthRouterInfo != null) {
            this.w = new c7v0(this, vkOAuthRouterInfo);
        }
        c7v0 c7v0Var = this.w;
        if (c7v0Var != null) {
            c7v0Var.c(bundle);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.vk_fragment_container);
        setContentView(frameLayout);
    }

    public final void W1() {
        t25.a aVar = this.h;
        if (aVar != null) {
            aVar.onComplete();
        }
    }

    public void Y1() {
        Bundle bundle;
        MultiAccountEntryPoint m;
        final DefaultFirstScreenData defaultFirstScreenData = new DefaultFirstScreenData(this.l, this.m, this.n);
        MultiAccountData multiAccountData = this.L;
        final String d2 = (multiAccountData == null || (bundle = multiAccountData.d) == null || (m = sv1.m(bundle)) == null) ? null : m.d();
        com.vk.auth.a aVar = this.P;
        com.vk.auth.a aVar2 = aVar != null ? aVar : null;
        com.vk.auth.main.a aVar3 = aVar2.b;
        DefaultAuthActivity defaultAuthActivity = aVar2.a;
        if (defaultAuthActivity.isFinishing() || defaultAuthActivity.isDestroyed()) {
            return;
        }
        final SignUpRouter signUpRouter = aVar3.b;
        c2r0 j = r55.j();
        final AuthStatSender c2 = r55.c();
        if (!myc0.f(defaultFirstScreenData.d)) {
            aVar2.a(j, false, new izs(signUpRouter, c2, d2) { // from class: xsna.d65
                public final /* synthetic */ SignUpRouter c;
                public final /* synthetic */ String d;

                {
                    this.d = d2;
                }

                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    List list = (List) obj;
                    List list2 = list;
                    SignUpRouter signUpRouter2 = this.c;
                    if (list2 == null || list2.isEmpty()) {
                        par0.a.getClass();
                        par0.a("[AuthScreenOpenerDelegate] open landing");
                        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                        bVar.getClass();
                        frf0.h();
                        RegistrationElementsTracker.b.clear();
                        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.START, null, null, null, 30);
                        b.a.a(signUpRouter2, true, false, this.d, 2);
                    } else {
                        int size = list.size();
                        par0.a.getClass();
                        par0.a("[AuthScreenOpenerDelegate] open exchange users");
                        com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
                        bVar2.getClass();
                        frf0.h();
                        RegistrationElementsTracker.b.clear();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.ACCOUNTS_CNT, String.valueOf(size)));
                        com.vk.registration.funnels.b.z(bVar2, SchemeStatSak$EventScreen.START_PROCEED_AS, arrayList, null, null, 28);
                        signUpRouter2.M0();
                    }
                    DefaultFirstScreenData defaultFirstScreenData2 = DefaultFirstScreenData.this;
                    if (defaultFirstScreenData2.b) {
                        signUpRouter2.L0("");
                    }
                    String str = defaultFirstScreenData2.c;
                    if (str != null) {
                        com.vk.registration.funnels.b.a.getClass();
                        frf0.k(com.vk.registration.funnels.b.e(str));
                        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.WEB_REGISTRATION, null, null, null, null, null, null, 254);
                    }
                    return s3q0.a;
                }
            });
            return;
        }
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.s();
        RegistrationStatParamsFactory.a = RegistrationStatFlowType.AUTH_WITHOUT_PASSWORD;
        aVar3.a.f = true;
        aVar3.c.l();
    }

    public final void Z1() {
        CodeState c2;
        VkValidateRouterInfo vkValidateRouterInfo = this.o;
        PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo = this.p;
        VkAdditionalSignUpData vkAdditionalSignUpData = this.r;
        VkPassportRouterInfo vkPassportRouterInfo = this.s;
        VkBanRouterInfo vkBanRouterInfo = this.t;
        c7v0 c7v0Var = this.w;
        VkExtendTokenData vkExtendTokenData = this.u;
        VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo = this.y;
        VerificationScreenData.Email email = this.B;
        CreateVkEmailRequiredData createVkEmailRequiredData = this.J;
        Integer num = this.K;
        VkCheckAccessRequiredData vkCheckAccessRequiredData = this.z;
        PasswordCheckInitStructure passwordCheckInitStructure = this.A;
        RestoreReason restoreReason = this.C;
        MultiAccountData multiAccountData = this.L;
        WhiteLabelAuthData whiteLabelAuthData = this.E;
        ArrayList arrayList = this.I;
        ValidateAccountRoutingData validateAccountRoutingData = this.H;
        StartOkMimicryRegData startOkMimicryRegData = this.F;
        if (startOkMimicryRegData != null) {
            com.vk.auth.a aVar = this.P;
            if (aVar == null) {
                aVar = null;
            }
            aVar.b.b.o(startOkMimicryRegData.d(), startOkMimicryRegData.e());
            return;
        }
        if (this.l) {
            Y1();
            return;
        }
        if (vkValidateRouterInfo != null) {
            com.vk.auth.a aVar2 = this.P;
            if (aVar2 == null) {
                aVar2 = null;
            }
            aVar2.getClass();
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open validation, " + vkValidateRouterInfo);
            SignUpRouter signUpRouter = aVar2.b.b;
            if (vkValidateRouterInfo instanceof VkValidateRouterInfo.EnterPhone) {
                signUpRouter.K0(vkValidateRouterInfo.b, vkValidateRouterInfo.d);
                return;
            }
            if (!(vkValidateRouterInfo instanceof VkValidateRouterInfo.EnterSmsCode)) {
                throw new NoWhenBranchMatchedException();
            }
            String zb = ((VkValidateRouterInfo.EnterSmsCode) vkValidateRouterInfo).zb();
            String str = vkValidateRouterInfo.b;
            boolean z = vkValidateRouterInfo.d;
            c2 = ezf.c(vkValidateRouterInfo.e, new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null));
            signUpRouter.E0(null, zb, str, z, c2, vkValidateRouterInfo.c);
            return;
        }
        if (phoneValidationContract$ValidationDialogMetaInfo != null) {
            com.vk.auth.a aVar3 = this.P;
            if (aVar3 == null) {
                aVar3 = null;
            }
            aVar3.getClass();
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open verification ask number, " + phoneValidationContract$ValidationDialogMetaInfo);
            aVar3.b.b.D0(phoneValidationContract$ValidationDialogMetaInfo);
            return;
        }
        if (vkAdditionalSignUpData != null) {
            com.vk.auth.a aVar4 = this.P;
            if (aVar4 == null) {
                aVar4 = null;
            }
            aVar4.getClass();
            par0 par0Var = par0.a;
            String str2 = "[AuthScreenOpenerDelegate] open additional sign up, " + vkAdditionalSignUpData.b;
            par0Var.getClass();
            par0.a(str2);
            com.vk.auth.main.a aVar5 = aVar4.b;
            SignUpDataHolder signUpDataHolder = aVar5.a;
            VkAuthMetaInfo vkAuthMetaInfo = vkAdditionalSignUpData.f;
            signUpDataHolder.H = vkAuthMetaInfo;
            signUpDataHolder.I = vkAuthMetaInfo;
            aVar5.c.e(vkAdditionalSignUpData, pbu0.a.a);
            return;
        }
        if (vkPassportRouterInfo != null) {
            if (vkPassportRouterInfo.f == null) {
                com.vk.auth.a aVar6 = this.P;
                if (aVar6 == null) {
                    aVar6 = null;
                }
                aVar6.getClass();
                par0.a.getClass();
                par0.a("[AuthScreenOpenerDelegate] open passport");
                com.vk.auth.main.a aVar7 = aVar6.b;
                SignUpDataHolder signUpDataHolder2 = aVar7.a;
                VkAuthMetaInfo vkAuthMetaInfo2 = vkPassportRouterInfo.d;
                signUpDataHolder2.H = vkAuthMetaInfo2;
                signUpDataHolder2.I = vkAuthMetaInfo2;
                aVar7.b.Z0(vkPassportRouterInfo.b, vkPassportRouterInfo.c, vkPassportRouterInfo.e);
                return;
            }
            com.vk.auth.a aVar8 = this.P;
            if (aVar8 == null) {
                aVar8 = null;
            }
            aVar8.getClass();
            UtilityTokens utilityTokens = vkPassportRouterInfo.e;
            VkAuthCredentials vkAuthCredentials = vkPassportRouterInfo.c;
            String str3 = vkPassportRouterInfo.b;
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open passport page");
            com.vk.auth.main.a aVar9 = aVar8.b;
            SignUpDataHolder signUpDataHolder3 = aVar9.a;
            SignUpRouter signUpRouter2 = aVar9.b;
            VkAuthMetaInfo vkAuthMetaInfo3 = vkPassportRouterInfo.d;
            signUpDataHolder3.H = vkAuthMetaInfo3;
            signUpDataHolder3.I = vkAuthMetaInfo3;
            VkPassportPage vkPassportPage = vkPassportRouterInfo.f;
            if (vkPassportPage == null) {
                signUpRouter2.Z0(str3, vkAuthCredentials, utilityTokens);
                return;
            } else {
                signUpRouter2.a1(str3, vkAuthCredentials, vkPassportPage, utilityTokens);
                return;
            }
        }
        if (vkBanRouterInfo != null) {
            com.vk.auth.a aVar10 = this.P;
            if (aVar10 == null) {
                aVar10 = null;
            }
            aVar10.getClass();
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open banned page");
            com.vk.auth.main.a aVar11 = aVar10.b;
            SignUpDataHolder signUpDataHolder4 = aVar11.a;
            VkAuthMetaInfo vkAuthMetaInfo4 = vkBanRouterInfo.c;
            signUpDataHolder4.H = vkAuthMetaInfo4;
            signUpDataHolder4.I = vkAuthMetaInfo4;
            aVar11.b.g1(vkBanRouterInfo.b);
            return;
        }
        if (c7v0Var != null) {
            c7v0Var.h();
            return;
        }
        if (vkExtendTokenData != null) {
            com.vk.auth.a aVar12 = this.P;
            if (aVar12 == null) {
                aVar12 = null;
            }
            com.vk.auth.main.a aVar13 = aVar12.b;
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open extendToken, " + vkExtendTokenData);
            if (vkExtendTokenData.equals(VkExtendTokenData.EnterByLoginPassword.b)) {
                aVar13.b.L0("");
                return;
            } else {
                if (!vkExtendTokenData.equals(VkExtendTokenData.SignUp.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar13.a.C = true;
                SignUpRouter.a.a(aVar13.b, null, null, null, null, 15);
                return;
            }
        }
        if (vkCheckAccessRequiredData != null) {
            com.vk.auth.a aVar14 = this.P;
            if (aVar14 == null) {
                aVar14 = null;
            }
            aVar14.getClass();
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open validate access");
            aVar14.b.b.e(vkCheckAccessRequiredData);
            return;
        }
        if (passwordCheckInitStructure != null) {
            com.vk.auth.a aVar15 = this.P;
            if (aVar15 == null) {
                aVar15 = null;
            }
            aVar15.getClass();
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open password check");
            aVar15.b.b.u(passwordCheckInitStructure);
            return;
        }
        if (vkValidatePhoneRouterInfo != null) {
            com.vk.auth.a aVar16 = this.P;
            if (aVar16 == null) {
                aVar16 = null;
            }
            com.vk.auth.main.a aVar17 = aVar16.b;
            VkAuthMetaInfo vkAuthMetaInfo5 = vkValidatePhoneRouterInfo.f;
            VerificationScreenData verificationScreenData = vkValidatePhoneRouterInfo.c;
            par0 par0Var2 = par0.a;
            StringBuilder sb = new StringBuilder("[AuthScreenOpenerDelegate] open validate phone, libverify=");
            LibverifyScreenData libverifyScreenData = vkValidatePhoneRouterInfo.e;
            sb.append(libverifyScreenData != null);
            sb.append(", meta=");
            sb.append(vkAuthMetaInfo5);
            String sb2 = sb.toString();
            par0Var2.getClass();
            par0.a(sb2);
            VkAuthValidatePhoneResult vkAuthValidatePhoneResult = verificationScreenData.f;
            if (vkAuthValidatePhoneResult == null || vkAuthValidatePhoneResult.Bb() != VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_PASSKEY) {
                SignUpDataHolder signUpDataHolder5 = aVar17.a;
                signUpDataHolder5.H = vkAuthMetaInfo5;
                signUpDataHolder5.I = vkAuthMetaInfo5;
                signUpDataHolder5.y = vkValidatePhoneRouterInfo.g;
                signUpDataHolder5.z = true;
                SignUpRouter signUpRouter3 = aVar17.b;
                if (libverifyScreenData != null) {
                    signUpRouter3.i(libverifyScreenData);
                    return;
                } else {
                    SignUpRouter.a.b(signUpRouter3, verificationScreenData, false, 6);
                    return;
                }
            }
            par0.a("[AuthScreenOpenerDelegate] open passkey check");
            String str4 = verificationScreenData.b;
            String str5 = verificationScreenData.d;
            PasskeyAlternative.a aVar18 = PasskeyAlternative.Companion;
            boolean z2 = vkAuthValidatePhoneResult.Ab() == null;
            aVar18.getClass();
            PasskeyAlternative a2 = PasskeyAlternative.a.a(z2);
            PasskeyWebAuthScreen.a aVar19 = PasskeyWebAuthScreen.Companion;
            boolean z3 = vkAuthValidatePhoneResult.Ab() == null;
            aVar19.getClass();
            aVar17.b.I0(new PasskeyCheckInfo(str4, str5, a2, PasskeyWebAuthScreen.a.a(z3), verificationScreenData instanceof VerificationScreenData.Phone, false, 32, null));
            return;
        }
        if (createVkEmailRequiredData != null) {
            com.vk.auth.a aVar20 = this.P;
            if (aVar20 == null) {
                aVar20 = null;
            }
            aVar20.getClass();
            par0 par0Var3 = par0.a;
            String str6 = "[AuthScreenOpenerDelegate] open create vk email required, domains=" + j5g.g0(createVkEmailRequiredData.c, null, null, null, 0, null, 63) + ", domain=" + createVkEmailRequiredData.d + ", username=" + createVkEmailRequiredData.e + ", ads=" + createVkEmailRequiredData.f;
            par0Var3.getClass();
            par0.a(str6);
            com.vk.auth.main.a aVar21 = aVar20.b;
            SignUpDataHolder signUpDataHolder6 = aVar21.a;
            VkAuthMetaInfo vkAuthMetaInfo6 = createVkEmailRequiredData.g;
            signUpDataHolder6.H = vkAuthMetaInfo6;
            signUpDataHolder6.I = vkAuthMetaInfo6;
            aVar21.b.C0(createVkEmailRequiredData);
            return;
        }
        if (email != null) {
            com.vk.auth.a aVar22 = this.P;
            if (aVar22 == null) {
                aVar22 = null;
            }
            aVar22.getClass();
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open validate email");
            aVar22.b.b.h(email);
            return;
        }
        if (num != null) {
            com.vk.auth.a aVar23 = this.P;
            if (aVar23 == null) {
                aVar23 = null;
            }
            int intValue = num.intValue();
            aVar23.getClass();
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open login confirmation");
            aVar23.b.b.N0(intValue);
            return;
        }
        if (restoreReason != null) {
            com.vk.auth.a aVar24 = this.P;
            if (aVar24 == null) {
                aVar24 = null;
            }
            com.vk.auth.main.a aVar25 = aVar24.b;
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open restore");
            if (restoreReason instanceof RestoreReason.VkidMailRestore) {
                aVar25.a.B = ((RestoreReason.VkidMailRestore) restoreReason).i();
            }
            aVar25.b.S0(restoreReason);
            return;
        }
        if (multiAccountData != null) {
            MultiAccountEntryPoint m = sv1.m(multiAccountData.d);
            String d2 = m != null ? m.d() : null;
            com.vk.auth.a aVar26 = this.P;
            if (aVar26 == null) {
                aVar26 = null;
            }
            SignUpRouter signUpRouter4 = aVar26.b.b;
            c2r0 j = r55.j();
            RegistrationStatParamsFactory.b = RegistrationStatParamsFactory.AnalyticsFlowSource.MULTIACCOUNT.h();
            aVar26.a(j, true, new ea3(multiAccountData, aVar26, signUpRouter4, d2));
            return;
        }
        if (whiteLabelAuthData != null && whiteLabelAuthData.b.length() != 0) {
            com.vk.auth.a aVar27 = this.P;
            if (aVar27 == null) {
                aVar27 = null;
            }
            aVar27.getClass();
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open White Label Flow with SAT");
            aVar27.b.b.Y0(whiteLabelAuthData);
            return;
        }
        if (arrayList != null) {
            com.vk.auth.a aVar28 = this.P;
            if (aVar28 == null) {
                aVar28 = null;
            }
            aVar28.getClass();
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open OK Heads screen");
            aVar28.b.b.V0(arrayList);
            return;
        }
        if (validateAccountRoutingData == null) {
            if (!this.T) {
                Y1();
                return;
            }
            com.vk.auth.a aVar29 = this.P;
            if (aVar29 == null) {
                aVar29 = null;
            }
            aVar29.getClass();
            par0.a.getClass();
            par0.a("[AuthScreenOpenerDelegate] open rustore qr auth");
            aVar29.b.b.Q0();
            return;
        }
        com.vk.auth.a aVar30 = this.P;
        if (aVar30 == null) {
            aVar30 = null;
        }
        aVar30.getClass();
        g71 g71Var = new g71(new j1(aVar30, 7));
        yxu yxuVar = new yxu(aVar30.b.a);
        if (validateAccountRoutingData instanceof ValidateAccountRoutingData.Libverify) {
            ValidateAccountRoutingData.Libverify libverify = (ValidateAccountRoutingData.Libverify) validateAccountRoutingData;
            ValidateAccountRoutingData.Credentials d3 = libverify.d();
            if (d3 != null) {
                yxuVar.f(d3.d());
            } else {
                yxuVar.e();
            }
            g71Var.e(libverify.e(), null);
            return;
        }
        if (validateAccountRoutingData instanceof ValidateAccountRoutingData.NoPasswordFlowPassword) {
            ValidateAccountRoutingData.NoPasswordFlowPassword noPasswordFlowPassword = (ValidateAccountRoutingData.NoPasswordFlowPassword) validateAccountRoutingData;
            ValidateAccountRoutingData.Credentials d4 = noPasswordFlowPassword.d();
            if (d4 != null) {
                yxuVar.f(d4.d());
            } else {
                yxuVar.e();
            }
            g71Var.c(noPasswordFlowPassword.e(), null);
            return;
        }
        if (validateAccountRoutingData instanceof ValidateAccountRoutingData.Otp) {
            ValidateAccountRoutingData.Otp otp = (ValidateAccountRoutingData.Otp) validateAccountRoutingData;
            ValidateAccountRoutingData.Credentials d5 = otp.d();
            if (d5 != null) {
                yxuVar.f(d5.d());
            } else {
                yxuVar.e();
            }
            g71Var.d(otp.f(), otp.e(), null);
            return;
        }
        if (validateAccountRoutingData instanceof ValidateAccountRoutingData.Passkey) {
            g71Var.a(((ValidateAccountRoutingData.Passkey) validateAccountRoutingData).d());
            return;
        }
        if (!(validateAccountRoutingData instanceof ValidateAccountRoutingData.SmartflowPassword)) {
            throw new NoWhenBranchMatchedException();
        }
        ValidateAccountRoutingData.SmartflowPassword smartflowPassword = (ValidateAccountRoutingData.SmartflowPassword) validateAccountRoutingData;
        ValidateAccountRoutingData.Credentials d6 = smartflowPassword.d();
        if (d6 != null) {
            yxuVar.f(d6.d());
        } else {
            yxuVar.e();
        }
        g71Var.b(smartflowPassword.e(), null);
    }

    public void b2() {
        HashSet hashSet = iah0.a;
        if (fnj.d(this)) {
            return;
        }
        setRequestedOrientation(1);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.app.Activity
    public void finish() {
        boolean z;
        Object failure;
        VkValidateRouterInfo vkValidateRouterInfo = this.o;
        PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo = this.p;
        c7v0 c7v0Var = this.w;
        StartOkMimicryRegData startOkMimicryRegData = this.F;
        if (vkValidateRouterInfo != null) {
            z = this.q;
        } else if (phoneValidationContract$ValidationDialogMetaInfo != null) {
            z = this.q;
        } else if (c7v0Var != null) {
            z = c7v0Var.a(this.k);
        } else {
            if (this.s == null && this.t == null) {
                if (this.T) {
                    try {
                        q55 q55Var = q55.a;
                        Bundle bundle = q55.c().a.K;
                        failure = Boolean.valueOf(bundle != null && bundle.getBoolean("rustore_qr_auth_completed", false));
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Object obj = Boolean.FALSE;
                    if (failure instanceof Result.Failure) {
                        failure = obj;
                    }
                    z = ((Boolean) failure).booleanValue();
                } else if (startOkMimicryRegData == null) {
                    z = this.k;
                }
            }
            z = true;
        }
        Intent intent = new Intent();
        Boolean bool = null;
        if (z) {
            intent.putExtra("authPayload", this.M);
            intent.putExtra("authResult", this.N);
            intent.putExtra("ok_route_result", (Parcelable) null);
        }
        if (this.G) {
            c7v0.a.a(intent);
        }
        try {
            q55 q55Var2 = q55.a;
            Bundle bundle2 = q55.c().a.K;
            if (bundle2 != null) {
                bool = Boolean.valueOf(m63.g(bundle2));
            }
        } catch (Throwable unused) {
        }
        boolean z2 = epx.f(bool, Boolean.TRUE) || this.E != null;
        boolean z3 = vkValidateRouterInfo == null && this.r == null;
        setResult(z ? -1 : 0, intent);
        super.finish();
        if (vkValidateRouterInfo != null && !vkValidateRouterInfo.c && !this.q) {
            q55 q55Var3 = q55.a;
            List y0 = j5g.y0(q55.b);
            q55.b bVar = new q55.b(par0.a);
            p4g.a aVar = p4g.a;
            Iterator it = y0.iterator();
            while (it.hasNext()) {
                try {
                    ((s25) it.next()).v(VkPhoneValidationErrorReason.CANCEL_ROUTER);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th2) {
                    bVar.invoke(th2);
                }
            }
        } else if (this.r != null && !this.k) {
            q55 q55Var4 = q55.a;
            q55.b(d.b);
        } else if (this.s != null && !this.k) {
            q55 q55Var5 = q55.a;
            q55.b(e.b);
        } else if (this.t != null && !this.k) {
            q55 q55Var6 = q55.a;
            q55.b(f.b);
        } else if (this.J != null && !this.k) {
            q55 q55Var7 = q55.a;
            q55.b(g.b);
        } else if (this.y != null && !this.k) {
            q55 q55Var8 = q55.a;
            q55.b(h.b);
        } else if (z2 && !this.k && !this.S && z3) {
            q55 q55Var9 = q55.a;
            q55.b(new af2(this, 14));
        }
        if (c7v0Var != null) {
            c7v0Var.f(this.k);
        }
        r55 r55Var = r55.a;
        r55.e().c();
        if (this.m != null) {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            qro0.a(new i13(25));
        }
        if (this.v == null || !((Boolean) this.x.getValue()).booleanValue()) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
            frf0.h();
        }
        RegistrationStatParamsFactory.b = RegistrationStatParamsFactory.AnalyticsFlowSource.DEFAULT.h();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        super.onActivityResult(i2, i3, intent);
        if (isDestroyed()) {
            return;
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((tb0) it.next()).onActivityResult(i2, i3, intent);
        }
        rdk rdkVar = this.O;
        if (i2 == 13573) {
            rdkVar.a();
        }
        if (i3 == -1) {
            ((tdk) rdkVar.f.getValue()).f();
        } else {
            ((tdk) rdkVar.f.getValue()).e();
        }
        c7v0 c7v0Var = this.w;
        if (c7v0Var != null) {
            c7v0Var.b(i2, i3, intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @ozl
    public final void onBackPressed() {
        Object obj;
        Iterator<T> it = getSupportFragmentManager().c.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Fragment fragment = (Fragment) obj;
            if (fragment.isVisible() && !fragment.isHidden()) {
                break;
            }
        }
        Fragment fragment2 = (Fragment) obj;
        if ((fragment2 instanceof v3a0) || (fragment2 instanceof PhoneValidationSuccessFragment)) {
            return;
        }
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment G = supportFragmentManager.G(R.id.vk_fragment_container);
        com.vk.registration.funnels.c cVar = G instanceof com.vk.registration.funnels.c ? (com.vk.registration.funnels.c) G : null;
        ArrayList<SchemeStatSak$RegistrationFieldItem> c2 = com.vk.registration.funnels.a.c(cVar != null ? cVar.aa() : null);
        SchemeStatSak$EventScreen b2 = frf0.b(G);
        int K = supportFragmentManager.K();
        super.onBackPressed();
        s3q0 s3q0Var = s3q0.a;
        frf0.g(b2, K > 0 ? frf0.b(supportFragmentManager.G(R.id.vk_fragment_container)) : frf0.a.Ab(), c2, null, 8);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(75:60|(1:62)|63|(1:65)|66|67|68|(67:70|72|73|(63:75|77|78|(59:80|82|83|(55:85|86|87|88|(46:90|91|(1:93)|94|(1:96)|97|(1:99)(1:251)|(8:101|(1:103)|104|(1:106)|107|(1:109)|(1:111)|112)|113|(1:115)|116|(1:118)(1:250)|(7:120|(1:122)|123|(1:125)|126|(1:128)|129)|130|(6:132|(1:134)|135|(1:137)(1:140)|138|139)|141|(3:143|(1:145)|146)|147|(3:149|(1:151)|152)|153|(7:155|(1:157)|158|(1:160)|161|(1:163)(1:165)|164)|166|(5:168|(1:170)|171|(1:173)|174)|175|(5:179|(1:181)|182|(1:184)|185)|186|(1:188)(1:249)|189|(5:191|(1:193)|194|(1:196)|197)|198|(3:238|(1:248)(1:242)|(2:244|(1:246)(1:247)))|(5:205|(1:207)|208|(1:210)|211)|212|(1:214)|215|(1:217)(1:237)|218|(1:220)|221|(1:223)(1:236)|224|(1:226)(1:235)|227|(1:229)|230|(2:232|233)(1:234))|253|91|(0)|94|(0)|97|(0)(0)|(0)|113|(0)|116|(0)(0)|(0)|130|(0)|141|(0)|147|(0)|153|(0)|166|(0)|175|(6:177|179|(0)|182|(0)|185)|186|(0)(0)|189|(0)|198|(1:200)|238|(1:240)|248|(0)|(0)|212|(0)|215|(0)(0)|218|(0)|221|(0)(0)|224|(0)(0)|227|(0)|230|(0)(0))|256|86|87|88|(0)|253|91|(0)|94|(0)|97|(0)(0)|(0)|113|(0)|116|(0)(0)|(0)|130|(0)|141|(0)|147|(0)|153|(0)|166|(0)|175|(0)|186|(0)(0)|189|(0)|198|(0)|238|(0)|248|(0)|(0)|212|(0)|215|(0)(0)|218|(0)|221|(0)(0)|224|(0)(0)|227|(0)|230|(0)(0))|258|82|83|(0)|256|86|87|88|(0)|253|91|(0)|94|(0)|97|(0)(0)|(0)|113|(0)|116|(0)(0)|(0)|130|(0)|141|(0)|147|(0)|153|(0)|166|(0)|175|(0)|186|(0)(0)|189|(0)|198|(0)|238|(0)|248|(0)|(0)|212|(0)|215|(0)(0)|218|(0)|221|(0)(0)|224|(0)(0)|227|(0)|230|(0)(0))|260|77|78|(0)|258|82|83|(0)|256|86|87|88|(0)|253|91|(0)|94|(0)|97|(0)(0)|(0)|113|(0)|116|(0)(0)|(0)|130|(0)|141|(0)|147|(0)|153|(0)|166|(0)|175|(0)|186|(0)(0)|189|(0)|198|(0)|238|(0)|248|(0)|(0)|212|(0)|215|(0)(0)|218|(0)|221|(0)(0)|224|(0)(0)|227|(0)|230|(0)(0))|262|72|73|(0)|260|77|78|(0)|258|82|83|(0)|256|86|87|88|(0)|253|91|(0)|94|(0)|97|(0)(0)|(0)|113|(0)|116|(0)(0)|(0)|130|(0)|141|(0)|147|(0)|153|(0)|166|(0)|175|(0)|186|(0)(0)|189|(0)|198|(0)|238|(0)|248|(0)|(0)|212|(0)|215|(0)(0)|218|(0)|221|(0)(0)|224|(0)(0)|227|(0)|230|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011d A[Catch: all -> 0x0122, TRY_LEAVE, TryCatch #2 {all -> 0x0122, blocks: (B:73:0x0111, B:75:0x011d), top: B:72:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012f A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #3 {all -> 0x0134, blocks: (B:78:0x0123, B:80:0x012f), top: B:77:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0141 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:83:0x0135, B:85:0x0141), top: B:82:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158 A[Catch: all -> 0x0161, TRY_LEAVE, TryCatch #1 {all -> 0x0161, blocks: (B:88:0x014c, B:90:0x0158), top: B:87:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0182  */
    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int U1;
        String str;
        MailAuthFlowConfig mailAuthFlowConfig;
        SilentAuthSource silentAuthSource;
        Boolean bool;
        Boolean bool2;
        com.vk.auth.main.a aVar;
        com.vk.auth.main.a aVar2;
        Bundle bundle2;
        com.vk.auth.main.a aVar3;
        Bundle bundle3;
        VkOAuthRouterInfo vkOAuthRouterInfo;
        MultiAccountData multiAccountData;
        String str2;
        WhiteLabelAuthData whiteLabelAuthData;
        Intent intent;
        VkOAuthRouterInfo vkOAuthRouterInfo2;
        VkOAuthRouterInfo vkOAuthRouterInfo3;
        Bundle bundle4;
        VerificationScreenData verificationScreenData;
        com.vk.auth.main.a aVar4;
        oou0 oou0Var;
        xwu0.b bVar;
        Bundle bundle5;
        VkEmailForwardingConfig vkEmailForwardingConfig;
        com.vk.auth.main.a aVar5;
        SignUpDataHolder signUpDataHolder;
        Bundle bundle6;
        Bundle bundle7;
        Bundle bundle8;
        Bundle bundle9;
        Bundle bundle10;
        VkOAuthRouterInfo vkOAuthRouterInfo4;
        VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo;
        DefaultAuthActivity defaultAuthActivity;
        R1(getIntent());
        TypedValue typedValue = krv0.a;
        dhr0 dhr0Var = krv0.b;
        if (dhr0Var != null) {
            dhr0Var.k(this);
        }
        if (this.v != null) {
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.getClass();
            U1 = !dhr0.M() ? R.style.VkSuperappkit_Light_Transparent : R.style.VkSuperappkit_Dark_Transparent;
        } else if (this.F != null) {
            gfx0 gfx0Var2 = e370.b;
            if (gfx0Var2 == null) {
                gfx0Var2 = null;
            }
            gfx0Var2.getClass();
            U1 = !dhr0.M() ? R.style.VkSuperappkit_Ok_Light : R.style.VkSuperappkit_Ok_Dark;
        } else {
            U1 = U1();
        }
        setTheme(U1);
        if (this.v == null) {
            b2();
        }
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(18);
        }
        if (this.o == null && this.r == null && this.s == null && this.t == null && (((vkOAuthRouterInfo4 = this.v) == null || vkOAuthRouterInfo4.b == VkOAuthService.PASSKEY) && this.u == null && (((vkValidatePhoneRouterInfo = this.y) == null || vkValidatePhoneRouterInfo.b) && this.B == null && this.J == null && this.K == null && this.H == null && ((defaultAuthActivity = U) == null || !defaultAuthActivity.T)))) {
            if (defaultAuthActivity != null) {
                defaultAuthActivity.S = true;
            }
            if (defaultAuthActivity != null) {
                defaultAuthActivity.finish();
            }
        }
        U = this;
        Intent intent2 = getIntent();
        IntentSource intentSource = IntentSource.ON_CREATE;
        a.C0398a c0398a = a.C0398a.a;
        a O1 = O1(intent2, intentSource);
        if (O1 instanceof a.b) {
            super.onCreate(bundle);
            if (((a.b) O1).a) {
                finish();
                return;
            }
            return;
        }
        q55 q55Var = q55.a;
        q55.a(this.i);
        if (this.p != null) {
            ArrayList arrayList = w3a0.a;
            w3a0.a(this.j);
        }
        com.vk.auth.c cVar = new com.vk.auth.c(this, getSupportFragmentManager());
        a.C0403a c0403a = new a.C0403a(this, bundle);
        c0403a.b = cVar;
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        r1d0 r1d0Var = umu0Var.l;
        this.g = Q1(c0403a);
        try {
            bundle10 = q55.c().a.K;
        } catch (Throwable unused) {
        }
        if (bundle10 != null) {
            str = bundle10.getString("white_label_flow_input_sat");
            q55 q55Var2 = q55.a;
            bundle9 = q55.c().a.K;
            if (bundle9 != null) {
                mailAuthFlowConfig = m63.e(bundle9);
                q55 q55Var3 = q55.a;
                bundle8 = q55.c().a.K;
                if (bundle8 != null) {
                    silentAuthSource = m63.f(bundle8);
                    q55 q55Var4 = q55.a;
                    bundle7 = q55.c().a.K;
                    if (bundle7 != null) {
                        bool = Boolean.valueOf(bundle7.getBoolean("promo_ok"));
                        q55 q55Var5 = q55.a;
                        bundle6 = q55.c().a.K;
                        if (bundle6 != null) {
                            bool2 = Boolean.valueOf(bundle6.getBoolean("ok_mimicry_flow", false));
                            q55 q55Var6 = q55.a;
                            aVar = this.g;
                            if (aVar == null) {
                                aVar = null;
                            }
                            q55.d = aVar;
                            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                            frf0.c(this, bundle);
                            r55 r55Var = r55.a;
                            r55.c();
                            aVar2 = this.g;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            bundle2 = aVar2.a.K;
                            if ((bundle2 == null ? bundle2.getString("white_label_flow_input_sat") : null) == null) {
                                com.vk.auth.main.a aVar6 = this.g;
                                if (aVar6 == null) {
                                    aVar6 = null;
                                }
                                SignUpDataHolder signUpDataHolder2 = aVar6.a;
                                if (signUpDataHolder2.K == null) {
                                    signUpDataHolder2.K = new Bundle();
                                }
                                Bundle bundle11 = signUpDataHolder2.K;
                                bundle11.putString("white_label_flow_input_sat", str);
                                if (bool != null) {
                                    bundle11.putBoolean("promo_ok", bool.booleanValue());
                                }
                                if (bool2 != null) {
                                    bundle11.putBoolean("ok_mimicry_flow", bool2.booleanValue());
                                }
                                s3q0 s3q0Var = s3q0.a;
                            }
                            aVar3 = this.g;
                            if (aVar3 == null) {
                                aVar3 = null;
                            }
                            bundle3 = aVar3.a.K;
                            if ((bundle3 == null ? m63.e(bundle3) : null) == null) {
                                com.vk.auth.main.a aVar7 = this.g;
                                if (aVar7 == null) {
                                    aVar7 = null;
                                }
                                SignUpDataHolder signUpDataHolder3 = aVar7.a;
                                if (signUpDataHolder3.K == null) {
                                    signUpDataHolder3.K = new Bundle();
                                }
                                Bundle bundle12 = signUpDataHolder3.K;
                                bundle12.putParcelable("mail_flow", mailAuthFlowConfig);
                                if (silentAuthSource != null) {
                                    bundle12.putInt("mail_flow_silent_auth_source", silentAuthSource.ordinal());
                                }
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                            vkOAuthRouterInfo = this.v;
                            if (vkOAuthRouterInfo != null) {
                                com.vk.auth.main.a aVar8 = this.g;
                                if (aVar8 == null) {
                                    aVar8 = null;
                                }
                                SignUpDataHolder signUpDataHolder4 = aVar8.a;
                                String i2 = vkOAuthRouterInfo.b.i();
                                VkOAuthGoal vkOAuthGoal = vkOAuthRouterInfo.e;
                                VkAuthMetaInfo vkAuthMetaInfo = new VkAuthMetaInfo(null, i2, vkOAuthGoal, vkOAuthGoal == VkOAuthGoal.ADDITIONAL_OAUTH_AUTH ? SilentAuthSource.ADDITIONAL_OAUTH : SilentAuthSource.BY_OAUTH, null, null, 49, null);
                                signUpDataHolder4.H = vkAuthMetaInfo;
                                signUpDataHolder4.I = vkAuthMetaInfo;
                            }
                            multiAccountData = this.L;
                            if (multiAccountData != null) {
                                com.vk.auth.main.a aVar9 = this.g;
                                if (aVar9 == null) {
                                    aVar9 = null;
                                }
                                aVar9.a.K = multiAccountData.d;
                            }
                            str2 = this.n;
                            if (str2 != null) {
                                com.vk.auth.main.a aVar10 = this.g;
                                if (aVar10 == null) {
                                    aVar10 = null;
                                }
                                aVar10.a.A = str2;
                            }
                            whiteLabelAuthData = this.E;
                            if (whiteLabelAuthData != null) {
                                com.vk.auth.main.a aVar11 = this.g;
                                if (aVar11 == null) {
                                    aVar11 = null;
                                }
                                SignUpDataHolder signUpDataHolder5 = aVar11.a;
                                if (signUpDataHolder5.K == null) {
                                    signUpDataHolder5.K = new Bundle();
                                }
                                Bundle bundle13 = signUpDataHolder5.K;
                                bundle13.putString("white_label_flow_input_sat", whiteLabelAuthData.c);
                                bundle13.putBoolean("promo_ok", whiteLabelAuthData.b.length() == 0);
                                s3q0 s3q0Var3 = s3q0.a;
                            }
                            if (this.F != null) {
                                com.vk.auth.main.a aVar12 = this.g;
                                if (aVar12 == null) {
                                    aVar12 = null;
                                }
                                SignUpDataHolder signUpDataHolder6 = aVar12.a;
                                if (signUpDataHolder6.K == null) {
                                    signUpDataHolder6.K = new Bundle();
                                }
                                signUpDataHolder6.K.putBoolean("ok_mimicry_flow", true);
                                s3q0 s3q0Var4 = s3q0.a;
                            }
                            intent = getIntent();
                            if (intent != null && (vkEmailForwardingConfig = (VkEmailForwardingConfig) intent.getParcelableExtra("key_forwarding_email")) != null) {
                                aVar5 = this.g;
                                if (aVar5 == null) {
                                    aVar5 = null;
                                }
                                signUpDataHolder = aVar5.a;
                                if (signUpDataHolder.K == null) {
                                    signUpDataHolder.K = new Bundle();
                                }
                                signUpDataHolder.K.putParcelable("forwarding_email", vkEmailForwardingConfig);
                                s3q0 s3q0Var5 = s3q0.a;
                            }
                            vkOAuthRouterInfo2 = this.v;
                            if ((vkOAuthRouterInfo2 == null ? vkOAuthRouterInfo2.e : null) == VkOAuthGoal.ADDITIONAL_OAUTH_AUTH) {
                                com.vk.auth.main.a aVar13 = this.g;
                                if (aVar13 == null) {
                                    aVar13 = null;
                                }
                                SignUpDataHolder signUpDataHolder7 = aVar13.a;
                                if (signUpDataHolder7.K == null) {
                                    signUpDataHolder7.K = new Bundle();
                                }
                                sd9.r(signUpDataHolder7.K, SilentAuthSource.ADDITIONAL_OAUTH);
                                s3q0 s3q0Var6 = s3q0.a;
                            }
                            vkOAuthRouterInfo3 = this.v;
                            if (vkOAuthRouterInfo3 != null || (bundle5 = vkOAuthRouterInfo3.d) == null || (bundle4 = bundle5.getBundle("payload")) == null) {
                                VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo2 = this.y;
                                bundle4 = (vkValidatePhoneRouterInfo2 != null || (verificationScreenData = vkValidatePhoneRouterInfo2.c) == null) ? null : verificationScreenData.j;
                                if (bundle4 == null) {
                                    VerificationScreenData.Email email = this.B;
                                    bundle4 = email != null ? email.j : null;
                                }
                            }
                            if (bundle4 != null) {
                                com.vk.auth.main.a aVar14 = this.g;
                                if (aVar14 == null) {
                                    aVar14 = null;
                                }
                                SignUpDataHolder signUpDataHolder8 = aVar14.a;
                                if (signUpDataHolder8.K == null) {
                                    signUpDataHolder8.K = new Bundle();
                                }
                                m63.l(signUpDataHolder8.K, bundle4);
                                s3q0 s3q0Var7 = s3q0.a;
                            }
                            aVar4 = this.g;
                            if (aVar4 == null) {
                                aVar4 = null;
                            }
                            this.P = new com.vk.auth.a(this, aVar4);
                            super.onCreate(bundle);
                            V1(bundle);
                            rdk rdkVar = this.O;
                            rdkVar.getClass();
                            oou0Var = (oou0) r55.c.getValue();
                            if (oou0Var == null) {
                                DefaultAuthActivity defaultAuthActivity2 = rdkVar.a;
                                bVar = oou0Var.b(defaultAuthActivity2, g5z.a(defaultAuthActivity2));
                            } else {
                                bVar = null;
                            }
                            rdkVar.b = bVar;
                            rdk.g = bundle != null ? bundle.getBoolean("CredentialsActivitySaverDelegate_savingStarted") : false;
                            rdkVar.c = bundle == null ? (AuthResult) bundle.getParcelable("CredentialsActivitySaverDelegate_authResult") : null;
                            rdkVar.d = bundle == null ? bundle.getLong("CredentialsActivitySaverDelegate_userId") : 0L;
                            rdkVar.e = bundle != null ? (SignUpData) bundle.getParcelable("CredentialsActivitySaverDelegate_signUpData") : null;
                            if (bundle != null) {
                                Z1();
                                return;
                            }
                            return;
                        }
                        bool2 = null;
                        q55 q55Var62 = q55.a;
                        aVar = this.g;
                        if (aVar == null) {
                        }
                        q55.d = aVar;
                        RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                        frf0.c(this, bundle);
                        r55 r55Var2 = r55.a;
                        r55.c();
                        aVar2 = this.g;
                        if (aVar2 == null) {
                        }
                        bundle2 = aVar2.a.K;
                        if ((bundle2 == null ? bundle2.getString("white_label_flow_input_sat") : null) == null) {
                        }
                        aVar3 = this.g;
                        if (aVar3 == null) {
                        }
                        bundle3 = aVar3.a.K;
                        if ((bundle3 == null ? m63.e(bundle3) : null) == null) {
                        }
                        vkOAuthRouterInfo = this.v;
                        if (vkOAuthRouterInfo != null) {
                        }
                        multiAccountData = this.L;
                        if (multiAccountData != null) {
                        }
                        str2 = this.n;
                        if (str2 != null) {
                        }
                        whiteLabelAuthData = this.E;
                        if (whiteLabelAuthData != null) {
                        }
                        if (this.F != null) {
                        }
                        intent = getIntent();
                        if (intent != null) {
                            aVar5 = this.g;
                            if (aVar5 == null) {
                            }
                            signUpDataHolder = aVar5.a;
                            if (signUpDataHolder.K == null) {
                            }
                            signUpDataHolder.K.putParcelable("forwarding_email", vkEmailForwardingConfig);
                            s3q0 s3q0Var52 = s3q0.a;
                        }
                        vkOAuthRouterInfo2 = this.v;
                        if ((vkOAuthRouterInfo2 == null ? vkOAuthRouterInfo2.e : null) == VkOAuthGoal.ADDITIONAL_OAUTH_AUTH) {
                        }
                        vkOAuthRouterInfo3 = this.v;
                        if (vkOAuthRouterInfo3 != null) {
                        }
                        VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo22 = this.y;
                        if (vkValidatePhoneRouterInfo22 != null) {
                        }
                        if (bundle4 == null) {
                        }
                        if (bundle4 != null) {
                        }
                        aVar4 = this.g;
                        if (aVar4 == null) {
                        }
                        this.P = new com.vk.auth.a(this, aVar4);
                        super.onCreate(bundle);
                        V1(bundle);
                        rdk rdkVar2 = this.O;
                        rdkVar2.getClass();
                        oou0Var = (oou0) r55.c.getValue();
                        if (oou0Var == null) {
                        }
                        rdkVar2.b = bVar;
                        rdk.g = bundle != null ? bundle.getBoolean("CredentialsActivitySaverDelegate_savingStarted") : false;
                        rdkVar2.c = bundle == null ? (AuthResult) bundle.getParcelable("CredentialsActivitySaverDelegate_authResult") : null;
                        rdkVar2.d = bundle == null ? bundle.getLong("CredentialsActivitySaverDelegate_userId") : 0L;
                        rdkVar2.e = bundle != null ? (SignUpData) bundle.getParcelable("CredentialsActivitySaverDelegate_signUpData") : null;
                        if (bundle != null) {
                        }
                    }
                    bool = null;
                    q55 q55Var52 = q55.a;
                    bundle6 = q55.c().a.K;
                    if (bundle6 != null) {
                    }
                    bool2 = null;
                    q55 q55Var622 = q55.a;
                    aVar = this.g;
                    if (aVar == null) {
                    }
                    q55.d = aVar;
                    RegistrationFunnelScreenStack registrationFunnelScreenStack22 = frf0.a;
                    frf0.c(this, bundle);
                    r55 r55Var22 = r55.a;
                    r55.c();
                    aVar2 = this.g;
                    if (aVar2 == null) {
                    }
                    bundle2 = aVar2.a.K;
                    if ((bundle2 == null ? bundle2.getString("white_label_flow_input_sat") : null) == null) {
                    }
                    aVar3 = this.g;
                    if (aVar3 == null) {
                    }
                    bundle3 = aVar3.a.K;
                    if ((bundle3 == null ? m63.e(bundle3) : null) == null) {
                    }
                    vkOAuthRouterInfo = this.v;
                    if (vkOAuthRouterInfo != null) {
                    }
                    multiAccountData = this.L;
                    if (multiAccountData != null) {
                    }
                    str2 = this.n;
                    if (str2 != null) {
                    }
                    whiteLabelAuthData = this.E;
                    if (whiteLabelAuthData != null) {
                    }
                    if (this.F != null) {
                    }
                    intent = getIntent();
                    if (intent != null) {
                    }
                    vkOAuthRouterInfo2 = this.v;
                    if ((vkOAuthRouterInfo2 == null ? vkOAuthRouterInfo2.e : null) == VkOAuthGoal.ADDITIONAL_OAUTH_AUTH) {
                    }
                    vkOAuthRouterInfo3 = this.v;
                    if (vkOAuthRouterInfo3 != null) {
                    }
                    VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo222 = this.y;
                    if (vkValidatePhoneRouterInfo222 != null) {
                    }
                    if (bundle4 == null) {
                    }
                    if (bundle4 != null) {
                    }
                    aVar4 = this.g;
                    if (aVar4 == null) {
                    }
                    this.P = new com.vk.auth.a(this, aVar4);
                    super.onCreate(bundle);
                    V1(bundle);
                    rdk rdkVar22 = this.O;
                    rdkVar22.getClass();
                    oou0Var = (oou0) r55.c.getValue();
                    if (oou0Var == null) {
                    }
                    rdkVar22.b = bVar;
                    rdk.g = bundle != null ? bundle.getBoolean("CredentialsActivitySaverDelegate_savingStarted") : false;
                    rdkVar22.c = bundle == null ? (AuthResult) bundle.getParcelable("CredentialsActivitySaverDelegate_authResult") : null;
                    rdkVar22.d = bundle == null ? bundle.getLong("CredentialsActivitySaverDelegate_userId") : 0L;
                    rdkVar22.e = bundle != null ? (SignUpData) bundle.getParcelable("CredentialsActivitySaverDelegate_signUpData") : null;
                    if (bundle != null) {
                    }
                }
                silentAuthSource = null;
                q55 q55Var42 = q55.a;
                bundle7 = q55.c().a.K;
                if (bundle7 != null) {
                }
                bool = null;
                q55 q55Var522 = q55.a;
                bundle6 = q55.c().a.K;
                if (bundle6 != null) {
                }
                bool2 = null;
                q55 q55Var6222 = q55.a;
                aVar = this.g;
                if (aVar == null) {
                }
                q55.d = aVar;
                RegistrationFunnelScreenStack registrationFunnelScreenStack222 = frf0.a;
                frf0.c(this, bundle);
                r55 r55Var222 = r55.a;
                r55.c();
                aVar2 = this.g;
                if (aVar2 == null) {
                }
                bundle2 = aVar2.a.K;
                if ((bundle2 == null ? bundle2.getString("white_label_flow_input_sat") : null) == null) {
                }
                aVar3 = this.g;
                if (aVar3 == null) {
                }
                bundle3 = aVar3.a.K;
                if ((bundle3 == null ? m63.e(bundle3) : null) == null) {
                }
                vkOAuthRouterInfo = this.v;
                if (vkOAuthRouterInfo != null) {
                }
                multiAccountData = this.L;
                if (multiAccountData != null) {
                }
                str2 = this.n;
                if (str2 != null) {
                }
                whiteLabelAuthData = this.E;
                if (whiteLabelAuthData != null) {
                }
                if (this.F != null) {
                }
                intent = getIntent();
                if (intent != null) {
                }
                vkOAuthRouterInfo2 = this.v;
                if ((vkOAuthRouterInfo2 == null ? vkOAuthRouterInfo2.e : null) == VkOAuthGoal.ADDITIONAL_OAUTH_AUTH) {
                }
                vkOAuthRouterInfo3 = this.v;
                if (vkOAuthRouterInfo3 != null) {
                }
                VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo2222 = this.y;
                if (vkValidatePhoneRouterInfo2222 != null) {
                }
                if (bundle4 == null) {
                }
                if (bundle4 != null) {
                }
                aVar4 = this.g;
                if (aVar4 == null) {
                }
                this.P = new com.vk.auth.a(this, aVar4);
                super.onCreate(bundle);
                V1(bundle);
                rdk rdkVar222 = this.O;
                rdkVar222.getClass();
                oou0Var = (oou0) r55.c.getValue();
                if (oou0Var == null) {
                }
                rdkVar222.b = bVar;
                rdk.g = bundle != null ? bundle.getBoolean("CredentialsActivitySaverDelegate_savingStarted") : false;
                rdkVar222.c = bundle == null ? (AuthResult) bundle.getParcelable("CredentialsActivitySaverDelegate_authResult") : null;
                rdkVar222.d = bundle == null ? bundle.getLong("CredentialsActivitySaverDelegate_userId") : 0L;
                rdkVar222.e = bundle != null ? (SignUpData) bundle.getParcelable("CredentialsActivitySaverDelegate_signUpData") : null;
                if (bundle != null) {
                }
            }
            mailAuthFlowConfig = null;
            q55 q55Var32 = q55.a;
            bundle8 = q55.c().a.K;
            if (bundle8 != null) {
            }
            silentAuthSource = null;
            q55 q55Var422 = q55.a;
            bundle7 = q55.c().a.K;
            if (bundle7 != null) {
            }
            bool = null;
            q55 q55Var5222 = q55.a;
            bundle6 = q55.c().a.K;
            if (bundle6 != null) {
            }
            bool2 = null;
            q55 q55Var62222 = q55.a;
            aVar = this.g;
            if (aVar == null) {
            }
            q55.d = aVar;
            RegistrationFunnelScreenStack registrationFunnelScreenStack2222 = frf0.a;
            frf0.c(this, bundle);
            r55 r55Var2222 = r55.a;
            r55.c();
            aVar2 = this.g;
            if (aVar2 == null) {
            }
            bundle2 = aVar2.a.K;
            if ((bundle2 == null ? bundle2.getString("white_label_flow_input_sat") : null) == null) {
            }
            aVar3 = this.g;
            if (aVar3 == null) {
            }
            bundle3 = aVar3.a.K;
            if ((bundle3 == null ? m63.e(bundle3) : null) == null) {
            }
            vkOAuthRouterInfo = this.v;
            if (vkOAuthRouterInfo != null) {
            }
            multiAccountData = this.L;
            if (multiAccountData != null) {
            }
            str2 = this.n;
            if (str2 != null) {
            }
            whiteLabelAuthData = this.E;
            if (whiteLabelAuthData != null) {
            }
            if (this.F != null) {
            }
            intent = getIntent();
            if (intent != null) {
            }
            vkOAuthRouterInfo2 = this.v;
            if ((vkOAuthRouterInfo2 == null ? vkOAuthRouterInfo2.e : null) == VkOAuthGoal.ADDITIONAL_OAUTH_AUTH) {
            }
            vkOAuthRouterInfo3 = this.v;
            if (vkOAuthRouterInfo3 != null) {
            }
            VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo22222 = this.y;
            if (vkValidatePhoneRouterInfo22222 != null) {
            }
            if (bundle4 == null) {
            }
            if (bundle4 != null) {
            }
            aVar4 = this.g;
            if (aVar4 == null) {
            }
            this.P = new com.vk.auth.a(this, aVar4);
            super.onCreate(bundle);
            V1(bundle);
            rdk rdkVar2222 = this.O;
            rdkVar2222.getClass();
            oou0Var = (oou0) r55.c.getValue();
            if (oou0Var == null) {
            }
            rdkVar2222.b = bVar;
            rdk.g = bundle != null ? bundle.getBoolean("CredentialsActivitySaverDelegate_savingStarted") : false;
            rdkVar2222.c = bundle == null ? (AuthResult) bundle.getParcelable("CredentialsActivitySaverDelegate_authResult") : null;
            rdkVar2222.d = bundle == null ? bundle.getLong("CredentialsActivitySaverDelegate_userId") : 0L;
            rdkVar2222.e = bundle != null ? (SignUpData) bundle.getParcelable("CredentialsActivitySaverDelegate_signUpData") : null;
            if (bundle != null) {
            }
        }
        str = null;
        q55 q55Var22 = q55.a;
        bundle9 = q55.c().a.K;
        if (bundle9 != null) {
        }
        mailAuthFlowConfig = null;
        q55 q55Var322 = q55.a;
        bundle8 = q55.c().a.K;
        if (bundle8 != null) {
        }
        silentAuthSource = null;
        q55 q55Var4222 = q55.a;
        bundle7 = q55.c().a.K;
        if (bundle7 != null) {
        }
        bool = null;
        q55 q55Var52222 = q55.a;
        bundle6 = q55.c().a.K;
        if (bundle6 != null) {
        }
        bool2 = null;
        q55 q55Var622222 = q55.a;
        aVar = this.g;
        if (aVar == null) {
        }
        q55.d = aVar;
        RegistrationFunnelScreenStack registrationFunnelScreenStack22222 = frf0.a;
        frf0.c(this, bundle);
        r55 r55Var22222 = r55.a;
        r55.c();
        aVar2 = this.g;
        if (aVar2 == null) {
        }
        bundle2 = aVar2.a.K;
        if ((bundle2 == null ? bundle2.getString("white_label_flow_input_sat") : null) == null) {
        }
        aVar3 = this.g;
        if (aVar3 == null) {
        }
        bundle3 = aVar3.a.K;
        if ((bundle3 == null ? m63.e(bundle3) : null) == null) {
        }
        vkOAuthRouterInfo = this.v;
        if (vkOAuthRouterInfo != null) {
        }
        multiAccountData = this.L;
        if (multiAccountData != null) {
        }
        str2 = this.n;
        if (str2 != null) {
        }
        whiteLabelAuthData = this.E;
        if (whiteLabelAuthData != null) {
        }
        if (this.F != null) {
        }
        intent = getIntent();
        if (intent != null) {
        }
        vkOAuthRouterInfo2 = this.v;
        if ((vkOAuthRouterInfo2 == null ? vkOAuthRouterInfo2.e : null) == VkOAuthGoal.ADDITIONAL_OAUTH_AUTH) {
        }
        vkOAuthRouterInfo3 = this.v;
        if (vkOAuthRouterInfo3 != null) {
        }
        VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo222222 = this.y;
        if (vkValidatePhoneRouterInfo222222 != null) {
        }
        if (bundle4 == null) {
        }
        if (bundle4 != null) {
        }
        aVar4 = this.g;
        if (aVar4 == null) {
        }
        this.P = new com.vk.auth.a(this, aVar4);
        super.onCreate(bundle);
        V1(bundle);
        rdk rdkVar22222 = this.O;
        rdkVar22222.getClass();
        oou0Var = (oou0) r55.c.getValue();
        if (oou0Var == null) {
        }
        rdkVar22222.b = bVar;
        rdk.g = bundle != null ? bundle.getBoolean("CredentialsActivitySaverDelegate_savingStarted") : false;
        rdkVar22222.c = bundle == null ? (AuthResult) bundle.getParcelable("CredentialsActivitySaverDelegate_authResult") : null;
        rdkVar22222.d = bundle == null ? bundle.getLong("CredentialsActivitySaverDelegate_userId") : 0L;
        rdkVar22222.e = bundle != null ? (SignUpData) bundle.getParcelable("CredentialsActivitySaverDelegate_signUpData") : null;
        if (bundle != null) {
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        q55 q55Var = q55.a;
        q55.e(this.i);
        this.h = null;
        ArrayList arrayList = w3a0.a;
        w3a0.b(this.j);
        com.vk.auth.main.a aVar = this.g;
        if (aVar != null) {
            if (aVar.equals(q55.d)) {
                com.vk.auth.main.a aVar2 = q55.d;
                if ((aVar2 != null ? aVar2.d : 0L) <= aVar.d) {
                    q55.d = null;
                }
            }
            q55.a aVar3 = q55.c;
            if (aVar3 != null) {
                aVar3.b();
            }
            q55.c = null;
        }
        if (epx.f(U, this)) {
            U = null;
        }
        this.Q.dispose();
        super.onDestroy();
        c7v0 c7v0Var = this.w;
        if (c7v0Var != null) {
            c7v0Var.d();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        R1(intent);
        IntentSource intentSource = IntentSource.ON_NEW_INTENT;
        a.C0398a c0398a = a.C0398a.a;
        a O1 = O1(intent, intentSource);
        if (O1.equals(c0398a)) {
            Z1();
        } else {
            if (!(O1 instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((a.b) O1).a) {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        z1h0 G = getSupportFragmentManager().G(R.id.vk_fragment_container);
        arf0 arf0Var = G instanceof arf0 ? (arf0) G : null;
        frf0.e(arf0Var != null ? arf0Var.u5() : null, com.vk.registration.funnels.a.c(T1()), 4);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        U = this;
        com.vk.auth.main.a aVar = this.g;
        if (aVar != null) {
            q55 q55Var = q55.a;
            if (aVar == null) {
                aVar = null;
            }
            q55.d = aVar;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        q55 q55Var = q55.a;
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        bundle.putParcelable("registration_screens", frf0.a);
        bundle.putString("registration_sid", frf0.c);
        r55 r55Var = r55.a;
        r55.c();
        com.vk.auth.main.a aVar = q55.d;
        if (aVar != null) {
            bundle.putParcelable("___VkAuthLib_SignUpDataHolder___", aVar.a);
        }
        rdk rdkVar = this.O;
        rdkVar.getClass();
        bundle.putBoolean("CredentialsActivitySaverDelegate_savingStarted", rdk.g);
        bundle.putParcelable("CredentialsActivitySaverDelegate_authResult", rdkVar.c);
        bundle.putLong("CredentialsActivitySaverDelegate_userId", rdkVar.d);
        bundle.putParcelable("CredentialsActivitySaverDelegate_signUpData", rdkVar.e);
        bundle.putBoolean("isAuthCompleted", this.k);
        bundle.putBoolean("validationCompleted", this.q);
        bundle.putBoolean("is_cancel_result", this.G);
        c7v0 c7v0Var = this.w;
        if (c7v0Var != null) {
            c7v0Var.g(bundle);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        if (!isFinishing()) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            z1h0 G = getSupportFragmentManager().G(R.id.vk_fragment_container);
            arf0 arf0Var = G instanceof arf0 ? (arf0) G : null;
            SchemeStatSak$EventScreen u5 = arf0Var != null ? arf0Var.u5() : null;
            ArrayList<SchemeStatSak$RegistrationFieldItem> c2 = com.vk.registration.funnels.a.c(T1());
            frf0.m(u5, false);
            frf0.j(SchemeStatSak$TypeRegistrationItem.EventType.SCREEN_BLUR, null, c2, null, null, 248);
            RegistrationElementsTracker.b.clear();
        }
        try {
            super.onStop();
        } catch (Exception unused) {
        }
    }

    @Override // xsna.aeg0
    public final void yk(tb0 tb0Var) {
        if (tb0Var != null) {
            this.f.remove(tb0Var);
        }
    }

    /* compiled from: DefaultAuthActivity.kt */
    public static final class c implements t25 {

        /* compiled from: DefaultAuthActivity.kt */
        /* loaded from: classes15.dex */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VkPhoneValidationErrorReason.values().length];
                try {
                    iArr[VkPhoneValidationErrorReason.LATER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VkPhoneValidationErrorReason.LOGOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VkPhoneValidationErrorReason.UNLINK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c() {
        }

        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.t25
        public final void c(AuthResult authResult, t25.a aVar) {
            DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.this;
            defaultAuthActivity.k = true;
            defaultAuthActivity.N = authResult;
            defaultAuthActivity.h = aVar;
            defaultAuthActivity.M = authResult.f();
            AccountProfileType accountProfileType = authResult.g().b;
            accountProfileType.getClass();
            if (accountProfileType == AccountProfileType.EDU) {
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.AUTH_SUBPROFILE, null, null, null, null, null, null, 254);
            }
            rdk rdkVar = defaultAuthActivity.O;
            DefaultAuthActivity defaultAuthActivity2 = rdkVar.a;
            if (rdk.g) {
                return;
            }
            oou0.b bVar = rdkVar.b;
            VkAuthCredentials e = authResult.e();
            if (e == null || bVar == null) {
                defaultAuthActivity2.r1(authResult);
                defaultAuthActivity2.W1();
            } else {
                rdk.g = true;
                rdkVar.c = authResult;
                ((tdk) rdkVar.f.getValue()).c();
                bVar.a(e, new wqf(rdkVar, 9), new wze(rdkVar, 12));
            }
        }

        @Override // xsna.s25
        public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
            DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.this;
            if (defaultAuthActivity.o == null && defaultAuthActivity.p == null) {
                return;
            }
            defaultAuthActivity.q = true;
            defaultAuthActivity.finish();
        }

        @Override // xsna.s25
        public final void j(long j, SignUpData signUpData) {
            rdk rdkVar = DefaultAuthActivity.this.O;
            if (rdk.g) {
                rdkVar.d = j;
                rdkVar.e = signUpData;
            } else {
                rdkVar.a.X1(j, signUpData);
                rdkVar.e = null;
                rdkVar.d = 0L;
            }
        }

        @Override // xsna.s25
        public final void l(jq0 jq0Var) {
            DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.this;
            defaultAuthActivity.k = jq0Var instanceof jq0.b;
            defaultAuthActivity.finish();
        }

        @Override // xsna.s25
        public final void n(AuthResult authResult) {
            par0.a.getClass();
            par0.b("Should use onAuthAsync instead.\nIf you see this error on calling AuthLib.forEachCallback { it.onAuth(authResult) } \nthen use AuthLib.onAuth(authResult) instead");
            c(authResult, new t25.a() { // from class: xsna.dbl
                @Override // xsna.t25.a
                public final void onComplete() {
                }
            });
        }

        @Override // xsna.s25
        public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
            DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.this;
            if (defaultAuthActivity.o != null) {
                defaultAuthActivity.q = true;
                defaultAuthActivity.finish();
            }
            if (defaultAuthActivity.p != null) {
                int i = a.$EnumSwitchMapping$0[vkPhoneValidationErrorReason.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    defaultAuthActivity.q = true;
                    defaultAuthActivity.finish();
                }
            }
        }

        @Override // xsna.s25
        public final void A() {
        }

        @Override // xsna.s25
        public final void m() {
        }

        @Override // xsna.s25
        public final void o() {
        }

        @Override // xsna.s25
        public final void p() {
        }

        @Override // xsna.s25
        public final void t() {
        }

        @Override // xsna.s25
        public final void u() {
        }

        @Override // xsna.s25
        public final void b(String str) {
        }

        @Override // xsna.s25
        public final void r(t6v0 t6v0Var) {
        }
    }

    public void X1(long j, SignUpData signUpData) {
    }
}
