package com.appsflyer.internal;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/StringExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,102:1\n13004#2,3:103\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/StringExtensionsKt\n*L\n44#1:103,3\n*E\n"})
/* loaded from: classes.dex */
public final class AFd1rSDK {
    public static final String AFAdRevenueData(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = "";
        for (byte b10 : digest) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            str3 = r4.k.l(str3, format);
        }
        return str3;
    }

    @NotNull
    public static final String getCurrencyIso4217Code(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    @Nullable
    public static final Pair<Integer, Integer> getMonetizationNetwork(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.n c2 = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").c(str);
        if (c2 != null) {
            kotlin.text.m mVar = c2.f19282c;
            MatchGroup a7 = mVar.a(1);
            Integer intOrNull = (a7 == null || (str7 = a7.f19244a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup a10 = mVar.a(2);
            Integer intOrNull2 = (a10 == null || (str6 = a10.f19244a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup a11 = mVar.a(3);
            Integer intOrNull3 = (a11 == null || (str5 = a11.f19244a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup a12 = mVar.a(4);
            Integer intOrNull4 = (a12 == null || (str4 = a12.f19244a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup a13 = mVar.a(5);
            Integer intOrNull5 = (a13 == null || (str3 = a13.f19244a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup a14 = mVar.a(6);
            Integer intOrNull6 = (a14 == null || (str2 = a14.f19244a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (AFAdRevenueData(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.checkNotNull(intOrNull);
                int intValue = intOrNull.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull2);
                int intValue2 = (intOrNull2.intValue() * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + intValue;
                Intrinsics.checkNotNull(intOrNull3);
                Integer valueOf = Integer.valueOf(intOrNull3.intValue() + intValue2);
                Intrinsics.checkNotNull(intOrNull4);
                int intValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull5);
                int intValue4 = (intOrNull5.intValue() * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + intValue3;
                Intrinsics.checkNotNull(intOrNull6);
                return new Pair<>(valueOf, Integer.valueOf(intOrNull6.intValue() + intValue4));
            }
        }
        return null;
    }

    @Nullable
    public static final Pair<Integer, Integer> AFAdRevenueData(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.n c2 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").c(str);
        if (c2 != null) {
            kotlin.text.m mVar = c2.f19282c;
            MatchGroup a7 = mVar.a(1);
            Integer intOrNull = (a7 == null || (str4 = a7.f19244a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup a10 = mVar.a(3);
            Integer intOrNull2 = (a10 == null || (str3 = a10.f19244a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup a11 = mVar.a(4);
            Integer intOrNull3 = (a11 == null || (str2 = a11.f19244a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    private static boolean AFAdRevenueData(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !p.p(objArr, null);
    }
}
