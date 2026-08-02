package ru.ozon.app.android.orderdetails.modalConstructor.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ModalConstructorComponent$Companion$create$1$adultListDelegateProvider$2 extends AbstractC7737t implements Function0<AdultListDelegateProvider> {
    final /* synthetic */ C7475g $storage;
    final /* synthetic */ ModalConstructorComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalConstructorComponent$Companion$create$1$adultListDelegateProvider$2(ModalConstructorComponent$Companion$create$1 modalConstructorComponent$Companion$create$1, C7475g c7475g) {
        super(0);
        this.this$0 = modalConstructorComponent$Companion$create$1;
        this.$storage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AdultListDelegateProvider invoke() {
        return new AdultListDelegateProvider(this.this$0.getAdultHandler(), ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getFeatureChecker());
    }
}
