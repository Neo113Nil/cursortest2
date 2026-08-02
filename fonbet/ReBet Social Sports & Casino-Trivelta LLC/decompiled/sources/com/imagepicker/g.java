package com.imagepicker;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public String f39021a;

    /* renamed from: b, reason: collision with root package name */
    public int f39022b;

    /* renamed from: c, reason: collision with root package name */
    public int f39023c;

    public String a(String str, String str2) {
        try {
            Locale locale = Locale.US;
            Date parse = new SimpleDateFormat(str2, locale).parse(str);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
            if (parse != null) {
                return simpleDateFormat.format(parse);
            }
            return null;
        } catch (Exception e10) {
            Log.e("RNIP", "Could not parse image datetime to UTC: " + e10.getMessage());
            return null;
        }
    }
}
