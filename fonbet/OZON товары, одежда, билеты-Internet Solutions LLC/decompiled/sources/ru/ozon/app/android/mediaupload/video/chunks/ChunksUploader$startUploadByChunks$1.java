package ru.ozon.app.android.mediaupload.video.chunks;

import Ae.InterfaceC2397i;
import Ae.x0;
import Ge.n;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/i;", "Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.chunks.ChunksUploader$startUploadByChunks$1", f = "ChunksUploader.kt", l = {60, 61, 61}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ChunksUploader$startUploadByChunks$1 extends j implements Function2<InterfaceC2397i<? super UploadingProgress>, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChunksUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChunksUploader$startUploadByChunks$1(ChunksUploader chunksUploader, d<? super ChunksUploader$startUploadByChunks$1> dVar) {
        super(2, dVar);
        this.this$0 = chunksUploader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ChunksUploader$startUploadByChunks$1 chunksUploader$startUploadByChunks$1 = new ChunksUploader$startUploadByChunks$1(this.this$0, dVar);
        chunksUploader$startUploadByChunks$1.L$0 = obj;
        return chunksUploader$startUploadByChunks$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super UploadingProgress> interfaceC2397i, d<? super Unit> dVar) {
        return ((ChunksUploader$startUploadByChunks$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (r1.emit(r12, r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r12 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        InterfaceC2397i interfaceC2397i;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i2 = (InterfaceC2397i) this.L$0;
            x0Var = this.this$0.uploadProgress;
            UploadingProgress uploadingProgress = new UploadingProgress(null, false, n.b(x0Var), 3, null);
            this.L$0 = interfaceC2397i2;
            this.label = 1;
            if (interfaceC2397i2.emit(uploadingProgress, this) != aVar) {
                interfaceC2397i = interfaceC2397i2;
            }
            return aVar;
        }
        if (i11 == 1) {
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            s.b(obj);
            this.L$0 = null;
            this.label = 3;
        }
        ChunksUploader chunksUploader = this.this$0;
        this.L$0 = interfaceC2397i;
        this.label = 2;
        obj = chunksUploader.upload(this);
    }
}
