package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import Sc.s;
import We.D;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadMediaResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploaderImpl$uploadMediaFile$2$1", f = "MediaFilesUploaderImpl.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MediaFilesUploaderImpl$uploadMediaFile$2$1 extends j implements Function1<d<? super UploadMediaResponse>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ D.c $request;
    final /* synthetic */ MediaFilesUploaderImpl $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFilesUploaderImpl$uploadMediaFile$2$1(MediaFilesUploaderImpl mediaFilesUploaderImpl, String str, D.c cVar, d<? super MediaFilesUploaderImpl$uploadMediaFile$2$1> dVar) {
        super(1, dVar);
        this.$this_runCatching = mediaFilesUploaderImpl;
        this.$actionName = str;
        this.$request = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new MediaFilesUploaderImpl$uploadMediaFile$2$1(this.$this_runCatching, this.$actionName, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MediaFilesUploadApi mediaFilesUploadApi;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        mediaFilesUploadApi = this.$this_runCatching.mediaFilesUploadApi;
        String str = this.$actionName;
        D.c cVar = this.$request;
        this.label = 1;
        Object uploadMediaFile = mediaFilesUploadApi.uploadMediaFile(str, cVar, this);
        return uploadMediaFile == aVar ? aVar : uploadMediaFile;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super UploadMediaResponse> dVar) {
        return ((MediaFilesUploaderImpl$uploadMediaFile$2$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
