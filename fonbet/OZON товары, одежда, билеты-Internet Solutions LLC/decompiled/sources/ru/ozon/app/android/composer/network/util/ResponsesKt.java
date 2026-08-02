package ru.ozon.app.android.composer.network.util;

import We.L;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.redirect.ComposerRedirectListener;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LWe/L;", "", "hasCacheControl", "(LWe/L;)Z", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "withCacheControl", "(LWe/L;Ljava/lang/String;)LWe/L;", "getRedirectUrl", "(LWe/L;)Ljava/lang/String;", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResponsesKt {
    public static final String getRedirectUrl(@NotNull L l11) {
        Intrinsics.checkNotNullParameter(l11, "<this>");
        String c11 = l11.r().c("location");
        if (c11 == null) {
            return null;
        }
        return ComposerRedirectListener.INSTANCE.getRedirectUrl$composer_prodGoogleAllVendorsRelease(c11);
    }

    public static final boolean hasCacheControl(@NotNull L l11) {
        Intrinsics.checkNotNullParameter(l11, "<this>");
        return l11.r().c("Cache-Control") != null;
    }

    @NotNull
    public static final L withCacheControl(@NotNull L l11, @NotNull String value) {
        Intrinsics.checkNotNullParameter(l11, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        l11.getClass();
        L.a aVar = new L.a(l11);
        aVar.i("Cache-Control", value);
        return aVar.c();
    }
}
