package ru.ozon.app.android.uploadPhotos.viewmodel;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.uploadPhotos.model.UploadPhotoEffect;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$attachImage$1", f = "UploadPhotosViewModelComposeImpl.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UploadPhotosViewModelComposeImpl$attachImage$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $attachedImagesCount;
    final /* synthetic */ int $imagesLimit;
    int label;
    final /* synthetic */ UploadPhotosViewModelComposeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadPhotosViewModelComposeImpl$attachImage$1(UploadPhotosViewModelComposeImpl uploadPhotosViewModelComposeImpl, int i11, int i12, d<? super UploadPhotosViewModelComposeImpl$attachImage$1> dVar) {
        super(2, dVar);
        this.this$0 = uploadPhotosViewModelComposeImpl;
        this.$imagesLimit = i11;
        this.$attachedImagesCount = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UploadPhotosViewModelComposeImpl$attachImage$1(this.this$0, this.$imagesLimit, this.$attachedImagesCount, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0<UploadPhotoEffect> effects = this.this$0.getEffects();
            UploadPhotoEffect.OpenPickScreen openPickScreen = new UploadPhotoEffect.OpenPickScreen(this.$imagesLimit - this.$attachedImagesCount);
            this.label = 1;
            if (effects.emit(openPickScreen, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((UploadPhotosViewModelComposeImpl$attachImage$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
