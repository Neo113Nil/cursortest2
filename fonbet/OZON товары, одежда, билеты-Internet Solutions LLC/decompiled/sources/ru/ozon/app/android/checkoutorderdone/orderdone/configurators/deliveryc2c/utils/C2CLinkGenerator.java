package ru.ozon.app.android.checkoutorderdone.orderdone.configurators.deliveryc2c.utils;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/configurators/deliveryc2c/utils/C2CLinkGenerator;", "", "<init>", "()V", "Landroid/net/Uri;", "delivery", "()Landroid/net/Uri;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class C2CLinkGenerator {

    @NotNull
    public static final C2CLinkGenerator INSTANCE = new C2CLinkGenerator();

    private C2CLinkGenerator() {
    }

    @NotNull
    public final Uri delivery() {
        Uri build = new Uri.Builder().scheme("ozon").authority("delivery").appendQueryParameter("miniapp", "cml").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
