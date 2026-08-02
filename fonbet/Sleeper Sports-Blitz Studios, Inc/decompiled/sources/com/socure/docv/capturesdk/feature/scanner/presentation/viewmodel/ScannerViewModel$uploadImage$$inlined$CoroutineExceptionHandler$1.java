package com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.upload.UploadIvsResponse;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScannerViewModel$uploadImage$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ ScannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerViewModel$uploadImage$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Companion companion, ScannerViewModel scannerViewModel) {
        super(companion);
        this.this$0 = scannerViewModel;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        MutableLiveData mutableLiveData;
        mutableLiveData = this.this$0._uploadImageIvsCallback;
        mutableLiveData.postValue(new UploadIvsResponse.Exception(SocureDocVError.DOCUMENT_UPLOAD_FAILURE, "Document selection value is not present"));
    }
}
