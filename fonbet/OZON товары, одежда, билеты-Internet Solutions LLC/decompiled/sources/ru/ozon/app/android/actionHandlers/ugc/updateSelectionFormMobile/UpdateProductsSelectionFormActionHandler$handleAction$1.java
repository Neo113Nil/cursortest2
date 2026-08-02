package ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile;

import W10.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.custom.CustomActionHandler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "invoke", "()LW10/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class UpdateProductsSelectionFormActionHandler$handleAction$1 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateProductsSelectionFormActionHandler$handleAction$1(CustomActionHandler.HandlerReferences handlerReferences) {
        super(0);
        this.$handlerRefs = handlerReferences;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        return this.$handlerRefs.getTrackingData();
    }
}
