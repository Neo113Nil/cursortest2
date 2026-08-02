package gh;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class m {
    public static int a(String str, int i5, int i10, boolean z5) {
        while (i5 < i10) {
            char charAt = str.charAt(i5);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z5)) {
                return i5;
            }
            i5++;
        }
        return i10;
    }

    public static long b(int i5, String str) {
        int a7 = a(str, 0, i5, false);
        Matcher matcher = n.f10247n.matcher(str);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (a7 < i5) {
            int a10 = a(str, a7 + 1, i5, true);
            matcher.region(a7, a10);
            if (i11 == -1 && matcher.usePattern(n.f10247n).matches()) {
                String group = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group, "group(...)");
                i11 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(group2, "group(...)");
                i14 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                Intrinsics.checkNotNullExpressionValue(group3, "group(...)");
                i15 = Integer.parseInt(group3);
            } else if (i12 == -1 && matcher.usePattern(n.f10246m).matches()) {
                String group4 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group4, "group(...)");
                i12 = Integer.parseInt(group4);
            } else {
                if (i13 == -1) {
                    Pattern pattern = n.f10245l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group5, "group(...)");
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        String pattern2 = pattern.pattern();
                        Intrinsics.checkNotNullExpressionValue(pattern2, "pattern(...)");
                        i13 = StringsKt.G(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i10 == -1 && matcher.usePattern(n.f10244k).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, "group(...)");
                    i10 = Integer.parseInt(group6);
                }
            }
            a7 = a(str, a10 + 1, i5, false);
        }
        if (70 <= i10 && i10 < 100) {
            i10 += 1900;
        }
        if (i10 >= 0 && i10 < 70) {
            i10 += 2000;
        }
        if (i10 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i12 || i12 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0 || i11 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i15 < 0 || i15 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(hh.g.f10825a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i13 - 1);
        gregorianCalendar.set(5, i12);
        gregorianCalendar.set(11, i11);
        gregorianCalendar.set(12, i14);
        gregorianCalendar.set(13, i15);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
