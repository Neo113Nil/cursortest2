package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.models.ScannerModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: ScannerShim.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerShim;", "", "onComplete", "", "uploadImage", "Lkotlin/Result;", "Lcom/socure/docv/capturesdk/models/ScannerModel;", "image", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "uploadImage-gIAlu-s", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ScannerShim {
    void onComplete();

    /* renamed from: uploadImage-gIAlu-s */
    Object mo11542uploadImagegIAlus(UploadImage uploadImage, Continuation<? super Result<? extends ScannerModel>> continuation);
}
