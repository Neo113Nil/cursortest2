package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes7.dex */
public final class b {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2", f = "Tap.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a c;
        public final /* synthetic */ Function2<Offset, Offset, Unit> d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2$1", f = "Tap.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$a$a, reason: collision with other inner class name */
        public static final class C0367a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a b;
            public final /* synthetic */ PointerInputScope c;
            public final /* synthetic */ Function2<Offset, Offset, Unit> d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2$1$1", f = "Tap.kt", i = {0, 1}, l = {45, 48}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "down"}, s = {"L$0", "L$0"})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$a$a$a, reason: collision with other inner class name */
            public static final class C0368a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a c;
                public final /* synthetic */ Function2<Offset, Offset, Unit> d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0368a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, Function2<? super Offset, ? super Offset, Unit> function2, Continuation<? super C0368a> continuation) {
                    super(2, continuation);
                    this.c = aVar;
                    this.d = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((C0368a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0368a c0368a = new C0368a(this.c, this.d, continuation);
                    c0368a.b = obj;
                    return c0368a;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    C0368a c0368a;
                    AwaitPointerEventScope awaitPointerEventScope;
                    PointerInputChange pointerInputChange;
                    PointerInputChange pointerInputChange2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.b;
                        this.b = awaitPointerEventScope2;
                        this.a = 1;
                        c0368a = this;
                        obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, c0368a, 2, null);
                        if (obj != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pointerInputChange = (PointerInputChange) this.b;
                        ResultKt.throwOnFailure(obj);
                        c0368a = this;
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange2 != null) {
                            c0368a.c.a();
                        } else {
                            c0368a.c.b();
                            c0368a.d.invoke(Offset.m1860boximpl(pointerInputChange.getPosition()), Offset.m1860boximpl(pointerInputChange2.getPosition()));
                        }
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.b;
                    ResultKt.throwOnFailure(obj);
                    c0368a = this;
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                    if (pointerInputChange3.getPressed() != pointerInputChange3.getPreviousPressed()) {
                        pointerInputChange3.consume();
                    }
                    c0368a.b = pointerInputChange3;
                    c0368a.a = 2;
                    Object b = b.b(awaitPointerEventScope, this);
                    if (b != coroutine_suspended) {
                        pointerInputChange = pointerInputChange3;
                        obj = b;
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange2 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0367a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, PointerInputScope pointerInputScope, Function2<? super Offset, ? super Offset, Unit> function2, Continuation<? super C0367a> continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = pointerInputScope;
                this.d = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0367a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0367a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b.c();
                    PointerInputScope pointerInputScope = this.c;
                    C0368a c0368a = new C0368a(this.b, this.d, null);
                    this.a = 1;
                    if (pointerInputScope.awaitPointerEventScope(c0368a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, Function2<? super Offset, ? super Offset, Unit> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = aVar;
            this.d = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((a) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0367a c0367a = new C0367a(this.c, (PointerInputScope) this.b, this.d, null);
                this.a = 1;
                if (CoroutineScopeKt.coroutineScope(c0367a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt", f = "Tap.kt", i = {0, 1}, l = {62, 77}, m = "waitForUpOrCancellationInitial", n = {"$this$waitForUpOrCancellationInitial", "$this$waitForUpOrCancellationInitial"}, s = {"L$0", "L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b, reason: collision with other inner class name */
    public static final class C0369b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public C0369b(Continuation<? super C0369b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return b.b((AwaitPointerEventScope) null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r14 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a0 -> B:11:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
        C0369b c0369b;
        int i;
        if (continuation instanceof C0369b) {
            c0369b = (C0369b) continuation;
            int i2 = c0369b.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0369b.c = i2 - Integer.MIN_VALUE;
                Object obj = c0369b.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0369b.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                    c0369b.a = awaitPointerEventScope;
                    c0369b.c = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, c0369b);
                } else {
                    if (i == 1) {
                        awaitPointerEventScope = (AwaitPointerEventScope) c0369b.a;
                        ResultKt.throwOnFailure(obj);
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        int size = changes.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (!PointerEventKt.changedToUp(changes.get(i3))) {
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                                int size2 = changes2.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    PointerInputChange pointerInputChange = changes2.get(i4);
                                    if (pointerInputChange.isConsumed() || PointerEventKt.m3202isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope.mo3169getSizeYbymL2g(), awaitPointerEventScope.mo3168getExtendedTouchPaddingNHjbRc())) {
                                        break;
                                    }
                                }
                                PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                c0369b.a = awaitPointerEventScope;
                                c0369b.c = 2;
                                obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, c0369b);
                            }
                        }
                        return pointerEvent.getChanges().get(0);
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) c0369b.a;
                    ResultKt.throwOnFailure(obj);
                    List<PointerInputChange> changes3 = ((PointerEvent) obj).getChanges();
                    int size3 = changes3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (changes3.get(i5).isConsumed()) {
                            return null;
                        }
                    }
                    PointerEventPass pointerEventPass3 = PointerEventPass.Initial;
                    c0369b.a = awaitPointerEventScope;
                    c0369b.c = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass3, c0369b);
                }
            }
        }
        c0369b = new C0369b(continuation);
        Object obj2 = c0369b.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0369b.c;
        if (i != 0) {
        }
    }

    public static final <T> void c(List<? extends T> list, Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
    }

    public static final Object a(PointerInputScope pointerInputScope, Function2<? super Offset, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a(pointerInputScope), function2, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    public static final <T> boolean a(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!function1.invoke(list.get(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean b(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (function1.invoke(list.get(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
