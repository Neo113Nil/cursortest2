package expo.modules.contacts.next.services.properties;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ListDataProperty.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.services.properties.ListDataProperty", f = "ListDataProperty.kt", i = {}, l = {24}, m = "getAll", n = {}, s = {})
/* loaded from: classes8.dex */
final class ListDataProperty$getAll$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ListDataProperty<TDomain, TExistingDto, TNewDto> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListDataProperty$getAll$1(ListDataProperty<TDomain, TExistingDto, TNewDto> listDataProperty, Continuation<? super ListDataProperty$getAll$1> continuation) {
        super(continuation);
        this.this$0 = listDataProperty;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAll(this);
    }
}
