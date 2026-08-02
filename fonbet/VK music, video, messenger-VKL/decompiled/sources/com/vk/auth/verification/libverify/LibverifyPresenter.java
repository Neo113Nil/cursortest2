package com.vk.auth.verification.libverify;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.auth.main.LibverifyFactorsForKazakhstan;
import com.vk.auth.main.LibverifyListener;
import com.vk.auth.main.LibverifyVerificationSource;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.b;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.permission.PermissionHelper;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.single.i;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.bpn0;
import xsna.brm0;
import xsna.c5g;
import xsna.d3z;
import xsna.d6a;
import xsna.drm0;
import xsna.e370;
import xsna.ecm;
import xsna.epx;
import xsna.frf0;
import xsna.gau;
import xsna.gzs;
import xsna.h66;
import xsna.inr0;
import xsna.j3b;
import xsna.j5g;
import xsna.j9b;
import xsna.jnr0;
import xsna.k3b;
import xsna.kl4;
import xsna.l1i;
import xsna.l9h;
import xsna.lnr0;
import xsna.m1i;
import xsna.m9b;
import xsna.mk;
import xsna.p66;
import xsna.par0;
import xsna.qro0;
import xsna.r55;
import xsna.rte0;
import xsna.s3q0;
import xsna.sx3;
import xsna.tvo;
import xsna.ud5;
import xsna.v2j;
import xsna.vdx0;
import xsna.w550;
import xsna.wzh;
import xsna.x2z;
import xsna.x65;
import xsna.xkw;
import xsna.xqm0;
import xsna.y2z;
import xsna.zrp;

/* compiled from: LibverifyPresenter.kt */
/* loaded from: classes15.dex */
public final class LibverifyPresenter extends com.vk.auth.verification.base.b<y2z> implements x2z {
    public static final String[] d0 = {"77", "76", "997"};
    public final String H;
    public final String I;
    public final String J;
    public final List<LibverifyValidationType> K;
    public final boolean L;
    public final com.vk.auth.verification.base.b<y2z>.a M;
    public final bpn0 N;
    public final bpn0 O;
    public final bpn0 P;
    public final bpn0 Q;
    public final Long R;
    public final Handler S;
    public final sx3 T;
    public boolean U;
    public boolean V;
    public CodeState W;
    public final e X;
    public final d3z Y;
    public boolean Z;
    public final String[] a0;
    public PermissionsStatus b0;
    public boolean c0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LibverifyPresenter.kt */
    public static final class PermissionsStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PermissionsStatus[] $VALUES;
        public static final PermissionsStatus DENIED;
        public static final PermissionsStatus GRANTED;
        public static final PermissionsStatus REQUESTED;
        public static final PermissionsStatus UNKNOWN;

        static {
            PermissionsStatus permissionsStatus = new PermissionsStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = permissionsStatus;
            PermissionsStatus permissionsStatus2 = new PermissionsStatus("REQUESTED", 1);
            REQUESTED = permissionsStatus2;
            PermissionsStatus permissionsStatus3 = new PermissionsStatus("GRANTED", 2);
            GRANTED = permissionsStatus3;
            PermissionsStatus permissionsStatus4 = new PermissionsStatus("DENIED", 3);
            DENIED = permissionsStatus4;
            PermissionsStatus[] permissionsStatusArr = {permissionsStatus, permissionsStatus2, permissionsStatus3, permissionsStatus4};
            $VALUES = permissionsStatusArr;
            $ENTRIES = new asp(permissionsStatusArr);
        }

        public PermissionsStatus() {
            throw null;
        }

        public static PermissionsStatus valueOf(String str) {
            return (PermissionsStatus) Enum.valueOf(PermissionsStatus.class, str);
        }

        public static PermissionsStatus[] values() {
            return (PermissionsStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: LibverifyPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            LibverifyPresenter libverifyPresenter = (LibverifyPresenter) this.receiver;
            String[] strArr = LibverifyPresenter.d0;
            libverifyPresenter.getClass();
            SakFeatures.b.getClass();
            b.d i = SakFeatures.c.i(SakFeatures.Type.FEATURE_VKC_LIBVERIFY_CALLIN_REG);
            return Boolean.valueOf(brm0.w(i != null ? i.d() : null, "otp", true));
        }
    }

    /* compiled from: LibverifyPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            LibverifyPresenter libverifyPresenter = (LibverifyPresenter) this.receiver;
            String[] strArr = LibverifyPresenter.d0;
            return Boolean.valueOf((libverifyPresenter.x instanceof CheckPresenterInfo.SignUp) && SakFeatures.Type.FEATURE_VKC_LIBVERIFY_CALLIN_REG.h());
        }
    }

    /* compiled from: LibverifyPresenter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            LibverifyPresenter libverifyPresenter = (LibverifyPresenter) this.receiver;
            String[] strArr = LibverifyPresenter.d0;
            return Boolean.valueOf((libverifyPresenter.x instanceof CheckPresenterInfo.SignUp) && SakFeatures.Type.VKC_LIBVERIFY_FACTORS_KZ.h());
        }
    }

    /* compiled from: LibverifyPresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            LibverifyPresenter libverifyPresenter = (LibverifyPresenter) this.receiver;
            String[] strArr = LibverifyPresenter.d0;
            libverifyPresenter.getClass();
            return Boolean.valueOf(SakFeatures.Type.SAK_MESSENGER_SKIP_SMS_ANDROID.h());
        }
    }

    public LibverifyPresenter(CodeState codeState, Bundle bundle, LibverifyScreenData libverifyScreenData) {
        super(codeState, bundle, libverifyScreenData.g);
        VkClientLibverifyInfo.Service service;
        this.H = libverifyScreenData.Cb();
        this.I = libverifyScreenData.Db();
        this.J = libverifyScreenData.zb();
        this.K = libverifyScreenData.Ab();
        this.L = libverifyScreenData.Bb();
        this.M = new b.a();
        this.N = new bpn0(new a(0, this, LibverifyPresenter.class, "isCallInHasNextVerificationMethodLazy", "isCallInHasNextVerificationMethodLazy()Z", 0));
        this.O = new bpn0(new b(0, this, LibverifyPresenter.class, "isCallInEnabledLazy", "isCallInEnabledLazy()Z", 0));
        this.P = new bpn0(new c(0, this, LibverifyPresenter.class, "isLibverifyFactorsKzToggleEnabledLazy", "isLibverifyFactorsKzToggleEnabledLazy()Z", 0));
        this.Q = new bpn0(new d(0, this, LibverifyPresenter.class, "isMessengerSkipSmsEnabledLazy", "isMessengerSkipSmsEnabledLazy()Z", 0));
        CheckPresenterInfo checkPresenterInfo = this.x;
        Long l = null;
        CheckPresenterInfo.SignUp signUp = checkPresenterInfo instanceof CheckPresenterInfo.SignUp ? (CheckPresenterInfo.SignUp) checkPresenterInfo : null;
        if (signUp != null) {
            VerificationScreenData verificationScreenData = signUp.b;
            VerificationScreenData.Phone phone = verificationScreenData instanceof VerificationScreenData.Phone ? (VerificationScreenData.Phone) verificationScreenData : null;
            if (phone != null) {
                l = phone.m;
            }
        }
        this.R = l;
        this.S = new Handler(Looper.getMainLooper());
        this.T = new sx3(this, 7);
        this.V = true;
        this.W = this.z;
        this.X = new e();
        gau gauVar = this.h;
        if (gauVar == null) {
            throw new IllegalStateException("There is no libverify controller provider! Please provide it in Superappkit.init or AuthLibBridge.init");
        }
        Context context = this.b;
        VkClientLibverifyInfo n = this.c.n();
        CheckPresenterInfo checkPresenterInfo2 = this.x;
        if (checkPresenterInfo2 instanceof CheckPresenterInfo.Auth) {
            service = VkClientLibverifyInfo.Service.OTP_AUTH;
        } else if (checkPresenterInfo2 instanceof CheckPresenterInfo.SignUp) {
            service = VkClientLibverifyInfo.Service.REGISTRATION;
        } else if (checkPresenterInfo2 instanceof CheckPresenterInfo.PasswordLessAuth) {
            service = VkClientLibverifyInfo.Service.PASSWORDLESS;
        } else if (checkPresenterInfo2 instanceof CheckPresenterInfo.Validation) {
            service = VkClientLibverifyInfo.Service.VALIDATION;
        } else {
            if (!(checkPresenterInfo2 instanceof CheckPresenterInfo.MethodSelectorAuth)) {
                throw new NoWhenBranchMatchedException();
            }
            service = VkClientLibverifyInfo.Service.PASSWORDLESS;
        }
        this.Y = gauVar.a(context, n.c(service));
        this.a0 = this.c.n().b(this.b);
        this.b0 = PermissionsStatus.UNKNOWN;
    }

    public static final void P0(LibverifyPresenter libverifyPresenter, int i) {
        Context context = libverifyPresenter.b;
        y2z y2zVar = (y2z) libverifyPresenter.a;
        if (y2zVar != null) {
            x65.a.a(y2zVar, context.getString(R.string.vk_auth_error), context.getString(i), context.getString(R.string.vk_ok), new ecm(libverifyPresenter, 20), null, null, false, null, null, Tensorflow.FRAME_WIDTH);
        }
    }

    @Override // com.vk.auth.verification.base.b
    public final int A0() {
        return this.Y.a();
    }

    @Override // com.vk.auth.verification.base.b
    public final CodeState B0() {
        return this.W;
    }

    @Override // com.vk.auth.verification.base.b
    public final boolean D0() {
        d3z d3zVar = this.Y;
        return d3zVar.a() > 0 && this.y.length() == d3zVar.a();
    }

    @Override // com.vk.auth.verification.base.b
    public final boolean E0() {
        PermissionHelper.a.getClass();
        return PermissionHelper.b(this.b, this.a0);
    }

    @Override // xsna.x2z
    public final void L() {
        String str;
        CodeState codeState = this.W;
        CodeState.MessengerRegistration messengerRegistration = codeState instanceof CodeState.MessengerRegistration ? (CodeState.MessengerRegistration) codeState : null;
        if (messengerRegistration == null || (str = messengerRegistration.g) == null) {
            return;
        }
        par0 par0Var = par0.a;
        String concat = "[LibverifyPresenter] onRegisterInMessengerClicked, messengerId=".concat(str);
        par0Var.getClass();
        par0.a(concat);
        y2z y2zVar = (y2z) this.a;
        if (y2zVar != null) {
            y2zVar.be(str, this.E);
        }
    }

    @Override // com.vk.auth.verification.base.b
    public final void L0(CodeState codeState) {
        y2z y2zVar;
        if (!codeState.equals(this.W) && (y2zVar = (y2z) this.a) != null) {
            y2zVar.aj();
        }
        this.W = codeState;
    }

    @Override // com.vk.auth.verification.base.b
    public final void O0(String str) {
        d3z d3zVar = this.Y;
        super.O0(str);
        par0.a.getClass();
        par0.a("[LibverifyPresenter] useCode");
        this.V = true;
        CheckPresenterInfo checkPresenterInfo = this.x;
        if ((checkPresenterInfo instanceof CheckPresenterInfo.Auth) && this.c.m().matcher(str).find()) {
            VkAuthState vkAuthState = ((CheckPresenterInfo.Auth) checkPresenterInfo).b;
            vkAuthState.d.put("code", str);
            p66.j0(this, vkAuthState, this.M, null, null, 28);
            return;
        }
        try {
            if (d3zVar.h(str)) {
                this.B = Boolean.valueOf(epx.f(this.B, Boolean.TRUE));
                d3zVar.b(str);
                s3q0 s3q0Var = s3q0.a;
            } else {
                y2z y2zVar = (y2z) this.a;
                if (y2zVar != null) {
                    y2zVar.E1(this.b.getString(R.string.vk_auth_wrong_code), (r5 & 2) == 0, (r5 & 4) == 0);
                    s3q0 s3q0Var2 = s3q0.a;
                }
            }
        } catch (Exception e2) {
            par0.a.getClass();
            par0.d(e2);
            s3q0 s3q0Var3 = s3q0.a;
        }
    }

    @Override // xsna.x2z
    public final void Q() {
        par0.a.getClass();
        par0.a("[LibverifyPresenter] onRestartVerificationClicked");
        this.Z = false;
        L0(new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null));
        N0();
        this.Y.o();
        this.Z = true;
    }

    @Override // com.vk.auth.verification.base.b
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void y0(y2z y2zVar) {
        super.y0(y2zVar);
        this.A = true;
        PermissionHelper.a.getClass();
        Context context = this.b;
        String[] strArr = this.a0;
        if (PermissionHelper.b(context, strArr)) {
            par0.a.getClass();
            par0.a("[LibverifyPresenter] Permissions were granted");
            this.b0 = PermissionsStatus.GRANTED;
        } else {
            par0.a.getClass();
            par0.a("[LibverifyPresenter] Request permissions");
            this.b0 = PermissionsStatus.REQUESTED;
            y2zVar.Ik(strArr, new wzh(this, 18), new l1i(this, 11));
        }
    }

    public final void R0() {
        LibverifyFactorsForKazakhstan libverifyFactorsForKazakhstan;
        List<String> list;
        LibverifyFactorsForKazakhstan libverifyFactorsForKazakhstan2;
        Object obj;
        par0 par0Var = par0.a;
        String str = "[LibverifyPresenter] startVerification, verificationStarted=" + this.Z;
        par0Var.getClass();
        par0.a(str);
        if (this.Z) {
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context context = this.b;
        permissionHelper.getClass();
        this.Y.k(this.b, !tvo.a(context, (String[]) Arrays.copyOf(new String[]{"android.permission.READ_PHONE_STATE"}, 1)));
        CodeState codeState = this.W;
        if (!(codeState instanceof CodeState.CallResetWait) && !(codeState instanceof CodeState.CallInWait)) {
            codeState = new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null);
        }
        L0(codeState);
        this.A = false;
        N0();
        y2z y2zVar = (y2z) this.a;
        if (y2zVar != null) {
            y2zVar.O1();
        }
        d3z d3zVar = this.Y;
        String str2 = this.H;
        String str3 = this.J;
        boolean booleanValue = ((Boolean) this.O.getValue()).booleanValue();
        List<LibverifyValidationType> list2 = this.K;
        boolean z = this.L;
        String str4 = this.H;
        if (((Boolean) this.P.getValue()).booleanValue()) {
            String y = brm0.y(str4, "+", "");
            String[] strArr = d0;
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                if (brm0.B(y, strArr[i], false)) {
                    SakFeatures.b.getClass();
                    b.d i2 = SakFeatures.c.i(SakFeatures.Type.VKC_LIBVERIFY_FACTORS_KZ);
                    if (i2 != null) {
                        String obj2 = i2.c.toString();
                        if (obj2 == null || drm0.N(obj2)) {
                            list = EmptyList.b;
                        } else {
                            list = i2.f();
                            if (list == null) {
                                String obj3 = i2.c.toString();
                                par0 par0Var2 = par0.a;
                                String g = xqm0.g("\n                [LibverifyKazakhstanFactorsResolver] Toggle value is incorrect - it's impossible to parse it as list of arguments!\n                Received value is: " + obj3 + "\n            ");
                                par0Var2.getClass();
                                par0.f(g);
                            }
                        }
                        if (list.isEmpty()) {
                            libverifyFactorsForKazakhstan2 = new LibverifyFactorsForKazakhstan(j5g.O0(LibverifyFactorsForKazakhstan.Factor.h()));
                        } else {
                            List<String> list3 = list;
                            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                            for (String str5 : list3) {
                                LibverifyFactorsForKazakhstan.Factor.Companion.getClass();
                                Iterator<E> it = LibverifyFactorsForKazakhstan.Factor.h().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = it.next();
                                        if (epx.f(((LibverifyFactorsForKazakhstan.Factor) obj).i(), str5)) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                LibverifyFactorsForKazakhstan.Factor factor = (LibverifyFactorsForKazakhstan.Factor) obj;
                                if (factor == null) {
                                    par0 par0Var3 = par0.a;
                                    String g2 = xqm0.g("\n                [LibverifyKazakhstanFactorsResolver] Toggle arguments are incorrect - it's impossible to parse libverify factors!\n                Received arguments are: " + list + "\n            ");
                                    par0Var3.getClass();
                                    par0.f(g2);
                                } else {
                                    arrayList.add(factor);
                                }
                            }
                            libverifyFactorsForKazakhstan2 = new LibverifyFactorsForKazakhstan(arrayList);
                        }
                        libverifyFactorsForKazakhstan = libverifyFactorsForKazakhstan2;
                    }
                } else {
                    i++;
                }
            }
        }
        libverifyFactorsForKazakhstan = null;
        d3zVar.d(str2, str3, booleanValue, list2, libverifyFactorsForKazakhstan, z);
        this.Z = true;
    }

    @Override // xsna.x2z
    public final void f() {
        CodeState codeState = this.W;
        CodeState.CallInWait callInWait = codeState instanceof CodeState.CallInWait ? (CodeState.CallInWait) codeState : null;
        if (callInWait != null) {
            this.Y.g();
            inr0 inr0Var = this.E;
            inr0Var.getClass();
            inr0Var.d(new j3b(com.vk.registration.funnels.b.a, 4));
            y2z y2zVar = (y2z) this.a;
            if (y2zVar != null) {
                y2zVar.D2(callInWait.e);
            }
        }
    }

    @Override // xsna.p66, xsna.z55
    public final void onDestroy() {
        super.onDestroy();
        this.S.removeCallbacks(this.T);
        if (!this.Z || this.c0) {
            return;
        }
        this.Y.onCancel();
    }

    @Override // xsna.p66, xsna.z55
    public final void onPause() {
        this.Y.i(null);
    }

    @Override // xsna.p66, xsna.z55
    public final void onResume() {
        v0();
        this.V = false;
        this.Y.i(this.X);
        if (this.b0 != PermissionsStatus.REQUESTED) {
            R0();
        }
    }

    @Override // com.vk.auth.verification.base.b, xsna.l0c
    public final void s(boolean z) {
        super.s(z);
        try {
            this.Y.n();
            L0(new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null));
            N0();
        } catch (Exception e2) {
            par0.a.getClass();
            par0.d(e2);
        }
    }

    /* compiled from: LibverifyPresenter.kt */
    public static final class e implements LibverifyListener {
        public boolean a;

        /* compiled from: LibverifyPresenter.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LibverifyVerificationSource.values().length];
                try {
                    iArr[LibverifyVerificationSource.ALREADY_VERIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public e() {
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void a(Integer num, String str) {
            par0 par0Var = par0.a;
            StringBuilder sb = new StringBuilder("[LibverifyPresenter] onCallResetInfoUpdated, digitsCount=");
            sb.append(num != null ? num.intValue() : -1);
            String sb2 = sb.toString();
            par0Var.getClass();
            par0.a(sb2);
            this.a = true;
            LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
            CodeState codeState = libverifyPresenter.W;
            if (num == null) {
                this.a = false;
                return;
            }
            if ((codeState instanceof CodeState.CallResetWait) && ((CodeState.CallResetWait) codeState).g == num.intValue()) {
                return;
            }
            libverifyPresenter.L0(new CodeState.CallResetWait(System.currentTimeMillis(), 0L, num.intValue(), 2, null));
            libverifyPresenter.N0();
            libverifyPresenter.M0();
            inr0 inr0Var = libverifyPresenter.E;
            inr0Var.getClass();
            inr0Var.d(new jnr0(com.vk.registration.funnels.b.a, 0));
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void c(LibverifyListener.State state) {
            if (this.a || state != LibverifyListener.State.ENTER_SMS_CODE) {
                return;
            }
            LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
            if (libverifyPresenter.W instanceof CodeState.SmsWait) {
                return;
            }
            libverifyPresenter.L0(new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null));
            libverifyPresenter.N0();
            libverifyPresenter.M0();
            inr0 inr0Var = libverifyPresenter.E;
            inr0Var.getClass();
            inr0Var.d(new ud5(com.vk.registration.funnels.b.a, 4));
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void d(boolean z) {
            this.a = z;
            if (z) {
                LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
                if (libverifyPresenter.W instanceof CodeState.LibverifyMobileId) {
                    return;
                }
                libverifyPresenter.L0(new CodeState.LibverifyMobileId(rte0.q(libverifyPresenter.x)));
                libverifyPresenter.N0();
                libverifyPresenter.M0();
                inr0 inr0Var = libverifyPresenter.E;
                inr0Var.getClass();
                inr0Var.d(new d6a(com.vk.registration.funnels.b.a));
            }
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void e(String str, String str2) {
            par0.a.getClass();
            par0.a("[LibverifyPresenter] onCodeDeliveryInfoReceived, routeType=" + str + ", status=" + str2);
            LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
            CodeState codeState = libverifyPresenter.W;
            if ((codeState instanceof CodeState.MessengerLoading) && epx.f(str2, "DELIVERED") && epx.f(str, "messenger")) {
                libverifyPresenter.S.removeCallbacks(libverifyPresenter.T);
                CodeState.MessengerLoading messengerLoading = (CodeState.MessengerLoading) codeState;
                libverifyPresenter.L0(new CodeState.LibverifyMessengersPushWait(messengerLoading.e, messengerLoading.f, true));
                libverifyPresenter.N0();
                y2z y2zVar = (y2z) libverifyPresenter.a;
                if (y2zVar != null) {
                    y2zVar.O1();
                }
                inr0 inr0Var = libverifyPresenter.E;
                inr0Var.getClass();
                inr0Var.d(new w550(com.vk.registration.funnels.b.a, 2));
            }
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void f(Integer num, String str, String str2) {
            par0.a.getClass();
            par0.a("[LibverifyPresenter] onMessengerInfoUpdated, messengerName=" + str);
            this.a = true;
            LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
            sx3 sx3Var = libverifyPresenter.T;
            Handler handler = libverifyPresenter.S;
            inr0 inr0Var = libverifyPresenter.E;
            CodeState codeState = libverifyPresenter.W;
            if (str == null) {
                this.a = false;
                return;
            }
            if (!((Boolean) libverifyPresenter.Q.getValue()).booleanValue() || !(libverifyPresenter.x instanceof CheckPresenterInfo.SignUp)) {
                if ((codeState instanceof CodeState.LibverifyMessengersPushWait) && epx.f(((CodeState.LibverifyMessengersPushWait) codeState).e, str)) {
                    return;
                }
                libverifyPresenter.L0(new CodeState.LibverifyMessengersPushWait(str, num, false, 4, null));
                libverifyPresenter.N0();
                libverifyPresenter.M0();
                inr0Var.getClass();
                inr0Var.d(new w550(com.vk.registration.funnels.b.a, 2));
                return;
            }
            CodeState.LibverifyMessengersPushWait libverifyMessengersPushWait = codeState instanceof CodeState.LibverifyMessengersPushWait ? (CodeState.LibverifyMessengersPushWait) codeState : null;
            if (epx.f(libverifyMessengersPushWait != null ? libverifyMessengersPushWait.e : null, str)) {
                return;
            }
            CodeState.MessengerLoading messengerLoading = codeState instanceof CodeState.MessengerLoading ? (CodeState.MessengerLoading) codeState : null;
            if (epx.f(messengerLoading != null ? messengerLoading.e : null, str) || (codeState instanceof CodeState.MessengerRegistration)) {
                return;
            }
            libverifyPresenter.L0(new CodeState.MessengerLoading(str, num, str2));
            libverifyPresenter.N0();
            libverifyPresenter.M0();
            inr0Var.e();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.OTP_MESSENGER_LIBVERIFY_SENDING, null, null, null, null, null, null, 254);
            handler.removeCallbacks(sx3Var);
            Long l = libverifyPresenter.R;
            if (l == null || l.longValue() <= 0) {
                return;
            }
            par0.a("[LibverifyPresenter] startMessengerLoadingTimeout, delay=" + l + UcumUtils.UCUM_MILLISECODS);
            handler.postDelayed(sx3Var, l.longValue());
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void g(LibverifyListener.a aVar) {
            LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
            inr0 inr0Var = libverifyPresenter.E;
            Context context = libverifyPresenter.b;
            CodeState codeState = libverifyPresenter.W;
            if (codeState instanceof CodeState.CallInWait) {
                if (aVar instanceof LibverifyListener.a.e) {
                    inr0Var.e();
                    com.vk.registration.funnels.b.a.getClass();
                    com.vk.registration.funnels.b.k(null);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    String a2 = aVar.a();
                    inr0Var.e();
                    com.vk.registration.funnels.b.a.getClass();
                    com.vk.registration.funnels.b.k(a2);
                    s3q0 s3q0Var2 = s3q0.a;
                }
                CodeState.CallInWait callInWait = (CodeState.CallInWait) codeState;
                libverifyPresenter.L0(new CodeState.CallInWait(callInWait.e, callInWait.f, callInWait.g, callInWait.h, callInWait.i, false));
                libverifyPresenter.N0();
            }
            if (aVar instanceof LibverifyListener.a.b) {
                par0.a.getClass();
                par0.a("[LibverifyPresenter] onIncorrectPhone");
                LibverifyPresenter.P0(libverifyPresenter, R.string.vk_auth_sign_up_invalid_phone);
                return;
            }
            if (aVar instanceof LibverifyListener.a.h) {
                par0.a.getClass();
                par0.a("[LibverifyPresenter] onUnsupportedPhone");
                LibverifyPresenter.P0(libverifyPresenter, R.string.vk_auth_sign_up_invalid_phone_format);
                return;
            }
            if ((aVar instanceof LibverifyListener.a.f) || (aVar instanceof LibverifyListener.a.d)) {
                par0.a.getClass();
                par0.a("[LibverifyPresenter] onNetworkError");
                y2z y2zVar = (y2z) libverifyPresenter.a;
                if (y2zVar != null) {
                    y2zVar.qi(context.getString(R.string.vk_auth_load_network_error));
                    return;
                }
                return;
            }
            if (aVar instanceof LibverifyListener.a.g) {
                par0.a.getClass();
                par0.a("[LibverifyPresenter] onRateLimitError");
                gzs<s3q0> m1iVar = libverifyPresenter.x instanceof CheckPresenterInfo.PasswordLessAuth ? new m1i(libverifyPresenter, 24) : new l9h(libverifyPresenter, 27);
                y2z y2zVar2 = (y2z) libverifyPresenter.a;
                if (y2zVar2 != null) {
                    y2zVar2.wa(context.getString(R.string.vk_auth_too_much_tries), m1iVar, m1iVar);
                    return;
                }
                return;
            }
            if (aVar instanceof LibverifyListener.a.C0402a) {
                String str = ((LibverifyListener.a.C0402a) aVar).a;
                par0.a.getClass();
                par0.a("[LibverifyPresenter] onCommonError");
                if (drm0.N(str)) {
                    str = null;
                }
                if (str == null) {
                    str = context.getString(R.string.vk_auth_unknown_error);
                }
                y2z y2zVar3 = (y2z) libverifyPresenter.a;
                if (y2zVar3 != null) {
                    y2zVar3.wa(str, null, null);
                    return;
                }
                return;
            }
            if (!(aVar instanceof LibverifyListener.a.c)) {
                if (!(aVar instanceof LibverifyListener.a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                par0.a.getClass();
                par0.a("[LibverifyPresenter] noMoreRoutesError");
                y2z y2zVar4 = (y2z) libverifyPresenter.a;
                if (y2zVar4 != null) {
                    y2zVar4.wa(context.getString(R.string.vk_otp_method_selection_verification_methods_libverify_callin_error), null, null);
                    return;
                }
                return;
            }
            if (libverifyPresenter.V) {
                par0.a.getClass();
                par0.a("[LibverifyPresenter] onIncorrectSmsCode");
                inr0Var.b(null);
                y2z y2zVar5 = (y2z) libverifyPresenter.a;
                if (y2zVar5 != null) {
                    y2zVar5.E1(context.getString(R.string.vk_auth_wrong_code), (r5 & 2) == 0, (r5 & 4) == 0);
                }
                libverifyPresenter.Y.m();
            }
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void h(Integer num, String str) {
            par0.a.getClass();
            par0.a("[LibverifyPresenter] onCallInInfoUpdated, phoneToCall=" + str + " numberTimeout:" + num);
            this.a = true;
            LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
            inr0 inr0Var = libverifyPresenter.E;
            CodeState codeState = libverifyPresenter.W;
            if (str == null || num == null) {
                CodeState.CallInWait callInWait = codeState instanceof CodeState.CallInWait ? (CodeState.CallInWait) codeState : null;
                if (callInWait != null) {
                    libverifyPresenter.L0(new CodeState.CallInWait(callInWait.e, callInWait.f, callInWait.g, callInWait.h, callInWait.i, false));
                    libverifyPresenter.N0();
                }
                inr0Var.getClass();
                inr0Var.d(new j9b(com.vk.registration.funnels.b.a, 4));
                this.a = false;
                return;
            }
            if (!(codeState instanceof CodeState.CallInWait)) {
                i(num.intValue(), str);
                libverifyPresenter.M0();
                inr0Var.getClass();
                inr0Var.d(new xkw(com.vk.registration.funnels.b.a, 2));
                return;
            }
            if (epx.f(((CodeState.CallInWait) codeState).e, str)) {
                return;
            }
            i(num.intValue(), str);
            inr0Var.getClass();
            inr0Var.d(new k3b(com.vk.registration.funnels.b.a, 6));
        }

        public final void i(int i, String str) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
            libverifyPresenter.L0(new CodeState.CallInWait(str, elapsedRealtime, elapsedRealtime + i, libverifyPresenter.H, ((Boolean) libverifyPresenter.N.getValue()).booleanValue(), true));
            libverifyPresenter.N0();
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void onCompleted(String str, String str2, String str3) {
            par0.a.getClass();
            par0.a("[LibverifyPresenter] onCompleted");
            LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
            d3z d3zVar = libverifyPresenter.Y;
            Boolean bool = libverifyPresenter.B;
            if (bool == null) {
                bool = Boolean.TRUE;
            }
            libverifyPresenter.B = bool;
            libverifyPresenter.c0 = true;
            d3zVar.e();
            r55 r55Var = r55.a;
            r55.e().a();
            LibverifyVerificationSource f = d3zVar.f();
            int i = f == null ? -1 : a.$EnumSwitchMapping$0[f.ordinal()];
            if (i != -1) {
                if (i != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                inr0 inr0Var = libverifyPresenter.E;
                inr0Var.getClass();
                inr0Var.f = lnr0.a.b;
                inr0Var.d(new m9b(com.vk.registration.funnels.b.a, 5));
            }
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            y a2 = vdx0Var.r().a(libverifyPresenter.I, str2);
            io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
            bVar.b(new i(a2, new h66(bVar, 0)).subscribe());
            CheckPresenterInfo checkPresenterInfo = libverifyPresenter.x;
            if (!(checkPresenterInfo instanceof CheckPresenterInfo.Auth)) {
                String str4 = libverifyPresenter.I;
                Boolean bool2 = libverifyPresenter.B;
                libverifyPresenter.K0(new v2j(str, str4, null, str2, str3, null, bool2 != null ? bool2.booleanValue() : false));
            } else {
                VkAuthState vkAuthState = ((CheckPresenterInfo.Auth) checkPresenterInfo).b;
                vkAuthState.d.put("validate_session", str2);
                vkAuthState.d.put("validate_token", str3);
                p66.j0(libverifyPresenter, vkAuthState, null, null, null, 30);
            }
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void onNotification(String str) {
            par0.a.getClass();
            par0.a("[LibverifyPresenter] onNotification");
            LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
            if (libverifyPresenter.x instanceof CheckPresenterInfo.SignUp) {
                inr0 inr0Var = libverifyPresenter.E;
                inr0Var.getClass();
                inr0Var.d(new kl4(com.vk.registration.funnels.b.a));
            }
            qro0.c(new mk(12, libverifyPresenter, str));
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void onProgress(boolean z) {
            par0.a.getClass();
            par0.a("[LibverifyPresenter] onProgress, show=" + z);
            LibverifyPresenter libverifyPresenter = LibverifyPresenter.this;
            if (z != libverifyPresenter.U) {
                if (z) {
                    libverifyPresenter.s0(libverifyPresenter.u + 1);
                } else {
                    libverifyPresenter.s0(libverifyPresenter.u - 1);
                }
                libverifyPresenter.U = z;
            }
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void b(String str, String str2) {
        }
    }
}
