package ru.ozon.app.android.account.orders.datechangedcomplaintform.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.input.ComplaintInfoUpdater;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.input.DeliveryDateChangedComplaintFormInputMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.reason.DeliveryDateChangedComplaintFormReasonMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.title.DeliveryDateChangedComplaintFormTitleMapper;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010!\u001a\u00060\u001dj\u0002`\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"ru/ozon/app/android/account/orders/datechangedcomplaintform/di/DeliveryDateChangedComplaintFormComponent$Companion$create$1", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/di/DeliveryDateChangedComplaintFormComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/title/DeliveryDateChangedComplaintFormTitleMapper;", "titleMapper$delegate", "LSc/j;", "getTitleMapper", "()Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/title/DeliveryDateChangedComplaintFormTitleMapper;", "titleMapper", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/reason/DeliveryDateChangedComplaintFormReasonMapper;", "reasonMapper$delegate", "getReasonMapper", "()Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/reason/DeliveryDateChangedComplaintFormReasonMapper;", "reasonMapper", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/DeliveryDateChangedComplaintFormInputMapper;", "inputMapper$delegate", "getInputMapper", "()Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/DeliveryDateChangedComplaintFormInputMapper;", "inputMapper", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/ComplaintInfoUpdater;", "complaintInfoUpdater$delegate", "getComplaintInfoUpdater", "()Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/ComplaintInfoUpdater;", "complaintInfoUpdater", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryDateChangedComplaintFormComponent$Companion$create$1 implements DeliveryDateChangedComplaintFormComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: titleMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j titleMapper = k.b(DeliveryDateChangedComplaintFormComponent$Companion$create$1$titleMapper$2.INSTANCE);

    /* renamed from: reasonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j reasonMapper = k.b(DeliveryDateChangedComplaintFormComponent$Companion$create$1$reasonMapper$2.INSTANCE);

    /* renamed from: inputMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j inputMapper = k.b(DeliveryDateChangedComplaintFormComponent$Companion$create$1$inputMapper$2.INSTANCE);

    /* renamed from: complaintInfoUpdater$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j complaintInfoUpdater = k.b(new DeliveryDateChangedComplaintFormComponent$Companion$create$1$complaintInfoUpdater$2(this));

    DeliveryDateChangedComplaintFormComponent$Companion$create$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    @Override // ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormComponent
    public ComplaintInfoUpdater getComplaintInfoUpdater() {
        return (ComplaintInfoUpdater) this.complaintInfoUpdater.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormComponent
    public DeliveryDateChangedComplaintFormInputMapper getInputMapper() {
        return (DeliveryDateChangedComplaintFormInputMapper) this.inputMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormComponent
    public DeliveryDateChangedComplaintFormReasonMapper getReasonMapper() {
        return (DeliveryDateChangedComplaintFormReasonMapper) this.reasonMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormComponent
    public DeliveryDateChangedComplaintFormTitleMapper getTitleMapper() {
        return (DeliveryDateChangedComplaintFormTitleMapper) this.titleMapper.getValue();
    }
}
