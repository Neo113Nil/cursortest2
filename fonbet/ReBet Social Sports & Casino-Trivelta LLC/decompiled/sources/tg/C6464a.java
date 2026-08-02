package tg;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import sg.e;

/* renamed from: tg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6464a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6464a f65824a = new C6464a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f65825b = 100000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f65826c = 256;

    /* renamed from: d, reason: collision with root package name */
    public static final int f65827d = 12;

    public final PrivateKey a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 2)));
        } catch (Exception e10) {
            throw new e(e.a.WMS_SEC_212, e10.getMessage());
        }
    }
}
