package ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.databinding.ItemMediaPickerBinding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "progress", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerItemVH$bindUploadingProgress$2", f = "MediaPickerItemVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MediaPickerItemVH$bindUploadingProgress$2 extends j implements Function2<Integer, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaPickerItemVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaPickerItemVH$bindUploadingProgress$2(MediaPickerItemVH mediaPickerItemVH, d<? super MediaPickerItemVH$bindUploadingProgress$2> dVar) {
        super(2, dVar);
        this.this$0 = mediaPickerItemVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MediaPickerItemVH$bindUploadingProgress$2 mediaPickerItemVH$bindUploadingProgress$2 = new MediaPickerItemVH$bindUploadingProgress$2(this.this$0, dVar);
        mediaPickerItemVH$bindUploadingProgress$2.L$0 = obj;
        return mediaPickerItemVH$bindUploadingProgress$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, d<? super Unit> dVar) {
        return ((MediaPickerItemVH$bindUploadingProgress$2) create(num, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ItemMediaPickerBinding itemMediaPickerBinding;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Integer num = (Integer) this.L$0;
        if (num != null && num.intValue() > 5) {
            itemMediaPickerBinding = this.this$0.binding;
            itemMediaPickerBinding.progressView.setProgressSmoothly(num.intValue());
        }
        return Unit.f71690a;
    }
}
