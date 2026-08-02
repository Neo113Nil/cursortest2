package com.vk.permission;

import android.os.Bundle;
import xsna.bo8;

/* compiled from: GdprRationaleDialogFragment.kt */
/* loaded from: classes4.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String[] e;
    public final Integer f;

    /* compiled from: GdprRationaleDialogFragment.kt */
    public static final class a {
        public static b a(Bundle bundle) {
            String string = bundle.getString("arg_rationale_text");
            if (string == null) {
                throw new IllegalArgumentException("Rational required.");
            }
            String string2 = bundle.getString("arg_positive_button_text");
            if (string2 == null) {
                throw new IllegalArgumentException("Positive button text required.");
            }
            String string3 = bundle.getString("arg_negative_button_text");
            if (string3 == null) {
                throw new IllegalArgumentException("Negative button text required.");
            }
            int i = bundle.getInt("arg_request_code");
            String[] stringArray = bundle.getStringArray("arg_permissions");
            if (stringArray != null) {
                return new b(string, string2, string3, i, stringArray, bo8.d(bundle, "arg_theme_id"));
            }
            throw new IllegalArgumentException("Permissions required.");
        }
    }

    public b(String str, String str2, String str3, int i, String[] strArr, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = strArr;
        this.f = num;
    }
}
