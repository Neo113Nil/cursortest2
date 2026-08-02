package com.vk.auth.signup;

import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.urd0;

/* compiled from: VkAdditionalSignUpData.kt */
/* loaded from: classes.dex */
public final class VkAdditionalSignUpData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkAdditionalSignUpData> CREATOR = new a();
    public final List<SignUpField> b;
    public final List<SignUpField> c;
    public final String d;
    public final SignUpIncompleteFieldsModel e;
    public final VkAuthMetaInfo f;
    public final boolean g;
    public final SignUpAgreementInfo h;

    /* compiled from: Serializer.kt */
    /* loaded from: classes15.dex */
    public static final class a extends Serializer.c<VkAdditionalSignUpData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkAdditionalSignUpData a(Serializer serializer) {
            ArrayList D = serializer.D();
            ArrayList D2 = serializer.D();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new VkAdditionalSignUpData(D, D2, H, (SignUpIncompleteFieldsModel) serializer.A(SignUpIncompleteFieldsModel.class.getClassLoader()), (VkAuthMetaInfo) serializer.A(VkAuthMetaInfo.class.getClassLoader()), serializer.m(), (SignUpAgreementInfo) serializer.A(SignUpAgreementInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkAdditionalSignUpData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkAdditionalSignUpData(List<? extends SignUpField> list, List<? extends SignUpField> list2, String str, SignUpIncompleteFieldsModel signUpIncompleteFieldsModel, VkAuthMetaInfo vkAuthMetaInfo, boolean z, SignUpAgreementInfo signUpAgreementInfo) {
        this.b = list;
        this.c = list2;
        this.d = str;
        this.e = signUpIncompleteFieldsModel;
        this.f = vkAuthMetaInfo;
        this.g = z;
        this.h = signUpAgreementInfo;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.h0(this.b);
        serializer.h0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.e0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.e0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAdditionalSignUpData)) {
            return false;
        }
        VkAdditionalSignUpData vkAdditionalSignUpData = (VkAdditionalSignUpData) obj;
        return epx.f(this.b, vkAdditionalSignUpData.b) && epx.f(this.c, vkAdditionalSignUpData.c) && epx.f(this.d, vkAdditionalSignUpData.d) && epx.f(this.e, vkAdditionalSignUpData.e) && epx.f(this.f, vkAdditionalSignUpData.f) && this.g == vkAdditionalSignUpData.g && epx.f(this.h, vkAdditionalSignUpData.h);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel = this.e;
        int b = qoy.b((this.f.hashCode() + ((a2 + (signUpIncompleteFieldsModel == null ? 0 : signUpIncompleteFieldsModel.hashCode())) * 31)) * 31, 31, this.g);
        SignUpAgreementInfo signUpAgreementInfo = this.h;
        return b + (signUpAgreementInfo != null ? signUpAgreementInfo.hashCode() : 0);
    }

    public final String toString() {
        return "VkAdditionalSignUpData(signUpFields=" + this.b + ", signUpSkippableFields=" + this.c + ", sid=" + this.d + ", signUpIncompleteFieldsModel=" + this.e + ", authMetaInfo=" + this.f + ", isForceSignUp=" + this.g + ", signUpAgreementInfo=" + this.h + ')';
    }
}
