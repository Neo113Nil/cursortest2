package ru.ozon.app.android.orderdetails.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.cscore.copybutton.CopyButtonConfig;
import ru.ozon.app.android.cscore.copybutton.CopyButtonViewMapper;
import ru.ozon.app.android.orderdetails.code.CodeWidgetKt;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.core.NotificationBarRestrictionConfig;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.core.NotificationBarRestrictionViewMapper;
import ru.ozon.app.android.orderdetails.orderSmartAddress.OrderSmartAddressWidgetKt;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.data.OrderDeliveryDetailConfig;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions.OrderDeliveryDetailActionsViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.header.OrderDeliveryDetailHeaderViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.iconButton.OrderDeliveryDetailIconButtonViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.leaveatdoor.OrderDeliveryDetailLeaveAtDoorViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.lsatdivider.OrderDeliveryDetailLastDividerViewMapper;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00142\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/orderdetails/di/CSOrderDetailsWidgets2Module;", "", "<init>", "()V", "Lru/ozon/app/android/cscore/copybutton/CopyButtonConfig;", "config", "Lru/ozon/app/android/cscore/copybutton/CopyButtonViewMapper;", "viewMapper", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/OrderDeliveryDetailConfig;", "orderDeliveryDetailConfig", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/actions/OrderDeliveryDetailActionsViewMapper;", "orderDeliveryDetailActionsViewMapper", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/header/OrderDeliveryDetailHeaderViewMapper;", "orderDeliveryDetailHeaderViewMapper", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/iconButton/OrderDeliveryDetailIconButtonViewMapper;", "orderDeliveryDetailIconButtonViewMapper", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/OrderDeliveryDetailLeaveAtDoorViewMapper;", "orderDeliveryDetailLeaveAtDoorViewMapper", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/lsatdivider/OrderDeliveryDetailLastDividerViewMapper;", "orderDeliveryDetailLastDividerViewMapper", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideWidgets$orderdetails_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/cscore/copybutton/CopyButtonConfig;Lru/ozon/app/android/cscore/copybutton/CopyButtonViewMapper;Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/OrderDeliveryDetailConfig;Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/actions/OrderDeliveryDetailActionsViewMapper;Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/header/OrderDeliveryDetailHeaderViewMapper;Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/iconButton/OrderDeliveryDetailIconButtonViewMapper;Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/OrderDeliveryDetailLeaveAtDoorViewMapper;Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/lsatdivider/OrderDeliveryDetailLastDividerViewMapper;)Ljava/util/Set;", "provideWidgets", "Lru/ozon/app/android/orderdetails/notificationbarrestriction/core/NotificationBarRestrictionConfig;", "Lru/ozon/app/android/orderdetails/notificationbarrestriction/core/NotificationBarRestrictionViewMapper;", "provideNotificationBarRestrictionWidget$orderdetails_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/orderdetails/notificationbarrestriction/core/NotificationBarRestrictionConfig;Lru/ozon/app/android/orderdetails/notificationbarrestriction/core/NotificationBarRestrictionViewMapper;)Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideNotificationBarRestrictionWidget", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "provideComposeWidgets", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CSOrderDetailsWidgets2Module {

    @NotNull
    public static final CSOrderDetailsWidgets2Module INSTANCE = new CSOrderDetailsWidgets2Module();

    private CSOrderDetailsWidgets2Module() {
    }

    @NotNull
    public final Set<i> provideComposeWidgets(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        i[] elements = {CodeWidgetKt.CodeWidget(jsonDeserializer), OrderSmartAddressWidgetKt.OrderSmartAddressWidget(jsonDeserializer)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    @NotNull
    public final Widget2 provideNotificationBarRestrictionWidget$orderdetails_prodGoogleAllVendorsRelease(@NotNull NotificationBarRestrictionConfig config, @NotNull NotificationBarRestrictionViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget2("csma", "notificationBarRestriction", config, new ViewMapper2[]{viewMapper});
    }

    @NotNull
    public final Set<Widget2> provideWidgets$orderdetails_prodGoogleAllVendorsRelease(@NotNull CopyButtonConfig config, @NotNull CopyButtonViewMapper viewMapper, @NotNull OrderDeliveryDetailConfig orderDeliveryDetailConfig, @NotNull OrderDeliveryDetailActionsViewMapper orderDeliveryDetailActionsViewMapper, @NotNull OrderDeliveryDetailHeaderViewMapper orderDeliveryDetailHeaderViewMapper, @NotNull OrderDeliveryDetailIconButtonViewMapper orderDeliveryDetailIconButtonViewMapper, @NotNull OrderDeliveryDetailLeaveAtDoorViewMapper orderDeliveryDetailLeaveAtDoorViewMapper, @NotNull OrderDeliveryDetailLastDividerViewMapper orderDeliveryDetailLastDividerViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(orderDeliveryDetailConfig, "orderDeliveryDetailConfig");
        Intrinsics.checkNotNullParameter(orderDeliveryDetailActionsViewMapper, "orderDeliveryDetailActionsViewMapper");
        Intrinsics.checkNotNullParameter(orderDeliveryDetailHeaderViewMapper, "orderDeliveryDetailHeaderViewMapper");
        Intrinsics.checkNotNullParameter(orderDeliveryDetailIconButtonViewMapper, "orderDeliveryDetailIconButtonViewMapper");
        Intrinsics.checkNotNullParameter(orderDeliveryDetailLeaveAtDoorViewMapper, "orderDeliveryDetailLeaveAtDoorViewMapper");
        Intrinsics.checkNotNullParameter(orderDeliveryDetailLastDividerViewMapper, "orderDeliveryDetailLastDividerViewMapper");
        Widget2[] elements = {new Widget2("csma", "orderDetailsCopyItem", config, new ViewMapper2[]{viewMapper}), new Widget2("csma", "orderDeliveryDetails", orderDeliveryDetailConfig, new ViewMapper2[]{orderDeliveryDetailHeaderViewMapper, orderDeliveryDetailLeaveAtDoorViewMapper, orderDeliveryDetailActionsViewMapper, orderDeliveryDetailIconButtonViewMapper, orderDeliveryDetailLastDividerViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
