package d70;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import l70.C7892a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Regex f61216a = new Regex("^\\+?[78]?\\d{10}$");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Regex f61217b = new Regex("^\\+?\\d?\\d?\\d{11}$");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f61218c = 0;

    @NotNull
    public static final String a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public static final List b(@NotNull String extractedSearch, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(extractedSearch, "extractedSearch");
        Intrinsics.checkNotNullParameter(extractedSearch, "<this>");
        String X9 = kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(extractedSearch, "(", "", false), ")", "", false), "+", "", false);
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            C7892a c7892a = (C7892a) obj;
            if (kotlin.text.h.e0(c7892a.a(), extractedSearch, true) || kotlin.text.h.e0(c7892a.d(), extractedSearch, true) || kotlin.text.h.e0(c7892a.d(), X9, true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            C7892a c7892a2 = (C7892a) obj2;
            String lowerCase = c7892a2.a().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (kotlin.text.h.t(lowerCase, extractedSearch, true) || kotlin.text.h.t(c7892a2.d(), extractedSearch, true) || kotlin.text.h.t(c7892a2.d(), X9, true)) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(arrayList);
        linkedHashSet.addAll(arrayList2);
        return C7714v.U0(linkedHashSet);
    }

    @NotNull
    public static final String c(long j11) {
        try {
            return Instant.ofEpochMilli(j11).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("d MMMM, HH:mm", Locale.getDefault()));
        } catch (Exception unused) {
            return "";
        }
    }

    @NotNull
    public static final String d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.h.b0(C7714v.V(kotlin.text.h.r(3, kotlin.text.h.b0(str).toString()), " ", null, null, null, 62)).toString();
    }

    public static final boolean e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f61217b.f(str);
    }

    public static final boolean f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f61216a.f(str);
    }

    @NotNull
    public static final String g(int i11) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormatSymbols.setDecimalSeparator(',');
        String format = new DecimalFormat("#,##0.##", decimalFormatSymbols).format(new BigDecimal(i11).movePointLeft(2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public static final String h(long j11) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormatSymbols.setDecimalSeparator(',');
        String format = new DecimalFormat("#,##0.##", decimalFormatSymbols).format(new BigDecimal(j11).movePointLeft(2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
