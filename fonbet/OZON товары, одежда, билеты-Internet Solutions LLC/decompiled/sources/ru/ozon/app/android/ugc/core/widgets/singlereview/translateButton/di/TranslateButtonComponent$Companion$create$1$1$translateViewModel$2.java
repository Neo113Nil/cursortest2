package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TranslateButtonComponent$Companion$create$1$1$translateViewModel$2 extends AbstractC7737t implements Function0<TranslateViewModel> {
    final /* synthetic */ C7475g $storage;
    final /* synthetic */ TranslateButtonComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslateButtonComponent$Companion$create$1$1$translateViewModel$2(C7475g c7475g, TranslateButtonComponent$Companion$create$1$1 translateButtonComponent$Companion$create$1$1) {
        super(0);
        this.$storage = c7475g;
        this.this$0 = translateButtonComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TranslateViewModel invoke() {
        ConnectionHandler connectionHandler;
        ActionV2Repository actionRepository = ((ActionComponentApi) this.$storage.getComponent(ActionComponentApi.class)).getActionRepository();
        connectionHandler = this.this$0.connectionHandler;
        return new TranslateViewModel(actionRepository, connectionHandler);
    }
}
