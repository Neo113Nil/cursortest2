package ru.ozon.app.android.partpayment.landing.limit.data;

import Bc.r;
import Fn.C3056e;
import Mc.a;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageApiDataSource;
import ru.ozon.app.android.partpayment.formpage.view.vo.PassFormVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/data/FormPageLandingLimitRepository;", "", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "api", "<init>", "(Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;)V", "", ImagesContract.URL, AppMeasurementSdk.ConditionalUserProperty.NAME, "limitAmount", "Lio/reactivex/y;", "Lru/ozon/app/android/partpayment/formpage/view/vo/PassFormVO;", "passLimit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormPageLandingLimitRepository {

    @NotNull
    private final FormPageApiDataSource api;

    public FormPageLandingLimitRepository(@NotNull FormPageApiDataSource api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PassFormVO passLimit$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (PassFormVO) function1.invoke(p02);
    }

    @NotNull
    public final y<PassFormVO> passLimit(@NotNull String url, @NotNull String name, @NotNull String limitAmount) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        r rVar = new r(this.api.passLimit(url, U.i(new Pair(name, limitAmount))).j(a.b()), new C3056e(FormPageLandingLimitRepository$passLimit$1.INSTANCE, 7));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
