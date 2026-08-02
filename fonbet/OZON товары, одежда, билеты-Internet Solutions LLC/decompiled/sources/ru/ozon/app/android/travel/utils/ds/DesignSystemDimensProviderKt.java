package ru.ozon.app.android.travel.utils.ds;

import Sc.n;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "LSc/n;", "lazyMode", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dimens", "(Landroid/content/Context;LSc/n;)Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DesignSystemDimensProviderKt {
    @NotNull
    public static final DesignSystemDimensProvider dimens(@NotNull Context context, @NotNull n lazyMode) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(lazyMode, "lazyMode");
        return new DesignSystemDimensProvider(context, lazyMode);
    }

    public static /* synthetic */ DesignSystemDimensProvider dimens$default(Context context, n nVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nVar = n.NONE;
        }
        return dimens(context, nVar);
    }
}
