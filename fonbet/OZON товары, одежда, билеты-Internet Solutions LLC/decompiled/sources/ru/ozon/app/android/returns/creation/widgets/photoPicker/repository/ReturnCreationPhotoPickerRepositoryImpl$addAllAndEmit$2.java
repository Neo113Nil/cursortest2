package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import Sc.s;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n"}, d2 = {"<anonymous>", "", "medias", "Ljava/util/HashSet;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "Lkotlin/collections/HashSet;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2", f = "ReturnCreationPhotoPickerRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2 extends j implements Function2<HashSet<MediaFile>, d<? super Boolean>, Object> {
    final /* synthetic */ List<MediaFile> $mediaFiles;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2(List<MediaFile> list, d<? super ReturnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2> dVar) {
        super(2, dVar);
        this.$mediaFiles = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReturnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2 returnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2 = new ReturnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2(this.$mediaFiles, dVar);
        returnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2.L$0 = obj;
        return returnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Boolean.valueOf(((HashSet) this.L$0).addAll(this.$mediaFiles));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HashSet<MediaFile> hashSet, d<? super Boolean> dVar) {
        return ((ReturnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2) create(hashSet, dVar)).invokeSuspend(Unit.f71690a);
    }
}
