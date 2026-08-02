package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal;

import He.b;
import Sc.s;
import Wc.a;
import We.C;
import We.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.api.B2bRemoveLegalApi;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.data.B2bRemoveLegalResponse;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/B2bRemoveLegalRepositoryImpl;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/B2bRemoveLegalRepository;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/api/B2bRemoveLegalApi;", "removeLegalApi", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/api/B2bRemoveLegalApi;)V", "", "postData", "LWe/K;", "jsonToRequestBody", "(Ljava/lang/String;)LWe/K;", "actionName", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse;", "removeLegal", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/api/B2bRemoveLegalApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bRemoveLegalRepositoryImpl implements B2bRemoveLegalRepository {

    @NotNull
    private final B2bRemoveLegalApi removeLegalApi;

    public B2bRemoveLegalRepositoryImpl(@NotNull B2bRemoveLegalApi removeLegalApi) {
        Intrinsics.checkNotNullParameter(removeLegalApi, "removeLegalApi");
        this.removeLegalApi = removeLegalApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final K jsonToRequestBody(String postData) {
        K.Companion companion = K.INSTANCE;
        String jSONObject = new JSONObject(postData).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        C.f33536g.getClass();
        C b11 = C.a.b("application/json");
        companion.getClass();
        return K.Companion.b(jSONObject, b11);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object removeLegal(@NotNull String str, @NotNull String str2, @NotNull d<? super Result<B2bRemoveLegalResponse>> dVar) {
        B2bRemoveLegalRepositoryImpl$removeLegal$1 b2bRemoveLegalRepositoryImpl$removeLegal$1;
        int i11;
        try {
            if (dVar instanceof B2bRemoveLegalRepositoryImpl$removeLegal$1) {
                b2bRemoveLegalRepositoryImpl$removeLegal$1 = (B2bRemoveLegalRepositoryImpl$removeLegal$1) dVar;
                int i12 = b2bRemoveLegalRepositoryImpl$removeLegal$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    b2bRemoveLegalRepositoryImpl$removeLegal$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = b2bRemoveLegalRepositoryImpl$removeLegal$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = b2bRemoveLegalRepositoryImpl$removeLegal$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        b bVar = b.f10879b;
                        B2bRemoveLegalRepositoryImpl$removeLegal$2$1 b2bRemoveLegalRepositoryImpl$removeLegal$2$1 = new B2bRemoveLegalRepositoryImpl$removeLegal$2$1(this, str, str2, null);
                        b2bRemoveLegalRepositoryImpl$removeLegal$1.label = 1;
                        obj = C10727i.f(bVar, b2bRemoveLegalRepositoryImpl$removeLegal$2$1, b2bRemoveLegalRepositoryImpl$removeLegal$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return new Result.Success((B2bRemoveLegalResponse) obj);
                }
            }
            if (i11 != 0) {
            }
            return new Result.Success((B2bRemoveLegalResponse) obj);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        b2bRemoveLegalRepositoryImpl$removeLegal$1 = new B2bRemoveLegalRepositoryImpl$removeLegal$1(this, dVar);
        Object obj2 = b2bRemoveLegalRepositoryImpl$removeLegal$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = b2bRemoveLegalRepositoryImpl$removeLegal$1.label;
    }
}
