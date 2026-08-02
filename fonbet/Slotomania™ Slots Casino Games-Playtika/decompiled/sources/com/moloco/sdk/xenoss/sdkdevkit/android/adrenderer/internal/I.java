package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import java.net.URI;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes8.dex */
public final class I {
    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return C2825f.a(digest);
    }

    public static final String b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        URI uri = new URI(str);
        String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "run(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = uri2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return C2825f.a(digest);
    }
}
