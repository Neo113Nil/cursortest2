package ru.ozon.app.android.orderdetails.cancelReasons.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.cancelReasons.core.SelectCancelReasonConfig;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons.SelectCancelReasonsViewMapper;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.sticky.SelectCancelReasonStickyViewMapper;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/orderdetails/cancelReasons/di/SelectCancelReasonModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/orderdetails/cancelReasons/core/SelectCancelReasonConfig;", "cancelReasonsViewMapper", "Lru/ozon/app/android/orderdetails/cancelReasons/presentation/reasons/SelectCancelReasonsViewMapper;", "stickyViewMapper", "Lru/ozon/app/android/orderdetails/cancelReasons/presentation/sticky/SelectCancelReasonStickyViewMapper;", "provideWidget$orderdetails_prodGoogleAllVendorsRelease", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectCancelReasonModule {
    @NotNull
    public final Widget2 provideWidget$orderdetails_prodGoogleAllVendorsRelease(@NotNull SelectCancelReasonConfig config, @NotNull SelectCancelReasonsViewMapper cancelReasonsViewMapper, @NotNull SelectCancelReasonStickyViewMapper stickyViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(cancelReasonsViewMapper, "cancelReasonsViewMapper");
        Intrinsics.checkNotNullParameter(stickyViewMapper, "stickyViewMapper");
        return new Widget2("csma", "selectCancelReason", config, new ViewMapper2[]{cancelReasonsViewMapper, stickyViewMapper});
    }
}
