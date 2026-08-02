package ru.ozon.app.android.account.locale.network;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.locale.network.api.LocaleApi;
import ru.ozon.app.android.account.locale.network.model.SaveLocaleRequestBody;
import ru.ozon.app.android.account.locale.network.model.SaveLocaleResponse;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/account/locale/network/model/SaveLocaleResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/account/locale/network/model/SaveLocaleResponse;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.locale.network.NetworkLocaleRepositoryImpl$saveLocale$2", f = "NetworkLocaleRepositoryImpl.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class NetworkLocaleRepositoryImpl$saveLocale$2 extends j implements Function2<M, d<? super SaveLocaleResponse>, Object> {
    final /* synthetic */ String $languageCode;
    int label;
    final /* synthetic */ NetworkLocaleRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkLocaleRepositoryImpl$saveLocale$2(String str, NetworkLocaleRepositoryImpl networkLocaleRepositoryImpl, d<? super NetworkLocaleRepositoryImpl$saveLocale$2> dVar) {
        super(2, dVar);
        this.$languageCode = str;
        this.this$0 = networkLocaleRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NetworkLocaleRepositoryImpl$saveLocale$2(this.$languageCode, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LocaleApi localeApi;
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
        SaveLocaleRequestBody saveLocaleRequestBody = new SaveLocaleRequestBody(this.$languageCode);
        localeApi = this.this$0.localeApi;
        this.label = 1;
        Object saveLocale = localeApi.saveLocale(saveLocaleRequestBody, this);
        return saveLocale == aVar ? aVar : saveLocale;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super SaveLocaleResponse> dVar) {
        return ((NetworkLocaleRepositoryImpl$saveLocale$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
