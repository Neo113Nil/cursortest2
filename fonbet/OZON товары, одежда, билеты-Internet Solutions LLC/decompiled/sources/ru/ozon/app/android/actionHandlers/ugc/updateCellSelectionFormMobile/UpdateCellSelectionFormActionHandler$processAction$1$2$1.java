package ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile;

import Sc.s;
import Wc.a;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.data.UpdateCellActionResponse;
import ru.ozon.app.android.composer.ComposerReferences;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.UpdateCellSelectionFormActionHandler$processAction$1$2$1", f = "UpdateCellSelectionFormActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class UpdateCellSelectionFormActionHandler$processAction$1$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ UpdateCellActionResponse $response;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateCellSelectionFormActionHandler$processAction$1$2$1(CustomActionHandler.HandlerReferences handlerReferences, ComposerReferences composerReferences, UpdateCellActionResponse updateCellActionResponse, d<? super UpdateCellSelectionFormActionHandler$processAction$1$2$1> dVar) {
        super(2, dVar);
        this.$handlerRefs = handlerReferences;
        this.$refs = composerReferences;
        this.$response = updateCellActionResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UpdateCellSelectionFormActionHandler$processAction$1$2$1(this.$handlerRefs, this.$refs, this.$response, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComponentCallbacksC5392m parentFragment;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ComponentCallbacksC5392m b11 = Sh.a.b(this.$handlerRefs);
        ComponentCallbacksC5392m parentFragment2 = (b11 == null || (parentFragment = b11.getParentFragment()) == null) ? null : parentFragment.getParentFragment();
        if (parentFragment2 != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("CELL_SELECTION_FORM_ITEM_ID", this.$response.getCell());
            Unit unit = Unit.f71690a;
            parentFragment2.getParentFragmentManager().m1(bundle, "CELL_SELECTION_FORM_REQUEST_KEY");
        }
        this.$refs.getNavigator().popBackStack();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((UpdateCellSelectionFormActionHandler$processAction$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
