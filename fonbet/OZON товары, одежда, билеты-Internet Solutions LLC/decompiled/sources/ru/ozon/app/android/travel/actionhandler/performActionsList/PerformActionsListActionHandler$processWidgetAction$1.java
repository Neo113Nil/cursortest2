package ru.ozon.app.android.travel.actionhandler.performActionsList;

import Sc.s;
import Wc.a;
import java.util.List;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.actionhandler.performActionsList.PerformActionsListActionHandler$processWidgetAction$1", f = "PerformActionsListActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PerformActionsListActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionsWithDelayKey;
    final /* synthetic */ C7475g $widgetComponentStorage;
    int label;
    final /* synthetic */ PerformActionsListActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformActionsListActionHandler$processWidgetAction$1(PerformActionsListActionHandler performActionsListActionHandler, C7475g c7475g, String str, d<? super PerformActionsListActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = performActionsListActionHandler;
        this.$widgetComponentStorage = c7475g;
        this.$actionsWithDelayKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PerformActionsListActionHandler$processWidgetAction$1(this.this$0, this.$widgetComponentStorage, this.$actionsWithDelayKey, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC7851b controller;
        JsonParser jsonParser;
        List map;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        controller = this.this$0.getController(this.$widgetComponentStorage);
        jsonParser = this.this$0.jsonDeserializer;
        map = this.this$0.map((PerformActionsListDTO) jsonParser.fromJson(this.$actionsWithDelayKey, PerformActionsListDTO.class));
        controller.update(new PerformActionsListUpdate(map));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PerformActionsListActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
