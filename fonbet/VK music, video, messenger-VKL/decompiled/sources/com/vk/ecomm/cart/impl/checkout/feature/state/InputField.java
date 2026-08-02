package com.vk.ecomm.cart.impl.checkout.feature.state;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.ecomm.cart.impl.checkout.feature.state.k;
import kotlin.text.Regex;
import xsna.asp;
import xsna.b7r;
import xsna.epx;
import xsna.f060;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class InputField extends b7r implements f060 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Regex g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final InputType n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutFields.kt */
    public static final class InputType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final a Companion;
        public static final InputType EMAIL;
        public static final InputType NUMBER;
        public static final InputType PHONE;
        public static final InputType TEXT;
        public static final InputType TEXTAREA;
        private final String value;

        /* compiled from: CheckoutFields.kt */
        public static final class a {
        }

        static {
            InputType inputType = new InputType("TEXT", 0, "text");
            TEXT = inputType;
            InputType inputType2 = new InputType("TEXTAREA", 1, "textarea");
            TEXTAREA = inputType2;
            InputType inputType3 = new InputType("NUMBER", 2, "number");
            NUMBER = inputType3;
            InputType inputType4 = new InputType("PHONE", 3, "phone");
            PHONE = inputType4;
            InputType inputType5 = new InputType(CommonConstant.RETKEY.EMAIL, 4, "email");
            EMAIL = inputType5;
            InputType[] inputTypeArr = {inputType, inputType2, inputType3, inputType4, inputType5};
            $VALUES = inputTypeArr;
            $ENTRIES = new asp(inputTypeArr);
            Companion = new a();
        }

        public InputType(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<InputType> h() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    public InputField(String str, boolean z, boolean z2, String str2, String str3, String str4, Regex regex, String str5, String str6, String str7, String str8, boolean z3, String str9, InputType inputType) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = regex;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = z3;
        this.m = str9;
        this.n = inputType;
    }

    public static InputField d(InputField inputField, String str, String str2, int i) {
        String str3 = inputField.a;
        boolean z = inputField.b;
        boolean z2 = inputField.c;
        String str4 = inputField.d;
        String str5 = inputField.e;
        String str6 = inputField.f;
        Regex regex = inputField.g;
        String str7 = (i & 128) != 0 ? inputField.h : str;
        String str8 = (i & 512) != 0 ? inputField.j : null;
        String str9 = inputField.k;
        boolean z3 = inputField.l;
        String str10 = inputField.m;
        InputType inputType = inputField.n;
        inputField.getClass();
        return new InputField(str3, z, z2, str4, str5, str6, regex, str7, str2, str8, str9, z3, str10, inputType);
    }

    @Override // xsna.f060
    public final k a() {
        Regex regex;
        boolean z = this.c;
        String str = this.h;
        return (z && (str == null || str.length() == 0)) ? new k.a(d(this, null, this.e, 16127)) : (str == null || str.length() == 0 || (regex = this.g) == null || regex.f(str)) ? k.b.a : new k.a(d(this, null, this.f, 16127));
    }

    @Override // xsna.b7r
    public final boolean b() {
        return this.b;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputField)) {
            return false;
        }
        InputField inputField = (InputField) obj;
        return epx.f(this.a, inputField.a) && this.b == inputField.b && this.c == inputField.c && epx.f(this.d, inputField.d) && epx.f(this.e, inputField.e) && epx.f(this.f, inputField.f) && epx.f(this.g, inputField.g) && epx.f(this.h, inputField.h) && epx.f(this.i, inputField.i) && epx.f(this.j, inputField.j) && epx.f(this.k, inputField.k) && this.l == inputField.l && epx.f(this.m, inputField.m) && this.n == inputField.n;
    }

    public final int hashCode() {
        int a = urd0.a(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Regex regex = this.g;
        int hashCode3 = (hashCode2 + (regex == null ? 0 : regex.hashCode())) * 31;
        String str3 = this.h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int b = qoy.b((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.l);
        String str7 = this.m;
        int hashCode7 = (b + (str7 == null ? 0 : str7.hashCode())) * 31;
        InputType inputType = this.n;
        return hashCode7 + (inputType != null ? inputType.hashCode() : 0);
    }

    public final String toString() {
        return "InputField(id=" + this.a + ", affectsPrice=" + this.b + ", isRequired=" + this.c + ", label=" + this.d + ", requiredErrorMsg=" + this.e + ", validationErrorMsg=" + this.f + ", validationRegex=" + this.g + ", value=" + this.h + ", error=" + this.i + ", success=" + this.j + ", placeholder=" + this.k + ", isSingleLine=" + this.l + ", actionLabel=" + this.m + ", inputType=" + this.n + ')';
    }

    public /* synthetic */ InputField(String str, boolean z, boolean z2, String str2, String str3, String str4, Regex regex, String str5, String str6, String str7, String str8, boolean z3, String str9, InputType inputType, int i) {
        this(str, z, z2, str2, str3, str4, regex, str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, str8, z3, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : inputType);
    }
}
