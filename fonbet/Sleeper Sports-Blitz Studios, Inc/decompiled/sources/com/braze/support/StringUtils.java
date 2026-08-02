package com.braze.support;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.braze.enums.DataStoreKey;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
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
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001\u001a\"\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u001a\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0001\u001a\n\u0010\u001b\u001a\u00020\u001c*\u00020\u0001\u001a\u0012\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0013\u001a\n\u0010\u001f\u001a\u00020\u0001*\u00020\u0001\u001a \u0010 \u001a\u00020!*\u0004\u0018\u00010\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020!0#\u001a\u001c\u0010$\u001a\u00020\u00012\b\u0010%\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0005\"\u0016\u0010\n\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0005¨\u0006&"}, d2 = {"TAG", "", "NULL_USER_ID_SUBSTITUTE_STRING", "MD5_HASH_OF_THE_STRING_NULL", "getMD5_HASH_OF_THE_STRING_NULL$annotations", "()V", "CACHE_SUFFIX_PREFERENCES_FILE", "getCACHE_SUFFIX_PREFERENCES_FILE$annotations", "SUFFIX_CACHE_USER_ID_HASH_VALUE", "getSUFFIX_CACHE_USER_ID_HASH_VALUE$annotations", "SUFFIX_CACHE_USER_ID_KEY", "getSUFFIX_CACHE_USER_ID_KEY$annotations", "isNullOrEmpty", "", TypedValues.Custom.S_REFERENCE, "isNullOrBlank", "isBlank", "emptyToNull", "countOccurrences", "", "subString", "getCacheFileSuffix", "context", "Landroid/content/Context;", "userId", "apiKey", "getCacheMapKey", "getByteSize", "", "truncateToByteLength", "desiredByteLength", "getMd5Hash", "ifNonEmpty", "", "block", "Lkotlin/Function1;", "getSuffixFromUserIdHashAndApiKey", "userIdHash", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringUtils {
    public static final String CACHE_SUFFIX_PREFERENCES_FILE = "com.appboy.support.stringutils.cachefilesuffix";
    public static final String MD5_HASH_OF_THE_STRING_NULL = "37a6259cc0c1dae299a7866489dff0bd";
    private static final String NULL_USER_ID_SUBSTITUTE_STRING = "null";
    public static final String SUFFIX_CACHE_USER_ID_HASH_VALUE = "user_id_hash_value";
    public static final String SUFFIX_CACHE_USER_ID_KEY = "user_id_key";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("StringUtils");

    public static final int countOccurrences(String str, String subString) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(subString, "subString");
        return StringsKt.split$default((CharSequence) str, new String[]{subString}, false, 0, 6, (Object) null).size() - 1;
    }

    public static final String emptyToNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.isBlank(str)) {
            return null;
        }
        return str;
    }

    public static final long getByteSize(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "getBytes(...)");
        return r2.length;
    }

    public static /* synthetic */ void getCACHE_SUFFIX_PREFERENCES_FILE$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$1() {
        return "The saved user id hash was null or empty.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$2(String str, String str2) {
        return "Generating MD5 for user id: " + str + " apiKey: " + str2;
    }

    public static final String getCacheMapKey(String str, String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        if (str == null) {
            return apiKey;
        }
        return str + "_" + apiKey;
    }

    public static /* synthetic */ void getMD5_HASH_OF_THE_STRING_NULL$annotations() {
    }

    public static final String getMd5Hash(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        BigInteger bigInteger = new BigInteger(1, messageDigest.digest(bytes));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{bigInteger}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static /* synthetic */ void getSUFFIX_CACHE_USER_ID_HASH_VALUE$annotations() {
    }

    public static /* synthetic */ void getSUFFIX_CACHE_USER_ID_KEY$annotations() {
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

    public static final boolean isBlank(String str) {
        if (str != null) {
            return StringsKt.isBlank(str);
        }
        return false;
    }

    public static final boolean isNullOrBlank(String str) {
        return str == null || StringsKt.isBlank(str);
    }

    public static final boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static final String truncateToByteLength(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (getByteSize(str) <= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        int i2 = 0;
        for (char c : charArray) {
            i2 += (int) getByteSize(String.valueOf(c));
            if (i2 > i) {
                break;
            }
            sb.append(c);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final String getCacheFileSuffix(Context context, String str, final String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        final String str3 = str == null ? "null" : str;
        if (Intrinsics.areEqual(str3, "null")) {
            return getSuffixFromUserIdHashAndApiKey(MD5_HASH_OF_THE_STRING_NULL, str2);
        }
        i3 i3Var = new i3(context);
        DataStoreKey dataStoreKey = DataStoreKey.SUFFIX_CACHE_USER_ID_KEY;
        String readString = i3Var.readString(dataStoreKey, null);
        if (readString != null && Intrinsics.areEqual(readString, str3)) {
            String readString2 = i3Var.readString(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, null);
            if (readString2 != null && readString2.length() != 0) {
                return getSuffixFromUserIdHashAndApiKey(readString2, str2);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.StringUtils$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String cacheFileSuffix$lambda$1;
                    cacheFileSuffix$lambda$1 = StringUtils.getCacheFileSuffix$lambda$1();
                    return cacheFileSuffix$lambda$1;
                }
            }, 14, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.support.StringUtils$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String cacheFileSuffix$lambda$2;
                cacheFileSuffix$lambda$2 = StringUtils.getCacheFileSuffix$lambda$2(str3, str2);
                return cacheFileSuffix$lambda$2;
            }
        }, 12, (Object) null);
        String md5Hash = getMd5Hash(str3);
        i3Var.writeData(dataStoreKey, str3);
        i3Var.writeData(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, md5Hash);
        return getSuffixFromUserIdHashAndApiKey(md5Hash, str2);
    }

    public static final String getCacheFileSuffix(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCacheFileSuffix(context, str, null);
    }
}
