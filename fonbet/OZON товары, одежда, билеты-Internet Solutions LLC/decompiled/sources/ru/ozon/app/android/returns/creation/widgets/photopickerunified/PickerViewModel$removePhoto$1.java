package ru.ozon.app.android.returns.creation.widgets.photopickerunified;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.creation.widgets.photopickerunified.PickerViewModel$removePhoto$1", f = "PickerViewModel.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PickerViewModel$removePhoto$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ PhotoItem $photo;
    int label;
    final /* synthetic */ PickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PickerViewModel$removePhoto$1(PickerViewModel pickerViewModel, PhotoItem photoItem, d<? super PickerViewModel$removePhoto$1> dVar) {
        super(2, dVar);
        this.this$0 = pickerViewModel;
        this.$photo = photoItem;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PickerViewModel$removePhoto$1(this.this$0, this.$photo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReturnCreationPhotoPickerRepository returnCreationPhotoPickerRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            returnCreationPhotoPickerRepository = this.this$0.repository;
            long id2 = this.$photo.getId();
            this.label = 1;
            if (returnCreationPhotoPickerRepository.removeMediaFile(id2, this) == aVar) {
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
        return ((PickerViewModel$removePhoto$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
