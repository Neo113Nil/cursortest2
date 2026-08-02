package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile;

import He.b;
import Sc.s;
import Wc.a;
import We.M;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.api.B2bDownloadFileApi;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileRepositoryImpl;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileRepository;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/api/B2bDownloadFileApi;", "downloadFileApi", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/api/B2bDownloadFileApi;)V", "", "actionName", "fileId", "Lru/ozon/app/android/utils/Result;", "Lretrofit2/Response;", "LWe/M;", "downloadFile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/api/B2bDownloadFileApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bDownloadFileRepositoryImpl implements B2bDownloadFileRepository {

    @NotNull
    private final B2bDownloadFileApi downloadFileApi;

    public B2bDownloadFileRepositoryImpl(@NotNull B2bDownloadFileApi downloadFileApi) {
        Intrinsics.checkNotNullParameter(downloadFileApi, "downloadFileApi");
        this.downloadFileApi = downloadFileApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object downloadFile(@NotNull String str, @NotNull String str2, @NotNull d<? super Result<Response<M>>> dVar) {
        B2bDownloadFileRepositoryImpl$downloadFile$1 b2bDownloadFileRepositoryImpl$downloadFile$1;
        int i11;
        try {
            if (dVar instanceof B2bDownloadFileRepositoryImpl$downloadFile$1) {
                b2bDownloadFileRepositoryImpl$downloadFile$1 = (B2bDownloadFileRepositoryImpl$downloadFile$1) dVar;
                int i12 = b2bDownloadFileRepositoryImpl$downloadFile$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    b2bDownloadFileRepositoryImpl$downloadFile$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = b2bDownloadFileRepositoryImpl$downloadFile$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = b2bDownloadFileRepositoryImpl$downloadFile$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        b bVar = b.f10879b;
                        B2bDownloadFileRepositoryImpl$downloadFile$2$1 b2bDownloadFileRepositoryImpl$downloadFile$2$1 = new B2bDownloadFileRepositoryImpl$downloadFile$2$1(this, str, str2, null);
                        b2bDownloadFileRepositoryImpl$downloadFile$1.label = 1;
                        obj = C10727i.f(bVar, b2bDownloadFileRepositoryImpl$downloadFile$2$1, b2bDownloadFileRepositoryImpl$downloadFile$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return new Result.Success((Response) obj);
                }
            }
            if (i11 != 0) {
            }
            return new Result.Success((Response) obj);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        b2bDownloadFileRepositoryImpl$downloadFile$1 = new B2bDownloadFileRepositoryImpl$downloadFile$1(this, dVar);
        Object obj2 = b2bDownloadFileRepositoryImpl$downloadFile$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = b2bDownloadFileRepositoryImpl$downloadFile$1.label;
    }
}
