package ru.ozon.app.android.advertising;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"areGooglePlayServicesAvailable", "", "context", "Landroid/content/Context;", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePlayServicesUtilsKt {
    public static final boolean areGooglePlayServicesAvailable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }
}
