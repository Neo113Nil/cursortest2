package ru.ozon.app.android.analytics;

import Lm0.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/analytics/HashUtils;", "", "<init>", "()V", "", "str", "md5", "(Ljava/lang/String;)Ljava/lang/String;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HashUtils {

    @NotNull
    public static final HashUtils INSTANCE = new HashUtils();

    private HashUtils() {
    }

    @NotNull
    public final String md5(String str) {
        if (str == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                StringBuilder sb3 = new StringBuilder(Integer.toHexString(b11 & 255));
                while (sb3.length() < 2) {
                    sb3.insert(0, '0');
                }
                sb2.append((CharSequence) sb3);
            }
            String sb4 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
            return sb4;
        } catch (NoSuchAlgorithmException e11) {
            a.f17149a.w(e11);
            return "";
        }
    }
}
