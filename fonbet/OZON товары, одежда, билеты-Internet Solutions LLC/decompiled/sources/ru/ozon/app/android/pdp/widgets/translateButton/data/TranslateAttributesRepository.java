package ru.ozon.app.android.pdp.widgets.translateButton.data;

import He.b;
import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rR#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateAttributesRepository;", "", "Lretrofit2/Retrofit;", "retrofit", "<init>", "(Lretrofit2/Retrofit;)V", "", "actionName", "Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateAttributesRequest;", "requestBody", "Lru/ozon/app/android/utils/Result;", "", "translateAttributes", "(Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateAttributesRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateAttributesApi;", "kotlin.jvm.PlatformType", "api$delegate", "LSc/j;", "getApi", "()Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateAttributesApi;", "api", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TranslateAttributesRepository {

    /* renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j api;

    public TranslateAttributesRepository(@NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.api = k.b(new TranslateAttributesRepository$api$2(retrofit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TranslateAttributesApi getApi() {
        return (TranslateAttributesApi) this.api.getValue();
    }

    public final Object translateAttributes(@NotNull String str, @NotNull TranslateAttributesRequest translateAttributesRequest, @NotNull d<? super Result<Unit>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new TranslateAttributesRepository$translateAttributes$$inlined$runCatchingWithDispatchers$default$1(this, null, str, translateAttributesRequest), dVar);
    }
}
