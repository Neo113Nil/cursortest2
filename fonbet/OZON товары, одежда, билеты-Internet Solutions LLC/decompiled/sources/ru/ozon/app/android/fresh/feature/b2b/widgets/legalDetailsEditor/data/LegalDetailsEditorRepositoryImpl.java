package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data;

import He.b;
import Sc.s;
import Wc.a;
import We.D;
import We.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.LegalDetailsEditorApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.LegalDetailsEditorResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.SingleDocumentResponseDTO;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorRepositoryImpl;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorRepository;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorApi;)V", "", "message", "", "paramsMap", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorResponseDTO;", "sendAllEdit", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LWe/K;", "documentType", "LWe/D$c;", "file", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO;", "loadDocument", "(LWe/K;LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorApi;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalDetailsEditorRepositoryImpl implements LegalDetailsEditorRepository {

    @NotNull
    private final LegalDetailsEditorApi api;
    public static final int $stable = 8;

    public LegalDetailsEditorRepositoryImpl(@NotNull LegalDetailsEditorApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadDocument(@NotNull K k11, @NotNull D.c cVar, @NotNull d<? super Result<SingleDocumentResponseDTO>> dVar) {
        LegalDetailsEditorRepositoryImpl$loadDocument$1 legalDetailsEditorRepositoryImpl$loadDocument$1;
        int i11;
        try {
            if (dVar instanceof LegalDetailsEditorRepositoryImpl$loadDocument$1) {
                legalDetailsEditorRepositoryImpl$loadDocument$1 = (LegalDetailsEditorRepositoryImpl$loadDocument$1) dVar;
                int i12 = legalDetailsEditorRepositoryImpl$loadDocument$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    legalDetailsEditorRepositoryImpl$loadDocument$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = legalDetailsEditorRepositoryImpl$loadDocument$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = legalDetailsEditorRepositoryImpl$loadDocument$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        b bVar = b.f10879b;
                        LegalDetailsEditorRepositoryImpl$loadDocument$2$1 legalDetailsEditorRepositoryImpl$loadDocument$2$1 = new LegalDetailsEditorRepositoryImpl$loadDocument$2$1(this, k11, cVar, null);
                        legalDetailsEditorRepositoryImpl$loadDocument$1.label = 1;
                        obj = C10727i.f(bVar, legalDetailsEditorRepositoryImpl$loadDocument$2$1, legalDetailsEditorRepositoryImpl$loadDocument$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return new Result.Success((SingleDocumentResponseDTO) obj);
                }
            }
            if (i11 != 0) {
            }
            return new Result.Success((SingleDocumentResponseDTO) obj);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        legalDetailsEditorRepositoryImpl$loadDocument$1 = new LegalDetailsEditorRepositoryImpl$loadDocument$1(this, dVar);
        Object obj2 = legalDetailsEditorRepositoryImpl$loadDocument$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = legalDetailsEditorRepositoryImpl$loadDocument$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendAllEdit(@NotNull String str, @NotNull Map<String, String> map, @NotNull d<? super Result<LegalDetailsEditorResponseDTO>> dVar) {
        LegalDetailsEditorRepositoryImpl$sendAllEdit$1 legalDetailsEditorRepositoryImpl$sendAllEdit$1;
        int i11;
        try {
            if (dVar instanceof LegalDetailsEditorRepositoryImpl$sendAllEdit$1) {
                legalDetailsEditorRepositoryImpl$sendAllEdit$1 = (LegalDetailsEditorRepositoryImpl$sendAllEdit$1) dVar;
                int i12 = legalDetailsEditorRepositoryImpl$sendAllEdit$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    legalDetailsEditorRepositoryImpl$sendAllEdit$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = legalDetailsEditorRepositoryImpl$sendAllEdit$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = legalDetailsEditorRepositoryImpl$sendAllEdit$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        b bVar = b.f10879b;
                        LegalDetailsEditorRepositoryImpl$sendAllEdit$2$1 legalDetailsEditorRepositoryImpl$sendAllEdit$2$1 = new LegalDetailsEditorRepositoryImpl$sendAllEdit$2$1(str, map, this, null);
                        legalDetailsEditorRepositoryImpl$sendAllEdit$1.label = 1;
                        obj = C10727i.f(bVar, legalDetailsEditorRepositoryImpl$sendAllEdit$2$1, legalDetailsEditorRepositoryImpl$sendAllEdit$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return new Result.Success((LegalDetailsEditorResponseDTO) obj);
                }
            }
            if (i11 != 0) {
            }
            return new Result.Success((LegalDetailsEditorResponseDTO) obj);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        legalDetailsEditorRepositoryImpl$sendAllEdit$1 = new LegalDetailsEditorRepositoryImpl$sendAllEdit$1(this, dVar);
        Object obj2 = legalDetailsEditorRepositoryImpl$sendAllEdit$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = legalDetailsEditorRepositoryImpl$sendAllEdit$1.label;
    }
}
