package com.reactnativecompressor.Utils;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: createVideoThumbnail.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativecompressor.Utils.CreateVideoThumbnailClass$create$1", f = "createVideoThumbnail.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class CreateVideoThumbnailClass$create$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fileUrl;
    final /* synthetic */ ReadableMap $options;
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ CreateVideoThumbnailClass this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateVideoThumbnailClass$create$1(CreateVideoThumbnailClass createVideoThumbnailClass, String str, ReadableMap readableMap, Promise promise, Continuation<? super CreateVideoThumbnailClass$create$1> continuation) {
        super(2, continuation);
        this.this$0 = createVideoThumbnailClass;
        this.$fileUrl = str;
        this.$options = readableMap;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateVideoThumbnailClass$create$1(this.this$0, this.$fileUrl, this.$options, this.$promise, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateVideoThumbnailClass$create$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReactApplicationContext reactApplicationContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateVideoThumbnailClass createVideoThumbnailClass = this.this$0;
                reactApplicationContext = createVideoThumbnailClass.reactContext;
                this.label = 1;
                obj = createVideoThumbnailClass.processDataInBackground(reactApplicationContext, this.$fileUrl, this.$options, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$promise.resolve((ReadableMap) obj);
        } catch (Exception e) {
            this.$promise.reject("CreateVideoThumbnail_ERROR", e);
        }
        return Unit.INSTANCE;
    }
}
