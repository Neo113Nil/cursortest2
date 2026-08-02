package org.chromium.base;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f78551a = Pattern.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f78552b = Pattern.compile("^(?:Caused by: )?java\\.lang\\.(?:ClassNotFoundException|NoClassDefFoundError):|(?:[\"' ]/(?:apex|data|mnt|proc|sdcard|storage|system))/");

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f78553c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f78554d;

    static {
        Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
        Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
        f78553c = new String[]{"org.chromium.", "com.google.", "com.chrome."};
        f78554d = new String[]{"android.", "c2.", "com.android.", "dalvik.", "java.", "javax.", "omx.", "OMX.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull.", "System."};
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("\\n");
        for (int i11 = 0; i11 < split.length; i11++) {
            if (!split[i11].startsWith("\tat ")) {
                String str2 = split[i11];
                if (!f78552b.matcher(str2).find()) {
                    StringBuilder sb2 = new StringBuilder(str2);
                    Pattern pattern = f78551a;
                    Matcher matcher = pattern.matcher(sb2);
                    int i12 = 0;
                    while (matcher.find(i12)) {
                        int start = matcher.start();
                        int end = matcher.end();
                        String substring = sb2.substring(start, end);
                        String[] strArr = f78553c;
                        int length = strArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 < length) {
                                if (substring.startsWith(strArr[i13])) {
                                    break;
                                }
                                i13++;
                            } else if (!substring.startsWith("chromium-") || (!substring.endsWith(".apk") && !substring.endsWith(".aab"))) {
                                String[] strArr2 = f78554d;
                                int length2 = strArr2.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= length2) {
                                        try {
                                            Class.forName(substring, false, e.b().getClassLoader());
                                            break;
                                        } catch (Throwable unused) {
                                            int lastIndexOf = substring.lastIndexOf(".");
                                            if (lastIndexOf != -1) {
                                                try {
                                                    Class.forName(substring.substring(0, lastIndexOf), false, e.b().getClassLoader());
                                                } catch (Throwable unused2) {
                                                    sb2.replace(start, end, "HTTP://WEBADDRESS.ELIDED");
                                                    i12 = start + 24;
                                                    matcher = pattern.matcher(sb2);
                                                }
                                            }
                                            sb2.replace(start, end, "HTTP://WEBADDRESS.ELIDED");
                                            i12 = start + 24;
                                            matcher = pattern.matcher(sb2);
                                        }
                                    } else {
                                        if (substring.startsWith(strArr2[i14])) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                            }
                        }
                        i12 = end;
                    }
                    str2 = sb2.toString();
                }
                split[i11] = str2;
            }
        }
        return TextUtils.join("\n", split);
    }
}
