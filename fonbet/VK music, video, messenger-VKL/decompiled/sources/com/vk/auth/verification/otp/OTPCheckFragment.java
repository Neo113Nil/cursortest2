package com.vk.auth.verification.otp;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.stats.VerificationStatStartedFromReg;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.api.states.VkAuthState;
import com.vkontakte.android.R;
import defpackage.q0;
import xsna.cp70;
import xsna.drm0;
import xsna.epx;
import xsna.f4m;
import xsna.jgz;
import xsna.jjc;
import xsna.ng3;
import xsna.oo10;
import xsna.qoy;
import xsna.ta6;
import xsna.uo70;
import xsna.urd0;
import xsna.vo70;
import xsna.wo70;
import xsna.z55;

/* compiled from: OTPCheckFragment.kt */
/* loaded from: classes15.dex */
public final class OTPCheckFragment extends ta6<uo70> implements vo70 {
    public oo10 R;

    /* compiled from: OTPCheckFragment.kt */
    public static final class AuthArgs implements Serializer.StreamParcelable {
        public static final Serializer.c<AuthArgs> CREATOR = new a();
        public final String b;
        public final VkAuthState c;
        public final String d;
        public final CodeState e;
        public final String f;
        public final boolean g;

        /* compiled from: OTPCheckFragment.kt */
        public static final class a extends Serializer.c<AuthArgs> {
            @Override // com.vk.core.serialize.Serializer.c
            public final AuthArgs a(Serializer serializer) {
                return new AuthArgs(serializer.H(), (VkAuthState) serializer.A(VkAuthState.class.getClassLoader()), serializer.H(), (CodeState) serializer.A(CodeState.class.getClassLoader()), serializer.H(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthArgs[i];
            }
        }

        public AuthArgs(String str, VkAuthState vkAuthState, String str2, CodeState codeState, String str3, boolean z) {
            this.b = str;
            this.c = vkAuthState;
            this.d = str2;
            this.e = codeState;
            this.f = str3;
            this.g = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.e0(this.c);
            serializer.j0(this.d);
            serializer.e0(this.e);
            serializer.j0(this.f);
            serializer.L(this.g ? (byte) 1 : (byte) 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthArgs)) {
                return false;
            }
            AuthArgs authArgs = (AuthArgs) obj;
            return epx.f(this.b, authArgs.b) && epx.f(this.c, authArgs.c) && epx.f(this.d, authArgs.d) && epx.f(this.e, authArgs.e) && epx.f(this.f, authArgs.f) && this.g == authArgs.g;
        }

        public final int hashCode() {
            int a2 = urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
            CodeState codeState = this.e;
            return Boolean.hashCode(this.g) + urd0.a((a2 + (codeState == null ? 0 : codeState.hashCode())) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthArgs(phoneMask=");
            sb.append(this.b);
            sb.append(", authState=");
            sb.append(this.c);
            sb.append(", validationSid=");
            sb.append(this.d);
            sb.append(", initialCodeState=");
            sb.append(this.e);
            sb.append(", deviceName=");
            sb.append(this.f);
            sb.append(", useLoginInRestore=");
            return q0.a(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: OTPCheckFragment.kt */
    public static final class ValidationArgs implements Serializer.StreamParcelable {
        public static final Serializer.c<ValidationArgs> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final CodeState f;
        public final boolean g;

        /* compiled from: OTPCheckFragment.kt */
        public static final class a extends Serializer.c<ValidationArgs> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ValidationArgs a(Serializer serializer) {
                return new ValidationArgs(serializer.H(), serializer.H(), serializer.H(), serializer.m(), (CodeState) serializer.A(CodeState.class.getClassLoader()), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ValidationArgs[i];
            }
        }

        public ValidationArgs(String str, String str2, String str3, boolean z, CodeState codeState, boolean z2) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = z;
            this.f = codeState;
            this.g = z2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.L(this.e ? (byte) 1 : (byte) 0);
            serializer.e0(this.f);
            serializer.L(this.g ? (byte) 1 : (byte) 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationArgs)) {
                return false;
            }
            ValidationArgs validationArgs = (ValidationArgs) obj;
            return epx.f(this.b, validationArgs.b) && epx.f(this.c, validationArgs.c) && epx.f(this.d, validationArgs.d) && this.e == validationArgs.e && epx.f(this.f, validationArgs.f) && this.g == validationArgs.g;
        }

        public final int hashCode() {
            String str = this.b;
            int b = qoy.b(urd0.a(urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e);
            CodeState codeState = this.f;
            return Boolean.hashCode(this.g) + ((b + (codeState != null ? codeState.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ValidationArgs(phone=");
            sb.append(this.b);
            sb.append(", phoneMask=");
            sb.append(this.c);
            sb.append(", validationSid=");
            sb.append(this.d);
            sb.append(", isAuth=");
            sb.append(this.e);
            sb.append(", initialCodeState=");
            sb.append(this.f);
            sb.append(", isFromDialog=");
            return q0.a(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: OTPCheckFragment.kt */
    public static final class a {
        public static Bundle a(AuthArgs authArgs) {
            VkAuthCredentials Ab;
            VkAuthState vkAuthState = authArgs.c;
            String str = null;
            if (authArgs.g && (Ab = vkAuthState.Ab()) != null) {
                str = Ab.b;
            }
            return ta6.a.a(authArgs.b, authArgs.d, new CheckPresenterInfo.Auth(vkAuthState), authArgs.e, authArgs.f, str, 0, false, null, false, null, 1920);
        }

        public static Bundle b(VerificationScreenData verificationScreenData, String str, CodeState codeState, boolean z) {
            VkAuthValidatePhoneResult vkAuthValidatePhoneResult;
            String str2 = verificationScreenData.c;
            if (drm0.N(str2) && ((vkAuthValidatePhoneResult = verificationScreenData.f) == null || (str2 = vkAuthValidatePhoneResult.l) == null)) {
                str2 = "";
            }
            return ta6.a.a(str2, str, new CheckPresenterInfo.PasswordLessAuth(verificationScreenData, z), codeState, null, null, 0, verificationScreenData.e, null, false, null, 1904);
        }

        public static Bundle c(VerificationScreenData verificationScreenData, String str, CodeState codeState, VerificationStatStartedFromReg verificationStatStartedFromReg, boolean z) {
            String str2;
            VkAuthValidatePhoneResult vkAuthValidatePhoneResult;
            String str3 = verificationScreenData.c;
            if (drm0.N(str3) && ((vkAuthValidatePhoneResult = verificationScreenData.f) == null || (str3 = vkAuthValidatePhoneResult.l) == null)) {
                str3 = "";
            }
            String str4 = str3;
            CheckPresenterInfo.SignUp signUp = new CheckPresenterInfo.SignUp(verificationScreenData, verificationStatStartedFromReg, z);
            boolean z2 = verificationScreenData.e;
            VkAuthValidatePhoneResult vkAuthValidatePhoneResult2 = verificationScreenData.f;
            return ta6.a.a(str4, str, signUp, codeState, (vkAuthValidatePhoneResult2 == null || (str2 = vkAuthValidatePhoneResult2.m) == null) ? "" : str2, null, 0, z2, null, false, null, 1888);
        }

        public static Bundle d(ValidationArgs validationArgs) {
            return ta6.a.a(validationArgs.c, validationArgs.d, new CheckPresenterInfo.Validation(validationArgs.b, validationArgs.e, null, validationArgs.g, 4, null), validationArgs.f, null, null, 0, false, null, false, null, 2032);
        }
    }

    @Override // xsna.ta6, com.vk.auth.verification.base.c
    public final void Ud(CodeState codeState, int i) {
        View view;
        Context context;
        String str;
        super.Ud(codeState, i);
        CodeState e = codeState.e();
        if (!(e instanceof CodeState.MaxMessengerWait)) {
            oo10 oo10Var = this.R;
            if (oo10Var == null || (view = oo10Var.d) == null) {
                return;
            }
            f4m.j(view);
            return;
        }
        oo10 oo10Var2 = this.R;
        if (oo10Var2 != null) {
            CodeState.MaxMessengerWait maxMessengerWait = (CodeState.MaxMessengerWait) e;
            if (oo10Var2.d == null) {
                ViewStub viewStub = oo10Var2.a;
                viewStub.setLayoutResource(R.layout.vk_auth_check_sign_up_max_messenger);
                View inflate = viewStub.inflate();
                oo10Var2.d = inflate;
                oo10Var2.e = inflate != null ? (TextView) inflate.findViewById(R.id.max_messenger_signup_subtitle) : null;
            }
            View view2 = oo10Var2.d;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = oo10Var2.d;
            if (view3 == null || (context = view3.getContext()) == null) {
                return;
            }
            String str2 = oo10Var2.b;
            if (str2 == null || (str = str2.replace(' ', (char) 160)) == null) {
                str = "";
            }
            String string = context.getString(R.string.vk_auth_max_messenger_sign_up_check_subtitle_format, str);
            TextView textView = oo10Var2.e;
            if (textView != null) {
                textView.setText(jgz.t(context, string, str));
            }
            View view4 = oo10Var2.d;
            Button button = view4 != null ? (Button) view4.findViewById(R.id.max_messenger_open_button) : null;
            if (button != null) {
                jjc.g(button, new ng3(25, oo10Var2, maxMessengerWait));
            }
        }
    }

    @Override // com.vk.auth.verification.base.c
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // xsna.ta6, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.max_messenger_stub);
        String str = this.s;
        if (str == null) {
            str = null;
        }
        this.R = new oo10(viewStub, str, this.K);
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        CodeState codeState = this.w;
        String str = this.u;
        if (str == null) {
            str = null;
        }
        CheckPresenterInfo checkPresenterInfo = this.v;
        if (checkPresenterInfo == null) {
            checkPresenterInfo = null;
        }
        return new cp70(codeState, bundle, str, checkPresenterInfo, new wo70(2, this, OTPCheckFragment.class, "startActivityForResult", "startActivityForResult(Landroid/content/Intent;I)V", 0));
    }

    @Override // xsna.ta6
    public final void yn() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((uo70) obj).y0(this);
    }
}
