package ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class PromptStatusViewHolder$onAttachViewModel$2 extends C7735q implements Function2<AtomAction, d<? super Unit>, Object> {
    PromptStatusViewHolder$onAttachViewModel$2(Object obj) {
        super(2, obj, Intrinsics.a.class, "suspendConversion0", "onAttachViewModel$suspendConversion0(Lkotlin/jvm/functions/Function1;Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AtomAction atomAction, d<? super Unit> dVar) {
        Object onAttachViewModel$suspendConversion0;
        onAttachViewModel$suspendConversion0 = PromptStatusViewHolder.onAttachViewModel$suspendConversion0((Function1) this.receiver, atomAction, dVar);
        return onAttachViewModel$suspendConversion0;
    }
}
