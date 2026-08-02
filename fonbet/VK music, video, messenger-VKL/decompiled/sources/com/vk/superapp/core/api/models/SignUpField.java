package com.vk.superapp.core.api.models;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.e43;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SignUpField.kt */
/* loaded from: classes11.dex */
public final class SignUpField {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SignUpField[] $VALUES;
    public static final SignUpField AVATAR;
    public static final SignUpField BIRTHDAY;
    public static final a Companion;
    private static final List<SignUpField> DEFAULT;
    public static final SignUpField EMAIL;
    public static final SignUpField FIRST_LAST_NAME;
    public static final SignUpField GENDER;
    public static final SignUpField NAME;
    public static final SignUpField PASSWORD;
    private final String jsonValue;

    /* compiled from: SignUpField.kt */
    public static final class a {
        public static SignUpField a(String str) {
            for (SignUpField signUpField : SignUpField.values()) {
                if (epx.f(signUpField.i(), str)) {
                    return signUpField;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public static ArrayList b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(a(jSONArray.getString(i)));
            }
            return arrayList;
        }
    }

    static {
        SignUpField signUpField = new SignUpField("NAME", 0, "name");
        NAME = signUpField;
        SignUpField signUpField2 = new SignUpField("FIRST_LAST_NAME", 1, "full_name");
        FIRST_LAST_NAME = signUpField2;
        SignUpField signUpField3 = new SignUpField("BIRTHDAY", 2, "birthday");
        BIRTHDAY = signUpField3;
        SignUpField signUpField4 = new SignUpField("AVATAR", 3, "avatar");
        AVATAR = signUpField4;
        SignUpField signUpField5 = new SignUpField(CommonConstant.RETKEY.GENDER, 4, "gender");
        GENDER = signUpField5;
        SignUpField signUpField6 = new SignUpField("PASSWORD", 5, LoginApiConstants.PARAM_NAME_PASSWORD);
        PASSWORD = signUpField6;
        SignUpField signUpField7 = new SignUpField(CommonConstant.RETKEY.EMAIL, 6, "email");
        EMAIL = signUpField7;
        SignUpField[] signUpFieldArr = {signUpField, signUpField2, signUpField3, signUpField4, signUpField5, signUpField6, signUpField7};
        $VALUES = signUpFieldArr;
        $ENTRIES = new asp(signUpFieldArr);
        Companion = new a();
        DEFAULT = e43.l(signUpField2, signUpField3, signUpField4, signUpField5, signUpField6);
    }

    public SignUpField(String str, int i, String str2) {
        this.jsonValue = str2;
    }

    public static SignUpField valueOf(String str) {
        return (SignUpField) Enum.valueOf(SignUpField.class, str);
    }

    public static SignUpField[] values() {
        return (SignUpField[]) $VALUES.clone();
    }

    public final String i() {
        return this.jsonValue;
    }
}
