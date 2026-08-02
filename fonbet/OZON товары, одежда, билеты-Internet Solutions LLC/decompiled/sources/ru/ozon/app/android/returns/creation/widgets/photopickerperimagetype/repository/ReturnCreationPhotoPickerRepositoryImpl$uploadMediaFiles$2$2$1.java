package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository;

import Sc.r;
import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploader;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.SignedLink;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2$2$1", f = "ReturnCreationPhotoPickerRepositoryImpl.kt", l = {43, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 46, 47}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ MediaFile $media;
    int label;
    final /* synthetic */ ReturnCreationPhotoPickerRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2$2$1(ReturnCreationPhotoPickerRepositoryImpl returnCreationPhotoPickerRepositoryImpl, MediaFile mediaFile, String str, d<? super ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2$2$1> dVar) {
        super(2, dVar);
        this.this$0 = returnCreationPhotoPickerRepositoryImpl;
        this.$media = mediaFile;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2$2$1(this.this$0, this.$media, this.$actionName, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r7 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r7 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r7 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r7 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object mutateToLoading;
        MediaFilesUploader mediaFilesUploader;
        Object mo945uploadMediaFile0E7RQCE;
        Object mutateToError;
        Object mutateToUploaded;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ReturnCreationPhotoPickerRepositoryImpl returnCreationPhotoPickerRepositoryImpl = this.this$0;
            MediaFile mediaFile = this.$media;
            this.label = 1;
            mutateToLoading = returnCreationPhotoPickerRepositoryImpl.mutateToLoading(mediaFile, this);
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3 && i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            mo945uploadMediaFile0E7RQCE = ((r) obj).getF26106a();
            ReturnCreationPhotoPickerRepositoryImpl returnCreationPhotoPickerRepositoryImpl2 = this.this$0;
            MediaFile mediaFile2 = this.$media;
            if (r.b(mo945uploadMediaFile0E7RQCE) == null) {
                this.label = 3;
                mutateToUploaded = returnCreationPhotoPickerRepositoryImpl2.mutateToUploaded(mediaFile2, (SignedLink) mo945uploadMediaFile0E7RQCE, this);
            } else {
                this.label = 4;
                mutateToError = returnCreationPhotoPickerRepositoryImpl2.mutateToError(mediaFile2, this);
            }
        }
        mediaFilesUploader = this.this$0.mediaFilesUploader;
        String str = this.$actionName;
        MediaFile mediaFile3 = this.$media;
        this.label = 2;
        mo945uploadMediaFile0E7RQCE = mediaFilesUploader.mo945uploadMediaFile0E7RQCE(str, mediaFile3, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
