package ru.ozon.app.android.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity;
import ru.ozon.app.android.select.feature.entry.OzonSelectActivity;
import ru.ozon.app.android.travel.feature.entry.OzonTravelActivity;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"isOzonSelectApplication", "", "Landroid/content/Context;", "isOzonTravelApplication", "isOzonFreshApplication", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContextUtilsKt {
    public static final boolean isOzonFreshApplication(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof OzonFreshActivity) {
            return true;
        }
        context.getApplicationContext();
        return false;
    }

    public static final boolean isOzonSelectApplication(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof OzonSelectActivity) {
            return true;
        }
        context.getApplicationContext();
        return false;
    }

    public static final boolean isOzonTravelApplication(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof OzonTravelActivity) {
            return true;
        }
        context.getApplicationContext();
        return false;
    }
}
