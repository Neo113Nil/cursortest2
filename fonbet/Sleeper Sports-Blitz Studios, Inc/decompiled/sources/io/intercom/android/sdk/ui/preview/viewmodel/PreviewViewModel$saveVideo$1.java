package io.intercom.android.sdk.ui.preview.viewmodel;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PreviewViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveVideo$1", f = "PreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class PreviewViewModel$saveVideo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
    int label;
    final /* synthetic */ PreviewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreviewViewModel$saveVideo$1(PreviewViewModel previewViewModel, IntercomPreviewFile.NetworkFile networkFile, Context context, Continuation<? super PreviewViewModel$saveVideo$1> continuation) {
        super(2, continuation);
        this.this$0 = previewViewModel;
        this.$file = networkFile;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreviewViewModel$saveVideo$1(this.this$0, this.$file, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PreviewViewModel$saveVideo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (Build.VERSION.SDK_INT >= 29) {
            this.this$0.saveVideoOnApi29Above(this.$file.getUrl(), this.$file.getMimeType(), this.$context);
        } else {
            PreviewViewModel previewViewModel = this.this$0;
            String url = this.$file.getUrl();
            String mimeType = this.$file.getMimeType();
            Context context = this.$context;
            String DIRECTORY_DOWNLOADS = Environment.DIRECTORY_DOWNLOADS;
            Intrinsics.checkNotNullExpressionValue(DIRECTORY_DOWNLOADS, "DIRECTORY_DOWNLOADS");
            previewViewModel.saveFileLegacy(url, mimeType, context, DIRECTORY_DOWNLOADS);
        }
        return Unit.INSTANCE;
    }
}
