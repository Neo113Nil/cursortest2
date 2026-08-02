package ru.ozon.app.android.partpayment.formpage.data.validation;

import Bc.r;
import Fn.C3056e;
import Mc.a;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.partpayment.formpage.data.FormPageApiDataSource;
import ru.ozon.app.android.partpayment.formpage.view.vo.PassFormVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/validation/PassFormRepository;", "", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "api", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "config", "<init>", "(Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;Lru/ozon/app/android/network/di/NetworkComponentConfig;)V", "", ImagesContract.URL, "", "fields", "Lio/reactivex/y;", "Lru/ozon/app/android/partpayment/formpage/view/vo/PassFormVO;", "passForm", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PassFormRepository {

    @NotNull
    private final FormPageApiDataSource api;

    @NotNull
    private final NetworkComponentConfig config;

    public PassFormRepository(@NotNull FormPageApiDataSource api, @NotNull NetworkComponentConfig config) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(config, "config");
        this.api = api;
        this.config = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PassFormVO passForm$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (PassFormVO) function1.invoke(p02);
    }

    @NotNull
    public final y<PassFormVO> passForm(@NotNull String url, @NotNull Map<String, String> fields) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fields, "fields");
        FormPageApiDataSource formPageApiDataSource = this.api;
        Uri.Builder buildUpon = Uri.parse(this.config.getApiUrl()).buildUpon();
        Intrinsics.checkNotNullExpressionValue(buildUpon, "buildUpon(...)");
        String builder = UriExtKt.appendEndPoint(buildUpon, url).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        r rVar = new r(formPageApiDataSource.passForm(builder, fields).j(a.b()), new C3056e(PassFormRepository$passForm$1.INSTANCE, 5));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
