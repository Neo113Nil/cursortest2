package com.vk.id.internal.auth.app;

import Ca.C2736d;
import T7.E;
import V.e;
import android.content.pm.Signature;
import android.util.Base64;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oa.C8678a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J.\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u000eH\u0002J$\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lcom/vk/id/internal/auth/app/SilentAuthInfoUtils;", "", "<init>", "()V", "calculateDigestHex", "", "packageManager", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "pkg", "calculateDigestBase64", "signature", "Landroid/content/pm/Signature;", "calculateDigest", "transform", "Lkotlin/Function1;", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SilentAuthInfoUtils {

    @NotNull
    public static final SilentAuthInfoUtils INSTANCE = new SilentAuthInfoUtils();

    private SilentAuthInfoUtils() {
    }

    private final String calculateDigest(InternalVKIDPackageManager packageManager, String pkg, Function1<? super Signature, String> transform) {
        try {
            Signature[] signatures = packageManager.getPackageInfo(pkg, 64).signatures;
            Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
            Signature signature = (Signature) C7705l.F(signatures);
            if (signature != null) {
                return transform.invoke(signature);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateDigestBase64$lambda$0(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        String encodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateDigestHex$lambda$1(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        String b11 = e.b(new Object[]{new BigInteger(1, bytes)}, 1, E.a(bytes.length << 1, "%0", "X"), "format(...)");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = b11.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public final String calculateDigestBase64(@NotNull Signature signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        return calculateDigest(signature, new C8678a(0));
    }

    public final String calculateDigestHex(@NotNull InternalVKIDPackageManager packageManager, @NotNull String pkg) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        return calculateDigest(packageManager, pkg, new SilentAuthInfoUtils$calculateDigestHex$1(INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calculateDigestHex(Signature signature) {
        return calculateDigest(signature, new C2736d(1));
    }

    private final String calculateDigest(Signature signature, Function1<? super byte[], String> transform) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA");
        messageDigest.update(signature.toByteArray());
        Object digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return transform.invoke(digest);
    }
}
