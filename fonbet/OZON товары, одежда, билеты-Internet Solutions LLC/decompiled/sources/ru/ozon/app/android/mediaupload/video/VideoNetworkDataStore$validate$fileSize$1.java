package ru.ozon.app.android.mediaupload.video;

import Sc.s;
import Wc.a;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)J"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$fileSize$1", f = "VideoNetworkDataStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoNetworkDataStore$validate$fileSize$1 extends j implements Function2<M, d<? super Long>, Object> {
    final /* synthetic */ FileInputStream $inputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoNetworkDataStore$validate$fileSize$1(FileInputStream fileInputStream, d<? super VideoNetworkDataStore$validate$fileSize$1> dVar) {
        super(2, dVar);
        this.$inputStream = fileInputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoNetworkDataStore$validate$fileSize$1(this.$inputStream, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return new Long(this.$inputStream.getChannel().size());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Long> dVar) {
        return ((VideoNetworkDataStore$validate$fileSize$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
