package io.sentry;

import java.net.URI;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7211v {

    /* renamed from: a, reason: collision with root package name */
    private final String f68609a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f68610b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final URI f68611c;

    C7211v(String str) throws IllegalArgumentException {
        try {
            io.sentry.util.p.b(str, "The DSN is required.");
            String trim = str.trim();
            if (trim.isEmpty()) {
                throw new IllegalArgumentException("The DSN is empty.");
            }
            URI normalize = new URI(trim).normalize();
            String scheme = normalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = normalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] split = userInfo.split(ProductContainerDTO.RATIO_DELIMITER, -1);
            String str2 = split[0];
            this.f68610b = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f68609a = split.length > 1 ? split[1] : null;
            String path = normalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int lastIndexOf = path.lastIndexOf("/") + 1;
            String substring = path.substring(0, lastIndexOf);
            substring = substring.endsWith("/") ? substring : substring.concat("/");
            String substring2 = path.substring(lastIndexOf);
            if (substring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.f68611c = new URI(scheme, null, normalize.getHost(), normalize.getPort(), substring + "api/" + substring2, null, null);
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    @NotNull
    public final String a() {
        return this.f68610b;
    }

    public final String b() {
        return this.f68609a;
    }

    @NotNull
    final URI c() {
        return this.f68611c;
    }
}
