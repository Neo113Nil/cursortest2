package com.vk.auth.utils;

import android.content.Context;
import com.ironsource.Gc;
import io.michaelrocks.libphonenumber.android.a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.asp;
import xsna.brm0;
import xsna.e43;
import xsna.f3a0;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: VkPhoneFormatUtils.kt */
/* loaded from: classes15.dex */
public final class VkPhoneFormatUtils {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPhoneFormatUtils.kt */
    public static final class PhoneFormatterMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PhoneFormatterMode[] $VALUES;
        public static final PhoneFormatterMode DEFAULT;
        public static final PhoneFormatterMode RUSSIAN_SPECIFIC;
        private final List<String> countryCodes;
        private final String replaceWith;

        static {
            PhoneFormatterMode phoneFormatterMode = new PhoneFormatterMode("DEFAULT", 0, EmptyList.b, "");
            DEFAULT = phoneFormatterMode;
            PhoneFormatterMode phoneFormatterMode2 = new PhoneFormatterMode("RUSSIAN_SPECIFIC", 1, e43.l(Gc.e, "8"), "+7");
            RUSSIAN_SPECIFIC = phoneFormatterMode2;
            PhoneFormatterMode[] phoneFormatterModeArr = {phoneFormatterMode, phoneFormatterMode2};
            $VALUES = phoneFormatterModeArr;
            $ENTRIES = new asp(phoneFormatterModeArr);
        }

        public PhoneFormatterMode(String str, int i, List list, String str2) {
            this.countryCodes = list;
            this.replaceWith = str2;
        }

        public static PhoneFormatterMode valueOf(String str) {
            return (PhoneFormatterMode) Enum.valueOf(PhoneFormatterMode.class, str);
        }

        public static PhoneFormatterMode[] values() {
            return (PhoneFormatterMode[]) $VALUES.clone();
        }

        public final List<String> h() {
            return this.countryCodes;
        }

        public final String i() {
            return this.replaceWith;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(Context context, String str, a aVar, PhoneFormatterMode phoneFormatterMode, int i) {
        T t;
        if ((i & 4) != 0) {
            aVar = new a(f3a0.a.a(context), "");
        }
        boolean z = (i & 8) == 0;
        if ((i & 16) != 0) {
            phoneFormatterMode = PhoneFormatterMode.DEFAULT;
        }
        Iterator<T> it = phoneFormatterMode.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (brm0.B(str, str2, false)) {
                str = brm0.A(str, str2, phoneFormatterMode.i());
                break;
            }
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        for (int i2 = 0; i2 < str.length(); i2++) {
            try {
                char charAt = str.charAt(i2);
                if (Character.isDigit(charAt) || charAt == '+') {
                    try {
                        t = aVar.i(charAt);
                    } catch (Throwable unused) {
                        t = 0;
                    }
                    if (t == 0) {
                        if (!z) {
                            return str;
                        }
                        aVar.f();
                        s3q0 s3q0Var = s3q0.a;
                        return str;
                    }
                    ref$ObjectRef.element = t;
                }
            } catch (Throwable th) {
                if (z) {
                    try {
                        aVar.f();
                        s3q0 s3q0Var2 = s3q0.a;
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        }
        if (z) {
            try {
                aVar.f();
                s3q0 s3q0Var3 = s3q0.a;
            } catch (Throwable unused3) {
            }
        }
        return (String) ref$ObjectRef.element;
    }
}
