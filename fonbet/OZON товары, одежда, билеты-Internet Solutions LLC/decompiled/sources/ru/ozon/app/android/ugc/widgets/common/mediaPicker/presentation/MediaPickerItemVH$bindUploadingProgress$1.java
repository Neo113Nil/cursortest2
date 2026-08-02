package ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LAe/i;", "", "kotlin.jvm.PlatformType", "", "e", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerItemVH$bindUploadingProgress$1", f = "MediaPickerItemVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MediaPickerItemVH$bindUploadingProgress$1 extends j implements InterfaceC6511n<InterfaceC2397i<? super Integer>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    MediaPickerItemVH$bindUploadingProgress$1(d<? super MediaPickerItemVH$bindUploadingProgress$1> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super Integer> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        MediaPickerItemVH$bindUploadingProgress$1 mediaPickerItemVH$bindUploadingProgress$1 = new MediaPickerItemVH$bindUploadingProgress$1(dVar);
        mediaPickerItemVH$bindUploadingProgress$1.L$0 = th2;
        return mediaPickerItemVH$bindUploadingProgress$1.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Lm0.a.f17149a.e((Throwable) this.L$0);
        return Unit.f71690a;
    }
}
