package ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class PromptStatusViewHolder$onAttachViewModel$1 extends C7719a implements Function2<PromptStatusState, d<? super Unit>, Object> {
    PromptStatusViewHolder$onAttachViewModel$1(Object obj) {
        super(2, obj, PromptStatusViewHolder.class, "bindState", "bindState(Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PromptStatusState promptStatusState, d<? super Unit> dVar) {
        Object onAttachViewModel$bindState;
        onAttachViewModel$bindState = PromptStatusViewHolder.onAttachViewModel$bindState((PromptStatusViewHolder) this.receiver, promptStatusState, dVar);
        return onAttachViewModel$bindState;
    }
}
