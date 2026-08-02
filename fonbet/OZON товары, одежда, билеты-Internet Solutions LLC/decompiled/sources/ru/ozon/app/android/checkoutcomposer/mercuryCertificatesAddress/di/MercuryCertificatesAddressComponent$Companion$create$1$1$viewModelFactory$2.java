package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/di/MercuryCertificatesAddressViewModelFactory;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class MercuryCertificatesAddressComponent$Companion$create$1$1$viewModelFactory$2 extends AbstractC7737t implements Function0<MercuryCertificatesAddressViewModelFactory> {
    final /* synthetic */ MercuryCertificatesAddressComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MercuryCertificatesAddressComponent$Companion$create$1$1$viewModelFactory$2(MercuryCertificatesAddressComponent$Companion$create$1$1 mercuryCertificatesAddressComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = mercuryCertificatesAddressComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MercuryCertificatesAddressViewModelFactory invoke() {
        ActionComponentApi actionComponentApi;
        RetainComposerComponentApi retainComposerComponentApi;
        actionComponentApi = this.this$0.actionComponentApi;
        ActionV2Repository actionRepository = actionComponentApi.getActionRepository();
        retainComposerComponentApi = this.this$0.retainComposerComponent;
        return new MercuryCertificatesAddressViewModelFactory(actionRepository, retainComposerComponentApi.getComposerNavigator());
    }
}
