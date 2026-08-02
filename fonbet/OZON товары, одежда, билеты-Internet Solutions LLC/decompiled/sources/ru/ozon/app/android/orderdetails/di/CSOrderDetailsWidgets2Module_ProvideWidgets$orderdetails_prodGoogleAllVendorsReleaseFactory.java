package ru.ozon.app.android.orderdetails.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.cscore.copybutton.CopyButtonConfig;
import ru.ozon.app.android.cscore.copybutton.CopyButtonViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.data.OrderDeliveryDetailConfig;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions.OrderDeliveryDetailActionsViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.header.OrderDeliveryDetailHeaderViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.iconButton.OrderDeliveryDetailIconButtonViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.leaveatdoor.OrderDeliveryDetailLeaveAtDoorViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.lsatdivider.OrderDeliveryDetailLastDividerViewMapper;

/* loaded from: classes6.dex */
public final class CSOrderDetailsWidgets2Module_ProvideWidgets$orderdetails_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$orderdetails_prodGoogleAllVendorsRelease(CopyButtonConfig copyButtonConfig, CopyButtonViewMapper copyButtonViewMapper, OrderDeliveryDetailConfig orderDeliveryDetailConfig, OrderDeliveryDetailActionsViewMapper orderDeliveryDetailActionsViewMapper, OrderDeliveryDetailHeaderViewMapper orderDeliveryDetailHeaderViewMapper, OrderDeliveryDetailIconButtonViewMapper orderDeliveryDetailIconButtonViewMapper, OrderDeliveryDetailLeaveAtDoorViewMapper orderDeliveryDetailLeaveAtDoorViewMapper, OrderDeliveryDetailLastDividerViewMapper orderDeliveryDetailLastDividerViewMapper) {
        Set<Widget2> provideWidgets$orderdetails_prodGoogleAllVendorsRelease = CSOrderDetailsWidgets2Module.INSTANCE.provideWidgets$orderdetails_prodGoogleAllVendorsRelease(copyButtonConfig, copyButtonViewMapper, orderDeliveryDetailConfig, orderDeliveryDetailActionsViewMapper, orderDeliveryDetailHeaderViewMapper, orderDeliveryDetailIconButtonViewMapper, orderDeliveryDetailLeaveAtDoorViewMapper, orderDeliveryDetailLastDividerViewMapper);
        j.d(provideWidgets$orderdetails_prodGoogleAllVendorsRelease);
        return provideWidgets$orderdetails_prodGoogleAllVendorsRelease;
    }
}
