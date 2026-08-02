package ru.ozon.app.android.common.actionHandlers.removeSuggestion;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.removeSuggestion.RemoveSuggestionActionHandler$processAction$1$1", f = "RemoveSuggestionActionHandler.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class RemoveSuggestionActionHandler$processAction$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ ComposerReferences $composerRefs;
    final /* synthetic */ String $context;
    final /* synthetic */ String $title;
    int label;
    final /* synthetic */ RemoveSuggestionActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoveSuggestionActionHandler$processAction$1$1(RemoveSuggestionActionHandler removeSuggestionActionHandler, String str, String str2, String str3, ComposerReferences composerReferences, d<? super RemoveSuggestionActionHandler$processAction$1$1> dVar) {
        super(2, dVar);
        this.this$0 = removeSuggestionActionHandler;
        this.$actionName = str;
        this.$context = str2;
        this.$title = str3;
        this.$composerRefs = composerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RemoveSuggestionActionHandler$processAction$1$1(this.this$0, this.$actionName, this.$context, this.$title, this.$composerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        RemoveSuggestionApi removeSuggestionApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                RemoveSuggestionActionHandler removeSuggestionActionHandler = this.this$0;
                String str = this.$actionName;
                String str2 = this.$context;
                String str3 = this.$title;
                r.Companion companion = r.INSTANCE;
                removeSuggestionApi = removeSuggestionActionHandler.searchHistoryApi;
                RemoveHistorySuggestionRequest removeHistorySuggestionRequest = new RemoveHistorySuggestionRequest(str2, str3);
                this.label = 1;
                if (removeSuggestionApi.deleteSearchHistory(str, removeHistorySuggestionRequest, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        ComposerReferences composerReferences = this.$composerRefs;
        if (!(a11 instanceof r.b)) {
            InterfaceC7851b.a.a(composerReferences.getController(), null, null, null, null, 15);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RemoveSuggestionActionHandler$processAction$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
