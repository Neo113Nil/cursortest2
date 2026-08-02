package ru.ozon.app.android.account.orders.clicktodeliverymodal.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.buttons.ButtonsMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.delivery.DeliveryMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.title.TitleMapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010$\u001a\u00060 j\u0002`!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"ru/ozon/app/android/account/orders/clicktodeliverymodal/di/ClickToDeliveryWidgetComponent$Companion$create$1", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/di/ClickToDeliveryWidgetComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/title/TitleMapper;", "titleMapper$delegate", "LSc/j;", "getTitleMapper", "()Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/title/TitleMapper;", "titleMapper", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/buttons/ButtonsMapper;", "buttonsMapper$delegate", "getButtonsMapper", "()Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/buttons/ButtonsMapper;", "buttonsMapper", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/delivery/DeliveryMapper;", "deliveryMapper$delegate", "getDeliveryMapper", "()Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/delivery/DeliveryMapper;", "deliveryMapper", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider$delegate", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ClickToDeliveryWidgetComponent$Companion$create$1 implements ClickToDeliveryWidgetComponent {
    private final AccountComponentApi accountComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: titleMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j titleMapper = k.b(ClickToDeliveryWidgetComponent$Companion$create$1$titleMapper$2.INSTANCE);

    /* renamed from: buttonsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j buttonsMapper = k.b(ClickToDeliveryWidgetComponent$Companion$create$1$buttonsMapper$2.INSTANCE);

    /* renamed from: deliveryMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j deliveryMapper = k.b(ClickToDeliveryWidgetComponent$Companion$create$1$deliveryMapper$2.INSTANCE);

    /* renamed from: adultListDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j adultListDelegateProvider = k.b(new ClickToDeliveryWidgetComponent$Companion$create$1$adultListDelegateProvider$2(this));

    ClickToDeliveryWidgetComponent$Companion$create$1(C7475g c7475g) {
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent
    public AdultListDelegateProvider getAdultListDelegateProvider() {
        return (AdultListDelegateProvider) this.adultListDelegateProvider.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent
    public ButtonsMapper getButtonsMapper() {
        return (ButtonsMapper) this.buttonsMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent
    public DeliveryMapper getDeliveryMapper() {
        return (DeliveryMapper) this.deliveryMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent
    public TitleMapper getTitleMapper() {
        return (TitleMapper) this.titleMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
