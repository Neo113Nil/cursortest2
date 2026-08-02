package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.horizontal;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.utils.freezeVisibilityWhileLoading.VisibilityFreezable;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.freezeVisibilityWhileLoading.FreezeVisibilityWhileLoadingKt$freezeVisibilityWhileLoading$1", f = "FreezeVisibilityWhileLoading.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ButtonWithInformationWidgetViewHolder$onWidgetCreated$$inlined$freezeVisibilityWhileLoading$1 extends j implements Function2<a, d<? super Unit>, Object> {
    final /* synthetic */ VisibilityFreezable $target;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithInformationWidgetViewHolder$onWidgetCreated$$inlined$freezeVisibilityWhileLoading$1(VisibilityFreezable visibilityFreezable, d dVar) {
        super(2, dVar);
        this.$target = visibilityFreezable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ButtonWithInformationWidgetViewHolder$onWidgetCreated$$inlined$freezeVisibilityWhileLoading$1 buttonWithInformationWidgetViewHolder$onWidgetCreated$$inlined$freezeVisibilityWhileLoading$1 = new ButtonWithInformationWidgetViewHolder$onWidgetCreated$$inlined$freezeVisibilityWhileLoading$1(this.$target, dVar);
        buttonWithInformationWidgetViewHolder$onWidgetCreated$$inlined$freezeVisibilityWhileLoading$1.L$0 = obj;
        return buttonWithInformationWidgetViewHolder$onWidgetCreated$$inlined$freezeVisibilityWhileLoading$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((ButtonWithInformationWidgetViewHolder$onWidgetCreated$$inlined$freezeVisibilityWhileLoading$1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a aVar2 = (a) this.L$0;
        if (aVar2 instanceof a.I) {
            this.$target.freeze(((a.I) aVar2).e());
        } else if (aVar2 instanceof a.u) {
            this.$target.freeze(true);
        } else if (aVar2 instanceof a.C2370k) {
            this.$target.freeze(false);
        }
        return Unit.f71690a;
    }
}
