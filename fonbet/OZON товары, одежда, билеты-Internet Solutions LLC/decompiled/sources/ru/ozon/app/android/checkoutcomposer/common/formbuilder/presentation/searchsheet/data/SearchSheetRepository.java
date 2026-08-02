package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.data;

import Bc.r;
import Hs.c;
import Mc.a;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SuggestVO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/data/SearchSheetRepository;", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/data/SearchSheetApi;", "api", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/data/SearchSheetApi;)V", "", ImagesContract.URL, "Lio/reactivex/y;", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "getSuggests", "(Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/data/SearchSheetApi;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchSheetRepository {

    @NotNull
    private final SearchSheetApi api;

    public SearchSheetRepository(@NotNull SearchSheetApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSuggests$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (List) function1.invoke(p02);
    }

    @NotNull
    public final y<List<SuggestVO>> getSuggests(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        r rVar = new r(this.api.getSuggests("composer-api.bx/_action/" + url).j(a.b()), new c(SearchSheetRepository$getSuggests$1.INSTANCE, 9));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
