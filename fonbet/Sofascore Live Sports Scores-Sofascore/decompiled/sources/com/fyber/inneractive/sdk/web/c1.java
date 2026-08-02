package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c1 {
    public static final Pattern g = Pattern.compile("max-age=(\\d+)");
    public static final SimpleDateFormat h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);
    public final byte[] a;
    public final Map b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    public c1(byte[] bArr, HashMap hashMap, String str, String str2, int i, String str3) {
        this.a = bArr;
        this.b = hashMap;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
    }

    public final boolean a() {
        boolean z;
        String str;
        if (TextUtils.isEmpty(this.f)) {
            return false;
        }
        loop0: while (true) {
            z = true;
            for (String str2 : this.b.keySet()) {
                if (!z) {
                    break loop0;
                }
                if (str2 == null || !str2.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null || !str2.equalsIgnoreCase("Vary")) {
                        if (str2 != null && str2.equalsIgnoreCase("Pragma")) {
                            String str3 = (String) this.b.get(str2);
                            if (str3 != null) {
                                z = !str3.equalsIgnoreCase("no-cache");
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase("Expires") && (str = (String) this.b.get(str2)) != null) {
                            try {
                                Date parse = h.parse(str);
                                if (parse != null && parse.getTime() + 3600000 > System.currentTimeMillis()) {
                                    break;
                                }
                            } catch (ParseException unused) {
                                continue;
                            }
                        }
                    }
                    z = false;
                } else {
                    String str4 = (String) this.b.get(str2);
                    if (str4 != null) {
                        Pattern pattern = g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str4.toLowerCase(locale));
                        int a = (matcher.find() && matcher.groupCount() == 1) ? com.fyber.inneractive.sdk.util.v.a(matcher.group(1), 0) : 0;
                        if ((str4.toLowerCase(locale).contains("public") || str4.toLowerCase(locale).contains("private") || a > 3600) && !str4.toLowerCase(locale).contains("no-") && !str4.toLowerCase(locale).contains("must-")) {
                            break;
                        }
                        z = false;
                    } else {
                        continue;
                    }
                }
            }
        }
        return z;
    }
}
