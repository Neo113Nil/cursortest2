package com.vk.id.internal.auth.pkce;

import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/vk/id/internal/auth/pkce/PkceGeneratorSHA256;", "", "<init>", "()V", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "generateRandomCodeVerifier", "", "entropySource", "Ljava/security/SecureRandom;", "deriveCodeVerifierChallenge", "codeVerifier", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PkceGeneratorSHA256 {

    @NotNull
    private final InternalVKIDLogger logger;
    public static final int $stable = 8;

    public PkceGeneratorSHA256() {
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("PkceGeneratorSHA256", "getSimpleName(...)");
        this.logger = internalVKIDLog.createLoggerForTag("PkceGeneratorSHA256");
    }

    @NotNull
    public final String deriveCodeVerifierChallenge(@NotNull String codeVerifier) {
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset forName = Charset.forName("ISO_8859_1");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            byte[] bytes = codeVerifier.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (UnsupportedEncodingException e11) {
            this.logger.error("Can't encode codeVerifier", e11);
            throw new IllegalStateException("ISO_8859_1 encoding not supported", e11);
        } catch (NoSuchAlgorithmException e12) {
            this.logger.error("SHA-256 algorithm not available", e12);
            return codeVerifier;
        }
    }

    @NotNull
    public final String generateRandomCodeVerifier(@NotNull SecureRandom entropySource) {
        Intrinsics.checkNotNullParameter(entropySource, "entropySource");
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        entropySource.nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 11);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
