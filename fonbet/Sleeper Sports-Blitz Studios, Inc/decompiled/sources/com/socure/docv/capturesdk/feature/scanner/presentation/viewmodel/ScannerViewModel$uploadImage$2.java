package com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.analytics.model.EventData;
import com.socure.docv.capturesdk.common.analytics.model.Face;
import com.socure.docv.capturesdk.common.network.model.SocureApiError;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.upload.EventUpdater;
import com.socure.docv.capturesdk.common.upload.UploadIvsResponse;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerShim;
import com.socure.docv.capturesdk.models.ScannerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScannerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel$uploadImage$2", f = "ScannerViewModel.kt", i = {}, l = {486}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ScannerViewModel$uploadImage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $captureDuration;
    final /* synthetic */ List<Pair<String, String>> $eventParams;
    final /* synthetic */ EventUpdater $eventUpdater;
    final /* synthetic */ ArrayList<Face> $faces;
    final /* synthetic */ Output $output;
    final /* synthetic */ UploadImage $uploadImage;
    final /* synthetic */ long $uploadStartTime;
    int label;
    final /* synthetic */ ScannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerViewModel$uploadImage$2(UploadImage uploadImage, List<Pair<String, String>> list, EventUpdater eventUpdater, ScannerViewModel scannerViewModel, long j, long j2, Output output, ArrayList<Face> arrayList, Continuation<? super ScannerViewModel$uploadImage$2> continuation) {
        super(2, continuation);
        this.$uploadImage = uploadImage;
        this.$eventParams = list;
        this.$eventUpdater = eventUpdater;
        this.this$0 = scannerViewModel;
        this.$uploadStartTime = j;
        this.$captureDuration = j2;
        this.$output = output;
        this.$faces = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScannerViewModel$uploadImage$2(this.$uploadImage, this.$eventParams, this.$eventUpdater, this.this$0, this.$uploadStartTime, this.$captureDuration, this.$output, this.$faces, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScannerViewModel$uploadImage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableLiveData mutableLiveData;
        ScannerShim scannerShim;
        Object obj2;
        SocureDocVError socureDocVError;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$eventUpdater.triggerEvent(new EventData(Utils.INSTANCE.replacePlaceholders$capturesdk_productionRelease(AnalyticsConstantsKt.UPLOAD_INITIATED, this.$uploadImage.getScanType(), SessionManager.INSTANCE.getSelectedDocument()), this.$eventParams));
            mutableLiveData = this.this$0._uploadImageIvsCallback;
            mutableLiveData.postValue(UploadIvsResponse.Loading.INSTANCE);
            scannerShim = this.this$0.shim;
            this.label = 1;
            Object mo11542uploadImagegIAlus = scannerShim.mo11542uploadImagegIAlus(this.$uploadImage, this);
            if (mo11542uploadImagegIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = mo11542uploadImagegIAlus;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).getValue();
        }
        ScannerViewModel scannerViewModel = this.this$0;
        long j = this.$uploadStartTime;
        List<Pair<String, String>> list = this.$eventParams;
        UploadImage uploadImage = this.$uploadImage;
        EventUpdater eventUpdater = this.$eventUpdater;
        long j2 = this.$captureDuration;
        Output output = this.$output;
        ArrayList<Face> arrayList = this.$faces;
        if (Result.m13477isSuccessimpl(obj2)) {
            String submissionErrorMessage = ((ScannerModel) obj2).getSubmissionErrorMessage();
            scannerViewModel.onImageUploadSuccess(j, list, uploadImage, !(submissionErrorMessage == null || StringsKt.isBlank(submissionErrorMessage)), eventUpdater, j2, output, arrayList);
        }
        ScannerViewModel scannerViewModel2 = this.this$0;
        long j3 = this.$uploadStartTime;
        List<Pair<String, String>> list2 = this.$eventParams;
        EventUpdater eventUpdater2 = this.$eventUpdater;
        Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(obj2);
        if (m13473exceptionOrNullimpl != null) {
            SocureApiError socureApiError = m13473exceptionOrNullimpl instanceof SocureApiError ? (SocureApiError) m13473exceptionOrNullimpl : null;
            if (socureApiError == null || (socureDocVError = socureApiError.getSocureDocVError()) == null) {
                socureDocVError = SocureDocVError.UNKNOWN;
            }
            scannerViewModel2.onImageUploadFailure(j3, list2, socureDocVError, eventUpdater2);
        }
        return Unit.INSTANCE;
    }
}
