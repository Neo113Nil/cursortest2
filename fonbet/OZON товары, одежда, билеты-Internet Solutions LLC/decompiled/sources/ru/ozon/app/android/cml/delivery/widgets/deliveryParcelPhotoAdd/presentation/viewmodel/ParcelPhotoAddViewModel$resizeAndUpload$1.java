package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel.ParcelPhotoAddViewModel", f = "ParcelPhotoAddViewModel.kt", l = {217, 228, 229}, m = "resizeAndUpload")
/* loaded from: classes11.dex */
final class ParcelPhotoAddViewModel$resizeAndUpload$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ParcelPhotoAddViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParcelPhotoAddViewModel$resizeAndUpload$1(ParcelPhotoAddViewModel parcelPhotoAddViewModel, d<? super ParcelPhotoAddViewModel$resizeAndUpload$1> dVar) {
        super(dVar);
        this.this$0 = parcelPhotoAddViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object resizeAndUpload;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        resizeAndUpload = this.this$0.resizeAndUpload(null, this);
        return resizeAndUpload;
    }
}
