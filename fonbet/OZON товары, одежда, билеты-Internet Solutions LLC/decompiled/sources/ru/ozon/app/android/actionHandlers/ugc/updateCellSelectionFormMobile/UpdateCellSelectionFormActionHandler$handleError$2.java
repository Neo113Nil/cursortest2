package ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile;

import Sc.s;
import Wc.a;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.UpdateCellSelectionFormActionHandler$handleError$2", f = "UpdateCellSelectionFormActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class UpdateCellSelectionFormActionHandler$handleError$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ ComposerReferences $references;
    int label;
    final /* synthetic */ UpdateCellSelectionFormActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateCellSelectionFormActionHandler$handleError$2(ComposerReferences composerReferences, InterfaceC7851b interfaceC7851b, UpdateCellSelectionFormActionHandler updateCellSelectionFormActionHandler, d<? super UpdateCellSelectionFormActionHandler$handleError$2> dVar) {
        super(2, dVar);
        this.$references = composerReferences;
        this.$controller = interfaceC7851b;
        this.this$0 = updateCellSelectionFormActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UpdateCellSelectionFormActionHandler$handleError$2(this.$references, this.$controller, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationDTO commonErrorNotification;
        View view;
        RecyclerView composerRecyclerView;
        RecyclerView.g adapter;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ComponentCallbacksC5392m c11 = this.$references.getContainer().c();
        if (c11 != null && (view = c11.getView()) != null && (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) != null && (adapter = composerRecyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        this.$controller.hideLoader();
        UpdateCellSelectionFormActionHandler updateCellSelectionFormActionHandler = this.this$0;
        commonErrorNotification = updateCellSelectionFormActionHandler.commonErrorNotification();
        updateCellSelectionFormActionHandler.showNotification(commonErrorNotification, this.$references.getContainer());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((UpdateCellSelectionFormActionHandler$handleError$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
