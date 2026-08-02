package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import Sc.s;
import java.util.HashSet;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n"}, d2 = {"<anonymous>", "", "medias", "Ljava/util/HashSet;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "Lkotlin/collections/HashSet;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepositoryImpl$removeMediaFile$2", f = "ReturnCreationPhotoPickerRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnCreationPhotoPickerRepositoryImpl$removeMediaFile$2 extends j implements Function2<HashSet<MediaFile>, d<? super Boolean>, Object> {
    final /* synthetic */ long $id;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReturnCreationPhotoPickerRepositoryImpl this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014 \u0005*\t\u0018\u00010\u0003¢\u0006\u0002\b\u00040\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepositoryImpl$removeMediaFile$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<MediaFile, Boolean> {
        final /* synthetic */ long $id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j11) {
            super(1);
            this.$id = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(MediaFile mediaFile) {
            return Boolean.valueOf(mediaFile.getId() == this.$id);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCreationPhotoPickerRepositoryImpl$removeMediaFile$2(ReturnCreationPhotoPickerRepositoryImpl returnCreationPhotoPickerRepositoryImpl, long j11, d<? super ReturnCreationPhotoPickerRepositoryImpl$removeMediaFile$2> dVar) {
        super(2, dVar);
        this.this$0 = returnCreationPhotoPickerRepositoryImpl;
        this.$id = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReturnCreationPhotoPickerRepositoryImpl$removeMediaFile$2 returnCreationPhotoPickerRepositoryImpl$removeMediaFile$2 = new ReturnCreationPhotoPickerRepositoryImpl$removeMediaFile$2(this.this$0, this.$id, dVar);
        returnCreationPhotoPickerRepositoryImpl$removeMediaFile$2.L$0 = obj;
        return returnCreationPhotoPickerRepositoryImpl$removeMediaFile$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        HashSet hashSet = (HashSet) this.L$0;
        this.this$0.cancelIfUploading(this.$id);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$id);
        return Boolean.valueOf(hashSet.removeIf(new Predicate() { // from class: ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                boolean invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = ReturnCreationPhotoPickerRepositoryImpl$removeMediaFile$2.invokeSuspend$lambda$0(Function1.this, obj2);
                return invokeSuspend$lambda$0;
            }
        }));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HashSet<MediaFile> hashSet, d<? super Boolean> dVar) {
        return ((ReturnCreationPhotoPickerRepositoryImpl$removeMediaFile$2) create(hashSet, dVar)).invokeSuspend(Unit.f71690a);
    }
}
