package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import Sc.s;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lxe/M;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploaderImpl$getEncodedFileName$2", f = "MediaFilesUploaderImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MediaFilesUploaderImpl$getEncodedFileName$2 extends j implements Function2<M, d<? super String>, Object> {
    final /* synthetic */ MediaFile $mediaFile;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFilesUploaderImpl$getEncodedFileName$2(MediaFile mediaFile, d<? super MediaFilesUploaderImpl$getEncodedFileName$2> dVar) {
        super(2, dVar);
        this.$mediaFile = mediaFile;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MediaFilesUploaderImpl$getEncodedFileName$2(this.$mediaFile, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AttachmentVO.AttachedImageVO attachment = this.$mediaFile.getAttachment();
        return URLEncoder.encode(attachment != null ? attachment.getFilename() : null, Charsets.UTF_8.name());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super String> dVar) {
        return ((MediaFilesUploaderImpl$getEncodedFileName$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
