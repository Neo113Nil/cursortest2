package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data;

import AF.b;
import Bc.r;
import Bc.u;
import We.M;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import qc.o;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data.AddLegalInnMobileRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.LegalVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.api.LegalsApi;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/AddLegalInnMobileRepository;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/GetLegalsByInnResponse;", "", "inn", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "toVo", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/GetLegalsByInnResponse;Ljava/lang/String;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO$Error;", "toErrorVo", "(Ljava/lang/Throwable;Ljava/lang/String;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO$Error;", "", "params", "Lio/reactivex/y;", "getLegalsByInn", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalInnMobileRepository {

    @NotNull
    private final LegalsApi api;

    public AddLegalInnMobileRepository(@NotNull LegalsApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddLegalInnMobileVO.StateVO getLegalsByInn$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AddLegalInnMobileVO.StateVO) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddLegalInnMobileVO.StateVO getLegalsByInn$lambda$1(AddLegalInnMobileRepository addLegalInnMobileRepository, String str, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return addLegalInnMobileRepository.toErrorVo(it, str);
    }

    private final AddLegalInnMobileVO.StateVO.Error toErrorVo(Throwable th2, String str) {
        M errorBody;
        String string;
        if (!(th2 instanceof HttpException)) {
            return new AddLegalInnMobileVO.StateVO.Error(str, ScreenStateExtKt.toMessage(th2));
        }
        Response<?> response = ((HttpException) th2).response();
        JSONObject jSONObject = (response == null || (errorBody = response.errorBody()) == null || (string = errorBody.string()) == null) ? null : new JSONObject(string);
        if (jSONObject == null || !jSONObject.has("error")) {
            return new AddLegalInnMobileVO.StateVO.Error(str, ScreenStateExtKt.toMessage(th2));
        }
        String string2 = jSONObject.getString("error");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new AddLegalInnMobileVO.StateVO.Error(str, string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddLegalInnMobileVO.StateVO toVo(GetLegalsByInnResponse getLegalsByInnResponse, String str) {
        List<LegalVO> legals = getLegalsByInnResponse.getLegals();
        if (legals == null) {
            legals = K.f71697a;
        }
        return new AddLegalInnMobileVO.StateVO.Success(str, legals);
    }

    @NotNull
    public final y<AddLegalInnMobileVO.StateVO> getLegalsByInn(@NotNull final String inn, Map<String, String> params) {
        Set set;
        Intrinsics.checkNotNullParameter(inn, "inn");
        set = AddLegalInnMobileRepositoryKt.innLengths;
        if (!set.contains(Integer.valueOf(inn.length()))) {
            return y.f(new AddLegalInnMobileVO.StateVO.Success(inn, K.f71697a));
        }
        y<GetLegalsByInnResponse> legalsByInn = this.api.getLegalsByInn(new GetLegalsByInnRequest(inn, params));
        b bVar = new b(new AddLegalInnMobileRepository$getLegalsByInn$1(this, inn), 5);
        legalsByInn.getClass();
        return new u(new r(legalsByInn, bVar), new o() { // from class: bv.a
            @Override // qc.o
            public final Object apply(Object obj) {
                AddLegalInnMobileVO.StateVO legalsByInn$lambda$1;
                legalsByInn$lambda$1 = AddLegalInnMobileRepository.getLegalsByInn$lambda$1(AddLegalInnMobileRepository.this, inn, (Throwable) obj);
                return legalsByInn$lambda$1;
            }
        });
    }
}
