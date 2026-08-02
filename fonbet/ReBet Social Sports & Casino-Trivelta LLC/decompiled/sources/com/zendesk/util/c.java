package com.zendesk.util;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f42386a = Arrays.asList("he", "yi", StackTraceHelper.ID_KEY);

    public static String a(Locale locale) {
        if (locale == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(locale.getLanguage());
        if (d.a(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry().toLowerCase(Locale.US));
        }
        return sb2.toString();
    }
}
