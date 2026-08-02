package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.graphics.Bitmap;
import io.intercom.android.sdk.identity.AppConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: IntercomPushBitmapUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1", f = "IntercomPushBitmapUtils.kt", i = {0}, l = {56, 57}, m = "invokeSuspend", n = {"avatarBitmapJob"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class IntercomPushBitmapUtilsKt$loadBitmaps$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppConfig $appConfig;
    final /* synthetic */ String $authorName;
    final /* synthetic */ Ref.ObjectRef<Bitmap> $avatarBitmap;
    final /* synthetic */ String $avatarImageUrl;
    final /* synthetic */ Ref.ObjectRef<Bitmap> $contentBitmap;
    final /* synthetic */ String $contentImageUrl;
    final /* synthetic */ Context $context;
    final /* synthetic */ Function2<Bitmap, Bitmap, Unit> $onComplete;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IntercomPushBitmapUtilsKt$loadBitmaps$1(Function2<? super Bitmap, ? super Bitmap, Unit> function2, Ref.ObjectRef<Bitmap> objectRef, Ref.ObjectRef<Bitmap> objectRef2, Context context, String str, String str2, String str3, AppConfig appConfig, Continuation<? super IntercomPushBitmapUtilsKt$loadBitmaps$1> continuation) {
        super(2, continuation);
        this.$onComplete = function2;
        this.$contentBitmap = objectRef;
        this.$avatarBitmap = objectRef2;
        this.$context = context;
        this.$contentImageUrl = str;
        this.$avatarImageUrl = str2;
        this.$authorName = str3;
        this.$appConfig = appConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IntercomPushBitmapUtilsKt$loadBitmaps$1 intercomPushBitmapUtilsKt$loadBitmaps$1 = new IntercomPushBitmapUtilsKt$loadBitmaps$1(this.$onComplete, this.$contentBitmap, this.$avatarBitmap, this.$context, this.$contentImageUrl, this.$avatarImageUrl, this.$authorName, this.$appConfig, continuation);
        intercomPushBitmapUtilsKt$loadBitmaps$1.L$0 = obj;
        return intercomPushBitmapUtilsKt$loadBitmaps$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IntercomPushBitmapUtilsKt$loadBitmaps$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        if (r1.join(r13) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        Job launch$default2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1(this.$contentBitmap, this.$context, this.$contentImageUrl, null), 3, null);
                launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1(this.$avatarBitmap, this.$context, this.$avatarImageUrl, this.$authorName, this.$appConfig, null), 3, null);
                this.L$0 = launch$default2;
                this.label = 1;
                if (launch$default.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$onComplete.invoke(this.$contentBitmap.element, this.$avatarBitmap.element);
                    return Unit.INSTANCE;
                }
                launch$default2 = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = null;
            this.label = 2;
        } catch (Throwable th) {
            this.$onComplete.invoke(this.$contentBitmap.element, this.$avatarBitmap.element);
            throw th;
        }
    }
}
