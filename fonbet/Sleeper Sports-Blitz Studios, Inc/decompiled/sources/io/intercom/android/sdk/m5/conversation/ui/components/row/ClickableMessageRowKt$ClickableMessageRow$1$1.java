package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClickableMessageRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class ClickableMessageRowKt$ClickableMessageRow$1$1 implements PointerInputEventHandler {
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onLongClick;

    ClickableMessageRowKt$ClickableMessageRow$1$1(Function0<Unit> function0, Function0<Unit> function02) {
        this.$onLongClick = function0;
        this.$onClick = function02;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final Function0<Unit> function0 = this.$onLongClick;
        Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ClickableMessageRowKt$ClickableMessageRow$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$0;
                invoke$lambda$0 = ClickableMessageRowKt$ClickableMessageRow$1$1.invoke$lambda$0(Function0.this, (Offset) obj);
                return invoke$lambda$0;
            }
        };
        final Function0<Unit> function02 = this.$onClick;
        Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, function1, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ClickableMessageRowKt$ClickableMessageRow$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$1;
                invoke$lambda$1 = ClickableMessageRowKt$ClickableMessageRow$1$1.invoke$lambda$1(Function0.this, (Offset) obj);
                return invoke$lambda$1;
            }
        }, continuation, 5, null);
        return detectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function0 onClick, Offset offset) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function0 onLongClick, Offset offset) {
        Intrinsics.checkNotNullParameter(onLongClick, "$onLongClick");
        onLongClick.invoke();
        return Unit.INSTANCE;
    }
}
