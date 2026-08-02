package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile;

import B0.C2454a;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.api.B2bDownloadFileApi;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lretrofit2/Response;", "LWe/M;", "<anonymous>", "(Lxe/M;)Lretrofit2/Response;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileRepositoryImpl$downloadFile$2$1", f = "B2bDownloadFileRepository.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bDownloadFileRepositoryImpl$downloadFile$2$1 extends j implements Function2<M, d<? super Response<We.M>>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ String $fileId;
    final /* synthetic */ B2bDownloadFileRepositoryImpl $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bDownloadFileRepositoryImpl$downloadFile$2$1(B2bDownloadFileRepositoryImpl b2bDownloadFileRepositoryImpl, String str, String str2, d<? super B2bDownloadFileRepositoryImpl$downloadFile$2$1> dVar) {
        super(2, dVar);
        this.$this_runCatching = b2bDownloadFileRepositoryImpl;
        this.$actionName = str;
        this.$fileId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bDownloadFileRepositoryImpl$downloadFile$2$1(this.$this_runCatching, this.$actionName, this.$fileId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B2bDownloadFileApi b2bDownloadFileApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        b2bDownloadFileApi = this.$this_runCatching.downloadFileApi;
        String str = this.$actionName;
        Map<String, String> b11 = C2454a.b("fileId", this.$fileId);
        this.label = 1;
        Object downloadFile = b2bDownloadFileApi.downloadFile(str, b11, this);
        return downloadFile == aVar ? aVar : downloadFile;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Response<We.M>> dVar) {
        return ((B2bDownloadFileRepositoryImpl$downloadFile$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
