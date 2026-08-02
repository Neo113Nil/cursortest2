package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.di;

import Vg.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.TranslateReviewActionHandler;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TranslateButtonComponent$Companion$create$1$1$customActionHandlersStore$2 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ TranslateButtonComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslateButtonComponent$Companion$create$1$1$customActionHandlersStore$2(TranslateButtonComponent$Companion$create$1$1 translateButtonComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = translateButtonComponent$Companion$create$1$1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        CustomActionHandlersComponentApi customActionHandlersComponentApi;
        customActionHandlersComponentApi = this.this$0.customActionHandlersComponentApi;
        return customActionHandlersComponentApi.getCustomActionHandlersStoreFactory().create(TranslateReviewActionHandler.class);
    }
}
