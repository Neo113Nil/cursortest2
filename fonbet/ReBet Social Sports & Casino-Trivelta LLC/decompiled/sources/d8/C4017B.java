package d8;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.GraphRequest;
import com.twilio.voice.EventKeys;
import g6.C4331C;
import g6.C4357q;
import g6.EnumC4340L;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: d8.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4017B {

    /* renamed from: a, reason: collision with root package name */
    public static final C4017B f45022a = new C4017B();

    public static final GraphRequest a(String authorizationCode, String redirectUri, String codeVerifier) {
        Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString(EventKeys.ERROR_CODE, authorizationCode);
        bundle.putString("client_id", C4331C.m());
        bundle.putString("redirect_uri", redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        GraphRequest x10 = GraphRequest.f30314n.x(null, "oauth/access_token", null);
        x10.I(EnumC4340L.GET);
        x10.J(bundle);
        return x10;
    }

    public static final String b(String codeVerifier, EnumC4025a codeChallengeMethod) {
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        if (!d(codeVerifier)) {
            throw new C4357q("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == EnumC4025a.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(Charsets.US_ASCII);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return encodeToString;
        } catch (Exception e10) {
            throw new C4357q(e10);
        }
    }

    public static final String c() {
        int random = RangesKt.random(new IntRange(43, 128), Random.INSTANCE);
        List plus = CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('a', 'z'), (Iterable) new CharRange('A', Matrix.MATRIX_TYPE_ZERO)), (Iterable) new CharRange('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(random);
        for (int i10 = 0; i10 < random; i10++) {
            Character ch2 = (Character) CollectionsKt.random(plus, Random.INSTANCE);
            ch2.charValue();
            arrayList.add(ch2);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public static final boolean d(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").matches(str);
    }
}
