package expo.modules.contacts.next.extensions;

import android.database.Cursor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* compiled from: CursorExtensions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/database/Cursor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.extensions.CursorExtensionsKt$asSequence$1", f = "CursorExtensions.kt", i = {0}, l = {7}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class CursorExtensionsKt$asSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Cursor>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Cursor $this_asSequence;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CursorExtensionsKt$asSequence$1(Cursor cursor, Continuation<? super CursorExtensionsKt$asSequence$1> continuation) {
        super(2, continuation);
        this.$this_asSequence = cursor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CursorExtensionsKt$asSequence$1 cursorExtensionsKt$asSequence$1 = new CursorExtensionsKt$asSequence$1(this.$this_asSequence, continuation);
        cursorExtensionsKt$asSequence$1.L$0 = obj;
        return cursorExtensionsKt$asSequence$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super Cursor> sequenceScope, Continuation<? super Unit> continuation) {
        return ((CursorExtensionsKt$asSequence$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sequenceScope = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (this.$this_asSequence.moveToNext()) {
            this.L$0 = sequenceScope;
            this.label = 1;
            if (sequenceScope.yield(this.$this_asSequence, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
