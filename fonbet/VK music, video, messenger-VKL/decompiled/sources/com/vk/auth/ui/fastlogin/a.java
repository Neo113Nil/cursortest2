package com.vk.auth.ui.fastlogin;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.main.SignUpData;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.main.f;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.ui.fastlogin.VkFastLoginView;
import com.vk.auth.ui.tertiarybutton.TertiaryButtonConfig;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.core.serialize.Serializer;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.alu0;
import xsna.bpn0;
import xsna.brm0;
import xsna.frf0;
import xsna.glq;
import xsna.jq0;
import xsna.ozl;
import xsna.pc3;
import xsna.r55;
import xsna.rl3;
import xsna.rtu0;
import xsna.s3q0;
import xsna.sbu0;
import xsna.t6v0;

/* compiled from: VkFastLoginBottomSheetFragment.kt */
/* loaded from: classes15.dex */
public class a extends sbu0 {
    public Country C;
    public String D;
    public Object F;
    public VkOAuthService G;
    public boolean H;
    public boolean I;
    public String J;
    public boolean K;
    public String L;
    public VkAuthMetaInfo M;
    public boolean O;
    public ArrayList P;
    public boolean Q;
    public VkAuthToolbar R;
    public VkFastLoginView S;
    public boolean T;
    public final int U;
    public boolean E = true;
    public boolean N = true;

    /* compiled from: VkFastLoginBottomSheetFragment.kt */
    public static final class b implements rtu0 {
        public final /* synthetic */ Drawable a;

        public b(a aVar, Drawable drawable) {
            this.a = drawable;
        }
    }

    public a() {
        Serializer.c<TertiaryButtonConfig> cVar = TertiaryButtonConfig.CREATOR;
        new C0417a();
        this.U = R.layout.vk_fast_login_bottom_sheet_fragment;
        try {
            glq.d.a();
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    @Override // xsna.oeu0
    public final int Gn() {
        return this.U;
    }

    @Override // xsna.oeu0
    public final void Jn() {
        VkFastLoginView vkFastLoginView = this.S;
        if (vkFastLoginView == null) {
            vkFastLoginView = null;
        }
        vkFastLoginView.getClass();
        throw null;
    }

    public final void Mn(SparseArray<Parcelable> sparseArray) {
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                Parcelable valueAt = sparseArray.valueAt(i);
                if (valueAt instanceof VkFastLoginView.CustomState) {
                    VkFastLoginPresenter$SavedState vkFastLoginPresenter$SavedState = ((VkFastLoginView.CustomState) valueAt).c;
                    boolean z = vkFastLoginPresenter$SavedState != null ? vkFastLoginPresenter$SavedState.o : false;
                    VkFastLoginView vkFastLoginView = this.S;
                    if (vkFastLoginView == null) {
                        vkFastLoginView = null;
                    }
                    vkFastLoginView.setCredentialsWereChecked(z);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        VkFastLoginView vkFastLoginView = this.S;
        if (vkFastLoginView == null) {
            vkFastLoginView = null;
        }
        vkFastLoginView.getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Object obj;
        VkOAuthService vkOAuthService;
        String string;
        Object obj2;
        String[] stringArray;
        List<String> u0;
        VkOAuthService valueOf;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.E = arguments != null ? arguments.getBoolean("dismissOnComplete", true) : true;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (stringArray = arguments2.getStringArray("loginServices")) == null || (u0 = rl3.u0(stringArray)) == null) {
            obj = EmptyList.b;
        } else {
            obj = new ArrayList();
            for (String str : u0) {
                VkOAuthService.Companion.getClass();
                if (str != null) {
                    try {
                        valueOf = VkOAuthService.valueOf(str);
                    } catch (IllegalArgumentException unused) {
                    }
                    if (valueOf == null) {
                        obj.add(valueOf);
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            }
        }
        this.F = obj;
        VkOAuthService.a aVar = VkOAuthService.Companion;
        Bundle arguments3 = getArguments();
        aVar.getClass();
        if (arguments3 == null || (string = arguments3.getString("key_service")) == null) {
            vkOAuthService = null;
        } else {
            Iterator<E> it = VkOAuthService.h().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (brm0.w(((VkOAuthService) obj2).name(), string, true)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            vkOAuthService = (VkOAuthService) obj2;
        }
        this.G = vkOAuthService;
        Bundle arguments4 = getArguments();
        this.H = arguments4 != null ? arguments4.getBoolean("onlyEnterPhoneMode", false) : false;
        Bundle arguments5 = getArguments();
        this.I = arguments5 != null ? arguments5.getBoolean("emailAvailable", false) : false;
        Bundle arguments6 = getArguments();
        this.J = arguments6 != null ? arguments6.getString("loginSource") : null;
        Bundle arguments7 = getArguments();
        this.C = arguments7 != null ? (Country) arguments7.getParcelable("keyPreFillCountry") : null;
        Bundle arguments8 = getArguments();
        this.D = arguments8 != null ? arguments8.getString("keyPreFillPhoneWithoutCode") : null;
        Bundle arguments9 = getArguments();
        this.K = arguments9 != null ? arguments9.getBoolean("skipAuthCancel") : false;
        Bundle arguments10 = getArguments();
        this.L = arguments10 != null ? arguments10.getString("validatePhoneSid") : null;
        Bundle arguments11 = getArguments();
        this.M = arguments11 != null ? (VkAuthMetaInfo) arguments11.getParcelable("authMetaInfo") : null;
        Bundle arguments12 = getArguments();
        this.O = arguments12 != null ? arguments12.getBoolean("killHostOnCancel", false) : false;
        Bundle arguments13 = getArguments();
        this.P = arguments13 != null ? arguments13.getParcelableArrayList("providedUsers") : null;
        Bundle arguments14 = getArguments();
        if (arguments14 != null) {
            arguments14.getBoolean("removeSingleEmptyPhoto", false);
        }
        Bundle arguments15 = getArguments();
        if (arguments15 != null) {
            arguments15.getBoolean("hideAlternativeAuth", false);
        }
        Bundle arguments16 = getArguments();
        this.Q = arguments16 != null ? arguments16.getBoolean("removeVkcLogo", false) : false;
        Bundle arguments17 = getArguments();
        if (arguments17 == null || ((TertiaryButtonConfig) arguments17.getParcelable("tertiaryButtonConfig")) == null) {
            Serializer.c<TertiaryButtonConfig> cVar = TertiaryButtonConfig.CREATOR;
        }
        Bundle arguments18 = getArguments();
        if (arguments18 != null) {
            arguments18.getBoolean("isHeaderHide", false);
        }
        Bundle arguments19 = getArguments();
        this.N = arguments19 != null ? arguments19.getBoolean("trackOnDismiss", true) : true;
        Bundle arguments20 = getArguments();
        if (arguments20 != null) {
            arguments20.getBundle("payload");
        }
        Bundle arguments21 = getArguments();
        if (arguments21 != null) {
            arguments21.getBoolean("simCardBannerVisible", false);
        }
        Bundle arguments22 = getArguments();
        if (arguments22 != null) {
            arguments22.getBoolean("maxMessengerVerificationAvailable", true);
        }
        Bundle arguments23 = getArguments();
        if (arguments23 != null) {
            arguments23.getBoolean("isServiceRegistration", false);
        }
        bpn0 bpn0Var = f.a;
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        VkFastLoginView vkFastLoginView = this.S;
        if (vkFastLoginView == null) {
            vkFastLoginView = null;
        }
        vkFastLoginView.getClass();
        throw null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        VkFastLoginView vkFastLoginView = this.S;
        if (vkFastLoginView == null) {
            vkFastLoginView = null;
        }
        vkFastLoginView.setProgressExtraTopMargin$core_release(0);
    }

    @Override // xsna.oeu0, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        FragmentActivity activity;
        super.onDismiss(dialogInterface);
        boolean z = this.T;
        if (!z && !this.K) {
            VkFastLoginView vkFastLoginView = this.S;
            if (vkFastLoginView == null) {
                vkFastLoginView = null;
            }
            vkFastLoginView.getClass();
            throw null;
        }
        if (!z && this.O && (activity = getActivity()) != null) {
            activity.finish();
        }
        VkFastLoginView vkFastLoginView2 = this.S;
        if (vkFastLoginView2 == null) {
            vkFastLoginView2 = null;
        }
        SchemeStatSak$EventScreen trackedScreen = vkFastLoginView2.getTrackedScreen();
        if (!this.N) {
            if (this.T) {
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.f(null, SchemeStatSak$EventScreen.NOWHERE, null, false, null, null, 60);
                return;
            }
            return;
        }
        if (trackedScreen != null) {
            if (this.T) {
                RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                frf0.f(null, SchemeStatSak$EventScreen.NOWHERE, null, false, null, null, 60);
            } else {
                frf0.g(trackedScreen, null, null, null, 12);
            }
            if (this.K) {
                return;
            }
            RegistrationFunnelScreenStack registrationFunnelScreenStack3 = frf0.a;
            frf0.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        VkFastLoginView vkFastLoginView = this.S;
        if (vkFastLoginView == null) {
            vkFastLoginView = null;
        }
        vkFastLoginView.getClass();
        throw null;
    }

    @Override // xsna.oeu0, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        VkFastLoginView vkFastLoginView = this.S;
        if (vkFastLoginView == null) {
            vkFastLoginView = null;
        }
        vkFastLoginView.getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VkSecondaryAuthInfo vkSecondaryAuthInfo;
        Drawable b2;
        SparseArray<Parcelable> sparseParcelableArray;
        super.onViewCreated(view, bundle);
        this.R = (VkAuthToolbar) view.findViewById(R.id.toolbar);
        View findViewById = view.findViewById(R.id.vk_toolbar_picture);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        if (findViewById != null) {
            findViewById.setOnClickListener(new pc3(ref$IntRef, 3));
        }
        this.S = (VkFastLoginView) view.findViewById(R.id.fast_login_view);
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                sparseParcelableArray = bundle.getSparseParcelableArray("android:view_state", Parcelable.class);
                Mn(sparseParcelableArray);
            } else {
                Mn(bundle.getSparseParcelableArray("android:view_state"));
            }
        }
        VkOAuthService vkOAuthService = this.G;
        if (vkOAuthService != null) {
            VkSecondaryAuthInfo.Companion.getClass();
            VkSecondaryAuthInfo[] values = VkSecondaryAuthInfo.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                vkSecondaryAuthInfo = values[i];
                if (vkSecondaryAuthInfo.h() == vkOAuthService) {
                    break;
                }
            }
        }
        vkSecondaryAuthInfo = null;
        if (vkSecondaryAuthInfo == null || (b2 = vkSecondaryAuthInfo.i(requireContext())) == null) {
            r55 r55Var = r55.a;
            b2 = r55.i().b(requireContext());
        }
        VkAuthToolbar vkAuthToolbar = this.R;
        if (vkAuthToolbar == null) {
            vkAuthToolbar = null;
        }
        vkAuthToolbar.setPicture(b2);
        if (this.Q) {
            VkFastLoginView vkFastLoginView = this.S;
            if (vkFastLoginView == null) {
                vkFastLoginView = null;
            }
            vkFastLoginView.setStateChangeListener(new b(this, b2));
        }
        VkFastLoginView vkFastLoginView2 = this.S;
        if (vkFastLoginView2 == null) {
            vkFastLoginView2 = null;
        }
        vkFastLoginView2.setAuthMetaInfo(this.M);
        VkFastLoginView vkFastLoginView3 = this.S;
        VkFastLoginView vkFastLoginView4 = vkFastLoginView3;
        if (vkFastLoginView3 == null) {
            vkFastLoginView4 = null;
        }
        Object obj = this.F;
        List<? extends VkOAuthService> list = obj;
        if (obj == 0) {
            list = null;
        }
        vkFastLoginView4.setLoginServices(list);
        VkFastLoginView vkFastLoginView5 = this.S;
        if (vkFastLoginView5 == null) {
            vkFastLoginView5 = null;
        }
        vkFastLoginView5.setSecondaryAuthInfo$core_release(vkSecondaryAuthInfo);
        VkFastLoginView vkFastLoginView6 = this.S;
        if (vkFastLoginView6 == null) {
            vkFastLoginView6 = null;
        }
        vkFastLoginView6.setPhoneSelectorManager(null);
        VkFastLoginView vkFastLoginView7 = this.S;
        if (vkFastLoginView7 == null) {
            vkFastLoginView7 = null;
        }
        vkFastLoginView7.setCredentialsLoader(null);
        if (this.I) {
            VkFastLoginView vkFastLoginView8 = this.S;
            if (vkFastLoginView8 == null) {
                vkFastLoginView8 = null;
            }
            vkFastLoginView8.setEmailAvailable(this.J);
        }
        if (this.H) {
            VkFastLoginView vkFastLoginView9 = this.S;
            if (vkFastLoginView9 == null) {
                vkFastLoginView9 = null;
            }
            vkFastLoginView9.getClass();
            throw null;
        }
        Country country = this.C;
        String str = this.D;
        if (country != null && str != null) {
            VkFastLoginView vkFastLoginView10 = this.S;
            if (vkFastLoginView10 == null) {
                vkFastLoginView10 = null;
            }
            vkFastLoginView10.getClass();
            throw null;
        }
        VkFastLoginView vkFastLoginView11 = this.S;
        if (vkFastLoginView11 == null) {
            vkFastLoginView11 = null;
        }
        vkFastLoginView11.setValidatePhoneSid(this.L);
        if (this.P != null) {
            VkFastLoginView vkFastLoginView12 = this.S;
            if (vkFastLoginView12 == null) {
                vkFastLoginView12 = null;
            }
            vkFastLoginView12.getClass();
            throw null;
        }
        VkFastLoginView vkFastLoginView13 = this.S;
        if (vkFastLoginView13 == null) {
            vkFastLoginView13 = null;
        }
        vkFastLoginView13.getClass();
        throw null;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFastLoginBottomSheetTheme;
    }

    /* compiled from: VkFastLoginBottomSheetFragment.kt */
    /* renamed from: com.vk.auth.ui.fastlogin.a$a, reason: collision with other inner class name */
    public class C0417a implements alu0 {
        public C0417a() {
        }

        @Override // xsna.s25
        public final void n(AuthResult authResult) {
            a aVar = a.this;
            aVar.T = true;
            if (aVar.E) {
                aVar.tn();
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
        public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
        }

        @Override // xsna.s25
        @ozl
        public final void l(jq0 jq0Var) {
        }

        @Override // xsna.s25
        public final void r(t6v0 t6v0Var) {
        }

        @Override // xsna.s25
        public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
        }

        @Override // xsna.s25
        public final void j(long j, SignUpData signUpData) {
        }
    }
}
