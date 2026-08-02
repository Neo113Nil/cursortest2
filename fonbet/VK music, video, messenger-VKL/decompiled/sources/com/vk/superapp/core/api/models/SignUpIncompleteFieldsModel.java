package com.vk.superapp.core.api.models;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.core.api.models.VkGender;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: SignUpIncompleteFieldsModel.kt */
/* loaded from: classes6.dex */
public final class SignUpIncompleteFieldsModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SignUpIncompleteFieldsModel> CREATOR = new b();
    public final SignUpIncompleteBirthday b;
    public final String c;
    public final String d;
    public final String e;
    public final VkGender f;
    public final String g;

    /* compiled from: SignUpIncompleteFieldsModel.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static SignUpIncompleteFieldsModel a(JSONObject jSONObject) {
            SignUpIncompleteBirthday signUpIncompleteBirthday;
            String str;
            String optString;
            JSONObject optJSONObject;
            if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("birthday")) == null) {
                signUpIncompleteBirthday = null;
            } else {
                Serializer.c<SignUpIncompleteBirthday> cVar = SignUpIncompleteBirthday.CREATOR;
                int optInt = optJSONObject.optInt("day", -1);
                Integer valueOf = Integer.valueOf(optInt);
                if (optInt == -1) {
                    valueOf = null;
                }
                int optInt2 = optJSONObject.optInt("month", -1);
                Integer valueOf2 = Integer.valueOf(optInt2);
                if (optInt2 == -1) {
                    valueOf2 = null;
                }
                int optInt3 = optJSONObject.optInt("year", -1);
                Integer valueOf3 = Integer.valueOf(optInt3);
                if (optInt3 == -1) {
                    valueOf3 = null;
                }
                signUpIncompleteBirthday = new SignUpIncompleteBirthday(valueOf, valueOf2, valueOf3);
            }
            String optString2 = jSONObject != null ? jSONObject.optString("avatar") : null;
            if (jSONObject == null || (optString = jSONObject.optString("name", null)) == null) {
                if (jSONObject == null) {
                    str = null;
                    String optString3 = jSONObject == null ? jSONObject.optString("last_name") : null;
                    VkGender.a aVar = VkGender.Companion;
                    Integer valueOf4 = jSONObject == null ? Integer.valueOf(jSONObject.optInt("gender", 0)) : null;
                    aVar.getClass();
                    return new SignUpIncompleteFieldsModel(signUpIncompleteBirthday, optString2, str, optString3, VkGender.a.a(valueOf4), jSONObject != null ? jSONObject.optString("email") : null);
                }
                optString = jSONObject.optString("first_name");
            }
            str = optString;
            if (jSONObject == null) {
            }
            VkGender.a aVar2 = VkGender.Companion;
            if (jSONObject == null) {
            }
            aVar2.getClass();
            return new SignUpIncompleteFieldsModel(signUpIncompleteBirthday, optString2, str, optString3, VkGender.a.a(valueOf4), jSONObject != null ? jSONObject.optString("email") : null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<SignUpIncompleteFieldsModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SignUpIncompleteFieldsModel a(Serializer serializer) {
            SignUpIncompleteBirthday signUpIncompleteBirthday = (SignUpIncompleteBirthday) serializer.G(SignUpIncompleteBirthday.class.getClassLoader());
            String H = serializer.H();
            String H2 = serializer.H();
            String H3 = serializer.H();
            VkGender.a aVar = VkGender.Companion;
            String H4 = serializer.H();
            aVar.getClass();
            return new SignUpIncompleteFieldsModel(signUpIncompleteBirthday, H, H2, H3, VkGender.a.b(H4), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignUpIncompleteFieldsModel[i];
        }
    }

    public SignUpIncompleteFieldsModel(SignUpIncompleteBirthday signUpIncompleteBirthday, String str, String str2, String str3, VkGender vkGender, String str4) {
        this.b = signUpIncompleteBirthday;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = vkGender;
        this.g = str4;
    }

    public final boolean Ab() {
        return (this.b == null && this.c == null && this.d == null && this.e == null && this.f == VkGender.UNDEFINED) ? false : true;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f.i());
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpIncompleteFieldsModel)) {
            return false;
        }
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel = (SignUpIncompleteFieldsModel) obj;
        return epx.f(this.b, signUpIncompleteFieldsModel.b) && epx.f(this.c, signUpIncompleteFieldsModel.c) && epx.f(this.d, signUpIncompleteFieldsModel.d) && epx.f(this.e, signUpIncompleteFieldsModel.e) && this.f == signUpIncompleteFieldsModel.f && epx.f(this.g, signUpIncompleteFieldsModel.g);
    }

    public final int hashCode() {
        SignUpIncompleteBirthday signUpIncompleteBirthday = this.b;
        int hashCode = (signUpIncompleteBirthday == null ? 0 : signUpIncompleteBirthday.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (this.f.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignUpIncompleteFieldsModel(birthday=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        sb.append(this.c);
        sb.append(", firstName=");
        sb.append(this.d);
        sb.append(", lastName=");
        sb.append(this.e);
        sb.append(", gender=");
        sb.append(this.f);
        sb.append(", email=");
        return ho8.a(sb, this.g, ')');
    }

    public final String zb() {
        return this.g;
    }
}
