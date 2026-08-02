package ru.ozon.app.android.account.orders.view.maps.domain;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.maps.model.LatLng;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/domain/YandexNavigationLinkGenerator;", "", "<init>", "()V", "buildRoute", "Landroid/net/Uri;", "targetLocation", "Lcom/google/android/gms/maps/model/LatLng;", "sha256rsa", "", "key", "data", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexNavigationLinkGenerator {
    private final String sha256rsa(String key, String data) throws SecurityException {
        byte[] decode = Base64.decode(key, 0);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(decode);
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(keyFactory.generatePrivate(pKCS8EncodedKeySpec));
        byte[] bytes = data.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        signature.update(bytes);
        String encodeToString = Base64.encodeToString(signature.sign(), 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    @NotNull
    public final Uri buildRoute(@NotNull LatLng targetLocation) {
        Intrinsics.checkNotNullParameter(targetLocation, "targetLocation");
        Uri build = Uri.parse("yandexmaps://maps.yandex.ru").buildUpon().appendQueryParameter("lat_to", String.valueOf(targetLocation.latitude)).appendQueryParameter("lon_to", String.valueOf(targetLocation.longitude)).appendQueryParameter("client", "256").build();
        Uri.Builder buildUpon = build.buildUpon();
        String uri = build.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Uri build2 = buildUpon.appendQueryParameter("signature", sha256rsa("MIIBPQIBAAJBALS1RdyZC5pW9aF607i7kCqHgwgo5Zz1l+yNt9ot50mEcoeYxG2mRU2GwCkFngxoKpSrCttKQswguYuyYqMHcW0CAwEAAQJBALG4GUXzijK21QmDp5dld0osTZSHzBHKgyhU0/yR6oYkP/RyAb26Ub+nbXnjk/RJVZnGqNj/BuJab5nVJvl36M0CIQDtYBhTQUe4zksCKGfV1+9oiqLb35qZbLxiWt64iCmNnwIhAMLi9oeNTpR295iU/m8/Risihorq9QPj8ceXD2gIvE1zAiEAn42O7C8d2V94VYv5N2i8eEVvcGEdFnFbMrUnrVuAqrsCIQCXXd0JD5HW8kgAtMih8002t4w0XaWMLgFeek+3CAHpTQIhAIW0y5JAGcmiz5cJGTOECs9aSKPM1lvgaZ7/6IukGbVi", uri)).build();
        Intrinsics.f(build2);
        return build2;
    }
}
