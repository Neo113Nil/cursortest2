package com.braze.support;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.r;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0017\u001a\u00020\u0015*\u0004\u0018\u00010\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "reference", "", "isNullOrBlank", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "userId", "apiKey", "getCacheFileSuffix", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getByteSize", "(Ljava/lang/String;)J", "", "desiredByteLength", "truncateToByteLength", "(Ljava/lang/String;I)Ljava/lang/String;", "getMd5Hash", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "", "block", "ifNonEmpty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "userIdHash", "getSuffixFromUserIdHashAndApiKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class StringUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("StringUtils");

    public static final long getByteSize(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "getBytes(...)");
        return r2.length;
    }

    public static final String getCacheFileSuffix(Context context, String str, final String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        final String str3 = str == null ? "null" : str;
        if (Intrinsics.areEqual(str3, "null")) {
            return getSuffixFromUserIdHashAndApiKey("37a6259cc0c1dae299a7866489dff0bd", str2);
        }
        r rVar = new r(context);
        DataStoreKey dataStoreKey = DataStoreKey.SUFFIX_CACHE_USER_ID_KEY;
        String readString = rVar.readString(dataStoreKey, null);
        if (readString != null && Intrinsics.areEqual(readString, str3)) {
            String readString2 = rVar.readString(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, null);
            if (readString2 != null && readString2.length() != 0) {
                return getSuffixFromUserIdHashAndApiKey(readString2, str2);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String cacheFileSuffix$lambda$0;
                    cacheFileSuffix$lambda$0 = StringUtils.getCacheFileSuffix$lambda$0();
                    return cacheFileSuffix$lambda$0;
                }
            }, 14, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: Y3.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String cacheFileSuffix$lambda$1;
                cacheFileSuffix$lambda$1 = StringUtils.getCacheFileSuffix$lambda$1(str3, str2);
                return cacheFileSuffix$lambda$1;
            }
        }, 12, (Object) null);
        String md5Hash = getMd5Hash(str3);
        rVar.writeData(dataStoreKey, str3);
        rVar.writeData(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, md5Hash);
        return getSuffixFromUserIdHashAndApiKey(md5Hash, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$0() {
        return "The saved user id hash was null or empty.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$1(String str, String str2) {
        return "Generating MD5 for user id: " + str + " apiKey: " + str2;
    }

    public static final String getMd5Hash(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        BigInteger bigInteger = new BigInteger(1, messageDigest.digest(bytes));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{bigInteger}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private static final String getSuffixFromUserIdHashAndApiKey(String str, String str2) {
        if (str2 == null || StringsKt.isBlank(str2)) {
            return "." + str;
        }
        return "." + str + "." + str2;
    }

    public static final void ifNonEmpty(String str, Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (str == null || str.length() == 0) {
            return;
        }
        block.invoke(str);
    }

    public static final boolean isNullOrBlank(String str) {
        return str == null || StringsKt.isBlank(str);
    }

    public static final String truncateToByteLength(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (getByteSize(str) <= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        int i11 = 0;
        for (char c10 : charArray) {
            i11 += (int) getByteSize(String.valueOf(c10));
            if (i11 > i10) {
                break;
            }
            sb2.append(c10);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
