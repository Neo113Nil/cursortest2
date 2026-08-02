package ru.ozon.app.android.partpayment.formpage.data.autocomplete;

import Bc.r;
import Fy.C3065c;
import Mc.a;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import io.reactivex.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.partpayment.formpage.data.FormPageApiDataSource;
import ru.ozon.app.android.partpayment.formpage.data.autocomplete.MaskAutocompleteDTO;
import xc.f;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/autocomplete/MaskAutocompleteRepository;", "", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "api", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "config", "<init>", "(Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;Lru/ozon/app/android/network/di/NetworkComponentConfig;)V", "", "autocompleteUrl", SearchIntents.EXTRA_QUERY, "Lio/reactivex/k;", "", "Lru/ozon/app/android/partpayment/formpage/data/autocomplete/MaskAutocompleteDTO$Value;", "getAutocompleteSuggest", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/k;", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MaskAutocompleteRepository {

    @NotNull
    private final FormPageApiDataSource api;

    @NotNull
    private final NetworkComponentConfig config;

    public MaskAutocompleteRepository(@NotNull FormPageApiDataSource api, @NotNull NetworkComponentConfig config) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(config, "config");
        this.api = api;
        this.config = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAutocompleteSuggest$lambda$2$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (List) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAutocompleteSuggest$lambda$2$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    @NotNull
    public final k<List<MaskAutocompleteDTO.Value>> getAutocompleteSuggest(@NotNull String autocompleteUrl, @NotNull String query) {
        Intrinsics.checkNotNullParameter(autocompleteUrl, "autocompleteUrl");
        Intrinsics.checkNotNullParameter(query, "query");
        Uri.Builder buildUpon = Uri.parse(this.config.getApiUrl()).buildUpon();
        Intrinsics.checkNotNullExpressionValue(buildUpon, "buildUpon(...)");
        String builder = UriExtKt.appendEndPoint(buildUpon, autocompleteUrl).toString();
        FormPageApiDataSource formPageApiDataSource = this.api;
        Intrinsics.f(builder);
        f fVar = new f(new r(formPageApiDataSource.getAutocompleteSuggest(builder, query).g(a.b()), new C3065c(MaskAutocompleteRepository$getAutocompleteSuggest$1$1.INSTANCE, 4)), new Gy.a(MaskAutocompleteRepository$getAutocompleteSuggest$1$2.INSTANCE, 1));
        Intrinsics.checkNotNullExpressionValue(fVar, "let(...)");
        return fVar;
    }
}
