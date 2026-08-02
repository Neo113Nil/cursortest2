package ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isLoading", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsViewHolder$onAttach$1", f = "PromptSuggestionsViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PromptSuggestionsViewHolder$onAttach$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ PromptSuggestionsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromptSuggestionsViewHolder$onAttach$1(PromptSuggestionsViewHolder promptSuggestionsViewHolder, d<? super PromptSuggestionsViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = promptSuggestionsViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PromptSuggestionsViewHolder$onAttach$1 promptSuggestionsViewHolder$onAttach$1 = new PromptSuggestionsViewHolder$onAttach$1(this.this$0, dVar);
        promptSuggestionsViewHolder$onAttach$1.Z$0 = ((Boolean) obj).booleanValue();
        return promptSuggestionsViewHolder$onAttach$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PromptSuggestionsView promptSuggestionsView;
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        promptSuggestionsView = this.this$0.view;
        promptSuggestionsView.setActionHandlingEnabled(!z11);
        if (!z11) {
            composerReferences = this.this$0.refs;
            composerReferences.getController().hideLoader();
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((PromptSuggestionsViewHolder$onAttach$1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
